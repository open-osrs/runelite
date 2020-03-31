package net.runelite.client.eventbus;

import io.reactivex.rxjava3.functions.Consumer;
import lombok.Value;

@Value
public class Subscription
{
	Class type;
	Consumer method;
	int takeUntil;
	EventScheduler subscribe;
	EventScheduler observe;

	@SuppressWarnings("unchecked")
	public void subscribe(EventBus eventBus, Object lifecycle)
	{
		eventBus.subscribe(type, lifecycle, method, takeUntil, subscribe, observe);
	}
}