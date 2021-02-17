/*
 * Copyright (c) 2019, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Aleios <https://github.com/aleios>
 * Copyright (c) 2020, Unmoon <https://github.com/unmoon>
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
package net.runelite.client.plugins.itemcharges;

import com.google.common.collect.Sets;
import java.util.Set;
import lombok.Getter;
import net.runelite.api.EquipmentInventorySlot;

@Getter
enum ItemWithSlot
{
	ABYSSAL_BRACELET(ItemChargeType.ABYSSAL_BRACELET, EquipmentInventorySlot.GLOVES),
	AMULET_OF_CHEMISTY(ItemChargeType.AMULET_OF_CHEMISTRY, EquipmentInventorySlot.AMULET),
	AMULET_OF_BOUNTY(ItemChargeType.AMULET_OF_BOUNTY, EquipmentInventorySlot.AMULET),
	DODGY_NECKLACE(ItemChargeType.DODGY_NECKLACE, EquipmentInventorySlot.AMULET),
	BINDING_NECKLACE(ItemChargeType.BINDING_NECKLACE, EquipmentInventorySlot.AMULET),
	EXPLORER_RING(ItemChargeType.EXPLORER_RING, EquipmentInventorySlot.RING),
	RING_OF_FORGING(ItemChargeType.RING_OF_FORGING, EquipmentInventorySlot.RING),
	CHRONICLE(ItemChargeType.CHRONICLE, EquipmentInventorySlot.SHIELD),
	TELEPORT(ItemChargeType.TELEPORT, EquipmentInventorySlot.WEAPON, EquipmentInventorySlot.AMULET, EquipmentInventorySlot.GLOVES, EquipmentInventorySlot.RING);

	private final ItemChargeType type;
	private final Set<EquipmentInventorySlot> slots;

	ItemWithSlot(final ItemChargeType type, final EquipmentInventorySlot... slots)
	{
		this.type = type;
		this.slots = Sets.newHashSet(slots);
	}
}
