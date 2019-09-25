package net.runelite.client.plugins.dynamicmaxhit;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
enum Spells
{
	FIRE_BLAST(16),
	FIRE_WAVE(20),
	FIRE_SURGE(24),
	ICE_BURST(22),
	ICE_BLITZ(26),
	ICE_BARRAGE(30),
	FLAMES_ZAMORAK(30),
	UNKNOWNM(0);

	private int maxHit;
}
