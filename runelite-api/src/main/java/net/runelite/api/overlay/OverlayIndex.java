/*
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
package net.runelite.api.overlay;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OverlayIndex
{
	@Getter
	private static final Set<Integer> overlays = new HashSet<>();

	/**
	 * Stores transformer callbacks for given cache object.
	 * The key is of format (indexId << 16 | archiveId).
	 * The value is of format:
	 * byte[] function(originalBytesFromCache){ if (doNothing) return originalBytesFromCache; else return customBytes; }
	 */
	@Getter
	private static final HashMap<Integer, Function<byte[], byte[]>> cacheTransformers = new HashMap<>();

	static
	{
		try (InputStream indexStream = OverlayIndex.class.getResourceAsStream("/runelite/index");
			DataInputStream in = new DataInputStream(indexStream))
		{
			int id;
			while ((id = in.readInt()) != -1)
			{
				overlays.add(id);
			}
		}
		catch (IOException ex)
		{
			log.warn("unable to load overlay index", ex);
		}
	}

	public static boolean hasCacheTransformer(int indexId, int archiveId)
	{
		return cacheTransformers.containsKey(indexId << 16 | archiveId);
	}

	public static Function<byte[], byte[]> getCacheTransformer(int indexId, int archiveId)
	{
		return cacheTransformers.get(indexId << 16 | archiveId);
	}

	public static boolean hasOverlay(int indexId, int archiveId)
	{
		return overlays.contains(indexId << 16 | archiveId);
	}
}
