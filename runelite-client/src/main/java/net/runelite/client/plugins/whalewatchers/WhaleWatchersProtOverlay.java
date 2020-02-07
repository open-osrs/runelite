
/*
 * ******************************************************************************
 *  * Copyright (c) 2019 openosrs
 *  *  Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 *  *  If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 *  *  ST0NEWALL#9112
 *  *   openosrs Discord: https://discord.gg/Q7wFtCe
 *  *   openosrs website: https://openosrs.com
 *  *****************************************************************************
 */

package net.runelite.client.plugins.whalewatchers;

import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class WhaleWatchersProtOverlay extends Overlay {

	private final Client client;
	private final WhaleWatchersPlugin plugin;

	@Inject
	public WhaleWatchersProtOverlay(final Client client, final WhaleWatchersPlugin plugin) {
		this.client = client;
		this.plugin = plugin;
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.HIGH);
		setPosition(OverlayPosition.DYNAMIC);
	}

	@Override
	public Dimension render(Graphics2D graphics) {
		if (plugin.protectItemOverlay && plugin.isProtectItemWarning()) {
			Rectangle rectangle = new Rectangle();
			rectangle.setBounds(client.getCanvas().getBounds());
			rectangle.setLocation(client.getCanvas().getLocation());
			Stroke oldStroke = graphics.getStroke();
			if (plugin.isLessObnoxiousProtWarning()) {
				graphics.setStroke(new BasicStroke(3));
			} else {
				graphics.setStroke(new BasicStroke(10));
			}
			graphics.setColor(Color.RED);
			graphics.draw(rectangle);
			if (!plugin.isLessObnoxiousProtWarning()) {
				Font font = FontManager.getRunescapeBoldFont().deriveFont(Font.BOLD, 72);
				graphics.setFont(font);
				OverlayUtil.renderTextLocation(graphics, new Point((int) rectangle.getCenterX() - 50, font.getSize()), "Protect item prayer disabled!!!", Color.red);
			}
			graphics.setStroke(oldStroke);
		}
		return null;
	}
}
