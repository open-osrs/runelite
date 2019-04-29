/*
 * Copyright (c) 2018, Devin French <https://github.com/devinfrench>
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
package net.runelite.client.plugins.zulrah.phase;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

import java.awt.Color;

public class ZulrahPhase
{
	private static final Color RANGE_COLOR = new Color(150, 255, 0, 150);
	private static final Color MAGIC_COLOR = new Color(20, 170, 200, 150);
	private static final Color MELEE_COLOR = new Color(180, 50, 20, 150);
	private static final Color JAD_COLOR = new Color(255, 115, 0, 150);

	private ZulrahLocation zulrahLocation;
	private ZulrahType type;
	private boolean jad;
	private SafeLocation safeLocation;

	public ZulrahPhase(ZulrahLocation zulrahLocation, ZulrahType type, boolean jad, SafeLocation safeLocation)
	{
		this.zulrahLocation = zulrahLocation;
		this.type = type;
		this.jad = jad;
		this.safeLocation = safeLocation;
	}

	public static ZulrahPhase valueOf(WorldPoint start, NPC zulrah)
	{
		ZulrahLocation zulrahLocation = ZulrahLocation.valueOf(start, zulrah);
		ZulrahType type = ZulrahType.valueOf(zulrah);
		if (zulrahLocation == null || type == null)
		{
			return null;
		}
		return new ZulrahPhase(zulrahLocation, type, false, SafeLocation.TOP_EAST);
	}

	public ZulrahLocation getZulrahLocation()
	{
		return zulrahLocation;
	}

	public ZulrahType getType()
	{
		return type;
	}

	public boolean isJad()
	{
		return jad;
	}

	public SafeLocation getSafeLocation()
	{
		return safeLocation;
	}

	public WorldPoint getZulrahWorldPoint(WorldPoint start)
	{
		switch (zulrahLocation)
		{
			case SOUTH:
				return new WorldPoint(start.getX() + 2, start.getY() - 9, start.getPlane());
			case EAST:
				return new WorldPoint(start.getX() + 12, start.getY(), start.getPlane());
			case WEST:
				return new WorldPoint(start.getX() - 8, start.getY(), start.getPlane());
		}
		return new WorldPoint(start.getX() + 2, start.getY() + 2, start.getPlane());
	}

	public WorldPoint getSafeWorldPoint(WorldPoint start)
	{
		switch (safeLocation)
		{
			case WEST:
				return new WorldPoint(start.getX() - 3, start.getY() + 2, start.getPlane());
			case EAST:
				return new WorldPoint(start.getX() + 7, start.getY(), start.getPlane());
			case SOUTH:
				return new WorldPoint(start.getX() + 2, start.getY() - 4, start.getPlane());
			case SOUTH_WEST:
				return new WorldPoint(start.getX() - 2, start.getY() - 2, start.getPlane());
			case SOUTH_EAST:
				return new WorldPoint(start.getX() + 4, start.getY() - 4, start.getPlane());
			case TOP_EAST:
				return new WorldPoint(start.getX() + 8, start.getY() + 4, start.getPlane());
			case TOP_WEST:
				return new WorldPoint(start.getX() - 2, start.getY() + 5, start.getPlane());
			case PILLAR_WEST_INSIDE:
				return new WorldPoint(start.getX() - 2, start.getY() - 1, start.getPlane());
			case PILLAR_WEST_OUTSIDE:
				return new WorldPoint(start.getX() - 3, start.getY() - 1, start.getPlane());
			case PILLAR_EAST_INSIDE:
				return new WorldPoint(start.getX() + 6, start.getY() - 1, start.getPlane());
			case PILLAR_EAST_OUTSIDE:
				return new WorldPoint(start.getX() + 6, start.getY() - 2, start.getPlane());
		}
		return start;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
		}
		ZulrahPhase other = (ZulrahPhase) obj;
		return this.jad == other.jad && this.zulrahLocation == other.zulrahLocation && this.type == other.type;
	}

	@Override
	public String toString()
	{
		return "ZulrahPhase{" +
		  "zulrahLocation=" + zulrahLocation +
		  ", type=" + type +
		  ", jad=" + jad +
		  '}';
	}

	public Color getColor()
	{
		if (jad)
		{
			return JAD_COLOR;
		}
		else
		{
			switch (type)
			{
				case RANGE:
					return RANGE_COLOR;
				case MAGIC:
					return MAGIC_COLOR;
				case MELEE:
					return MELEE_COLOR;
			}
		}
		return RANGE_COLOR;
	}

}
