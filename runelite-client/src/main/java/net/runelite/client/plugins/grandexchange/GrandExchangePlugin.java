/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
 * Copyright (c) 2017, Robbie <https://github.com/rbbi>
 * Copyright (c) 2018, SomeoneWithAnInternetConnection
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

package net.runelite.client.plugins.grandexchange;

import com.google.common.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.inject.Provides;
import io.reactivex.schedulers.Schedulers;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.GrandExchangeOfferState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.ItemDefinition;
import static net.runelite.api.ItemID.COINS_995;
import net.runelite.api.MenuOpcode;
import net.runelite.api.Varbits;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GrandExchangeOfferChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.Notifier;
import net.runelite.client.account.AccountSession;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.SessionClose;
import net.runelite.client.events.SessionOpen;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyManager;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.QuantityFormatter;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.ge.GrandExchangeClient;
import net.runelite.http.api.ge.GrandExchangeTrade;
import net.runelite.http.api.osbuddy.OSBGrandExchangeClient;
import net.runelite.http.api.osbuddy.OSBGrandExchangeResult;

@PluginDescriptor(
	name = "Grand Exchange",
	description = "Provide additional and/or easier access to Grand Exchange information",
	tags = {"external", "integration", "notifications", "panel", "prices", "trade"},
	type = PluginType.UTILITY
)
@Slf4j
@Singleton
public class GrandExchangePlugin extends Plugin
{
	static final String SEARCH_GRAND_EXCHANGE = "Search Grand Exchange";
	private static final int OFFER_TYPE_BUY = 0;
	private static final int OFFER_CONTAINER_ITEM = 21;
	private static final int OFFER_QUANTITY_HEADING = 28;
	private static final String OFFER_QUANTITY_DEFAULT_HEADING = "Quantity:";
	private static final int OFFER_DEFAULT_ITEM_ID = 6512;
	private static final OSBGrandExchangeClient CLIENT = new OSBGrandExchangeClient();
	private static final String OSB_GE_TEXT = "<br>OSBuddy Actively traded price: ";
	private static final String BUY_LIMIT_GE_TEXT = "<br>Buy limit: ";
	private static final TypeToken<Map<Integer, Integer>> BUY_LIMIT_TOKEN = new TypeToken<Map<Integer, Integer>>()
	{
	};
	@Getter(AccessLevel.PACKAGE)
	private NavigationButton button;

	@Getter(AccessLevel.PACKAGE)
	private GrandExchangePanel panel;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private boolean hotKeyPressed;

	@Inject
	private GrandExchangeInputListener inputListener;

	@Inject
	private ItemManager itemManager;

	@Inject
	private MouseManager mouseManager;

	@Inject
	private KeyManager keyManager;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private GrandExchangeConfig config;

	@Inject
	private Notifier notifier;

	@Inject
	private ScheduledExecutorService executorService;

	@Inject
	private SessionManager sessionManager;

	@Inject
	private ConfigManager configManager;

	private Widget grandExchangeText;
	private Widget grandExchangeItem;
	private Widget grandExchangeOfferQuantityHeading;
	private Map<Integer, Integer> itemGELimits;

	private int osbItem;
	private OSBGrandExchangeResult osbGrandExchangeResult;
	private GrandExchangeClient grandExchangeClient;

	private boolean quickLookup;
	private boolean enableNotifications;
	private boolean enableOsbPrices;
	private boolean enableGELimits;
	private boolean enableAfford;

	private static Map<Integer, Integer> loadGELimits() throws IOException
	{
		try (final JsonReader geLimitData = new JsonReader(new InputStreamReader(GrandExchangePlugin.class.getResourceAsStream("ge_limits.json"))))
		{
			final Map<Integer, Integer> itemGELimits = RuneLiteAPI.GSON.fromJson(geLimitData, BUY_LIMIT_TOKEN.getType());
			log.debug("Loaded {} limits", itemGELimits.size());
			return itemGELimits;
		}
	}

	private SavedOffer getOffer(int slot)
	{
		String offer = configManager.getConfiguration("geoffer." + client.getUsername().toLowerCase(), Integer.toString(slot));
		if (offer == null)
		{
			return null;
		}
		return RuneLiteAPI.GSON.fromJson(offer, SavedOffer.class);
	}

	private void setOffer(int slot, SavedOffer offer)
	{
		configManager.setConfiguration("geoffer." + client.getUsername().toLowerCase(), Integer.toString(slot), RuneLiteAPI.GSON.toJson(offer));
	}

	private void deleteOffer(int slot)
	{
		configManager.unsetConfiguration("geoffer." + client.getUsername().toLowerCase(), Integer.toString(slot));
	}

	@Provides
	GrandExchangeConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GrandExchangeConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();

		itemGELimits = loadGELimits();
		panel = injector.getInstance(GrandExchangePanel.class);
		panel.setGELimits(itemGELimits);

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "ge_icon.png");

		button = NavigationButton.builder()
			.tooltip("Grand Exchange")
			.icon(icon)
			.priority(3)
			.panel(panel)
			.build();

		clientToolbar.addNavigation(button);

		if (this.quickLookup)
		{
			mouseManager.registerMouseListener(inputListener);
			keyManager.registerKeyListener(inputListener);
		}

		AccountSession accountSession = sessionManager.getAccountSession();
		if (accountSession != null)
		{
			grandExchangeClient = new GrandExchangeClient(accountSession.getUuid());
		}

		osbItem = -1;
		osbGrandExchangeResult = null;
	}

	@Override
	protected void shutDown()
	{
		clientToolbar.removeNavigation(button);
		mouseManager.unregisterMouseListener(inputListener);
		keyManager.unregisterKeyListener(inputListener);
		grandExchangeText = null;
		grandExchangeItem = null;
		grandExchangeOfferQuantityHeading = null;
		itemGELimits = null;
		grandExchangeClient = null;
	}

	@Subscribe
	private void onSessionOpen(SessionOpen sessionOpen)
	{
		AccountSession accountSession = sessionManager.getAccountSession();
		if (accountSession.getUuid() != null)
		{
			grandExchangeClient = new GrandExchangeClient(accountSession.getUuid());
		}
		else
		{
			grandExchangeClient = null;
		}
	}

	private void updateConfig()
	{
		this.quickLookup = config.quickLookup();
		this.enableNotifications = config.enableNotifications();
		this.enableOsbPrices = config.enableOsbPrices();
		this.enableGELimits = config.enableGELimits();
		this.enableAfford = config.enableAfford();
	}

	@Subscribe
	private void onSessionClose(SessionClose sessionClose)
	{
		grandExchangeClient = null;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("grandexchange"))
		{
			updateConfig();
			if (event.getKey().equals("quickLookup"))
			{
				if (this.quickLookup)
				{
					mouseManager.registerMouseListener(inputListener);
					keyManager.registerKeyListener(inputListener);
				}
				else
				{
					mouseManager.unregisterMouseListener(inputListener);
					keyManager.unregisterKeyListener(inputListener);
				}
			}
		}
	}

	@Subscribe
	private void onGrandExchangeOfferChanged(GrandExchangeOfferChanged offerEvent)
	{
		final int slot = offerEvent.getSlot();
		final GrandExchangeOffer offer = offerEvent.getOffer();

		ItemDefinition offerItem = itemManager.getItemDefinition(offer.getItemId());
		boolean shouldStack = offerItem.isStackable() || offer.getTotalQuantity() > 1;
		BufferedImage itemImage = itemManager.getImage(offer.getItemId(), offer.getTotalQuantity(), shouldStack);
		SwingUtilities.invokeLater(() -> panel.getOffersPanel().updateOffer(offerItem, itemImage, offer, slot));

		submitTrades(slot, offer);

		updateConfig(slot, offer);
	}

	private void submitTrades(int slot, GrandExchangeOffer offer)
	{
		if (grandExchangeClient == null)
		{
			return;
		}

		// Only interested in offers which are fully bought/sold
		if (offer.getState() != GrandExchangeOfferState.BOUGHT && offer.getState() != GrandExchangeOfferState.SOLD)
		{
			return;
		}

		SavedOffer savedOffer = getOffer(slot);
		if (!shouldUpdate(savedOffer, offer))
		{
			return;
		}

		// getPrice() is the price of the offer, not necessarily what the item bought at
		int priceEach = offer.getSpent() / offer.getTotalQuantity();

		GrandExchangeTrade grandExchangeTrade = new GrandExchangeTrade();
		grandExchangeTrade.setBuy(offer.getState() == GrandExchangeOfferState.BOUGHT);
		grandExchangeTrade.setItemId(offer.getItemId());
		grandExchangeTrade.setQuantity(offer.getTotalQuantity());
		grandExchangeTrade.setPrice(priceEach);

		log.debug("Submitting trade: {}", grandExchangeTrade);
		grandExchangeClient.submit(grandExchangeTrade);
	}

	private void updateConfig(int slot, GrandExchangeOffer offer)
	{
		if (offer.getState() == GrandExchangeOfferState.EMPTY)
		{
			deleteOffer(slot);
		}
		else
		{
			SavedOffer savedOffer = new SavedOffer();
			savedOffer.setItemId(offer.getItemId());
			savedOffer.setQuantitySold(offer.getQuantitySold());
			savedOffer.setTotalQuantity(offer.getTotalQuantity());
			savedOffer.setPrice(offer.getPrice());
			savedOffer.setSpent(offer.getSpent());
			savedOffer.setState(offer.getState());
			setOffer(slot, savedOffer);
		}
	}

	private boolean shouldUpdate(SavedOffer savedOffer, GrandExchangeOffer grandExchangeOffer)
	{
		if (savedOffer == null)
		{
			return false;
		}

		// Only update offer if state has changed
		return savedOffer.getState() != grandExchangeOffer.getState();
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		if (!this.enableNotifications || event.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		String message = Text.removeTags(event.getMessage());

		if (message.startsWith("Grand Exchange:"))
		{
			this.notifier.notify(message);
		}
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGIN_SCREEN)
		{
			panel.getOffersPanel().resetOffers();
		}
	}

	@Subscribe
	private void onMenuEntryAdded(MenuEntryAdded menuEntry)
	{
		// At the moment, if the user disables quick lookup, the input listener gets disabled. Thus, isHotKeyPressed()
		// should always return false when quick lookup is disabled.
		// Replace the default option with "Search ..." when holding alt
		if (client.getGameState() != GameState.LOGGED_IN || !hotKeyPressed)
		{
			return;
		}

		final int widgetId = menuEntry.getParam1();
		final int groupId = WidgetInfo.TO_GROUP(widgetId);

		switch (groupId)
		{
			case WidgetID.BANK_GROUP_ID:
				// Don't show for view tabs and such
				if (WidgetInfo.TO_CHILD(widgetId) != WidgetInfo.BANK_ITEM_CONTAINER.getChildId())
				{
					break;
				}
			case WidgetID.INVENTORY_GROUP_ID:
			case WidgetID.BANK_INVENTORY_GROUP_ID:
			case WidgetID.GRAND_EXCHANGE_INVENTORY_GROUP_ID:
			case WidgetID.SHOP_INVENTORY_GROUP_ID:
				menuEntry.setOption(SEARCH_GRAND_EXCHANGE);
				menuEntry.setOpcode(MenuOpcode.RUNELITE.getId());
				menuEntry.setModified();
		}
	}

	@Subscribe
	private void onFocusChanged(FocusChanged focusChanged)
	{
		if (!focusChanged.isFocused())
		{
			setHotKeyPressed(false);
		}
	}

	@Subscribe
	private void onWidgetLoaded(WidgetLoaded event)
	{
		switch (event.getGroupId())
		{
			case WidgetID.GRAND_EXCHANGE_GROUP_ID:
				Widget grandExchangeOffer = client.getWidget(WidgetInfo.GRAND_EXCHANGE_OFFER_CONTAINER);
				grandExchangeText = client.getWidget(WidgetInfo.GRAND_EXCHANGE_OFFER_TEXT);
				grandExchangeItem = grandExchangeOffer.getDynamicChildren()[OFFER_CONTAINER_ITEM];
				grandExchangeOfferQuantityHeading = grandExchangeOffer.getDynamicChildren()[OFFER_QUANTITY_HEADING];
				break;
			case WidgetID.INVENTORY_GROUP_ID:
				grandExchangeText = null;
				grandExchangeItem = null;
				grandExchangeOfferQuantityHeading = null;
				break;
		}
	}

	@Subscribe
	private void onScriptCallbackEvent(ScriptCallbackEvent event)
	{
		if (event.getEventName().equals("geBuilt"))
		{
			rebuildGeText();
		}

		if (!event.getEventName().equals("setGETitle") || !config.showTotal())
		{
			return;
		}

		long total = 0;
		GrandExchangeOffer[] offers = client.getGrandExchangeOffers();
		for (GrandExchangeOffer offer : offers)
		{
			if (offer != null)
			{
				total += offer.getPrice() * offer.getTotalQuantity();
			}
		}

		if (total == 0L)
		{
			return;
		}

		StringBuilder titleBuilder = new StringBuilder(" (");

		if (config.showExact())
		{
			titleBuilder.append(QuantityFormatter.formatNumber(total));
		}
		else
		{
			titleBuilder.append(QuantityFormatter.quantityToStackSize(total));
		}

		titleBuilder.append(')');

		String[] stringStack = client.getStringStack();
		int stringStackSize = client.getStringStackSize();

		stringStack[stringStackSize - 1] += titleBuilder.toString();
	}

	private void rebuildGeText()
	{
		if (grandExchangeText == null || grandExchangeItem == null || grandExchangeItem.isHidden())
		{
			return;
		}

		final Widget geText = grandExchangeText;
		final Widget geQuantityHeading = grandExchangeOfferQuantityHeading;
		final int offerType = client.getVar(Varbits.GE_OFFER_CREATION_TYPE);
		final int itemId = grandExchangeItem.getItemId();

		if (itemId == OFFER_DEFAULT_ITEM_ID || itemId == -1)
		{
			return;
		}


		if (this.enableAfford && offerType == OFFER_TYPE_BUY)
		{
			final ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
			int coins = 0;
			if (inventory != null)
			{
				for (final Item item : inventory.getItems())
				{
					if (item.getId() == COINS_995)
					{
						coins = item.getQuantity();
						break;
					}
				}
			}

			final int currentItemPrice = client.getVar(Varbits.GRAND_EXCHANGE_PRICE_PER_ITEM);
			final int canAfford = currentItemPrice != 0 ? coins / currentItemPrice : 0;
			final String quantityHeadingText = OFFER_QUANTITY_DEFAULT_HEADING + " (" + canAfford + ")";
			geQuantityHeading.setText(quantityHeadingText);
		}
		else
		{
			geQuantityHeading.setText(OFFER_QUANTITY_DEFAULT_HEADING);
		}


		String[] lines = geText.getText().split("<br>");
		String text = lines[0]; // remove any limit or OSB ge values

		if (this.enableGELimits && itemGELimits != null)
		{
			final Integer itemLimit = itemGELimits.get(itemId);

			// If we have item buy limit, append it
			if (itemLimit != null)
			{
				text += BUY_LIMIT_GE_TEXT + QuantityFormatter.formatNumber(itemLimit);
			}
		}

		geText.setText(text);

		if (!this.enableOsbPrices)
		{
			return;
		}

		// If we already have the result, use it
		if (osbGrandExchangeResult != null && osbGrandExchangeResult.getItem_id() == itemId && osbGrandExchangeResult.getOverall_average() > 0)
		{
			geText.setText(text + OSB_GE_TEXT + QuantityFormatter.formatNumber(osbGrandExchangeResult.getOverall_average()));
		}

		if (osbItem == itemId)
		{
			// avoid starting duplicate lookups
			return;
		}

		osbItem = itemId;

		log.debug("Looking up OSB item price {}", itemId);

		final String start = text;
		executorService.submit(() ->
		{
			CLIENT.lookupItem(itemId)
				.subscribeOn(Schedulers.io())
				.observeOn(Schedulers.single())
				.subscribe(
					(osbresult) ->
					{
						osbGrandExchangeResult = osbresult;
						// Update the text on the widget too
						geText.setText(start + OSB_GE_TEXT + QuantityFormatter.formatNumber(osbresult.getOverall_average()));
					},
					(e) -> log.debug("Error getting price of item {}", itemId, e)
				);
		});
	}
}