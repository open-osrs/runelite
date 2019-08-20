package net.runelite.api.menus;

/**
 * This class exists to get the data from any
 * menu entry attribute, without needing a element
 * instance to ask for it.
 * 
 * This only supports reads
 * (not sure why but that sounds like a good constraint)
 */
public class RandomAccessEntry extends MenuEntries
{
	public static int getIdentifier(int idx)
	{
		return menuIdentifiers[idx];
	}

	public static int getActionParam0(int idx)
	{
		return menuArguments1[idx];
	}

	public static int getActionParam1(int idx)
	{
		return menuArguments2[idx];
	}

	public static boolean getShiftClick(int idx)
	{
		return menuShiftClick[idx];
	}

	public static int getOpcode(int idx)
	{
		return menuOpcodes[idx];
	}

	public static String getOption(int idx)
	{
		return menuActions[idx];
	}

	public static String getTarget(int idx)
	{
		return menuTargets[idx];
	}
}
