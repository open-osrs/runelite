package net.runelite.client.plugins.hideprayers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hideprayers")
public interface HidePrayersConfig extends Config
{
    @ConfigItem(
            position = 0,
            keyName = "pk prayers",
            name = "Hides none pk prayers",
            description = "Hides widget icons."
    )
    default boolean showPrayers() { return false; }

    @ConfigItem(
            position = 1,
            keyName = "redemp",
            name = "Show redemption",
            description = "Shows redemption for CoX"
    )
    default boolean showRedemption() { return false; }
    
    @ConfigItem(
    	position = 2,
    	keyName = "eagle/mystic",
    	name = "Shows eagle and mystic prayers",
    	description = "Hides widget icons."
    )
    default boolean showEagleMystic() { return false; }

	@ConfigItem(
		position = 3,
		keyName = "ultstr",
		name = "Shows ultimate strength",
		description = "Hides widget icons."
	)
	default boolean showUltStrength() { return false; }

}

