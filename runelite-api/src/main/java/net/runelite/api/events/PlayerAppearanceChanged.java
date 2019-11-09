package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Player;

@Value
public class PlayerAppearanceChanged implements Event
{
	private Player player;
}
