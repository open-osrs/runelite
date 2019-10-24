package net.runelite.client.plugins.spooktober;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import static net.runelite.api.NpcID.GARDENER_GHOST;
import static net.runelite.api.NpcID.GHOST_3516;
import static net.runelite.api.NpcID.GHOST_CAPTAIN;
import static net.runelite.api.NpcID.GHOST_INNKEEPER;
import static net.runelite.api.NpcID.GHOST_VILLAGER;
import static net.runelite.api.NpcID.RESTLESS_GHOST;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

@PluginDescriptor(
	name = "<html><font color=eb6123>Spooktober</font></html>",
	description = "S̡t̡a͏r҉e͘ įnt͡o̸ th̴e̷ aby͜śs,͢ a̢nd ҉the ́aby̶ss w͠il͟l͡ st̵ar̴e͢ ́back̵.",
	type = PluginType.IMPORTANT
)
public class SpookyPlugin extends Plugin
{
	private static final List<Integer> GHOSTS = ImmutableList.of(
		GHOST_VILLAGER, GHOST_INNKEEPER, GHOST_CAPTAIN,
		GHOST_3516, RESTLESS_GHOST, GARDENER_GHOST
	);
	@Inject
	private Client client;
	@Inject
	private EventBus eventBus;

	private final Map<Player, Integer> playerSeed = new HashMap<>();

	@Override
	public void startUp()
	{
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(PlayerDespawned.class, this, this::onPlayerDespawned);
		eventBus.subscribe(PlayerSpawned.class, this, this::onPlayerSpawned);

		if (client.getGameState() == GameState.LOGGED_IN)
		{
			for (Player player : client.getPlayers())
			{
				final int randomSeed = (int) (Math.random() * GHOSTS.size());
				playerSeed.put(player, randomSeed);
				updateAppearance(player, randomSeed);
			}
		}
	}

	@Override
	public void shutDown()
	{
		eventBus.unregister(this);
		for (Player player : client.getPlayers())
		{
			if (player == null || player.getPlayerAppearance() == null)
			{
				continue;
			}

			player.getPlayerAppearance().setTransformedNpcId(-1);
			player.setIdlePoseAnimation(-1);
			player.setPoseAnimation(-1);
		}
	}

	private void onGameTick(GameTick event)
	{
		for (Map.Entry<Player, Integer> entry : playerSeed.entrySet())
		{
			final Player player = entry.getKey();
			updateAppearance(player, entry.getValue());
		}
	}

	private void onPlayerSpawned(PlayerSpawned event)
	{
		final Player player = event.getPlayer();
		final int randomSeed = (int) (Math.random() * GHOSTS.size());
		playerSeed.put(player, randomSeed);
		updateAppearance(player, randomSeed);
	}

	private void onPlayerDespawned(PlayerDespawned event)
	{
		playerSeed.remove(event.getPlayer());
	}

	private void updateAppearance(Player player, int seed)
	{
		if (player.getPlayerAppearance() == null)
		{
			return;
		}

		player.getPlayerAppearance().setTransformedNpcId(GHOSTS.get(seed));
		player.setIdlePoseAnimation(-1);
		player.setPoseAnimation(-1);
	}
}
