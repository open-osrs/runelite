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
package net.runelite.client.plugins.fightcavespawnrotation;

import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup("fightcavespawnrotation")
public interface FightCavesSpawnRotationConfig extends Config
{
	@ConfigItem(
		name = "Outside Caves Rotation Info",
		keyName = "outsideCavesInfoOverlay",
		description = "Displays information about the current/upcoming rotation outside of the fight caves",
		position = 0
	)
	default boolean outsideCavesInfoOverlay()
	{
		return false;
	}

	@ConfigItem(
		name = "Spawn Display Mode",
		keyName = "displayMode",
		description = "",
		position = 1
	)
	default FightCavesSpawnRotationConfig.DisplayMode displayMode()
	{
		return FightCavesSpawnRotationConfig.DisplayMode.OFF;
	}

	@Range(
		max = 3,
		min = 1
	)
	@Units("px")
	@ConfigItem(
		name = "Overlay Stroke Size",
		keyName = "overlayStrokeSize",
		description = "",
		position = 2
	)
	default int overlayStrokeSize()
	{
		return 2;
	}

	@ConfigItem(
		name = "Color Spawn Overlays",
		keyName = "colorSpawnOverlays",
		description = "Color the spawn overlays inside the Fight Caves.",
		position = 3
	)
	default boolean colorSpawnOverlays()
	{
		return false;
	}

	@ConfigItem(
		name = "Current Wave Color",
		keyName = "currentWaveColor",
		description = "",
		position = 4,
		hidden = true,
		unhide = "colorSpawnOverlays"
	)
	@Alpha
	default Color currentWaveColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		name = "Next Wave Color",
		keyName = "nextWaveColor",
		description = "",
		position = 5,
		hidden = true,
		unhide = "colorSpawnOverlays"
	)
	@Alpha
	default Color nextWaveColor()
	{
		return Color.GREEN;
	}

	@Getter
	@AllArgsConstructor
	enum DisplayMode
	{
		OFF("Off"),
		CURRENT_WAVE("Current"),
		NEXT_WAVE("Next"),
		BOTH("Both");

		private final String name;

		@Override
		public String toString()
		{
			return getName();
		}
	}
}