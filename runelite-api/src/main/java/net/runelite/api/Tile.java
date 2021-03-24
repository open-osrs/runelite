/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api;

import java.util.List;

/**
 * Represents a tile in the game.
 */
public interface Tile extends Locatable
{
	/**
	 * Gets the decoration on the tile.
	 *
	 * @return the tile decoration
	 */
	DecorativeObject getDecorativeObject();

	/**
	 * Sets the object on the decorative layer of the tile.
	 *
	 * @param decorativeObject the decorative object
	 */
	void setDecorativeObject(DecorativeObject decorativeObject);

	/**
	 * Gets all game objects on the tile.
	 *
	 * @return the game objects
	 */
	GameObject[] getGameObjects();

	/**
	 * Gets the items held on this tile.
	 *
	 * @return the item
	 */
	ItemLayer getItemLayer();

	/**
	 * Gets the object on the ground layer of the tile.
	 *
	 * @return the ground object
	 */
	GroundObject getGroundObject();

	/**
	 * Sets the object on the ground layer of the tile.
	 *
	 * @param groundObject the ground object
	 */
	void setGroundObject(GroundObject groundObject);

	/**
	 * Gets the wall of the tile.
	 *
	 * @return the wall object
	 */
	WallObject getWallObject();

	/**
	 * Sets the object on the wall layer of the tile.
	 *
	 * @param wallObject the ground object
	 */
	void setWallObject(WallObject wallObject);

	/**
	 * Gets the scene paint of the tile.
	 *
	 * @return the paint
	 */
	SceneTilePaint getSceneTilePaint();

	/**
	 * Gets the model of the tile in the scene.
	 *
	 * @return the tile model
	 */
	SceneTileModel getSceneTileModel();

	/**
	 * Gets the location coordinate of the tile in scene coords
	 *
	 * @return the scene location
	 */
	Point getSceneLocation();

	/**
	 * Gets the plane that this tile is on.
	 *
	 * @return the plane
	 */
	int getPlane();

	/**
	 * Get the plane this tile is rendered on, which is where the tile heights are from.
	 *
	 * @return
	 */
	int getRenderLevel();

	/**
	 * Get the minimum plane this tile will be rendered on.
	 * Example: This tile is on plane 1. The local player is on plane 0, and hide roofs option is turned on.
	 * If minPlane is 0, this tile will not be rendered.
	 * If minPlane is 1, this tile will be rendered.
	 *
	 * @return the minPlane
	 */
	int getPhysicalLevel();

	/**
	 * Computes and returns whether this tile has line of sight to another.
	 *
	 * @param other the other tile
	 * @return true if there is no sight obstruction, false otherwise
	 */
	boolean hasLineOfSightTo(Tile other);

	/**
	 * Get all the ground items for this tile
	 *
	 * @return the ground items
	 */
	List<TileItem> getGroundItems();

	/**
	 * Return the tile under this one, if this tile is a bridge
	 */
	Tile getBridge();
}
