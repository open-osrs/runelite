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

import lombok.Getter;

public enum FightCavesSpawnLocations
{
	NW(10, 50),
	C(30, 30),
	SE(50, 25),
	S(35, 15),
	SW(10, 15);

	@Getter
	private final int regionX;
	@Getter
	private final int regionY;

	FightCavesSpawnLocations(int regionX, int regionY)
	{
		this.regionX = regionX;
		this.regionY = regionY;
	}

	public static FightCavesSpawnLocations lookup(int spawnValue)
	{
		switch (spawnValue)
		{
			case 0:
			case 5:
			case 9:
				return SE;
			case 1:
			case 4:
			case 10:
				return SW;
			case 2:
			case 8:
			case 13:
				return C;
			case 3:
			case 7:
			case 12:
				return NW;
			case 6:
			case 11:
			case 14:
				return S;
			default:
				return null;
		}
	}
}