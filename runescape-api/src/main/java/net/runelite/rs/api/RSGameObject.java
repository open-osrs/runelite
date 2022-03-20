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

	@Import("z")
	int getZ();

	@Import("orientation")
	int getModelOrientation();

	@Import("tag")
	@Override
	long getHash();

	@Import("flags")
	@Override
	int getConfig();

	int getPlane();

	void setPlane(int plane);
}
