package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.DialogOption;

@Value
public class DialogProcessed
{
	DialogOption dialogOption;
}