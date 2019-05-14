package net.runelite.client.plugins.gargs;

import net.runelite.client.eventbus.Subscribe;
import java.util.Iterator;
import java.util.ArrayList;
import net.runelite.api.events.GameTick;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.api.NPC;
import javax.annotation.Nullable;
import net.runelite.client.ui.overlay.OverlayManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.Plugin;

@PluginDescriptor(
        name = "Gargoyle Guardians Helper",
        description = "Show various helpful utitiles during the Grotesque Gaurdians (Gargoyles) fight",
        tags = { "bosses", "combat", "minigame", "overlay", "prayer", "pve", "pvm" },
        type = PluginType.PVM
        )
public class GargsPlugin extends Plugin
{
    private static final int GARGOYLES_REGION = 6727;
    @Inject
    private Client client;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private GargsPrayerOverlay prayerOverlay;
    @Inject
    private GargsGraphicObjectsOverlay graphicsObjectsOverlay;
    @Inject
    private GargsTextOverlay textOverlay;
    @Nullable
    private DuskAttack prayAgainst;
    @Nullable
    private NPC dusk;
    private boolean inGargs;
    private boolean needingToRun;

    public GargsPlugin() {
        inGargs = false;
        needingToRun = false;
    }

    @Override
    protected void startUp() throws Exception {
        overlayManager.add(prayerOverlay);
        overlayManager.add(graphicsObjectsOverlay);
        overlayManager.add(textOverlay);
        dusk = null;
        prayAgainst = null;
    }

    @Override
    protected void shutDown() throws Exception {
        overlayManager.remove(textOverlay);
        overlayManager.remove(prayerOverlay);
        overlayManager.remove(graphicsObjectsOverlay);
        dusk = null;
        prayAgainst = null;
    }

    @Subscribe
    public void onGameTick(final GameTick event) {
        final ArrayList<Integer> regions = new ArrayList<Integer>();
        for (final int intValue : client.getMapRegions()) {
            regions.add(intValue);
        }
        if (regions.contains(6727)) {
            dusk = null;
            inGargs = true;
            for (final NPC npc : client.getNpcs()) {
                if (npc.getName() != null && npc.getName().contains("Dusk") && !npc.isDead()) {
                    dusk = npc;
                }
            }
            if (inGargs && dusk != null) {
                if (dusk.getId() == 7888) {
                    if (dusk.getAnimation() == DuskAttack.MELEE.getAnimation()) {
                        prayAgainst = DuskAttack.MELEE;
                    }
                    else if (dusk.getAnimation() == DuskAttack.RANGE.getAnimation()) {
                        prayAgainst = DuskAttack.RANGE;
                    }
                }
                else {
                    prayAgainst = null;
                }
                if (dusk.getAnimation() == 7802) {
                    needingToRun = true;
                }
                else {
                    needingToRun = false;
                }
            }
        }
        else {
            inGargs = false;
            prayAgainst = null;
            dusk = null;
        }
    }

    @Nullable
    DuskAttack getPrayAgainst() {
        return prayAgainst;
    }

    @Nullable
    NPC getDusk() {
        return dusk;
    }

    boolean isInGargs() {
        return inGargs;
    }

    boolean isNeedingToRun() {
        return needingToRun;
    }
}