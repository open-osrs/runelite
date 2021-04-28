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

package net.runelite.client.plugins.grotesqueguardians;

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

@ConfigGroup("grotesqueguardians")
public interface GrotesqueGuardiansConfig extends Config
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
		name = "Outlines",
		description = "Outline settings.",
		position = 1,
		keyName = "outlineSection"
	)
	String outlineSection = "Outlines";

	@ConfigSection(
		name = "Other",
		description = "Other settings.",
		position = 2,
		keyName = "otherSection"
	)
	String otherSection = "Other";

	// Tick counters

	@ConfigItem(
		name = "Prayer widget tick counter",
		description = "Enable prayer widget tick counter overlay.",
		position = 0,
		keyName = "prayerTickCounter",
		section = tickCounterSection
	)
	default boolean prayerTickCounter()
	{
		return false;
	}

	@ConfigItem(
		name = "Prayer Guitar Hero mode",
		description = "Enable Guitar Hero mode for prayers.",
		position = 1,
		keyName = "guitarHeroMode",
		section = tickCounterSection
	)
	default boolean guitarHeroMode()
	{
		return false;
	}

	@ConfigItem(
		name = "Dusk tick counter",
		description = "Show tick counter on Dusk.",
		position = 2,
		keyName = "duskTickCounter",
		section = tickCounterSection
	)
	default boolean duskTickCounter()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Font size",
		description = "Adjust the font size of the Dusk tick counter.",
		position = 3,
		keyName = "duskFontSize",
		section = tickCounterSection,
		hidden = true,
		unhide = "duskTickCounter"
	)
	@Units(Units.POINTS)
	default int duskFontSize()
	{
		return 22;
	}

	@ConfigItem(
		name = "Font style",
		description = "Bold/Italics/Plain",
		position = 4,
		keyName = "duskFontStyle",
		section = tickCounterSection,
		hidden = true,
		unhide = "duskTickCounter",
		enumClass = FontStyle.class
	)
	default FontStyle duskFontStyle()
	{
		return FontStyle.BOLD;
	}

	@Alpha
	@ConfigItem(
		name = "Font color",
		description = "Color of the Dusk ticker counter font.",
		position = 5,
		keyName = "duskFontColor",
		section = tickCounterSection,
		hidden = true,
		unhide = "duskTickCounter"
	)
	default Color duskFontColor()
	{
		return Color.YELLOW;
	}

	// Outlines

	@ConfigItem(
		name = "Outline gargoyle tiles",
		description = "Outline gargoyle tiles.",
		position = 0,
		keyName = "outlineGargoyleTile",
		section = outlineSection
	)
	default boolean outlineGargoyleTile()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change the width of the tile outline.",
		position = 1,
		keyName = "tileOutlineWidth",
		section = outlineSection,
		hidden = true,
		unhide = "outlineGargoyleTile"
	)
	@Units(Units.POINTS)
	default int tileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Change the color of the tile outline.",
		position = 2,
		keyName = "tileOutlineColor",
		section = outlineSection,
		hidden = true,
		unhide = "outlineGargoyleTile"
	)
	default Color tileOutlineColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		name = "Outline gargoyle invulnerability",
		description = "Outline gargoyle npcs when invulnerable.",
		position = 3,
		keyName = "gargoyleInvulnOutline",
		section = outlineSection
	)
	default boolean gargoyleInvulnOutline()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the outline.",
		position = 4,
		keyName = "gargoyleInvulnOutlineWidth",
		section = outlineSection,
		hidden = true,
		unhide = "gargoyleInvulnOutline"
	)
	@Units(Units.POINTS)
	default int gargoyleInvulnOutlineWidth()
	{
		return 2;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the color of the outline.",
		position = 5,
		keyName = "gargoyleInvulnOutlineColor",
		section = outlineSection,
		hidden = true,
		unhide = "gargoyleInvulnOutline"
	)
	default Color gargoyleInvulnOutlineColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		name = "Outline graphics objects",
		description = "Outline the damage tiles during Phase 3.",
		position = 6,
		keyName = "outlineGraphicsObjects",
		section = outlineSection
	)
	default boolean outlineGraphicsObjects()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the graphics objects outline.",
		position = 7,
		keyName = "graphicsObjectsOutlineWidth",
		section = outlineSection,
		hidden = true,
		unhide = "outlineGraphicsObjects"
	)
	@Units(Units.POINTS)
	default int graphicsObjectsOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the color of the graphics objects outline.",
		position = 8,
		keyName = "graphicsObjectsOutlineColor",
		section = outlineSection,
		hidden = true,
		unhide = "outlineGraphicsObjects"
	)
	default Color graphicsObjectsOutlineColor()
	{
		return Color.WHITE;
	}

	// Other Section

	@ConfigItem(
		name = "Flash on Danger",
		description = "Flash the screen if danger tile spawns under you.",
		position = 9,
		keyName = "flashOnDanger",
		section = otherSection
	)
	default boolean flashOnDanger()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		name = "Flash color",
		description = "Change the color of the flash.",
		position = 10,
		keyName = "flashColor",
		section = otherSection,
		hidden = true,
		unhide = "flashOnDanger"
	)
	default Color flashColor()
	{
		return new Color(255, 0, 0, 70);
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
