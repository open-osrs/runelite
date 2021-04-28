/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
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

package net.runelite.client.plugins.kalphitequeen;

import com.google.inject.Provides;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Varbits;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Kalphite Queen",
	enabledByDefault = false,
	description = "Kalphite Queen plugin.",
	tags = {"kalphite", "queen", "kq"}
)
@Singleton
public class KQPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private KQSceneOverlay sceneOverlay;

	@Getter
	private KQNpc kalphiteQueen;

	@Getter
	@Setter
	private boolean flashVeng;

	private int lastVengActive;
	private int lastVengCooldown;

	@Provides
	KQConfig getConfig(final ConfigManager configManager)
	{
		return configManager.getConfig(KQConfig.class);
	}

	@Override
	protected void startUp()
	{
		overlayManager.add(sceneOverlay);

		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		for (final NPC npc : client.getNpcs())
		{
			addNpc(npc);
		}
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(sceneOverlay);

		flashVeng = false;
		lastVengActive = 0;
		lastVengCooldown = 0;

		kalphiteQueen = null;
	}

	@Subscribe
	private void onGameTick(final GameTick event)
	{
		if (kalphiteQueen != null)
		{
			kalphiteQueen.updateTicksUntilNextAnimation();
		}
	}

	@Subscribe
	private void onVarbitChanged(final VarbitChanged event)
	{
		final int vengCoolDown = client.getVar(Varbits.VENGEANCE_COOLDOWN);
		final int vengActive = client.getVar(Varbits.VENGEANCE_ACTIVE);

		if (lastVengCooldown != vengCoolDown)
		{
			if (vengCoolDown == 0 && vengActive == 0)
			{
				flashVeng = true;
			}

			lastVengCooldown = vengCoolDown;
		}

		if (lastVengActive != vengActive)
		{
			if (vengActive == 0 && vengCoolDown == 0)
			{
				flashVeng = true;
			}

			lastVengActive = vengActive;
		}
	}

	@Subscribe
	private void onNpcSpawned(final NpcSpawned event)
	{
		final NPC npc = event.getNpc();

		addNpc(npc);
	}

	@Subscribe
	private void onNpcDespawned(final NpcDespawned event)
	{
		final NPC npc = event.getNpc();

		removeNpc(npc);
	}

	private void addNpc(final NPC npc)
	{
		if (KQNpc.NPC_IDS.contains(npc.getId()))
		{
			kalphiteQueen = new KQNpc(npc);
		}
	}

	private void removeNpc(final NPC npc)
	{
		if (KQNpc.NPC_IDS.contains(npc.getId()))
		{
			kalphiteQueen = null;
		}
	}
}
