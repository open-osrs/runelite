package net.runelite.client.plugins.mouserecorder;

import net.runelite.api.Client;
import net.runelite.api.MouseRecorder;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import java.awt.*;

public class MouseRecorderOverlay extends Overlay
{
	
	private MouseRecorderPlugin plugin;
	
	@Inject
	private Client client;
	
	@Inject
	public MouseRecorderOverlay(MouseRecorderPlugin plugin)
	{
		this.plugin = plugin;
		setPriority(OverlayPriority.HIGHEST);
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
	}
	
	@Override
	public Dimension render(Graphics2D graphics)
	{
		MouseRecorder mR = client.getMouseRecorder();
		int idx = 0;
		for(int x : mR.getXs())
		{
			int y = mR.getYs()[idx];
			if(x < 1 && y < 1)
			{
				return null;
			}
			Point topLeft = new Point(x - 3, y - 3);
			Point bottomLeft = new Point(x - 3, y + 3);
			Point topRight = new Point(x + 3, y - 3);
			Point bottomRight = new Point(x + 3, y + 3);
			graphics.setColor(Color.RED);
			graphics.drawLine(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
			graphics.drawLine(bottomLeft.x, bottomLeft.y, topRight.x, topRight.y);
			idx++;
		}
		return null;
	}
}
