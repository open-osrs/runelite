/*
 * Copyright (c) 2020 Abex
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
package net.runelite.cache.models;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JagexColorTest
{
	private static final double[] BRIGHTNESS_LEVELS = {
		JagexColor.BRIGTHNESS_MIN,
		JagexColor.BRIGHTNESS_LOW,
		JagexColor.BRIGHTNESS_HIGH,
		JagexColor.BRIGHTNESS_MAX,
	};

	// copy/pasted from the client, the reference colors
	private static int[] computeColorTable(double brightness, int min, int max)
	{
		int[] colorPalette = new int[65536];
		int var4 = min * 128;

		for (int var5 = min; var5 < max; ++var5)
		{
			double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double) (var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10)
			{
				double var11 = (double) var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D)
				{
					double var19;
					if (var11 < 0.5D)
					{
						var19 = var11 * (1.0D + var8);
					}
					else
					{
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0D * var11 - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D)
					{
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D)
					{
						++var27;
					}

					if (6.0D * var23 < 1.0D)
					{
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					}
					else if (2.0D * var23 < 1.0D)
					{
						var13 = var19;
					}
					else if (3.0D * var23 < 2.0D)
					{
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					}
					else
					{
						var13 = var21;
					}

					if (6.0D * var6 < 1.0D)
					{
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					}
					else if (2.0D * var6 < 1.0D)
					{
						var15 = var19;
					}
					else if (3.0D * var6 < 2.0D)
					{
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					}
					else
					{
						var15 = var21;
					}

					if (6.0D * var27 < 1.0D)
					{
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					}
					else if (2.0D * var27 < 1.0D)
					{
						var17 = var19;
					}
					else if (3.0D * var27 < 2.0D)
					{
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					}
					else
					{
						var17 = var21;
					}
				}

				int var29 = (int) (var13 * 256.0D);
				int var20 = (int) (var15 * 256.0D);
				int var30 = (int) (var17 * 256.0D);
				int var22 = var30 + (var20 << 8) + (var29 << 16);
				var22 = adjustForBrightness(var22, brightness);
				if (var22 == 0)
				{
					var22 = 1;
				}

				colorPalette[var4++] = var22;
			}
		}

		return colorPalette;
	}

	private static int adjustForBrightness(int rgb, double brightness)
	{
		double var3 = (double) (rgb >> 16) / 256.0D;
		double var5 = (double) (rgb >> 8 & 255) / 256.0D;
		double var7 = (double) (rgb & 255) / 256.0D;
		var3 = Math.pow(var3, brightness);
		var5 = Math.pow(var5, brightness);
		var7 = Math.pow(var7, brightness);
		int var9 = (int) (var3 * 256.0D);
		int var10 = (int) (var5 * 256.0D);
		int var11 = (int) (var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	@Test
	public void testHslToRgb()
	{
		for (double brightness : BRIGHTNESS_LEVELS)
		{
			int[] colorPalette = computeColorTable(brightness, 0, 512);
			for (int i = 0; i < 0xFFFF; i++)
			{
				int rgb = JagexColor.HSLtoRGB((short) i, brightness);
				int crgb = colorPalette[i];
				assertEquals("idx " + i + " brightness " + brightness, crgb, rgb);
			}
		}
	}
}