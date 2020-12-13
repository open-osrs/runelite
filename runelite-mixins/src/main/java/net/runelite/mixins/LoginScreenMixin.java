/*
 * Copyright (c) 2020, Owain van Brakel <https://github.com/Owain94>
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

import net.runelite.api.GameState;
import net.runelite.api.SpritePixels;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class LoginScreenMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static boolean shouldRenderLoginScreenFire = true;

	@Inject
	private static SpritePixels loginScreenBackground;

	@Inject
	public void setShouldRenderLoginScreenFire(boolean shouldRender)
	{
		shouldRenderLoginScreenFire = shouldRender;
	}

	@Inject
	public boolean shouldRenderLoginScreenFire()
	{
		return shouldRenderLoginScreenFire;
	}

	@Inject
	public void setLoginScreen(SpritePixels background)
	{
		assert client.isClientThread() : "setLoginScreen must be called on client thread";

		loginScreenBackground = background;
		client.clearLoginScreen(false);
		if (client.getGameState() == GameState.LOGIN_SCREEN)
		{
			try
			{
				client.setGameState(GameState.UNKNOWN);
			}
			finally
			{
				client.setGameState(GameState.LOGIN_SCREEN);
			}
		}
	}

	@Inject
	@FieldHook("leftTitleSprite")
	static void setLeftTitleSprite(int idx)
	{
		SpritePixels loginscreen = loginScreenBackground;

		if (loginscreen != null)
		{
			client.setLeftTitleSprite(loginscreen);
		}
	}

	@Inject
	@FieldHook("rightTitleSprite")
	static void setRightTitleSprite(int idx)
	{
		SpritePixels loginscreen = loginScreenBackground;

		if (loginscreen != null && loginscreen.getWidth() > 383)
		{
			client.setRightTitleSprite(client.createSpritePixels(new int[]{loginscreen.getPixels()[383]}, 1, 1));
		}
	}
}
