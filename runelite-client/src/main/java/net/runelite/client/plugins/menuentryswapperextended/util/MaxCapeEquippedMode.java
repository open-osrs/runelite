package net.runelite.client.plugins.menuentryswapperextended.util;

public enum MaxCapeEquippedMode
{
	OFF("None"),
	TELE_TO_POH("Tele to POH"),
	CRAFTING_GUILD("Crafting Guild"),
	FISHING_TELEPORTS("Fishing Tele"),
	WARRIORS_GUILD("Warriors' Guild");
/**
 *  These options exist but don't work as they are considered
 *  "low-priority entries" and will always be pushed down in the menu
 *
 *	POH_PORTRALS("POH Portals"),
 *	OTHER_TELEPORTS("Other Teleports"),
 *	SPELLBOOK("Spellbook"),
 *	FEATURES("Features");
 */

	private final String name;

	MaxCapeEquippedMode(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
