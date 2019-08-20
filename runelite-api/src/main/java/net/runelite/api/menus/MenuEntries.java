package net.runelite.api.menus;

import java.util.Collection;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.menus.comparables.AbstractComparableEntry;

/**
 * A class holding references to all the menu entry related arrays, making
 * interacting with them from anywhere as easy as possible
 */
public class MenuEntries
{
	/**
	 * These arrays are the exact (!) same ones
	 * as in the actual client. Handle them with
	 * an appropriate amount of care. Keep in mind
	 * to only do this on the client thread and that
	 * menu entries are handled a lot! Small changes
	 * can mean big memory hogs.
	 */
	@Setter
	public static int menuEntryCount;

	@Setter
	public static int[] menuArguments1;

	@Setter
	public static int[] menuArguments2;

	@Setter
	public static int[] menuOpcodes;

	@Setter
	public static int[] menuIdentifiers;

	@Setter
	public static String[] menuActions;

	@Setter
	public static String[] menuTargets;

	@Setter
	public static boolean[] menuShiftClick;

	@Setter
	@Getter(AccessLevel.PACKAGE)
	private static Client client;

	/**
	 * Sorts the current menu entries in the same way the client does this.
	 *
	 * After this, the highest indexed entry is the left click entry.
	 *
	 * The client does this by itself every time someone clicks, and if
	 * we want to know which entry is gonna end up on top we're better off
	 * using this.sortNeeded()
	 */
	public static void sortMenuEntries()
	{
		int count = menuEntryCount - 1;

		for (int tmp, i = 0; i < count; ++i)
		{
			if (menuOpcodes[i] < 1000 && menuOpcodes[i + 1] > 1000)
			{
				String var3 = menuTargets[i];
				menuTargets[i] = menuTargets[i + 1];
				menuTargets[i + 1] = var3;

				String var4 = menuActions[i];
				menuActions[i] = menuActions[i + 1];
				menuActions[i + 1] = var4;

				tmp = menuOpcodes[i];
				menuOpcodes[i] = menuOpcodes[i + 1];
				menuOpcodes[i + 1] = tmp;

				tmp = menuArguments1[i];
				menuArguments1[i] = menuArguments1[i + 1];
				menuArguments1[i + 1] = tmp;

				tmp = menuArguments2[i];
				menuArguments2[i] = menuArguments2[i + 1];
				menuArguments2[i + 1] = tmp;

				tmp = menuIdentifiers[i];
				menuIdentifiers[i] = menuIdentifiers[i + 1];
				menuIdentifiers[i + 1] = tmp;

				boolean var6 = menuShiftClick[i];
				menuShiftClick[i] = menuShiftClick[i + 1];
				menuShiftClick[i + 1] = var6;
			}
		}
	}

	public static void sortNeeded()
	{
		if (menuOpcodes[menuEntryCount - 1] < 1000)
		{
			return;
		}

		int i = menuEntryCount - 1;
		int high = menuEntryCount - 1;
		while (menuOpcodes[high] >= 1000)
		{
			int opc = menuOpcodes[--i];
			if (opc < 1000)
			{
				menuOpcodes[i] = menuOpcodes[high];
				menuOpcodes[high] = menuOpcodes[i];

				opc = menuArguments1[i];
				menuArguments1[i] = menuArguments1[high];
				menuArguments1[high] = opc;

				opc = menuArguments2[i];
				menuArguments2[i] = menuArguments2[high];
				menuArguments2[high] = opc;

				opc = menuIdentifiers[i];
				menuIdentifiers[i] = menuIdentifiers[high];
				menuIdentifiers[high] = opc;

				String t = menuActions[i];
				menuActions[i] = menuActions[high];
				menuActions[high] = t;

				t = menuTargets[i];
				menuTargets[i] = menuTargets[high];
				menuTargets[high] = t;

				boolean var6 = menuShiftClick[i];
				menuShiftClick[i] = menuShiftClick[high];
				menuShiftClick[high] = var6;

				return;
			}
		}
	}

	public static void addMenuEntries(MenuEntry[] entries)
	{
		for (int i = 0, len = entries.length; i < len && menuEntryCount < 500; i++)
		{
			addMenuEntry(entries[i]);
		}
	}

	public static void addMenuEntry(MenuEntry entry)
	{
		menuArguments1[menuEntryCount] = entry.getActionParam0();
		menuArguments2[menuEntryCount] = entry.getActionParam1();
		menuOpcodes[menuEntryCount] = entry.getOpcode();
		menuIdentifiers[menuEntryCount] = entry.getIdentifier();
		menuActions[menuEntryCount] = entry.getOption();
		menuTargets[menuEntryCount] = entry.getTarget();
		menuShiftClick[menuEntryCount] = entry.isForceLeftClick();
		client.setMenuOptionCount(++menuEntryCount);
	}

	public static DirectMenuEntryElement findFirst(AbstractComparableEntry comparable)
	{
		DirectMenuEntryElement element = DirectMenuEntryElement.get(menuEntryCount - 1);
		while (element.hasPrevious())
		{
			if (comparable.matches(element))
			{
				return element;
			}

			element.previous();
		}

		return null;
	}

	public static boolean anyMatches(AbstractComparableEntry comparable)
	{
		DirectMenuEntryElement element = DirectMenuEntryElement.get(menuEntryCount - 1);
		while (element.hasPrevious())
		{
			if (comparable.matches(element))
			{
				return true;
			}

			element.previous();
		}

		return false;
	}

	public static void removeAll(Collection<AbstractComparableEntry> hidden)
	{
		int amtRemoved = 0;
		int[] removedIndices = new int[16];

		DirectMenuEntryElement element = DirectMenuEntryElement.get(menuEntryCount - 1);
		while (element.hasPrevious())
		{
			for (AbstractComparableEntry hid : hidden)
			{
				if (hid.matches(element))
				{
					if (removedIndices.length == amtRemoved)
					{
						int[] tmp = new int[amtRemoved << 1];
						System.arraycopy(removedIndices, 0, tmp, 0, removedIndices.length);
						removedIndices = tmp;
					}

					removedIndices[amtRemoved++] = element.getIdx();
					break;
				}
			}

			element.previous();
		}

		if (amtRemoved == 0)
		{
			return;
		}

		for (int i = 0; i < amtRemoved; i++)
		{
			int low = removedIndices[i];
			int high = i == amtRemoved - 1 ? menuEntryCount - 1 : removedIndices[i + 1];

			while (low++ < high)
			{
				element.jumpTo(low).shiftDown(i);
			}
		}

		client.setMenuOptionCount(menuEntryCount -= amtRemoved);
	}


}
