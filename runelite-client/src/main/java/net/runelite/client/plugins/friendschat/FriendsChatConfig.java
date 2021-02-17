/*
 * Copyright (c) 2017, Ron <https://github.com/raiyni>
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
package net.runelite.client.plugins.friendschat;

import java.awt.Color;
import net.runelite.api.FriendsChatRank;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("clanchat") // group name from the old plugin
public interface FriendsChatConfig extends Config
{
	@ConfigItem(
		keyName = "clanChatIcons",
		name = "Chat Icons",
		description = "Show rank icons next to friends chat members.",
		position = 1
	)
	default boolean chatIcons()
	{
		return true;
	}

	@ConfigItem(
		keyName = "recentChats",
		name = "Recent Chats",
		description = "Show recent friends chats.",
		position = 2
	)
	default boolean recentChats()
	{
		return true;
	}

	@ConfigItem(
		keyName = "clanCounter",
		name = "Members Counter",
		description = "Show the amount of friends chat members near you.",
		position = 3
	)
	default boolean showCounter()
	{
		return false;
	}

	@ConfigItem(
		keyName = "chatsData",
		name = "",
		description = "",
		hidden = true
	)
	default String chatsData()
	{
		return "";
	}

	@ConfigItem(
		keyName = "chatsData",
		name = "",
		description = ""
	)
	void chatsData(String str);

	@ConfigItem(
		keyName = "showJoinLeave",
		name = "Show Join/Leave",
		description = "Adds a temporary message notifying when a member joins or leaves.",
		position = 4
	)
	default boolean showJoinLeave()
	{
		return false;
	}

	@ConfigItem(
		keyName = "joinLeaveRank",
		name = "Join/Leave rank",
		description = "Only show join/leave messages for members at or above this rank.",
		position = 5
	)
	default FriendsChatRank joinLeaveRank()
	{
		return FriendsChatRank.UNRANKED;
	}

	@ConfigItem(
		keyName = "joinLeaveTimeout",
		name = "Join/Leave timeout",
		description = "Set the timeout duration of join/leave messages. A value of 0 will make the messages permanent.",
		position = 6
	)
	default int joinLeaveTimeout()
	{
		return 20;
	}

	@ConfigItem(
		keyName = "privateMessageIcons",
		name = "Private Message Icons",
		description = "Add rank icons to private messages received from members.",
		position = 7
	)
	default boolean privateMessageIcons()
	{
		return false;
	}

	@ConfigItem(
		keyName = "publicChatIcons",
		name = "Public Chat Icons",
		description = "Add rank icons to public chat messages from members.",
		position = 8
	)
	default boolean publicChatIcons()
	{
		return false;
	}

	@ConfigItem(
		keyName = "clanTabChat",
		name = "Tab Chat",
		description = "Message friends chat without appending '/' when the friends chat tab is selected.",
		position = 9
	)
	default boolean friendsChatTabChat()
	{
		return false;
	}

	@ConfigItem(
		keyName = "confirmKicks",
		name = "Confirm Kicks",
		description = "Shows a chat prompt to confirm kicks",
		position = 10
	)
	default boolean confirmKicks()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showIgnores",
		name = "Recolor ignored players",
		description = "Recolor members who are on your ignore list",
		position = 11
	)
	default boolean showIgnores()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showIgnoresColor",
		name = "Ignored color",
		description = "Allows you to change the color of the ignored players in your friends chat",
		position = 12
	)
	default Color showIgnoresColor()
	{
		return Color.RED;
	}
}
