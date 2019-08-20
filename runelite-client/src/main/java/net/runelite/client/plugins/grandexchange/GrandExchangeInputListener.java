/*
 * Copyright (c) 2018, Jeremy Plsek <https://github.com/jplsek>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *	list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *	this list of conditions and the following disclaimer in the documentation
 *	and/or other materials provided with the distribution.
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
package net.runelite.client.plugins.grandexchange;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import net.runelite.api.MenuEntry;
import net.runelite.api.menus.DirectMenuEntryElement;
import net.runelite.api.menus.MenuEntries;
import net.runelite.api.menus.comparables.AbstractComparableEntry;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.MouseAdapter;
import static net.runelite.client.plugins.grandexchange.GrandExchangePlugin.SEARCH_GRAND_EXCHANGE;
import net.runelite.client.util.Text;

@Singleton
public class GrandExchangeInputListener extends MouseAdapter implements KeyListener
{
	private final GrandExchangePlugin plugin;

	@Inject
	private GrandExchangeInputListener(final GrandExchangePlugin plugin)
	{
		this.plugin = plugin;
	}

	@Override
	public MouseEvent mouseClicked(MouseEvent e)
	{
		// Check if left click + alt
		if (e.getButton() == MouseEvent.BUTTON1 && e.isAltDown())
		{
			DirectMenuEntryElement entry = MenuEntries.findFirst(new AbstractComparableEntry()
			{
				@Override
				public boolean matches(DirectMenuEntryElement entry)
				{
					return entry.optionEquals(SEARCH_GRAND_EXCHANGE);
				}

				@Override
				public boolean matches(MenuEntry entry)
				{
					return false;
				}
			});

			if (entry != null)
			{
				search(Text.removeTags(entry.getTarget()));
				e.consume();
			}
		}

		return super.mouseClicked(e);
	}

	private void search(final String itemName)
	{
		SwingUtilities.invokeLater(() ->
		{
			plugin.getPanel().showSearch();

			if (!plugin.getButton().isSelected())
			{
				plugin.getButton().getOnSelect().run();
			}

			plugin.getPanel().getSearchPanel().priceLookup(itemName);
		});
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.isAltDown())
		{
			plugin.setHotKeyPressed(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if (!e.isAltDown())
		{
			plugin.setHotKeyPressed(false);
		}
	}
}
