package net.runelite.client.plugins.hidehunder;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;


@PluginDescriptor(
	name = "Hide Under",
	description = "Hide local player when under targeted players",
	tags = {"hide", "local", "player", "under"},
	type = PluginType.PVP
)
@Slf4j
public class HideUnder extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private EventBus eventBus;
	private Set<PlayerContainer> playerContainer = new HashSet<>();

	@Override
	protected void startUp()
	{
		addSubscriptions();
		playerContainer.clear();
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(PlayerSpawned.class, this, this::onPlayerSpawned);
		eventBus.subscribe(PlayerDespawned.class, this, this::onPlayerDespawned);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(InteractingChanged.class, this, this::onInteractingChanged);
		eventBus.subscribe(AnimationChanged.class, this, this::onAnimationChanged);
	}

	private void onInteractingChanged(InteractingChanged event)
	{
		if ((event.getSource() instanceof Player) && (event.getTarget() instanceof Player))
		{
			final Player source = (Player) event.getSource();
			final Player target = (Player) event.getTarget();

			if (source == client.getLocalPlayer())
			{
				for (PlayerContainer player : playerContainer)
				{
					if (player.getPlayer() == target)
					{
						player.setTimer(16);
						player.setTarget(true);
					}
				}
			}
			else if (target == client.getLocalPlayer())
			{
				for (PlayerContainer player : playerContainer)
				{
					if (player.getPlayer() == source)
					{
						player.setTimer(16);
						player.setTarget(true);
					}
				}
			}
		}
	}

	private void onAnimationChanged(AnimationChanged event)
	{
		final Actor actor = event.getActor();

		if (actor.getInteracting() != client.getLocalPlayer() || !(actor instanceof Player))
		{
			return;
		}

		if (actor.getAnimation() != -1 && actor.getInteracting() != null && actor.getInteracting() == client.getLocalPlayer())
		{
			for (PlayerContainer player : playerContainer)
			{
				if (player.getPlayer() == actor)
				{
					player.setTimer(16);
					player.setTarget(true);
				}
			}
		}
	}

	private void onPlayerSpawned(PlayerSpawned event)
	{
		final Player player = event.getPlayer();

		if (player == client.getLocalPlayer())
		{
			return;
		}

		playerContainer.add(new PlayerContainer(player));
	}

	private void onPlayerDespawned(PlayerDespawned event)
	{
		final Player player = event.getPlayer();
		playerContainer.removeIf(playa -> playa.getPlayer() == player);
	}

	private void onGameTick(GameTick event)
	{
		if (playerContainer.isEmpty())
		{
			return;
		}

		assert client.getLocalPlayer() != null;
		final WorldPoint lp = client.getLocalPlayer().getWorldLocation();

		client.setLocalPlayerHidden(false);

		for (PlayerContainer player : playerContainer)
		{
			if (player.getTimer() > 0)
			{
				player.setTimer(player.getTimer() - 1);
			}
			else
			{
				player.setTarget(false);
			}

			if (player.isTarget())
			{
				if (player.getPlayer().getWorldLocation().distanceTo(lp) == 0)
				{
					client.setLocalPlayerHidden(true);
				}
			}
		}
	}
}