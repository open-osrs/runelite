package net.runelite.rs.api;

import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.mapping.Import;

public interface RSFriendsChat extends RSUserList<FriendsChatMember>, FriendsChatManager
{
	@Import("owner")
	String getOwner();

	@Import("name")
	String getName();
}
