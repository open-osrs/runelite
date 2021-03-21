package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSTimer {
	
	@Import("cacheSubPaths")
	String[] getCacheSubPaths();
	
	@Import("cacheSubPaths")
	void setCacheSubPaths(String[] cacheSubPaths);
	
}