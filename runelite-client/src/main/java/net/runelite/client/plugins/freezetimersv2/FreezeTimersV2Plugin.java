/*
 * Copyright (c) 2020 ThatGamerBlue
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
package net.runelite.client.plugins.freezetimersv2;

import com.google.inject.Provides;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.SpotAnimationChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.HotkeyListener;
import javax.inject.Inject;

@PluginDescriptor(
	name = "Freeze Timers v2",
	description = "Freeze/teleblock/veng timer overlay on players",
	tags = {"freeze", "timers", "barrage", "teleblock", "pklite"},
	type = PluginType.PVP,
	enabledByDefault = false
)
public class FreezeTimersV2Plugin extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private PrayerTracker prayerTracker;
	@Inject
	private TimerManager timerManager;
	@Inject
	private FreezeTimersV2Overlay overlay;
	@Inject
	private FreezeTimersV2Config config;
	@Inject
	private KeyManager keyManager;

	private int fakeSpotAnim = -1;
	private HotkeyListener hotkeyListener = new HotkeyListener(() -> config.debugKeybind())
	{
		public void hotkeyPressed()
		{
			fakeSpotAnim = config.debugInteger();
		}
	};

	@Provides
	public FreezeTimersV2Config getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FreezeTimersV2Config.class);
	}

	@Override
	public void startUp()
	{
		overlayManager.add(overlay);
		keyManager.registerKeyListener(hotkeyListener);
	}

	@Override
	public void shutDown()
	{
		keyManager.unregisterKeyListener(hotkeyListener);
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		prayerTracker.gameTick();

		if (fakeSpotAnim != -1)
		{
			SpotAnimationChanged event = new SpotAnimationChanged();
			event.setActor(client.getLocalPlayer());
			onSpotAnimChanged(event);
		}
	}

	@Subscribe
	public void onSpotAnimChanged(SpotAnimationChanged event)
	{
		Actor actor = event.getActor();
		int spotAnim = fakeSpotAnim == -1 ? actor.getSpotAnimation() : fakeSpotAnim;
		fakeSpotAnim = -1;
		if (spotAnim == prayerTracker.getSpotanimLastTick(event.getActor()))
		{
			return;
		}

		PlayerSpellEffect effect = PlayerSpellEffect.getFromSpotAnim(spotAnim);

		if (effect == null)
		{
			return;
		}

		if (timerManager.hasTimerActive(actor, effect.getType()))
		{
			return;
		}

		timerManager.setTimerFor(actor, effect.getType(), new Timer(client, effect));
	}
}
