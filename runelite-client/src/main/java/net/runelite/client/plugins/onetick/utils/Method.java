package net.runelite.client.plugins.onetick.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Method
{
	PRAYER("Prayer"),
	ENCHANT_BOLTS("Enchant Bolts"),
	MAKE_BOLTS("Make Bolts"),
	KARAMBWAN("Karambwan");

	private String name;

	@Override
	public String toString()
	{
		return getName();
	}
}
