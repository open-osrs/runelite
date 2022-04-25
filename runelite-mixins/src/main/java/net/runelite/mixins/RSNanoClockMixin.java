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

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNanoClock;

@Mixin(RSNanoClock.class)
public abstract class RSNanoClockMixin implements RSNanoClock
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private long tmpNanoTime;

	@Copy("wait")
	@Replace("wait")
	public int copy$wait(int cycleDurationMillis, int var2)
	{
		if (client.isUnlockedFps() && client.getRSGameState() >= 25)
		{
			long nanoTime = System.nanoTime();

			if (nanoTime >= getLastTimeNano() && nanoTime >= tmpNanoTime)
			{
				long cycleDuration;
				long diff;

				if (client.getUnlockedFpsTarget() > 0L)
				{
					cycleDuration = nanoTime - tmpNanoTime;
					diff = client.getUnlockedFpsTarget() - cycleDuration;
					diff /= 1000000L;
					if (diff > 0L)
					{
						try
						{
							if (diff % 10L == 0L)
							{
								Thread.sleep(diff - 1L);
								Thread.sleep(1L);
							}
							else
							{
								Thread.sleep(diff);
							}
						}
						catch (InterruptedException var22)
						{
						}

						nanoTime = System.nanoTime();
					}
				}

				tmpNanoTime = nanoTime;

				cycleDuration = (long) cycleDurationMillis * 1000000L;
				diff = nanoTime - getLastTimeNano();

				int cycles = (int) (diff / cycleDuration);

				setLastTimeNano(getLastTimeNano() + (long) cycles * cycleDuration);

				if (cycles > 10)
				{
					cycles = 10;
				}

				return cycles;
			}
			else
			{
				setLastTimeNano(tmpNanoTime = nanoTime);

				return 1;
			}
		}
		else
		{
			return copy$wait(cycleDurationMillis, var2);
		}
	}
}
