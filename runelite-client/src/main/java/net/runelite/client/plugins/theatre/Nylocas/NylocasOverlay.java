/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import com.google.common.collect.ImmutableList;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.theatre.RoomOverlay;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayUtil;

public class NylocasOverlay extends RoomOverlay
{
	@Inject
	private Nylocas nylocas;

	@Inject
	protected NylocasOverlay(TheatreConfig config)
	{
		super(config);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	private final List<Point> eastSpawnNorthLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(38, 25))
			.add(new Point(34, 25))
			.add(new Point(32, 25))
			.build();
	private final List<Point> eastSpawnSouthLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(38, 24))
			.add(new Point(34, 24))
			.add(new Point(32, 24))
			.build();
	private final List<Point> southSpawnEastLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(24, 9))
			.add(new Point(24, 14))
			.add(new Point(24, 16))
			.build();
	private final List<Point> southSpawnWestLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(23, 9))
			.add(new Point(23, 14))
			.add(new Point(23, 16))
			.build();
	private final List<Point> westSpawnSouthLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(9, 24))
			.add(new Point(13, 24))
			.add(new Point(15, 24))
			.build();
	private final List<Point> westSpawnNorthLocalPoints = new ImmutableList.Builder<Point>()
			.add(new Point(9, 25))
			.add(new Point(13, 25))
			.add(new Point(15, 25))
			.build();

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (nylocas.isInstanceTimerRunning() && nylocas.inRoomRegion(TheatrePlugin.NYLOCAS_REGION) && config.nyloInstanceTimer())
		{
			Player player = client.getLocalPlayer();
			if (player != null)
			{
				Point point = player.getCanvasTextLocation(graphics, "#", player.getLogicalHeight() + 60);
				if (point != null)
				{
					renderTextLocation(graphics, String.valueOf(nylocas.getInstanceTimer()), Color.CYAN, point);
				}
			}
		}

		if (nylocas.isNyloBossAlive())
		{
			String text = "";
			if (config.nyloBossAttackTickCount() && nylocas.getNyloBossAttackTickCount() >= 0)
			{
				text += "[A] " + nylocas.getNyloBossAttackTickCount();
				if (config.nyloBossSwitchTickCount() || config.nyloBossTotalTickCount())
				{
					text += " : ";
				}
			}

			if (config.nyloBossSwitchTickCount() && nylocas.getNyloBossSwitchTickCount() >= 0)
			{
				text += "[S] " + nylocas.getNyloBossSwitchTickCount();
				if (config.nyloBossTotalTickCount() && nylocas.getNyloBossTotalTickCount() >= 0)
				{
					text += " : ";
				}
			}

			if (config.nyloBossTotalTickCount() && nylocas.getNyloBossTotalTickCount() >= 0)
			{
				text += "(" + nylocas.getNyloBossTotalTickCount() + ")";
			}

			Point canvasPoint = nylocas.getNyloBossNPC().getCanvasTextLocation(graphics, text, 50);
			renderTextLocation(graphics, text, Color.WHITE, canvasPoint);
		}

		if (nylocas.isNyloActive())
		{
			if (config.nyloWavesHelper())
			{
				String[] nylocasWave = NylocasWave.wavesHelper.get(nylocas.getNyloWave() + 1);
				if (nylocasWave != null)
				{
					String eastSpawn = nylocasWave[0];
					String southSpawn = nylocasWave[1];
					String westSpawn = nylocasWave[2];
					String[] eastSpawnSplit = eastSpawn.split("\\|");
					String[] southSpawnSplit = southSpawn.split("\\|");
					String[] westSpawnSplit = westSpawn.split("\\|");

					// more than one nylo spawning
					if (eastSpawnSplit.length > 1)
					{
						renderNyloHelperOnWalkup(graphics, eastSpawnSplit[0], eastSpawnNorthLocalPoints, "east");
						renderNyloHelperOnWalkup(graphics, eastSpawnSplit[1], eastSpawnSouthLocalPoints, "east");
					}
					// only one nylo spawning
					else
					{
						renderNyloHelperOnWalkup(graphics, eastSpawn, eastSpawnNorthLocalPoints, "east");
					}

					// more than one nylo spawning
					if (southSpawnSplit.length > 1)
					{
						renderNyloHelperOnWalkup(graphics, southSpawnSplit[0], southSpawnEastLocalPoints, "south");
						renderNyloHelperOnWalkup(graphics, southSpawnSplit[1], southSpawnWestLocalPoints, "south");
					}
					// only one nylo spawning
					else
					{
						renderNyloHelperOnWalkup(graphics, southSpawn, southSpawnEastLocalPoints, "south");
					}

					// more than one nylo spawning
					if (westSpawnSplit.length > 1)
					{
						renderNyloHelperOnWalkup(graphics, westSpawnSplit[0], westSpawnSouthLocalPoints, "west");
						renderNyloHelperOnWalkup(graphics, westSpawnSplit[1], westSpawnNorthLocalPoints, "west");
					}
					// only one nylo spawning
					else
					{
						renderNyloHelperOnWalkup(graphics, westSpawn, westSpawnSouthLocalPoints, "west");
					}
				}
			}

			if (config.nyloTicksUntilWaves() && !nylocas.isNyloBossAlive())
			{
				LocalPoint eastPoint = LocalPoint.fromWorld(client, WorldPoint.fromRegion(Objects.requireNonNull(client.getLocalPlayer()).getWorldLocation().getRegionID(), 43, 25, client.getLocalPlayer().getWorldLocation().getPlane()));
				LocalPoint southPoint = LocalPoint.fromWorld(client, WorldPoint.fromRegion(Objects.requireNonNull(client.getLocalPlayer()).getWorldLocation().getRegionID(), 25, 6, client.getLocalPlayer().getWorldLocation().getPlane()));
				LocalPoint westPoint = LocalPoint.fromWorld(client, WorldPoint.fromRegion(Objects.requireNonNull(client.getLocalPlayer()).getWorldLocation().getRegionID(), 5, 24, client.getLocalPlayer().getWorldLocation().getPlane()));

				Polygon southPoly = null;
				Polygon eastPoly = null;
				Polygon westPoly = null;

				if (southPoint != null)
				{
					southPoly = Perspective.getCanvasTileAreaPoly(client, new LocalPoint(southPoint.getX() - 64, southPoint.getY() + 64), 2);
				}
				if (eastPoint != null)
				{
					eastPoly = Perspective.getCanvasTileAreaPoly(client, new LocalPoint(eastPoint.getX() - 64, eastPoint.getY() - 64), 2);
				}
				if (westPoint != null)
				{
					westPoly = Perspective.getCanvasTileAreaPoly(client, new LocalPoint(westPoint.getX() + 64, westPoint.getY() + 64), 2);
				}

				if (eastPoly != null)
				{
					renderTextLocation(graphics, String.valueOf(nylocas.getTicksUntilNextWave()), Color.CYAN, centerPoint(eastPoly.getBounds()));
				}
				if (southPoly != null)
				{
					renderTextLocation(graphics, String.valueOf(nylocas.getTicksUntilNextWave()), Color.CYAN, centerPoint(southPoly.getBounds()));
				}
				if (westPoly != null)
				{
					renderTextLocation(graphics, String.valueOf(nylocas.getTicksUntilNextWave()), Color.CYAN, centerPoint(westPoly.getBounds()));
				}
			}

			if (config.nyloPillars())
			{
				Map<NPC, Integer> pillars = nylocas.getNylocasPillars();

				for (NPC npc : pillars.keySet())
				{
					final int health = pillars.get(npc);
					final String healthStr = health + "%";

					WorldPoint p = npc.getWorldLocation();
					LocalPoint lp = LocalPoint.fromWorld(client, p.getX() + 1, p.getY() + 1);

					final double rMod = 130.0 * health / 100.0;
					final double gMod = 255.0 * health / 100.0;
					final double bMod = 125.0 * health / 100.0;

					final Color c = new Color((int) (255 - rMod), (int) (0 + gMod), (int) (0 + bMod));

					if (lp != null)
					{
						Point canvasPoint = Perspective.localToCanvas(client, lp, client.getPlane(),
							65);
						renderTextLocation(graphics, healthStr, c, canvasPoint);
					}
				}
			}

			final Map<NPC, Integer> npcMap = nylocas.getNylocasNpcs();

			for (NPC npc : npcMap.keySet())
			{
				int npcSize = npc.getComposition().getSize();
				if (config.nyloAggressiveOverlay() && nylocas.getAggressiveNylocas().contains(npc) && !npc.isDead())
				{
					if (config.nyloAggressiveOverlayStyle() == TheatreConfig.AGGRESSIVENYLORENDERSTYLE.TILE)
					{
						LocalPoint lp = npc.getLocalLocation();
						if (lp != null)
						{
							Polygon poly = getCanvasTileAreaPoly(client, lp, npcSize, -25);
							renderPoly(graphics, Color.RED, poly, 1);
						}
					}
					else if (config.nyloAggressiveOverlayStyle() == TheatreConfig.AGGRESSIVENYLORENDERSTYLE.HULL)
					{
						Shape objectClickbox = npc.getConvexHull();
						if (objectClickbox != null)
						{
							Color color = Color.RED;
							graphics.setColor(color);
							graphics.setStroke(new BasicStroke(2));
							graphics.draw(objectClickbox);
							graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 20));
							graphics.fill(objectClickbox);
						}
					}

				}

				int ticksLeft = npcMap.get(npc);
				if (ticksLeft > -1 && ticksLeft <= config.nyloExplosionDisplayTicks())
				{
					if (config.nyloTimeAlive() && !npc.isDead())
					{
						int ticksAlive = ticksLeft;
						if (config.nyloTimeAliveCountStyle() == TheatreConfig.NYLOTIMEALIVE.COUNTUP)
						{
							ticksAlive = 52 - ticksLeft;
						}
						Point textLocation = npc.getCanvasTextLocation(graphics, String.valueOf(ticksAlive), 60);
						if (textLocation != null)
						{
							if (config.nyloExplosionOverlayStyle() == TheatreConfig.EXPLOSIVENYLORENDERSTYLE.RECOLOR_TICK
									&& config.nyloExplosions() && ticksLeft <= 6)
							{
								renderTextLocation(graphics, String.valueOf(ticksAlive), Color.RED, textLocation);
							}
							else
							{
								renderTextLocation(graphics, String.valueOf(ticksAlive), Color.WHITE, textLocation);
							}
						}
					}

					if (config.nyloExplosions() && ticksLeft <= 6)
					{
						if (config.nyloExplosionOverlayStyle() == TheatreConfig.EXPLOSIVENYLORENDERSTYLE.TILE)
						{
							LocalPoint lp = npc.getLocalLocation();
							if (lp != null)
							{
								renderPoly(graphics, Color.YELLOW, getCanvasTileAreaPoly(client, lp, npcSize, -15), 1);
							}
						}
					}
				}

				String name = npc.getName();

				if (config.nyloHighlightOverlay() && !npc.isDead())
				{
					LocalPoint lp = npc.getLocalLocation();
					if (lp != null)
					{
						if (config.getHighlightMeleeNylo() && "Nylocas Ischyros".equals(name))
						{
							renderPoly(graphics, new Color(255, 188, 188), Perspective.getCanvasTileAreaPoly(client, lp, npcSize), 1);
						}
						else if (config.getHighlightRangeNylo() && "Nylocas Toxobolos".equals(name))
						{
							renderPoly(graphics, Color.GREEN, Perspective.getCanvasTileAreaPoly(client, lp, npcSize), 1);
						}
						else if (config.getHighlightMageNylo() && "Nylocas Hagios".equals(name))
						{
							renderPoly(graphics, Color.CYAN, Perspective.getCanvasTileAreaPoly(client, lp, npcSize), 1);
						}
					}
				}
			}

			if (config.bigSplits())
			{
				nylocas.getSplitsMap().forEach((lp, ticks) ->
				{
					Polygon poly = Perspective.getCanvasTileAreaPoly(this.client, lp, 2);
					if (poly != null)
					{
						if (ticks == 1)
						{
							OverlayUtil.renderPolygon(graphics, poly, config.getBigSplitsTileColor1());
						}

						if (ticks == 2)
						{
							OverlayUtil.renderPolygon(graphics, poly, config.getBigSplitsTileColor2());
						}

						if (ticks >= 3)
						{
							OverlayUtil.renderPolygon(graphics, poly, config.getBigSplitsHighlightColor());
						}
					}

					Point textLocation = Perspective.getCanvasTextLocation(this.client, graphics, lp, "#", 0);
					if (textLocation != null)
					{
						if (ticks == 1)
						{
							OverlayUtil.renderTextLocation(graphics, textLocation, Integer.toString(ticks), config.getBigSplitsTextColor1());
						}

						if (ticks == 2)
						{
							OverlayUtil.renderTextLocation(graphics, textLocation, Integer.toString(ticks), config.getBigSplitsTextColor2());
						}

						if (ticks >= 3)
						{
							OverlayUtil.renderTextLocation(graphics, textLocation, Integer.toString(ticks), Color.WHITE);
						}
					}

				});
			}

		}
		return null;
	}

	private void renderNyloHelperOnWalkup(Graphics2D graphics, String nyloHelperString, List<Point> pointArray, String direction)
	{
		if (pointArray.isEmpty())
		{
			return;
		}
		String[] nyloSpawnSplitCsv = nyloHelperString.split("-");
		// does change colors on walkup
		if (nyloSpawnSplitCsv.length > 1)
		{
			for (int i = 0; i < nyloSpawnSplitCsv.length; i++)
			{
				drawPoly(graphics, nyloSpawnSplitCsv[i], direction, LocalPoint.fromWorld(client, WorldPoint.fromRegion(Objects.requireNonNull(client.getLocalPlayer()).getWorldLocation().getRegionID(), pointArray.get(i).getX(), pointArray.get(i).getY(), client.getLocalPlayer().getWorldLocation().getPlane())));
			}
		}
		// does not change colors on walkup
		else
		{
			if (!nyloHelperString.isBlank())

			{
				drawPoly(graphics, nyloHelperString, direction, LocalPoint.fromWorld(client, WorldPoint.fromRegion(Objects.requireNonNull(client.getLocalPlayer()).getWorldLocation().getRegionID(), pointArray.get(0).getX(), pointArray.get(0).getY(), client.getLocalPlayer().getWorldLocation().getPlane())));
			}
		}
	}

	private void drawPoly(Graphics2D graphics, String nyloType, String direction, LocalPoint localPoint)
	{
		Polygon poly = null;
		if (nyloType.equals("mage") || nyloType.equals("melee") || nyloType.equals("range"))
		{
			poly = Perspective.getCanvasTilePoly(client, localPoint);
		}
		else
		{
			LocalPoint localPointBig = null;
			switch (direction)
			{
				case "east":
					localPointBig = new LocalPoint(localPoint.getX() - 64, localPoint.getY() - 64);
					break;
				case "west":
					localPointBig = new LocalPoint(localPoint.getX() + 64, localPoint.getY() + 64);
					break;
				case "south":
					localPointBig = new LocalPoint(localPoint.getX() - 64, localPoint.getY() + 64);
					break;
			}
			if (localPointBig != null) 
			{
				poly = Perspective.getCanvasTileAreaPoly(client, localPointBig, 2);
			}
		}
		if (poly != null)
		{
			renderPolyWithFillAlpha(graphics, getColor(nyloType), poly, 2, 60);
			renderTextLocation(graphics, String.valueOf(nylocas.getNyloWave() + 1), Color.YELLOW, centerPoint(poly.getBounds()));
		}
	}

	private Point centerPoint(Rectangle rect)
	{
		int x = (int) (rect.getX() + rect.getWidth() / 2);
		int y = (int) (rect.getY() + rect.getHeight() / 2);
		return new Point(x, y);
	}

	private Color getColor(String nyloType)
	{
		if (nyloType.equalsIgnoreCase("melee"))
		{
			return Color.BLACK;
		}
		else if (nyloType.equalsIgnoreCase("range"))
		{
			return Color.GREEN;
		}
		else if (nyloType.equalsIgnoreCase("mage"))
		{
			return Color.CYAN;
		}
		return Color.BLACK;
	}
}
