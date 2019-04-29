package net.runelite.client.plugins.mouserecorder;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(name = "<html><p style=\"color: #00bfff\">Mouse Recorder</p></html>", developerPlugin = true)
public class MouseRecorderPlugin extends Plugin
{

	@Inject
	private OverlayManager overlayManager;
	
	@Inject
	private MouseRecorderOverlay overlay;
	
	public void startUp()
	{
		overlayManager.add(overlay);
	}
	
	public void shutDown()
	{
		overlayManager.remove(overlay);
	}

}
