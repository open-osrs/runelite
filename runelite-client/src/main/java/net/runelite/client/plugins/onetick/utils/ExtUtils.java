package net.runelite.client.plugins.onetick.utils;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.flexo.Flexo;

@Slf4j
public class ExtUtils
{
	public static int[] stringToIntArray(String string)
	{
		return Arrays.stream(string.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
	}

	public static List<WidgetItem> getItems(int[] itemIds, Client client)
	{
		Widget inventoryWidget = client.getWidget(WidgetInfo.INVENTORY);

		ArrayList<Integer> itemIDs = new ArrayList<>();

		for (int i : itemIds)
		{
			itemIDs.add(i);
		}

		List<WidgetItem> listToReturn = new ArrayList<>();

		for (WidgetItem item : inventoryWidget.getWidgetItems())
		{
			if (itemIDs.contains(item.getId()))
			{
				listToReturn.add(item);
			}
		}

		return listToReturn;
	}

	public static List<Widget> getEquippedItems(int[] itemIds, Client client)
	{
		Widget equipmentWidget = client.getWidget(WidgetInfo.EQUIPMENT);

		ArrayList<Integer> equippedIds = new ArrayList<>();

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
			log.error("Static Children is Null!");
		}

		return equipped;
	}

	public static void handleSwitch(Rectangle rectangle, ActionType actionType, Flexo flexo, Client client, double scalingfactor, int delay, boolean click)
	{
		Point cp = getClickPoint(rectangle, scalingfactor, client.isStretchedEnabled());
		Point tmp = client.getMouseCanvasPosition();
		java.awt.Point mousePos = new java.awt.Point(tmp.getX(), tmp.getY());

		if (cp.getX() >= 1)
		{
			switch (actionType)
			{
				case FLEXO:
					if (!rectangle.contains(mousePos))
					{
						flexo.mouseMove(cp.getX(), cp.getY());
					}
					if (click)
					{
						flexo.mousePressAndRelease(1);
					}
					break;
				case MOUSEEVENTS:
					if (!rectangle.contains(mousePos))
					{
						moveMouse(cp.getX(), cp.getY(), client);
					}
					flexo.delay(20);
					if (click)
					{
						leftClick(cp.getX(), cp.getY(), client, scalingfactor);
					}
					flexo.delay(delay);
					break;
			}
		}
	}

	public static void leftClick(int x, int y, Client client, double scalingFactor)
	{
		if (client.isStretchedEnabled())
		{
			double scale = 1 + (scalingFactor / 100);

			MouseEvent mousePressed =
				new MouseEvent(client.getCanvas(), 501, System.currentTimeMillis(), 0, (int) (client.getMouseCanvasPosition().getX() * scale), (int) (client.getMouseCanvasPosition().getY() * scale), 1, false, 1);
			client.getCanvas().dispatchEvent(mousePressed);
			MouseEvent mouseReleased =
				new MouseEvent(client.getCanvas(), 502, System.currentTimeMillis(), 0, (int) (client.getMouseCanvasPosition().getX() * scale), (int) (client.getMouseCanvasPosition().getY() * scale), 1, false, 1);
			client.getCanvas().dispatchEvent(mouseReleased);
			MouseEvent mouseClicked =
				new MouseEvent(client.getCanvas(), 500, System.currentTimeMillis(), 0, (int) (client.getMouseCanvasPosition().getX() * scale), (int) (client.getMouseCanvasPosition().getY() * scale), 1, false, 1);
			client.getCanvas().dispatchEvent(mouseClicked);
		}
		if (!client.isStretchedEnabled())
		{
			MouseEvent mousePressed =
				new MouseEvent(client.getCanvas(), 501, System.currentTimeMillis(), 0, client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY(), 1, false, 1);
			client.getCanvas().dispatchEvent(mousePressed);
			MouseEvent mouseReleased =
				new MouseEvent(client.getCanvas(), 502, System.currentTimeMillis(), 0, client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY(), 1, false, 1);
			client.getCanvas().dispatchEvent(mouseReleased);
			MouseEvent mouseClicked =
				new MouseEvent(client.getCanvas(), 500, System.currentTimeMillis(), 0, client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY(), 1, false, 1);
			client.getCanvas().dispatchEvent(mouseClicked);
		}
	}

	private static void moveMouse(int x, int y, Client client)
	{
		MouseEvent mouseEntered = new MouseEvent(client.getCanvas(), 504, System.currentTimeMillis(), 0, x, y, 0, false);
		client.getCanvas().dispatchEvent(mouseEntered);
		MouseEvent mouseExited = new MouseEvent(client.getCanvas(), 505, System.currentTimeMillis(), 0, x, y, 0, false);
		client.getCanvas().dispatchEvent(mouseExited);
		MouseEvent mouseMoved = new MouseEvent(client.getCanvas(), 503, System.currentTimeMillis(), 0, x, y, 0, false);
		client.getCanvas().dispatchEvent(mouseMoved);
	}

	private static Point getClickPoint(Rectangle rect, double scalingFactor, boolean stretchedMode)
	{
		if (stretchedMode)
		{
			int rand = (Math.random() <= 0.5) ? 1 : 2;
			int x = (int) (rect.getX() + (rand * 3) + rect.getWidth() / 2);
			int y = (int) (rect.getY() + (rand * 3) + rect.getHeight() / 2);
			double scale = 1 + (scalingFactor / 100);
			return new Point((int) (x * scale), (int) (y * scale));
		}
		else
		{
			int rand = (Math.random() <= 0.5) ? 1 : 2;
			int x = (int) (rect.getX() + (rand * 3) + rect.getWidth() / 2);
			int y = (int) (rect.getY() + (rand * 3) + rect.getHeight() / 2);
			return new Point(x, y);
		}
	}

	public static GameObject grabNearestObjectToPlayer(int id, List<GameObject> objects, java.awt.Point playerPoint)
	{
		List<Double> tmp = new ArrayList<>();
		final GameObject[] temp = {null};

		objects.forEach(object ->
		{
			if (object.getId() == id)
			{
				final Rectangle b = object.getConvexHull().getBounds();
				final double distance = distance(playerPoint.x, playerPoint.y, (int) b.getCenterX(), (int) b.getCenterY());
				tmp.add(distance);
				double lowest = Collections.min(tmp);

				if (distance == lowest)
				{
					temp[0] = object;
				}
			}
		});
		return temp[0];
	}

	public static WidgetItem grabNearestItemToObject(int id, List<WidgetItem> items, TileObject object)
	{
		List<Double> tmp = new ArrayList<>();
		final WidgetItem[] temp = {null};

		items.forEach(item ->
		{
			if (item.getId() == id)
			{
				final Rectangle p = item.getCanvasBounds();
				final Rectangle b = object.getCanvasTilePoly().getBounds();
				final double distance = distance((int) p.getCenterX(), (int) p.getCenterY(), (int) b.getCenterX(), (int) b.getCenterY());
				tmp.add(distance);
				double lowest = Collections.min(tmp);

				if (distance == lowest)
				{
					temp[0] = item;
				}
			}
		});
		return temp[0];
	}

	private static double distance(int x1, int y1, int x2, int y2)
	{
		int dx = x2 - x1;
		int dy = y2 - y1;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
