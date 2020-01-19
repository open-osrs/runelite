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
	private int ticksLength;
	@NonFinal
	private TimerType type;
	@NonFinal
	private boolean shutdown = false;

	public Timer(Client client, int length, TimerType type)
	{
		this.client = client;
		this.ticksStart = client.getTickCount();
		this.ticksLength = length;
		this.type = type;
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

		return ticksRemaining() < type.getImmunityLength();
	}

	public int ticksRemainingForDisplay()
	{
		return ticksRemaining() - type.getImmunityLength(); // this will cause all immunities to be negative, making it easier to render later
	}

	public BufferedImage getIcon()
	{
		return isInCooldown() ? type.getCooldownIcon() : type.getIcon();
	}

}
