/*
 * Copyright (c) 2017, Tyler <http://github.com/tylerthardy>
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
package net.runelite.client.plugins.runepouch;

import com.google.inject.Provides;
import java.awt.Color;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.events.ConfigChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.runepouch.config.RunePouchOverlayMode;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Rune Pouch",
	description = "Show the contents of your rune pouch",
	tags = {"combat", "magic", "overlay"}
)
@Singleton
public class RunepouchPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private RunepouchOverlay overlay;

	@Inject
	private RunepouchConfig config;

	@Getter(AccessLevel.PACKAGE)
	private Color fontColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean showIcons;
	@Getter(AccessLevel.PACKAGE)
	private RunePouchOverlayMode runePouchOverlayMode;

	@Provides
	RunepouchConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RunepouchConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		updateConfig();
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("runepouch"))
		{
			return;
		}

		updateConfig();
	}

	private void updateConfig()
	{
		this.fontColor = config.fontColor();
		this.showIcons = config.showIcons();
		this.runePouchOverlayMode = config.runePouchOverlayMode();
	}
}
