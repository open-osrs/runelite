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

package net.runelite.client.plugins.grotesqueguardians.overlay;

import com.openosrs.client.graphics.ModelOutlineRenderer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.grotesqueguardians.GrotesqueGuardiansConfig;
import net.runelite.client.plugins.grotesqueguardians.GrotesqueGuardiansPlugin;
import net.runelite.client.plugins.grotesqueguardians.entity.Dawn;
import net.runelite.client.plugins.grotesqueguardians.entity.Dusk;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class SceneOverlay extends Overlay
{
	private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

	private static final int FLASH_DURATION = 20;

	private final Client client;
	private final GrotesqueGuardiansPlugin plugin;
	private final GrotesqueGuardiansConfig config;
	private final ModelOutlineRenderer modelOutlineRenderer;

	private int flashTimeout;

	@Inject
	private SceneOverlay(final Client client, final GrotesqueGuardiansPlugin plugin, final GrotesqueGuardiansConfig config, final ModelOutlineRenderer modelOutlineRenderer)
	{
		this.client = client;
		this.plugin = plugin;
		this.config = config;
		this.modelOutlineRenderer = modelOutlineRenderer;

		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(final Graphics2D graphics2D)
	{
		final Dusk dusk = plugin.getDusk();

		final boolean gargoyleInvulnOutline = config.gargoyleInvulnOutline();
		final boolean outlineTile = config.outlineGargoyleTile();

		if (dusk != null)
		{
			if (config.duskTickCounter())
			{
				renderDuskTickCounter(graphics2D, dusk);
			}

			if (outlineTile)
			{
				renderTileOutline(graphics2D, dusk.getNpc());
			}

			if (gargoyleInvulnOutline && dusk.getPhase() == null)
			{
				renderInvulnerabilityOutline(dusk.getNpc());
			}
		}

		final Dawn dawn = plugin.getDawn();

		if (dawn != null)
		{
			if (outlineTile)
			{
				renderTileOutline(graphics2D, dawn.getNpc());
			}

			if (gargoyleInvulnOutline && dawn.getPhase() == null)
			{
				renderInvulnerabilityOutline(dawn.getNpc());
			}
		}

		if (config.outlineGraphicsObjects())
		{
			renderGraphicsObjectsOutline(graphics2D);
		}

		if (config.flashOnDanger() && plugin.isFlashOnDanger())
		{
			renderFlashOnDanger(graphics2D);
		}

		return null;
	}

	private void renderDuskTickCounter(final Graphics2D graphics2D, final Dusk dusk)
	{
		final int ticksUntilNextAttack = dusk.getTicksUntilNextAttack();

		if (ticksUntilNextAttack == 0)
		{
			return;
		}

		final NPC npc = dusk.getNpc();

		if (npc.isDead())
		{
			return;
		}

		final String text = String.valueOf(ticksUntilNextAttack);

		final Point npcPoint = npc.getCanvasTextLocation(graphics2D, text, 0);

		if (npcPoint == null)
		{
			return;
		}

		final Font originalFont = graphics2D.getFont();

		graphics2D.setFont(new Font(Font.SANS_SERIF, config.duskFontStyle().getFont(), config.duskFontSize()));

		OverlayUtil.renderTextLocation(graphics2D, npcPoint, text, ticksUntilNextAttack == 1 ? Color.WHITE : config.duskFontColor());

		graphics2D.setFont(originalFont);
	}

	private void renderTileOutline(final Graphics2D graphics2D, final NPC npc)
	{
		final NPCComposition npcDefinition = npc.getComposition();

		if (npcDefinition == null)
		{
			return;
		}

		final Polygon polygon = Perspective.getCanvasTileAreaPoly(client, npc.getLocalLocation(),
			npcDefinition.getSize());

		if (polygon == null)
		{
			return;
		}

		drawOutlineAndFill(graphics2D, config.tileOutlineColor(), config.tileOutlineWidth(), polygon);
	}

	private void renderGraphicsObjectsOutline(final Graphics2D graphics2D)
	{
		for (final GraphicsObject graphicsObject : client.getGraphicsObjects())
		{
			if (!GrotesqueGuardiansPlugin.isValidGraphicsObject(graphicsObject))
			{
				continue;
			}

			final LocalPoint localPoint = graphicsObject.getLocation();

			if (localPoint == null)
			{
				return;
			}

			final Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon == null)
			{
				return;
			}

			drawOutlineAndFill(graphics2D, config.graphicsObjectsOutlineColor(), config.graphicsObjectsOutlineWidth(), polygon);
		}
	}

	private void renderInvulnerabilityOutline(final NPC npc)
	{
		modelOutlineRenderer.drawOutline(npc, config.gargoyleInvulnOutlineWidth(), config.gargoyleInvulnOutlineColor(), TRANSPARENT);
	}

	private void renderFlashOnDanger(final Graphics2D graphics2D)
	{
		final Color originalColor = graphics2D.getColor();

		graphics2D.setColor(config.flashColor());

		graphics2D.fill(client.getCanvas().getBounds());

		graphics2D.setColor(originalColor);

		if (++flashTimeout >= FLASH_DURATION)
		{
			flashTimeout = 0;
			plugin.setFlashOnDanger(false);
		}
	}

	private static void drawOutlineAndFill(final Graphics2D graphics2D, final Color outlineColor, final float strokeWidth, final Shape shape)
	{
		final Color originalColor = graphics2D.getColor();
		final Stroke originalStroke = graphics2D.getStroke();

		graphics2D.setStroke(new BasicStroke(strokeWidth));
		graphics2D.setColor(outlineColor);
		graphics2D.draw(shape);

		graphics2D.setColor(SceneOverlay.TRANSPARENT);
		graphics2D.fill(shape);

		graphics2D.setColor(originalColor);
		graphics2D.setStroke(originalStroke);
	}
}
