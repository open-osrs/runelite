/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre.Maiden;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.theatre.Room;
import net.runelite.client.plugins.theatre.TheatreConfig;
import net.runelite.client.plugins.theatre.TheatrePlugin;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Maiden extends Room
{
	@Inject
	private Client client;

	@Inject
	private MaidenOverlay maidenOverlay;

	@Inject
	protected Maiden(TheatrePlugin plugin, TheatreConfig config)
	{
		super(plugin, config);
	}

	@Getter
	private boolean maidenActive;

	@Getter
	private NPC maidenNPC;

	@Getter
	private List<NPC> maidenSpawns = new ArrayList<>();

	@Getter
	private Map<NPC, Pair<Integer, Integer>> maidenReds = new HashMap<>();

	@Getter
	private List<WorldPoint> maidenBloodSplatters = new ArrayList<>();

	@Getter
	private List<WorldPoint> maidenBloodSpawnLocations = new ArrayList<>();

	@Getter
	private List<WorldPoint> maidenBloodSpawnTrailingLocations = new ArrayList<>();

	@Getter
	private int ticksUntilAttack = 0;
	private int lastAnimationID = -1;

	private static final int GRAPHICSOBJECT_ID_MAIDEN = 1579;

	@Override
	public void load()
	{
		overlayManager.add(maidenOverlay);
	}

	@Override
	public void unload()
	{
		overlayManager.remove(maidenOverlay);

		maidenActive = false;
		maidenBloodSplatters.clear();
		maidenSpawns.clear();
		maidenReds.clear();
		maidenBloodSpawnLocations.clear();
		maidenBloodSpawnTrailingLocations.clear();
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned npcSpawned)
	{
		NPC npc = npcSpawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.THE_MAIDEN_OF_SUGADINTI:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8361:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8362:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8363:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8364:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8365:
				ticksUntilAttack = 10;
				maidenActive = true;
				maidenNPC = npc;
				break;
			case NpcID.BLOOD_SPAWN:
				maidenSpawns.add(npc);
				break;
			case NpcID.NYLOCAS_MATOMENOS:
				maidenReds.putIfAbsent(npc, new MutablePair<>(npc.getHealthRatio(), npc.getHealthScale()));
				break;
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned npcDespawned)
	{
		NPC npc = npcDespawned.getNpc();
		switch (npc.getId())
		{
			case NpcID.THE_MAIDEN_OF_SUGADINTI:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8361:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8362:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8363:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8364:
			case NpcID.THE_MAIDEN_OF_SUGADINTI_8365:
				ticksUntilAttack = 0;
				maidenActive = false;
				maidenSpawns.clear();
				maidenNPC = null;
				break;
			case NpcID.BLOOD_SPAWN:
				maidenSpawns.remove(npc);
				break;
			case NpcID.NYLOCAS_MATOMENOS:
				maidenReds.remove(npc);
				break;
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		if (!maidenActive)
		{
			return;
		}

		if (maidenNPC != null)
		{
			ticksUntilAttack--;
			if (lastAnimationID == -1 && maidenNPC.getAnimation() != lastAnimationID)
			{
				ticksUntilAttack = 10;
			}
			lastAnimationID = maidenNPC.getAnimation();
		}

		maidenBloodSplatters.clear();
		client.getGraphicsObjects().stream().filter(o -> o.getId() == GRAPHICSOBJECT_ID_MAIDEN).
			forEach(o -> maidenBloodSplatters.add(WorldPoint.fromLocal(client, o.getLocation())));

		maidenBloodSpawnTrailingLocations.clear();
		maidenBloodSpawnTrailingLocations.addAll(maidenBloodSpawnLocations);
		maidenBloodSpawnLocations.clear();

		maidenSpawns.forEach(s -> maidenBloodSpawnLocations.add(s.getWorldLocation()));
	}

	Color maidenSpecialWarningColor()
	{
		Color col = Color.GREEN;
		if (maidenNPC == null || maidenNPC.getInteracting() == null)
		{
			return col;
		}

		if (maidenNPC.getInteracting().getName().equals(client.getLocalPlayer().getName()))
		{
			return Color.ORANGE;
		}

		return col;
	}
}
