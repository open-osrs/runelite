package net.runelite.client.external.adonai;

import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;

import java.util.HashMap;

public class Buttons
{
	public static Client client;

	enum ToolbarTabs {
		COMBAT_OPTIONS,
		SKILLS,
		QUEST_LIST,
		INVENTORY,
		WORN_EQUIPMENT,
		PRAYER,
		MAGIC,
		FRIENDS_LIST,
		ACCOUNT_MANAGEMENT,
		CHAT_CHANNEL,
		SETTINGS,
		EMOTES,
		MUSIC_PLAYER
	}

	private static HashMap<ToolbarTabs, int[]> toolbarTabs = new HashMap<>() {{
		put(ToolbarTabs.COMBAT_OPTIONS, new int[]{164, 66});
		put(ToolbarTabs.SKILLS, new int[]{164, 67});
		put(ToolbarTabs.QUEST_LIST, new int[]{164, 68});
		put(ToolbarTabs.INVENTORY, new int[]{164, 69});
		put(ToolbarTabs.WORN_EQUIPMENT, new int[]{164, 70});
		put(ToolbarTabs.PRAYER, new int[]{164, 71});
		put(ToolbarTabs.MAGIC, new int[]{164, 72});

		put(ToolbarTabs.FRIENDS_LIST, new int[]{164, 52});
		put(ToolbarTabs.ACCOUNT_MANAGEMENT, new int[]{164, 51});
		put(ToolbarTabs.CHAT_CHANNEL, new int[]{164, 50});
		put(ToolbarTabs.SETTINGS, new int[]{164, 53});
		put(ToolbarTabs.EMOTES, new int[]{164, 54});
		put(ToolbarTabs.MUSIC_PLAYER, new int[]{164, 55});
	}};

	enum MapTabs {
		ACTIVATE_QUICK_PRAYERS,
		TOGGLE_RUN,
		SPECIAL_ATTACK,
		WORLD_MAP
	}

	private static HashMap<MapTabs, int[]> mapTabs = new HashMap<>() {{
		put(MapTabs.ACTIVATE_QUICK_PRAYERS, new int[]{160, 17});
		put(MapTabs.SPECIAL_ATTACK, new int[]{160, 33});
		put(MapTabs.WORLD_MAP, new int[]{160, 48});
		put(MapTabs.TOGGLE_RUN, new int[]{160, 25});
	}};

	public static Widget getToolbarTab(ToolbarTabs tab)
	{
		int[] tabWidget = toolbarTabs.get(tab);
		return client.getWidget(tabWidget[0], tabWidget[1]);
	}

	public static Widget getMinimapWidget(MapTabs tab)
	{
		int[] tabWidget = mapTabs.get(tab);
		return client.getWidget(tabWidget[0], tabWidget[1]);
	}

	enum FloatingMap {
		SEARCH, // 595.25
		MAP, // 595, 9
		KEY_SCROLL_BAR, // 595, 20[1]
		KEY_SCROLL_UP, // 595, 20[4]
		KEY_SCROLL_DOWN, // 595, 20[5]
		KEY_BUTTON_HIDE_SHOW, // 595, 24
		SURFACE_SELECTION, // 595.26
		SURFACE_SELECTION_LIST, // 595.35 [0 - 6 visible)
		SURFACE_SELECTION_BAR, // 595.36[1],
		SURFACE_SELECTION_UP, // 595.36[4],
		SURFACE_SELECTION_DOWN, // 595.36[5],
		ZOOM_OUT, // 595.27
		ZOOM_IN, // 595.28
		OVERVIEW, // 595.29
		CLOSE // 595.38
	}

	enum CombatOptionsTab {
		ATTACK_TOP_LEFT, // 593.4
		ATTACK_TOP_RIGHT, // 593.8
		ATTACK_BOTTOM_LEFT, // 593.12
		ATTACK_BOTTOM_RIGHT, // 593.16
		AUTO_RETALIATE, // 593.30
		SPECIAL_ATTACK // 593.35
	}

	enum CombatTab {
		ATTACK_TOP_LEFT, // 15.3
		ATTACK_TOP_RIGHT, // 593.8
		ATTACK_BOTTOM_LEFT, // 593.12
		ATTACK_BOTTOM_RIGHT, // 593.16
		AUTO_RETALIATE, // 593.30
		SPECIAL_ATTACK // 593.35
	}

}
