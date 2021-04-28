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

public class Dawn extends Gargoyle
{
	public Dawn(@NonNull final NPC npc)
	{
		super(npc);
	}

	public Phase getPhase()
	{
		return Phase.of(npc.getId());
	}

	@Override
	protected void updateTicksUntilNextAttack()
	{
		// Dawn npc does not always show animation ID when attacking
		// Currently unused
	}

	@Getter
	@RequiredArgsConstructor
	enum Phase
	{
		PHASE_1(NpcID.DAWN_7852, Set.of(7770, 7771)),
		PHASE_3(NpcID.DAWN_7884, Set.of(7770));

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
