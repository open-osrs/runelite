package net.runelite.client.plugins.lootassist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.HashMap;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class LootAssistOverlay extends Overlay
{

	private final LootPileService pileService;

	@Inject
	private LootAssistPlugin plugin;

	@Inject
	private Client client;

	public static HashMap<LocalPoint, LootPile> current = new HashMap<>();

	@Inject
	public LootAssistOverlay(LootPileService pileService)
	{
		this.pileService = pileService;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		pileService.forEachLootPile(pile ->
		{
			int x = pile.getLocation().getSceneX();
			int y = pile.getLocation().getSceneY();
			int timeRemaining = (int) ((pile.getTimeAppearing() - System.currentTimeMillis()) / 1000);
			String textOverlay = pile.getPlayerName() + ": " +  System.lineSeparator() + timeRemaining;
			if (client.getScene().getTiles()[client.getPlane()][x][y] != null)
			{
				final Polygon poly = Perspective.getCanvasTilePoly(client,
					client.getScene().getTiles()[client.getPlane()][x][y].getLocalLocation());
				if (poly != null)
				{
					Point textLoc = Perspective.getCanvasTextLocation(client, graphics, pile.getLocation(),
						textOverlay, graphics.getFontMetrics().getHeight());
					OverlayUtil.renderPolygon(graphics, poly, Color.WHITE);
					OverlayUtil.renderTextLocation(graphics, textLoc, textOverlay, Color.WHITE);
				}
			}
		});
		{

		}
		return null;
	}
}
