/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 *
 * Modified by farhan1666
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
package net.runelite.client.plugins.dropparty;

import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static net.runelite.client.util.ColorUtil.setAlphaComponent;

@Singleton
public class DropPartyOverlay extends Overlay
{
	private static final int FILL_START_ALPHA = 25;
	private static final int OUTLINE_START_ALPHA = 255;

	private final Client client;
	private final DropPartyPlugin plugin;

	@Inject
	public DropPartyOverlay(final Client client, final DropPartyPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		int tiles = plugin.getShowAmmount();
		if (tiles == 0)
		{
			return null;
		}
		List<WorldPoint> path = plugin.getPlayerPath();

		List<WorldPoint> markedTiles = new ArrayList<>();

		for (int i = 0; i < path.size(); i++)
		{
			if (i > plugin.getMAXPATHSIZE() || i > (plugin.getShowAmmount() - 1))
			{
				break;
			}
			if (path.get(i) != null)
			{
				LocalPoint local = LocalPoint.fromWorld(client, path.get(i));
				Polygon tilePoly = null;
				if (local != null)
				{
					tilePoly = Perspective.getCanvasTileAreaPoly(client, local, 1);
				}


				if (tilePoly != null)
				{
					final int tickProgress = i + 1;

					int fillAlpha, outlineAlpha;
					fillAlpha = FILL_START_ALPHA;
					outlineAlpha = OUTLINE_START_ALPHA;

					Color color;
					if (tickProgress == 0)
					{
						color = Color.RED;
					}
					else
					{
						color = Color.WHITE;
					}

					if (!markedTiles.contains(path.get(i)))
					{
						graphics.setColor(new Color(setAlphaComponent(plugin.getOverlayColor().getRGB(), outlineAlpha), true));
						graphics.drawPolygon(tilePoly);
						OverlayUtil.renderTextLocation(graphics, Integer.toString(tickProgress), plugin.getTextSize(),
							plugin.getFontStyle(), color, centerPoint(tilePoly.getBounds()), true, 0);
					}
					markedTiles.add(path.get(i));
				}

			}
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
