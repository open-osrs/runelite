
package net.runelite.client.plugins.vanguards;


import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.plugins.opponentinfo.OpponentInfoPlugin;
//import net.runelite.client.plugins.opponentinfo.OpponentInfoOverlay;


@PluginDescriptor(
        name= "Vanguard HP Overlay",
        description= "tracks HP of all three vanguards",
        tags= {"overlay", "vangs", "cox"}
)
public class VanguardPlugin extends Plugin {
    private static final int MAGE_VANGUARD_ID = 7526; //i think
    private static final int RANGE_VANGUARD_ID = 7527;
    private static final int MELEE_VANGUARD_ID = 7528;


    @Inject
    private OverlayManager overlayManager;

    @Inject
    private VanguardOverlay overlay;

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(overlay);
        overlay.right_mage_str = "-";
        overlay.right_range_str = "-";
        overlay.right_melee_str = "-";
    }


}

