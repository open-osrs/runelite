package net.runelite.client.plugins.onetick;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitleSection;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.Title;
import net.runelite.client.plugins.onetick.utils.ActionType;
import net.runelite.client.plugins.onetick.utils.Method;

@ConfigGroup("OneTick")
public interface OneTickConfig extends Config
{
	@ConfigTitleSection(
		keyName = "config",
		name = "Config",
		description = "",
		position = 0
	)
	default Title config()
	{
		return new Title();
	}

	@ConfigItem(
		position = 1,
		keyName = "oneTick",
		name = "One Tick",
		description = "Activates the script below.",
		titleSection = "config"
	)
	default Keybind oneTick()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		position = 2,
		keyName = "method",
		name = "Action Type",
		description = "Flexo is smooth mouse, MouseEvents is ghost mouse",
		titleSection = "config"
	)
	default Method method()
	{
		return Method.PRAYER;
	}

	@ConfigItem(
		keyName = "boneId",
		name = "Bone ID",
		description = "to 1 tick",
		position = 3,
		titleSection = "config"
	)
	default String boneId()
	{
		return "22780, 22786";
	}

	@ConfigItem(
		keyName = "boltId",
		name = "Bolt ID",
		description = "to 1 tick",
		position = 3,
		titleSection = "config"
	)
	default String boltId()
	{
		return "0, 0, 0";
	}

	@ConfigItem(
		keyName = "boltDelay",
		name = "Bolt Delay",
		description = "The delay in milliseconds between next bolt combination.",
		position = 4,
		titleSection = "config"
	)
	default int boltDelay()
	{
		return 70;
	}

	@ConfigTitleSection(
		keyName = "miscConfig",
		name = "Misc Config",
		description = "",
		position = 5
	)
	default Title miscConfig()
	{
		return new Title();
	}

	@ConfigItem(
		position = 14,
		keyName = "actionType",
		name = "Action Type",
		description = "Flexo is smooth mouse, MouseEvents is ghost mouse",
		titleSection = "miscConfig"
	)
	default ActionType actionType()
	{
		return ActionType.FLEXO;
	}

	@ConfigItem(
		keyName = "randLow",
		name = "Minimum Delay",
		description = "For MouseEvents only.",
		position = 15,
		titleSection = "miscConfig"
	)
	default int randLow()
	{
		return 70;
	}

	@ConfigItem(
		keyName = "randLower",
		name = "Maximum Delay",
		description = "For MouseEvents only.",
		position = 16,
		titleSection = "miscConfig"
	)
	default int randHigh()
	{
		return 80;
	}
}
