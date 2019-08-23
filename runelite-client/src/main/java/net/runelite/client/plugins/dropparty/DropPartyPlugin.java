package net.runelite.client.plugins.dropparty;

import com.google.inject.Provides;
import java.awt.Color;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;


@PluginDescriptor(
        name = "Drop Party",
        description = "Marks where a user ran, for drop partys",
        tags = {"Drop", "Party", "marker", "player"},
        type = PluginType.UTILITY,
        enabledByDefault = false
)
@Singleton
@Slf4j
public class DropPartyPlugin extends Plugin {
    @Inject
    public DropPartyConfig config;
    @Inject
    private Notifier notifier;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private DropPartyOverlay coreOverlay;
    @Inject
    private EventBus eventbus;
    @Inject
    private Client client;
    @Provides
    DropPartyConfig getConfig(ConfigManager configManager)
    {
        return configManager.getConfig(DropPartyConfig.class);
    }
    @Getter(AccessLevel.PACKAGE)
    List<WorldPoint> playerPath = new ArrayList<>();
    @Getter(AccessLevel.PACKAGE)
    String playerName = "";
    @Getter(AccessLevel.PACKAGE)
    int showAmmount = 0;
    @Getter(AccessLevel.PACKAGE)
    int MAXPATHSIZE = 100;
    Player runningPlayer;
    @Getter(AccessLevel.PACKAGE)
    Color overlayColor;
    @Getter(AccessLevel.PACKAGE)
    private int fontStyle;
    @Getter(AccessLevel.PACKAGE)
    private int textSize;

    @Override
    protected void startUp()
    {
        updateConfig();
        addSubscriptions();
        overlayManager.add(coreOverlay);
        reset();
    }

    @Override
    protected void shutDown()
    {
        overlayManager.remove(coreOverlay);
        reset();
        eventbus.unregister(this);
    }

    private void addSubscriptions()
    {
        eventbus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
        eventbus.subscribe(GameTick.class, this, this::onGameTick);
    }



    private void onGameTick(GameTick event) {
        shuffleList();
        if(playerName.equalsIgnoreCase("") || playerName == null) {
            return;
        }

        runningPlayer = null;

        for (Player player : client.getPlayers())
        {
            if(player.getName() != null) {
                if (player.getName().equalsIgnoreCase(playerName))
                {
                    runningPlayer = player;
                    break;
                }
            }

        }

        if(runningPlayer == null) {
            cordsError();
            return;
        }
        addCords();
    }

    private void cordsError(){
        playerPath.add(null);

    }
    private void shuffleList(){
        if (playerPath.size() > MAXPATHSIZE - 1) {
            playerPath.remove(0);
        }
    }

    private void addCords() {
        while(true) {
            if (playerPath.size() >= MAXPATHSIZE) {
                playerPath.add(runningPlayer.getWorldLocation());
                break;
            }
            playerPath.add(null);

        }


    }

    private void onConfigChanged(ConfigChanged event)
    {
        if (!event.getGroup().equals("drop"))
        {
            return;
        }

        updateConfig();
    }


    private void reset(){
        playerPath.clear();
    }


    private void updateConfig(){
        this.playerName = config.playerName();
        this.showAmmount = config.showAmmount();
        this.overlayColor = config.overlayColor();
        this.fontStyle = config.fontStyle().getFont();
        this.textSize = config.textSize();
    }
}
