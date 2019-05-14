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
package net.runelite.client.plugins.blowpipe;

import org.slf4j.LoggerFactory;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.NpcActionChanged;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.events.AnimationChanged;
import java.util.regex.Matcher;
import java.text.ParseException;
import java.text.NumberFormat;
import java.util.Locale;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.api.Item;
import net.runelite.api.InventoryID;
import net.runelite.api.kit.KitType;
import net.runelite.api.events.GameTick;
import net.runelite.client.ui.overlay.Overlay;
import java.util.regex.Pattern;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.OverlayManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import org.slf4j.Logger;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.Plugin;

@PluginDescriptor(name = "Blowpipe Helper", description = "Show various helpful utitiles during the Vorkath fight", tags = { "bosses", "combat", "minigame", "overlay", "prayer", "pve", "pvm" })
public class BlowpipePlugin extends Plugin
{
    private static final Logger log = LoggerFactory.getLogger(BlowpipePlugin.class);
    @Inject
    private Client client;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private ItemManager itemManager;
    @Inject
    private BlowpipeInfoOverlay blowpipeInfoOverlay;
    private boolean show;
    private BlowpipeProjectile currentDartType;
    private int currentDartEstimate;
    private int currentScaleEstimate;
    private int dartsInInventory;
    private static Pattern BLOWPIPE_AMMO = Pattern.compile("Darts: <col=007f00>(.+)</col>. Scales: <col=007f00>(.+)</col>");


    public BlowpipePlugin() {
        this.currentDartType = null;
        this.currentDartEstimate = -1;
        this.currentScaleEstimate = -1;
        this.dartsInInventory = 0;
    }

    @Override
    protected void startUp() throws Exception {
        overlayManager.add(blowpipeInfoOverlay);
        currentDartEstimate = -1;
        currentScaleEstimate = -1;
        currentDartType = null;
    }

    @Override
    protected void shutDown() throws Exception {
        overlayManager.remove(blowpipeInfoOverlay);
        currentDartEstimate = -1;
        currentScaleEstimate = -1;
        currentDartType = null;
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        show = false;
        dartsInInventory = 0;
        int weapon = client.getLocalPlayer().getPlayerComposition().getEquipmentId(KitType.WEAPON);
        Item[] items = client.getItemContainer(InventoryID.INVENTORY).getItems();
        for (Item item : items)
        {
            if (itemManager.getItemComposition(item.getId()).getName().equalsIgnoreCase("Toxic blowpipe"))
            {
                show = true;
                break;
            }
            show = false;
        }
        if (itemManager.getItemComposition(weapon).getName().equalsIgnoreCase("Toxic blowpipe")) {
            show = true;
        }
        if (currentDartType != null)
        {
            items = client.getItemContainer(InventoryID.INVENTORY).getItems();
            for (Item item : items) {
                if (item.getId() == currentDartType.getItemId()) {
                    dartsInInventory = item.getQuantity();
                }
            }
        }
    }

    @Subscribe
    public void onVarbitChanged(final VarbitChanged event) {
    }

    @Subscribe
    public void onChatMessage(final ChatMessage event) {
        if (event.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }
        final Matcher m = BlowpipePlugin.BLOWPIPE_AMMO.matcher(event.getMessage());
        if (m.matches()) {
            final String dartString = m.group(1);
            final String scaleString = m.group(2);
            if (!dartString.contains("None")) {
                final String[] dartStringArray = dartString.split(" ");
                try {
                    currentDartEstimate = NumberFormat.getNumberInstance(Locale.US).parse(dartStringArray[3]).intValue();
                }
                catch (ParseException e) {
                    e.printStackTrace();
                }
                final String s = dartStringArray[0];
                switch (s) {
                    case "Dragon": {
                        currentDartType = BlowpipeProjectile.DRAGON;
                        break;
                    }
                    case "Rune": {
                        currentDartType = BlowpipeProjectile.RUNE;
                        break;
                    }
                    case "Adamant": {
                        currentDartType = BlowpipeProjectile.ADAMANT;
                        break;
                    }
                    case "Mithril": {
                        currentDartType = BlowpipeProjectile.MITHRIL;
                        break;
                    }
                    case "Steel": {
                        currentDartType = BlowpipeProjectile.STEEL;
                        break;
                    }
                    case "Iron": {
                        currentDartType = BlowpipeProjectile.IRON;
                        break;
                    }
                    case "Bronze": {
                        currentDartType = BlowpipeProjectile.BRONZE;
                        break;
                    }
                    default: {
                        currentDartType = null;
                        break;
                    }
                }
            }
            else {
                currentDartEstimate = 0;
            }
            if (!scaleString.contains("None")) {
                final String[] scaleStringArray = scaleString.split(" ");
                try {
                    currentScaleEstimate = NumberFormat.getNumberInstance(Locale.US).parse(scaleStringArray[1]).intValue();
                }
                catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            else {
                currentScaleEstimate = 0;
            }
        }
    }

    @Subscribe
    public void onAnimationChanged(final AnimationChanged event) {
    }

    @Subscribe
    public void onProjectileMoved(final ProjectileMoved event) {
        if (show) {
            final Projectile projectile = event.getProjectile();
            final WorldPoint projectileLoc = WorldPoint.fromLocal(client, projectile.getX1(), projectile.getY1(), client.getPlane());
            if (projectileLoc.distanceTo(WorldPoint.fromLocal(client, client.getLocalPlayer().getLocalLocation())) == 0 && projectile.getX() == 0.0 && projectile.getY() == 0.0) {
                BlowpipePlugin.log.info("Projectile {}", (Object)projectile.getId());
                if (currentDartType != null && projectile.getId() == currentDartType.getProjectileId()) {
                    BlowpipePlugin.log.info("Fired");
                    final int cape = client.getLocalPlayer().getPlayerComposition().getEquipmentId(KitType.CAPE);
                    int percentRecovered = -1;
                    if (itemManager.getItemComposition(cape).getName().equalsIgnoreCase("Ava's assembler")) {
                        percentRecovered = 80;
                    }
                    else if (itemManager.getItemComposition(cape).getName().equalsIgnoreCase("Ava's accumulator")) {
                        percentRecovered = 72;
                    }
                    else if (itemManager.getItemComposition(cape).getName().equalsIgnoreCase("Ava's attractor")) {
                        percentRecovered = 60;
                    }
                    double random = Math.random() * 101.0;
                    if (random <= percentRecovered) {
                        BlowpipePlugin.log.info("Returned");
                    }
                    else {
                        BlowpipePlugin.log.info("Lost");
                        --currentDartEstimate;
                    }
                    random = Math.random() * 101.0;
                    if (random <= 66.7) {
                        --currentScaleEstimate;
                    }
                }
            }
        }
    }

    @Subscribe
    public void onGameObjectSpawned(final GameObjectSpawned event) {
    }

    @Subscribe
    public void onGameStateChanged(final GameStateChanged event) {
    }

    @Subscribe
    public void onGraphicChanged(final GraphicChanged event) {
    }

    @Subscribe
    public void onGroundObjectSpawned(final GroundObjectSpawned event) {
    }

    @Subscribe
    public void onInteractingChanged(final InteractingChanged event) {
    }

    @Subscribe
    public void onNpcActionChanged(final NpcActionChanged event) {
    }

    @Subscribe
    public void onNpcSpawned(final NpcSpawned event) {
    }

    boolean isShow() {
        return show;
    }

    BlowpipeProjectile getCurrentDartType() {
        return currentDartType;
    }

    int getCurrentDartEstimate() {
        return currentDartEstimate;
    }

    int getCurrentScaleEstimate() {
        return currentScaleEstimate;
    }

    int getDartsInInventory() {
        return dartsInInventory;
    }

}