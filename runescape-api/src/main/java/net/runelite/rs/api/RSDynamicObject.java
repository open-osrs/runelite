package net.runelite.rs.api;

import net.runelite.api.DynamicObject;
import net.runelite.api.Entity;
import net.runelite.api.mixins.Copy;
import net.runelite.mapping.Import;

public interface RSDynamicObject extends RSEntity, DynamicObject, Entity
{
	@Import("id")
	int getId();

	@Import("frame")
	@Copy("getAnimationFrame")
	int getAnimFrame();

	@Import("frame")
	void setAnimFrame(int frame);

	@Import("cycleStart")
	@Copy("getAnimCycleCount")
	int getAnimCycleCount();
}
