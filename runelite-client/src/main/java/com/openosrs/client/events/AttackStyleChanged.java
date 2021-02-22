package com.openosrs.client.events;

import lombok.Value;
import net.runelite.api.Player;
import com.openosrs.client.game.AttackStyle;

/**
 * This will fire when {@link com.openosrs.client.game.PlayerManager} detects
 * a change in the player appearance that resulted in the shifting of an attack style.
 * For example, ranged str went to 0, but melee str went to 108.
 */
@Value
public class AttackStyleChanged
{
	/**
	 * The player that changed styles.
	 */
	Player player;

	/**
	 * Can be Unknown(nullable)
	 *
	 * @see com.openosrs.client.game.AttackStyle
	 */
	AttackStyle oldStyle;

	/**
	 * Can be Unknown(nullable)
	 *
	 * @see com.openosrs.client.game.AttackStyle
	 */
	AttackStyle newStyle;
}