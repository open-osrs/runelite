/*
 * Copyright (c) 2017, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.ui.overlay.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.runelite.client.ui.overlay.RenderableEntity;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class BackgroundComponent implements RenderableEntity
{
	private static final int BORDER_OFFSET = 2;
	private static final float COLOR_OFFSET = 0.2f;
	private static final float OUTER_COLOR_OFFSET = 1 - COLOR_OFFSET;
	private static final float INNER_COLOR_OFFSET = 1 + COLOR_OFFSET;
	private static final float ALPHA_COLOR_OFFSET = 1 + 2 * COLOR_OFFSET;

	private Color backgroundColor = ComponentConstants.STANDARD_BACKGROUND_COLOR;
	private Rectangle rectangle = new Rectangle();
	private boolean fill = true;

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Color outsideStrokeColor = new Color(
			(int) (backgroundColor.getRed() * OUTER_COLOR_OFFSET),
			(int) (backgroundColor.getGreen() * OUTER_COLOR_OFFSET),
			(int) (backgroundColor.getBlue() * OUTER_COLOR_OFFSET),
			Math.min(255, (int) (backgroundColor.getAlpha() * ALPHA_COLOR_OFFSET))
		);

		Color insideStrokeColor = new Color(
			Math.min(255, (int) (backgroundColor.getRed() * INNER_COLOR_OFFSET)),
			Math.min(255, (int) (backgroundColor.getGreen() * INNER_COLOR_OFFSET)),
			Math.min(255, (int) (backgroundColor.getBlue() * INNER_COLOR_OFFSET)),
			Math.min(255, (int) (backgroundColor.getAlpha() * ALPHA_COLOR_OFFSET))
		);

		// Render background
		if (fill)
		{
			graphics.setColor(backgroundColor);
			graphics.fill(rectangle);
		}

		// Render outside stroke
		final Rectangle outsideStroke = new Rectangle();
		outsideStroke.setLocation(rectangle.x, rectangle.y);
		outsideStroke.setSize(rectangle.width - BORDER_OFFSET / 2, rectangle.height - BORDER_OFFSET / 2);
		graphics.setColor(outsideStrokeColor);
		graphics.draw(outsideStroke);

		// Render inside stroke
		final Rectangle insideStroke = new Rectangle();
		insideStroke.setLocation(rectangle.x + BORDER_OFFSET / 2, rectangle.y + BORDER_OFFSET / 2);
		insideStroke.setSize(rectangle.width - BORDER_OFFSET - BORDER_OFFSET / 2,
				rectangle.height - BORDER_OFFSET - BORDER_OFFSET / 2);
		graphics.setColor(insideStrokeColor);
		graphics.draw(insideStroke);

		return new Dimension(rectangle.getSize());
	}
}
