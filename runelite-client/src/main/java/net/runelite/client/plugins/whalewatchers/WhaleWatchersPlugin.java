
/*
 * ******************************************************************************
 *  * Copyright (c) 2019 RuneLitePlus
 *  *  Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 *  *  If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 *  *  ST0NEWALL#9112
 *  *   RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 *  *   RuneLitePlus website: https://runelitepl.us
 *  *****************************************************************************
 */

package net.runelite.client.plugins.whalewatchers;

import com.google.inject.Provides;
import java.util.EnumSet;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemID;
import net.runelite.api.MenuAction;
import net.runelite.api.Skill;
import net.runelite.api.SkullIcon;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import static net.runelite.api.WorldType.isPvpWorld;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ObjectUtils;

@PluginDescriptor(
	name = "Whale Watchers",
	description = "A Plugin to save help whales in the wild",
	tags = {"whale watchers", "whale", "protect item", "warning", "pklite"},
	type = PluginType.PVP,
	enabledByDefault = false
)
@Singleton
public class WhaleWatchersPlugin extends Plugin
{

	private static final String CONFIG_GROUP_NAME = "WhaleWatchers";

	boolean protectItemOverlay = false;
	int damageDone = 0;
	int damageTaken = 0;
	boolean inCombat = false;
	@Inject
	private Client client;
	@Inject
	private WhaleWatchersConfig config;
	@Inject
	private WhaleWatchersOverlay overlay;
	@Inject
	private WhaleWatchersProtOverlay whaleWatchersProtOverlay;
	@Inject
	private WhaleWatchersSmiteableOverlay whaleWatchersSmiteableOverlay;
	@Inject
	private WhaleWatchersGloryOverlay whaleWatchersGloryOverlay;
	@Inject
	private OverlayManager overlayManager;
	private int tickCountdown = 0;
	@Getter(AccessLevel.PACKAGE)
	private boolean displaySmiteOverlay;
	@Getter(AccessLevel.PACKAGE)
	private boolean displayGloryOverlay;

	@Getter(AccessLevel.PACKAGE)
	private boolean protectItemWarning;
	@Getter(AccessLevel.PACKAGE)
	private boolean showDamageCounter;
	private boolean smiteableWarning;
	private boolean gloryWarning;

	@Provides
	WhaleWatchersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WhaleWatchersConfig.class);
	}

	@Subscribe
	public void onOverlayMenuClicked(OverlayMenuClicked event)
	{
		if (event.getOverlay().equals(overlay))
		{
			if (event.getEntry().getOption().equals("Reset"))
			{
				resetDamageCounter();
			}
		}
	}

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();

		overlayManager.add(overlay);
		overlayManager.add(whaleWatchersProtOverlay);
		overlayManager.add(whaleWatchersSmiteableOverlay);
		overlayManager.add(whaleWatchersGloryOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		overlayManager.remove(whaleWatchersProtOverlay);
		overlayManager.remove(whaleWatchersSmiteableOverlay);
		overlayManager.remove(whaleWatchersGloryOverlay);
		resetDamageCounter();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(CONFIG_GROUP_NAME))
		{
			return;
		}

		updateConfig();

		if (!this.protectItemWarning)
		{
			protectItemOverlay = false;
		}
		if (!this.gloryWarning)
		{
			displayGloryOverlay = false;
		}
		if (!this.smiteableWarning)
		{
			displaySmiteOverlay = false;
		}
	}


	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
		if (this.showDamageCounter)
		{
			if (!(event.getActor() == client.getLocalPlayer() ||
				event.getActor() == client.getLocalPlayer().getInteracting()))
			{
				return;
			}
			if (isAttackingPlayer() || inCombat)
			{
				inCombat = true;
				if (event.getActor() == client.getLocalPlayer())
				{
					damageTaken += event.getHitsplat().getAmount();
				}
				if (event.getActor() == client.getLocalPlayer().getInteracting())
				{
					damageDone += event.getHitsplat().getAmount();
				}
			}
		}
	}


	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged event)
	{
		if (this.gloryWarning && event.getItemContainer() == client.getItemContainer(InventoryID.EQUIPMENT))
		{
			final int amuletID = ObjectUtils.defaultIfNull(client.getLocalPlayer()
				.getPlayerAppearance().getEquipmentId(KitType.AMULET), 0);
			displayGloryOverlay = amuletID == ItemID.AMULET_OF_GLORY;
		}
		else
		{
			displayGloryOverlay = false;
		}
	}


	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (this.showDamageCounter && event.getMenuAction().equals(MenuAction.SPELL_CAST_ON_PLAYER))
		{
			inCombat = true;
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		if (this.showDamageCounter)
		{
			if (client.getVar(VarPlayer.ATTACKING_PLAYER) == -1)
			{
				if (inCombat)
				{
					tickCountdown = 10;
				}
			}
		}

		if (this.protectItemWarning)
		{
			try
			{
				final SkullIcon skullIcon = Objects.requireNonNull(client.getLocalPlayer().getSkullIcon());
				final EnumSet<WorldType> worldTypes = client.getWorldType();
				if (WorldType.isHighRiskWorld(worldTypes))
				{
					protectItemOverlay = false;
					return;
				}
				if (skullIcon.equals(SkullIcon.SKULL))
				{
					if (WorldType.isPvpWorld(worldTypes) || WorldType.isDeadmanWorld(worldTypes) ||
						client.getVar(Varbits.IN_WILDERNESS) == 1)
					{
						protectItemOverlay = client.getRealSkillLevel(Skill.PRAYER) > 25 &&
							client.getVar(Varbits.PRAYER_PROTECT_ITEM) == 0;
					}
					else
					{
						protectItemOverlay = false;
					}
				}
			}
			catch (NullPointerException e)
			{
				// local player isn't skulled
			}

		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (this.showDamageCounter)
		{
			if (tickCountdown > 0 && tickCountdown < 11)
			{
				tickCountdown--;
				if (tickCountdown == 1)
				{
					inCombat = false;
					resetDamageCounter();
					return;
				}
			}
		}
		if (this.smiteableWarning && (client.getVar(Varbits.IN_WILDERNESS) == 1 || isPvpWorld(client.getWorldType())))
		{
			if (client.getLocalPlayer().getSkullIcon() != null && client.getLocalPlayer().getSkullIcon().equals(SkullIcon.SKULL))
			{
				final int currentHealth = client.getLocalPlayer().getHealth();
				final int currentPrayer = client.getBoostedSkillLevel(Skill.PRAYER);
				displaySmiteOverlay = currentPrayer <= (Math.ceil(currentHealth / 4));
			}
			else
			{
				displaySmiteOverlay = false;
			}
		}
		else
		{
			displaySmiteOverlay = false;
		}
	}

	/**
	 * Checks to see if client is attacking another player
	 *
	 * @return returns true if they are, false otherwise
	 */
	private boolean isAttackingPlayer()
	{
		if (client.getVar(Varbits.IN_WILDERNESS) == 1 && client.getLocalPlayer().getInteracting() != null)
		{
			return true;
		}
		int varp = client.getVar(VarPlayer.ATTACKING_PLAYER);
		return varp != -1;
	}

	private void resetDamageCounter()
	{
		damageTaken = 0;
		damageDone = 0;
	}
	
	private void updateConfig()
	{
		this.protectItemWarning = config.protectItemWarning();
		this.showDamageCounter = config.showDamageCounter();
		this.smiteableWarning = config.smiteableWarning();
		this.gloryWarning = config.gloryWarning();
	}

}
