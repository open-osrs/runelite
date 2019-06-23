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

import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.NPCDefinition;
import net.runelite.api.NpcID;
import net.runelite.api.Prayer;

class NPCContainer
{
	@Getter
	private NPC npc;

	@Getter
	private int npcIndex;

	@Getter
	private String npcName;

	@Getter
	private int npcSize;

	@Setter
	@Getter
	private int ticksUntilAttack;

	@Setter
	@Getter
	private int npcSpeed;

	@Setter
	@Getter
	private Actor npcInteracting;

	@Setter
	@Getter
	private Attackstyle attackStyle;

	@Getter
	@Setter
	private boolean attacking = false;

	@Getter
	private int attackAnimation;

	@Getter
	private boolean isMidAttack = false;

	@Getter
	@Setter
	private int distanceToPlayer = 0;

	@Setter
	@Getter
	private int priority;


	NPCContainer(NPC npc)
	{
		this.npc = npc;
		this.npcName = npc.getName();
		this.npcIndex = npc.getIndex();
		this.npcInteracting = npc.getInteracting();
		this.npcSpeed = 0;
		this.ticksUntilAttack = 0;
		this.priority = 0;
		this.attackStyle = Attackstyle.UNKNOWN;
		final NPCDefinition composition = npc.getTransformedDefinition();

		switch (npc.getId())
		{
			case NpcID.JALAKREKKET:
				attackStyle = Attackstyle.MELEE;
				priority = 7;
				break;

			case NpcID.JALAKREKXIL:
				ticksUntilAttack = 4;
				attackAnimation = 7583;
				attackStyle = Attackstyle.RANGE;
				priority = 6;
				break;

			case NpcID.JALAKREKMEJ:
				ticksUntilAttack = 4;
				attackAnimation = 7581;
				attackStyle = Attackstyle.MAGE;
				priority = 5;
				break;

			case NpcID.JALMEJRAH:
				ticksUntilAttack = 3;
				attackAnimation = 7578;
				attackStyle = Attackstyle.RANGE;
				priority = 4;
				break;

			case NpcID.JALAK:
				ticksUntilAttack = 6;
				attackAnimation = 7583; // also 7581
				priority = 3;
				break;

			case NpcID.JALIMKOT:
				ticksUntilAttack = 4;
				attackAnimation = 7597;
				attackStyle = Attackstyle.MELEE;
				priority = 2;
				break;

			case NpcID.JALXIL:
				ticksUntilAttack = 4;
				attackAnimation = 7605;
				attackStyle = Attackstyle.RANGE;
				priority = 1;
				break;

			case NpcID.JALZEK:
				ticksUntilAttack = 4;
				attackAnimation = 7610;
				attackStyle = Attackstyle.MAGE;
				priority = 0;
				break;
			default:
				ticksUntilAttack = 0;
		}

		if (composition != null)
		{
			this.npcSize = composition.getSize();
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

		private String name = "";
		private Color color;
		private Prayer prayer;
	}
}