package net.runelite.rs.api;

import net.runelite.api.ObjectComposition;
import net.runelite.mapping.Import;

public interface RSObjectComposition extends ObjectComposition
{
	@Import("id")
	@Override
	int getId();

	@Import("name")
	@Override
	String getName();

	@Import("actions")
	@Override
	String[] getActions();

	@Import("mapSceneId")
	@Override
	int getMapSceneId();

	@Import("mapIconId")
	@Override
	int getMapIconId();

	@Import("transforms")
	@Override
	int[] getImpostorIds();

	@Import("transform")
	@Override
	RSObjectComposition getImpostor();

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(RSIterableNodeHashTable params);
}
