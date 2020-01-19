package net.runelite.client.plugins.freezetimersv2;

import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import javax.inject.Inject;

@PluginDescriptor(
	name = "Freeze Timers v2",
	description = "Freeze/teleblock/veng timer overlay on players",
	tags = {"freeze", "timers", "barrage", "teleblock", "pklite"},
	type = PluginType.PVP,
	enabledByDefault = false
)
public class FreezeTimersPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private PrayerTracker prayerTracker;
	@Getter(AccessLevel.PACKAGE)
	@Inject
	private TimerManager timerManager;
	@Inject
	private FreezeTimersOverlay overlay;

	@Override
	public void startUp()
	{
		overlayManager.add(overlay);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(overlay);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		prayerTracker.gameTick();
	}
}
