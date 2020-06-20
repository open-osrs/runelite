package net.runelite.client.plugins.eggs;

import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import javax.inject.Inject;

@PluginDescriptor(
		name = "CFT Plugin",
		enabledByDefault = false
)
public class CFTPlugin extends Plugin
{
	@Inject
	private Client client;

	@Override
	protected void startUp()
	{
		System.out.println("on");
	}

	@Override
	protected void shutDown()
	{
		System.out.println("off");
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{

	}
}
