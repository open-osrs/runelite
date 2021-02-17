package net.runelite.mixins;

import net.runelite.api.events.FriendAdded;
import net.runelite.api.events.RemovedFriend;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFriendSystem;

@Mixin(RSFriendSystem.class)
public abstract class RSFriendSystemMixin implements RSFriendSystem
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook("removeFriend")
	@Inject
	public void rl$removeFriend(String friendName)
	{
		RemovedFriend removedFriend = new RemovedFriend(client.getFriendManager().getFriendContainer().findByName(friendName));
		client.getCallbacks().post(removedFriend);
	}

	@MethodHook("addFriend")
	@Inject
	public void rl$addFriend(String friendName)
	{
		FriendAdded friendAdded = new FriendAdded(friendName);
		client.getCallbacks().post(friendAdded);
	}
}
