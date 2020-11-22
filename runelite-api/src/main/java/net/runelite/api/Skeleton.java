package net.runelite.api;

/**
 * Represents a Skeleton.
 * When calculating a model's pose in a animation frame, the skeleton is used to link vertices to animation values.
 */
public interface Skeleton extends Node
{
	/**
	 * the number of bones in the Skeleton
	 */
	int getCount();

	/**
	 * the transform type of each bone
	 * The possible transform types are as follows:
	 * 0 (set pivot point)
	 * 1 (translate)
	 * 2 (rotate)
	 * 3 (scale)
	 * 5 (alpha/transparency)
	 */
	int[] getTypes();

	/**
	 * Each bone is linked to a list of vertex skins. [bone id][list of vertex skins]
	 * if a vertex's skin is linked to a bone, the vertex can be transformed by that bone.
	 */
	int[][] getList();
}
