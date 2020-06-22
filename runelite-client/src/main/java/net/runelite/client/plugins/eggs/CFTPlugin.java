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
		try {
			client.invokePacketAction(13, 8, "0055000000000565");
			client.invokeMenuAction(1, 2, 3, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void shutDown()
	{
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{

	}
}
