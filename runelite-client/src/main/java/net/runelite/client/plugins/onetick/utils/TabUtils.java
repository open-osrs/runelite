package net.runelite.client.plugins.onetick.utils;

import net.runelite.api.Client;

public class TabUtils
{
	private static int[] tabs = new int[Tab.values().length];

	static
	{
		tabs[Tab.LOGOUT.ordinal()] = 1;
		tabs[Tab.FRIENDS.ordinal()] = 2;
		tabs[Tab.IGNORES.ordinal()] = 3;
		tabs[Tab.CLANCHAT.ordinal()] = 4;
		tabs[Tab.ACCOUNT_MANAGEMENT.ordinal()] = 5;
		tabs[Tab.SETTINGS.ordinal()] = 6;
		tabs[Tab.EMOTES.ordinal()] = 7;
		tabs[Tab.MUSIC.ordinal()] = 8;
		tabs[Tab.ATTACK.ordinal()] = 9;
		tabs[Tab.MAGIC.ordinal()] = 10;
		tabs[Tab.SKILLS.ordinal()] = 11;
		tabs[Tab.QUEST.ordinal()] = 12;
		tabs[Tab.INVENTORY.ordinal()] = 13;
		tabs[Tab.EQUIPMENT.ordinal()] = 14;
		tabs[Tab.PRAYER.ordinal()] = 15;
	}

	public static int getTabHotkey(Tab tab, Client client)
	{
		int keyCode;
		if ((keyCode = client.getVarps()[doSomething(tab)]) < 0)
		{
			keyCode -= -2147483648;
		}

		if ((keyCode = keyCode >>> doSomethingElse(tab) & 15) == 0)
		{
			return -1;
		}
		else
		{
			return keyCode == 13 ? 27 : 112 + keyCode - 1;
		}
	}

	private static int doSomething(Tab tab)
	{
		switch (tabs[tab.ordinal()])
		{
			case 2:
			case 4:
			case 5:
			case 6:
			case 7:
			case 10:
				return 1225;
			case 3:
			case 8:
			default:
				return 1226;
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				return 1224;
		}
	}

	private static int doSomethingElse(Tab tab)
	{
		switch (tabs[tab.ordinal()])
		{
			case 1:
			case 4:
			case 11:
				return 5;
			case 2:
			case 12:
				return 10;
			case 3:
			case 7:
			default:
				return 25;
			case 5:
			case 13:
				return 15;
			case 6:
			case 14:
				return 20;
			case 8:
			case 9:
			case 10:
				return 0;
		}
	}
}