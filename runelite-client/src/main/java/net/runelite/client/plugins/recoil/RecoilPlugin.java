/*
 * Copyright (c) 2018, https://runelitepl.us
 * Copyright (c) 2018, https://github.com/runeliteplusplus
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

package net.runelite.client.plugins.recoil;

import java.awt.image.BufferedImage;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
        name="Ring of Recoil Helper",
        description="Shows a on screen icon for Ring of Recoil ",
        tags={"bosses", "combat", "overlay", "pve", "pvm"},
        type = PluginType.PVM )
public class RecoilPlugin extends Plugin
{
    @Inject
    private Client client;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private RecoilOverlay recoilOverlay;
    @Inject
    private ItemManager itemManager;

    boolean isRingOfRecoilAvailable()
    {
        return ringOfRecoilAvailable;
    }

    private boolean ringOfRecoilAvailable = false;

    boolean isRingOfRecoilEquipped()
    {
        return ringOfRecoilEquipped;
    }

    private boolean ringOfRecoilEquipped = false;
    private BufferedImage recoilRingImage;

    BufferedImage getRecoilRingImage()
    {
        return recoilRingImage;
    }

    protected void startUp() throws Exception
    {
        overlayManager.add(recoilOverlay);
        recoilRingImage = itemManager.getImage(2550);
    }

    protected void shutDown() throws Exception
    {
        overlayManager.remove(recoilOverlay);
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        ItemContainer equipment = client.getItemContainer(InventoryID.EQUIPMENT);
        ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
        ringOfRecoilAvailable = false;
        ringOfRecoilEquipped = false;

        Item ring = equipment.getItems()[net.runelite.api.EquipmentInventorySlot.RING.getSlotIdx()];
        if (ring.getId() == 2550)
        {
            ringOfRecoilEquipped = true;
            ringOfRecoilAvailable = true;
        }
        Item[] items = inventory.getItems();
        for (Item item : items) {
            if (item.getId() == 2550)
            {
                ringOfRecoilAvailable = true;
                break;
            }
        }
    }
}
