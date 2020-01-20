package net.runelite.client.plugins.freezetimersv2;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
import java.awt.Color;

@ConfigGroup("freezetimersv2")
public interface FreezeTimersV2Config extends Config
{
	@ConfigItem(
		name = "Show NPCs",
		keyName = "showNpcs",
		description = "Should we show the overlay on NPCs?",
		position = 1
	)
	default boolean showNpcs()
	{
		return false;
	}

	@ConfigItem(
		name = "Show Players",
		keyName = "showPlayers",
		description = "Should we show the overlay on players?",
		position = 2
	)
	default boolean showPlayers()
	{
		return true;
	}

	@ConfigItem(
		name = "Timer Color",
		keyName = "timerColor",
		description = "Color for timers not on cooldown",
		position = 3
	)
	default Color timerColor()
	{
		return Color.CYAN;
	}

	@ConfigItem(
		name = "Cooldown Color",
		keyName = "cooldownColor",
		description = "Color for timers on cooldown",
		position = 4
	)
	default Color cooldownColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		name = "Freeze Timers",
		keyName = "freezeTimers",
		description = "Should we render freeze timers?",
		position = 5
	)
	default boolean freezeTimers()
	{
		return true;
	}

	@ConfigItem(
		name = "Teleblock Timers",
		keyName = "teleblockTimers",
		description = "Should we render teleblock timers?",
		position = 6
	)
	default boolean teleblockTimers()
	{
		return true;
	}

	@ConfigItem(
		name = "Vengeance Timers",
		keyName = "vengTimers",
		description = "Should we render vengeance timers?",
		position = 7
	)
	default boolean vengTimers()
	{
		return true;
	}

	@ConfigItem(
		name = "Debug Keybind",
		keyName = "debugKeybind",
		description = "Don't press this unless you know what it does :)",
		position = 8
	)
	default Keybind debugKeybind()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		name = "Debug Integer",
		keyName = "debugInteger",
		description = "Related to the keybind in some way :)",
		position = 9
	)
	default int debugInteger()
	{
		return -1;
	}
}
