package net.runelite.rs.api;

import net.runelite.api.DynamicObject;
import net.runelite.mapping.Import;

public interface RSDynamicObject extends RSRenderable, DynamicObject
{
	@Import("id")
	int getId();

	@Import("frame")
	int getAnimFrame();

	@Import("frame")
	void setAnimFrame(int frame);

	@Import("cycleStart")
	int getAnimCycleCount();

	@Import("sequenceDefinition")
	RSSequenceDefinition getSequenceDefinition();
}
