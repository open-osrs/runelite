/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
 * Copyright (c) 2018, Damen <https://github.com/basicDamen>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *	list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *	this list of conditions and the following disclaimer in the documentation
 *	and/or other materials provided with the distribution.
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

package net.runelite.client.plugins.grotesqueguardians;

import com.google.inject.Provides;
import javax.annotation.Nullable;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.grotesqueguardians.entity.Dawn;
import net.runelite.client.plugins.grotesqueguardians.entity.Dusk;
import net.runelite.client.plugins.grotesqueguardians.overlay.PrayerOverlay;
import net.runelite.client.plugins.grotesqueguardians.overlay.SceneOverlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

@Slf4j
@Extension
@PluginDescriptor(
	name = "Grotesque Guardians",
	enabledByDefault = false,
	description = "A plugin for Grotesque Guardians boss.",
	tags = {"grotesque", "guardians", "gargoyles"}
)
public class GrotesqueGuardiansPlugin extends Plugin
{
	private static final int GROTESQUE_GUARDIANS_LIGHTNING_START = 1416;
	private static final int GROTESQUE_GUARDIANS_LIGHTNING_END = 1431;
	private static final int GROTESQUE_GUARDIANS_FALLING_ROCKS = 1436;
	private static final int GROTESQUE_GUARDIANS_STONE_ORB = 160;

	private static final String CONFIG_GROUP = "grotesqueguardians";

	private static final String DUSK = "Dusk";
	private static final String DAWN = "Dawn";

	private static final int REGION_ID = 6727;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SceneOverlay sceneOverlay;

	@Inject
	private PrayerOverlay prayerOverlay;

	@Getter
	@Nullable
	private Dusk dusk;

	@Getter
	@Nullable
	private Dawn dawn;

	@Getter
	private boolean onRoof;

	@Getter
	private long lastTickTime;

	@Setter
	@Getter
	private boolean flashOnDanger;

	@Provides
	GrotesqueGuardiansConfig provideConfig(final ConfigManager configManager)
	{
		return configManager.getConfig(GrotesqueGuardiansConfig.class);
	}

	@Override
	protected void startUp()
	{
		if (client.getGameState() != GameState.LOGGED_IN || !isInRegion())
		{
			return;
		}

		init();
	}

	private void init()
	{
		onRoof = true;

		for (final NPC npc : client.getNpcs())
		{
			addNpc(npc);
		}

		overlayManager.add(sceneOverlay);
		overlayManager.add(prayerOverlay);
	}

	@Override
	protected void shutDown()
	{
		onRoof = false;
		flashOnDanger = false;

		dusk = null;
		dawn = null;

		overlayManager.remove(sceneOverlay);
		overlayManager.remove(prayerOverlay);
	}

	@Subscribe
	private void onGameStateChanged(final GameStateChanged event)
	{
		final GameState gameState = event.getGameState();

		switch (gameState)
		{
			case LOGGED_IN:
				if (isInRegion())
				{
					if (!onRoof)
					{
						init();
					}
				}
				else
				{
					if (onRoof)
					{
						shutDown();
					}
				}
				break;
			case HOPPING:
			case LOGIN_SCREEN:
				if (onRoof)
				{
					shutDown();
				}
				break;
			default:
				break;
		}
	}

	@Subscribe
	private void onGameTick(final GameTick event)
	{
		lastTickTime = System.currentTimeMillis();

		if (dusk != null)
		{
			dusk.updateTicksUntilNextAttack();
		}
	}

	@Subscribe
	private void onNpcSpawned(final NpcSpawned event)
	{
		addNpc(event.getNpc());
	}

	@Subscribe
	private void onNpcDespawned(final NpcDespawned event)
	{
		removeNpc(event.getNpc());
	}

	@Subscribe
	private void onAnimationChanged(final AnimationChanged event)
	{
		final Actor actor = event.getActor();

		if (dusk == null || actor != dusk.getNpc() || !dusk.isLastPhase())
		{
			return;
		}

		dusk.updateLastAnimation(actor.getAnimation());
	}

	@Subscribe
	private void onGraphicsObjectCreated(final GraphicsObjectCreated event)
	{
		if (flashOnDanger)
		{
			return;
		}

		final GraphicsObject graphicsObject = event.getGraphicsObject();

		if (!isValidGraphicsObject(graphicsObject))
		{
			return;
		}

		final Player player = client.getLocalPlayer();

		if (player == null)
		{
			return;
		}

		final LocalPoint localPointPlayer = player.getLocalLocation();
		final LocalPoint localPointGraphicsObject = graphicsObject.getLocation();

		if (localPointGraphicsObject.distanceTo(localPointPlayer) <= 1)
		{
			flashOnDanger = true;
		}
	}

	private void addNpc(final NPC npc)
	{
		final String name = npc.getName();

		if (name == null)
		{
			return;
		}

		if (name.equals(DUSK))
		{
			dusk = new Dusk(npc);
		}
		else if (name.equals(DAWN))
		{
			dawn = new Dawn(npc);
		}
	}

	private void removeNpc(final NPC npc)
	{
		final String name = npc.getName();

		if (name == null)
		{
			return;
		}

		if (name.equals(DUSK))
		{
			dusk = null;
		}
		else if (name.equals(DAWN))
		{
			dawn = null;
		}
	}

	public static boolean isValidGraphicsObject(final GraphicsObject graphicsObject)
	{
		final int id = graphicsObject.getId();

		return (id >= GROTESQUE_GUARDIANS_LIGHTNING_START && id <= GROTESQUE_GUARDIANS_LIGHTNING_END)
			|| id == GROTESQUE_GUARDIANS_STONE_ORB
			|| id == GROTESQUE_GUARDIANS_FALLING_ROCKS;
	}

	private boolean isInRegion()
	{
		return client.isInInstancedRegion() && client.getMapRegions()[0] == REGION_ID;
	}
}
