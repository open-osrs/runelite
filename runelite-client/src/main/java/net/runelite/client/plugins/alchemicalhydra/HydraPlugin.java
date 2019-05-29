/*
 * Copyright (c) 2019, Lucas <https://github.com/lucwousin>
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
package net.runelite.client.plugins.alchemicalhydra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Projectile;
import net.runelite.api.ProjectileID;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Alchemical Hydra",
	description = "Show what to pray against hydra",
	tags = {"Hydra", "Lazy", "4 headed asshole"},
	type = PluginType.PVM
)
@Slf4j
public class HydraPlugin extends Plugin
{
	@Getter
	private Map<LocalPoint, Projectile> poisonProjectiles = new HashMap<>();

	@Getter
	private Hydra hydra;

	private boolean inHydraInstance;
	private int lastAttackTick;

	private static final int[] HYDRA_REGIONS = {
		5279, 5280,
		5535, 5536
	};

	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private HydraOverlay overlay;

	@Inject
	private HydraPoisonOverlay poisonOverlay;

	@Override
	protected void startUp()
	{
		inHydraInstance = checkArea();
		lastAttackTick = -1;
		poisonProjectiles.clear();
	}

	@Override
	protected void shutDown()
	{
		inHydraInstance = false;
		hydra = null;
		poisonProjectiles.clear();
		removeOverlays();
		lastAttackTick = -1;
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{
		if (!inHydraInstance)
		{
			return;
		}

		NPC hydraNpc = hydra.getNpc();

		for (NPC npc : client.getNpcs())
		{
			if (!HydraPhase.getIdSet().contains(npc.getId()))
			{
				continue;
			}

			HydraPhase phase = HydraPhase.getFromId(npc.getId());

			if (hydra.getPhase() != phase)
			{
				log.debug("Hydra phase changed!");
				changePhase(phase);
			}

			if (hydraNpc != npc)
			{
				log.debug("Hydra npc changed!");
				hydra.setNpc(npc);
			}

			return;
		}

		if (!poisonProjectiles.isEmpty())
		{
			Set<LocalPoint> exPoisonProjectiles = new HashSet<>();
			for (Map.Entry<LocalPoint, Projectile> entry : poisonProjectiles.entrySet())
			{
				if (entry.getValue().getEndCycle() < client.getGameCycle())
				{
					exPoisonProjectiles.add(entry.getKey());
				}
			}
			for (LocalPoint toRemove : exPoisonProjectiles)
			{
				poisonProjectiles.remove(toRemove);
			}
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged state)
	{
		if (state.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		inHydraInstance = checkArea();

		if (!inHydraInstance)
		{

			if (hydra != null)
			{
				removeOverlays();
				hydra = null;
			}
			return;
		}
		NPC hydraNpc = null;

		for (NPC npc : client.getNpcs())
		{
			if (npc.getId() == NpcID.ALCHEMICAL_HYDRA)
			{
				hydraNpc = npc;
				break;
			}
		}

		hydra = new Hydra(hydraNpc);
		addOverlays();
	}

	@Subscribe
	private void onNpcSpawned(NpcSpawned event)
	{
		if (!inHydraInstance || event.getNpc().getId() != NpcID.ALCHEMICAL_HYDRA)
		{
			return;
		}

		log.debug("Hydra spawned");
		hydra = new Hydra(event.getNpc());
		addOverlays();
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged animationChanged)
	{
		Actor actor = animationChanged.getActor();

		if (!inHydraInstance || hydra == null || actor == client.getLocalPlayer())
		{
			return;
		}

		log.debug("Animation changed: {}, {}", actor.getName(), actor.getAnimation());
		HydraPhase phase = hydra.getPhase();

		if (actor.getAnimation() == phase.getDeathAnim2() &&
			phase != HydraPhase.THREE  // Else log's gonna say "Tried some weird shit"
			|| actor.getAnimation() == phase.getDeathAnim1() &&
			phase == HydraPhase.THREE) // We want the pray to switch ye ok ty
		{
			switch (phase)
			{
				case ONE:
					changePhase(HydraPhase.TWO);
					return;
				case TWO:
					changePhase(HydraPhase.THREE);
					return;
				case THREE:
					changePhase(HydraPhase.FOUR);
					return;
				case FOUR:
					hydra = null;
					poisonProjectiles.clear();
					removeOverlays();
					return;
				default:
					log.debug("Tried some weird shit");
					break;
			}
		}

		else if (actor.getAnimation() == phase.getSpecAnimationId() && phase.getSpecAnimationId() != 0)
		{
			hydra.setNextSpecial(hydra.getNextSpecial() + 9);
		}
	}

	@Subscribe
	public void onProjectileMoved(ProjectileMoved event)
	{
		if (!inHydraInstance || hydra == null
			|| client.getGameCycle() >= event.getProjectile().getStartMovementCycle())
		{
			return;
		}

		Projectile projectile = event.getProjectile();
		int id = projectile.getId();

		if (hydra.getPhase().getSpecProjectileId() != 0 && hydra.getPhase().getSpecProjectileId() == id)
		{
			if (hydra.getAttackCount() == hydra.getNextSpecial())
			{
				// Only add 9 to next special on the first poison projectile (whoops)
				hydra.setNextSpecial(hydra.getNextSpecial() + 9);
			}

			if (id == ProjectileID.HYDRA_POISON)
			{
				poisonProjectiles.put(event.getPosition(), projectile);
			}
		}
		else if (client.getTickCount() != lastAttackTick
			&& (id == Hydra.AttackStyle.MAGIC.getProjId() || id == Hydra.AttackStyle.RANGED.getProjId()))
		{
			handleAttack(id);
			lastAttackTick = client.getTickCount();
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (event.getMessage().equals("The chemicals neutralise the Alchemical Hydra's defences!"))
		{
			hydra.setWeakened(true);
		}
		else if (event.getMessage().startsWith("Your Alchemical Hydra kill count is"))
		{
			hydra = null;
			poisonProjectiles.clear();
			removeOverlays();
		}
	}

	private boolean checkArea()
	{
		return Arrays.equals(client.getMapRegions(), HYDRA_REGIONS) && client.isInInstancedRegion();
	}

	private void addOverlays()
	{
		overlayManager.add(overlay);
		overlayManager.add(poisonOverlay);
	}

	private void removeOverlays()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(poisonOverlay);
	}

	private void changePhase(HydraPhase newPhase)
	{
		hydra.setPhase(newPhase);
		hydra.setNextSpecial(3);
		hydra.setAttackCount(0);
		hydra.setWeakened(newPhase != HydraPhase.FOUR);

		if (newPhase == HydraPhase.FOUR)
		{
			switchStyles();
			hydra.setNextSwitch(newPhase.getAttacksPerSwitch());
		}
	}

	private void switchStyles()
	{
		hydra.setNextAttack(hydra.getLastAttack() == Hydra.AttackStyle.MAGIC
			? Hydra.AttackStyle.RANGED
			: Hydra.AttackStyle.MAGIC);
	}

	private void handleAttack(int id)
	{
		if (id != hydra.getNextAttack().getProjId() && id != hydra.getLastAttack().getProjId())
		{ // If the current attack isn't what was expected and we should have switched prayers
			switchStyles();
			hydra.setNextSwitch(hydra.getPhase().getAttacksPerSwitch() - 1);
			hydra.setLastAttack(hydra.getNextAttack());
		}
		else if (id != hydra.getNextAttack().getProjId() && id == hydra.getLastAttack().getProjId())
		{ // If the current attack isn't what was expected and we accidentally counted 1 too much
			return;
		}
		else
		{
			hydra.setNextSwitch(hydra.getNextSwitch() - 1);
			hydra.setLastAttack(hydra.getNextAttack());
		}

		hydra.setAttackCount(hydra.getAttackCount() + 1);

		if (hydra.getNextSwitch() <= 0)
		{
			switchStyles();
			hydra.setNextSwitch(hydra.getPhase().getAttacksPerSwitch());
		}
	}
}
