/*
 * Copyright (c) 2021, Jordan Atwood <nightfirecat@protonmail.com>
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
package net.runelite.client.plugins.skillcalculator.skills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
@Getter
public enum RunecraftAction implements ItemSkillAction
{
	AIR_TIARA(ItemID.AIR_TIARA, 1, 25, true),
	MIND_TIARA(ItemID.MIND_TIARA, 1, 27.5f, true),
	WATER_TIARA(ItemID.WATER_TIARA, 1, 30, true),
	EARTH_TIARA(ItemID.EARTH_TIARA, 1, 32.5f, true),
	FIRE_TIARA(ItemID.FIRE_TIARA, 1, 35, true),
	BODY_TIARA(ItemID.BODY_TIARA, 1, 37.5f, true),
	COSMIC_TIARA(ItemID.COSMIC_TIARA, 1, 40, true),
	CHAOS_TIARA(ItemID.CHAOS_TIARA, 1, 42.5f, true),
	NATURE_TIARA(ItemID.NATURE_TIARA, 1, 45, true),
	LAW_TIARA(ItemID.LAW_TIARA, 1, 47.5f, true),
	DEATH_TIARA(ItemID.DEATH_TIARA, 1, 50, true),
	WRATH_TIARA(ItemID.WRATH_TIARA, 1, 52.5f, true),
	AIR_RUNE(ItemID.AIR_RUNE, 1, 5, false),
	MIND_RUNE(ItemID.MIND_RUNE, 2, 5.5f, false),
	MIND_CORE(ItemID.MIND_CORE, 2, 55, false),
	WATER_RUNE(ItemID.WATER_RUNE, 5, 6, false),
	MIST_RUNE(ItemID.MIST_RUNE, 6, 8.5f, false),
	EARTH_RUNE(ItemID.EARTH_RUNE, 9, 6.5f, false),
	DUST_RUNE(ItemID.DUST_RUNE, 10, 9, false),
	MUD_RUNE(ItemID.MUD_RUNE, 13, 9.5f, false),
	FIRE_RUNE(ItemID.FIRE_RUNE, 14, 7, false),
	SMOKE_RUNE(ItemID.SMOKE_RUNE, 15, 9.5f, false),
	STEAM_RUNE(ItemID.STEAM_RUNE, 19, 10, false),
	BODY_RUNE(ItemID.BODY_RUNE, 20, 7.5f, false),
	BODY_CORE(ItemID.BODY_CORE, 20, 75, false),
	LAVA_RUNE(ItemID.LAVA_RUNE, 23, 10.5f, false),
	COSMIC_RUNE(ItemID.COSMIC_RUNE, 27, 8, false),
	CHAOS_RUNE(ItemID.CHAOS_RUNE, 35, 8.5f, false),
	CHAOS_CORE(ItemID.CHAOS_CORE, 35, 85, false),
	ASTRAL_RUNE(ItemID.ASTRAL_RUNE, 40, 8.7f, false),
	NATURE_RUNE(ItemID.NATURE_RUNE, 44, 9, false),
	LAW_RUNE(ItemID.LAW_RUNE, 54, 9.5f, false),
	DEATH_RUNE(ItemID.DEATH_RUNE, 65, 10, false),
	BLOOD_RUNE(ItemID.BLOOD_RUNE, 77, 24.425f, true),
	SOUL_RUNE(ItemID.SOUL_RUNE, 90, 30.325f, true),
	WRATH_RUNE(ItemID.WRATH_RUNE, 95, 8, false),
	;

	private final int itemId;
	private final int level;
	private final float xp;
	private final boolean ignoreBonus;
}
