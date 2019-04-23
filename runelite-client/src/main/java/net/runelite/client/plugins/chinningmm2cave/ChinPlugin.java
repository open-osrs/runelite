package net.runelite.client.plugins.chinningmm2cave;

import com.google.inject.Binder;
import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.Text;

import java.util.ArrayList;

@PluginDescriptor(
		name = "MM2 Cave Chin Helper",
		description = "Swaps left click with \"Walk here\" and lets you pick up dropped prayer pots",
		tags = {"mm2", "chin", "fast xp", "ranged"},
		type = PluginType.UTILITY,
		enabledByDefault = false
)
public class ChinPlugin extends Plugin {

	@Inject
	Client client;

	@Override
	public void configure(Binder binder) {
	}

	@Override
	protected void startUp() throws Exception {
	}

	@Override
	protected void shutDown() throws Exception {
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded) {

		final String pOptionToReplace = Text.removeTags(menuEntryAdded.getOption()).toUpperCase();

		if ((client.getGameState() == GameState.LOGGED_IN) && (!pOptionToReplace.equals("CANCEL") | !pOptionToReplace.equals("WALK_HERE"))) {

			showMyOptions();

		}
	}

	private void stripEntries() {
		MenuEntry walkHereEntry = null;

		for (MenuEntry entry : client.getMenuEntries()) {
			switch (entry.getOption()) {
				case "Walk here":
					walkHereEntry = entry;
					break;
			}
		}
		if (walkHereEntry != null) {
			MenuEntry[] newEntries = new MenuEntry[1];
			newEntries[0] = walkHereEntry;
			client.setMenuEntries(newEntries);
		}
	}

	private void showMyOptions() {
		MenuEntry walkHereEntry = null;

		ArrayList<MenuEntry> menuEntryArrayList = new ArrayList<>();

		//we do it like this cause walk here has destination data
		for (MenuEntry entry : client.getMenuEntries()) {
			switch (entry.getOption()) {
				case "Walk here":
					walkHereEntry = entry;
					menuEntryArrayList.add(0, walkHereEntry);
					break;
				case "Take":
					final String itemName = Text.removeTags(entry.getTarget());
					if (itemName.equals("Prayer potion(1)")) {
						menuEntryArrayList.add(entry);
					}
					break;
			}
			//log.debug("option: " + entry.getOption());
		}

		if (walkHereEntry != null) {
			MenuEntry[] entries;

			//this puts walk here on the top
			menuEntryArrayList.set(0, menuEntryArrayList.get(menuEntryArrayList.size()-1));
			menuEntryArrayList.set(menuEntryArrayList.size()-1, walkHereEntry);

			entries = new MenuEntry[menuEntryArrayList.size()];
			for (int i = 0 ; i < menuEntryArrayList.size() ; i++) {
				entries[i] = menuEntryArrayList.get(i);
			}

			client.setMenuEntries(entries);
		}
	}

}
