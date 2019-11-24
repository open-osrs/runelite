/*
 * Copyright (c) 2019, https://openosrs.com
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
package net.runelite.client.plugins.bloodrunes;

import com.google.common.collect.ImmutableSet;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.Set;

@PluginDescriptor(
        name="Blood Runes",
        description = "Helper for crafting blood runes",
        enabledByDefault = false,
        type = PluginType.SKILLING
)
public class BloodRunesPlugin extends Plugin {

    private static final Set<Integer> ANIMATIONS = new ImmutableSet.Builder<Integer>()
            .add(
                    7201,
                    4482
            ).build();

    @Getter(AccessLevel.PACKAGE)
    private GameObject runestoneNorth;
    @Getter(AccessLevel.PACKAGE)
    private GameObject runestoneSouth;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private Client client;

    @Inject
    private RunestoneOverlay runestoneOverlay;

    @Override
    protected void startUp() {
        overlayManager.add(runestoneOverlay);

    }

    @Override
    protected void shutDown() {
        overlayManager.remove(runestoneOverlay);
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged event) {
        switch(client.getGameState()) {
            case LOADING:
            case LOGIN_SCREEN:
                runestoneNorth = null;
                runestoneSouth = null;
                break;

        }
    }

    @Subscribe
    private void onGameObjectSpawned(GameObjectSpawned event) {
        GameObject object = event.getGameObject();
        if(object.getId() == Runestones.NORTH.getId()) {
            runestoneNorth = object;
        } else if(object.getId() == Runestones.SOUTH.getId()) {
            runestoneSouth = object;
        }
    }

    @Subscribe
    private void onGameObjectDespawned(GameObjectDespawned event) {
        GameObject object = event.getGameObject();
        if(object.getId() == Runestones.NORTH.getId()) {
            runestoneNorth = null;
        } else if(object.getId() == Runestones.SOUTH.getId()) {
            runestoneSouth = null;
        }
    }

    public boolean isMineable(Runestones runestone) {
        return client.getVar(runestone.depletedVarbit) == 0;
    }

    public boolean isChipping() {
        Player localPlayer = client.getLocalPlayer();
        if(localPlayer == null)
            return false;
        return ANIMATIONS.contains(localPlayer.getAnimation());
    }
}
