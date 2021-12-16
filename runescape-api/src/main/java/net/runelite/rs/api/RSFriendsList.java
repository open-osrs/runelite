package net.runelite.rs.api;

import net.runelite.api.Deque;
import net.runelite.api.FriendContainer;
import net.runelite.api.PendingLogin;
import net.runelite.mapping.Import;

public interface RSFriendsList extends FriendContainer
{
	@Import("friendLoginUpdates")
	Deque<PendingLogin> getPendingLogins();
}
