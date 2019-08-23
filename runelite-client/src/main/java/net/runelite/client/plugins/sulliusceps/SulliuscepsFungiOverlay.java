package net.runelite.client.plugins.sulliusceps;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.ui.overlay.components.table.TableAlignment;
import net.runelite.client.ui.overlay.components.table.TableComponent;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class SulliuscepsFungiOverlay extends Overlay
{

	private final SulliuscepsPlugin plugin;
	private final SulliuscepSession sulliuscepSession;
	private final PanelComponent panelComponent = new PanelComponent();

	@Inject
	SulliuscepsFungiOverlay(SulliuscepsPlugin plugin, SulliuscepSession sulliuscepSession)
	{
		setPosition(OverlayPosition.TOP_LEFT);
		this.plugin = plugin;
		this.sulliuscepSession = sulliuscepSession;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!plugin.isInRegion())
		{
			return null;
		}

		SulliuscepSession session = sulliuscepSession;

		int mushroomsFound = session.getMushroomsFound();
		int mortMyreFungusFound = session.getMortMyreFungusFound();
		int sulliuscepCapsFound = session.getSulliuscepCapsFound();

		if (mushroomsFound == 0 && mortMyreFungusFound == 0 && sulliuscepCapsFound == 0)
		{
			return null;
		}

		panelComponent.getChildren().clear();
		panelComponent.getChildren().add(TitleComponent.builder().text("Fungi collected").build());

		TableComponent tableComponent = new TableComponent();
		tableComponent.setColumnAlignments(TableAlignment.LEFT, TableAlignment.RIGHT);

		if (mushroomsFound > 0)
		{
			tableComponent.addRow("Mushrooms:", Integer.toString(mushroomsFound));
		}

		if (mortMyreFungusFound > 0)
		{
			tableComponent.addRow("Mort myre fungi:", Integer.toString(mortMyreFungusFound));
		}

		if (sulliuscepCapsFound > 0)
		{
			tableComponent.addRow("Sulliuscep caps:", Integer.toString(sulliuscepCapsFound));
		}

		panelComponent.getChildren().add(tableComponent);

		return panelComponent.render(graphics);
	}
}
