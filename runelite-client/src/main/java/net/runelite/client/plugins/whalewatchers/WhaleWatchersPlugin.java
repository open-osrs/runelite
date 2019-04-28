package net.runelite.client.plugins.whalewatchers;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemID;
import net.runelite.api.MenuAction;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.SkullIcon;
import net.runelite.api.Varbits;
import static net.runelite.api.WorldType.HIGH_RISK;
import static net.runelite.api.WorldType.PVP;
import static net.runelite.api.WorldType.isPvpWorld;
import net.runelite.api.events.ExperienceChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ObjectUtils;

@PluginDescriptor(
	name = "Whale Watchers",
	description = "A Plugin to save help whales in the wild",
	tags = {"whale watchers", "whale", "protect item", "warning", "pklite"},
	enabledByDefault = true,
	hidden = false,
	developerPlugin = false,
	loadWhenOutdated = false
)
public class WhaleWatchersPlugin extends Plugin
{

	public boolean enableOverlay = false;
	public int damageDone = 0;
	public int damageTaken = 0;
	public boolean inCombat = false;
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
	@Getter
	private boolean displaySmiteOverlay;
	@Getter
	private boolean displayGloryOverlay;

	@Provides
	WhaleWatchersConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WhaleWatchersConfig.class);
	}

	@Subscribe
	public void onOverlayMenuClicked(OverlayMenuClicked event)
	{
		if (!event.getOverlay().equals(overlay))
		{
			return;
		}
		else
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
	public void onHitsplatApplied(HitsplatApplied event)
	{
		if (config.showDamageCounter())
		{
			if (!(event.getActor() == client.getLocalPlayer() ||
				event.getActor().getInteracting() == client.getLocalPlayer()))
			{
				return;
			}
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


	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged event)
	{
		if (config.gloryWarning() && event.getItemContainer().equals(InventoryID.EQUIPMENT))
		{
			final int amuletID = ObjectUtils.defaultIfNull(client.getLocalPlayer()
				.getPlayerComposition().getEquipmentId(KitType.AMULET), 0);
			if (amuletID == ItemID.AMULET_OF_GLORY)
			{
				displayGloryOverlay = true;
			}
			else
			{
				displayGloryOverlay = false;
			}
		}
		else
		{
			displayGloryOverlay = false;
		}
	}

	@Subscribe
	public void onExperienceChanged(ExperienceChanged event)
	{
		final Skill skill = event.getSkill();
		final Player player = client.getLocalPlayer();
		if (skill.equals(Skill.HITPOINTS))
		{
			if (player.getInteracting() instanceof Player)
			{
				inCombat = true;
			}
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (config.showDamageCounter() && event.getMenuAction().equals(MenuAction.SPELL_CAST_ON_PLAYER))
		{
			inCombat = true;
		}
	}

	@Subscribe
	public void onInteractingChanged(InteractingChanged event)
	{
		if (event.getSource() != client.getLocalPlayer() || event.getTarget() != client.getLocalPlayer())
		{
			return;
		}
		if (!(event.getTarget() instanceof Player) && !(event.getSource() instanceof Player))
		{
			return;
		}
		if (client.getLocalPlayer().getInteracting() == null)
		{
			inCombat = false;
		}
		if (config.showDamageCounter())
		{
			if (!inCombat)
			{
				inCombat = true;
			}
		}

		if (config.protectItemWarning())
		{
			try
			{
				if (client.getLocalPlayer().getSkullIcon() == (SkullIcon.SKULL))
				{
					if (client.getVar(Varbits.PRAYER_PROTECT_ITEM) == 0 && client.getVar(Varbits.IN_WILDERNESS) == 1 ||
						client.getWorldType().contains(PVP))
					{
						enableOverlay = true;
					}
					if (client.getVar(Varbits.PRAYER_PROTECT_ITEM) == 1 || client.getVar(Varbits.IN_WILDERNESS) == 0 ||
						client.getWorldType().contains(HIGH_RISK) || client.getWorld() == 365)
					{
						enableOverlay = false;
					}
				}
				else
				{
					enableOverlay = false;
				}
			}
			catch (NullPointerException e)
			{

			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (config.showDamageCounter())
		{

			if (client.getLocalPlayer().getInteracting()
				!= null && client.getLocalPlayer().getInteracting() instanceof Player)
			{
				inCombat = true;
			}

			if (tickCountdown > 0 && tickCountdown < 11)
			{
				tickCountdown--;
				if (tickCountdown == 1)
				{
					inCombat = false;
					damageDone = 0;
					damageTaken = 0;
					return;
				}
			}
		}
		if (config.smiteableWarning() && (client.getVar(Varbits.IN_WILDERNESS) == 1 || isPvpWorld(client.getWorldType())))
		{
			if (client.getLocalPlayer().getSkullIcon() != null && client.getLocalPlayer().getSkullIcon().equals(SkullIcon.SKULL))
			{
				final int currentHealth = client.getLocalPlayer().getHealth();
				final int currentPrayer = client.getBoostedSkillLevel(Skill.PRAYER);
				if (currentPrayer <= (Math.ceil(currentHealth / 4)))
				{
					displaySmiteOverlay = true;
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
		else
		{
			displaySmiteOverlay = false;
		}
	}

	private void resetDamageCounter()
	{
		damageTaken = 0;
		damageDone = 0;
	}

}
