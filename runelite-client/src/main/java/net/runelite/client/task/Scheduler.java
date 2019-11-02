/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class Scheduler
{
	private final List<ScheduledMethod> scheduledMethods = new CopyOnWriteArrayList<>();

	@Inject
	ScheduledExecutorService executor;

	public void addScheduledMethod(ScheduledMethod method)
	{
		scheduledMethods.add(method);
	}

	public void removeScheduledMethod(ScheduledMethod method)
	{
		scheduledMethods.remove(method);
	}

	public List<ScheduledMethod> getScheduledMethods()
	{
		return Collections.unmodifiableList(scheduledMethods);
	}

	public void registerObject(Object obj)
	{
		for (Method method : obj.getClass().getDeclaredMethods())
		{
			Schedule schedule = method.getAnnotation(Schedule.class);
			if (schedule == null)
			{
				continue;
			}

			ScheduledMethod scheduledMethod = new ScheduledMethod(schedule, method, obj);
			addScheduledMethod(scheduledMethod);
		}
	}

	public void unregisterObject(Object obj)
	{
		for (ScheduledMethod sm : scheduledMethods)
		{
			if (sm.getObject() == obj)
			{
				removeScheduledMethod(sm);
				break;
			}
		}
	}

	public void tick()
	{
		Instant now = Instant.now();

		for (ScheduledMethod scheduledMethod : scheduledMethods)
		{
			Instant last = scheduledMethod.getLast();

			Duration difference = Duration.between(last, now);

			Schedule schedule = scheduledMethod.getSchedule();
			Duration timeSinceRun = Duration.of(schedule.period(), schedule.unit());

			if (difference.compareTo(timeSinceRun) > 0)
			{
				log.trace("Scheduled task triggered: {}", scheduledMethod);

				scheduledMethod.setLast(now);

				if (schedule.asynchronous())
				{
					executor.submit(() -> run(scheduledMethod));
				}
				else
				{
					run(scheduledMethod);
				}
			}
		}
	}

	private void run(ScheduledMethod scheduledMethod)
	{
		Method method = scheduledMethod.getMethod();

		try
		{
			method.invoke(scheduledMethod.getObject());
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex)
		{
			//log.warn("error invoking scheduled task", ex);
		}
		catch (Exception ex)
		{
			log.warn("error during scheduled task", ex);
		}
	}
}
