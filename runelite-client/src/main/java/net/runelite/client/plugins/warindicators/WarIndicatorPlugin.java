/*
 * Copyright (c) 2018, Andrew EP | ElPinche256 <https://github.com/ElPinche256>
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
package net.runelite.client.plugins.warindicators;

import com.google.common.collect.Sets;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Provides;
import java.awt.Color;
import java.util.Collection;
import javax.inject.Inject;
import org.apache.commons.lang3.ArrayUtils;
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
import static net.runelite.api.MenuAction.SPELL_CAST_ON_PLAYER;
import static net.runelite.api.MenuAction.TRADE;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
        name = "<font color=\"aqua\">!War</font>",
        description = "War War War.",
        tags = {"skill", "total", "max", "PVP"},
        enabledByDefault = false
)
public class WarIndicatorPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private WarIndicatorConfig config;

	@Inject
	private WarIndicatorOverlay warIndicatorOverlay;

	@Inject
	private WarIndicatorMiniMapOverlay warIndicatorMiniMapOverlay;

	@Inject
	private Client client;

	@Provides
	WarIndicatorConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WarIndicatorConfig.class);
	}

 @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(warIndicatorOverlay);
        overlayManager.add(warIndicatorMiniMapOverlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(warIndicatorOverlay);
        overlayManager.remove(warIndicatorMiniMapOverlay);
    }

	@Subscribe
	public void onMenuEntryAdd(MenuEntryAdded menuEntryAdded)
	{
		int type = menuEntryAdded.getType();

		if (type >= 2000)
		{
			type -= 2000;
		}

		int identifier = menuEntryAdded.getIdentifier();
		if (type == FOLLOW.getId() || type == TRADE.getId()
			|| type == SPELL_CAST_ON_PLAYER.getId()
			|| type == ITEM_USE_ON_PLAYER.getId()
			|| type == PLAYER_FIRST_OPTION.getId()
			|| type == PLAYER_SECOND_OPTION.getId()
			|| type == PLAYER_THIRD_OPTION.getId()
			|| type == PLAYER_FOURTH_OPTION.getId()
			|| type == PLAYER_FIFTH_OPTION.getId()
			|| type == PLAYER_SIXTH_OPTION.getId()
			|| type == PLAYER_SEVENTH_OPTION.getId()
			|| type == PLAYER_EIGTH_OPTION.getId())
		{
			Player[] players = client.getCachedPlayers();
			Player player = null;
			String player2 = null;

			String[] callers = config.getActiveCallers().split(", ");
			String[] targets = config.getTargetedSnipes().split(", ");

			if (identifier >= 0 && identifier < players.length)
			{
				player = players[identifier];
				player2 = players[identifier].getName();
			}

			if (player == null)
			{
				return;
			}

			Color color = null;

			if (config.highLightCallers() && ArrayUtils.contains(callers, player2))
			{
				color = config.getCallerColor();
			}

			if (config.highlightSnipes() && ArrayUtils.contains(targets, player2))
			{
				color = config.getSnipeColor();
			}

			if (color != null)
			{
				MenuEntry[] menuEntries = client.getMenuEntries();
				MenuEntry lastEntry = menuEntries[menuEntries.length - 1];
				String target = lastEntry.getTarget();

				int idx = target.indexOf('>');
				if (idx != -1)
				{
					target = target.substring(idx + 1);
				}

				lastEntry.setTarget("<col=" + Integer.toHexString(color.getRGB() & 0xFFFFFF) + ">" + target);
				client.setMenuEntries(menuEntries);
			}

		}
	}
}
