package net.runelite.client.util;

import java.awt.Polygon;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldPoint;

public class MiscUtils
{
	private static final int[] abovePointsX = {2944, 3392, 3392, 2944};
	private static final int[] abovePointsY = {3523, 3523, 3971, 3971};
	private static final int[] belowPointsX = {2944, 2944, 3264, 3264};
	private static final int[] belowPointsY = {9918, 10360, 10360, 9918};

	private static final Polygon abovePoly = new Polygon(abovePointsX, abovePointsY, abovePointsX.length);
	private static final Polygon belowPoly = new Polygon(belowPointsX, belowPointsY, belowPointsX.length);

	private static final ChronoUnit[] ORDERED_CHRONOS = new ChronoUnit[]
		{
			ChronoUnit.YEARS,
			ChronoUnit.MONTHS,
			ChronoUnit.WEEKS,
			ChronoUnit.DAYS,
			ChronoUnit.HOURS,
			ChronoUnit.MINUTES,
			ChronoUnit.SECONDS
		};

	//test replacement so private for now
	private static boolean inWildy(WorldPoint point)
	{
		if (point == null)
		{
			return false;
		}

		return abovePoly.contains(point.getX(), point.getY()) || belowPoly.contains(point.getX(), point.getY());
	}

	public static int getWildernessLevelFrom(Client client, WorldPoint point)
	{
		if (client == null)
		{
			return 0;
		}

		if (point == null)
		{
			return 0;
		}

		int x = point.getX();

		if (point.getPlane() == 0 && (x < 2940 || x > 3391))
		{
			return 0;
		}

		int y = point.getY();
		//v underground        //v above ground
		int wildernessLevel = clamp(y > 6400 ? ((y - 9920) / 8) + 1 : ((y - 3520) / 8) + 1, 0, 56);

		if (point.getPlane() > 0 && y < 9920)
		{
			wildernessLevel = 0;
		}

		if (client.getWorldType().stream().anyMatch(worldType -> worldType == WorldType.PVP || worldType == WorldType.HIGH_RISK))
		{
			wildernessLevel += 15;
		}

		return Math.max(0, wildernessLevel);
	}

	public static int clamp(int val, int min, int max)
	{
		return Math.max(min, Math.min(max, val));
	}

	public static float clamp(float val, float min, float max)
	{
		return Math.max(min, Math.min(max, val));
	}

	public static boolean inWilderness(Client client)
	{
		Player localPlayer = client.getLocalPlayer();

		if (localPlayer == null)
		{
			return false;
		}

		return inWildy(localPlayer.getWorldLocation());

		//return getWildernessLevelFrom(client, localPlayer.getWorldLocation()) > 0;
	}

	public static String formatTimeAgo(Duration dur)
	{
		long dA = 0, dB = 0, rm;
		ChronoUnit cA = null, cB = null;
		for (int i = 0; i < ORDERED_CHRONOS.length; i++)
		{
			cA = ORDERED_CHRONOS[i];
			dA = dur.getSeconds() / cA.getDuration().getSeconds();
			rm = dur.getSeconds() % cA.getDuration().getSeconds();
			if (dA <= 0)
			{
				cA = null;
				continue;
			}

			if (i + 1 < ORDERED_CHRONOS.length)
			{
				cB = ORDERED_CHRONOS[i + 1];
				dB = rm / cB.getDuration().getSeconds();

				if (dB <= 0)
				{
					cB = null;
				}
			}

			break;
		}

		if (cA == null)
		{
			return "just now.";
		}

		String str = formatUnit(cA, dA);

		if (cB != null)
		{
			str += " and " + formatUnit(cB, dB);
		}

		return str + " ago.";
	}

	private static String formatUnit(ChronoUnit chrono, long val)
	{
		boolean multiple = val != 1;
		String str;
		if (multiple)
		{
			str = val + " ";
		}
		else
		{
			str = "a" + (chrono == ChronoUnit.HOURS ? "n " : " ");
		}
		str += chrono.name().toLowerCase();
		if (!multiple)
		{
			if (str.charAt(str.length() - 1) == 's')
			{
				str = str.substring(0, str.length() - 1);
			}
		}
		else if (str.charAt(str.length() - 1) != 's')
		{
			str += "s";
		}
		return str;
	}
}
