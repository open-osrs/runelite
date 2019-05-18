/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * Copyright (c) 2018, Raqes <j.raqes@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.hideprayers.PVM;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PVMPrayers 
{
	DISABLED("Disabled"),
	ARMADYL_CHEAP("Eagle eye"),
	ARMADYL_EXPENSIVE("Rigour"),
	BANDOS_CHEAP("Low LVL Melee"),
	BANDOS_EXPENSIVE("Piety"),
	BARROWS_CHEAP("Eagle/Mystic"),
	BARROWS_EXPENSIVE("Augury/Rigour"),
	CERBERUS_CHEAP("Low LVL Melee"),
	CERBERUS_EXPENSIVE("Melee Piety"),
	CERBERUS_CHEAP_RANGE("Range Eagle Eye"),
	CERBERUS_EXPENSIVE_RANGE("Range Rigour"),
	SARADOMIN_CHEAP("Melee/Eagle"),
	SARADOMIN_EXPENSIVE("Piety/Rigour"),
	VORKATH_CHEAP("Eagle Eye"),
	VORKATH_EXPENSIVE("Rigour"),
	ZAMORAK_CHEAP("Low LVL Melee"),
	ZAMORAK_EXPENSIVE("Piety"),
	ZULRAH_CHEAP("Eagle/Mystic"),
	ZULRAH_EXPENSIVE("Augury/Rigour");

	private String name;

	@Override
	public String toString() 
	{
		return getName();
	}
}