package net.runelite.client.plugins.zalcano;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Font;

@Slf4j
public class miniZalcanoOverlay extends Overlay
{

	private final ZalcanoPlugin plugin;
	private final ZalcanoConfig config;
	private final ZalcanoUtil util;
	private final Client client;

	@Inject
	miniZalcanoOverlay(final ZalcanoPlugin plugin, final ZalcanoConfig config, final ZalcanoUtil util, final Client client)
	{
		super(plugin);
		this.plugin = plugin;
		this.config = config;
		this.util = util;
		this.client = client;

		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!util.isInZalcanoRegion())
		{
			return null;
		}
		if (config.playerCountAtZalcano())
		{
			renderPlayerCount(graphics);
		}
		if (config.highlightMiningSpotAtMap())
		{
			renderRockToMineAtMap(graphics);
		}
		return null;
	}

	private void renderRockToMineAtMap(Graphics2D graphics)
	{
		GameObject glowingRock = util.getGlowingRock();

		if (glowingRock != null)
		{
			Point rockPoint = glowingRock.getMinimapLocation();

			if (rockPoint != null)
			{
				OverlayUtil.renderMinimapLocation(graphics, rockPoint, Color.BLUE);
				Point rockPoint1 = new Point(rockPoint.getX() + 4, rockPoint.getY());
				OverlayUtil.renderMinimapLocation(graphics, rockPoint1, Color.MAGENTA);
				Point rockPoint2 = new Point(rockPoint.getX() - 4, rockPoint.getY());
				OverlayUtil.renderMinimapLocation(graphics, rockPoint2, Color.MAGENTA);
				Point rockPoint3 = new Point(rockPoint.getX(), rockPoint.getY() + 4);
				OverlayUtil.renderMinimapLocation(graphics, rockPoint3, Color.MAGENTA);
				Point rockPoint4 = new Point(rockPoint.getX(), rockPoint.getY() - 4);
				OverlayUtil.renderMinimapLocation(graphics, rockPoint4, Color.MAGENTA);
			}
		}
	}

	private void renderPlayerCount(Graphics2D graphics)
	{
		Rectangle rect = new Rectangle(client.getCanvasWidth() / 2 - 15, 0, 40, 25);
		int[] xpoints = {rect.x, rect.x + rect.width, rect.x + rect.width, rect.x};
		int[] ypoints = {rect.y, rect.y, rect.y + rect.height, rect.y + rect.height};

		graphics.setFont(new Font("Comic Sans", Font.BOLD, 20));
		OverlayUtil.renderFilledPolygon(graphics, rect, Color.BLACK);
		String playerCount = java.lang.Integer.toString(client.getPlayers().size());
		OverlayUtil.renderTextLocation( graphics, new Point(client.getCanvasWidth() / 2, 20), playerCount, Color.WHITE);
	}


}
