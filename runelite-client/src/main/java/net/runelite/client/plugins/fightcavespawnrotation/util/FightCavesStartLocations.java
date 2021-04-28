/*
 * Copyright (c) 2021 Nicole <https://github.com/losingticks>
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
package net.runelite.client.plugins.fightcavespawnrotation.util;

import java.util.EnumSet;
import java.util.HashMap;

public enum FightCavesStartLocations
{
	ROTATION_1(1, 2),
	ROTATION_2(2, 13),
	ROTATION_3(3, 8),
	ROTATION_4(4, 12),
	ROTATION_5(5, 7),
	ROTATION_6(6, 3),
	ROTATION_7(7, 6),
	ROTATION_8(8, 6),
	ROTATION_9(9, 14),
	ROTATION_10(10, 5),
	ROTATION_11(11, 0),
	ROTATION_12(12, 9),
	ROTATION_13(13, 1),
	ROTATION_14(14, 10),
	ROTATION_15(15, 4);

	private final int rotation;
	private final int rsSpawnRotation;

	private static final HashMap<Integer, Integer> lookupMap = new HashMap();

	static
	{
		EnumSet.allOf(FightCavesStartLocations.class).forEach(n -> lookupMap.put(n.getRotation(), n.getrsSpawnRotation()));
	}

	FightCavesStartLocations(int rotation, int rsSpawnRotation)
	{
		this.rotation = rotation;
		this.rsSpawnRotation = rsSpawnRotation;
	}

	public static int translateRotation(int Rotation)
	{
		switch (Rotation)
		{
			case 1:
			{
				return 4;
			}
			case 2:
			{
				return 2;
			}
			case 3:
			{
				return 9;
			}
			case 4:
			{
				return 11;
			}
			case 5:
			{
				return 13;
			}
			case 6:
			{
				return 1;
			}
			case 7:
			{
				return 6;
			}
			case 8:
			{
				return 15;
			}
			case 9:
			{
				return 10;
			}
			case 10:
			{
				return 8;
			}
			case 11:
			{
				return 5;
			}
			case 12:
			{
				return 3;
			}
			case 13:
			{
				return 12;
			}
			case 14:
			{
				return 14;
			}
			case 15:
			{
				return 7;
			}
		}
		return -1;
	}

	public int getRotation()
	{
		return rotation;
	}

	public int getrsSpawnRotation()
	{
		return rsSpawnRotation;
	}

	public static HashMap<Integer, Integer> getLookupMap()
	{
		return lookupMap;
	}
}
