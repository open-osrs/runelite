/*
 * Copyright (c) 2018, Davis Cook <daviscook447@gmail.com>
 * Copyright (c) 2018, Daddy Dozer <Whitedylan7@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *	list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *	this list of conditions and the following disclaimer in the documentation
 *	and/or other materials provided with the distribution.
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
package net.runelite.client.plugins.suppliestracker;

import javax.inject.Singleton;
import net.runelite.api.ItemDefinition;
import net.runelite.client.game.ItemManager;
import net.runelite.client.util.QuantityFormatter;
import static net.runelite.client.plugins.suppliestracker.SuppliesTrackerPlugin.POTION_PATTERN;

@Singleton
class SuppliesBox extends Box
{


	SuppliesBox(ItemManager itemManager, String id, SuppliesTrackerPlugin plugin, SuppliesTrackerPanel panel, ItemType type)
	{
		super(itemManager, id, plugin, panel, type);
	}

	public String buildToolTip(int itemId, int qty)
	{
		ItemDefinition item = itemManager.getItemDefinition(itemId);
		final String name = item.getName();

		if (SuppliesTrackerPlugin.isPotion(name))
		{
			final long price = itemManager.getItemPrice(plugin.getPotionID(name.replaceAll(POTION_PATTERN, "(4)"))) / 4;
			return name + " x " + qty + " (" + QuantityFormatter.quantityToStackSize(price * qty) + ") ";
		}
		else
		{
			final long price = item.getPrice();
			return name + " x " + qty + " (" + QuantityFormatter.quantityToStackSize(price * qty) + ") ";
		}
	}

}
