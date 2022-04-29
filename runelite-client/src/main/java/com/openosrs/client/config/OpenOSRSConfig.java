/*
 *
 *   Copyright (c) 2019, Zeruth <TheRealNull@gmail.com>
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice, this
 *      list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright notice,
 *      this list of conditions and the following disclaimer in the documentation
 *      and/or other materials provided with the distribution.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *   ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *   WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *   DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *   ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *   (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *   ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package com.openosrs.client.config;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitle;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;
import net.runelite.client.plugins.OPRSExternalPluginManager;

@ConfigGroup("openosrs")
public interface OpenOSRSConfig extends Config
{
	@Getter(AccessLevel.PRIVATE)
	@AllArgsConstructor
	enum BootstrapMode
	{
		STABLE("Stable"),
		NIGHTLY("Nightly");

		private final String name;

		@Override
		public String toString()
		{
			return getName();
		}
	}

	@ConfigTitle(
		name = "Launcher",
		description = "",
		position = 0
	)
	String launcherTitle = "launcherTitle";

	@ConfigTitle(
		keyName = "updateChannelTitle",
		name = "Update channel",
		description = "",
		position = 1,
		title = launcherTitle
	)
	String updateChannelTitle = "updateChannelTitle";

	@ConfigItem(
		position = 2,
		keyName = "askMode",
		name = "Prompt for update channel",
		description = "Ask for nightly or stable every startup",
		title = updateChannelTitle
	)
	default boolean askMode()
	{
		return true;
	}

	@ConfigItem(
		keyName = "bootstrapMode",
		name = "Update channel",
		description = "Select the update channel",
		title = updateChannelTitle,
		position = 3,
		hide = "askMode"
	)
	default BootstrapMode bootstrapMode()
	{
		return BootstrapMode.STABLE;
	}

	@ConfigTitle(
		keyName = "miscLauncherTitle",
		name = "Miscellaneous",
		description = "",
		position = 4,
		title = launcherTitle
	)
	String miscLauncherTitle = "miscLauncherTitle";

	@ConfigItem(
		position = 5,
		keyName = "disableHw",
		name = "Disable hardware acceleration",
		description = "Enable this if you have graphical issues",
		title = miscLauncherTitle,
		warning = "Toggling this setting requires a restart of the client"
	)
	default boolean disableHw()
	{
		return false;
	}

	@ConfigTitle(
		name = "Client",
		description = "",
		position = 6
	)
	String clientTitle = "clientTitle";

	@ConfigTitle(
		name = "Sync",
		description = "",
		position = 6,
		title = clientTitle
	)
	String syncTitle = "syncTitle";

	@ConfigItem(
		keyName = "localSync",
		name = "Sync local instances",
		description = "Enables multiple local instances of OpenOSRS to communicate (this enables syncing plugin state and config options)",
		position = 7,
		title = syncTitle
	)
	default boolean localSync()
	{
		return true;
	}

	@ConfigTitle(
		name = "Miscellaneous",
		description = "",
		position = 8,
		title = clientTitle
	)
	String miscClientTitle = "miscClientTitle";

	@ConfigItem(
		keyName = "enableOpacity",
		name = "Enable opacity",
		description = "Enables opacity for the whole window.<br>NOTE: This only stays enabled if your pc supports this!",
		position = 9,
		title = miscClientTitle
	)
	default boolean enableOpacity()
	{
		return false;
	}

	@Range(
		min = 15,
		max = 100
	)
	@ConfigItem(
		keyName = "opacityPercentage",
		name = "Opacity percentage",
		description = "Changes the opacity of the window if opacity is enabled",
		position = 10,
		title = miscClientTitle,
		hidden = true,
		unhide = "enableOpacity"
	)
	@Units(Units.PERCENT)
	default int opacityPercentage()
	{
		return 100;
	}

	@ConfigItem(
		keyName = "externalRepos",
		name = "",
		description = "",
		hidden = true
	)
	default String getExternalRepositories()
	{
		return OPRSExternalPluginManager.DEFAULT_PLUGIN_REPOS;
	}

	@ConfigItem(
		keyName = "externalRepos",
		name = "",
		description = "",
		hidden = true
	)
	void setExternalRepositories(String val);

	@ConfigItem(
		keyName = "warning",
		name = "",
		description = "",
		hidden = true
	)
	default boolean warning()
	{
		return true;
	}
}
