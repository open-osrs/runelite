/*
 * Copyright (c) 2018, Jordan Atwood <jordan.atwood423@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.util;

import com.google.common.primitives.Ints;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.PixelGrabber;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.GrayFilter;
import java.util.function.Predicate;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.IndexedSprite;
import net.runelite.api.SpritePixels;

/**
 * Various Image/BufferedImage utilities.
 */
@Slf4j
public class ImageUtil
{
	/**
	 * Creates a {@link BufferedImage} from an {@link Image}.
	 *
	 * @param image An Image to be converted to a BufferedImage.
	 * @return      A BufferedImage instance of the same given image.
	 */
	public static BufferedImage bufferedImageFromImage(final Image image)
	{
		if (image instanceof BufferedImage)
		{
			return (BufferedImage) image;
		}

		final BufferedImage out = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g2d = out.createGraphics();
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
		return out;
	}

	/**
	 * Offsets an image in the grayscale (darkens/brightens) by a given offset.
	 *
	 * @param image  The image to be darkened or brightened.
	 * @param offset A signed 8-bit integer value to brighten or darken the image with.
	 *               Values above 0 will brighten, and values below 0 will darken.
	 * @return       The given image with its brightness adjusted by the given offset.
	 */
	public static BufferedImage grayscaleOffset(final BufferedImage image, final int offset)
	{
		final float offsetFloat = (float) offset;
		final int numComponents = image.getColorModel().getNumComponents();
		final float[] scales = new float[numComponents];
		final float[] offsets = new float[numComponents];

		Arrays.fill(scales, 1f);
		for (int i = 0; i < numComponents; i++)
		{
			offsets[i] = offsetFloat;
		}
		// Set alpha to not offset
		offsets[numComponents - 1] = 0f;

		return offset(image, scales, offsets);
	}

	/**
	 * Offsets an image in the grayscale (darkens/brightens) by a given percentage.
	 *
	 * @param image      The image to be darkened or brightened.
	 * @param percentage The ratio to darken or brighten the given image.
	 *                   Values above 1 will brighten, and values below 1 will darken.
	 * @return           The given image with its brightness scaled by the given percentage.
	 */
	public static BufferedImage grayscaleOffset(final BufferedImage image, final float percentage)
	{
		final int numComponents = image.getColorModel().getNumComponents();
		final float[] scales = new float[numComponents];
		final float[] offsets = new float[numComponents];

		Arrays.fill(offsets, 0f);
		for (int i = 0; i < numComponents; i++)
		{
			scales[i] = percentage;
		}
		// Set alpha to not scale
		scales[numComponents - 1] = 1f;

		return offset(image, scales, offsets);
	}

	/**
	 * Offsets an image's alpha component by a given offset.
	 *
	 * @param image  The image to be made more or less transparent.
	 * @param offset A signed 8-bit integer value to modify the image's alpha component with.
	 *               Values above 0 will increase transparency, and values below 0 will decrease
	 *               transparency.
	 * @return       The given image with its alpha component adjusted by the given offset.
	 */
	public static BufferedImage alphaOffset(final BufferedImage image, final int offset)
	{
		final float offsetFloat = (float) offset;
		final int numComponents = image.getColorModel().getNumComponents();
		final float[] scales = new float[numComponents];
		final float[] offsets = new float[numComponents];

		Arrays.fill(scales, 1f);
		Arrays.fill(offsets, 0f);
		offsets[numComponents - 1] = offsetFloat;
		return offset(image, scales, offsets);
	}

	/**
	 * Offsets an image's alpha component by a given percentage.
	 *
	 * @param image      The image to be made more or less transparent.
	 * @param percentage The ratio to modify the image's alpha component with.
	 *                   Values above 1 will increase transparency, and values below 1 will decrease
	 *                   transparency.
	 * @return           The given image with its alpha component scaled by the given percentage.
	 */
	public static BufferedImage alphaOffset(final BufferedImage image, final float percentage)
	{
		final int numComponents = image.getColorModel().getNumComponents();
		final float[] scales = new float[numComponents];
		final float[] offsets = new float[numComponents];

		Arrays.fill(scales, 1f);
		Arrays.fill(offsets, 0f);
		scales[numComponents - 1] = percentage;
		return offset(image, scales, offsets);
	}

	/**
	 * Creates a grayscale image from the given image.
	 *
	 * @param image The source image to be converted.
	 * @return      A copy of the given imnage, with colors converted to grayscale.
	 */
	public static BufferedImage grayscaleImage(final BufferedImage image)
	{
		final Image grayImage = GrayFilter.createDisabledImage(image);
		return ImageUtil.bufferedImageFromImage(grayImage);
	}

	/**
	 * Re-size a BufferedImage to the given dimensions.
	 *
	 * @param image the BufferedImage.
	 * @param newWidth The width to set the BufferedImage to.
	 * @param newHeight The height to set the BufferedImage to.
	 * @return The BufferedImage with the specified dimensions
	 */
	public static BufferedImage resizeImage(final BufferedImage image, final int newWidth, final int newHeight)
	{
		final Image resized = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
		return ImageUtil.bufferedImageFromImage(resized);
	}

	/**
	 * Re-size a BufferedImage's canvas to the given dimensions.
	 *
	 * @param image     The image whose canvas should be re-sized.
	 * @param newWidth  The width to set the BufferedImage to.
	 * @param newHeight The height to set the BufferedImage to.
	 * @return          The BufferedImage centered within canvas of given dimensions.
	 */
	public static BufferedImage resizeCanvas(final BufferedImage image, final int newWidth, final int newHeight)
	{
		final BufferedImage dimg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
		final int centeredX = newWidth / 2 - image.getWidth() / 2;
		final int centeredY = newHeight / 2 - image.getHeight() / 2;

		final Graphics2D g2d = dimg.createGraphics();
		g2d.drawImage(image, centeredX, centeredY, null);
		g2d.dispose();
		return dimg;
	}

	/**
	 * Rotates an image around its center by a given number of radians.
	 *
	 * @param image The image to be rotated.
	 * @param theta The number of radians to rotate the image.
	 * @return      The given image, rotated by the given theta.
	 */
	public static BufferedImage rotateImage(final BufferedImage image, final double theta)
	{
		AffineTransform transform = new AffineTransform();
		transform.rotate(theta, image.getWidth() / 2.0, image.getHeight() / 2.0);
		AffineTransformOp transformOp = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
		return transformOp.filter(image, null);
	}

	/**
	 * Flips an image horizontally and/or vertically.
	 *
	 * @param image      The image to be flipped.
	 * @param horizontal Whether the image should be flipped horizontally.
	 * @param vertical   Whether the image should be flipped vertically.
	 * @return           The given image, flipped horizontally and/or vertically.
	 */
	public static BufferedImage flipImage(final BufferedImage image, final boolean horizontal, final boolean vertical)
	{
		int x = 0;
		int y = 0;
		int w = image.getWidth();
		int h = image.getHeight();

		final BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g2d = out.createGraphics();

		if (horizontal)
		{
			x = w;
			w *= -1;
		}

		if (vertical)
		{
			y = h;
			h *= -1;
		}

		g2d.drawImage(image, x, y, w, h, null);
		g2d.dispose();

		return out;
	}

	/**
	 * Outlines non-transparent pixels of a BufferedImage with the given color.
	 *
	 * @param image The image to be outlined.
	 * @param color The color to use for the outline.
	 * @return      The BufferedImage with its edges outlined with the given color.
	 */
	public static BufferedImage outlineImage(final BufferedImage image, final Color color)
	{
		return outlineImage(image, color, ColorUtil::isNotFullyTransparent, false);
	}

	/**
	 * Outlines pixels of a BufferedImage with the given color, using a given predicate to colorize
	 * the given image for outlining.
	 *
	 * @param image         The image to be outlined.
	 * @param color         The color to use for the outline.
	 * @param fillCondition The predicate to be consumed by {@link #fillImage(BufferedImage, Color, Predicate) fillImage(BufferedImage, Color, Predicate)}
	 * @return              The BufferedImage with its edges outlined with the given color.
	 */
	public static BufferedImage outlineImage(final BufferedImage image, final Color color, final Predicate<Color> fillCondition)
	{
		return outlineImage(image, color, fillCondition, false);
	}

	/**
	 * Outlines non-transparent pixels of a BufferedImage with the given color. Optionally outlines
	 * corners in addition to edges.
	 *
	 * @param image          The image to be outlined.
	 * @param color          The color to use for the outline.
	 * @param outlineCorners Whether to draw an outline around corners, or only around edges.
	 * @return               The BufferedImage with its edges--and optionally, corners--outlined
	 *                       with the given color.
	 */
	public static BufferedImage outlineImage(final BufferedImage image, final Color color, final Boolean outlineCorners)
	{
		return outlineImage(image, color, ColorUtil::isNotFullyTransparent, outlineCorners);
	}

	/**
	 * Outlines pixels of a BufferedImage with the given color, using a given predicate to colorize
	 * the given image for outlining. Optionally outlines corners in addition to edges.
	 *
	 * @param image          The image to be outlined.
	 * @param color          The color to use for the outline.
	 * @param fillCondition  The predicate to be consumed by {@link #fillImage(BufferedImage, Color, Predicate) fillImage(BufferedImage, Color, Predicate)}
	 * @param outlineCorners Whether to draw an outline around corners, or only around edges.
	 * @return               The BufferedImage with its edges--and optionally, corners--outlined
	 * 	                     with the given color.
	 */
	public static BufferedImage outlineImage(final BufferedImage image, final Color color, final Predicate<Color> fillCondition, final Boolean outlineCorners)
	{
		final BufferedImage filledImage = fillImage(image, color, fillCondition);
		final BufferedImage outlinedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);

		final Graphics2D g2d = outlinedImage.createGraphics();
		for (int x = -1; x <= 1; x++)
		{
			for (int y = -1; y <= 1; y++)
			{
				if ((x == 0 && y == 0)
					|| (!outlineCorners && Math.abs(x) + Math.abs(y) != 1))
				{
					continue;
				}

				g2d.drawImage(filledImage, x, y, null);
			}
		}
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();

		return outlinedImage;
	}

	/**
	 * Reads an image resource from a given path relative to a given class.
	 * This method is primarily shorthand for the synchronization and error handling required for
	 * loading image resources from classes.
	 *
	 * @param c    The class to be referenced for resource path.
	 * @param path The path, relative to the given class.
	 * @return     A {@link BufferedImage} of the loaded image resource from the given path.
	 */
	public static BufferedImage getResourceStreamFromClass(final Class c, final String path)
	{
		try
		{
			synchronized (ImageIO.class)
			{
				return ImageIO.read(c.getResourceAsStream(path));
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	/**
	 * Fills all non-transparent pixels of the given image with the given color.
	 *
	 * @param image The image which should have its non-transparent pixels filled.
	 * @param color The color with which to fill pixels.
	 * @return      The given image with all non-transparent pixels set to the given color.
	 */
	public static BufferedImage fillImage(final BufferedImage image, final Color color)
	{
		return fillImage(image, color, ColorUtil::isNotFullyTransparent);
	}

	/**
	 * 	Fills pixels of the given image with the given color based on a given fill condition
	 * 	predicate.
	 *
	 * @param image         The image which should have its non-transparent pixels filled.
	 * @param color         The color with which to fill pixels.
	 * @param fillCondition The condition on which to fill pixels with the given color.
	 * @return              The given image with all pixels fulfilling the fill condition predicate
	 *                      set to the given color.
	 */
	static BufferedImage fillImage(final BufferedImage image, final Color color, final Predicate<Color> fillCondition)
	{
		final BufferedImage filledImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
		for (int x = 0; x < filledImage.getWidth(); x++)
		{
			for (int y = 0; y < filledImage.getHeight(); y++)
			{
				final Color pixelColor = new Color(image.getRGB(x, y), true);
				if (!fillCondition.test(pixelColor))
				{
					continue;
				}

				filledImage.setRGB(x, y, color.getRGB());
			}
		}
		return filledImage;
	}

	/**
	 * Performs a rescale operation on the image's color components.
	 *
	 * @param image   The image to be adjusted.
	 * @param scales  An array of scale operations to be performed on the image's color components.
	 * @param offsets An array of offset operations to be performed on the image's color components.
	 * @return        The modified image after applying the given adjustments.
	 */
	private static BufferedImage offset(final BufferedImage image, final float[] scales, final float[] offsets)
	{
		return new RescaleOp(scales, offsets, null).filter(image, null);
	}


	/**
	 * Converts the buffered image into a sprite image and returns it
	 * @param image  The image to be converted
	 * @param client Current client instance
	 * @return       The buffered image as a sprite image
	 */
	public static SpritePixels getImageSpritePixels(BufferedImage image, Client client)
	{
		int[] pixels = new int[image.getWidth() * image.getHeight()];

		try
		{
			PixelGrabber g = new PixelGrabber(image, 0, 0, image.getWidth(), image.getHeight(), pixels, 0, image.getWidth());
			g.setColorModel(new DirectColorModel(32, 0xff0000, 0xff00, 0xff, 0xff000000));
			g.grabPixels();

			// Make any fully transparent pixels fully black, because the sprite draw routines
			// check for == 0, not actual transparency
			for (int i = 0; i < pixels.length; i++)
			{
				if ((pixels[i] & 0xFF000000) == 0)
				{
					pixels[i] = 0;
				}
			}
		}
		catch (InterruptedException ex)
		{
			log.debug("PixelGrabber was interrupted: ", ex);
		}

		return client.createSpritePixels(pixels, image.getWidth(), image.getHeight());
	}

	/**
	 * Converts an image into an {@code IndexedSprite} instance.
	 *
	 * The passed in image can only have at max 255 different colors.
	 *
	 * @param image  The image to be converted
	 * @param client Current client instance
	 * @return		 The image as an {@code IndexedSprite}
	 */
	public static IndexedSprite getImageIndexedSprite(BufferedImage image, Client client)
	{
		final byte[] pixels = new byte[image.getWidth() * image.getHeight()];
		final List<Integer> palette = new ArrayList<>();
		/*
			When drawing the indexed sprite, palette idx 0 is seen as fully transparent,
			so pad the palette out so that our colors start at idx 1.
		 */
		palette.add(0);

		final int[] sourcePixels = image.getRGB(0, 0,
			image.getWidth(), image.getHeight(),
			null, 0, image.getWidth());

		/*
			Build a color palette and assign the pixels to positions in the palette.
		 */
		for (int j = 0; j < sourcePixels.length; j++)
		{
			final int argb = sourcePixels[j];
			final int a = (argb >> 24) & 0xFF;
			final int rgb = argb & 0xFF_FF_FF;

			// Default to not drawing the pixel.
			int paletteIdx = 0;

			// If the pixel is fully opaque, draw it.
			if (a == 0xFF)
			{
				paletteIdx = palette.indexOf(rgb);

				if (paletteIdx == -1)
				{
					paletteIdx = palette.size();
					palette.add(rgb);
				}
			}

			pixels[j] = (byte) paletteIdx;
		}

		if (palette.size() > 256)
		{
			throw new RuntimeException("Passed in image had " + (palette.size() - 1)
				+ " different colors, exceeding the max of 255.");
		}

		final IndexedSprite sprite = client.createIndexedSprite();

		sprite.setPixels(pixels);
		sprite.setPalette(Ints.toArray(palette));
		sprite.setWidth(image.getWidth());
		sprite.setHeight(image.getHeight());
		sprite.setOriginalWidth(image.getWidth());
		sprite.setOriginalHeight(image.getHeight());
		sprite.setOffsetX(0);
		sprite.setOffsetY(0);

		return sprite;
	}
}
