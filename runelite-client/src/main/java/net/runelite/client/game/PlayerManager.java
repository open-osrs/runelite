package net.runelite.client.game;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.api.ItemID;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.util.PvPUtil;
import net.runelite.http.api.hiscore.HiscoreClient;
import net.runelite.http.api.hiscore.HiscoreResult;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;

@Singleton
@Slf4j
public class PlayerManager
{
	private static final HiscoreClient HISCORE_CLIENT = new HiscoreClient();
	private final Client client;
	private final ItemManager itemManager;
	private final Map<String, PlayerContainer> playerMap = new ConcurrentHashMap<>();
	private final Map<String, HiscoreResult> resultCache = new ConcurrentHashMap<>();
	private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

	@Inject
	PlayerManager(
		final Client client,
		final EventBus eventBus,
		final ItemManager itemManager
	)
	{
		this.client = client;
		this.itemManager = itemManager;
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(PlayerDespawned.class, this, this::onPlayerDespawned);
		eventBus.subscribe(PlayerSpawned.class, this, this::onPlayerSpawned);
	}

	/**
	 * @return Collection of {@link PlayerContainer}, this can be empty.
	 */
	public Collection<PlayerContainer> getPlayerContainers()
	{
		return playerMap.values();
	}

	/**
	 * @param name Players name.
	 * @return {@link PlayerContainer} if provided with proper name, else null.
	 */
	@Nullable
	public PlayerContainer getPlayer(String name)
	{
		return playerMap.getOrDefault(name, null);
	}

	/**
	 * @param player Player object.
	 * @return {@link PlayerContainer} if provided with proper name, else null.
	 */
	@Nullable
	public PlayerContainer getPlayer(Player player)
	{
		if (player == null)
		{
			return null;
		}

		return playerMap.getOrDefault(player.getName(), null);
	}

	/**
	 * This will keep submitting an http request until it successfully updates.
	 *
	 * @param name The player name you wish to update.
	 */
	public void updateStats(String name)
	{
		final PlayerContainer p = playerMap.getOrDefault(name, null);

		if (p == null)
		{
			return;
		}

		updateStats(p.getPlayer());
	}

	/**
	 * This will keep submitting an http request until it successfully updates.
	 *
	 * @param requestedPlayer The player object you wish to update.
	 */
	public void updateStats(Player requestedPlayer)
	{
		if (requestedPlayer == null)
		{
			return;
		}

		final PlayerContainer player = playerMap.getOrDefault(requestedPlayer.getName(), null);

		if (player == null)
		{
			return;
		}

		if (resultCache.containsKey(player.getName()))
		{
			player.setSkills(resultCache.get(player.getName()));
			player.setPrayerLevel(player.getSkills().getPrayer().getLevel());
			player.setHpLevel(player.getSkills().getHitpoints().getLevel());
			return;
		}

		executorService.submit(() ->
		{
			HiscoreResult result;
			do
			{
				try
				{
					result = HISCORE_CLIENT.lookup(player.getName());
				}
				catch (IOException ex)
				{
					result = null;
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			while (result == null);

			resultCache.put(player.getName(), result);
			player.setSkills(result);
			player.setPrayerLevel(player.getSkills().getPrayer().getLevel());
			player.setHpLevel(player.getSkills().getHitpoints().getLevel());
		});
	}

	private void onPlayerDespawned(PlayerDespawned event)
	{
		final Player player = event.getPlayer();
		playerMap.remove(player.getName());
	}

	private void onPlayerSpawned(PlayerSpawned event)
	{
		final Player player = event.getPlayer();
		playerMap.put(player.getName(), new PlayerContainer(player));
	}

	private void onGameTick(GameTick event)
	{
		playerMap.values().forEach((p) ->
		{
			update(p);
			p.reset();
		});
	}

	private void update(PlayerContainer player)
	{
		player.setRisk(0);
		updatePlayerGear(player);
		updateAttackStyle(player);
		updateWeakness(player);
		player.setLocation(WorldLocation.location(player.getPlayer().getWorldLocation()));
		player.setWildyLevel(PvPUtil.getWildernessLevelFrom(player.getPlayer().getWorldLocation()));
		player.setTargetString(targetStringBuilder(player));
	}

	private void updatePlayerGear(PlayerContainer player)
	{
		final Map<Integer, Integer> prices = new HashMap<>();

		if (player.getPlayer().getPlayerAppearance() == null)
		{
			return;
		}

		for (KitType kitType : KitType.values())
		{
			if (kitType.equals(KitType.RING) || kitType.equals(KitType.AMMUNITION))
			{
				continue;
			}

			final int id = player.getPlayer().getPlayerAppearance().getEquipmentId(kitType);

			if (id == -1)
			{
				continue;
			}

			if (kitType.equals(KitType.WEAPON))
			{
				player.setWeapon(id);

				switch (id)
				{
					case ItemID.HEAVY_BALLISTA:
					case ItemID.HEAVY_BALLISTA_23630:
					case ItemID.LIGHT_BALLISTA:
						player.setRangeStr(player.getRangeStr() + 150);
						break;
					case ItemID.MAPLE_LONGBOW:
					case ItemID.MAPLE_SHORTBOW:
						player.setRangeStr(player.getRangeStr() + 31);
						break;
					case ItemID.MAGIC_SHORTBOW:
					case ItemID.MAGIC_SHORTBOW_20558:
					case ItemID.MAGIC_SHORTBOW_I:
						player.setRangeStr(player.getRangeStr() + 55);
						break;
					case ItemID.DARK_BOW:
					case ItemID.DARK_BOW_12765:
					case ItemID.DARK_BOW_12766:
					case ItemID.DARK_BOW_12767:
					case ItemID.DARK_BOW_12768:
					case ItemID.DARK_BOW_20408:
						player.setRangeStr(player.getRangeStr() + 60);
						break;
					case ItemID.RUNE_CROSSBOW:
					case ItemID.RUNE_CROSSBOW_23601:
						player.setRangeStr(player.getRangeStr() + 117);
						break;
					case ItemID.DRAGON_CROSSBOW:
					case ItemID.ARMADYL_CROSSBOW:
					case ItemID.ARMADYL_CROSSBOW_23611:
						player.setRangeStr(player.getRangeStr() + 122);
						break;
				}
			}

			final ItemStats item = itemManager.getItemStats(id, false);
			final ItemDefinition itemDefinition = itemManager.getItemDefinition(id);

			if (item == null)
			{
				log.debug("Item is null: {}", id);
				continue;
			}

			final ItemEquipmentStats stats = item.getEquipment();

			player.setSpeed(player.getSpeed() + stats.getAspeed());
			player.setMeleeAtkCrush(player.getMeleeAtkCrush() + stats.getAcrush());
			player.setMeleeAtkStab(player.getMeleeAtkStab() + stats.getAstab());
			player.setMeleeAtkSlash(player.getMeleeAtkSlash() + stats.getAslash());
			player.setMeleeAttack(player.getMeleeAttack() + ((stats.getAcrush() + stats.getAslash() + stats.getAstab()) / 3));
			player.setMeleeDefCrush(player.getMeleeDefCrush() + stats.getDcrush());
			player.setMeleeDefStab(player.getMeleeDefStab() + stats.getDstab());
			player.setMeleeDefSlash(player.getMeleeDefSlash() + stats.getDslash());
			player.setMeleeDefence(player.getMeleeDefence() + ((stats.getDcrush() + stats.getDslash() + stats.getDstab()) / 3));
			player.setMagicAttack(player.getMagicAttack() + stats.getAmagic());
			player.setRangeAttack(player.getRangeAttack() + stats.getArange());
			player.setMagicDefence(player.getMagicDefence() + stats.getDmagic());
			player.setRangeDefence(player.getRangeDefence() + stats.getDrange());
			player.setRangeStr(player.getRangeStr() + stats.getRstr());
			player.setMeleeStr(player.getMeleeStr() + stats.getStr());
			player.setMagicStr(player.getMagicStr() + stats.getMdmg());

			if (ItemReclaimCost.breaksOnDeath(id))
			{
				prices.put(id, itemManager.getRepairValue(id));
				log.debug("Item has a broken value: Id {}, Value {}", id, itemManager.getRepairValue(id));
				continue;
			}

			if (!itemDefinition.isTradeable() && !ItemMapping.isMapped(id))
			{
				prices.put(id, itemDefinition.getPrice());
			}
			else if (itemDefinition.isTradeable())
			{
				prices.put(id, itemManager.getItemPrice(id, false));
			}
		}
		updateGear(player, prices);
		updateMeleeStyle(player);
	}

	private void updateGear(PlayerContainer player, Map<Integer, Integer> prices)
	{
		player.setGear(prices.entrySet()
			.stream()
			.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
		);

		player.setRiskedGear(prices.entrySet()
			.stream()
			.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
		);

		if (player.getPlayer().getSkullIcon() == null)
		{
			removeEntries(player.getRiskedGear(), player.getPrayer() <= 25 ? 3 : 4);
		}
		else
		{
			removeEntries(player.getRiskedGear(), player.getPrayer() <= 25 ? 0 : 1);
		}

		player.getRiskedGear().values().forEach(price -> player.setRisk(player.getRisk() + price));
		prices.clear();
	}

	private void updateMeleeStyle(PlayerContainer player)
	{
		if (player.getMeleeAtkCrush() >= player.getMeleeAtkSlash() && player.getMeleeAtkCrush() >= player.getMeleeAtkStab())
		{
			player.setMeleeStyle(PlayerContainer.MeleeStyle.CRUSH);
		}
		else if (player.getMeleeAtkSlash() >= player.getMeleeAtkCrush() && player.getMeleeAtkSlash() >= player.getMeleeAtkStab())
		{
			player.setMeleeStyle(PlayerContainer.MeleeStyle.SLASH);
		}
		else if (player.getMeleeAtkStab() >= player.getMeleeAtkSlash() && player.getMeleeAtkStab() >= player.getMeleeAtkCrush())
		{
			player.setMeleeStyle(PlayerContainer.MeleeStyle.STAB);
		}
	}

	private void updateAttackStyle(PlayerContainer player)
	{
		boolean staff = false;

		for (int id : player.getGear().keySet())
		{
			ItemDefinition def = itemManager.getItemDefinition(id);
			if (def.getName().toLowerCase().contains("staff"))
			{
				player.setAttackStyle(AttackStyle.MAGE);
				staff = true;
				break;
			}
		}

		if (staff)
		{
			return;
		}

		if (player.getMagicStr() >= player.getRangeStr() && player.getMagicStr() >= player.getMeleeStr())
		{
			player.setAttackStyle(AttackStyle.MAGE);
		}
		else if (player.getRangeStr() >= player.getMagicStr() && player.getRangeStr() >= player.getMeleeStr())
		{
			player.setAttackStyle(AttackStyle.RANGE);
		}
		else if (player.getMeleeStr() >= player.getMagicStr() && player.getMeleeStr() >= player.getRangeStr())
		{
			player.setAttackStyle(AttackStyle.MELEE);
		}
	}

	private void updateWeakness(PlayerContainer player)
	{
		if (player.getMagicDefence() <= player.getRangeDefence() && player.getMagicDefence() <= player.getMeleeDefence())
		{
			player.setWeakness(AttackStyle.MAGE);
		}
		else if (player.getRangeDefence() <= player.getMagicDefence() && player.getRangeDefence() <= player.getMeleeDefence())
		{
			player.setWeakness(AttackStyle.RANGE);
		}
		else if (player.getMeleeDefence() <= player.getRangeDefence() && player.getMeleeDefence() <= player.getMagicDefence())
		{
			player.setWeakness(AttackStyle.MELEE);
		}
	}

	private static void removeEntries(LinkedHashMap<Integer, Integer> map, int quantity)
	{
		for (int i = 0; i < quantity; i++)
		{
			if (!map.entrySet().iterator().hasNext())
			{
				return;
			}
			map.entrySet().remove(map.entrySet().iterator().next());
		}
	}

	private String targetStringBuilder(PlayerContainer player)
	{
		if (player.getPlayer().getInteracting() != null)
		{
			Actor actor = player.getPlayer().getInteracting();
			if (actor instanceof Player)
			{
				return "(Player) " + actor.getName();
			}
			else if (actor instanceof NPC)
			{
				return "(NPC) " + actor.getName();
			}
		}
		return "No Target Detected";
	}
}
