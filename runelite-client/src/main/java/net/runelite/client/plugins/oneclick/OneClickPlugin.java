package net.runelite.client.plugins.oneclick;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.AnimationID;
import net.runelite.api.Client;
import net.runelite.api.DynamicObject;
import net.runelite.api.Entity;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.ItemID;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuOpcode;
import static net.runelite.api.ObjectID.DWARF_MULTICANNON;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.SpriteID;
import net.runelite.api.Varbits;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

@PluginDescriptor(
	name = "One Click",
	description = "Osbuddy in runelite+",
	enabledByDefault = false,
	type = PluginType.EXTERNAL
)
public class OneClickPlugin extends Plugin
{
	private static final Set<Integer> DART_TIPS = ImmutableSet.of(ItemID.BRONZE_DART_TIP, ItemID.IRON_DART_TIP,
		ItemID.STEEL_DART_TIP, ItemID.MITHRIL_DART_TIP, ItemID.ADAMANT_DART_TIP, ItemID.RUNE_DART_TIP, ItemID.DRAGON_DART_TIP, ItemID.UNFINISHED_BROAD_BOLTS
	);
	private static final Set<Integer> LOG_ID = ImmutableSet.of(ItemID.LOGS, ItemID.OAK_LOGS, ItemID.WILLOW_LOGS, ItemID.TEAK_LOGS,
		ItemID.MAPLE_LOGS, ItemID.MAHOGANY_LOGS, ItemID.YEW_LOGS, ItemID.MAGIC_LOGS, ItemID.REDWOOD_LOGS
	);
	private static final Set<Integer> HOPS_SEED = ImmutableSet.of(ItemID.BARLEY_SEED, ItemID.HAMMERSTONE_SEED,
		ItemID.ASGARNIAN_SEED, ItemID.JUTE_SEED, ItemID.YANILLIAN_SEED, ItemID.KRANDORIAN_SEED, ItemID.WILDBLOOD_SEED
	);
	private static final Set<Integer> HERBS = ImmutableSet.of(ItemID.GUAM_LEAF, ItemID.MARRENTILL, ItemID.TARROMIN, ItemID.HARRALANDER
	);
	private static final Set<Integer> BONE_SET = ImmutableSet.of(ItemID.BONES, ItemID.WOLF_BONE, ItemID.BURNT_BONES, ItemID.MONKEY_BONES,
		ItemID.BAT_BONES, ItemID.JOGRE_BONE, ItemID.BIG_BONES, ItemID.ZOGRE_BONE, ItemID.SHAIKAHAN_BONES, ItemID.BABYDRAGON_BONES,
		ItemID.WYRM_BONES, ItemID.DRAGON_BONES, ItemID.DRAKE_BONES, ItemID.FAYRG_BONES, ItemID.LAVA_DRAGON_BONES, ItemID.RAURG_BONES,
		ItemID.HYDRA_BONES, ItemID.DAGANNOTH_BONES, ItemID.OURG_BONES, ItemID.SUPERIOR_DRAGON_BONES, ItemID.WYVERN_BONES
	);
	private static final Set<String> BIRD_HOUSES_NAMES = ImmutableSet.of("<col=ffff>Bird house (empty)", "<col=ffff>Oak birdhouse (empty)",
		"<col=ffff>Willow birdhouse (empty)", "<col=ffff>Teak birdhouse (empty)", "<col=ffff>Maple birdhouse (empty)", "<col=ffff>Mahogany birdhouse (empty)",
		"<col=ffff>Yew birdhouse (empty)", "<col=ffff>Magic birdhouse (empty)", "<col=ffff>Redwood birdhouse (empty)"
	);
	private static final String MAGIC_IMBUE_EXPIRED_MESSAGE = "Your Magic Imbue charge has ended.";
	private static final String MAGIC_IMBUE_MESSAGE = "You are charged to combine runes!";

	@Inject
	private Client client;
	@Inject
	private OneClickConfig config;
	@Inject
	private EventBus eventBus;

	private boolean tick = false;
	private final Map<Integer, String> targetMap = new HashMap<>();
	private AlchItem alchItem;
	private GameObject cannon;
	private boolean cannonFiring = false;
	private int prevCannonAnimation = 514;
	private Types type = Types.NONE;
	private boolean imbue;
	private boolean enableImbue;

	@Provides
	OneClickConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(OneClickConfig.class);
	}

	@Override
	protected void startUp()
	{
		addSubscriptions();
		type = config.getType();
		enableImbue = config.isUsingImbue();
	}

	@Override
	protected void shutDown()
	{
		eventBus.unregister(this);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(MenuEntryAdded.class, this, this::onMenuEntryAdded);
		eventBus.subscribe(MenuOptionClicked.class, this, this::onMenuOptionClicked);
		eventBus.subscribe(GameTick.class, this, this::onGameTick);
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(MenuOpened.class, this, this::onMenuOpened);
		eventBus.subscribe(GameObjectSpawned.class, this, this::onGameObjectSpawned);
		eventBus.subscribe(ChatMessage.class, this, this::onChatMessage);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
	}

	//this prob isn't needed, but just incase.
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN && imbue)
		{
			imbue = false;
		}
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("oneclick"))
		{
			type = config.getType();
			enableImbue = config.isUsingImbue();
		}
	}

	private void onChatMessage(ChatMessage event)
	{
		switch (event.getMessage())
		{
			case "You pick up the cannon. It's really heavy.":
				cannonFiring = false;
				cannon = null;
				break;
			case MAGIC_IMBUE_MESSAGE:
				imbue = true;
				break;
			case MAGIC_IMBUE_EXPIRED_MESSAGE:
				imbue = false;
				break;
		}
	}

	private void onGameObjectSpawned(GameObjectSpawned event)
	{
		final GameObject gameObject = event.getGameObject();
		final Player localPlayer = client.getLocalPlayer();
		if (gameObject.getId() == DWARF_MULTICANNON && cannon == null &&
			localPlayer.getWorldLocation().distanceTo(gameObject.getWorldLocation()) <= 2 &&
			localPlayer.getAnimation() == AnimationID.BURYING_BONES)
		{
			cannon = gameObject;
		}
	}

	private void onGameTick(GameTick event)
	{
		if (cannon != null)
		{
			final Entity entity = cannon.getEntity();
			if (entity instanceof DynamicObject)
			{
				final int anim = ((DynamicObject) entity).getAnimationID();
				if (anim == 514 && prevCannonAnimation == 514)
				{
					cannonFiring = false;
				}
				else if (anim != prevCannonAnimation)
				{
					cannonFiring = true;
				}
				prevCannonAnimation = ((DynamicObject) entity).getAnimationID();
			}
		}
		tick = false;
	}

	private void onMenuOpened(MenuOpened event)
	{
		final MenuEntry firstEntry = event.getFirstEntry();

		if (firstEntry == null)
		{
			return;
		}

		final int widgetId = firstEntry.getParam1();

		if (widgetId == WidgetInfo.INVENTORY.getId() && type == Types.HIGH_ALCH)
		{
			final Widget spell = client.getWidget(WidgetInfo.SPELL_HIGH_LEVEL_ALCHEMY);

			if (spell == null)
			{
				return;
			}

			if (spell.getSpriteId() != SpriteID.SPELL_HIGH_LEVEL_ALCHEMY ||
				spell.getSpriteId() == SpriteID.SPELL_HIGH_LEVEL_ALCHEMY_DISABLED ||
				client.getBoostedSkillLevel(Skill.MAGIC) < 55 ||
				client.getVar(Varbits.SPELLBOOK) != 0)
			{
				alchItem = null;
				return;
			}

			final int itemId = firstEntry.getIdentifier();

			if (itemId == -1)
			{
				return;
			}

			final MenuEntry[] menuList = new MenuEntry[event.getMenuEntries().length + 1];

			for (int i = event.getMenuEntries().length - 1; i >= 0; i--)
			{
				if (i == 0)
				{
					menuList[i] = event.getMenuEntries()[i];
				}
				else
				{
					menuList[i + 1] = event.getMenuEntries()[i];
				}
			}

			final MenuEntry SetHighAlchItem = new MenuEntry();
			final boolean set = alchItem != null && alchItem.getId() == firstEntry.getIdentifier();
			SetHighAlchItem.setOption(set ? "Unset" : "Set");
			SetHighAlchItem.setTarget("<col=00ff00>High Alchemy Item <col=ffffff> -> " + firstEntry.getTarget());
			SetHighAlchItem.setIdentifier(set ? -1 : firstEntry.getIdentifier());
			SetHighAlchItem.setOpcode(MenuOpcode.RUNELITE.getId());
			SetHighAlchItem.setParam1(widgetId);
			SetHighAlchItem.setForceLeftClick(false);
			menuList[1] = SetHighAlchItem;
			event.setMenuEntries(menuList);
			event.setModified(true);
		}
	}


	private void onMenuEntryAdded(MenuEntryAdded event)
	{
		final MenuEntry entry = event.getMenuEntry();
		final int id = event.getIdentifier();
		final int opcode = event.getType();
		targetMap.put(id, event.getMenuEntry().getTarget());

		if (type == Types.DARTS && opcode == MenuOpcode.ITEM_USE.getId() && DART_TIPS.contains(id))
		{
			if (findItem(ItemID.FEATHER) == -1)
			{
				return;
			}
			entry.setTarget("<col=ff9040>Feather<col=ffffff> -> " + targetMap.get(id));
			event.setWasModified(true);
		}
		else if (type == Types.FIREMAKING && opcode == MenuOpcode.ITEM_USE.getId() && LOG_ID.contains(id))
		{
			if (findItem(ItemID.TINDERBOX) == -1)
			{
				return;
			}
			entry.setTarget("<col=ff9040>Tinderbox<col=ffffff> -> " + targetMap.get(id));
			event.setWasModified(true);
		}
		else if (type == Types.DARK_ESSENCE && opcode == MenuOpcode.ITEM_USE.getId() && id == ItemID.CHISEL)
		{
			if (findItem(ItemID.DARK_ESSENCE_BLOCK) == -1)
			{
				return;
			}
			entry.setTarget("<col=ff9040>Chisel<col=ffffff> -> <col=ff9040>Dark essence block");
			event.setWasModified(true);
		}
		else if (type == Types.BIRDHOUSES && opcode == MenuOpcode.GAME_OBJECT_SECOND_OPTION.getId() &&
			BIRD_HOUSES_NAMES.contains(event.getTarget()))
		{
			if (findItem(HOPS_SEED) == null)
			{
				return;
			}
			entry.setOption("Use");
			entry.setTarget("<col=ff9040>Hops seed<col=ffffff> -> " + targetMap.get(id));
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId());
			event.setWasModified(true);
		}
		else if (type == Types.HERB_TAR && opcode == MenuOpcode.ITEM_USE.getId() && HERBS.contains(id))
		{
			if (findItem(ItemID.SWAMP_TAR) == -1 || findItem(ItemID.PESTLE_AND_MORTAR) == -1)
			{
				return;
			}
			entry.setTarget("<col=ff9040>Swamp tar<col=ffffff> -> " + targetMap.get(id));
			event.setWasModified(true);
		}
		else if (type == Types.LAVA_RUNES && opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			event.getOption().equals("Craft-rune") && event.getTarget().equals("<col=ffff>Altar"))
		{
			if (findItem(ItemID.EARTH_RUNE) == -1)
			{
				return;
			}

			if (!imbue && enableImbue)
			{
				entry.setOption("Use");
				entry.setTarget("<col=ff9040>Magic Imbue<col=ffffff> -> <col=ffff>Yourself");
				event.setWasModified(true);
				return;
			}
			entry.setOption("Use");
			entry.setTarget("<col=ff9040>Earth rune<col=ffffff> -> <col=ffff>Altar");
			event.setWasModified(true);
		}
		else if (type == Types.HIGH_ALCH && opcode == MenuOpcode.WIDGET_TYPE_2.getId() && alchItem != null &&
			event.getOption().equals("Cast") && event.getTarget().equals("<col=00ff00>High Level Alchemy</col>"))
		{
			entry.setOption("Cast");
			entry.setTarget("<col=00ff00>High Level Alchemy</col><col=ffffff> -> " + alchItem.getName());
			event.setWasModified(true);
		}
		else if (type == Types.DWARF_CANNON && cannonFiring && event.getIdentifier() == DWARF_MULTICANNON &&
			opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId())
		{
			if (findItem(ItemID.CANNONBALL) == -1)
			{
				return;
			}
			entry.setOption("Use");
			entry.setTarget("<col=ff9040>Cannonball<col=ffffff> -> <col=ffff>Dwarf multicannon");
			event.setWasModified(true);
		}
		else if (type == Types.BONES && opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			event.getOption().toLowerCase().contains("pray") && event.getTarget().toLowerCase().contains("altar"))
		{
			if (findItem(BONE_SET) == null)
			{
				return;
			}
			entry.setOption("Use");
			entry.setTarget("<col=ff9040>Bones<col=ffffff> -> " + event.getTarget());
			event.setWasModified(true);
		}
		else if (type == Types.KARAMBWANS && opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() && event.getOption().equals("Cook"))
		{
			if (findItem(ItemID.RAW_KARAMBWAN) == -1)
			{
				return;
			}
			entry.setOption("Use");
			entry.setTarget("<col=ff9040>Raw karambwan<col=ffffff> -> " + entry.getTarget());
			event.setWasModified(true);
		}
	}

	private void onMenuOptionClicked(MenuOptionClicked event)
	{
		final MenuEntry entry = event.getMenuEntry();
		final String target = event.getTarget();
		final int opcode = event.getOpcode();

		if (tick)
		{
			event.consume();
		}
		else if (type == Types.DARTS && opcode == MenuOpcode.ITEM_USE.getId() &&
			target.contains("<col=ff9040>Feather<col=ffffff> -> "))
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_WIDGET_ITEM.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.FEATHER));
			client.setSelectedItemID(ItemID.FEATHER);
		}
		else if (type == Types.FIREMAKING && opcode == MenuOpcode.ITEM_USE.getId() &&
			target.contains("<col=ff9040>Tinderbox<col=ffffff> -> "))
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_WIDGET_ITEM.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.TINDERBOX));
			client.setSelectedItemID(ItemID.TINDERBOX);
		}
		else if (type == Types.DARK_ESSENCE && opcode == MenuOpcode.ITEM_USE.getId() &&
			target.contains("<col=ff9040>Chisel<col=ffffff> ->"))
		{
			if (findItem(ItemID.DARK_ESSENCE_BLOCK) != -1)
			{
				entry.setOpcode(MenuOpcode.ITEM_USE_ON_WIDGET_ITEM.getId());
				client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
				client.setSelectedItemSlot(findItem(ItemID.DARK_ESSENCE_BLOCK));
				client.setSelectedItemID(ItemID.DARK_ESSENCE_BLOCK);
			}
		}
		else if (type == Types.BIRDHOUSES && opcode == MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId() &&
			target.contains("<col=ff9040>Hops seed<col=ffffff> -> "))
		{
			final int[] seedLoc = findItem(HOPS_SEED);
			if (seedLoc == null || seedLoc.length < 2)
			{
				return;
			}
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(seedLoc[0]);
			client.setSelectedItemID(seedLoc[1]);
		}
		else if (type == Types.HERB_TAR && opcode == MenuOpcode.ITEM_USE.getId() &&
			target.contains("<col=ff9040>Swamp tar<col=ffffff> -> "))
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_WIDGET_ITEM.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.SWAMP_TAR));
			client.setSelectedItemID(ItemID.SWAMP_TAR);
		}
		else if (type == Types.LAVA_RUNES && opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			target.equals("<col=ff9040>Earth rune<col=ffffff> -> <col=ffff>Altar"))
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.EARTH_RUNE));
			client.setSelectedItemID(ItemID.EARTH_RUNE);
		}
		else if (type == Types.LAVA_RUNES && opcode == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			target.equals("<col=ff9040>Magic Imbue<col=ffffff> -> <col=ffff>Yourself"))
		{
			entry.setIdentifier(1);
			entry.setOpcode(MenuOpcode.WIDGET_DEFAULT.getId());
			entry.setParam0(-1);
			entry.setParam1(WidgetInfo.SPELL_MAGIC_IMBUE.getId());
		}
		else if (type == Types.HIGH_ALCH && opcode == MenuOpcode.WIDGET_TYPE_2.getId() && event.getOption().equals("Cast") &&
			target.contains("<col=00ff00>High Level Alchemy</col><col=ffffff> -> "))
		{
			entry.setIdentifier(alchItem.getId());
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_WIDGET.getId());
			entry.setParam0(findItem(alchItem.getId()));
			entry.setParam1(9764864);
			client.setSelectedSpellName("<col=00ff00>High Level Alchemy</col><col=ffffff>");
			client.setSelectedSpellWidget(WidgetInfo.SPELL_HIGH_LEVEL_ALCHEMY.getId());
		}
		else if (type == Types.HIGH_ALCH && entry.getOpcode() == MenuOpcode.RUNELITE.getId() && entry.getIdentifier() == -1)
		{
			alchItem = null;
		}
		else if (type == Types.HIGH_ALCH && entry.getOpcode() == MenuOpcode.RUNELITE.getId())
		{
			final String itemName = entry.getTarget().split("<col=00ff00>High Alchemy Item <col=ffffff> -> ")[1];
			alchItem = new AlchItem(itemName, entry.getIdentifier());
		}
		else if (type == Types.DWARF_CANNON && cannonFiring && entry.getIdentifier() == DWARF_MULTICANNON &&
			entry.getOpcode() == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId())
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.CANNONBALL));
			client.setSelectedItemID(ItemID.CANNONBALL);
		}
		else if (type == Types.BONES && entry.getOpcode() == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			entry.getTarget().contains("<col=ff9040>Bones<col=ffffff> -> ") && target.toLowerCase().contains("altar"))
		{
			final int[] bonesLoc = findItem(BONE_SET);

			if (bonesLoc == null || bonesLoc.length < 2)
			{
				System.out.println("Cant find bones.");
				return;
			}

			entry.setOpcode(MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(bonesLoc[0]);
			client.setSelectedItemID(bonesLoc[1]);
		}
		else if (type == Types.KARAMBWANS && entry.getOpcode() == MenuOpcode.GAME_OBJECT_FIRST_OPTION.getId() &&
			entry.getTarget().contains("<col=ff9040>Raw karambwan<col=ffffff> -> "))
		{
			entry.setOpcode(MenuOpcode.ITEM_USE_ON_GAME_OBJECT.getId());
			client.setSelectedItemWidget(WidgetInfo.INVENTORY.getId());
			client.setSelectedItemSlot(findItem(ItemID.RAW_KARAMBWAN));
			client.setSelectedItemID(ItemID.RAW_KARAMBWAN);
			tick = true;
		}
	}

	private int findItem(int itemID)
	{
		final ItemContainer itemContainer = client.getItemContainer(InventoryID.INVENTORY);

		if (itemContainer == null)
		{
			return -1;
		}

		final Item[] items = itemContainer.getItems();
		for (int slot = items.length - 1; slot >= 0; slot--)
		{
			final Item item = items[slot];
			if (item != null && itemID == item.getId())
			{
				return slot;
			}
		}
		return -1;
	}

	private int[] findItem(Collection<Integer> itemIDs)
	{
		final ItemContainer itemContainer = client.getItemContainer(InventoryID.INVENTORY);

		if (itemContainer == null)
		{
			return null;
		}

		final Item[] items = itemContainer.getItems();
		for (int slot = items.length - 1; slot >= 0; slot--)
		{
			final Item item = items[slot];
			if (item != null && itemIDs.contains(item.getId()))
			{
				return new int[]{slot, item.getId()};
			}
		}
		return null;
	}

}