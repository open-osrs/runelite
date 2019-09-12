/*
 * Copyright (c) 2018 gazivodag <https://github.com/gazivodag>
 * Copyright (c) 2019 lucwousin <https://github.com/lucwousin>
 * Copyright (c) 2019 infinitay <https://github.com/Infinitay>
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
package net.runelite.client.plugins.blackjack;

import com.google.inject.Provides;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.menus.AbstractComparableEntry;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.menuentryswapper.MenuEntrySwapperConfig;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Authors gazivodag longstreet
 */
@PluginDescriptor(
	name = "Blackjack",
	description = "Allows for one-click blackjacking, both knocking out and pickpocketing",
	tags = {"blackjack", "thieving"},
	type = PluginType.SKILLING,
	enabledByDefault = false
)
@Singleton
@Slf4j
public class BlackjackPlugin extends Plugin
{
	private static final int POLLNIVNEACH_REGION = 13358;

	private static final String SUCCESS_BLACKJACK = "You smack the bandit over the head and render them unconscious.";
	private static final String FAILED_BLACKJACK = "Your blow only glances off the bandit's head.";

	private static final String PICKPOCKET = "Pickpocket";
	private static final String KNOCK_OUT = "Knock-out";
	private static final String BANDIT = "Bandit";
	private static final String MENAPHITE = "Menaphite Thug";

	private static final AbstractComparableEntry EMPTY = new BlankEntry();
	private static final AbstractComparableEntry PICKPOCKET_BANDIT = new BJComparableEntry(BANDIT, true);
	private static final AbstractComparableEntry KNOCKOUT_BANDIT = new BJComparableEntry(BANDIT, false);
	private static final AbstractComparableEntry PICKPOCKET_MENAPHITE = new BJComparableEntry(MENAPHITE, true);
	private static final AbstractComparableEntry KNOCKOUT_MENAPHITE = new BJComparableEntry(MENAPHITE, false);

	@Inject
	private Client client;
	@Inject
	private BlackjackConfig config;
	@Inject
	private EventBus eventBus;
	@Inject
	private MenuManager menuManager;
	@Inject
	private ConfigManager configManager;
	private boolean pickpocketOnAggro;
	private boolean random;
	private long nextKnockOutTick = 0;

	@Provides
	BlackjackConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BlackjackConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		menuManager.addSwap(EMPTY, KNOCKOUT_BANDIT);
		menuManager.addSwap(EMPTY, KNOCKOUT_MENAPHITE);
		this.pickpocketOnAggro = config.pickpocketOnAggro();
	}

	@Override
	protected void shutDown() throws Exception
	{
		menuManager.removeSwap(EMPTY, KNOCKOUT_BANDIT);
		menuManager.removeSwap(EMPTY, KNOCKOUT_MENAPHITE);
		menuManager.removeSwap(EMPTY, PICKPOCKET_BANDIT);
		menuManager.removeSwap(EMPTY, PICKPOCKET_MENAPHITE);
		if (configManager.getConfig(MenuEntrySwapperConfig.class).swapPickpocket())
		{
			menuManager.addPriorityEntry("Pickpocket").setPriority(1);
		}
		eventBus.unregister(this);
		eventBus.unregister("poll");
	}

	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() != GameState.LOGGED_IN || !ArrayUtils.contains(client.getMapRegions(), POLLNIVNEACH_REGION))
		{
			eventBus.unregister("poll");
			if (configManager.getConfig(MenuEntrySwapperConfig.class).swapPickpocket())
			{
				menuManager.addPriorityEntry("Pickpocket").setPriority(1);
			}
			return;
		}

		eventBus.subscribe(GameTick.class, "poll", this::onGameTick);
		eventBus.subscribe(ChatMessage.class, "poll", this::onChatMessage);
		if (configManager.getConfig(MenuEntrySwapperConfig.class).swapPickpocket())
		{
			menuManager.removePriorityEntry("Pickpocket");
		}
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("blackjack"))
		{
			this.pickpocketOnAggro = config.pickpocketOnAggro();
			this.random = config.random();
		}
	}

	private void onGameTick(GameTick event)
	{
		if (client.getTickCount() >= nextKnockOutTick)
		{
			menuManager.removeSwap(EMPTY, PICKPOCKET_BANDIT);
			menuManager.removeSwap(EMPTY, PICKPOCKET_MENAPHITE);
			menuManager.addSwap(EMPTY, KNOCKOUT_BANDIT);
			menuManager.addSwap(EMPTY, KNOCKOUT_MENAPHITE);
		}
	}

	private void onChatMessage(ChatMessage event)
	{
		final String msg = event.getMessage();

		if (event.getType() == ChatMessageType.SPAM && (msg.equals(SUCCESS_BLACKJACK) || (msg.equals(FAILED_BLACKJACK) && this.pickpocketOnAggro)))
		{
			menuManager.removeSwap(EMPTY, KNOCKOUT_BANDIT);
			menuManager.removeSwap(EMPTY, KNOCKOUT_MENAPHITE);
			menuManager.addSwap(EMPTY, PICKPOCKET_BANDIT);
			menuManager.addSwap(EMPTY, PICKPOCKET_MENAPHITE);
			final int ticks = this.random ? RandomUtils.nextInt(3, 4) : 4;
			nextKnockOutTick = client.getTickCount() + ticks;
		}
	}

	private static class BlankEntry extends AbstractComparableEntry
	{
		@Override
		public boolean matches(MenuEntry entry)
		{
			return true;
		}
	}

	private static class BJComparableEntry extends AbstractComparableEntry
	{
		private BJComparableEntry(final String npc, final boolean pickpocket)
		{
			if (!BANDIT.equals(npc) && !MENAPHITE.equals(npc))
			{
				throw new IllegalArgumentException("Only bandits or menaphites are valid");
			}

			this.setTarget(npc.toLowerCase());
			this.setOption(pickpocket ? PICKPOCKET : KNOCK_OUT);
			this.setPriority(100);
		}

		@Override
		public boolean matches(MenuEntry entry)
		{
			return entry.getStandardizedTarget().equals(this.getTarget()) &&
				entry.getOption().equalsIgnoreCase(this.getOption());
		}
	}
}
