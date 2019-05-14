package net.runelite.client.plugins.gargs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.TextComponent;

public class GargsTextOverlay
        extends Overlay
{
    private final Client client;
    private final GargsPlugin plugin;

    @Inject
    private GargsTextOverlay(Client client, GargsPlugin plugin, SpriteManager spriteManager)
    {
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        this.client = client;
        this.plugin = plugin;
    }

    public Dimension render(Graphics2D graphics)
    {
        if ((plugin.isInGargs()) && (plugin.isNeedingToRun())) {
            if ((plugin.getDusk() != null) && (plugin.getDusk().getLocalLocation() != null))
            {
                TextComponent textComponent = new TextComponent();
                LocalPoint duskPoint;

                duskPoint = new LocalPoint(plugin.getDusk().getLocalLocation().getX() + 128 * (plugin.getDusk().getTransformedComposition().getSize() - 1) / 2, plugin.getDusk().getLocalLocation().getY() + 128 * (plugin.getDusk().getTransformedComposition().getSize() - 1) / 2);
                net.runelite.api.Point duskLoc = Perspective.getCanvasTextLocation(client, graphics, duskPoint, "RUN AWAY", 500);
                if (duskLoc != null)
                {
                    textComponent.setText("RUN AWAY");
                    textComponent.setPosition(new java.awt.Point(duskLoc.getX(), duskLoc.getY()));
                    textComponent.setColor(Color.red);
                    textComponent.render(graphics);
                }
            }
        }
        return null;
    }
}
