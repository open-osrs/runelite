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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.ItemID;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.theatre.RoomHandler;
import net.runelite.client.plugins.theatre.TheatreConstant;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import net.runelite.client.plugins.theatre.TheatreRoom;

@Slf4j
public class NyloHandler extends RoomHandler
{
	private static final String MESNAME = "tobmes";
	final List<NPC> waveSpawns = new ArrayList<>();
	final List<NPC> waveAgros = new ArrayList<>();
	private final MenuManager menuManager;
	private final ItemManager itemManager;
	private final EventBus eventBus;
	public long startTime = 0L;
	int startTick = 0;
	@Getter(AccessLevel.PUBLIC)
	private Map<NPC, Integer> pillars = new HashMap<>();
	@Getter(AccessLevel.PUBLIC)
	private Map<NPC, Integer> spiders = new HashMap<>();
	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int wave = 0;
	private NyloOverlay overlay = null;
	private NyloPredictor predictor = null;
	private AttackStyle currentAttack = null;

	public NyloHandler(final Client client, final TheatrePlugin plugin, final MenuManager menuManager, final ItemManager itemManager, final EventBus eventBus)
	{
		super(client, plugin);
		this.itemManager = itemManager;
		this.menuManager = menuManager;
		this.eventBus = eventBus;
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
		if (plugin.isNylocasMenuSwap())
		{
			eventBus.subscribe(MenuOptionClicked.class, MESNAME, this::onMenuOptionClicked);
		}

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
		if (plugin.isNylocasMenuSwap())
		{
			eventBus.subscribe(MenuOptionClicked.class, MESNAME, this::onMenuOptionClicked);
		}
		else
		{
			eventBus.unregister(MESNAME);
			reset();
		}
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

	private AttackStyle checkAttackStyle(int weaponId)
	{
		switch (weaponId)
		{
			case ItemID.TOXIC_BLOWPIPE:
			case ItemID.TWISTED_BOW:
			case ItemID.CRAWS_BOW:
				return AttackStyle.RANGE2H;
			case ItemID.ABYSSAL_WHIP:
			case ItemID.ABYSSAL_TENTACLE:
			case ItemID.SCYTHE_OF_VITUR:
			case ItemID.SCYTHE_OF_VITUR_22664:
			case ItemID.SCYTHE_OF_VITUR_UNCHARGED:
			case ItemID.HAM_JOINT:
			case ItemID.SWIFT_BLADE:
			case ItemID.BANDOS_GODSWORD:
			case ItemID.BANDOS_GODSWORD_20782:
			case ItemID.BANDOS_GODSWORD_21060:
			case ItemID.BANDOS_GODSWORD_OR:
			case ItemID.DRAGON_WARHAMMER:
			case ItemID.DRAGON_CLAWS:
			case ItemID.EVENT_RPG:
			case ItemID.GHRAZI_RAPIER:
			case ItemID.GHRAZI_RAPIER_23628:
			case ItemID.BLADE_OF_SAELDOR:
			case ItemID.CRYSTAL_HALBERD:
			case ItemID.DRAGON_SCIMITAR:
			case ItemID.RUNE_SCIMITAR:
				return AttackStyle.MELEE;
			case ItemID.KODAI_WAND:
			case ItemID.MASTER_WAND:
			case ItemID.TRIDENT_OF_THE_SEAS:
			case ItemID.TRIDENT_OF_THE_SWAMP:
			case ItemID.SANGUINESTI_STAFF:
			case ItemID.IBANS_STAFF:
			case ItemID.IBANS_STAFF_1410:
			case ItemID.IBANS_STAFF_U:
			case ItemID.TRIDENT_OF_THE_SWAMP_E:
			case ItemID.TRIDENT_OF_THE_SEAS_E:
				return AttackStyle.MAGE;
			case ItemID.RED_CHINCHOMPA:
			case ItemID.CHINCHOMPA:
			case ItemID.BLACK_CHINCHOMPA:
			case ItemID.ARMADYL_CROSSBOW:
			case ItemID.DRAGON_CROSSBOW:
			case ItemID.RUNE_CROSSBOW:
			case ItemID.DORGESHUUN_CROSSBOW:
				return AttackStyle.RANGE;
			case ItemID.AVERNIC_DEFENDER:
			case ItemID.DRAGON_DEFENDER:
			case ItemID.DRAGON_DEFENDER_T:
				if (currentAttack == AttackStyle.RANGE2H)
				{
					return AttackStyle.MELEE;
				}
			default:
				return currentAttack;
		}
	}

	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (!event.getOption().equalsIgnoreCase("equip") &&
			!event.getOption().equalsIgnoreCase("wield") &&
			!event.getOption().equalsIgnoreCase("hold"))
		{
			if (currentAttack != null)
			{
				return;
			}
		}
		if (currentAttack == null)
		{
			if (client.getLocalPlayer() != null
				&& client.getViewportWidget() != null
				&& client.getLocalPlayer().getPlayerAppearance() != null
				&& client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON) != 0
			)
			{
				currentAttack = checkAttackStyle(client.getLocalPlayer().getPlayerAppearance().getEquipmentId(KitType.WEAPON));
			}
		}
		if (event.getOption().equalsIgnoreCase("equip") ||
			event.getOption().equalsIgnoreCase("wield") ||
			event.getOption().equalsIgnoreCase("hold"))
		{
			currentAttack = checkAttackStyle(event.getIdentifier());
		}
		if (currentAttack != null)
		{
			doSwaps();
		}
	}

	private void doSwaps()
	{
		switch (currentAttack)
		{
			case RANGE:
			case RANGE2H:
				removeMenuSwaps();
				menuManager.addHiddenEntry("Attack", "Nylocas Hagios");
				menuManager.addHiddenEntry("Attack", "Nylocas Ischyros");
				break;
			case MELEE:
				removeMenuSwaps();
				menuManager.addHiddenEntry("Attack", "Nylocas Hagios");
				menuManager.addHiddenEntry("Attack", "Nylocas Toxobolos");
				break;
			case MAGE:
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

	private enum AttackStyle
	{
		MELEE,
		MAGE,
		RANGE,
		RANGE2H
	}
}