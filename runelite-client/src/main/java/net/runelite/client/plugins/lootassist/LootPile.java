package net.runelite.client.plugins.lootassist;

import lombok.Getter;
import net.runelite.api.coords.LocalPoint;

public class LootPile
{
	private static final long TIME_UNTIL_VISIBLE = 120000;
	private final long timeCreated;
	@Getter
	private final long timeAppearing;
	@Getter
	private final LocalPoint location;
	@Getter
	private final String playerName;

	public LootPile(LocalPoint location, String playerName)
	{
		this.timeCreated = System.currentTimeMillis();
		this.location = location;
		this.playerName = playerName;
		this.timeAppearing = this.timeCreated + TIME_UNTIL_VISIBLE;
	}
}
