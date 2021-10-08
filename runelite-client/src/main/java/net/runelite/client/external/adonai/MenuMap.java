package net.runelite.client.external.adonai;

import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.Point;
import net.runelite.api.events.MenuOpened;

public class MenuMap
{
	MenuOpened menu;
	public static Point MenuPosition = new Point(103, 22);
	public static Point MenuDimensions = new Point(0, 0);

	// offset, 20 down -- 33 (12 Pt Text)
	public static final int OFFSET_DOWN = 20;
	public static final int MENU_ITEM_HEIGHT = 15;
	public static final int FONT_SIZE = 12;

	public MenuEntry[] menuItems;
	Point mouseClicked;

	public MenuMap(Client client, MenuOpened menu)
	{
		MenuEntry[] menuEntries = menu.getMenuEntries();
		menuItems = reverse(menuEntries, menuEntries.length);
		mouseClicked = client.getMouseCanvasPosition();
		MenuPosition = new Point(client.getMenuX(), client.getMenuY());
		MenuDimensions = new Point(client.getMenuWidth(), client.getMenuHeight());
	}

	/* function that reverses array and stores it
       in another array*/
	private static MenuEntry[] reverse(MenuEntry[] a, int n)
	{
		MenuEntry[] b = new MenuEntry[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		return b;
	}

	public Point getMenuCanvasLocation(MenuEntry item)
	{
		int i = 0;
		for(MenuEntry e : menuItems) {
			if (e.getMenuAction().getId() == item.getMenuAction().getId())
			{
				return new Point((int) (MenuPosition.getX() + MenuDimensions.getX() / 2.0f), (MenuPosition.getY() + OFFSET_DOWN) + (FONT_SIZE / 2) + ( i * MENU_ITEM_HEIGHT));
			}
			i++;
		}
		return null;
	}

}
