/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Sotetseg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Point;
import net.runelite.api.Projectile;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.theatre.Room;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatrePlugin;

@Slf4j
public class Sotetseg extends Room
{
	@Inject
	private Client client;

	@Inject
	private TheatrePlugin plugin; //DO NOT USE. - Here for Counter Constructor

	@Inject
	private SotetsegOverlay sotetsegOverlay;

	@Inject
	protected Sotetseg(TheatrePlugin plugin, TheatreConfig config)
	{
		super(plugin, config);
	}

	@Getter
	private boolean sotetsegActive;

	@Getter
	private NPC sotetsegNPC;

	@Getter
	private LinkedHashSet<Point> redTiles = new LinkedHashSet<>();

	@Getter
	private HashSet<Point> greenTiles = new HashSet<>();

	@Getter
	private static final Point swMazeSquareOverWorld = new Point(9, 22);

	@Getter
	private static final Point swMazeSquareUnderWorld = new Point(42, 31);

	@Getter
	private boolean wasInUnderWorld = false;

	@Getter
	private int sotetsegTickCount = -1;

	private boolean offTick = false;

	private boolean bigOrbPresent = false;
	private boolean sotetsegBallCounted = false;

	static final int SOTETSEG_MAGE_ORB = 1606;
	static final int SOTETSEG_RANGE_ORB = 1607;
	static final int SOTETSEG_BIG_AOE_ORB = 1604;

	private static final int GROUNDOBJECT_ID_REDMAZE = 33035;
	private int overWorldRegionID = -1;

	@Override
	public void load()
	{
		overlayManager.add(sotetsegOverlay);
	}

	@Override
	public void unload()
	{
		overlayManager.remove(sotetsegOverlay);
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.SOTETSEG:
			case NpcID.SOTETSEG_8388:
				sotetsegActive = true;
				sotetsegNPC = npc;
				break;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.SOTETSEG:
			case NpcID.SOTETSEG_8388:
				if (client.getPlane() != 3)
				{
					sotetsegActive = false;
					sotetsegNPC = null;
				}
				break;
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		Actor actor = event.getActor();
		if (actor instanceof NPC)
		{
			if (actor == sotetsegNPC)
			{
				int animation = event.getActor().getAnimation();
				switch (animation)
				{
					case 8138:
					case 8139:
					{
						sotetsegTickCount = 6;
					}
				}
			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (sotetsegActive)
		{
			if (sotetsegNPC != null && sotetsegNPC.getId() == NpcID.SOTETSEG_8388)
			{
				if (sotetsegTickCount >= 0)
				{
					sotetsegTickCount--;
				}

				if (!redTiles.isEmpty())
				{
					redTiles.clear();
					offTick = false;
				}

				if (!greenTiles.isEmpty())
				{
					greenTiles.clear();
				}

				if (inRoomRegion(TheatrePlugin.SOTETSEG_REGION_OVERWORLD))
				{
					wasInUnderWorld = false;
					if (client.getLocalPlayer() != null && client.getLocalPlayer().getWorldLocation() != null)
					{
						overWorldRegionID = client.getLocalPlayer().getWorldLocation().getRegionID();
					}
				}
			}

			if (config.sotetsegBigOrbTicks())
			{
				boolean foundBigOrb = false;
				for (Projectile p : client.getProjectiles())
				{
					if (p.getId() == SOTETSEG_BIG_AOE_ORB)
					{
						foundBigOrb = true;
						break;
					}
				}
				bigOrbPresent = foundBigOrb;
			}

			if (!bigOrbPresent)
			{
				sotetsegBallCounted = false;
			}

			if (bigOrbPresent && !sotetsegBallCounted)
			{
				sotetsegTickCount = 10;
				sotetsegBallCounted = true;
			}
		}
	}

	@Subscribe
	public void onGroundObjectSpawned(GroundObjectSpawned event)
	{
		if (sotetsegActive)
		{
			GroundObject o = event.getGroundObject();

			if (o.getId() == GROUNDOBJECT_ID_REDMAZE)
			{
				Tile t = event.getTile();
				WorldPoint p = WorldPoint.fromLocal(client, t.getLocalLocation());
				Point point = new Point(p.getRegionX(), p.getRegionY());
				if (inRoomRegion(TheatrePlugin.SOTETSEG_REGION_OVERWORLD))
				{
					redTiles.add(new Point(point.getX() - swMazeSquareOverWorld.getX(), point.getY() - swMazeSquareOverWorld.getY()));
				}
				if (inRoomRegion(TheatrePlugin.SOTETSEG_REGION_UNDERWORLD))
				{
					redTiles.add(new Point(point.getX() - swMazeSquareUnderWorld.getX(), point.getY() - swMazeSquareUnderWorld.getY()));
					wasInUnderWorld = true;
				}
			}
		}
	}

	WorldPoint worldPointFromMazePoint(Point mazePoint)
	{
		if (overWorldRegionID == -1 && client.getLocalPlayer() != null)
		{
			return WorldPoint.fromRegion(
				client.getLocalPlayer().getWorldLocation().getRegionID(), mazePoint.getX() + Sotetseg.getSwMazeSquareOverWorld().getX(),
				mazePoint.getY() + Sotetseg.getSwMazeSquareOverWorld().getY(), 0);
		}
		return WorldPoint.fromRegion(
			overWorldRegionID, mazePoint.getX() + Sotetseg.getSwMazeSquareOverWorld().getX(),
			mazePoint.getY() + Sotetseg.getSwMazeSquareOverWorld().getY(), 0);
	}

}
