/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.util.HashMap;
import lombok.Getter;

enum NylocasType
{
	MELEE_SMALL(8342, 8348),
	MELEE_BIG(8345, 8351),
	RANGE_SMALL(8343, 8349),
	RANGE_BIG(8346, 8352),
	MAGE_SMALL(8344, 8350),
	MAGE_BIG(8347, 8353);

	@Getter
	private int id;

	@Getter
	private int aggroId;

	@Getter
	private static final HashMap<Integer, NylocasType> lookupMap;

	static
	{
		lookupMap = new HashMap<>();

		for (NylocasType v : NylocasType.values())
		{
			lookupMap.put(v.getId(), v);
			lookupMap.put(v.getAggroId(), v);
		}
	}

	NylocasType(int id, int aggroId)
	{
		this.id = id;
		this.aggroId = aggroId;
	}
}
