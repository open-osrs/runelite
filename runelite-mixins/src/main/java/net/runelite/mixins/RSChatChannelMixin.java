/*
 * Copyright (c) 2018, trimbe <github.com/trimbe>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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

import net.runelite.api.MessageNode;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSChatChannel;
import net.runelite.rs.api.RSDualNode;

@Mixin(RSChatChannel.class)
public abstract class RSChatChannelMixin implements RSChatChannel
{
	@Inject
	@Override
	public void removeMessageNode(MessageNode node)
	{
		MessageNode[] lines = getLines();
		final int length = getLength();
		int found = -1;

		// Find the index of the node
		for (int idx = 0; idx < length; idx++)
		{
			if (lines[idx] == node)
			{
				found = idx;
				break;
			}
		}

		if (found == -1)
		{
			return;
		}

		// Shift down all other messages
		for (int i = found; i < length - 1; i++)
		{
			lines[i] = lines[i + 1];
		}
		lines[length - 1] = null;
		setLength(length - 1);

		RSDualNode rsCacheableNode = (RSDualNode) node;
		rsCacheableNode.unlink();
		rsCacheableNode.unlinkDual();
	}
}
