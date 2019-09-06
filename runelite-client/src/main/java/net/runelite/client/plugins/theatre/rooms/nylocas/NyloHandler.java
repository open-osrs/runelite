package net.runelite.client.plugins.theatre.rooms.nylocas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.ItemDefinition;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.theatre.RoomHandler;
import net.runelite.client.plugins.theatre.TheatreConstant;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import net.runelite.client.plugins.theatre.TheatreRoom;
import org.apache.commons.lang3.ObjectUtils;

public class NyloHandler extends RoomHandler
{
	final List<NPC> waveSpawns = new ArrayList<>();
	final List<NPC> waveAgros = new ArrayList<>();
	public long startTime = 0L;
	int startTick = 0;

	private final MenuManager menuManager;
	private final ItemManager itemManager;
	@Getter(AccessLevel.PUBLIC)
	private Map<NPC, Integer> pillars = new HashMap<>();
	@Getter(AccessLevel.PUBLIC)
	private Map<NPC, Integer> spiders = new HashMap<>();
	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int wave = 0;
	private NyloOverlay overlay = null;
	private NyloPredictor predictor = null;
	private int attackStyle = 0; // 1 = 2h range, 2 = melee 3= mage 4= 1h range

	public NyloHandler(final Client client, final TheatrePlugin plugin, final MenuManager menuManager, final ItemManager itemManager)
	{
		super(client, plugin);
		this.itemManager = itemManager;
		this.menuManager = menuManager;
	}

	@Override
	public void onStart()
	{
		if (this.plugin.getRoom() == TheatreRoom.NYLOCAS)
		{
			return;
		}

		this.reset();

		this.plugin.setRoom(TheatreRoom.NYLOCAS);
		if (overlay == null && plugin.isShowNylocasAmount())
		{
			overlay = new NyloOverlay(client, plugin, this);
			plugin.getOverlayManager().add(overlay);
		}

		this.startTime = System.currentTimeMillis();
		this.startTick = this.client.getTickCount();

	}

	@Override
	public void onStop()
	{
		this.reset();

		this.plugin.setRoom(TheatreRoom.UNKNOWN);

		if (overlay != null)
		{
			plugin.getOverlayManager().remove(overlay);
			overlay = null;
		}

		this.predictor = null;

		long elapsedTime = System.currentTimeMillis() - this.startTime;
		long seconds = elapsedTime / 1000L;

		long minutes = seconds / 60L;
		seconds = seconds % 60;

		if (this.startTime != 0 && plugin.isExtraTimers())
		{
			this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Wave 'The Nylocas - Waves' " +
				"completed! Duration: <col=ff0000>" + minutes + ":" + twoDigitString(seconds), null);
		}
	}

	private void reset()
	{
		this.pillars.clear();
		this.spiders.clear();

		this.wave = 0;

		this.predictor = new NyloPredictor(client, this);
		this.waveSpawns.clear();
		this.waveAgros.clear();
		this.predictor.reset();
		removeMenuSwaps();

	}

	private void removeMenuSwaps()
	{
		menuManager.removeHiddenEntry("Attack", "Nylocas Hagios");
		menuManager.removeHiddenEntry("Attack", "Nylocas Ischyros");
		menuManager.removeHiddenEntry("Attack", "Nylocas Toxobolos");
	}

	public void onConfigChanged()
	{
		if (plugin.getRoom() != TheatreRoom.NYLOCAS)
		{
			return;
		}

		if (overlay == null && plugin.isShowNylocasAmount())
		{
			overlay = new NyloOverlay(client, plugin, this);
			plugin.getOverlayManager().add(overlay);
		}
		else if (overlay != null && !plugin.isShowNylocasAmount())
		{
			plugin.getOverlayManager().remove(overlay);
			overlay = null;
		}
	}

	private Color healthColorCode(int health)
	{
		health = Math.max(health, 0);
		health = Math.min(health, 100);

		double rMod = 130.0 * health / 100.0;
		double gMod = 255.0 * health / 100.0;
		double bMod = 125.0 * health / 100.0;

		return new Color((int) (255 - rMod), (int) (0 + gMod), (int) (0 + bMod));
	}

	public void render(Graphics2D graphics)
	{
		if (plugin.isShowNyloPillarHealth())
		{
			for (Map.Entry<NPC, Integer> pillars : pillars.entrySet())
			{
				final int health = pillars.getValue();
				final String healthStr = health + "%";
				WorldPoint p = pillars.getKey().getWorldLocation();
				LocalPoint lp = LocalPoint.fromWorld(client, p.getX() + 1, p.getY() + 1);

				Color c = this.healthColorCode(health);
				Point canvasPoint = null;
				if (lp != null)
				{
					canvasPoint = Perspective.localToCanvas(client, lp, client.getPlane(), 65);
				}
				renderTextLocation(graphics, healthStr, 13, Font.BOLD, c, canvasPoint);
			}
		}

		switch (plugin.getShowNylocasExplosions())
		{
			case TILE:
				for (Map.Entry<NPC, Integer> spiders : spiders.entrySet())
				{
					int ticksLeft = spiders.getValue();
					if (ticksLeft > -1 && ticksLeft < 6)
					{
						Color color = new Color(255, 255, 0, 180);
						int outlineWidth = 2;
						int outlineAlpha = 150;
						renderNpcOverlay(graphics, spiders.getKey(), color, outlineWidth, outlineAlpha, 15);
					}
				}
				break;
			case TIMER:
				for (NPC npc : spiders.keySet())
				{
					int ticksLeft = spiders.get(npc);
					if (ticksLeft > -1 && ticksLeft < 15)
					{
						String str = Integer.toString(ticksLeft);
						LocalPoint lp = npc.getLocalLocation();
						Point point = Perspective.getCanvasTextLocation(client, graphics, lp, str, 0);
						renderTextLocation(graphics, str, 13, Font.BOLD, this.healthColorCode(ticksLeft), point);
					}
				}
				break;
			case NONE:
				break;
		}

		Set<NPC> toHighlight = new HashSet<>();

		if (plugin.isHighlightNyloAgros())
		{
			for (NPC npc : new ArrayList<>(this.waveAgros))
			{
				try
				{
					if (npc.getHealthRatio() == 0 || npc.isDead())
					{
						this.waveAgros.remove(npc);
						continue;
					}

					toHighlight.add(npc);
				}
				catch (Exception ex)
				{

				}
			}
		}

		for (NPC npc : toHighlight)
		{
			try
			{
				Polygon objectClickbox = npc.getConvexHull();

				Color color;
				String name = npc.getName() != null ? npc.getName() : "";

				if (name.contains("Hagios"))
				{
					color = Color.CYAN;
				}
				else if (name.contains("Toxobolos"))
				{
					color = Color.GREEN;
				}
				else
				{
					color = Color.LIGHT_GRAY;
				}

				renderPoly(graphics, color, objectClickbox);
			}
			catch (Exception ex)
			{

			}
		}
	}

	public void onNpcSpawned(NpcSpawned event)
	{
		NPC npc = event.getNpc();
		int id = npc.getId();

		if (id == TheatreConstant.NPC_ID_NYLOCAS_PILLAR)
		{
			this.onStart();
			this.pillars.put(npc, 100);
			this.recalculateLocal();
		}
		else if (npc.getName() != null && this.plugin.getRoom() == TheatreRoom.NYLOCAS)
		{
			Pattern p = Pattern.compile("Nylocas (Hagios|Toxobolos|Ischyros)");
			Matcher m = p.matcher(npc.getName());
			if (m.matches())
			{
				this.spiders.put(npc, 52);

				if (this.predictor != null)
				{
					this.predictor.onNpcSpawned(event);
				}
			}
			else if (npc.getName().equals("Nylocas Vasilias"))
			{
				this.onStop();
			}
		}
	}

	public void onNpcDespawned(NpcDespawned event)
	{
		NPC npc = event.getNpc();
		int id = npc.getId();

		this.waveSpawns.remove(npc);

		this.waveAgros.remove(npc);

		if (id == TheatreConstant.NPC_ID_NYLOCAS_PILLAR)
		{
			this.pillars.remove(npc);
		}
		else if (npc.getName() != null && this.plugin.getRoom() == TheatreRoom.NYLOCAS)
		{
			Pattern p = Pattern.compile("Nylocas (Hagios|Toxobolos|Ischyros)");
			Matcher m = p.matcher(npc.getName());
			if (m.matches())
			{
				this.spiders.remove(npc);
			}
		}
	}

	private void renderPoly(Graphics2D graphics, Color color, Polygon polygon)
	{
		if (polygon != null)
		{
			graphics.setColor(color);
			graphics.setStroke(new BasicStroke(2));
			graphics.draw(polygon);
			graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 20));
			graphics.fill(polygon);
		}
	}

	public void onGameTick()
	{
		if (plugin.getRoom() != TheatreRoom.NYLOCAS)
		{
			return;
		}
		else
		{
			boolean findPillar = false;

			for (NPC npc : client.getNpcs())
			{
				if (npc.getId() == 8358)
				{
					findPillar = true;
					break;
				}
			}

			if (!findPillar)
			{
				this.onStop();
				return;
			}
		}

		for (NPC spider : new ArrayList<>(spiders.keySet()))
		{
			int ticksLeft = spiders.get(spider);

			if (ticksLeft < 0)
			{
				spiders.remove(spider);
				continue;
			}

			spiders.replace(spider, ticksLeft - 1);
		}

		this.recalculateLocal();
		for (NPC pillar : pillars.keySet())
		{
			int healthPercent = pillar.getHealthRatio();
			if (healthPercent > -1)
			{
				pillars.replace(pillar, healthPercent);
			}
		}
	}

	private int checkAttackStyle(String itemName)
	{
		switch (itemName.toLowerCase())
		{
			case "toxic blowpipe":
			case "twisted bow":
			case "craw's bow":
				return 1;
			case "abyssal whip":
			case "abyssal tentacle":
			case "scythe of vitur":
			case "scythe of vitur (uncharged)":
			case "ham joint":
			case "bandos godsword":
			case "bandos godsword (or)":
			case "dragon warhammer":
			case "dragon claws":
			case "event rpg":
			case "ghrazi rapier":
			case "blade of saeldor":
			case "crystal halberd":
			case "dragon scimitar":
				return 2;
			case "kodai wand":
			case "master wand":
			case "trident of the seas":
			case "trident of the swamp":
			case "sanguinesti staff":
			case "iban's staff":
			case "iban's staff (u)":
			case "trident of the swamp (e)":
			case "trident of the seas (e)":
				return 3;
			case "red chinchompa":
			case "chinchompa":
			case "black chinchompa":
			case "armadyl crossbow":
			case "dragon crossbow":
			case "rune crossbow":
				return 4;
			case "avernic defender":
			case "dragon defender":
			case "dragon defender (t)":
				if (attackStyle == 1)
				{
					return 2;
				}
				else
				{
					return attackStyle;
				}
			default:
				return attackStyle;
		}
	}

	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (!plugin.isNylocasMenuSwap())
		{
			attackStyle = 0;
			removeMenuSwaps();
			return;
		}
		final String menuOption = event.getOption();
		if (!menuOption.equalsIgnoreCase("equip") && !menuOption.equalsIgnoreCase("attack"))
		{
			return;
		}
		boolean needSwaps = false;
		if (attackStyle == 0)
		{
			String itemName;
			if (client.getLocalPlayer() == null
				|| client.getLocalPlayer().getPlayerAppearance() == null
				|| client.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN) != null
				|| client.getViewportWidget() == null
				|| client.getLocalPlayer().getPlayerAppearance() == null
				|| client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON) == 0
			)
			{
				return;
			}
			final int weapon = ObjectUtils.defaultIfNull((client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON)), 0);

			if (weapon == 0) {
				return;
			}
			ItemDefinition equippedWeapon = itemManager.getItemDefinition(weapon);
			itemName = equippedWeapon.getName();
			if (itemName != null) {
				attackStyle = checkAttackStyle(itemName);
				needSwaps = true;
			}
		}
		if (event.getOption().equalsIgnoreCase("attack"))
		{
			if(needSwaps)
			{
				doSwaps();
			}
			return;
		}

		attackStyle = checkAttackStyle(event.getTarget());
		doSwaps();
	}

	private void doSwaps()
	{
		switch (attackStyle)
		{
			case 1:
			case 4:
				removeMenuSwaps();
				menuManager.addHiddenEntry("Attack", "Nylocas Hagios");
				menuManager.addHiddenEntry("Attack", "Nylocas Ischyros");;
				break;
			case 2:
				removeMenuSwaps();
				menuManager.addHiddenEntry("Attack", "Nylocas Hagios");
				menuManager.addHiddenEntry("Attack", "Nylocas Toxobolos");
				break;
			case 3:
				removeMenuSwaps();
				menuManager.addHiddenEntry("Attack", "Nylocas Ischyros");
				menuManager.addHiddenEntry("Attack", "Nylocas Toxobolos");
				break;
		}
	}
	private void recalculateLocal()
	{
		if (this.pillars != null && this.pillars.size() == 4)
		{
			int minX = Integer.MAX_VALUE;
			int minY = Integer.MAX_VALUE;
			for (NPC npc : pillars.keySet())
			{
				LocalPoint lp = npc.getLocalLocation();
				if (lp.getSceneX() < minX)
				{
					minX = lp.getSceneX();
				}

				if (lp.getSceneY() < minY)
				{
					minY = lp.getSceneY();
				}
			}

			int centerX = minX + 5;
			int centerY = minY + 5;

			if (this.predictor != null)
			{
				this.predictor.southBound = centerY - 12;
				this.predictor.eastBound = centerX + 13;
				this.predictor.westBound = centerX - 12;
			}
		}
	}
}