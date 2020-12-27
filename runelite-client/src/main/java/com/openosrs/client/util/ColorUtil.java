package com.openosrs.client.util;

import java.awt.Color;

public class ColorUtil extends net.runelite.client.util.ColorUtil
{
	/**
	 * Modifies the alpha component on a Color
	 *
	 * @param color The color to set the alpha value on
	 * @param alpha The alpha value to set on the color
	 * @return color
	 */
	public static int setAlphaComponent(Color color, int alpha)
	{
		return setAlphaComponent(color.getRGB(), alpha);
	}

	/**
	 * Modifies the alpha component on a Color
	 *
	 * @param color The color to set the alpha value on
	 * @param alpha The alpha value to set on the color
	 * @return color
	 */
	public static int setAlphaComponent(int color, int alpha)
	{
		if (alpha < 0 || alpha > 255)
		{
			throw new IllegalArgumentException("alpha must be between 0 and 255.");
		}
		return (color & 0x00ffffff) | (alpha << 24);
	}
}
