/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/

package net.runelite.client.plugins.reportbutton;

import java.awt.Dimension;
import java.awt.Graphics2D;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;

public class ReportButtonOverlay extends Overlay
{

	private final ReportButtonPlugin plugin;
	private final Client client;

	public ReportButtonOverlay(ReportButtonPlugin plugin, Client client)
	{
		this.client = client;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.isShouldRender())
		{
			final Widget widget = client.getWidget(WidgetInfo.CHATBOX_REPORT_TEXT);
			widget.setText(plugin.reportButtonTime());
		}
		return null;
	}
}
