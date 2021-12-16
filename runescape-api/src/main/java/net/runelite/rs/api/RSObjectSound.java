package net.runelite.rs.api;

import net.runelite.api.AmbientSoundEffect;
import net.runelite.mapping.Import;

public interface RSObjectSound extends AmbientSoundEffect
{
	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("maxX")
	int getMaxX();

	@Import("maxY")
	int getMaxY();

	@Import("soundEffectId")
	int getSoundEffectId();

	@Import("plane")
	int getPlane();
}
