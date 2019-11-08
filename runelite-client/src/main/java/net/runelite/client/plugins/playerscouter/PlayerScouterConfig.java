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
package net.runelite.client.plugins.playerscouter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("playerscouter")
public interface PlayerScouterConfig extends Config
{
	@ConfigItem(
		keyName = "webhook",
		name = "Webhook Url",
		description = "Input the url for your webhook.",
		position = 0,
		secret = true
	)
	default String webhook()
	{
		return "";
	}

	@ConfigItem(
		keyName = "mini",
		name = "Minify Output",
		description = "",
		position = 0,
		secret = true
	)
	default boolean mini()
	{
		return true;
	}

	@ConfigItem(
		keyName = "onlyWildy",
		name = "Only Scout in Wildy",
		description = "This will only scout players in the wilderness.",
		position = 1
	)
	default boolean onlyWildy()
	{
		return true;
	}

	@ConfigItem(
		keyName = "scoutClan",
		name = "Scout Clan Members",
		description = "Enable this to scout clan members.",
		position = 2
	)
	default boolean scoutClan()
	{
		return true;
	}

	@ConfigItem(
		keyName = "scoutFriends",
		name = "Scout Friends",
		description = "Enable this to scout friends.",
		position = 3
	)
	default boolean scoutFriends()
	{
		return true;
	}

	@ConfigItem(
		keyName = "outputItems",
		name = "Output Items",
		description = "This will output all of their risked gear to the webhook.",
		position = 4
	)
	default boolean outputItems()
	{
		return false;
	}

	@ConfigItem(
		keyName = "minimumRisk",
		name = "Minimum Risk",
		description = "Minimum risk for the player to be scouted.",
		position = 5
	)
	default int minimumRisk()
	{
		return 1;
	}

	@ConfigItem(
		keyName = "minimumValue",
		name = "Minimum Value",
		description = "Minimum value for the item to be posted on discord.",
		position = 6
	)
	default int minimumValue()
	{
		return 1000;
	}

	@Range(
		min = 3,
		max = 125
	)
	@ConfigItem(
		keyName = "minimumCombat",
		name = "Minimum Combat Level",
		description = "The Minimum Combat Level you wish to scout.",
		position = 7
	)
	default int minimumCombat()
	{
		return 3;
	}

	@Range(
		min = 4,
		max = 126
	)
	@ConfigItem(
		keyName = "maximumCombat",
		name = "Maximum Combat Level",
		description = "The Maximum Combat Level you wish to scout.",
		position = 8
	)
	default int maximumCombat()
	{
		return 126;
	}

	@ConfigItem(
		keyName = "timeout",
		name = "Timeout",
		description = "Minimum amount of ticks before the player can be scouted again. (1 tick = 600ms)",
		position = 9
	)
	default int timeout()
	{
		return 500;
	}
}
