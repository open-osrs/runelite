package net.runelite.mixins;

import net.runelite.api.FriendsChatRank;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSClanMate;

@Mixin(RSClanMate.class)
public abstract class RSClanMateMixin implements RSClanMate
{
	@Override
	@Inject
	public FriendsChatRank getRank()
	{
		return FriendsChatRank.valueOf(getRSRank());
	}
}
