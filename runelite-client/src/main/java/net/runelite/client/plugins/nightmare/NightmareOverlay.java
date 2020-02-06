package net.runelite.client.plugins.nightmare;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.nightmare.NightmarePlugin;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.TextComponent;

@Singleton
class NightmareOverlay extends Overlay
{
    private static final int NIGHTMARE_REGION_ID = 15256;
    private final Client client;
    private final NightmarePlugin plugin;

    // Nightmare's NPC IDs
    private static final int NIGHTMARE_PHASE1 = 9425;
    private static final int NIGHTMARE_PHASE2 = 9426;
    private static final int NIGHTMARE_PHASE3 = 9427;
    private static final int NIGHTMARE_PILLAR1 = 9428;
    private static final int NIGHTMARE_PILLAR2 = 9429;
    private static final int NIGHTMARE_PHASE10Z = 9432;

    // Nightmare's attack animations
    private static final int NIGHTMARE_HUSK_SPAWN = 8565;
    private static final int NIGHTMARE_CHARGE_1 = 8597;
    private static final int NIGHTMARE_SHADOW_SPAWN = 8598;
    private static final int NIGHTMARE_PRAY_SWITCH = 8599;
    private static final int NIGHTMARE_MUSHROOM = 8600;
    private static final int NIGHTMARE_QUADRANTS = 8601;
    private static final int NIGHTMARE_SLEEP_DAMAGE = 8604;
    private static final int NIGHTMARE_PARASITE_TOSS = 8605;
    private static final int NIGHTMARE_PARASITE_TOSS2 = 8606;
    private static final int NIGHTMARE_CHARGE_TELEPORT = 8607;
    private static final int NIGHTMARE_CHARGE_2 = 8609;
    private static final int NIGHTMARE_SPAWN = 8611;
    private static final int NIGHTMARE_DEATH = 8612;

    // Non-Nightmare Objects
    private static final int NIGHTMARE_WALKER_1 = 9446;
    private static final int NIGHTMARE_WALKER_2 = 9447;
    private static final int NIGHTMARE_WALKER_3 = 9448;
    private static final int NIGHTMARE_WALKER_4 = 9449;
    private static final int NIGHTMARE_WALKER_5 = 9450;
    private static final int NIGHTMARE_WALKER_6 = 9451;
    private static final int NIGHTMARE_PARASITE = 9452;
    private static final int NIGHTMARE_HUSK = 9454;
    private static final int NIGHTMARE_SHADOW = 1767;   // graphics object


    @Inject
    private NightmareOverlay(final Client client, final NightmarePlugin plugin)
    {
        this.client = client;
        this.plugin = plugin;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPriority(OverlayPriority.LOW);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (!client.isInInstancedRegion())
        {
            return null;
        }

//        if()

        // TODO: Awaiting GraphicsObjectDespawn event to be tracked to make this more efficient.
        for (GraphicsObject graphicsObject : client.getGraphicsObjects())
        {
            Color color;

//            if (graphicsObject.getId() >= GROTESQUE_GUARDIANS_LIGHTNING_START && graphicsObject.getId() <= GROTESQUE_GUARDIANS_LIGHTNING_END)
//            {
//                color = Color.ORANGE;
//            }
            //else if
            if (graphicsObject.getId() == NIGHTMARE_SHADOW)
            {
                color = Color.ORANGE;
            }
//            else if (graphicsObject.getId() == GROTESQUE_GUARDIANS_FALLING_ROCKS)
//            {
//                color = Color.YELLOW;
//            }
            else
            {
                continue;
            }

            LocalPoint lp = graphicsObject.getLocation();
            Polygon poly = Perspective.getCanvasTilePoly(client, lp);

            if (poly != null)
            {
                OverlayUtil.renderPolygon(graphics, poly, color);
            }
            if (plugin.isInFight() && plugin.getNm() != null && plugin.getNm().getLocalLocation() != null)
            {
                TextComponent textComponent = new TextComponent();
                LocalPoint nmPoint;

                nmPoint = new LocalPoint(plugin.getNm().getLocalLocation().getX() + 128 * (Objects.requireNonNull(plugin.getNm().getTransformedDefinition()).getSize() - 1) / 2, plugin.getNm().getLocalLocation().getY() + 128 * (plugin.getNm().getTransformedDefinition().getSize() - 1) / 2);
                net.runelite.api.Point nmLoc = Perspective.getCanvasTextLocation(client, graphics, nmPoint, "RUN AWAY", 500);
                if (nmLoc != null)
                {
                    textComponent.setText("RUN AWAY");
                    textComponent.setPosition(new java.awt.Point(nmLoc.getX(), nmLoc.getY()));
                    textComponent.setColor(Color.red);
                    textComponent.render(graphics);
                }
            }
        }
        return null;
    }
}