package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSFriendSystem
{
	@Import("friendsList")
	RSFriendsList getFriendContainer();

	@Import("ignoreList")
	RSIgnoreList getIgnoreContainer();

	@Import("isFriended")
	boolean isFriended(RSUsername var1, boolean var2);

	@Import("isIgnored")
	boolean isIgnored(RSUsername var1);

	@Import("addFriend")
	void addFriend(String username);

	@Import("removeFriend")
	void removeFriend(String username);
}
