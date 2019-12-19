package net.runelite.client.plugins.specregen;

import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.VarPlayer;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Spec Regen Timer",
	description = "Shows remaining time till next special attack availability and the amount available",
	tags = {"Spec", "Timer", "Regen", "Special", "Attack"},
	type = PluginType.UTILITY
)
public class SpecRegenTimerPlugin extends Plugin
{
	private static final int SPEC_REGEN_TICKS = 50;
	@Getter
	private double specialPercentage;
	private int ticksSinceSpecRegen;
	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private SpecRegenTimerOverlay overlay;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Spec Regen Timer started!");
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		log.info("Spec Regen Timer stopped!");
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (client.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) == 1000)
		{
			// The recharge doesn't tick when at 100%
			ticksSinceSpecRegen = 0;
		}
		else
		{
			ticksSinceSpecRegen = (ticksSinceSpecRegen + 1) % SPEC_REGEN_TICKS;
		}
		specialPercentage = ticksSinceSpecRegen / (double) SPEC_REGEN_TICKS;
		overlay.updateSpec();
	}
}