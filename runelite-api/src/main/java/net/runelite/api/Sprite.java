/*
 * Copyright (c) 2017, Tyler <https://github.com/tylerthardy>
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
package net.runelite.api;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Represents data about the pixels of a sprite image.
 */
public interface Sprite
{
	int DEFAULT_SHADOW_COLOR = 3153952;

	/**
	 * Draws the pixels at the given coordinates on the canvas.
	 *
	 * @param x the x-axis coordinate
	 * @param y the y-axis coordinate
	 */
	void drawAt(int x, int y);

	/**
	 * Gets the width of the sprite image in pixels.
	 *
	 * @return the width
	 */
	int getWidth();

	/**
	 * Gets the height of the sprite image in pixels.
	 *
	 * @return the height
	 */
	int getHeight();

	/**
	 * Gets an array of all pixels data in the sprite.
	 *
	 * @return the pixel data
	 */
	int[] getPixels();

	/**
	 * Converts the sprite into a BufferedImage.
	 *
	 * @return the resulting BufferedImage
	 */
	BufferedImage toBufferedImage();

	/**
	 * Writes the contents of the sprite to the given BufferedImage.
	 *
	 * @param img the passsed buffered image
	 * @throws IllegalArgumentException if the width or height do not match
 	 */
	void toBufferedImage(BufferedImage img) throws IllegalArgumentException;

	/**
	 * Writes the contents of the Sprite with chosen outline to the BufferedImage
	 *
	 * @param color target color
	 */
	BufferedImage toBufferedOutline(Color color);

	/**
	 * Writes the contents of the Sprite with chosen outline to the BufferedImage
	 *
	 * @param img target image
	 * @param color target color
	 */
	void toBufferedOutline(BufferedImage img, int color);

	int getMaxWidth();

	void setMaxWidth(int maxWidth);

	int getMaxHeight();

	void setMaxHeight(int maxHeight);

	int getOffsetX();

	void setOffsetX(int offsetX);

	int getOffsetY();

	void setOffsetY(int offsetY);
}
