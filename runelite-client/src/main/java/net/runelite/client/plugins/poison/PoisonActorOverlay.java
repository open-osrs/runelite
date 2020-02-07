package net.runelite.client.plugins.poison;

import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

import static net.runelite.client.plugins.poison.PoisonPlugin.*;

@Singleton
public class PoisonActorOverlay extends Overlay {
	private final PoisonPlugin plugin;
	private final Client client;
	private boolean displayTicks;
	private int fontSize;
	private Font font;

	@Inject
	PoisonActorOverlay(final PoisonPlugin plugin, final Client client) {
		this.plugin = plugin;
		this.client = client;
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	@Override
	public Dimension render(Graphics2D g) {
		final Map<Actor, ActorPoisonInfo> actors = plugin.getPoisonedActors();

		if (actors.isEmpty()) {
			return null;
		}

		final int tickCount = client.getTickCount();
		final int modTickCount = tickCount % 30;

		if (font == null) {
			font = g.getFont().deriveFont(fontSize * 2.0f);
		}

		g.setFont(font);

		for (Map.Entry<Actor, ActorPoisonInfo> entry : actors.entrySet()) {
			Actor a = entry.getKey();

			if (a == null) {
				continue;
			}

			ActorPoisonInfo i = entry.getValue();

			int accurateDamage = i.getAccurateDamage();
			int damage;

			if (accurateDamage != -1) {
				damage = nextDamage(accurateDamage);
			} else {
				damage = i.getLastDamage();
			}

			boolean venomed = accurateDamage >= VENOM_THRESHOLD;

			String timeLeft = getTimeLeft(modTickCount, i.getCycle());

			renderOverlayFor(g, a, damage, timeLeft, venomed);
		}

		return null;
	}

	private String getTimeLeft(int tickCount, int cycle) {
		if (tickCount > cycle) {
			cycle += POISON_TICK_TICKS;
		}

		int timeLeft = (cycle - tickCount);

		if (!displayTicks) {
			timeLeft = timeLeft * Constants.GAME_TICK_LENGTH / 1000;
		}

		return String.valueOf(timeLeft);
	}

	private void renderOverlayFor(Graphics2D g, Actor actor, int damage, String timeLeft, boolean venomed) {
		BufferedImage splat = plugin.getSplat(venomed ? SpriteID.HITSPLAT_DARK_GREEN_VENOM : SpriteID.HITSPLAT_GREEN_POISON, damage);

		LocalPoint localLocation = actor.getLocalLocation();
		if (localLocation == null) {
			return;
		}

		Point overlayLocation = Perspective.getCanvasImageLocation(client, localLocation, splat, 0);

		if (overlayLocation == null) {
			return;
		}

		int textOffset = splat.getHeight() - (splat.getHeight() - fontSize) / 2;

		Point textLocation = new Point(overlayLocation.getX() + splat.getWidth() + 3, overlayLocation.getY() + textOffset);

		g.drawImage(splat, overlayLocation.getX(), overlayLocation.getY(), null);
		OverlayUtil.renderTextLocation(g, textLocation, timeLeft, Color.WHITE);
	}

	void setFontSize(int size) {
		if (font != null) {
			fontSize = size;
			font = font.deriveFont(fontSize * 2.0f);
		} else {
			fontSize = size;
		}
	}

	void setDisplayTicks(boolean displayTicks) {
		this.displayTicks = displayTicks;
	}
}
