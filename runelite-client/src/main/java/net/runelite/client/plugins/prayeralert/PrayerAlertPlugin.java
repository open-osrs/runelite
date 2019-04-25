package net.runelite.client.plugins.prayeralert;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
        name = "Prayer Alerter",
        description = "Alert the player when prayer is low",
        tags = {"prayer", "overlay"},
        type = PluginType.UTILITY
)
public class PrayerAlertPlugin extends Plugin
{
    @Inject
    private OverlayManager overlayManager;

    @Inject
    private PrayerAlertOverlay overlay;

    @Inject
    private PrayerAlertConfig config;

    @Provides
    PrayerAlertConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(PrayerAlertConfig.class);
    }

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(overlay);
    }
}