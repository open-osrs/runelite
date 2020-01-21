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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.NonFinal;
import net.runelite.api.Client;
import java.awt.image.BufferedImage;

@Value
@Getter(AccessLevel.NONE)
public class Timer
{
	private Client client;
	private int ticksStart;
	private long startMillis;
	private int ticksLength;
	private int cooldownLength;
	@NonFinal
	private TimerType type;
	@NonFinal
	private boolean shutdown = false;

	public Timer(Client client, PlayerSpellEffect effect)
	{
		this.client = client;
		this.ticksStart = client.getTickCount();
		this.startMillis = System.currentTimeMillis();
		this.ticksLength = effect == null ? 0 : effect.getTimerLengthTicks();
		this.cooldownLength = effect == null ? 0 : effect.getType().getImmunityLength();
		this.type = effect == null ? null : effect.getType();
	}

	public void setTimerTypeIfNull(TimerType set)
	{
		if (type == null)
		{
			type = set;
		}
	}

	private int ticksRemaining()
	{
		int ticksElapsed = client.getTickCount() - ticksStart;

		return ticksLength - ticksElapsed;
	}

	public boolean isActive()
	{
		return ticksRemaining() > 0;
	}

	public boolean isInCooldown()
	{
		if (!isActive())
		{
			return false;
		}

		return ticksRemaining() < (type == null ? 0 : type.getImmunityLength());
	}

	public long millisRemainingForDisplay()
	{
		return -1;
		/*long millisRemaining = (ticksLength * 600) - (System.currentTimeMillis() - startMillis);
		return millisRemaining - ((type == null ? 0 : type.getImmunityLength()) * 600); // this will cause all immunities to be negative, making it easier to render later
	*/}

	public BufferedImage getIcon()
	{
		return isInCooldown() ? type.getCooldownIcon() : type.getIcon();
	}

}
