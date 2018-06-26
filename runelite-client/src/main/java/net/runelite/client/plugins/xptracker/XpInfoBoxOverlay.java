package net.runelite.client.plugins.xptracker;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

public class XpInfoBoxOverlay extends Overlay
{
	private final PanelComponent panel = new PanelComponent();
	private final XpTrackerPlugin plugin;
	private final Client client;
	private final Skill skill;
	private final BufferedImage icon;

	public XpInfoBoxOverlay(XpTrackerPlugin plugin, Client client, Skill skill, BufferedImage icon)
	{
		this.plugin = plugin;
		this.client = client;
		this.skill = skill;
		this.icon = icon;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		XpSnapshotSingle snapshot = plugin.getSkillSnapshot(skill);
		panel.getChildren().clear();

		ImageComponent iconComponent = new ImageComponent(icon);
		panel.getChildren().add(iconComponent);

		LineComponent xpLeft = LineComponent.builder()
			.left("Xp Left")
			.right(String.valueOf(snapshot.getXpRemainingToGoal()))
			.build();
		panel.getChildren().add(xpLeft);

		LineComponent xpHour = LineComponent.builder()
			.left("Xp/Hour")
			.right(String.valueOf(snapshot.getXpPerHour()))
			.build();
		panel.getChildren().add(xpHour);


		return panel.render(graphics);
	}
}
