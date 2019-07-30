/*
 * THIS SOFTWARE WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI
 * No rights reserved. Use, redistribute, and modify at your own discretion,
 * and in accordance with Yagex and RuneLite guidelines.
 * However, aforementioned monkey would prefer if you don't sell this plugin for profit.
 * Good luck on your raids!
 */

package net.runelite.client.plugins.gauntlet;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.SoundEffectID;
import net.runelite.api.Tile;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameObjectChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@PluginDescriptor(
	name = "Gauntlet",
	description = "All-in-one plugin for the Gauntlet.",
	tags = {"Gauntlet"},
	enabledByDefault = false
)

public class GauntletPlugin extends Plugin
{

	BufferedImage imageCrystalDeposit;
	BufferedImage imagePhrenRoots;
	BufferedImage imageFishingSpot;
	BufferedImage imageGrymRoot;
	BufferedImage imageLinumTirinum;

	BufferedImage imageAttackRange;
	BufferedImage imageAttackMage;
	BufferedImage imageAttackPrayer;

	final Map<GameObject, Tile> resources = new HashMap<>();

	public Set<Projectile> projectiles = new HashSet<>();

	int bossCounter = 0; // Attacks until the boss changes attack styles.
	BossAttackPhase currentPhase = BossAttackPhase.UNKNOWN;

	int playerCounter = 6; // Attacks until the boss changes prayer.

	public enum BossAttackPhase
	{
		MAGIC, RANGE, UNKNOWN
	}

	public enum BossAttack
	{
		MAGIC, RANGE, PRAYER, LIGHTNING
	}

	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Getter(AccessLevel.PUBLIC)
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private GauntletOverlay overlay;
	@Inject
	private SkillIconManager iconManager;
	@Inject
	private GauntletConfig config;
	@Inject
	private EventBus eventBus;
	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}
	@Inject
	private GauntletTimer timer;
	private boolean timerVisible = true;
	boolean tornadoesActive = false;
	int tornadoTicks = GauntletUtils.TORNADO_TICKS;
	boolean completeStartup = false;
	private boolean displayTimerWidget;
	boolean highlightResourcesColor;
	boolean highlightResourcesIcons;
	boolean countBossAttacks;
	boolean countPlayerAttacks;
	private boolean uniquePrayerAudio;
	boolean uniquePrayerVisual;
	boolean uniqueAttackVisual;
	boolean overlayBoss;
	boolean overlayBossPrayer;
	boolean overlayTornadoes;
	boolean displayTimerChat;
	private int iconSize;

	@Override
	protected void startUp()
	{
		addSubscriptions();
		updateConfig();
		loadImages(this.iconSize);
		resetCounters();
		timerVisible = this.displayTimerWidget;
		timer.resetStates();
		if (timerVisible)
		{
			overlayManager.add(timer);
		}
		overlayManager.add(overlay);
		// This section checks if the user is trying to start the timer while mid-raid.
		// Varbits can only be checked on the client thread. Perform init check if necessary.
		if (client.getGameState() != GameState.STARTING && client.getGameState() != GameState.UNKNOWN)
		{
			completeStartup = false;
			clientThread.invoke(() -> {
				timer.initStates();
				completeStartup = true;
			});
		}
		else
		{
			completeStartup = true;
		}
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
		resetCounters();
		timer.resetStates();

		if (timerVisible)
		{
			overlayManager.remove(timer);
			timerVisible = false;
		}

		overlayManager.remove(overlay);
	}
	private void addSubscriptions()
	{
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(VarbitChanged.class, this, this::onVarbitChanged);
		eventBus.subscribe(NpcSpawned.class, this, this::onNpcSpawned);
		eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
		eventBus.subscribe(AnimationChanged.class, this, this::onAnimationChanged);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(GameObjectSpawned.class, this, this::onGameObjectSpawned);
		eventBus.subscribe(GameObjectChanged.class, this, this::onGameObjectChanged);
		eventBus.subscribe(GameObjectDespawned.class, this, this::onGameObjectDespawned);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
	}

	private void loadImages(int imageSize)
	{
		imageCrystalDeposit = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.MINING, true), imageSize, imageSize);
		imagePhrenRoots = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.WOODCUTTING, true), imageSize, imageSize);
		imageFishingSpot = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.FISHING, true), imageSize, imageSize);
		imageGrymRoot = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.HERBLORE, true), imageSize, imageSize);
		imageLinumTirinum = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.FARMING, true), imageSize, imageSize);

		imageAttackMage = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.MAGIC, true), imageSize, imageSize);
		imageAttackRange = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.RANGED, true), imageSize, imageSize);
		imageAttackPrayer = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.PRAYER, true), imageSize, imageSize);
	}

	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup() == null || event.getKey() == null || !event.getGroup().equals("Gauntlet"))
		{
			return;
		}
		updateConfig();

		if (event.getKey().equals("displayTimerWidget"))
		{
			if (this.displayTimerWidget && !timerVisible)
			{
				overlayManager.add(timer);
				timerVisible = true;
			}
			else if (!this.displayTimerWidget && timerVisible)
			{
				overlayManager.remove(timer);
				timerVisible = false;
			}
		}
		else if (event.getKey().equals("iconSize"))
		{
			loadImages(this.iconSize);
		}
	}

	public void onVarbitChanged(VarbitChanged event)
	{
		// This handles the timer based on varp states.
		if (this.completeStartup)
		{
			timer.checkStates(true);
		}
	}

	public void onNpcSpawned(NpcSpawned event)
	{
		NPC npc = event.getNpc();
		if (GauntletUtils.isBoss(npc))
		{
			resetCounters();
		}
	}

	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		if (GauntletUtils.isBoss(npc))
		{
			resetCounters();
		}
	}

	/**
	 * Reset all boss and player related counter resources.
	 */
	private void resetCounters()
	{
		bossCounter = 0;
		currentPhase = BossAttackPhase.UNKNOWN;

		playerCounter = 6;

		tornadoesActive = false;
		tornadoTicks = GauntletUtils.TORNADO_TICKS;

		projectiles.clear();
	}

	/**
	 * Method is called when an attack is performed by the boss.
	 *
	 * @param style BossAttack ; the attack performed by the boss
	 */
	private void doAttack(BossAttack style)
	{
		// Prayer attacks are magic related. We only care if it's prayer to play the unique sound.
		// This section will change all PRAYER attacks to MAGIC.
		if (style == BossAttack.PRAYER)
		{
			if (this.uniquePrayerAudio)
			{
				client.playSoundEffect(SoundEffectID.MAGIC_SPLASH_BOING);
			}

			style = BossAttack.MAGIC;
		}

		// This section will decrement the boss attack counter by 1.
		if (style == BossAttack.LIGHTNING)
		{
			bossCounter--;
		}
		else if (style == BossAttack.RANGE)
		{
			if (currentPhase != BossAttackPhase.RANGE)
			{
				currentPhase = BossAttackPhase.RANGE;
				bossCounter = 3;
			}
			else
			{
				bossCounter--;
			}
		}
		else if (style == BossAttack.MAGIC)
		{
			if (currentPhase != BossAttackPhase.MAGIC)
			{
				currentPhase = BossAttackPhase.MAGIC;
				bossCounter = 3;
			}
			else
			{
				bossCounter--;
			}
		}

		// This section will reset the boss attack counter if necessary.
		if (bossCounter <= 0)
		{
			BossAttackPhase nextPhase;

			switch (currentPhase)
			{
				case MAGIC:
					bossCounter = 4;
					nextPhase = BossAttackPhase.RANGE;
					break;
				case RANGE:
					bossCounter = 4;
					nextPhase = BossAttackPhase.MAGIC;
					break;
				default:
					bossCounter = 0;
					nextPhase = BossAttackPhase.UNKNOWN;
					break;
			}

			currentPhase = nextPhase;
		}
	}

	public void onAnimationChanged(AnimationChanged event)
	{
		Actor actor = event.getActor();

		// This section handles the player counter.
		if (actor instanceof Player && GauntletUtils.inBoss(client))
		{
			Player p = (Player) actor;
			if (p.getName().equals(client.getLocalPlayer().getName()))
			{
				int id = p.getAnimation();
				if (id != -1)
				{
					// Detect the overhead prayer that the boss is using and determine the list of animations that the boss is currently immune to.
					int[] wrong_style = new int[]{};

					for (NPC npc : this.client.getNpcs())
					{
						if (GauntletUtils.isBoss(npc))
						{
							NPCDefinition comp = npc.getDefinition();
							if (comp != null)
							{
								HeadIcon prayer = comp.getOverheadIcon();
								if (prayer != null)
								{
									switch (prayer)
									{
										case MELEE:
											wrong_style = GauntletUtils.MELEE_ANIMATIONS;
											break;
										case RANGED:
											wrong_style = GauntletUtils.RANGE_ANIMATIONS;
											break;
										case MAGIC:
											wrong_style = GauntletUtils.MAGE_ANIMATIONS;
											break;
										default:
											wrong_style = new int[]{};
											break;
									}

									break;
								}
							}
						}
					}

					// Check that the player performed an attack animation that the boss isn't immune to.
					if (GauntletUtils.arrayContainsInteger(GauntletUtils.PLAYER_ANIMATIONS, id) && !GauntletUtils.arrayContainsInteger(wrong_style, id))
					{
						// Attack is valid. Decrement the player attack counter and reset it if necessary.
						playerCounter--;
						if (playerCounter <= 0)
						{
							playerCounter = 6;
						}
					}
				}
			}
		}

		// This section handles the boss attack counter if they perform a lightning attack.
		if (actor instanceof NPC)
		{
			NPC npc = (NPC) actor;
			if (GauntletUtils.isBoss(npc))
			{
				int id = npc.getAnimation();
				if (id == GauntletUtils.BOSS_ANIMATION_LIGHTNING)
				{
					this.doAttack(BossAttack.LIGHTNING);
				}
			}
		}
	}

	public void onGameTick(GameTick event)
	{
		// This handles the timer based on player health.
		if (this.completeStartup)
		{
			timer.checkStates(false);
		}

		// This section handles the boss attack counter if they perform a projectile attack.
		Set<Projectile> newProjectiles = new HashSet<>();

		for (Projectile projectile : client.getProjectiles())
		{
			newProjectiles.add(projectile);

			if (!projectiles.contains(projectile))
			{
				int id = projectile.getId();
				if (GauntletUtils.arrayContainsInteger(GauntletUtils.PROJECTILE_MAGIC, id))
				{
					this.doAttack(BossAttack.MAGIC);
				}
				else if (GauntletUtils.arrayContainsInteger(GauntletUtils.PROJECTILE_PRAYER, id))
				{
					this.doAttack(BossAttack.PRAYER);
				}
				else if (GauntletUtils.arrayContainsInteger(GauntletUtils.PROJECTILE_RANGE, id))
				{
					this.doAttack(BossAttack.RANGE);
				}
			}
		}

		projectiles.clear();
		projectiles = newProjectiles;

		// This section handles lightning decay.
		if (!this.tornadoesActive)
		{
			for (NPC npc : client.getNpcs())
			{
				if (GauntletUtils.isTornado(npc))
				{
					tornadoesActive = true;
					tornadoTicks = GauntletUtils.TORNADO_TICKS;
					break;
				}
			}
		}
		else
		{
			tornadoTicks--;
			if (tornadoTicks <= 0)
			{
				tornadoesActive = false;
				tornadoTicks = GauntletUtils.TORNADO_TICKS;
			}
		}
	}


	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		onGameObject(event.getTile(), null, event.getGameObject());
	}

	public void onGameObjectChanged(GameObjectChanged event)
	{
		onGameObject(event.getTile(), event.getPrevious(), event.getGameObject());
	}
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		onGameObject(event.getTile(), event.getGameObject(), null);
	}

	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOADING)
		{
			resources.clear();
		}
	}

	/**
	 * Called when a GameObject spawns, changes, or despawns.
	 *
	 * @param tile      Tile
	 * @param oldObject TileObject
	 * @param newObject TileObject
	 */
	private void onGameObject(Tile tile, GameObject oldObject, GameObject newObject)
	{
		resources.remove(oldObject);

		if (newObject == null)
		{
			return;
		}

		int id = newObject.getId();

		if (GauntletUtils.arrayContainsInteger(GauntletUtils.RESOURCE_IDS, id))
		{
			resources.put(newObject, tile);
		}
	}

	private void updateConfig()
	{
		this.highlightResourcesColor = config.highlightResourcesColor();
		this.highlightResourcesIcons = config.highlightResourcesIcons();
		this.iconSize = config.iconSize();
		this.countBossAttacks = config.countBossAttacks();
		this.countPlayerAttacks = config.countPlayerAttacks();
		this.uniquePrayerAudio = config.uniquePrayerAudio();
		this.uniquePrayerVisual = config.uniquePrayerVisual();
		this.uniqueAttackVisual = config.uniqueAttackVisual();
		this.overlayBoss = config.overlayBoss();
		this.overlayBossPrayer = config.overlayBossPrayer();
		this.overlayTornadoes = config.overlayTornadoes();
		this.displayTimerWidget = config.displayTimerWidget();
		this.displayTimerChat = config.displayTimerChat();
	}
}
