/*
 * Copyright (c) 2019, kThisIsCvpv <https://github.com/kThisIsCvpv>
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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

package net.runelite.client.plugins.gauntlet;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.NpcID;
import net.runelite.api.ObjectID;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.ProjectileID;
import net.runelite.api.SoundEffectID;
import net.runelite.api.Varbits;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Gauntlet",
	description = "All-in-one plugin for the Gauntlet.",
	tags = {"Gauntlet"},
	enabledByDefault = false
)

public class GauntletPlugin extends Plugin
{
	private static final int BOW_ATTACK = 426;
	private static final int STAFF_ATTACK = 1167;
	private static final int LIGHTNING_ANIMATION = 8418;
	private static final Set<Integer> TORNADO_NPC_IDS = ImmutableSet.of(9025, 9039);
	private static final Set<Integer> MELEE_ANIMATIONS = ImmutableSet.of(395, 401, 400, 401, 386, 390, 422, 423, 401, 428, 440);
	private static final Set<Integer> HUNLEFF_MAGE_PROJECTILES = ImmutableSet.of(ProjectileID.HUNLEFF_MAGE_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_MAGE_ATTACK);
	private static final Set<Integer> HUNLEFF_RANGE_PROJECTILES = ImmutableSet.of(ProjectileID.HUNLEFF_RANGE_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_RANGE_ATTACK);
	private static final Set<Integer> HUNLEFF_PRAYER_PROJECTILES = ImmutableSet.of(ProjectileID.HUNLEFF_PRAYER_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_PRAYER_ATTACK);
	private static final Set<Integer> HUNLEFF_PROJECTILES = ImmutableSet.of(ProjectileID.HUNLEFF_PRAYER_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_PRAYER_ATTACK,
		ProjectileID.HUNLEFF_RANGE_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_RANGE_ATTACK, ProjectileID.HUNLEFF_MAGE_ATTACK, ProjectileID.HUNLEFF_CORRUPTED_MAGE_ATTACK
	);
	private static final Set<Integer> HUNLEFF_NPC_IDS = ImmutableSet.of(NpcID.CRYSTALLINE_HUNLLEF, NpcID.CRYSTALLINE_HUNLLEF_9022, NpcID.CRYSTALLINE_HUNLLEF_9023,
		NpcID.CRYSTALLINE_HUNLLEF_9024, NpcID.CORRUPTED_HUNLLEF, NpcID.CORRUPTED_HUNLLEF_9036, NpcID.CORRUPTED_HUNLLEF_9037, NpcID.CORRUPTED_HUNLLEF_9038
	);
	private static final Set<Integer> RESOURCES = ImmutableSet.of(ObjectID.CRYSTAL_DEPOSIT, ObjectID.CORRUPT_DEPOSIT, ObjectID.PHREN_ROOTS,
		ObjectID.PHREN_ROOTS_36066, ObjectID.FISHING_SPOT_36068, ObjectID.FISHING_SPOT_35971, ObjectID.GRYM_ROOT, ObjectID.GRYM_ROOT_36070,
		ObjectID.LINUM_TIRINUM, ObjectID.LINUM_TIRINUM_36072
	);

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
	private GauntletConfig config;
	@Inject
	private EventBus eventBus;
	@Inject
	private GauntletTimer timer;
	@Inject
	private SkillIconManager skillIconManager;
	@Getter(AccessLevel.PACKAGE)
	private final Set<ObjectContainer> resources = new HashSet<>();
	@Getter(AccessLevel.PACKAGE)
	private final Set<ProjectileContainer> projectiles = new HashSet<>();
	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private NPC hunleff;
	@Getter(AccessLevel.PACKAGE)
	private Set<NPC> tornado = new HashSet<>();
	boolean completeStartup = false;
	boolean countBossAttacks;
	boolean countPlayerAttacks;
	boolean displayTimerChat;
	boolean highlightResourcesColor;
	boolean highlightResourcesIcons;
	boolean overlayBoss;
	boolean overlayBossPrayer;
	boolean overlayTornadoes;
	BossAttackPhase currentPhase = BossAttackPhase.UNKNOWN;
	int bossCounter = 0;
	int playerCounter = 6;
	int tornadoTicks = 20;
	private boolean displayTimerWidget;
	private boolean timerVisible = true;
	private boolean uniqueAttackVisual;
	private boolean uniquePrayerAudio;
	private boolean uniquePrayerVisual;
	@Getter(AccessLevel.PACKAGE)
	private int iconSize;

	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}

	@Override
	protected void startUp()
	{
		addSubscriptions();
		updateConfig();
		resetCounters();
		timerVisible = this.displayTimerWidget;
		timer.resetStates();
		if (timerVisible)
		{
			overlayManager.add(timer);
		}
		overlayManager.add(overlay);
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
		resources.clear();
		projectiles.clear();
		tornado.clear();
		setHunleff(null);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(AnimationChanged.class, this, this::onAnimationChanged);
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(GameObjectDespawned.class, this, this::onGameObjectDespawned);
		eventBus.subscribe(GameObjectSpawned.class, this, this::onGameObjectSpawned);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(NpcDespawned.class, this, this::onNpcDespawned);
		eventBus.subscribe(NpcSpawned.class, this, this::onNpcSpawned);
		eventBus.subscribe(ProjectileSpawned.class, this, this::onProjectileSpawned);
		eventBus.subscribe(VarbitChanged.class, this, this::onVarbitChanged);
	}

	public void onAnimationChanged(AnimationChanged event)
	{
		final Actor actor = event.getActor();

		// This section handles the player counter.
		if (actor instanceof Player && fightingBoss())
		{
			final Player player = (Player) actor;
			final int anim = player.getAnimation();

			if (!player.getName().equals(client.getLocalPlayer().getName()) || anim == -1)
			{
				return;
			}

			NPCDefinition comp = hunleff.getDefinition();

			if (comp == null || comp.getOverheadIcon() == null)
			{
				return;
			}

			final HeadIcon prayer = comp.getOverheadIcon();

			switch (prayer)
			{
				case MELEE:
					if (MELEE_ANIMATIONS.contains(anim))
					{
						playerCounter--;
						if (playerCounter <= 0)
						{
							playerCounter = 6;
						}
					}
					break;
				case RANGED:
					if (BOW_ATTACK == anim)
					{
						playerCounter--;
						if (playerCounter <= 0)
						{
							playerCounter = 6;
						}
					}
					break;
				case MAGIC:
					if (STAFF_ATTACK == anim)
					{
						playerCounter--;
						if (playerCounter <= 0)
						{
							playerCounter = 6;
						}
					}
					break;
				default:
					break;
			}
		}

		// This section handles the boss attack counter if they perform a lightning attack.
		if (actor instanceof NPC)
		{
			final NPC npc = (NPC) actor;

			if (npc == hunleff)
			{
				if (npc.getAnimation() == LIGHTNING_ANIMATION)
				{
					this.doAttack(BossAttack.LIGHTNING);
				}
			}
		}

	}

	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("Gauntlet"))
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
	}

	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		final GameObject obj = event.getGameObject();
		if (RESOURCES.contains(obj.getId()))
		{
			resources.removeIf(object -> object.getGameObject() == obj);
		}
	}

	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		final GameObject obj = event.getGameObject();
		if (RESOURCES.contains(obj.getId()))
		{
			resources.add(new ObjectContainer(obj, event.getTile(), skillIconManager));
		}
	}

	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOADING)
		{
			resources.clear();
		}
	}

	public void onGameTick(GameTick event)
	{
		// This handles the timer based on player health.
		if (this.completeStartup)
		{
			timer.checkStates(false);
		}
		if (tornado.size() > 0)
		{
			tornadoTicks--;
			if (tornadoTicks <= 0)
			{
				tornadoTicks = 20;
			}
		}
	}

	public void onNpcDespawned(NpcDespawned event)
	{
		final NPC npc = event.getNpc();
		if (HUNLEFF_NPC_IDS.contains(npc.getId()))
		{
			resetCounters();
			setHunleff(null);
		}
		else if (TORNADO_NPC_IDS.contains(npc.getId()))
		{
			tornado.removeIf(tornado -> tornado == npc);
		}
	}

	public void onNpcSpawned(NpcSpawned event)
	{
		final NPC npc = event.getNpc();
		if (HUNLEFF_NPC_IDS.contains(npc.getId()))
		{
			resetCounters();
			setHunleff(npc);
		}
		else if (TORNADO_NPC_IDS.contains(npc.getId()))
		{
			tornado.add(npc);
		}
	}

	private void onProjectileSpawned(ProjectileSpawned event)
	{
		final Projectile proj = event.getProjectile();

		if (HUNLEFF_PROJECTILES.contains(proj.getId()))
		{
			projectiles.add(new ProjectileContainer(proj, skillIconManager));
			if (HUNLEFF_MAGE_PROJECTILES.contains(proj.getId()))
			{
				this.doAttack(BossAttack.MAGIC);
			}
			else if (HUNLEFF_PRAYER_PROJECTILES.contains(proj.getId()))
			{
				this.doAttack(BossAttack.PRAYER);
			}
			else if (HUNLEFF_RANGE_PROJECTILES.contains(proj.getId()))
			{
				this.doAttack(BossAttack.RANGE);
			}
		}
	}

	public void onVarbitChanged(VarbitChanged event)
	{
		if (this.completeStartup)
		{
			timer.checkStates(true);
		}
	}

	private void resetCounters()
	{
		bossCounter = 0;
		currentPhase = BossAttackPhase.UNKNOWN;
		playerCounter = 6;
		tornadoTicks = 20;
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

	boolean fightingBoss()
	{
		return client.getVar(Varbits.GAUNTLET_FINAL_ROOM_ENTERED) == 1;
	}

	boolean startedGauntlet()
	{
		return client.getVar(Varbits.GAUNTLET_ENTERED) == 1;
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
