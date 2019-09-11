package net.runelite.client.plugins.statustimers;

import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.Player;
import net.runelite.api.Prayer;

@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
class Victim
{
	private final String name;
	private final Actor actor;
	private Prayer currentPrayer;
	private Prayer lastPrayer;
	private int spotAnim;
	private int spotAnimLastTick;
	private int overlaysDrawn;
	private Map<TimerType, Integer> timerMap;
	private Map<TimerType, Integer> immunityMap;

	Victim(Actor actor)
	{
		this.name = actor.getName();
		this.actor = actor;
		this.currentPrayer = null;
		this.lastPrayer = null;
		this.spotAnim = -1;
		this.spotAnimLastTick = -1;
		this.overlaysDrawn = 0;
		this.timerMap = new HashMap<>();
		this.immunityMap = new HashMap<>();
	}

	void update()
	{
		setLastPrayer(getCurrentPrayer());
		setSpotAnimLastTick(getSpotAnim());
		setCurrentPrayer(updatePrayer(getActor()));
		setSpotAnim(getActor().getSpotAnimation());
	}

	void timerToImmunity(int ticks)
	{
		for (TimerType type : TimerType.values())
		{
			if (!getTimerMap().containsKey(type))
			{
				continue;
			}

			final int dur = getTimerMap().get(type);

			if (dur <= ticks)
			{
				getTimerMap().remove(type);
				if (type.getImmunityTime() != -1)
				{
					getImmunityMap().put(type, ticks + type.getImmunityTime());
				}
			}
		}
		immunityCheck(ticks);
	}

	private void immunityCheck(int ticks)
	{
		for (TimerType type : TimerType.values())
		{
			if (!getImmunityMap().containsKey(type))
			{
				continue;
			}

			final int dur = getImmunityMap().get(type);

			if (dur <= ticks)
			{
				getImmunityMap().remove(type);
			}
		}
	}

	private Prayer updatePrayer(Actor actor)
	{
		if (actor instanceof NPC)
		{
			final NPCDefinition def = ((NPC) actor).getDefinition();
			if (def == null)
			{
				return null;
			}
			final HeadIcon icon = def.getOverheadIcon();
			if (icon == null)
			{
				return null;
			}
			return headIconToPrayer(def.getOverheadIcon());
		}
		else if (actor instanceof Player)
		{
			final HeadIcon icon = ((Player) actor).getOverheadIcon();
			if (icon == null)
			{
				return null;
			}
			return headIconToPrayer(icon);
		}
		return null;
	}

	private Prayer headIconToPrayer(HeadIcon icon)
	{
		switch (icon)
		{
			case MELEE:
				return Prayer.PROTECT_FROM_MELEE;
			case RANGED:
				return Prayer.PROTECT_FROM_MISSILES;
			case MAGIC:
				return Prayer.PROTECT_FROM_MAGIC;
			case RETRIBUTION:
				return Prayer.RETRIBUTION;
			case SMITE:
				return Prayer.SMITE;
			case REDEMPTION:
				return Prayer.REDEMPTION;
			default:
				return null;
		}
	}
}
