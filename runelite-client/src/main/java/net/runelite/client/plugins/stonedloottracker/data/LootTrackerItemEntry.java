/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018, TheStonedTurtle <www.github.com/TheStonedTurtle>
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
package net.runelite.client.plugins.stonedloottracker.data;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(AccessLevel.PUBLIC)
public class LootTrackerItemEntry
{
	private final String name;
	private final int id;
	private int quantity;
	private final long price;
	private final long haPrice;
	private long total;
	private long haTotal;
	private final boolean stackable;

	public LootTrackerItemEntry(final String name, final int id, final int quantity, final long price, final long haPrice, final boolean stackable)
	{
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.haPrice = haPrice;
		this.stackable = stackable;
		this.total = price * quantity;
		this.haTotal = haPrice * quantity;
	}

	@Override
	public String toString()
	{
		return "LootTrackerItemEntry(name=" + name + ",id=" + id + ",quantity=" + quantity + ",price=" + price + ",haprice=" + haPrice + ",total=" + total + ",haTotal=" + haTotal + ",stackable=" + stackable + ")";
	}
}