package net.runelite.api;

/**
 * A data structure that uses a hash function to compute an index into an
 * array of buckets from which node objects can be quickly obtained.
 */
public interface HashTable<T extends Node> extends Iterable<T>
{
	/**
	 * Gets a node by its hash value.
	 *
	 * @param value the node value
	 * @return the associated node
	 */
	T get(long value);
}
