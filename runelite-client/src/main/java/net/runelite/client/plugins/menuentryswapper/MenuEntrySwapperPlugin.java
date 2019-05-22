/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Kamiel
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
package net.runelite.client.plugins.menuentryswapper;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import joptsimple.internal.Strings;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.PostItemComposition;
import net.runelite.api.events.WidgetMenuOptionClicked;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.input.KeyManager;
import net.runelite.client.menus.ComparableEntry;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.menus.WidgetMenuOption;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.ArrayUtils;

@PluginDescriptor(
	name = "Menu Entry Swapper",
	description = "Change the default option that is displayed when hovering over objects",
	tags = {"npcs", "inventory", "items", "objects"},
	enabledByDefault = false
)
public class MenuEntrySwapperPlugin extends Plugin
{
	private static final String CONFIGURE = "Configure";
	private static final String SAVE = "Save";
	private static final String RESET = "Reset";
	private static final String MENU_TARGET = "Shift-click";
	private static final String CONFIG_GROUP = "shiftclick";
	private static final String ITEM_KEY_PREFIX = "item_";

	private static final WidgetMenuOption FIXED_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption FIXED_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE = new WidgetMenuOption(CONFIGURE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB);

	private static final WidgetMenuOption RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE = new WidgetMenuOption(SAVE,
		MENU_TARGET, WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB);

	private static final Set<MenuAction> NPC_MENU_TYPES = ImmutableSet.of(
		MenuAction.NPC_FIRST_OPTION,
		MenuAction.NPC_SECOND_OPTION,
		MenuAction.NPC_THIRD_OPTION,
		MenuAction.NPC_FOURTH_OPTION,
		MenuAction.NPC_FIFTH_OPTION,
		MenuAction.EXAMINE_NPC);

	private static final Splitter NEWLINE_SPLITTER = Splitter
		.on("\n")
		.omitEmptyStrings()
		.trimResults();

	private final Map<ComparableEntry, ComparableEntry> customSwaps = new HashMap<>();

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private MenuEntrySwapperConfig config;

	@Inject
	private ShiftClickInputListener inputListener;

	@Inject
	private ConfigManager configManager;

	@Inject
	private KeyManager keyManager;

	@Inject
	private MenuManager menuManager;

	@Inject
	private ItemManager itemManager;

	@Getter
	private boolean configuringShiftClick = false;

	@Setter
	private boolean shiftModifier = false;

	@Provides
	MenuEntrySwapperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(MenuEntrySwapperConfig.class);
	}

	@Override
	public void startUp()
	{
		if (config.shiftClickCustomization())
		{
			enableCustomization();
		}

		loadCustomSwaps(config.customSwaps());
	}

	@Override
	public void shutDown()
	{
		disableCustomization();

		loadCustomSwaps(""); // Removes all custom swaps
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!CONFIG_GROUP.equals(event.getGroup()))
		{
			if (event.getKey().equals("customSwaps"))
			{
				loadCustomSwaps(config.customSwaps());
			}

			return;
		}

		if (event.getKey().equals("shiftClickCustomization"))
		{
			if (config.shiftClickCustomization())
			{
				enableCustomization();
			}
			else
			{
				disableCustomization();
			}
		}
		else if (event.getKey().startsWith(ITEM_KEY_PREFIX))
		{
			clientThread.invoke(this::resetItemCompositionCache);
		}
	}

	private void resetItemCompositionCache()
	{
		itemManager.invalidateItemCompositionCache();
		client.getItemCompositionCache().reset();
	}

	private Integer getSwapConfig(int itemId)
	{
		itemId = ItemVariationMapping.map(itemId);
		String config = configManager.getConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId);
		if (config == null || config.isEmpty())
		{
			return null;
		}

		return Integer.parseInt(config);
	}

	private void setSwapConfig(int itemId, int index)
	{
		itemId = ItemVariationMapping.map(itemId);
		configManager.setConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId, index);
	}

	private void unsetSwapConfig(int itemId)
	{
		itemId = ItemVariationMapping.map(itemId);
		configManager.unsetConfiguration(CONFIG_GROUP, ITEM_KEY_PREFIX + itemId);
	}

	private void enableCustomization()
	{
		keyManager.registerKeyListener(inputListener);
		refreshShiftClickCustomizationMenus();
		clientThread.invoke(this::resetItemCompositionCache);
	}

	private void disableCustomization()
	{
		keyManager.unregisterKeyListener(inputListener);
		removeShiftClickCustomizationMenus();
		configuringShiftClick = false;
		clientThread.invoke(this::resetItemCompositionCache);
	}

	@Subscribe
	public void onWidgetMenuOptionClicked(WidgetMenuOptionClicked event)
	{
		if (event.getWidget() == WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB
			|| event.getWidget() == WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB
			|| event.getWidget() == WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB)
		{
			configuringShiftClick = event.getMenuOption().equals(CONFIGURE) && Text.removeTags(event.getMenuTarget()).equals(MENU_TARGET);
			refreshShiftClickCustomizationMenus();
		}
	}

	@Subscribe
	public void onMenuOpened(MenuOpened event)
	{
		if (!configuringShiftClick)
		{
			return;
		}

		MenuEntry firstEntry = event.getFirstEntry();
		if (firstEntry == null)
		{
			return;
		}

		int widgetId = firstEntry.getParam1();
		if (widgetId != WidgetInfo.INVENTORY.getId())
		{
			return;
		}

		int itemId = firstEntry.getIdentifier();
		if (itemId == -1)
		{
			return;
		}

		ItemComposition itemComposition = client.getItemDefinition(itemId);
		String itemName = itemComposition.getName();
		String option = "Use";
		int shiftClickActionindex = itemComposition.getShiftClickActionIndex();
		String[] inventoryActions = itemComposition.getInventoryActions();

		if (shiftClickActionindex >= 0 && shiftClickActionindex < inventoryActions.length)
		{
			option = inventoryActions[shiftClickActionindex];
		}

		MenuEntry[] entries = event.getMenuEntries();

		for (MenuEntry entry : entries)
		{
			if (itemName.equals(Text.removeTags(entry.getTarget())))
			{
				entry.setType(MenuAction.RUNELITE.getId());

				if (option.equals(entry.getOption()))
				{
					entry.setOption("* " + option);
				}
			}
		}

		final MenuEntry resetShiftClickEntry = new MenuEntry();
		resetShiftClickEntry.setOption(RESET);
		resetShiftClickEntry.setTarget(MENU_TARGET);
		resetShiftClickEntry.setIdentifier(itemId);
		resetShiftClickEntry.setParam1(widgetId);
		resetShiftClickEntry.setType(MenuAction.RUNELITE.getId());
		client.setMenuEntries(ArrayUtils.addAll(entries, resetShiftClickEntry));
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (event.getMenuAction() != MenuAction.RUNELITE || event.getWidgetId() != WidgetInfo.INVENTORY.getId())
		{
			return;
		}

		int itemId = event.getId();

		if (itemId == -1)
		{
			return;
		}

		String option = event.getMenuOption();
		String target = event.getMenuTarget();
		ItemComposition itemComposition = client.getItemDefinition(itemId);

		if (option.equals(RESET) && target.equals(MENU_TARGET))
		{
			unsetSwapConfig(itemId);
			return;
		}

		if (!itemComposition.getName().equals(Text.removeTags(target)))
		{
			return;
		}

		int index = -1;
		boolean valid = false;

		if (option.equals("Use")) //because "Use" is not in inventoryActions
		{
			valid = true;
		}
		else
		{
			String[] inventoryActions = itemComposition.getInventoryActions();

			for (index = 0; index < inventoryActions.length; index++)
			{
				if (option.equals(inventoryActions[index]))
				{
					valid = true;
					break;
				}
			}
		}

		if (valid)
		{
			setSwapConfig(itemId, index);
		}
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		final int eventId = event.getIdentifier();
		final String option = Text.removeTags(event.getOption()).toLowerCase();
		final String target = Text.removeTags(event.getTarget()).toLowerCase();
		final NPC hintArrowNpc = client.getHintArrowNpc();

		if (hintArrowNpc != null
			&& hintArrowNpc.getIndex() == eventId
			&& NPC_MENU_TYPES.contains(MenuAction.of(event.getType())))
		{
			return;
		}

		if (option.equals("talk-to"))
		{
			if (config.swapPickpocket() && target.contains("h.a.m."))
			{
				menuManager.addPriorityEntry("pickpocket", target);
			}

			if (config.swapAbyssTeleport() && target.contains("mage of zamorak"))
			{
				menuManager.addPriorityEntry("teleport", target);
			}

			if (config.swapHardWoodGrove() && target.contains("rionasta"))
			{
				menuManager.addPriorityEntry("send-parcel", target);
			}
			if (config.swapBank())
			{
				menuManager.addPriorityEntry("bank", target);
			}

			if (config.swapContract())
			{
				menuManager.addPriorityEntry("contract", target);
			}

			if (config.swapExchange())
			{
				menuManager.addPriorityEntry("exchange", target);
			}

			if (config.swapDarkMage())
			{
				menuManager.addPriorityEntry("repairs", target);
			}

			// make sure assignment swap is higher priority than trade swap for slayer masters
			if (config.swapAssignment())
			{
				menuManager.addPriorityEntry("assignment", target);
			}
			
			if (config.swapPlank())
			{
				menuManager.addPriorityEntry("buy-plank", target);
			}

			if (config.swapTrade())
			{
				menuManager.addPriorityEntry("trade", target);
				menuManager.addPriorityEntry("trade-with", target);
			}

			if (config.claimSlime() && target.equals("robin"))
			{
				menuManager.addPriorityEntry("claim-slime", target);
			}
			
			if (config.claimDynamite() && target.contains("Thirus"))
			{
				menuManager.addPriorityEntry("claim-dynamite", target);
			}

			if (config.swapTravel())
			{
				menuManager.addPriorityEntry("travel", target);
				menuManager.addPriorityEntry("pay-fare", target);
				menuManager.addPriorityEntry("charter", target);
				menuManager.addPriorityEntry("take-boat", target);
				menuManager.addPriorityEntry("fly", target);
				menuManager.addPriorityEntry("jatizso", target);
				menuManager.addPriorityEntry("neitiznot", target);
				menuManager.addPriorityEntry("rellekka", target);
				menuManager.addPriorityEntry("follow", target);
				menuManager.addPriorityEntry("transport", target);
			}

			if (config.swapPay())
			{
				menuManager.addPriorityEntry("pay", target);
				menuManager.addPriorityEntry("pay (", target);
			}

			if (config.swapDream())
			{
				menuManager.addPriorityEntry("dream", target);
			}

			if (config.swapDecant())
			{
				menuManager.addPriorityEntry("decant", target);
			}

			if (config.swapQuick())
			{
				menuManager.addPriorityEntry("quick-travel", target);
			}
			
			if (config.swapStory())
			{
				menuManager.addPriorityEntry("story", target);
			}

			if (config.swapEscort())
			{
				menuManager.addPriorityEntry("escort", target);
			}
		}

		else if (config.swapWildernessLever() && target.equals("lever") && option.equals("ardougne"))
		{
			menuManager.addPriorityEntry("edgeville", target);
		}
		
		else if (config.swapMetamorphosis() && target.contains("baby chinchompa"))
		{
			menuManager.addPriorityEntry("metamorphosis", target);
		}

		else if (config.swapStun() && target.contains("hoop snake"))
		{
			menuManager.addPriorityEntry("stun", target);
		}
		
		else if (config.swapTravel() && option.equals("pass") && target.equals("energy barrier"))
		{
			menuManager.addPriorityEntry("pay-toll(2-ecto)", target);
		}

		else if (config.swapTravel() && option.equals("open") && target.equals("gate"))
		{
			menuManager.addPriorityEntry("pay-toll(10gp)", target);
		}

		else if (config.swapTravel() && option.equals("inspect") && target.equals("trapdoor"))
		{
			menuManager.addPriorityEntry("travel", target);
		}

		else if (config.swapHarpoon() && option.equals("cage"))
		{
			menuManager.addPriorityEntry("harpoon", target);
		}

		else if (config.swapHarpoon() && (option.equals("big net") || option.equals("net")))
		{
			menuManager.addPriorityEntry("harpoon", target);
		}

else if (config.swapOccult() != OccultAltarMode.VENERATE && option.equals("venerate"))
		{
			switch (config.swapOccult())
			{
				case VENERATE:
					menuManager.addPriorityEntry("Venerate", target);
				break;
				case ANCIENT:
					menuManager.addPriorityEntry("Ancient", target);
				break;
				case LUNAR:
				menuManager.addPriorityEntry("Lunar", target);
				break;
				case ARCEUUS:
				menuManager.addPriorityEntry("Arceuus", target);
			}
				
		}

		else if (config.swapObelisk() != ObeliskMode.ACTIVATE && option.equals("activate"))
		{
			switch (config.swapObelisk())
			{
				case ACTIVATE:
					menuManager.addPriorityEntry("activate", target);
				break;
				case SET_DESTINATION:
					menuManager.addPriorityEntry("set destination", target);
				break;
				case TELEPORT_TO_DESTINATION:
					menuManager.addPriorityEntry("teleport to destination", target);
				break;
			}
		}

		else if (config.swapHomePortal() != HouseMode.ENTER && option.equals("enter"))
		{
			switch (config.swapHomePortal())
			{
				case HOME:
					menuManager.addPriorityEntry("home", target);
					break;
				case BUILD_MODE:
					menuManager.addPriorityEntry("build mode", target);
					break;
				case FRIENDS_HOUSE:
					menuManager.addPriorityEntry("friend's house", target);
					break;
			}
		}
		else if (config.swapFairyRing() != FairyRingMode.OFF && config.swapFairyRing() != FairyRingMode.ZANARIS
			&& (option.equals("zanaris") || option.equals("configure") || option.equals("tree")))
		{
			if (config.swapFairyRing() == FairyRingMode.LAST_DESTINATION)
			{
				menuManager.addPriorityEntry("last-destination", target);
			}
			else if (config.swapFairyRing() == FairyRingMode.CONFIGURE)
			{
				menuManager.addPriorityEntry("configure", target);
			}
		}

		else if (config.swapFairyRing() == FairyRingMode.ZANARIS && option.equals("tree"))
		{
			menuManager.addPriorityEntry("zanaris", target);
		}

		else if (config.swapBoxTrap() && (option.equals("check") || option.equals("dismantle")))
		{
			menuManager.addPriorityEntry("reset", target);
		}

		else if (config.swapBoxTrap() && option.equals("take"))
		{
			menuManager.addPriorityEntry("lay", target);
			menuManager.addPriorityEntry("activate", target);
		}

		else if (config.swapChase() && option.equals("pick-up"))
		{
			menuManager.addPriorityEntry("chase", target);
		}

		else if (config.swapBirdhouseEmpty() && option.equals("interact") && target.contains("birdhouse"))
		{
			menuManager.addPriorityEntry("empty", target);
		}

		else if (config.swapQuick() && option.equals("ring"))
		{
			menuManager.addPriorityEntry("quick-start", target);
		}

		else if (config.swapQuick() && option.equals("pass"))
		{
			menuManager.addPriorityEntry("quick-pass", target);
			menuManager.addPriorityEntry("quick pass", target);
		}

		else if (config.swapQuick() && option.equals("open"))
		{
			menuManager.addPriorityEntry("quick-open", target);
		}

		else if (config.swapAdmire() && option.equals("admire"))
		{
			menuManager.addPriorityEntry("teleport", target);
			menuManager.addPriorityEntry("spellbook", target);
			menuManager.addPriorityEntry("perks", target);
		}

		else if (config.swapPrivate() && option.equals("shared"))
		{
			menuManager.addPriorityEntry("private", target);
		}

		else if (config.swapPick() && option.equals("pick"))
		{
			menuManager.addPriorityEntry("pick-lots", target);
		}

		else if (config.swapSearch() && (option.equals("close") || option.equals("shut")))
		{
			menuManager.addPriorityEntry("search", target);
		}
		
		else if (config.swapRogueschests() && target.contains("chest"))
		{
			menuManager.addPriorityEntry("search for traps", target);
		}

		else if (config.rockCake() && option.equals("eat"))
		{
			menuManager.addPriorityEntry("guzzle", target);
		}


		else if (config.shiftClickCustomization() && shiftModifier && !option.equals("use"))
		{
			Integer customOption = getSwapConfig(eventId);

			if (customOption != null && customOption == -1)
			{
				menuManager.addPriorityEntry("use", target);
			}
		}

		// Put all item-related swapping after shift-click
		else if (config.swapTeleportItem() && option.equals("wear"))
		{
			menuManager.addPriorityEntry("rub", target);
			menuManager.addPriorityEntry("teleport", target);
		}
		else if (option.equals("wield"))
		{
			if (config.swapTeleportItem())
			{
				menuManager.addPriorityEntry("teleport", target);
			}
		}
		else if (config.swapBones() && option.equals("bury"))
		{
			menuManager.addPriorityEntry("use", target);
		}
		else if (config.swapNexus() && target.contains("portal nexus"))
		{
			menuManager.addPriorityEntry("teleport menu", target);
		}
	}

	@Subscribe
	public void onPostItemComposition(PostItemComposition event)
	{
		ItemComposition itemComposition = event.getItemComposition();
		Integer option = getSwapConfig(itemComposition.getId());

		if (option != null)
		{
			itemComposition.setShiftClickActionIndex(option);
		}
	}

	@Subscribe
	public void onFocusChanged(FocusChanged event)
	{
		if (!event.isFocused())
		{
			shiftModifier = false;
		}
	}

	private void removeShiftClickCustomizationMenus()
	{
		menuManager.removeManagedCustomMenu(FIXED_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(FIXED_INVENTORY_TAB_SAVE);
		menuManager.removeManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE);
		menuManager.removeManagedCustomMenu(RESIZABLE_INVENTORY_TAB_CONFIGURE);
		menuManager.removeManagedCustomMenu(RESIZABLE_INVENTORY_TAB_SAVE);
	}

	private void refreshShiftClickCustomizationMenus()
	{
		removeShiftClickCustomizationMenus();
		if (configuringShiftClick)
		{
			menuManager.addManagedCustomMenu(FIXED_INVENTORY_TAB_SAVE);
			menuManager.addManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_SAVE);
			menuManager.addManagedCustomMenu(RESIZABLE_INVENTORY_TAB_SAVE);
		}
		else
		{
			menuManager.addManagedCustomMenu(FIXED_INVENTORY_TAB_CONFIGURE);
			menuManager.addManagedCustomMenu(RESIZABLE_BOTTOM_LINE_INVENTORY_TAB_CONFIGURE);
			menuManager.addManagedCustomMenu(RESIZABLE_INVENTORY_TAB_CONFIGURE);
		}
	}

	private void loadCustomSwaps(String config)
	{
		Map<ComparableEntry, ComparableEntry> tmp = new HashMap<>();

		if (!Strings.isNullOrEmpty(config))
		{
			Map<String, String> split = NEWLINE_SPLITTER.withKeyValueSeparator(':').split(config);

			for (Map.Entry<String, String> entry : split.entrySet())
			{
				String from = entry.getKey();
				String to = entry.getValue();
				String[] splitFrom = Text.standardize(from).split(",");
				String optionFrom = splitFrom[0].trim();
				String targetFrom;
				if (splitFrom.length == 1)
				{
					targetFrom = "";
				}
				else
				{
					targetFrom = splitFrom[1].trim();
				}

				ComparableEntry fromEntry = new ComparableEntry(optionFrom, targetFrom);

				String[] splitTo = Text.standardize(to).split(",");
				String optionTo = splitTo[0].trim();
				String targetTo;
				if (splitTo.length == 1)
				{
					targetTo = "";
				}
				else
				{
					targetTo = splitTo[1].trim();
				}

				ComparableEntry toEntry = new ComparableEntry(optionTo, targetTo);

				tmp.put(fromEntry, toEntry);
			}
		}

		for (Map.Entry<ComparableEntry, ComparableEntry> e : customSwaps.entrySet())
		{
			ComparableEntry key = e.getKey();
			ComparableEntry value = e.getValue();
			menuManager.removeSwap(key, value);
		}

		customSwaps.clear();
		customSwaps.putAll(tmp);

		for (Map.Entry<ComparableEntry, ComparableEntry> entry : customSwaps.entrySet())
		{
			ComparableEntry a1 = entry.getKey();
			ComparableEntry a2 = entry.getValue();
			menuManager.addSwap(a1, a2);
		}
	}

	void startShift()
	{
		if (!config.swapClimbUpDown())
		{
			return;
		}

		menuManager.addPriorityEntry("climb-up");
	}

	void stopShift()
	{
		menuManager.removePriorityEntry("climb-up");
	}

	void startControl()
	{
		if (!config.swapClimbUpDown())
		{
			return;
		}

		menuManager.addPriorityEntry("climb-down");
	}

	void stopControl()
	{
		menuManager.removePriorityEntry("climb-down");
	}
}
