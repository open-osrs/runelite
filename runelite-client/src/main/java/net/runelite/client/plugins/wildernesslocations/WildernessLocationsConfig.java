package net.runelite.client.plugins.wildernesslocations;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("wildernesslocations")
public interface WildernessLocationsConfig extends Config
{
	
	@ConfigItem(
		keyName = "drawOverlay",
		name = "Draw Overlay",
		description = "Configure drawing wilderness locations overlay",
		position = 1
	)
	default boolean drawOverlay()
	{
		return true;
	}
	
	@ConfigItem(
		keyName = "keybind",
		name = "Send to CC",
		description = "Configure button to send current location to CC",
		position = 2
	)
	default Keybind keybind()
	{
		return Keybind.NOT_SET;
	}
	
}
