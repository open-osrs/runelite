package net.runelite.api.events;

import lombok.Value;

/**
 * An event where a request to add a friend is sent to the server.
 */
@Value
public class FriendAdded
{
	/**
	 * The name of the added friend.
	 */
	String name;
}
