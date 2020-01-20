package net.runelite.client.plugins.freezetimersv2;

import com.google.common.annotations.VisibleForTesting;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class FreezeTimersV2Overlay extends Overlay
{
	@Inject
	private TimerManager timerManager;
	@Inject
	private Client client;
	@Inject
	private FreezeTimersV2Config config;
	@Inject
	private ConfigManager configManager;
	private final Font timerFont = FontManager.getRunescapeBoldFont().deriveFont(14.0f);

	@Inject
	public FreezeTimersV2Overlay()
	{
		super();
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.UNDER_WIDGETS);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		Font oldFont = g.getFont();
		Color oldColor = g.getColor();
		g.setFont(timerFont);

		if (config.showNpcs())
		{
			client.getNpcs().forEach((a) -> renderActor(g, a));
		}

		if (config.showPlayers())
		{
			client.getPlayers().forEach((a) -> renderActor(g, a));
		}

		g.setFont(oldFont);
		g.setColor(oldColor);

		return null;
	}

	private void renderActor(Graphics2D g, Actor actor)
	{
		int offset = 0;
		for (TimerType timerType : TimerType.values())
		{
			if (timerType.shouldRender(configManager))
			{
				if (timerManager.hasTimerActive(actor, timerType))
				{
					if (renderTimer(g, actor, timerType, offset))
					{
						offset++;
					}
				}
			}
		}
	}

	private boolean renderTimer(Graphics2D g, Actor actor, TimerType timerType, int offset)
	{
		Timer timer = timerManager.getTimerFor(actor, timerType);
		long millisRemaining = timer.millisRemainingForDisplay();
		if (millisRemaining < 0)
		{
			millisRemaining = (timerType.getImmunityLength() * 600) - Math.abs(millisRemaining);
		}

		String text = formatTime(millisRemaining);
		Point canvasLocation = actor.getCanvasTextLocation(g, text, 0);

		if (canvasLocation == null)
		{
			return false;
		}

		int yOffset = (offset * (g.getFontMetrics().getHeight() + 2));
		Rectangle rect = actor.getConvexHull().getBounds();
		int xOffset = (int) rect.getWidth();
		BufferedImage image = timer.getIcon();
		Point actorCIL = actor.getCanvasImageLocation(image, 0);

		Point textLocation = new Point(actorCIL.getX() + xOffset, actorCIL.getY() + yOffset);
		g.drawImage(image, textLocation.getX(), textLocation.getY(), null);
		xOffset = image.getWidth() + 1;
		yOffset = (image.getHeight() - g.getFontMetrics().getHeight());
		textLocation = new Point(textLocation.getX() + xOffset, textLocation.getY() + image.getHeight() - yOffset);
		OverlayUtil.renderTextLocation(g, textLocation, text, timer.isInCooldown() ? config.cooldownColor() : config.timerColor());

		return true;
	}

	@VisibleForTesting
	public String formatTime(long time)
	{
		if (time > 59999)
		{
			return ((int) time / 60000) + ":" + formatSeconds(((int) (time % 60000) / 1000));
		}
		else if (time > 9999)
		{
			return ((int) time / 1000) + "";
		}
		else if (time > 999)
		{
			return ((int) time / 1000) + "." + ((int) (time % 1000) / 100);
		}
		return "0." + ((int) time / 100);
	}

	private String formatSeconds(int seconds)
	{
		return String.format("%02d", seconds);
	}
}
