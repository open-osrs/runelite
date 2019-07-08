/*
 * Copyright (c) 2019, Bartvollebregt <https://github.com/Bartvollebregt>
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
package net.runelite.client.plugins.maxhit.requirements;

import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Varbits;
import net.runelite.client.plugins.maxhit.config.SpellBaseDamageConfig;

public class AutocastSpellRequirement implements Requirement
{

	private final List<SpellBaseDamageConfig> autocastSpells;

	public AutocastSpellRequirement(List<SpellBaseDamageConfig> autocastSpells)
	{
		this.autocastSpells = autocastSpells;
	}

	@Override
	public boolean meetsRequirements(Client client)
	{
		int autoCastSpellId = client.getVar(Varbits.AUTO_CAST_SPELL);

		if (autoCastSpellId == 0)
		{

			return false;

		}

		return this.autocastSpells.stream().anyMatch(spell -> spell.getSpellID() == autoCastSpellId);

	}
}
