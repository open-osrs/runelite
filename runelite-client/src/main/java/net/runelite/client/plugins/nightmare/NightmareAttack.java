package net.runelite.client.plugins.nightmare;

import net.runelite.api.Prayer;

public enum NightmareAttack {
	MELEE(8594, Prayer.PROTECT_FROM_MELEE),
	MAGIC(8595, Prayer.PROTECT_FROM_MAGIC),
	RANGE(8596, Prayer.PROTECT_FROM_MISSILES),
	CURSE_MELEE(8594, Prayer.PROTECT_FROM_MISSILES),	//correct prayer icon to use for her melee while you are cursed
	CURSE_MAGIC(8595, Prayer.PROTECT_FROM_MELEE),	//correct prayer icon to use for her mage while you are cursed
	CURSE_RANGE(8596, Prayer.PROTECT_FROM_MAGIC);	//correct prayer icon to use for her range while you are cursed

	private final int animation;
	private final Prayer prayer;

	NightmareAttack(final int animation, final Prayer prayer) {
		this.animation = animation;
		this.prayer = prayer;
	}

	public int getAnimation() {
		return animation;
	}

	public Prayer getPrayer() {
		return prayer;
	}
}
