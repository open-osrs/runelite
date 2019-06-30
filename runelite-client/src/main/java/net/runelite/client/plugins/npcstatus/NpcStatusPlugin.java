/*
 * Copyright (c) 2019, GeChallengeM <https://github.com/GeChallengeM>
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
package net.runelite.client.plugins.npcstatus;

import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lombok.AccessLevel;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GraphicID;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.api.events.NpcSpawned;
import javax.inject.Inject;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
@PluginDescriptor(
	name = "NPC Status Timer",
	description = "Adds a timer on NPC's for their attacks and flinching.",
	tags = {"flinch", "npc"},
	enabledByDefault = false
)
public class NpcStatusPlugin extends Plugin
{
	@Inject
	private NpcStatusConfig config;

	@Provides
    NpcStatusConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NpcStatusConfig.class);
	}

	@Getter(AccessLevel.PACKAGE)
	private Instant lastTickUpdate;

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ItemManager itemManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private NpcStatusOverlay npcStatusOverlay;

	private WorldArea lastPlayerLocation;

	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> timedNPCs = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private final Map<Integer, MemorizedNPC> memorizedNPC = new HashMap<>();

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(npcStatusOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(npcStatusOverlay);
		timedNPCs.clear();
		memorizedNPC.clear();
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		final NPC npc = npcSpawned.getNpc();
		final String npcName = npc.getName();

		if (npcName == null || !Arrays.asList(npc.getDefinition().getActions()).contains("Attack"))
		{
			return;
		}
		memorizeNPC(npc);
		timedNPCs.add(npc);
		MemorizedNPC mn = memorizedNPC.get(npc.getIndex());
		mn.setLastnpcarea(npc.getWorldArea());
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		final NPC npc = npcDespawned.getNpc();
		timedNPCs.remove(npc);
		memorizedNPC.remove(npc.getIndex());
	}
	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGIN_SCREEN ||
				event.getGameState() == GameState.HOPPING)
		{
			timedNPCs.clear();
			memorizedNPC.clear();
		}
	}
	private void memorizeNPC(NPC npc)
	{
		final int npcIndex = npc.getIndex();
		memorizedNPC.putIfAbsent(npcIndex, new MemorizedNPC(npc));
	}

	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
		if (event.getActor().getInteracting() != client.getLocalPlayer())
		{
			return;
		}
		final int ATTACK_SPEED = config.getAttackDelay();
		final Hitsplat hitsplat = event.getHitsplat();
		if (hitsplat.getHitsplatType() == Hitsplat.HitsplatType.DAMAGE
				|| hitsplat.getHitsplatType() == Hitsplat.HitsplatType.BLOCK)
		{
			if (event.getActor() instanceof NPC)
			{
				final MemorizedNPC mn = memorizedNPC.get(((NPC) event.getActor()).getIndex());
				if (mn != null)
				{
					if (mn.getStatus().equals("OutOfCombat") || (mn.getStatus().equals("InCombat") && mn.getCombatTimerEnd() - client.getTickCount() < 1) || mn.getLastinteracted() == null) {
						mn.setStatus("Flinching");
						mn.setCombatTimerEnd(-1);
						mn.setFlinchTimerEnd(client.getTickCount() + ATTACK_SPEED / 2 + 1);
					}
				}
			}
		}
	}

	private void checkStatus()
	{
		for (NPC npc:timedNPCs)
		{
			final MemorizedNPC mn = getMemorizedNPC().get(npc.getIndex());
			final int ATTACK_SPEED = config.getAttackDelay();
			final double CombatTime = mn.getCombatTimerEnd() - client.getTickCount();
			final double FlinchTime = mn.getFlinchTimerEnd() - client.getTickCount();
			if (npc.getWorldArea()==null)
			{
				continue;
			}
			if (npc.getInteracting()==client.getLocalPlayer())
			{
				if (mn.getLastspotanimation() == GraphicID.SPLASH && npc.getSpotAnimation() == GraphicID.SPLASH) //For splash flinching
				{
					mn.setLastspotanimation(-1);
					if ((mn.getStatus().equals("OutOfCombat") && mn.getOutofcombatlasttick()) || mn.getLastinteracted()==null)
					{
						mn.setOutofcombatlasttick(mn.getStatus().equals("OutOfCombat"));
						mn.setStatus("Flinching");
						mn.setCombatTimerEnd(-1);
						mn.setFlinchTimerEnd(client.getTickCount() + ATTACK_SPEED / 2 + 1);
						mn.setLastnpcarea(npc.getWorldArea());
						mn.setLastinteracted(npc.getInteracting());
						continue;
					}
				}
				//Checks: will the NPC attack this tick?
				if (((npc.getWorldArea().canMelee(client, lastPlayerLocation) && config.getRange()==1) //Separate mechanics for meleerange-only NPC's because they have extra collisiondata checks (fences etc.) and can't attack diagonally
							|| (lastPlayerLocation.hasLineOfSightTo(client,npc.getWorldArea()) && npc.getWorldArea().distanceTo(lastPlayerLocation)<=config.getRange() && config.getRange()>1))
						&& ((!mn.getStatus().equals("Flinching") && CombatTime < 9) ||(mn.getStatus().equals("Flinching") && FlinchTime < 2))
						&& npc.getAnimation() != -1 //Failsafe, attacking NPC's always have an animation.
						&& !(mn.getLastnpcarea().distanceTo(lastPlayerLocation)==0 && mn.getLastnpcarea() != npc.getWorldArea())) //Weird mechanic: NPC's can't attack on the tick they do a random move
				{
					mn.setCombatTimerEnd(client.getTickCount() + ATTACK_SPEED + 8);
					mn.setOutofcombatlasttick(mn.getStatus().equals("OutOfCombat"));
					mn.setStatus("InCombatDelay");
					mn.setLastnpcarea(npc.getWorldArea());
					mn.setLastspotanimation(npc.getSpotAnimation());
					mn.setLastinteracted(npc.getInteracting());
					continue;
				}
			}
			mn.setOutofcombatlasttick(mn.getStatus().equals("OutOfCombat"));
			switch (mn.getStatus())
			{
				case "InCombat":
					if (CombatTime < 2)
					{
						mn.setStatus("OutOfCombat");
					}
					break;
				case "InCombatDelay":
					if (CombatTime < 9)
					{
						mn.setStatus("InCombat");
					}
					break;
				case "Flinching":
					if (FlinchTime < 2)
					{
						mn.setStatus("InCombat");
						mn.setCombatTimerEnd(client.getTickCount() + 8);
					}
			}
			mn.setLastnpcarea(npc.getWorldArea());
			mn.setLastspotanimation(npc.getSpotAnimation());
			mn.setLastinteracted(npc.getInteracting());
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		lastTickUpdate = Instant.now();
		checkStatus();
		lastPlayerLocation = client.getLocalPlayer().getWorldArea();
	}
}
