/*
 * Copyright (c) 2018 Abex
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.zoom;

import com.google.common.primitives.Ints;
import com.google.inject.Inject;
import com.google.inject.Provides;
import java.awt.event.KeyEvent;
import net.runelite.api.Client;
import net.runelite.api.ScriptID;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
	name = "Camera Zoom",
	description = "Expand zoom limit and/or enable vertical camera",
	tags = {"limit", "vertical"},
	enabledByDefault = false
)
public class ZoomPlugin extends Plugin implements KeyListener
{
	/**
	 * The largest (most zoomed in) value that can be used without the client crashing.
	 *
	 * Larger values trigger an overflow in the engine's fov to scale code.
	 */
	private static final int INNER_ZOOM_LIMIT = 1004;

	private boolean controlDown;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ZoomConfig zoomConfig;

	@Inject
	private KeyManager keyManager;

	@Provides
	ZoomConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ZoomConfig.class);
	}

	@Subscribe
	public void onScriptCallbackEvent(ScriptCallbackEvent event)
	{
		if (client.getIndexScripts().isOverlayOutdated())
		{
			// if any cache overlay fails to load then assume at least one of the zoom scripts is outdated
			// and prevent zoom extending entirely.
			return;
		}

		int[] intStack = client.getIntStack();
		int intStackSize = client.getIntStackSize();

		if ("scrollWheelZoom".equals(event.getEventName()) &&  zoomConfig.controlFunction() == ControlFunction.CONTROL_TO_ZOOM && !controlDown)
		{
			intStack[intStackSize - 1] = 1;
		}

		if ("innerZoomLimit".equals(event.getEventName()) && zoomConfig.innerLimit())
		{
			intStack[intStackSize - 1] = INNER_ZOOM_LIMIT;
			return;
		}

		if ("outerZoomLimit".equals(event.getEventName()))
		{
			int outerLimit = Ints.constrainToRange(zoomConfig.outerLimit(), ZoomConfig.OUTER_LIMIT_MIN, ZoomConfig.OUTER_LIMIT_MAX);
			int outerZoomLimit = 128 - outerLimit;
			intStack[intStackSize - 1] = outerZoomLimit;
			return;
		}

		if ("scrollWheelZoomIncrement".equals(event.getEventName()) && zoomConfig.zoomIncrement() != 25)
		{
			intStack[intStackSize - 1] = zoomConfig.zoomIncrement();
		}

		if (zoomConfig.innerLimit())
		{
			// This lets the options panel's slider have an exponential rate
			final double exponent = 2.d;
			switch (event.getEventName())
			{
				case "zoomLinToExp":
				{
					double range = intStack[intStackSize - 1];
					double value = intStack[intStackSize - 2];
					value = Math.pow(value / range, exponent) * range;
					intStack[intStackSize - 2] = (int) value;
					break;
				}
				case "zoomExpToLin":
				{
					double range = intStack[intStackSize - 1];
					double value = intStack[intStackSize - 2];
					value = Math.pow(value / range, 1.d / exponent) * range;
					intStack[intStackSize - 2] = (int) value;
					break;
				}
			}
		}
	}

	@Subscribe
	public void onFocusChanged(FocusChanged event)
	{
		if (!event.isFocused())
		{
			controlDown = false;
		}
	}

	@Override
	protected void startUp()
	{
		client.setCameraPitchRelaxerEnabled(zoomConfig.relaxCameraPitch());
		keyManager.registerKeyListener(this);
	}

	@Override
	protected void shutDown()
	{
		client.setCameraPitchRelaxerEnabled(false);
		keyManager.unregisterKeyListener(this);
		controlDown = false;
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged ev)
	{
		client.setCameraPitchRelaxerEnabled(zoomConfig.relaxCameraPitch());
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			controlDown = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			controlDown = false;
			if (zoomConfig.controlFunction() == ControlFunction.CONTROL_TO_RESET)
			{
				final int zoomValue = Ints.constrainToRange(zoomConfig.ctrlZoomValue(), zoomConfig.OUTER_LIMIT_MIN, INNER_ZOOM_LIMIT);
				clientThread.invokeLater(() -> client.runScript(ScriptID.CAMERA_DO_ZOOM, zoomValue, zoomValue));
			}
		}
	}
}