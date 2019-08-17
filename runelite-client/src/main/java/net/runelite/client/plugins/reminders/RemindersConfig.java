package net.runelite.client.plugins.reminders;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Reminders")
public interface RemindersConfig extends Config
{
	@ConfigItem(
		keyName = "breakReminder",
		name = "Break Reminder",
		description = "Reminds you to take a break every hour",
		position = 0
	)
	default boolean breakReminder()
	{
		return true;
	}

	@ConfigItem(
		keyName = "hydrationReminder",
		name = "Hydration Reminder",
		description = "Reminds you to drink water every hour",
		position = 1
	)
	default boolean hydrationReminder()
	{
		return true;
	}


}
