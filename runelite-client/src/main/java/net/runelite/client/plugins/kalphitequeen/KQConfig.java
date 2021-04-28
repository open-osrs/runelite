/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
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

package net.runelite.client.plugins.kalphitequeen;

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

@ConfigGroup("kalphitequeen")
public interface KQConfig extends Config
{
	// Sections

	@ConfigSection(
		name = "Tick counters",
		description = "Tick counter settings.",
		position = 0,
		keyName = "tickCounterSection"
	)
	String tickCounterSection = "Tick counters";

	@ConfigSection(
		name = "Tiles",
		description = "Tile settings.",
		position = 1,
		keyName = "tileSection"
	)
	String tileSection = "Tiles";

	@ConfigSection(
		name = "Miscellaneous",
		description = "Miscellaneous settings.",
		position = 2,
		keyName = "miscSection"
	)
	String miscSection = "Miscellaneous";

	// Tick Counter Section

	@ConfigItem(
		name = "Show KQ tick counter",
		description = "Show tick counter on KQ.",
		position = 0,
		keyName = "kqTickCounter",
		section = tickCounterSection
	)
	default boolean kqTickCounter()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Font size",
		description = "Adjust the font size of the KQ tick counter.",
		position = 1,
		keyName = "kqFontSize",
		section = tickCounterSection,
		hidden = true,
		unhide = "kqTickCounter"
	)
	@Units(Units.POINTS)
	default int kqFontSize()
	{
		return 22;
	}

	@ConfigItem(
		name = "Font style",
		description = "Bold/Italics/Plain",
		position = 2,
		keyName = "kqFontStyle",
		section = tickCounterSection,
		hidden = true,
		unhide = "kqTickCounter",
		enumClass = FontStyle.class
	)
	default FontStyle kqFontStyle()
	{
		return FontStyle.BOLD;
	}

	@Alpha
	@ConfigItem(
		name = "Font color",
		description = "Color of the kq counter font.",
		position = 3,
		keyName = "kqFontColor",
		section = tickCounterSection,
		hidden = true,
		unhide = "kqTickCounter"
	)
	default Color kqFontColor()
	{
		return Color.CYAN;
	}

	// Tile Section

	@ConfigItem(
		name = "Show KQ tile outline",
		description = "Show tile outline for the KQ.",
		position = 0,
		keyName = "kqTileOutline",
		section = tileSection
	)
	default boolean kqTileOutline()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change the width of the KQ's tile outline.",
		position = 1,
		keyName = "kqTileOutlineWidth",
		section = tileSection,
		hidden = true,
		unhide = "kqTileOutline"
	)
	@Units(Units.POINTS)
	default int kqTileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Color to outline the tile of the KQ.",
		position = 2,
		keyName = "kqTileOutlineColor",
		section = tileSection,
		hidden = true,
		unhide = "kqTileOutline"
	)
	default Color kqTileOutlineColor()
	{
		return Color.BLACK;
	}

	// Misc Section

	@ConfigItem(
		name = "Flash on Vengeance",
		description = "Flash notification when you can vengeance.",
		position = 0,
		keyName = "flashVeng",
		section = miscSection
	)
	default boolean flashVeng()
	{
		return false;
	}

	@Range(
		min = 10,
		max = 50
	)
	@ConfigItem(
		name = "Flash duration",
		description = "Change the duration of the flash.",
		position = 1,
		keyName = "flashVengDuration",
		section = miscSection,
		hidden = true,
		unhide = "flashVeng"
	)
	default int flashVengDuration()
	{
		return 25;
	}

	@Alpha
	@ConfigItem(
		name = "Flash color",
		description = "Color of the flash notification.",
		position = 2,
		keyName = "flashVengColor",
		section = miscSection,
		hidden = true,
		unhide = "flashVeng"
	)
	default Color flashVengColor()
	{
		return new Color(255, 255, 255, 70);
	}

	// Constants

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
}
