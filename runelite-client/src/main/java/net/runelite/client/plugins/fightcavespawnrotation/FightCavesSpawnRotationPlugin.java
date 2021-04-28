/*
 * Copyright (c) 2021 Nicole <https://github.com/losingticks>
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
package net.runelite.client.plugins.fightcavespawnrotation;

import com.google.inject.Provides;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.fightcavespawnrotation.overlay.FightCavesDisplayOverlay;
import net.runelite.client.plugins.fightcavespawnrotation.overlay.FightCavesRotationOverlay;
import net.runelite.client.plugins.fightcavespawnrotation.util.FightCavesNpc;
import net.runelite.client.plugins.fightcavespawnrotation.util.FightCavesNpcSpawn;
import net.runelite.client.plugins.fightcavespawnrotation.util.FightCavesStartLocations;
import net.runelite.client.task.Schedule;
import net.runelite.client.ui.overlay.OverlayManager;
import org.apache.commons.lang3.ArrayUtils;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "Fight Caves Spawn Rotation",
	tags = {"fight", "caves", "spawn", "Rotation"},
	enabledByDefault = false
)
public class FightCavesSpawnRotationPlugin extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private FightCavesRotationOverlay fightCavesRotationOverlay;
	@Inject
	private FightCavesDisplayOverlay fightCavesDisplayOverlay;
	@Inject
	private FightCavesSpawnRotationConfig config;
	@Getter
	private static List<List<FightCavesNpcSpawn>> waveData = new ArrayList();
	private int currentUTCTime;
	@Getter
	private int rotationTime;
	@Getter
	private static int currentWave = -1;
	private int currentRotation = -1;
	private static int rsSpawnRotation = -1;
	public static final int TZHAAR_REGION = 9808;
	public static final int FIGHT_CAVES_REGION = 9551;
	private final Pattern WAVE_PATTERN = Pattern.compile(".*Wave: (\\d+).*");

	public final LocalTime getUTCTime()
	{
		return LocalTime.now(ZoneId.of("UTC"));
	}

	@Provides
	FightCavesSpawnRotationConfig provideConfig(final ConfigManager configManager)
	{
		return configManager.getConfig(FightCavesSpawnRotationConfig.class);
	}

	protected void startUp()
	{
		overlayManager.add(fightCavesRotationOverlay);
		overlayManager.add(fightCavesDisplayOverlay);
	}

	protected void shutDown()
	{
		overlayManager.remove(fightCavesRotationOverlay);
		overlayManager.remove(fightCavesDisplayOverlay);
		reset();
	}

	@Subscribe
	private void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			if (inRegion(FIGHT_CAVES_REGION))
			{
				currentRotation = FightCavesStartLocations.translateRotation(rotationTime);
				rsSpawnRotation = FightCavesStartLocations.getLookupMap().get(currentRotation);
				updateWaveData(rsSpawnRotation);
				currentWave = 1;
			}
			else if (!inRegion(FIGHT_CAVES_REGION))
			{
				reset();
			}

		}
	}

	@Subscribe
	private void onChatMessage(ChatMessage event)
	{
		Matcher waveMatcher = WAVE_PATTERN.matcher(event.getMessage());
		if (event.getType() == ChatMessageType.GAMEMESSAGE && inRegion(FIGHT_CAVES_REGION) && waveMatcher.matches())
		{
			currentWave = Integer.parseInt(waveMatcher.group(1));
			if (currentRotation == 7 && currentWave == 3)
			{
				rsSpawnRotation = 11;
				updateWaveData(rsSpawnRotation);
			}
		}
	}

	@Schedule(
		period = 500L,
		unit = ChronoUnit.MILLIS
	)
	public void updateTime()
	{
		if (client.getGameState() == GameState.LOGGED_IN)
		{
			if (inRegion(TZHAAR_REGION))
			{
				currentUTCTime = getUTCTime().getHour() * 60 + getUTCTime().getMinute();
				rotationTime = currentUTCTime % 16;
				int minute = getUTCTime().getMinute();
				if ((rotationTime != 15 || minute % 2 == 0) && (rotationTime != 0 || minute % 2 != 0))
				{
					++rotationTime;
				}
				else
				{
					rotationTime = 1;
				}
			}
		}
	}

	private void updateWaveData(int rsSpawnRotation)
	{
		waveData = calculateSpawns(rsSpawnRotation);
	}

	private static List<List<FightCavesNpcSpawn>> calculateSpawns(int rsVal)
	{
		ArrayList<List<FightCavesNpcSpawn>> spawns = new ArrayList();
		int currentCycle = rsVal;
		FightCavesNpc[] fightCavesNpcs = FightCavesNpc.values();

		for (FightCavesNpc npc : fightCavesNpcs)
		{
			if (npc != FightCavesNpc.JAD)
			{
				List<List<FightCavesNpcSpawn>> subSpawns = generateSubSpawns((currentCycle + 1) % 15, npc, spawns);
				ArrayList<FightCavesNpcSpawn> initialSpawn = new ArrayList();
				initialSpawn.add(new FightCavesNpcSpawn(npc, currentCycle));
				spawns.add(initialSpawn);
				currentCycle = (currentCycle + 1) % 15;
				spawns.addAll(subSpawns);
				currentCycle = (currentCycle + subSpawns.size()) % 15;
				ArrayList<FightCavesNpcSpawn> postSpawns = new ArrayList();
				postSpawns.add(new FightCavesNpcSpawn(npc, currentCycle));
				postSpawns.add(new FightCavesNpcSpawn(npc, (currentCycle + 1) % 15));
				spawns.add(postSpawns);
				currentCycle = (currentCycle + 1) % 15;
			}
		}

		ArrayList<FightCavesNpcSpawn> jadSpawn = new ArrayList();
		jadSpawn.add(new FightCavesNpcSpawn(FightCavesNpc.JAD, currentCycle));
		spawns.add(jadSpawn);
		return spawns;
	}

	private static List<List<FightCavesNpcSpawn>> generateSubSpawns(int currentCycle, FightCavesNpc npc, List<List<FightCavesNpcSpawn>> existing)
	{
		ArrayList<List<FightCavesNpcSpawn>> npcSpawn = new ArrayList();

		for (Iterator generateSpawn = existing.iterator(); generateSpawn.hasNext(); currentCycle = (currentCycle + 1) % 15)
		{
			List<FightCavesNpcSpawn> existingWave = (List) generateSpawn.next();
			ArrayList<FightCavesNpcSpawn> newSpawn = new ArrayList();
			newSpawn.add(new FightCavesNpcSpawn(npc, currentCycle));

			for (int i = 0; i < existingWave.size(); ++i)
			{
				FightCavesNpcSpawn existingSpawn = existingWave.get(i);
				newSpawn.add(new FightCavesNpcSpawn(existingSpawn.getFightCavesNpc(), (currentCycle + i + 1) % 15));
			}

			npcSpawn.add(newSpawn);
		}

		return npcSpawn;
	}

	public boolean inRegion(int region)
	{
		return ArrayUtils.contains(client.getMapRegions(), region);
	}

	private void reset()
	{
		currentUTCTime = -1;
		rotationTime = -1;
		currentWave = -1;
		currentRotation = -1;
		rsSpawnRotation = -1;
	}
}