package net.runelite.client.plugins.freezetimersv2;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class FreezeTimersOverlay extends Overlay
{
	private FreezeTimersPlugin plugin;

	@Inject
	public FreezeTimersOverlay(FreezeTimersPlugin plugin)
	{
		super();
		this.plugin = plugin;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		graphics.drawString("Hello, world!", 10, 10);
		return null;
	}
}
