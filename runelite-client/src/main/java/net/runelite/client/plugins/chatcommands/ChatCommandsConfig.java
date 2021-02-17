/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.chatcommands;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@ConfigGroup("chatcommands")
public interface ChatCommandsConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "price",
		name = "Price Command",
		description = "Configures whether the Price command is enabled<br> !price [item]"
	)
	default boolean price()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "lvl",
		name = "Level Command",
		description = "Configures whether the Level command is enabled<br> !lvl [skill]"
	)
	default boolean lvl()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "clue",
		name = "Clue Command",
		description = "Configures whether the Clue command is enabled<br> !clues"
	)
	default boolean clue()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "killcount",
		name = "Killcount Command",
		description = "Configures whether the Killcount command is enabled<br> !kc [boss]"
	)
	default boolean killcount()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "qp",
		name = "QP Command",
		description = "Configures whether the quest point command is enabled<br> !qp"
	)
	default boolean qp()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "pb",
		name = "PB Command",
		description = "Configures whether the personal best command is enabled<br> !pb"
	)
	default boolean pb()
	{
		return true;
	}

	@ConfigItem(
		position = 6,
		keyName = "gc",
		name = "GC Command",
		description = "Configures whether the Barbarian Assault High gamble count command is enabled<br> !gc"
	)
	default boolean gc()
	{
		return true;
	}

	@ConfigItem(
		position = 7,
		keyName = "duels",
		name = "Duels Command",
		description = "Configures whether the duel arena command is enabled<br> !duels"
	)
	default boolean duels()
	{
		return true;
	}

	@ConfigItem(
		position = 8,
		keyName = "bh",
		name = "BH Command",
		description = "Configures whether the Bounty Hunter - Hunter command is enabled<br> !bh"
	)
	default boolean bh()
	{
		return true;
	}

	@ConfigItem(
		position = 9,
		keyName = "bhRogue",
		name = "BH Rogue Command",
		description = "Configures whether the Bounty Hunter - Rogue command is enabled<br> !bhrogue"
	)
	default boolean bhRogue()
	{
		return true;
	}

	@ConfigItem(
		position = 10,
		keyName = "lms",
		name = "LMS Command",
		description = "Configures whether the Last Man Standing command is enabled<br> !lms"
	)
	default boolean lms()
	{
		return true;
	}

	@ConfigItem(
		position = 11,
		keyName = "lp",
		name = "LP Command",
		description = "Configures whether the League Points command is enabled<br> !lp"
	)
	default boolean lp()
	{
		return true;
	}

	@ConfigItem(
		position = 12,
		keyName = "sw",
		name = "SW Command",
		description = "Configures whether the Soul Wars Zeal command is enabled<br> !sw"
	)
	default boolean sw()
	{
		return true;
	}

	@ConfigItem(
		position = 13,
		keyName = "clearSingleWord",
		name = "Clear Single Word",
		description = "Enable hot key to clear single word at a time"
	)
	default Keybind clearSingleWord()
	{
		return new Keybind(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK);
	}

	@ConfigItem(
		position = 14,
		keyName = "clearEntireChatBox",
		name = "Clear Chat Box",
		description = "Enable hotkey to clear entire chat box"
	)
	default Keybind clearChatBox()
	{
		return new Keybind(KeyEvent.VK_BACK_SPACE, InputEvent.CTRL_DOWN_MASK);
	}
}
