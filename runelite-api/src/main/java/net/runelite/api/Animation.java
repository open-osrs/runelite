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
	 * this array has a one to one relationship with the arrays of translator values in the animation frame(TranslatorX getTranslatorY TranslatorZ).
	 * it is the array of bone ids which point each translator value to the bone it should be transforming.
	 */
	int[] getTransformTypes();

	/**
	 * these are x, y, and z values, which tell the transform function how much to transform the each bone.
	 */
	int[] getTranslatorX();

	int[] getTranslatorY();

	int[] getTranslatorZ();

	/**
	 * whether this Animation frame has any alpha/transparency animation.
	 */
	boolean isShowing();
}
