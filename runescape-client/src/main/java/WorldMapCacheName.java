import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final WorldMapCacheName field2849;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final WorldMapCacheName field2847;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final WorldMapCacheName field2846;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final WorldMapCacheName field2852;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final WorldMapCacheName field2850;
	@ObfuscatedName("n")
	@Export("name")
	public final String name;

	static {
		field2849 = new WorldMapCacheName("details"); // L: 4
		field2847 = new WorldMapCacheName("compositemap"); // L: 5
		field2846 = new WorldMapCacheName("compositetexture"); // L: 6
		field2852 = new WorldMapCacheName("area"); // L: 7
		field2850 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lql;",
		garbageValue = "1724872631"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 365
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 366
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40); // L: 367
		SpritePixels var8;
		if (!var5) { // L: 369
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 370
			if (var8 != null) { // L: 371
				return var8;
			}
		}

		ItemComposition var9 = class67.ItemDefinition_get(var0); // L: 373
		if (var1 > 1 && var9.countobj != null) { // L: 374
			int var10 = -1; // L: 375

			for (int var11 = 0; var11 < 10; ++var11) { // L: 376
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 377
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 379
				var9 = class67.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 381
		if (var21 == null) { // L: 382
			return null;
		} else {
			SpritePixels var22 = null; // L: 383
			if (var9.noteTemplate != -1) { // L: 384
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 385
				if (var22 == null) { // L: 386
					return null;
				}
			} else if (var9.notedId != -1) { // L: 388
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 389
				if (var22 == null) { // L: 390
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 392
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 393
				if (var22 == null) { // L: 394
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 396
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 397
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 398
			int[] var15 = new int[4]; // L: 399
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 400
			var8 = new SpritePixels(36, 32); // L: 401
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 402
			Rasterizer2D.Rasterizer2D_clear(); // L: 403
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 404
			Rasterizer3D.method3997(16, 16); // L: 405
			Rasterizer3D.field2325 = false; // L: 406
			if (var9.placeholderTemplate != -1) { // L: 407
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 408
			if (var5) { // L: 409
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 410
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 411
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 412
			var21.calculateBoundsCylinder(); // L: 413
			var21.method4376(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 414
			if (var9.notedId != -1) { // L: 415
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 416
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 417
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 418
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 419
			if (var9.noteTemplate != -1) { // L: 420
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 421
				Font var19 = class239.ItemDefinition_fontPlain11; // L: 422
				String var20;
				if (var1 < 100000) { // L: 425
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 426
				} else if (var1 < 10000000) { // L: 429
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 430
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 433
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 435
			}

			if (!var5) { // L: 437
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 438
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 439
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 440
			Rasterizer3D.field2325 = true; // L: 441
			return var8; // L: 442
		}
	}
}
