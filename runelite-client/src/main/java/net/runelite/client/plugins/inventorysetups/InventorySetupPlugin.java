/*
 * Copyright (c) 2018-2019, Ethan <https://github.com/Wea1thRS/>
 * Copyright (c) 2018, https://openosrs.com
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
package net.runelite.client.plugins.inventorysetups;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.inventorysetups.ui.InventorySetupPluginPanel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.components.colorpicker.ColorPickerManager;
import net.runelite.client.util.ImageUtil;
import joptsimple.internal.Strings;
import java.util.List;

@PluginDescriptor(
	name = "Inventory Setups",
	description = "Save inventory setups",
	tags = {"items", "inventory", "setups"},
	type = PluginType.UTILITY,
	enabledByDefault = false
)

@Slf4j
@Singleton
public class InventorySetupPlugin extends Plugin
{
	private static final String CONFIG_GROUP = "inventorysetups_new";
	private static final String CONFIG_KEY = "setups_new";
	private static final int NUM_INVENTORY_ITEMS = 28;
	private static final int NUM_EQUIPMENT_ITEMS = 14;
	private static final Color DEFAULT_HIGHLIGHT_COLOR = Color.RED;

	@Inject
	private Client client;

	@Inject
	private ItemManager itemManager;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private ClientThread clientThread;

	@Inject
	private EventBus eventBus;

	@Inject
	private ConfigManager configManager;

	@Getter
	@Inject
	private ColorPickerManager colorPickerManager;

	private InventorySetupPluginPanel panel;

	@Getter
	private List<InventorySetup> inventorySetups;

	private NavigationButton navButton;


	@Override
	public void startUp()
	{
		addSubscriptions();

		panel = new InventorySetupPluginPanel(this, itemManager);

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "inventorysetups_icon.png");

		navButton = NavigationButton.builder()
				.tooltip("Inventory Setups")
				.icon(icon)
				.priority(9)
				.panel(panel)
				.build();

		clientToolbar.addNavigation(navButton);


		loadConfig();
		panel.rebuild();
	}


	public void addInventorySetup()
	{
		final String name = JOptionPane.showInputDialog(panel,
				"Enter the name of this setup.",
				"Add New Setup",
				JOptionPane.PLAIN_MESSAGE);

		// cancel button was clicked
		if (name == null)
		{
			return;
		}

		if (name.isEmpty())
		{
			JOptionPane.showMessageDialog(panel,
					"Invalid Setup Name",
					"Names must not be empty.",
					JOptionPane.PLAIN_MESSAGE);
			return;
		}

		clientThread.invoke(() ->
		{
			List<InventorySetupItem> inv = getNormalizedContainer(InventoryID.INVENTORY);
			List<InventorySetupItem> eqp = getNormalizedContainer(InventoryID.EQUIPMENT);

			final InventorySetup invSetup = new InventorySetup(inv, eqp, name, DEFAULT_HIGHLIGHT_COLOR, false, false, false);
			SwingUtilities.invokeLater(() ->
			{
				inventorySetups.add(invSetup);
				panel.rebuild();

				updateConfig();
			});
		});
	}

	public void removeInventorySetup(final InventorySetup setup)
	{
		inventorySetups.remove(setup);
		panel.rebuild();
		updateConfig();
	}

	public void updateConfig()
	{
		if (inventorySetups.isEmpty())
		{
			configManager.unsetConfiguration(CONFIG_GROUP, CONFIG_KEY);
			return;
		}

		final Gson gson = new Gson();
		final String json = gson.toJson(inventorySetups);
		configManager.setConfiguration(CONFIG_GROUP, CONFIG_KEY, json);
	}
	private void loadConfig()
	{
		// serialize the internal data structure from the json in the configuration
		final String json = configManager.getConfiguration(CONFIG_GROUP, CONFIG_KEY);
		if (Strings.isNullOrEmpty(json))
		{
			inventorySetups = new ArrayList<>();
		}
		else
		{
			try
			{
				final Gson gson = new Gson();
				Type type = new TypeToken<ArrayList<InventorySetup>>()
				{

				}.getType();
				inventorySetups = gson.fromJson(json, type);
			}
			catch (JsonSyntaxException e)
			{
				inventorySetups = new ArrayList<>();
			}

		}
	}



	public void onItemContainerChanged(ItemContainerChanged event)
	{

		// check to see that the container is the equipment or inventory
		ItemContainer container = event.getItemContainer();

		if (container == client.getItemContainer(InventoryID.INVENTORY))
		{
			panel.highlightDifferences(InventoryID.INVENTORY);
		}
		else if (container == client.getItemContainer(InventoryID.EQUIPMENT))
		{
			panel.highlightDifferences(InventoryID.EQUIPMENT);
		}

	}

	public List<InventorySetupItem> getNormalizedContainer(final InventoryID id)
	{
		assert id == InventoryID.INVENTORY || id == InventoryID.EQUIPMENT : "invalid inventory ID";

		final ItemContainer container = client.getItemContainer(id);

		List<InventorySetupItem> newContainer = new ArrayList<>();

		Item[] items = null;
		if (container != null)
		{
			items = container.getItems();
		}

		int size = id == InventoryID.INVENTORY ? NUM_INVENTORY_ITEMS : NUM_EQUIPMENT_ITEMS;

		for (int i = 0; i < size; i++)
		{
			if (items == null || i >= items.length)
			{
				// add a "dummy" item to fill the normalized container to the right size
				// this will be useful to compare when no item is in a slot
				newContainer.add(new InventorySetupItem(-1, "", 0));
			}
			else
			{
				final Item item = items[i];
				String itemName = "";
				if (client.isClientThread())
				{
					itemName = itemManager.getItemDefinition(item.getId()).getName();
				}
				newContainer.add(new InventorySetupItem(item.getId(), itemName, item.getQuantity()));
			}
		}

		return newContainer;
	}

	@Override
	public void shutDown()
	{
		eventBus.unregister(this);
		clientToolbar.removeNavigation(navButton);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(ItemContainerChanged.class, this, this::onItemContainerChanged);

	}


}
