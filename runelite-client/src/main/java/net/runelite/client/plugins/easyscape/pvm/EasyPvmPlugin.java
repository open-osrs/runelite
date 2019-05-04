package net.runelite.client.plugins.easyscape.pvm;

import com.google.inject.Inject;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.Text;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

@PluginDescriptor(
        name="EasyPVM",
        description = "EasyPvM.",
        tags = {"EasyPVM", "easy"},
        type = PluginType.EASYSCAPE
)

@Slf4j
public class EasyPvmPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private EasyPvmConfig config;


    private MenuEntry[] entries;

    @Provides
    EasyPvmConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(EasyPvmConfig.class);
    }

    @Override
    public void startUp() {
        log.debug("EasyPvM Started.");
    }


    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {
        if (client.getGameState() != GameState.LOGGED_IN) {
            return;
        }

        Widget loginScreenOne = client.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN);
        Widget loginScreenTwo = client.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);

        if (loginScreenOne != null || loginScreenTwo != null) {
            return;
        }




        final String option = Text.removeTags(event.getOption()).toLowerCase();
        final String target = Text.removeTags(event.getTarget()).toLowerCase();

        entries = client.getMenuEntries();
        MenuEntry[] newEntries = client.getMenuEntries();


        final String[] FreezeSpells = new String[]{"ice barrage", "ice burst", "ice blitz", "ice rush", "entangle", "snare", "bind"};

        if(config.getRemoveFreezePlayerToB() &&  client.getVar(Varbits.THEATRE_OF_BLOOD) == 2) {
            for (int i = entries.length - 1; i >= 0; i--) {
                for (String spell : FreezeSpells) {
                    if (Text.removeTags(entries[i].getTarget().toLowerCase()).startsWith(spell + " ->") && entries[i].getType() != 8) {
                        newEntries = ArrayUtils.remove(entries, i);
                    }
                }

            }
            client.setMenuEntries(newEntries);
        }
    }

    private void removeAllBut(String leaveOption, String leaveTarget)
    {
        MenuEntry[] entries = client.getMenuEntries();
        int index = searchIndex(entries, leaveOption, leaveTarget, false);
        if (index != -1)
        {
            client.setMenuEntries(new MenuEntry[]{entries[index]});
        }
    }


    private void remove(String target, String... options)
    {
        MenuEntry[] entries = client.getMenuEntries();
        boolean hasTarget = false;
        for (MenuEntry entry : entries)
        {
            if (Text.removeTags(entry.getTarget()).toLowerCase().equals(target))
            {
                hasTarget = true;
                break;
            }
        }
        if (hasTarget)
        {
            List<MenuEntry> validEntries = new ArrayList<>();
            List<String> opts = Arrays.asList(options);
            for (MenuEntry entry : entries)
            {
                if (!opts.contains(Text.removeTags(entry.getOption()).toLowerCase()))
                {
                    validEntries.add(entry);
                }
            }
            client.setMenuEntries(validEntries.toArray(new MenuEntry[validEntries.size()]));
        }
    }
    private int searchIndex(MenuEntry[] entries, String option, String target, boolean strict)
    {
        for (int i = entries.length - 1; i >= 0; i--)
        {
            MenuEntry entry = entries[i];
            String entryOption = Text.removeTags(entry.getOption()).toLowerCase();
            String entryTarget = Text.removeTags(entry.getTarget()).toLowerCase();

            if (strict)
            {
                if (entryOption.equals(option) && entryTarget.equals(target))
                {
                    return i;
                }
            }
            else
            {
                if (entryOption.contains(option.toLowerCase()) && entryTarget.equals(target))
                {
                    return i;
                }
            }
        }

        return -1;
    }


}