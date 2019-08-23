package net.runelite.client.plugins.dropparty;

import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.sf.cglib.core.Local;

import static net.runelite.client.util.ColorUtil.setAlphaComponent;

@Singleton
public class DropPartyOverlay extends Overlay {
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
            return null;
        List<WorldPoint> path = plugin.getPlayerPath();

        List<WorldPoint> markedTiles = new ArrayList<>();

        for (int i = 0; i < path.size(); i++) {
            if (i > plugin.getMAXPATHSIZE() || i > (plugin.getShowAmmount() - 1)){
                break;
            }
            if (path.get(i) != null) {
                LocalPoint local = LocalPoint.fromWorld(client, path.get(i));
                Polygon tilePoly = null;
                if (local != null) {
                    tilePoly = Perspective.getCanvasTileAreaPoly(client, local, 1);
                }


                if (tilePoly != null)
                {
                    final int tickProgress = i +1;
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


                    if (!markedTiles.contains(path.get(i))) {
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
