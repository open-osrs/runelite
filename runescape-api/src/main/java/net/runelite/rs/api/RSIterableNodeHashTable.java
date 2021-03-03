package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.mapping.Import;

public interface RSIterableNodeHashTable extends IterableHashTable
{
	@Import("get")
	@Override
	RSNode get(long hash);

	@Import("put")
	@Override
	void put(Node node, long hash);
}
