package net.runelite.rs.api;

import net.runelite.api.ItemLayer;
import net.runelite.mapping.Import;

public interface RSItemLayer extends ItemLayer
{
	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("tag")
	@Override
	long getHash();

	@Import("height")
	int getHeight();

	@Import("first")
	@Override
	RSRenderable getBottom();

	@Import("second")
	@Override
	RSRenderable getMiddle();

	@Import("third")
	@Override
	RSRenderable getTop();

	void setPlane(int plane);
}
