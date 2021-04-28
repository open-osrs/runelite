/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.theatre;

import lombok.Getter;

/**
 * Represents the four main cardinal points.
 */
public enum Direction
{
	NORTH("N"),
	EAST("E"),
	SOUTH("S"),
	WEST("W"),
	NORTHEAST("NE"),
	NORTHWEST("NW"),
	SOUTHEAST("SE"),
	SOUTHWEST("SW");

	@Getter
	private final String dirName;

	public static Direction getNearestDirection(int angle)
	{
		int round = angle >>> 9;
		int up = angle & 256;
		if (up != 0)
		{
			++round;
		}

		switch (round & 3)
		{
			case 0:
				return SOUTH;
			case 1:
				return WEST;
			case 2:
				return NORTH;
			case 3:
				return EAST;
			default:
				throw new IllegalStateException();
		}
	}

	public static Direction getPreciseDirection(int angle)
	{
		int ordinalDirection = (int)Math.round((double)angle / 256.0D) % 8;
		switch (ordinalDirection)
		{
			case 0:
				return SOUTH;
			case 1:
				return SOUTHWEST;
			case 2:
				return WEST;
			case 3:
				return NORTHWEST;
			case 4:
				return NORTH;
			case 5:
				return NORTHEAST;
			case 6:
				return EAST;
			case 7:
				return SOUTHEAST;
			default:
				throw new IllegalStateException();
		}
	}

	private Direction(String dirName)
	{
		this.dirName = dirName;
	}
}
