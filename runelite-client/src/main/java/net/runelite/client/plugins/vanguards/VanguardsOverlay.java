package net.runelite.client.plugins.vanguards;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class VanguardsOverlay extends Overlay
{

	private final Client client;
	private final VanguardsPlugin plugin;
	private final VanguardsConfig config;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	VanguardsOverlay(Client client, VanguardsPlugin plugin, VanguardsConfig config)
	{
		super(plugin);
		setPosition(OverlayPosition.DYNAMIC);
		setPosition(OverlayPosition.DETACHED);
		this.client = client;
		this.plugin = plugin;
		this.config = config;
	}
	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!plugin.inVangs)
		{
			return null;
		}
		panelComponent.getChildren().clear();

		if (config.showHealth())
		{
			panelComponent.getChildren().add(TitleComponent.builder()
					.text("Vanguards")
					.color(Color.pink)
					.build());
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Range")
					.right(Integer.toString(plugin.rangeHP))
					.leftColor(Color.green)
					.build());
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Mage")
					.right(Integer.toString(plugin.mageHP))
					.leftColor(Color.blue)
					.build());
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Melee")
					.right(Integer.toString(plugin.meleeHP))
					.leftColor(Color.red)
					.build());
			return panelComponent.render(graphics);
		}



		return null;
	}


}
