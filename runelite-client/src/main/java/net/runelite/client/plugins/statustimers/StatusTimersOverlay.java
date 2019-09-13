/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
 * Copyright (c) 2019, kyle <https://github.com/kyleeld>
 * Copyright (c) 2019, pklite <https://github.com/pklite/pklite>
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
package net.runelite.client.plugins.statustimers;

import java.awt.Color;
import static java.awt.Color.CYAN;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import static java.awt.Color.YELLOW;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

@Singleton
public class StatusTimersOverlay extends Overlay
{
	private final StatusTimers plugin;
	private final Client client;
	private final Font timerFont = FontManager.getRunescapeBoldFont().deriveFont(14.0f);

	@Inject
	public StatusTimersOverlay(final StatusTimers plugin, final Client client)
	{
		this.plugin = plugin;
		this.client = client;
		setPriority(OverlayPriority.HIGHEST);
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		plugin.getVictimMap().values().forEach((v) -> renderOverlayFor(g, v));

		return null;
	}

	private void renderOverlayFor(Graphics2D g, Victim victim)
	{
		victim.setOverlaysDrawn(0);
		final Actor actor = victim.getActor();
		if ((actor instanceof Player && !plugin.isShowPlayers())
			|| (actor instanceof NPC && !plugin.isShowNpcs())
			|| (victim.getTimerMap().isEmpty() && victim.getImmunityMap().isEmpty()))
		{
			return;
		}

		if (plugin.isFreezeTimers())
		{
			drawOverlay(g, victim, victim.getOverlaysDrawn(), TimerType.FREEZE, WHITE);
			victim.setOverlaysDrawn(victim.getOverlaysDrawn() + 1);
		}
		if (plugin.isTb())
		{
			drawOverlay(g, victim, victim.getOverlaysDrawn(), TimerType.TELEBLOCK, CYAN);
			victim.setOverlaysDrawn(victim.getOverlaysDrawn() + 1);
		}
		if (plugin.isVeng())
		{
			drawOverlay(g, victim, victim.getOverlaysDrawn(), TimerType.VENG, RED);
			victim.setOverlaysDrawn(victim.getOverlaysDrawn() + 1);
		}
	}

	private void drawOverlay(Graphics2D g, Victim victim, int overlaysDrawn, TimerType type, Color color)
	{
		final int currentTick = client.getTickCount();

		final int finishedAt;
		final BufferedImage image;

		if (victim.getTimerMap().containsKey(type))
		{
			finishedAt = victim.getTimerMap().get(type) - currentTick;
			image = type.getImage();
		}
		else if (victim.getImmunityMap().containsKey(type))
		{
			finishedAt = victim.getImmunityMap().get(type) - currentTick;
			image = type.getImmunity();
			color = YELLOW;
		}
		else
		{
			return;
		}

		final String text = Integer.toString(finishedAt);
		final Point poi = victim.getActor().getCanvasTextLocation(g, text, 0);

		if (poi == null)
		{
			return;
		}

		Point fixedPoint = new Point(poi.getX(), poi.getY());

		if (plugin.isNoImage())
		{
			switch (type)
			{
				case FREEZE:
					OverlayUtil.renderTextLocation(g, text, plugin.getTextSize(), plugin.getFontStyle().getFont(), color, fixedPoint, false, 0);
					break;
				case VENG:
					fixedPoint = new Point(poi.getX() - 20, poi.getY());
					if ((!victim.getTimerMap().containsKey(TimerType.FREEZE) || !victim.getImmunityMap().containsKey(TimerType.FREEZE))
						&& (!victim.getTimerMap().containsKey(TimerType.TELEBLOCK) || !victim.getImmunityMap().containsKey(TimerType.TELEBLOCK)))
					{
						OverlayUtil.renderTextLocation(g, text, plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.RED, poi, false, 0);
						return;
					}
					if (victim.getTimerMap().containsKey(TimerType.FREEZE))
					{
						OverlayUtil.renderTextLocation(g, text + " | ", plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.RED, fixedPoint, false, 0);
					}
					if (victim.getTimerMap().containsKey(TimerType.TELEBLOCK))
					{
						OverlayUtil.renderTextLocation(g, text + " | ", plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.RED, fixedPoint, false, 0);
					}
					break;
				case TELEBLOCK:
					fixedPoint = new Point(poi.getX() + 20, poi.getY());
					if ((!victim.getTimerMap().containsKey(TimerType.FREEZE) || !victim.getImmunityMap().containsKey(TimerType.FREEZE))
						&& (!victim.getTimerMap().containsKey(TimerType.VENG) || !victim.getImmunityMap().containsKey(TimerType.VENG)))
					{
						OverlayUtil.renderTextLocation(g, text, plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.CYAN, poi, false, 0);
						return;
					}
					if (victim.getTimerMap().containsKey(TimerType.FREEZE))
					{
						OverlayUtil.renderTextLocation(g, " | " + text, plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.CYAN, fixedPoint, false, 0);
					}
					if (victim.getTimerMap().containsKey(TimerType.VENG))
					{
						OverlayUtil.renderTextLocation(g, " | " + text, plugin.getTextSize(), plugin.getFontStyle().getFont(), Color.CYAN, fixedPoint, false, 0);
					}
					break;
			}
			return;
		}
		renderActorText(g, victim.getActor(), text, overlaysDrawn, image);
	}

	private void renderActorText(Graphics2D g, Actor actor, String text, int overlaysDrawn, BufferedImage image)
	{
		final int yOffset = (overlaysDrawn * 18);
		g.setFont(timerFont);
		g.setColor(WHITE);
		final int xOffset = plugin.getOffset();
		renderActorTextAndImage(g, actor, text, image, yOffset,
			xOffset);
	}

	private void renderImageLocation(Graphics2D graphics, Point imgLoc, BufferedImage image)
	{
		final int x = imgLoc.getX();
		final int y = imgLoc.getY();

		graphics.drawImage(image, x, y, null);
	}

	private void renderActorTextAndImage(Graphics2D graphics, Actor actor, String text, BufferedImage image, int yOffset, int xOffset)
	{
		Point textLocation = new Point(actor.getCanvasImageLocation(image, 0).getX() + xOffset, actor.getCanvasImageLocation(image, 0).getY() + yOffset);
		renderImageLocation(graphics, textLocation, image);
		xOffset = image.getWidth() + 1;
		yOffset = (image.getHeight() - (int) graphics.getFontMetrics().getStringBounds(text, graphics).getHeight());
		textLocation = new Point(textLocation.getX() + xOffset, textLocation.getY() + image.getHeight() - yOffset);
		OverlayUtil.renderTextLocation(graphics, textLocation, text, Color.WHITE);
	}
}
