/*
 * Copyright (c) 2018, https://runelitepl.us
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
package net.runelite.client.plugins.hydra;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.inject.Inject;

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.components.ComponentConstants;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static net.runelite.client.ui.overlay.OverlayManager.OPTION_CONFIGURE;

public class HydraIndicatorOverlay extends Overlay {
    private final HydraConfig config;
    private final HydraPlugin plugin;

    private final PanelComponent panelComponent = new PanelComponent();

    @Inject
    private HydraIndicatorOverlay(HydraConfig config, HydraPlugin plugin) {
        this.config = config;
        this.plugin = plugin;
        setPosition(OverlayPosition.BOTTOM_RIGHT);
        setPriority(OverlayPriority.MED);
        panelComponent.setPreferredSize(new Dimension(14, 0));
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!config.PrayerHelper()) {
            return null;
        }

        if (plugin.Hydra != null) {
            if (plugin.hydras.containsKey(plugin.Hydra.getIndex())) {
                int val = plugin.hydras.get(plugin.Hydra.getIndex());
                if (val != 0) {
                    panelComponent.getChildren().clear();
                    panelComponent.getChildren().add(LineComponent.builder().right(Integer.toString(val)).build());
                    return panelComponent.render(graphics);
                }
            }
        }
        return null;
    }
}
