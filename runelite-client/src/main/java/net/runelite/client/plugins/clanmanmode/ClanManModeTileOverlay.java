package net.runelite.client.plugins.clanmanmode;

import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class ClanManModeTileOverlay extends Overlay {
	private final ClanManModeService ClanManModeService;
	private final ClanManModeConfig config;

	@Inject
	private ClanManModeTileOverlay(final ClanManModeConfig config, final ClanManModeService ClanManModeService) {
		this.config = config;
		this.ClanManModeService = ClanManModeService;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		if (!config.drawTiles()) {
			return null;
		}

		ClanManModeService.forEachPlayer((player, color) ->
		{
			final Polygon poly = player.getCanvasTilePoly();

			if (poly != null) {
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		});

		return null;
	}
}
