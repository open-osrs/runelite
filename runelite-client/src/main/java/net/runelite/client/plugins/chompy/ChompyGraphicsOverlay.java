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

public class ChompyGraphicsOverlay extends Overlay
{
    private final Client client;
    private final ChompyPlugin plugin;

    private ChompyGraphicsOverlay(final Client client, final ChompyPlugin plugin, final SpriteManager spriteManager) {
        this.setPosition(OverlayPosition.DYNAMIC);
        this.plugin = plugin;
        this.client = client;
    }

    @Override
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