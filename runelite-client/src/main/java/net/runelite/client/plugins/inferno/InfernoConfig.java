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

import java.awt.Color;
import java.awt.Font;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import net.runelite.client.config.Stub;

@ConfigGroup("InfernoPlugin")
public interface InfernoConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "nibblerOverlay",
		name = "Nibbler Overlay",
		description = "Shows if there are any Nibblers left"
	)
	default boolean displayNibblerOverlay()
	{
		return false;
	}

	@ConfigItem(
		position = 1,
		keyName = "prayerHelper",
		name = "Prayer Helper",
		description = "Tells you what to flick in how many ticks"
	)
	default boolean showPrayerHelp()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "prayerWidgetHelper",
		name = "Prayer Widget Helper",
		description = "Shows you which prayer to click and the time until click."
	)
	default boolean showPrayerWidgetHelper()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "waveDisplay",
		name = "Wave display",
		description = "Shows monsters that will spawn on the selected wave(s)."
	)
	default InfernoWaveDisplayMode waveDisplay()
	{
		return InfernoWaveDisplayMode.BOTH;
	}

	@ConfigItem(
		position = 4,
		keyName = "getWaveOverlayHeaderColor",
		name = "Wave Header",
		description = "Color for Wave Header"
	)
	default Color getWaveOverlayHeaderColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		position = 5,
		keyName = "getWaveTextColor",
		name = "Wave Text Color",
		description = "Color for Wave Texts"
	)
	default Color getWaveTextColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		position = 6,
		keyName = "text",
		name = "Text",
		description = ""
	)
	default Stub text()
	{
		return new Stub();
	}

	@ConfigItem(
		position = 7,
		keyName = "fontStyle",
		name = "Font Style",
		description = "Plain | Bold | Italics",
		parent = "text"
	)
	default FontStyle fontStyle()
	{
		return FontStyle.PLAIN;
	}

	@Range(
		min = 14,
		max = 40
	)
	@ConfigItem(
		position = 8,
		keyName = "textSize",
		name = "Text Size",
		description = "Text Size for Timers.",
		parent = "text"
	)
	default int textSize()
	{
		return 32;
	}

	@ConfigItem(
		position = 9,
		keyName = "shadows",
		name = "Shadows",
		description = "Adds Shadows to text.",
		parent = "text"
	)
	default boolean shadows()
	{
		return false;
	}

	@Getter
	@AllArgsConstructor
	public enum FontStyle
	{
		BOLD("Bold", Font.BOLD),
		ITALIC("Italic", Font.ITALIC),
		PLAIN("Plain", Font.PLAIN);

		private String name;
		private int font;

		@Override
		public String toString()
		{
			return getName();
		}
	}

	@RequiredArgsConstructor
	public enum InfernoWaveDisplayMode
	{
		CURRENT("Current wave"),
		NEXT("Next wave"),
		BOTH("Both"),
		NONE("None");

		private final String name;

		@Override
		public String toString()
		{
			return name;
		}
	}
}