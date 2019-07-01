package net.runelite.client.plugins.combatcounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class NPCDamageCounter
{

	Map<Integer, List<String>> attackers;

	List<Integer> damage;

	NPCDamageCounter()
	{
		this.attackers = new TreeMap<>();
		this.damage = new ArrayList<>();
	}
}