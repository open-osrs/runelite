package net.runelite.mixins;

import net.runelite.api.FriendsChatMember;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.events.FriendsChatMemberLeft;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClanChat;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSUser;
import net.runelite.rs.api.RSUsername;

@Mixin(RSClanChat.class)
public abstract class RSClanChatMixin implements RSClanChat
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void rl$add(RSUsername name, RSUsername prevName)
	{
		FriendsChatMember member = findByName(name);
		if (member == null)
		{
			return;
		}

		FriendsChatMemberJoined event = new FriendsChatMemberJoined(member);
		client.getCallbacks().postDeferred(event);
	}

	@Inject
	@Override
	public void rl$remove(RSUser nameable)
	{
		FriendsChatMember member = findByName(nameable.getRsName());
		if (member == null)
		{
			return;
		}

		FriendsChatMemberLeft event = new FriendsChatMemberLeft(member);
		client.getCallbacks().postDeferred(event);
	}
}
