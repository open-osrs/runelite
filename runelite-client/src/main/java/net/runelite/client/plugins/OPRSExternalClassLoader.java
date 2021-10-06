package net.runelite.client.plugins;

import java.lang.invoke.MethodHandles;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.util.ReflectUtil;
import org.pf4j.ClassLoadingStrategy;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginDependency;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;

@Slf4j
class OPRSExternalClassLoader extends PluginClassLoader implements ReflectUtil.PrivateLookupableClassLoader
{
	private static final String JAVA_PACKAGE_PREFIX = "java.";
	private static final String PLUGIN_PACKAGE_PREFIX = "org.pf4j.";

	@Getter
	@Setter
	private MethodHandles.Lookup lookup;

	private final PluginManager pluginManager;
	private final PluginDescriptor pluginDescriptor;
	private final ClassLoadingStrategy classLoadingStrategy;

	OPRSExternalClassLoader(PluginManager pluginManager, PluginDescriptor pluginDescriptor, ClassLoader parent)
	{
		super(pluginManager, pluginDescriptor, parent);

		this.pluginManager = pluginManager;
		this.pluginDescriptor = pluginDescriptor;
		this.classLoadingStrategy = ClassLoadingStrategy.PDA;

		ReflectUtil.installLookupHelper(this);
	}

	@Override
	public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError
	{
		return super.defineClass(name, b, off, len);
	}

	@Override
	protected Class<?> loadClassFromDependencies(String className)
	{
		log.trace("Search in dependencies for class '{}'", className);

		List<org.pf4j.PluginDependency> dependencies = pluginDescriptor.getDependencies();
		for (PluginDependency dependency : dependencies)
		{
			ClassLoader classLoader = pluginManager.getPluginClassLoader(dependency.getPluginId());

			// If the dependency is marked as optional, its class loader might not be available.
			if (classLoader == null && dependency.isOptional())
			{
				continue;
			}

			try
			{
				if (classLoader != null)
				{
					return classLoader.loadClass(className);
				}
			}
			catch (ClassNotFoundException e)
			{
				// try next dependency
			}
		}

		return null;
	}

	@Override
	public Class<?> loadClass(String className) throws ClassNotFoundException
	{
		synchronized (getClassLoadingLock(className))
		{
			// first check whether it's a system class, delegate to the system loader
			if (className.startsWith(JAVA_PACKAGE_PREFIX))
			{
				return findSystemClass(className);
			}

			// if the class is part of the plugin engine use parent class loader
			if (className.startsWith(PLUGIN_PACKAGE_PREFIX) && !className.startsWith("org.pf4j.demo"))
			{
//                log.trace("Delegate the loading of PF4J class '{}' to parent", className);
				return getParent().loadClass(className);
			}

			log.trace("Received request to load class '{}'", className);

			// second check whether it's already been loaded
			Class<?> loadedClass = findLoadedClass(className);
			if (loadedClass != null)
			{
				log.trace("Found loaded class '{}'", className);
				return loadedClass;
			}

			for (ClassLoadingStrategy.Source classLoadingSource : this.classLoadingStrategy.getSources())
			{
				Class<?> c = null;
				try
				{
					switch (classLoadingSource)
					{
						case APPLICATION:
							c = super.loadClass(className);
							break;
						case PLUGIN:
							c = findClass(className);
							break;
						case DEPENDENCIES:
							c = loadClassFromDependencies(className);
							break;
					}
				}
				catch (ClassNotFoundException ignored)
				{
				}

				if (c != null)
				{
					log.trace("Found class '{}' in {} classpath", className, classLoadingSource);
					return c;
				}
				else
				{
					log.trace("Couldn't find class '{}' in {} classpath", className, classLoadingSource);
				}
			}

			throw new ClassNotFoundException(className);
		}
	}
}
