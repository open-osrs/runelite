/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.mixins;

import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import net.runelite.api.HeadIcon;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.SkullIcon;
import static net.runelite.api.SkullIcon.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.OverheadPrayerChanged;
import net.runelite.api.events.PlayerChanged;
import net.runelite.api.events.PlayerCompositionChanged;
import net.runelite.api.events.PlayerSkullChanged;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSUsername;

@Mixin(RSPlayer.class)
public abstract class RSPlayerMixin implements RSPlayer
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private boolean friended;

	@Inject
	private int oldHeadIcon = -2;

	@Inject
	private int oldSkullIcon = -2;

	@Inject
	@Override
	public String getName()
	{
		final RSUsername rsName = getRsName();

		if (rsName == null)
		{
			return null;
		}

		String name = rsName.getName();

		if (name == null)
		{
			return null;
		}

		return name.replace('\u00A0', ' ');
	}

	@Inject
	@FieldHook("headIconPrayer")
	public void prayerChanged(int idx)
	{
		if (getRsOverheadIcon() != oldHeadIcon)
		{
			final HeadIcon headIcon = getHeadIcon(getRsOverheadIcon());
			client.getCallbacks().post(
				new OverheadPrayerChanged(this, getHeadIcon(oldHeadIcon), headIcon));
		}
		oldHeadIcon = getRsOverheadIcon();
	}

	@Inject
	@Override
	public HeadIcon getOverheadIcon()
	{
		return getHeadIcon(getRsOverheadIcon());
	}

	@Inject
	@FieldHook("headIconPk")
	public void skullChanged(int idx)
	{
		final SkullIcon skullIcon = skullFromInt(getRsSkullIcon());
		if (getRsSkullIcon() != oldSkullIcon)
		{
			client.getCallbacks().post(
				new PlayerSkullChanged(this, skullFromInt(getRsSkullIcon()), skullIcon));
		}
		oldSkullIcon = getRsSkullIcon();
	}

	@Inject
	@Override
	public SkullIcon getSkullIcon()
	{
		return skullFromInt(getRsSkullIcon());
	}

	@Inject
	private HeadIcon getHeadIcon(int overheadIcon)
	{
		if (overheadIcon == -1)
		{
			return null;
		}

		return HeadIcon.values()[overheadIcon];
	}

	@Inject
	private SkullIcon skullFromInt(int skull)
	{
		switch (skull)
		{
			case 0:
				return SKULL;
			case 1:
				return SKULL_FIGHT_PIT;
			case 8:
				return DEAD_MAN_FIVE;
			case 9:
				return DEAD_MAN_FOUR;
			case 10:
				return DEAD_MAN_THREE;
			case 11:
				return DEAD_MAN_TWO;
			case 12:
				return DEAD_MAN_ONE;
			default:
				return null;
		}
	}

	@Inject
	@Override
	public Polygon[] getPolygons()
	{
		Model model = getModel();

		if (model == null)
		{
			return null;
		}

		int[] x2d = new int[model.getVerticesCount()];
		int[] y2d = new int[model.getVerticesCount()];

		int localX = getX();
		int localY = getY();

		final int tileHeight = Perspective.getTileHeight(client, new LocalPoint(localX, localY), client.getPlane());

		Perspective.modelToCanvas(client, model.getVerticesCount(), localX, localY, tileHeight, getOrientation(), model.getVerticesX(), model.getVerticesZ(), model.getVerticesY(), x2d, y2d);
		ArrayList polys = new ArrayList(model.getTrianglesCount());

		int[] trianglesX = model.getTrianglesX();
		int[] trianglesY = model.getTrianglesY();
		int[] trianglesZ = model.getTrianglesZ();

		for (int triangle = 0; triangle < model.getTrianglesCount(); ++triangle)
		{
			int[] xx =
				{
					x2d[trianglesX[triangle]], x2d[trianglesY[triangle]], x2d[trianglesZ[triangle]]
				};

			int[] yy =
				{
					y2d[trianglesX[triangle]], y2d[trianglesY[triangle]], y2d[trianglesZ[triangle]]
				};

			polys.add(new Polygon(xx, yy, 3));
		}

		return (Polygon[]) polys.toArray(new Polygon[0]);
	}

	@Inject
	@Override
	public Shape getConvexHull()
	{
		RSModel model = getModel();
		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(client, new LocalPoint(getX(), getY()), client.getPlane());

		return model.getConvexHull(getX(), getY(), getOrientation(), tileHeight);
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("getModel")
	@Replace("getModel")
	public RSModel copy$getModel()
	{
		if (!client.isInterpolatePlayerAnimations())
		{
			return copy$getModel();
		}
		int actionFrame = getActionFrame();
		int poseFrame = getPoseFrame();
		int spotAnimFrame = getSpotAnimFrame();
		try
		{
			// combine the frames with the frame cycle so we can access this information in the sequence methods
			// without having to change method calls
			setActionFrame(Integer.MIN_VALUE | getActionFrameCycle() << 16 | actionFrame);
			setPoseFrame(Integer.MIN_VALUE | getPoseFrameCycle() << 16 | poseFrame);
			setSpotAnimFrame(Integer.MIN_VALUE | getSpotAnimationFrameCycle() << 16 | spotAnimFrame);
			return copy$getModel();
		}
		finally
		{
			// reset frames
			setActionFrame(actionFrame);
			setPoseFrame(poseFrame);
			setSpotAnimFrame(spotAnimFrame);
		}
	}

	@Inject
	public boolean isFriended()
	{
		return isFriend() || friended;
	}

	@Inject
	@MethodHook(value = "checkIsFriend", end = true)
	void updateFriended()
	{
		friended = client.getFriendManager().isFriended(getRsName(), false);
	}

	@Inject
	@MethodHook(value = "read", end = true)
	void postRead(RSBuffer var1)
	{
		client.getCallbacks().post(new PlayerChanged(this));
	}
	
	@Copy("read")
	@Replace("read")
	@SuppressWarnings("InfiniteRecursion")
	public void copy$read(RSBuffer buffer)
	{
		final long appearanceHash = getPlayerComposition() == null ? 0 : getPlayerComposition().getHash();

		this.copy$read(buffer);

		if (client.isComparingAppearance() && getPlayerComposition().getHash() != appearanceHash)
		{
			client.getCallbacks().post(new PlayerCompositionChanged(this));
		}
	}
}
