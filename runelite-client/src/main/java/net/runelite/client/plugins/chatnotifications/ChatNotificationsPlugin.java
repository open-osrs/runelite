/*
 * Copyright (c) 2018, Hydrox6 <ikada@protonmail.ch>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.chatnotifications;

import com.google.common.base.Strings;
import com.google.inject.Provides;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.quote;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.Notifier;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;

@PluginDescriptor(
	name = "Chat Notifications",
	description = "Highlight and notify you of chat messages",
	tags = {"duel", "messages", "notifications", "trade", "username"},
	enabledByDefault = false
)
public class ChatNotificationsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ChatNotificationsConfig config;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private Notifier notifier;

	@Inject
	private RuneLiteProperties runeLiteProperties;

	//Custom Highlights
	private Pattern usernameMatcher = null;
	private String usernameReplacer = "";
	private Pattern highlightMatcher = null;

	@Provides
	ChatNotificationsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ChatNotificationsConfig.class);
	}

	@Override
	public void startUp()
	{
		updateHighlights();
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		switch (event.getGameState())
		{
			case LOGIN_SCREEN:
			case HOPPING:
				usernameMatcher = null;
				break;
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("chatnotification"))
		{
			updateHighlights();
		}
	}

	private void updateHighlights()
	{
		highlightMatcher = null;

		if (!config.highlightWordsString().trim().equals(""))
		{
			List<String> items = Text.fromCSV(config.highlightWordsString());
			String joined = items.stream()
				.map(Pattern::quote)
				.collect(Collectors.joining("|"));
			highlightMatcher = Pattern.compile("\\b(" + joined + ")\\b", Pattern.CASE_INSENSITIVE);
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		MessageNode messageNode = chatMessage.getMessageNode();
		String nodeValue = Text.removeTags(messageNode.getValue());
		boolean update = false;

		switch (chatMessage.getType())
		{
			case TRADEREQ:
				if (chatMessage.getMessage().contains("wishes to trade with you.") && config.notifyOnTrade())
				{
					notifier.notify(chatMessage.getMessage());
				}
				break;
			case CHALREQ_TRADE:
				if (chatMessage.getMessage().contains("wishes to duel with you.") && config.notifyOnDuel())
				{
					notifier.notify(chatMessage.getMessage());
				}
				break;
			case CONSOLE:
				// Don't notify for notification messages
				if (chatMessage.getName().equals(runeLiteProperties.getTitle()))
				{
					return;
				}
				break;
		}

		if (usernameMatcher == null && client.getLocalPlayer() != null && client.getLocalPlayer().getName() != null)
		{
			String username = client.getLocalPlayer().getName();
			usernameMatcher = Pattern.compile("\\b(" + quote(username) + ")\\b", Pattern.CASE_INSENSITIVE);
			usernameReplacer = "<col" + ChatColorType.HIGHLIGHT.name() + "><u>" + username + "</u><col" + ChatColorType.NORMAL.name() + ">";
		}

		if (config.highlightOwnName() && usernameMatcher != null)
		{
			Matcher matcher = usernameMatcher.matcher(messageNode.getValue());
			if (matcher.find())
			{
				messageNode.setValue(matcher.replaceAll(usernameReplacer));
				update = true;

				if (config.notifyOnOwnName())
				{
					sendNotification(chatMessage);
				}
			}
		}

		if (highlightMatcher != null)
		{
			Matcher matcher = highlightMatcher.matcher(nodeValue);
			boolean found = false;
			StringBuffer stringBuffer = new StringBuffer();

			while (matcher.find())
			{
				String value = matcher.group();
				matcher.appendReplacement(stringBuffer, "<col" + ChatColorType.HIGHLIGHT + ">" + value + "<col" + ChatColorType.NORMAL + ">");
				update = true;
				found = true;
			}

			if (found)
			{
				matcher.appendTail(stringBuffer);
				messageNode.setValue(stringBuffer.toString());

				if (config.notifyOnHighlight())
				{
					sendNotification(chatMessage);
				}
			}
		}

		if (update)
		{
			messageNode.setRuneLiteFormatMessage(messageNode.getValue());
			chatMessageManager.update(messageNode);
		}
	}

	private void sendNotification(ChatMessage message)
	{
		String name = Text.removeTags(message.getName());
		String sender = message.getSender();
		StringBuilder stringBuilder = new StringBuilder();

		if (!Strings.isNullOrEmpty(sender))
		{
			stringBuilder.append('[').append(sender).append("] ");
		}

		if (!Strings.isNullOrEmpty(name))
		{
			stringBuilder.append(name).append(": ");
		}

		stringBuilder.append(Text.removeTags(message.getMessage()));
		String notification = stringBuilder.toString();
		notifier.notify(notification);
	}
}
