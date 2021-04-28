/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2019, alanbaumgartner <https://github.com/alanbaumgartner>
 * Copyright (c) 2019, Kyle <https://github.com/kyleeld>
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
package net.runelite.client.plugins.menuentryswapperextended;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.menuentryswapperextended.util.BurningAmuletMode;
import net.runelite.client.plugins.menuentryswapperextended.util.CombatBraceletMode;
import net.runelite.client.plugins.menuentryswapperextended.util.ConstructionCapeMode;
import net.runelite.client.plugins.menuentryswapperextended.util.ConstructionMode;
import net.runelite.client.plugins.menuentryswapperextended.util.CraftingCapeMode;
import net.runelite.client.plugins.menuentryswapperextended.util.DigsitePendantMode;
import net.runelite.client.plugins.menuentryswapperextended.util.DuelingRingMode;
import net.runelite.client.plugins.menuentryswapperextended.util.GamesNecklaceMode;
import net.runelite.client.plugins.menuentryswapperextended.util.GloryMode;
import net.runelite.client.plugins.menuentryswapperextended.util.MaxCapeEquippedMode;
import net.runelite.client.plugins.menuentryswapperextended.util.MagicCapeMode;
import net.runelite.client.plugins.menuentryswapperextended.util.NecklaceOfPassageMode;
import net.runelite.client.plugins.menuentryswapperextended.util.RingOfWealthMode;
import net.runelite.client.plugins.menuentryswapperextended.util.SkillsNecklaceMode;
import net.runelite.client.plugins.menuentryswapperextended.util.XericsTalismanMode;

@ConfigGroup("menuentryswapperextended")
public interface MenuEntrySwapperExtendedConfig extends Config
{
	@ConfigSection(
		name = "Skilling",
		description = "",
		position = 1,
		keyName = "skillingSection"
	)
	String skillingSection = "Skilling";

	@ConfigSection(
		name = "Teleportation",
		description = "",
		position = 1,
		keyName = "teleportationSection"
	)
	String teleportationSection = "Teleportation";

	@ConfigSection(
		name = "Right Click Options",
		description = "",
		position = 1,
		keyName = "rightClickOptionsSection"
	)
	String rightClickOptionsSection = "Right Click Options";


	@ConfigSection(
		name = "PvM",
		description = "",
		position = 1,
		keyName = "pvmSection"
	)
	String pvmSection = "PvM";

	//------------------------------------------------------------//
	// Skilling
	//------------------------------------------------------------//

	@ConfigItem(
		keyName = "getEasyConstruction",
		name = "Easy Construction",
		description = "Makes 'Remove'/'Build' the default option for listed items.",
		position = 0,
		section = skillingSection
	)
	default boolean getEasyConstruction()
	{
		return true;
	}

	@ConfigItem(
		keyName = "getConstructionMode",
		name = "EZ Construction Type",
		description = "",
		position = 1,
		section = skillingSection,
		hidden = true,
		unhide = "getEasyConstruction"
	)
	default ConstructionMode getConstructionMode()
	{
		return ConstructionMode.LARDER;
	}

	@ConfigItem(
		keyName = "swapPickpocket",
		name = "Pickpocket",
		description = "Swap Talk-to with Pickpocket on NPC<br>Example: Man, Woman",
		position = 2,
		section = skillingSection
	)
	default boolean swapPickpocket()
	{
		return false;
	}

	//------------------------------------------------------------//
	// Teleportation
	//------------------------------------------------------------//

	@ConfigItem(
		keyName = "swapGamesNecklace",
		name = "Games Necklace",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Games Necklace.",
		position = 1,
		section = teleportationSection
	)
	default boolean getGamesNecklace()
	{
		return false;
	}

	@ConfigItem(
		keyName = "gamesNecklaceMode",
		name = "Mode",
		description = "",
		position = 2,
		section = teleportationSection,
		hidden = true,
		unhide = "swapGamesNecklace"
	)
	default GamesNecklaceMode getGamesNecklaceMode()
	{
		return GamesNecklaceMode.BURTHORPE;
	}

	@ConfigItem(
		keyName = "swapDuelingRing",
		name = "Dueling Ring",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Ring of Dueling.",
		position = 3,
		section = teleportationSection,
		disabledBy  = "swapDuelRingLavas"
	)
	default boolean getDuelingRing()
	{
		return false;
	}

	@ConfigItem(
		keyName = "duelingRingMode",
		name = "Mode",
		description = "",
		position = 4,
		section = teleportationSection,
		hidden = true,
		unhide = "swapDuelingRing"
	)
	default DuelingRingMode getDuelingRingMode()
	{
		return DuelingRingMode.DUEL_ARENA;
	}

	@ConfigItem(
		keyName = "swapGlory",
		name = "Glory",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Amulet of Glory / Amulet of Eternal Glory.",
		position = 5,
		section = teleportationSection
	)
	default boolean getGlory()
	{
		return false;
	}

	@ConfigItem(
		keyName = "gloryMode",
		name = "Mode",
		description = "",
		position = 6,
		section = teleportationSection,
		hidden = true,
		unhide = "swapGlory"
	)
	default GloryMode getGloryMode()
	{
		return GloryMode.EDGEVILLE;
	}

	@ConfigItem(
		keyName = "swapSkill",
		name = "Skills Necklace",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Skills Necklace.",
		position = 7,
		section = teleportationSection
	)
	default boolean getSkillsNecklace()
	{
		return false;
	}

	@ConfigItem(
		keyName = "skillsnecklacemode",
		name = "Mode",
		description = "",
		position = 8,
		section = teleportationSection,
		hidden = true,
		unhide = "swapSkill"
	)
	default SkillsNecklaceMode getSkillsNecklaceMode()
	{
		return SkillsNecklaceMode.FARMING_GUILD;
	}

	@ConfigItem(
		keyName = "swapPassage",
		name = "Passage Necklace",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Necklace of Passage.",
		position = 9,
		section = teleportationSection
	)
	default boolean getNecklaceofPassage()
	{
		return false;
	}

	@ConfigItem(
		keyName = "necklaceofpassagemode",
		name = "Mode",
		description = "",
		position = 10,
		section = teleportationSection,
		hidden = true,
		unhide = "swapPassage"
	)
	default NecklaceOfPassageMode getNecklaceofPassageMode()
	{
		return NecklaceOfPassageMode.WIZARDS_TOWER;
	}

	@ConfigItem(
		keyName = "swapDigsite",
		name = "Digsite Pendant",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Digsite Pendant.",
		position = 11,
		section = teleportationSection
	)
	default boolean getDigsitePendant()
	{
		return false;
	}

	@ConfigItem(
		keyName = "digsitependantmode",
		name = "Mode",
		description = "",
		position = 12,
		section = teleportationSection,
		hidden = true,
		unhide = "swapDigsite"
	)
	default DigsitePendantMode getDigsitePendantMode()
	{
		return DigsitePendantMode.FOSSIL_ISLAND;
	}

	@ConfigItem(
		keyName = "swapCombat",
		name = "Combat Bracelet",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Combat Bracelet.",
		position = 13,
		section = teleportationSection
	)
	default boolean getCombatBracelet()
	{
		return false;
	}

	@ConfigItem(
		keyName = "combatbraceletmode",
		name = "Mode",
		description = "",
		position = 14,
		section = teleportationSection,
		hidden = true,
		unhide = "swapCombat"
	)
	default CombatBraceletMode getCombatBraceletMode()
	{
		return CombatBraceletMode.WARRIORS_GUILD;
	}

	@ConfigItem(
		keyName = "swapburning",
		name = "Burning Amulet",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Burning Amulet.",
		position = 15,
		section = teleportationSection
	)
	default boolean getBurningAmulet()
	{
		return false;
	}

	@ConfigItem(
		keyName = "burningamuletmode",
		name = "Mode",
		description = "",
		position = 16,
		section = teleportationSection,
		hidden = true,
		unhide = "swapburning"
	)
	default BurningAmuletMode getBurningAmuletMode()
	{
		return BurningAmuletMode.BANDIT_CAMP;
	}

	@ConfigItem(
		keyName = "swapxeric",
		name = "Xeric's Talisman",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Xeric's Talisman.",
		position = 17,
		section = teleportationSection
	)
	default boolean getXericsTalisman()
	{
		return false;
	}

	@ConfigItem(
		keyName = "xericstalismanmode",
		name = "Mode",
		description = "",
		position = 18,
		section = teleportationSection,
		hidden = true,
		unhide = "swapxeric"
	)
	default XericsTalismanMode getXericsTalismanMode()
	{
		return XericsTalismanMode.XERICS_LOOKOUT;
	}

	@ConfigItem(
		keyName = "swapwealth",
		name = "Ring of Wealth",
		description = "Swap the left click 'remove' option with the desired teleport location on a worn Ring of Wealth.",
		position = 19,
		section = teleportationSection
	)
	default boolean getRingofWealth()
	{
		return false;
	}

	@ConfigItem(
		keyName = "ringofwealthmode",
		name = "Mode",
		description = "",
		position = 20,
		section = teleportationSection,
		hidden = true,
		unhide = "swapwealth"
	)
	default RingOfWealthMode getRingofWealthMode()
	{
		return RingOfWealthMode.GRAND_EXCHANGE;
	}

	@ConfigItem(
			keyName = "swapConstructionCape",
			name = "Construction Cape",
			description = "Swap the left click option with 'Tele to POH' on a Construction Cape.",
			position = 21,
			section = teleportationSection
	)
	default ConstructionCapeMode getConstructionCapeMode()
	{
		return ConstructionCapeMode.OFF;
	}

	@ConfigItem(
			keyName = "swapCraftingCape",
			name = "Crafting Cape",
			description = "Swap the left click option with 'teleport' on a Crafting Cape.",
			position = 22,
			section = teleportationSection
	)
	default CraftingCapeMode getCraftingCapeMode()
	{
		return CraftingCapeMode.OFF;
	}

	@ConfigItem(
			keyName = "magicCapeMode",
			name = "Magic Cape",
			description = "Swap the left click option with 'spellbook' on a Magic Cape.",
			position = 23,
			section = teleportationSection
	)
	default MagicCapeMode getMagicCapeMode()
	{
		return MagicCapeMode.OFF;
	}

	@ConfigItem(
			keyName = "swapMaxCapeEquipped",
			name = "Max Cape",
			description = "Swap the left click 'remove' option with another on a worn Max Cape.",
			position = 24,
			section = teleportationSection
	)
	default MaxCapeEquippedMode getMaxCapeEquippedMode()
	{
		return MaxCapeEquippedMode.OFF;
	}

	//------------------------------------------------------------//
	// Right Click Options
	//------------------------------------------------------------//

	@ConfigItem(
		keyName = "hideTradeWith",
		name = "Hide 'Trade With'",
		description = "Hides the 'Trade with' option from the right click menu.",
		position = 1,
		section = rightClickOptionsSection
	)
	default boolean hideTradeWith()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hideEmpty",
		name = "Hide 'Empty'",
		description = "Hides the 'Empty' option from the right click menu for potions.",
		position = 2,
		section = rightClickOptionsSection
	)
	default boolean hideEmpty()
	{
		return false;
	}

	//------------------------------------------------------------//
	// PVM
	//------------------------------------------------------------//

	@ConfigItem(
		keyName = "hideCastToB",
		name = "Hide cast in ToB",
		description = "Hides the cast option for clanmates and friends in ToB",
		position = 0,
		section = pvmSection
	)

	default boolean hideCastToB()
	{
		return true;
	}

	@ConfigItem(
		keyName = "hideCastIgnoredToB",
		name = "Ignored spells",
		description = "Spells that should not be hidden from being cast, separated by a comma",
		position = 1,
		section = pvmSection,
		hidden = true,
		unhide = "hideCastToB"
	)
	default String hideCastIgnoredToB()
	{
		return "cure other, energy transfer, heal other, vengeance other";
	}

	@ConfigItem(
		keyName = "hideCastCoX",
		name = "Hide cast in CoX",
		description = "Hides the cast option for clanmates and friends in CoX",
		position = 2,
		section = pvmSection
	)

	default boolean hideCastCoX()
	{
		return true;
	}

	@ConfigItem(
		keyName = "hideCastIgnoredCoX",
		name = "Ignored spells",
		description = "Spells that should not be hidden from being cast, separated by a comma",
		position = 3,
		section = pvmSection,
		hidden = true,
		unhide = "hideCastCoX"
	)
	default String hideCastIgnoredCoX()
	{
		return "cure other, energy transfer, heal other, vengeance other";
	}
}
