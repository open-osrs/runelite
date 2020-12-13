package net.runelite.mixins;

import net.runelite.api.events.FocusChanged;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSKeyHandler;

@Mixin(RSKeyHandler.class)
public abstract class RSKeyHandlerMixin implements RSKeyHandler
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Copy("keyPressed")
	@Replace("keyPressed")
	public final synchronized void keyPressed(KeyEvent keyEvent)
	{
		client.getCallbacks().keyPressed(keyEvent);
		if (!keyEvent.isConsumed())
		{
			keyPressed(keyEvent);
		}
	}

	@Override
	@Copy("keyReleased")
	@Replace("keyReleased")
	public final synchronized void keyReleased(KeyEvent keyEvent)
	{
		client.getCallbacks().keyReleased(keyEvent);
		if (!keyEvent.isConsumed())
		{
			keyReleased(keyEvent);
		}
	}

	@Override
	@Copy("keyTyped")
	@Replace("keyTyped")
	public final void keyTyped(KeyEvent keyEvent)
	{
		client.getCallbacks().keyTyped(keyEvent);
		if (!keyEvent.isConsumed())
		{
			keyTyped(keyEvent);
		}
	}

	@Inject
	@MethodHook("focusLost")
	public void onFocusLost(FocusEvent focusEvent)
	{
		final FocusChanged focusChanged = new FocusChanged();
		focusChanged.setFocused(false);
		client.getCallbacks().post(focusChanged);
	}
}
