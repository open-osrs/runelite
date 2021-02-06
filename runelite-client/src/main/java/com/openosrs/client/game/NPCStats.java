/*
 * Copyright (c) 2019, TheStonedTurtle <https://github.com/TheStonedTurtle>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.openosrs.client.game;

import com.google.common.collect.ImmutableMap;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "Builder")
public class NPCStats
{
	public static ImmutableMap<Integer, NPCStats> statsMap;

	String name;

	int hitpoints;
	int combatLevel;
	int slayerLevel;
	int attackSpeed;

	int attackLevel;
	int strengthLevel;
	int defenceLevel;
	int rangeLevel;
	int magicLevel;

	int stab;
	int slash;
	int crush;
	int range;
	int magic;

	int stabDef;
	int slashDef;
	int crushDef;
	int rangeDef;
	int magicDef;

	int bonusAttack;
	int bonusStrength;
	int bonusRangeStrength;
	int bonusMagicDamage;

	boolean poisonImmune;
	boolean venomImmune;

	boolean dragon;
	boolean demon;
	boolean undead;

	/**
	 * Based off the formula found here: http://services.runescape.com/m=forum/c=PLuJ4cy6gtA/forums.ws?317,318,712,65587452,209,337584542#209
	 *
	 * @return bonus XP modifier
	 */
	public double calculateXpModifier()
	{
		final double averageLevel = Math.floor((attackLevel + strengthLevel + defenceLevel + hitpoints) / 4);
		final double averageDefBonus = Math.floor((stabDef + slashDef + crushDef) / 3);

		return (1 + Math.floor(averageLevel * (averageDefBonus + bonusStrength + bonusAttack) / 5120) / 40);
	}

	// Because this class is here we can't add the TypeAdapter to gson (easily)
	// doesn't mean we can't use one to do it a bit quicker
	public static final TypeAdapter<NPCStats> NPC_STATS_TYPE_ADAPTER = new TypeAdapter<NPCStats>()
	{
		@Override
		public void write(JsonWriter out, NPCStats value)
		{
			throw new UnsupportedOperationException("Not supported");
		}

		@Override
		public NPCStats read(JsonReader in) throws IOException
		{
			in.beginObject();
			NPCStats.Builder builder = NPCStats.builder();

			// Name is the only one that's guaranteed
			in.skipValue();
			builder.name(in.nextString());

			while (in.hasNext())
			{
				switch (in.nextName())
				{
					case "hitpoints":
						builder.hitpoints(in.nextInt());
						break;
					case "combatLevel":
						builder.combatLevel(in.nextInt());
						break;
					case "slayerLevel":
						builder.slayerLevel(in.nextInt());
						break;
					case "attackSpeed":
						builder.attackSpeed(in.nextInt());
						break;
					case "attackLevel":
						builder.attackLevel(in.nextInt());
						break;
					case "strengthLevel":
						builder.strengthLevel(in.nextInt());
						break;
					case "defenceLevel":
						builder.defenceLevel(in.nextInt());
						break;
					case "rangeLevel":
						builder.rangeLevel(in.nextInt());
						break;
					case "magicLevel":
						builder.magicLevel(in.nextInt());
						break;
					case "stab":
						builder.stab(in.nextInt());
						break;
					case "slash":
						builder.slash(in.nextInt());
						break;
					case "crush":
						builder.crush(in.nextInt());
						break;
					case "range":
						builder.range(in.nextInt());
						break;
					case "magic":
						builder.magic(in.nextInt());
						break;
					case "stabDef":
						builder.stabDef(in.nextInt());
						break;
					case "slashDef":
						builder.slashDef(in.nextInt());
						break;
					case "crushDef":
						builder.crushDef(in.nextInt());
						break;
					case "rangeDef":
						builder.rangeDef(in.nextInt());
						break;
					case "magicDef":
						builder.magicDef(in.nextInt());
						break;
					case "bonusAttack":
						builder.bonusAttack(in.nextInt());
						break;
					case "bonusStrength":
						builder.bonusStrength(in.nextInt());
						break;
					case "bonusRangeStrength":
						builder.bonusRangeStrength(in.nextInt());
						break;
					case "bonusMagicDamage":
						builder.bonusMagicDamage(in.nextInt());
						break;
					case "poisonImmune":
						builder.poisonImmune(in.nextBoolean());
						break;
					case "venomImmune":
						builder.venomImmune(in.nextBoolean());
						break;
					case "dragon":
						builder.dragon(in.nextBoolean());
						break;
					case "demon":
						builder.demon(in.nextBoolean());
						break;
					case "undead":
						builder.undead(in.nextBoolean());
						break;
				}
			}

			in.endObject();
			return builder.build();
		}
	};

	public static int getAttackSpeed(int npcId)
	{
		if (statsMap != null)
			if (statsMap.get(npcId) != null)
				return statsMap.get(npcId).getAttackSpeed();
		return -1;
	}

	public static void loadStats() throws IOException
	{
		try (JsonReader reader = new JsonReader(new InputStreamReader(NPCStats.class.getResourceAsStream("npc_stats.json"), StandardCharsets.UTF_8)))
		{
			ImmutableMap.Builder<Integer, NPCStats> builder = ImmutableMap.builderWithExpectedSize(2821);
			reader.beginObject();

			while (reader.hasNext())
			{
				builder.put(
						Integer.parseInt(reader.nextName()),
						NPCStats.NPC_STATS_TYPE_ADAPTER.read(reader)
				);
			}

			reader.endObject();
			statsMap = builder.build();
		}
	}
}