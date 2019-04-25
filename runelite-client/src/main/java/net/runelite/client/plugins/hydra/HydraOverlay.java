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
import javax.inject.Inject;

import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.*;
import net.runelite.client.ui.overlay.components.PanelComponent;

public class HydraOverlay extends Overlay {
	private final HydraConfig config;
	private final HydraPlugin plugin;
	private final PanelComponent panelComponent = new PanelComponent();


	@Inject
	private Client client;

	@Inject
	private HydraOverlay(HydraConfig config, HydraPlugin plugin) {
		this.config = config;
		this.plugin = plugin;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
		panelComponent.setPreferredSize(new Dimension(150, 0));
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		if (!config.TextIndicator()) {
			return null;
		}

		for (NPC hydra : client.getNpcs()) {
			if (hydra == null || hydra.getName() == null) {
				continue;
			}
			if (hydra.getName().equalsIgnoreCase("Hydra")) {
				if (plugin.hydras.containsKey(hydra.getIndex())) {
					int val = plugin.hydras.get(hydra.getIndex());
					if (val != 0) {
						if (config.BoldText()) {
							graphics.setFont(FontManager.getRunescapeBoldFont());
						}
						if (plugin.hydraattacks.containsKey(hydra.getIndex())) {
							int attack = plugin.hydraattacks.get(hydra.getIndex());
							if (attack == 8261) {
								if (val == 3) {
									OverlayUtil.renderTextLocation(graphics, hydra.getCanvasTextLocation(graphics, "MAGE", hydra.getLogicalHeight() + 100), "MAGE", Color.BLUE);
								} else {
									OverlayUtil.renderTextLocation(graphics, hydra.getCanvasTextLocation(graphics, "RANGE", hydra.getLogicalHeight() + 100), "RANGE", Color.GREEN);
								}
							} else if (attack == 8262) {
								if (val == 3) {
									OverlayUtil.renderTextLocation(graphics, hydra.getCanvasTextLocation(graphics, "RANGE", hydra.getLogicalHeight() + 100), "RANGE", Color.GREEN);
								} else {
									OverlayUtil.renderTextLocation(graphics, hydra.getCanvasTextLocation(graphics, "MAGE", hydra.getLogicalHeight() + 100), "MAGE", Color.BLUE);
								}
							}
						}
						Point runelitepleaseexplainwhyineedtocheckthisfornullinsteadoftheentirehydravariablethisshitcostmelikeanhourofmylifeandiblameyouadam = hydra.getCanvasTextLocation(graphics, Integer.toString(val), hydra.getLogicalHeight() + 40);
						if (runelitepleaseexplainwhyineedtocheckthisfornullinsteadoftheentirehydravariablethisshitcostmelikeanhourofmylifeandiblameyouadam != null) {
							OverlayUtil.renderTextLocation(graphics, runelitepleaseexplainwhyineedtocheckthisfornullinsteadoftheentirehydravariablethisshitcostmelikeanhourofmylifeandiblameyouadam, Integer.toString(val), Color.WHITE);
						}
					}
				}
			}

		}
		graphics.setFont(FontManager.getRunescapeFont());
		return null;
	}
}
