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
package net.runelite.client.plugins.pluginsorter;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("pluginsorter")
public interface PluginSorterConfig extends Config
{
	boolean pluginsHidden = false;
	boolean pluginsPrivateServerHidden = false;
	boolean pluginsExternalHidden = false;
	boolean pluginsPVMHidden = false;
	boolean pluginsPVPHidden = false;
	boolean pluginsSkillingHidden = false;
	boolean pluginsUtilityHidden = false;
	boolean pluginssortaz = false;

	@ConfigItem(
		position = 0,
		keyName = "sortaz",
		name = "Sort All Plugins Alphabetically",
		description = "Sorts all plugins Alphabetically if checked"
	)
	default boolean sortaz()
	{
		return pluginssortaz;
	}

	@ConfigItem(
		position = 0,
		keyName = "hidePlugins",
		name = "Hide All Plugins",
		description = "Hides all 3rd party plugins if checked",
		group = "Hide Plugins"
	)
	default boolean hidePlugins()
	{
		return pluginsHidden;
	}

	@ConfigItem(
		position = 1,
		keyName = "hideExternalPlugins",
		name = "Hide External Plugins",
		description = "Hides all External plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hideExternalPlugins()
	{
		return pluginsExternalHidden;
	}

	@ConfigItem(
		position = 1,
		keyName = "hidePrivateServerPlugins",
		name = "Hide Private Server Plugins",
		description = "Hides all Private Server plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hidePrivateServerPlugins()
	{
		return pluginsPrivateServerHidden;
	}

	@ConfigItem(
		position = 2,
		keyName = "hidePVMPlugins",
		name = "Hide PVM Plugins",
		description = "Hides all PVM plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hidePVMPlugins()
	{
		return pluginsPVMHidden;
	}

	@ConfigItem(
		position = 3,
		keyName = "hidePVPPlugins",
		name = "Hide PVP Plugins",
		description = "Hides all PVP plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hidePVPPlugins()
	{
		return pluginsPVPHidden;
	}

	@ConfigItem(
		position = 4,
		keyName = "hideSkillingPlugins",
		name = "Hide Skilling Plugins",
		description = "Hides all Skilling plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hideSkillingPlugins()
	{
		return pluginsSkillingHidden;
	}

	@ConfigItem(
		position = 5,
		keyName = "hideUtilityPlugins",
		name = "Hide Utility Plugins",
		description = "Hides all Utility plugins if checked",
		group = "Hide Plugins",
		disabledBy =  "hidePlugins"
	)
	default boolean hideUtilityPlugins()
	{
		return pluginsUtilityHidden;
	}


	@ConfigItem(
		position = 0,
		keyName = "externalColor",
		name = "External color",
		description = "Configure the color of external plugins",
		group = "Plugins Colors"
	)
	default Color externalColor()
	{
		return Color.MAGENTA;
	}

	@ConfigItem(
		position = 1,
		keyName = "privateserverColor",
		name = "Private Server color",
		description = "Configure the color of Private Server plugins",
		group = "Plugins Colors"
	)
	default Color privateserverColor()
	{
		return Color.BLUE;
	}

	@ConfigItem(
		position = 2,
		keyName = "pvmColor",
		name = "PVM color",
		description = "Configure the color of PVM related plugins",
		group = "Plugins Colors"
	)
	default Color pvmColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		position = 3,
		keyName = "pvpColor",
		name = "PVP color",
		description = "Configure the color of PVP related plugins",
		group = "Plugins Colors"
	)
	default Color pvpColor()
	{
		return Color.RED;
	}
	
	@ConfigItem(
		position = 4,
		keyName = "skillingColor",
		name = "Skilling color",
		description = "Configure the color of Skilling related plugins",
		group = "Plugins Colors"
	)
	default Color skillingColor()
	{
		return Color.YELLOW;
	}

	@ConfigItem(
		position = 5,
		keyName = "utilityColor",
		name = "Utility color",
		description = "Configure the color of Utility related plugins",
		group = "Plugins Colors"
	)
	default Color utilityColor()
	{
		return Color.CYAN;
	}


}
