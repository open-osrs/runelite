package net.runelite.client.plugins.herbsack;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("herbSack")
public interface HerbSackConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "infobox",
		name = "Herb Sack InfoBox",
		description = "Display herb sack information in an InfoBox"
	)
	default boolean showInfobox()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "overlay",
		name = "Herb Sack Overlay",
		description = "Display herb sack information in an overlay"
	)
	default boolean showOverlay()
	{
		return false;
	}
}
