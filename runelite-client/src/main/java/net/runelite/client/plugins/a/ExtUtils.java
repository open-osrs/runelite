/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.a;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.queries.*;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.external.PrayerMap;
import net.runelite.client.external.Spells;
import net.runelite.client.external.Tab;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

@Slf4j
@SuppressWarnings("unused")
@Singleton
public class ExtUtils
{
	final private Client client;
	private Keyboard keyboard = null;

	ExtUtils(Client client, Keyboard keyboard)
	{
		this.client = client;
		this.keyboard = keyboard;
	}

	ExtUtils(Client client)
	{
		this.client = client;
	}

	public int[] stringToIntArray(String string)
	{
		return Arrays.stream(string.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
	}

	// find in game items

	@Nullable
	public GameObject findNearestGameObject(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GameObjectQuery()
				.idEquals(ids)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public GameObject findNearestGameObject(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GameObjectQuery()
				.nameEquals(names)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public GameObject findNearestGameObject(Predicate<GameObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GameObjectQuery()
				.filter(filter)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public WallObject findNearestWallObject(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new WallObjectQuery()
				.idEquals(ids)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public WallObject findNearestWallObject(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new WallObjectQuery()
				.nameEquals(names)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public WallObject findNearestWallObject(Predicate<WallObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new WallObjectQuery()
				.filter(filter)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public DecorativeObject findNearestDecorObject(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new DecorativeObjectQuery()
				.idEquals(ids)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public DecorativeObject findNearestDecorObject(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new DecorativeObjectQuery()
				.nameEquals(names)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public DecorativeObject findNearestDecorObject(Predicate<DecorativeObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new DecorativeObjectQuery()
				.filter(filter)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public GroundObject findNearestGroundObject(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GroundObjectQuery()
				.idEquals(ids)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public GroundObject findNearestGroundObject(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GroundObjectQuery()
				.nameEquals(names)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public GroundObject findNearestGroundObject(Predicate<GroundObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new GroundObjectQuery()
				.filter(filter)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public NPC findNearestNPC(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new NPCQuery()
				.idEquals(ids)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	@Nullable
	public NPC findNearestNPC(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new NPCQuery()
				.nameEquals(names)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	public NPC findNpc(int id)
	{
		return client.getCachedNPCs()[id];
	}

	@Nullable
	public NPC findNearestNPC(Predicate<NPC> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return null;
		}

		return new NPCQuery()
				.filter(filter)
				.result(client)
				.nearestTo(client.getLocalPlayer());
	}

	public List<GameObject> getGameObjects(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GameObjectQuery()
				.idEquals(ids)
				.result(client)
				.list;
	}

	public List<GameObject> getGameObjects(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GameObjectQuery()
				.nameEquals(names)
				.result(client)
				.list;
	}

	public List<GameObject> getGameObjects(Predicate<GameObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GameObjectQuery()
				.filter(filter)
				.result(client)
				.list;
	}

	public List<WallObject> getWallObjects(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new WallObjectQuery()
				.idEquals(ids)
				.result(client)
				.list;
	}

	public List<WallObject> getWallObjects(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new WallObjectQuery()
				.nameEquals(names)
				.result(client)
				.list;
	}

	public List<WallObject> getWallObjects(Predicate<WallObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new WallObjectQuery()
				.filter(filter)
				.result(client)
				.list;
	}

	public List<DecorativeObject> getDecorObjects(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new DecorativeObjectQuery()
				.idEquals(ids)
				.result(client)
				.list;
	}

	public List<DecorativeObject> getDecorObjects(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new DecorativeObjectQuery()
				.nameEquals(names)
				.result(client)
				.list;
	}

	public List<DecorativeObject> getDecorObjects(Predicate<DecorativeObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new DecorativeObjectQuery()
				.filter(filter)
				.result(client)
				.list;
	}

	public List<GroundObject> getGroundObjects(int... ids)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GroundObjectQuery()
				.idEquals(ids)
				.result(client)
				.list;
	}

	public List<GroundObject> getGroundObjects(String... names)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GroundObjectQuery()
				.nameEquals(names)
				.result(client)
				.list;
	}

	public List<GroundObject> getGroundObjects(Predicate<GroundObject> filter)
	{
		assert client.isClientThread();

		if (client.getLocalPlayer() == null)
		{
			return new ArrayList<>();
		}

		return new GroundObjectQuery()
				.filter(filter)
				.result(client)
				.list;
	}

	@Nullable
	public TileObject findNearestObject(int... ids)
	{
		GameObject gameObject = findNearestGameObject(ids);

		if (gameObject != null)
		{
			return gameObject;
		}

		WallObject wallObject = findNearestWallObject(ids);

		if (wallObject != null)
		{
			return wallObject;
		}
		DecorativeObject decorativeObject = findNearestDecorObject(ids);

		if (decorativeObject != null)
		{
			return decorativeObject;
		}

		return findNearestGroundObject(ids);
	}

	@Nullable
	public TileObject findNearestObject(String... names)
	{
		GameObject gameObject = findNearestGameObject(names);

		if (gameObject != null)
		{
			return gameObject;
		}

		WallObject wallObject = findNearestWallObject(names);

		if (wallObject != null)
		{
			return wallObject;
		}
		DecorativeObject decorativeObject = findNearestDecorObject(names);

		if (decorativeObject != null)
		{
			return decorativeObject;
		}

		return findNearestGroundObject(names);
	}

	// widget items


	public List<WidgetItem> getItems(int... itemIDs)
	{
		assert client.isClientThread();

		return new InventoryWidgetItemQuery()
				.idEquals(itemIDs)
				.result(client)
				.list;
	}

	public List<WidgetItem> getItems(String... names)
	{
		assert client.isClientThread();

		ArrayList<WidgetItem> items = new InventoryWidgetItemQuery()
				.result(client)
				.list;

		new ArrayList<>(Arrays.asList(names)).forEach(inventoryItem ->
				items.removeIf(item -> item.getWidget().getName().equals(inventoryItem)));

		return items;
	}

	public List<WidgetItem> getItems(Predicate<WidgetItem> filter)
	{
		assert client.isClientThread();

		return new InventoryWidgetItemQuery()
				.filter(filter)
				.result(client)
				.list;
	}

	public List<Widget> getEquippedItems(int[] itemIds)
	{
		assert client.isClientThread();

		Widget equipmentWidget = client.getWidget(WidgetInfo.EQUIPMENT);

		List<Integer> equippedIds = new ArrayList<>();

		for (int i : itemIds)
		{
			equippedIds.add(i);
		}

		List<Widget> equipped = new ArrayList<>();

		if (equipmentWidget.getStaticChildren() != null)
		{
			for (Widget widgets : equipmentWidget.getStaticChildren())
			{
				for (Widget items : widgets.getDynamicChildren())
				{
					if (equippedIds.contains(items.getItemId()))
					{
						equipped.add(items);
					}
				}
			}
		}
		else
		{
			log.error("Children is Null!");
		}

		return equipped;
	}

	public List<Widget> getEquippedItems(String[] names)
	{
		assert client.isClientThread();

		Widget equipmentWidget = client.getWidget(WidgetInfo.EQUIPMENT);

		List<String> equippedNames = new ArrayList<>(Arrays.asList(names));

		List<Widget> equipped = new ArrayList<>();

		assert equipmentWidget != null;
		if (equipmentWidget.getStaticChildren() != null)
		{
			for (Widget widgets : equipmentWidget.getStaticChildren())
			{
				for (Widget items : widgets.getDynamicChildren())
				{
					if (equippedNames.contains(items.getName()))
					{
						equipped.add(items);
					}
				}
			}
		}
		else
		{
			log.error("Children is Null!");
		}

		return equipped;
	}

	public List<Widget> getEquippedItems()
	{
		assert client.isClientThread();

		Widget equipmentWidget = client.getWidget(WidgetInfo.EQUIPMENT);

		List<Widget> equipped = new ArrayList<>();

		assert equipmentWidget != null;
		if (equipmentWidget.getStaticChildren() != null)
		{
			for (Widget widgets : equipmentWidget.getStaticChildren())
			{
				equipped.addAll(Arrays.asList(widgets.getDynamicChildren()));
			}
		}
		else
		{
			log.error("Children is Null!");
		}

		return equipped;
	}

	public int getTabHotkey(Tab tab)
	{
		assert client.isClientThread();

		final int var = client.getVarbitValue(client.getVarps(), tab.getVarbit());
		final int offset = 111;

		switch (var)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				return var + offset;
			case 13:
				return 27;
			default:
				return - 1;
		}
	}

	public WidgetInfo getSpellWidgetInfo(String spell)
	{
		assert client.isClientThread();
		return Spells.getWidget(spell);
	}

	public WidgetInfo getPrayerWidgetInfo(String spell)
	{
		assert client.isClientThread();
		return PrayerMap.getWidget(spell);
	}

	public Widget getSpellWidget(String spell)
	{
		assert client.isClientThread();
		return client.getWidget(Spells.getWidget(spell));
	}

	public Widget getPrayerWidget(String spell)
	{
		assert client.isClientThread();
		return client.getWidget(PrayerMap.getWidget(spell));
	}

	/**
	 * This method must be called on a new
	 * thread, if you try to call it on
	 * {@link net.runelite.client.callback.ClientThread}
	 * it will result in a crash/desynced thread.
	 */
	public void typeString(String string)
	{
		assert ! client.isClientThread();

		try
		{
			keyboard.type(string);
		}
		catch (InterruptedException e)
		{
			log.debug(e.toString());
			e.printStackTrace();
		}
	}

	private void keyEvent(int id, char key)
	{
		KeyEvent e = new KeyEvent(
				client.getCanvas(), id, System.currentTimeMillis(),
				0, KeyEvent.VK_UNDEFINED, key
		);

		client.getCanvas().dispatchEvent(e);
	}

	/**
	 * This method must be called on a new
	 * thread, if you try to call it on
	 * {@link net.runelite.client.callback.ClientThread}
	 * it will result in a crash/desynced thread.
	 */
	public void click(Rectangle rectangle)
	{
		assert ! client.isClientThread();
		Point point = getClickPoint(rectangle);
		click(point);
	}

	public void click(Point p)
	{
		assert ! client.isClientThread();

		if (client.isStretchedEnabled())
		{
			final Dimension stretched = client.getStretchedDimensions();
			final Dimension real = client.getRealDimensions();
			final double width = (stretched.width / real.getWidth());
			final double height = (stretched.height / real.getHeight());
			final Point point = new Point((int) (p.getX() * width), (int) (p.getY() * height));
			mouseEvent(501, point);
			mouseEvent(502, point);
			mouseEvent(500, point);
			return;
		}
		mouseEvent(501, p);
		mouseEvent(502, p);
		mouseEvent(500, p);
	}

	public Point getClickPoint(@NotNull Rectangle rect)
	{
		final int x = (int) (rect.getX() + getRandomIntBetweenRange((int) rect.getWidth() / 6 * - 1, (int) rect.getWidth() / 6) + rect.getWidth() / 2);
		final int y = (int) (rect.getY() + getRandomIntBetweenRange((int) rect.getHeight() / 6 * - 1, (int) rect.getHeight() / 6) + rect.getHeight() / 2);

		return new Point(x, y);
	}

	public int getRandomIntBetweenRange(int min, int max)
	{
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}

	private void mouseEvent(int id, @NotNull Point point)
	{
		MouseEvent e = new MouseEvent(
				client.getCanvas(), id,
				System.currentTimeMillis(),
				0, point.getX(), point.getY(),
				1, false, 1
		);

		client.getCanvas().dispatchEvent(e);
	}

	public boolean isOnScreen(TileObject point)
	{
		return client.getCanvas().contains(point.getCanvasLocation().getX(), point.getCanvasLocation().getY());
	}

	public boolean isOnScreen(WidgetItem point)
	{
		return client.getCanvas().contains(point.getCanvasLocation().getX(), point.getCanvasLocation().getY());
	}

	public boolean isOnScreen(Actor actor)
	{
		// that was my last resort that worked
		client.getCanvas().getLocationOnScreen();
		client.getCanvas().isShowing();
		client.getCanvas().getMousePosition();
		client.getCanvasHeight();
		client.getCanvasWidth();
		Point actorPoint = Perspective.localToCanvas(client, actor.getLocalLocation(), client.getPlane());
		assert actorPoint != null;
		return isOnScreen(actorPoint);
	}

	public boolean isOnScreen(Point point)
	{
		return (point.getX() >= 0 && point.getX() <= client.getCanvasWidth() && point.getY() >= 0 &&
				point.getY() <= client.getCanvasHeight());
	}


	private void robotClick() throws AWTException
	{
		Robot bot = new Robot();
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

	public void robotType(String something)
	{
		try
		{
			this.keyboard.type(something);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static int random(int min, int max)
	{
		return ThreadLocalRandom.current().nextInt(min, max);
	}

	public void testSomething()
	{
		List<GameObject> gameObjects = getGameObjects("something");
		for (GameObject o : gameObjects)
		{
			isOnScreen(o);
		}
		List<WidgetItem> items = getItems("");
		for (WidgetItem o : items)
		{
			isOnScreen(o);
		}

	}

	public boolean isTabOpen(WidgetInfo info)
	{
		return Objects.requireNonNull(client.getWidget(info)).isHidden();
	}

	enum ToolbarTabs
	{
		COMBAT_OPTIONS,
		SKILLS,
		QUEST_LIST,
		INVENTORY,
		WORN_EQUIPMENT,
		PRAYER,
		MAGIC,
		FRIENDS_LIST,
		ACCOUNT_MANAGEMENT,
		CHAT_CHANNEL,
		SETTINGS,
		EMOTES,
		MUSIC_PLAYER
	}

	HashMap<ToolbarTabs, int[]> something = new HashMap<>()
	{{
		put(ToolbarTabs.COMBAT_OPTIONS, new int[]{164, 66});
		put(ToolbarTabs.SKILLS, new int[]{164, 67});
		put(ToolbarTabs.QUEST_LIST, new int[]{164, 68});
		put(ToolbarTabs.INVENTORY, new int[]{164, 69});
		put(ToolbarTabs.WORN_EQUIPMENT, new int[]{164, 70});
		put(ToolbarTabs.PRAYER, new int[]{164, 71});
		put(ToolbarTabs.MAGIC, new int[]{164, 72});

		put(ToolbarTabs.FRIENDS_LIST, new int[]{164, 52});
		put(ToolbarTabs.ACCOUNT_MANAGEMENT, new int[]{164, 51});
		put(ToolbarTabs.CHAT_CHANNEL, new int[]{164, 50});
		put(ToolbarTabs.SETTINGS, new int[]{164, 53});
		put(ToolbarTabs.EMOTES, new int[]{164, 54});
		put(ToolbarTabs.MUSIC_PLAYER, new int[]{164, 55});
	}};

	enum MapTabs
	{
		ACTIVATE_QUICK_PRAYERS,
		TOGGLE_RUN,
		SPECIAL_ATTACK,
		WORLD_MAP
	}

	HashMap<MapTabs, int[]> mapTabs = new HashMap<>()
	{{
		put(MapTabs.ACTIVATE_QUICK_PRAYERS, new int[]{160, 17});
		put(MapTabs.SPECIAL_ATTACK, new int[]{160, 33});
		put(MapTabs.WORLD_MAP, new int[]{160, 48});
		put(MapTabs.TOGGLE_RUN, new int[]{160, 25});
	}};

	boolean inventoryContains(String ... names)
	{
		if (isTabOpen(WidgetInfo.INVENTORY))
		{
			Widget widget = client.getWidget(15, 3);
			if (widget != null)
			{
				Widget[] children = widget.getChildren();
				assert children != null;
				for (String name : names)
				{
					for( Widget child : children)
					{
						if (child.getName().contains(name))
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	List<Widget> getInventorySlots(String name)
	{
		List<Widget> widgets = new ArrayList<>();
		if (isTabOpen(WidgetInfo.INVENTORY))
		{
			Widget widget = client.getWidget(15, 3);
			if (widget != null)
			{
				Widget[] children = widget.getChildren();
				assert children != null;
				for( Widget child : children)
				{
					if (child.getName().contains(name))
					{
						widgets.add(child);
					}
				}
			}
		}
		return widgets.size() > 0 ? widgets : null;
	}

	Widget getFirstInventorySlot(String name)
	{
		if (isTabOpen(WidgetInfo.INVENTORY))
		{
			Widget widget = client.getWidget(15, 3);
			if (widget != null)
			{
				Widget[] children = widget.getChildren();
				assert children != null;
				for( Widget child : children)
				{
					if (child.getName().contains(name))
					{
						return child;
					}
				}
			}
		}
		return null;
	}

	WidgetItem getFirstInventorySlotContains(String name)
	{
		return new InventoryWidgetItemQuery()
				.filter(item -> item.getWidget().getName().contains(name))
				.result(client)
				.first();
	}

	WidgetItem getRandomInventorySlotContains(String name)
	{
		List<WidgetItem> list = new InventoryWidgetItemQuery()
				.filter(item -> item.getWidget().getName().contains(name))
				.result(client)
				.list;
		return list.get(new Random().nextInt(list.size()));
	}

	List<WidgetItem> getInventorySlotsContains(String name)
	{
		return new InventoryWidgetItemQuery()
				.filter(item -> item.getWidget().getName().contains(name))
				.result(client)
				.list;
	}

	List<WidgetItem> getInventorySlots(int ... ids)
	{
		return new InventoryWidgetItemQuery()
				.idEquals(ids)
				.result(client)
				.list;
	}

	WidgetItem getRandomInventorySlot(int ... ids)
	{
		ArrayList<WidgetItem> list = new InventoryWidgetItemQuery()
				.idEquals(ids)
				.result(client)
				.list;
		return list.get(new Random().nextInt(list.size()));
	}

	WidgetItem getFirstInventorySlot(int ... ids)
	{
		return  new InventoryWidgetItemQuery()
				.idEquals(ids)
				.result(client)
				.first();
	}

}
