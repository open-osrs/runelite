package net.runelite.client.plugins.dynamicmaxhit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.http.api.hiscore.HiscoreSkill;

@Getter
@AllArgsConstructor
public enum Potions
{
	SUPER_COMBAT("Super Combat", 5, 0.15, HiscoreSkill.STRENGTH),
	RANGING_POTION("Ranging Potion", 4, 0.10, HiscoreSkill.RANGED);

	private final String name;
	private final double a;
	private final double b;
	private final HiscoreSkill skill;
}
