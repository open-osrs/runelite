/*
 * Copyright (c) 2019, https://openosrs.com
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
package net.runelite.client.plugins.bloodrunes;

import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.client.graphics.ModelOutlineRenderer;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;


public class RunestoneOverlay extends Overlay
{

    private final Client client;
    private final BloodRunesPlugin plugin;
    private final ModelOutlineRenderer outlineRenderer;

    @Inject
    private RunestoneOverlay(final Client client, final BloodRunesPlugin plugin, final ModelOutlineRenderer outlineRenderer)
    {
        super(plugin);
        setPosition(OverlayPosition.TOP_RIGHT);
        this.outlineRenderer = outlineRenderer;
        this.client = client;
        this.plugin = plugin;
        setPosition(OverlayPosition.DYNAMIC);
        setPriority(OverlayPriority.LOW);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    @Override
    public Dimension render(Graphics2D graphics) {

        GameObject north = plugin.getRunestoneNorth();
        GameObject south = plugin.getRunestoneSouth();

        if(north == null || south == null) {
            return null;
        }

        if(plugin.isChipping()) {
            renderRunestoneOverlay(graphics, north, Color.YELLOW);
            renderRunestoneOverlay(graphics, south, Color.YELLOW);
            return null;
        }

        if(plugin.isMineable(Runestones.NORTH)) {
            renderRunestoneOverlay(graphics, north, Color.GREEN);
        } else {
            renderRunestoneOverlay(graphics, north, Color.RED);
        }

        if(plugin.isMineable(Runestones.SOUTH)) {
            renderRunestoneOverlay(graphics, south, Color.GREEN);
        } else {
            renderRunestoneOverlay(graphics, south, Color.RED);
        }


        return null;
    }

    private void renderRunestoneOverlay(Graphics2D graphics2D, GameObject object, Color color) {
        OverlayUtil.renderPolygon(graphics2D, object.getConvexHull(), color);
    }
}
