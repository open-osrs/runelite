package net.runelite.client.plugins.tooltiphider;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;


@PluginDescriptor(
        name = "Tooltip Hider",
        description = "its in the title",
        tags = {"tooltip", "hide", "spellbook", "magic", "spell", "pk", "book", "filter", "nerds"},
        enabledByDefault = false
)


public class TooltipHiderPlugin extends Plugin
{

    @Inject
    TooltipHiderConfig config;
    @Inject
    private Client client;
    @Provides
    TooltipHiderConfig provideConfig(ConfigManager configManager) { return configManager.getConfig(TooltipHiderConfig.class); }

    @Override
    protected void startUp() throws Exception
    {
        adjustTips();
    }

    @Override
    protected void shutDown() throws Exception
    {
        resetTips();
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged event)
    {
        if (event.getGameState() == GameState.LOGGED_IN)
            adjustTips();
    }

    @Subscribe
    public void onWidgetLoaded(WidgetLoaded event)
    {
        if (event.getGroupId() == WidgetID.SPELLBOOK_GROUP_ID || event.getGroupId() == WidgetID.COMBAT_GROUP_ID)
            adjustTips();
    }


    @Subscribe
    public void onGameTick(GameTick event)
    {
        adjustTips();
    }

    private void adjustTips()
    {
        if (client.getGameState() != GameState.LOGGED_IN)
            return;

        try
        {
            setTipHidden(WidgetInfo.SPELL_TOOLTIP, config.shouldHideSpells());
            setTipHidden(WidgetInfo.COMBAT_TOOLTIP, config.shouldHideCombat());
        }
        catch (Exception e)
        {
            //swallow
        }


    }
    private void resetTips()
    {
        if (client.getGameState() != GameState.LOGGED_IN)
            return;

        try
        {
            setTipHidden(WidgetInfo.SPELL_TOOLTIP, false);
            setTipHidden(WidgetInfo.COMBAT_TOOLTIP, false);
        }
        catch (Exception e)
        {
            //swallow
        }
    }
    private void setTipHidden(WidgetInfo widgetInfo, boolean hidden)
    {
        Widget widget = client.getWidget(widgetInfo);

        if (widget == null)
            return;

        widget.setHidden(hidden);
    }

}
