package net.runelite.client.plugins.menuentryswapper.util;

public enum HopToMode
{
	NONE("None"),
	CLANCHAT("Clan Chat"),
	FRIENDSLIST("Friends List"),
	BOTH("Both");


	private final String name;

	HopToMode(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
