package net.runelite.client.plugins.clanmanmode;

import net.runelite.api.Player;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class ClanManModeMinimapOverlay extends Overlay {
	private final ClanManModeService ClanManModeService;
	private final ClanManModePlugin plugin;

	@Inject
	private ClanManModeMinimapOverlay(final ClanManModePlugin plugin, final ClanManModeService ClanManModeService) {
		this.plugin = plugin;
		this.ClanManModeService = ClanManModeService;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		ClanManModeService.forEachPlayer((player, color) -> renderPlayerOverlay(graphics, player, color));
		return null;
	}

	private void renderPlayerOverlay(Graphics2D graphics, Player actor, Color color) {
		final String name = actor.getName().replace('\u00A0', ' ');

		if (plugin.isDrawMinimapNames()) {
			final net.runelite.api.Point minimapLocation = actor.getMinimapLocation();

			if (minimapLocation != null) {
				OverlayUtil.renderTextLocation(graphics, minimapLocation, name, color);
			}
		}
	}
}
