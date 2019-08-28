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
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.util.PvPUtil;

@Singleton
public class PlayerIndicatorsService
{
	private Client client;
	private PlayerIndicatorsPlugin plugin;

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

		self = (player) -> (Objects.equals(client.getLocalPlayer(), player) && plugin.isHighlightOwnPlayer());
		friend = (player) -> (plugin.isHighlightFriends() && client.isFriended(player.getName(), false));
		clan = (player) -> (player.isClanMember() && plugin.isHighlightClan());
		team = (player) -> (Objects.requireNonNull(client.getLocalPlayer()).getTeam() != 0 &&
			client.getLocalPlayer().getTeam() == player.getTeam() && plugin.isHighlightTeam());
		target = (player) -> (PvPUtil.isAttackable(client, player) && plugin.isHighlightTargets());
		other = (player -> (Objects.nonNull(player) && plugin.isHighlightOther()));
		caller = player -> (plugin.isCaller(player) && plugin.isHighlightCallers());
		callerTarget = plugin::isPile;
	}


	public void forEachPlayer(final BiConsumer<Player, PlayerIndicatorsPlugin.PlayerRelation> consumer)
	{
		if (!highlight())
		{
			return;
		}

		final List<Player> players = client.getPlayers();

		players.stream().filter(self).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.SELF));

		players.stream().filter(friend.and(self.negate())).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.FRIEND));

		players.stream().filter(clan.and(self.negate())).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CLAN));

		players.stream().filter(team.and(self.negate())).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.TEAM));

		players.stream().filter(target.and(self.negate())).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.TARGET));

		players.stream().filter(other.and(self.negate())).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.OTHER));

		players.stream().filter(caller).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CALLER));

		players.stream().filter(callerTarget).forEach(p -> consumer.accept(p, PlayerIndicatorsPlugin.PlayerRelation.CALLER_TARGET));

	}


	private boolean highlight()
	{
		return plugin.isHighlightOwnPlayer() || plugin.isHighlightClan()
			|| plugin.isHighlightFriends() || plugin.isHighlightOther() || plugin.isHighlightTargets()
			|| plugin.isHighlightCallers() || plugin.isHighlightTeam() || plugin.isHighlightCallerTargets();
	}
}
