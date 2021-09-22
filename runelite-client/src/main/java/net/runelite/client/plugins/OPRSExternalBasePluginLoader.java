package net.runelite.client.plugins;

import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.BasePluginLoader;
import org.pf4j.PluginClassLoader;
import org.pf4j.PluginClasspath;
import org.pf4j.PluginDescriptor;
import org.pf4j.PluginManager;

@Slf4j
class OPRSExternalBasePluginLoader extends BasePluginLoader
{
	OPRSExternalBasePluginLoader(PluginManager pluginManager, PluginClasspath pluginClasspath)
	{
		super(pluginManager, pluginClasspath);
	}

	@Override
	protected PluginClassLoader createPluginClassLoader(Path pluginPath, PluginDescriptor pluginDescriptor)
	{
		return new OPRSExternalClassLoader(pluginManager, pluginDescriptor, getClass().getClassLoader());
	}
}
