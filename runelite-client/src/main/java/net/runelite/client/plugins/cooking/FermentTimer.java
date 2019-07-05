/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.cooking;

import java.awt.Color;
import java.awt.Image;
import java.time.Duration;
import java.time.Instant;
import javax.inject.Singleton;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;

@Singleton
final class FermentTimer extends InfoBox
{
	private static final Duration FERMENT_TIME = Duration.ofMillis(13_800);

	private Instant fermentTime;

	FermentTimer(Image image, Plugin plugin)
	{
		super(image, plugin);
		reset();
	}

	@Override
	public String getText()
	{
		int seconds = timeUntilFerment();
		return Integer.toString(seconds);
	}

	@Override
	public Color getTextColor()
	{
		int seconds = timeUntilFerment();
		return seconds <= 3 ? Color.RED : Color.WHITE;
	}

	@Override
	public boolean cull()
	{
		int seconds = timeUntilFerment();
		return seconds <= 0;
	}

	void reset()
	{
		fermentTime = Instant.now().plus(FERMENT_TIME);
	}

	private int timeUntilFerment()
	{
		return (int) Duration.between(Instant.now(), fermentTime).getSeconds();
	}
}
