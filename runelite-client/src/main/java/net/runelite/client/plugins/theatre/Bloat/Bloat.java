/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Bloat;

import java.awt.Color;
import java.awt.Polygon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcID;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.theatre.Room;
import net.runelite.client.plugins.theatre.RoomOverlay;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatrePlugin;

public class Bloat extends Room
{
	@Inject
	private Client client;

	@Inject
	private BloatOverlay bloatOverlay;

	@Inject
	protected Bloat(final Client client, TheatrePlugin plugin, TheatreConfig config)
	{
		super(plugin, config);
	}

	@Getter
	private boolean bloatActive;

	@Getter
	private NPC bloatNPC;

	@Getter
	private HashMap<WorldPoint, Integer> bloatHands = new HashMap<>();

	@Getter
	private int bloatTickCount = -1;

	private int bloatDownCount = 0;
	private int bloatState = 0;

	private boolean bloatStarted;

	public static final Set<Integer> tankObjectIDs = ImmutableSet.of(32957, 32955, 32959, 32960, 32964, 33084, 0);
	public static final Set<Integer> topOfTankObjectIDs = ImmutableSet.of(32958, 32962, 32964, 32965, 33062);
	public static final Set<Integer> ceilingChainsObjectIDs = ImmutableSet.of(32949, 32950, 32951, 32952, 32953, 32954, 32970);

	@Override
	public void load()
	{
		overlayManager.add(bloatOverlay);
	}

	@Override
	public void unload()
	{
		overlayManager.remove(bloatOverlay);
		bloatDownCount = 0;
		bloatState = 0;
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();
		if (npc.getId() == NpcID.PESTILENT_BLOAT)
		{
			bloatActive = true;
			bloatNPC = npc;
			bloatTickCount = 0;
			bloatStarted = false;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		if (npc.getId() == NpcID.PESTILENT_BLOAT)
		{
			bloatActive = false;
			bloatNPC = null;
			bloatTickCount = -1;
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged e)
	{
		if (e.getGameState() == GameState.LOGGED_IN && inRoomRegion(TheatrePlugin.BLOAT_REGION))
		{
			if (config.hideBloatTank())
			{
				removeGameObjectsFromScene(client.getPlane(), Ints.toArray(tankObjectIDs));
				removeGameObjectsFromScene(1, Ints.toArray(topOfTankObjectIDs));
			}
			if (config.hideCeilingChains())
			{
				removeGameObjectsFromScene(1, Ints.toArray(ceilingChainsObjectIDs));
			}
		}

	}

	public void removeGameObjectsFromScene(int plane, int... gameObjectIDs)
	{
		Scene scene = client.getScene();
		Tile[][] tiles = scene.getTiles()[plane];

		/* created by nicole#1111 */
		for (int sceneTilesX = 0; sceneTilesX < 104; sceneTilesX++)
		{
			for (int sceneTilesY = 0; sceneTilesY < 104; sceneTilesY++)
			{
				Tile tile = tiles[sceneTilesX][sceneTilesY];
				if (tile != null)
				{
					GameObject[] gameObjects = tile.getGameObjects();

					Arrays.stream(gameObjects)
							.filter(Objects::nonNull)
							.filter(gameObject -> Arrays.stream(gameObjectIDs)
							.anyMatch(id -> id == gameObject.getId()))
							.forEach(scene::removeGameObject);
				}
			}
		}

	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (client.getGameState() != GameState.LOGGED_IN || event.getActor() != bloatNPC)
		{
			return;
		}

		bloatTickCount = 0;
	}

	@Subscribe
	public void onGraphicsObjectCreated(GraphicsObjectCreated graphicsObjectC)
	{
		if (bloatActive)
		{
			GraphicsObject graphicsObject = graphicsObjectC.getGraphicsObject();
			if (graphicsObject.getId() >= 1560 && graphicsObject.getId() <= 1590)
			{
				WorldPoint point = WorldPoint.fromLocal(client, graphicsObject.getLocation());
				if (!bloatHands.containsKey(point))
				{
					bloatHands.put(point, 4);
				}
			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (bloatActive)
		{
			bloatDownCount++;
			bloatTickCount++;

			bloatHands.values().removeIf(v -> v <= 0);
			bloatHands.replaceAll((k, v) -> v - 1);

			if (bloatNPC.getAnimation() == -1) // 1 = UP, 2 = DOWN, 3 = WARN, 4 = PAST THRESHOLD;
			{
				bloatDownCount = 0;
				if (bloatNPC.getHealthScale() == 0)
				{
					bloatState = 2;
				}
				else if (bloatTickCount >= 38)
				{
					bloatState = 4;
				}
				else
				{
					bloatState = 1;
				}
			}
			else
			{
				if (bloatTickCount >= 38)
				{
					bloatState = 4;
				}
				else if (25 < bloatDownCount && bloatDownCount < 35)
				{
					bloatState = 3;
				}
				else if (bloatDownCount < 26)
				{
					bloatState = 2;
				}
				else if (bloatNPC.getModelHeight() == 568)
				{
					bloatState = 2;
				}
				else
				{
					if (bloatTickCount >= 38)
					{
						bloatState = 4;
					}
					else
					{
						bloatState = 1;
					}
				}
			}
		}
	}

	@Subscribe
	public void onVarbitChanged(VarbitChanged event)
	{
		if (client.getVarbitValue(6447) == 1 && !bloatStarted)
		{
			bloatTickCount = 0;
			bloatStarted = true;
		}
	}

	Polygon getBloatTilePoly()
	{
		if (bloatNPC == null)
		{
			return null;
		}

		int size = 1;
		NPCComposition composition = bloatNPC.getTransformedComposition();
		if (composition != null)
		{
			size = composition.getSize();
		}

		LocalPoint lp;

		switch (bloatState)
		{
			case 1:
			case 4:
				lp = bloatNPC.getLocalLocation();

				if (lp == null)
				{
					return null;
				}

				return RoomOverlay.getCanvasTileAreaPoly(client, lp, size, true);
			case 2:
			case 3:
				lp = LocalPoint.fromWorld(client, bloatNPC.getWorldLocation());

				if (lp == null)
				{
					return null;
				}

				return RoomOverlay.getCanvasTileAreaPoly(client, lp, size, false);
		}

		return null;
	}

	Color getBloatStateColor()
	{
		Color col = config.bloatIndicatorColorUP();
		switch (bloatState)
		{
			case 2:
				col = config.bloatIndicatorColorDOWN();
				break;
			case 3:
				col = config.bloatIndicatorColorWARN();
				break;
			case 4:
				col = config.bloatIndicatorColorTHRESH();
				break;
		}
		return col;
	}

}
