package net.runelite.api.events;

import net.runelite.api.Actor;
import lombok.Value;

@Value
public class OverheadTextChanged
{
	Actor actor;

	String overheadText;
}