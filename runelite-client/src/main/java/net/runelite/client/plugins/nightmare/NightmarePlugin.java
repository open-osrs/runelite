package net.runelite.client.plugins.nightmare;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
//import static net.runelite.api.NpcID.nightmarewhenitsupdated;                     //TODO: this here is the thing to change

@PluginDescriptor(
	name = "Nightmare of Ashihama",
	description = "Show what prayer to use and which tiles to avoid",
	tags = {"bosses", "combat", "nm", "overlay", "nightmare", "pve", "pvm", "ashihama"},
	type = PluginType.PVM,
	enabledByDefault = false
)

@Singleton
public class NightmarePlugin extends Plugin {
	// Nightmare's attack animations
	private static final int NIGHTMARE_HUSK_SPAWN = 8565;
	private static final int NIGHTMARE_CHARGE_1 = 8597;
	private static final int NIGHTMARE_SHADOW_SPAWN = 8598;
	private static final int NIGHTMARE_CURSE = 8599;
	private static final int NIGHTMARE_MUSHROOM = 8600;
	private static final int NIGHTMARE_QUADRANTS = 8601;
	private static final int NIGHTMARE_SLEEP_DAMAGE = 8604;
	private static final int NIGHTMARE_PARASITE_TOSS = 8605;
	private static final int NIGHTMARE_PARASITE_TOSS2 = 8606;
	private static final int NIGHTMARE_CHARGE_TELEPORT = 8607;
	private static final int NIGHTMARE_CHARGE_2 = 8609;
	private static final int NIGHTMARE_SPAWN = 8611;
	private static final int NIGHTMARE_DEATH = 8612;

	private static final int NIGHTMARE_MELEE_ATTACK = 8594;
	private static final int NIGHTMARE_RANGE_ATTACK = 8596;
	private static final int NIGHTMARE_MAGIC_ATTACK = 8595;

	@Inject
	private Client client;

	@Inject
	private NightmareConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private NightmarePrayerOverlay prayerOverlay;

	@Nullable
	@Getter(AccessLevel.PACKAGE)
	private NightmareAttack prayAgainst;

	@Nullable
	@Getter(AccessLevel.PACKAGE)
	private NPC nm;

	@Getter(AccessLevel.PACKAGE)
	private boolean inFight;

	private boolean cursed;
	private int attackCount;
	private int curseStartID;

	@Getter(AccessLevel.PACKAGE)
	private Color tickColor;

	@Getter(AccessLevel.PACKAGE)
	private boolean prayerHelper;

	@Getter(AccessLevel.PACKAGE)
	private boolean tickCounter;

	@Getter(AccessLevel.PACKAGE)
	private int ticksUntilNextAttack = 0;

	public NightmarePlugin() {
		inFight = false;
	}

	@Provides
	NightmareConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NightmareConfig.class);
	}

	@Inject
	private NightmareOverlay overlay;

	@Override
	protected void startUp() {
		updateConfig();
		overlayManager.add(overlay);
		overlayManager.add(prayerOverlay);
		nm = null;
		prayAgainst = null;
		cursed = false;
		attackCount = 0;
		curseStartID = -1;		//not best solution im sure
		ticksUntilNextAttack = 0;
	}

	@Override
	protected void shutDown() {
		overlayManager.remove(overlay);
		overlayManager.remove(prayerOverlay);
		nm = null;
		prayAgainst = null;
		cursed = false;
		attackCount = 0;
		curseStartID = -1;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("betterNightmare"))
		{
			return;
		}
		this.updateConfig();
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (!inFight || nm == null) {
			return;
		}

		Actor actor = event.getActor();
		if (!(actor instanceof NPC)) {
			return;
		}

		NPC npc = (NPC) actor;
		int id = npc.getId();
		int animationId = npc.getAnimation();

		if(animationId == NIGHTMARE_MAGIC_ATTACK){
			ticksUntilNextAttack = 7;
			tickColor = Color.CYAN;
		}else if(animationId == NIGHTMARE_MELEE_ATTACK){
			ticksUntilNextAttack = 7;
			tickColor = Color.RED;
		}else if(animationId == NIGHTMARE_RANGE_ATTACK){
			ticksUntilNextAttack = 7;
			tickColor = Color.GREEN;
		}
		if (animationId == NIGHTMARE_MAGIC_ATTACK || animationId == NIGHTMARE_MELEE_ATTACK || animationId == NIGHTMARE_RANGE_ATTACK)
		{
			ticksUntilNextAttack = 7;
		}
	}

	@Subscribe
	private void onGameTick(final GameTick event) {
		nm = null;
		inFight = true;
		for (final NPC npc : client.getNpcs()) {
			if(npc.getId() >= 9425 && npc.getId() <= 9433){
				nm = npc;
			}
		}

		if (inFight && nm != null) {
//                if (nm.getId() >= 9425 && nm.getId() <= 9433)        //TODO: change to THE_NIGHTMARE_#### once in client
//                {
			if(nm.getAnimation() == NIGHTMARE_CURSE){
				cursed = true;
				attackCount = 0;
				curseStartID = nm.getId();
			}
			if(cursed && (curseStartID != nm.getId() || attackCount == 5)){	//curse is removed when she phases, or does 5 attacks
				cursed = false;
				curseStartID = -1;	//can probably remove these two since will be reset from above if, if she curses again
				attackCount = 0;
			}
			if(cursed){
				if (nm.getAnimation() == NightmareAttack.MELEE.getAnimation()) {
					prayAgainst = NightmareAttack.CURSE_MELEE;
				} else if (nm.getAnimation() == NightmareAttack.RANGE.getAnimation()) {
					prayAgainst = NightmareAttack.CURSE_RANGE;
				} else if (nm.getAnimation() == NightmareAttack.MAGIC.getAnimation()) {
					prayAgainst = NightmareAttack.CURSE_MAGIC;
				}
				attackCount++;
			}else {
				if (nm.getAnimation() == NightmareAttack.MELEE.getAnimation()) {
					prayAgainst = NightmareAttack.MELEE;
				} else if (nm.getAnimation() == NightmareAttack.RANGE.getAnimation()) {
					prayAgainst = NightmareAttack.RANGE;
				} else if (nm.getAnimation() == NightmareAttack.MAGIC.getAnimation()) {
					prayAgainst = NightmareAttack.MAGIC;
				}
			}

        }
		ticksUntilNextAttack--;
	}

	private void updateConfig()
	{
		this.prayerHelper = config.prayerHelper();

		this.tickCounter = config.ticksCounter();
	}
}