package net.runelite.client.plugins.joinclan;

import net.runelite.api.Client;
import net.runelite.api.ScriptID;
import net.runelite.api.events.PlayerMenuOptionClicked;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Join Clan",
		description = "Adds \"Join clan\" option when you right click a player!",
		tags = {"utility", "clan", "menu", "option", "cox", "raids"},
		enabledByDefault = false,
		type = PluginType.UTILITY
)
public class JoinClanPlugin extends Plugin {

	private static final String JOIN_CLAN = "Join clan";

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private MenuManager menuManager;

	@Override
	protected void startUp() throws Exception {
		menuManager.addPlayerMenuItem(JOIN_CLAN);
	}

	@Override
	protected void shutDown() throws Exception {
		menuManager.removePlayerMenuItem(JOIN_CLAN);
	}

	@Subscribe
	public void onPlayerMenuOptionClicked(PlayerMenuOptionClicked event) {
		if (event.getMenuOption().equals(JOIN_CLAN))
			clientThread.invokeLater(() -> client.runScript(
					ScriptID.CUSTOM_JOIN_CLAN,
					event.getMenuTarget()
			));
	}
}
