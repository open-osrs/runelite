package com.openosrs.client.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.function.Predicate;

public class ImageUtil extends net.runelite.client.util.ImageUtil
{
	/**
	 * Recolors pixels of the given image with the given color based on a given recolor condition
	 * predicate.
	 *
	 * @param image            The image which should have its non-transparent pixels recolored.
	 * @param color            The color with which to recolor pixels.
	 * @param recolorCondition The condition on which to recolor pixels with the given color.
	 * @return The given image with all pixels fulfilling the recolor condition predicate
	 * set to the given color.
	 */
	public static BufferedImage recolorImage(final BufferedImage image, final Color color, final Predicate<Color> recolorCondition)
	{
		final BufferedImage recoloredImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
		for (int x = 0; x < recoloredImage.getWidth(); x++)
		{
			for (int y = 0; y < recoloredImage.getHeight(); y++)
			{
				final Color pixelColor = new Color(image.getRGB(x, y), true);
				if (!recolorCondition.test(pixelColor))
				{
					recoloredImage.setRGB(x, y, image.getRGB(x, y));
					continue;
				}

				recoloredImage.setRGB(x, y, color.getRGB());
			}
		}
		return recoloredImage;
	}

	public static BufferedImage recolorImage(BufferedImage image, final Color color)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		WritableRaster raster = image.getRaster();

		for (int xx = 0; xx < width; xx++)
		{
			for (int yy = 0; yy < height; yy++)
			{
				int[] pixels = raster.getPixel(xx, yy, (int[]) null);
				pixels[0] = color.getRed();
				pixels[1] = color.getGreen();
				pixels[2] = color.getBlue();
				raster.setPixel(xx, yy, pixels);
			}
		}
		return image;
	}
}
