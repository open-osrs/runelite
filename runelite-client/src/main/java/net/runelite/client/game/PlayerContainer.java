/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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
package net.runelite.client.game;

import java.util.LinkedHashMap;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.http.api.hiscore.HiscoreResult;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(exclude = "player")
public class PlayerContainer
{
	private AttackStyle attackStyle;
	private AttackStyle weakness;
	private HiscoreResult skills;
	private LinkedHashMap<Integer, Integer> gear;
	private LinkedHashMap<Integer, Integer> riskedGear;
	private MeleeStyle meleeStyle;
	private Player player;
	private Prayer overhead;
	private String location;
	private String name;
	private String targetString;
	private boolean httpRetry;
	private boolean scouted;
	private int hpLevel;
	private int magicAttack;
	private int magicDefence;
	private int magicStr;
	private int meleeAtkCrush;
	private int meleeAtkSlash;
	private int meleeAtkStab;
	private int meleeAttack;
	private int meleeDefCrush;
	private int meleeDefSlash;
	private int meleeDefStab;
	private int meleeDefence;
	private int meleeStr;
	private int potionBoost;
	private int prayer;
	private int prayerLevel;
	private int rangeAttack;
	private int rangeDefence;
	private int rangeStr;
	private int risk;
	private int scoutTimer;
	private int shield;
	private int speed;
	private int timer;
	private int weapon;
	private int wildyLevel;

	PlayerContainer(Player player)
	{
		this.attackStyle = AttackStyle.UNKNOWN;
		this.gear = new LinkedHashMap<>();
		this.hpLevel = 0;
		this.httpRetry = false;
		this.location = "N/A";
		this.magicAttack = 0;
		this.magicDefence = 0;
		this.magicStr = 0;
		this.meleeAtkCrush = 0;
		this.meleeAtkSlash = 0;
		this.meleeAtkStab = 0;
		this.meleeAttack = 0;
		this.meleeDefCrush = 0;
		this.meleeDefSlash = 0;
		this.meleeDefStab = 0;
		this.meleeDefence = 0;
		this.meleeStr = 0;
		this.meleeStyle = MeleeStyle.STAB;
		this.name = player.getName();
		this.player = player;
		this.potionBoost = 0;
		this.prayer = -1;
		this.prayerLevel = 0;
		this.rangeAttack = 0;
		this.rangeDefence = 0;
		this.rangeStr = 0;
		this.risk = 0;
		this.riskedGear = new LinkedHashMap<>();
		this.scoutTimer = 500;
		this.scouted = false;
		this.shield = 0;
		this.skills = null;
		this.speed = 0;
		this.targetString = "";
		this.timer = 0;
		this.weakness = AttackStyle.UNKNOWN;
		this.weapon = 0;
		this.wildyLevel = 0;
	}

	void reset()
	{
		setSpeed(0);
		setMeleeAtkCrush(0);
		setMeleeAtkStab(0);
		setMeleeAtkSlash(0);
		setMeleeAttack(0);
		setMeleeDefCrush(0);
		setMeleeDefStab(0);
		setMeleeDefSlash(0);
		setMeleeDefence(0);
		setMagicAttack(0);
		setRangeAttack(0);
		setMagicDefence(0);
		setRangeDefence(0);
		setMagicStr(0);
		setMeleeStr(0);
		setRangeStr(0);
		setOverhead(iconToPrayer(getPlayer()));
		setMeleeStyle(MeleeStyle.NONE);
	}

	@Getter(AccessLevel.PACKAGE)
	enum MeleeStyle
	{
		CRUSH,
		SLASH,
		STAB,
		NONE
	}

	private static Prayer iconToPrayer(Player player)
	{
		if (player.getOverheadIcon() != null)
		{
			switch (player.getOverheadIcon())
			{
				case RANGED:
					return Prayer.PROTECT_FROM_MISSILES;
				case MAGIC:
					return Prayer.PROTECT_FROM_MAGIC;
				case MELEE:
					return Prayer.PROTECT_FROM_MELEE;
				case SMITE:
					return Prayer.SMITE;
				case REDEMPTION:
					return Prayer.REDEMPTION;
				case RETRIBUTION:
					return Prayer.RETRIBUTION;
				default:
					return null;
			}
		}
		return null;
	}
}