/*
 * Copyright (c) 2018, Joris K <kjorisje@gmail.com>
 * Copyright (c) 2018, Lasse <cronick@zytex.dk>
 * Copyright (c) 2019, ermalsh <github.com/ermalsh>
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
package net.runelite.client.plugins.thieving;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.xptracker.XpTrackerPlugin;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Thieving",
	description = "Show thieving overlay",
	tags = {"overlay", "skilling", "thieving", "pickpocketing"},
	type = PluginType.SKILLING,
	enabledByDefault = false
)
@Singleton
@PluginDependency(XpTrackerPlugin.class)
public class ThievingPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ThievingConfig config;

	@Inject
	private ThievingOverlay overlay;

	@Inject
	private ChestOverlay chestOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Getter(AccessLevel.PACKAGE)
	private ThievingSession session;

	@Getter(AccessLevel.PACKAGE)
	private final List<ChestRespawn> respawns = new ArrayList<>();

	private int statTimeout;
	private boolean recentlyLoggedIn = false;

	@Provides
	ThievingConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ThievingConfig.class);
	}

	@Override
	protected void startUp()
	{

		this.statTimeout = config.statTimeout();

		chestOverlay.setPieFillColor(config.respawnColor());
		chestOverlay.setPieBorderColor(config.respawnColor().darker());
		chestOverlay.setRespawnPieInverted(config.respawnPieInverted());
		chestOverlay.setRespawnPieDiameter(config.respawnPieDiameter());

		session = null;
		overlayManager.add(overlay);
		overlayManager.add(chestOverlay);
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(chestOverlay);
		session = null;
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			recentlyLoggedIn = true;
		}
	}

	@Subscribe
	private void onGameTick(GameTick gameTick)
	{
		recentlyLoggedIn = false;

		if (session == null || this.statTimeout == 0)
		{
			return;
		}

		Duration statTimeout = Duration.ofMinutes(this.statTimeout);
		Duration sinceCut = Duration.between(session.getLastTheivingAction(), Instant.now());

		if (sinceCut.compareTo(statTimeout) >= 0)
		{
			session = null;
		}
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.SPAM)
		{
			return;
		}

		final String message = event.getMessage();

		if (message.startsWith("You pickpocket") || message.startsWith("You pick-pocket") || message.startsWith("You steal") || message.startsWith("You successfully pick-pocket") || message.startsWith("You successfully pick") || message.startsWith("You successfully steal"))
		{
			if (session == null)
			{
				session = new ThievingSession();
			}

			session.updateLastThevingAction();
			session.hasSucceeded();
		}
		else if (message.startsWith("You fail to pick") || message.startsWith("You fail to steal"))
		{
			if (session == null)
			{
				session = new ThievingSession();
			}

			session.updateLastThevingAction();
			session.hasFailed();
		}
	}

	@Subscribe
	private void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (client.getGameState() != GameState.LOGGED_IN || recentlyLoggedIn)
		{
			return;
		}

		final GameObject object = event.getGameObject();

		Chest chest = Chest.of(object.getId());
		if (chest != null)
		{
			ChestRespawn chestRespawn = new ChestRespawn(chest, object.getWorldLocation(), Instant.now().plus(chest.getRespawnTime()), client.getWorld());
			respawns.add(chestRespawn);
		}
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!"thieving".equals(event.getGroup()))
		{
			return;
		}

		this.statTimeout = config.statTimeout();
		chestOverlay.setPieFillColor(config.respawnColor());
		chestOverlay.setPieBorderColor(config.respawnColor().darker());
		chestOverlay.setRespawnPieInverted(config.respawnPieInverted());
		chestOverlay.setRespawnPieDiameter(config.respawnPieDiameter());
	}
}

