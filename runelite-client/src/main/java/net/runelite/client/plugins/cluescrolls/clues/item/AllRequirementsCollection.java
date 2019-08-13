/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
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
package net.runelite.client.plugins.cluescrolls.clues.item;

import net.runelite.api.Client;
import net.runelite.api.Item;

public class AllRequirementsCollection implements ItemRequirement
{
	private final String name;
	private final ItemRequirement[] requirements;

	public AllRequirementsCollection(final String name, final ItemRequirement... requirements)
	{
		this.name = name;
		this.requirements = requirements;
	}

	public AllRequirementsCollection(final ItemRequirement... requirements)
	{
		this("N/A", requirements);
	}

	@Override
	public boolean fulfilledBy(final int itemId)
	{
		for (ItemRequirement requirement : requirements)
		{
			if (requirement.fulfilledBy(itemId))
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean fulfilledBy(final Item[] items)
	{
		for (ItemRequirement requirement : requirements)
		{
			if (!requirement.fulfilledBy(items))
			{
				return false;
			}
		}

		return true;
	}

	@Override
	public String getCollectiveName(final Client client)
	{
		return name;
	}
}
