package sponge.plugins;

import sponge.Plugin;
import sponge.SpongeOSRS;
import sponge.eventbus.Subscribe;
import sponge.eventbus.events.GameMessageReceived;
import sponge.eventbus.events.GameStateChanged;

public class HelloWorldPlugin extends Plugin
{

    @Subscribe
    public void onGameStateChanged(GameStateChanged event)
    {
        SpongeOSRS.logger.debug("(e) GameStateChanged : " + event.newValue);
    }

    @Subscribe
    public void onGameMessageReceived(GameMessageReceived event)
    {
        SpongeOSRS.logger.debug("(e) GameMessageReceived : " + event.text);
    }
}
