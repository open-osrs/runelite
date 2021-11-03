package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSObjectSound
{
	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("maxY")
	int getMaxX();

	@Import("maxY")
	int getMaxY();

	@Import("soundEffectId")
	int getSoundEffectId();

	@Import("plane")
	int getPlane();
}
