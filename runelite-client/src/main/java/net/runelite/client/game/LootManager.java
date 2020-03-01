/*
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
package net.runelite.client.game;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.AnimationID;
import net.runelite.api.Client;
import net.runelite.api.ItemID;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.NpcID;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.NpcDefinitionChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.events.PlayerLootReceived;

@Singleton
@Slf4j
public class LootManager
{
	private static final Map<Integer, Integer> NPC_DEATH_ANIMATIONS = ImmutableMap.<Integer, Integer>builder()
		.put(NpcID.CAVE_KRAKEN, AnimationID.CAVE_KRAKEN_DEATH)
		.put(NpcID.CRYSTALLINE_BAT, AnimationID.CRYSTALLINE_BAT_DEATH)
		.put(NpcID.CRYSTALLINE_RAT, AnimationID.CRYSTALLINE_RAT_DEATH)
		.put(NpcID.CRYSTALLINE_SPIDER, AnimationID.CRYSTALLINE_SPIDER_DEATH)
		.put(NpcID.CRYSTALLINE_WOLF, AnimationID.CRYSTALLINE_WOLF_DEATH)
		.put(NpcID.CRYSTALLINE_UNICORN, AnimationID.CRYSTALLINE_UNICORN_DEATH)
		.put(NpcID.CRYSTALLINE_SCORPION, AnimationID.CORRUPTED_SCORPION_DEATH)
		.put(NpcID.CRYSTALLINE_DRAGON, AnimationID.CRYSTALLINE_DRAGON_DEATH)
		.put(NpcID.CRYSTALLINE_DARK_BEAST, AnimationID.CRYSTALLINE_DARK_BEAST_DEATH)
		.put(NpcID.CRYSTALLINE_BEAR, AnimationID.CRYSTALLINE_BEAR_DEATH)
		.put(NpcID.CORRUPTED_BAT, AnimationID.CRYSTALLINE_BAT_DEATH)
		.put(NpcID.CORRUPTED_RAT, AnimationID.CRYSTALLINE_RAT_DEATH)
		.put(NpcID.CORRUPTED_SPIDER, AnimationID.CRYSTALLINE_SPIDER_DEATH)
		.put(NpcID.CORRUPTED_WOLF, AnimationID.CRYSTALLINE_WOLF_DEATH)
		.put(NpcID.CORRUPTED_UNICORN, AnimationID.CRYSTALLINE_UNICORN_DEATH)
		.put(NpcID.CORRUPTED_SCORPION, AnimationID.CORRUPTED_SCORPION_DEATH)
		.put(NpcID.CORRUPTED_DRAGON, AnimationID.CRYSTALLINE_DRAGON_DEATH)
		.put(NpcID.CORRUPTED_DARK_BEAST, AnimationID.CRYSTALLINE_DARK_BEAST_DEATH)
		.put(NpcID.CORRUPTED_BEAR, AnimationID.CRYSTALLINE_BEAR_DEATH)
		.build();

	private final EventBus eventBus;
	private final Client client;
	private final ListMultimap<Integer, ItemStack> itemSpawns = ArrayListMultimap.create();
	private final Set<LocalPoint> killPoints = new HashSet<>();
	private WorldPoint playerLocationLastTick;
	private WorldPoint krakenPlayerLocation;

	private NPC delayedLootNpc;
	private int delayedLootTickLimit;

	@Inject
	private LootManager(
		final EventBus eventBus,
		final Client client
	)
	{
		this.eventBus = eventBus;
		this.client = client;

		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(NpcDefinitionChanged.class, this, this::onNpcChanged);
		eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
		eventBus.subscribe(PlayerDespawned.class, this, this::onPlayerDespawned);
		eventBus.subscribe(ItemSpawned.class, this, this::onItemSpawned);
		eventBus.subscribe(ItemDespawned.class, this, this::onItemDespawned);
		eventBus.subscribe(ItemQuantityChanged.class, this, this::onItemQuantityChanged);
		eventBus.subscribe(AnimationChanged.class, this, this::onAnimationChanged);
	}

	private void onNpcDespawned(NpcDespawned npcDespawned)
	{
		final NPC npc = npcDespawned.getNpc();

		if (npc == delayedLootNpc)
		{
			delayedLootNpc = null;
			delayedLootTickLimit = 0;
		}

		if (!npc.isDead())
		{
			int id = npc.getId();
			switch (id)
			{
				case NpcID.GARGOYLE:
				case NpcID.GARGOYLE_413:
				case NpcID.GARGOYLE_1543:
				case NpcID.MARBLE_GARGOYLE:
				case NpcID.MARBLE_GARGOYLE_7408:
				case NpcID.DUSK_7888:
				case NpcID.DUSK_7889:

				case NpcID.ROCKSLUG:
				case NpcID.ROCKSLUG_422:
				case NpcID.GIANT_ROCKSLUG:

				case NpcID.SMALL_LIZARD:
				case NpcID.SMALL_LIZARD_463:
				case NpcID.DESERT_LIZARD:
				case NpcID.DESERT_LIZARD_460:
				case NpcID.DESERT_LIZARD_461:
				case NpcID.LIZARD:

				case NpcID.ZYGOMITE:
				case NpcID.ZYGOMITE_1024:
				case NpcID.ANCIENT_ZYGOMITE:

					// these monsters die with >0 hp, so we just look for coincident
					// item spawn with despawn
					break;
				default:
					return;
			}
		}

		processNpcLoot(npc);
	}

	private void onPlayerDespawned(PlayerDespawned playerDespawned)
	{
		final Player player = playerDespawned.getPlayer();
		// Only care about dead Players
		if (player.getHealthRatio() != 0)
		{
			return;
		}

		final LocalPoint location = LocalPoint.fromWorld(client, player.getWorldLocation());
		if (location == null || killPoints.contains(location))
		{
			return;
		}

		final int x = location.getSceneX();
		final int y = location.getSceneY();
		final int packed = x << 8 | y;
		final Collection<ItemStack> items = itemSpawns.get(packed);

		if (items.isEmpty())
		{
			return;
		}

		killPoints.add(location);
		eventBus.post(PlayerLootReceived.class, new PlayerLootReceived(player, items));
	}

	private void onItemSpawned(ItemSpawned itemSpawned)
	{
		final TileItem item = itemSpawned.getItem();
		final Tile tile = itemSpawned.getTile();
		final LocalPoint location = tile.getLocalLocation();
		final int packed = location.getSceneX() << 8 | location.getSceneY();
		itemSpawns.put(packed, new ItemStack(item.getId(), item.getQuantity(), location));
		log.debug("Item spawn {} ({}) location {}", item.getId(), item.getQuantity(), location);
	}

	private void onItemDespawned(ItemDespawned itemDespawned)
	{
		final TileItem item = itemDespawned.getItem();
		final LocalPoint location = itemDespawned.getTile().getLocalLocation();
		log.debug("Item despawn {} ({}) location {}", item.getId(), item.getQuantity(), location);
	}

	private void onItemQuantityChanged(ItemQuantityChanged itemQuantityChanged)
	{
		final TileItem item = itemQuantityChanged.getItem();
		final Tile tile = itemQuantityChanged.getTile();
		final LocalPoint location = tile.getLocalLocation();
		final int packed = location.getSceneX() << 8 | location.getSceneY();
		final int diff = itemQuantityChanged.getNewQuantity() - itemQuantityChanged.getOldQuantity();

		if (diff <= 0)
		{
			return;
		}

		itemSpawns.put(packed, new ItemStack(item.getId(), diff, location));
	}

	private void onAnimationChanged(AnimationChanged e)
	{
		if (!(e.getActor() instanceof NPC))
		{
			return;
		}

		final NPC npc = (NPC) e.getActor();
		int id = npc.getId();

		// We only care about certain NPCs
		final Integer deathAnim = NPC_DEATH_ANIMATIONS.get(id);

		// Current animation is death animation?
		if (deathAnim != null && deathAnim == npc.getAnimation())
		{
			if (id == NpcID.CAVE_KRAKEN)
			{
				// Big Kraken drops loot wherever player is standing when animation starts.
				krakenPlayerLocation = client.getLocalPlayer().getWorldLocation();
			}
			else
			{
				// These NPCs drop loot on death animation, which is right now.
				processNpcLoot(npc);
			}
		}
	}

	private void onNpcChanged(NpcDefinitionChanged npcChanged)
	{
		final NPC npc = npcChanged.getNpc();
		if (npc.getId() == NpcID.THE_NIGHTMARE_9433)
		{
			delayedLootNpc = npc;
			delayedLootTickLimit = 15;
		}
	}

	private void onGameTick(GameTick gameTick)
	{
		if (delayedLootNpc != null && delayedLootTickLimit-- > 0)
		{
			processDelayedLoot();
		}

		playerLocationLastTick = client.getLocalPlayer().getWorldLocation();
		itemSpawns.clear();
		killPoints.clear();
	}

	private void processDelayedLoot()
	{
		final WorldPoint adjacentLootTile = getAdjacentSquareLootTile(delayedLootNpc);
		final LocalPoint localPoint = LocalPoint.fromWorld(client, adjacentLootTile);

		if (localPoint == null)
		{
			log.debug("Scene changed away from delayed loot location");
			delayedLootNpc = null;
			delayedLootTickLimit = 0;
			return;
		}

		final int sceneX = localPoint.getSceneX();
		final int sceneY = localPoint.getSceneY();
		final int packed = sceneX << 8 | sceneY;
		final List<ItemStack> itemStacks = itemSpawns.get(packed);
		if (itemStacks.isEmpty())
		{
			// no loot yet
			return;
		}

		log.debug("Got delayed loot stack from {}: {}", delayedLootNpc.getName(), itemStacks);
		eventBus.post(NpcLootReceived.class, new NpcLootReceived(delayedLootNpc, itemStacks));

		delayedLootNpc = null;
		delayedLootTickLimit = 0;
	}

	private void processNpcLoot(NPC npc)
	{
		final LocalPoint location = LocalPoint.fromWorld(client, getDropLocation(npc, npc.getWorldLocation()));
		if (location == null || killPoints.contains(location))
		{
			return;
		}

		final int x = location.getSceneX();
		final int y = location.getSceneY();
		final int size = npc.getDefinition().getSize();

		// Some NPCs drop items onto multiple tiles
		final List<ItemStack> allItems = new ArrayList<>();
		for (int i = 0; i < size; ++i)
		{
			for (int j = 0; j < size; ++j)
			{
				final int packed = (x + i) << 8 | (y + j);
				final Collection<ItemStack> items = itemSpawns.get(packed);
				allItems.addAll(items);
			}
		}

		if (allItems.isEmpty())
		{
			return;
		}

		killPoints.add(location);
		eventBus.post(NpcLootReceived.class, new NpcLootReceived(npc, allItems));
	}

	private WorldPoint getDropLocation(NPC npc, WorldPoint worldLocation)
	{
		switch (npc.getId())
		{
			case NpcID.KRAKEN:
			case NpcID.KRAKEN_6640:
			case NpcID.KRAKEN_6656:
				worldLocation = playerLocationLastTick;
				break;
			case NpcID.CAVE_KRAKEN:
				worldLocation = krakenPlayerLocation;
				break;
			case NpcID.ZULRAH:      // Green
			case NpcID.ZULRAH_2043: // Red
			case NpcID.ZULRAH_2044: // Blue
				for (Map.Entry<Integer, ItemStack> entry : itemSpawns.entries())
				{
					if (entry.getValue().getId() == ItemID.ZULRAHS_SCALES)
					{
						int packed = entry.getKey();
						int unpackedX = packed >> 8;
						int unpackedY = packed & 0xFF;
						worldLocation = WorldPoint.fromScene(client, unpackedX, unpackedY, worldLocation.getPlane());
						break;
					}
				}
				break;
			case NpcID.VORKATH:
			case NpcID.VORKATH_8058:
			case NpcID.VORKATH_8059:
			case NpcID.VORKATH_8060:
			case NpcID.VORKATH_8061:
				int x = worldLocation.getX() + 3;
				int y = worldLocation.getY() + 3;
				if (playerLocationLastTick.getX() < x)
				{
					x -= 4;
				}
				else if (playerLocationLastTick.getX() > x)
				{
					x += 4;
				}
				if (playerLocationLastTick.getY() < y)
				{
					y -= 4;
				}
				else if (playerLocationLastTick.getY() > y)
				{
					y += 4;
				}
				worldLocation = new WorldPoint(x, y, worldLocation.getPlane());
				break;
		}

		return worldLocation;
	}

	private WorldPoint getAdjacentSquareLootTile(NPC npc)
	{
		final NPCDefinition composition = npc.getDefinition();
		final WorldPoint worldLocation = npc.getWorldLocation();
		int x = worldLocation.getX();
		int y = worldLocation.getY();

		if (playerLocationLastTick.getX() < x)
		{
			x -= 1;
		}
		else
		{
			x += Math.min(playerLocationLastTick.getX() - x, composition.getSize());
		}

		if (playerLocationLastTick.getY() < y)
		{
			y -= 1;
		}
		else
		{
			y += Math.min(playerLocationLastTick.getY() - y, composition.getSize());
		}

		return new WorldPoint(x, y, worldLocation.getPlane());
	}
}
