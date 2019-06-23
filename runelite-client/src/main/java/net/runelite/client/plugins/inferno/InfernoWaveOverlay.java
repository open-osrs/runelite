/*
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
 * Copyright (c) 2019, Ganom <https://github.com/ganom>
 * Copyright (c) 2019, Lucas <https://github.com/lucwousin>
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
package net.runelite.client.plugins.inferno;

import com.google.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import lombok.Setter;
import static net.runelite.client.plugins.inferno.InfernoWaveMappings.addWaveComponent;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.PanelComponent;

public class InfernoWaveOverlay extends Overlay
{
	private final InfernoPlugin plugin;
	private final PanelComponent panelComponent;

	@Setter
	private Color waveHeaderColor;

	@Setter
	private Color waveTextColor;

	@Setter
	private InfernoConfig.InfernoWaveDisplayMode displayMode;

	@Inject
	InfernoWaveOverlay(final InfernoPlugin plugin)
	{
		this.panelComponent = new PanelComponent();
		this.setPosition(OverlayPosition.TOP_RIGHT);
		this.setPriority(OverlayPriority.HIGH);
		this.plugin = plugin;

		panelComponent.setPreferredSize(new Dimension(160, 0));
	}

	public Dimension render(final Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		if (displayMode == InfernoConfig.InfernoWaveDisplayMode.CURRENT ||
			displayMode == InfernoConfig.InfernoWaveDisplayMode.BOTH)
		{
			addWaveComponent(
				panelComponent,
				"Current Wave (Wave " + plugin.getCurrentWaveNumber() + ")",
				plugin.getCurrentWaveNumber(),
				waveHeaderColor,
				waveTextColor
			);
		}

		if (displayMode == InfernoConfig.InfernoWaveDisplayMode.NEXT ||
			displayMode == InfernoConfig.InfernoWaveDisplayMode.BOTH)
		{
			addWaveComponent(
				panelComponent,
				"Next Wave (Wave " + plugin.getNextWaveNumber() + ")",
				plugin.getNextWaveNumber(),
				waveHeaderColor,
				waveTextColor
			);
		}

		return panelComponent.render(graphics);
	}
}
