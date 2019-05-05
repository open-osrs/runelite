package net.runelite.client.plugins.boulder;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("boulder")
public interface BoulderConfig extends Config
{
	@ConfigItem(
		keyName = "showHighlight",
		name = "Highlight Shortcutrs",
		description = "Shows shortcuts",
		position = 1
	)
	default boolean showHighlight()
	{
		return true;
	}

	@ConfigItem(
		keyName = "markerColor",
		name = "Marker color",
		description = "Configures the color shortcut color",
		position = 2
	)
	default Color markerColor()
	{
		return Color.white;
	}

	@ConfigItem(
		keyName = "showText",
		name = "Show text",
		description = "Shows name of shortcuts",
		position = 3
	)
	default boolean showText()
	{
		return true;
	}

	@ConfigItem(
		keyName = "doBoulder",
		name = "Boulder",
		description = "Shows boulder",
		position = 5
	)
	default boolean doBoulder()
	{
		return true;
	}

	@ConfigItem(
		keyName = "doTree",
		name = "Woodcutting",
		description = "Shows tree",
		position = 6
	)
	default boolean doTree()
	{
		return true;
	}

	@ConfigItem(
		keyName = "doMining",
		name = "Mining",
		description = "Shows Rocks",
		position = 7
	)
	default boolean doMining()
	{
		return true;
	}

	@ConfigItem(
		keyName = "textColor",
		name = "Text color",
		description = "Configures the color of text marker",
		position = 4
	)
	default Color textColor()
	{
		return Color.red;
	}
}
