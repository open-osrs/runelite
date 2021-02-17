package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.mapping.Import;

public interface RSWallDecoration extends DecorativeObject
{
	@Import("tag")
	@Override
	long getHash();

	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("xOffset")
	int getXOffset();

	@Import("yOffset")
	int getYOffset();

	@Import("orientation2")
	int getOrientation();

	@Import("renderable1")
	@Override
	RSRenderable getRenderable();

	@Import("renderable2")
	@Override
	RSRenderable getRenderable2();

	void setPlane(int plane);
}
