/*
 * Copyright (c) 2019, Bartvollebregt <https://github.com/Bartvollebregt>
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
package net.runelite.client.plugins.maxhit.attackstyle;

import java.util.HashMap;
import java.util.Map;
import static net.runelite.client.plugins.maxhit.attackstyle.AttackStyle.*;

public enum WeaponType
{
	TYPE_0(ACCURATE, AGGRESSIVE, null, DEFENSIVE),
	TYPE_1(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_2(ACCURATE, AGGRESSIVE, null, DEFENSIVE),
	TYPE_3(ACCURATERANGING, RANGING, null, LONGRANGE),
	TYPE_4(ACCURATE, AGGRESSIVE, CONTROLLED, DEFENSIVE),
	TYPE_5(ACCURATERANGING, RANGING, null, LONGRANGE),
	TYPE_6(AGGRESSIVE, RANGING, DEFENSIVE_CASTING, null),
	TYPE_7(ACCURATERANGING, RANGING, null, LONGRANGE),
	TYPE_8(OTHER, AGGRESSIVE, null, null),
	TYPE_9(ACCURATE, AGGRESSIVE, CONTROLLED, DEFENSIVE),
	TYPE_10(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_11(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_12(CONTROLLED, AGGRESSIVE, null, DEFENSIVE),
	TYPE_13(ACCURATE, AGGRESSIVE, null, DEFENSIVE),
	TYPE_14(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_15(CONTROLLED, CONTROLLED, CONTROLLED, DEFENSIVE),
	TYPE_16(ACCURATE, AGGRESSIVE, CONTROLLED, DEFENSIVE),
	TYPE_17(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_18(ACCURATE, AGGRESSIVE, null, DEFENSIVE, CASTING, DEFENSIVE_CASTING),
	TYPE_19(ACCURATERANGING, RANGING, null, LONGRANGE),
	TYPE_20(ACCURATE, CONTROLLED, null, DEFENSIVE),
	TYPE_21(ACCURATE, AGGRESSIVE, null, DEFENSIVE, CASTING, DEFENSIVE_CASTING),
	TYPE_22(ACCURATE, AGGRESSIVE, AGGRESSIVE, DEFENSIVE),
	TYPE_23(CASTING, CASTING, null, DEFENSIVE_CASTING),
	TYPE_24(ACCURATE, AGGRESSIVE, CONTROLLED, DEFENSIVE),
	TYPE_25(CONTROLLED, AGGRESSIVE, null, DEFENSIVE),
	TYPE_26(AGGRESSIVE, AGGRESSIVE, null, AGGRESSIVE),
	TYPE_27(ACCURATE, null, null, OTHER);

	private static final Map<Integer, WeaponType> weaponTypes = new HashMap<>();

	static
	{
		for (WeaponType weaponType : values())
		{
			weaponTypes.put(weaponType.ordinal(), weaponType);
		}
	}

	private final AttackStyle[] attackStyles;

	WeaponType(AttackStyle... attackStyles)
	{
		this.attackStyles = attackStyles;
	}

	public static WeaponType getWeaponType(int id)
	{
		return weaponTypes.get(id);
	}

	public AttackStyle[] getAttackStyles()
	{
		return attackStyles;
	}
}
