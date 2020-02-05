package net.runelite.client.plugins.crystalmathlabs;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("CML")

public interface CrystalMathLabsConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "templeOSRS",
		name = "TempleOSRS tracking",
		description = "Tracks your stats on CML and TempleOSRS",
		titleSection = "TempleOSRS"
	)
	default boolean templeOSRS()
	{
		return false;
	}
}
