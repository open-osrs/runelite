package net.runelite.client.plugins.theatre;

import net.runelite.client.input.KeyListener;


import javax.inject.Inject;
import java.awt.event.KeyEvent;




public class ShiftWalkerInputListener implements KeyListener
{
    @Inject
    private TheatrePlugin plugin;
    @Inject
    private TheatreConfig config;
    @Override
    public void keyTyped(final KeyEvent event) {
    }

    @Override
    public void keyPressed(final KeyEvent event) {

        if (config.up().matches(event)) {
            this.plugin.setHotKeyPressed(true);
        }
    }

    @Override
    public void keyReleased(final KeyEvent event) {
        if (config.up().matches(event)) {
            this.plugin.setHotKeyPressed(false);
        }
    }
}
