package net.runelite.api.menus.comparables;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.MenuEntry;
import net.runelite.api.menus.DirectMenuEntryElement;

@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractComparableEntry
{
	String option = null;

	String target = null;

	int id = -1;

	int type = -1;

	boolean strictOption = true;

	boolean strictTarget = true;

	@EqualsAndHashCode.Exclude
	private int priority = 0;

	public abstract boolean matches(DirectMenuEntryElement entry);

	public abstract boolean matches(MenuEntry entry);
}
