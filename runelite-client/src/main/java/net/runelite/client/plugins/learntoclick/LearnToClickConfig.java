package net.runelite.client.plugins.learntoclick;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("learntoclick")
public interface LearnToClickConfig extends Config
{

	@ConfigItem(position = 1, keyName = "blockCompass", name = "Compass", description = "Prevents the camera from moving when you misclick on the compass")
	default boolean shouldBlockCompass()
	{
		return false;
	}

	@ConfigItem(position = 2, keyName = "rightClickMap", name = "World Map", description = "Prevents the world map from opening on left click without disabling it entirely")
	default boolean shouldRightClickMap()
	{
		return false;
	}

	@ConfigItem(position = 3, keyName = "rightClickXp", name = "Xp Drops Toggle", description = "Prevents toggling xp drops on left click without disabling the toggle function entirely")
	default boolean shouldRightClickXp()
	{
		return false;
	}

	@ConfigItem(position = 4, keyName = "rightClickRetaliate", name = "Auto Retaliate", description = "Prevents toggling auto retaliate on left click without disabling the toggle function entirely")
	default boolean shouldRightClickRetaliate()
	{
		return false;
	}


}