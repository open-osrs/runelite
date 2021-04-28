/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
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

package net.runelite.client.plugins.kalphitequeen;

import java.util.Set;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
class KQNpc
{
	static final Set<Integer> NPC_IDS = Set.of(NpcID.KALPHITE_QUEEN_963, NpcID.KALPHITE_QUEEN_965);

	private static final int ANIMATION_ID_PHASE1_RANGE = 6240;
	private static final int ANIMATION_ID_PHASE1_MELEE = 6241;
	private static final int ANIMATION_ID_PHASE1_MAGIC = 1172;
	private static final int ANIMATION_ID_PHASE1_MELEE_1185 = 1185;

	private static final int ANIMATION_ID_PHASE2_RANGE = 6234;
	private static final int ANIMATION_ID_PHASE2_MELEE = 6235;
	private static final int ANIMATION_ID_PHASE2_MAGIC = 1170;

	private static final int ANIMATION_TICK_SPEED = 4;

	private static final Set<Integer> ANIMATION_IDS = Set.of(
		ANIMATION_ID_PHASE1_MELEE,
		ANIMATION_ID_PHASE1_MELEE_1185,
		ANIMATION_ID_PHASE1_RANGE,
		ANIMATION_ID_PHASE1_MAGIC,
		ANIMATION_ID_PHASE2_RANGE,
		ANIMATION_ID_PHASE2_MELEE,
		ANIMATION_ID_PHASE2_MAGIC
	);

	@Getter
	@EqualsAndHashCode.Include
	private final NPC npc;

	@Getter
	private int ticksUntilNextAnimation;

	KQNpc(final NPC npc)
	{
		this.npc = npc;
		this.ticksUntilNextAnimation = 0;

		if (!NPC_IDS.contains(npc.getId()))
		{
			throw new IllegalArgumentException("Unsupported KQ npc id");
		}
	}

	void updateTicksUntilNextAnimation()
	{
		if (ticksUntilNextAnimation > 0)
		{
			ticksUntilNextAnimation--;
		}

		if (ticksUntilNextAnimation <= 0 && ANIMATION_IDS.contains(npc.getAnimation()))
		{
			ticksUntilNextAnimation = ANIMATION_TICK_SPEED;
		}
	}
}
