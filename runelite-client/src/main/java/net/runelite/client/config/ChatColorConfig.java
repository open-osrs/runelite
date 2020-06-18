/*
 * Copyright (c) 2018, Hydrox6 <ikada@protonmail.ch>
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
package net.runelite.client.config;

import java.awt.Color;
import net.runelite.client.ui.JagexColors;

@ConfigGroup("textrecolor")
public interface ChatColorConfig extends Config
{
	@ConfigTitleSection(
		keyName = "opaqueTitle",
		name = "Opaque",
		description = "",
		position = 1
	)
	default Title opaqueTitle()
	{
		return new Title();
	}

	@ConfigTitleSection(
		keyName = "transparentTitle",
		name = "Transparent",
		description = "",
		position = 1
	)
	default Title transparentTitle()
	{
		return new Title();
	}

	@ConfigItem(
		position = 1,
		keyName = "opaquePublicChat",
		name = "Public chat",
		description = "Color of Public chat",
		titleSection = "opaqueTitle"
	)
	Color opaquePublicChat();

	@ConfigItem(
		position = 2,
		keyName = "opaquePublicChatHighlight",
		name = "Public chat highlight",
		description = "Color of highlights in Public chat",
		titleSection = "opaqueTitle"
	)
	default Color opaquePublicChatHighlight()
	{
		return Color.decode("#000000");
	}

	@ConfigItem(
		position = 3,
		keyName = "opaquePrivateMessageSent",
		name = "Sent private messages",
		description = "Color of Private messages you've sent",
		titleSection = "opaqueTitle"
	)
	Color opaquePrivateMessageSent();

	@ConfigItem(
		position = 4,
		keyName = "opaquePrivateMessageSentHighlight",
		name = "Sent private messages highlight",
		description = "Color of highlights in Private messages you've sent",
		titleSection = "opaqueTitle"
	)
	default Color opaquePrivateMessageSentHighlight()
	{
		return Color.decode("#002783");
	}

	@ConfigItem(
		position = 5,
		keyName = "opaquePrivateMessageReceived",
		name = "Received private messages",
		description = "Color of Private messages you've received",
		titleSection = "opaqueTitle"
	)
	Color opaquePrivateMessageReceived();

	@ConfigItem(
		position = 6,
		keyName = "opaquePrivateMessageReceivedHighlight",
		name = "Received private messages highlight",
		description = "Color of highlights in Private messages you've received",
		titleSection = "opaqueTitle"
	)
	default Color opaquePrivateMessageReceivedHighlight()
	{
		return Color.decode("#002783");
	}

	@ConfigItem(
		position = 7,
		keyName = "opaqueClanChatInfo",
		name = "Friends chat info",
		description = "Friends Chat Information (eg. when joining a channel)",
		titleSection = "opaqueTitle"
	)
	default Color opaqueFriendsChatInfo()
	{
		return JagexColors.CHAT_GAME_EXAMINE_TEXT_OPAQUE_BACKGROUND;
	}

	@ConfigItem(
		position = 8,
		keyName = "opaqueClanChatInfoHighlight",
		name = "Friends chat info highlight",
		description = "Friends Chat Information highlight (used for the Raids plugin)",
		titleSection = "opaqueTitle"
	)
	default Color opaqueFriendsChatInfoHighlight()
	{
		return Color.RED;
	}

	@ConfigItem(
		position = 9,
		keyName = "opaqueClanChatMessage",
		name = "Friends chat message",
		description = "Color of Friends chat messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueFriendsChatMessage();

	@ConfigItem(
		position = 10,
		keyName = "opaqueClanChatMessageHighlight",
		name = "Friends chat message highlight",
		description = "Color of highlights in Friends Chat messages",
		titleSection = "opaqueTitle"
	)
	default Color opaqueFriendsChatMessageHighlight()
	{
		return Color.decode("#000000");
	}

	@ConfigItem(
		position = 11,
		keyName = "opaqueAutochatMessage",
		name = "Autochat",
		description = "Color of Autochat messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueAutochatMessage();

	@ConfigItem(
		position = 12,
		keyName = "opaqueAutochatMessageHighlight",
		name = "Autochat highlight",
		description = "Color of highlights in Autochat messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueAutochatMessageHighlight();

	@ConfigItem(
		position = 13,
		keyName = "opaqueTradeChatMessage",
		name = "Trade chat",
		description = "Color of Trade Chat Messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueTradeChatMessage();

	@ConfigItem(
		position = 14,
		keyName = "opaqueTradeChatMessageHighlight",
		name = "Trade chat highlight",
		description = "Color of highlights in Trade Chat Messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueTradeChatMessageHighlight();

	@ConfigItem(
		position = 15,
		keyName = "opaqueServerMessage",
		name = "Server message",
		description = "Color of Server Messages (eg. 'Welcome to RuneScape')",
		titleSection = "opaqueTitle"
	)
	Color opaqueServerMessage();

	@ConfigItem(
		position = 16,
		keyName = "opaqueServerMessageHighlight",
		name = "Server message highlight",
		description = "Color of highlights in Server Messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueServerMessageHighlight();

	@ConfigItem(
		position = 17,
		keyName = "opaqueGameMessage",
		name = "Game message",
		description = "Color of Game Messages",
		titleSection = "opaqueTitle"
	)
	Color opaqueGameMessage();

	@ConfigItem(
		position = 18,
		keyName = "opaqueGameMessageHighlight",
		name = "Game message highlight",
		description = "Color of highlights in Game Messages",
		titleSection = "opaqueTitle"
	)
	default Color opaqueGameMessageHighlight()
	{
		return Color.decode("#EF1020");
	}

	@ConfigItem(
		position = 19,
		keyName = "opaqueExamine",
		name = "Examine",
		description = "Color of Examine Text",
		titleSection = "opaqueTitle"
	)
	Color opaqueExamine();

	@ConfigItem(
		position = 20,
		keyName = "opaqueExamineHighlight",
		name = "Examine highlight",
		description = "Color of highlights in Examine Text",
		titleSection = "opaqueTitle"
	)
	default Color opaqueExamineHighlight()
	{
		return Color.decode("#0000FF");
	}

	@ConfigItem(
		position = 21,
		keyName = "opaqueFiltered",
		name = "Filtered",
		description = "Color of Filtered Text (messages that aren't shown when Game messages are filtered)",
		titleSection = "opaqueTitle"
	)
	Color opaqueFiltered();

	@ConfigItem(
		position = 22,
		keyName = "opaqueFilteredHighlight",
		name = "Filtered highlight",
		description = "Color of highlights in Filtered Text",
		titleSection = "opaqueTitle"
	)
	Color opaqueFilteredHighlight();

	@ConfigItem(
		position = 23,
		keyName = "opaqueUsername",
		name = "Usernames",
		description = "Color of Usernames",
		titleSection = "opaqueTitle"
	)
	Color opaqueUsername();

	@ConfigItem(
		position = 24,
		keyName = "opaquePrivateUsernames",
		name = "Private chat usernames",
		description = "Color of Usernames in Private Chat",
		titleSection = "opaqueTitle"
	)
	Color opaquePrivateUsernames();

	@ConfigItem(
		position = 25,
		keyName = "opaqueClanChannelName",
		name = "Friends chat channel name",
		description = "Color of Friends chat channel name",
		titleSection = "opaqueTitle"
	)
	Color opaqueFriendsChatChannelName();

	@ConfigItem(
		position = 26,
		keyName = "opaqueClanUsernames",
		name = "Friends chat usernames",
		description = "Color of usernames in Friends chat",
		titleSection = "opaqueTitle"
	)
	Color opaqueFriendsChatUsernames();

	@ConfigItem(
		position = 27,
		keyName = "opaquePublicFriendUsernames",
		name = "Public friend usernames",
		description = "Color of Friend Usernames in Public Chat",
		titleSection = "opaqueTitle"
	)
	Color opaquePublicFriendUsernames();

	@ConfigItem(
		position = 51,
		keyName = "transparentPublicChat",
		name = "Public chat (transparent)",
		description = "Color of Public chat (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentPublicChat();

	@ConfigItem(
		position = 52,
		keyName = "transparentPublicChatHighlight",
		name = "Public chat highlight (transparent)",
		description = "Color of highlights in Public chat (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentPublicChatHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 53,
		keyName = "transparentPrivateMessageSent",
		name = "Sent private messages (transparent)",
		description = "Color of Private messages you've sent (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentPrivateMessageSent();

	@ConfigItem(
		position = 54,
		keyName = "transparentPrivateMessageSentHighlight",
		name = "Sent private messages highlight (transparent)",
		description = "Color of highlights in Private messages you've sent (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentPrivateMessageSentHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 55,
		keyName = "transparentPrivateMessageReceived",
		name = "Received private messages (transparent)",
		description = "Color of Private messages you've received (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentPrivateMessageReceived();

	@ConfigItem(
		position = 56,
		keyName = "transparentPrivateMessageReceivedHighlight",
		name = "Received private messages highlight (transparent)",
		description = "Color of highlights in Private messages you've received (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentPrivateMessageReceivedHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 57,
		keyName = "transparentClanChatInfo",
		name = "Friends chat info (transparent)",
		description = "Friends chat information (eg. when joining a channel) (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentFriendsChatInfo()
	{
		return JagexColors.CHAT_GAME_EXAMINE_TEXT_TRANSPARENT_BACKGROUND;
	}

	@ConfigItem(
		position = 58,
		keyName = "transparentClanChatInfoHighlight",
		name = "Friends chat info highlight (transparent)",
		description = "Friends chat information highlight (used for the Raids plugin) (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentFriendsChatInfoHighlight()
	{
		return Color.RED;
	}

	@ConfigItem(
		position = 59,
		keyName = "transparentClanChatMessage",
		name = "Friends chat message (transparent)",
		description = "Color of Friends chat messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentFriendsChatMessage();

	@ConfigItem(
		position = 60,
		keyName = "transparentClanChatMessageHighlight",
		name = "Friends chat message highlight (transparent)",
		description = "Color of highlights in Friends chat messages (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentFriendsChatMessageHighlight()
	{
		return Color.decode("#FFFFFF");
	}

	@ConfigItem(
		position = 61,
		keyName = "transparentAutochatMessage",
		name = "Autochat (transparent)",
		description = "Color of Autochat messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentAutochatMessage();

	@ConfigItem(
		position = 62,
		keyName = "transparentAutochatMessageHighlight",
		name = "Autochat highlight (transparent)",
		description = "Color of highlights in Autochat messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentAutochatMessageHighlight();

	@ConfigItem(
		position = 63,
		keyName = "transparentTradeChatMessage",
		name = "Trade chat (transparent)",
		description = "Color of Trade Chat Messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentTradeChatMessage();

	@ConfigItem(
		position = 64,
		keyName = "transparentTradeChatMessageHighlight",
		name = "Trade chat highlight (transparent)",
		description = "Color of highlights in Trade Chat Messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentTradeChatMessageHighlight();

	@ConfigItem(
		position = 65,
		keyName = "transparentServerMessage",
		name = "Server message (transparent)",
		description = "Color of Server Messages (eg. 'Welcome to RuneScape') (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentServerMessage();

	@ConfigItem(
		position = 66,
		keyName = "transparentServerMessageHighlight",
		name = "Server message highlight (transparent)",
		description = "Color of highlights in Server Messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentServerMessageHighlight();

	@ConfigItem(
		position = 67,
		keyName = "transparentGameMessage",
		name = "Game message (transparent)",
		description = "Color of Game Messages (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentGameMessage();

	@ConfigItem(
		position = 68,
		keyName = "transparentGameMessageHighlight",
		name = "Game message highlight (transparent)",
		description = "Color of highlights in Game Messages (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentGameMessageHighlight()
	{
		return Color.decode("#EF1020");
	}

	@ConfigItem(
		position = 69,
		keyName = "transparentExamine",
		name = "Examine (transparent)",
		description = "Color of Examine Text (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentExamine();

	@ConfigItem(
		position = 70,
		keyName = "transparentExamineHighlight",
		name = "Examine highlight (transparent)",
		description = "Color of highlights in Examine Text (transparent)",
		titleSection = "transparentTitle"
	)
	default Color transparentExamineHighlight()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		position = 71,
		keyName = "transparentFiltered",
		name = "Filtered (transparent)",
		description = "Color of Filtered Text (messages that aren't shown when Game messages are filtered) (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentFiltered();

	@ConfigItem(
		position = 72,
		keyName = "transparentFilteredHighlight",
		name = "Filtered highlight (transparent)",
		description = "Color of highlights in Filtered Text (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentFilteredHighlight();

	@ConfigItem(
		position = 73,
		keyName = "transparentUsername",
		name = "Usernames (transparent)",
		description = "Color of Usernames (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentUsername();

	@ConfigItem(
		position = 74,
		keyName = "transparentPrivateUsernames",
		name = "Private chat usernames (transparent)",
		description = "Color of Usernames in Private Chat (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentPrivateUsernames();

	@ConfigItem(
		position = 75,
		keyName = "transparentClanChannelName",
		name = "Friends chat channel name (transparent)",
		description = "Color of Friends chat channel name (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentFriendsChatChannelName();

	@ConfigItem(
		position = 76,
		keyName = "transparentClanUsernames",
		name = "Friends chat usernames (transparent)",
		description = "Color of usernames in Friends chat (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentFriendsChatUsernames();

	@ConfigItem(
		position = 77,
		keyName = "transparentPublicFriendUsernames",
		name = "Public friend usernames (transparent)",
		description = "Color of Friend Usernames in Public Chat (transparent)",
		titleSection = "transparentTitle"
	)
	Color transparentPublicFriendUsernames();
}
