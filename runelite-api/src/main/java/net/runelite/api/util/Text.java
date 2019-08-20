package net.runelite.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Text
{
	private static final Matcher TAG_REGEXP = Pattern.compile("<[^>]*>").matcher("");
	private static final StringBuilder menuSb = new StringBuilder(32);

	public static String removeTags(String str)
	{
		return TAG_REGEXP.reset(str).replaceAll("");
	}

	public static String nbsp1(String str)
	{
		return str.replace('\u00A0', ' ');
	}
	public static String removeNbsp(String str)
	{
		char[] chars = str.toCharArray();
		for (int i = 0, l = chars.length; i < l; i++)
		{
	//		if (chars[i] ==
		}
		return str.replace('\u00A0', ' ');
	}

	public static String oldStandardize(String str)
	{
		return removeTags(str).replace('\u00A0', ' ').trim().toLowerCase();
	}

	/**
	 * Standardize a string, optimized for menu targets
	 * (only replaces img, col, nbsp, (level = x))
	 */
	public static String newStandardize(String str)
	{
	int strStart = 0;

	//less than 6 as something like <img=1> would be the shortest with tags (7)
		if ((str.length()) <= 6)
		{

			return removeNbsp(str);
		} //
		while (str.charAt(strStart) == '<')
		{
			int tmp = StringUtils.indexOf(str, '>', strStart) + 1;
			if (tmp <= 0)
			{
				break;
			}

			strStart = tmp;
		}

		// Now we're almost there already (notation is like '<col=FFFFFF>Farmer <col=ABCDEF>(level-12)
		if (StringUtils.lastIndexOf(str, '>', strStart) == -1)
		{
			// assume there's no level thing, or anything like that
			return removeNbsp(StringUtils.substring(str, strStart));
		}
		else
		{
			return removeNbsp(StringUtils.substring(str, strStart, StringUtils.lastIndexOf(str, '<')));
		}
	}

	/**
	 * This is specifically made to standardize menu targets.
	 * As of rev 181 there's only really 3 kinds of targets, making this easy:
	 *
	 * 1) ""
	 * empty string; done immediately.
	 *
	 * 2) <col=XXXXXX>{npc name}
	 *    this should just need tags removed
	 *
	 * 3) <col=XXXXXX>{npc/player name}  <col=XXXXXX>(level-{cb lvl})
	 *    ^npcs only^  notice spaces:  12  ^ both but not required for either (kinda)^
	 *
	 * 4) <col=XXXXXX>{item/spell name}<col=FFFFFF> -> <col=XXXXXX>{other name}
	 */
	public static String standardize(String str)
	{
		int len;
		if ((len = str.length()) == 0)
		{
			return str; // 1
		}

		// Reusing stringbuilders is more efficient
		menuSb.setLength(0);
		boolean lastWasWhite = true;
		char[] cs = str.toCharArray();
		for (int i = 0; i < len; i++)
		{
			char c = cs[i];
			if (c == '<')
			{
				// Just skip over that whole part
				// not like there's npcs or items with
				// those things in their names
				// this will break if there's a <
				// as the last char in a string
				while (cs[++i] != '>');
			}
			else if (Character.isWhitespace(c))
			{
				if (!lastWasWhite)
				{
					if (i + 1 == len || Character.isWhitespace(cs[++i]) && cs[i + 1] == '<')
					{
						break;
					}

					menuSb.append(' ');
					lastWasWhite = true;
				}
			}
			else
			{
				lastWasWhite = false;
				if (Character.isUpperCase(c))
				{
					menuSb.append(Character.toLowerCase(c));
				}
				else
				{
					menuSb.append(c);
				}
			}
		}
		return menuSb.toString();
	}
}
