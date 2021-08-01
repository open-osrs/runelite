/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
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
package net.runelite.mixins;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.CollisionData;
import net.runelite.api.CollisionDataFlag;
import net.runelite.api.Constants;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.Node;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.DecorativeObjectChanged;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectChanged;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.WallObjectChanged;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSBoundaryObject;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFloorDecoration;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSGraphicsObject;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSTileItem;
import net.runelite.rs.api.RSWallDecoration;
import org.slf4j.Logger;

@Mixin(RSTile.class)
public abstract class RSTileMixin implements RSTile
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static RSGameObject lastGameObject;

	@Inject
	private static RSNodeDeque[][][] lastGroundItems = new RSNodeDeque[Constants.MAX_Z][Constants.SCENE_SIZE][Constants.SCENE_SIZE];

	@Inject
	private WallObject previousWallObject;

	@Inject
	private DecorativeObject previousDecorativeObject;

	@Inject
	private GroundObject previousGroundObject;

	@Inject
	private RSGameObject[] previousGameObjects;

	@Inject
	@Override
	public WorldPoint getWorldLocation()
	{
		return WorldPoint.fromScene(client, getX(), getY(), getPlane());
	}

	@Inject
	@Override
	public Point getSceneLocation()
	{
		return new Point(getX(), getY());
	}

	@Inject
	@Override
	public LocalPoint getLocalLocation()
	{
		return LocalPoint.fromScene(getX(), getY());
	}

	@Inject
	@Override
	public boolean hasLineOfSightTo(Tile other)
	{
		// Thanks to Henke for this method :)

		if (this.getPlane() != other.getPlane())
		{
			return false;
		}

		CollisionData[] collisionData = client.getCollisionMaps();
		if (collisionData == null)
		{
			return false;
		}

		int z = this.getPlane();
		int[][] collisionDataFlags = collisionData[z].getFlags();

		Point p1 = this.getSceneLocation();
		Point p2 = other.getSceneLocation();
		if (p1.getX() == p2.getX() && p1.getY() == p2.getY())
		{
			return true;
		}

		int dx = p2.getX() - p1.getX();
		int dy = p2.getY() - p1.getY();
		int dxAbs = Math.abs(dx);
		int dyAbs = Math.abs(dy);

		int xFlags = CollisionDataFlag.BLOCK_LINE_OF_SIGHT_FULL;
		int yFlags = CollisionDataFlag.BLOCK_LINE_OF_SIGHT_FULL;
		if (dx < 0)
		{
			xFlags |= CollisionDataFlag.BLOCK_LINE_OF_SIGHT_EAST;
		}
		else
		{
			xFlags |= CollisionDataFlag.BLOCK_LINE_OF_SIGHT_WEST;
		}
		if (dy < 0)
		{
			yFlags |= CollisionDataFlag.BLOCK_LINE_OF_SIGHT_NORTH;
		}
		else
		{
			yFlags |= CollisionDataFlag.BLOCK_LINE_OF_SIGHT_SOUTH;
		}

		if (dxAbs > dyAbs)
		{
			int x = p1.getX();
			int yBig = p1.getY() << 16; // The y position is represented as a bigger number to handle rounding
			int slope = (dy << 16) / dxAbs;
			yBig += 0x8000; // Add half of a tile
			if (dy < 0)
			{
				yBig--; // For correct rounding
			}
			int direction = dx < 0 ? -1 : 1;

			while (x != p2.getX())
			{
				x += direction;
				int y = yBig >>> 16;
				if ((collisionDataFlags[x][y] & xFlags) != 0)
				{
					// Collision while traveling on the x axis
					return false;
				}
				yBig += slope;
				int nextY = yBig >>> 16;
				if (nextY != y && (collisionDataFlags[x][nextY] & yFlags) != 0)
				{
					// Collision while traveling on the y axis
					return false;
				}
			}
		}
		else
		{
			int y = p1.getY();
			int xBig = p1.getX() << 16; // The x position is represented as a bigger number to handle rounding
			int slope = (dx << 16) / dyAbs;
			xBig += 0x8000; // Add half of a tile
			if (dx < 0)
			{
				xBig--; // For correct rounding
			}
			int direction = dy < 0 ? -1 : 1;

			while (y != p2.getY())
			{
				y += direction;
				int x = xBig >>> 16;
				if ((collisionDataFlags[x][y] & yFlags) != 0)
				{
					// Collision while traveling on the y axis
					return false;
				}
				xBig += slope;
				int nextX = xBig >>> 16;
				if (nextX != x && (collisionDataFlags[nextX][y] & xFlags) != 0)
				{
					// Collision while traveling on the x axis
					return false;
				}
			}
		}

		// No collision
		return true;
	}

	@Inject
	@Override
	public List<Tile> pathTo(Tile other)
	{

		int z = this.getPlane();
		if (z != other.getPlane())
		{
			return null;
		}

		CollisionData[] collisionData = client.getCollisionMaps();
		if (collisionData == null)
		{
			return null;
		}

		int[][] directions = new int[128][128];
		int[][] distances = new int[128][128];
		int[] bufferX = new int[4096];
		int[] bufferY = new int[4096];

		// Initialise directions and distances
		for (int i = 0; i < 128; ++i)
		{
			for (int j = 0; j < 128; ++j)
			{
				directions[i][j] = 0;
				distances[i][j] = Integer.MAX_VALUE;
			}
		}

		Point p1 = this.getSceneLocation();
		Point p2 = other.getSceneLocation();

		int middleX = p1.getX();
		int middleY = p1.getY();
		int currentX = middleX;
		int currentY = middleY;
		int offsetX = 64;
		int offsetY = 64;
		// Initialise directions and distances for starting tile
		directions[offsetX][offsetY] = 99;
		distances[offsetX][offsetY] = 0;
		int index1 = 0;
		bufferX[0] = currentX;
		int index2 = 1;
		bufferY[0] = currentY;
		int[][] collisionDataFlags = collisionData[z].getFlags();

		boolean isReachable = false;

		while (index1 != index2)
		{
			currentX = bufferX[index1];
			currentY = bufferY[index1];
			index1 = index1 + 1 & 4095;
			// currentX is for the local coordinate while currentMapX is for the index in the directions and distances arrays
			int currentMapX = currentX - middleX + offsetX;
			int currentMapY = currentY - middleY + offsetY;
			if ((currentX == p2.getX()) && (currentY == p2.getY()))
			{
				isReachable = true;
				break;
			}

			int currentDistance = distances[currentMapX][currentMapY] + 1;
			if (currentMapX > 0 && directions[currentMapX - 1][currentMapY] == 0 && (collisionDataFlags[currentX - 1][currentY] & 19136776) == 0)
			{
				// Able to move 1 tile west
				bufferX[index2] = currentX - 1;
				bufferY[index2] = currentY;
				index2 = index2 + 1 & 4095;
				directions[currentMapX - 1][currentMapY] = 2;
				distances[currentMapX - 1][currentMapY] = currentDistance;
			}

			if (currentMapX < 127 && directions[currentMapX + 1][currentMapY] == 0 && (collisionDataFlags[currentX + 1][currentY] & 19136896) == 0)
			{
				// Able to move 1 tile east
				bufferX[index2] = currentX + 1;
				bufferY[index2] = currentY;
				index2 = index2 + 1 & 4095;
				directions[currentMapX + 1][currentMapY] = 8;
				distances[currentMapX + 1][currentMapY] = currentDistance;
			}

			if (currentMapY > 0 && directions[currentMapX][currentMapY - 1] == 0 && (collisionDataFlags[currentX][currentY - 1] & 19136770) == 0)
			{
				// Able to move 1 tile south
				bufferX[index2] = currentX;
				bufferY[index2] = currentY - 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX][currentMapY - 1] = 1;
				distances[currentMapX][currentMapY - 1] = currentDistance;
			}

			if (currentMapY < 127 && directions[currentMapX][currentMapY + 1] == 0 && (collisionDataFlags[currentX][currentY + 1] & 19136800) == 0)
			{
				// Able to move 1 tile north
				bufferX[index2] = currentX;
				bufferY[index2] = currentY + 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX][currentMapY + 1] = 4;
				distances[currentMapX][currentMapY + 1] = currentDistance;
			}

			if (currentMapX > 0 && currentMapY > 0 && directions[currentMapX - 1][currentMapY - 1] == 0 && (collisionDataFlags[currentX - 1][currentY - 1] & 19136782) == 0 && (collisionDataFlags[currentX - 1][currentY] & 19136776) == 0 && (collisionDataFlags[currentX][currentY - 1] & 19136770) == 0)
			{
				// Able to move 1 tile south-west
				bufferX[index2] = currentX - 1;
				bufferY[index2] = currentY - 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX - 1][currentMapY - 1] = 3;
				distances[currentMapX - 1][currentMapY - 1] = currentDistance;
			}

			if (currentMapX < 127 && currentMapY > 0 && directions[currentMapX + 1][currentMapY - 1] == 0 && (collisionDataFlags[currentX + 1][currentY - 1] & 19136899) == 0 && (collisionDataFlags[currentX + 1][currentY] & 19136896) == 0 && (collisionDataFlags[currentX][currentY - 1] & 19136770) == 0)
			{
				// Able to move 1 tile north-west
				bufferX[index2] = currentX + 1;
				bufferY[index2] = currentY - 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX + 1][currentMapY - 1] = 9;
				distances[currentMapX + 1][currentMapY - 1] = currentDistance;
			}

			if (currentMapX > 0 && currentMapY < 127 && directions[currentMapX - 1][currentMapY + 1] == 0 && (collisionDataFlags[currentX - 1][currentY + 1] & 19136824) == 0 && (collisionDataFlags[currentX - 1][currentY] & 19136776) == 0 && (collisionDataFlags[currentX][currentY + 1] & 19136800) == 0)
			{
				// Able to move 1 tile south-east
				bufferX[index2] = currentX - 1;
				bufferY[index2] = currentY + 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX - 1][currentMapY + 1] = 6;
				distances[currentMapX - 1][currentMapY + 1] = currentDistance;
			}

			if (currentMapX < 127 && currentMapY < 127 && directions[currentMapX + 1][currentMapY + 1] == 0 && (collisionDataFlags[currentX + 1][currentY + 1] & 19136992) == 0 && (collisionDataFlags[currentX + 1][currentY] & 19136896) == 0 && (collisionDataFlags[currentX][currentY + 1] & 19136800) == 0)
			{
				// Able to move 1 tile north-east
				bufferX[index2] = currentX + 1;
				bufferY[index2] = currentY + 1;
				index2 = index2 + 1 & 4095;
				directions[currentMapX + 1][currentMapY + 1] = 12;
				distances[currentMapX + 1][currentMapY + 1] = currentDistance;
			}
		}
		if (!isReachable)
		{
			// Try find a different reachable tile in the 21x21 area around the target tile, as close as possible to the target tile
			int upperboundDistance = Integer.MAX_VALUE;
			int pathLength = Integer.MAX_VALUE;
			int checkRange = 10;
			int approxDestinationX = p2.getX();
			int approxDestinationY = p2.getY();
			for (int i = approxDestinationX - checkRange; i <= checkRange + approxDestinationX; ++i)
			{
				for (int j = approxDestinationY - checkRange; j <= checkRange + approxDestinationY; ++j)
				{
					int currentMapX = i - middleX + offsetX;
					int currentMapY = j - middleY + offsetY;
					if (currentMapX >= 0 && currentMapY >= 0 && currentMapX < 128 && currentMapY < 128 && distances[currentMapX][currentMapY] < 100)
					{
						int deltaX = 0;
						if (i < approxDestinationX)
						{
							deltaX = approxDestinationX - i;
						}
						else if (i > approxDestinationX)
						{
							deltaX = i - (approxDestinationX);
						}

						int deltaY = 0;
						if (j < approxDestinationY)
						{
							deltaY = approxDestinationY - j;
						}
						else if (j > approxDestinationY)
						{
							deltaY = j - (approxDestinationY);
						}

						int distanceSquared = deltaX * deltaX + deltaY * deltaY;
						if (distanceSquared < upperboundDistance || distanceSquared == upperboundDistance && distances[currentMapX][currentMapY] < pathLength)
						{
							upperboundDistance = distanceSquared;
							pathLength = distances[currentMapX][currentMapY];
							currentX = i;
							currentY = j;
						}
					}
				}
			}
			if (upperboundDistance == Integer.MAX_VALUE)
			{
				// No path found
				return null;
			}
		}

		// Getting path from directions and distances
		bufferX[0] = currentX;
		bufferY[0] = currentY;
		int index = 1;
		int directionNew;
		int directionOld;
		for (directionNew = directionOld = directions[currentX - middleX + offsetX][currentY - middleY + offsetY]; p1.getX() != currentX || p1.getY() != currentY; directionNew = directions[currentX - middleX + offsetX][currentY - middleY + offsetY])
		{
			if (directionNew != directionOld)
			{
				// "Corner" of the path --> new checkpoint tile
				directionOld = directionNew;
				bufferX[index] = currentX;
				bufferY[index++] = currentY;
			}

			if ((directionNew & 2) != 0)
			{
				++currentX;
			}
			else if ((directionNew & 8) != 0)
			{
				--currentX;
			}

			if ((directionNew & 1) != 0)
			{
				++currentY;
			}
			else if ((directionNew & 4) != 0)
			{
				--currentY;
			}
		}

		int checkpointTileNumber = 1;
		Tile[][][] tiles = client.getScene().getTiles();
		List<Tile> checkpointTiles = new ArrayList<>();
		while (index-- > 0)
		{
			checkpointTiles.add(tiles[this.getPlane()][bufferX[index]][bufferY[index]]);
			if (checkpointTileNumber == 25)
			{
				// Pathfinding only supports up to the 25 first checkpoint tiles
				break;
			}
			checkpointTileNumber++;
		}
		return checkpointTiles;
	}

	@Inject
	@Override
	public List<TileItem> getGroundItems()
	{
		ItemLayer layer = this.getItemLayer();
		if (layer == null)
		{
			return null;
		}

		List<TileItem> result = new ArrayList<TileItem>();
		Node node = layer.getBottom();
		while (node instanceof RSTileItem)
		{
			RSTileItem item = (RSTileItem) node;
			item.setX(getX());
			item.setY(getY());
			result.add(item);
			node = node.getNext();
		}
		return result;
	}

	@FieldHook("boundaryObject")
	@Inject
	public void wallObjectChanged(int idx)
	{
		WallObject previous = previousWallObject;
		RSBoundaryObject current = (RSBoundaryObject) getWallObject();

		previousWallObject = current;

		if (current != null)
		{
			int plane = getRenderLevel();

			if ((client.getTileSettings()[1][getX()][getY()] & 2) == 2)
			{
				plane--;
			}

			current.setPlane(plane);
		}

		if (current == null && previous != null)
		{
			WallObjectDespawned wallObjectDespawned = new WallObjectDespawned();
			wallObjectDespawned.setTile(this);
			wallObjectDespawned.setWallObject(previous);
			client.getCallbacks().post(wallObjectDespawned);
		}
		else if (current != null && previous == null)
		{
			WallObjectSpawned wallObjectSpawned = new WallObjectSpawned();
			wallObjectSpawned.setTile(this);
			wallObjectSpawned.setWallObject(current);
			client.getCallbacks().post(wallObjectSpawned);
		}
		else if (current != null)
		{
			WallObjectChanged wallObjectChanged = new WallObjectChanged();
			wallObjectChanged.setTile(this);
			wallObjectChanged.setPrevious(previous);
			wallObjectChanged.setWallObject(current);
			client.getCallbacks().post(wallObjectChanged);
		}
	}

	@FieldHook("wallDecoration")
	@Inject
	public void decorativeObjectChanged(int idx)
	{
		DecorativeObject previous = previousDecorativeObject;
		RSWallDecoration current = (RSWallDecoration) getDecorativeObject();

		previousDecorativeObject = current;

		if (current != null)
		{
			int plane = getRenderLevel();

			if ((client.getTileSettings()[1][getX()][getY()] & 2) == 2)
			{
				plane--;
			}

			current.setPlane(plane);
		}

		if (current == null && previous != null)
		{
			DecorativeObjectDespawned decorativeObjectDespawned = new DecorativeObjectDespawned();
			decorativeObjectDespawned.setTile(this);
			decorativeObjectDespawned.setDecorativeObject(previous);
			client.getCallbacks().post(decorativeObjectDespawned);
		}
		else if (current != null && previous == null)
		{
			DecorativeObjectSpawned decorativeObjectSpawned = new DecorativeObjectSpawned();
			decorativeObjectSpawned.setTile(this);
			decorativeObjectSpawned.setDecorativeObject(current);
			client.getCallbacks().post(decorativeObjectSpawned);
		}
		else if (current != null)
		{
			DecorativeObjectChanged decorativeObjectChanged = new DecorativeObjectChanged();
			decorativeObjectChanged.setTile(this);
			decorativeObjectChanged.setPrevious(previous);
			decorativeObjectChanged.setDecorativeObject(current);
			client.getCallbacks().post(decorativeObjectChanged);
		}
	}

	@FieldHook("floorDecoration")
	@Inject
	public void groundObjectChanged(int idx)
	{
		GroundObject previous = previousGroundObject;
		RSFloorDecoration current = (RSFloorDecoration) getGroundObject();

		previousGroundObject = current;

		if (current != null)
		{
			int plane = getRenderLevel();

			if ((client.getTileSettings()[1][getX()][getY()] & 2) == 2)
			{
				plane--;
			}

			current.setPlane(plane);
		}

		if (current == null && previous != null)
		{
			GroundObjectDespawned groundObjectDespawned = new GroundObjectDespawned();
			groundObjectDespawned.setTile(this);
			groundObjectDespawned.setGroundObject(previous);
			client.getCallbacks().post(groundObjectDespawned);
		}
		else if (current != null && previous == null)
		{
			GroundObjectSpawned groundObjectSpawned = new GroundObjectSpawned();
			groundObjectSpawned.setTile(this);
			groundObjectSpawned.setGroundObject(current);
			client.getCallbacks().post(groundObjectSpawned);
		}
		else if (current != null)
		{
			GroundObjectChanged groundObjectChanged = new GroundObjectChanged();
			groundObjectChanged.setTile(this);
			groundObjectChanged.setPrevious(previous);
			groundObjectChanged.setGroundObject(current);
			client.getCallbacks().post(groundObjectChanged);
		}
	}

	@FieldHook("gameObjects")
	@Inject
	public void gameObjectsChanged(int idx)
	{
		if (idx == -1) // this happens from the field assignment
		{
			return;
		}

		if (previousGameObjects == null)
		{
			previousGameObjects = new RSGameObject[5];
		}

		// Previous game object
		RSGameObject previous = previousGameObjects[idx];

		// GameObject that was changed.
		RSGameObject current = (RSGameObject) getGameObjects()[idx];

		// Update previous object to current
		previousGameObjects[idx] = current;

		if (current != null)
		{
			int plane = getRenderLevel();

			if ((client.getTileSettings()[1][getX()][getY()] & 2) == 2)
			{
				plane--;
			}

			current.setPlane(plane);
		}

		// Duplicate event, return
		if (current == previous)
		{
			return;
		}

		// actors, projectiles, and graphics objects are added and removed from the scene each frame as GameObjects,
		// so ignore them.
		boolean currentInvalid = false, prevInvalid = false;
		if (current != null)
		{
			RSRenderable renderable = current.getRenderable();
			currentInvalid = renderable instanceof RSActor || renderable instanceof RSProjectile || renderable instanceof RSGraphicsObject;
			currentInvalid |= current.getStartX() != this.getX() || current.getStartY() != this.getY();
		}

		if (previous != null)
		{
			RSRenderable renderable = previous.getRenderable();
			prevInvalid = renderable instanceof RSActor || renderable instanceof RSProjectile || renderable instanceof RSGraphicsObject;
			prevInvalid |= previous.getStartX() != this.getX() || previous.getStartY() != this.getY();
		}

		Logger logger = client.getLogger();
		if (current == null)
		{
			if (prevInvalid)
			{
				return;
			}

			logger.trace("Game object despawn: {}", previous.getId());

			GameObjectDespawned gameObjectDespawned = new GameObjectDespawned();
			gameObjectDespawned.setTile(this);
			gameObjectDespawned.setGameObject(previous);
			client.getCallbacks().post(gameObjectDespawned);
		}
		else if (previous == null)
		{
			if (currentInvalid)
			{
				return;
			}

			logger.trace("Game object spawn: {}", current.getId());

			GameObjectSpawned gameObjectSpawned = new GameObjectSpawned();
			gameObjectSpawned.setTile(this);
			gameObjectSpawned.setGameObject(current);
			client.getCallbacks().post(gameObjectSpawned);
		}
		else
		{
			if (currentInvalid && prevInvalid)
			{
				return;
			}

			logger.trace("Game object change: {} -> {}", previous.getId(), current.getId());

			GameObjectChanged gameObjectsChanged = new GameObjectChanged();
			gameObjectsChanged.setTile(this);
			gameObjectsChanged.setPrevious(previous);
			gameObjectsChanged.setGameObject(current);
			client.getCallbacks().post(gameObjectsChanged);
		}
	}

	@FieldHook("itemLayer")
	@Inject
	public void itemLayerChanged(int idx)
	{
		int x = getX();
		int y = getY();
		int z = client.getPlane();
		RSNodeDeque[][][] groundItemDeque = client.getGroundItemDeque();

		RSNodeDeque oldQueue = lastGroundItems[z][x][y];
		RSNodeDeque newQueue = groundItemDeque[z][x][y];

		if (client.getGameState() != GameState.LOGGED_IN)
		{
			lastGroundItems[z][x][y] = newQueue;
			client.setLastItemDespawn(null);
			return;
		}

		if (oldQueue != newQueue)
		{
			if (oldQueue != null)
			{
				// despawn everything in old ..
				RSNode head = oldQueue.getSentinel();
				for (RSNode cur = head.getNext(); cur != head; cur = cur.getNext())
				{
					RSTileItem item = (RSTileItem) cur;
					ItemDespawned itemDespawned = new ItemDespawned(this, item);
					client.getCallbacks().post(itemDespawned);
				}
			}
			lastGroundItems[z][x][y] = newQueue;
		}

		RSTileItem lastUnlink = client.getLastItemDespawn();
		if (lastUnlink != null)
		{
			client.setLastItemDespawn(null);
		}

		RSItemLayer itemLayer = (RSItemLayer) getItemLayer();
		if (itemLayer == null)
		{
			if (lastUnlink != null)
			{
				ItemDespawned itemDespawned = new ItemDespawned(this, lastUnlink);
				client.getCallbacks().post(itemDespawned);
			}
			return;
		}

		if (newQueue == null)
		{
			if (lastUnlink != null)
			{
				ItemDespawned itemDespawned = new ItemDespawned(this, lastUnlink);
				client.getCallbacks().post(itemDespawned);
			}
			return;
		}

		// The new item gets added to either the head, or the tail, depending on its price
		RSNode head = newQueue.getSentinel();
		RSTileItem current = null;
		RSNode next = head.getPrevious();
		//boolean forward = false;
		if (head != next)
		{
			RSTileItem prev = (RSTileItem) next;
			if (x != prev.getX() || y != prev.getY())
			{
				current = prev;
			}
		}

		RSNode previous = head.getNext();
		if (current == null && head != previous)
		{
			RSTileItem n = (RSTileItem) previous;
			if (x != n.getX() || y != n.getY())
			{
				current = n;
				//forward = true;
			}
		}

		if (lastUnlink != null && lastUnlink != next && lastUnlink != previous)
		{
			ItemDespawned itemDespawned = new ItemDespawned(this, lastUnlink);
			client.getCallbacks().post(itemDespawned);
		}

		if (current != null)
		{
			current.setX(x);
			current.setY(y);
			ItemSpawned event = new ItemSpawned(this, current);
			client.getCallbacks().post(event);
		}
	}
}
