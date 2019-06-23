/*
 * Copyright (c) 2018, Woox <https://github.com/wooxsolo>
 * Copyright (c) 2019, Ganom <https://github.com/Ganom>
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
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
package net.runelite.client.plugins.inferno;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.AnimationID;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.NpcID;
import net.runelite.api.Prayer;

@Getter
class NPCContainer
{
	private NPC npc;

	private int npcIndex;

	private String npcName;

	private int npcSize;

	@Setter
	private int ticksUntilAttack;

	@Setter
	private int npcSpeed;

	@Setter
	private Actor npcInteracting;

	@Setter
	private Attackstyle attackStyle;

	@Setter
	private boolean attacking = false;

	private int attackAnimation;

	private boolean isMidAttack = false;

	@Setter
	private int distanceToPlayer = 0;

	@Setter
	private int priority;


	NPCContainer(NPC npc)
	{
		this.npc = npc;
		this.npcName = npc.getName();
		this.npcIndex = npc.getIndex();
		this.npcInteracting = npc.getInteracting();
		this.npcSpeed = 0;
		final NPCDefinition composition = npc.getTransformedDefinition();

		InfernoMonster monster = InfernoMonster.of(npc.getId());

		if (monster == null)
		{
			throw new IllegalStateException();
		}

		this.ticksUntilAttack = monster.ticksUntilAttack;
		this.attackAnimation = monster.attackAnimationID;
		this.attackStyle = monster.attackstyle;
		this.priority = monster.priority;

		if (composition != null)
		{
			this.npcSize = composition.getSize();
		}
	}

	@RequiredArgsConstructor
	enum InfernoMonster
	{
		// TODO: Check if next is correct
		JALAKREKKET(NpcID.JALAKREKKET, 4, AnimationID.JAL_AK_MELEE_ATTACK, Attackstyle.MELEE, 7),
		JALAKREKXIL(NpcID.JALAKREKXIL, 4, AnimationID.JAL_AK_MAGIC_ATTACK, Attackstyle.RANGE, 6),
		JALAKREKMEJ(NpcID.JALAKREKMEJ, 4, AnimationID.JAL_AK_RANGE_ATTACK, Attackstyle.MAGE, 5),
		JALMEJRAH(NpcID.JALMEJRAH, 3, AnimationID.JAL_MEJRAH, Attackstyle.RANGE, 4),
		JALAK(NpcID.JALAK, 6, AnimationID.JAL_AK_MAGIC_ATTACK, Attackstyle.UNKNOWN, 3),
		JALIMKOT(NpcID.JALIMKOT, 4, AnimationID.JAL_IMKOT, Attackstyle.MELEE, 2),
		JALXIL(NpcID.JALXIL, 4, AnimationID.JAL_XIL_RANGE_ATTACK, Attackstyle.RANGE, 1),
		JALZEK(NpcID.JALZEK, 4, AnimationID.JAL_ZEK_MAGE_ATTACK, Attackstyle.MAGE, 0);

		private final int npcID;
		private final int ticksUntilAttack;
		private final int attackAnimationID;
		private final Attackstyle attackstyle;
		private final int priority;

		private static ImmutableMap<Integer, InfernoMonster> idMap;

		static
		{
			ImmutableMap.Builder<Integer, InfernoMonster> builder = ImmutableMap.builder();

			for (InfernoMonster monster : values())
			{
				builder.put(monster.npcID, monster);
			}

			idMap = builder.build();
		}

		static InfernoMonster of(int npcID)
		{
			return idMap.get(npcID);
		}
	}

	@AllArgsConstructor
	@Getter
	public enum Attackstyle
	{
		MAGE("Mage", Color.CYAN, Prayer.PROTECT_FROM_MAGIC),
		RANGE("Range", Color.GREEN, Prayer.PROTECT_FROM_MISSILES),
		MELEE("Melee", Color.RED, Prayer.PROTECT_FROM_MELEE),
		UNKNOWN("Unknown", Color.WHITE, null);

		private String name;
		private Color color;
		private Prayer prayer;
	}
}