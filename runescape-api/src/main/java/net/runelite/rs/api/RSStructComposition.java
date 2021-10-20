package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.StructComposition;
import net.runelite.mapping.Import;

public interface RSStructComposition extends StructComposition
{
	int getId();
	void setId(int id);

	@Import("params")
	RSIterableNodeHashTable getParams();

	@Import("params")
	void setParams(IterableHashTable params);

	@Import("params")
	void setParams(RSIterableNodeHashTable params);
}
