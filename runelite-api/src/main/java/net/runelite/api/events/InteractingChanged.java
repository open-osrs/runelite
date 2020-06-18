package net.runelite.api.events;

import net.runelite.api.Actor;
import lombok.Value;

/**
 * An event called when the actor an actor is interacting with changes
 */
@Value
public class InteractingChanged implements Event
{
	Actor source;

	/**
	 * Target actor, may be null
	 */
	Actor target;
}
