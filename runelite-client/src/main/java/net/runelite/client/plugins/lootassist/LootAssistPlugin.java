package net.runelite.client.plugins.lootassist;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.AnimationID;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "LootAssistPlugin",
	description = "",
	tags = {}
)
public class LootAssistPlugin extends Plugin
{

	@Inject
	private Client client;

	@Inject
	OverlayManager overlayManager;

	@Inject
	LootAssistOverlay lootAssistOverlay;


	public static CopyOnWriteArrayList<LootPile> lootPiles = new CopyOnWriteArrayList<>();

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(lootAssistOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(lootAssistOverlay);
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		final Actor actor = event.getActor();
		if (actor.getAnimation() == AnimationID.DEATH && actor instanceof Player)
		{
			lootPiles.add(new LootPile(actor.getLocalLocation(), actor.getName()));
		}
	}


}
