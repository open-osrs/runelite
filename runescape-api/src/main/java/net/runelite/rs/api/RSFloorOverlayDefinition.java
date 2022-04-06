package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSFloorOverlayDefinition
{
	@Import("primaryRgb")
	int getPrimaryRgb();

	@Import("texture")
	int getTexture();

	@Import("decode")
	void decode(RSBuffer var1, int var2);

	@Import("postDecode")
	void postDecode();

}
