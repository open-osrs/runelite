/*
 * Copyright (c) 2018, Raqes <j.raqes@gmail.com>
 * Copyright (c) 2018, https://openosrs.com
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
package net.runelite.client.plugins.specialcounter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.VarPlayer;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.StatChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.ws.PartyService;
import net.runelite.client.ws.WSClient;
import org.apache.commons.lang3.ArrayUtils;
import lombok.extern.slf4j.Slf4j;

@PluginDescriptor(
	name = "Special Attack Counter",
	description = "Track DWH, Arclight, Darklight, and BGS special attacks used on NPCs",
	tags = {"combat", "npcs", "overlay"},
	enabledByDefault = false,
	type = PluginType.UTILITY
)
@Singleton
@Slf4j
public class SpecialCounterPlugin extends Plugin
{
	private int currentWorld = -1;
	private int specialPercentage = -1;
	private int specialHitpointsExperience = -1;
	private int specialHitpointsGained = -1;
	private boolean specialUsed;
	private double modifier = 1d;

	private SpecialWeapon specialWeapon;
	private final Set<Integer> interactedNpcIds = new HashSet<>();
	private final SpecialCounter[] specialCounter = new SpecialCounter[SpecialWeapon.values().length];

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private WSClient wsClient;

	@Inject
	private PartyService party;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private ItemManager itemManager;

	@Override
	protected void startUp()
	{

		wsClient.registerMessage(SpecialCounterUpdate.class);
	}

	@Override
	protected void shutDown()
	{
		removeCounters();
		wsClient.unregisterMessage(SpecialCounterUpdate.class);
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			if (currentWorld == -1)
			{
				currentWorld = client.getWorld();
			}
			else if (currentWorld != client.getWorld())
			{
				currentWorld = client.getWorld();
				removeCounters();
			}
		}
	}

	@Subscribe
	private void onVarbitChanged(VarbitChanged event)
	{
		int specialPercentage = client.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT);

		if (this.specialPercentage == -1 || specialPercentage >= this.specialPercentage)
		{
			this.specialPercentage = specialPercentage;
			return;
		}

		this.specialPercentage = specialPercentage;
		this.specialWeapon = usedSpecialWeapon();

		checkInteracting();

		specialUsed = true;
		specialHitpointsExperience = client.getSkillExperience(Skill.HITPOINTS);
		specialHitpointsGained = -1;
	}

	@Subscribe
	private void onStatChanged(StatChanged statChanged)
	{
		if (specialUsed && statChanged.getSkill() == Skill.HITPOINTS)
		{
			specialHitpointsGained = statChanged.getXp() - specialHitpointsExperience;
		}
	}

	@Subscribe
	private void onFakeXpDrop(FakeXpDrop fakeXpDrop)
	{
		if (specialUsed && fakeXpDrop.getSkill() == Skill.HITPOINTS)
		{
			specialHitpointsGained = fakeXpDrop.getXp();
		}
	}

	@Subscribe
	private void onGameTick(GameTick tick)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		int interactingId = checkInteracting();
		if (interactingId > -1 && specialUsed)
		{
			int deltaExperience = specialHitpointsGained;

			specialUsed = false;

			if (deltaExperience > 0 && specialWeapon != null)
			{
				int hit = getHit(specialWeapon, deltaExperience);

				updateCounter(specialWeapon, null, hit);

				if (!party.getMembers().isEmpty())
				{
					final SpecialCounterUpdate specialCounterUpdate = new SpecialCounterUpdate(interactingId, specialWeapon, hit);
					specialCounterUpdate.setMemberId(party.getLocalMember().getMemberId());
					wsClient.send(specialCounterUpdate);
				}
			}
		}
	}

	private int checkInteracting()
	{
		Player localPlayer = client.getLocalPlayer();
		Actor interacting = localPlayer.getInteracting();

		if (interacting instanceof NPC)
		{
			NPC npc = (NPC) interacting;
			NPCDefinition composition = npc.getDefinition();
			int interactingId = npc.getId();

			if (!ArrayUtils.contains(composition.getActions(), "Attack"))
			{
				// Skip over non attackable npcs so that eg. talking to bankers doesn't reset
				// the counters.
				return -1;
			}

			if (!interactedNpcIds.contains(interactingId))
			{
				removeCounters();
				addInteracting(interactingId);
			}

			return interactingId;
		}

		return -1;
	}

	private void addInteracting(int npcId)
	{
		modifier = 1d;
		interactedNpcIds.add(npcId);

		if (client.getWidget(WidgetInfo.THEATRE_OF_BLOOD_PARTY) != null)
		{
			Boss boss = Boss.getBoss(npcId);
			if (boss != null)
			{
				int teamSize = 0;
				Widget x = client.getWidget(WidgetInfo.THEATRE_OF_BLOOD_PARTY);
				for (Widget y : x.getStaticChildren())
				{
					if (!y.isHidden())
					{
						teamSize++;
					}
				}
				if (boss == Boss.SOTETSEG_5_MAN)
				{
					if (teamSize > 0 && teamSize <= 3)
					{
						boss = Boss.SOTETSEG_3_MAN;
					}
					else if (teamSize == 4)
					{
						boss = Boss.SOTETSEG_4_MAN;
					}

				}
				if (boss == Boss.NYLOCAS_VASILIAS_5_MAN)
				{
					if (teamSize > 0 && teamSize <= 3)
					{
						boss = Boss.NYLOCAS_VASILIAS_3_MAN;
					}
					else if (teamSize == 4)
					{
						boss = Boss.NYLOCAS_VASILIAS_4_MAN;
					}

				}
				if (boss == Boss.PESTILENT_BLOAT_5_MAN)
				{
					if (teamSize > 0 && teamSize <= 3)
					{
						boss = Boss.PESTILENT_BLOAT_3_MAN;
					}
					else if (teamSize == 4)
					{
						boss = Boss.PESTILENT_BLOAT_4_MAN;
					}

				}
				modifier = boss.getModifier();
				interactedNpcIds.addAll(boss.getIds());
			}
			return;
		}
		// Add alternate forms of bosses
		final Boss boss = Boss.getBoss(npcId);
		if (boss != null)
		{
			modifier = boss.getModifier();
			interactedNpcIds.addAll(boss.getIds());
		}
	}

	@Subscribe
	private void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC actor = npcDespawned.getNpc();

		if (actor.isDead() && interactedNpcIds.contains(actor.getId()))
		{
			removeCounters();
		}
	}

	@Subscribe
	private void onSpecialCounterUpdate(SpecialCounterUpdate event)
	{
		if (party.getLocalMember().getMemberId().equals(event.getMemberId()))
		{
			return;
		}

		String name = party.getMemberById(event.getMemberId()).getName();
		if (name == null)
		{
			return;
		}

		clientThread.invoke(() ->
		{
			// If not interacting with any npcs currently, add to interacting list
			if (interactedNpcIds.isEmpty())
			{
				addInteracting(event.getNpcId());
			}

			// Otherwise we only add the count if it is against a npc we are already tracking
			if (interactedNpcIds.contains(event.getNpcId()))
			{
				updateCounter(event.getWeapon(), name, event.getHit());
			}
		});
	}

	private SpecialWeapon usedSpecialWeapon()
	{
		ItemContainer equipment = client.getItemContainer(InventoryID.EQUIPMENT);
		if (equipment == null)
		{
			return null;
		}

		Item[] items = equipment.getItems();
		int weaponIdx = EquipmentInventorySlot.WEAPON.getSlotIdx();

		if (items == null || weaponIdx >= items.length)
		{
			return null;
		}

		Item weapon = items[weaponIdx];

		for (SpecialWeapon specialWeapon : SpecialWeapon.values())
		{
			if (specialWeapon.getItemID() == weapon.getId())
			{
				return specialWeapon;
			}
		}
		return null;
	}

	private void updateCounter(SpecialWeapon specialWeapon, String name, int hit)
	{
		SpecialCounter counter = specialCounter[specialWeapon.ordinal()];

		if (counter == null)
		{
			counter = new SpecialCounter(itemManager.getImage(specialWeapon.getItemID()), this,
				hit, specialWeapon);
			infoBoxManager.addInfoBox(counter);
			specialCounter[specialWeapon.ordinal()] = counter;
		}
		else
		{
			counter.addHits(hit);
		}

		// If in a party, add hit to partySpecs for the infobox tooltip
		Map<String, Integer> partySpecs = counter.getPartySpecs();
		if (!party.getMembers().isEmpty())
		{
			if (partySpecs.containsKey(name))
			{
				partySpecs.put(name, hit + partySpecs.get(name));
			}
			else
			{
				partySpecs.put(name, hit);
			}
		}
	}

	private void removeCounters()
	{
		interactedNpcIds.clear();

		for (int i = 0; i < specialCounter.length; ++i)
		{
			SpecialCounter counter = specialCounter[i];

			if (counter != null)
			{
				infoBoxManager.removeInfoBox(counter);
				specialCounter[i] = null;
			}
		}
	}

	private int getHit(SpecialWeapon specialWeapon, int deltaExperience)
	{
		double modifierBase = 1d / modifier;
		double damageOutput = (deltaExperience * modifierBase) / 1.3333d;

		if (!specialWeapon.isDamage())
		{
			return 1;
		}
		else
		{
			return (int) Math.round(damageOutput);
		}
	}
}
