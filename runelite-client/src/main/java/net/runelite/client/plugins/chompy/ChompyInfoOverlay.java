package net.runelite.client.plugins.chompy;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.LineComponent.LineComponentBuilder;
import net.runelite.client.ui.overlay.components.PanelComponent;

public class ChompyInfoOverlay
        extends Overlay
{
    private final ChompyPlugin plugin;
    private final PanelComponent panelComponent = new PanelComponent();

    @Inject
    private ChompyInfoOverlay(Client client, ChompyPlugin plugin, SpriteManager spriteManager)
    {
        setPosition(OverlayPosition.TOP_LEFT);
        this.plugin = plugin;
        this.panelComponent.setPreferredSize(new Dimension(200, 0));
    }

    public Dimension render(Graphics2D graphics)
    {
        panelComponent.getChildren().clear();
        if (plugin.isShowPlugin())
        {
            panelComponent.getChildren().add(LineComponent.builder().left("Chompy Helper").build());
            panelComponent.getChildren().add(LineComponent.builder().left("").build());
            if (plugin.getChompyKillCount() == -1) {
                panelComponent.getChildren().add(LineComponent.builder()
                        .left("You must check your kill count using a bow to register your amount").build());
            } else {
                panelComponent.getChildren().add(
                        LineComponent.builder().left("Chompy Kills").right(this.plugin.getChompyKillCount() + "").build());
            }
        }
        return panelComponent.render(graphics);
    }
}
