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
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "2097152469"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5366
			var2 = 1;
		}

		if (var3 < 1) { // L: 5367
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5368
		int var6;
		if (var5 < 0) { // L: 5370
			var6 = Client.field690;
		} else if (var5 >= 100) { // L: 5371
			var6 = Client.field707;
		} else {
			var6 = (Client.field707 - Client.field690) * var5 / 100 + Client.field690; // L: 5372
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5373
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field736) { // L: 5374
			var17 = Client.field736; // L: 5375
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 5376
			if (var6 > Client.field735) { // L: 5377
				var6 = Client.field735; // L: 5378
				var8 = var3 * var6 * 512 / (var17 * 334); // L: 5379
				var9 = (var2 - var8) / 2; // L: 5380
				if (var4) { // L: 5381
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5382
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5383
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5384
				}

				var0 += var9; // L: 5386
				var2 -= var9 * 2; // L: 5387
			}
		} else if (var7 > Client.field737) { // L: 5390
			var17 = Client.field737; // L: 5391
			var6 = var17 * var2 * 334 / (var3 * 512); // L: 5392
			if (var6 < Client.field619) { // L: 5393
				var6 = Client.field619; // L: 5394
				var8 = var17 * var2 * 334 / (var6 * 512); // L: 5395
				var9 = (var3 - var8) / 2; // L: 5396
				if (var4) { // L: 5397
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5398
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5399
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5400
				}

				var1 += var9; // L: 5402
				var3 -= var9 * 2; // L: 5403
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5406
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5407
			int[] var16 = new int[9]; // L: 5409

			for (var9 = 0; var9 < var16.length; ++var9) { // L: 5410
				int var10 = var9 * 32 + 15 + 128; // L: 5411
				int var11 = class142.method2958(var10); // L: 5412
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5413
				int var14 = var3 - 334; // L: 5416
				if (var14 < 0) { // L: 5417
					var14 = 0;
				} else if (var14 > 100) { // L: 5418
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight; // L: 5419
				int var13 = var15 * var11 / 256; // L: 5420
				var16[var9] = var13 * var12 >> 16; // L: 5423
			}

			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334); // L: 5425
		}

		Client.viewportOffsetX = var0; // L: 5428
		Client.viewportOffsetY = var1; // L: 5429
		Client.viewportWidth = var2; // L: 5430
		Client.viewportHeight = var3; // L: 5431
	} // L: 5432
}
