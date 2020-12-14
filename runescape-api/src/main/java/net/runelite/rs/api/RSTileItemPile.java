package net.runelite.rs.api;

import net.runelite.api.TileItemPile;
import net.runelite.mapping.Import;

public interface RSTileItemPile extends TileItemPile
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
