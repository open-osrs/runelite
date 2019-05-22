/*
 * Copyright (c) 2018, Alan Baumgartner <https://github.com/alanbaumgartner>
 * Copyright (c) 2018, https://runelitepl.us
 * Copyright (c) 2018, Kyle <https://github.com/kyleeld>
 * Copyright (c) 2018, Owain van Brakel <https://github.com/Owain94>
 * Copyright (c) 2018, Ganom <https://github.com/Ganom>
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
package net.runelite.client.plugins.easyscape;

import com.google.common.base.Strings;
import com.google.inject.Provides;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import static net.runelite.api.MenuAction.MENU_ACTION_DEPRIORITIZE_OFFSET;
import static net.runelite.api.MenuAction.WALK;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import static net.runelite.api.Varbits.BUILDING_MODE;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.ArrayUtils;


@PluginDescriptor(
	name = "Easyscape",
	type = PluginType.UTILITY
)
public class EasyscapePlugin extends Plugin
{
	private static final int PURO_PURO_REGION_ID = 10307;

	private MenuEntry[] entries;
	private final Set<Integer> leftClickConstructionIDs = new HashSet<>();

	@Inject
	private Client client;

	@Inject
	private EasyscapeConfig config;

	@Inject
	private MenuManager menuManager;

	@Provides
	EasyscapeConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EasyscapeConfig.class);
	}

	@Override
	public void startUp()
	{
		addSwaps();
		loadConstructionIDs(config.getConstructionItems());
	}

	@Override
	public void shutDown()
	{
		removeSwaps();
		loadConstructionIDs("");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		loadConstructionIDs(config.getConstructionItems());
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		final String option = Text.standardize(event.getOption());
		final String target = Text.standardize(event.getTarget());

		entries = client.getMenuEntries();

		if (option.contains("withdraw") || option.contains("deposit"))
		{
			if (config.getWithdrawOne())
			{
				for (String item : Text.fromCSV(config.getWithdrawOneItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("Withdraw-1", target);
						menuManager.addPriorityEntry("Deposit-1", target);
					}
				}
			}

			if (config.getWithdrawFive())
			{
				for (String item : Text.fromCSV(config.getWithdrawFiveItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("Withdraw-5", target);
						menuManager.addPriorityEntry("Deposit-5", target);
					}
				}
			}

			if (config.getWithdrawTen())
			{
				for (String item : Text.fromCSV(config.getWithdrawTenItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("Withdraw-10", target);
						menuManager.addPriorityEntry("Deposit-10", target);
					}
				}
			}

			if (config.getWithdrawX())
			{
				for (String item : Text.fromCSV(config.getWithdrawXItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("Withdraw-" + config.getWithdrawXAmount(), target);
						menuManager.addPriorityEntry("Deposit-" + config.getWithdrawXAmount(), target);
					}
				}
			}

			if (config.getWithdrawAll())
			{
				for (String item : Text.fromCSV(config.getWithdrawAllItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("Withdraw-All", target);
						menuManager.addPriorityEntry("Deposit-All", target);
					}
				}
			}
		}

		if (option.contains("buy"))
		{
			if (config.getSwapBuyOne() && !config.getBuyOneItems().equals(""))
			{
				for (String item : Text.fromCSV(config.getBuyOneItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("buy 1", item);
					}
				}
			}

			if (config.getSwapBuyFive() && !config.getBuyFiveItems().equals(""))
			{
				for (String item : Text.fromCSV(config.getBuyFiveItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("buy 5", item);
					}
				}
			}

			if (config.getSwapBuyTen() && !config.getBuyTenItems().equals(""))
			{
				for (String item : Text.fromCSV(config.getBuyTenItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("buy 10", item);
					}
				}
			}

			if (config.getSwapBuyFifty() && !config.getBuyFiftyItems().equals(""))
			{
				for (String item : Text.fromCSV(config.getBuyFiftyItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("buy 50", item);
					}
				}
			}
		}
		else if (option.contains("sell"))
		{
			if (config.getSwapSellOne() && !config.getSellOneItems().equals(""))
			{
				for (String item : Text.fromCSV(config.getSellOneItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("sell 1", item);
					}
				}
			}

			if (config.getSwapSellFive() && !Strings.isNullOrEmpty(config.getSellFiveItems()))
			{
				for (String item : Text.fromCSV(config.getSellFiveItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("sell 5", item);
					}
				}
			}

			if (config.getSwapSellTen() && !Strings.isNullOrEmpty(config.getSellTenItems()))
			{
				for (String item : Text.fromCSV(config.getSellTenItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("sell 10", item);
					}
				}
			}

			if (config.getSwapSellFifty() && !Strings.isNullOrEmpty(config.getSellFiftyItems()))
			{
				for (String item : Text.fromCSV(config.getSellFiftyItems()))
				{
					if (target.equals(Text.standardize(item)))
					{
						menuManager.addPriorityEntry("sell 50", item);
					}
				}
			}
		}

		if (config.getRemoveObjects() && !config.getRemovedObjects().equals(""))
		{
			for (String removed : Text.fromCSV(config.getRemovedObjects()))
			{
				removed = Text.standardize(removed);
				if (target.contains("(") && target.split(" \\(")[0].equals(removed))
				{
					delete(event.getIdentifier());
				}
				else if (target.contains("->"))
				{
					String trimmed = target.split("->")[1].trim();
					if (trimmed.length() >= removed.length() && trimmed.substring(0, removed.length()).equalsIgnoreCase(removed))
					{
						delete(event.getIdentifier());
						break;
					}
				}
				else if (target.length() >= removed.length() && target.substring(0, removed.length()).equalsIgnoreCase(removed))
				{
					delete(event.getIdentifier());
					break;
				}
			}
		}

		if (config.getSwapPuro() && isPuroPuro())
		{
			if (event.getType() == WALK.getId())
			{
				MenuEntry menuEntry = entries[entries.length - 1];
				menuEntry.setType(MenuAction.WALK.getId() + MENU_ACTION_DEPRIORITIZE_OFFSET);
			}
			else if (option.equalsIgnoreCase("examine"))
			{
				menuManager.addPriorityEntry("push-through", target);
			}
			else if (option.equalsIgnoreCase("use"))
			{
				menuManager.addPriorityEntry("escape", target);
			}
		}

		else if (config.getSwapSmithing() && option.contains("smith"))
		{
			if (option.equalsIgnoreCase("Smith 1"))
			{
				menuManager.addPriorityEntry("Smith All", target);
			}
			else if (option.equalsIgnoreCase("Smith 1 Set"))
			{
				menuManager.addPriorityEntry("Smith All Sets", target);
			}
		}

		else if (config.getSwapTanning() && option.equalsIgnoreCase("Tan 1"))
		{
			menuManager.addPriorityEntry("Tan All", target);
		}

		else if (config.getSwapSawmill() && target.equalsIgnoreCase("Sawmill operator"))
		{
			menuManager.addPriorityEntry("Buy-plank", target);
		}

		else if (config.getSwapSawmillPlanks() && option.equalsIgnoreCase("Buy 1"))
		{
			menuManager.addPriorityEntry("Buy All", target);
		}

		else if (option.equalsIgnoreCase("Clear-All") && target.equalsIgnoreCase("Bank Filler"))
		{
			menuManager.addPriorityEntry("Clear", target);
		}

		else if (target.contains("ardougne cloak") && config.getSwapArdougneCape())
		{
			menuManager.addPriorityEntry("Kandarin Monastery", target);
			menuManager.addPriorityEntry("Monastery Teleport", target);
		}

		else if (target.contains("crafting cape") && config.getSwapCraftingCape())
		{
			menuManager.addPriorityEntry("Teleport", target);
		}

		else if (target.contains("construct. cape") && config.getSwapConstructionCape())
		{
			menuManager.addPriorityEntry("Tele to poh", target);
		}

		else if (target.contains("magic cape") && config.getSwapMagicCape())
		{
			menuManager.addPriorityEntry("Spellbook", target);
		}

		else if (target.contains("explorer's ring") && config.getSwapExplorersRing())
		{
			menuManager.addPriorityEntry("Teleport", target);
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!"easyscape".equals(event.getGroup()))
		{
			return;
		}

		loadConstructionIDs(config.getConstructionItems());
		removeSwaps();
		addSwaps();
	}

	private void addSwaps()
	{
		if (config.getBurningAmulet())
		{
			menuManager.addSwap("remove", "burning amulet", config.getBurningAmuletMode().toString(), "burning amulet", true, false);
		}

		if (config.getCombatBracelet())
		{
			menuManager.addSwap("remove", "combat bracelet", config.getCombatBraceletMode().toString(), "combat bracelet", true, false);
		}

		if (config.getGamesNecklace())
		{
			menuManager.addSwap("remove", "games necklace", config.getGamesNecklaceMode().toString(), "games necklace", true, false);
		}

		if (config.getDuelingRing())
		{
			menuManager.addSwap("remove", "ring of dueling", config.getDuelingRingMode().toString(), "ring of dueling", true, false);
		}

		if (config.getGlory())
		{
			menuManager.addSwap("remove", "amulet of glory", config.getGloryMode().toString(), "amulet of glory", true, false);
			menuManager.addSwap("remove", "amulet of eternal glory", config.getGloryMode().toString(), "amulet of eternal glory", true, false);
		}

		if (config.getSkillsNecklace())
		{
			menuManager.addSwap("remove", "skills necklace", config.getSkillsNecklaceMode().toString(), "skills necklace", true, false);
		}

		if (config.getNecklaceofPassage())
		{
			menuManager.addSwap("remove", "necklace of passage", config.getNecklaceofPassageMode().toString(), "necklace of passage", true, false);
		}

		if (config.getDigsitePendant())
		{
			menuManager.addSwap("remove", "digsite pendant", config.getDigsitePendantMode().toString(), "digsite pendant", true, false);
		}

		if (config.getSlayerRing())
		{
			menuManager.addSwap("remove", "slayer ring", config.getSlayerRingMode().toString(), "slayer ring", true, false);
		}

		else if (config.getXericsTalisman())
		{
			menuManager.addSwap("remove", "xeric's talisman", config.getXericsTalismanMode().toString(), "xeric's talisman", true, false);
		}

		if (config.getRingofWealth())
		{
			menuManager.addSwap("remove", "ring of wealth", config.getRingofWealthMode().toString(), "ring of wealth", true, false);
		}

		if (config.swapMax())
		{
			menuManager.addSwap("remove", "max cape", config.maxMode().toString(), "max cape", true, false);
		}
	}

	private void removeSwaps()
	{
		menuManager.removeSwaps("burning amulet");
		menuManager.removeSwaps("combat bracelet");
		menuManager.removeSwaps("games necklace");
		menuManager.removeSwaps("ring of dueling");
		menuManager.removeSwaps("amulet of glory");
		menuManager.removeSwaps("amulet of eternal glory");
		menuManager.removeSwaps("skills necklace");
		menuManager.removeSwaps("necklace of passage");
		menuManager.removeSwaps("digsite pendant");
		menuManager.removeSwaps("slayer ring");
		menuManager.removeSwaps("xeric's talisman");
		menuManager.removeSwaps("ring of wealth");
	}

	private void delete(int target)
	{
		for (int i = entries.length - 1; i >= 0; i--)
		{
			if (entries[i].getIdentifier() == target)
			{
				entries = ArrayUtils.remove(entries, i);
				i--;
			}
		}
		client.setMenuEntries(entries);
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

	private void loadConstructionIDs(String from)
	{
		if (client.getGameState() != GameState.LOGGED_IN
			|| Strings.isNullOrEmpty(from) && leftClickConstructionIDs.isEmpty())
		{
			return;
		}

		if (!leftClickConstructionIDs.isEmpty())
		{
			for (int i : leftClickConstructionIDs)
			{
				menuManager.toggleLeftClick("build", i, true);
				menuManager.toggleLeftClick("remove", i, true);
			}

			leftClickConstructionIDs.clear();
		}

		if (!config.getEasyConstruction() &&
			!Strings.isNullOrEmpty(from) &&
			client.getVar(BUILDING_MODE) == 1)
		{
			for (String s : Text.fromCSV(from))
			{
				int id = Integer.parseInt(s.replaceAll("[^0-9]", ""));

				if (leftClickConstructionIDs.contains(id))
				{
					continue;
				}

				if (menuManager.toggleLeftClick("build", id, false)
					|| menuManager.toggleLeftClick("remove", id, false))
				{
					leftClickConstructionIDs.add(id);
				}
			}
		}
	}
}
