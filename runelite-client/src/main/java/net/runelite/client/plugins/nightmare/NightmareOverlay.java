package net.runelite.client.plugins.nightmare;

import net.runelite.api.Point;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.*;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Font;

@Singleton
class NightmareOverlay extends Overlay {
	private static final int NIGHTMARE_REGION_ID = 15256;
	private final Client client;
	private final NightmarePlugin plugin;

	// Nightmare's NPC IDs
	private static final int NIGHTMARE_PHASE1 = 9425;
	private static final int NIGHTMARE_PHASE2 = 9426;
	private static final int NIGHTMARE_PHASE3 = 9427;
	private static final int NIGHTMARE_PILLAR1 = 9428;
	private static final int NIGHTMARE_PILLAR2 = 9429;
	private static final int NIGHTMARE_PHASE10Z = 9432;


	// Non-Nightmare Objects
	private static final int NIGHTMARE_WALKER_1 = 9446;
	private static final int NIGHTMARE_WALKER_2 = 9447;
	private static final int NIGHTMARE_WALKER_3 = 9448;
	private static final int NIGHTMARE_WALKER_4 = 9449;
	private static final int NIGHTMARE_WALKER_5 = 9450;
	private static final int NIGHTMARE_WALKER_6 = 9451;
	private static final int NIGHTMARE_PARASITE = 9452;
	private static final int NIGHTMARE_HUSK = 9454;
	private static final int NIGHTMARE_SHADOW = 1767;   // graphics object

	private static final int NM_PRE_REGION = 15256;


	@Inject
	private NightmareOverlay(final Client client, final NightmarePlugin plugin) {
		this.client = client;
		this.plugin = plugin;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPriority(OverlayPriority.LOW);
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		if (!client.isInInstancedRegion()) {
			return null;
		}

		for (GraphicsObject graphicsObject : client.getGraphicsObjects()) {
			Color color;

			if (graphicsObject.getId() == NIGHTMARE_SHADOW) {
				color = Color.ORANGE;
			}
			else {
				continue;
			}

			LocalPoint lp = graphicsObject.getLocation();
			Polygon poly = Perspective.getCanvasTilePoly(client, lp);

			if (poly != null) {
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		}
		return null;
	}

	protected void renderTextLocation(Graphics2D graphics, String txtString, int fontSize, int fontStyle, Color fontColor, Point canvasPoint)
	{
		graphics.setFont(new Font("Arial", fontStyle, fontSize));
		if (canvasPoint != null)
		{
			final Point canvasCenterPoint = new Point(canvasPoint.getX(), canvasPoint.getY());
			final Point canvasCenterPointShadow = new Point(canvasPoint.getX() + 1, canvasPoint.getY() + 1);

			OverlayUtil.renderTextLocation(graphics, canvasCenterPointShadow, txtString, Color.BLACK);
			OverlayUtil.renderTextLocation(graphics, canvasCenterPoint, txtString, fontColor);
		}
	}
}