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

package net.runelite.client.plugins.grotesqueguardians.entity;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Set;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Prayer;

public class Dusk extends Gargoyle
{
	private static final int PHASE_1_ANIMATION_MELEE = 7785;

	private static final int PHASE_2_ANIMATION_MELEE_7786 = 7786;
	private static final int PHASE_2_ANIMATION_MELEE_7788 = 7788;

	private static final int PHASE_3_ANIMATION_MELEE_7785 = 7785;
	private static final int PHASE_3_ANIMATION_MELEE_7787 = 7787;

	private static final int PHASE_4_ANIMATION_MELEE = 7800;
	private static final int PHASE_4_ANIMATION_RANGE = 7801;

	private static final int ATTACK_TICK_SPEED = 6;

	@Getter
	private Prayer lastAttackPrayer;

	public Dusk(@NonNull final NPC npc)
	{
		super(npc);
	}

	public void updateLastAnimation(final int animationId)
	{
		if (animationId == PHASE_4_ANIMATION_MELEE)
		{
			lastAttackPrayer = Prayer.PROTECT_FROM_MELEE;
		}
		else if (animationId == PHASE_4_ANIMATION_RANGE)
		{
			lastAttackPrayer = Prayer.PROTECT_FROM_MISSILES;
		}
	}

	@Override
	public void updateTicksUntilNextAttack()
	{
		if (ticksUntilNextAttack > 0)
		{
			ticksUntilNextAttack--;
		}

		if (ticksUntilNextAttack <= 0)
		{
			final Phase phase = getPhase();

			if (phase == null)
			{
				return;
			}

			final int animationId = npc.getAnimation();

			if (!phase.getAttackAnimationIdSet().contains(animationId))
			{
				return;
			}

			ticksUntilNextAttack = ATTACK_TICK_SPEED;
		}
	}

	public Phase getPhase()
	{
		return Phase.of(npc.getId());
	}

	public boolean isLastPhase()
	{
		return Phase.of(npc.getId()) == Phase.PHASE_4;
	}

	@Getter
	@RequiredArgsConstructor
	enum Phase
	{
		PHASE_1(NpcID.DUSK_7851, Set.of(PHASE_1_ANIMATION_MELEE)),
		PHASE_2(NpcID.DUSK_7882, Set.of(PHASE_2_ANIMATION_MELEE_7786, PHASE_2_ANIMATION_MELEE_7788)),
		PHASE_3(NpcID.DUSK_7883, Set.of(PHASE_3_ANIMATION_MELEE_7785, PHASE_3_ANIMATION_MELEE_7787)),
		PHASE_4(NpcID.DUSK_7888, Set.of(PHASE_4_ANIMATION_MELEE, PHASE_4_ANIMATION_RANGE));

		private static final Map<Integer, Phase> MAP;

		static
		{
			final ImmutableMap.Builder<Integer, Phase> builder = new ImmutableMap.Builder<>();

			for (final Phase phase : Phase.values())
			{
				builder.put(phase.getNpcId(), phase);
			}

			MAP = builder.build();
		}

		private final int npcId;
		private final Set<Integer> attackAnimationIdSet;

		static Phase of(final int npcId)
		{
			return MAP.get(npcId);
		}
	}
}
