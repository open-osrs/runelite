package net.runelite.rs.api;

import net.runelite.api.MenuEntry;
import net.runelite.api.clan.ClanRank;

public interface RSRuneLiteClanMember extends MenuEntry
{
	ClanRank getRank();

	String getName();
}
