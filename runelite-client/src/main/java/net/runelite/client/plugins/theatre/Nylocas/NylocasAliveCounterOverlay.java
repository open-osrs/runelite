/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Nylocas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LayoutableRenderableEntity;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

public class NylocasAliveCounterOverlay extends Overlay
{
	private TheatreConfig config;

	private LineComponent waveComponent;
	private final PanelComponent panelComponent = new PanelComponent();

	private static final String prefix = "Nylocas Alive: ";

	@Setter
	private Instant nyloWaveStart;

	@Getter
	private int nyloAlive = 0;

	@Getter
	private int maxNyloAlive = 12;

	@Getter
	private int wave = 0;

	@Setter
	@Getter
	private boolean hidden = false;

	@Inject
	private NylocasAliveCounterOverlay(TheatreConfig config)
	{
		this.config = config;

		setPosition(OverlayPosition.TOP_LEFT);
		setPriority(OverlayPriority.HIGH);
		setLayer(OverlayLayer.ABOVE_SCENE);
		refreshPanel();
	}

	public void setNyloAlive(int aliveCount)
	{
		nyloAlive = aliveCount;
		refreshPanel();
	}

	public void setMaxNyloAlive(int maxAliveCount)
	{
		maxNyloAlive = maxAliveCount;
		refreshPanel();
	}

	public void setWave(int wave)
	{
		this.wave = wave;
		refreshPanel();
	}

	private void refreshPanel()
	{
		LineComponent lineComponent = LineComponent.builder().left(prefix).right(nyloAlive + "/" + maxNyloAlive).build();

		if (nyloAlive >= maxNyloAlive)
		{
			lineComponent.setRightColor(Color.ORANGE);
		}
		else
		{
			lineComponent.setRightColor(Color.GREEN);
		}

		waveComponent = LineComponent.builder().left("Wave: " + wave + "/" + NylocasWave.MAX_WAVE).build();

		panelComponent.getChildren().clear();
		panelComponent.getChildren().add(waveComponent);
		panelComponent.getChildren().add(lineComponent);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.nyloAlivePanel() || isHidden())
		{
			return null;
		}

		if (nyloWaveStart != null)
		{
			for (LayoutableRenderableEntity entity : panelComponent.getChildren())
			{
				if (entity instanceof LineComponent && entity.equals(waveComponent))
				{
					((LineComponent) entity).setRight(getFormattedTime());
				}
			}
		}
		return panelComponent.render(graphics);
	}

	public String getFormattedTime()
	{
		Duration duration = Duration.between(nyloWaveStart, Instant.now());
		LocalTime localTime = LocalTime.ofSecondOfDay(duration.getSeconds());
		return localTime.format(DateTimeFormatter.ofPattern("mm:ss"));
	}
}
