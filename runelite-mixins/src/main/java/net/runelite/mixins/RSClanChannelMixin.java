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

import java.util.List;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClanChannel;
import net.runelite.rs.api.RSClanChannelMember;
import net.runelite.rs.api.RSClient;

@Mixin(RSClanChannel.class)
public abstract class RSClanChannelMixin implements RSClanChannel
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public ClanChannelMember findMember(String name)
	{
		name = name.replace(" ", "\u00A0");
		List<ClanChannelMember> members = getMembers();
		int[] sorted = getSortedMembers();

		int i = 0;
		int len = sorted.length - 1;
		while (i <= len)
		{
			int tag = (i + len) >>> 1;
			int memberIndex = sorted[tag];
			RSClanChannelMember member = (RSClanChannelMember) members.get(memberIndex);
			int compare = member.getName().compareTo(name);
			if (compare < 0)
			{
				i = tag + 1;
			}
			else
			{
				if (compare <= 0)
				{
					return member;
				}

				len = tag - 1;
			}
		}

		return null;
	}

	@Inject
	@MethodHook("removeMember")
	public void onMemberRemoved(int index)
	{
		client.getCallbacks().post(new ClanMemberLeft(this, getMembers().get(index)));
	}

	@Inject
	@MethodHook(value = "addMember", end = true)
	public void onMemberAdded(RSClanChannelMember member)
	{
		client.getCallbacks().post(new ClanMemberJoined(this, member));
	}
}
