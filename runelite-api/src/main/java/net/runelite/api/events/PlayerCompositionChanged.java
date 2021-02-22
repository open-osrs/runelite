package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Player;

/**
 * This will fire whenever the {@link net.runelite.api.PlayerComposition} hash changes.
 */
@Value
public class PlayerCompositionChanged
{
	Player player;
}