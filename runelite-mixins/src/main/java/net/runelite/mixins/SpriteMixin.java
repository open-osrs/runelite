package net.runelite.mixins;

import java.util.HashMap;
import java.util.Map;
import net.runelite.api.SpritePixels;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSSpritePixels;

@Mixin(RSClient.class)
public abstract class SpriteMixin implements RSClient
{
	@Inject
	private static final Map<Integer, SpritePixels> spriteOverrides = new HashMap<Integer, SpritePixels>();

	@Inject
	private static final Map<Integer, SpritePixels> widgetSpriteOverrides = new HashMap<Integer, SpritePixels>();

	@Inject
	@Override
	public Map<Integer, SpritePixels> getSpriteOverrides()
	{
		return spriteOverrides;
	}

	@Inject
	@Override
	public Map<Integer, SpritePixels> getWidgetSpriteOverrides()
	{
		return widgetSpriteOverrides;
	}

	@Copy("SpriteBuffer_getSprite")
	@Replace("SpriteBuffer_getSprite")
	public static RSSpritePixels copy$loadSprite(RSAbstractArchive var0, int var1, int var2)
	{
		SpritePixels spritePixels = spriteOverrides.get(var1);

		if (spritePixels != null)
		{
			return (RSSpritePixels) spritePixels;
		}

		return copy$loadSprite(var0, var1, var2);
	}
}