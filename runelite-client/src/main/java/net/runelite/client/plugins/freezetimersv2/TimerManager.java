package net.runelite.client.plugins.freezetimersv2;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;

@Slf4j
@Singleton
public class TimerManager
{
	@Inject
	private Client client;
	private HashMap<Actor, HashMap<TimerType, Timer>> timerMap = new HashMap<>();

	private HashMap<TimerType, Timer> getTimersFor(Actor actor)
	{
		if (!timerMap.containsKey(actor) || timerMap.get(actor) == null)
		{
			timerMap.put(actor, new HashMap<>());
		}
		return timerMap.get(actor);
	}

	public boolean hasTimerActive(Actor actor, TimerType type)
	{
		return getTimerFor(actor, type).isActive();
	}

	public Timer getTimerFor(Actor actor, TimerType type)
	{
		if (getTimersFor(actor).get(type) == null)
		{
			getTimersFor(actor).put(type, new Timer(client, null));
		}
		return getTimersFor(actor).get(type);
	}

	public void setTimerFor(Actor actor, TimerType type, Timer timer)
	{
		timer.setTimerTypeIfNull(type);
		getTimersFor(actor).put(type, timer);
	}

}
