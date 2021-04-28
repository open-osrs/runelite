/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.util.HashMap;
import lombok.Getter;
import net.runelite.api.Point;

enum NylocasSpawnPoint
{
	WEST_NORTH(new Point(17, 25)),
	WEST_SOUTH(new Point(17, 24)),
	SOUTH_WEST(new Point(31, 9)),
	SOUTH_EAST(new Point(32, 9)),
	EAST_SOUTH(new Point(46, 24)),
	EAST_NORTH(new Point(46, 25)),
	EAST_BIG(new Point(47, 25)),
	WEST_BIG(new Point(18, 25)),
	SOUTH_BIG(new Point(32, 10));

	@Getter
	private Point point;

	@Getter
	private static final HashMap<Point, NylocasSpawnPoint> lookupMap;

	static
	{
		lookupMap = new HashMap<>();

		for (NylocasSpawnPoint v : NylocasSpawnPoint.values())
		{
			lookupMap.put(v.getPoint(), v);
		}
	}

	NylocasSpawnPoint(Point point)
	{
		this.point = point;
	}
}
