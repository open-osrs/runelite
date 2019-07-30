package net.runelite.client.plugins.gauntlet;

import java.awt.Polygon;
import net.runelite.api.Client;
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Vertex;
import java.util.ArrayList;
import java.util.List;

public class GauntletUtils
{

	static final int[] MELEE_ANIMATIONS = new int[]{
		395, // Axe Slash
		401, // Axe Crush

		400, // Pick Crush
		401, // Pick Stab

		386, // Harpoon Stab
		390, // Harpoon Slash

		422, // Unarmed Punch
		423, // Unarmed Kick

		401, // Crystal Scepter
		428, // Crystal Halberd Jab & Fend
		440 // Crystal Halberd Swipe
	};

	static final int[] RANGE_ANIMATIONS = new int[]{
		426 // Crystal Bow
	};

	static final int[] MAGE_ANIMATIONS = new int[]{
		1167 // Crystal Staff
	};

	static final int[] PLAYER_ANIMATIONS = concatIntArray(MELEE_ANIMATIONS, RANGE_ANIMATIONS, MAGE_ANIMATIONS);

	static final int[] CRYSTAL_DEPOSIT = new int[]{
		36064, // Normal Mining Spot
		35975 // Corrupted Mining Spot
	};

	static final int[] PHREN_ROOTS = new int[]{
		36066, // Normal Woodcutting Spot
		35969 // Corrupted Woodcutting Spot
	};

	static final int[] FISHING_SPOTS = new int[]{
		36068, // Normal Fishing Spot
		35967 // Corrupted Fishing Spot
	};
	static final int[] GRYM_ROOTS = new int[]{
		36070, // Normal Herblore Spot
		35971 // Corrupted Herblore Spot
	};

	static final int[] LINUM_TIRINUM = new int[]{
		36072, // Normal Farming Spot
		35973, // Corrupted Farming Spot
	};

	static final int[] RESOURCE_IDS = concatIntArray(CRYSTAL_DEPOSIT, PHREN_ROOTS, FISHING_SPOTS, GRYM_ROOTS, LINUM_TIRINUM);

	static final int[] PROJECTILE_MAGIC = new int[]{1707, 1708};
	static final int[] PROJECTILE_RANGE = new int[]{1711, 1712};
	static final int[] PROJECTILE_PRAYER = new int[]{1713, 1714};

	private static final int VARP_BOSS_ROOM = 9177;
	private static final int VARP_RAID_ROOM = 9178;

	static final int BOSS_ANIMATION_LIGHTNING = 8418;

	private static final int[] TORNADO_IDS = new int[]{9025, 9039};
	static final int TORNADO_TICKS = 20;

	/**
	 * Concatenate all integers in the array into a single array.
	 *
	 * @param arrays array of int arrays
	 * @return int array
	 */
	private static int[] concatIntArray(int[]... arrays)
	{
		int length = 0;

		for (int[] array : arrays)
		{
			length += array.length;
		}

		int[] returnArray = new int[length];
		int currentIndex = 0;

		for (int[] array : arrays)
		{
			for (int value : array)
			{
				returnArray[currentIndex] = value;
				currentIndex++;
			}
		}

		return returnArray;
	}

	/**
	 * Determines whether or not an integer array contains a specific value.
	 *
	 * @param intArray int[]
	 * @param value    int
	 * @return boolean
	 */
	static boolean arrayContainsInteger(int[] intArray, int value)
	{
		for (int i : intArray)
		{
			if (i == value)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns whether or not a NPC is a tornado.
	 *
	 * @param npc NPC
	 * @return boolean
	 */
	static boolean isTornado(NPC npc)
	{
		return npc != null && arrayContainsInteger(TORNADO_IDS, npc.getId());
	}

	/**
	 * Returns whether or not a NPC is the boss.
	 *
	 * @param npc NPC
	 * @return boolean
	 */
	static boolean isBoss(NPC npc)
	{
		return npc != null && npc.getName() != null && npc.getName().matches("(Crystalline|Corrupted) Hunllef");
	}

	/**
	 * Returns whether or not the player is current in the Gauntlet.
	 *
	 * @param client Client
	 * @return boolean
	 */
	static boolean inRaid(Client client)
	{
		try
		{
			return client.getVarbitValue(client.getVarps(), VARP_RAID_ROOM) == 1;
		}
		catch (IndexOutOfBoundsException | NullPointerException ignored)
		{
			return false;
		}
	}

	/**
	 * Returns whether or not the player is currently in the boss room.
	 *
	 * @param client Client
	 * @return boolean
	 */
	static boolean inBoss(Client client)
	{
		try
		{
			return client.getVarbitValue(client.getVarps(), VARP_BOSS_ROOM) == 1;
		}
		catch (IndexOutOfBoundsException | NullPointerException ignored)
		{
			return false;
		}
	}

	static Polygon boundProjectile(Client client, Projectile p)
	{
		if (p == null || p.getModel() == null)
		{
			return null;
		}

		Model model = p.getModel();
		LocalPoint point = new LocalPoint((int) p.getX(), (int) p.getY());
		int tileHeight = Perspective.getTileHeight(client, point, client.getPlane());

		double angle = Math.atan(p.getVelocityY() / p.getVelocityX());
		angle = Math.toDegrees(angle) + (p.getVelocityX() < 0 ? 180 : 0);
		angle = angle < 0 ? angle + 360 : angle;
		angle = 360 - angle - 90;

		double ori = angle * (512d / 90d);
		ori = ori < 0 ? ori + 2048 : ori;

		int orientation = (int) Math.round(ori);

		List<Vertex> vertices = model.getVertices();
		for (int i = 0; i < vertices.size(); ++i)
		{
			vertices.set(i, vertices.get(i).rotate(orientation));
		}

		List<Point> list = new ArrayList<>();

		for (Vertex vertex : vertices)
		{
			final Point localToCanvas = Perspective.localToCanvas(client, point.getX() - vertex.getX(), point.getY() - vertex.getZ(), tileHeight + vertex.getY() + (int) p.getZ());
			if (localToCanvas != null)
			{
				list.add(localToCanvas);
			}
		}

		final List<Point> convexHull = Jarvis.convexHull(list);
		if (convexHull == null)
		{
			return null;
		}

		final Polygon polygon = new Polygon();
		for (final Point hullPoint : convexHull)
		{
			polygon.addPoint(hullPoint.getX(), hullPoint.getY());
		}

		return polygon;
	}
}
