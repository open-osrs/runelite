package net.runelite.client.plugins.nightmare;

import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

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

	private static final int NIGHTMARE_MUSHROOM = 37739;

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
		if (!client.isInInstancedRegion() || !plugin.isInFight()) {
			return null;
		}

		for (GraphicsObject graphicsObject : client.getGraphicsObjects()) {
			Color color;

			if (graphicsObject.getId() == NIGHTMARE_SHADOW)
			{
				color = Color.ORANGE;
			}
			else
			{
				continue;
			}

			LocalPoint lp = graphicsObject.getLocation();
			Polygon poly = Perspective.getCanvasTilePoly(client, lp);

			if (poly != null) {
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		}

		int ticksUntilNext = plugin.getTicksUntilNextAttack();
		if (plugin.isTickCounter() && ticksUntilNext > 0 && plugin.getNm() != null)
		{
			String str = Integer.toString(ticksUntilNext);

			LocalPoint lp = plugin.getNm().getLocalLocation();
			Point point = Perspective.getCanvasTextLocation(client, graphics, lp, str, 0);

			Color tickColor = Color.WHITE;

			NightmareAttack nextAttack = plugin.getPendingNightmareAttack();
			if(ticksUntilNext >= 4 && nextAttack != null) {
				tickColor = nextAttack.getTickColor();
			}

			renderTextLocation(graphics, str, 20, Font.BOLD, tickColor, point);
		}

		if (plugin.isHighlightTotems())
		{
			for (MemorizedTotem totem : plugin.getTotems().values()) {
				if (totem.getCurrentPhase().isActive())
				{
					renderNpcOverlay(graphics, totem.getNpc(), totem.getCurrentPhase().getColor());
				}
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

	private void renderNpcOverlay(Graphics2D graphics, NPC actor, Color color) {
		final Shape objectClickbox = actor.getConvexHull();
		graphics.setColor(color);
		graphics.draw(objectClickbox);
	}
}