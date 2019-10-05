package net.runelite.client.plugins.onetick;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.graphics.ModelOutlineRenderer;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

@Singleton
public class OneTickOverlay extends Overlay
{
	private static final Color TRANSPARENT = new Color(0, 0, 0, 0);

	private final Client client;
	private final OneTick plugin;
	private final ModelOutlineRenderer modelOutliner;

	@Inject
	private OneTickOverlay(final Client client, final OneTick plugin, final ModelOutlineRenderer modelOutliner)
	{
		this.client = client;
		this.plugin = plugin;
		this.modelOutliner = modelOutliner;
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.LOW);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (plugin.getObjects().isEmpty())
		{
			return null;
		}

		for (TileObject object : plugin.getObjects())
		{
			if (object.getPlane() != client.getPlane())
			{
				continue;
			}

			modelOutliner.drawOutline(object, 4, Color.CYAN, TRANSPARENT);
		}
		return null;
	}
}
