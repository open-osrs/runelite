package net.runelite.client.plugins.lootassist;

import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.AnimationID;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Loot Assist Plugin",
	description = "Creates a tile overlay with a timer that counts down to when the loot will appear to you",
	tags = {"pklite", "loot", "looting", "loot assist", "assist", "loot assist"},
	type = PluginType.PVP,
	enabledByDefault = false
)
@Singleton
public class LootAssistPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private LootAssistOverlay lootAssistOverlay;

	static final ConcurrentHashMap<WorldPoint, LootPile> lootPiles = new ConcurrentHashMap<>();

	@Override
	protected void startUp()
	{

		overlayManager.add(lootAssistOverlay);
	}

	@Override
	protected void shutDown()
	{
		lootPiles.clear();
		overlayManager.remove(lootAssistOverlay);
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		lootPiles.clear();
	}

	@Subscribe
	private void onAnimationChanged(AnimationChanged event)
	{
		final Actor actor = event.getActor();
		if (actor.getAnimation() == AnimationID.DEATH && actor instanceof Player)
		{
			LootPile pile = new LootPile(actor.getWorldLocation(), actor.getName());
			lootPiles.put(pile.getLocation(), pile);
		}
	}


}
