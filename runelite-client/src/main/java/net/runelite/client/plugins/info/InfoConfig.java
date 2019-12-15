package net.runelite.client.plugins.info;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("info")
public interface InfoConfig extends Config
{
	@ConfigItem(
		keyName = "showGithub",
		name = "Show the OpenOSRS Github",
		description = "configures if you want to show the OpenOSRS github or not.",
		position = 0
	)
	default boolean showGithub()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showLauncher",
		name = "Show the Launcher download",
		description = "configures if you want to show the OpenOSRS launcher download or not.",
		position = 1
	)
	default boolean showLauncher()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showLogDir",
		name = "Show log directory",
		description = "configures if you want to show the log directory or not.",
		position = 2
	)
	default boolean showLogDir()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showRuneliteDir",
		name = "Show runelite directory",
		description = "configures if you want to show the runelite directory or not.",
		position = 3
	)
	default boolean showRuneliteDir()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showPluginsDir",
		name = "Show plugins directory",
		description = "configures if you want to show the plugins directory or not.",
		position = 4
	)
	default boolean showPluginsDir()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showScreenshotsDir",
		name = "Show screenshots directory",
		description = "configures if you want to show the screenshots directory or not.",
		position = 5
	)
	default boolean showScreenshotsDir()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showPhysicalDir",
		name = "Show Physical directories",
		description = "configures if you want to show the physical directory locations or not.",
		position = 6
	)
	default boolean showPhysicalDir()
	{
		return false;
	}

}
