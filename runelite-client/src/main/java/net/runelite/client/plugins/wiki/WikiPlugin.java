/*
 * Copyright (c) 2018 Abex
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
package net.runelite.client.plugins.wiki;

import com.google.common.primitives.Ints;
import javax.inject.Inject;
import javax.inject.Provider;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuOpcode;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.ObjectDefinition;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetConfig;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetPositionMode;
import net.runelite.api.widgets.WidgetType;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.LinkBrowser;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

@Slf4j
@PluginDescriptor(
	name = "Wiki",
	description = "Adds a Wiki button that takes you to the OSRS Wiki",
	type = PluginType.UTILITY
)
public class WikiPlugin extends Plugin
{
	private static final int[] QUESTLIST_WIDGET_IDS = new int[]
		{
			WidgetInfo.QUESTLIST_FREE_CONTAINER.getId(),
			WidgetInfo.QUESTLIST_MEMBERS_CONTAINER.getId(),
			WidgetInfo.QUESTLIST_MINIQUEST_CONTAINER.getId(),
		};

	static final HttpUrl WIKI_BASE = HttpUrl.parse("https://oldschool.runescape.wiki");
	static final HttpUrl WIKI_API = WIKI_BASE.newBuilder().addPathSegments("api.php").build();
	static final String UTM_SOURCE_KEY = "utm_source";
	static final String UTM_SOURCE_VALUE = "runelite";

	private static final String MENUOP_GUIDE = "Guide";
	private static final String MENUOP_QUICKGUIDE = "Quick Guide";
	private static final String MENUOP_WIKI = "Wiki";

	@Inject
	private SpriteManager spriteManager;

	@Inject
	private ClientThread clientThread;

	@Inject
	private Client client;

	@Inject
	private ItemManager itemManager;

	@Inject
	private Provider<WikiSearchChatboxTextInput> wikiSearchChatboxTextInputProvider;

	private Widget icon;

	private boolean wikiSelected = false;

	@Override
	public void startUp()
	{
		spriteManager.addSpriteOverrides(WikiSprite.values());
		clientThread.invokeLater(this::addWidgets);
	}

	@Override
	public void shutDown()
	{
		spriteManager.removeSpriteOverrides(WikiSprite.values());
		clientThread.invokeLater(() ->
		{
			Widget minimapOrbs = client.getWidget(WidgetInfo.MINIMAP_ORBS);
			if (minimapOrbs == null)
			{
				return;
			}
			Widget[] children = minimapOrbs.getChildren();
			if (children == null || children.length < 1)
			{
				return;
			}
			children[0] = null;

			onDeselect();
			client.setSpellSelected(false);
		});
	}

	@Subscribe
	private void onWidgetLoaded(WidgetLoaded l)
	{
		if (l.getGroupId() == WidgetID.MINIMAP_GROUP_ID)
		{
			addWidgets();
		}
	}

	private void addWidgets()
	{
		Widget minimapOrbs = client.getWidget(WidgetInfo.MINIMAP_ORBS);
		if (minimapOrbs == null)
		{
			return;
		}

		icon = minimapOrbs.createChild(0, WidgetType.GRAPHIC);
		icon.setSpriteId(WikiSprite.WIKI_ICON.getSpriteId());
		icon.setOriginalX(0);
		icon.setOriginalY(2);
		icon.setXPositionMode(WidgetPositionMode.ABSOLUTE_RIGHT);
		icon.setYPositionMode(WidgetPositionMode.ABSOLUTE_BOTTOM);
		icon.setOriginalWidth(42);
		icon.setOriginalHeight(16);
		icon.setTargetVerb("Lookup");
		icon.setName("Wiki");
		icon.setClickMask(WidgetConfig.USE_GROUND_ITEM | WidgetConfig.USE_ITEM | WidgetConfig.USE_NPC
			| WidgetConfig.USE_OBJECT | WidgetConfig.USE_WIDGET);
		icon.setNoClickThrough(true);
		icon.setOnTargetEnterListener((JavaScriptCallback) ev ->
		{
			wikiSelected = true;
			icon.setSpriteId(WikiSprite.WIKI_SELECTED_ICON.getSpriteId());
			client.setAllWidgetsAreOpTargetable(true);
		});
		icon.setAction(5, "Search"); // Start at option 5 so the target op is ontop
		icon.setOnOpListener((JavaScriptCallback) ev ->
		{
			if (ev.getOp() == 6)
			{
				openSearchInput();
			}
		});
		// This doesn't always run because we cancel the menuop
		icon.setOnTargetLeaveListener((JavaScriptCallback) ev -> onDeselect());
		icon.revalidate();
	}

	private void onDeselect()
	{
		client.setAllWidgetsAreOpTargetable(false);

		wikiSelected = false;
		if (icon != null)
		{
			icon.setSpriteId(WikiSprite.WIKI_ICON.getSpriteId());
		}
	}

	@Subscribe
	private void onMenuOptionClicked(MenuOptionClicked ev)
	{
		if (ev.getMenuOpcode() == MenuOpcode.RUNELITE)
		{
			checkQuestClicked(ev);
		}

		if (!wikiSelected)
		{
			return;
		}

		onDeselect();
		client.setSpellSelected(false);
		ev.consume();

		String type;
		int id;
		String name;
		WorldPoint location;

		switch (ev.getMenuOpcode())
		{
			case RUNELITE:
			case CANCEL:
				return;
			case ITEM_USE_ON_WIDGET:
			case SPELL_CAST_ON_GROUND_ITEM:
			{
				type = "item";
				id = itemManager.canonicalize(ev.getIdentifier());
				name = itemManager.getItemDefinition(id).getName();
				location = null;
				break;
			}
			case SPELL_CAST_ON_NPC:
			{
				type = "npc";
				NPC npc = client.getCachedNPCs()[ev.getIdentifier()];
				NPCDefinition nc = npc.getTransformedDefinition();
				id = nc.getId();
				name = nc.getName();
				location = npc.getWorldLocation();
				break;
			}
			case SPELL_CAST_ON_GAME_OBJECT:
			{
				type = "object";
				ObjectDefinition lc = client.getObjectDefinition(ev.getIdentifier());
				if (lc.getImpostorIds() != null)
				{
					lc = lc.getImpostor();
				}
				id = lc.getId();
				name = lc.getName();
				location = WorldPoint.fromScene(client, ev.getParam0(), ev.getParam1(), client.getPlane());
				break;
			}
			case SPELL_CAST_ON_WIDGET:
			{
				Widget w = getWidget(ev.getParam1(), ev.getParam0());

				if (w.getType() == WidgetType.GRAPHIC && w.getItemId() != -1)
				{
					type = "item";
					id = itemManager.canonicalize(w.getItemId());
					name = itemManager.getItemDefinition(id).getName();
					location = null;
					break;
				}
			}
				// fallthrough
			default:
				log.info("Unknown menu option: {} {} {}", ev, ev.getMenuOpcode(), ev.getMenuOpcode() == MenuOpcode.CANCEL);
				return;
		}

		name = Text.removeTags(name);
		HttpUrl.Builder urlBuilder = WIKI_BASE.newBuilder();
		urlBuilder.addPathSegments("w/Special:Lookup")
			.addQueryParameter("type", type)
			.addQueryParameter("id", "" + id)
			.addQueryParameter("name", name)
			.addQueryParameter(UTM_SOURCE_KEY, UTM_SOURCE_VALUE);

		if (location != null)
		{
			urlBuilder.addQueryParameter("x", "" + location.getX())
				.addQueryParameter("y", "" + location.getY())
				.addQueryParameter("plane", "" + location.getPlane());
		}

		HttpUrl url = urlBuilder.build();

		LinkBrowser.browse(url.toString());
	}

	private void checkQuestClicked(MenuOptionClicked ev)
	{
		boolean quickguide = false;
		switch (ev.getOption())
		{
			case MENUOP_QUICKGUIDE:
				quickguide = true;
				//fallthrough;
			case MENUOP_GUIDE:
				ev.consume();
				String quest = Text.removeTags(ev.getTarget());
				HttpUrl.Builder ub = WIKI_BASE.newBuilder()
					.addPathSegment("w")
					.addPathSegment(quest)
					.addQueryParameter(UTM_SOURCE_KEY, UTM_SOURCE_VALUE);
				if (quickguide)
				{
					ub.addPathSegment("Quick_guide");
				}
				LinkBrowser.browse(ub.build().toString());
				break;
			case MENUOP_WIKI:
				LinkBrowser.browse(WIKI_BASE.newBuilder()
					.addPathSegment("w")
					.addPathSegment(Text.removeTags(ev.getTarget()))
					.addQueryParameter(UTM_SOURCE_KEY, UTM_SOURCE_VALUE)
					.build().toString());
		}
	}

	private void openSearchInput()
	{
		wikiSearchChatboxTextInputProvider.get()
			.build();
	}

	@Subscribe
	private void onMenuEntryAdded(MenuEntryAdded event)
	{
		int widgetIndex = event.getParam0();
		int widgetID = event.getParam1();

		if (wikiSelected && event.getOpcode() == MenuOpcode.SPELL_CAST_ON_WIDGET.getId())
		{
			Widget w = getWidget(widgetID, widgetIndex);
			if (!(w.getType() == WidgetType.GRAPHIC && w.getItemId() != -1))
			{
				// we don't support this widget
				// remove the last SPELL_CAST_ON_WIDGET; we can't blindly remove the top action because some other
				// plugin might have added something on this same event, and we probably shouldn't remove that instead
				MenuEntry[] menuEntries = client.getMenuEntries();
				for (int i = menuEntries.length - 1; i >= 0; i--)
				{
					if (menuEntries[i].getOpcode() == MenuOpcode.SPELL_CAST_ON_WIDGET.getId())
					{
						menuEntries[i] = null;
						client.setMenuEntries(menuEntries);
						break;
					}
				}
			}
		}

		if (Ints.contains(QUESTLIST_WIDGET_IDS, widgetID)
			&& ((wikiSelected && widgetIndex != -1) || "Read Journal:".equals(event.getOption())))
		{
			Widget w = getWidget(widgetID, widgetIndex);
			String target = w.getName();

			client.insertMenuItem(
				MENUOP_QUICKGUIDE,
				target,
				MenuOpcode.RUNELITE.getId(),
				0,
				widgetIndex,
				widgetID,
				false
			);

			client.insertMenuItem(
				MENUOP_GUIDE,
				target,
				MenuOpcode.RUNELITE.getId(),
				0,
				widgetIndex,
				widgetID,
				false
			);
		}

		if (widgetID == WidgetInfo.ACHIEVEMENT_DIARY_CONTAINER.getId()
			&& event.getOption().contains("Open"))
		{
			Widget w = getWidget(widgetID, widgetIndex);
			if (w.getActions() == null)
			{
				return;
			}

			String action = firstAction(w);
			if (action == null)
			{
				return;
			}

			client.insertMenuItem(
				MENUOP_WIKI,
				action.replace("Open ", "").replace("Journal", "Diary"),
				MenuOpcode.RUNELITE.getId(),
				0,
				widgetIndex,
				widgetID,
				false
			);
		}

		if (WidgetInfo.TO_GROUP(widgetID) == WidgetInfo.SKILLS_CONTAINER.getGroupId()
			&& event.getOption().contains("View"))
		{
			Widget w = getWidget(widgetID, widgetIndex);
			if (w.getParentId() != WidgetInfo.SKILLS_CONTAINER.getId())
			{
				return;
			}

			String action = firstAction(w);
			if (action == null)
			{
				return;
			}

			client.insertMenuItem(
				MENUOP_WIKI,
				action.replace("View ", "").replace("Guide ", ""),
				MenuOpcode.RUNELITE.getId(),
				0,
				widgetIndex,
				widgetID,
				false
			);
		}
	}

	private Widget getWidget(int wid, int index)
	{
		Widget w = client.getWidget(WidgetInfo.TO_GROUP(wid), WidgetInfo.TO_CHILD(wid));
		if (index != -1)
		{
			w = w.getChild(index);
		}
		return w;
	}

	@Nullable
	private static String firstAction(Widget widget)
	{
		for (String action : widget.getActions())
		{
			if (StringUtils.isNotEmpty(action))
			{
				return action;
			}
		}

		return null;
	}
}
