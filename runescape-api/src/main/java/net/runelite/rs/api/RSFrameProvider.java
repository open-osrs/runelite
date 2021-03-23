package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSFrameProvider
{
	@Import("js5Port")
	int getJs5Port();
	
	@Import("js5Port")
	void setJs5Port(int js5Port);
}