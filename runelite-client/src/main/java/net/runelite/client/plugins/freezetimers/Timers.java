/*
 * Copyright (c) 2019, pklite <https://github.com/pklite/pklite>
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
package net.runelite.client.plugins.freezetimers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;

@Slf4j
@Singleton
public class Timers
{
	private final Map<Actor, HashMap<TimerType, Long>> timerMap = new HashMap<>();

	public void setTimerEnd(Actor actor, TimerType type, long n)
	{
		if (!timerMap.containsKey(actor))
		{
			timerMap.put(actor, new HashMap<>());
		}

		timerMap.get(actor).put(type, n + type.getImmunityTime());
	}

	public void setTimerReApply(Actor actor, TimerType type, long n)
	{
		if (!timerMap.containsKey(actor))
		{
			timerMap.put(actor, new HashMap<>());
		}

		timerMap.get(actor).put(type, n);
	}

	public long getTimerEnd(Actor actor, TimerType type)
	{
		if (!timerMap.containsKey(actor))
		{
			return 0;
		}

		return timerMap.get(actor).getOrDefault(type, (long) type.getImmunityTime()) - type.getImmunityTime();
	}

	public long getTimerReApply(Actor actor, TimerType type)
	{
		if (!timerMap.containsKey(actor))
		{
			return 0;
		}

		return timerMap.get(actor).getOrDefault(type, (long) 0);
	}

	public List<Actor> getAllActorsOnTimer(TimerType type)
	{
		List<Actor> actors = new ArrayList<Actor>();

		for (Actor actor : timerMap.keySet())
		{
			if (areAllTimersZero(actor))
			{
				continue;
			}

			final long end = getTimerReApply(actor, type);

			if (end > System.currentTimeMillis())
			{
				actors.add(actor);
			}
		}

		return actors;
	}

	public boolean areAllTimersZero(Actor actor)
	{
		final Iterator<Map.Entry<Actor, HashMap<TimerType, Long>>> timerIterator = timerMap.entrySet().iterator();

		while(timerIterator.hasNext())
		{
			final Map.Entry<Actor, HashMap<TimerType, Long>> timerEntry = timerIterator.next();

			final Iterator<Map.Entry<TimerType, Long>> typeIterator = timerEntry.getValue().entrySet().iterator();

			while(typeIterator.hasNext())
			{
				final Map.Entry<TimerType, Long> typeEntry = typeIterator.next();

				if (getTimerReApply(actor, typeEntry.getKey()) > System.currentTimeMillis())
				{
					return false;
				}
			}
		}

		timerMap.remove(actor);

		return true;
	}
}
