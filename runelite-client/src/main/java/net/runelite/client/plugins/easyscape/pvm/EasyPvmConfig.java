package net.runelite.client.plugins.easyscape.pvm;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("easypvm")
public interface EasyPvmConfig extends Config {


    @ConfigItem(
            keyName = "removeFreezePlayerToB",
            name = "Remove freeze in ToB",
            description = "Removes the freeze option for ice barrage, ice blitz, entangle etc. in ToB",
            position = 0
    )

    default boolean getRemoveFreezePlayerToB() {
        return true;
    }

    @ConfigItem(
            keyName = "removeFreezePlayerCoX",
            name = "Remove freeze in CoX",
            description = "Removes the freeze option for ice barrage, ice blitz, entangle etc. in CoX",
            position = 1
    )

    default boolean getRemoveFreezePlayerCoX() {
        return true;
    }


}