/*
 * Copyright (c) 2016-2017, Abel Briggs
 * Copyright (c) 2017, Kronos <https://github.com/KronosDesign>
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
package net.runelite.client.plugins.idlenotifier;

import com.google.inject.Provides;
import java.awt.TrayIcon;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.AnimationID;
import static net.runelite.api.AnimationID.*;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.GameState;
import net.runelite.api.GraphicID;
import net.runelite.api.Hitsplat;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.SkullIcon;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.events.SpotAnimationChanged;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.Sound;
import net.runelite.client.game.SoundManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.PvPUtil;

//import java.io.IOException;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.UnsupportedAudioFileException;

@PluginDescriptor(
	name = "Idle Notifier",
	description = "Send a notification when going idle, or when HP/Prayer reaches a threshold",
	tags = {"health", "hitpoints", "notifications", "prayer", "pvp", "pker"}
)
@Singleton
public class IdleNotifierPlugin extends Plugin
{
	// This must be more than 500 client ticks (10 seconds) before you get AFK kicked
	private static final int LOGOUT_WARNING_MILLIS = (4 * 60 + 40) * 1000; // 4 minutes and 40 seconds
	private static final int COMBAT_WARNING_MILLIS = 19 * 60 * 1000; // 19 minutes
	private static final int LOGOUT_WARNING_CLIENT_TICKS = LOGOUT_WARNING_MILLIS / Constants.CLIENT_TICK_LENGTH;
	private static final int COMBAT_WARNING_CLIENT_TICKS = COMBAT_WARNING_MILLIS / Constants.CLIENT_TICK_LENGTH;

	private static final int HIGHEST_MONSTER_ATTACK_SPEED = 8; // Except Scarab Mage, but they are with other monsters
	private static final Duration SIX_HOUR_LOGOUT_WARNING_AFTER_DURATION = Duration.ofMinutes(340);

	private static final String FISHING_SPOT = "Fishing spot";

	@Inject
	private Notifier notifier;

	@Inject
	private Client client;

	@Inject
	private SoundManager soundManager;

	@Inject
	private IdleNotifierConfig config;

	@Inject
	private EventBus eventBus;

	private Instant lastAnimating;
	private int lastAnimation = AnimationID.IDLE;
	private Instant lastInteracting;
	private Actor lastInteract;
	private boolean notifyHitpoints = true;
	private boolean notifyPrayer = true;
	private boolean notifyOxygen = true;
	private boolean notifyIdleLogout = true;
	private boolean notify6HourLogout = true;
	private int lastSpecEnergy = 1000;
	private int lastCombatCountdown = 0;
	private Instant sixHourWarningTime;
	private boolean ready;
	private Instant lastTimeItemsUsedUp;
	private List<Integer> itemIdsPrevious = new ArrayList<>();
	private List<Integer> itemQuantitiesPrevious = new ArrayList<>();
	private final List<Integer> itemQuantitiesChange = new ArrayList<>();
	private boolean lastInteractWasCombat;
	private boolean interactingNotified;
	private SkullIcon lastTickSkull = null;
	private boolean isFirstTick = true;

	@Setter(AccessLevel.PACKAGE)
	private boolean animationIdle;
	private boolean animationIdleSound;
	@Setter(AccessLevel.PACKAGE)
	private boolean interactionIdle;
	private boolean interactionIdleSound;
	@Setter(AccessLevel.PACKAGE)
	private boolean logoutIdle;
	private boolean outOfCombatSound;
	private boolean showSkullNotification;
	private boolean showUnskullNotification;
	@Setter(AccessLevel.PACKAGE)
	private int getIdleNotificationDelay;
	@Setter(AccessLevel.PACKAGE)
	private int getHitpointsThreshold;
	private boolean getPlayHealthSound;
	@Setter(AccessLevel.PACKAGE)
	private int getPrayerThreshold;
	private boolean getPlayPrayerSound;
	private int getOxygenThreshold;
	@Setter(AccessLevel.PACKAGE)
	private int getSpecEnergyThreshold;
	private boolean getSpecSound;
	private boolean getOverSpecEnergy;
	private boolean notifyPkers;
	private boolean outOfItemsIdle;

	@Provides
	IdleNotifierConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(IdleNotifierConfig.class);
	}

	void onAnimationChanged(AnimationChanged event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		Player localPlayer = client.getLocalPlayer();
		if (localPlayer != event.getActor())
		{
			return;
		}

		int graphic = localPlayer.getSpotAnimation();
		int animation = localPlayer.getAnimation();
		switch (animation)
		{
			/* Woodcutting */
			case WOODCUTTING_BRONZE:
			case WOODCUTTING_IRON:
			case WOODCUTTING_STEEL:
			case WOODCUTTING_BLACK:
			case WOODCUTTING_MITHRIL:
			case WOODCUTTING_ADAMANT:
			case WOODCUTTING_RUNE:
			case WOODCUTTING_DRAGON:
			case WOODCUTTING_INFERNAL:
			case WOODCUTTING_3A_AXE:
				/* Cooking(Fire, Range) */
			case COOKING_FIRE:
			case COOKING_RANGE:
			case COOKING_WINE:
				/* Crafting(Gem Cutting, Glassblowing, Spinning, Battlestaves, Pottery) */
			case GEM_CUTTING_OPAL:
			case GEM_CUTTING_JADE:
			case GEM_CUTTING_REDTOPAZ:
			case GEM_CUTTING_SAPPHIRE:
			case GEM_CUTTING_EMERALD:
			case GEM_CUTTING_RUBY:
			case GEM_CUTTING_DIAMOND:
			case GEM_CUTTING_AMETHYST:
			case CRAFTING_GLASSBLOWING:
			case CRAFTING_SPINNING:
			case CRAFTING_BATTLESTAVES:
			case CRAFTING_LEATHER:
			case CRAFTING_POTTERS_WHEEL:
			case CRAFTING_POTTERY_OVEN:
				/* Fletching(Cutting, Stringing) */
			case FLETCHING_BOW_CUTTING:
			case FLETCHING_STRING_NORMAL_SHORTBOW:
			case FLETCHING_STRING_OAK_SHORTBOW:
			case FLETCHING_STRING_WILLOW_SHORTBOW:
			case FLETCHING_STRING_MAPLE_SHORTBOW:
			case FLETCHING_STRING_YEW_SHORTBOW:
			case FLETCHING_STRING_MAGIC_SHORTBOW:
			case FLETCHING_STRING_NORMAL_LONGBOW:
			case FLETCHING_STRING_OAK_LONGBOW:
			case FLETCHING_STRING_WILLOW_LONGBOW:
			case FLETCHING_STRING_MAPLE_LONGBOW:
			case FLETCHING_STRING_YEW_LONGBOW:
			case FLETCHING_STRING_MAGIC_LONGBOW:
				/* Smithing(Anvil, Furnace, Cannonballs */
			case SMITHING_ANVIL:
			case SMITHING_SMELTING:
			case SMITHING_CANNONBALL:
				/* Fishing */
			case FISHING_CRUSHING_INFERNAL_EELS:
			case FISHING_CUTTING_SACRED_EELS:
			case FISHING_BIG_NET:
			case FISHING_NET:
			case FISHING_POLE_CAST:
			case FISHING_CAGE:
			case FISHING_HARPOON:
			case FISHING_BARBTAIL_HARPOON:
			case FISHING_DRAGON_HARPOON:
			case FISHING_INFERNAL_HARPOON:
			case FISHING_OILY_ROD:
			case FISHING_KARAMBWAN:
			case FISHING_BAREHAND:
				/* Mining(Normal) */
			case MINING_BRONZE_PICKAXE:
			case MINING_IRON_PICKAXE:
			case MINING_STEEL_PICKAXE:
			case MINING_BLACK_PICKAXE:
			case MINING_MITHRIL_PICKAXE:
			case MINING_ADAMANT_PICKAXE:
			case MINING_RUNE_PICKAXE:
			case MINING_DRAGON_PICKAXE:
			case MINING_DRAGON_PICKAXE_ORN:
			case MINING_INFERNAL_PICKAXE:
			case MINING_3A_PICKAXE:
			case DENSE_ESSENCE_CHIPPING:
			case DENSE_ESSENCE_CHISELING:
				/* Herblore */
			case HERBLORE_PESTLE_AND_MORTAR:
			case HERBLORE_POTIONMAKING:
			case HERBLORE_MAKE_TAR:
				/* Magic */
			case MAGIC_CHARGING_ORBS:
			case MAGIC_LUNAR_PLANK_MAKE:
			case MAGIC_LUNAR_STRING_JEWELRY:
			case MAGIC_MAKE_TABLET:
			case MAGIC_ENCHANTING_JEWELRY:
			case MAGIC_ENCHANTING_AMULET_1:
			case MAGIC_ENCHANTING_AMULET_2:
			case MAGIC_ENCHANTING_AMULET_3:
				/* Prayer */
			case USING_GILDED_ALTAR:
				/* Farming */
			case FARMING_MIX_ULTRACOMPOST:
			case FARMING_HARVEST_BUSH:
			case FARMING_HARVEST_HERB:
			case FARMING_HARVEST_FRUIT_TREE:
			case FARMING_HARVEST_FLOWER:
			case FARMING_HARVEST_ALLOTMENT:
				/* Misc */
			case PISCARILIUS_CRANE_REPAIR:
			case HOME_MAKE_TABLET:
			case SAND_COLLECTION:
				resetTimers();
				lastAnimation = animation;
				lastAnimating = Instant.now();
				interactingNotified = false;
				break;
			case MAGIC_LUNAR_SHARED:
				if (graphic == GraphicID.BAKE_PIE)
				{
					resetTimers();
					lastAnimation = animation;
					lastAnimating = Instant.now();
					interactingNotified = false;
					break;
				}
			case IDLE:
				lastAnimating = Instant.now();
				interactingNotified = false;
				break;
			default:
				// On unknown animation simply assume the animation is invalid and dont throw notification
				lastAnimation = IDLE;
				lastAnimating = null;
		}
	}

	private void onPlayerSpawned(PlayerSpawned event)
	{
		final Player p = event.getPlayer();
		if (this.notifyPkers && p != null && p != client.getLocalPlayer()
			&& PvPUtil.isAttackable(client, p) && !client.isFriended(p.getName(), false)
			&& !client.isClanMember(p.getName()))
		{
			String playerName = p.getName();
			int combat = p.getCombatLevel();
			notifier.notify("PK'er warning! A level " + combat + " player named " + playerName +
				" appeared!", TrayIcon.MessageType.WARNING);
		}
	}

	private void onItemContainerChanged(ItemContainerChanged event)
	{
		ItemContainer itemContainer = event.getItemContainer();

		if (itemContainer != client.getItemContainer(InventoryID.INVENTORY) || !config.outOfItemsIdle())
		{
			return;
		}

		Item[] items = itemContainer.getItems();
		ArrayList<Integer> itemQuantities = new ArrayList<>();
		ArrayList<Integer> itemIds = new ArrayList<>();

		// Populate list of items in inventory without duplicates
		for (Item value : items)
		{
			int itemId = OutOfItemsMapping.mapFirst(value.getId());
			if (itemIds.indexOf(itemId) == -1) // -1 if item not yet in list
			{
				itemIds.add(itemId);
			}
		}

		// Populate quantity of each item in inventory
		for (int j = 0; j < itemIds.size(); j++)
		{
			itemQuantities.add(0);
			for (Item item : items)
			{
				if (itemIds.get(j) == OutOfItemsMapping.mapFirst(item.getId()))
				{
					itemQuantities.set(j, itemQuantities.get(j) + item.getQuantity());
				}
			}
		}

		itemQuantitiesChange.clear();

		// Calculate the quantity of each item consumed by the last action
		if (!itemIdsPrevious.isEmpty())
		{
			for (int i = 0; i < itemIdsPrevious.size(); i++)
			{
				int id = itemIdsPrevious.get(i);
				int currentIndex = itemIds.indexOf(id);
				int currentQuantity;
				if (currentIndex != -1) // -1 if item is no longer in inventory
				{
					currentQuantity = itemQuantities.get(currentIndex);
				}
				else
				{
					currentQuantity = 0;
				}
				itemQuantitiesChange.add(currentQuantity - itemQuantitiesPrevious.get(i));
			}
		}
		else
		{
			itemIdsPrevious = itemIds;
			itemQuantitiesPrevious = itemQuantities;
			return;
		}

		// Check we have enough items left for another action.
		for (int i = 0; i < itemQuantitiesPrevious.size(); i++)
		{
			if (-itemQuantitiesChange.get(i) * 2 > itemQuantitiesPrevious.get(i))
			{
				lastTimeItemsUsedUp = Instant.now();
				return;
			}
		}
		itemIdsPrevious = itemIds;
		itemQuantitiesPrevious = itemQuantities;
	}

	void onInteractingChanged(InteractingChanged event)
	{
		final Actor source = event.getSource();
		if (source != client.getLocalPlayer())
		{
			return;
		}

		final Actor target = event.getTarget();

		// Reset last interact
		if (target != null)
		{
			lastInteract = null;
		}
		else
		{
			lastInteracting = Instant.now();
		}

		final boolean isNpc = target instanceof NPC;

		// If this is not NPC, do not process as we are not interested in other entities
		if (!isNpc)
		{
			return;
		}

		final NPC npc = (NPC) target;
		final NPCDefinition npcComposition = npc.getDefinition();
		final List<String> npcMenuActions = Arrays.asList(npcComposition.getActions());

		if (npcMenuActions.contains("Attack"))
		{
			// Player is most likely in combat with attack-able NPC
			resetTimers();
			lastInteract = target;
			lastInteracting = Instant.now();
			lastInteractWasCombat = true;
		}
		else if (target.getName() != null && target.getName().contains(FISHING_SPOT))
		{
			// Player is fishing
			resetTimers();
			lastInteract = target;
			lastInteracting = Instant.now();
			lastInteractWasCombat = false;
		}
	}

	void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		lastInteracting = null;

		GameState state = gameStateChanged.getGameState();

		switch (state)
		{
			case LOGIN_SCREEN:
				resetTimers();
				isFirstTick = true;
				break;
			case HOPPING:
				isFirstTick = true;
				ready = true;
				break;
			case LOGGING_IN:
			case CONNECTION_LOST:
				ready = true;
				break;
			case LOGGED_IN:
				if (ready)
				{
					sixHourWarningTime = Instant.now().plus(SIX_HOUR_LOGOUT_WARNING_AFTER_DURATION);
					ready = false;
					resetTimers();
				}

				break;
		}
	}

	void onHitsplatApplied(HitsplatApplied event)
	{
		if (event.getActor() != client.getLocalPlayer())
		{
			return;
		}

		final Hitsplat hitsplat = event.getHitsplat();

		if (hitsplat.getHitsplatType() == Hitsplat.HitsplatType.DAMAGE
			|| hitsplat.getHitsplatType() == Hitsplat.HitsplatType.BLOCK)
		{
			lastCombatCountdown = HIGHEST_MONSTER_ATTACK_SPEED;
		}
	}

	private void onSpotAnimationChanged(SpotAnimationChanged event)
	{
		Actor actor = event.getActor();

		if (actor != client.getLocalPlayer())
		{
			return;
		}

		if (actor.getSpotAnimation() == GraphicID.SPLASH)
		{
			lastCombatCountdown = HIGHEST_MONSTER_ATTACK_SPEED;
		}
	}

	void onGameTick(GameTick event)
	{
		skullNotifier();

		final Player local = client.getLocalPlayer();
		final Duration waitDuration = Duration.ofMillis(this.getIdleNotificationDelay);
		lastCombatCountdown = Math.max(lastCombatCountdown - 1, 0);

		if (client.getGameState() != GameState.LOGGED_IN
			|| local == null
			// If user has clicked in the last second then they're not idle so don't send idle notification
			|| System.currentTimeMillis() - client.getMouseLastPressedMillis() < 1000
			|| client.getKeyboardIdleTicks() < 10)
		{
			resetTimers();
			resetOutOfItemsIdleChecks();
			return;
		}

		if (this.logoutIdle && checkIdleLogout())
		{
			notifier.notify("[" + local.getName() + "] is about to log out from idling too long!");
		}

		if (check6hrLogout())
		{
			notifier.notify("[" + local.getName() + "] is about to log out from being online for 6 hours!");
		}

		if (this.outOfItemsIdle && checkOutOfItemsIdle(waitDuration))
		{
			notifier.notify("[" + local.getName() + "] has run out of items!");
			// If this triggers, don't also trigger animation idle notification afterwards.
			lastAnimation = IDLE;
		}

		if (this.interactionIdle && checkInteractionIdle(waitDuration, local))
		{
			if (lastInteractWasCombat)
			{
				notifier.notify("[" + local.getName() + "] is now out of combat!");
				if (this.outOfCombatSound)
				{
					soundManager.playSound(Sound.OUT_OF_COMBAT);
				}
			}
			else
			{
				notifier.notify("[" + local.getName() + "] is now idle!");
				if (this.interactionIdleSound)
				{
					soundManager.playSound(Sound.IDLE);
				}
			}
			interactingNotified = true;
		}

		if (this.animationIdle && checkAnimationIdle(waitDuration, local))
		{
			notifier.notify("[" + local.getName() + "] is now idle!");
			if (this.animationIdleSound)
			{
				soundManager.playSound(Sound.IDLE);
			}
		}

		if (checkLowHitpoints())
		{
			notifier.notify("[" + local.getName() + "] has low hitpoints!");
			if (this.getPlayHealthSound)
			{
				soundManager.playSound(Sound.LOW_HEATLH);
			}
		}

		if (checkLowPrayer())
		{
			notifier.notify("[" + local.getName() + "] has low prayer!");
			if (this.getPlayPrayerSound)
			{
				soundManager.playSound(Sound.LOW_PRAYER);
			}
		}

		if (checkLowOxygen())
		{
			notifier.notify("[" + local.getName() + "] has low oxygen!");
		}

		if (checkFullSpecEnergy())
		{
			notifier.notify("[" + local.getName() + "] has restored spec energy!");
			if (this.getSpecSound)
			{
				soundManager.playSound(Sound.RESTORED_SPECIAL_ATTACK);
			}
		}
	}

	private boolean checkFullSpecEnergy()
	{
		int currentSpecEnergy = client.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT);

		int threshold = this.getSpecEnergyThreshold * 10;
		if (threshold == 0)
		{
			lastSpecEnergy = currentSpecEnergy;
			return false;
		}

		// Check if we have regenerated over the threshold, and that the
		// regen was small enough.
		boolean notify = lastSpecEnergy < threshold && currentSpecEnergy >= threshold && currentSpecEnergy - lastSpecEnergy <= 100;

		notify = (notify) || ((this.getOverSpecEnergy) && (currentSpecEnergy >= threshold) && (currentSpecEnergy != lastSpecEnergy) && (currentSpecEnergy - lastSpecEnergy <= 100));

		lastSpecEnergy = currentSpecEnergy;
		return notify;
	}

	private boolean checkLowOxygen()
	{
		if (this.getOxygenThreshold == 0)
		{
			return false;
		}
		if (this.getOxygenThreshold >= client.getVar(Varbits.OXYGEN_LEVEL) * 0.1)
		{
			if (!notifyOxygen)
			{
				notifyOxygen = true;
				return true;
			}
		}
		else
		{
			notifyOxygen = false;
		}
		return false;
	}

	private boolean checkLowHitpoints()
	{
		if (this.getHitpointsThreshold == 0)
		{
			return false;
		}
		if (client.getRealSkillLevel(Skill.HITPOINTS) > this.getHitpointsThreshold)
		{
			if (client.getBoostedSkillLevel(Skill.HITPOINTS) + client.getVar(Varbits.NMZ_ABSORPTION) <= this.getHitpointsThreshold)
			{
				if (!notifyHitpoints)
				{
					notifyHitpoints = true;
					return true;
				}
			}
			else
			{
				notifyHitpoints = false;
			}
		}

		return false;
	}

	private boolean checkLowPrayer()
	{
		if (this.getPrayerThreshold == 0)
		{
			return false;
		}
		if (client.getRealSkillLevel(Skill.PRAYER) > this.getPrayerThreshold)
		{
			if (client.getBoostedSkillLevel(Skill.PRAYER) <= this.getPrayerThreshold)
			{
				if (!notifyPrayer)
				{
					notifyPrayer = true;
					return true;
				}
			}
			else
			{
				notifyPrayer = false;
			}
		}

		return false;
	}

	private boolean checkInteractionIdle(Duration waitDuration, Player local)
	{
		if (lastInteract == null)
		{
			return false;
		}

		final Actor interact = local.getInteracting();

		if (interact == null)
		{
			if (lastInteracting != null
				&& Instant.now().compareTo(lastInteracting.plus(waitDuration)) >= 0
				&& lastCombatCountdown == 0)
			{
				lastInteract = null;
				lastInteracting = null;
				return true;
			}
		}
		else
		{
			lastInteracting = Instant.now();
		}

		return false;
	}

	private boolean checkIdleLogout()
	{
		// Check clientside AFK first, because this is required for the server to disconnect you for being first
		int idleClientTicks = client.getKeyboardIdleTicks();
		if (client.getMouseIdleTicks() < idleClientTicks)
		{
			idleClientTicks = client.getMouseIdleTicks();
		}

		if (idleClientTicks < LOGOUT_WARNING_CLIENT_TICKS)
		{
			notifyIdleLogout = true;
			return false;
		}

		// If we are not receiving hitsplats then we can be afk kicked
		if (lastCombatCountdown <= 0)
		{
			boolean warn = notifyIdleLogout;
			notifyIdleLogout = false;
			return warn;
		}

		// We are in combat, so now we have to check for the timer that knocks you out of combat
		// I think there are other conditions that I don't know about, because during testing I just didn't
		// get removed from combat sometimes.
		final long lastInteractionAgo = System.currentTimeMillis() - client.getMouseLastPressedMillis();
		if (lastInteractionAgo < COMBAT_WARNING_MILLIS || client.getKeyboardIdleTicks() < COMBAT_WARNING_CLIENT_TICKS)
		{
			notifyIdleLogout = true;
			return false;
		}

		boolean warn = notifyIdleLogout;
		notifyIdleLogout = false;
		return warn;
	}

	private boolean check6hrLogout()
	{
		if (sixHourWarningTime == null)
		{
			return false;
		}

		if (Instant.now().compareTo(sixHourWarningTime) >= 0)
		{
			if (notify6HourLogout)
			{
				notify6HourLogout = false;
				return true;
			}
		}
		else
		{
			notify6HourLogout = true;
		}

		return false;
	}

	private boolean checkAnimationIdle(Duration waitDuration, Player local)
	{
		if (lastAnimation == IDLE || interactingNotified)
		{
			return false;
		}

		final int animation = local.getAnimation();

		if (animation == IDLE)
		{
			if (lastAnimating != null && Instant.now().compareTo(lastAnimating.plus(waitDuration)) >= 0)
			{
				lastAnimation = IDLE;
				lastAnimating = null;
				return true;
			}
		}
		else
		{
			lastAnimating = Instant.now();
		}

		return false;
	}

	private boolean checkOutOfItemsIdle(Duration waitDuration)
	{
		if (lastTimeItemsUsedUp == null)
		{
			return false;
		}

		if (Instant.now().compareTo(lastTimeItemsUsedUp.plus(waitDuration)) >= 0)
		{
			resetTimers();
			resetOutOfItemsIdleChecks();
			return true;
		}

		return false;
	}

	private void resetTimers()
	{
		final Player local = client.getLocalPlayer();

		// Reset animation idle timer
		lastAnimating = null;
		if (client.getGameState() == GameState.LOGIN_SCREEN || local == null || local.getAnimation() != lastAnimation)
		{
			lastAnimation = IDLE;
		}

		// Reset interaction idle timer
		lastInteracting = null;
		if (client.getGameState() == GameState.LOGIN_SCREEN || local == null || local.getInteracting() != lastInteract)
		{
			lastInteract = null;
		}
	}

	private void resetOutOfItemsIdleChecks()
	{
		lastTimeItemsUsedUp = null;
		itemQuantitiesChange.clear();
		itemIdsPrevious.clear();
		itemQuantitiesPrevious.clear();
	}

	private void skullNotifier()
	{
		final Player local = client.getLocalPlayer();
		SkullIcon currentTickSkull = local.getSkullIcon();
		EnumSet worldTypes = client.getWorldType();
		if (!(worldTypes.contains(WorldType.DEADMAN) || worldTypes.contains(WorldType.SEASONAL_DEADMAN)))
		{
			if (!isFirstTick)
			{
				if (this.showSkullNotification && lastTickSkull == null && currentTickSkull == SkullIcon.SKULL)
				{
					notifier.notify("[" + local.getName() + "] is now skulled!");
				}
				else if (this.showUnskullNotification && lastTickSkull == SkullIcon.SKULL && currentTickSkull == null)
				{
					notifier.notify("[" + local.getName() + "] is now unskulled!");
				}
			}
			else
			{
				isFirstTick = false;
			}

			lastTickSkull = currentTickSkull;
		}
	}

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();
		addSubscriptions();
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(AnimationChanged.class, this, this::onAnimationChanged);
		eventBus.subscribe(PlayerSpawned.class, this, this::onPlayerSpawned);
		eventBus.subscribe(ItemContainerChanged.class, this, this::onItemContainerChanged);
		eventBus.subscribe(InteractingChanged.class, this, this::onInteractingChanged);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		eventBus.subscribe(HitsplatApplied.class, this, this::onHitsplatApplied);
		eventBus.subscribe(SpotAnimationChanged.class, this, this::onSpotAnimationChanged);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("idlenotifier"))
		{
			return;
		}

		updateConfig();
	}

	private void updateConfig()
	{
		this.animationIdle = config.animationIdle();
		this.animationIdleSound = config.animationIdleSound();
		this.interactionIdle = config.interactionIdle();
		this.interactionIdleSound = config.interactionIdleSound();
		this.logoutIdle = config.logoutIdle();
		this.outOfCombatSound = config.outOfCombatSound();
		this.showSkullNotification = config.showSkullNotification();
		this.showUnskullNotification = config.showUnskullNotification();
		this.getIdleNotificationDelay = config.getIdleNotificationDelay();
		this.getHitpointsThreshold = config.getHitpointsThreshold();
		this.getPlayHealthSound = config.getPlayHealthSound();
		this.getPrayerThreshold = config.getPrayerThreshold();
		this.getPlayPrayerSound = config.getPlayPrayerSound();
		this.getOxygenThreshold = config.getOxygenThreshold();
		this.getSpecEnergyThreshold = config.getSpecEnergyThreshold();
		this.getSpecSound = config.getSpecSound();
		this.getOverSpecEnergy = config.getOverSpecEnergy();
		this.notifyPkers = config.notifyPkers();
		this.outOfItemsIdle = config.outOfItemsIdle();
	}
}
