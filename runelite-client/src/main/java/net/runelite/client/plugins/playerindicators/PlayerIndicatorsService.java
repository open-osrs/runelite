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

import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.util.PvPUtil;

@Singleton
public class PlayerIndicatorsService
{
	private final Client client;
	private final PlayerIndicatorsPlugin plugin;

	public Predicate<Player> self;
	public Predicate<Player> friend;
	public Predicate<Player> clan;
	public Predicate<Player> team;
	public Predicate<Player> target;
	public Predicate<Player> other;
	public Predicate<Player> caller;
	public Predicate<Player> callerTarget;




	@Inject
	private PlayerIndicatorsService(final Client client, final PlayerIndicatorsPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;

		self = (player) -> Objects.equals(client.getLocalPlayer(), player);
		friend = (player) -> client.isFriended(player.getName(), false);
		clan = Player::isClanMember;
		team = (player) -> (Objects.requireNonNull(client.getLocalPlayer()).getTeam() != 0 &&
			client.getLocalPlayer().getTeam() == player.getTeam());
		target = (player) -> PvPUtil.isAttackable(client, player);
		other = Objects::nonNull;
		caller = plugin::isCaller;
		callerTarget = plugin::isPile;
	}


	public void forEachPlayer(final BiConsumer<Player, PlayerIndicatorsPlugin.PlayerRelation> consumer)
	{
		if (!highlight())
		{
			return;
		}

		final List<Player> players = client.getPlayers();
		Stream<Player> playersStream = players.stream();
		if (plugin.isHighlightOwnPlayer())
		{
			playersStream.filter(self).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.SELF));
		}
		if (plugin.isHighlightFriends())
		{
			playersStream.filter(friend).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.FRIEND));
		}
		if (plugin.isHighlightClan())
		{
			playersStream.filter(clan).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CLAN));
		}
		if (plugin.isHighlightTeam())
		{
			playersStream.filter(team).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.TEAM));
		}
		if (plugin.isHighlightTargets())
		{
			playersStream.filter(target).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.TARGET));
		}
		if (plugin.isHighlightOther())
		{
			playersStream.filter(other).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.OTHER));
		}
		if (plugin.isHighlightOther())
		{
			playersStream.filter(caller).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CALLER));
		}
		if (plugin.isHighlightCallerTargets())
		{
			playersStream.filter(callerTarget).forEach(p ->
				consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CALLER_TARGET));
		}
	}


	private boolean highlight()
	{
		return plugin.isHighlightOwnPlayer() || plugin.isHighlightClan()
			|| plugin.isHighlightFriends() || plugin.isHighlightOther() || plugin.isHighlightTargets()
			|| plugin.isHighlightCallers() || plugin.isHighlightTeam() || plugin.isHighlightCallerTargets();
	}
}
