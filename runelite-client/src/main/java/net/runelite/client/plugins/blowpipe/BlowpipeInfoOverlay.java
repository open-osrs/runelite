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
package net.runelite.client.plugins.blowpipe;

import net.runelite.client.ui.overlay.components.LineComponent;
import java.awt.Graphics2D;
import java.awt.Dimension;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import javax.inject.Inject;

public class BlowpipeInfoOverlay extends Overlay
{
    private final Client client;
    private final BlowpipePlugin plugin;
    private final PanelComponent panelComponent;
    private final ItemManager itemManager;
    private final int MAX_CHARGE_TOXIC_BLOWPIPE = 16383;

    @Inject
    private BlowpipeInfoOverlay(final Client client, final BlowpipePlugin plugin, final ItemManager itemManager) {
        this.panelComponent = new PanelComponent();
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.plugin = plugin;
        this.client = client;
        this.itemManager = itemManager;
        this.panelComponent.setPreferredSize(new Dimension(200, 0));
    }

    public Dimension render(final Graphics2D graphics) {
        panelComponent.getChildren().clear();
        if (plugin.isShow()) {
            panelComponent.getChildren().add(LineComponent.builder().left("Blowpipe Helper").build());
            panelComponent.getChildren().add(LineComponent.builder().build());
            final BlowpipeProjectile dartType = plugin.getCurrentDartType();
            final int dartEstimate = plugin.getCurrentDartEstimate();
            final int scaleEstimate = plugin.getCurrentScaleEstimate();
            if (dartEstimate == -1 || dartType == null) {
                panelComponent.getChildren().add(LineComponent.builder().left("You need to 'Check' your blowpipe to see this!").build());
            }
            else {
                panelComponent.getChildren().add(LineComponent.builder().left("Dart type").right(itemManager.getItemComposition(dartType.getItemId()).getName()).build());
                panelComponent.getChildren().add(LineComponent.builder().left("Estimated darts").right(dartEstimate + "").build());
                panelComponent.getChildren().add(LineComponent.builder().left("Percent full (darts)").right(String.format("%.2f", dartEstimate / 16383.0 * 100.0) + "%").build());
                panelComponent.getChildren().add(LineComponent.builder().left("Estimated scales").right(scaleEstimate + "").build());
                panelComponent.getChildren().add(LineComponent.builder().left("Percent full (scales)").right(String.format("%.2f", scaleEstimate / 16383.0 * 100.0) + "%").build());
            }
            if (plugin.getDartsInInventory() > 0) {
                panelComponent.getChildren().add(LineComponent.builder().left("In inventory").right(plugin.getDartsInInventory() + "").build());
            }
        }
        return panelComponent.render(graphics);
    }
}