package net.runelite.client.plugins.inventoryviewer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("inventoryviewer")
public interface InventoryViewerConfig extends Config
{
	@ConfigItem(
		keyName = "hideWhenInvOpen",
		name = "Hide when inventory is open",
		description = "Hide the inventory viewer when the player's inventory is open"
	)
	default boolean hideWhenInvOpen()
	{
		return false;
	}

    @ConfigItem(
            keyName = "viewerMode",
            name = "Mode",
            description = "The mode to display the inventory viewer with"
    )
    default InventoryViewerMode viewerMode()
    {
        return InventoryViewerMode.FULL;
    }

    @ConfigItem(
            keyName = "showFreeSlots",
            name = "Show Free Slots",
            description = "Whether to show a label with the free slots in the inventory"
    )
    default boolean showFreeSlots()
    {
        return false;
    }
}
