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
import static net.runelite.api.util.Text.NEWLINE_SPLITTER;
import net.runelite.client.config.Parser;
import net.runelite.client.menus.AbstractComparableEntry;
import static net.runelite.client.menus.ComparableEntries.newBaseComparableEntry;

public class CustomSwapParse implements Parser<AbstractComparableEntry[]>
{
	public AbstractComparableEntry[] parse(String value)
	{
		final List<String> lines = NEWLINE_SPLITTER.splitToList(value);
		final AbstractComparableEntry[] result = new AbstractComparableEntry[lines.size()];
		int idx = 0;

		for (String line : lines)
		{
			if (line.startsWith("//"))
			{
				continue;
			}

			String[] parts = line.split(",");
			String[] moreParts = parts[1].split(":");

			result[idx] = newBaseComparableEntry(parts[0].trim(), moreParts[0].trim());
			result[idx++].setPriority(Integer.parseInt(moreParts[1].trim()));
		}

		if (result.length != idx)
		{
			return Arrays.copyOf(result, idx);
		}

		return result;
	}

	public String unparse(AbstractComparableEntry[] values)
	{
		return "";
	}

	public boolean isValid(String value)
	{
		if (value.trim().length() == 0)
		{
			return true;
		}

		for (String line : NEWLINE_SPLITTER.split(value))
		{
			// Comment; continue
			if (line.startsWith("//"))
			{
				continue;
			}

			final int comma = line.indexOf(',');
			// If the comma is at index 0, there's no option
			if (comma <= 0)
			{
				return false;
			}

			final int colon = line.lastIndexOf(':');
			// If it's at 1 there's no target, if it's at line length there's no priority
			if (colon == -1 || colon == 1 || colon == line.length() - 1)
			{
				return false;
			}

			int i = comma;
			// Check if there's any non-whitespace chars between comma and colon
			while (Character.isWhitespace(line.charAt(++i)));
			if (i == colon)
			{
				return false;
			}

			i = colon;
			// We can be sure this won't OOB cause we trimmed and colon isn't at length
			while (Character.isWhitespace(line.charAt(++i)));

			while (i != line.length())
			{
				if (!Character.isDigit(line.charAt(i++)))
				{
					return false;
				}
			}
		}

		return true;
	}
}
