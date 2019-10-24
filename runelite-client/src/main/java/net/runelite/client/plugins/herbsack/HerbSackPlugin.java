package net.runelite.client.plugins.herbsack;

import com.google.inject.Provides;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;
import net.runelite.api.ItemID;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.Counter;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;

@Slf4j
@PluginDescriptor(
	name = "Herb Sack",
	description = "Enable the tracking of herbs in the herb sack",
	tags = {"overlay", "herb", "sack", "bag", "storage"}
)
@Singleton
public class HerbSackPlugin extends Plugin
{
	private static final int HERB_BAG_NONE = -1;
	private static final int HERB_BAG_FILL = 0;
	private static final int HERB_BAG_EMPTY_INVENTORY = 1;
	private static final int HERB_BAG_EMPTY_BANK = 2;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private HerbSackOverlay herbSackOverlay;

	@Inject
	private ItemManager itemManager;

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	@Inject
	private HerbSackConfig config;

	@Inject
	private InfoBoxManager infoBoxManager;

	private HashMap<Integer, Counter> infoBoxes;
	@Getter
	private HerbSack herbSack;
	@Getter
	private boolean showOverlay;
	@Getter
	private boolean herbSackInInventory;
	private boolean showInfoBoxes;
	private int lastInteraction;
	private boolean bankChanged;
	private boolean inventoryChanged;
	private boolean infoBoxesAdded;
	private List<HerbCount> lastBankContents;
	private List<HerbCount> lastInventoryContents;

	@Provides
	HerbSackConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(HerbSackConfig.class);
	}

	@Override
	protected void startUp()
	{
		infoBoxesAdded = false;
		initInfoBoxes();
		updateConfig();
		addInfoBoxes();
		lastInteraction = HERB_BAG_NONE;
		herbSack = new HerbSack();
		overlayManager.add(herbSackOverlay);
		addSubscriptions();
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
		overlayManager.remove(herbSackOverlay);
		removeInfoBoxes();
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(MenuOptionClicked.class, this, this::onMenuOptionClicked);
		eventBus.subscribe(ItemContainerChanged.class, this, this::onItemContainerChanged);
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
	}

	private void onConfigChanged(ConfigChanged configChanged)
	{
		if (!configChanged.getGroup().equals("herbSack"))
		{
			return;
		}
		updateConfig();
	}

	private void onItemContainerChanged(ItemContainerChanged itemContainerChanged)
	{
		int containerId = itemContainerChanged.getContainerId();
		if (containerId == InventoryID.BANK.getId())
		{
			bankChanged = true;
		}
		else if (containerId == InventoryID.INVENTORY.getId())
		{
			inventoryChanged = true;
		}
		if (bankChanged)
		{
			ItemContainer bank = client.getItemContainer(InventoryID.BANK);
			if (bank != null)
			{
				List<HerbCount> bankContents = Arrays.stream(bank.getItems())
					.filter(item -> HerbSack.POSSIBLE_HERBS.contains(item.getId()))
					.map(item -> new HerbCount(item, item.getQuantity()))
					.collect(Collectors.toList());
				if (lastBankContents != null && lastInteraction == HERB_BAG_EMPTY_BANK)
				{
					herbSack.removeHerbs(herbCountDiff(bankContents, lastBankContents));
				}
				lastBankContents = bankContents;
			}
		}
		if (inventoryChanged)
		{
			ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
			if (inventory != null)
			{
				herbSackInInventory = Arrays.stream(inventory.getItems()).anyMatch(item -> item.getId() == ItemID.HERB_SACK);
				if (!herbSackInInventory)
				{
					removeInfoBoxes();
				}
				else
				{
					addInfoBoxes();
				}
				List<HerbCount> inventoryContents = Arrays.stream(inventory.getItems())
					.filter(item -> HerbSack.POSSIBLE_HERBS.contains(item.getId()))
					.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
					.entrySet().stream()
					.map(itemLongEntry -> new HerbCount(itemLongEntry.getKey(), itemLongEntry.getValue().intValue()))
					.collect(Collectors.toList());
				if (lastInteraction == HERB_BAG_EMPTY_INVENTORY || lastInteraction == HERB_BAG_FILL)
				{
					if (lastInventoryContents != null)
					{
						if (lastInteraction == HERB_BAG_FILL)
						{
							herbSack.addHerbs(herbCountDiff(lastInventoryContents, inventoryContents));
						}
						else
						{
							herbSack.removeHerbs(herbCountDiff(inventoryContents, lastInventoryContents));
						}
					}
				}
				lastInventoryContents = inventoryContents;
			}
		}
		bankChanged = false;
		inventoryChanged = false;
		lastInteraction = HERB_BAG_NONE;
		updateInfoBoxes();
	}

	private void onMenuOptionClicked(MenuOptionClicked menuOptionClicked)
	{
		String target = menuOptionClicked.getTarget().toUpperCase().replaceAll("\\<.*?\\>", "");
		if (!target.equals("HERB SACK"))
		{
			return;
		}
		String option = menuOptionClicked.getOption().toUpperCase();
		switch (option)
		{
			case "FILL":
				lastInteraction = HERB_BAG_FILL;
				break;
			case "EMPTY":
				if (bankOpen())
				{
					lastInteraction = HERB_BAG_EMPTY_BANK;
				}
				else
				{
					lastInteraction = HERB_BAG_EMPTY_INVENTORY;
				}
				break;
		}
	}

	private boolean bankOpen()
	{
		Widget widget = client.getWidget(WidgetInfo.BANK_CONTAINER);
		if (widget != null)
		{
			return !widget.isHidden();
		}
		return false;
	}

	private List<HerbCount> herbCountDiff(List<HerbCount> previous, List<HerbCount> actual)
	{
		return previous.stream().map(herbCount -> {
			Optional<HerbCount> actualHerbCountOpt = actual.stream().filter(herbCount1 -> herbCount.item.getId() == herbCount1.item.getId()).findAny();
			HerbCount actualHerbCount = null;
			if (actualHerbCountOpt.isPresent())
			{
				actualHerbCount = actualHerbCountOpt.get();
			}
			else
			{
				actualHerbCount = new HerbCount(null, 0);
			}
			return new HerbCount(herbCount.item, Math.abs(herbCount.count - actualHerbCount.count));
		}).collect(Collectors.toList());
	}

	private void updateConfig()
	{
		showInfoBoxes = config.showInfobox();
		if (showInfoBoxes)
		{
			addInfoBoxes();
		}
		else
		{
			removeInfoBoxes();
		}
		showOverlay = config.showOverlay();
	}

	private void updateInfoBoxes()
	{
		for (int herb : HerbSack.POSSIBLE_HERBS)
		{
			infoBoxes.get(herb).setCount(herbSack.getHerbCount(herb));
		}
	}

	private void initInfoBoxes()
	{
		infoBoxes = new HashMap();
		for (int herb : HerbSack.POSSIBLE_HERBS)
		{
			infoBoxes.put(herb, new Counter(itemManager.getImage(herb), this, 0));
		}
	}

	private void addInfoBoxes()
	{
		if (showInfoBoxes && herbSackInInventory && !infoBoxesAdded)
		{
			for (InfoBox box : infoBoxes.values())
			{
				infoBoxManager.addInfoBox(box);
			}
			infoBoxesAdded = true;
		}
	}

	private void removeInfoBoxes()
	{
		for (InfoBox box : infoBoxes.values())
		{
			infoBoxManager.removeInfoBox(box);
		}
		infoBoxesAdded = false;
	}
}

