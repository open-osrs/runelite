package net.runelite.client.plugins.leftclickglorytele;

import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;


@PluginDescriptor(
	name = "Left Click Glory",
	description = "Makes Edge tele the left click option for equipped glories",
	tags = {"pvp", "glory", "pvp", "bar", "pklite"},
	enabledByDefault = true
)
public class LeftClickGloryTelePlugin extends Plugin
{

	@Inject
	private Client client;

	@Subscribe
	private void onMenuEntryAdded(MenuEntryAdded event)
	{
		MenuEntry[] clientMenuEntries = client.getMenuEntries();

		for (int i = 0; i < clientMenuEntries.length; i++)
		{
			if (Text.removeTags(clientMenuEntries[i].getTarget().toLowerCase()).startsWith("amulet of glory(") &&
				clientMenuEntries[i].getOption().toLowerCase().equals("remove"))
			{
				MenuEntry edgeEntry = clientMenuEntries[i - 1];
				MenuEntry removeEntry = clientMenuEntries[i];
				clientMenuEntries[i] = edgeEntry;
				clientMenuEntries[i - 6] = removeEntry;
				client.setMenuEntries(clientMenuEntries);
			}
		}
	}
}
