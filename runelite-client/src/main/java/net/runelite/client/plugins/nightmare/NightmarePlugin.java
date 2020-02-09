package net.runelite.client.plugins.nightmare;

import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDefinitionChanged;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import static net.runelite.api.NpcID.nightmarewhenitsupdated;                     //TODO: this here is the thing to change

@PluginDescriptor(
	name = "Nightmare of Ashihama",
	description = "Show what prayer to use and which tiles to avoid",
	tags = {"bosses", "combat", "nm", "overlay", "nightmare", "pve", "pvm", "ashihama"},
	type = PluginType.PVM,
	enabledByDefault = false
)

@Slf4j
@Singleton
public class NightmarePlugin extends Plugin
{
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

	private static final List<Integer> INACTIVE_TOTEMS = Arrays.asList(9434, 9437, 9440, 9443);

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
	private NightmareAttack pendingNightmareAttack;

	@Nullable
	@Getter(AccessLevel.PACKAGE)
	private NPC nm;

	@Getter(AccessLevel.PACKAGE)
	private final Map<Integer, MemorizedTotem> totems = new HashMap<>();

	@Getter(AccessLevel.PACKAGE)
	private boolean inFight;

	private boolean cursed;
	private int attacksSinceCurse;

	@Getter(AccessLevel.PACKAGE)
	private boolean prayerHelper;

	@Getter(AccessLevel.PACKAGE)
	private boolean tickCounter;

	@Getter(AccessLevel.PACKAGE)
	private boolean highlightTotems;

	@Getter(AccessLevel.PACKAGE)
	private int ticksUntilNextAttack = 0;

	public NightmarePlugin()
	{
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
	protected void startUp()
	{
		updateConfig();
		overlayManager.add(overlay);
		overlayManager.add(prayerOverlay);
		reset();
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(prayerOverlay);
		reset();
	}

	private void reset()
	{
		inFight = false;
		nm = null;
		pendingNightmareAttack = null;
		cursed = false;
		attacksSinceCurse = 0;
		ticksUntilNextAttack = 0;
		totems.clear();
	}

	@Subscribe
	private void onChatMessage(ChatMessage chatMessage)
	{
		if (chatMessage.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		final String message = chatMessage.getMessage();
		if (message.contains("The Nightmare has cursed you, shuffling your prayers!"))
		{
			cursed = true;
		}
		else if (message.contains("You feel the effects of the Nightmare's curse wear off."))
		{
			cursed = false;
		}

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
		if (!inFight || nm == null)
		{
			return;
		}

		Actor actor = event.getActor();
		if (!(actor instanceof NPC))
		{
			return;
		}

		NPC npc = (NPC) actor;
		int id = npc.getId();
		int animationId = npc.getAnimation();

		if (animationId == NIGHTMARE_MAGIC_ATTACK)
		{
			ticksUntilNextAttack = 7;
			attacksSinceCurse++;
			pendingNightmareAttack = cursed ? NightmareAttack.CURSE_MAGIC : NightmareAttack.MAGIC;
		}
		else if (animationId == NIGHTMARE_MELEE_ATTACK)
		{
			ticksUntilNextAttack = 7;
			attacksSinceCurse++;
			pendingNightmareAttack = cursed ? NightmareAttack.CURSE_MELEE : NightmareAttack.MELEE;
		}
		else if (animationId == NIGHTMARE_RANGE_ATTACK)
		{
			ticksUntilNextAttack = 7;
			attacksSinceCurse++;
			pendingNightmareAttack = cursed ? NightmareAttack.CURSE_RANGE : NightmareAttack.RANGE;
		}
		else if (animationId == NIGHTMARE_CURSE)
		{
			cursed = true;
			attacksSinceCurse = 0;
		}

		if (cursed && attacksSinceCurse == 5)
		{
			//curse is removed when she phases, or does 5 attacks
			cursed = false;
			attacksSinceCurse = -1;
		}
	}

	@Subscribe
	public void onNpcDefinitionChanged(NpcDefinitionChanged event)
	{
		final NPC npc = event.getNpc();

		if (npc == null)
		{
			return;
		}

		//this will trigger once when the fight begins
		if (npc.getId() == 9432)
		{
			nm = npc;
			inFight = true;
		}

		//if ID changes to 9431 (3rd phase) and is cursed, remove the curse
		if (cursed && npc.getId() == 9431)
		{
			cursed = false;
			attacksSinceCurse = -1;
		}

		//if npc is in the totems map, update its phase
		if (totems.containsKey(npc.getIndex()))
		{
			totems.get(npc.getIndex()).updateCurrentPhase(npc.getId());
		}
		else if (INACTIVE_TOTEMS.contains(npc.getId()))
		{
			//else if the totem is not in the totem array and it is an inactive totem, add it to the totem map.
			totems.putIfAbsent(npc.getIndex(), new MemorizedTotem(npc));
		}
	}

	@Subscribe
	private void onGameTick(final GameTick event)
	{
		if (!inFight || nm == null)
		{
			return;
		}

		//if nightmare's is 9433, the fight has ended and everything should be reset
		if (nm.getId() == 9433)
		{
			reset();
		}

		ticksUntilNextAttack--;

		if (pendingNightmareAttack != null && ticksUntilNextAttack == 0)
		{
			pendingNightmareAttack = null;
		}
	}

	private boolean isNightmareNpc(int id)
	{
		return id >= 9425 && id <= 9433;
	}

	private void updateConfig()
	{
		this.prayerHelper = config.prayerHelper();
		this.tickCounter = config.ticksCounter();
		this.highlightTotems = config.highlightTotems();
	}
}