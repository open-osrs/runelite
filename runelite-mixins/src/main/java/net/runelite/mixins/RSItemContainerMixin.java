/*
 * Copyright (c) 2016-2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
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
package net.runelite.mixins;

import net.runelite.api.Item;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSItemContainer;
import net.runelite.rs.api.RSNodeHashTable;

@Mixin(RSItemContainer.class)
public abstract class RSItemContainerMixin implements RSItemContainer
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("changedItemContainers")
	private static int[] changedItemContainers;

	@Inject
	@Override
	public Item[] getItems()
	{
		int[] itemIds = getItemIds();
		int[] stackSizes = getStackSizes();
		Item[] items = new Item[itemIds.length];

		for (int i = 0; i < itemIds.length; ++i)
		{
			Item item = new Item(
				itemIds[i],
				stackSizes[i]
			);
			items[i] = item;
		}

		return items;
	}

	@Inject
	@Override
	public Item getItem(int slot)
	{
		int[] itemIds = getItemIds();
		int[] stackSizes = getStackSizes();
		if (slot >= 0 && slot < itemIds.length && itemIds[slot] != -1)
		{
			return new Item(itemIds[slot], stackSizes[slot]);
		}

		return null;
	}

	@Inject
	@Override
	public boolean contains(int itemId)
	{
		int[] itemIds = getItemIds();
		for (int id : itemIds)
		{
			if (id == itemId)
			{
				return true;
			}
		}

		return false;
	}

	@Inject
	@Override
	public int count(int itemId)
	{
		int[] itemIds = getItemIds();
		int[] stackSizes = getStackSizes();
		int count = 0;

		for (int i = 0; i < itemIds.length; i++)
		{
			if (itemIds[i] != itemId)
			{
				continue;
			}

			int stack = stackSizes[i];
			if (stack > 1)
			{
				return stack;
			}

			count++;
		}

		return count;
	}

	@FieldHook("changedItemContainers")
	@Inject
	public static void onItemContainerUpdate(int idx)
	{
		if (idx != -1)
		{
			int changedId = idx - 1 & 31;
			int containerId = changedItemContainers[changedId];

			RSNodeHashTable itemContainers = client.getItemContainers();
			
			RSItemContainer changedContainer = (RSItemContainer) itemContainers.get(containerId);
			RSItemContainer changedContainerInvOther = (RSItemContainer) itemContainers.get(containerId | 0x8000);

			if (changedContainer != null)
			{
				ItemContainerChanged event = new ItemContainerChanged(containerId, changedContainer);
				client.getCallbacks().postDeferred(event);
			}
			
			if (changedContainerInvOther != null)
			{
				ItemContainerChanged event = new ItemContainerChanged(containerId | 0x8000, changedContainerInvOther);
				client.getCallbacks().postDeferred(event);
			}
		}
	}

	@Inject
	public int size()
	{
		return getItemIds().length;
	}
}
