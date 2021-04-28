/*
 * Copyright (c) 2021, ThatGamerBlue <thatgamerblue@gmail.com>
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
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.menuentryswapper.MenuEntrySwapperPlugin;
import net.runelite.client.plugins.menuentryswapper.Swap;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.pf4j.Extension;

@Extension
@PluginDependency(MenuEntrySwapperPlugin.class)
@PluginDescriptor(
	name = "Blackjack",
	enabledByDefault = false,
	description = "Allows for one-click blackjacking, both knocking out and pickpocketing",
	tags = {"blackjack", "thieving"}
)
public class BlackjackPlugin extends Plugin
{
	private static final int POLLNIVNEACH_REGION = 13358;

	private static final String SUCCESS_BLACKJACK = "You smack the bandit over the head and render them unconscious.";
	private static final String FAILED_BLACKJACK = "Your blow only glances off the bandit's head.";

	private static final String PICKPOCKET = "pickpocket";
	private static final String KNOCK_OUT = "knock-out";
	private static final String BANDIT = "Bandit";
	private static final String MENAPHITE = "Menaphite Thug";

	private final List<Swap> addedSwaps = new ArrayList<>();

	@Inject
	private Client client;

	@Inject
	private BlackjackConfig config;

	@Inject
	private MenuEntrySwapperPlugin mesPlugin;

	private boolean inPollnivneach = false;
	private long nextKnockOutTick = 0;
	private State state;

	@Provides
	BlackjackConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BlackjackConfig.class);
	}

	@Override
	protected void startUp()
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		state = State.KNOCKOUT;
			addedSwaps.add(mesPlugin.swapContains(
				"talk-to",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				PICKPOCKET,
				() -> state == State.PICKPOCKET && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"talk-to",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				KNOCK_OUT,
				() -> state == State.KNOCKOUT && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"attack",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				PICKPOCKET,
				() -> state == State.PICKPOCKET && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"attack",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				KNOCK_OUT,
				() -> state == State.KNOCKOUT && inPollnivneach
			));
	}

	@Override
	protected void shutDown()
	{
		state = null;
		addedSwaps.forEach(swap -> mesPlugin.remove("talk-to", swap));
		addedSwaps.forEach(swap -> mesPlugin.remove("attack", swap));
		addedSwaps.clear();
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		state = State.KNOCKOUT;
			addedSwaps.add(mesPlugin.swapContains(
				"talk-to",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				PICKPOCKET,
				() -> state == State.PICKPOCKET && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"talk-to",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				KNOCK_OUT,
				() -> state == State.KNOCKOUT && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"attack",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				PICKPOCKET,
				() -> state == State.PICKPOCKET && inPollnivneach
			));
			addedSwaps.add(mesPlugin.swapContains(
				"attack",
				(s) -> {
					s = Text.standardize(s, true);
					return s.equalsIgnoreCase(BANDIT) || s.equalsIgnoreCase(MENAPHITE);
				},
				KNOCK_OUT,
				() -> state == State.KNOCKOUT && inPollnivneach
			));
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{
		if (client.getTickCount() >= nextKnockOutTick)
		{
			state = State.KNOCKOUT;
		}

		inPollnivneach = ArrayUtils.contains(client.getMapRegions(), POLLNIVNEACH_REGION);
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		final String msg = event.getMessage();

		if (event.getType() == ChatMessageType.SPAM && (msg.equals(SUCCESS_BLACKJACK) || (msg.equals(FAILED_BLACKJACK) && config.pickpocketOnAggro())))
		{
			state = State.PICKPOCKET;
			final int ticks = config.random() ? RandomUtils.nextInt(3, 4) : 4;
			nextKnockOutTick = client.getTickCount() + ticks;
		}
	}

	private enum State
	{
		KNOCKOUT,
		PICKPOCKET
	}
}
