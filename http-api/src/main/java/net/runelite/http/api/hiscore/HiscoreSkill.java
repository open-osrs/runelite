/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.http.api.hiscore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import static net.runelite.http.api.hiscore.HiscoreSkillType.SKILL;
import static net.runelite.http.api.hiscore.HiscoreSkillType.ACTIVITY;
import static net.runelite.http.api.hiscore.HiscoreSkillType.BOSS;

@AllArgsConstructor
@Getter
public enum HiscoreSkill
{
	OVERALL("Overall", HiscoreSkillType.OVERALL),
	ATTACK("Attack", SKILL),
	DEFENCE("Defence", SKILL),
	STRENGTH("Strength", SKILL),
	HITPOINTS("Hitpoints", SKILL),
	RANGED("Ranged", SKILL),
	PRAYER("Prayer", SKILL),
	MAGIC("Magic", SKILL),
	COOKING("Cooking", SKILL),
	WOODCUTTING("Woodcutting", SKILL),
	FLETCHING("Fletching", SKILL),
	FISHING("Fishing", SKILL),
	FIREMAKING("Firemaking", SKILL),
	CRAFTING("Crafting", SKILL),
	SMITHING("Smithing", SKILL),
	MINING("Mining", SKILL),
	HERBLORE("Herblore", SKILL),
	AGILITY("Agility", SKILL),
	THIEVING("Thieving", SKILL),
	SLAYER("Slayer", SKILL),
	FARMING("Farming", SKILL),
	RUNECRAFT("Runecraft", SKILL),
	HUNTER("Hunter", SKILL),
	CONSTRUCTION("Construction", SKILL),
	LEAGUE_POINTS("League Points", ACTIVITY),
	BOUNTY_HUNTER_HUNTER("Bounty Hunter - Hunter", ACTIVITY),
	BOUNTY_HUNTER_ROGUE("Bounty Hunter - Rogue", ACTIVITY),
	CLUE_SCROLL_ALL("Clue Scrolls (all)", ACTIVITY),
	CLUE_SCROLL_BEGINNER("Clue Scrolls (beginner)", ACTIVITY),
	CLUE_SCROLL_EASY("Clue Scrolls (easy)", ACTIVITY),
	CLUE_SCROLL_MEDIUM("Clue Scrolls (medium)", ACTIVITY),
	CLUE_SCROLL_HARD("Clue Scrolls (hard)", ACTIVITY),
	CLUE_SCROLL_ELITE("Clue Scrolls (elite)", ACTIVITY),
	CLUE_SCROLL_MASTER("Clue Scrolls (master)", ACTIVITY),
	LAST_MAN_STANDING("Last Man Standing", ACTIVITY),
	ABYSSAL_SIRE("Abyssal Sire", BOSS),
	ALCHEMICAL_HYDRA("Alchemical Hydra", BOSS),
	BARROWS_CHESTS("Barrows Chests", BOSS),
	BRYOPHYTA("Bryophyta", BOSS),
	CALLISTO("Callisto", BOSS),
	CERBERUS("Cerberus", BOSS),
	CHAMBERS_OF_XERIC("Chambers of Xeric", BOSS),
	CHAMBERS_OF_XERIC_CHALLENGE_MODE("Chambers of Xeric: Challenge Mode", BOSS),
	CHAOS_ELEMENTAL("Chaos Elemental", BOSS),
	CHAOS_FANATIC("Chaos Fanatic", BOSS),
	COMMANDER_ZILYANA("Commander Zilyana", BOSS),
	CORPOREAL_BEAST("Corporeal Beast", BOSS),
	CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", BOSS),
	DAGANNOTH_PRIME("Dagannoth Prime", BOSS),
	DAGANNOTH_REX("Dagannoth Rex", BOSS),
	DAGANNOTH_SUPREME("Dagannoth Supreme", BOSS),
	DERANGED_ARCHAEOLOGIST("Deranged Archaeologist", BOSS),
	GENERAL_GRAARDOR("General Graardor", BOSS),
	GIANT_MOLE("Giant Mole", BOSS),
	GROTESQUE_GUARDIANS("Grotesque Guardians", BOSS),
	HESPORI("Hespori", BOSS),
	KALPHITE_QUEEN("Kalphite Queen", BOSS),
	KING_BLACK_DRAGON("King Black Dragon", BOSS),
	KRAKEN("Kraken", BOSS),
	KREEARRA("Kree'Arra", BOSS),
	KRIL_TSUTSAROTH("K'ril Tsutsaroth", BOSS),
	MIMIC("Mimic", BOSS),
	NIGHTMARE("Nightmare", BOSS),
	OBOR("Obor", BOSS),
	SARACHNIS("Sarachnis", BOSS),
	SCORPIA("Scorpia", BOSS),
	SKOTIZO("Skotizo", BOSS),
	THE_GAUNTLET("The Gauntlet", BOSS),
	THE_CORRUPTED_GAUNTLET("The Corrupted Gauntlet", BOSS),
	THEATRE_OF_BLOOD("Theatre of Blood", BOSS),
	THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil", BOSS),
	TZKAL_ZUK("TzKal-Zuk", BOSS),
	TZTOK_JAD("TzTok-Jad", BOSS),
	VENENATIS("Venenatis", BOSS),
	VETION("Vet'ion", BOSS),
	VORKATH("Vorkath", BOSS),
	WINTERTODT("Wintertodt", BOSS),
	ZALCANO("Zalcano", BOSS),
	ZULRAH("Zulrah", BOSS);

	private final String name;
	private final HiscoreSkillType type;
}
