package net.runelite.client.plugins.blackjack;

import com.google.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

@PluginDescriptor(
	name = "Blackjack Helper",
	description = "Uses timers and chat messages to blackjack instead of NPC animations NOT COMPATIBLE WITH OTHER BLACKJACK PLUGIN",
	tags = {"blackjack", "thieving", "ez gains", "swap", "utility"},
	enabledByDefault = false,
	type = PluginType.UTILITY
)
public class BlackjackPlugin extends Plugin
{

	private static long timeSinceKnockout;
	private static long timeSinceAggro;

	@Inject
	Client client;

	@Override
	protected void startUp() throws Exception
	{
	}

	@Override
	protected void shutDown() throws Exception
	{
	}

	//pulled from the menu entry swapper
	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
	{
		String option = menuEntryAdded.getOption();
		String target = menuEntryAdded.getTarget().toLowerCase();

		if (option.equalsIgnoreCase("attack"))
		{
			if ((target.contains("bandit") | target.contains("menaphite thug")))
			{
				Quest quest = Quest.THE_FEUD;
				if (quest.getState(client) == QuestState.FINISHED)
				{
					if (System.currentTimeMillis() < (timeSinceKnockout + 2300))
					{
						stripMenuEntries("pickpocket");
					}
					if (System.currentTimeMillis() < (timeSinceAggro + 1300))
					{
						stripMenuEntries("pickpocket");
					}
					stripMenuEntries("knock-out");
				}
			}
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		if (chatMessage.getType() == ChatMessageType.SPAM)
		{
			if (chatMessage.getMessage().equalsIgnoreCase("You smack the bandit over the head and render them unconscious."))
			{
				timeSinceKnockout = System.currentTimeMillis();
			}
			else if (chatMessage.getMessage().equalsIgnoreCase("Your blow only glances off the bandit's head."))
			{
				timeSinceAggro = System.currentTimeMillis();
			}
		}
	}

	private void stripMenuEntries(String exceptFor)
	{
		MenuEntry[] currentEntries = client.getMenuEntries();
		MenuEntry[] newEntries = new MenuEntry[2];

		for (MenuEntry entry : currentEntries)
		{
			if (entry.getOption().equalsIgnoreCase(exceptFor))
			{
				newEntries[1] = entry;
				//this additional for loop is to add lure into the menu entries
				for (MenuEntry entry1 : currentEntries)
				{
					if (entry1.getOption().equalsIgnoreCase("lure"))
					{
						newEntries[0] = entry1;
					}
				}
			}
		}

		if (newEntries[0] != null)
		{
			client.setMenuEntries(newEntries);
		}
	}

}
