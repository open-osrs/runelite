/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
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
package net.runelite.client.plugins.itemdropper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("ItemDropperConfig")
public interface ItemDropperConfig extends Config
{
	@ConfigItem(
		keyName = "items",
		name = "Items to Drop",
		description = "Seperate with comma",
		position = 0
	)
	default String items()
	{
		return "0";
	}

	@ConfigItem(
		position = 1,
		keyName = "toggle",
		name = "Drop Items",
		description = "Drops Items in config above."
	)
	default Keybind toggle()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		position = 2,
		keyName = "actionType",
		name = "Action Type",
		description = "Flexo is smooth mouse, MouseEvents is ghost mouse"
	)
	default ActionType actionType()
	{
		return ActionType.FLEXO;
	}

	@ConfigItem(
		keyName = "randLow",
		name = "Minimum Delay",
		description = "For MouseEvents only.",
		position = 3
	)
	default int randLow()
	{
		return 70;
	}

	@ConfigItem(
		keyName = "randLower",
		name = "Maximum Delay",
		description = "For MouseEvents only.",
		position = 4
	)
	default int randHigh()
	{
		return 80;
	}
}
