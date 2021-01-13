package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.DialogOption;

@Value
public class DialogProcessed implements Event
{
    DialogOption dialogOption;
}