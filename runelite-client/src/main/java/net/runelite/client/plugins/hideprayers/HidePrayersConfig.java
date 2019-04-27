package net.runelite.client.plugins.hideprayers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hideprayers")
public interface HidePrayersConfig extends Config
{
    @ConfigItem(
            position = 0,
            keyName = "PVP Prayer Only",
            name = "Hides non-PVP related prayer",
            description = "Hides widget icons for non-PVP related prayers"
    )
    default boolean showPrayers() { return false; }
    
    @ConfigItem(
    	position = 1,
    	keyName = "eagle/mystic",
    	name = "Eagle/Mystic (not Rigour/Augury)",
    	description = "Shows Eagle Eye and Mystic Might instead of Rigour and Augury."
    )
    default boolean showEagleMystic() { return false; }

    @ConfigItem(
            position = 2,
            keyName = "Ultimate Strength",
            name = "Ultimate Strength (not Piety)",
            description = "Shows Ultimate Strength and not Piety"
    )
    default boolean showUltStrength() { return false; }
}

