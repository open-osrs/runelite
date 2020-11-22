package net.runelite.api;

/**
 * Represents a frame of animation data. Each animation frame will have its own animation animation data.
 */
public interface Animation
{
	Skeleton getSkeleton();

	/**
	 * the number of transformations the animation frame has.
	 */
	int getTransformCount();

	/**
	 * this variable name is incorrect. it is an array of bone ids. not transform types.
	 * this array has a one to one relation ship with the arrays of translator values (X, Y and Z) in the animation frame.
	 * in other words, it is the array of bones that the animation translator values translate.
	 */
	int[] getTransformTypes();

	/**
	 * these are x, y, and z values, which tell the transform function how much to transform the model in an animation frame.
	 */
	int[] getTranslatorX();

	int[] getTranslatorY();

	int[] getTranslatorZ();

	/**
	 * whether this Animation frame has any alpha/transparency animation.
	 */
	boolean isShowing();
}
