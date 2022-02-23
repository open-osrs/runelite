/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * Copyright (c) 2019, ThatGamerBlue <thatgamerblue@gmail.com>
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

import java.util.HashMap;
import java.util.Map;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.*;

import java.util.List;

@Mixin(RSScene.class)
public abstract class EntityHiderMixin implements RSScene
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("isHidingEntities")
	private static boolean isHidingEntities;

	@Shadow("hideOthers")
	private static boolean hideOthers;

	@Shadow("hideOthers2D")
	private static boolean hideOthers2D;

	@Shadow("hideFriends")
	private static boolean hideFriends;

	@Shadow("hideClanMates")
	private static boolean hideClanMates;

	@Shadow("hideClanChatMembers")
	private static boolean hideClanChatMembers;

	@Shadow("hideLocalPlayer")
	private static boolean hideLocalPlayer;

	@Shadow("hideLocalPlayer2D")
	private static boolean hideLocalPlayer2D;

	@Shadow("hideIgnores")
	private static boolean hideIgnores;

	@Shadow("hideNPCs")
	private static boolean hideNPCs;

	@Shadow("hideSpecificPlayers")
	private static List<String> hideSpecificPlayers;

	@Shadow("hideNPCs2D")
	private static boolean hideNPCs2D;

	@Shadow("hidePets")
	private static boolean hidePets;

	@Shadow("hideAttackers")
	private static boolean hideAttackers;

	@Shadow("hideProjectiles")
	private static boolean hideProjectiles;

	@Shadow("hideDeadNPCs")
	private static boolean hideDeadNPCs;

	@Shadow("hiddenNpcsName")
	private static HashMap<String, Integer> hiddenNpcsName;

	@Shadow("hiddenNpcIndices")
	private static List<Integer> hiddenNpcIndices;

	@Copy("newGameObject")
	@Replace("newGameObject")
	boolean copy$addEntityMarker(int var1, int var2, int var3, int var4, int var5, int x, int y, int var8, RSRenderable entity, int var10, boolean var11, long var12, int var13)
	{
		final boolean shouldDraw = shouldDraw(entity, false);

		if (!shouldDraw)
		{
			final int tileX = x >> 7;
			final int tileY = y >> 7;
			/*
			 * Set the 'occupied' tick to -1, to reset the tile being 'occupied',
			 * making the game think an entity hasn't been rendered at the location yet.
			 */
			client.getOccupiedTilesTick()[tileX][tileY] = -1;
		}

		return shouldDraw &&
			copy$addEntityMarker(var1, var2, var3, var4, var5, x, y, var8, entity, var10, var11, var12, var13);
	}

	@Copy("drawActor2d")
	@Replace("drawActor2d")
	private static void copy$draw2DExtras(RSActor actor, int var1, int var2, int var3, int var4, int var5)
	{
		if (shouldDraw(actor, true))
		{
			copy$draw2DExtras(actor, var1, var2, var3, var4, var5);
		}
	}

	@Inject
	private static boolean shouldDraw(Object entity, boolean drawingUI)
	{
		if (!isHidingEntities)
		{
			return true;
		}

		if (entity instanceof RSRenderable)
		{
			if (((RSRenderable) entity).isHidden())
			{
				return false;
			}
		}

		if (entity instanceof RSPlayer)
		{
			RSPlayer player = (RSPlayer) entity;
			RSPlayer local = client.getLocalPlayer();
			if (player.getName() == null)
			{
				return true;
			}

			if (player == local)
			{
				return drawingUI ? !hideLocalPlayer2D : !hideLocalPlayer;
			}

			for (String name : hideSpecificPlayers)
			{
				if (name != null && !name.equals(""))
				{
					if (player.getName() != null && player.getName().equalsIgnoreCase(name))
					{
						return false;
					}
				}
			}

			if (hideAttackers && player.getInteracting() == local)
			{
				return false;
			}

			if (player.isFriend())
			{
				return !hideFriends;
			}

			if (player.isFriendsChatMember())
			{
				return !hideClanMates;
			}

			if (player.isClanMember())
			{
				return !hideClanChatMembers;
			}

			if (client.getFriendManager().isIgnored(player.getRsName()))
			{
				return !hideIgnores;
			}

			return drawingUI ? !hideOthers2D : !hideOthers;
		}
		else if (entity instanceof RSNPC)
		{
			RSNPC npc = (RSNPC) entity;

			if (hiddenNpcIndices.contains(npc.getIndex()))
			{
				return false;
			}

			for (Map.Entry<String, Integer> entry : hiddenNpcsName.entrySet())
			{
				String name = entry.getKey();
				int count = entry.getValue();
				if (name != null && !name.equals(""))
				{
					if (count > 0 && npc.getName() != null && npc.getName().equalsIgnoreCase(name))
					{
						return false;
					}
				}
			}

			if (npc.isDead() && hideDeadNPCs)
			{
				return false;
			}

			if (npc.getComposition().isFollower() && npc.getIndex() != client.getFollowerIndex() && hidePets)
			{
				return false;
			}

			if (npc.getInteracting() == client.getLocalPlayer() && hideAttackers)
			{
				return false;
			}

			return drawingUI ? !hideNPCs2D : !hideNPCs;
		}
		else if (entity instanceof RSProjectile)
		{
			return !hideProjectiles;
		}

		return true;
	}
}
