/*
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
package net.runelite.client.plugins.betterequipmentinspector;

import com.google.inject.Provides;
import com.openosrs.client.game.PlayerContainer;
import com.openosrs.client.game.PlayerManager;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.api.Player;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.kit.KitType;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.QuantityFormatter;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Better Equipment Inspector",
	enabledByDefault = false
)
public class BetterEquipmentInspectorPlugin extends Plugin
{
	private static final String INSPECT_EQUIPMENT = "Gear";

	@Inject
	private Client client;

	@Inject
	private BetterEquipmentInspectorConfig config;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private MenuManager menuManager;

	@Inject
	private ScheduledExecutorService executor;

	@Inject
	private ClientToolbar pluginToolbar;

	@Inject
	private PlayerManager playerManager;

	private NavigationButton navButton;
	private BetterEquipmentInspectorPanel betterEquipmentInspectorPanel;

	@Provides
	BetterEquipmentInspectorConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BetterEquipmentInspectorConfig.class);
	}

	@Override
	protected void startUp()
	{
		betterEquipmentInspectorPanel = injector.getInstance(BetterEquipmentInspectorPanel.class);
		client.setComparingAppearance(true);
		if (client != null)
		{
			menuManager.addPlayerMenuItem(INSPECT_EQUIPMENT);
		}

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(this.getClass(), "normal.png");

		navButton = NavigationButton.builder()
			.tooltip("Equipment Inspector")
			.icon(icon)
			.priority(5)
			.panel(betterEquipmentInspectorPanel)
			.build();

		pluginToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown()
	{
		menuManager.removePlayerMenuItem(INSPECT_EQUIPMENT);
		pluginToolbar.removeNavigation(navButton);
		client.setComparingAppearance(false);
	}

	@Subscribe
	private void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (!event.getMenuOption().equals(INSPECT_EQUIPMENT))
		{
			return;
		}

		try
		{
			SwingUtilities.invokeAndWait(() ->
			{
				if (!navButton.isSelected())
				{
					navButton.getOnSelect().run();
				}
			});
		}
		catch (InterruptedException | InvocationTargetException e)
		{
			throw new RuntimeException(e);
		}
		Player p = client.getCachedPlayers()[event.getId()];
		
		final PlayerContainer player = playerManager.getPlayer(p.getName());
		final Map<KitType, ItemComposition> playerEquipment = new HashMap<>();

		if (player == null)
		{
			return;
		}

		for (KitType kitType : KitType.values())
		{
			if (kitType == KitType.RING || kitType == KitType.AMMUNITION ||
				player.getPlayer().getPlayerComposition() == null)
			{
				continue;
			}

			final int itemId = player.getPlayer().getPlayerComposition().getEquipmentId(kitType);

			if (itemId != -1)
			{
				ItemComposition itemComposition = client.getItemDefinition(itemId);
				playerEquipment.put(kitType, itemComposition);
			}
		}

		if (config.showValue())
		{
			final LinkedHashMap<Integer, Integer> gear = new LinkedHashMap<>(player.getGear());
			removeEntries(gear, config.protectedItems());

			int risk = 0;
			for (int value : gear.values())
			{
				risk += value;
			}

			String price;

			if (!config.exactValue())
			{
				price = QuantityFormatter.quantityToRSDecimalStack(risk);
			}
			else
			{
				price = NumberFormat.getIntegerInstance().format(risk);
			}

			chatMessageManager.queue(QueuedMessage.builder()
				.type(ChatMessageType.CONSOLE)
				.runeLiteFormattedMessage(new ChatMessageBuilder()
					.append(ChatColorType.HIGHLIGHT)
					.append("Risked Value: ")
					.append(ChatColorType.NORMAL)
					.append(price)
					.build())
				.build());
		}
		betterEquipmentInspectorPanel.update(playerEquipment, p.getName());
	}

	private static void removeEntries(LinkedHashMap<Integer, Integer> map, int quantity)
	{
		for (int i = 0; i < quantity; i++)
		{
			if (!map.entrySet().iterator().hasNext())
			{
				return;
			}
			map.entrySet().remove(map.entrySet().iterator().next());
		}
	}
}
