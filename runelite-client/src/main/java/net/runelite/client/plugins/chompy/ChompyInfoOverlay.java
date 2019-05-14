package net.runelite.client.plugins.chompy;

import net.runelite.client.ui.overlay.components.LineComponent;
import java.awt.Graphics2D;
import java.awt.Dimension;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.game.SpriteManager;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.Overlay;

public class ChompyInfoOverlay extends Overlay
{
    private final ChompyPlugin plugin;
    private final PanelComponent panelComponent;

    private ChompyInfoOverlay(final Client client, final ChompyPlugin plugin, final SpriteManager spriteManager) {
        this.panelComponent = new PanelComponent();
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.plugin = plugin;
        this.panelComponent.setPreferredSize(new Dimension(200, 0));
    }

    @Override
    public Dimension render(final Graphics2D graphics) {
        panelComponent.getChildren().clear();
        if (plugin.isShowPlugin()) {
            panelComponent.getChildren().add(LineComponent.builder().left("Chompy Helper").build());
            panelComponent.getChildren().add(LineComponent.builder().left("").build());
            if (plugin.getChompyKillCount() == -1) {
                panelComponent.getChildren().add(LineComponent.builder().left("You must check your kill count using a bow to register your amount").build());
            }
            else {
                panelComponent.getChildren().add(LineComponent.builder().left("Chompy Kills").right(this.plugin.getChompyKillCount() + "").build());
            }
        }
        return panelComponent.render(graphics);
    }
}