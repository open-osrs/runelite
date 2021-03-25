package net.runelite.api;

public interface DynamicObject extends Renderable
{
	int getAnimationID();

	/**
	 * Get the index of the AnimFrame (the index as it appears in the sequenceDefinition "frames" array).
	 */
	int getAnimFrame();

	/**
	 * Get the number of cycles that have elapsed in the whole animation.
	 */
	int getAnimCycleCount();
}
