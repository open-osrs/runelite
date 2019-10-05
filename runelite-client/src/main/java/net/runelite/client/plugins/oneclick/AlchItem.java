package net.runelite.client.plugins.oneclick;

import lombok.Getter;

@Getter
class AlchItem
{
	private String name;
	private int id;

	AlchItem(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
