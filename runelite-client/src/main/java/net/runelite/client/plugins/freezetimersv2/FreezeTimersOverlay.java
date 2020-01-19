package net.runelite.client.plugins.freezetimersv2;

import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.util.PvPUtil;
import javax.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class FreezeTimersOverlay extends Overlay
{
	private FreezeTimersPlugin plugin;
	@Inject
	private Client client;

	@Inject
	public FreezeTimersOverlay(FreezeTimersPlugin plugin)
	{
		super();
		this.plugin = plugin;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		WorldPoint point = client.getLocalPlayer().getWorldLocation();
		drawString(g, "Hello, world! " + PvPUtil.getWildernessLevelFrom(point), 10,
			40);
		return null;
	}

	private void drawString(Graphics2D graphics2D, String string, int x, int y)
	{
		y += graphics2D.getFontMetrics().getHeight();
		graphics2D.drawString(string, x, y);
	}

}
