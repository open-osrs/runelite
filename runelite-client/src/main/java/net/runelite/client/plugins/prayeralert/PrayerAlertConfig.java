package net.runelite.client.plugins.prayeralert;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("prayeralert")
public interface PrayerAlertConfig extends Config
{
    @ConfigItem(
            position = 1,
            keyName = "alwaysShowAlert",
            name = "Always show prayer alert",
            description = "Show the alert, even without prayer restore in inventory"
    )
    default boolean alwaysShowAlert()
    {
        return false;
    }
    @ConfigItem(
            position = 2,
            keyName = "oldRenderMode",
            name = "Render using old method",
            description = "Render the prayer alert using the old method"
    )
    default boolean oldRenderMode()
    {
        return false;
    }
}