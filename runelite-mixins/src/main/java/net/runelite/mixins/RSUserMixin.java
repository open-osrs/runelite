package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSUser;
import net.runelite.rs.api.RSUsername;

@Mixin(RSUser.class)
public abstract class RSUserMixin implements RSUser
{
	@Override
	@Inject
	public String getName()
	{
		return getRsName().getName();
	}

	@Override
	@Inject
	public String getPrevName()
	{
		RSUsername prevName = getRsPrevName();
		return prevName == null ? null : prevName.getName();
	}
}
