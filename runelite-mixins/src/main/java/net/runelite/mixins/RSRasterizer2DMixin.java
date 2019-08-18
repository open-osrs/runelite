package net.runelite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class RSRasterizer2DMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static void drawAlpha(int[] pixels, int index, int value, int alpha)
	{
		if (!client.isGpu() || pixels != client.getBufferProvider().getPixels())
		{
			pixels[index] = value;
			return;
		}

		// (int) x * 0x8081 >>> 23 is equivalent to (short) x / 255
		int outAlpha = alpha + ((pixels[index] >>> 24) * (255 - alpha) * 0x8081 >>> 23);
		pixels[index] = value & 0x00FFFFFF | outAlpha << 24;
	}

	@Copy("Rasterizer2D_fillRectangleGradientAlpha")
	private static void rs$drawGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7)
	{
		throw new RuntimeException();
	}

	@Replace("Rasterizer2D_fillRectangleGradientAlpha")
	private static void rl$drawGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7)
	{
		final int width = client.getGraphicsPixelsWidth();
		final int startX = client.getStartX();
		final int startY = client.getStartY();
		final int endX = client.getEndX();
		final int endY = client.getEndY();
		final int[] pixels = client.getGraphicsPixels();

		if (!client.isGpu())
		{
			rs$drawGradientAlpha(var0, var1, var2, var3, var4, var5, var6, var7);
			return;
		}

		if (var2 > 0 && var3 > 0)
		{
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < startX)
			{
				var2 -= startX - var0;
				var0 = startX;
			}

			if (var1 < startY)
			{
				var8 += (startY - var1) * var9;
				var3 -= startY - var1;
				var1 = startY;
			}

			if (var0 + var2 > endX)
			{
				var2 = endX - var0;
			}

			if (var3 + var1 > endY)
			{
				var3 = endY - var1;
			}

			int var10 = width - var2;
			int var11 = var0 + width * var1;

			for (int var12 = -var3; var12 < 0; ++var12)
			{
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8;
				if (var15 == 0)
				{
					var11 += width;
					var8 += var9;
				}
				else
				{
					int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & 65280) + var13 * (var4 & 65280) & 16711680) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280);

					for (int var19 = -var2; var19 < 0; ++var19)
					{
						int var20 = pixels[var11];
						var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280);
						drawAlpha(pixels, var11++, var18 + var20, var15);
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@Copy("Rasterizer2D_drawGradientPixels")
	public static void rs$raster2d7(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7)
	{
		throw new RuntimeException();
	}

	@Replace("Rasterizer2D_drawGradientPixels")
	public static void rl$raster2d7(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7)
	{
		final int width = client.getGraphicsPixelsWidth();
		final int height = client.getGraphicsPixelsHeight();
		final int[] pixels = client.getGraphicsPixels();

		if (!client.isGpu())
		{
			rs$raster2d7(var0, var1, var2, var3, var4, var5, var6, var7);
			return;
		}

		if (var0 + var2 >= 0 && var3 + var1 >= 0)
		{
			if (var0 < width && var1 < height)
			{
				int var8 = 0;
				int var9 = 0;
				if (var0 < 0)
				{
					var8 -= var0;
					var2 += var0;
				}

				if (var1 < 0)
				{
					var9 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > width)
				{
					var2 = width - var0;
				}

				if (var3 + var1 > height)
				{
					var3 = height - var1;
				}

				int var10 = var6.length / var7;
				int var11 = width - var2;
				int var12 = var4 >>> 24;
				int var13 = var5 >>> 24;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12 == 255 && var13 == 255)
				{
					var14 = var0 + var8 + (var9 + var1) * width;

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15)
					{
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16)
						{
							var17 = (var15 - var1) % var10;
							var18 = (var16 - var0) % var7;
							if (var6[var18 + var17 * var7] != 0)
							{
								pixels[var14++] = var5;
							}
							else
							{
								pixels[var14++] = var4;
							}
						}

						var14 += var11;
					}
				}
				else
				{
					var14 = var0 + var8 + (var9 + var1) * width;

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15)
					{
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16)
						{
							var17 = (var15 - var1) % var10;
							var18 = (var16 - var0) % var7;
							int var19 = var4;
							if (var6[var18 + var17 * var7] != 0)
							{
								var19 = var5;
							}

							int var20 = var19 >>> 24;
							int var21 = 255 - var20;
							int var22 = pixels[var14];
							int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & 65280) + var21 * (var22 & 65280) & 16711680) >> 8;
							drawAlpha(pixels, var14++, var23, var20);
						}

						var14 += var11;
					}
				}
			}
		}
	}
}
