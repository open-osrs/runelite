/*
 * Copyright (c) 2019 Abex
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
package net.runelite.client.rs;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldClient;
import net.runelite.http.api.worlds.WorldType;

@Slf4j
class HostSupplier implements Supplier<String>
{
	private final Random random = new Random(System.nanoTime());
	private Queue<String> hosts = new ArrayDeque<>();

	@Override
	public String get()
	{
		if (!hosts.isEmpty())
		{
			return hosts.poll();
		}

		try
		{
			List<String> newHosts = new WorldClient(RuneLiteAPI.CLIENT)
				.lookupWorlds()
				.getWorlds()
				.stream()
				.filter(w -> w.getTypes().isEmpty() || EnumSet.of(WorldType.MEMBERS).equals(w.getTypes()))
				.map(World::getAddress)
				.collect(Collectors.toList());

			Collections.shuffle(newHosts, random);

			hosts.addAll(newHosts.subList(0, 16));
		}
		catch (IOException e)
		{
			log.warn("Unable to retrieve world list", e);
		}

		while (hosts.size() < 2)
		{
			hosts.add("oldschool" + (random.nextInt(50) + 1) + ".runescape.COM");
		}

		return hosts.poll();
	}
}