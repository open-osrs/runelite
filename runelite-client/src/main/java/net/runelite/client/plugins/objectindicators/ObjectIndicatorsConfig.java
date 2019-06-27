/*
 * Copyright (c) 2019, Owain van Brakel <https://github.com/Owain94>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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

package net.runelite.client.plugins.objectindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import net.runelite.client.config.Stub;

@ConfigGroup("objectindicators")
public interface ObjectIndicatorsConfig extends Config
{
	@ConfigItem(
		keyName = "overlayStub",
		name = "Overlay Style",
		description = "",
		position = 0
	)
	default Stub overlayStub()
	{
		return new Stub();
	}

	@ConfigItem(
		position = 1,
		keyName = "objectMarkerRenderStyle",
		name = "Highlight Style",
		description = "Highlight setting",
		parent = "overlayStub"
	)
	default RenderStyle objectMarkerRenderStyle()
	{
		return RenderStyle.OUTLINE;
	}


	@ConfigItem(
		position = 2,
		keyName = "objectMarkerOutlineRenderStyle",
		name = "Outline Style",
		description = "Highlight outline setting",
		parent = "overlayStub",
		hidden = true,
		unhide = "objectMarkerRenderStyle",
		unhideValue = "OUTLINE"
	)
	default OutlineRenderStyle objectMarkerOutlineRenderStyle()
	{
		return OutlineRenderStyle.NORMAL_OUTLINE;
	}

	@ConfigItem(
		keyName = "colorStub",
		name = "Colors",
		description = "",
		position = 3
	)
	default Stub colorStub()
	{
		return new Stub();
	}

	@ConfigItem(
		position = 4,
		keyName = "markerColor",
		name = "Marker color",
		description = "Configures the outer color of object marker",
		parent = "colorStub"
	)
	default Color objectMarkerColor()
	{
		return Color.YELLOW;
	}

	@Range(
		max = 100
	)
	@ConfigItem(
		position = 5,
		keyName = "objectMarkerAlpha",
		name = "Alpha",
		description = "Configures the opacity/alpha of object marker",
		parent = "colorStub"
	)
	default int objectMarkerAlpha()
	{
		return 100;
	}
}