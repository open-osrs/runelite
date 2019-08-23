package net.runelite.client.plugins.sulliusceps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ItemID;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class SulliuscepSession
{
	@Getter(AccessLevel.PACKAGE)
	private int mushroomsFound;

	@Getter(AccessLevel.PACKAGE)
	private int mortMyreFungusFound;

	@Getter(AccessLevel.PACKAGE)
	private int sulliuscepCapsFound;

	void updateFungiFound(int item, int count)
	{
		switch (item)
		{
			case ItemID.MUSHROOM:
				mushroomsFound += count;
				break;
			case ItemID.MORT_MYRE_FUNGUS:
				mortMyreFungusFound += count;
				break;
			case ItemID.SULLIUSCEP_CAP:
				sulliuscepCapsFound += count;
				break;
			default:
				// Numulite, Clue Nests and various Fossils.
				break;
		}
	}
}
