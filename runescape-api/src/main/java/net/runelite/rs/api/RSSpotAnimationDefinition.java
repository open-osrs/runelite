package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSpotAnimationDefinition
{
	@Import("getModel")
	RSModel getModel(int var1);

	@Import("recolorFrom")
	void setRecolorFrom(short[] from);

	@Import("recolorTo")
	void setRecolorTo(short[] to);

	@Import("sequence")
	int getSequence();
}
