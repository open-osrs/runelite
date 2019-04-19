/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.api;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * An enumeration of ranks of clan members.
 */
@AllArgsConstructor
@Getter
public enum ClanMemberRank
{
	/**
	 * Not in a clan.
	 */
	UNRANKED(-1, "", -1),
	/**
	 * Friend rank.
	 */
	FRIEND(0, "https://cdn.discordapp.com/attachments/556184918770843649/557023638826778635/1004.png", SpriteID.CLAN_CHAT_RANK_SMILEY_FRIEND),
	/**
	 * Recruit rank.
	 */
	RECRUIT(1, "https://cdn.discordapp.com/attachments/556184918770843649/557023639111991306/1012-0.png", SpriteID.CLAN_CHAT_RANK_SINGLE_CHEVRON_RECRUIT),
	/**
	 * Corporal rank.
	 */
	CORPORAL(2, "https://cdn.discordapp.com/attachments/556184918770843649/557023638889431052/1011-0.png", SpriteID.CLAN_CHAT_RANK_DOUBLE_CHEVRON_CORPORAL),
	/**
	 * Sergeant rank.
	 */
	SERGEANT(3, "https://cdn.discordapp.com/attachments/556184918770843649/557023641968312321/1010-0.png", SpriteID.CLAN_CHAT_RANK_TRIPLE_CHEVRON_SERGEANT),
	/**
	 * Lieutenant rank.
	 */
	LIEUTENANT(4, "https://cdn.discordapp.com/attachments/556184918770843649/557023638893756416/1009-0.png", SpriteID.CLAN_CHAT_RANK_BRONZE_STAR_LIEUTENANT),
	/**
	 * Captain rank.
	 */
	CAPTAIN(5, "https://cdn.discordapp.com/attachments/556184918770843649/557023638910664734/1008-0.png", SpriteID.CLAN_CHAT_RANK_SILVER_STAR_CAPTAIN),
	/**
	 * General rank.
	 */
	GENERAL(6, "https://cdn.discordapp.com/attachments/556184918770843649/557023638835036170/1007-0.png", SpriteID.CLAN_CHAT_RANK_GOLD_STAR_GENERAL),
	/**
	 * Channel owner rank.
	 */
	OWNER(7, "https://cdn.discordapp.com/attachments/556184918770843649/557023638822453248/1006-0.png", SpriteID.CLAN_CHAT_RANK_KEY_CHANNEL_OWNER),
	/**
	 * JMod rank.
	 */
	JMOD(127, "", SpriteID.CLAN_CHAT_RANK_CROWN_JAGEX_MODERATOR);

	private static final Map<Integer, ClanMemberRank> RANKS = new HashMap<>();

	static
	{
		for (final ClanMemberRank clanMemberRank : ClanMemberRank.values())
		{
			RANKS.put(clanMemberRank.value, clanMemberRank);
		}
	}



	/**
	 * Utility method that maps the rank value to its respective
	 * {@link ClanMemberRank} value.
	 *
	 * @param rank the rank value
	 * @return rank type
	 */
	public static ClanMemberRank valueOf(int rank)
	{
		return RANKS.get(rank);
	}


	/**
	 * The value of the clan rank.
	 */
	private final int value;
	private final String discavatar;
	private	final int spriteID;
}
