package net.runelite.rs.api;

import net.runelite.api.ClanMember;
import net.runelite.api.ClanMemberManager;
import net.runelite.mapping.Import;

public interface RSClanChat extends RSUserList<ClanMember>, ClanMemberManager
{
	@Import("owner")
	String getClanOwner();

	@Import("name")
	String getClanChatName();
}
