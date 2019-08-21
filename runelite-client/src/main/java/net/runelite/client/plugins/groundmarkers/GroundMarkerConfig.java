/*
 * Copyright (c) 2018, TheLonelyDev <https://github.com/TheLonelyDev>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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

package net.runelite.client.plugins.groundmarkers;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("groundMarker")
public interface GroundMarkerConfig extends Config
{
	@Alpha
	@ConfigItem(
		keyName = "markerColor",
		name = "Default Marked tile Color",
		description = "Configures the default color of marked tiles"
	)
	default Color markerColor()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor2",
		name = "Group 2 tile color",
		description = "Configures the color of the 2nd group of marked tiles"
	)
	default Color markerColor2()
	{
		return Color.RED;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor3",
		name = "Group 3 tile color",
		description = "Configures the color of the 3rd group of marked tiles"
	)
	default Color markerColor3()
	{
		return Color.BLUE;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor4",
		name = "Group 4 tile color",
		description = "Configures the color of the 4th group of marked tiles"
	)
	default Color markerColor4()
	{
		return Color.GREEN;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor5",
		name = "Group 5 tile color",
		description = "Configures the color of the 5th group of marked tiles"
	)
	default Color markerColor5()
	{
		return Color.BLACK;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor6",
		name = "Group 6 tile color",
		description = "Configures the color of the 6th group of marked tiles"
	)
	default Color markerColor6()
	{
		return Color.GRAY;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor7",
		name = "Group 7 tile color",
		description = "Configures the color of the 7th group of marked tiles"
	)
	default Color markerColor7()
	{
		return Color.WHITE;
	}

	@Alpha
	@ConfigItem(
		keyName = "markerColor8",
		name = "Group 8 tile color",
		description = "Configures the color of the 8th group of marked tiles"
	)
	default Color markerColor8()
	{
		return Color.MAGENTA;
	}

	@ConfigItem(
		keyName = "showMinimap",
		name = "Show on minimap",
		description = "Shows marked tiles on the minimap"
	)
	default boolean showMinimap()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 100
	)
	@ConfigItem(
		keyName = "minimapOpacity",
		name = "Minimap opacity",
		description = "The opacity of the minimap markers"
	)
	default int minimapOverlayOpacity()
	{
		return 100;
	}
}
