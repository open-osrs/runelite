package net.runelite.mixins;

import net.runelite.api.events.NameableNameChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSUser;
import net.runelite.rs.api.RSUsername;

@Mixin(RSUser.class)
public abstract class RSUserMixin implements RSUser
{
	@Shadow("client")
	private static RSClient client;

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

	@FieldHook("previousUsername")
	@Inject
	public void onPrevNameChanged(int idx)
	{
		client.getCallbacks().post(new NameableNameChanged(this));
	}
}
