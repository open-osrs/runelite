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
public class NightmarePrayerOverlay extends Overlay {
	private static final Color NOT_ACTIVATED_BACKGROUND_COLOR = new Color(150, 0, 0, 150);
	private final Client client;
	private final NightmarePlugin plugin;
	private final SpriteManager spriteManager;
	private final PanelComponent imagePanelComponent = new PanelComponent();
	private static final int NM_PRE_REGION = 15256;

	@Inject
	private NightmarePrayerOverlay(final Client client, final NightmarePlugin plugin, final SpriteManager spriteManager) {
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPriority(OverlayPriority.HIGH);
		setPosition(OverlayPosition.DYNAMIC);
		setPosition(OverlayPosition.BOTTOM_RIGHT);
		this.client = client;
		this.plugin = plugin;
		this.spriteManager = spriteManager;
	}

	public Dimension render(Graphics2D graphics) {
		imagePanelComponent.getChildren().clear();
		if ((plugin.isInFight()) && (plugin.getPrayAgainst() != null) && (plugin.getNm() != null)) {
			NightmareAttack attack = plugin.getPrayAgainst();
			BufferedImage prayerImage;
			prayerImage = getPrayerImage(attack);
			imagePanelComponent.setBackgroundColor(client
					.isPrayerActive(attack.getPrayer()) ? ComponentConstants.STANDARD_BACKGROUND_COLOR : NOT_ACTIVATED_BACKGROUND_COLOR);

			NPC nm = plugin.getNm();
			imagePanelComponent.getChildren().add(new ImageComponent(prayerImage));

			//imagePanelComponent.setPreferredLocation();


//            LocalPoint nmPoint = new LocalPoint(nm.getLocalLocation().getX() + 128 * (Objects.requireNonNull(nm.getTransformedDefinition()).getSize() - 1) / 2, nm.getLocalLocation().getY() + 128 * (nm.getTransformedDefinition().getSize() - 1) / 2);
//            net.runelite.api.Point nmLoc = Perspective.getCanvasImageLocation(client, nmPoint, prayerImage, 400);
//            if (nmLoc != null)
//            {
//                imagePanelComponent.setPreferredLocation(new java.awt.Point(nmLoc.getX(), nmLoc.getY()));
//            }
			return imagePanelComponent.render(graphics);
		}
//		else {
//			final ArrayList<Integer> regions = new ArrayList<>();
//			for (final int intValue : client.getMapRegions()) {
//				regions.add(intValue);
//			}
//			if (regions.contains(NM_PRE_REGION)) {
//				PanelComponent waiting = new PanelComponent();
//				for (final NPC npc : client.getNpcs()) {
//					if (npc.getName() != null && npc.getName().contains("The Nightmare")) {
//						if (npc.getId() == 9417) waiting.setBackgroundColor(Color.green);
//						if (npc.getId() == 9419) waiting.setBackgroundColor(Color.red);
//						if (npc.getId() == 9421) waiting.setBackgroundColor(Color.yellow);
//						if (npc.getId() == 9423) waiting.setBackgroundColor(Color.green);
//					}
//				}
//			}
//		}
		return null;
	}

	private BufferedImage getPrayerImage(NightmareAttack attack) {
		int prayerSpriteID = 127;
		if (attack == NightmareAttack.MELEE) prayerSpriteID = 129;
		else if (attack == NightmareAttack.RANGE) prayerSpriteID = 128;
		else prayerSpriteID = 127;
		//else if (attack == NightmareAttack.MAGIC) prayerSpriteID = 127;

		return spriteManager.getSprite(prayerSpriteID, 0);
	}
}
