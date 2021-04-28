/*
 * Copyright (c) 2020 dutta64 <https://github.com/dutta64>
 * Copyright (c) 2017, Aria <aria@ar1as.space>
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2017, Devin French <https://github.com/devinfrench>
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

package net.runelite.client.plugins.cerberus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.ui.overlay.components.ComponentOrientation;

@ConfigGroup("cerberus")
public interface CerberusConfig extends Config
{
	// Sections

	@ConfigSection(
		name = "General",
		description = "",
		position = 0,
		keyName = "General"
	)
	String generalSection = "Overlay";

	@ConfigSection(
		name = "Current Attack",
		description = "",
		position = 1,
		keyName = "currentAttackSection"
	)
	String currentAttackSection = "Current Attack";

	@ConfigSection(
		name = "Upcoming Attacks",
		description = "",
		position = 2,
		keyName = "upcomingAttacksSection"
	)
	String upcomingAttacksSection = "Upcoming Attacks";

	@ConfigSection(
		name = "Guitar Hero Mode",
		description = "",
		position = 3,
		keyName = "guitarHeroSection"
	)
	String guitarHeroSection = "Guitar Hero Mode";

	// General Section

	@ConfigItem(
		keyName = "drawGhostTiles",
		name = "Show ghost tiles",
		description = "Overlay ghost tiles with respective colors and attack timers.",
		position = 0,
		section = generalSection
	)
	default boolean drawGhostTiles()
	{
		return false;
	}

	@ConfigItem(
		keyName = "calculateAutoAttackPrayer",
		name = "Calculate auto attack prayer",
		description = "Calculate prayer for auto attacks based on your equipment defensive bonuses."
			+ "<br>Default is Protect from Magic.",
		position = 2,
		section = generalSection
	)
	default boolean calculateAutoAttackPrayer()
	{
		return false;
	}

	// Current Attack Section

	@ConfigItem(
		keyName = "showCurrentAttack",
		name = "Show current attack",
		description = "Overlay the current attack in a separate infobox.",
		position = 0,
		section = currentAttackSection
	)
	default boolean showCurrentAttack()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showCurrentAttackTimer",
		name = "Show current attack timer",
		description = "Display a timer on the current attack infobox.",
		position = 1,
		section = currentAttackSection,
		hidden = true,
		unhide = "showCurrentAttack"
	)
	default boolean showCurrentAttackTimer()
	{
		return false;
	}

	// Upcoming Attacks Section

	@ConfigItem(
		keyName = "showUpcomingAttacks",
		name = "Show upcoming attacks",
		description = "Overlay upcoming attacks in stacked info boxes.",
		position = 0,
		section = upcomingAttacksSection
	)
	default boolean showUpcomingAttacks()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 10
	)
	@ConfigItem(
		keyName = "amountOfAttacksShown",
		name = "# of attacks",
		description = "Number of upcoming attacks to render.",
		position = 1,
		section = upcomingAttacksSection,
		hidden = true,
		unhide = "showUpcomingAttacks"
	)
	default int amountOfAttacksShown()
	{
		return 4;
	}

	@ConfigItem(
		keyName = "reverseUpcomingAttacks",
		name = "Reverse order",
		description = "Reverse the order of the upcoming attacks.",
		position = 2,
		section = upcomingAttacksSection,
		hidden = true,
		unhide = "showUpcomingAttacks"
	)
	default boolean reverseUpcomingAttacks()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showUpcomingAttackNumber",
		name = "Show attack number",
		description = "Display the attack pattern number on each upcoming attack." +
			"<br>See http://pastebin.com/hWCvantS",
		position = 3,
		section = upcomingAttacksSection,
		hidden = true,
		unhide = "showUpcomingAttacks"
	)
	default boolean showUpcomingAttackNumber()
	{
		return false;
	}

	@ConfigItem(
		keyName = "upcomingAttacksOrientation",
		name = "Upcoming attacks orientation",
		description = "Display upcoming attacks vertically or horizontally.",
		position = 4,
		section = upcomingAttacksSection,
		hidden = true,
		unhide = "showUpcomingAttacks",
		enumClass = InfoBoxOrientation.class
	)
	default InfoBoxOrientation upcomingAttacksOrientation()
	{
		return InfoBoxOrientation.VERTICAL;
	}

	@ConfigItem(
		keyName = "infoBoxComponentSize",
		name = "Info box size",
		description = "Size of the upcoming attacks infoboxes.",
		position = 5,
		section = upcomingAttacksSection,
		hidden = true,
		unhide = "showUpcomingAttacks",
		enumClass = InfoBoxComponentSize.class
	)
	default InfoBoxComponentSize infoBoxComponentSize()
	{
		return InfoBoxComponentSize.SMALL;
	}

	// Guitar Hero Mode Section

	@ConfigItem(
		keyName = "guitarHeroMode",
		name = "Guitar Hero mode",
		description = "Display descending boxes indicating the correct prayer for the current attack.",
		position = 0,
		section = guitarHeroSection
	)
	default boolean guitarHeroMode()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 10
	)
	@ConfigItem(
		keyName = "guitarHeroTicks",
		name = "# of ticks",
		description = "The number of ticks, before the upcoming current attack, to render.",
		position = 1,
		section = guitarHeroSection,
		hidden = true,
		unhide = "guitarHeroMode"
	)
	default int guitarHeroTicks()
	{
		return 4;
	}

	// Constants

	@Getter
	@RequiredArgsConstructor
	enum InfoBoxOrientation
	{
		HORIZONTAL("Horizontal layout", ComponentOrientation.HORIZONTAL),
		VERTICAL("Vertical layout", ComponentOrientation.VERTICAL);

		private final String name;
		private final ComponentOrientation orientation;

		@Override
		public String toString()
		{
			return name;
		}
	}

	@Getter
	@RequiredArgsConstructor
	enum InfoBoxComponentSize
	{
		SMALL("Small boxes", 40), MEDIUM("Medium boxes", 60), LARGE("Large boxes", 80);

		private final String name;
		private final int size;

		@Override
		public String toString()
		{
			return name;
		}
	}
}
