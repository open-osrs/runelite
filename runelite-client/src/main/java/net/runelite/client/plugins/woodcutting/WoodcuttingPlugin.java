/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.woodcutting;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.ItemID;
import net.runelite.api.MenuOpcode;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.xptracker.XpTrackerPlugin;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayMenuEntry;

@PluginDescriptor(
	name = "Woodcutting",
	description = "Show woodcutting statistics and/or bird nest notifications",
	tags = {"birds", "nest", "notifications", "overlay", "skilling", "wc"},
	enabledByDefault = false,
	type = PluginType.SKILLING
)
@PluginDependency(XpTrackerPlugin.class)
@Slf4j
public class WoodcuttingPlugin extends Plugin
{
	private static final Pattern WOOD_CUT_PATTERN = Pattern.compile("You get (?:some|an)[\\w ]+(?:logs?|mushrooms)\\.");

	@Getter
	private final Set<GameObject> treeObjects = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final List<TreeRespawn> respawns = new ArrayList<>();

	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private WoodcuttingOverlay overlay;

	@Inject
	private WoodcuttingTreesOverlay treesOverlay;

	@Inject
	private WoodcuttingConfig config;

	@Inject
	private ItemManager itemManager;

	@Getter
	private WoodcuttingSession session;

	@Getter
	private Axe axe;

	private boolean recentlyLoggedIn;
	private int treeTypeID;
	@Getter(AccessLevel.PACKAGE)
	private int gpEarned;
	private int currentPlane;

	@Provides
	WoodcuttingConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WoodcuttingConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		overlayManager.add(treesOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		overlayManager.remove(treesOverlay);
		respawns.clear();
		treeObjects.clear();
		session = null;
		axe = null;
	}

	@Subscribe
	private void onOverlayMenuClicked(OverlayMenuClicked overlayMenuClicked)
	{
		OverlayMenuEntry overlayMenuEntry = overlayMenuClicked.getEntry();
		if (overlayMenuEntry.getMenuOpcode() == MenuOpcode.RUNELITE_OVERLAY
			&& overlayMenuClicked.getEntry().getOption().equals(WoodcuttingOverlay.WOODCUTTING_RESET)
			&& overlayMenuClicked.getOverlay() == overlay)
		{
			session = null;
		}
	}

	@Subscribe
	private void onGameTick(GameTick gameTick)
	{
		recentlyLoggedIn = false;
		currentPlane = client.getPlane();

		respawns.removeIf(TreeRespawn::isExpired);

		if (session == null || session.getLastLogCut() == null)
		{
			return;
		}

		Duration statTimeout = Duration.ofMinutes(config.statTimeout());
		Duration sinceCut = Duration.between(session.getLastLogCut(), Instant.now());

		if (sinceCut.compareTo(statTimeout) >= 0)
		{
			session = null;
			axe = null;
		}
	}

	@Subscribe
	void onChatMessage(ChatMessage event)
	{
		if (event.getType() == ChatMessageType.SPAM || event.getType() == ChatMessageType.GAMEMESSAGE)
		{
			if (WOOD_CUT_PATTERN.matcher(event.getMessage()).matches())
			{
				if (session == null)
				{
					session = new WoodcuttingSession();
					gpEarned = 0;
				}

				session.setLastLogCut();

				typeOfLogCut(event.getMessage());
				gpEarned += itemManager.getItemPrice(treeTypeID);
			}

			if (event.getMessage().contains("A bird's nest falls out of the tree") && config.showNestNotification())
			{
				notifier.notify("A bird nest has spawned!");
			}
		}
	}

	@Subscribe
	private void onGameObjectSpawned(final GameObjectSpawned event)
	{
		GameObject gameObject = event.getGameObject();
		Tree tree = Tree.findTree(gameObject.getId());

		if (tree == Tree.REDWOOD)
		{
			treeObjects.add(gameObject);
		}
	}

	@Subscribe
	private void onGameObjectDespawned(final GameObjectDespawned event)
	{
		final GameObject object = event.getGameObject();

		Tree tree = Tree.findTree(object.getId());
		if (tree != null)
		{
			if (tree.getRespawnTime() != null && !recentlyLoggedIn && currentPlane == object.getPlane())
			{
				Point max = object.getSceneMaxLocation();
				Point min = object.getSceneMinLocation();
				int lenX = max.getX() - min.getX();
				int lenY = max.getY() - min.getY();
				log.debug("Adding respawn timer for {} tree at {}", tree, object.getLocalLocation());

				final int region = client.getLocalPlayer().getWorldLocation().getRegionID();
				TreeRespawn treeRespawn = new TreeRespawn(tree, lenX, lenY, WorldPoint.fromScene(client, min.getX(), min.getY(), client.getPlane()), Instant.now(), (int) tree.getRespawnTime(region).toMillis());
				respawns.add(treeRespawn);
			}

			if (tree == Tree.REDWOOD)
			{
				treeObjects.remove(event.getGameObject());
			}
		}
	}

	@Subscribe
	private void onGameObjectChanged(final GameObjectChanged event)
	{
		treeObjects.remove(event.getGameObject());
	}

	@Subscribe
	private void onGameStateChanged(final GameStateChanged event)
	{
		switch (event.getGameState())
		{
			case HOPPING:
				respawns.clear();
			case LOADING:
				treeObjects.clear();
				break;
			case LOGGED_IN:
				// After login trees that are depleted will be changed,
				// wait for the next game tick before watching for
				// trees to despawn
				recentlyLoggedIn = true;
				break;
		}
	}

	@Subscribe
	private void onAnimationChanged(final AnimationChanged event)
	{
		Player local = client.getLocalPlayer();

		if (event.getActor() != local)
		{
			return;
		}

		int animId = local.getAnimation();
		Axe axe = Axe.findAxeByAnimId(animId);
		if (axe != null)
		{
			this.axe = axe;
		}
	}

	private void typeOfLogCut(String message)
	{
		if (message.contains("mushrooms."))
		{
			return; //TO DO Add valuation for scullicep mushroom cutting.
		}
		else if (message.contains("oak"))
		{
			treeTypeID = ItemID.OAK_LOGS;
		}
		else if (message.contains("willow"))
		{
			treeTypeID = ItemID.WILLOW_LOGS;
		}
		else if (message.contains("yew"))
		{
			treeTypeID = ItemID.YEW_LOGS;
		}
		else if (message.contains("redwood"))
		{
			treeTypeID = ItemID.REDWOOD_LOGS;
		}
		else if (message.contains("magic"))
		{
			treeTypeID = ItemID.MAGIC_LOGS;
		}
		else if (message.contains("teak"))
		{
			treeTypeID = ItemID.TEAK_LOGS;
		}
		else if (message.contains("mahogany"))
		{
			treeTypeID = ItemID.MAHOGANY_LOGS;
		}
		else if (message.contains("maple"))
		{
			treeTypeID = ItemID.MAPLE_LOGS;
		}
		else
		{
			treeTypeID = ItemID.LOGS;
		}
	}
}