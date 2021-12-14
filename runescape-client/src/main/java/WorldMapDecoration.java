import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static Widget field2722;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -534188833
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1834904579
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 556880363
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "2097152469"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field690;
		} else if (var5 >= 100) {
			var6 = Client.field707;
		} else {
			var6 = (Client.field707 - Client.field690) * var5 / 100 + Client.field690;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field736) {
			var17 = Client.field736;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field735) {
				var6 = Client.field735;
				var8 = var3 * var6 * 512 / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field737) {
			var17 = Client.field737;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field619) {
				var6 = Client.field619;
				var8 = var17 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var16 = new int[9];

			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = class142.method2958(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var15 * var11 / 256;
				var16[var9] = var13 * var12 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
