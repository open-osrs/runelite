package net.runelite.api;

/**
 * Represents an index in the cache
 */
public interface IndexDataBase
{
	/**
	 * Returns true if any cache overlay in this index is outdated due to hash mismatch
	 */
	boolean isOverlayOutdated();

	/**
	 * Get the child file ids for a given archive
	 * @param archiveId
	 * @return
	 */
	int[] getFileIds(int archiveId);
}
