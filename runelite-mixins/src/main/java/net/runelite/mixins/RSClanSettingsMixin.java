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
package net.runelite.mixins;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.EnumComposition;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanTitle;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClanSettings;
import net.runelite.rs.api.RSClient;

@Mixin(RSClanSettings.class)
public abstract class RSClanSettingsMixin implements RSClanSettings
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public List<ClanMember> getMembers()
	{
		int memberCount = getMemberCount();
		List<ClanMember> memberList = new ArrayList<>(memberCount);

		for (int i = 0; i < memberCount; i++)
		{
			memberList.add((ClanMember) client.runeliteClanMember(this, i));
		}

		return memberList;
	}

	@Inject
	@Override
	public ClanMember findMember(String name)
	{
		name = name.replace(" ", "\u00A0").toLowerCase();
		String[] memberNames = getMemberNames();
		int[] sorted = getSortedMembers();

		int i = 0;
		int len = sorted.length - 1;
		while (i <= len)
		{
			int tag = (i + len) >>> 1;
			int memberIndex = sorted[tag];
			String memberName = memberNames[memberIndex];
			int compare = memberName.toLowerCase().compareTo(name);
			if (compare < 0)
			{
				i = tag + 1;
			}
			else if (compare == 0)
			{
				return (ClanMember) client.runeliteClanMember(this, memberIndex);
			}
			else
			{
				len = tag - 1;
			}
		}

		return null;
	}

	@Inject
	@Override
	public ClanTitle titleForRank(ClanRank clanRank)
	{
		assert client.isClientThread() : "titleForRank must be called on client thread";

		int title;
		if (clanRank == ClanRank.JMOD)
		{
			title = -5;
		}
		else if (clanRank == ClanRank.OWNER)
		{
			title = -4;
		}
		else if (clanRank == ClanRank.DEPUTY_OWNER)
		{
			title = -3;
		}
		else if (clanRank == ClanRank.ADMINISTRATOR)
		{
			title = -2;
		}
		else if (clanRank == ClanRank.GUEST)
		{
			title = -1;
		}
		else if (clanRank == ClanRank.CLAN_RANK_1)
		{
			title = getTitle(1, 0, 9);
		}
		else if (clanRank == ClanRank.CLAN_RANK_2)
		{
			title = getTitle(1, 10, 19);
		}
		else if (clanRank == ClanRank.CLAN_RANK_3)
		{
			title = getTitle(1, 20, 29);
		}
		else if (clanRank == ClanRank.CLAN_RANK_4)
		{
			title = getTitle(2, 0, 9);
		}
		else if (clanRank == ClanRank.CLAN_RANK_5)
		{
			title = getTitle(2, 10, 19);
		}
		else if (clanRank == ClanRank.CLAN_RANK_6)
		{
			title = getTitle(2, 20, 29);
		}
		else if (clanRank == ClanRank.CLAN_RANK_7)
		{
			title = getTitle(3, 0, 9);
		}
		else if (clanRank == ClanRank.CLAN_RANK_8)
		{
			title = getTitle(3, 10, 19);
		}
		else if (clanRank == ClanRank.CLAN_RANK_9)
		{
			title = getTitle(3, 20, 29);
		}
		else if (clanRank == ClanRank.CLAN_RANK_10)
		{
			title = getTitle(4, 0, 9);
		}
		else if (clanRank == ClanRank.CLAN_RANK_11)
		{
			title = getTitle(4, 10, 19);
		}
		else if (clanRank == ClanRank.CLAN_RANK_12)
		{
			title = getTitle(4, 20, 29);
		}
		else if (clanRank == ClanRank.CLAN_RANK_13)
		{
			title = getTitle(5, 0, 9);
		}
		else if (clanRank == ClanRank.CLAN_RANK_14)
		{
			title = getTitle(5, 10, 19);
		}
		else
		{
			throw new IllegalStateException("Unexpected value: " + clanRank);
		}

		if (title == 1023)
		{
			return null;
		}

		EnumComposition rsEnum = client.getEnum(3797);
		String titleName = rsEnum.getStringValue(title);

		if (titleName.isEmpty())
		{
			return null;
		}

		return new ClanTitle(title, titleName);
	}

	@Inject
	private int getTitle(int group, int sub1, int sub2)
	{
		Integer oParam = getTitleGroupValue(group);
		int param = oParam == null ? -1 : oParam;
		int offset = 31 - sub2;
		return (param << offset) >>> (sub1 + offset);
	}
}
