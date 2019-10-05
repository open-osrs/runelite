/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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
package net.runelite.client.plugins.itemdropper;

import com.google.inject.Provides;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.flexo.Flexo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import static net.runelite.client.plugins.itemdropper.ExtUtils.getItems;
import static net.runelite.client.plugins.itemdropper.ExtUtils.stringToIntArray;
import net.runelite.client.plugins.stretchedmode.StretchedModeConfig;
import net.runelite.client.util.HotkeyListener;

@PluginDescriptor(
	name = "Item Dropper",
	description = "Drops selected items for you.",
	tags = {"item", "drop", "dropper", "bot"},
	type = PluginType.EXTERNAL
)
@Slf4j
public class ItemDropper extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private ConfigManager configManager;
	@Inject
	private ItemDropperConfig config;
	@Inject
	private KeyManager keyManager;
	@Inject
	private MenuManager menuManager;
	@Inject
	private ItemManager itemManager;
	private Flexo flexo;
	private BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);
	private ThreadPoolExecutor executorService = new ThreadPoolExecutor(1, 1, 25, TimeUnit.SECONDS, queue,
		new ThreadPoolExecutor.DiscardPolicy());
	private final HotkeyListener toggle = new HotkeyListener(() -> config.toggle())
	{
		@Override
		public void hotkeyPressed()
		{
			List<WidgetItem> items = new ArrayList<>(getItems(stringToIntArray(config.items()), client));
			if (items.isEmpty())
			{
				log.debug("Item list is empty.");
				return;
			}
			dropItems(items);
		}
	};

	@Provides
	ItemDropperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ItemDropperConfig.class);
	}

	@Override
	protected void startUp()
	{
		Flexo.client = client;
		keyManager.registerKeyListener(toggle);
		executorService.submit(() ->
		{
			flexo = null;
			try
			{
				flexo = new Flexo();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		});
	}

	@Override
	protected void shutDown()
	{
		keyManager.unregisterKeyListener(toggle);
		flexo = null;
	}

	private void dropItems(List<WidgetItem> dropList)
	{
		executorService.submit(() ->
		{
			for (WidgetItem item : dropList)
			{
				ItemDefinition itemDef = itemManager.getItemDefinition(item.getId());
				final String name = itemDef.getName();
				menuManager.addPriorityEntry("Drop", name);
				ExtUtils.handleSwitch(item.getCanvasBounds(), config.actionType(), flexo, client, configManager.getConfig(StretchedModeConfig.class).scalingFactor(), (int) getMillis());
				menuManager.removePriorityEntry("Drop", name);
			}
		});
	}

	private long getMillis()
	{
		return (long) (Math.random() * config.randLow() + config.randHigh());
	}
}
