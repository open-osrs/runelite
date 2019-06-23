/*
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
 * Copyright (c) 2019, Ganom <https://github.com/ganom>
 * Copyright (c) 2019, Lucas <https://github.com/lucwousin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.inferno;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.widgets.Widget;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class InfernoOverlay extends Overlay
{
	private InfernoPlugin plugin;
	private Client client;
	private InfernoConfig config;

	@Inject
	InfernoOverlay(InfernoPlugin plugin, Client client, InfernoConfig config)
	{
		this.plugin = plugin;
		this.client = client;
		this.config = config;
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGHEST);
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		for (NPCContainer npc : plugin.getNpcContainer())
		{
			int ticksLeft = npc.getTicksUntilAttack();

			if (ticksLeft <= 0)
			{
				continue;
			}

			String ticksLeftStr = String.valueOf(ticksLeft);
			NPCContainer.Attackstyle attackStyle = npc.getAttackStyle();
			Color color = (ticksLeft <= 1 ? Color.WHITE : attackStyle.getColor());

			if (attackStyle.getPrayer() != null)
			{
				Widget widget = client.getWidget(attackStyle.getPrayer().getWidgetInfo());
				if (widget != null && config.showPrayerWidgetHelper())
				{
					OverlayUtil.renderWidgetToClick(graphics, widget, attackStyle.getPrayer(), color);
					OverlayUtil.renderTextLocation(graphics, ticksLeftStr, 8, config.fontStyle().getFont(),
						color, centerPoint(widget.getBounds()), config.shadows(), 0);
				}
			}

			Point canvasPoint = npc.getNpc().getCanvasTextLocation(graphics, ticksLeftStr, 0);
			OverlayUtil.renderTextLocation(graphics, ticksLeftStr, config.textSize(),
				config.fontStyle().getFont(), color, canvasPoint, config.shadows(), 0);
		}
		return null;
	}

	private Point centerPoint(Rectangle rect)
	{
		int x = (int) (rect.getX() + rect.getWidth() / 2);
		int y = (int) (rect.getY() + rect.getHeight() / 2);
		return new Point(x, y);
	}
}