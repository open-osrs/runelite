package net.runelite.client.plugins.combatcounter;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Singleton
class NPCDamageCounter {

	final Map<Integer, List<String>> attackers;

	final List<Integer> damage;

	NPCDamageCounter() {
		this.attackers = new TreeMap<>();
		this.damage = new ArrayList<>();
	}
}