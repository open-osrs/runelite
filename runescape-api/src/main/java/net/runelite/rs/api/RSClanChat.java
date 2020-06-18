package net.runelite.rs.api;

import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.mapping.Import;

public interface RSClanChat extends RSUserList<FriendsChatMember>, FriendsChatManager
{
	@Import("owner")
	String getClanOwner();

	@Import("name")
	String getClanChatName();
}
