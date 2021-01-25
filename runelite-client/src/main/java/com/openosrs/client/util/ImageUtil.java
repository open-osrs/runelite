package com.openosrs.client.util;

import net.runelite.api.Client;
import net.runelite.api.SpritePixels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.Arrays;
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

	/**
	 * Draw fg centered on top of bg
	 */
	public static SpritePixels mergeSprites(final Client client, final SpritePixels bg, final SpritePixels fg)
	{
		assert fg.getHeight() <= bg.getHeight() && fg.getWidth() <= bg.getWidth() : "Background has to be larger than foreground";

		final int[] canvas = Arrays.copyOf(bg.getPixels(), bg.getWidth() * bg.getHeight());
		final SpritePixels result = client.createSpritePixels(canvas, bg.getWidth(), bg.getHeight());

		final int bgWid = bg.getWidth();
		final int fgHgt = fg.getHeight();
		final int fgWid = fg.getWidth();

		final int xOffset = (bgWid - fgWid) / 2;
		final int yOffset = (bg.getHeight() - fgHgt) / 2;

		final int[] fgPixels = fg.getPixels();

		for (int y1 = yOffset, y2 = 0; y2 < fgHgt; y1++, y2++)
		{
			int i1 = y1 * bgWid + xOffset;
			int i2 = y2 * fgWid;

			for (int x = 0; x < fgWid; x++, i1++, i2++)
			{
				if (fgPixels[i2] > 0)
				{
					canvas[i1] = fgPixels[i2];
				}
			}
		}

		return result;
	}

	/**
	 * Resize Sprite sprite to given width (newW) and height (newH)
	 */
	public static SpritePixels resizeSprite(final Client client, final SpritePixels sprite, int newW, int newH)
	{
		assert newW > 0 && newH > 0;

		final int oldW = sprite.getWidth();
		final int oldH = sprite.getHeight();

		if (oldW == newW && oldH == newH)
		{
			return sprite;
		}

		final int[] canvas = new int[newW * newH];
		final int[] pixels = sprite.getPixels();

		final SpritePixels result = client.createSpritePixels(canvas, newW, newH);

		int pixelX = 0;
		int pixelY = 0;

		final int oldMaxW = sprite.getMaxWidth();
		final int oldMaxH = sprite.getMaxHeight();

		final int pixelW = (oldMaxW << 16) / newW;
		final int pixelH = (oldMaxH << 16) / newH;

		int xOffset = 0;
		int yOffset = 0;

		int canvasIdx;
		if (sprite.getOffsetX() > 0)
		{
			canvasIdx = (pixelW + (sprite.getOffsetX() << 16) - 1) / pixelW;
			xOffset += canvasIdx;
			pixelX += canvasIdx * pixelW - (sprite.getOffsetX() << 16);
		}

		if (sprite.getOffsetY() > 0)
		{
			canvasIdx = (pixelH + (sprite.getOffsetY() << 16) - 1) / pixelH;
			yOffset += canvasIdx;
			pixelY += canvasIdx * pixelH - (sprite.getOffsetY() << 16);
		}

		if (oldW < oldMaxW)
		{
			newW = (pixelW + ((oldW << 16) - pixelX) - 1) / pixelW;
		}

		if (oldH < oldMaxH)
		{
			newH = (pixelH + ((oldH << 16) - pixelY) - 1) / pixelH;
		}

		canvasIdx = xOffset + yOffset * newW;
		int canvasOffset = 0;
		if (yOffset + newH > newH)
		{
			newH -= yOffset + newH - newH;
		}

		int tmp;
		if (yOffset < 0)
		{
			tmp = -yOffset;
			newH -= tmp;
			canvasIdx += tmp * newW;
			pixelY += pixelH * tmp;
		}

		if (newW + xOffset > newW)
		{
			tmp = newW + xOffset - newW;
			newW -= tmp;
			canvasOffset += tmp;
		}

		if (xOffset < 0)
		{
			tmp = -xOffset;
			newW -= tmp;
			canvasIdx += tmp;
			pixelX += pixelW * tmp;
			canvasOffset += tmp;
		}

		client.scaleSprite(canvas, pixels, 0, pixelX, pixelY, canvasIdx, canvasOffset, newW, newH, pixelW, pixelH, oldW);

		return result;
	}
}
