/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Kamiel
 * Copyright (c) 2019, alanbaumgartner <https://github.com/alanbaumgartner>
 * Copyright (c) 2019, Kyle <https://github.com/kyleeld>
 * Copyright (c) 2019, lucouswin <https://github.com/lucouswin>
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
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.inject.Provides;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuOpcode;
import static net.runelite.api.MenuOpcode.MENU_ACTION_DEPRIORITIZE_OFFSET;
import static net.runelite.api.MenuOpcode.WALK;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Varbits;
import static net.runelite.api.Varbits.BUILDING_MODE;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.util.Text;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.Keybind;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.KeyManager;
import net.runelite.client.menus.AbstractComparableEntry;
import static net.runelite.client.menus.ComparableEntries.newBankComparableEntry;
import static net.runelite.client.menus.ComparableEntries.newBaseComparableEntry;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.menuentryswapper.util.ArdougneCloakMode;
import net.runelite.client.plugins.menuentryswapper.util.BurningAmuletMode;
import net.runelite.client.plugins.menuentryswapper.util.CharterOption;
import net.runelite.client.plugins.menuentryswapper.util.CombatBraceletMode;
import net.runelite.client.plugins.menuentryswapper.util.ConstructionCapeMode;
import net.runelite.client.plugins.menuentryswapper.util.ConstructionMode;
import net.runelite.client.plugins.menuentryswapper.util.DigsitePendantMode;
import net.runelite.client.plugins.menuentryswapper.util.DuelingRingMode;
import net.runelite.client.plugins.menuentryswapper.util.FairyRingMode;
import net.runelite.client.plugins.menuentryswapper.util.FairyTreeMode;
import net.runelite.client.plugins.menuentryswapper.util.GamesNecklaceMode;
import net.runelite.client.plugins.menuentryswapper.util.GloryMode;
import net.runelite.client.plugins.menuentryswapper.util.HouseAdvertisementMode;
import net.runelite.client.plugins.menuentryswapper.util.HouseMode;
import net.runelite.client.plugins.menuentryswapper.util.MaxCapeMode;
import net.runelite.client.plugins.menuentryswapper.util.NecklaceOfPassageMode;
import net.runelite.client.plugins.menuentryswapper.util.ObeliskMode;
import net.runelite.client.plugins.menuentryswapper.util.OccultAltarMode;
import net.runelite.client.plugins.menuentryswapper.util.QuestCapeMode;
import net.runelite.client.plugins.menuentryswapper.util.RingOfWealthMode;
import net.runelite.client.plugins.menuentryswapper.util.SkillsNecklaceMode;
import net.runelite.client.plugins.menuentryswapper.util.SlayerRingMode;
import net.runelite.client.plugins.menuentryswapper.util.XericsTalismanMode;
import net.runelite.client.plugins.pvptools.PvpToolsConfig;
import net.runelite.client.plugins.pvptools.PvpToolsPlugin;
import net.runelite.client.util.HotkeyListener;
import static net.runelite.client.util.MenuUtil.swap;
import net.runelite.client.util.MiscUtils;
import org.apache.commons.lang3.StringUtils;

@PluginDescriptor(
	name = "Menu Entry Swapper",
	description = "Change the default option that is displayed when hovering over objects",
	tags = {"npcs", "inventory", "items", "objects"},
	type = PluginType.UTILITY,
	enabledByDefault = false
)
@Singleton
@PluginDependency(PvpToolsPlugin.class)
public class MenuEntrySwapperPlugin extends Plugin
{
	private static final String CONFIG_GROUP = "shiftclick";
	private static final String HOTKEY = "menuentryswapper hotkey";
	private static final String CONTROL = "menuentryswapper control";
	private static final String HOTKEY_CHECK = "menuentryswapper hotkey check";
	private static final String CONTROL_CHECK = "menuentryswapper control check";
	private static final int PURO_PURO_REGION_ID = 10307;
	private static final Set<MenuOpcode> NPC_MENU_TYPES = ImmutableSet.of(
		MenuOpcode.NPC_FIRST_OPTION, MenuOpcode.NPC_SECOND_OPTION, MenuOpcode.NPC_THIRD_OPTION,
		MenuOpcode.NPC_FOURTH_OPTION, MenuOpcode.NPC_FIFTH_OPTION, MenuOpcode.EXAMINE_NPC
	);
	private static final Splitter NEWLINE_SPLITTER = Splitter
		.on("\n")
		.omitEmptyStrings()
		.trimResults();

	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Inject
	private MenuEntrySwapperConfig config;
	@Inject
	private PluginManager pluginManager;
	@Inject
	private MenuManager menuManager;
	@Inject
	private KeyManager keyManager;
	@Inject
	private EventBus eventBus;
	@Inject
	private PvpToolsPlugin pvpTools;
	@Inject
	private PvpToolsConfig pvpToolsConfig;
	/**
	 * Migrates old custom swaps config
	 * This should be removed after a reasonable amount of time.
	 */
	@Inject
	private ConfigManager configManager;
	private boolean buildingMode;
	private boolean inTobRaid = false;
	private boolean inCoxRaid = false;
	@Setter(AccessLevel.PRIVATE)
	private boolean hotkeyActive;
	@Setter(AccessLevel.PRIVATE)
	private boolean controlActive;
	private final Map<AbstractComparableEntry, Integer> customSwaps = new HashMap<>();
	private final Map<AbstractComparableEntry, Integer> customShiftSwaps = new HashMap<>();
	private final Map<AbstractComparableEntry, AbstractComparableEntry> dePrioSwaps = new HashMap<>();
	private List<String> bankItemNames = new ArrayList<>();
	private BurningAmuletMode getBurningAmuletMode;
	private CharterOption charterOption;
	private CombatBraceletMode getCombatBraceletMode;
	private ArdougneCloakMode ardougneCloakMode;
	private ConstructionCapeMode constructionCapeMode;
	private ConstructionMode getConstructionMode;
	private DigsitePendantMode getDigsitePendantMode;
	private DuelingRingMode getDuelingRingMode;
	private FairyRingMode swapFairyRingMode;
	private FairyTreeMode swapFairyTreeMode;
	private GamesNecklaceMode getGamesNecklaceMode;
	private GloryMode getGloryMode;
	private HouseAdvertisementMode swapHouseAdMode;
	private HouseMode swapHomePortalMode;
	private Keybind hotkeyMod;
	private MaxCapeMode maxMode;
	private NecklaceOfPassageMode getNecklaceofPassageMode;
	private ObeliskMode swapObeliskMode;
	private OccultAltarMode swapOccultMode;
	private QuestCapeMode questCapeMode;
	private RingOfWealthMode getRingofWealthMode;
	private Set<String> hideCastIgnoredCoX;
	private Set<String> hideCastIgnoredToB;
	private SkillsNecklaceMode getSkillsNecklaceMode;
	private SlayerRingMode getSlayerRingMode;
	private String configCustomShiftSwaps;
	private String configCustomSwaps;
	private String getBuyFiftyItems;
	private String getBuyFiveItems;
	private String getBuyOneItems;
	private String getBuyTenItems;
	private String getRemovedObjects;
	private String getSellFiftyItems;
	private String getSellFiveItems;
	private String getSellOneItems;
	private String getSellTenItems;
	private String getWithdrawAllItems;
	private String getWithdrawFiveItems;
	private String getWithdrawOneItems;
	private String getWithdrawTenItems;
	private String getWithdrawXAmount;
	private String getWithdrawXItems;
	private XericsTalismanMode getXericsTalismanMode;
	private boolean getBurningAmulet;
	private boolean getCombatBracelet;
	private boolean getDigsitePendant;
	private boolean getDuelingRing;
	private boolean getEasyConstruction;
	private boolean getGamesNecklace;
	private boolean getGlory;
	private boolean getNecklaceofPassage;
	private boolean getRemoveObjects;
	private boolean getRingofWealth;
	private boolean getSkillsNecklace;
	private boolean getSlayerRing;
	private boolean getSwapArdougneCloak;
	private boolean getSwapBuyFifty;
	private boolean getSwapBuyFive;
	private boolean getSwapBuyOne;
	private boolean getSwapBuyTen;
	private boolean getSwapConstructionCape;
	private boolean getSwapCraftingCape;
	private boolean getSwapExplorersRing;
	private boolean getSwapMagicCape;
	private boolean getSwapPuro;
	private boolean getSwapSawmill;
	private boolean getSwapSawmillPlanks;
	private boolean getSwapSellFifty;
	private boolean getSwapSellFive;
	private boolean getSwapSellOne;
	private boolean getSwapSellTen;
	private boolean getSwapTanning;
	private boolean getWithdrawAll;
	private boolean getWithdrawFive;
	private boolean getWithdrawOne;
	private boolean getWithdrawTen;
	private boolean getWithdrawX;
	private boolean getXericsTalisman;
	private boolean hideBait;
	private boolean hideCastCoX;
	private boolean hideCastToB;
	private boolean hideDestroyBoltpouch;
	private boolean hideDestroyCoalbag;
	private boolean hideDestroyGembag;
	private boolean hideDestroyHerbsack;
	private boolean hideDestroyLootingBag;
	private boolean hideDestroyRunepouch;
	private boolean hideDropRunecraftingPouch;
	private boolean hideExamine;
	private boolean hideLookup;
	private boolean hideNet;
	private boolean hideReport;
	private boolean hideTradeWith;
	private boolean rockCake;
	private boolean swapAbyssTeleport;
	private boolean swapAdmire;
	private boolean swapAssignment;
	private boolean swapBankExchange;
	private boolean swapBirdhouseEmpty;
	private boolean swapBones;
	private boolean swapBoxTrap;
	private boolean swapChase;
	private boolean swapClimbUpDown;
	private boolean swapCoalBag;
	private boolean swapContract;
	private boolean swapEnchant;
	private boolean swapHardWoodGrove;
	private boolean swapHarpoon;
	private boolean swapHouseAd;
	private boolean swapImps;
	private boolean swapInteract;
	private boolean swapMax;
	private boolean swapMetamorphosis;
	private boolean swapMinigame;
	private boolean swapNexus;
	private boolean swapPay;
	private boolean swapPick;
	private boolean swapPickpocket;
	private boolean swapPlank;
	private boolean swapPrivate;
	private boolean swapQuestCape;
	private boolean swapQuick;
	private boolean swapRogueschests;
	private boolean swapSearch;
	private boolean swapStun;
	private boolean swapTeleportItem;
	private boolean swapTrade;
	private boolean swapTravel;
	private boolean swapWildernessLever;

	@Provides
	MenuEntrySwapperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(MenuEntrySwapperConfig.class);
	}

	@Override
	public void startUp()
	{
		migrateConfig();
		updateConfig();
		addSubscriptions();
		addSwaps();
		loadConstructionItems();
		loadCustomSwaps(config.customSwaps(), customSwaps);
		keyManager.registerKeyListener(ctrlHotkey);
		keyManager.registerKeyListener(hotkey);
		if (client.getGameState() == GameState.LOGGED_IN)
		{
			setCastOptions(true);
		}
	}

	@Override
	public void shutDown()
	{
		eventBus.unregister(this);

		loadCustomSwaps("", customSwaps); // Removes all custom swaps
		removeSwaps();
		keyManager.unregisterKeyListener(ctrlHotkey);
		keyManager.unregisterKeyListener(hotkey);
		if (client.getGameState() == GameState.LOGGED_IN)
		{
			resetCastOptions();
		}
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		eventBus.subscribe(VarbitChanged.class, this, this::onVarbitChanged);
		eventBus.subscribe(MenuOpened.class, this, this::onMenuOpened);
		eventBus.subscribe(MenuEntryAdded.class, this, this::onMenuEntryAdded);
		eventBus.subscribe(FocusChanged.class, this, this::onFocusChanged);
	}

	private void onFocusChanged(FocusChanged event)
	{
		if (!event.isFocused())
		{
			stopControl();
			stopHotkey();
		}
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (!"menuentryswapper".equals(event.getGroup()))
		{
			return;
		}

		removeSwaps();
		updateConfig();
		addSwaps();
		loadConstructionItems();

		if (!CONFIG_GROUP.equals(event.getGroup()))
		{
			if (event.getKey().equals("customSwaps"))
			{
				loadCustomSwaps(this.configCustomSwaps, customSwaps);
			}
		}

		else if ((event.getKey().equals("hideCastToB") || event.getKey().equals("hideCastIgnoredToB")))
		{
			if (this.hideCastToB)
			{
				setCastOptions(true);
			}
			else
			{
				resetCastOptions();
			}
		}

		else if ((event.getKey().equals("hideCastCoX") || event.getKey().equals("hideCastIgnoredCoX")))
		{
			if (this.hideCastCoX)
			{
				setCastOptions(true);
			}
			else
			{
				resetCastOptions();
			}
		}
	}

	private void onGameStateChanged(GameStateChanged event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		loadConstructionItems();
	}

	private void onVarbitChanged(VarbitChanged event)
	{
		buildingMode = client.getVar(BUILDING_MODE) == 1;

		setCastOptions(false);
	}

	private void onMenuOpened(MenuOpened event)
	{
		Player localPlayer = client.getLocalPlayer();

		if (localPlayer == null)
		{
			return;
		}

		// TODO: Remove this? This makes everything here only work in wildy lol
		if (!(MiscUtils.getWildernessLevelFrom(client, localPlayer.getWorldLocation()) >= 0))
		{
			return;
		}

		List<MenuEntry> menu_entries = new ArrayList<>();

		for (MenuEntry entry : event.getMenuEntries())
		{
			String option = Text.removeTags(entry.getOption()).toLowerCase();

			if (option.contains("trade with") && this.hideTradeWith)
			{
				continue;
			}

			if (option.contains("lookup") && this.hideLookup)
			{
				continue;
			}

			if (option.contains("report") && this.hideReport)
			{
				continue;
			}

			if (option.contains("examine") && this.hideExamine)
			{
				continue;
			}

			if (option.contains("net") && this.hideNet)
			{
				continue;
			}

			if (option.contains("bait") && this.hideBait)
			{
				continue;
			}

			if (option.contains("destroy"))
			{
				if (this.hideDestroyRunepouch && entry.getTarget().contains("Rune pouch"))
				{
					continue;
				}
				if (this.hideDestroyCoalbag && entry.getTarget().contains("Coal bag"))
				{
					continue;
				}
				if (this.hideDestroyHerbsack && entry.getTarget().contains("Herb sack"))
				{
					continue;
				}
				if (this.hideDestroyBoltpouch && entry.getTarget().contains("Bolt pouch"))
				{
					continue;
				}
				if (this.hideDestroyLootingBag && entry.getTarget().contains("Looting bag"))
				{
					continue;
				}
				if (this.hideDestroyGembag && entry.getTarget().contains("Gem bag"))
				{
					continue;
				}
			}

			if (option.contains("drop"))
			{
				if (this.hideDropRunecraftingPouch && (
					entry.getTarget().contains("Small pouch")
						|| entry.getTarget().contains("Medium pouch")
						|| entry.getTarget().contains("Large pouch")
						|| entry.getTarget().contains("Giant pouch")))
				{
					continue;
				}
			}

			menu_entries.add(entry);
		}

		event.setMenuEntries(menu_entries.toArray(new MenuEntry[0]));
		event.setModified(true);
	}

	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		final int eventId = event.getIdentifier();
		final String option = event.getOption().toLowerCase();
		final String target = event.getMenuEntry().getStandardizedTarget();
		final NPC hintArrowNpc = client.getHintArrowNpc();

		if (this.getRemoveObjects && !this.getRemovedObjects.equals(""))
		{
			// TODO: CACHE THIS
			for (String removed : Text.fromCSV(this.getRemovedObjects))
			{
				removed = Text.standardize(removed);
				if (target.equals(removed))
				{
					client.setMenuOptionCount(client.getMenuOptionCount() - 1);
					return;
				}
				else if (target.contains("->"))
				{
					String trimmed = target.split("->")[1].trim();
					if (trimmed.length() >= removed.length() && trimmed.substring(0, removed.length()).equalsIgnoreCase(removed))
					{
						client.setMenuOptionCount(client.getMenuOptionCount() - 1);
						return;
					}
				}
				else if (target.length() >= removed.length() && StringUtils.startsWithIgnoreCase(target, removed))
				{
					client.setMenuOptionCount(client.getMenuOptionCount() - 1);
					return;
				}
			}
		}

		if (this.getSwapPuro && isPuroPuro())
		{
			if (event.getType() == WALK.getId())
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				MenuEntry menuEntry = menuEntries[menuEntries.length - 1];
				menuEntry.setOpcode(MenuOpcode.WALK.getId() + MENU_ACTION_DEPRIORITIZE_OFFSET);
				client.setMenuEntries(menuEntries);
			}
			else if (option.equalsIgnoreCase("examine"))
			{
				swap(client, "push-through", option, target);
			}
			else if (option.equalsIgnoreCase("use"))
			{
				swap(client, "escape", option, target);
			}
		}

		if (hintArrowNpc != null
			&& hintArrowNpc.getIndex() == eventId
			&& NPC_MENU_TYPES.contains(MenuOpcode.of(event.getType())))
		{
			return;
		}

		if (this.swapImps && target.contains("impling"))
		{

			if (client.getItemContainer(InventoryID.BANK) != null)
			{
				bankItemNames = new ArrayList<>();
				for (Item i : Objects.requireNonNull(client.getItemContainer(InventoryID.BANK)).getItems())
				{
					bankItemNames.add(client.getItemDefinition((i.getId())).getName());
				}
			}
			List<String> invItemNames = new ArrayList<>();
			if (target.equals("gourmet impling jar"))
			{
				if (client.getItemContainer(InventoryID.INVENTORY) != null)
				{
					for (Item i : Objects.requireNonNull(client.getItemContainer(InventoryID.INVENTORY)).getItems())
					{
						invItemNames.add(client.getItemDefinition((i.getId())).getName());
					}
					if ((invItemNames.contains("Clue scroll (easy)") || bankItemNames.contains("Clue scroll (easy)")))
					{
						menuManager.addSwap("loot", target, "use");
					}
					else
					{
						menuManager.removeSwaps(target);
					}
				}
			}
			switch (target)
			{
				case "eclectic impling jar":
					if (client.getItemContainer(InventoryID.INVENTORY) != null)
					{
						for (Item i : Objects.requireNonNull(client.getItemContainer(InventoryID.INVENTORY)).getItems())
						{
							invItemNames.add(client.getItemDefinition((i.getId())).getName());
						}
						if ((invItemNames.contains("Clue scroll (medium)") || bankItemNames.contains("Clue scroll (medium)")))
						{
							menuManager.addSwap("loot", target, "use");
						}
						else
						{
							menuManager.removeSwaps(target);
						}
					}
					break;
				case "magpie impling jar":
				case "nature impling jar":
				case "ninja impling jar":
					if (client.getItemContainer(InventoryID.INVENTORY) != null)
					{
						for (Item i : Objects.requireNonNull(client.getItemContainer(InventoryID.INVENTORY)).getItems())
						{
							invItemNames.add(client.getItemDefinition((i.getId())).getName());
						}
						if ((invItemNames.contains("Clue scroll (hard)") || bankItemNames.contains("Clue scroll (hard)")))
						{
							menuManager.addSwap("loot", target, "use");
						}
						else
						{
							menuManager.removeSwaps(target);
						}
					}
					break;
				case "crystal impling jar":
				case "dragon impling jar":
					if (client.getItemContainer(InventoryID.INVENTORY) != null)
					{
						for (Item i : Objects.requireNonNull(client.getItemContainer(InventoryID.INVENTORY)).getItems())
						{
							invItemNames.add(client.getItemDefinition((i.getId())).getName());
						}
						if ((invItemNames.contains("Clue scroll (elite)") || bankItemNames.contains("Clue scroll (elite)")))
						{
							menuManager.addSwap("loot", target, "use");
						}
						else
						{
							menuManager.removeSwaps(target);
						}
					}
					break;
			}
		}
	}

	private void loadCustomSwaps(String config, Map<AbstractComparableEntry, Integer> map)
	{
		final Map<AbstractComparableEntry, Integer> tmp = new HashMap<>();

		if (!Strings.isNullOrEmpty(config))
		{
			final StringBuilder sb = new StringBuilder();

			for (String str : config.split("\n"))
			{
				if (!str.startsWith("//"))
				{
					sb.append(str).append("\n");
				}
			}

			final Map<String, String> split = NEWLINE_SPLITTER.withKeyValueSeparator(':').split(sb);

			for (Map.Entry<String, String> entry : split.entrySet())
			{
				final String prio = entry.getKey();
				int priority;
				try
				{
					priority = Integer.parseInt(entry.getValue().trim());
				}
				catch (NumberFormatException e)
				{
					priority = 0;
				}
				final String[] splitFrom = Text.standardize(prio).split(",");
				final String optionFrom = splitFrom[0].trim();
				final String targetFrom;
				if (splitFrom.length == 1)
				{
					targetFrom = "";
				}
				else
				{
					targetFrom = splitFrom[1].trim();
				}

				final AbstractComparableEntry prioEntry = newBaseComparableEntry(optionFrom, targetFrom);

				tmp.put(prioEntry, priority);
			}
		}

		for (Map.Entry<AbstractComparableEntry, Integer> e : map.entrySet())
		{
			final AbstractComparableEntry key = e.getKey();
			menuManager.removePriorityEntry(key);
		}

		map.clear();
		map.putAll(tmp);

		for (Map.Entry<AbstractComparableEntry, Integer> entry : map.entrySet())
		{
			AbstractComparableEntry a1 = entry.getKey();
			int a2 = entry.getValue();
			menuManager.addPriorityEntry(a1).setPriority(a2);
		}
	}

	private void addSwaps()
	{
		final List<String> tmp = NEWLINE_SPLITTER.splitToList(config.prioEntry());

		for (String str : tmp)
		{
			String[] strings = str.split(",");

			if (strings.length <= 1)
			{
				continue;
			}

			final AbstractComparableEntry a = newBaseComparableEntry("", strings[1], -1, -1, false, true);
			final AbstractComparableEntry b = newBaseComparableEntry(strings[0], "", -1, -1, false, false);
			dePrioSwaps.put(a, b);
			menuManager.addSwap(a, b);
		}

		if (this.getWithdrawOne)
		{
			Text.fromCSV(this.getWithdrawOneItems).forEach(item ->
			{
				menuManager.addPriorityEntry(newBankComparableEntry("Withdraw-1", item)).setPriority(10);
				menuManager.addPriorityEntry(newBankComparableEntry("Deposit-1", item)).setPriority(10);
			});
		}

		if (this.getWithdrawFive)
		{
			Text.fromCSV(this.getWithdrawFiveItems).forEach(item ->
			{
				menuManager.addPriorityEntry(newBankComparableEntry("Withdraw-5", item)).setPriority(10);
				menuManager.addPriorityEntry(newBankComparableEntry("Deposit-5", item)).setPriority(10);
			});
		}

		if (this.getWithdrawTen)
		{
			Text.fromCSV(this.getWithdrawTenItems).forEach(item ->
			{
				menuManager.addPriorityEntry(newBankComparableEntry("Withdraw-10", item)).setPriority(10);
				menuManager.addPriorityEntry(newBankComparableEntry("Deposit-10", item)).setPriority(10);
			});
		}

		if (this.getWithdrawX)
		{
			Text.fromCSV(this.getWithdrawXItems).forEach(item ->
			{
				menuManager.addPriorityEntry(newBankComparableEntry("Withdraw-" + this.getWithdrawXAmount, item)).setPriority(10);
				menuManager.addPriorityEntry(newBankComparableEntry("Deposit-" + this.getWithdrawXAmount, item)).setPriority(10);
			});
		}

		if (this.getWithdrawAll)
		{
			Text.fromCSV(this.getWithdrawAllItems).forEach(item ->
			{
				menuManager.addPriorityEntry(newBankComparableEntry("Withdraw-All", item)).setPriority(10);
				menuManager.addPriorityEntry(newBankComparableEntry("Deposit-All", item)).setPriority(10);
			});
		}

		if (this.getSwapBuyOne)
		{
			Text.fromCSV(this.getBuyOneItems).forEach(item -> menuManager.addPriorityEntry("Buy 1", item).setPriority(100));
		}

		if (this.getSwapBuyFive)
		{
			Text.fromCSV(this.getBuyFiveItems).forEach(item -> menuManager.addPriorityEntry("Buy 5", item).setPriority(100));
		}

		if (this.getSwapBuyTen)
		{
			Text.fromCSV(this.getBuyTenItems).forEach(item -> menuManager.addPriorityEntry("Buy 10", item).setPriority(100));
		}

		if (this.getSwapBuyFifty)
		{
			Text.fromCSV(this.getBuyFiftyItems).forEach(item -> menuManager.addPriorityEntry("Buy 50", item).setPriority(100));
		}

		if (this.getSwapSellOne)
		{
			Text.fromCSV(this.getSellOneItems).forEach(item -> menuManager.addPriorityEntry("Sell 1", item).setPriority(100));
		}

		if (this.getSwapSellFive)
		{
			Text.fromCSV(this.getSellFiveItems).forEach(item -> menuManager.addPriorityEntry("Sell 5", item).setPriority(100));
		}

		if (this.getSwapSellTen)
		{
			Text.fromCSV(this.getSellTenItems).forEach(item -> menuManager.addPriorityEntry("Sell 10", item).setPriority(100));
		}

		if (this.getSwapSellFifty)
		{
			Text.fromCSV(this.getSellFiftyItems).forEach(item -> menuManager.addPriorityEntry("Sell 50", item).setPriority(100));
		}

		if (this.getSwapTanning)
		{
			menuManager.addPriorityEntry("Tan All");
		}

		if (this.getSwapSawmill)
		{
			menuManager.addPriorityEntry("Buy-plank", "Sawmill operator");
		}

		if (this.getSwapSawmillPlanks)
		{
			//Not much we can do for this one, Buy all is the only thing, there is no target.
			menuManager.addPriorityEntry("Buy All").setPriority(10);
		}

		if (this.getSwapArdougneCloak)
		{
			menuManager.addPriorityEntry(this.ardougneCloakMode.toString()).setPriority(100);
			menuManager.addPriorityEntry(this.ardougneCloakMode.toString2()).setPriority(100);
		}

		if (this.getSwapCraftingCape)
		{
			menuManager.addPriorityEntry("Teleport", "Crafting cape");
			menuManager.addPriorityEntry("Teleport", "Crafting cape(t)");
		}

		if (this.getSwapConstructionCape)
		{
			menuManager.addPriorityEntry(this.constructionCapeMode.toString(), "Construct. cape").setPriority(100);
			menuManager.addPriorityEntry(this.constructionCapeMode.toString(), "Construct. cape(t)").setPriority(100);
		}

		if (this.getSwapMagicCape)
		{
			menuManager.addPriorityEntry("Spellbook", "Magic cape");
			menuManager.addPriorityEntry("Spellbook", "Magic cape(t)");
		}

		if (this.getSwapExplorersRing)
		{
			menuManager.addPriorityEntry("Teleport", "Explorer's ring 2");
			menuManager.addPriorityEntry("Teleport", "Explorer's ring 3");
			menuManager.addPriorityEntry("Teleport", "Explorer's ring 4");
		}

		if (this.swapPickpocket)
		{
			menuManager.addPriorityEntry("Pickpocket").setPriority(1);
		}

		if (this.swapHardWoodGrove)
		{
			menuManager.addPriorityEntry("Send-parcel", "Rionasta");
		}

		if (this.swapBankExchange)
		{
			menuManager.addPriorityEntry(new BankComparableEntry("collect", "", false));
			menuManager.addPriorityEntry("Bank");
			menuManager.addPriorityEntry("Exchange");
		}

		if (this.swapContract)
		{
			menuManager.addPriorityEntry("Contract").setPriority(10);
		}

		if (this.swapInteract)
		{
			menuManager.addPriorityEntry("Repairs").setPriority(10);
			menuManager.addPriorityEntry("Claim-slime").setPriority(10);
			menuManager.addPriorityEntry("Decant").setPriority(10);
			menuManager.addPriorityEntry("Claim").setPriority(10);
			menuManager.addPriorityEntry("Heal").setPriority(10);
			menuManager.addPriorityEntry("Help").setPriority(10);
		}

		if (this.swapAssignment)
		{
			menuManager.addPriorityEntry("Assignment").setPriority(100);
		}

		if (this.swapPlank)
		{
			menuManager.addPriorityEntry("Buy-plank").setPriority(10);
		}

		if (this.swapTrade)
		{
			menuManager.addPriorityEntry("Trade").setPriority(1);
			menuManager.addPriorityEntry("Trade-with").setPriority(1);
			menuManager.addPriorityEntry("Shop").setPriority(1);
		}

		if (this.swapMinigame)
		{
			menuManager.addPriorityEntry("Story");
			menuManager.addPriorityEntry("Escort");
			menuManager.addPriorityEntry("Dream");
			menuManager.addPriorityEntry("Start-minigame");
		}

		if (this.swapTravel)
		{
			menuManager.addPriorityEntry("Travel");
			menuManager.addPriorityEntry("Pay-fare");
			menuManager.addPriorityEntry("Charter");
			menuManager.addPriorityEntry("Take-boat");
			menuManager.addPriorityEntry("Fly");
			menuManager.addPriorityEntry("Jatizso");
			menuManager.addPriorityEntry("Neitiznot");
			menuManager.addPriorityEntry("Rellekka");
			menuManager.addPriorityEntry("Follow", "Elkoy").setPriority(10);
			menuManager.addPriorityEntry("Transport");
			menuManager.addPriorityEntry("Teleport", "Mage of zamorak").setPriority(10);
		}

		if (this.swapPay)
		{
			menuManager.addPriorityEntry("Pay");
			menuManager.addPriorityEntry("Pay (", false);
		}

		if (this.swapQuick)
		{
			menuManager.addPriorityEntry("Quick-travel");
		}

		if (this.swapEnchant)
		{
			menuManager.addPriorityEntry("Enchant");
		}

		if (this.swapWildernessLever)
		{
			menuManager.addPriorityEntry("Edgeville", "Lever");
		}

		if (this.swapMetamorphosis)
		{
			menuManager.addPriorityEntry("Metamorphosis", "Baby chinchompa");
		}

		if (this.swapStun)
		{
			menuManager.addPriorityEntry("Stun", "Hoop snake");
		}

		if (this.swapTravel)
		{
			menuManager.addPriorityEntry("Pay-toll(2-ecto)", "Energy barrier");
			menuManager.addPriorityEntry("Pay-toll(10gp)", "Gate");
			menuManager.addPriorityEntry("Travel", "Trapdoor");
		}

		if (this.swapHarpoon)
		{
			menuManager.addPriorityEntry("Harpoon");
		}

		if (this.swapBoxTrap)
		{
			menuManager.addPriorityEntry("Reset", "Shaking box");
			menuManager.addPriorityEntry("Lay", "Box trap");
			menuManager.addPriorityEntry("Activate", "Box trap");
		}

		if (this.swapChase)
		{
			menuManager.addPriorityEntry("Chase");
		}

		if (this.swapBirdhouseEmpty)
		{
			menuManager.addPriorityEntry("Empty", "Birdhouse");
			menuManager.addPriorityEntry("Empty", "Oak Birdhouse");
			menuManager.addPriorityEntry("Empty", "Willow Birdhouse");
			menuManager.addPriorityEntry("Empty", "Teak Birdhouse");
			menuManager.addPriorityEntry("Empty", "Maple Birdhouse");
			menuManager.addPriorityEntry("Empty", "Mahogany Birdhouse");
			menuManager.addPriorityEntry("Empty", "Yew Birdhouse");
			menuManager.addPriorityEntry("Empty", "Magic Birdhouse");
			menuManager.addPriorityEntry("Empty", "Redwood Birdhouse");
		}

		if (this.swapQuick)
		{
			menuManager.addPriorityEntry("Quick-enter");
			menuManager.addPriorityEntry("Quick-start");
			menuManager.addPriorityEntry("Quick-pass");
			menuManager.addPriorityEntry("Quick-open");
			menuManager.addPriorityEntry("Quick-leave");
		}

		if (this.swapAdmire)
		{
			menuManager.addPriorityEntry("Teleport", "Mounted Strength Cape").setPriority(10);
			menuManager.addPriorityEntry("Teleport", "Mounted Construction Cape").setPriority(10);
			menuManager.addPriorityEntry("Teleport", "Mounted Crafting Cape").setPriority(10);
			menuManager.addPriorityEntry("Teleport", "Mounted Hunter Cape").setPriority(10);
			menuManager.addPriorityEntry("Teleport", "Mounted Fishing Cape").setPriority(10);
			menuManager.addPriorityEntry("Spellbook", "Mounted Magic Cape");
			menuManager.addPriorityEntry("Perks", "Mounted Max Cape");
		}

		if (this.swapPrivate)
		{
			menuManager.addPriorityEntry("Private");
		}

		if (this.swapPick)
		{
			menuManager.addPriorityEntry("Pick-lots");
		}

		if (this.swapSearch)
		{
			menuManager.addPriorityEntry("Search").setPriority(1);
		}

		if (this.swapRogueschests)
		{
			menuManager.addPriorityEntry("Search for traps");
		}

		if (this.rockCake)
		{
			menuManager.addPriorityEntry("Guzzle", "Dwarven rock cake");
		}

		if (this.swapTeleportItem)
		{
			menuManager.addPriorityEntry(new InventoryComparableEntry("Rub", "", false)).setPriority(1);
			menuManager.addPriorityEntry(new InventoryComparableEntry("Teleport", "", false)).setPriority(1);
		}

		if (this.swapCoalBag)
		{
			menuManager.addPriorityEntry("Fill", "Coal bag");
			menuManager.addPriorityEntry(newBankComparableEntry("Empty", "Coal bag"));
		}

		if (this.swapBones)
		{
			menuManager.addPriorityEntry(new InventoryComparableEntry("Use", "bone", false));
		}

		if (this.swapNexus)
		{
			menuManager.addPriorityEntry("Teleport menu", "Portal nexus");
		}

		switch (this.swapFairyRingMode)
		{
			case OFF:
			case ZANARIS:
				menuManager.removeSwaps("Fairy ring");
				menuManager.removeSwaps("Tree");
				break;
			case CONFIGURE:
				menuManager.addPriorityEntry("Configure", "Fairy ring");
				break;
			case LAST_DESTINATION:
				menuManager.addPriorityEntry("Last-destination", false);
				break;
		}

		switch (this.swapFairyTreeMode)
		{
			case OFF:
				break;
			case TREE:
				menuManager.addPriorityEntry("Tree", "Spiritual Fairy Tree");
				break;
			case RING_ZANARIS:
				menuManager.addPriorityEntry("Ring-Zanaris", "Spiritual Fairy Tree");
				break;
			case RING_CONFIGURE:
				menuManager.addPriorityEntry("Ring-configure", "Spiritual Fairy Tree");
				break;
			case RING_LAST_DESTINATION:
				menuManager.addPriorityEntry("Ring-last-destination", false);
				break;
		}

		switch (this.swapOccultMode)
		{
			case LUNAR:
				menuManager.addPriorityEntry("Lunar", "Altar of the Occult");
				break;
			case ANCIENT:
				menuManager.addPriorityEntry("Ancient", "Altar of the Occult");
				break;
			case ARCEUUS:
				menuManager.addPriorityEntry("Arceuus", "Altar of the Occult");
				break;
		}

		switch (this.swapObeliskMode)
		{
			case SET_DESTINATION:
				menuManager.addPriorityEntry("Set destination", "Obelisk");
				break;
			case TELEPORT_TO_DESTINATION:
				menuManager.addPriorityEntry("Teleport to destination", "Obelisk");
				break;
		}

		switch (this.swapHomePortalMode)
		{
			case HOME:
				menuManager.addPriorityEntry("Home");
				break;
			case BUILD_MODE:
				menuManager.addPriorityEntry("Build mode");
				break;
			case FRIENDS_HOUSE:
				menuManager.addPriorityEntry("Friend's house");
				break;
		}

		if (this.swapHardWoodGrove)
		{
			menuManager.addPriorityEntry("Quick-pay(100)", "Hardwood grove doors");
		}

		if (this.getBurningAmulet)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getBurningAmuletMode.toString(), "burning amulet"));
		}

		if (this.getCombatBracelet)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getCombatBraceletMode.toString(), "combat bracelet"));
		}

		if (this.getGamesNecklace)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getGamesNecklaceMode.toString(), "games necklace"));
		}

		if (this.getDuelingRing)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getDuelingRingMode.toString(), "ring of dueling"));
		}

		if (this.getGlory)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getGloryMode.toString(), "glory"));
		}

		if (this.getSkillsNecklace)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getSkillsNecklaceMode.toString(), "skills necklace"));
		}

		if (this.getNecklaceofPassage)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getNecklaceofPassageMode.toString(), "necklace of passage"));
		}

		if (this.getDigsitePendant)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getDigsitePendantMode.toString(), "digsite pendant"));
		}

		if (this.getSlayerRing)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getSlayerRingMode.toString(), "slayer ring"));
		}

		if (this.getXericsTalisman)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getXericsTalismanMode.toString(), "talisman"));
		}

		if (this.getRingofWealth)
		{
			menuManager.addPriorityEntry(new EquipmentComparableEntry(this.getRingofWealthMode.toString(), "ring of wealth"));
		}

		if (this.swapMax)
		{
			menuManager.addPriorityEntry(this.maxMode.toString(), "max cape");
		}

		if (this.swapQuestCape)
		{
			menuManager.addPriorityEntry(this.questCapeMode.toString(), "quest point cape");
		}

		if (this.swapHouseAd)
		{
			menuManager.addPriorityEntry(this.swapHouseAdMode.getEntry());
		}
	}

	private void removeSwaps()
	{
		final Iterator<Map.Entry<AbstractComparableEntry, AbstractComparableEntry>> dePrioIter = dePrioSwaps.entrySet().iterator();
		dePrioIter.forEachRemaining((e) ->
		{
			menuManager.removeSwap(e.getKey(), e.getValue());
			dePrioIter.remove();
		});
		Text.fromCSV(this.getWithdrawOneItems).forEach(item ->
		{
			menuManager.removePriorityEntry(newBankComparableEntry("Withdraw-1", item));
			menuManager.removePriorityEntry(newBankComparableEntry("Deposit-1", item));
		});
		Text.fromCSV(this.getWithdrawFiveItems).forEach(item ->
		{
			menuManager.removePriorityEntry(newBankComparableEntry("Withdraw-5", item));
			menuManager.removePriorityEntry(newBankComparableEntry("Deposit-5", item));
		});
		Text.fromCSV(this.getWithdrawTenItems).forEach(item ->
		{
			menuManager.removePriorityEntry(newBankComparableEntry("Withdraw-10", item));
			menuManager.removePriorityEntry(newBankComparableEntry("Deposit-10", item));
		});
		Text.fromCSV(this.getWithdrawXItems).forEach(item ->
		{
			menuManager.removePriorityEntry(newBankComparableEntry("Withdraw-" + this.getWithdrawXAmount, item));
			menuManager.removePriorityEntry(newBankComparableEntry("Deposit-" + this.getWithdrawXAmount, item));
		});
		Text.fromCSV(this.getWithdrawAllItems).forEach(item ->
		{
			menuManager.removePriorityEntry(newBankComparableEntry("Withdraw-All", item));
			menuManager.removePriorityEntry(newBankComparableEntry("Deposit-All", item));
		});
		Text.fromCSV(this.getBuyOneItems).forEach(item -> menuManager.removePriorityEntry("Buy 1", item));
		Text.fromCSV(this.getBuyFiveItems).forEach(item -> menuManager.removePriorityEntry("Buy 5", item));
		Text.fromCSV(this.getBuyTenItems).forEach(item -> menuManager.removePriorityEntry("Buy 10", item));
		Text.fromCSV(this.getBuyFiftyItems).forEach(item -> menuManager.removePriorityEntry("Buy 50", item));
		Text.fromCSV(this.getSellOneItems).forEach(item -> menuManager.removePriorityEntry("Sell 1", item));
		Text.fromCSV(this.getSellFiveItems).forEach(item -> menuManager.removePriorityEntry("Sell 5", item));
		Text.fromCSV(this.getSellTenItems).forEach(item -> menuManager.removePriorityEntry("Sell 10", item));
		Text.fromCSV(this.getSellFiftyItems).forEach(item -> menuManager.removePriorityEntry("Sell 50", item));
		menuManager.removePriorityEntry("Activate", "Box trap");
		menuManager.removePriorityEntry("Assignment");
		menuManager.removePriorityEntry("Bank");
		menuManager.removePriorityEntry("Buy All");
		menuManager.removePriorityEntry("Buy-plank");
		menuManager.removePriorityEntry("Buy-plank", "Sawmill operator");
		menuManager.removePriorityEntry("Charter");
		menuManager.removePriorityEntry("Chase");
		menuManager.removePriorityEntry("Claim");
		menuManager.removePriorityEntry("Claim-slime");
		menuManager.removePriorityEntry("Contract");
		menuManager.removePriorityEntry("Decant");
		menuManager.removePriorityEntry("Dream");
		menuManager.removePriorityEntry("Edgeville", "Lever");
		menuManager.removePriorityEntry("Empty", "Birdhouse");
		menuManager.removePriorityEntry("Empty", "Magic Birdhouse");
		menuManager.removePriorityEntry("Empty", "Mahogany Birdhouse");
		menuManager.removePriorityEntry("Empty", "Maple Birdhouse");
		menuManager.removePriorityEntry("Empty", "Oak Birdhouse");
		menuManager.removePriorityEntry("Empty", "Redwood Birdhouse");
		menuManager.removePriorityEntry("Empty", "Teak Birdhouse");
		menuManager.removePriorityEntry("Empty", "Willow Birdhouse");
		menuManager.removePriorityEntry("Empty", "Yew Birdhouse");
		menuManager.removePriorityEntry("Enchant");
		menuManager.removePriorityEntry("Escort");
		menuManager.removePriorityEntry("Exchange");
		menuManager.removePriorityEntry("Fill", "Coal bag");
		menuManager.removePriorityEntry("Fly");
		menuManager.removePriorityEntry("Follow", "Elkoy");
		menuManager.removePriorityEntry("Guzzle", "Dwarven rock cake");
		menuManager.removePriorityEntry("Harpoon");
		menuManager.removePriorityEntry("Heal");
		menuManager.removePriorityEntry("Help");
		menuManager.removePriorityEntry("Jatizso");
		menuManager.removePriorityEntry("Kandarin Monastery");
		menuManager.removePriorityEntry("Lay", "Box trap");
		menuManager.removePriorityEntry("Metamorphosis", "Baby chinchompa");
		menuManager.removePriorityEntry("Monastery Teleport");
		menuManager.removePriorityEntry("Neitiznot");
		menuManager.removePriorityEntry("Pay (", false);
		menuManager.removePriorityEntry("Pay");
		menuManager.removePriorityEntry("Pay-fare");
		menuManager.removePriorityEntry("Pay-toll(10gp)", "Gate");
		menuManager.removePriorityEntry("Pay-toll(2-ecto)", "Energy barrier");
		menuManager.removePriorityEntry("Perks", "Mounted Max Cape");
		menuManager.removePriorityEntry("Pick-lots");
		menuManager.removePriorityEntry("Pickpocket");
		menuManager.removePriorityEntry("Private");
		menuManager.removePriorityEntry("Quick-enter");
		menuManager.removePriorityEntry("Quick-leave");
		menuManager.removePriorityEntry("Quick-open");
		menuManager.removePriorityEntry("Quick-pass");
		menuManager.removePriorityEntry("Quick-pay", "Hardwood grove doors");
		menuManager.removePriorityEntry("Quick-start");
		menuManager.removePriorityEntry("Quick-travel");
		menuManager.removePriorityEntry("Rellekka");
		menuManager.removePriorityEntry("Repairs");
		menuManager.removePriorityEntry("Reset", "Shaking box");
		menuManager.removePriorityEntry("Search for traps");
		menuManager.removePriorityEntry("Search");
		menuManager.removePriorityEntry("Send-parcel", "Rionasta");
		menuManager.removePriorityEntry("Shop");
		menuManager.removePriorityEntry("Spellbook", "Magic cape");
		menuManager.removePriorityEntry("Spellbook", "Magic cape(t)");
		menuManager.removePriorityEntry("Spellbook", "Mounted Magic Cape");
		menuManager.removePriorityEntry("Start-minigame");
		menuManager.removePriorityEntry("Story");
		menuManager.removePriorityEntry("Stun", "Hoop snake");
		menuManager.removePriorityEntry("Take-boat");
		menuManager.removePriorityEntry("Tan All");
		menuManager.removePriorityEntry("Teleport menu", "Portal nexus");
		menuManager.removePriorityEntry("Teleport", "Crafting cape");
		menuManager.removePriorityEntry("Teleport", "Crafting cape(t)");
		menuManager.removePriorityEntry("Teleport", "Explorer's ring 2");
		menuManager.removePriorityEntry("Teleport", "Explorer's ring 3");
		menuManager.removePriorityEntry("Teleport", "Explorer's ring 4");
		menuManager.removePriorityEntry("Teleport", "Mage of zamorak");
		menuManager.removePriorityEntry("Teleport", "Mounted Construction Cape");
		menuManager.removePriorityEntry("Teleport", "Mounted Crafting Cape");
		menuManager.removePriorityEntry("Teleport", "Mounted Fishing Cape");
		menuManager.removePriorityEntry("Teleport", "Mounted Hunter Cape");
		menuManager.removePriorityEntry("Teleport", "Mounted Strength Cape");
		menuManager.removePriorityEntry("Trade");
		menuManager.removePriorityEntry("Trade-with");
		menuManager.removePriorityEntry("Transport");
		menuManager.removePriorityEntry("Travel");
		menuManager.removePriorityEntry("Travel", "Trapdoor");
		menuManager.removePriorityEntry(new BankComparableEntry("collect", "", false));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getBurningAmuletMode.toString(), "burning amulet"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getCombatBraceletMode.toString(), "combat bracelet"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getDigsitePendantMode.toString(), "digsite pendant"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getDuelingRingMode.toString(), "ring of dueling"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getGamesNecklaceMode.toString(), "games necklace"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getGloryMode.toString(), "glory"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getNecklaceofPassageMode.toString(), "necklace of passage"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getRingofWealthMode.toString(), "ring of wealth"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getSkillsNecklaceMode.toString(), "skills necklace"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getSlayerRingMode.toString(), "slayer ring"));
		menuManager.removePriorityEntry(new EquipmentComparableEntry(this.getXericsTalismanMode.toString(), "talisman"));
		menuManager.removePriorityEntry(new InventoryComparableEntry("Rub", "", false));
		menuManager.removePriorityEntry(new InventoryComparableEntry("Teleport", "", false));
		menuManager.removePriorityEntry(new InventoryComparableEntry("Use", "bone", false));
		menuManager.removePriorityEntry(newBankComparableEntry("Empty", "Coal bag"));
		menuManager.removePriorityEntry(this.constructionCapeMode.toString(), "Construct. cape");
		menuManager.removePriorityEntry(this.constructionCapeMode.toString(), "Construct. cape(t)");
		menuManager.removePriorityEntry(this.getConstructionMode.getBuild());
		menuManager.removePriorityEntry(this.getConstructionMode.getRemove());
		menuManager.removePriorityEntry(this.maxMode.toString(), "max cape");
		menuManager.removePriorityEntry(this.questCapeMode.toString(), "quest point cape");
		menuManager.removePriorityEntry(this.swapHouseAdMode.getEntry());

		switch (this.swapFairyRingMode)
		{
			case OFF:
			case ZANARIS:
				menuManager.removeSwaps("Fairy ring");
				menuManager.removeSwaps("Tree");
				break;
			case CONFIGURE:
				menuManager.removePriorityEntry("Configure", "Fairy ring");
				break;
			case LAST_DESTINATION:
				menuManager.removePriorityEntry("Last-destination", false);
				break;
		}

		switch (this.swapFairyTreeMode)
		{
			case OFF:
			case TREE:
				menuManager.removePriorityEntry("Tree", "Spiritual Fairy Tree");
				break;
			case RING_ZANARIS:
				menuManager.removePriorityEntry("Ring-Zanaris", "Spiritual Fairy Tree");
				break;
			case RING_CONFIGURE:
				menuManager.removePriorityEntry("Ring-configure", "Spiritual Fairy Tree");
				break;
			case RING_LAST_DESTINATION:
				menuManager.removePriorityEntry("Ring-last-destination", false);
				break;
		}

		switch (this.swapOccultMode)
		{
			case LUNAR:
				menuManager.removePriorityEntry("Lunar", "Altar of the Occult");
				break;
			case ANCIENT:
				menuManager.removePriorityEntry("Ancient", "Altar of the Occult");
				break;
			case ARCEUUS:
				menuManager.removePriorityEntry("Arceuus", "Altar of the Occult");
				break;
		}

		switch (this.swapObeliskMode)
		{
			case SET_DESTINATION:
				menuManager.removePriorityEntry("Set destination", "Obelisk");
				break;
			case TELEPORT_TO_DESTINATION:
				menuManager.removePriorityEntry("Teleport to destination", "Obelisk");
				break;
		}

		switch (this.swapHomePortalMode)
		{
			case HOME:
				menuManager.removePriorityEntry("Home");
				break;
			case BUILD_MODE:
				menuManager.removePriorityEntry("Build mode");
				break;
			case FRIENDS_HOUSE:
				menuManager.removePriorityEntry("Friend's house");
				break;
		}
	}

	private boolean isPuroPuro()
	{
		Player player = client.getLocalPlayer();

		if (player == null)
		{
			return false;
		}
		else
		{
			WorldPoint location = player.getWorldLocation();
			return location.getRegionID() == PURO_PURO_REGION_ID;
		}
	}

	private void loadConstructionItems()
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		if (!buildingMode)
		{
			menuManager.removePriorityEntry(this.getConstructionMode.getBuild());
			menuManager.removePriorityEntry(this.getConstructionMode.getRemove());
			return;
		}

		if (this.getEasyConstruction)
		{
			menuManager.addPriorityEntry(this.getConstructionMode.getBuild()).setPriority(100);
			menuManager.addPriorityEntry(this.getConstructionMode.getRemove()).setPriority(100);
		}
	}

	private void startHotkey()
	{
		eventBus.subscribe(ClientTick.class, HOTKEY, this::addHotkey);
		eventBus.subscribe(ClientTick.class, HOTKEY_CHECK, this::hotkeyCheck);
	}

	private void addHotkey(ClientTick event)
	{
		loadCustomSwaps(this.configCustomShiftSwaps, customShiftSwaps);

		if (this.swapClimbUpDown)
		{
			menuManager.addPriorityEntry("climb-up").setPriority(100);
		}

		eventBus.unregister(HOTKEY);
	}

	private void stopHotkey()
	{
		eventBus.subscribe(ClientTick.class, HOTKEY, this::removeHotkey);
	}

	private void removeHotkey(ClientTick event)
	{
		menuManager.removePriorityEntry("climb-up");
		loadCustomSwaps("", customShiftSwaps);
		eventBus.unregister(HOTKEY);
	}

	private void hotkeyCheck(ClientTick event)
	{
		if (hotkeyActive)
		{
			int i = 0;
			for (boolean bol : client.getPressedKeys())
			{
				if (bol)
				{
					i++;
				}
			}
			if (i == 0)
			{
				stopHotkey();
				setHotkeyActive(false);
				eventBus.unregister(HOTKEY_CHECK);
			}
		}
	}

	private void startControl()
	{
		if (!this.swapClimbUpDown)
		{
			return;
		}

		eventBus.subscribe(ClientTick.class, CONTROL, this::addControl);
		eventBus.subscribe(ClientTick.class, CONTROL_CHECK, this::controlCheck);
	}

	private void addControl(ClientTick event)
	{
		menuManager.addPriorityEntry("climb-down").setPriority(100);
		eventBus.unregister(CONTROL);
	}

	private void stopControl()
	{
		eventBus.subscribe(ClientTick.class, CONTROL, this::removeControl);
	}

	private void removeControl(ClientTick event)
	{
		menuManager.removePriorityEntry("climb-down");
		eventBus.unregister(CONTROL);
	}

	private void controlCheck(ClientTick event)
	{
		if (controlActive)
		{
			int i = 0;
			for (boolean bol : client.getPressedKeys())
			{
				if (bol)
				{
					i++;
				}
			}
			if (i == 0)
			{
				stopControl();
				setControlActive(false);
				eventBus.unregister(CONTROL_CHECK);
			}
		}
	}

	private void setCastOptions(boolean force)
	{
		clientThread.invoke(() ->
		{
			boolean tmpInCoxRaid = client.getVar(Varbits.IN_RAID) == 1;
			if (tmpInCoxRaid != inCoxRaid || force)
			{
				if (tmpInCoxRaid && this.hideCastCoX)
				{
					client.setHideFriendCastOptions(true);
					client.setHideClanmateCastOptions(true);
					client.setUnhiddenCasts(this.hideCastIgnoredCoX);
				}

				inCoxRaid = tmpInCoxRaid;
			}

			boolean tmpInTobRaid = client.getVar(Varbits.THEATRE_OF_BLOOD) == 2;
			if (tmpInTobRaid != inTobRaid || force)
			{
				if (tmpInTobRaid && this.hideCastToB)
				{
					client.setHideFriendCastOptions(true);
					client.setHideClanmateCastOptions(true);
					client.setUnhiddenCasts(this.hideCastIgnoredToB);
				}

				inTobRaid = tmpInTobRaid;
			}

			if (!inCoxRaid && !inTobRaid)
			{
				resetCastOptions();
			}
		});
	}

	private void resetCastOptions()
	{
		clientThread.invoke(() ->
		{
			if (client.getVar(Varbits.IN_WILDERNESS) == 1 || WorldType.isAllPvpWorld(client.getWorldType()) && pluginManager.isPluginEnabled(pvpTools) && pvpToolsConfig.hideCast())
			{
				pvpTools.setCastOptions();
			}
			else
			{
				client.setHideFriendCastOptions(false);
				client.setHideClanmateCastOptions(false);
			}
		});
	}

	private void updateConfig()
	{
		this.charterOption = config.charterOption();
		this.configCustomShiftSwaps = config.shiftCustomSwaps();
		this.configCustomSwaps = config.customSwaps();
		this.ardougneCloakMode = config.ardougneCloakMode();
		this.constructionCapeMode = config.constructionCapeMode();
		this.getBurningAmulet = config.getBurningAmulet();
		this.getBurningAmuletMode = config.getBurningAmuletMode();
		this.getBuyFiftyItems = config.getBuyFiftyItems();
		this.getBuyFiveItems = config.getBuyFiveItems();
		this.getBuyOneItems = config.getBuyOneItems();
		this.getBuyTenItems = config.getBuyTenItems();
		this.getCombatBracelet = config.getCombatBracelet();
		this.getCombatBraceletMode = config.getCombatBraceletMode();
		this.getConstructionMode = config.getConstructionMode();
		this.getDigsitePendant = config.getDigsitePendant();
		this.getDigsitePendantMode = config.getDigsitePendantMode();
		this.getDuelingRing = config.getDuelingRing();
		this.getDuelingRingMode = config.getDuelingRingMode();
		this.getEasyConstruction = config.getEasyConstruction();
		this.getGamesNecklace = config.getGamesNecklace();
		this.getGamesNecklaceMode = config.getGamesNecklaceMode();
		this.getGlory = config.getGlory();
		this.getGloryMode = config.getGloryMode();
		this.getNecklaceofPassage = config.getNecklaceofPassage();
		this.getNecklaceofPassageMode = config.getNecklaceofPassageMode();
		this.getRemoveObjects = config.getRemoveObjects();
		this.getRemovedObjects = config.getRemovedObjects();
		this.getRingofWealth = config.getRingofWealth();
		this.getRingofWealthMode = config.getRingofWealthMode();
		this.getSellFiftyItems = config.getSellFiftyItems();
		this.getSellFiveItems = config.getSellFiveItems();
		this.getSellOneItems = config.getSellOneItems();
		this.getSellTenItems = config.getSellTenItems();
		this.getSkillsNecklace = config.getSkillsNecklace();
		this.getSkillsNecklaceMode = config.getSkillsNecklaceMode();
		this.getSlayerRing = config.getSlayerRing();
		this.getSlayerRingMode = config.getSlayerRingMode();
		this.getSwapArdougneCloak = config.getSwapArdougneCloak();
		this.getSwapBuyFifty = config.getSwapBuyFifty();
		this.getSwapBuyFive = config.getSwapBuyFive();
		this.getSwapBuyOne = config.getSwapBuyOne();
		this.getSwapBuyTen = config.getSwapBuyTen();
		this.getSwapConstructionCape = config.getSwapConstructionCape();
		this.getSwapCraftingCape = config.getSwapCraftingCape();
		this.getSwapExplorersRing = config.getSwapExplorersRing();
		this.getSwapMagicCape = config.getSwapMagicCape();
		this.getSwapPuro = config.getSwapPuro();
		this.getSwapSawmill = config.getSwapSawmill();
		this.getSwapSawmillPlanks = config.getSwapSawmillPlanks();
		this.getSwapSellFifty = config.getSwapSellFifty();
		this.getSwapSellFive = config.getSwapSellFive();
		this.getSwapSellOne = config.getSwapSellOne();
		this.getSwapSellTen = config.getSwapSellTen();
		this.getSwapTanning = config.getSwapTanning();
		this.getWithdrawAll = config.getWithdrawAll();
		this.getWithdrawAllItems = config.getWithdrawAllItems();
		this.getWithdrawFive = config.getWithdrawFive();
		this.getWithdrawFiveItems = config.getWithdrawFiveItems();
		this.getWithdrawOne = config.getWithdrawOne();
		this.getWithdrawOneItems = config.getWithdrawOneItems();
		this.getWithdrawTen = config.getWithdrawTen();
		this.getWithdrawTenItems = config.getWithdrawTenItems();
		this.getWithdrawX = config.getWithdrawX();
		this.getWithdrawXAmount = config.getWithdrawXAmount();
		this.getWithdrawXItems = config.getWithdrawXItems();
		this.getXericsTalisman = config.getXericsTalisman();
		this.getXericsTalismanMode = config.getXericsTalismanMode();
		this.hideBait = config.hideBait();
		this.hideCastCoX = config.hideCastCoX();
		this.hideCastIgnoredCoX = Sets.newHashSet(Text.fromCSV(config.hideCastIgnoredCoX().toLowerCase()));
		this.hideCastIgnoredToB = Sets.newHashSet(Text.fromCSV(config.hideCastIgnoredToB().toLowerCase()));
		this.hideCastToB = config.hideCastToB();
		this.hideDestroyBoltpouch = config.hideDestroyBoltpouch();
		this.hideDestroyCoalbag = config.hideDestroyCoalbag();
		this.hideDestroyGembag = config.hideDestroyGembag();
		this.hideDestroyHerbsack = config.hideDestroyHerbsack();
		this.hideDestroyLootingBag = config.hideDestroyLootingBag();
		this.hideDestroyRunepouch = config.hideDestroyRunepouch();
		this.hideDropRunecraftingPouch = config.hideDropRunecraftingPouch();
		this.hideExamine = config.hideExamine();
		this.hideLookup = config.hideLookup();
		this.hideNet = config.hideNet();
		this.hideReport = config.hideReport();
		this.hideTradeWith = config.hideTradeWith();
		this.hotkeyMod = config.hotkeyMod();
		this.maxMode = config.maxMode();
		this.questCapeMode = config.questCapeMode();
		this.rockCake = config.rockCake();
		this.swapAbyssTeleport = config.swapAbyssTeleport();
		this.swapAdmire = config.swapAdmire();
		this.swapAssignment = config.swapAssignment();
		this.swapBankExchange = config.swapBankExchange();
		this.swapBirdhouseEmpty = config.swapBirdhouseEmpty();
		this.swapBones = config.swapBones();
		this.swapBoxTrap = config.swapBoxTrap();
		this.swapChase = config.swapChase();
		this.swapClimbUpDown = config.swapClimbUpDown();
		this.swapCoalBag = config.swapCoalBag();
		this.swapContract = config.swapContract();
		this.swapEnchant = config.swapEnchant();
		this.swapFairyRingMode = config.swapFairyRingMode();
		this.swapFairyTreeMode = config.swapFairyTreeMode();
		this.swapHardWoodGrove = config.swapHardWoodGrove();
		this.swapHarpoon = config.swapHarpoon();
		this.swapHomePortalMode = config.swapHomePortalMode();
		this.swapImps = config.swapImps();
		this.swapInteract = config.swapInteract();
		this.swapMax = config.swapMax();
		this.swapMetamorphosis = config.swapMetamorphosis();
		this.swapMinigame = config.swapMinigame();
		this.swapNexus = config.swapNexus();
		this.swapObeliskMode = config.swapObeliskMode();
		this.swapOccultMode = config.swapOccultMode();
		this.swapPay = config.swapPay();
		this.swapPick = config.swapPick();
		this.swapPickpocket = config.swapPickpocket();
		this.swapPlank = config.swapPlank();
		this.swapPrivate = config.swapPrivate();
		this.swapQuestCape = config.swapQuestCape();
		this.swapQuick = config.swapQuick();
		this.swapRogueschests = config.swapRogueschests();
		this.swapSearch = config.swapSearch();
		this.swapStun = config.swapStun();
		this.swapTeleportItem = config.swapTeleportItem();
		this.swapTrade = config.swapTrade();
		this.swapTravel = config.swapTravel();
		this.swapWildernessLever = config.swapWildernessLever();
		this.swapHouseAd = config.swapHouseAd();
		this.swapHouseAdMode = config.swapHouseAdMode();
	}

	/**
	 * Migrates old custom swaps config
	 * This should be removed after a reasonable amount of time.
	 */
	private static boolean oldParse(String value)
	{
		try
		{
			final StringBuilder sb = new StringBuilder();

			for (String str : value.split("\n"))
			{
				if (!str.startsWith("//"))
				{
					sb.append(str).append("\n");
				}
			}

			NEWLINE_SPLITTER.withKeyValueSeparator(':').split(sb);
			return true;
		}
		catch (IllegalArgumentException ex)
		{
			return false;
		}
	}

	/**
	 * Migrates old custom swaps config
	 * This should be removed after a reasonable amount of time.
	 */
	private void migrateConfig()
	{
		final String customSwaps = config.customSwaps();

		if (!CustomSwapParse.parse(customSwaps) && oldParse(customSwaps))
		{
			final StringBuilder sb = new StringBuilder();

			for (String str : customSwaps.split("\n"))
			{
				if (!str.startsWith("//"))
				{
					sb.append(str).append("\n");
				}
			}

			final Map<String, String> split = NEWLINE_SPLITTER.withKeyValueSeparator(':').split(sb);

			sb.setLength(0);

			for (Map.Entry<String, String> entry : split.entrySet())
			{
				String val = entry.getValue();
				if (!val.contains(","))
				{
					continue;
				}

				sb.append(entry.getValue()).append(":0\n");
			}

			configManager.setConfiguration("menuentryswapper", "customSwaps", sb.toString());
		}

		// Ugly band-aid i'm sorry
		configManager.setConfiguration("menuentryswapper", "customSwaps",
			Arrays.stream(config.customSwaps()
				.split("\n"))
				.distinct()
				.filter(swap -> !"walk here"
					.equals(swap.
						split(":")[0]
						.trim()
						.toLowerCase()))
				.filter(swap -> !"cancel"
					.equals(swap
						.split(":")[0]
						.trim()
						.toLowerCase()))
				.collect(Collectors.joining("\n"))
		);
	}

	private final HotkeyListener hotkey = new HotkeyListener(() -> this.hotkeyMod)
	{
		@Override
		public void hotkeyPressed()
		{
			startHotkey();
			setHotkeyActive(true);
		}

		@Override
		public void hotkeyReleased()
		{
			stopHotkey();
			setHotkeyActive(false);
		}
	};

	private final HotkeyListener ctrlHotkey = new HotkeyListener(() -> Keybind.CTRL)
	{
		@Override
		public void hotkeyPressed()
		{
			startControl();
			setControlActive(true);
		}

		@Override
		public void hotkeyReleased()
		{
			stopControl();
			setControlActive(false);
		}
	};
}
