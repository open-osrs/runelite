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
package net.runelite.client.plugins.openosrs;

import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.openosrs.externals.ExternalPluginManagerPanel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

@PluginDescriptor(
	loadWhenOutdated = true, // prevent users from disabling
	hidden = true, // prevent users from disabling
	name = "OpenOSRS"
)
@Singleton
@Slf4j
public class OpenOSRSPlugin extends Plugin
{
	@Inject
	private ConfigManager configManager;

	@Nullable
	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	private NavigationButton navButton;

	@Override
	protected void startUp()
	{
		if (client == null)
		{
			return;
		}

		ExternalPluginManagerPanel panel = injector.getInstance(ExternalPluginManagerPanel.class);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "externalmanager_icon.png");

		navButton = NavigationButton.builder()
			.tooltip("External Plugin Manager")
			.icon(icon)
			.priority(1)
			.panel(panel)
			.build();
		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown()
	{
		if (navButton != null)
		{
			clientToolbar.removeNavigation(navButton);
		}
	}

	@Subscribe
	protected void onConfigChanged(ConfigChanged event)
	{
		if (OS.getOs() == OS.OSType.MacOS && event.getGroup().equals("openosrs") && event.getKey().equals("disableHw"))
		{
			boolean disableHw = configManager.getConfiguration("openosrs", "disableHw", Boolean.class);

			if (disableHw)
			{
				JOptionPane.showMessageDialog(ClientUI.getFrame(), "You can't disable hardware acceleration on MacOS", "Critical situation prevented", JOptionPane.ERROR_MESSAGE);
				configManager.setConfiguration("openosrs", "disableHw", false);
			}
		}
	}
}