/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/
package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Varbits;
import net.runelite.api.WorldType;
import net.runelite.client.game.ClanManager;
import net.runelite.client.game.HiscoreManager;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.PvPUtil;

@Slf4j
public class PlayerIndicatorsOverlay extends Overlay
{
	private static final int ACTOR_OVERHEAD_TEXT_MARGIN = 40;
	private static final int ACTOR_HORIZONTAL_TEXT_MARGIN = 10;
	private PlayerIndicatorsPlugin plugin;

	private PlayerIndicatorsService playerIndicatorsService;
	private final BufferedImage agilityIcon = ImageUtil.getResourceStreamFromClass(PlayerIndicatorsPlugin.class,
		"agility.png");
	private final BufferedImage noAgilityIcon = ImageUtil.getResourceStreamFromClass(PlayerIndicatorsPlugin.class,
		"no-agility.png");
	private final BufferedImage skullIcon = ImageUtil.getResourceStreamFromClass(PlayerIndicatorsPlugin.class,
		"skull.png");
	@Inject
	private Client client;
	@Inject
	private ItemManager itemManager;
	@Inject
	private ClanManager clanManager;
	@Inject
	private HiscoreManager hiscoreManager;

	@Inject
	public PlayerIndicatorsOverlay(PlayerIndicatorsPlugin plugin, PlayerIndicatorsService playerIndicatorsService,
		HiscoreManager hiscoreManager)
	{
		this.plugin = plugin;
		this.playerIndicatorsService = playerIndicatorsService;
		this.hiscoreManager = hiscoreManager;
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);

	}

	@Override
	public Dimension render(Graphics2D graphics)
	{

		playerIndicatorsService.forEachPlayer((player, color) -> renderPlayerOverlay(graphics, player));
		return null;
	}

	public Predicate<Player> friends = (player) -> client.isFriended(player.getName(), false);

	public Predicate<Player> self = (player) -> client.getLocalPlayer().equals(player);

	public Predicate<Player> clan = Player::isClanMember;

	public Predicate<Player> team = (player) -> (client.getLocalPlayer().getTeam() != 0 &&
		client.getLocalPlayer().getTeam() == player.getTeam());

	public Predicate<Player> target = (player) -> PvPUtil.isAttackable(client, player);

	public Predicate<Player> other = Objects::nonNull;


	private void renderPlayerOverlay(Graphics2D graphics, Player actor)
	{

		//final PlayerNameLocation drawPlayerNamesConfig = plugin.getPlayerNamePosition();

			if (this.self.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.SELF);
				return;
			}

			if (this.friends.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.FRIEND);
				return;
			}

			if (this.clan.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.CLAN);
				return;
			}

			if (this.team.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.TEAM);
				return;
			}
			if (this.target.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.TARGET);
				return;
			}
			if (this.other.test(actor))
			{
				drawSceneOverlays(graphics, actor, PlayerIndicatorsPlugin.PlayerRelation.OTHER);
			}
	}



	private void drawSceneOverlays(Graphics2D graphics, Player actor, PlayerIndicatorsPlugin.PlayerRelation relation)
	{
		final HashMap<PlayerIndicatorsPlugin.PlayerRelation, Object[]> locationHashMap = plugin.getLocationHashMap();
		if (!locationHashMap.containsKey(relation))
		{
			return;
		}
		final List indicationLocations = Arrays.asList(	locationHashMap.get(relation));
		final Color color = plugin.getRelationColorHashMap().get(relation);

		if (indicationLocations.contains(PlayerIndicationLocation.ABOVE_HEAD))
		{
			String name = actor.getName();
			final boolean skulls = plugin.isPlayerSkull();
			final int zOffset = actor.getLogicalHeight() + ACTOR_OVERHEAD_TEXT_MARGIN;
			Point textLocation = actor.getCanvasTextLocation(graphics, name, zOffset);
			if (plugin.isShowCombatLevel())
			{
				name = name + " (" + String.valueOf(actor.getCombatLevel()) + ")";
			}

			if (plugin.isPlayerSkull() && actor.getSkullIcon() != null)
			{
				int x = graphics.getFontMetrics().stringWidth(name);
				int y = graphics.getFontMetrics().getHeight();
				OverlayUtil.renderActorTextAndImage(graphics, actor, name, color,
					ImageUtil.resizeImage(skullIcon, y, y), 0, x);
			}
			else
			{
				OverlayUtil.renderActorTextOverlay(graphics, actor, name, color);
			}
		}
		if (Arrays.asList(locationHashMap.get(relation)).contains(PlayerIndicationLocation.HULL))
		{
			if (actor.getConvexHull() == null)
			{
				return;
			}
			OverlayUtil.renderPolygon(graphics, actor.getConvexHull(), color);
		}

		if (Arrays.asList(locationHashMap.get(relation)).contains(PlayerIndicationLocation.TILE))
		{
			final Polygon poly = actor.getCanvasTilePoly();
			if (poly != null)
			{
				OverlayUtil.renderPolygon(graphics, poly, color);
			}
		}
	}

	private boolean checkWildy()
	{
		return client.getVar(Varbits.IN_WILDERNESS) == 1 || WorldType.isAllPvpWorld(client.getWorldType());
	}



}
