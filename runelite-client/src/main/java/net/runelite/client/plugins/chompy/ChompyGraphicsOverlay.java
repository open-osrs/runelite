/*
 * Copyright (c) 2018, https://runelitepl.us
 * Copyright (c) 2018, https://github.com/runeliteplusplus
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
package net.runelite.client.plugins.chompy;

import java.awt.Polygon;
import java.util.Iterator;
import java.util.ArrayList;
import net.runelite.client.ui.overlay.OverlayUtil;
import java.awt.Color;
import net.runelite.api.Perspective;
import net.runelite.api.NPC;
import java.awt.Dimension;
import java.awt.Graphics2D;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.game.SpriteManager;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import javax.inject.Inject;

public class ChompyGraphicsOverlay extends Overlay
{
    private final Client client;
    private final ChompyPlugin plugin;

    @Inject
    private ChompyGraphicsOverlay(final Client client, final ChompyPlugin plugin, final SpriteManager spriteManager) {
        this.setPosition(OverlayPosition.DYNAMIC);
        this.plugin = plugin;
        this.client = client;
    }

    public Dimension render(final Graphics2D graphics) {
        if (plugin.isShowPlugin()) {
            final ArrayList<NPC> liveToads = plugin.getLiveToads();
            for (final NPC npc : liveToads) {
                if (npc != null) {
                    final int size = 1;
                    final Polygon poly = Perspective.getCanvasTileAreaPoly(client, npc.getLocalLocation(), size);
                    OverlayUtil.renderPolygon(graphics, poly, Color.GREEN);
                }
            }
            final ArrayList<NPC> laidToads = plugin.getLaidToads();
            for (final NPC npc2 : laidToads) {
                if (npc2 != null) {
                    final int size2 = 1;
                    final Polygon poly2 = Perspective.getCanvasTileAreaPoly(client, npc2.getLocalLocation(), size2);
                    OverlayUtil.renderPolygon(graphics, poly2, Color.RED);
                }
            }
            final ArrayList<NPC> liveChompies = plugin.getLiveChompies();
            for (final NPC npc3 : liveChompies) {
                if (npc3 != null) {
                    final int size3 = 1;
                    final Polygon poly3 = Perspective.getCanvasTileAreaPoly(client, npc3.getLocalLocation(), size3);
                    OverlayUtil.renderPolygon(graphics, poly3, Color.CYAN);
                }
            }
        }
        return null;
    }
}