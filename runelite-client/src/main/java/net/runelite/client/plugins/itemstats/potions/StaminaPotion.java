/*
 * Copyright (c) 2016-2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2021, Tanlines <tanlines@outlook.com.au>
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
<<<<<<< HEAD:deobfuscator/src/main/java/net/runelite/deob/deobfuscators/lvt/MapKey.java
package net.runelite.deob.deobfuscators.lvt;

import java.util.Objects;

public class MapKey
{
	private final int idx;
	private final LVTType type;

	public MapKey(int idx, LVTType type)
	{
		this.idx = idx;
		this.type = type;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 89 * hash + this.idx;
		hash = 89 * hash + Objects.hashCode(this.type);
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		final MapKey other = (MapKey) obj;
		if (this.idx != other.idx)
		{
			return false;
		}
		if (this.type != other.type)
		{
			return false;
		}
		return true;
=======
package net.runelite.client.plugins.itemstats.potions;

import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.ItemID;
import net.runelite.client.plugins.itemstats.StatBoost;
import static net.runelite.client.plugins.itemstats.stats.Stats.RUN_ENERGY;

public class StaminaPotion extends StatBoost
{
	public StaminaPotion()
	{
		super(RUN_ENERGY, false);
	}

	@Override
	public int heals(Client client)
	{
		ItemContainer equipContainer = client.getItemContainer(InventoryID.EQUIPMENT);
		if (equipContainer != null)
		{
			Item ring = equipContainer.getItem(EquipmentInventorySlot.RING.getSlotIdx());
			if (ring != null && ring.getId() == ItemID.RING_OF_ENDURANCE)
			{
				return 40;
			}
		}
		return 20;
>>>>>>> upstream/master:runelite-client/src/main/java/net/runelite/client/plugins/itemstats/potions/StaminaPotion.java
	}
}
