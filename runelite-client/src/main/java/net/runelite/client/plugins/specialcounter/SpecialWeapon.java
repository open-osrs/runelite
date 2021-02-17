/*
 * Copyright (c) 2018, Raqes <j.raqes@gmail.com>
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
package net.runelite.client.plugins.specialcounter;

import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
@Getter
enum SpecialWeapon
{
	DRAGON_WARHAMMER("Dragon Warhammer", ItemID.DRAGON_WARHAMMER, false, SpecialCounterConfig::dragonWarhammerThreshold),
	ARCLIGHT("Arclight", ItemID.ARCLIGHT, false, SpecialCounterConfig::arclightThreshold),
	DARKLIGHT("Darklight", ItemID.DARKLIGHT, false, SpecialCounterConfig::darklightThreshold),
	BANDOS_GODSWORD("Bandos Godsword", ItemID.BANDOS_GODSWORD, true, SpecialCounterConfig::bandosGodswordThreshold),
	BANDOS_GODSWORD_OR("Bandos Godsword", ItemID.BANDOS_GODSWORD_OR, true, SpecialCounterConfig::bandosGodswordThreshold),
	BARRELCHEST_ANCHOR("Barrelchest Anchor", ItemID.BARRELCHEST_ANCHOR, true, (c) -> 0),
	BONE_DAGGER("Bone Dagger", ItemID.BONE_DAGGER, true, (c) -> 0),
	BONE_DAGGER_P("Bone Dagger (p)", ItemID.BONE_DAGGER_P, true, (c) -> 0),
	BONE_DAGGER_P8876("Bone Dagger (p+)", ItemID.BONE_DAGGER_P_8876, true, (c) -> 0),
	BONE_DAGGER_P8878("Bone Dagger (p++)", ItemID.BONE_DAGGER_P_8878, true, (c) -> 0),
	DORGESHUUN_CROSSBOW("Dorgeshuun Crossbow", ItemID.DORGESHUUN_CROSSBOW, true, (c) -> 0);

	private final String name;
	private final int itemID;
	private final boolean damage;
	private final Function<SpecialCounterConfig, Integer> threshold;
}