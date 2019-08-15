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

import com.google.common.collect.ImmutableList;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Actor;
import net.runelite.api.ClanMember;
import net.runelite.api.ClanMemberRank;
import static net.runelite.api.ClanMemberRank.UNRANKED;
import net.runelite.api.Client;
import static net.runelite.api.MenuAction.FOLLOW;
import static net.runelite.api.MenuAction.ITEM_USE_ON_PLAYER;
import static net.runelite.api.MenuAction.PLAYER_EIGTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FIFTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FIRST_OPTION;
import static net.runelite.api.MenuAction.PLAYER_FOURTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SECOND_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SEVENTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_SIXTH_OPTION;
import static net.runelite.api.MenuAction.PLAYER_THIRD_OPTION;
import static net.runelite.api.MenuAction.RUNELITE;
import static net.runelite.api.MenuAction.SPELL_CAST_ON_PLAYER;
import static net.runelite.api.MenuAction.TRADE;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ClanManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.PvPUtil;

@PluginDescriptor(
	name = "Player Indicators",
	description = "Highlight players on-screen and/or on the minimap",
	tags = {"highlight", "minimap", "overlay", "players", "pklite"}
)
@Singleton
public class PlayerIndicatorsPlugin extends Plugin
{
	public static final ImmutableList RELAETIONSHIPS = ImmutableList.of("Self", "Friends", "Team", "Clan", "Targets",
		"Other");

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private PlayerIndicatorsConfig config;

	@Inject
	private PlayerIndicatorsOverlay playerIndicatorsOverlay;

	@Inject
	private PlayerIndicatorsTileOverlay playerIndicatorsTileOverlay;

	@Inject
	private PlayerIndicatorsMinimapOverlay playerIndicatorsMinimapOverlay;

	@Inject
	private Client client;

	@Inject
	private ClanManager clanManager;

	@Inject
	private EventBus eventBus;

	@Getter(AccessLevel.PACKAGE)
	private boolean highlightOwnPlayer;
	@Getter(AccessLevel.PACKAGE)
	private Color selfColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightFriends;
	@Getter(AccessLevel.PACKAGE)
	private Color friendsColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightClan;
	@Getter(AccessLevel.PACKAGE)
	private Color getClanMemberColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightTeamMembers;
	@Getter(AccessLevel.PACKAGE)
	private Color getTeamMemberColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightOther;
	@Getter(AccessLevel.PACKAGE)
	private Color otherColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawTiles;
	@Getter(AccessLevel.PACKAGE)
	private PlayerNameLocation playerNamePosition;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawMinimapNames;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawFriendMinimapNames;
	@Getter(AccessLevel.PACKAGE)
	private boolean drawClanMinimapNames;
	private boolean colorPlayerMenu;
	@Getter(AccessLevel.PACKAGE)
	private boolean showClanRanks;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightTargets;
	@Getter(AccessLevel.PACKAGE)
	private Color getTargetColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean showAgilityLevel;
	@Getter(AccessLevel.PACKAGE)
	private int agilityFirstThreshold;
	@Getter(AccessLevel.PACKAGE)
	private int agilitySecondThreshold;
	@Getter(AccessLevel.PACKAGE)
	private PlayerIndicatorsPlugin.AgilityFormats agilityFormat;
	@Getter(AccessLevel.PACKAGE)
	private boolean showCombatLevel;
	@Getter(AccessLevel.PACKAGE)
	private boolean playerSkull;
	@Getter(AccessLevel.PACKAGE)
	private PlayerIndicatorsPlugin.MinimapSkullLocations skullLocation;
	@Getter(AccessLevel.PACKAGE)
	private boolean skulledTargetsOnly;
	@Getter(AccessLevel.PACKAGE)
	private boolean targetRisk;
	private boolean useClanchatRanks;
	private ClanMemberRank callerRank;
	@Getter(AccessLevel.PACKAGE)
	private String configCallers;
	@Getter(AccessLevel.PACKAGE)
	private boolean highlightCallers;
	@Getter(AccessLevel.PACKAGE)
	private Color callerColor;
	@Getter
	private boolean highlightCallerTargets;
	@Getter
	private Color callerTargetColor;
	@Getter(AccessLevel.PACKAGE)
	private boolean unchargedGlory;
	@Getter
	private HashMap<String, Actor> callerPiles = new HashMap<String, Actor>();
	@Getter
	private EnumMap selfIndicationModes;
	@Getter
	private EnumMap friendIndicationModes;
	@Getter
	private EnumMap clanIndicationModes;
	@Getter
	private EnumMap otherIndicationModes;
	@Getter
	private EnumMap targetIndicationModes;


	@Provides
	PlayerIndicatorsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PlayerIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{

		updateConfig();
		addSubscriptions();
		
		overlayManager.add(playerIndicatorsOverlay);
		overlayManager.add(playerIndicatorsTileOverlay);
		overlayManager.add(playerIndicatorsMinimapOverlay);
		getCallerList();
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);

		overlayManager.remove(playerIndicatorsOverlay);
		overlayManager.remove(playerIndicatorsTileOverlay);
		overlayManager.remove(playerIndicatorsMinimapOverlay);
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(ClanMemberJoined.class, this, this::onClanMemberJoined);
		eventBus.subscribe(ClanMemberLeft.class, this, this::onClanMemberLeft);
		eventBus.subscribe(MenuEntryAdded.class, this, this::onMenuEntryAdded);
		eventBus.subscribe(InteractingChanged.class, this, this::onInteractingChanged);
	}

	private List<String> callers = new ArrayList<>();

	private void onInteractingChanged(InteractingChanged event)
	{
		if (!this.highlightCallerTargets)
		{
			return;
		}
		if (callers.isEmpty())
		{
			return;
		}
		if (!isCaller(event.getSource()))
		{
			return;
		}

		final Actor caller = event.getSource();

		if (this.callerPiles.containsKey(caller.getName()))
		{
			if (event.getTarget() == null)
			{
				callerPiles.remove(caller.getName());
			}
			else
			{
				callerPiles.replace(caller.getName(), event.getTarget());
			}
		}
		else
		{
			callerPiles.put(caller.getName(), event.getTarget());
		}

	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("playerindicators"))
		{
			return;
		}

		updateConfig();
		
		if (this.configCallers != null && !this.configCallers.trim().equals(""))
		{
			getCallerList();
		}
	}

	private void onClanMemberJoined(ClanMemberJoined event)
	{
		getCallerList();
	}

	private void onClanMemberLeft(ClanMemberLeft event)
	{
		getCallerList();
	}

	private void onMenuEntryAdded(MenuEntryAdded menuEntryAdded)
	{
		int type = menuEntryAdded.getType();

		if (type >= 2000)
		{
			type -= 2000;
		}

		int identifier = menuEntryAdded.getIdentifier();
		if (type == FOLLOW.getId() || type == TRADE.getId()
			|| type == SPELL_CAST_ON_PLAYER.getId() || type == ITEM_USE_ON_PLAYER.getId()
			|| type == PLAYER_FIRST_OPTION.getId()
			|| type == PLAYER_SECOND_OPTION.getId()
			|| type == PLAYER_THIRD_OPTION.getId()
			|| type == PLAYER_FOURTH_OPTION.getId()
			|| type == PLAYER_FIFTH_OPTION.getId()
			|| type == PLAYER_SIXTH_OPTION.getId()
			|| type == PLAYER_SEVENTH_OPTION.getId()
			|| type == PLAYER_EIGTH_OPTION.getId()
			|| type == RUNELITE.getId())
		{
			final Player localPlayer = client.getLocalPlayer();
			Player[] players = client.getCachedPlayers();
			Player player = null;

			if (identifier >= 0 && identifier < players.length)
			{
				player = players[identifier];
			}

			if (player == null)
			{
				return;
			}

			int image = -1;
			int image2 = -1;
			Color color = null;

			if (this.colorPlayerMenu && client.isFriended(player.getName(), false))
			{
				color = this.friendsColor;
			}
			else if (this.colorPlayerMenu && player.isClanMember())
			{
				color = this.getClanMemberColor;

				ClanMemberRank rank = clanManager.getRank(player.getName());
				if (rank != UNRANKED)
				{
					image = clanManager.getIconNumber(rank);
				}
			}
			else if (this.colorPlayerMenu && player.getTeam() > 0 && localPlayer.getTeam() == player.getTeam())
			{
				color = this.getTeamMemberColor;
			}
			else if (this.highlightOther && !player.isClanMember() && !player.isFriend() && !PvPUtil.isAttackable(client, player))
			{
				color = this.otherColor;
			}
			else if (this.colorPlayerMenu && !player.isClanMember() && client.isFriended(player.getName(), false) && PvPUtil.isAttackable(client, player))
			{
				color = this.getTargetColor;
			}
			else if (this.colorPlayerMenu && PvPUtil.isAttackable(client, player) && !player.isClanMember() && !player.isFriend())
			{
				color = this.getTargetColor;
			}
/*			if (config.rightClickOverhead() && !player.isClanMember() && player.getOverheadIcon() != null)
			{
				if (player.getOverheadIcon().equals(HeadIcon.MAGIC))
				{
					image = 29;
				}
				else if (player.getOverheadIcon().equals(HeadIcon.RANGED))
				{
					image = 30;
				}
				else if (player.getOverheadIcon().equals(HeadIcon.MELEE))
				{
					image = 31;
				}
				else if (player.getOverheadIcon().equals(HeadIcon.REDEMPTION))
				{
					image = 32;
				}
				else if (player.getOverheadIcon().equals(HeadIcon.RETRIBUTION))
				{
					image = 33;
				}
				else if (player.getOverheadIcon().equals(HeadIcon.SMITE))
				{
					image = 34;
				}
			}*/
			if (this.playerSkull && !player.isClanMember() && player.getSkullIcon() != null)
			{
				image2 = 35;
			}
			if (this.colorPlayerMenu && this.highlightCallers && this.isCaller(player))
			{
				color = this.callerColor;
			}
			if (image != -1 || color != null)
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				MenuEntry lastEntry = menuEntries[menuEntries.length - 1];


				if (color != null && this.colorPlayerMenu)
				{
					// strip out existing <col...
					String target = lastEntry.getTarget();
					int idx = target.indexOf('>');
					if (idx != -1)
					{
						target = target.substring(idx + 1);
					}

					lastEntry.setTarget(ColorUtil.prependColorTag(target, color));
				}
				
/*				if (image != -1 && config.showClanRanks() || image != -1 && config.rightClickOverhead())
				{
					lastEntry.setTarget(lastEntry.getTarget() + "<img=" + image + ">");
				}*/
				if (image2 != -1 && this.playerSkull)
				{
					lastEntry.setTarget("<img=" + image2 + ">" + lastEntry.getTarget());
				}

				client.setMenuEntries(menuEntries);
			}
		}
	}

	private void getCallerList()
	{
		callers.clear();
		if (this.useClanchatRanks && client.getClanMembers() != null)
		{
			for (ClanMember clanMember : client.getClanMembers())
			{
				if (clanMember.getRank().getValue() > this.callerRank.getValue())
				{
					callers.add(clanMember.getUsername());
				}
			}
		}
		if (this.configCallers.contains(","))
		{
			callers.addAll(Arrays.asList(this.configCallers.split(",")));
		}
		else
		{
			if (!this.configCallers.equals(""))
			{
				callers.add(this.configCallers);
			}
		}
	}

	public boolean isCaller(Actor player)
	{
		/**
		if (callers != null)
		{
			for (String name : callers)
			{
				String finalName = name.toLowerCase().replace("_", " ");
				if (player.getName().toLowerCase().replace("_", " ").equals(finalName))
				{
					return true;
				}
			}
		}
		**/
		return false;
	}


	private void updateConfig()
	{

		this.highlightOwnPlayer = config.highlightOwnPlayer();
		this.selfColor = config.getOwnPlayerColor();
		this.selfIndicationModes = config.selfIndicatorModes();


		if (this.highlightOwnPlayer)
		{
		}
		this.highlightFriends = config.highlightFriends();
		this.friendsColor = config.getFriendColor();
		this.friendIndicationModes = config.friendIndicatorMode();
		if (this.highlightFriends)
		{
		}
		this.highlightClan = config.highlightClan();
		this.getClanMemberColor = config.getClanMemberColor();

		this.clanIndicationModes = config.clanIndicatorModes();
		if (this.highlightClan)
		{
		}
		this.highlightTeamMembers = config.highlightTeamMembers();
		this.getTeamMemberColor = config.getTeamMemberColor();
		if (highlightTeamMembers)
		{
		}
		this.highlightOther = config.highlightOtherPlayers();
		this.otherColor = config.getOtherPlayerColor();


		this.otherIndicationModes = config.otherIndicatorModes();

		if (highlightOther)
		{
		}
		this.showClanRanks = config.showClanRanks();
		this.highlightTargets = config.highlightTargets();
		this.getTargetColor = config.getTargetsColor();

		this.targetIndicationModes = config.targetsIndicatorModes();


		if (highlightTargets)
		{
		}
		this.showCombatLevel = config.showCombatLevel();
		this.showAgilityLevel = config.showAgilityLevel();
		this.agilityFirstThreshold = config.agilityFirstThreshold();
		this.agilitySecondThreshold = config.agilitySecondThreshold();
		this.agilityFormat = config.agilityFormat();
		this.playerSkull = config.playerSkull();
		this.skullLocation = config.skullLocation();
		this.targetRisk = config.targetRisk();
		this.useClanchatRanks = config.useClanchatRanks();
		this.callerRank = config.callerRank();
		this.configCallers = config.callers();
		this.highlightCallers = config.highlightCallers();
		this.callerColor = config.callerColor();
		this.highlightCallerTargets = config.callersTargets();
		this.callerTargetColor = config.callerTargetColor();
		this.unchargedGlory = config.unchargedGlory();
	}

	public enum PlayerRelation
	{
		SELF,
		FRIEND,
		CLAN,
		TEAM,
		TARGET,
		OTHER,
		CALLER
	}


	public enum MinimapSkullLocations
	{
		BEFORE_NAME,
		AFTER_NAME
	}

	public enum AgilityFormats
	{
		TEXT,
		ICONS
	}


}
