package net.runelite.api;

/**
 * Represents animation data. Each animation animation frame will have its own animation animation data.
 */
public interface Animation
{
	Skeleton getSkeleton();

	int getTransformCount();

	int[] getTransformTypes();

	int[] getTranslatorX();

	int[] getTranslatorY();

	int[] getTranslatorZ();

	boolean isShowing();
}
