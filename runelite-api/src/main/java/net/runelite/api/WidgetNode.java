package net.runelite.api;

import net.runelite.api.widgets.WidgetModalMode;
import org.intellij.lang.annotations.MagicConstant;

/**
 * Represents a widget as an iterable node.
 */
public interface WidgetNode extends Node
{
	/**
	 * The ID of the widget.
	 *
	 * @return the ID of the widget
	 * @see net.runelite.api.widgets.Widget
	 */
	int getId();

	/**
	 * @see net.runelite.api.widgets.WidgetModalMode
	 */
	@MagicConstant(valuesFromClass = WidgetModalMode.class)
	int getModalMode();
}
