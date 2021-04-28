/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
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

package net.runelite.client.plugins.kalphitequeen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcID;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

@Singleton
class KQSceneOverlay extends Overlay
{
	private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

	private final KQPlugin plugin;
	private final KQConfig config;
	private final Client client;

	private int flashTimeout;

	@Inject
	KQSceneOverlay(final KQPlugin plugin, final KQConfig config, final Client client)
	{
		this.plugin = plugin;
		this.config = config;
		this.client = client;

		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(final Graphics2D graphics2D)
	{
		renderKqTickCount(graphics2D);
		renderKqTile(graphics2D);
		renderFlashVeng(graphics2D);

		return null;
	}

	private void renderKqTickCount(final Graphics2D graphics2D)
	{
		final KQNpc kalphiteQueen = plugin.getKalphiteQueen();

		if (!config.kqTickCounter() || kalphiteQueen == null)
		{
			return;
		}

		final NPC npc = kalphiteQueen.getNpc();

		final int ticksUntilNextAnimation = kalphiteQueen.getTicksUntilNextAnimation();

		if (npc == null || (npc.getId() == NpcID.KALPHITE_QUEEN_963 && npc.isDead()) || ticksUntilNextAnimation <= 0)
		{
			return;
		}

		final String text = String.valueOf(ticksUntilNextAnimation);

		final Point npcPoint = npc.getCanvasTextLocation(graphics2D, text, 0);

		if (npcPoint == null)
		{
			return;
		}

		final Font originalFont = graphics2D.getFont();

		graphics2D.setFont(new Font(Font.SANS_SERIF, config.kqFontStyle().getFont(), config.kqFontSize()));

		OverlayUtil.renderTextLocation(graphics2D, npcPoint, text, ticksUntilNextAnimation == 1 ? Color.WHITE : config.kqFontColor());

		graphics2D.setFont(originalFont);
	}

	private void renderKqTile(final Graphics2D graphics2D)
	{
		final KQNpc kalphiteQueen = plugin.getKalphiteQueen();

		if (!config.kqTileOutline() || kalphiteQueen == null)
		{
			return;
		}

		final NPC npc = kalphiteQueen.getNpc();

		if (npc == null || (npc.getId() == NpcID.KALPHITE_QUEEN_963 && npc.isDead()))
		{
			return;
		}

		int size = 1;

		final NPCComposition npcDefinition = npc.getTransformedComposition();

		if (npcDefinition != null)
		{
			size = npcDefinition.getSize();
		}

		final LocalPoint localPoint = npc.getLocalLocation();

		final Polygon polygon = Perspective.getCanvasTileAreaPoly(client, localPoint, size);

		if (polygon == null)
		{
			return;
		}

		drawOutlineAndFill(graphics2D, config.kqTileOutlineColor(), config.kqTileOutlineWidth(), polygon);
	}

	private void renderFlashVeng(final Graphics2D graphics2D)
	{
		if (!config.flashVeng() || !plugin.isFlashVeng() || plugin.getKalphiteQueen() == null)
		{
			return;
		}

		final Color originalColor = graphics2D.getColor();

		graphics2D.setColor(config.flashVengColor());

		graphics2D.fill(client.getCanvas().getBounds());

		graphics2D.setColor(originalColor);

		if (++flashTimeout >= config.flashVengDuration())
		{
			flashTimeout = 0;
			plugin.setFlashVeng(false);
		}
	}

	private static void drawOutlineAndFill(final Graphics2D graphics2D, final Color outlineColor, final int strokeWidth, final Shape shape)
	{
		final Color originalColor = graphics2D.getColor();
		final Stroke originalStroke = graphics2D.getStroke();

		graphics2D.setStroke(new BasicStroke(strokeWidth));
		graphics2D.setColor(outlineColor);
		graphics2D.draw(shape);

		graphics2D.setColor(TRANSPARENT);
		graphics2D.fill(shape);

		graphics2D.setColor(originalColor);
		graphics2D.setStroke(originalStroke);
	}
}
