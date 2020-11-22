package net.runelite.rs.api;

import net.runelite.api.Frames;
import net.runelite.mapping.Import;

public interface RSFrames extends RSDualNode, Frames
{
	@Import("frames")
	RSAnimation[] getFrames();
}
