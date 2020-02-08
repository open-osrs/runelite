package net.runelite.client.plugins.nightmare;

import net.runelite.api.Prayer;

import java.awt.Color;

public enum NightmareAttack {
	MELEE(8594, Prayer.PROTECT_FROM_MELEE, Color.RED),
	MAGIC(8595, Prayer.PROTECT_FROM_MAGIC, Color.CYAN),
	RANGE(8596, Prayer.PROTECT_FROM_MISSILES, Color.GREEN),
	CURSE_MELEE(8594, Prayer.PROTECT_FROM_MISSILES, Color.GREEN),    //correct prayer icon to use for her melee while you are cursed
	CURSE_MAGIC(8595, Prayer.PROTECT_FROM_MELEE, Color.RED),    //correct prayer icon to use for her mage while you are cursed
	CURSE_RANGE(8596, Prayer.PROTECT_FROM_MAGIC, Color.CYAN);    //correct prayer icon to use for her range while you are cursed

	private final int animation;
	private final Prayer prayer;
	private final Color tickColor;

	NightmareAttack(final int animation, final Prayer prayer, final Color tickColor) {
		this.animation = animation;
		this.prayer = prayer;
		this.tickColor = tickColor;
	}

	public int getAnimation() {
		return animation;
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public Color getTickColor() {
		return tickColor;
	}
}
