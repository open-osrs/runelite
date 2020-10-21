package net.runelite.client.plugins;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import net.runelite.client.RuneLiteProperties;
import org.pf4j.BasePluginLoader;
import org.pf4j.CompoundPluginLoader;
import org.pf4j.CompoundPluginRepository;
import org.pf4j.DefaultPluginManager;
import org.pf4j.DependencyResolver;
import org.pf4j.DevelopmentPluginRepository;
import org.pf4j.JarPluginLoader;
import org.pf4j.JarPluginRepository;
import org.pf4j.ManifestPluginDescriptorFinder;
import org.pf4j.PluginAlreadyLoadedException;
import org.pf4j.PluginDescriptorFinder;
import org.pf4j.PluginLoader;
import org.pf4j.PluginRepository;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginState;
import org.pf4j.PluginStateEvent;
import org.pf4j.PluginWrapper;
import org.pf4j.RuntimeMode;

/**
 * A pf4j {@link DefaultPluginManager} which can load openosrs external plugins, either from jar files in a directory,
 * or from locally compiled classes depending on whether {@link ExternalPluginManager#isDevelopmentMode()} is true
 */
@Slf4j
class ExternalPf4jPluginManager extends DefaultPluginManager
{
	private final ExternalPluginManager externalPluginManager;

	public ExternalPf4jPluginManager(ExternalPluginManager externalPluginManager)
	{
		super(RuneLiteProperties.getPluginPath() != null ? Paths.get(RuneLiteProperties.getPluginPath())
			: RuneLite.EXTERNALPLUGIN_DIR.toPath());
		this.externalPluginManager = externalPluginManager;
	}

	@Override
	protected PluginDescriptorFinder createPluginDescriptorFinder()
	{
		return new ManifestPluginDescriptorFinder()
		{
			protected Path getManifestPath(Path pluginPath)
			{
				if (isDevelopment())
				{
					// The superclass performs a find, which is slow in development mode since we're pointing
					// at a sources directory, which can have a lot of files. The external plugin template
					// will always output the manifest at the following location, so we can hardcode this path.
					return pluginPath.resolve(ExternalPluginManager.DEVELOPMENT_MANIFEST_PATH);
				}

				return super.getManifestPath(pluginPath);
			}
		};
	}

	@Override
	protected PluginRepository createPluginRepository()
	{
		CompoundPluginRepository compoundPluginRepository = new CompoundPluginRepository();

		if (isNotDevelopment())
		{
			JarPluginRepository jarPluginRepository = new JarPluginRepository(getPluginsRoot());

			// Default pf4j comparator crashes on some systems (https://github.com/open-osrs/runelite/pull/2621)
			// We also don't care about plugin order at this point, pf4j will sort by Plugin-Dependencies
			// and we re-sort later based on `@PluginDependency`
			jarPluginRepository.setComparator(null);

			compoundPluginRepository.add(jarPluginRepository);
		}

		if (isDevelopment())
		{
			for (String developmentPluginPath : RuneLiteProperties.getPluginDevelopmentPath())
			{
				DevelopmentPluginRepository developmentPluginRepository = new DevelopmentPluginRepository(Paths.get(developmentPluginPath))
				{
					@Override
					public boolean deletePluginPath(Path pluginPath)
					{
						// Do nothing, because we'd be deleting our sources!
						return filter.accept(pluginPath.toFile());
					}
				};

				developmentPluginRepository.setFilter(new ExternalPluginFileFilter());
				compoundPluginRepository.add(developmentPluginRepository);
			}
		}

		return compoundPluginRepository;
	}

	@Override
	protected PluginLoader createPluginLoader()
	{
		return new CompoundPluginLoader()
			.add(new BasePluginLoader(this, new ExternalPluginClasspath()), this::isDevelopment)
			.add(new JarPluginLoader(this), this::isNotDevelopment);
	}

	@Override
	public void loadPlugins()
	{
		if (Files.notExists(pluginsRoot) || !Files.isDirectory(pluginsRoot))
		{
			log.warn("No '{}' root", pluginsRoot);
			return;
		}

		List<Path> pluginPaths = pluginRepository.getPluginPaths();

		if (pluginPaths.isEmpty())
		{
			log.warn("No plugins");
			return;
		}

		log.debug("Found {} possible plugins: {}", pluginPaths.size(), pluginPaths);

		Set<String> duplicatePlugins = new HashSet<>();
		for (Path pluginPath : pluginPaths)
		{
			try
			{
				if (!isPluginEligibleForLoading(pluginPath) && isNotDevelopment())
				{
					continue;
				}
				loadPluginFromPath(pluginPath);
			}
			catch (PluginRuntimeException e)
			{
				if (!(e instanceof PluginAlreadyLoadedException))
				{
					if (!ExternalPluginManager.isDevelopmentMode())
					{
						String plugin = pluginPath.toString().substring(pluginsRoot.toString().length() + 1);
						duplicatePlugins.add(plugin);
					}
					log.error("Could not load plugin {}", pluginPath, e);
				}
			}
		}

		if (!duplicatePlugins.isEmpty())
		{
			log.error("Duplicate plugins detected: {}", String.join(", ", duplicatePlugins));

			String formatted = String.join("\n", duplicatePlugins);

			SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "You have duplicate plugins in your externalmanager.\n" +
				"Having duplicate plugins will result in an unstable\n" +
				"experience, It is highly recommended to delete any\n" +
				"duplicates, here is a list of the plugins.\n\n" +
				formatted, "Duplicate Plugins Detected", JOptionPane.WARNING_MESSAGE));
		}

		try
		{
			resolvePlugins();
		}
		catch (PluginRuntimeException e)
		{
			if (e instanceof DependencyResolver.DependenciesNotFoundException)
			{
				throw e;
			}

			log.error("Could not resolve plugins", e);
		}
	}

	@Override
	protected void resolvePlugins()
	{
		// retrieves the plugins descriptors
		List<org.pf4j.PluginDescriptor> descriptors = new ArrayList<>();
		for (PluginWrapper plugin : plugins.values())
		{
			descriptors.add(plugin.getDescriptor());
		}

		// retrieves the plugins descriptors from the resolvedPlugins list. This allows to load plugins that have already loaded dependencies.
		for (PluginWrapper plugin : resolvedPlugins)
		{
			descriptors.add(plugin.getDescriptor());
		}

		DependencyResolver.Result result = dependencyResolver.resolve(descriptors);

		if (result.hasCyclicDependency())
		{
			throw new DependencyResolver.CyclicDependencyException();
		}

		List<String> notFoundDependencies = result.getNotFoundDependencies();
		if (!notFoundDependencies.isEmpty())
		{
			throw new DependencyResolver.DependenciesNotFoundException(notFoundDependencies);
		}

		List<DependencyResolver.WrongDependencyVersion> wrongVersionDependencies = result.getWrongVersionDependencies();
		if (!wrongVersionDependencies.isEmpty())
		{
			throw new DependencyResolver.DependenciesWrongVersionException(wrongVersionDependencies);
		}

		List<String> sortedPlugins = result.getSortedPlugins();

		// move plugins from "unresolved" to "resolved"
		for (String pluginId : sortedPlugins)
		{
			PluginWrapper pluginWrapper = plugins.get(pluginId);

			//The plugin is already resolved. Don't put a copy in the resolvedPlugins.
			if (resolvedPlugins.contains(pluginWrapper))
			{
				continue;
			}

			if (unresolvedPlugins.remove(pluginWrapper))
			{
				PluginState pluginState = pluginWrapper.getPluginState();
				if (pluginState != PluginState.DISABLED)
				{
					pluginWrapper.setPluginState(PluginState.RESOLVED);
				}

				resolvedPlugins.add(pluginWrapper);

				firePluginStateEvent(new PluginStateEvent(this, pluginWrapper, pluginState));
			}
		}
	}

	@Override
	public RuntimeMode getRuntimeMode()
	{
		return ExternalPluginManager.isDevelopmentMode() ? RuntimeMode.DEVELOPMENT : RuntimeMode.DEPLOYMENT;
	}

	@Override
	public PluginState stopPlugin(String pluginId)
	{
		if (!plugins.containsKey(pluginId))
		{
			throw new IllegalArgumentException(String.format("Unknown pluginId %s", pluginId));
		}

		PluginWrapper pluginWrapper = getPlugin(pluginId);
		org.pf4j.PluginDescriptor pluginDescriptor = pluginWrapper.getDescriptor();
		PluginState pluginState = pluginWrapper.getPluginState();
		if (PluginState.STOPPED == pluginState)
		{
			log.debug("Already stopped plugin '{}'", getPluginLabel(pluginDescriptor));
			return PluginState.STOPPED;
		}

		// test for disabled plugin
		if (PluginState.DISABLED == pluginState)
		{
			// do nothing
			return pluginState;
		}

		pluginWrapper.getPlugin().stop();
		pluginWrapper.setPluginState(PluginState.STOPPED);
		startedPlugins.remove(pluginWrapper);

		firePluginStateEvent(new PluginStateEvent(this, pluginWrapper, pluginState));

		return pluginWrapper.getPluginState();
	}

	@Override
	public boolean unloadPlugin(String pluginId)
	{
		try
		{
			PluginState pluginState = stopPlugin(pluginId);
			if (PluginState.STARTED == pluginState)
			{
				return false;
			}

			PluginWrapper pluginWrapper = getPlugin(pluginId);

			// remove the plugin
			plugins.remove(pluginId);
			getResolvedPlugins().remove(pluginWrapper);

			firePluginStateEvent(new PluginStateEvent(this, pluginWrapper, pluginState));

			// remove the classloader
			Map<String, ClassLoader> pluginClassLoaders = getPluginClassLoaders();
			if (pluginClassLoaders.containsKey(pluginId))
			{
				ClassLoader classLoader = pluginClassLoaders.remove(pluginId);
				if (classLoader instanceof Closeable)
				{
					try
					{
						((Closeable) classLoader).close();
					}
					catch (IOException e)
					{
						throw new PluginRuntimeException(e, "Cannot close classloader");
					}
				}
			}

			return true;
		}
		catch (IllegalArgumentException e)
		{
			// ignore not found exceptions because this method is recursive
		}

		return false;
	}

	@Override
	public boolean deletePlugin(String pluginId)
	{
		if (!plugins.containsKey(pluginId))
		{
			throw new IllegalArgumentException(String.format("Unknown pluginId %s", pluginId));
		}

		PluginWrapper pluginWrapper = getPlugin(pluginId);
		// stop the plugin if it's started
		PluginState pluginState = stopPlugin(pluginId);
		if (PluginState.STARTED == pluginState)
		{
			log.error("Failed to stop plugin '{}' on delete", pluginId);
			return false;
		}

		// get an instance of plugin before the plugin is unloaded
		// for reason see https://github.com/pf4j/pf4j/issues/309

		org.pf4j.Plugin plugin = pluginWrapper.getPlugin();

		if (!unloadPlugin(pluginId))
		{
			log.error("Failed to unload plugin '{}' on delete", pluginId);
			return false;
		}

		// notify the plugin as it's deleted
		plugin.delete();

		Path pluginPath = pluginWrapper.getPluginPath();

		return pluginRepository.deletePluginPath(pluginPath);
	}

	private boolean isPluginEligibleForLoading(Path path)
	{
		return path.toFile().getName().endsWith(".jar");
	}
}
