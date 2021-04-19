/*
 * Copyright (c) 2020, Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import com.google.inject.Binder;
import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.openosrs.client.OpenOSRS;
import static com.openosrs.client.OpenOSRS.EXTERNALPLUGIN_DIR;
import static com.openosrs.client.OpenOSRS.SYSTEM_API_VERSION;
import com.openosrs.client.config.OpenOSRSConfig;
import com.openosrs.client.events.OPRSPluginChanged;
import com.openosrs.client.events.OPRSRepositoryChanged;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import com.openosrs.client.util.Groups;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.ExternalPluginsChanged;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.util.SwingUtil;
import org.jgroups.Message;
import org.pf4j.DefaultPluginManager;
import org.pf4j.DependencyResolver;
import org.pf4j.PluginDependency;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginWrapper;
import org.pf4j.update.DefaultUpdateRepository;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.UpdateManager;
import org.pf4j.update.UpdateRepository;

@Slf4j
@Singleton
public class OPRSExternalPluginManager
{
	public static final String DEFAULT_PLUGIN_REPOS = "";
	static final String DEVELOPMENT_MANIFEST_PATH = "build/tmp/jar/MANIFEST.MF";

	public static ArrayList<ClassLoader> pluginClassLoaders = new ArrayList<>();
	private final PluginManager runelitePluginManager;
	@Getter(AccessLevel.PUBLIC)
	private org.pf4j.PluginManager externalPluginManager;
	@Getter(AccessLevel.PUBLIC)
	private final List<UpdateRepository> repositories = new ArrayList<>();
	private final OpenOSRSConfig openOSRSConfig;
	private final EventBus eventBus;
	private final ExecutorService executorService;
	private final ConfigManager configManager;
	private final Map<String, String> pluginsMap = new HashMap<>();
	@Getter(AccessLevel.PUBLIC)
	private static final boolean developmentMode = OpenOSRS.getPluginDevelopmentPath().length > 0;
	@Getter(AccessLevel.PUBLIC)
	private final Map<String, Map<String, String>> pluginsInfoMap = new HashMap<>();
	private final Groups groups;
	@Getter(AccessLevel.PUBLIC)
	private UpdateManager updateManager;
	private final boolean safeMode;

	@Inject
	public OPRSExternalPluginManager(
		@Named("safeMode") final boolean safeMode,
		PluginManager pluginManager,
		OpenOSRSConfig openOSRSConfig,
		EventBus eventBus,
		ExecutorService executorService,
		ConfigManager configManager,
		Groups groups)
	{
		this.safeMode = safeMode;
		this.runelitePluginManager = pluginManager;
		this.openOSRSConfig = openOSRSConfig;
		this.eventBus = eventBus;
		this.executorService = executorService;
		this.configManager = configManager;
		this.groups = groups;

		//noinspection ResultOfMethodCallIgnored
		EXTERNALPLUGIN_DIR.mkdirs();

		initPluginManager();

		groups.getMessageStringSubject()
			.subscribe(this::receive);
	}

	private void initPluginManager()
	{
		externalPluginManager = new OPRSExternalPf4jPluginManager();
		externalPluginManager.setSystemVersion(SYSTEM_API_VERSION);
	}

	public boolean doesGhRepoExist(String owner, String name)
	{
		return doesRepoExist("gh:" + owner + "/" + name);
	}

	/**
	 * Note that {@link UpdateManager#addRepository} checks if the repo exists, however it throws an exception which is bad
	 */
	public boolean doesRepoExist(String id)
	{
		return repositories.stream().anyMatch((repo) -> repo.getId().equals(id));
	}

	private static URL toRepositoryUrl(String owner, String name) throws MalformedURLException
	{
		return new URL("https://raw.githubusercontent.com/" + owner + "/" + name + "/master/");
	}

	public static boolean testGHRepository(String owner, String name)
	{
		try
		{
			return testRepository(toRepositoryUrl(owner, name));
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public static boolean testRepository(URL url)
	{
		final List<UpdateRepository> repositories = new ArrayList<>();
		repositories.add(new DefaultUpdateRepository("repository-testing", url));
		DefaultPluginManager testPluginManager = new DefaultPluginManager(EXTERNALPLUGIN_DIR.toPath());
		UpdateManager updateManager = new UpdateManager(testPluginManager, repositories);

		return updateManager.getPlugins().size() <= 0;
	}

	public static <T> Predicate<T> not(Predicate<T> t)
	{
		return t.negate();
	}

	public void startExternalPluginManager()
	{
		try
		{
			externalPluginManager.loadPlugins();
		}
		catch (Exception ex)
		{
			if (ex instanceof MissingDependenciesException)
			{
				List<String> deps = ((MissingDependenciesException) ex).getDependencies();
				Multimap<String, String> reverseDepMap = ((MissingDependenciesException) ex).getReverseDependencyMap();

				for (String dependency : deps)
				{
					Collection<String> dependentPlugins = reverseDepMap.get(dependency);

					log.error("Dependency {} is missing, but is required by {}, attempting install.", dependency, dependentPlugins);
					try
					{
						updateManager.installPlugin(dependency, null);
					}
					catch (PluginRuntimeException ex2)
					{
						log.error("Dependency {} is missing and couldn't be installed. Disabling loading of {} as they depend on it.", dependency, dependentPlugins);
						dependentPlugins.forEach(s -> ((OPRSExternalPf4jPluginManager) externalPluginManager).disableLoading(s));
					}
				}

				startExternalPluginManager();
			}
			else
			{
				log.error("Could not load plugins", ex);
			}
		}
	}

	public void startExternalUpdateManager()
	{
		if (!tryLoadNewFormat())
		{
			log.debug("Load new format failed.");
			loadOldFormat();
		}

		updateManager = new UpdateManager(externalPluginManager, repositories);
		saveConfig();
	}

	public boolean tryLoadNewFormat()
	{
		try
		{
			duplicateCheck();
			log.debug("Trying to load new format: {}", openOSRSConfig.getExternalRepositories());
			repositories.clear();

			for (String keyval : openOSRSConfig.getExternalRepositories().split(";"))
			{
				String[] split = keyval.split("\\|");
				if (split.length != 2)
				{
					log.debug("Split length invalid: {}", keyval);
					repositories.clear();
					return false;
				}
				String id = split[0];
				String url = split[1];
				if (!url.endsWith("/"))
				{
					url = url.concat("/");
				}

				if (id.contains("https://raw.githubusercontent.com/"))
				{
					id = "gh:" + id.substring(id.indexOf("https://raw.githubusercontent.com/")).replace("/main", "")
						.replace("https://raw.githubusercontent.com/", "");

					if (id.endsWith("/"))
					{
						id = id.substring(0, id.lastIndexOf("/"));
					}
				}

				repositories.add(new DefaultUpdateRepository(id, new URL(url)));
			}
		}
		catch (ArrayIndexOutOfBoundsException | MalformedURLException e)
		{
			log.error("Error in new format", e);
			repositories.clear();
			return false;
		}
		return true;
	}

	public void loadOldFormat()
	{
		try
		{
			log.debug("Loading old format.");
			repositories.clear();

			for (String keyval : openOSRSConfig.getExternalRepositories().split(";"))
			{
				log.debug("KeyVal: {}", keyval);
				String id = keyval.substring(0, keyval.lastIndexOf(":https"));
				String url = keyval.substring(keyval.lastIndexOf("https"));

				DefaultUpdateRepository defaultRepo = new DefaultUpdateRepository(id, new URL(url));
				repositories.add(defaultRepo);
				log.debug("Added Repo: {}", defaultRepo.getUrl());
			}
		}
		catch (MalformedURLException e)
		{
			log.error("Old repository format contained malformed url", e);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			log.error("Error loading external repositories. They have been reset.");
			openOSRSConfig.setExternalRepositories(DEFAULT_PLUGIN_REPOS);
		}

		updateManager = new UpdateManager(externalPluginManager, repositories);
	}

	public void addGHRepository(String owner, String name)
	{
		try
		{
			addRepository("gh:" + owner + "/" + name, toRepositoryUrl(owner, name));
		}
		catch (MalformedURLException e)
		{
			log.error("GitHub repostitory could not be added (owner={}, name={})", owner, name, e);
		}
	}

	public void addRepository(String key, URL url)
	{
		DefaultUpdateRepository respository = new DefaultUpdateRepository(key, url);
		updateManager.addRepository(respository);
		eventBus.post(new OPRSRepositoryChanged(key, true));
		saveConfig();
	}

	public void removeRepository(String owner)
	{
		updateManager.removeRepository(owner);
		eventBus.post(new OPRSRepositoryChanged(owner, false));
		saveConfig();
	}

	private void saveConfig()
	{
		String config = updateManager.getRepositories().stream()
			.map(r -> r.getId() + "|" + urlToStringEncoded(r.getUrl()))
			.collect(Collectors.joining(";"));

		openOSRSConfig.setExternalRepositories(config);
	}

	public void setWarning(boolean val)
	{
		configManager.setConfiguration("openosrs", "warning", val);
	}

	public boolean getWarning()
	{
		return openOSRSConfig.warning();
	}

	/**
	 * This method is a fail safe to ensure that no duplicate
	 * repositories end up getting saved to the config.
	 * <p>
	 * Configs that had duplicate repos prior to this should
	 * be updated and set correctly.
	 */
	private void duplicateCheck()
	{
		String[] split = openOSRSConfig.getExternalRepositories().split(";");

		if (split.length <= 0)
		{
			return;
		}

		Set<String> strings = new HashSet<>();
		boolean duplicates = false;

		for (String s : split)
		{
			if (strings.contains(s))
			{
				log.error("Duplicate Repo: {}", s);
				duplicates = true;
				continue;
			}
			strings.add(s);
		}

		if (!duplicates)
		{
			log.info("No duplicates found.");
			return;
		}

		StringBuilder sb = new StringBuilder();

		for (String string : strings)
		{
			sb.append(string);
			sb.append(";");
		}

		sb.deleteCharAt(sb.lastIndexOf(";"));
		String duplicateFix = sb.toString();

		log.info("Duplicate Repos detected, setting them to: {}", duplicateFix);
		openOSRSConfig.setExternalRepositories(duplicateFix);
	}

	private void scanAndInstantiate(List<Plugin> plugins, boolean init, boolean initConfig)
	{
		OpenOSRSSplashScreen.stage(.66, "Loading external plugins");
		MutableGraph<Class<? extends Plugin>> graph = GraphBuilder
			.directed()
			.build();

		for (Plugin plugin : plugins)
		{
			Class<? extends Plugin> clazz = plugin.getClass();
			PluginDescriptor pluginDescriptor = clazz.getAnnotation(PluginDescriptor.class);

			try
			{
				if (pluginDescriptor == null)
				{
					if (Plugin.class.isAssignableFrom(clazz))
					{
						log.warn("Class {} is a plugin, but has no plugin descriptor", clazz);
					}
					continue;
				}
				else if (!Plugin.class.isAssignableFrom(clazz))
				{
					log.warn("Class {} has plugin descriptor, but is not a plugin", clazz);
					continue;
				}
			}
			catch (EnumConstantNotPresentException e)
			{
				log.warn("{} has an invalid plugin type of {}", clazz, e.getMessage());
				continue;
			}

			if (safeMode && !pluginDescriptor.loadInSafeMode())
			{
				log.debug("Disabling {} due to safe mode", clazz);
				// also disable the plugin from autostarting later
				configManager.unsetConfiguration(RuneLiteConfig.GROUP_NAME, clazz.getSimpleName().toLowerCase());
				continue;
			}

			@SuppressWarnings("unchecked") Class<Plugin> pluginClass = (Class<Plugin>) clazz;
			graph.addNode(pluginClass);
		}

		// Build plugin graph
		for (Class<? extends Plugin> pluginClazz : graph.nodes())
		{
			net.runelite.client.plugins.PluginDependency[] pluginDependencies = pluginClazz.getAnnotationsByType(net.runelite.client.plugins.PluginDependency.class);

			for (net.runelite.client.plugins.PluginDependency pluginDependency : pluginDependencies)
			{
				if (graph.nodes().contains(pluginDependency.value()))
				{
					graph.putEdge(pluginClazz, (Class<? extends Plugin>) pluginDependency.value());
				}
			}
		}

		if (Graphs.hasCycle(graph))
		{
			throw new RuntimeException("Plugin dependency graph contains a cycle!");
		}

		List<List<Class<? extends Plugin>>> sortedPlugins = PluginManager.topologicalGroupSort(graph);
		sortedPlugins = Lists.reverse(sortedPlugins);
		AtomicInteger loaded = new AtomicInteger();

		final long start = System.currentTimeMillis();

		List<Plugin> scannedPlugins = new CopyOnWriteArrayList<>();
		sortedPlugins.forEach(group ->
		{
			List<Future<?>> curGroup = new ArrayList<>();
			group.forEach(pluginClazz ->
				curGroup.add(executorService.submit(() ->
				{
					Plugin plugininst;
					try
					{
						//noinspection unchecked
						plugininst = instantiate(scannedPlugins, (Class<Plugin>) pluginClazz, init, initConfig);
						if (plugininst == null)
						{
							return;
						}

						scannedPlugins.add(plugininst);
					}
					catch (PluginInstantiationException e)
					{
						log.warn("Error instantiating plugin!", e);
						return;
					}

					loaded.getAndIncrement();

					OpenOSRSSplashScreen.stage(.67, .75, "Loading external plugins", loaded.get(), scannedPlugins.size());
				})));
			curGroup.forEach(future ->
			{
				try
				{
					future.get();
				}
				catch (InterruptedException | ExecutionException e)
				{
					log.warn("Could not instantiate external plugin", e);
				}
			});
		});

		log.info("External plugin instantiation took {}ms", System.currentTimeMillis() - start);
	}

	@SuppressWarnings("unchecked")
	private Plugin instantiate(List<Plugin> scannedPlugins, Class<Plugin> clazz, boolean init, boolean initConfig) throws PluginInstantiationException
	{
		net.runelite.client.plugins.PluginDependency[] pluginDependencies =
			clazz.getAnnotationsByType(net.runelite.client.plugins.PluginDependency.class);
		List<Plugin> deps = new ArrayList<>();
		for (net.runelite.client.plugins.PluginDependency pluginDependency : pluginDependencies)
		{
			Optional<net.runelite.client.plugins.Plugin> dependency =
				Stream.concat(runelitePluginManager.getPlugins().stream(), scannedPlugins.stream())
					.filter(p -> p.getClass() == pluginDependency.value()).findFirst();
			if (dependency.isEmpty())
			{
				throw new PluginInstantiationException(
					"Unmet dependency for " + clazz.getSimpleName() + ": " + pluginDependency.value().getSimpleName());
			}
			deps.add((Plugin) dependency.get());
		}

		log.info("Loading plugin {}", clazz.getSimpleName());
		Plugin plugin;
		try
		{
			plugin = clazz.getDeclaredConstructor().newInstance();
		}
		catch (ThreadDeath e)
		{
			throw e;
		}
		catch (Throwable ex)
		{
			throw new PluginInstantiationException(ex);
		}

		try
		{
			Injector parent = RuneLite.getInjector();

			if (deps.size() > 1)
			{
				List<Module> modules = new ArrayList<>(deps.size());
				for (Plugin p : deps)
				{
					// Create a module for each dependency
					Module module = (Binder binder) ->
					{
						binder.bind((Class<Plugin>) p.getClass()).toInstance(p);
						binder.install(p);
					};
					modules.add(module);
				}

				// Create a parent injector containing all of the dependencies
				parent = parent.createChildInjector(modules);
			}
			else if (!deps.isEmpty())
			{
				// With only one dependency we can simply use its injector
				parent = deps.get(0).injector;
			}

			// Create injector for the module
			Module pluginModule = (Binder binder) ->
			{
				// Since the plugin itself is a module, it won't bind itself, so we'll bind it here
				binder.bind(clazz).toInstance(plugin);
				binder.install(plugin);
			};
			Injector pluginInjector = parent.createChildInjector(pluginModule);
			pluginInjector.injectMembers(plugin);
			plugin.injector = pluginInjector;

			if (initConfig)
			{
				for (Key<?> key : pluginInjector.getBindings().keySet())
				{
					Class<?> type = key.getTypeLiteral().getRawType();
					if (Config.class.isAssignableFrom(type))
					{
						if (type.getPackageName().startsWith(plugin.getClass().getPackageName()))
						{
							Config config = (Config) pluginInjector.getInstance(key);
							configManager.setDefaultConfiguration(config, false);
						}
					}
				}
			}

			if (init)
			{
				try
				{
					SwingUtil.syncExec(() ->
					{
						try
						{
							runelitePluginManager.add(plugin);
							runelitePluginManager.startPlugin(plugin);
							eventBus.post(new OPRSPluginChanged(pluginsMap.get(plugin.getClass().getSimpleName()),
								plugin, true));
						}
						catch (PluginInstantiationException e)
						{
							throw new RuntimeException(e);
						}
					});
				}
				catch (Exception ex)
				{
					log.warn("unable to start plugin", ex);
				}
			}
			else
			{
				runelitePluginManager.add(plugin);
			}
		}
		catch (CreationException ex)
		{
			throw new PluginInstantiationException(ex);
		}
		catch (NoClassDefFoundError ex)
		{
			log.error("Plugin {} is outdated", clazz.getSimpleName());
			return null;
		}

		log.debug("Loaded plugin {}", clazz.getSimpleName());
		return plugin;
	}

	private void checkDepsAndStart(List<PluginWrapper> startedPlugins, List<Plugin> scannedPlugins, PluginWrapper pluginWrapper)
	{
		boolean depsLoaded = true;
		for (PluginDependency dependency : pluginWrapper.getDescriptor().getDependencies())
		{
			if (startedPlugins.stream().noneMatch(pl -> pl.getPluginId().equals(dependency.getPluginId())))
			{
				depsLoaded = false;
			}
		}

		if (!depsLoaded)
		{
			// This should never happen but can crash the client
			return;
		}

		scannedPlugins.addAll(loadPlugin(pluginWrapper.getPluginId()));
	}

	public void loadPlugins()
	{
		externalPluginManager.startPlugins();
		List<PluginWrapper> startedPlugins = getStartedPlugins();
		List<Plugin> scannedPlugins = new ArrayList<>();

		for (PluginWrapper plugin : startedPlugins)
		{
			checkDepsAndStart(startedPlugins, scannedPlugins, plugin);
		}

		scanAndInstantiate(scannedPlugins, false, false);

		if (groups.getInstanceCount() > 1)
		{
			for (String pluginId : getDisabledPluginIds())
			{
				groups.sendString("STOPEXTERNAL;" + pluginId);
			}
		}
		else
		{
			for (String pluginId : getDisabledPluginIds())
			{
				externalPluginManager.enablePlugin(pluginId);
				externalPluginManager.deletePlugin(pluginId);
			}
		}
	}

	private List<Plugin> loadPlugin(String pluginId)
	{
		List<Plugin> scannedPlugins = new ArrayList<>();
		try
		{
			List<Plugin> extensions = externalPluginManager.getExtensions(Plugin.class, pluginId);
			for (Plugin plugin : extensions)
			{
				pluginClassLoaders.add(plugin.getClass().getClassLoader());

				pluginsMap.remove(plugin.getClass().getSimpleName());
				pluginsMap.put(plugin.getClass().getSimpleName(), pluginId);

				pluginsInfoMap.remove(plugin.getClass().getSimpleName());

				AtomicReference<String> support = new AtomicReference<>("");

				updateManager.getRepositories().forEach(repository ->
					repository.getPlugins().forEach((key, value) ->
					{
						if (key.equals(pluginId))
						{
							support.set(value.projectUrl);
						}
					}));

				pluginsInfoMap.put(
					plugin.getClass().getSimpleName(),
					new HashMap<>()
					{{
						put("version", externalPluginManager.getPlugin(pluginId).getDescriptor().getVersion());
						put("id", externalPluginManager.getPlugin(pluginId).getDescriptor().getPluginId());
						put("provider", externalPluginManager.getPlugin(pluginId).getDescriptor().getProvider());
						put("support", support.get());
					}}
				);

				scannedPlugins.add(plugin);
			}
		}
		catch (Throwable ex)
		{
			log.error("Plugin {} could not be loaded.", pluginId, ex);
		}

		return scannedPlugins;
	}

	private Path stopPlugin(String pluginId)
	{
		List<PluginWrapper> startedPlugins = List.copyOf(getStartedPlugins());

		for (PluginWrapper pluginWrapper : startedPlugins)
		{
			if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId()))
			{
				continue;
			}

			List<Plugin> extensions = externalPluginManager.getExtensions(Plugin.class, pluginId);

			for (net.runelite.client.plugins.Plugin plugin : runelitePluginManager.getPlugins())
			{
				if (!extensions.get(0).getClass().getName().equals(plugin.getClass().getName()))
				{
					continue;
				}

				try
				{
					SwingUtil.syncExec(() ->
					{
						try
						{
							runelitePluginManager.stopPlugin(plugin);
						}
						catch (Exception e2)
						{
							throw new RuntimeException(e2);
						}
					});
					runelitePluginManager.remove(plugin);
					pluginClassLoaders.remove(plugin.getClass().getClassLoader());

					eventBus.post(new OPRSPluginChanged(pluginId, plugin, false));

					return pluginWrapper.getPluginPath();
				}
				catch (Exception ex)
				{
					log.warn("unable to stop plugin", ex);
					return null;
				}
			}
		}

		return null;
	}

	public boolean install(String pluginId)
	{
		if (getDisabledPluginIds().contains(pluginId))
		{
			externalPluginManager.enablePlugin(pluginId);
			externalPluginManager.startPlugin(pluginId);

			groups.broadcastSring("STARTEXTERNAL;" + pluginId);
			scanAndInstantiate(loadPlugin(pluginId), true, false);
			ExternalPluginsChanged event = new ExternalPluginsChanged(null);
			eventBus.post(event);

			return true;
		}

		if (getStartedPlugins().stream().anyMatch(ev -> ev.getPluginId().equals(pluginId)))
		{
			return true;
		}

		try
		{
			if (!developmentMode)
			{
				PluginInfo.PluginRelease latest = updateManager.getLastPluginRelease(pluginId);

				// Null version returns the last release version of this plugin for given system version
				if (latest == null)
				{
					try
					{
						SwingUtil.syncExec(() ->
							JOptionPane.showMessageDialog(ClientUI.getFrame(),
								pluginId + " is outdated and cannot be installed",
								"Installation error",
								JOptionPane.ERROR_MESSAGE));
					}
					catch (InvocationTargetException | InterruptedException ignored)
					{
						return false;
					}

					return true;
				}

				updateManager.installPlugin(pluginId, null);
				scanAndInstantiate(loadPlugin(pluginId), true, true);
			}
			else
			{
				// In development mode our plugin will already be present in a repository, so we can just load it
				externalPluginManager.loadPlugins();
				externalPluginManager.startPlugin(pluginId);
			}

			ExternalPluginsChanged event = new ExternalPluginsChanged(null);
			eventBus.post(event);
			groups.broadcastSring("STARTEXTERNAL;" + pluginId);
		}
		catch (DependencyResolver.DependenciesNotFoundException ex)
		{
			uninstall(pluginId);

			for (String dep : ex.getDependencies())
			{
				install(dep);
			}

			install(pluginId);
		}
		return false;
	}

	public boolean uninstall(String pluginId)
	{
		return uninstall(pluginId, false);
	}

	public boolean uninstall(String pluginId, boolean skip)
	{
		Path pluginPath = stopPlugin(pluginId);

		if (pluginPath == null)
		{
			return false;
		}

		externalPluginManager.stopPlugin(pluginId);

		if (skip)
		{
			return true;
		}

		if (groups.getInstanceCount() > 1)
		{
			groups.sendString("STOPEXTERNAL;" + pluginId);
		}
		else
		{
			externalPluginManager.deletePlugin(pluginId);
		}

		return true;
	}

	public void update()
	{
		if (groups.getInstanceCount() > 1)
		{
			// Do not update when there is more than one client open -> api might contain changes
			log.info("Not updating external plugins since there is more than 1 client open");
			return;
		}
		else if (developmentMode)
		{
			log.info("Not updating because we're running in developer mode");
			return;
		}

		OpenOSRSSplashScreen.stage(.59, "Updating external plugins");

		boolean error = false;

		if (updateManager.hasUpdates())
		{
			List<PluginInfo> updates = updateManager.getUpdates();
			for (PluginInfo plugin : updates)
			{
				PluginInfo.PluginRelease lastRelease = updateManager.getLastPluginRelease(plugin.id);
				String lastVersion = lastRelease.version;
				try
				{

					OpenOSRSSplashScreen.stage(.59, "Updating " + plugin.id + " to version " + lastVersion);
					boolean updated = updateManager.updatePlugin(plugin.id, lastVersion);

					if (!updated)
					{
						log.warn("Cannot update plugin '{}'", plugin.id);
						error = true;
					}
				}
				catch (PluginRuntimeException ex)
				{
					// This should never happen but can crash the client
					log.warn("Cannot update plugin '{}', the user probably has another client open", plugin.id);
					error = true;
					break;
				}
			}
		}

		if (error)
		{
			initPluginManager();
			startExternalUpdateManager();
			startExternalPluginManager();
		}
	}

	public Set<String> getDependencies()
	{
		Set<String> deps = new HashSet<>();
		List<PluginWrapper> startedPlugins = getStartedPlugins();

		for (PluginWrapper pluginWrapper : startedPlugins)
		{
			for (PluginDependency pluginDependency : pluginWrapper.getDescriptor().getDependencies())
			{
				deps.add(pluginDependency.getPluginId());
			}
		}

		return deps;
	}

	public List<PluginWrapper> getDisabledPlugins()
	{
		return externalPluginManager.getResolvedPlugins()
			.stream()
			.filter(not(externalPluginManager.getStartedPlugins()::contains))
			.collect(Collectors.toList());
	}

	public List<String> getDisabledPluginIds()
	{
		return getDisabledPlugins()
			.stream()
			.map(PluginWrapper::getPluginId)
			.collect(Collectors.toList());
	}

	public List<PluginWrapper> getStartedPlugins()
	{
		return externalPluginManager.getStartedPlugins();
	}

	public Boolean reloadStart(String pluginId)
	{
		externalPluginManager.loadPlugins();
		externalPluginManager.startPlugin(pluginId);

		List<PluginWrapper> startedPlugins = List.copyOf(getStartedPlugins());
		List<PluginWrapper> disabledPlugins = List.copyOf(getDisabledPlugins());
		List<PluginWrapper> combinedList = Stream.of(startedPlugins, disabledPlugins).flatMap(Collection::stream).collect(Collectors.toList());
		List<Plugin> scannedPlugins = new ArrayList<>();

		for (PluginWrapper pluginWrapper : combinedList)
		{
			if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId()))
			{
				continue;
			}

			checkDepsAndStart(combinedList, scannedPlugins, pluginWrapper);
		}


		scanAndInstantiate(scannedPlugins, true, false);

		groups.broadcastSring("STARTEXTERNAL;" + pluginId);

		return true;
	}

	public void receive(Message message)
	{
		if (message.getObject() instanceof ConfigChanged)
		{
			return;
		}

		String[] messageObject = ((String) message.getObject()).split(";");

		if (messageObject.length < 2)
		{
			return;
		}

		String command = messageObject[0];
		String pluginId = messageObject[1];

		switch (command)
		{
			case "STARTEXTERNAL":
				externalPluginManager.loadPlugins();
				externalPluginManager.startPlugin(pluginId);

				List<PluginWrapper> startedPlugins = List.copyOf(getStartedPlugins());
				List<Plugin> scannedPlugins = new ArrayList<>();

				for (PluginWrapper pluginWrapper : startedPlugins)
				{
					if (!pluginId.equals(pluginWrapper.getDescriptor().getPluginId()))
					{
						continue;
					}

					checkDepsAndStart(startedPlugins, scannedPlugins, pluginWrapper);
				}

				scanAndInstantiate(scannedPlugins, true, false);

				break;

			case "STOPEXTERNAL":
				uninstall(pluginId, true);
				externalPluginManager.unloadPlugin(pluginId);
				groups.send(message.getSrc(), "STOPPEDEXTERNAL;" + pluginId);
				break;

			case "STOPPEDEXTERNAL":
				groups.getMessageMap().get(pluginId).remove(message.getSrc());

				if (groups.getMessageMap().get(pluginId).size() == 0)
				{
					groups.getMessageMap().remove(pluginId);
					externalPluginManager.deletePlugin(pluginId);
				}

				break;
		}
	}

	/**
	 * Mostly stolen from {@link java.net.URLStreamHandler#toExternalForm(URL)}
	 *
	 * @param url URL to encode
	 * @return URL, with path, query and ref encoded
	 */
	private static String urlToStringEncoded(URL url)
	{
		String s;
		String path = url.getPath() != null ? Stream.of(url.getPath().split("/"))
			.map(s2 -> URLEncoder.encode(s2, StandardCharsets.UTF_8)).collect(Collectors.joining("/")) : "";
		return url.getProtocol()
			+ ':'
			+ (((s = url.getAuthority()) != null && s.length() > 0) ? "//" + s : "")
			+ (path)
			+ (((s = url.getQuery()) != null) ? '?' + urlEncode(s) : "")
			+ (((s = url.getRef()) != null) ? '#' + urlEncode(s) : "");
	}

	private static String urlEncode(String s)
	{
		return URLEncoder.encode(s, StandardCharsets.UTF_8);
	}
}
