/*
 * Copyright (c) 2021 Nicole <https://github.com/losingticks>
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
package net.runelite.client.plugins.fightcavespawnrotation.overlay;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.client.plugins.fightcavespawnrotation.FightCavesSpawnRotationConfig;
import net.runelite.client.plugins.fightcavespawnrotation.FightCavesSpawnRotationPlugin;
import static net.runelite.client.plugins.fightcavespawnrotation.FightCavesSpawnRotationPlugin.TZHAAR_REGION;
import net.runelite.client.plugins.fightcavespawnrotation.util.FightCavesStartLocations;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;

public class FightCavesRotationOverlay extends OverlayPanel
{
	private final FightCavesSpawnRotationPlugin plugin;
	private final FightCavesSpawnRotationConfig config;

	@Inject
	private FightCavesRotationOverlay(FightCavesSpawnRotationPlugin plugin, FightCavesSpawnRotationConfig config)
	{
		this.plugin = plugin;
		this.config = config;
		setPriority(OverlayPriority.HIGH);
		setPosition(OverlayPosition.BOTTOM_LEFT);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!plugin.inRegion(TZHAAR_REGION) || !config.outsideCavesInfoOverlay())
		{
			return null;
		}
		int rotation = plugin.getRotationTime();
		panelComponent.setPreferredSize(new Dimension(150, 0));
		panelComponent.getChildren().add(LineComponent.builder().left("Current Rotation:").leftColor(Color.WHITE).right(Integer.toString(FightCavesStartLocations.translateRotation(rotation))).rightColor(Color.GREEN).build());
		panelComponent.getChildren().add(LineComponent.builder().left("Time Until Next Rotation: ").leftColor(Color.WHITE).right((60 - plugin.getUTCTime().getSecond()) + "s").rightColor(Color.GREEN).build());
		panelComponent.getChildren().add(LineComponent.builder().left("Next Rotation: ").leftColor(Color.WHITE).right(rotation + 1 > 15 ? "4" : Integer.toString(FightCavesStartLocations.translateRotation(rotation + 1))).rightColor(Color.GREEN).build());
		return super.render(graphics);
	}
}