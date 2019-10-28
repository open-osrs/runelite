/*
 * Copyright (c) 2019, whs
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
package net.runelite.client.plugins.thieving;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ConfigChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.ProgressPieComponent;

@Singleton
class ChestOverlay extends Overlay
{
	private final Client client;
	private final List<ChestRespawn> respawns;
	private final ThievingConfig config;
	private final EventBus eventBus;

	private Color pieFillColor;
	private Color pieBorderColor;
	private boolean respawnPieInverted;
	private int respawnPieDiameter;

	@Inject
	private ChestOverlay(final Client client, final ThievingPlugin plugin, final ThievingConfig config, final EventBus eventBus)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.respawns = plugin.getRespawns();
		this.client = client;
		this.config = config;
		this.eventBus = eventBus;

		this.eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
	}

	private void onConfigChanged(ConfigChanged event)
	{
		pieFillColor = config.respawnColor();
		pieBorderColor = pieFillColor.darker();
		respawnPieInverted = config.respawnPieInverted();
		respawnPieDiameter = config.respawnPieDiameter();
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (respawns.isEmpty())
		{
			return null;
		}

		Instant now = Instant.now();
		for (Iterator<ChestRespawn> it = respawns.iterator(); it.hasNext(); )
		{
			ChestRespawn chestRespawn = it.next();

			if (chestRespawn.getWorld() != client.getWorld())
			{
				continue;
			}

			float percent = (now.toEpochMilli() - chestRespawn.getStartTime().toEpochMilli()) / (float) chestRespawn.getRespawnTime();
			if (percent > 1.0f)
			{
				it.remove();
				continue;
			}
			WorldPoint worldPoint = chestRespawn.getWorldPoint();
			LocalPoint loc = LocalPoint.fromWorld(client, worldPoint);
			if (loc == null)
			{
				continue;
			}

			Point point = Perspective.localToCanvas(client, loc, client.getPlane(), 0);
			if (point == null)
			{
				continue;
			}

			if (respawnPieInverted)
			{
				percent = 1.0f - percent;
			}

			ProgressPieComponent ppc = new ProgressPieComponent();
			ppc.setDiameter(respawnPieDiameter);
			ppc.setBorderColor(pieBorderColor);
			ppc.setFill(pieFillColor);
			ppc.setPosition(point);
			ppc.setProgress(percent);
			ppc.render(graphics);
		}
		return null;
	}
}
