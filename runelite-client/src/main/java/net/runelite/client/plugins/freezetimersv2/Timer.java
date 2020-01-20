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
	@NonFinal
	private TimerType type;
	@NonFinal
	private boolean shutdown = false;

	public Timer(Client client, PlayerSpellEffect effect)
	{
		this.client = client;
		this.ticksStart = client.getTickCount();
		this.startMillis = System.currentTimeMillis();
		this.ticksLength = effect == null ? 0 : effect.getTimerLengthTicks() + effect.getType().getImmunityLength();
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
