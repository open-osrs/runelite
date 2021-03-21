package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSMinimapRenderer {
	
	@Import("cacheParentPaths")
	String[] getCacheParentPaths();
	
	@Import("cacheParentPaths")
	void setCacheParentPaths(String[] cacheParentPaths);
	
}