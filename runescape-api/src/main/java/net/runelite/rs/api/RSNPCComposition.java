package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.NPCComposition;
import net.runelite.mapping.Import;

public interface RSNPCComposition extends NPCComposition
{
	@Import("name")
	@Override
	String getName();

	@Import("models")
	@Override
	int[] getModels();

	@Import("actions")
	@Override
	String[] getActions();

	@Import("isClickable")
	@Override
	boolean isClickable();

	@Import("isFollower")
	@Override
	boolean isFollower();

	@Import("isInteractable")
	@Override
	boolean isInteractible();

	@Import("drawMapDot")
	@Override
	boolean isMinimapVisible();

	@Import("isVisible")
	@Override
	boolean isVisible();

	@Import("id")
	@Override
	int getId();

	@Import("combatLevel")
	@Override
	int getCombatLevel();

	@Import("transforms")
	@Override
	int[] getConfigs();

	@Import("transform")
	@Override
	RSNPCComposition transform();

	@Import("size")
	@Override
	int getSize();

	@Import("headIconPrayer")
	int getRsOverheadIcon();

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("params")
	void setParams(RSIterableNodeHashTable params);
}
