/*
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
 * Copyright (c) 2019, Ganom <https://github.com/ganom>
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
package net.runelite.client.plugins.inferno;

import com.google.inject.Provides;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.AnimationID;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ArrayUtils;

@PluginDescriptor(
	name = "Inferno",
	description = "Inferno helper",
	tags = {"combat", "overlay", "pve", "pvm"},
	type = PluginType.PVM
)
public class InfernoPlugin extends Plugin
{
	private static final int INFERNO_REGION = 9043;

	@Inject
	private Client client;

	@Inject
	private InfernoConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private InfernoOverlay infernoOverlay;

	@Inject
	private InfernoWaveOverlay waveOverlay;

	@Inject
	private InfernoInfobox infernoInfobox;

	@Inject
	private InfernoNibblerOverlay nibblerOverlay;

	@Getter(AccessLevel.PACKAGE)
	private Set<NPCContainer> npcContainer = new HashSet<>();

	@Getter(AccessLevel.PACKAGE)
	private Map<Integer, ArrayList<NPCContainer>> npcCurrentAttackMap = new HashMap<>(6);

	@Getter(AccessLevel.PACKAGE)
	private NPCContainer[] priorityNPC;

	@Getter(AccessLevel.PACKAGE)
	private List<NPC> nibblers;

	@Getter(AccessLevel.PACKAGE)
	private int currentWaveNumber;

	@Provides
	InfernoConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(InfernoConfig.class);
	}

	@Override
	public void startUp()
	{
		waveOverlay.setDisplayMode(config.waveDisplay());
		waveOverlay.setWaveHeaderColor(config.getWaveOverlayHeaderColor());
		waveOverlay.setWaveTextColor(config.getWaveTextColor());

		if (isInInferno())
		{
			addOverlays();
		}

		nibblers = new ArrayList<>();
		priorityNPC = new NPCContainer[4];
		for (int i = 1; i <= 6; i++)
		{
			npcCurrentAttackMap.put(i, new ArrayList<>());
		}
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!"inferno".equals(event.getGroup()))
		{
			return;
		}

		if (event.getKey().endsWith("color"))
		{
			waveOverlay.setWaveHeaderColor(config.getWaveOverlayHeaderColor());
			waveOverlay.setWaveTextColor(config.getWaveTextColor());
			return;
		}

		switch (event.getKey())
		{
			case "waveDisplay":
				overlayManager.remove(waveOverlay);

				waveOverlay.setDisplayMode(config.waveDisplay());

				if (isInInferno() && config.waveDisplay() != InfernoConfig.InfernoWaveDisplayMode.NONE)
				{
					overlayManager.add(waveOverlay);
				}
				break;
			case "nibblerOverlay":
				overlayManager.remove(nibblerOverlay);

				if (isInInferno() && config.displayNibblerOverlay())
				{
					overlayManager.add(nibblerOverlay);
				}
				break;
			case "prayerHelper":
				overlayManager.remove(infernoInfobox);

				if (isInInferno() && config.showPrayerHelp())
				{
					overlayManager.add(infernoInfobox);
				}
				break;
			case "shadows":
				infernoOverlay.setShadows(config.shadows());
				break;
			case "textSize":
				infernoOverlay.setTextSize(config.textSize());
				break;
			case "fontStyle":
				infernoOverlay.setFont(config.fontStyle());
				break;
			case "prayerWidgetHelper":
				infernoOverlay.setShowPrayerWidgetHelper(config.showPrayerWidgetHelper());
				break;
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		if (!isInInferno())
		{
			currentWaveNumber = -1;
		}
		else
		{
			addOverlays();
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (!isInInferno() || event.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		String message = event.getMessage();

		if (event.getMessage().contains("Wave:"))
		{
			message = message.substring(message.indexOf(": ") + 2);
			currentWaveNumber = Integer.parseInt(message.substring(0, message.indexOf("<")));
		}
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (!isInInferno())
		{
			return;
		}

		NPC npc = event.getNpc();

		switch (npc.getId())
		{
			case NpcID.JALMEJRAH:
			case NpcID.JALAK:
			case NpcID.JALIMKOT:
			case NpcID.JALXIL:
			case NpcID.JALZEK:
			case NpcID.JALTOKJAD:
			case NpcID.JALTOKJAD_7704:
				npcContainer.add(new NPCContainer(npc));
				break;
			case NpcID.JALNIB:
				nibblers.add(npc);
				break;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (!isInInferno())
		{
			return;
		}

		NPC npc = event.getNpc();

		switch (npc.getId())
		{
			case NpcID.JALMEJRAH:
			case NpcID.JALAK:
			case NpcID.JALIMKOT:
			case NpcID.JALXIL:
			case NpcID.JALZEK:
			case NpcID.JALTOKJAD:
			case NpcID.JALTOKJAD_7704:
				npcContainer.removeIf(c -> c.getNpc() == npc);
				break;
			case NpcID.JALNIB:
				nibblers.remove(npc);
				break;
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (!isInInferno())
		{
			return;
		}

		clearMapAndPriority();

		for (NPCContainer npcs : getNpcContainer())
		{
			npcs.setTicksUntilAttack(npcs.getTicksUntilAttack() - 1);
			calculateDistanceToPlayer(npcs);
			int anim = npcs.getNpc().getAnimation();

			switch (npcs.getNpc().getId())
			{
				case NpcID.JALMEJRAH:
					if (anim == npcs.getAttackAnimation())
					{
						if (npcs.getTicksUntilAttack() < 1)
						{
							npcs.setTicksUntilAttack(3);
						}
					}
					break;
				case NpcID.JALAKREKXIL:
				case NpcID.JALAKREKKET:
				case NpcID.JALAKREKMEJ:
				case NpcID.JALIMKOT:
				case NpcID.JALXIL:
				case NpcID.JALZEK:
					if (anim == npcs.getAttackAnimation())
					{
						if (npcs.getTicksUntilAttack() < 1)
						{
							npcs.setTicksUntilAttack(4);
						}
					}
					break;
				case NpcID.JALTOKJAD:
				case NpcID.JALTOKJAD_7704:
					switch (anim)
					{
						case AnimationID.JALTOK_JAD_MAGE_ATTACK:
							npcs.setAttackStyle(NPCContainer.Attackstyle.MAGE);
							if (npcs.getTicksUntilAttack() < 1)
							{
								npcs.setTicksUntilAttack(currentWaveNumber != 68 ? 8 : 9);
							}
							break;
						case AnimationID.JALTOK_JAD_MELEE_ATTACK:
							npcs.setAttackStyle(NPCContainer.Attackstyle.MELEE);
							if (npcs.getTicksUntilAttack() < 1)
							{
								npcs.setTicksUntilAttack(currentWaveNumber != 68 ? 8 : 9);
							}
							break;
						case AnimationID.JALTOK_JAD_RANGE_ATTACK:
							npcs.setAttackStyle(NPCContainer.Attackstyle.RANGE);
							if (npcs.getTicksUntilAttack() < 1)
							{
								npcs.setTicksUntilAttack(currentWaveNumber != 68 ? 8 : 9);
							}
							break;
					}
					break;
				case NpcID.JALAK:
					if (anim == npcs.getAttackAnimation())
					{
						if (npcs.getTicksUntilAttack() < 1)
						{
							npcs.setTicksUntilAttack(6);
						}
					}
					if (npcs.getDistanceToPlayer() <= 15)
					{
						if (client.getLocalPlayer().getOverheadIcon() == null)
						{
							npcs.setAttackStyle(NPCContainer.Attackstyle.UNKNOWN);
						}
						else if (client.getLocalPlayer().getOverheadIcon().equals(HeadIcon.MAGIC))
						{
							npcs.setAttackStyle(NPCContainer.Attackstyle.RANGE);
						}
						else if (client.getLocalPlayer().getOverheadIcon().equals(HeadIcon.RANGED))
						{
							npcs.setAttackStyle(NPCContainer.Attackstyle.MAGE);
						}
						break;
					}
			}
		}
	}

	private void calculatePriorityNPC()
	{
		for (int i = 0; i < priorityNPC.length; i++)
		{
			ArrayList<NPCContainer> monsters = npcCurrentAttackMap.get(i + 1);

			if (monsters.size() == 0)
			{
				continue;
			}

			int priority = monsters.get(0).getPriority();

			NPCContainer npcContainer = monsters.get(0);

			for (NPCContainer npc : monsters)
			{
				if (npc.getPriority() < priority)
				{
					priority = npc.getPriority();
					npcContainer = npc;
				}
			}
			priorityNPC[i] = npcContainer;
			System.out.println("i: " + i + " " + npcContainer.getNpcName());
		}
	}

	private void clearMapAndPriority()
	{
		for (List<NPCContainer> l : npcCurrentAttackMap.values())
		{
			l.clear();
		}

		for (int i = 0; i < priorityNPC.length; i++)
		{
			priorityNPC[i] = null;
		}
	}

	private void calculateDistanceToPlayer(NPCContainer npc)
	{
		npc.setDistanceToPlayer(client.getLocalPlayer().getWorldLocation().distanceTo(npc.getNpc().getWorldArea()));
	}

	private void addOverlays()
	{
		overlayManager.add(infernoOverlay);

		if (config.showPrayerHelp())
		{
			overlayManager.add(infernoInfobox);
		}

		if (config.displayNibblerOverlay())
		{
			overlayManager.add(nibblerOverlay);
		}

		if (config.waveDisplay() != InfernoConfig.InfernoWaveDisplayMode.NONE)
		{
			overlayManager.add(waveOverlay);
		}
	}

	private boolean isInInferno()
	{
		return ArrayUtils.contains(client.getMapRegions(), INFERNO_REGION);
	}

	int getNextWaveNumber()
	{
		return currentWaveNumber == -1 || currentWaveNumber == 69 ? -1 : currentWaveNumber + 1;
	}
}
