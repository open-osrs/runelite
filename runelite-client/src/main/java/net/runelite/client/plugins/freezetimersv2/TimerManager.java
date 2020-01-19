package net.runelite.client.plugins.freezetimersv2;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;

@Slf4j
@Singleton
public class TimerManager
{
	@Inject
	private Client client;

	private HashMap<Player, HashMap<TimerType, Timer>> timerMap = new HashMap<>();

	private HashMap<TimerType, Timer> getTimersFor(Player player)
	{
		if (!timerMap.containsKey(player) || timerMap.get(player) == null)
		{
			timerMap.put(player, new HashMap<>());
		}
		return timerMap.get(player);
	}

	public boolean hasTimerActive(Player player, TimerType type)
	{
		return getTimerFor(player, type).isActive();
	}

	public Timer getTimerFor(Player player, TimerType type)
	{
		if (getTimersFor(player).get(type) == null)
		{
			getTimersFor(player).put(type, new Timer(client, 0, type));
		}
		return getTimersFor(player).get(type);
	}

	public void setTimerFor(Player player, TimerType type, Timer timer)
	{
		timer.setTimerTypeIfNull(type);
		getTimersFor(player).put(type, timer);
	}

}
