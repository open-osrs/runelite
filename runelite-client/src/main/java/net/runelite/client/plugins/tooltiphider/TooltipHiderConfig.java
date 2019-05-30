package net.runelite.client.plugins.tooltiphider;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("tooltiphider")
public interface TooltipHiderConfig extends Config
{

    @ConfigItem(position = 0, keyName = "hideSpells", name = "Spellbook", description = "Hides tooltips in the spellbook")
    default boolean shouldHideSpells()
    {
        return false;
    }

    @ConfigItem(position = 1, keyName = "hideCombat", name = "Combat", description = "Hides the tooltips in the combat menu")
    default boolean shouldHideCombat()
    {
        return false;
    }

}
