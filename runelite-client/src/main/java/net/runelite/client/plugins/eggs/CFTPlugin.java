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
		//0x00 00 00 95 80 00 65 05
		client.invokePacketAction(18, 8, hexStringToByteArray("0000009580006505"));
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

	private static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
					+ Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}
}
