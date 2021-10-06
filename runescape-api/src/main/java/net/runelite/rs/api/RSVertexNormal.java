package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSVertexNormal
{
	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("z")
	int getZ();
}
