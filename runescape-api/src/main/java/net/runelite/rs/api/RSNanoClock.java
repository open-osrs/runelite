package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSNanoClock
{
	@Import("lastTimeNano")
	long getLastTimeNano();

	@Import("lastTimeNano")
	void setLastTimeNano(long lastNanoTime);
}
