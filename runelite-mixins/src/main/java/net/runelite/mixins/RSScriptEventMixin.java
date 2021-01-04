package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSScriptEvent;

@Mixin(RSScriptEvent.class)
public abstract class RSScriptEventMixin implements RSScriptEvent
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void run()
	{
		client.runScriptEvent(this);
	}
}
