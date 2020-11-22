package net.runelite.api;
/**
 * Represents animation data. Each animation frame will contain this data set.
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
