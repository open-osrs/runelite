/*
 * Copyright (c) 2018, TheStonedTurtle <https://github.com/TheStonedTurtle>
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
package net.runelite.client.plugins.stonedloottracker.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Singleton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.stonedloottracker.data.LootTrackerItemEntry;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.util.StackFormatter;

@Singleton
class LootGrid extends JPanel
{
	private static final int ITEMS_PER_ROW = 5;
	private static final Dimension ITEM_SIZE = new Dimension(40, 40);
	private final LootTrackerItemEntry[] itemsToDisplay;
	private ItemManager itemManager;

	LootGrid(final LootTrackerItemEntry[] itemsToDisplay, final ItemManager itemManager)
	{
		this.itemsToDisplay = itemsToDisplay;
		this.itemManager = itemManager;

		setBorder(new EmptyBorder(5, 0, 5, 0));

		buildItems();
	}

	/**
	 * This method creates stacked items from the item list, calculates total price and then
	 * displays all the items in the UI.
	 */
	private void buildItems()
	{
		ArrayList<LootTrackerItemEntry> items = LootTrackerBox.dedupeClues(Arrays.asList(itemsToDisplay));

		// Calculates how many rows need to be display to fit all items
		final int rowSize = LootTrackerBox.rowSize(items.size());

		removeAll();
		setLayout(new GridLayout(rowSize, ITEMS_PER_ROW, 1, 1));

		for (int i = 0; i < rowSize * ITEMS_PER_ROW; i++)
		{
			final JPanel slot = new JPanel();
			slot.setLayout(new GridLayout(1, 1, 0, 0));
			slot.setBackground(ColorScheme.DARKER_GRAY_COLOR);
			slot.setPreferredSize(ITEM_SIZE);
			if (i < items.size())
			{
				final LootTrackerItemEntry item = items.get(i);
				if (item == null)
				{
					continue;
				}
				final JLabel itemLabel = new JLabel();
				itemLabel.setToolTipText(buildToolTip(item));
				itemLabel.setVerticalAlignment(SwingConstants.CENTER);
				itemLabel.setHorizontalAlignment(SwingConstants.CENTER);
				itemManager.getImage(item.getId(), item.getQuantity(), item.getQuantity() > 1).addTo(itemLabel);
				slot.add(itemLabel);
			}

			add(slot);
		}

		repaint();
	}

	private static String buildToolTip(LootTrackerItemEntry item)
	{
		final String name = item.getName();
		final int quantity = item.getQuantity();
		final long price = item.getPrice();

		return "<html>" + name + " x " + StackFormatter.formatNumber(quantity)
			+ "<br/>Price: " + StackFormatter.quantityToStackSize(price)
			+ "<br/>Total: " + StackFormatter.quantityToStackSize(quantity * price) + "</html";
	}
}