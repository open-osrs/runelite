/*
 * Copyright (c) 2019, Lotto <https://github.com/devLotto>
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

import net.runelite.api.HealthBarOverride;
import net.runelite.api.events.PostHealthBar;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSHealthBar;
import net.runelite.rs.api.RSSpritePixels;

@Mixin(RSHealthBar.class)
public abstract class RSHealthBarMixin implements RSHealthBar
{
	// Larger values are used for bosses like Corporeal Beast
	private static final int DEFAULT_HEALTH_SCALE = 30;

	@Shadow("clientInstance")
	private static RSClient client;

	@Shadow("healthBarOverride")
	private static HealthBarOverride healthBarOverride;

	@Copy("getHealthBarBackSprite")
	abstract RSSpritePixels rs$getHealthBarBackSprite();

	@Replace("getHealthBarBackSprite")
	public RSSpritePixels rl$getHealthBarBackSprite()
	{
		/*
		 * If this combat info already uses sprites for health bars,
		 * use those instead, and don't override.
		 */
		RSSpritePixels pixels = rs$getHealthBarBackSprite();
		if (pixels != null)
		{
			return pixels;
		}

		if (healthBarOverride == null)
		{
			return null;
		}

		return getHealthScale() == DEFAULT_HEALTH_SCALE
			? (RSSpritePixels) healthBarOverride.backSprite
			: (RSSpritePixels) healthBarOverride.backSpriteLarge;
	}

	@Copy("getHealthBarFrontSprite")
	abstract RSSpritePixels rs$getHealthBarFrontSprite();

	@Replace("getHealthBarFrontSprite")
	public RSSpritePixels rl$getHealthBarFrontSprite()
	{
		/*
		 * If this combat info already uses sprites for health bars,
		 * use those instead, and don't override.
		 */
		RSSpritePixels pixels = rs$getHealthBarFrontSprite();
		if (pixels != null)
		{
			return pixels;
		}

		if (healthBarOverride == null)
		{
			return null;
		}

		// 30 is the default size, large is for bosses like Corporeal Beast
		return getHealthScale() == DEFAULT_HEALTH_SCALE
			? (RSSpritePixels) healthBarOverride.frontSprite
			: (RSSpritePixels) healthBarOverride.frontSpriteLarge;
	}

	@MethodHook(value = "read", end = true)
	@Inject
	public void onRead(RSBuffer buffer)
	{
		PostHealthBar postHealthBar = new PostHealthBar();
		postHealthBar.setHealthBar(this);
		client.getCallbacks().post(postHealthBar);
	}
}
