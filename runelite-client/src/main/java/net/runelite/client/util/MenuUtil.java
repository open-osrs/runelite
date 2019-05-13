package net.runelite.client.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;

@Slf4j
public class MenuUtil
{
	/**
	 * Swaps two MenuEntries with eachother
	 * @param client
	 * @param entry1
	 * @param entry2
	 */
	public static void swap(Client client, MenuEntry entry1, MenuEntry entry2)
	{
		List<MenuEntry> entries = Arrays.asList(client.getMenuEntries());

		if (!entries.contains(entry1) || !entries.contains(entry2))
		{
			log.warn("Can't swap {} with {} as one or both menuentries aren't present", entry1, entry2);
			return;
		}

		int idxA = entries.indexOf(entry1);
		int idxB = entries.indexOf(entry2);

		entries.set(idxA, entry2);
		entries.set(idxB, entry1);

		client.setMenuEntries(entries.toArray(new MenuEntry[0]));
		log.debug("Swapped {} with {}", entry1, entry2);
	}

	/**
	 * Swaps MenuEntries with the same target and options..
	 *
	 * This method will not do anything if not exactly one entry is found with either option.
	 * Try narrowing down your searches by using one of the other methods
	 */
	public static void swap(Client client, String option1, String option2, String target, boolean strict)
	{
		List<MenuEntry> withOp1 = withOption(client, option1, strict);
		List<MenuEntry> withOp2 = withOption(client, option2, strict);
		List<MenuEntry> withTarget = withTarget(client, target, strict);

		withOp1.removeIf(e -> !withTarget.contains(e));
		withOp2.removeIf(e -> !withTarget.contains(e));

		if (withOp1.size() != 1 || withOp2.size() != 1)
		{
			log.warn("Found {} matching entries with option {} and {} matching entries with option {}. No swap performed.", withOp1.size(), option1, withOp2.size(), option2);
			return;
		}

		swap(client, withOp1.get(0), withOp2.get(0));
	}

	/**
	 * Swaps MenuEntries with options and targets..
	 *
	 * This method will not do anything if not exactly one entry is found with either option.
	 * Try narrowing down your searches by using one of the other methods
	 */
	public static void swap(Client client, String option1, String option2, String target1, String target2, boolean strict)
	{
		List<MenuEntry> withOp1 = withOption(client, option1, strict);
		List<MenuEntry> withTarget1 = withTarget(client, target1, strict);

		List<MenuEntry> withOp2 = withOption(client, option2, strict);
		List<MenuEntry> withTarget2 = withTarget(client, target2, strict);

		withOp1.removeIf(e -> !withTarget1.contains(e));
		withOp2.removeIf(e -> !withTarget2.contains(e));

		if (withOp1.size() != 1 || withOp2.size() != 1)
		{
			log.warn("Found {} matching entries with option {} and {} matching entries with option {}. No swap performed.", withOp1.size(), option1, withOp2.size(), option2);
			return;
		}

		swap(client, withOp1.get(0), withOp2.get(0));
	}

	/**
	 * Swaps MenuEntries with options..
	 *
	 * This method will not do anything if not exactly one entry is found with either option.
	 * Try narrowing down your searches by using one of the other methods
	 */
	public static void swapOptions(Client client, String option1, String option2, boolean strict)
	{
		List<MenuEntry> withOp1 = withOption(client, option1, strict);
		List<MenuEntry> withOp2 = withOption(client, option2, strict);

		if (withOp1.size() != 1 || withOp2.size() != 1)
		{
			log.warn("Found {} entries with option {} and {} entries with option {}. No swap performed.", withOp1.size(), option1, withOp2.size(), option2);
			return;
		}

		swap(client, withOp1.get(0), withOp2.get(0));
	}

	/**
	 * Swaps MenuEntries with targets..
	 *
	 * This method will not do anything if not exactly one entry is found with either target.
	 * Try narrowing down your searches by using one of the other methods
	 */
	public static void swapTargets(Client client, String target1, String target2, boolean strict)
	{
		List<MenuEntry> withOp1 = withOption(client, target1, strict);
		List<MenuEntry> withOp2 = withOption(client, target2, strict);

		if (withOp1.size() != 1 || withOp2.size() != 1)
		{
			log.warn("Found {} entries with option {} and {} entries with option {}. No swap performed.", withOp1.size(), target1, withOp2.size(), target2);
			return;
		}

		swap(client, withOp1.get(0), withOp2.get(0));
	}

	private static List<MenuEntry> withOption(Client client, String option, boolean strict)
	{
		final String cleanOp = Text.standardize(option);

		return Arrays.stream(client.getMenuEntries())
				.filter(m ->
					Text.standardize(m.getOption()).equals(cleanOp) ||
					!strict && Text.standardize(m.getOption()).contains(cleanOp))
				.collect(Collectors.toList());
	}

	private static List<MenuEntry> withTarget(Client client, String target, boolean strict)
	{
		final String cleanTgt = Text.standardize(target);

		return Arrays.stream(client.getMenuEntries())
			.filter(m ->
				Text.standardize(m.getTarget()).equals(cleanTgt) ||
					!strict && Text.standardize(m.getTarget()).contains(cleanTgt))
			.collect(Collectors.toList());
	}

	private static List<MenuEntry> withID(Client client, int id)
	{
		return Arrays.stream(client.getMenuEntries())
			.filter(m -> m.getIdentifier() == id)
			.collect(Collectors.toList());
	}

	private static List<MenuEntry> withType(Client client, int type)
	{
		return Arrays.stream(client.getMenuEntries())
			.filter(m -> m.getType() == type)
			.collect(Collectors.toList());
	}

	private static List<MenuEntry> withParam0(Client client, int param0)
	{
		return Arrays.stream(client.getMenuEntries())
			.filter(m -> m.getParam0() == param0)
			.collect(Collectors.toList());
	}

	private static List<MenuEntry> withParam1(Client client, int param1)
	{
		return Arrays.stream(client.getMenuEntries())
			.filter(m -> m.getParam1() == param1)
			.collect(Collectors.toList());
	}
}
