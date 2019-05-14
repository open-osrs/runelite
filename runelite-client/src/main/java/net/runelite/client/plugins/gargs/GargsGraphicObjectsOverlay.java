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
package net.runelite.client.plugins.gargs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class GargsGraphicObjectsOverlay
        extends Overlay
{
    private final Client client;
    private final GargsPlugin plugin;
    private ArrayList<Integer> aoeGraphicsObjects;

    @Inject
    private GargsGraphicObjectsOverlay(Client client, GargsPlugin plugin, SpriteManager spriteManager)
    {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        this.client = client;
        this.plugin = plugin;
    }

    public Dimension render(Graphics2D graphics)
    {
        if (plugin.isInGargs())
        {
            aoeGraphicsObjects = new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(160), Integer.valueOf(1424), Integer.valueOf(1417), Integer.valueOf(1420), Integer.valueOf(1425), Integer.valueOf(1436), Integer.valueOf(1419), Integer.valueOf(1430),
                    Integer.valueOf(1427), Integer.valueOf(1429), Integer.valueOf(1418), Integer.valueOf(1421), Integer.valueOf(1426), Integer.valueOf(1428), Integer.valueOf(1416), Integer.valueOf(1423), Integer.valueOf(1422), Integer.valueOf(1431) }));
            List<GraphicsObject> graphicsObjects = client.getGraphicsObjects();
            for (GraphicsObject graphicsObject : graphicsObjects)
            {
                LocalPoint lp = graphicsObject.getLocation();
                if (aoeGraphicsObjects.contains(Integer.valueOf(graphicsObject.getId())))
                {
                    drawAOE(graphics, lp, Color.RED, 1);
                }
                else
                {
                    Polygon poly = Perspective.getCanvasTilePoly(client, lp);
                    OverlayUtil.renderPolygon(graphics, poly, Color.MAGENTA);
                    String infoString = "(ID: " + graphicsObject.getId() + ")";
                    Point textLocation = Perspective.getCanvasTextLocation(client, graphics, lp, infoString, 0);
                    if (textLocation != null) {
                        OverlayUtil.renderTextLocation(graphics, textLocation, infoString, Color.WHITE);
                    }
                }
            }
        }
        return null;
    }

    private void drawAOE(Graphics2D graphics, LocalPoint startTile, Color color, int offsetSize)
    {
        for (int x = -offsetSize; x <= offsetSize; x++) {
            for (int y = -offsetSize; y <= offsetSize; y++)
            {
                int xPos = startTile.getX() - x * 128;
                int yPos = startTile.getY() - y * 128;
                LocalPoint marker = new LocalPoint(xPos, yPos);
                Polygon poly = Perspective.getCanvasTilePoly(client, marker);
                OverlayUtil.renderPolygon(graphics, poly, color);
            }
        }
    }
}
