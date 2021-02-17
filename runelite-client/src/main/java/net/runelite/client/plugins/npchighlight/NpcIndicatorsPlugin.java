/*
 * Copyright (c) 2018, James Swindle <wilingua@gmail.com>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.npchighlight;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.awt.Color;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.KeyCode;
import net.runelite.api.MenuAction;
import static net.runelite.api.MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;
import net.runelite.client.util.WildcardMatcher;

@PluginDescriptor(
	name = "NPC Indicators",
	description = "Highlight NPCs on-screen and/or on the minimap",
	tags = {"highlight", "minimap", "npcs", "overlay", "respawn", "tags"}
)
@Slf4j
public class NpcIndicatorsPlugin extends Plugin
{
	private static final int MAX_ACTOR_VIEW_RANGE = 15;

	// Option added to NPC menu
	private static final String TAG = "Tag";
	private static final String UNTAG = "Un-tag";

	private static final String TAG_ALL = "Tag-All";
	private static final String UNTAG_ALL = "Un-tag-All";

	private static final Set<MenuAction> NPC_MENU_ACTIONS = ImmutableSet.of(MenuAction.NPC_FIRST_OPTION, MenuAction.NPC_SECOND_OPTION,
		MenuAction.NPC_THIRD_OPTION, MenuAction.NPC_FOURTH_OPTION, MenuAction.NPC_FIFTH_OPTION, MenuAction.SPELL_CAST_ON_NPC,
		MenuAction.ITEM_USE_ON_NPC);

	@Inject
	private Client client;

	@Inject
	private NpcIndicatorsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private NpcSceneOverlay npcSceneOverlay;

	@Inject
	private NpcMinimapOverlay npcMinimapOverlay;

	@Inject
	private ClientThread clientThread;

	/**
	 * NPCs to highlight
	 */
	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> highlightedNpcs = new HashSet<>();

	/**
	 * Dead NPCs that should be displayed with a respawn indicator if the config is on.
	 */
	@Getter(AccessLevel.PACKAGE)
	private final Map<Integer, MemorizedNpc> deadNpcsToDisplay = new HashMap<>();

	/**
	 * The time when the last game tick event ran.
	 */
	@Getter(AccessLevel.PACKAGE)
	private Instant lastTickUpdate;

	/**
	 * Tagged NPCs that have died at some point, which are memorized to
	 * remember when and where they will respawn
	 */
	private final Map<Integer, MemorizedNpc> memorizedNpcs = new HashMap<>();

	/**
	 * Highlight strings from the configuration
	 */
	private List<String> highlights = new ArrayList<>();

	/**
	 * NPC ids marked with the Tag option
	 */
	private final Set<Integer> npcTags = new HashSet<>();

	/**
	 * Tagged NPCs that spawned this tick, which need to be verified that
	 * they actually spawned and didn't just walk into view range.
	 */
	private final List<NPC> spawnedNpcsThisTick = new ArrayList<>();

	/**
	 * Tagged NPCs that despawned this tick, which need to be verified that
	 * they actually spawned and didn't just walk into view range.
	 */
	private final List<NPC> despawnedNpcsThisTick = new ArrayList<>();

	/**
	 * World locations of graphics object which indicate that an
	 * NPC teleported that were played this tick.
	 */
	private final Set<WorldPoint> teleportGraphicsObjectSpawnedThisTick = new HashSet<>();

	/**
	 * The players location on the last game tick.
	 */
	private WorldPoint lastPlayerLocation;

	/**
	 * When hopping worlds, NPCs can spawn without them actually respawning,
	 * so we would not want to mark it as a real spawn in those cases.
	 */
	private boolean skipNextSpawnCheck = false;

	@Provides
	NpcIndicatorsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NpcIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(npcSceneOverlay);
		overlayManager.add(npcMinimapOverlay);
		clientThread.invoke(() ->
		{
			skipNextSpawnCheck = true;
			rebuildAllNpcs();
		});
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(npcSceneOverlay);
		overlayManager.remove(npcMinimapOverlay);
		clientThread.invoke(() ->
		{
			deadNpcsToDisplay.clear();
			memorizedNpcs.clear();
			spawnedNpcsThisTick.clear();
			despawnedNpcsThisTick.clear();
			teleportGraphicsObjectSpawnedThisTick.clear();
			npcTags.clear();
			highlightedNpcs.clear();
		});
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGIN_SCREEN ||
			event.getGameState() == GameState.HOPPING)
		{
			highlightedNpcs.clear();
			deadNpcsToDisplay.clear();
			memorizedNpcs.forEach((id, npc) -> npc.setDiedOnTick(-1));
			lastPlayerLocation = null;
			skipNextSpawnCheck = true;
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged configChanged)
	{
		if (!configChanged.getGroup().equals("npcindicators"))
		{
			return;
		}

		clientThread.invoke(this::rebuildAllNpcs);
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		int type = event.getType();

		if (type >= MENU_ACTION_DEPRIORITIZE_OFFSET)
		{
			type -= MENU_ACTION_DEPRIORITIZE_OFFSET;
		}

		final MenuAction menuAction = MenuAction.of(type);

		if (NPC_MENU_ACTIONS.contains(menuAction))
		{
			NPC npc = client.getCachedNPCs()[event.getIdentifier()];

			Color color = null;
			if (npc.isDead())
			{
				color = config.deadNpcMenuColor();
			}

			if (color == null && highlightedNpcs.contains(npc) && config.highlightMenuNames() && (!npc.isDead() || !config.ignoreDeadNpcs()))
			{
				color = config.getHighlightColor();
			}

			if (color != null)
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				final MenuEntry menuEntry = menuEntries[menuEntries.length - 1];
				final String target = ColorUtil.prependColorTag(Text.removeTags(event.getTarget()), color);
				menuEntry.setTarget(target);
				client.setMenuEntries(menuEntries);
			}
		}
		else if (menuAction == MenuAction.EXAMINE_NPC && client.isKeyPressed(KeyCode.KC_SHIFT))
		{
			// Add tag and tag-all options
			final int id = event.getIdentifier();
			final NPC[] cachedNPCs = client.getCachedNPCs();
			final NPC npc = cachedNPCs[id];

			if (npc == null || npc.getName() == null)
			{
				return;
			}

			final String npcName = npc.getName();
			boolean matchesList = highlights.stream()
				.filter(highlight -> !highlight.equalsIgnoreCase(npcName))
				.anyMatch(highlight -> WildcardMatcher.matches(highlight, npcName));

			MenuEntry[] menuEntries = client.getMenuEntries();

			// Only add Untag-All option to npcs not highlighted by a wildcard entry, because untag-all will not remove wildcards
			if (!matchesList)
			{
				menuEntries = Arrays.copyOf(menuEntries, menuEntries.length + 2);
				final MenuEntry tagAllEntry = menuEntries[menuEntries.length - 2] = new MenuEntry();
				tagAllEntry.setOption(highlights.stream().anyMatch(npcName::equalsIgnoreCase) ? UNTAG_ALL : TAG_ALL);
				tagAllEntry.setTarget(event.getTarget());
				tagAllEntry.setParam0(event.getActionParam0());
				tagAllEntry.setParam1(event.getActionParam1());
				tagAllEntry.setIdentifier(event.getIdentifier());
				tagAllEntry.setType(MenuAction.RUNELITE.getId());
			}
			else
			{
				menuEntries = Arrays.copyOf(menuEntries, menuEntries.length + 1);
			}

			final MenuEntry tagEntry = menuEntries[menuEntries.length - 1] = new MenuEntry();
			tagEntry.setOption(npcTags.contains(npc.getIndex()) ? UNTAG : TAG);
			tagEntry.setTarget(event.getTarget());
			tagEntry.setParam0(event.getActionParam0());
			tagEntry.setParam1(event.getActionParam1());
			tagEntry.setIdentifier(event.getIdentifier());
			tagEntry.setType(MenuAction.RUNELITE.getId());

			client.setMenuEntries(menuEntries);
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked click)
	{
		if (click.getMenuAction() != MenuAction.RUNELITE ||
			!(click.getMenuOption().equals(TAG) || click.getMenuOption().equals(UNTAG) ||
				click.getMenuOption().equals(TAG_ALL) || click.getMenuOption().equals(UNTAG_ALL)))
		{
			return;
		}

		final int id = click.getId();
		final NPC[] cachedNPCs = client.getCachedNPCs();
		final NPC npc = cachedNPCs[id];

		if (npc == null || npc.getName() == null)
		{
			return;
		}

		if (click.getMenuOption().equals(TAG) || click.getMenuOption().equals(UNTAG))
		{
			final boolean removed = npcTags.remove(id);

			if (removed)
			{
				if (!highlightMatchesNPCName(npc.getName()))
				{
					highlightedNpcs.remove(npc);
					memorizedNpcs.remove(npc.getIndex());
				}
			}
			else
			{
				if (!client.isInInstancedRegion())
				{
					memorizeNpc(npc);
					npcTags.add(id);
				}
				highlightedNpcs.add(npc);
			}
		}
		else
		{
			final String name = npc.getName();
			updateNpcsToHighlight(name);
		}

		click.consume();
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		final NPC npc = npcSpawned.getNpc();
		final String npcName = npc.getName();

		if (npcName == null)
		{
			return;
		}

		if (npcTags.contains(npc.getIndex()))
		{
			memorizeNpc(npc);
			highlightedNpcs.add(npc);
			spawnedNpcsThisTick.add(npc);
			return;
		}

		if (highlightMatchesNPCName(npcName))
		{
			highlightedNpcs.add(npc);
			if (!client.isInInstancedRegion())
			{
				memorizeNpc(npc);
				spawnedNpcsThisTick.add(npc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		final NPC npc = npcDespawned.getNpc();

		if (memorizedNpcs.containsKey(npc.getIndex()))
		{
			despawnedNpcsThisTick.add(npc);
		}

		highlightedNpcs.remove(npc);
	}

	@Subscribe
	public void onGraphicsObjectCreated(GraphicsObjectCreated event)
	{
		final GraphicsObject go = event.getGraphicsObject();

		if (go.getId() == GraphicID.GREY_BUBBLE_TELEPORT)
		{
			teleportGraphicsObjectSpawnedThisTick.add(WorldPoint.fromLocal(client, go.getLocation()));
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		removeOldHighlightedRespawns();
		validateSpawnedNpcs();
		lastTickUpdate = Instant.now();
		lastPlayerLocation = client.getLocalPlayer().getWorldLocation();
	}

	private void updateNpcsToHighlight(String npc)
	{
		final List<String> highlightedNpcs = new ArrayList<>(highlights);

		if (!highlightedNpcs.removeIf(npc::equalsIgnoreCase))
		{
			highlightedNpcs.add(npc);
		}

		// this triggers the config change event and rebuilds npcs
		config.setNpcToHighlight(Text.toCSV(highlightedNpcs));
	}

	private static boolean isInViewRange(WorldPoint wp1, WorldPoint wp2)
	{
		int distance = wp1.distanceTo(wp2);
		return distance < MAX_ACTOR_VIEW_RANGE;
	}

	private static WorldPoint getWorldLocationBehind(NPC npc)
	{
		final int orientation = npc.getOrientation() / 256;
		int dx = 0, dy = 0;

		switch (orientation)
		{
			case 0: // South
				dy = -1;
				break;
			case 1: // Southwest
				dx = -1;
				dy = -1;
				break;
			case 2: // West
				dx = -1;
				break;
			case 3: // Northwest
				dx = -1;
				dy = 1;
				break;
			case 4: // North
				dy = 1;
				break;
			case 5: // Northeast
				dx = 1;
				dy = 1;
				break;
			case 6: // East
				dx = 1;
				break;
			case 7: // Southeast
				dx = 1;
				dy = -1;
				break;
		}

		final WorldPoint currWP = npc.getWorldLocation();
		return new WorldPoint(currWP.getX() - dx, currWP.getY() - dy, currWP.getPlane());
	}

	private void memorizeNpc(NPC npc)
	{
		final int npcIndex = npc.getIndex();
		memorizedNpcs.putIfAbsent(npcIndex, new MemorizedNpc(npc));
	}

	private void removeOldHighlightedRespawns()
	{
		deadNpcsToDisplay.values().removeIf(x -> x.getDiedOnTick() + x.getRespawnTime() <= client.getTickCount() + 1);
	}

	@VisibleForTesting
	List<String> getHighlights()
	{
		final String configNpcs = config.getNpcToHighlight();

		if (configNpcs.isEmpty())
		{
			return Collections.emptyList();
		}

		return Text.fromCSV(configNpcs);
	}

	@VisibleForTesting
	void rebuildAllNpcs()
	{
		highlights = getHighlights();
		highlightedNpcs.clear();

		if (client.getGameState() != GameState.LOGGED_IN &&
			client.getGameState() != GameState.LOADING)
		{
			// NPCs are still in the client after logging out,
			// but we don't want to highlight those.
			return;
		}

		for (NPC npc : client.getNpcs())
		{
			final String npcName = npc.getName();

			if (npcName == null)
			{
				continue;
			}

			if (npcTags.contains(npc.getIndex()))
			{
				highlightedNpcs.add(npc);
				continue;
			}

			if (highlightMatchesNPCName(npcName))
			{
				if (!client.isInInstancedRegion())
				{
					memorizeNpc(npc);
				}
				highlightedNpcs.add(npc);
				continue;
			}

			// NPC is not highlighted
			memorizedNpcs.remove(npc.getIndex());
		}
	}

	private boolean highlightMatchesNPCName(String npcName)
	{
		for (String highlight : highlights)
		{
			if (WildcardMatcher.matches(highlight, npcName))
			{
				return true;
			}
		}

		return false;
	}

	private void validateSpawnedNpcs()
	{
		if (skipNextSpawnCheck)
		{
			skipNextSpawnCheck = false;
		}
		else
		{
			for (NPC npc : despawnedNpcsThisTick)
			{
				if (!teleportGraphicsObjectSpawnedThisTick.isEmpty())
				{
					if (teleportGraphicsObjectSpawnedThisTick.contains(npc.getWorldLocation()))
					{
						// NPC teleported away, so we don't want to add the respawn timer
						continue;
					}
				}

				if (isInViewRange(client.getLocalPlayer().getWorldLocation(), npc.getWorldLocation()))
				{
					final MemorizedNpc mn = memorizedNpcs.get(npc.getIndex());

					if (mn != null)
					{
						mn.setDiedOnTick(client.getTickCount() + 1); // This runs before tickCounter updates, so we add 1

						if (!mn.getPossibleRespawnLocations().isEmpty())
						{
							log.debug("Starting {} tick countdown for {}", mn.getRespawnTime(), mn.getNpcName());
							deadNpcsToDisplay.put(mn.getNpcIndex(), mn);
						}
					}
				}
			}

			for (NPC npc : spawnedNpcsThisTick)
			{
				if (!teleportGraphicsObjectSpawnedThisTick.isEmpty())
				{
					if (teleportGraphicsObjectSpawnedThisTick.contains(npc.getWorldLocation()) ||
						teleportGraphicsObjectSpawnedThisTick.contains(getWorldLocationBehind(npc)))
					{
						// NPC teleported here, so we don't want to update the respawn timer
						continue;
					}
				}

				if (lastPlayerLocation != null && isInViewRange(lastPlayerLocation, npc.getWorldLocation()))
				{
					final MemorizedNpc mn = memorizedNpcs.get(npc.getIndex());

					if (mn.getDiedOnTick() != -1)
					{
						final int respawnTime = client.getTickCount() + 1 - mn.getDiedOnTick();

						// By killing a monster and leaving the area before seeing it again, an erroneously lengthy
						// respawn time can be recorded. Thus, if the respawn time is already set and is greater than
						// the observed time, assume that the lower observed respawn time is correct.
						if (mn.getRespawnTime() == -1 || respawnTime < mn.getRespawnTime())
						{
							mn.setRespawnTime(respawnTime);
						}

						mn.setDiedOnTick(-1);
					}

					final WorldPoint npcLocation = npc.getWorldLocation();

					// An NPC can move in the same tick as it spawns, so we also have
					// to consider whatever tile is behind the npc
					final WorldPoint possibleOtherNpcLocation = getWorldLocationBehind(npc);

					mn.getPossibleRespawnLocations().removeIf(x ->
						x.distanceTo(npcLocation) != 0 && x.distanceTo(possibleOtherNpcLocation) != 0);

					if (mn.getPossibleRespawnLocations().isEmpty())
					{
						mn.getPossibleRespawnLocations().add(npcLocation);
						mn.getPossibleRespawnLocations().add(possibleOtherNpcLocation);
					}
				}
			}
		}

		spawnedNpcsThisTick.clear();
		despawnedNpcsThisTick.clear();
		teleportGraphicsObjectSpawnedThisTick.clear();
	}
}
