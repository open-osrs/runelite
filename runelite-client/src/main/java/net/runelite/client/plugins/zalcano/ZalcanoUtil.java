/*
 *
 *  * Copyright (c) 2019, gazivodag <https://github.com/gazivodag>
 *  * All rights reserved.
 *  *
 *  * Redistribution and use in source and binary forms, with or without
 *  * modification, are permitted provided that the following conditions are met:
 *  *
 *  * 1. Redistributions of source code must retain the above copyright notice, this
 *  *    list of conditions and the following disclaimer.
 *  * 2. Redistributions in binary form must reproduce the above copyright notice,
 *  *    this list of conditions and the following disclaimer in the documentation
 *  *    and/or other materials provided with the distribution.
 *  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package net.runelite.client.plugins.zalcano;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.GameObject;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.ProjectileID;
import net.runelite.api.Tile;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;

public class ZalcanoUtil
{

	private Client client;
	private ZalcanoPlugin plugin;

	@Inject
	ZalcanoUtil(Client client, ZalcanoPlugin plugin)
	{
		this.client = client;
		this.plugin = plugin;
	}

	protected boolean projectileExists()
	{
		for (Projectile projectile : client.getProjectiles())
		{
			if (projectile != null)
			{
				if (projectile.getId() == ProjectileID.ZALCANO_PROJECTILE)
				{
					return true;
				}
			}
		}
		return false;
	}

	//this should be a project-wide standard
	protected List<GameObject> getGameObjects()
	{
		List<GameObject> gameObjectArrayList = new ArrayList<>();

		for (int x = 0; x < Constants.SCENE_SIZE; x++)
		{
			for (int y = 0; y < Constants.SCENE_SIZE; y++)
			{
				Tile tile = client.getScene().getTiles()[client.getPlane()][x][y];

				if (tile.getGameObjects() != null)
				{
					for (GameObject gameObject : tile.getGameObjects())
					{
						if (gameObject != null) //im aware this can still give null objects
						{
							gameObjectArrayList.add(gameObject);
						}
					}
				}
			}
		}
		return gameObjectArrayList;
	}

	protected int countItemInInventory(int itemID)
	{
		int i = 0;
		Widget widget = client.getWidget(WidgetInfo.INVENTORY);
		for (WidgetItem widgetItem : widget.getWidgetItems())
		{
			if (widgetItem.getId() == itemID)
			{
				i++;
			}
		}
		return i;
	}

	/**
	 * Courtesy of OP
	 *
	 * @param itemId
	 * @return
	 */
	protected int countStackInInventory(int itemId)
	{
		ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
		if (inventory != null)
		{
			Item[] items = inventory.getItems();
			for (int i = 0; i < 28; ++i)
			{
				if (i < items.length)
				{
					Item item = items[i];
					if (item.getId() >= 0 && item.getId() == itemId)
					{
						return item.getQuantity();
					}
				}
			}
		}
		return 0;
	}

	protected void manuallyFindZalcano()
	{
		for (NPC npc : client.getNpcs())
		{
			if (npc != null)
			{
				if (npc.getId() == 9049)
				{
					plugin.setZalcano(npc);
				}
			}
		}
	}


}
