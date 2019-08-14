/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019, Jordan Atwood <nightfirecat@protonmail.com>
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
 *
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
package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
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
public class PlayerIndicatorsOverlay extends Overlay implements Observer
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


	private HashMap<String, List<PlayerIndicationLocation>> locationMap = new HashMap<>();

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

	private Predicate<Player> friends = (player) -> client.isFriended(player.getName(), false)
			&& (locationMap.get("Friend").contains(PlayerIndicationLocation.ABOVE_HEAD)
			|| locationMap.get("Friend").contains(PlayerIndicationLocation.HULL));

	private Predicate<Player> self = (player) -> client.getLocalPlayer().equals(player)
			&& (locationMap.get("Self").contains(PlayerIndicationLocation.ABOVE_HEAD)
			|| locationMap.get("Self").contains(PlayerIndicationLocation.HULL));

	private Predicate<Player> clan = (player) -> player.isClanMember()
			&& (locationMap.get("Clan").contains(PlayerIndicationLocation.ABOVE_HEAD)
			|| locationMap.get("Clan").contains(PlayerIndicationLocation.HULL));

	private Predicate<Player> team = (player) -> client.getLocalPlayer().getTeam() == player.getTeam()
			&& (locationMap.get("Team").contains(PlayerIndicationLocation.ABOVE_HEAD)
			|| locationMap.get("Team").contains(PlayerIndicationLocation.HULL));

	private Predicate<Player> target = (player) -> PvPUtil.isAttackable(client, player)
			&& (locationMap.get("Target").contains(PlayerIndicationLocation.ABOVE_HEAD)
			|| locationMap.get("Target").contains(PlayerIndicationLocation.HULL));

	private Predicate<Player> other = (player) -> locationMap.get("Other").contains(PlayerIndicationLocation.ABOVE_HEAD)
		|| locationMap.get("Other").contains(PlayerIndicationLocation.HULL);

	private void renderPlayerOverlay(Graphics2D graphics, Player actor)
	{

		final PlayerNameLocation drawPlayerNamesConfig = plugin.getPlayerNamePosition();


		for (Map.Entry<String, List<PlayerIndicationLocation>> entry : locationMap.entrySet())
		{
			String key = entry.getKey();
			List<PlayerIndicationLocation> playerIndicationLocations = entry.getValue();
			String name = actor.getName();
			final boolean skulls = plugin.isPlayerSkull();
			final int zOffset = actor.getLogicalHeight() + ACTOR_OVERHEAD_TEXT_MARGIN;
			Point textLocation = actor.getCanvasTextLocation(graphics, name, zOffset);
			if (plugin.isShowCombatLevel())
			{
				name = name + " (" + String.valueOf(actor.getCombatLevel()) + ")";
			}
			if (this.self.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getSelfColor());
				return;
			}

			if (this.friends.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getFriendsColor());
				return;
			}

			if (this.clan.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getGetClanMemberColor());
				return;
			}

			if (this.team.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getGetTeamMemberColor());
				return;
			}
			if (this.target.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getGetTargetColor());
				return;
			}
			if (this.other.test(actor))
			{
				drawFriendOverlay(graphics, actor, name, plugin.getOtherColor());
				return;
			}

//				}
//				if (actor.getSkullIcon() != null && plugin.isPlayerSkull() && actor.getSkullIcon() == SkullIcon.SKULL)
//				{
//					int width = graphics.getFontMetrics().stringWidth(name);
//					int height = graphics.getFontMetrics().getHeight();
//					if (plugin.getSkullLocation().equals(PlayerIndicatorsPlugin.MinimapSkullLocations.AFTER_NAME))
//					{
//						OverlayUtil.renderImageLocation(graphics, new Point(textLocation.getX()
//								+ width, textLocation.getY() - height),
//							ImageUtil.resizeImage(skullIcon, height, height));
//					}
//					else
//					{
//						OverlayUtil.renderImageLocation(graphics, new Point(textLocation.getX(),
//								textLocation.getY() - height),
//							ImageUtil.resizeImage(skullIcon, height, height));
//						textLocation = new Point(textLocation.getX() + skullIcon.getWidth(),
//							textLocation.getY());
//					}
//				}
//			}

		}
	}

	private void drawFriendOverlay(Graphics2D graphics, Player actor, String name, Color color)
	{
		if (locationMap.get(name).contains(PlayerIndicationLocation.ABOVE_HEAD))
		{
			if (plugin.isPlayerSkull() && actor.getSkullIcon() != null)
			{
				int x = graphics.getFontMetrics().stringWidth(name);
				int y = graphics.getFontMetrics().getHeight();
				OverlayUtil.renderActorTextAndImage(graphics, actor, name, color,
					ImageUtil.resizeImage(skullIcon, y, y), 0, x);
			}
			else
			{
				OverlayUtil.renderActorOverlay(graphics, actor, name, color);
			}
		}
		if (locationMap.get(name).contains(PlayerIndicationLocation.HULL))
		{
			OverlayUtil.renderPolygon(graphics, actor.getConvexHull(), color);
		}
	}


//		BiPredicate<Player, String> self  = (player, s) ->
//			s.equals("Self") && (client.getLocalPlayer().equals(player)
//				&& locationMap.get("Self").contains(PlayerIndicationLocation.ABOVE_HEAD)
//				|| locationMap.get("Self").contains(PlayerIndicationLocation.HULL));
//
//		BiPredicate<Player, String> team  = (player, s) ->
//			s.equals("Team") && (client.getLocalPlayer().getTeam() == player.getTeam()
//				&& locationMap.get("Team").contains(PlayerIndicationLocation.ABOVE_HEAD)
//				|| locationMap.get("Team").contains(PlayerIndicationLocation.HULL));
//
//		BiPredicate<Player, String> clan  = (player, s) ->
//			s.equals("Clan") && (player.isClanMember()
//				&& locationMap.get("Clan").contains(PlayerIndicationLocation.ABOVE_HEAD)
//				|| locationMap.get("Clan").contains(PlayerIndicationLocation.HULL));
//
//		BiPredicate<Player, String> others  = (player, s) ->
//			s.equals("Other") && (client.getLocalPlayer().equals(player)
//				&& locationMap.get("Other").contains(PlayerIndicationLocation.ABOVE_HEAD)
//				|| locationMap.get("Other").contains(PlayerIndicationLocation.HULL));
//
//		BiPredicate<Player, String> targets  = (player, s) ->
//			s.equals("Target") && (PvPUtil.isAttackable(client, player)
//				&& locationMap.get("Target").contains(PlayerIndicationLocation.ABOVE_HEAD)
//				|| locationMap.get("Target").contains(PlayerIndicationLocation.HULL));
//
//
//		if (friends.test(actor))
//
//
//		final PlayerNameLocation drawPlayerNamesConfig = plugin.getPlayerNamePosition();
//		if (drawPlayerNamesConfig == PlayerNameLocation.DISABLED)
//		{
//			return;
//		}
//
//		final int zOffset;
//		switch (drawPlayerNamesConfig)
//		{
//			case MODEL_CENTER:
//			case MODEL_RIGHT:
//				zOffset = actor.getLogicalHeight() / 2;
//				break;
//			default:
//				zOffset = actor.getLogicalHeight() + ACTOR_OVERHEAD_TEXT_MARGIN;
//		}
//
//		String name = Text.sanitize(actor.getName());
//
//
//
//			final ClanMemberRank rank = clanManager.getRank(name);
//
//			if (rank != ClanMemberRank.UNRANKED)
//			{
//				final BufferedImage clanchatImage = clanManager.getClanImage(rank);
//
//				if (clanchatImage != null)
//				{
//					final int clanImageWidth = clanchatImage.getWidth();
//					final int clanImageTextMargin;
//					final int clanImageNegativeMargin;
//
//					if (drawPlayerNamesConfig == PlayerNameLocation.MODEL_RIGHT)
//					{
//						clanImageTextMargin = clanImageWidth;
//						clanImageNegativeMargin = 0;
//					}
//					else
//					{
//						clanImageTextMargin = clanImageWidth / 2;
//						clanImageNegativeMargin = clanImageWidth / 2;
//					}
//
//					final int textHeight = graphics.getFontMetrics().getHeight() - graphics.getFontMetrics().getMaxDescent();
//					final Point imageLocation = new Point(textLocation.getX() - clanImageNegativeMargin - 1, textLocation.getY() - textHeight / 2 - clanchatImage.getHeight() / 2);
//					OverlayUtil.renderImageLocation(graphics, imageLocation, clanchatImage);
//
//					// move text
//					textLocation = new Point(textLocation.getX() + clanImageTextMargin, textLocation.getY());
//				}
//			}
//
//		String tag;
//		String prefix = "tag_";
//		if (FriendTaggingPlugin.taggedFriends.containsKey(prefix + name.trim().toLowerCase()))
//		{
//			tag = " [" + FriendTaggingPlugin.taggedFriends.get(prefix + name.trim().toLowerCase()) + "] ";
//			name += tag;
//		}
//
//		if (plugin.isHighlightCallers() && playerIndicatorsPlugin.isCaller(actor))
//		{
//			name = "[C] " + name;
//		}
//		if (plugin.isShowCombatLevel())
//		{
//			name += " (" + actor.getCombatLevel() + ")";
//		}
//		if (plugin.isTargetRisk() && PvPUtil.isAttackable(client, actor) && actor.getPlayerAppearance() != null)
//		{
//			long totalValue = 0;
//			int newValue;
//			StringBuilder stringBuilder = new StringBuilder(" ");
//			for (KitType kitType : KitType.values())
//			{
//				if (kitType == KitType.RING || kitType == KitType.AMMUNITION)
//				{
//					continue;
//				}
//
//				ItemDefinition itemComposition = itemManager.getItemDefinition(actor.getPlayerAppearance().getEquipmentId(kitType));
//				if (itemComposition != null && itemComposition.getName() != null)
//				{
//					totalValue = totalValue + itemComposition.getPrice();
//				}
//			}
//			newValue = (int) (totalValue / 1000);
//			if (newValue != 0)
//			{
//				stringBuilder.append("(").append(formatNumber(newValue)).append("K)");
//				name = name + stringBuilder;
//			}
//		}
//		if (plugin.isUnchargedGlory() && actor.getPlayerAppearance() != null)
//		{
//			ItemDefinition itemComposition = itemManager.getItemDefinition(actor.getPlayerAppearance().getEquipmentId(KitType.AMULET));
//			if (itemComposition != null && itemComposition.getId() == 1704) //1704 is uncharged glory, to be certain
//			{
//				name = name + " cGLORY";
//			}
//		}
//
//
//
//		if (plugin.isShowAgilityLevel() && checkWildy())
//		{
//			final HiscoreResult hiscoreResult = hiscoreManager.lookupAsync(actor.getName(), HiscoreEndpoint.NORMAL);
//			if (hiscoreResult != null)
//			{
//				int level = hiscoreResult.getSkill(HiscoreSkill.AGILITY).getLevel();
//				if (plugin.getAgilityFormat() == PlayerIndicatorsPlugin.AgilityFormats.ICONS)
//				{
//					int width = graphics.getFontMetrics().stringWidth(name);
//					int height = graphics.getFontMetrics().getHeight();
//					if (level >= plugin.getAgilityFirstThreshold())
//					{
//						OverlayUtil.renderImageLocation(graphics,
//							new Point(textLocation.getX() + 5 + width,
//								textLocation.getY() - height),
//							ImageUtil.resizeImage(agilityIcon, height, height));
//					}
//					if (level >= plugin.getAgilitySecondThreshold())
//					{
//						OverlayUtil.renderImageLocation(graphics,
//							new Point(textLocation.getX() + agilityIcon.getWidth() + width,
//								textLocation.getY() - height),
//							ImageUtil.resizeImage(agilityIcon, height, height));
//					}
//					if (level < plugin.getAgilityFirstThreshold())
//					{
//						OverlayUtil.renderImageLocation(graphics,
//							new Point(textLocation.getX() + 5 + width,
//								textLocation.getY() - height),
//							ImageUtil.resizeImage(noAgilityIcon, height, height));
//					}
//				}
//				else
//				{
//					name += " " + level;
//
//					int width = graphics.getFontMetrics().stringWidth(name);
//					int height = graphics.getFontMetrics().getHeight();
//					OverlayUtil.renderImageLocation(graphics,
//						new Point(textLocation.getX() + 5 + width,
//							textLocation.getY() - height),
//						ImageUtil.resizeImage(agilityIcon, height, height));
//				}
//			}
//		}
//
//		OverlayUtil.renderTextLocation(graphics, textLocation, name, color);
//	}


	private boolean checkWildy()
	{
		return client.getVar(Varbits.IN_WILDERNESS) == 1 || WorldType.isAllPvpWorld(client.getWorldType());
	}

	@Override
	public void update(Observable o, Object arg)
	{
		log.info(o.toString() + " updated config");
		this.locationMap.clear();
		((HashMap<String, List<PlayerIndicationLocation>>) arg).forEach((s, value) ->
		{
			if (value.contains(PlayerIndicationLocation.ABOVE_HEAD) || value.contains(PlayerIndicationLocation.HULL))
			{
				this.locationMap.put(s, value);
			}
		});
	}

}
