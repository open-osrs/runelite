/*
 * Copyright (c) 2020, Adrian Lee Elder <https://github.com/AdrianLeeElder>
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
package net.runelite.client.plugins.bankhistory;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.inject.Provides;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Varbits;
import net.runelite.client.RuneLite;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.http.api.RuneLiteAPI;

/**
 * Track the change in bank value overtime. Caches values locally.
 */
@Slf4j
public class BankValueHistoryTracker
{
	private static final List<Varbits> TAB_VARBITS = ImmutableList.of(
		Varbits.BANK_TAB_ONE_COUNT,
		Varbits.BANK_TAB_TWO_COUNT,
		Varbits.BANK_TAB_THREE_COUNT,
		Varbits.BANK_TAB_FOUR_COUNT,
		Varbits.BANK_TAB_FIVE_COUNT,
		Varbits.BANK_TAB_SIX_COUNT,
		Varbits.BANK_TAB_SEVEN_COUNT,
		Varbits.BANK_TAB_EIGHT_COUNT,
		Varbits.BANK_TAB_NINE_COUNT
	);

	private static final File HISTORY_CACHE;
	private static final Gson GSON =
		RuneLiteAPI.GSON.newBuilder().registerTypeAdapter(BankValueHistoryContainer.class,
			new BankValueHistoryDeserializer()).create();
	private static final String EXTENTION = ".json";

	static
	{
		HISTORY_CACHE = new File(RuneLite.CACHE_DIR, "/bank");
		HISTORY_CACHE.mkdir();
	}

	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Inject
	private BankHistoryPlugin plugin;
	@Inject
	private ContainerCalculation bankCalculation;

	@Provides
	BankHistoryConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BankHistoryConfig.class);
	}

	/**
	 * Adds a group of prices to a local file cache. Uses a configuration
	 * to determine update frequency.
	 *
	 * @param bankValue current bank value
	 */
	public void add(String username, BankValue bankValue)
	{
		BankValueHistoryContainer valueHistory = getBankValueHistory(username);
		if (valueHistory != null)
		{
			valueHistory.addPrice(bankValue);
			try (FileWriter writer = new FileWriter(getFileForUser(username)))
			{
				GSON.toJson(valueHistory, writer);
			}
			catch (IOException e)
			{
				log.error("Unable to write to price value cache", e);
			}

			log.debug("Adding bank value history entry {}", valueHistory);
		}
	}

	/**
	 * Gets the current bank value history from disk.
	 *
	 * @param username username associated with the bank value.
	 * @return the retrieved bank value
	 */
	public BankValueHistoryContainer getBankValueHistory(String username)
	{
		File playerHistoryFile = getFileForUser(username);
		if (playerHistoryFile == null)
		{
			return null;
		}

		try (FileReader reader = new FileReader(playerHistoryFile))
		{
			playerHistoryFile.createNewFile();
			log.debug("Creating bank history cache file at {}", playerHistoryFile.getAbsolutePath());
			BankValueHistoryContainer container = GSON.fromJson(reader, BankValueHistoryContainer.class);
			if (container == null)
			{
				return new BankValueHistoryContainer();
			}

			return container;
		}
		catch (IOException e)
		{
			log.error("Error reading/writing to the cache files", e);
		}

		return null;
	}

	/**
	 * Get the data file for a specific user
	 *
	 * @param username user to get the data for
	 * @return data file for user
	 */
	public File getFileForUser(String username)
	{
		return new File(HISTORY_CACHE, username + EXTENTION);
	}


	/**
	 * Get all accounts that have tracking data from the local file cache.
	 *
	 * @return available accounts with data
	 */
	public List<String> getAvailableUsers()
	{
		List<String> result = new ArrayList<>();
		File[] accountFiles = HISTORY_CACHE.listFiles();
		if (accountFiles == null)
		{
			return result;
		}

		for (File file : accountFiles)
		{
			result.add(file.getName().replace(EXTENTION, ""));
		}

		return result;
	}

	/**
	 * Gets the last time something was added to the file cache.
	 *
	 * @param username
	 * @return
	 */
	public LocalDateTime getLastDataEntry(String username, int tab)
	{
		BankValueHistoryContainer container = getBankValueHistory(username);
		Set<LocalDateTime> times =
			container
				.getPricesMap()
				.entrySet()
				.parallelStream()
				.filter(bv -> bv.getValue().getTab() == tab)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		if (times == null || times.isEmpty())
		{
			return null;
		}

		return Collections.max(times);
	}

	/**
	 * Add a new dataset entry.
	 *
	 * @param force force a new entry, regardless of user configuration or last entry time.
	 */
	public void addEntry(boolean force, Consumer<String> callback)
	{
		clientThread.invokeLater(() ->
		{
			int currentBankTab = client.getVar(Varbits.CURRENT_BANK_TAB);
			LocalDateTime lastEntry = getLastDataEntry(client.getUsername(), currentBankTab);
			LocalDateTime nextUpdateTime = LocalDateTime.now().plusHours(plugin.getDefaultDatasetEntry());

			if (plugin.isOnlyManualEntries() && !force)
			{
				callback.accept("Automatic entries are currently disabled");

				return;
			}

			if (force || lastEntry == null || LocalDateTime.now().isAfter(nextUpdateTime))
			{
				BankValueHistoryTracker.this.add(client.getUsername(),
					BankValue
						.builder()
						.tab(client.getVar(Varbits.CURRENT_BANK_TAB))
						.bankValue(bankCalculation.calculate(getBankTabItems()))
						.build());

				if (callback != null)
				{
					callback.accept("New entry added!");
				}
			}
			else
			{
				if (callback != null)
				{
					callback.accept("No entry added.");
				}
			}
		});
	}

	public void addEntry()
	{
		addEntry(false, null);
	}

	private Item[] getBankTabItems()
	{
		final ItemContainer container = client.getItemContainer(InventoryID.BANK);
		if (container == null)
		{
			return null;
		}

		final Item[] items = container.getItems();
		int currentTab = client.getVar(Varbits.CURRENT_BANK_TAB);

		if (currentTab > 0)
		{
			int startIndex = 0;

			for (int i = currentTab - 1; i > 0; i--)
			{
				startIndex += client.getVar(TAB_VARBITS.get(i - 1));
			}

			int itemCount = client.getVar(TAB_VARBITS.get(currentTab - 1));
			return Arrays.copyOfRange(items, startIndex, startIndex + itemCount);
		}

		return items;
	}

}
