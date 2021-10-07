/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.ItemDropper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("ItemDropperConfig")
public interface ItemDropperConfig extends Config
{
	@ConfigItem(
		keyName = "items",
		name = "Items to Drop",
		description = "Seperate with comma",
		position = 0
	)
	default String items()
	{
		return "0";
	}

	@ConfigItem(
		position = 1,
		keyName = "toggle",
		name = "Drop Items",
		description = "Drops Items in config above."
	)
	default Keybind toggle()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		keyName = "randLow",
		name = "Minimum Delay",
		description = "For MouseEvents only.",
		position = 3
	)
	default int randLow()
	{
		return 70;
	}

	@ConfigItem(
		keyName = "randLower",
		name = "Maximum Delay",
		description = "For MouseEvents only.",
		position = 4
	)
	default int randHigh()
	{
		return 80;
	}
}
