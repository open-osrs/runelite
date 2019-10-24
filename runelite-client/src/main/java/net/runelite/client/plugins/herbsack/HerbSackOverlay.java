package net.runelite.client.plugins.herbsack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.ui.overlay.components.table.TableAlignment;
import net.runelite.client.ui.overlay.components.table.TableComponent;
import net.runelite.client.util.QuantityFormatter;

public class HerbSackOverlay extends Overlay
{
	private final PanelComponent panelComponent = new PanelComponent();
	private final HerbSackPlugin plugin;
	private final ItemManager itemManager;

	@Inject
	public HerbSackOverlay(HerbSackPlugin plugin, ItemManager itemManager)
	{
		super(plugin);
		setPosition(OverlayPosition.TOP_RIGHT);
		this.plugin = plugin;
		this.itemManager = itemManager;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!(plugin.isShowOverlay() && plugin.isHerbSackInInventory()))
		{
			return null;
		}
		panelComponent.getChildren().clear();
		panelComponent.getChildren().add(TitleComponent.builder()
			.text("Herb Sack")
			.color(Color.GREEN)
			.build());
		TableComponent tableComponent = new TableComponent();
		tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);
		int totalGp = 0;
		for (Map.Entry<Integer, Integer> herb : plugin.getHerbSack().getHerbs().entrySet())
		{
			if (herb.getValue() == 0)
			{
				continue;
			}
			int herbGp = itemManager.getItemPrice(herb.getKey()) * herb.getValue();
			totalGp += herbGp;
			tableComponent.addRow(herb.getValue().toString() + "x" + itemManager.getItemDefinition(herb.getKey()).getName().split(" ")[1], QuantityFormatter.quantityToStackSize(herbGp));
		}
		tableComponent.addRow("Total:", QuantityFormatter.quantityToStackSize(totalGp));
		panelComponent.getChildren().add(tableComponent);
		return panelComponent.render(graphics);
	}
}
