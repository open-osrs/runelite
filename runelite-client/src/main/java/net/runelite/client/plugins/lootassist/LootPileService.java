package net.runelite.client.plugins.lootassist;

import java.util.function.Consumer;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LootPileService
{
	private final LootAssistPlugin plugin;

	@Inject
	private LootPileService(LootAssistPlugin plugin)
	{
		this.plugin = plugin;
	}

	public void forEachLootPile(Consumer<LootPile> consumer)
	{
		for (LootPile pile : LootAssistPlugin.lootPiles)
		{
			if (pile.getTimeAppearing() > System.currentTimeMillis() &&
				!LootAssistOverlay.current.containsKey(pile.getLocation()))
			{
				consumer.accept(pile);
			}
			else
			{
				LootAssistPlugin.lootPiles.remove(pile);
				LootAssistOverlay.current.remove(pile.getLocation());
			}
		}
	}
}
