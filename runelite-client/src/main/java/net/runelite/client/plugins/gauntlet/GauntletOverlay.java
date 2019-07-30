/*
 * Copyright (c) 2019, kThisIsCvpv <https://github.com/kThisIsCvpv>
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.client.plugins.gauntlet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Vertex;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.graphics.ModelOutlineRenderer;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import static net.runelite.client.util.ImageUtil.resizeImage;

public class GauntletOverlay extends Overlay
{
	private BufferedImage mage;
	private BufferedImage range;
	private static final int MAX_DISTANCE = 2400;
	private final Client client;
	private final GauntletPlugin plugin;
	private final ModelOutlineRenderer outlineRenderer;

	@Inject
	private GauntletOverlay(Client client, GauntletPlugin plugin, ModelOutlineRenderer outlineRenderer, SkillIconManager skillIconManager)
	{
		this.client = client;
		this.plugin = plugin;
		this.outlineRenderer = outlineRenderer;

		this.mage = skillIconManager.getSkillImage(Skill.MAGIC);
		this.range = skillIconManager.getSkillImage(Skill.RANGED);

		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.HIGH);
		setLayer(OverlayLayer.ABOVE_SCENE);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		// Save resources. There's nothing to render if the user is not in a raid.
		if (!plugin.startedGauntlet())
		{
			return null;
		}

		if (plugin.fightingBoss())
		{
			// This section handles the visuals when the player is in the boss room.
			// This section handles the projectile overlays.
			Set<ProjectileContainer> projectiles = plugin.getProjectiles();
			projectiles.forEach(projectile ->
			{
				BufferedImage icon = resizeImage(projectile.getImage(), plugin.getIconSize(), plugin.getIconSize());
				Color color = projectile.getColor();

				if (icon == null)
				{
					return;
				}

				Polygon polygon = boundProjectile(projectile.getProjectile());
				if (polygon == null)
				{
					int x = (int) projectile.getProjectile().getX();
					int y = (int) projectile.getProjectile().getY();

					LocalPoint point = new LocalPoint(x, y);
					Point loc = Perspective.getCanvasImageLocation(client, point, icon, -(int) projectile.getProjectile().getZ());

					if (loc == null)
					{
						return;
					}

					graphics.drawImage(icon, loc.getX(), loc.getY(), null);
				}
				else
				{
					graphics.setColor(color);
					graphics.draw(polygon);
					graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 50));
					graphics.fill(polygon);

					Rectangle bounds = polygon.getBounds();
					int x = (int) bounds.getCenterX() - (icon.getWidth() / 2);
					int y = (int) bounds.getCenterY() - (icon.getHeight() / 2);
					graphics.drawImage(icon, x, y, null);
				}
			});
			projectiles.removeIf(proj -> proj.getProjectile().getRemainingCycles() <= 0);

			plugin.getTornado().forEach(tornado ->
			{
				if (plugin.overlayTornadoes)
				{
					String textOverlay = Integer.toString(plugin.tornadoTicks);
					Point textLoc = Perspective.getCanvasTextLocation(client, graphics, tornado.getLocalLocation(), textOverlay, 0);

					if (textLoc == null)
					{
						return;
					}

					Font oldFont = graphics.getFont();
					graphics.setFont(new Font("Arial", Font.BOLD, 20));
					Point pointShadow = new Point(textLoc.getX() + 1, textLoc.getY() + 1);
					OverlayUtil.renderTextLocation(graphics, pointShadow, textOverlay, Color.BLACK);
					OverlayUtil.renderTextLocation(graphics, textLoc, textOverlay, Color.YELLOW);
					graphics.setFont(oldFont);
				}
			});

			if (plugin.getHunleff() != null)
			{
				final NPC hunleff = plugin.getHunleff();
				final LocalPoint point = hunleff.getLocalLocation();

				if (plugin.overlayBoss)
				{
					Polygon polygon = hunleff.getConvexHull();

					if (polygon == null)
					{
						return null;
					}

					Color color;
					switch (plugin.currentPhase)
					{
						case MAGIC:
							color = Color.CYAN;
							break;
						case RANGE:
							color = Color.GREEN;
							break;
						default:
							color = Color.WHITE;
							break;
					}
					outlineRenderer.drawOutline(hunleff, 2, color);
				}

				if (plugin.overlayBossPrayer)
				{
					BufferedImage attackIcon = null;

					switch (plugin.currentPhase)
					{
						case MAGIC:
							attackIcon = resizeImage(mage, plugin.getIconSize(), plugin.getIconSize());
							break;
						case RANGE:
							attackIcon = resizeImage(range, plugin.getIconSize(), plugin.getIconSize());
							break;
						default:
							break;
					}

					if (attackIcon == null)
					{
						return null;
					}

					Point imageLoc = Perspective.getCanvasImageLocation(client, point, attackIcon, hunleff.getLogicalHeight() / 2);

					if (imageLoc == null)
					{
						return null;
					}

					graphics.drawImage(attackIcon, imageLoc.getX(), imageLoc.getY(), null);
				}

				// This section handles any text overlays.
				String textOverlay = "";

				// Handles the counter for the boss.
				if (plugin.countBossAttacks)
				{
					textOverlay = Integer.toString(plugin.bossCounter);
				}

				// Handles the counter for the player.
				if (plugin.countPlayerAttacks)
				{
					if (textOverlay.length() > 0)
					{
						textOverlay += " | ";
					}
					textOverlay += Integer.toString(plugin.playerCounter);
				}

				// Handles drawing the text onto the boss.
				if (textOverlay.length() > 0)
				{
					Point textLoc = Perspective.getCanvasTextLocation(client, graphics, point, textOverlay, hunleff.getLogicalHeight() / 2);

					if (textLoc == null)
					{
						return null;
					}

					textLoc = new Point(textLoc.getX(), textLoc.getY() + 35);

					Font oldFont = graphics.getFont();

					graphics.setFont(new Font("Arial", Font.BOLD, 20));
					Point pointShadow = new Point(textLoc.getX() + 1, textLoc.getY() + 1);

					OverlayUtil.renderTextLocation(graphics, pointShadow, textOverlay, Color.BLACK);
					OverlayUtil.renderTextLocation(graphics, textLoc, textOverlay, Color.CYAN);

					graphics.setFont(oldFont);
				}
			}
		}
		else
		{
			// This section overlays all resources.
			LocalPoint playerLocation = client.getLocalPlayer().getLocalLocation();

			Set<ObjectContainer> resources = plugin.getResources();
			resources.forEach(object ->
			{
				if (object.getGameObject().getLocalLocation().distanceTo(playerLocation) < MAX_DISTANCE)
				{

					// Don't use Convex Hull click box. As the room start to fill up, your FPS will dip.
					Polygon polygon = object.getGameObject().getConvexHull();

					if (polygon != null)
					{
						// This section will highlight the resource with color.
						if (plugin.highlightResourcesColor)
						{
							Color color = Color.YELLOW;

							outlineRenderer.drawOutline(object.getGameObject(), 2, color);
						}

						// This section will overlay the resource with an icon.
						if (plugin.highlightResourcesIcons)
						{
							BufferedImage icon = object.getImage();

							if (icon != null)
							{
								Rectangle bounds = polygon.getBounds();
								int startX = (int) bounds.getCenterX() - (icon.getWidth() / 2);
								int startY = (int) bounds.getCenterY() - (icon.getHeight() / 2);
								graphics.drawImage(icon, startX, startY, null);
							}
						}
					}
				}
			});

		}
		return null;
	}

	private Polygon boundProjectile(Projectile proj)
	{
		if (proj == null || proj.getModel() == null)
		{
			return null;
		}

		Model model = proj.getModel();
		LocalPoint point = new LocalPoint((int) proj.getX(), (int) proj.getY());
		int tileHeight = Perspective.getTileHeight(client, point, client.getPlane());

		double angle = Math.atan(proj.getVelocityY() / proj.getVelocityX());
		angle = Math.toDegrees(angle) + (proj.getVelocityX() < 0 ? 180 : 0);
		angle = angle < 0 ? angle + 360 : angle;
		angle = 360 - angle - 90;

		double ori = angle * (512d / 90d);
		ori = ori < 0 ? ori + 2048 : ori;

		int orientation = (int) Math.round(ori);

		List<Vertex> vertices = model.getVertices();
		for (int i = 0; i < vertices.size(); ++i)
		{
			vertices.set(i, vertices.get(i).rotate(orientation));
		}

		List<Point> list = new ArrayList<>();

		for (Vertex vertex : vertices)
		{
			final Point localToCanvas = Perspective.localToCanvas(client, point.getX() - vertex.getX(), point.getY() - vertex.getZ(), tileHeight + vertex.getY() + (int) proj.getZ());
			if (localToCanvas != null)
			{
				list.add(localToCanvas);
			}
		}

		final List<Point> convexHull = Jarvis.convexHull(list);
		if (convexHull == null)
		{
			return null;
		}

		final Polygon polygon = new Polygon();
		for (final Point hullPoint : convexHull)
		{
			polygon.addPoint(hullPoint.getX(), hullPoint.getY());
		}

		return polygon;
	}
}
