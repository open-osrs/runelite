package net.runelite.client.plugins.sorceressgarden;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.ItemID;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.XpDropEvent;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.xptracker.XpTrackerPlugin;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ArrayUtils;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Sorceress Garden",
	enabledByDefault = false,
	description = "Provides various utilities for the Sorceress's Garden minigame",
	tags = {"sorceress", "garden", "sqirk", "sq'irk", "thieving", "farming"}
)

@PluginDependency(XpTrackerPlugin.class)
public class SorceressGardenPlugin extends Plugin
{
	private static final int GARDEN_REGION = 11605;

	@Inject
	private SorceressGardenConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SorceressGardenOverlay sorceressGardenOverlay;

	@Inject
	private SorceressSqirkOverlay sorceressSqirkOverlay;

	@Inject
	private SorceressSession sorceressSession;

	@Inject
	private Client client;

	@Provides
	SorceressGardenConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SorceressGardenConfig.class);
	}

	@Override
	protected void startUp()
	{
		// runs on plugin startup
		overlayManager.add(sorceressGardenOverlay);
		overlayManager.add(sorceressSqirkOverlay);
	}

	@Override
	protected void shutDown()
	{
		// runs on plugin shutdown
		overlayManager.remove(sorceressGardenOverlay);
		overlayManager.remove(sorceressSqirkOverlay);
	}


	@Subscribe
	private void onXpDropEvent(XpDropEvent event)
	{
		if (!config.showSqirksStats())
		{
			return;
		}

		// Switch based off of XP gained, this is how we determine which Sqi'rk was picked
		if (event.getSkill() == Skill.FARMING && isInGarden())
		{
			switch (event.getExp())
			{
				case 30:
					sorceressSession.incrementSqirks(ItemID.WINTER_SQIRK);
					break;
				case 40:
					sorceressSession.incrementSqirks(ItemID.SPRING_SQIRK);
					break;
				case 50:
					sorceressSession.incrementSqirks(ItemID.AUTUMN_SQIRK);
					break;
				case 60:
					sorceressSession.incrementSqirks(ItemID.SUMMER_SQIRK);
					break;
			}
		}
	}

	boolean isInGarden()
	{
		return client.getMapRegions() != null && ArrayUtils.contains(client.getMapRegions(), GARDEN_REGION);
	}
}