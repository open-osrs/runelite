package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Player;
import net.runelite.api.PlayerComposition;

/**
 * This will fire whenever the {@link PlayerComposition} hash changes.
 */
@Value
public class PlayerChanged implements Event
{
	Player player;
}
