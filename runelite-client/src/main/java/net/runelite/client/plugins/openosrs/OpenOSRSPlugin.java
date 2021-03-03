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

import ch.qos.logback.classic.Logger;
import com.openosrs.client.config.OpenOSRSConfig;
import net.runelite.client.plugins.openosrs.externals.ExternalPluginManagerPanel;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.Keybind;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.HotkeyListener;
import net.runelite.client.util.ImageUtil;
import org.slf4j.LoggerFactory;

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
	private OpenOSRSConfig config;

	@Inject
	private KeyManager keyManager;

	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	private NavigationButton navButton;

	private final HotkeyListener hotkeyListener = new HotkeyListener(() -> this.keybind)
	{
		@Override
		public void hotkeyPressed()
		{
			if (client == null)
			{
				return;
			}
			detach = !detach;
			client.setOculusOrbState(detach ? 1 : 0);
			client.setOculusOrbNormalSpeed(detach ? 36 : 12);
		}
	};
	private boolean detach;
	private Keybind keybind;

	@Override
	protected void startUp()
	{
		ExternalPluginManagerPanel panel = injector.getInstance(ExternalPluginManagerPanel.class);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "externalmanager_icon.png");

		navButton = NavigationButton.builder()
			.tooltip("External Plugin Manager")
			.icon(icon)
			.priority(1)
			.panel(panel)
			.build();
		clientToolbar.addNavigation(navButton);

		this.keybind = config.detachHotkey();
		keyManager.registerKeyListener(hotkeyListener);
	}

	@Override
	protected void shutDown()
	{
		clientToolbar.removeNavigation(navButton);
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("openosrs"))
		{
			return;
		}

		this.keybind = config.detachHotkey();

		if (event.getKey().equals("shareLogs") && !config.shareLogs())
		{
			final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
			logger.detachAppender("Sentry");
		}
	}

}