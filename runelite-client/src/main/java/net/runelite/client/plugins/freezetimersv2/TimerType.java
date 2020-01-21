/*
 * Copyright (c) 2020 ThatGamerBlue
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
package net.runelite.client.plugins.freezetimersv2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.util.ImageUtil;
import java.awt.image.BufferedImage;

@Getter
@RequiredArgsConstructor
public enum TimerType
{
	FREEZE(5, loadImage("freeze"), loadImage("freezeimmune"), "freezeTimers"), // 3 seconds
	TELEBLOCK(100, loadImage("teleblock"), loadImage("teleblockimmune"), "teleblockTimers"), // this is 60 seconds, might be wrong
	VENG(0, loadImage("veng"), null, "vengTimers");

	private final int immunityLength;
	private final BufferedImage icon;
	private final BufferedImage cooldownIcon;
	private final String renderConfig;

	private static BufferedImage loadImage(String name)
	{
		return ImageUtil.getResourceStreamFromClass(FreezeTimersV2Plugin.class, name + ".png");
	}

	public boolean shouldRender(ConfigManager configManager)
	{
		return configManager.getConfiguration("freezetimersv2", renderConfig, Boolean.class);
	}
}
