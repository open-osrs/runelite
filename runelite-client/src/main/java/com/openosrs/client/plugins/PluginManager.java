package com.openosrs.client.plugins;

import com.openosrs.client.plugins.neverlog.NeverLogoutPlugin;
import com.openosrs.client.plugins.openosrs.OpenOSRSPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.PluginInstantiationException;

public class PluginManager
{
	public static List<Class<?>> oprsPlugins = new ArrayList<>();

	public static void loadPlugins()
	{
		try
		{
			ExternalPluginManager.pluginManager.loadPlugins(oprsPlugins, null);
		}
		catch (PluginInstantiationException e)
		{
			e.printStackTrace();
		}
	}

	static
	{
		oprsPlugins.add(NeverLogoutPlugin.class);
		oprsPlugins.add(OpenOSRSPlugin.class);
	}
}
