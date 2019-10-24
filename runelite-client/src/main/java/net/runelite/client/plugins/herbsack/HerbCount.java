package net.runelite.client.plugins.herbsack;

import net.runelite.api.Item;

public class HerbCount
{
	public Item item;
	public int count;

	public HerbCount(Item item, int count)
	{
		this.item = item;
		this.count = count;
	}

	public String toString()
	{
		return item.toString() + " " + count;
	}
}
