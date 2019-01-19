/*
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.timetracking.farming;

import java.util.HashMap;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.Matchers.*;

public class PatchImplementationTest
{
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testRange()
	{
		for (PatchImplementation impl : PatchImplementation.values())
		{
			Map<Produce, boolean[]> harvestStages = new HashMap<>();
			for (int i = 0; i < 256; i++)
			{
				PatchState s = impl.forVarbitValue(i);
				if (s != null)
				{
					String pfx = impl.name() + "[" + i + "]";
					collector.checkThat(pfx + ": cropState", s.getCropState(), notNullValue());
					collector.checkThat(pfx + ": produce", s.getProduce(), notNullValue());
					collector.checkThat(pfx + ": negative stage", s.getStage(), greaterThanOrEqualTo(0));
					int stages = s.getProduce().getStages();
					if (s.getCropState() == CropState.HARVESTABLE)
					{
						stages = s.getProduce().getHarvestStages();
					}
					collector.checkThat(pfx + ": out of bounds stage", s.getStage(), lessThan(stages));
					if (s.getCropState() == CropState.DEAD || s.getCropState() == CropState.DISEASED)
					{
						collector.checkThat(pfx + ": dead seed", s.getStage(), greaterThan(0));
					}
					if (s.getCropState() == CropState.GROWING && s.getProduce() != Produce.WEEDS && s.getStage() < stages)
					{
						harvestStages.computeIfAbsent(s.getProduce(), k -> new boolean[s.getProduce().getStages()])[s.getStage()] = true;
					}
				}
			}

			for (Map.Entry<Produce, boolean[]> produce : harvestStages.entrySet())
			{
				boolean[] states = produce.getValue();
				// Alot of time the final stage is not hit, because some plants do not have a "Check-health" stage
				for (int i = 0; i < states.length - 1; i++)
				{
					collector.checkThat(produce.getKey().getName() + " stage " + i + " never found by varbit", states[i], is(true));
				}
			}
		}
	}
}
