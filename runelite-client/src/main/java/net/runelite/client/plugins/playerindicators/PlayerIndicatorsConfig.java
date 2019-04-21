/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("playerindicators")
public interface PlayerIndicatorsConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "drawOwnName",
		name = "Highlight own player",
		description = "Configures whether or not your own player should be highlighted"
	)
	default boolean highlightOwnPlayer()
	{
		return false;
	}

	@ConfigItem(
		position = 1,
		keyName = "ownNameColor",
		name = "Own player color",
		description = "Color of your own player"
	)
	default Color getOwnPlayerColor()
	{
		return new Color(0, 184, 212);
	}

	@ConfigItem(
		position = 2,
		keyName = "drawFriendNames",
		name = "Highlight friends",
		description = "Configures whether or not friends should be highlighted"
	)
	default boolean highlightFriends()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "friendNameColor",
		name = "Friend color",
		description = "Color of friend names"
	)
	default Color getFriendColor()
	{
		return new Color(0, 200, 83);
	}

	@ConfigItem(
		position = 4,
		keyName = "drawClanMemberNames",
		name = "Highlight clan members",
		description = "Configures whether or clan members should be highlighted"
	)
	default boolean drawClanMemberNames()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "clanMemberColor",
		name = "Clan member color",
		description = "Color of clan members"
	)
	default Color getClanMemberColor()
	{
		return new Color(170, 0, 255);
	}

	@ConfigItem(
		position = 6,
		keyName = "drawTeamMemberNames",
		name = "Highlight team members",
		description = "Configures whether or not team members should be highlighted"
	)
	default boolean highlightTeamMembers()
	{
		return true;
	}

	@ConfigItem(
		position = 7,
		keyName = "teamMemberColor",
		name = "Team member color",
		description = "Color of team members"
	)
	default Color getTeamMemberColor()
	{
		return new Color(19, 110, 247);
	}

	@ConfigItem(
		position = 8,
		keyName = "drawNonClanMemberNames",
		name = "Highlight non-clan members",
		description = "Configures whether or not non-clan members should be highlighted"
	)
	default boolean highlightNonClanMembers()
	{
		return false;
	}

	@ConfigItem(
		position = 9,
		keyName = "nonClanMemberColor",
		name = "Non-clan member color",
		description = "Color of non-clan member names"
	)
	default Color getNonClanMemberColor() { return Color.RED; }

	@ConfigItem(
			position = 10,
			keyName = "drawAttackerNames",
			name = "Highlight attacker players",
			description = "Configures whether or not attacker players should be highlighted"
	)
	default boolean highlightAttackerPlayers()
	{
		return false;
	}

	@ConfigItem(
			position = 11,
			keyName = "attackerColor",
			name = "Attacker player color",
			description = "Color of attacking player names"
	)
	default Color getAttackerPlayerColor() { return new Color(241, 0, 108); }

	@ConfigItem(
			position = 12,
			keyName = "drawAttackableNames",
			name = "Highlight attackable players",
			description = "Configures whether or not attackable players should be highlighted"
	)
	default boolean highlightAttackablePlayers()
	{
		return false;
	}

	@ConfigItem(
			position = 13,
			keyName = "attackableColor",
			name = "Attackable player color",
			description = "Color of attackable player names"
	)
	default Color getAttackablePlayerColor() { return new Color(231, 122,- 0); }

	@ConfigItem(
		position = 14,
		keyName = "drawPlayerTiles",
		name = "Draw tiles under players",
		description = "Configures whether or not tiles under highlighted players should be drawn"
	)
	default boolean drawTiles()
	{
		return false;
	}

	@ConfigItem(
		position = 15,
		keyName = "drawOverheadPlayerNames",
		name = "Draw names above players",
		description = "Configures whether or not player names should be drawn above players"
	)
	default boolean drawOverheadPlayerNames()
	{
		return true;
	}

	@ConfigItem(
		position = 16,
		keyName = "drawOverheadLevels",
		name = "Draw combat levels above players",
		description = "Configures whether or not combat levels should be drawn above players"
	)
	default boolean drawOverheadLevels()
	{
		return false;
	}

	@ConfigItem(
		position = 17,
		keyName = "drawMinimapNames",
		name = "Draw names on minimap",
		description = "Configures whether or not minimap names for players with rendered names should be drawn"
	)
	default boolean drawMinimapNames()
	{
		return false;
	}

	@ConfigItem(
		position = 18,
		keyName = "colorPlayerMenu",
		name = "Colorize player menu",
		description = "Color right click menu for players"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
	    position = 19,
		keyName = "clanMenuIcons",
		name = "Show clan ranks",
		description = "Add clan rank to right click menu and next to player names"
	)
	default boolean showClanRanks()
	{
		return true;
	}

    @ConfigItem(
            position = 20,
            keyName = "showOfflineFriends",
            name = "Show offline friends",
            description = "Draw friends names even if they're offline"
    )
    default boolean showOfflineFriends()
    {
        return true;
    }

	@ConfigItem(
			position = 21,
			keyName = "drawHighlightedNames",
			name = "Draw highlighted player names",
			description = "Configures whether or not highlighted player names should be drawn"
	)
	default boolean drawHighlightedNames()
	{
		return false;
	}

	@ConfigItem(
			keyName = "highlightedNames",
			name = "Highlighted names",
			description = "Clan caller names separated by a comma"
	)
	default String getHighlightedNames()
	{
		return "";
	}

	@ConfigItem(
			keyName = "highlightedNamesColor",
			name = "Highlighted names color",
			description = "Color of highlighted names"
	)
	default Color getHighlightedNamesColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
            position = 22,
			keyName = "drawHighlightedTargetNames",
			name = "Draw highlighted target names",
			description = "Configures whether or not highlighted target names should be drawn"
	)
	default boolean drawHighlightedTargetNames()
	{
		return false;
	}

	@ConfigItem(
			position = 23,
			keyName = "highlightedTargetColor",
			name = "Highlighted target color",
			description = "Color of highlighted target names"
	)
	default Color getHighlightedTargetColor()
	{
		return new Color(255, 100, 183);
	}

	@ConfigItem(
			position = 24,
			keyName = "limitLevel",
			name = "Limit Level",
			description = "Limit the players to show +-x your level. Useful for BH"
	)
	default boolean limitLevel()
	{
		return false;
	}

	@ConfigItem(
			position = 25,
			keyName = "level",
			name = "Level",
			description = "The level to limit players shown +-x"
	)
	default int intLevel()
	{
		return 5;
	}

    @ConfigItem(
            position = 26,
            keyName = "wildernessOnly",
            name = "Show only in wilderness",
            description = "Toggle whether or not to only show player indicators in the wilderness"
    )
    default boolean showInWildernessOnly()
    {
        return false;
    }

	@ConfigItem(
			position = 27,
			keyName="rightClickOverhead",
			name="Add Overheads to Right Click Menu",
			description="Feature shows a player's overhead prayer in the right click menu. Useful for DDs, or extremely crowded areas.")

	default boolean rightClickOverhead() { return false; }
}
