package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Actor;

@Value
public class OverheadTextChanged implements Event
{
	private final Actor actor;

	private final String overheadText;
}