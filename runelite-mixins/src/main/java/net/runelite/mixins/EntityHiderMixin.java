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

import net.runelite.api.NPC;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSScene;

@Mixin(RSScene.class)
public abstract class EntityHiderMixin implements RSScene
{
	@Shadow("client")
	private static RSClient client;

	@Copy("newGameObject")
	@Replace("newGameObject")
	boolean copy$addEntityMarker(int var1, int var2, int var3, int var4, int var5, int x, int y, int var8, RSRenderable entity, int var10, boolean var11, long var12, int var13)
	{
		final boolean shouldDraw = client.getCallbacks().draw(entity, false);

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
		if (client.getCallbacks().draw(actor, true))
		{
			copy$draw2DExtras(actor, var1, var2, var3, var4, var5);
		}
	}

	@Copy("addPlayerToMenu")
	@Replace("addPlayerToMenu")
	static void copy$addPlayerToMenu(RSPlayer var0, int var1, int var2, int var3)
	{
		if (client.getCallbacks().draw(var0, false))
		{
			copy$addPlayerToMenu(var0, var1, var2, var3);
		}
	}

	@Copy("addNpcToMenu")
	@Replace("addNpcToMenu")
	static void copy$addNpcToMenu(NPC var0, int var1, int var2, int var3)
	{
		if (client.getCallbacks().draw(var0, false))
		{
			copy$addNpcToMenu(var0, var1, var2, var3);
		}
	}
}
