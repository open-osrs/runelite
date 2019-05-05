package net.runelite.client.plugins.boulder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

public class BoulderOverlay extends Overlay
{

	private final Client client;
	private final BoulderConfig config;
	private final BoulderPlugin plugin;

	@Inject
	private BoulderOverlay(Client client, BoulderConfig config, BoulderPlugin plugin)
	{
		this.client = client;
		this.config = config;
		this.plugin = plugin;
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.LOW);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{

		for (TileObject object : plugin.getObjects())
		{
			if (object.getPlane() != client.getPlane())
			{
				continue;
			}

			final Polygon polygon;

			if (object instanceof GameObject)
			{
				polygon = ((GameObject) object).getConvexHull();
			}
			else
			{
				polygon = object.getCanvasTilePoly();
			}

			if (polygon == null)
			{
				continue;
			}

			String name;
			switch (object.getId())
			{
				case 29736:
					name = "Tree";
					break;
				case 29738:
					name = "Rocks";
					break;
				case 29740:
					name = "Boulder";
					break;
				default:
					name = "uhhh";
			}
			if (config.showText())
			{
				if (config.doBoulder() && name.equals("Boulder"))
				{
					renderText(graphics, object, name, config.textColor(), object.getPlane() + 100);
				}
				else if (config.doTree() && name.equals("Tree"))
				{
					renderText(graphics, object, name, config.textColor(), object.getPlane() + 250);
				}
				else if (config.doMining() && name.equals("Rocks"))
				{
					renderText(graphics, object, name, config.textColor(), object.getPlane() + 100);
				}

			}
			if (config.showHighlight())
			{
				if (config.doBoulder() && name.equals("Boulder"))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.markerColor());
				}
				else if (config.doTree() && name.equals("Tree"))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.markerColor());
				}
				else if (config.doMining() && name.equals("Rocks"))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.markerColor());
				}
			}

		}

		return null;
	}

	private void renderText(Graphics2D graphics, TileObject object, String name, Color color, int z)
	{
		Point textLocation = object.getCanvasTextLocation(graphics, name, z);

		if (textLocation != null)
		{
			OverlayUtil.renderTextLocation(graphics, textLocation, name, color);
		}
	}
}
