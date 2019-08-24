package net.runelite.api.menus.comparables;

import lombok.EqualsAndHashCode;
import net.runelite.api.MenuEntry;
import net.runelite.api.menus.DirectMenuEntryElement;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import org.apache.commons.lang3.StringUtils;

@EqualsAndHashCode(callSuper = true)
public class InventoryComparableEntry extends AbstractComparableEntry
{
	public InventoryComparableEntry(String option, String itemName, boolean strictTarget)
	{
		this.setOption(option);
		this.setTarget(Text.standardize(itemName));
		this.setStrictTarget(strictTarget);
	}

	public boolean matches(DirectMenuEntryElement entry)
	{
		final int groupId = WidgetInfo.TO_GROUP(entry.getActionParam1());

		if (groupId != WidgetID.INVENTORY_GROUP_ID)
		{
			return false;
		}

		if (isStrictTarget())
		{
			return entry.targetEquals(this.getTarget());
		}

		return entry.optionContains(this.getOption()) && entry.targetContains(this.getTarget());
	}

	public boolean matches(MenuEntry entry)
	{
		final int groupId = WidgetInfo.TO_GROUP(entry.getActionParam1());

		if (groupId != WidgetID.INVENTORY_GROUP_ID)
		{
			return false;
		}

		if (isStrictTarget() && Text.standardize(entry.getTarget()).equals(this.getTarget()))
		{
			return false;
		}

		return StringUtils.containsIgnoreCase(entry.getOption(), this.getOption()) && Text.standardize(entry.getTarget()).contains(this.getTarget());
	}
}
