package net.runelite.client.plugins.nightmare;

import java.awt.*;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
//import static net.runelite.api.NpcID.nightmarewhenitsupdated;                     //TODO: this here is the thing to change
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.nightmare.NightmareAttack;
import net.runelite.client.plugins.nightmare.NightmareOverlay;
import net.runelite.client.plugins.nightmare.NightmarePrayerOverlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.components.PanelComponent;


@PluginDescriptor(
        name = "Nightmare of Ashihama",
        description = "make braindead shit boss more braindead",
        tags = {"bosses", "combat", "nm", "overlay", "nightmare", "pve", "pvm", "ashihama"},
        type = PluginType.PVM,
        enabledByDefault = false
)
@Singleton
public class NightmarePlugin extends Plugin
{
    private static final int NM_PRE_REGION = 15256;

    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private NightmarePrayerOverlay prayerOverlay;

    @Nullable
    private NightmareAttack prayAgainst;

    @Nullable
    private NPC nm;

    private boolean inFight;

    public NightmarePlugin()
    {
        inFight = false;
    }

    @Inject
    private NightmareOverlay overlay;

    @Override
    protected void startUp()
    {

        overlayManager.add(overlay);
        overlayManager.add(prayerOverlay);
        nm = null;
        prayAgainst = null;
    }

    @Override
    protected void shutDown()
    {
        overlayManager.remove(overlay);
        overlayManager.remove(prayerOverlay);
        nm = null;
        prayAgainst = null;
    }

    @Subscribe
    private void onGameTick(final GameTick event)
    {
//        final ArrayList<Integer> regions = new ArrayList<>();
//        for (final int intValue : client.getMapRegions())
//        {
//            regions.add(intValue);
//        }
//        if(regions.contains(NM_PRE_REGION))
//    {
//        PanelComponent waiting = new PanelComponent();
//        for(final NPC npc : client.getNpcs())
//        {
//            if (npc.getName() != null && npc.getName().contains("The Nightmare"))
//            {
//                if(npc.getId() == 9417) waiting.setBackgroundColor(Color.green);
//                if(npc.getId() == 9419) waiting.setBackgroundColor(Color.red);
//                if(npc.getId() == 9421) waiting.setBackgroundColor(Color.yellow);
//                if(npc.getId() == 9423) waiting.setBackgroundColor(Color.green);
//            }
//        }
//    }

            nm = null;
            inFight = true;
            for (final NPC npc : client.getNpcs())
            {
                if (npc.getName() != null && npc.getName().contains("The Nightmare") && !npc.isDead())
                {
                    nm = npc;
                }
            }
            if (inFight && nm != null)
            {
                if (nm.getId() >= 9425 && nm.getId() <= 9433)        //TODO: change to THE_NIGHTMARE_#### once in client
                {
                    if (nm.getAnimation() == NightmareAttack.MELEE.getAnimation())
                    {
                        prayAgainst = NightmareAttack.MELEE;
                    }
                    else if (nm.getAnimation() == NightmareAttack.RANGE.getAnimation())
                    {
                        prayAgainst = NightmareAttack.RANGE;
                    }
                    else if (nm.getAnimation() == NightmareAttack.MAGIC.getAnimation())
                    {
                        prayAgainst = NightmareAttack.MAGIC;
                    }
                }
                else
                {
                    prayAgainst = null;
                }
            }
//        }
//        else
//        {
//            inFight = false;
//            prayAgainst = null;
//            nm = null;
//        }
    }

    @Nullable
    NightmareAttack getPrayAgainst()
    {
        return prayAgainst;
    }

    @Nullable
    NPC getNm()
    {
        return nm;
    }

    boolean isInFight()
    {
        return inFight;
    }

}
