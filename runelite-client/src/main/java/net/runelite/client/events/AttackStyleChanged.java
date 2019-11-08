package net.runelite.client.events;

import lombok.Value;
import net.runelite.api.Player;
import net.runelite.api.events.Event;
import net.runelite.client.game.AttackStyle;

@Value
public class AttackStyleChanged implements Event
{
	private final Player player;
	private final AttackStyle oldStyle;
	private final AttackStyle newStyle;
}
