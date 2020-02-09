package net.runelite.client.plugins.nightmare;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.ComponentConstants;
import net.runelite.client.ui.overlay.components.ImageComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

@Singleton
public class NightmarePrayerOverlay extends Overlay
{
	private static final Color NOT_ACTIVATED_BACKGROUND_COLOR = new Color(150, 0, 0, 150);
	private final Client client;
	private final NightmarePlugin plugin;
	private final SpriteManager spriteManager;
	private final PanelComponent imagePanelComponent = new PanelComponent();
	private static final int NM_PRE_REGION = 15256;

	@Inject
	private NightmarePrayerOverlay(final Client client, final NightmarePlugin plugin, final SpriteManager spriteManager)
	{
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPriority(OverlayPriority.HIGH);
		setPosition(OverlayPosition.DYNAMIC);
		setPosition(OverlayPosition.BOTTOM_RIGHT);
		this.client = client;
		this.plugin = plugin;
		this.spriteManager = spriteManager;
	}

	public Dimension render(Graphics2D graphics)
	{
		imagePanelComponent.getChildren().clear();

		if (!plugin.isPrayerHelper())
		{
			return null;
		}

		if (plugin.isInFight() && plugin.getPendingNightmareAttack() != null && plugin.getNm() != null)
		{
			NightmareAttack attack = plugin.getPendingNightmareAttack();
			BufferedImage prayerImage;
			prayerImage = getPrayerImage(attack);
			imagePanelComponent.setBackgroundColor(client.isPrayerActive(attack.getPrayer()) ? ComponentConstants.STANDARD_BACKGROUND_COLOR : NOT_ACTIVATED_BACKGROUND_COLOR);

			NPC nm = plugin.getNm();
			imagePanelComponent.getChildren().add(new ImageComponent(prayerImage));

			return imagePanelComponent.render(graphics);
		}
		return null;
	}

	private BufferedImage getPrayerImage(NightmareAttack attack)
	{
		return spriteManager.getSprite(attack.getPrayerSpriteId(), 0);
	}
}
