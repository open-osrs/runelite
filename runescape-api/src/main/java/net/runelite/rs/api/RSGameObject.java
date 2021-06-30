package net.runelite.rs.api;

import net.runelite.api.GameObject;
import net.runelite.mapping.Import;

public interface RSGameObject extends GameObject
{
	@Import("renderable")
	RSRenderable getRenderable();

	@Import("startX")
	int getStartX();

	@Import("startY")
	int getStartY();

	@Import("endX")
	int getEndX();

	@Import("endY")
	int getEndY();

	@Import("centerX")
	@Override
	int getX();

	@Import("centerY")
	@Override
	int getY();

	@Import("height")
	int getHeight();

	@Import("orientation")
	int getModelOrientation();

	@Import("tag")
	@Override
	long getHash();

	@Import("flags")
	int getFlags();

	int getPlane();

	void setPlane(int plane);
}
