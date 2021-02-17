package net.runelite.mixins;

import java.awt.Dimension;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameEngine;

@Mixin(RSGameEngine.class)
public abstract class StretchedModeMaxSizeMixin implements RSGameEngine
{
	@Shadow("client")
	private static RSClient client;

	@Copy("resizeCanvas")
	@Replace("resizeCanvas")
	@SuppressWarnings("InfiniteRecursion")
	public void copy$resizeCanvas()
	{
		if (client.isStretchedEnabled())
		{
			client.invalidateStretching(false);

			if (client.isResized())
			{
				Dimension realDimensions = client.getRealDimensions();

				setMaxCanvasWidth(realDimensions.width);
				setMaxCanvasHeight(realDimensions.height);
			}
		}

		copy$resizeCanvas();
	}

	@Copy("setMaxCanvasSize")
	@Replace("setMaxCanvasSize")
	public void copy$setMaxCanvasSize(int width, int height)
	{
		if (client.isStretchedEnabled() && client.isResized())
		{
			return;
		}

		copy$setMaxCanvasSize(width, height);
	}
}
