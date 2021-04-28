/*
 * Copyright (c) 2020, Macweese <https://github.com/macweese>
 *  Macweese#1169, macweese@pm.me
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
package net.runelite.client.plugins.smithing;

import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.pf4j.Extension;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import static net.runelite.api.widgets.WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER;

@Extension
@PluginDescriptor(
		name = "Smithing",
		enabledByDefault = false,
		description = "Helps with smithing items at anvils",
		tags = {"skilling", "smithing", "bars", "anvil", "hammer", "lazy"}
)
public class SmithingPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private SmithingConfig config;

	@Provides
	SmithingConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SmithingConfig.class);
	}

	Widget widget;

	// WidgetInfo relating to widgets available within the smithing interface
	private static final List<WidgetInfo> SMITHING_INTERFACE = List.of(
			WidgetInfo.SMITHING_ANVIL_ARROW_HEADS,
			WidgetInfo.SMITHING_ANVIL_AXE,
			WidgetInfo.SMITHING_ANVIL_BATTLE_AXE,
			WidgetInfo.SMITHING_ANVIL_BOLTS,
			WidgetInfo.SMITHING_ANVIL_CHAIN_BODY,
			WidgetInfo.SMITHING_ANVIL_CLAWS,
			WidgetInfo.SMITHING_ANVIL_DAGGER,
			WidgetInfo.SMITHING_ANVIL_DART_TIPS,
			WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1,
			WidgetInfo.SMITHING_ANVIL_EXCLUSIVE2,
			WidgetInfo.SMITHING_ANVIL_FULL_HELM,
			WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS,
			WidgetInfo.SMITHING_ANVIL_KITE_SHIELD,
			WidgetInfo.SMITHING_ANVIL_KNIVES,
			WidgetInfo.SMITHING_ANVIL_LIMBS,
			WidgetInfo.SMITHING_ANVIL_LONG_SWORD,
			WidgetInfo.SMITHING_ANVIL_MACE,
			WidgetInfo.SMITHING_ANVIL_MED_HELM,
			WidgetInfo.SMITHING_ANVIL_NAILS,
			WidgetInfo.SMITHING_ANVIL_PLATE_BODY,
			WidgetInfo.SMITHING_ANVIL_PLATE_LEGS,
			WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT,
			WidgetInfo.SMITHING_ANVIL_SCIMITAR,
			WidgetInfo.SMITHING_ANVIL_SQ_SHIELD,
			WidgetInfo.SMITHING_ANVIL_SWORD,
			WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD,
			WidgetInfo.SMITHING_ANVIL_WARHAMMER
	);

	/**
	 * Run on plugin start
	 */
	@Override
	protected void startUp()
	{
		if (client.getGameState() != GameState.LOGGED_IN)
			return;

		widget = client.getWidget(config.item().getWidgetID());
		processWidgets();
	}

	/**
	 * Run on plugin shutdown
	 */
	@Override
	protected void shutDown()
	{
		applyOriginalProperties();
		resetInterface();
	}

	/**
	 * Run on plugin configuration settings altered
	 */
	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (client.getGameState() == GameState.LOGGED_IN)
			widget = client.getWidget(config.item().getWidgetID());

		applyOriginalProperties();
		processWidgets();

		if (event.getKey().equals("ez"))
		{
			if (client.getGameState() != GameState.LOGGED_IN)
				return;
			potatoMode(widget, true);
		}
	}

	/**
	 * Run on script events
	 */
	@Subscribe
	private void onScriptPostFired(ScriptPostFired event) throws Exception
	{
		processWidgets();
	}

	/**
	 * Iterate over all widgets found within the smithing interface and process them according to plugin configuration
	 */
	public void processWidgets()
	{
		hideWidgets();
		renderTargetWidget();
	}

	/**
	 * Force the selected widget from plugin configuration to be visible
	 */
	public void renderTargetWidget()
	{
		for (final WidgetInfo widgetInfo : SMITHING_INTERFACE)
		{
			final Widget x = client.getWidget(widgetInfo);
			if (x != client.getWidget(config.item().getWidgetInfo()))
			{
				continue;
			}

			if (x != null)
			{
				x.setHidden(false);
			}

			if (x != null && config.easy())
			{
				potatoMode(x);
			}
		}
	}

	/**
	 * Hide all widgets
	 */
	public void hideWidgets()
	{
		for (final WidgetInfo widgetInfo : SMITHING_INTERFACE)
		{
			final Widget x = client.getWidget(widgetInfo);

			if (client.getWidget(widgetInfo) != null)
			{
				Objects.requireNonNull(x).setHidden(true);
				clientThread.invoke(x::revalidate);
			}
		}
	}

	/**
	 * Enlarge the click area of the widget to ~90% of the interface and place its anchor top left
	 * @param widget Widget - Widget to process
	 */
	public void potatoMode(Widget widget)
	{
		if (widget != null && config.easy())
		{
			widget.setOriginalX(10);
			widget.setOriginalY(40);
			widget.setOriginalWidth(440);
			widget.setOriginalHeight(270);
		}
	}

	/**
	 * Enlarge the click area of the widget to ~90% of the interface and place its anchor top left
	 * @param widget Widget - Widget to process
	 * @param revalidate Boolean -  Revalidate the widget
	 */
	public void potatoMode(Widget widget, boolean revalidate)
	{
		if (widget != null && config.easy())
		{
			widget.setOriginalX(10);
			widget.setOriginalY(40);
			widget.setOriginalWidth(440);
			widget.setOriginalHeight(270);

			if (revalidate)
			{
				clientThread.invoke(widget::revalidate);
			}
		}
	}

	/**
	 * Return all widgets to their original state
	 */
	public void applyOriginalProperties()
	{
		for (final SmithingItem item : SmithingItem.values())
		{
			if (client.getWidget(item.getWidgetInfo()) == null)
				continue;

			final Widget original = Objects.requireNonNull(client.getWidget(item.getWidgetInfo()),
					"Widget 'original' must not be null - smithingPlugin.applyOriginalProperties()");

			original.setOriginalX(item.getOriginalX());
			original.setOriginalY(item.getOriginalY());
			original.setOriginalHeight(item.getOriginalHeight());
			original.setOriginalWidth(item.getOriginalWidth());
			clientThread.invoke(original::revalidate);
		}
	}

	/**
	 * Reset the interface to the original state
	 */
	public void resetInterface()
	{
		if (client.getWidget(SMITHING_INVENTORY_ITEMS_CONTAINER) != null)
		{
			for (final WidgetInfo widgetInfo : SMITHING_INTERFACE)
			{
				final Widget x = Objects.requireNonNull(client.getWidget(widgetInfo),
						"Widget 'x' must not be null - smithingPlugin.resetInterface()");
				x.setHidden(false);
				clientThread.invoke(x::revalidate);
			}
		}
	}
}