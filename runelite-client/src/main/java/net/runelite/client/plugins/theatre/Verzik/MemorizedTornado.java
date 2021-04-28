package net.runelite.client.plugins.theatre.Verzik;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

@Getter(AccessLevel.PACKAGE)
public class MemorizedTornado
{
	@Getter(AccessLevel.PACKAGE)
	private NPC npc;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private WorldPoint lastPosition;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private WorldPoint currentPosition;

	MemorizedTornado(final NPC npc)
	{
		this.npc = npc;
		lastPosition = null;
		currentPosition = null;
	}

	public int getRelativeDelta(WorldPoint pt)
	{
		// If the tornado has recently spawned and does not have it's position loaded, return -1.
		// If the last position is equal to the current position, it hasn't moved yet, return -1.
		if (currentPosition == null || lastPosition == null || lastPosition.distanceTo(currentPosition) == 0)
		{
			return -1;
		}

		return pt.distanceTo(currentPosition) - pt.distanceTo(lastPosition);
	}
}
