/*
 * Copyright (c) 2020 Dutta64 <https://github.com/Dutta64>
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
package net.runelite.client.plugins.hallowedsepulchre;

import java.awt.Color;
import java.awt.Font;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup("hallowedsepulchre")
public interface HallowedSepulchreConfig extends Config
{
	Color RED_OPAQUE = new Color(255, 0, 0, 255);
	Color RED_TRANSPARENT = new Color(255, 0, 0, 20);

	@ConfigSection(
		keyName = "overlays",
		position = 0,
		name = "Overlays",
		description = ""
	)
	String overlays = "Overlays";

	@ConfigSection(
		keyName = "colors",
		name = "Colors",
		description = "Customize overlay colors.",
		position = 1
	)
	String colors = "Colors";

	@ConfigSection(
		keyName = "other",
		name = "Other",
		description = "Other settings.",
		position = 2
	)
	String other = "Other";

	@ConfigItem(
		position = 0,
		keyName = "highlightArrows",
		name = "Highlight arrows",
		description = "Overlay arrows with a colored outline.",
		section = overlays
	)
	default HighlightMode highlightArrows()
	{
		return HighlightMode.TILE;
	}

	@ConfigItem(
		position = 1,
		keyName = "highlightSwords",
		name = "Highlight swords",
		description = "Overlay swords with a colored outline.",
		section = overlays
	)
	default HighlightMode highlightSwords()
	{
		return HighlightMode.TILE;
	}

	@ConfigItem(
		position = 2,
		keyName = "highlightCrossbowmanStatue",
		name = "Crossbow statue animation",
		description = "Overlay shooting statues with a colored outline.",
		section = overlays
	)
	default boolean highlightCrossbowStatues()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "highlightWizardStatue",
		name = "Wizard statue tick counter",
		description = "Overlay wizard statues with a tick counter.",
		section = overlays
	)
	default boolean highlightWizardStatues()
	{
		return false;
	}

	@ConfigItem(
		position = 4,
		keyName = "highlightServerTile",
		name = "Highlight server tile",
		description = "Highlight the tile the player is on, according to the server.",
		section = overlays
	)
	default boolean highlightServerTile()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "renderDistance",
		name = "Render distance",
		description = "How far to render overlays from your player's position.",
		section = overlays
	)
	default RenderDistance renderDistance()
	{
		return RenderDistance.MEDIUM;
	}

	@Alpha
	@ConfigItem(
		position = 0,
		keyName = "arrowsOutlineColor",
		name = "Arrows outline",
		description = "Change the overlay outline color of arrows.",
		section = colors
	)
	default Color arrowsOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 1,
		keyName = "arrowsFillColor",
		name = "Arrows fill",
		description = "Change the overlay fill color of arrows.",
		section = colors
	)
	default Color arrowsFillColor()
	{
		return RED_TRANSPARENT;
	}

	@Alpha
	@ConfigItem(
		position = 2,
		keyName = "swordsOutlineColor",
		name = "Swords outline",
		description = "Change the overlay outline color of swords.",
		section = colors
	)
	default Color swordsOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 3,
		keyName = "swordsFillColor",
		name = "Swords fill",
		description = "Change the overlay fill color of swords.",
		section = colors
	)
	default Color swordsFillColor()
	{
		return RED_TRANSPARENT;
	}

	@Alpha
	@ConfigItem(
		position = 4,
		keyName = "crossbowStatueOutlineColor",
		name = "Crossbow outline",
		description = "Change the overlay outline color of the crossbow statues.",
		section = colors
	)
	default Color crossbowStatueOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 5,
		keyName = "crossbowStatueFillColor",
		name = "Crossbow fill",
		description = "Change the overlay fill color of the crossbow statues.",
		section = colors
	)
	default Color crossbowStatueFillColor()
	{
		return RED_TRANSPARENT;
	}

	@Alpha
	@ConfigItem(
		position = 6,
		keyName = "serverTileOutlineColor",
		name = "Server tile outline",
		description = "Change the overlay outline color of the player's server tile.",
		section = colors
	)
	default Color serverTileOutlineColor()
	{
		return Color.CYAN;
	}

	@Alpha
	@ConfigItem(
		position = 7,
		keyName = "serverTileFillColor",
		name = "Server tile  fill",
		description = "Change the overlay fill color of the player's server tile.",
		section = colors
	)
	default Color serverTileFillColor()
	{
		return new Color(0, 0, 0, 0);
	}

	@ConfigItem(
		position = 8,
		keyName = "wizardStatueTickCounterColor",
		name = "Tick counter",
		description = "Change the overlay color of the wizard statue tick counter.",
		section = colors
	)
	default Color wizardStatueTickCounterColor()
	{
		return Color.RED;
	}

	@Range(
		min = 1,
		max = 20
	)
	@ConfigItem(
		position = 0,
		keyName = "wizardFontSize",
		name = "Tick counter font size",
		description = "Adjust the font size of the wizard statue tick counter.",
		section = other
	)
	@Units(Units.POINTS)
	default int wizardFontSize()
	{
		return 12;
	}

	@ConfigItem(
		position = 1,
		keyName = "fontStyle",
		name = "Font style",
		description = "Bold/Italics/Plain",
		section = other

	)
	default FontStyle fontStyle()
	{
		return FontStyle.PLAIN;
	}

	@ConfigItem(
		position = 2,
		keyName = "wizardFontShadow",
		name = "Tick counter font shadow",
		description = "Toggle font shadow of the wizard statue tick counter.",
		section = other
	)
	default boolean wizardFontShadow()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 5
	)
	@ConfigItem(
		position = 3,
		keyName = "tileOutlineWidth",
		name = "Tile outline width",
		description = "Change width of tile outlines.",
		section = other
	)
	@Units(Units.POINTS)
	default int tileOutlineWidth()
	{
		return 1;
	}

	@Getter
	@AllArgsConstructor
	enum HighlightMode
	{
		NONE("None"),
		OUTLINE("Outline"),
		TILE("Tile"),
		BOTH("Both");

		private final String name;

		@Override
		public String toString()
		{
			return name;
		}
	}

	@Getter
	@AllArgsConstructor
	enum FontStyle
	{
		BOLD("Bold", Font.BOLD),
		ITALIC("Italic", Font.ITALIC),
		PLAIN("Plain", Font.PLAIN);

		private final String name;
		private final int font;

		@Override
		public String toString()
		{
			return name;
		}
	}

	@Getter
	@AllArgsConstructor
	enum RenderDistance
	{
		SHORT("Short", 2350),
		MEDIUM("Medium", 3525),
		FAR("Far", 4700),
		UNCAPPED("Uncapped", 0);

		private final String name;
		private final int distance;

		@Override
		public String toString()
		{
			return name;
		}
	}
}
