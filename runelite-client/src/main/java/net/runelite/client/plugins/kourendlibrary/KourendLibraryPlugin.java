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
package net.runelite.client.plugins.kourendlibrary;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.AnimationID;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.MenuOpcode;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ImageUtil;

@PluginDescriptor(
	name = "Kourend Library",
	description = "Show where the books are found in the Kourend Library",
	tags = {"arceuus", "magic", "runecrafting", "overlay", "panel"},
	type = PluginType.MINIGAME
)
@Slf4j
@Singleton
public class KourendLibraryPlugin extends Plugin
{
	private static final Pattern BOOK_EXTRACTOR = Pattern.compile("'<col=0000ff>(.*)</col>'");
	private static final Pattern TAG_MATCHER = Pattern.compile("(<[^>]*>)");
	static final int REGION = 6459;

	static final boolean debug = false;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private Client client;

	@Inject
	private Library library;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private KourendLibraryOverlay overlay;

	@Inject
	private KourendLibraryConfig config;

	@Inject
	private KourendLibraryTutorialOverlay tutorialOverlay;

	@Inject
	private ItemManager itemManager;

	private KourendLibraryPanel panel;
	private NavigationButton navButton;
	private boolean buttonAttached = false;
	private WorldPoint lastBookcaseClick = null;
	private WorldPoint lastBookcaseAnimatedOn = null;
	private EnumSet<Book> playerBooks = null;

	@Getter(AccessLevel.PACKAGE)
	private final Set<NPC> npcsToMark = new HashSet<>();

	private boolean hideButton;
	@Getter(AccessLevel.PACKAGE)
	private boolean hideDuplicateBook;
	@Getter(AccessLevel.PACKAGE)
	private boolean hideVarlamoreEnvoy;
	@Getter(AccessLevel.PACKAGE)
	private boolean showTutorialOverlay;

	@Provides
	KourendLibraryConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(KourendLibraryConfig.class);
	}

	@Override
	protected void startUp()
	{

		hideButton = config.hideButton();
		hideDuplicateBook = config.hideDuplicateBook();
		hideVarlamoreEnvoy = config.hideVarlamoreEnvoy();
		showTutorialOverlay = config.showTutorialOverlay();

		Book.fillImages(itemManager);

		panel = injector.getInstance(KourendLibraryPanel.class);
		panel.init();

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "panel_icon.png");

		navButton = NavigationButton.builder()
			.tooltip("Kourend Library")
			.priority(6)
			.icon(icon)
			.panel(panel)
			.build();

		overlayManager.add(overlay);
		overlayManager.add(tutorialOverlay);

		updatePlayerBooks();

		if (!this.hideButton)
		{
			clientToolbar.addNavigation(navButton);
		}
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
		overlayManager.remove(tutorialOverlay);
		clientToolbar.removeNavigation(navButton);
		buttonAttached = false;
		lastBookcaseClick = null;
		lastBookcaseAnimatedOn = null;
		playerBooks = null;
		npcsToMark.clear();
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged ev)
	{
		if (!KourendLibraryConfig.GROUP_KEY.equals(ev.getGroup()))
		{
			return;
		}

		if (ev.getKey().equals("hideVarlamoreEnvoy"))
		{
			SwingUtilities.invokeLater(panel::reload);
		}
		else if (ev.getKey().equals("hideButton"))
		{
			SwingUtilities.invokeLater(() ->
			{
				if (!config.hideButton())
				{
					clientToolbar.addNavigation(navButton);
				}
				else
				{
					Player lp = client.getLocalPlayer();
					boolean inRegion = lp != null && lp.getWorldLocation().getRegionID() == REGION;
					if (inRegion)
					{
						clientToolbar.addNavigation(navButton);
					}
					else
					{
						clientToolbar.removeNavigation(navButton);
					}
				}
			});
		}
	}

	@Subscribe
	private void onMenuOptionClicked(MenuOptionClicked menuOpt)
	{
		if (MenuOpcode.GAME_OBJECT_FIRST_OPTION == menuOpt.getMenuOpcode() && menuOpt.getTarget().contains("Bookshelf"))
		{
			lastBookcaseClick = WorldPoint.fromScene(client, menuOpt.getParam0(), menuOpt.getParam1(), client.getPlane());
		}
	}

	@Subscribe
	private void onAnimationChanged(AnimationChanged anim)
	{
		if (anim.getActor() == client.getLocalPlayer() && anim.getActor().getAnimation() == AnimationID.LOOKING_INTO)
		{
			lastBookcaseAnimatedOn = lastBookcaseClick;
		}
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		if (lastBookcaseAnimatedOn != null && event.getType() == ChatMessageType.GAMEMESSAGE)
		{
			if (event.getMessage().equals("You don't find anything useful here."))
			{
				library.mark(lastBookcaseAnimatedOn, null);
				panel.update();
				lastBookcaseAnimatedOn = null;
			}
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGIN_SCREEN ||
			event.getGameState() == GameState.HOPPING)
		{
			npcsToMark.clear();
		}
	}

	@Subscribe
	public void onGameTick(GameTick tick)
	{
		boolean inRegion = client.getLocalPlayer().getWorldLocation().getRegionID() == REGION;
		if (this.hideButton && inRegion != buttonAttached)
		{
			SwingUtilities.invokeLater(() ->
			{
				if (inRegion)
				{
					clientToolbar.addNavigation(navButton);
				}
				else
				{
					clientToolbar.removeNavigation(navButton);
				}
			});
			buttonAttached = inRegion;
		}

		if (!inRegion)
		{
			return;
		}

		if (lastBookcaseAnimatedOn != null)
		{
			Widget find = client.getWidget(WidgetInfo.DIALOG_SPRITE_SPRITE);
			if (find != null)
			{
				Book book = Book.byId(find.getItemId());
				if (book != null)
				{
					library.mark(lastBookcaseAnimatedOn, book);
					panel.update();
					lastBookcaseAnimatedOn = null;
				}
			}
		}

		Widget npcHead = client.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
		if (npcHead != null)
		{
			if (isLibraryCustomer(npcHead.getModelId()))
			{
				Widget textw = client.getWidget(WidgetInfo.DIALOG_NPC_TEXT);
				String text = textw.getText();
				Matcher m = BOOK_EXTRACTOR.matcher(text);
				if (m.find())
				{
					String bookName = TAG_MATCHER.matcher(m.group(1).replace("<br>", " ")).replaceAll("");
					Book book = Book.byName(bookName);
					if (book == null)
					{
						log.warn("Book '{}' is not recognised", bookName);
						return;
					}

					library.setCustomer(npcHead.getModelId(), book);
					panel.update();
				}
				else if (text.contains("You can have this other book") || text.contains("please accept a token of my thanks.") || text.contains("Thanks, I'll get on with reading it."))
				{
					library.setCustomer(-1, null);
					panel.update();
				}
			}
		}
	}

	@Subscribe
	private void onItemContainerChanged(ItemContainerChanged itemContainerChangedEvent)
	{
		updatePlayerBooks();
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (isLibraryCustomer(event.getNpc().getId()))
		{
			npcsToMark.add(event.getNpc());
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		npcsToMark.remove(event.getNpc());
	}

	boolean doesPlayerContainBook(Book book)
	{
		return playerBooks.contains(book);
	}

	private void updatePlayerBooks()
	{
		ItemContainer itemContainer = client.getItemContainer(InventoryID.INVENTORY);

		if (itemContainer != null)
		{
			EnumSet<Book> books = EnumSet.noneOf(Book.class);

			for (Item item : itemContainer.getItems())
			{
				Book book = Book.byId(item.getId());

				if (book != null)
				{
					books.add(book);
				}
			}

			playerBooks = books;
		}
	}

	static boolean isLibraryCustomer(int npcId)
	{
		return npcId == NpcID.VILLIA || npcId == NpcID.PROFESSOR_GRACKLEBONE || npcId == NpcID.SAM_7049;
	}
}