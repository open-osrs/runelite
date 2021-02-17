package net.runelite.rs.api;

import net.runelite.api.MapElementConfig;
import net.runelite.mapping.Import;

public interface RSWorldMapElement extends RSDualNode, MapElementConfig
{
	@Import("getSpriteBool")
	@Override
	RSSpritePixels getMapIcon(boolean var1);
}
