/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Xarpus;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Varbits;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.theatre.Room;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import net.runelite.client.ui.overlay.infobox.Counter;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ImageUtil;

public class Xarpus extends Room
{
	@Inject
	private Client client;

	@Inject
	private XarpusOverlay xarpusOverlay;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private TheatrePlugin p; //DO NOT USE. Just here for the exhumedCounter constructor.

	@Inject
	protected Xarpus(TheatrePlugin plugin, TheatreConfig config)
	{
		super(plugin, config);
	}

	@Getter
	private boolean xarpusActive;
	private boolean xarpusStarted = false;

	@Getter
	private NPC xarpusNPC;

	@Getter
	private int instanceTimer = 0;

	@Getter
	private boolean isInstanceTimerRunning = false;
	private boolean nextInstance = true;

	@Getter
	private boolean exhumedSpawned = false;

	@Getter
	private final Map<GroundObject, Integer> xarpusExhumeds = new HashMap<>();

	@Getter
	private Counter exhumedCounter;

	@Getter
	private int xarpusTicksUntilAttack;

	@Getter
	private boolean postScreech = false;

	private boolean xarpusStare;

	private static BufferedImage EXHUMED_COUNT_ICON;
	private static final int GROUNDOBJECT_ID_EXHUMED = 32743;

	@Override
	public void init()
	{
		EXHUMED_COUNT_ICON = ImageUtil.resizeCanvas(ImageUtil.getResourceStreamFromClass(TheatrePlugin.class, "1067-POISON.png"), 26, 26);
	}

	@Override
	public void load()
	{
		overlayManager.add(xarpusOverlay);
	}

	@Override
	public void unload()
	{
		overlayManager.remove(xarpusOverlay);

		infoBoxManager.removeInfoBox(exhumedCounter);

		exhumedCounter = null;
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.XARPUS:
			case NpcID.XARPUS_8339:
			case NpcID.XARPUS_8340:
			case NpcID.XARPUS_8341:
				xarpusActive = true;
				xarpusNPC = npc;
				xarpusStare = false;
				xarpusTicksUntilAttack = 9;
				exhumedSpawned = false;
				postScreech = false;
				break;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.XARPUS:
			case NpcID.XARPUS_8339:
			case NpcID.XARPUS_8340:
			case NpcID.XARPUS_8341:
				xarpusActive = false;
				xarpusNPC = null;
				xarpusStare = false;
				xarpusTicksUntilAttack = 9;
				xarpusExhumeds.clear();
				infoBoxManager.removeInfoBox(exhumedCounter);
				exhumedCounter = null;
				isInstanceTimerRunning = false;
				exhumedSpawned = false;
				postScreech = false;
				break;
		}
	}

	@Subscribe
	public void onGroundObjectSpawned(GroundObjectSpawned event)
	{
		if (xarpusActive)
		{
			GroundObject o = event.getGroundObject();
			if (o.getId() == 32743)
			{
				exhumedSpawned = true;
				if (exhumedCounter == null)
				{

					exhumedCounter = new Counter(EXHUMED_COUNT_ICON, p, 1);
					infoBoxManager.addInfoBox(exhumedCounter);
				}
				else
				{

					exhumedCounter.setCount(exhumedCounter.getCount() + 1);
				}

				xarpusExhumeds.put(o, 11);
			}
		}
	}

	@Subscribe
	public void onGroundObjectDespawned(GroundObjectDespawned event)
	{
		if (xarpusActive)
		{
			GroundObject o = event.getGroundObject();
			if (o.getId() == GROUNDOBJECT_ID_EXHUMED)
			{
				xarpusExhumeds.remove(o);
			}
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		if (!xarpusStarted && inRoomRegion(TheatrePlugin.XARPUS_REGION) && client.getVarbitValue(client.getVarps(), 6447) == 2 && (client.getVar(Varbits.MULTICOMBAT_AREA) == 1))
		{
			xarpusStarted = true;
			isInstanceTimerRunning = false;
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (xarpusActive)
		{
			for (Iterator<GroundObject> it = xarpusExhumeds.keySet().iterator(); it.hasNext(); )
			{
				GroundObject key = it.next();
				xarpusExhumeds.replace(key, xarpusExhumeds.get(key) - 1);
				if (xarpusExhumeds.get(key) < 0)
				{
					it.remove();
				}
			}

			if (xarpusNPC.getOverheadText() != null && !xarpusStare)
			{
				xarpusStare = true;
				xarpusTicksUntilAttack = 9;
			}

			if (xarpusStare)
			{
				xarpusTicksUntilAttack--;
				if (xarpusTicksUntilAttack <= 0)
				{
					if (!postScreech)
					{
						postScreech = true;
					}
					xarpusTicksUntilAttack = 8;
				}
			}
			else if (xarpusNPC.getId() == NpcID.XARPUS_8340)
			{
				xarpusTicksUntilAttack--;
				if (xarpusTicksUntilAttack <= 0)
				{
					xarpusTicksUntilAttack = 4;
				}
			}

		}

		if (isInstanceTimerRunning)
		{
			instanceTimer = (instanceTimer + 1) % 4;
		}

		if (client.getLocalPlayer() == null)
		{
			return;
		}
		List<Player> players = client.getPlayers();
		for (Player player : players)
		{
			if (player.getWorldLocation() != null)
			{
				WorldPoint wpPlayer = player.getWorldLocation();
				LocalPoint lpPlayer = LocalPoint.fromWorld(client, wpPlayer.getX(), wpPlayer.getY());

				WorldPoint wpChest = WorldPoint.fromRegion(player.getWorldLocation().getRegionID(), 17, 5, player.getWorldLocation().getPlane());
				LocalPoint lpChest = LocalPoint.fromWorld(client, wpChest.getX(), wpChest.getY());
				if (lpChest != null)
				{
					Point point = new Point(lpChest.getSceneX() - lpPlayer.getSceneX(), lpChest.getSceneY() - lpPlayer.getSceneY());

					if (isInSotetsegRegion() && point.getY() == 1 && (point.getX() == 1 || point.getX() == 2 || point.getX() == 3) && nextInstance)
					{
						client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Xarpus instance timer started", "");
						instanceTimer = 2;
						isInstanceTimerRunning = true;
						nextInstance = false;
					}
				}
			}
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			nextInstance = true;
		}
	}

	boolean isInSotetsegRegion()
	{
		return inRoomRegion(TheatrePlugin.SOTETSEG_REGION_OVERWORLD) || inRoomRegion(TheatrePlugin.SOTETSEG_REGION_UNDERWORLD);
	}
}
