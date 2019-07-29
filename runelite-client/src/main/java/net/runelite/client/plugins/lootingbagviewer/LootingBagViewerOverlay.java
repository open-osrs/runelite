/*
 * Copyright (c) 2018 AWPH-I
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

package net.runelite.client.plugins.lootingbagviewer;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.ComponentOrientation;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

@Singleton
public class LootingBagViewerOverlay extends Overlay
{
	private static final int INVENTORY_SIZE = 28;
	public static final int PLACEHOLDER_WIDTH = 36;
	private static final int PLACEHOLDER_HEIGHT = 32;
	private static final ImageComponent PLACEHOLDER_IMAGE = new ImageComponent(new BufferedImage(PLACEHOLDER_WIDTH, PLACEHOLDER_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR));

	private final Client client;
	private final ItemManager itemManager;

	private final PanelComponent panelComponent = new PanelComponent();

	private ItemContainer itemContainer;
	private Item[] items;

	@Inject
	private LootingBagViewerOverlay(final Client client, final ItemManager itemManager)
	{
		setPosition(OverlayPosition.BOTTOM_RIGHT);
		panelComponent.setWrapping(4);
		panelComponent.setGap(new Point(6, 4));
		panelComponent.setOrientation(ComponentOrientation.HORIZONTAL);
		this.itemManager = itemManager;
		this.client = client;

	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (itemContainer == null)
		{
			if (client.getItemContainer(InventoryID.LOOTING_BAG) != null)
			{
				itemContainer = client.getItemContainer(InventoryID.LOOTING_BAG);
				if (itemContainer != null)
				{
					items = itemContainer.getItems();
				}
			}
			return null;
		}
		else if (items != null && client.getItemContainer(InventoryID.LOOTING_BAG) != null)
		{
			itemContainer = client.getItemContainer(InventoryID.LOOTING_BAG);
			if (itemContainer != null)
			{
				Item[] tempItems = itemContainer.getItems();

				for (int i = 0; i < items.length; i++)
				{
					if (!items[i].equals(tempItems[i]))
					{
						items = tempItems;
					}
				}
			}
		}

		panelComponent.getChildren().clear();

		for (int i = 0; i < INVENTORY_SIZE; i++)
		{
			if (i < items.length)
			{
				final Item item = items[i];
				if (item.getQuantity() > 0)
				{
					final BufferedImage image = getImage(item);
					if (image != null)
					{
						panelComponent.getChildren().add(new ImageComponent(image));
						continue;
					}
				}
			}

			// put a placeholder image so each item is aligned properly and the panel is not resized
			panelComponent.getChildren().add(PLACEHOLDER_IMAGE);
		}

		return panelComponent.render(graphics);
	}

	private BufferedImage getImage(Item item)
	{
		return itemManager.getImage(item.getId(), item.getQuantity(), item.getQuantity() > 1);
	}
}