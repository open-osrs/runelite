/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.plugins.objectindicators;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Provides;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import static net.runelite.api.Constants.REGION_SIZE;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuOpcode;
import net.runelite.api.ObjectDefinition;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.FocusChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.WallObjectChanged;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Object Markers",
	description = "Enable marking of objects using the Shift key",
	tags = {"overlay", "objects", "mark", "marker"},
	enabledByDefault = false
)
@Singleton
@Slf4j
public class ObjectIndicatorsPlugin extends Plugin implements KeyListener
{
	private static final String CONFIG_GROUP = "objectindicators";
	private static final String MARK = "Mark object";
	private static final String UNMARK = "Unmark object";

	private final Gson GSON = new Gson();
	@Getter(AccessLevel.PACKAGE)
	private final List<TileObject> objects = new ArrayList<>();
	private final Map<Integer, Set<ObjectPoint>> points = new HashMap<>();
	private boolean hotKeyPressed;

	@Inject
	private Client client;

	@Inject
	private ConfigManager configManager;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private ObjectIndicatorsOverlay overlay;

	@Inject
	private ObjectIndicatorsConfig config;

	@Inject
	private KeyManager keyManager;

	@Inject
	private EventBus eventbus;

	@Getter(AccessLevel.PACKAGE)
	private RenderStyle objectMarkerRenderStyle;
	@Getter(AccessLevel.PACKAGE)
	private OutlineRenderStyle objectMarkerOutlineRenderStyle;
	@Getter(AccessLevel.PACKAGE)
	private Color objectMarkerColor;
	@Getter(AccessLevel.PACKAGE)
	private int objectMarkerAlpha;

	@Provides
	ObjectIndicatorsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ObjectIndicatorsConfig.class);
	}

	@Override
	protected void startUp()
	{
		updateConfig();
		addSubscriptions();

		overlayManager.add(overlay);
		keyManager.registerKeyListener(this);
	}

	@Override
	protected void shutDown()
	{
		eventbus.unregister(this);

		overlayManager.remove(overlay);
		keyManager.unregisterKeyListener(this);
		points.clear();
		objects.clear();
		hotKeyPressed = false;
	}

	private void addSubscriptions()
	{
		eventbus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
		eventbus.subscribe(FocusChanged.class, this, this::onFocusChanged);
		eventbus.subscribe(WallObjectSpawned.class, this, this::onWallObjectSpawned);
		eventbus.subscribe(WallObjectChanged.class, this, this::onWallObjectChanged);
		eventbus.subscribe(WallObjectDespawned.class, this, this::onWallObjectDespawned);
		eventbus.subscribe(GameObjectSpawned.class, this, this::onGameObjectSpawned);
		eventbus.subscribe(DecorativeObjectSpawned.class, this, this::onDecorativeObjectSpawned);
		eventbus.subscribe(GameObjectDespawned.class, this, this::onGameObjectDespawned);
		eventbus.subscribe(DecorativeObjectDespawned.class, this, this::onDecorativeObjectDespawned);
		eventbus.subscribe(GroundObjectDespawned.class, this, this::onGroundObjectDespawned);
		eventbus.subscribe(GroundObjectSpawned.class, this, this::onGroundObjectSpawned);
		eventbus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		eventbus.subscribe(MenuOptionClicked.class, this, this::onMenuOptionClicked);
		eventbus.subscribe(MenuEntryAdded.class, this, this::onMenuEntryAdded);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			hotKeyPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			hotKeyPressed = false;
		}
	}

	private void onFocusChanged(final FocusChanged event)
	{
		if (!event.isFocused())
		{
			hotKeyPressed = false;
		}
	}

	private void onWallObjectSpawned(WallObjectSpawned event)
	{
		checkObjectPoints(event.getWallObject());
	}

	private void onWallObjectChanged(WallObjectChanged event)
	{
		WallObject previous = event.getPrevious();
		WallObject wallObject = event.getWallObject();

		objects.remove(previous);
		checkObjectPoints(wallObject);
	}

	private void onWallObjectDespawned(WallObjectDespawned event)
	{
		objects.remove(event.getWallObject());
	}

	private void onGameObjectSpawned(GameObjectSpawned event)
	{
		final GameObject eventObject = event.getGameObject();
		checkObjectPoints(eventObject);
	}

	private void onDecorativeObjectSpawned(DecorativeObjectSpawned event)
	{
		final DecorativeObject eventObject = event.getDecorativeObject();
		checkObjectPoints(eventObject);
	}

	private void onGameObjectDespawned(GameObjectDespawned event)
	{
		objects.remove(event.getGameObject());
	}

	private void onDecorativeObjectDespawned(DecorativeObjectDespawned event)
	{
		objects.remove(event.getDecorativeObject());
	}

	private void onGroundObjectSpawned(GroundObjectSpawned groundObjectSpawned)
	{
		final GroundObject groundObject = groundObjectSpawned.getGroundObject();
		checkObjectPoints(groundObject);
	}

	private void onGroundObjectDespawned(GroundObjectDespawned groundObjectDespawned)
	{
		GroundObject groundObject = groundObjectDespawned.getGroundObject();
		objects.remove(groundObject);
	}

	private void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		GameState gameState = gameStateChanged.getGameState();
		if (gameState == GameState.LOADING)
		{
			// Reload points with new map regions

			points.clear();
			for (int regionId : client.getMapRegions())
			{
				// load points for region
				final Set<ObjectPoint> regionPoints = loadPoints(regionId);
				if (regionPoints != null)
				{
					points.put(regionId, regionPoints);
				}
			}
		}

		if (gameStateChanged.getGameState() != GameState.LOGGED_IN)
		{
			objects.clear();
		}
	}

	private void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (!hotKeyPressed || event.getOpcode() != MenuOpcode.EXAMINE_OBJECT.getId())
		{
			return;
		}

		final Tile tile = client.getScene().getTiles()[client.getPlane()][event.getParam0()][event.getParam1()];

		MenuEntry[] menuEntries = client.getMenuEntries();
		menuEntries = Arrays.copyOf(menuEntries, menuEntries.length + 1);
		MenuEntry menuEntry = menuEntries[menuEntries.length - 1] = new MenuEntry();

		menuEntry.setOption(objects.contains(findTileObject(tile, event.getIdentifier())) ? UNMARK : MARK);
		menuEntry.setTarget(event.getTarget());
		menuEntry.setParam0(event.getParam0());
		menuEntry.setParam1(event.getParam1());
		menuEntry.setIdentifier(event.getIdentifier());
		menuEntry.setOpcode(MenuOpcode.RUNELITE.getId());
		client.setMenuEntries(menuEntries);
	}

	private void onMenuOptionClicked(MenuOptionClicked event)
	{
		if (event.getMenuOpcode() != MenuOpcode.RUNELITE
			|| !(event.getOption().equals(MARK) || event.getOption().equals(UNMARK)))
		{
			return;
		}

		Scene scene = client.getScene();
		Tile[][][] tiles = scene.getTiles();
		final int x = event.getParam0();
		final int y = event.getParam1();
		final int z = client.getPlane();
		final Tile tile = tiles[z][x][y];

		TileObject object = findTileObject(tile, event.getIdentifier());
		if (object == null)
		{
			return;
		}

		// object.getId() is always the base object id, getObjectComposition transforms it to
		// the correct object we see
		ObjectDefinition objectDefinition = getObjectDefinition(object.getId());
		String name = objectDefinition.getName();
		// Name is probably never "null" - however prevent adding it if it is, as it will
		// become ambiguous as objects with no name are assigned name "null"
		if (Strings.isNullOrEmpty(name) || name.equals("null"))
		{
			return;
		}

		markObject(name, object);
	}

	private void checkObjectPoints(TileObject object)
	{
		final WorldPoint worldPoint = WorldPoint.fromLocalInstance(client, object.getLocalLocation());

		if (worldPoint == null)
		{
			return;
		}

		final Set<ObjectPoint> objectPoints = points.get(worldPoint.getRegionID());

		if (objectPoints == null)
		{
			return;
		}

		for (ObjectPoint objectPoint : objectPoints)
		{
			if ((worldPoint.getX() & (REGION_SIZE - 1)) == objectPoint.getRegionX()
				&& (worldPoint.getY() & (REGION_SIZE - 1)) == objectPoint.getRegionY())
			{
				// Transform object to get the name which matches against what we've stored
				if (objectPoint.getName().equals(getObjectDefinition(object.getId()).getName()))
				{
					log.debug("Marking object {} due to matching {}", object, objectPoint);
					objects.add(object);
					break;
				}
			}
		}
	}

	private TileObject findTileObject(Tile tile, int id)
	{
		if (tile == null)
		{
			return null;
		}

		final GameObject[] tileGameObjects = tile.getGameObjects();
		final DecorativeObject tileDecorativeObject = tile.getDecorativeObject();
		final WallObject tileWallObject = tile.getWallObject();
		final GroundObject groundObject = tile.getGroundObject();

		if (objectIdEquals(tileWallObject, id))
		{
			return tileWallObject;
		}

		if (objectIdEquals(tileDecorativeObject, id))
		{
			return tileDecorativeObject;
		}

		if (objectIdEquals(groundObject, id))
		{
			return groundObject;
		}

		for (GameObject object : tileGameObjects)
		{
			if (objectIdEquals(object, id))
			{
				return object;
			}
		}

		return null;
	}

	private boolean objectIdEquals(TileObject tileObject, int id)
	{
		if (tileObject == null)
		{
			return false;
		}

		if (tileObject.getId() == id)
		{
			return true;
		}

		// Menu action EXAMINE_OBJECT sends the transformed object id, not the base id, unlike
		// all of the GAME_OBJECT_OPTION actions, so check the id against the impostor ids
		final ObjectDefinition comp = client.getObjectDefinition(tileObject.getId());

		if (comp.getImpostorIds() != null)
		{
			for (int impostorId : comp.getImpostorIds())
			{
				if (impostorId == id)
				{
					return true;
				}
			}
		}

		return false;
	}

	private void markObject(String name, final TileObject object)
	{
		if (object == null)
		{
			return;
		}

		final WorldPoint worldPoint = WorldPoint.fromLocalInstance(client, object.getLocalLocation());
		if (worldPoint == null)
		{
			return;
		}
		final int regionId = worldPoint.getRegionID();
		final ObjectPoint point = new ObjectPoint(
			name,
			regionId,
			worldPoint.getX() & (REGION_SIZE - 1),
			worldPoint.getY() & (REGION_SIZE - 1),
			client.getPlane());

		Set<ObjectPoint> objectPoints = points.computeIfAbsent(regionId, k -> new HashSet<>());

		if (objectPoints.contains(point))
		{
			objectPoints.remove(point);
			objects.remove(object);
			log.debug("Unmarking object: {}", point);
		}
		else
		{
			objectPoints.add(point);
			objects.add(object);
			log.debug("Marking object: {}", point);
		}

		savePoints(regionId, objectPoints);
	}

	private void savePoints(final int id, final Set<ObjectPoint> points)
	{
		if (points.isEmpty())
		{
			configManager.unsetConfiguration(CONFIG_GROUP, "region_" + id);
		}
		else
		{
			final String json = GSON.toJson(points);
			configManager.setConfiguration(CONFIG_GROUP, "region_" + id, json);
		}
	}

	private Set<ObjectPoint> loadPoints(final int id)
	{
		final String json = configManager.getConfiguration(CONFIG_GROUP, "region_" + id);

		if (Strings.isNullOrEmpty(json))
		{
			return null;
		}

		Set<ObjectPoint> points = GSON.fromJson(json, new TypeToken<Set<ObjectPoint>>()
		{
		}.getType());
		// Prior to multiloc support the plugin would mark objects named "null", which breaks
		// in most cases due to the specific object being identified being ambiguous, so remove
		// them
		return points.stream()
			.filter(point -> !point.getName().equals("null"))
			.collect(Collectors.toSet());
	}


	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("objectindicators"))
		{
			return;
		}

		updateConfig();
	}

	private void updateConfig()
	{
		this.objectMarkerRenderStyle = config.objectMarkerRenderStyle();
		this.objectMarkerOutlineRenderStyle = config.objectMarkerOutlineRenderStyle();
		this.objectMarkerColor = config.objectMarkerColor();
		this.objectMarkerAlpha = config.objectMarkerAlpha();
	}

	private ObjectDefinition getObjectDefinition(int id)
	{
		ObjectDefinition objectComposition = client.getObjectDefinition(id);
		return objectComposition.getImpostorIds() == null ? objectComposition : objectComposition.getImpostor();
	}
}