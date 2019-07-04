/*
 * Copyright (c) 2018, Tim Lehner <Timothy.Lehner.2011@live.rhul.ac.uk>
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
package net.runelite.client.plugins.raidsthieving.BatSolver;

// There are three distinct Thieving rooms, distinguished by the position of the entrance relative to the exit
// e.g. If you enter the room and must turn left to get to the exit and trough, this is a LEFT_TURN

import net.runelite.client.plugins.raidsthieving.InstancePoint;

public enum ThievingRoomType
{
	LEFT_TURN(3271, 5389),
	RIGHT_TURN(3350, 5399),
	STRAIGHT(3317, 5397);

	private final int x;
	private final int y;

	ThievingRoomType(final int x, final int y)
	{
		this.x = x;
		this.y = y;
	}

	public static ThievingRoomType identifyByInstancePoint(InstancePoint point)
	{
		for (ThievingRoomType type : ThievingRoomType.values())
		{
			if (Math.abs(type.x - point.getX()) <= 1 &&
				Math.abs(type.y - point.getY()) <= 1)
			{
				return type;
			}
		}

		return null;
	}

}
