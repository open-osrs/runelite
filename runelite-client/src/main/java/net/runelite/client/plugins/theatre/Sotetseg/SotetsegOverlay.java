/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Sotetseg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Projectile;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.theatre.RoomOverlay;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.ui.overlay.OverlayLayer;

public class SotetsegOverlay extends RoomOverlay
{
	@Inject
	private Sotetseg sotetseg;

	@Inject
	protected SotetsegOverlay(TheatreConfig config)
	{
		super(config);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (sotetseg.isSotetsegActive())
		{
			if (config.sotetsegAutoAttacksTicks())
			{
				int tick = sotetseg.getSotetsegTickCount();
				if (tick >= 0)
				{
					NPC boss = sotetseg.getSotetsegNPC();
					final String ticksCounted = String.valueOf(tick);
					Point canvasPoint = boss.getCanvasTextLocation(graphics, ticksCounted, 50);
					renderTextLocation(graphics, ticksCounted, Color.WHITE, canvasPoint);
				}
			}

			if (config.sotetsegOrbAttacksTicks() || config.sotetsegBigOrbTicks())
			{
				for (Projectile p : client.getProjectiles())
				{
					int id = p.getId();

					Point point = Perspective.localToCanvas(client, new LocalPoint((int)p.getX(), (int)p.getY()), 0, Perspective.getTileHeight(client, new LocalPoint((int)p.getX(), (int)p.getY()), p.getFloor()) - (int)p.getZ());

					if (point == null)
					{
						continue;
					}

					if ((p.getInteracting() == client.getLocalPlayer()) && (id == Sotetseg.SOTETSEG_MAGE_ORB || id == Sotetseg.SOTETSEG_RANGE_ORB) && config.sotetsegOrbAttacksTicks())
					{
						renderTextLocation(graphics, (id == Sotetseg.SOTETSEG_MAGE_ORB ? "M" : "R") + (p.getRemainingCycles() / 30), (id == Sotetseg.SOTETSEG_MAGE_ORB ? Color.CYAN : Color.GREEN), point);
					}

					if (id == Sotetseg.SOTETSEG_BIG_AOE_ORB && config.sotetsegBigOrbTicks())
					{
						renderTextLocation(graphics, String.valueOf(p.getRemainingCycles() / 30), config.sotetsegBigOrbTickColor(), point);
						renderPoly(graphics, config.sotetsegBigOrbTileColor(), p.getInteracting().getCanvasTilePoly());
					}
				}
			}

			if (config.sotetsegMaze())
			{
				int counter = 1;
				for (Point p : sotetseg.getRedTiles())
				{
					WorldPoint wp = sotetseg.worldPointFromMazePoint(p);
					drawTile(graphics, wp, Color.WHITE, 1, 255, 0);
					LocalPoint lp = LocalPoint.fromWorld(client, wp);
					if (lp != null && !sotetseg.isWasInUnderWorld())
					{
						Point textPoint = Perspective.getCanvasTextLocation(client, graphics, lp, String.valueOf(counter), 0);
						if (textPoint != null)
						{
							renderTextLocation(graphics, String.valueOf(counter), Color.WHITE, textPoint);
						}
					}
					counter++;
				}

				for (Point p : sotetseg.getGreenTiles())
				{
					WorldPoint wp = sotetseg.worldPointFromMazePoint(p);
					drawTile(graphics, wp, Color.GREEN, 1, 255, 0);
				}
			}
		}
		return null;
	}
}