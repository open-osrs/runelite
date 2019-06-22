package net.runelite.client.plugins.inferno;

import java.awt.Color;
import com.google.inject.Inject;
import lombok.Setter;
import static net.runelite.client.plugins.inferno.InfernoWaveMappings.addWaveComponent;
import java.awt.Graphics2D;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayPosition;
import java.awt.Dimension;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.Overlay;

public class InfernoWaveOverlay extends Overlay
	{
	private final InfernoPlugin plugin;
	private final InfernoConfig config;
	private final PanelComponent panelComponent;

	@Setter
	private Color waveHeaderColor;

	@Setter
	private Color waveTextColor;

	@Inject
	InfernoWaveOverlay(final InfernoPlugin plugin, final InfernoConfig config)
	{
		this.panelComponent = new PanelComponent();
		this.setPosition(OverlayPosition.TOP_RIGHT);
		this.setPriority(OverlayPriority.HIGH);
		this.plugin = plugin;
		this.config = config;

		panelComponent.setPreferredSize(new Dimension(150, 0));
	}

	public Dimension render(final Graphics2D graphics)
	{
		panelComponent.getChildren().clear();

		if (config.waveDisplay() == InfernoWaveDisplayMode.CURRENT
				|| config.waveDisplay() == InfernoWaveDisplayMode.BOTH)
		{
			addWaveComponent(
				panelComponent,
				"Current Wave (Wave " + plugin.getCurrentWaveNumber() + ")",
				plugin.getCurrentWaveNumber(),
				waveHeaderColor,
				waveTextColor
			);
		}

		if ((config.waveDisplay() == InfernoWaveDisplayMode.NEXT
				|| config.waveDisplay() == InfernoWaveDisplayMode.BOTH)
				&& plugin.isNotFinalWave())
		{
			addWaveComponent(
				panelComponent,
				"Next Wave (Wave " + plugin.getNextWaveNumber()  + ")",
				plugin.getNextWaveNumber(),
				waveHeaderColor,
				waveTextColor
			);
		}

		return panelComponent.render(graphics);
	}
}
