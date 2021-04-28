/*
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
package net.runelite.client.plugins.nightmare;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup("nightmareOfAshihama")
public interface NightmareConfig extends Config
{
	@ConfigSection(
		name = "General",
		description = "Configure general settings.",
		position = 0,
		keyName = "generalSection"
	)
	String generalSection = "General";

	@ConfigItem(
		keyName = "prayerHelper",
		name = "Prayer helper",
		description = "Displays the correct prayer to use at various points in the fight.",
		position = 0,
		section = generalSection,
		enumClass = PrayerDisplay.class
	)
	default PrayerDisplay prayerHelper()
	{
		return PrayerDisplay.BOTH;
	}

	@ConfigItem(
		keyName = "tickCounter",
		name = "Show Ticks",
		description = "Displays the number of ticks until next attack",
		position = 1,
		section = generalSection
	)
	default boolean ticksCounter()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightTotems",
		name = "Highlight Totems",
		description = "Highlights Totems based on their status",
		position = 2,
		section = generalSection
	)
	default boolean highlightTotems()
	{
		return true;
	}

	@Range(
		min = 1,
		max = 10
	)
	@ConfigItem(
		name = "Totem Outline Size",
		description = "Change the size of the totem outline.",
		position = 3,
		keyName = "totemOutlineSize",
		section = generalSection,
		hidden = true,
		unhide = "highlightTotems"
	)
	@Units(Units.POINTS)
	default int totemOutlineSize()
	{
		return 3;
	}

	@ConfigItem(
		keyName = "highlightShadows",
		name = "Highlight Shadows",
		description = "Highlights the Shadow Attacks",
		position = 4,
		section = generalSection
	)
	default boolean highlightShadows()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightSpores",
		name = "Highlight Spores",
		description = "Highlights spores that will make you yawn",
		position = 5,
		section = generalSection
	)
	default boolean highlightSpores()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		keyName = "poisonBorderCol",
		name = "Poison border colour",
		description = "Colour the edges of the area highlighted by poison special will be",
		position = 6,
		section = generalSection
	)

	default Color poisonBorderCol()
	{
		return new Color(255, 0, 0, 100);
	}

	@Alpha
	@ConfigItem(
		keyName = "poisonCol",
		name = "Poison colour",
		description = "Colour the fill of the area highlighted by poison special will be",
		position = 7,
		section = generalSection
	)
	default Color poisonCol()
	{
		return new Color(255, 0, 0, 50);
	}

	@ConfigItem(
		keyName = "showTicksUntilParasite",
		name = "Indicate Parasites",
		description = "Displays a red tick timer on any impregnated players",
		position = 8,
		section = generalSection
	)
	default boolean showTicksUntilParasite()
	{
		return true;
	}

	@ConfigItem(
			keyName = "highlightHusk",
			name = "Highlight Husk",
			description = "Highlights the mage and range husk",
			position = 9,
			section = generalSection
	)
	default boolean huskHighlight()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightHuskTarget",
		name = "Highlight Husk Target(s)",
		description = "Highlights whoever the husks will spawn on",
		position = 10,
		section = generalSection
	)
	default boolean highlightHuskTarget()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		keyName = "huskBorderCol",
		name = "Husk Target Border Color",
		description = "Colour the edges of the area highlighted by poison special will be",
		position = 11,
		section = generalSection
	)

	default Color huskBorderCol()
	{
		return new Color(255, 0, 0, 100);
	}

	@ConfigItem(
		keyName = "highlightNightmareHitboxOnCharge",
		name = "Highlight Nightmare's Hitbox On Charge",
		description = "Highlights the hitbox of the Nightmare when she charges",
		position = 12,
		section = generalSection
	)
	default boolean highlightNightmareHitboxOnCharge()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightNightmareChargeRange",
		name = "Highlight Nightmare's Charge Range",
		description = "Highlights the range the Nightmare will damage you with her charge attack",
		position = 13,
		section = generalSection
	)
	default boolean highlightNightmareChargeRange()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		keyName = "nightmareChargeBorderCol",
		name = "Nightmare Charge Border Color",
		description = "Color the edges of the area highlighted by the nightmare's charge attack",
		position = 14,
		section = generalSection
	)

	default Color nightmareChargeBorderCol()
	{
		return new Color(255, 0, 0, 100);
	}

	@Alpha
	@ConfigItem(
		keyName = "nightmareChargeCol",
		name = "Nightmare charge fill color",
		description = "Color the fill of the area highlighted by the nightmare's charge attack",
		position = 15,
		section = generalSection
	)
	default Color nightmareChargeCol()
	{
		return new Color(255, 0, 0, 50);
	}

	@ConfigItem(
		keyName = "flash",
		name = "Flash your screen when you get impregnated",
		description = "Your Screen flashes when the nightmare infects you with her parasite",
		position = 16,
		section = generalSection
	)
	default boolean flash()
	{
		return false;
	}

	enum PrayerDisplay
	{
		PRAYER_TAB,
		BOTTOM_RIGHT,
		BOTH;

		public boolean showInfoBox()
		{
			switch (this)
			{
				case BOTTOM_RIGHT:
				case BOTH:
					return true;
				default:
					return false;
			}
		}

		public boolean showWidgetHelper()
		{
			switch (this)
			{
				case PRAYER_TAB:
				case BOTH:
					return true;
				default:
					return false;
			}
		}
	}
}
