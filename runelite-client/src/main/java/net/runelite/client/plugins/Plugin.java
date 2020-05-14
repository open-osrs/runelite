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
package net.runelite.client.plugins;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import io.reactivex.rxjava3.functions.Consumer;
import io.sentry.Sentry;
import java.lang.reflect.Method;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.Event;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.EventScheduler;
import net.runelite.client.eventbus.Subscribe;
import org.pf4j.ExtensionPoint;

@Slf4j
public abstract class Plugin implements Module, ExtensionPoint
{
	private final Set<Subscription> annotatedSubscriptions = findSubscriptions();
	private final Object annotatedSubsLock = new Object();

	@Getter(AccessLevel.PROTECTED)
	protected Injector injector;

	@Override
	public void configure(Binder binder)
	{
	}

	protected void startUp() throws Exception
	{
	}

	protected void shutDown() throws Exception
	{
	}

	@SuppressWarnings("unchecked")
	final void addAnnotatedSubscriptions(EventBus eventBus)
	{
		annotatedSubscriptions.forEach(sub -> eventBus.subscribe(sub.type, annotatedSubsLock, sub.method, sub.takeUntil, sub.subscribe, sub.observe));
	}

	final void removeAnnotatedSubscriptions(EventBus eventBus)
	{
		eventBus.unregister(annotatedSubsLock);
	}

	private Set<Subscription> findSubscriptions()
	{
		ImmutableSet.Builder<Subscription> builder = ImmutableSet.builder();

		for (Method method : this.getClass().getDeclaredMethods())
		{
			Subscribe annotation = method.getAnnotation(Subscribe.class);
			if (annotation == null)
			{
				continue;
			}

			assert method.getParameterCount() == 1 : "Methods annotated with @Subscribe should have only one parameter";

			Class<?> type = method.getParameterTypes()[0];

			assert Event.class.isAssignableFrom(type) : "Parameters of methods annotated with @Subscribe should implement net.runelite.api.events.Event";
			assert method.getReturnType() == void.class : "Methods annotated with @Subscribe should have a void return type";
			if (method.getExceptionTypes().length != 0)
			{
				log.warn("Event handlers should handle all checked exceptions themselves " + method.toString());
				Sentry.capture("EventHandler " + method.toString()); // Spam Owain's inbox with this :)
			}

			method.setAccessible(true);

			Subscription sub = new Subscription(type.asSubclass(Event.class), event -> method.invoke(this, event), annotation.takeUntil(), annotation.subscribe(), annotation.observe());

			builder.add(sub);
		}

		return builder.build();
	}

	@Value
	@SuppressWarnings("rawtypes")
	private static class Subscription
	{
		Class type;
		Consumer method;
		int takeUntil;
		EventScheduler subscribe;
		EventScheduler observe;
	}

	public void resetConfiguration()
	{
	}
}
