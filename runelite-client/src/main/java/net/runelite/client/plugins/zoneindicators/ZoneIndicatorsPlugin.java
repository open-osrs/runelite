/*
 * Copyright (c) 2018, Woox <https://github.com/wooxsolo>
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
package net.runelite.client.plugins.zoneindicators;

import net.runelite.client.eventbus.Subscribe;
import com.google.inject.Provides;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.GameState;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.WorldType;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.geometry.Geometry;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Zone Indicators",
	description = "Show borders of multicombat and PvP safezones",
	tags = {"multicombat", "lines", "pvp", "deadman", "safezones", "pklite"}
)
public class ZoneIndicatorsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ZoneIndicatorsConfig config;

	@Inject
	private ZoneIndicatorsOverlay overlay;

	@Inject
	private ZoneIndicatorsMinimapOverlay minimapOverlay;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ScheduledExecutorService executorService;

	@Getter
	private GeneralPath[] multicombatPathToDisplay;

	@Getter
	private GeneralPath[] pvpPathToDisplay;

	@Getter
	private boolean inPvp;

	@Getter
	private boolean inDeadman;

	private int currentPlane;

	private int tickCount = 0;

	@Provides
	ZoneIndicatorsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ZoneIndicatorsConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		overlayManager.add(minimapOverlay);

		multicombatPathToDisplay = new GeneralPath[Constants.MAX_Z];
		pvpPathToDisplay = new GeneralPath[Constants.MAX_Z];

		clientThread.invokeLater(() ->
		{
			if (client.getGameState() == GameState.LOGGED_IN)
			{
				findLinesInScene();
			}
		});
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		overlayManager.remove(minimapOverlay);

		multicombatPathToDisplay = null;
		pvpPathToDisplay = null;
	}

	@Subscribe
	public void onClientTick(ClientTick event)
	{
		if (tickCount == 5)
		{
			if (client.getGameState().equals(GameState.LOGGED_IN))
			{
				findLinesInScene();
				tickCount = 0;
			}
		}
		else
		{
			tickCount++;
		}
	}

	private void transformWorldToLocal(float[] coords)
	{
		LocalPoint lp = LocalPoint.fromWorld(client, (int)coords[0], (int)coords[1]);
		coords[0] = lp.getX() - Perspective.LOCAL_TILE_SIZE / 2;
		coords[1] = lp.getY() - Perspective.LOCAL_TILE_SIZE / 2;
	}

	private boolean isOpenableAt(WorldPoint wp)
	{
		int sceneX = wp.getX() - client.getBaseX();
		int sceneY = wp.getY() - client.getBaseY();

		Tile tile = client.getScene().getTiles()[wp.getPlane()][sceneX][sceneY];
		if (tile == null)
		{
			return false;
		}

		WallObject wallObject = tile.getWallObject();
		if (wallObject == null)
		{
			return false;
		}

		ObjectComposition objectComposition = client.getObjectDefinition(wallObject.getId());
		if (objectComposition == null)
		{
			return false;
		}

		String[] actions = objectComposition.getActions();
		if (actions == null)
		{
			return false;
		}

		return Arrays.stream(actions).anyMatch(x -> x != null && x.toLowerCase().equals("open"));
	}

	private void findLinesInScene()
	{
		long startTime = System.currentTimeMillis();
		inDeadman = client.getWorldType().stream().anyMatch(x ->
			x == WorldType.DEADMAN || x == WorldType.SEASONAL_DEADMAN);
		inPvp = client.getWorldType().stream().anyMatch(x ->
			x == WorldType.PVP);

		Rectangle sceneRect = new Rectangle(
			client.getBaseX() + 1, client.getBaseY() + 1,
			Constants.SCENE_SIZE - 2, Constants.SCENE_SIZE - 2);

		// Generate lines for multicombat zones
		if (config.multicombatZoneVisibility() == ZoneVisibility.HIDE)
		{
			for (int i = 0; i < multicombatPathToDisplay.length; i++)
			{
				multicombatPathToDisplay[i] = null;
			}
		}
		else
		{
			for (int i = 0; i < multicombatPathToDisplay.length; i++)
			{
				currentPlane = i;

				GeneralPath lines = new GeneralPath(MapLocations.getMulticombat(sceneRect, i));
				lines = Geometry.clipPath(lines, sceneRect);
				if (config.multicombatZoneVisibility() == ZoneVisibility.SHOW_IN_PVP &&
					!isInDeadman() && !isInPvp())
				{
					lines = Geometry.clipPath(lines, MapLocations.getRoughWilderness(i));
				}
				lines = Geometry.splitIntoSegments(lines, 1);

				lines = Geometry.transformPath(lines, this::transformWorldToLocal);
				multicombatPathToDisplay[i] = lines;
			}
		}

		// Generate safezone lines for deadman/pvp worlds
		for (int i = 0; i < pvpPathToDisplay.length; i++)
		{
			currentPlane = i;

			GeneralPath safeZonePath = null;
			if (config.showDeadmanSafeZones() && isInDeadman())
			{
				safeZonePath = new GeneralPath(MapLocations.getDeadmanSafeZones(sceneRect, i));
			}
			else if (config.showPvpSafeZones() && isInPvp())
			{
				safeZonePath = new GeneralPath(MapLocations.getPvpSafeZones(sceneRect, i));
			}
			if (safeZonePath != null)
			{
				safeZonePath = Geometry.clipPath(safeZonePath, sceneRect);
				safeZonePath = Geometry.splitIntoSegments(safeZonePath, 1);
				safeZonePath = Geometry.transformPath(safeZonePath, this::transformWorldToLocal);
			}
			pvpPathToDisplay[i] = safeZonePath;
		}
		long endTime = System.currentTimeMillis();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getKey().equals("multicombatZoneVisibility") ||
			event.getKey().equals("deadmanSafeZones") ||
			event.getKey().equals("pvpSafeZones"))
		{
			findLinesInScene();
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGGED_IN)
		{
			findLinesInScene();
		}
	}
}
