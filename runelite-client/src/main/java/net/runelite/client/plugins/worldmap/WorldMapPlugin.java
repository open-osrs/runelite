/*
 * Copyright (c) 2018, Morgan Lewis <https://github.com/MESLewis>
 * Copyright (c) 2019, Yani <yani@xenokore.com>
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
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.worldmap;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Provides;

import java.awt.image.BufferedImage;
import java.util.Arrays;


import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Experience;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.runelite.api.events.*;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.ExperienceChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.AgilityShortcut;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.ImageUtil;

@PluginDescriptor(
		name = "World Map",
		description = "Enhance the world map to display additional information",
		tags = {"agility", "fairy", "farming", "rings", "teleports"}
)
public class WorldMapPlugin extends Plugin
{
	static final BufferedImage BLANK_ICON;
	private static final BufferedImage FAIRY_TRAVEL_ICON;
	private static final BufferedImage NOPE_ICON;

	private static final BufferedImage STARTED_ICON;
	private static final BufferedImage FINISHED_ICON;

	static final String CONFIG_KEY = "worldmap";
	static final String CONFIG_KEY_FAIRY_RING_TOOLTIPS = "fairyRingTooltips";
	static final String CONFIG_KEY_FAIRY_RING_ICON = "fairyRingIcon";
	static final String CONFIG_KEY_AGILITY_SHORTCUT_TOOLTIPS = "agilityShortcutTooltips";
	static final String CONFIG_KEY_AGILITY_SHORTCUT_LEVEL_ICON = "agilityShortcutIcon";
	static final String CONFIG_KEY_NORMAL_TELEPORT_ICON = "standardSpellbookIcon";
	static final String CONFIG_KEY_ANCIENT_TELEPORT_ICON = "ancientSpellbookIcon";
	static final String CONFIG_KEY_LUNAR_TELEPORT_ICON = "lunarSpellbookIcon";
	static final String CONFIG_KEY_ARCEUUS_TELEPORT_ICON = "arceuusSpellbookIcon";
	static final String CONFIG_KEY_JEWELLERY_TELEPORT_ICON = "jewelleryIcon";
	static final String CONFIG_KEY_SCROLL_TELEPORT_ICON = "scrollIcon";
	static final String CONFIG_KEY_MISC_TELEPORT_ICON = "miscellaneousTeleportIcon";
	static final String CONFIG_KEY_QUEST_START_TOOLTIPS = "questStartTooltips";
	static final String CONFIG_KEY_QUEST_PROGRESS_ICON = "questProgressIcon";
	static final String CONFIG_KEY_MINIGAME_TOOLTIP = "minigameTooltip";
	static final String CONFIG_KEY_FARMING_PATCH_TOOLTIPS = "farmingpatchTooltips";
	static final String CONFIG_KEY_RARE_TREE_TOOLTIPS = "rareTreeTooltips";
	static final String CONFIG_KEY_RARE_TREE_LEVEL_ICON = "rareTreeIcon";
	static final String CONFIG_KEY_TRANSPORATION_TELEPORT_TOOLTIPS = "transportationTooltips";

	static final String WAYPOINT_SET_MESSAGE = "You have set a waypoint.";
	static final String WAYPOINT_UNSET_MESSAGE = "You have cleared your waypoint.";
	static final String WAYPOINT_ACTIVE_MESSAGE = "You have an active waypoint.";

	static
	{
		//A size of 17 gives us a buffer when triggering tooltips
		final int iconBufferSize = 17;

		BLANK_ICON = new BufferedImage(iconBufferSize, iconBufferSize, BufferedImage.TYPE_INT_ARGB);

		FAIRY_TRAVEL_ICON = new BufferedImage(iconBufferSize, iconBufferSize, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage fairyTravelIcon = ImageUtil.getResourceStreamFromClass(WorldMapPlugin.class, "fairy_ring_travel.png");
		FAIRY_TRAVEL_ICON.getGraphics().drawImage(fairyTravelIcon, 1, 1, null);

		NOPE_ICON = new BufferedImage(iconBufferSize, iconBufferSize, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage nopeImage = ImageUtil.getResourceStreamFromClass(WorldMapPlugin.class, "nope_icon.png");
		NOPE_ICON.getGraphics().drawImage(nopeImage, 1, 1, null);

		STARTED_ICON = new BufferedImage(iconBufferSize, iconBufferSize, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage startedIcon = ImageUtil.getResourceStreamFromClass(WorldMapPlugin.class, "quest_started_icon.png");
		STARTED_ICON.getGraphics().drawImage(startedIcon, 1, 1, null);
		FINISHED_ICON = new BufferedImage(iconBufferSize, iconBufferSize, BufferedImage.TYPE_INT_ARGB);
		final BufferedImage finishedIcon = ImageUtil.getResourceStreamFromClass(WorldMapPlugin.class, "quest_complete_icon.png");
		FINISHED_ICON.getGraphics().drawImage(finishedIcon, 1, 1, null);
	}

	@Inject
	private Client client;

	@Inject
	private ConfigManager configManager;

	@Inject
	private WorldMapConfig config;

	@Inject
	private WorldMapPointManager worldMapPointManager;

	@Inject
	private MouseManager mouseManager;

	@Inject
	private WayPointWorldMapListener wayPointWorldMapListener;

	@Inject
	private ChatMessageManager chatMessageManager;

	private int agilityLevel = 0;
	private int woodcuttingLevel = 0;

	private WorldPoint wayPoint;

	private static final Gson gson = new Gson();

	@Provides
	WorldMapConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WorldMapConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		agilityLevel = client.getRealSkillLevel(Skill.AGILITY);
		woodcuttingLevel = client.getRealSkillLevel(Skill.WOODCUTTING);
		updateShownIcons();

		mouseManager.registerMouseListener(wayPointWorldMapListener);
		wayPoint = loadWayPoint();

		if (wayPoint != null)
		{
			updateWayPoint();
		}
	}

	@Subscribe
	private void onWidgetLoaded(WidgetLoaded l)
	{
		if (l.getGroupId() == WidgetID.WORLD_MAP_GROUP_ID)
		{
			updateQuestStartPointIcons();
		}
	}

	@Override
	protected void shutDown() throws Exception
	{
		worldMapPointManager.removeIf(FairyRingPoint.class::isInstance);
		worldMapPointManager.removeIf(AgilityShortcutPoint.class::isInstance);
		worldMapPointManager.removeIf(QuestStartPoint.class::isInstance);
		worldMapPointManager.removeIf(TeleportPoint.class::isInstance);
		worldMapPointManager.removeIf(TransportationPoint.class::isInstance);
		worldMapPointManager.removeIf(MinigamePoint.class::isInstance);
		worldMapPointManager.removeIf(FarmingPatchPoint.class::isInstance);
		worldMapPointManager.removeIf(RareTreePoint.class::isInstance);
		worldMapPointManager.removeIf(WayPointWorldMapPoint.class::isInstance);

		agilityLevel = 0;
		woodcuttingLevel = 0;

		if (wayPoint != null)
		{
			client.clearHintArrow();
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			sendChatMessage(WAYPOINT_ACTIVE_MESSAGE);
			updateWayPoint();
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(CONFIG_KEY))
		{
			return;
		}

		updateShownIcons();
		updateQuestStartPointIcons();
		updateWayPoint();
	}

	@Subscribe
	public void onExperienceChanged(ExperienceChanged event)
	{
		if (event.getSkill() == Skill.AGILITY)
		{
			int newAgilityLevel = Experience.getLevelForXp(client.getSkillExperience(Skill.AGILITY));
			if (newAgilityLevel != agilityLevel)
			{
				agilityLevel = newAgilityLevel;
				updateAgilityIcons();
			}
		}

		if (event.getSkill() == Skill.WOODCUTTING)
		{
			int newWoodcutLevel = Experience.getLevelForXp(client.getSkillExperience(Skill.WOODCUTTING));
			if (newWoodcutLevel != woodcuttingLevel)
			{
				woodcuttingLevel = newWoodcutLevel;
				updateRareTreeIcons();
			}
		}
	}

	private void updateAgilityIcons()
	{
		worldMapPointManager.removeIf(AgilityShortcutPoint.class::isInstance);
		if (config.agilityShortcutLevelIcon() || config.agilityShortcutTooltips())
		{
			Arrays.stream(AgilityShortcut.values())
					.filter(value -> value.getWorldMapLocation() != null)
					.map(value -> new AgilityShortcutPoint(value,
							agilityLevel > 0 && config.agilityShortcutLevelIcon() && value.getLevel() > agilityLevel ? NOPE_ICON : BLANK_ICON,
							config.agilityShortcutTooltips()))
					.forEach(worldMapPointManager::add);
		}
	}

	private void updateRareTreeIcons()
	{
		worldMapPointManager.removeIf(RareTreePoint.class::isInstance);

		if (config.rareTreeLevelIcon() || config.rareTreeTooltips())
		{
			Arrays.stream(RareTreeLocation.values()).forEach(rareTree ->
					Arrays.stream(rareTree.getLocations())
							.map(point -> new RareTreePoint(point,
									rareTree.getTooltip(),
									woodcuttingLevel > 0 && config.rareTreeLevelIcon() &&
											rareTree.getLevelReq() > woodcuttingLevel ? NOPE_ICON : BLANK_ICON,
									config.rareTreeTooltips()))
							.forEach(worldMapPointManager::add));
		}
	}

	private void updateQuestStartPointIcons()
	{
		worldMapPointManager.removeIf(QuestStartPoint.class::isInstance);

		if (config.questStartTooltips() || config.questProgressIcon())
		{
			Arrays.stream(QuestStartLocation.values())
					.map(value ->
					{
						BufferedImage icon;
						String tooltip = "";

						if (config.questStartTooltips())
						{
							tooltip += " - " + value.getTooltip();
						}

						if (config.questProgressIcon() && value.getQuest() != null)
						{
							switch (value.getQuest().getState(client))
							{
								case FINISHED:
									icon = FINISHED_ICON;
									tooltip += " - Finished";
									break;
								case IN_PROGRESS:
									icon = STARTED_ICON;
									tooltip += " - Started";
									break;
								default:
									icon = BLANK_ICON;
									break;
							}
						}
						else
						{
							icon = BLANK_ICON;
						}

						return new QuestStartPoint(value, icon, tooltip);

					})
					.forEach(worldMapPointManager::add);
		}
	}

	private void updateShownIcons()
	{
		updateAgilityIcons();
		updateRareTreeIcons();

		worldMapPointManager.removeIf(FairyRingPoint.class::isInstance);
		if (config.fairyRingIcon() || config.fairyRingTooltips())
		{
			Arrays.stream(FairyRingLocation.values())
					.map(value -> new FairyRingPoint(value,
							config.fairyRingIcon() ? FAIRY_TRAVEL_ICON : BLANK_ICON,
							config.fairyRingTooltips()))
					.forEach(worldMapPointManager::add);
		}

		worldMapPointManager.removeIf(MinigamePoint.class::isInstance);
		if (config.minigameTooltip())
		{
			Arrays.stream(MinigameLocation.values())
					.map(value -> new MinigamePoint(value, BLANK_ICON))
					.forEach(worldMapPointManager::add);
		}

		worldMapPointManager.removeIf(TransportationPoint.class::isInstance);
		if (config.TransportationTeleportTooltips())
		{
			Arrays.stream(TransportationPointLocation.values())
					.map(value -> new TransportationPoint(value, BLANK_ICON))
					.forEach((worldMapPointManager::add));

		}


		worldMapPointManager.removeIf(FarmingPatchPoint.class::isInstance);
		if (config.farmingPatchTooltips())
		{
			Arrays.stream(FarmingPatchLocation.values()).forEach(location ->
					Arrays.stream(location.getLocations())
							.map(point -> new FarmingPatchPoint(point, location.getTooltip(), BLANK_ICON))
							.forEach(worldMapPointManager::add)
			);
		}

		worldMapPointManager.removeIf(TeleportPoint.class::isInstance);
		Arrays.stream(TeleportLocationData.values())
				.filter(data ->
				{
					switch (data.getType())
					{
						case NORMAL_MAGIC:
							return config.normalTeleportIcon();
						case ANCIENT_MAGICKS:
							return config.ancientTeleportIcon();
						case LUNAR_MAGIC:
							return config.lunarTeleportIcon();
						case ARCEUUS_MAGIC:
							return config.arceuusTeleportIcon();
						case JEWELLERY:
							return config.jewelleryTeleportIcon();
						case SCROLL:
							return config.scrollTeleportIcon();
						case OTHER:
							return config.miscellaneousTeleportIcon();
						default:
							return false;
					}
				}).map(TeleportPoint::new)
				.forEach(worldMapPointManager::add);
	}

	private WorldPoint loadWayPoint()
	{
		String json = configManager.getConfiguration(WorldMapPlugin.CONFIG_KEY, "waypoint_data");

		if (Strings.isNullOrEmpty(json))
		{
			return null;
		}

		return gson.fromJson(json, WorldPoint.class);
	}

	private void saveWayPoint()
	{
		if (wayPoint == null)
		{
			configManager.unsetConfiguration(WorldMapPlugin.CONFIG_KEY, "waypoint_data");
			return;
		}

		String json = gson.toJson(wayPoint);
		configManager.setConfiguration(WorldMapPlugin.CONFIG_KEY, "waypoint_data", json);
	}

	public void setWayPoint(WorldPoint point)
	{
		wayPoint = point;
		saveWayPoint();
		updateWayPoint();
		sendChatMessage(WAYPOINT_SET_MESSAGE);
	}

	public void removeWayPoint()
	{
		wayPoint = null;
		saveWayPoint();
		updateWayPoint();
		sendChatMessage(WAYPOINT_UNSET_MESSAGE);
	}

	public boolean hasWayPoint()
	{
		return (wayPoint != null);
	}

	private void updateWayPoint()
	{
		client.clearHintArrow();
		worldMapPointManager.removeIf(WayPointWorldMapPoint.class::isInstance);

		if (!config.isWaypointEnabled())
		{
			return;
		}

		if (wayPoint == null)
		{
			return;
		}

		client.setHintArrow(wayPoint);
		worldMapPointManager.add(new WayPointWorldMapPoint(wayPoint));
	}

	private void sendChatMessage(String chatMessage)
	{
		final String message = new ChatMessageBuilder()
				.append(chatMessage)
				.build();

		chatMessageManager.queue(
				QueuedMessage.builder()
						.type(ChatMessageType.CONSOLE)
						.runeLiteFormattedMessage(message)
						.build());
	}
}
