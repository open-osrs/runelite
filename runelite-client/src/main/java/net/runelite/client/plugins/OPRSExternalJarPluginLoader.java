package net.runelite.client.plugins;

import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.JarPluginLoader;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;

@Slf4j
class OPRSExternalJarPluginLoader extends JarPluginLoader
{
	public OPRSExternalJarPluginLoader(PluginManager pluginManager)
	{
		super(pluginManager);
	}

	@Override
	public ClassLoader loadPlugin(Path pluginPath, PluginDescriptor pluginDescriptor)
	{
		PluginClassLoader pluginClassLoader = new OPRSExternalClassLoader(pluginManager, pluginDescriptor, getClass().getClassLoader());
		pluginClassLoader.addFile(pluginPath.toFile());

		return pluginClassLoader;
	}
}
