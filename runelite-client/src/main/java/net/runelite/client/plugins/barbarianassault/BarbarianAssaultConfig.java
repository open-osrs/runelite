/*
 * Copyright (c) 2018, https://runelitepl.us
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
package net.runelite.client.plugins.barbarianassault;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("barbarianAssault")
public interface BarbarianAssaultConfig extends Config
{
	@ConfigItem(
		keyName = "swapLadder",
		name = "Swap quick-start",
		description = "Enables swapping of 'Climb-down' and 'Quick-start' in the wave lobby",
		position = 0
	)
	default boolean swapLadder()
	{
		return true;
	}
	@ConfigItem(
		keyName = "showTimer",
		name = "Show call change timer",
		description = "Shows time to next call change",
		position = 1
	)
	default boolean showTimer()
	{
		return true;
	}

	@ConfigItem(
		keyName = "removeIncorrectCalls",
		name = "Remove incorrect calls",
		description = "Removes incorrect 'Tell' menu options from horn",
		position = 2
	)
	default boolean removeIncorrectCalls()
	{
		return true;
	}

	@ConfigItem(
		keyName = "removeUnusedMenus",
		name = "Remove unused menus",
		description = "Removes unnecessary menu options" +
			"<br>Example: Attack options are removed when not attacker",
		position = 3
	)
	default boolean removeUnusedMenus()
	{
		return true;
	}

	@ConfigItem(
		keyName = "prayerMetronome",
		name = "Enable prayer metronome",
		description = "Turns on a metronome sync'd to the game's tick rate",
		position = 4
	)
	default boolean prayerMetronome()
	{
		return false;
	}

	@Range(
			min = 1,
			max = 50
	)
	@ConfigItem(
		keyName = "prayerMetronomeVolume",
		name = "Metronome volume",
		description = "Adjusts the metronome's volume",
		position = 5,
		hidden = true,
		unhide = "prayerMetronome"
	)
	default int prayerMetronomeVolume()
	{
		return 10;
	}

	@ConfigItem(
		keyName = "waveTimes",
		name = "Show wave and game duration",
		description = "Displays wave duration after each wave and total game time after wave 10",
		position = 6
	)
	default boolean waveTimes()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showTotalRewards",
		name = "Summarize total reward points",
		description = "Gives summary of advanced points breakdown in chat log",
		position = 7
	)
	default boolean showTotalRewards()
	{
		return false;
	}


	/*///************///*/
	/*///  Attacker  ///*/
	/*///************///*/

	@ConfigItem(
		keyName = "highlightArrows",
		name = "Highlight called arrows",
		description = "Highlights arrows called by your teammate",
		position = 0,
		group = "Attacker"
	)
	default boolean highlightArrows()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightArrowColor",
		name = "Highlight color",
		description = "Configures the color to highlight the called arrows",
		position = 1,
		group = "Attacker",
		hidden = true,
		unhide = "highlightArrows"
	)
	default Color highlightArrowColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		keyName = "attackStyles",
		name = "Remove incorrect attack styles",
		description = "Hide attack styles depending on weapon.",
		position = 2,
		group = "Attacker"
	)
	default boolean attackStyles()
	{
		return false;
	}

	@ConfigItem(
		keyName = "tagging",
		name = "Enable tagging",
		description = "Highlights the menu entry of an attacker/ranger that has not been tagged.",
		position = 3,
		group = "Attacker"
	)
	default boolean tagging()
	{
		return false;
	}


	/*///************///*/
	/*///  Defender  ///*/
	/*///************///*/

	@ConfigItem(
		keyName = "highlightBait",
		name = "Highlight called bait",
		description = "Highlights bait called by your teammate",
		position = 0,
		group = "Defender"
	)
	default boolean highlightBait()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightBaitColor",
		name = "Highlight color",
		description = "Configures the color to highlight the called bait",
		position = 1,
		group = "Defender",
		hidden = true,
		unhide = "highlightBait"
	)
	default Color highlightBaitColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		keyName = "defTimer",
		name = "Show defender tick timer",
		description = "Shows the current cycle tick of runners",
		position = 2,
		group = "Defender"
	)
	default boolean defTimer()
	{
		return true;
	}

	@ConfigItem(
		keyName = "deprioritizeBait",
		name = "Deprioritize bait",
		description = "Moves 'Take' menu option for all bait below 'Walk Here'",
		position = 3,
		group = "Defender"
	)
	default boolean deprioritizeBait()
	{
		return true;
	}

	@ConfigItem(
		keyName = "removePenanceCave",
		name = "Remove penance cave",
		description = "Removes 'Block' menu option from penance cave",
		position = 4,
		group = "Defender"
	)
	default boolean removePenanceCave()
	{
		return true;
	}


	/*///**********///*/
	/*///  Healer  ///*/
	/*///**********///*/

	@ConfigItem(
		keyName = "highlightPoison",
		name = "Highlight called poison",
		description = "Highlights poison called by your teammate",
		position = 0,
		group = "Healer"
	)
	default boolean highlightPoison()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightPoisonColor",
		name = "Highlight color",
		description = "Configures the color to highlight the called poison",
		position = 1,
		group = "Healer",
		hidden = true,
		unhide = "highlightPoison"
	)
	default Color highlightPoisonColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		keyName = "showHpCountOverlay",
		name = "Show number of hitpoints healed",
		description = "Displays current number of hitpoints healed",
		position = 2,
		group = "Healer"
	)
	default boolean showHpCountOverlay()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showTeammateHealthbars",
		name = "Show health bars",
		description = "Displays a health bar where a teammate's remaining health is located",
		position = 3,
		group = "Healer"
	)
	default boolean showTeammateHealthbars()
	{
		return true;
	}

	@ConfigItem(
		keyName = "healerCodes",
		name = "Show healer codes",
		description = "Overlay to show healer codes",
		position = 4,
		group = "Healer"
	)
	default boolean healerCodes()
	{
		return false;
	}

	@ConfigItem(
		keyName = "healerMenuOption",
		name = "Show healer menu options",
		description = "Shows tick count in healer menu options",
		position = 5,
		group = "Healer"
	)
	default boolean healerMenuOption()
	{
		return false;
	}

	@ConfigItem(
		keyName = "osHelp",
		name = "Enable shift overstock",
		description = "Enables overstocking by pressing shift",
		position = 6,
		group = "Healer"
	)
	default boolean osHelp()
	{
		return false;
	}

	@ConfigItem(
		keyName = "removeWrongHealFood",
		name = "Remove wrong heal food ",
		description = "Removes option to use wrong type of food on healer",
		position = 7,
		group = "Healer"
	)
	default boolean removeWrongPoison()
	{
		return false;
	}

	@ConfigItem(
		keyName = "wrongPoisonFoodTextColor",
		name = "Healer wrong poison pack color",
		description = "Change healer wrong poison pack color",
		position = 8,
		group = "Healer"
	)
	default Color wrongPoisonFoodTextColor()
	{
		return Color.BLACK;
	}

	@ConfigItem(
		keyName = "ctrlHealer",
		name = "Control Healer",
		description = "Hold ctrl to put last healer clicked on top",
		position = 9,
		group = "Healer"
	)
	default boolean ctrlHealer()
	{
		return false;
	}


	/*///*************///*/
	/*///  Collector  ///*/
	/*///*************///*/

	@ConfigItem(
		keyName = "swapCollectorBag",
		name = "Swap empty",
		description = "Enables swapping of 'Look-in' and 'Empty' on the collector's bag",
		position = 0,
		group = "Collector"
	)
	default boolean swapCollectorBag()
	{
		return true;
	}

	@ConfigItem(
		keyName = "swapDestroyEggs",
		name = "Swap destroy",
		description = "Enables swapping of 'Use' and 'Destroy' on collector eggs; this does not affect yellow/omega eggs",
		position = 1,
		group = "Collector"
	)
	default boolean swapDestroyEggs()
	{
		return true;
	}

	@ConfigItem(
		keyName = "highlightCollectorEggs",
		name = "Highlight collector eggs",
		description = "Highlight called egg colors",
		position = 2,
		group = "Collector"
	)
	default boolean highlightCollectorEggs()
	{
		return true;
	}

	@ConfigItem(
		keyName = "deprioritizeIncorrectEggs",
		name = "Deprioritize incorrect eggs",
		description = "Moves 'Take' menu option for incorrect eggs below 'Walk Here'",
		position = 3,
		group = "Collector"
	)
	default boolean deprioritizeIncorrectEggs()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showEggCountOverlay",
		name = "Show number of eggs collected",
		description = "Displays current number of eggs collected",
		position = 4,
		group = "Collector"
	)
	default boolean showEggCountOverlay()
	{
		return true;
	}
}
