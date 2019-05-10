/*
 * Copyright (c) 2018, https://runelitepl.us
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

package net.runelite.client.plugins.hideprayers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hideprayers")
public interface HidePrayersConfig extends Config
{
	@ConfigItem
	(
		position = 0,
		keyName = "pk prayers",
		name = "Hide/Show none pk prayers",
		description = "Hide/Show PK Prayers."
	)
	default boolean showPrayers()
	{
		return false;
	}

	@ConfigItem
	(
		position = 1,
		keyName = "eagle",
		name = "Hide/Show Eagle Eye",
		description = "Hide/Show Eagle Eye"
	)
	default boolean showEagle()
	{
		return false;
	}

	@ConfigItem
	(
		position = 2,
		keyName = "mystic",
		name = "Hide/Show Mystic Might",
		description = "Hide/Show Mystic Might"
	)
	default boolean showMystic()
	{
		return false;
	}

	@ConfigItem
	(
		position = 3,
		keyName = "ultstr",
		name = "Hide/Show Ultimate Strength/Incredible Reflex/Steel Skin",
		description = "Hide/Show Ultimate strength, Incredible Reflex, and Steel skin"
	)
	default boolean showUltStrength()
	{
		return false;
	}

	@ConfigItem
	(
		position = 4,
		keyName = "preserve",
		name = "Hide/Show Preserve",
		description = "Hide/Show Preserve"
	)
	default boolean showPreserve()
	{
		return false;
	}

	@ConfigItem
	(
		position = 5,
		keyName = "redemption",
		name = "Hide/Show Redemption",
		description = "Hide/Show Redemption"
	)
	default boolean showRedemption()
	{
		return false;
	}

	@ConfigItem
	(
		position = 6,
		keyName = "rapidheal",
		name = "Hide/Show Rapid Heal",
		description = "Hide/Show Rapid Heal"
	)
	default boolean showRapidHeal()
	{
		return false;
	}

	@ConfigItem
	(
		position = 7,
		keyName = "rapidRestore",
		name = "Hide/Show Rapid Restore",
		description = "Hide/Show Rapid Restore"
	)
	default boolean showRapidRestore()
	{
		return false;
	}

	@ConfigItem
	(
		position = 8,
		keyName = "zulrah",
		name = "Hide/Show Zulrah Prayers",
		description = "Shows prayers needed for Zulrah"
	)
	default boolean showZulrah()
	{
		return false;
	}
}
