/*
 * Copyright (c) 2019, Owain van Brakel <https://github.com/Owain94>
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
package net.runelite.client.plugins.menuentryswapper;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import static net.runelite.api.util.Text.NEWLINE_SPLITTER;
import net.runelite.client.config.Parser;
import net.runelite.client.menus.AbstractComparableEntry;
import static net.runelite.client.menus.ComparableEntries.newBaseComparableEntry;

public class PrioParse implements Parser<PrioParse.SwapPair[]>
{
	public SwapPair[] parse(String value)
	{
		List<String> lines = NEWLINE_SPLITTER.splitToList(value.trim());
		SwapPair[] result = new SwapPair[lines.size()];
		int idx = 0;

		for (String line : lines)
		{
			if (line.startsWith("//") || line.length() == 0)
			{
				continue;
			}

			String[] split = line.split(",");
			result[idx++] = new SwapPair(
				newBaseComparableEntry("", split[1], -1, -1, false, true),
				newBaseComparableEntry(split[0], "", -1, -1, false, false)
			);
		}

		if (idx != result.length)
		{
			return Arrays.copyOf(result, idx);
		}

		return result;
	}

	public String unparse(SwapPair[] object)
	{
		return "";
	}

	public boolean isValid(String value)
	{
		for (String line : NEWLINE_SPLITTER.split(value))
		{
			if (line.startsWith("//"))
			{
				continue;
			}

			String[] split = line.split(",");
			if (split.length == 1 || split[0].trim().length() == 0 || split[1].trim().length() == 0)
			{
				return false;
			}
		}

		return true;
	}

	/*
	 * can't be package private cause config reflection
	 */
	@AllArgsConstructor
	public static class SwapPair
	{
		AbstractComparableEntry a, b;
	}
}