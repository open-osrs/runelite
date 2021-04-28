/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Bloat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.theatre.RoomOverlay;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.ui.overlay.OverlayLayer;

public class BloatOverlay extends RoomOverlay
{
	@Inject
	private Bloat bloat;

	@Inject
	protected BloatOverlay(TheatreConfig config)
	{
		super(config);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	public Dimension render(Graphics2D graphics)
	{
		if (bloat.isBloatActive())
		{
			if (config.bloatIndicator())
			{
				renderPoly(graphics, bloat.getBloatStateColor(), bloat.getBloatTilePoly(), 2);
			}

			if (config.bloatTickCounter())
			{
				NPC boss = bloat.getBloatNPC();

				int tick = bloat.getBloatTickCount();
				final String ticksCounted = String.valueOf(tick);
				Point canvasPoint = boss.getCanvasTextLocation(graphics, ticksCounted, 50);
				renderTextLocation(graphics, ticksCounted, Color.WHITE, canvasPoint);
			}

			if (config.bloatHands())
			{
				for (WorldPoint point : bloat.getBloatHands().keySet())
				{
					drawTile(graphics, point, config.bloatHandsColor(), config.bloatHandsWidth(), 255, 10);
				}
			}
		}
		return null;
	}
}
