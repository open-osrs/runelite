package net.runelite.rs.api;

import net.runelite.api.NodeCache;
import net.runelite.mapping.Import;

public interface RSEvictingDualNodeHashTable extends NodeCache
{
	@Import("get")
	RSDualNode get(long id);

	@Import("dualNode")
	RSDualNode getDualNode();

	@Import("clear")
	@Override
	void reset();

	@Import("capacity")
	int getCapacity();

	@Import("capacity")
	@Override
	void setCapacity(int capacity);

	@Import("remainingCapacity")
	int getRemainingCapacity();

	@Import("remainingCapacity")
	@Override
	void setRemainingCapacity(int remainingCapacity);

	@Import("deque")
	RSIterableDualNodeQueue getDeque();

	@Import("hashTable")
	void setHashTable(RSIterableNodeHashTable hashTable);

	float getThreshold();

	void setThreshold(float threshold);

	int getTmpCapacity();

	void setTmpCapacity(int tmpCapacity);

	boolean isTrashing();

	void resize(int newSize);

	void increaseCapacity(int newSize);
}
