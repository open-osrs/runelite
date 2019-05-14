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
package net.runelite.client.plugins.chompy;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.PlayerComposition;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.kit.KitType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
        name="Chompy Helper",
        description="Show various helpful utitiles during Chompy hunting",
        tags={"combat", "minigame", "overlay", "pve", "pvm"},
        type = PluginType.PVM )
public class ChompyPlugin extends Plugin
{
    static final String CHOMPY_KILL_STRING = "You scratch a notch on your bow for the chompy bird kill.";
    private static Pattern CHOMPY_KILL_PATTERN = Pattern.compile("You've killed a total of <col=7f0000>(\\d+)</col> chompy birds so far!.+");
    @Inject
    private Client client;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private ChompyInfoOverlay chompyInfoOverlay;
    @Inject
    private ChompyGraphicsOverlay chompyGraphicsOverlay;

    int getChompyKillCount()
    {
        return this.chompyKillCount;
    }

    private int chompyKillCount = -1;

    boolean isShowPlugin()
    {
        return this.showPlugin;
    }

    private boolean showPlugin = false;

    protected void startUp() throws Exception
    {
        overlayManager.add(chompyInfoOverlay);
        overlayManager.add(chompyGraphicsOverlay);
    }

    ArrayList<NPC> getLiveToads()
    {
        return liveToads;
    }

    private ArrayList<NPC> liveToads = new ArrayList();

    ArrayList<NPC> getLaidToads()
    {
        return laidToads;
    }

    private ArrayList<NPC> laidToads = new ArrayList();

    ArrayList<NPC> getLiveChompies()
    {
        return liveChompies;
    }

    private ArrayList<NPC> liveChompies = new ArrayList();

    protected void shutDown() throws Exception
    {
        overlayManager.remove(chompyInfoOverlay);
        overlayManager.remove(chompyGraphicsOverlay);
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        int weaponEquippedId = client.getLocalPlayer().getPlayerComposition().getEquipmentId(KitType.WEAPON);
        if ((weaponEquippedId == 2883) || (weaponEquippedId == 4827))
        {
            showPlugin = true;
            liveToads.clear();
            laidToads.clear();
            liveChompies.clear();
            for (NPC npc : client.getNpcs())
            {
                if (npc.getId() == 1473) {
                    liveToads.add(npc);
                }
                if (npc.getId() == 1474) {
                    laidToads.add(npc);
                }
                if (npc.getId() == 1475) {
                    liveChompies.add(npc);
                }
            }
            if (client.getWidget(WidgetInfo.DIALOG_SPRITE_TEXT) != null)
            {
                Widget chompyWidget = client.getWidget(WidgetInfo.DIALOG_SPRITE_TEXT);
                if (chompyWidget != null)
                {
                    Matcher m = CHOMPY_KILL_PATTERN.matcher(chompyWidget.getText());
                    if (m.matches()) {
                        chompyKillCount = Integer.parseInt(m.group(1));
                    }
                }
            }
        }
        else
        {
            this.showPlugin = false;
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage event)
    {
        if ((event.getType() != ChatMessageType.SPAM) && (event.getType() != ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (event.getMessage().equals(CHOMPY_KILL_STRING)) {
            chompyKillCount += 1;
        }
    }
}
