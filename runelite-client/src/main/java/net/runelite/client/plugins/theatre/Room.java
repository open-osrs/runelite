/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ArrayUtils;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public abstract class Room
{
	protected final TheatrePlugin plugin;
	protected final TheatreConfig config;

	@Inject
	protected OverlayManager overlayManager;

	@Inject
	private Client client;

	@Inject
	protected Room(TheatrePlugin plugin, TheatreConfig config)
	{
		this.plugin = plugin;
		this.config = config;
	}

	public void init()
	{
	}

	public void load()
	{
	}

	public void unload()
	{
	}

	public boolean inRoomRegion(Integer roomRegionId)
	{
		return ArrayUtils.contains(client.getMapRegions(), roomRegionId);
	}
}

