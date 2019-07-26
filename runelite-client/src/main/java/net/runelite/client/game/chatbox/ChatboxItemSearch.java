/*
 * Copyright (c) 2019, Ron Young <https://github.com/raiyni>
 * All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
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

package net.runelite.client.game.chatbox;

import com.google.common.primitives.Ints;
import com.google.inject.Inject;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.inject.Singleton;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.api.widgets.ItemQuantityMode;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetPositionMode;
import net.runelite.api.widgets.WidgetSizeMode;
import net.runelite.api.widgets.WidgetTextAlignment;
import net.runelite.api.widgets.WidgetType;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.game.ItemManager;

@Singleton
public class ChatboxItemSearch extends ChatboxTextInput
{
	private static final int ICON_HEIGHT = 32;
	private static final int ICON_WIDTH = 36;
	private static final int PADDING = 6;
	private static final int MAX_RESULTS = 24;
	private static final int FONT_SIZE = 16;
	private static final int HOVERED_OPACITY = 128;

	private final ChatboxPanelManager chatboxPanelManager;
	private final ItemManager itemManager;
	private final Client client;

	private Map<Integer, ItemDefinition> results = new LinkedHashMap<>();
	private String tooltipText;
	private int index = -1;

	@Getter
	private Consumer<Integer> onItemSelected;

	@Inject
	private ChatboxItemSearch(ChatboxPanelManager chatboxPanelManager, ClientThread clientThread,
		ItemManager itemManager, Client client)
	{
		super(chatboxPanelManager, clientThread);
		this.chatboxPanelManager = chatboxPanelManager;
		this.itemManager = itemManager;
		this.client = client;

		lines(1);
		prompt("Item Search");
		onChanged(searchString ->
			clientThread.invokeLater(() ->
			{
				filterResults();
				update();
			}));
	}

	@Override
	protected void update()
	{
		Widget container = chatboxPanelManager.getContainerWidget();
		container.deleteAllChildren();

		Widget promptWidget = container.createChild(-1, WidgetType.TEXT);
		promptWidget.setText(getPrompt());
		promptWidget.setTextColor(0x800000);
		promptWidget.setFontId(getFontID());
		promptWidget.setOriginalX(0);
		promptWidget.setOriginalY(5);
		promptWidget.setXPositionMode(WidgetPositionMode.ABSOLUTE_CENTER);
		promptWidget.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		promptWidget.setOriginalHeight(FONT_SIZE);
		promptWidget.setXTextAlignment(WidgetTextAlignment.CENTER);
		promptWidget.setYTextAlignment(WidgetTextAlignment.CENTER);
		promptWidget.setWidthMode(WidgetSizeMode.MINUS);
		promptWidget.revalidate();

		buildEdit(0, 5 + FONT_SIZE, container.getWidth(), FONT_SIZE);

		Widget separator = container.createChild(-1, WidgetType.LINE);
		separator.setOriginalX(0);
		separator.setOriginalY(8 + (FONT_SIZE * 2));
		separator.setXPositionMode(WidgetPositionMode.ABSOLUTE_CENTER);
		separator.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
		separator.setOriginalHeight(0);
		separator.setOriginalWidth(16);
		separator.setWidthMode(WidgetSizeMode.MINUS);
		separator.setTextColor(0x666666);
		separator.revalidate();

		int x = PADDING;
		int y = PADDING * 3;
		int idx = 0;
		for (ItemDefinition itemDefinition : results.values())
		{
			Widget item = container.createChild(-1, WidgetType.GRAPHIC);
			item.setXPositionMode(WidgetPositionMode.ABSOLUTE_LEFT);
			item.setYPositionMode(WidgetPositionMode.ABSOLUTE_TOP);
			item.setOriginalX(x);
			item.setOriginalY(y + FONT_SIZE * 2);
			item.setOriginalHeight(ICON_HEIGHT);
			item.setOriginalWidth(ICON_WIDTH);
			item.setName("<col=ff9040>" + itemDefinition.getName());
			item.setItemId(itemDefinition.getId());
			item.setItemQuantity(10000);
			item.setItemQuantityMode(ItemQuantityMode.NEVER);
			item.setBorderType(1);
			item.setAction(0, tooltipText);
			item.setHasListener(true);

			if (index == idx)
			{
				item.setOpacity(HOVERED_OPACITY);
			}
			else
			{
				item.setOnMouseOverListener((JavaScriptCallback) ev -> item.setOpacity(HOVERED_OPACITY));
				item.setOnMouseLeaveListener((JavaScriptCallback) ev -> item.setOpacity(0));
			}

			item.setOnOpListener((JavaScriptCallback) ev ->
			{
				if (onItemSelected != null)
				{
					onItemSelected.accept(itemDefinition.getId());
				}

				chatboxPanelManager.close();
			});

			x += ICON_WIDTH + PADDING;
			if (x + ICON_WIDTH >= container.getWidth())
			{
				y += ICON_HEIGHT + PADDING;
				x = PADDING;
			}

			item.revalidate();
			++idx;
		}
	}

	@Override
	public void keyPressed(KeyEvent ev)
	{
		switch (ev.getKeyCode())
		{
			case KeyEvent.VK_ENTER:
				ev.consume();
				if (index > -1)
				{
					if (onItemSelected != null)
					{
						onItemSelected.accept(results.keySet().toArray(new Integer[results.size()])[index]);
					}

					chatboxPanelManager.close();
				}
				break;
			case KeyEvent.VK_TAB:
			case KeyEvent.VK_RIGHT:
				ev.consume();
				if (!results.isEmpty())
				{
					index++;
					if (index >= results.size())
					{
						index = 0;
					}
					clientThread.invokeLater(this::update);
				}
				break;
			case KeyEvent.VK_LEFT:
				ev.consume();
				if (!results.isEmpty())
				{
					index--;
					if (index < 0)
					{
						index = results.size() - 1;
					}
					clientThread.invokeLater(this::update);
				}
				break;
			case KeyEvent.VK_UP:
				ev.consume();
				if (results.size() >= (MAX_RESULTS / 2))
				{
					index -= MAX_RESULTS / 2;
					if (index < 0)
					{
						if (results.size() == MAX_RESULTS)
						{
							index += results.size();
						}
						else
						{
							index += MAX_RESULTS;
						}
						index = Ints.constrainToRange(index, 0, results.size() - 1);
					}

					clientThread.invokeLater(this::update);
				}
				break;
			case KeyEvent.VK_DOWN:
				ev.consume();
				if (results.size() >= (MAX_RESULTS / 2))
				{
					index += MAX_RESULTS / 2;
					if (index >= MAX_RESULTS)
					{
						if (results.size() == MAX_RESULTS)
						{
							index -= results.size();
						}
						else
						{
							index -= MAX_RESULTS;
						}
						index = Ints.constrainToRange(index, 0, results.size() - 1);
					}

					clientThread.invokeLater(this::update);
				}
				break;
			default:
				super.keyPressed(ev);
		}
	}

	@Override
	protected void close()
	{
		// Clear search string when closed
		value("");
		results.clear();
		index = -1;
		super.close();
	}

	@Override
	@Deprecated
	public ChatboxTextInput onDone(Consumer<String> onDone)
	{
		throw new UnsupportedOperationException();
	}

	private void filterResults()
	{
		results.clear();
		index = -1;

		String search = getValue().toLowerCase();
		if (search.isEmpty())
		{
			return;
		}

		for (int i = 0; i < client.getItemCount() && results.size() < MAX_RESULTS; i++)
		{
			ItemDefinition itemComposition = itemManager.getItemDefinition(itemManager.canonicalize(i));
			String name = itemComposition.getName();
			// The client assigns "null" to item names of items it doesn't know about
			if (!name.equals("null") && name.toLowerCase().contains(search))
			{
				// This may already be in the map due to canonicalize mapping the item to something we've already seen
				results.putIfAbsent(itemComposition.getId(), itemComposition);
			}
		}
	}

	public ChatboxItemSearch onItemSelected(Consumer<Integer> onItemSelected)
	{
		this.onItemSelected = onItemSelected;
		return this;
	}

	public ChatboxItemSearch tooltipText(final String text)
	{
		tooltipText = text;
		return this;
	}
}
