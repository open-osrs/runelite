import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("TilePaint")
public final class TilePaint {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -235685251
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1377191477
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1254090335
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -156684907
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1065902093
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("q")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1963077615
	)
	@Export("rgb")
	int rgb;

	TilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;Ljava/lang/String;Ljava/lang/String;I)Lkq;",
		garbageValue = "2122951194"
	)
	public static Font method3210(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 166
		int var5 = var0.getFileId(var4, var3); // L: 167
		byte[] var8 = var0.takeFile(var4, var5); // L: 172
		boolean var7;
		if (var8 == null) { // L: 173
			var7 = false; // L: 174
		} else {
			class217.SpriteBuffer_decode(var8); // L: 177
			var7 = true; // L: 178
		}

		Font var6;
		if (!var7) { // L: 180
			var6 = null; // L: 181
		} else {
			var6 = UrlRequester.method3430(var1.takeFile(var4, var5)); // L: 184
		}

		return var6; // L: 186
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Llc;",
		garbageValue = "17"
	)
	@Export("getItemSprite")
	public static final Sprite getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 345
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 346
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40); // L: 347
		Sprite var8;
		if (!var5) { // L: 349
			var8 = (Sprite)ItemDefinition.ItemDefinition_cachedSprites.get(var6); // L: 350
			if (var8 != null) { // L: 351
				return var8;
			}
		}

		ItemDefinition var9 = AbstractWorldMapData.ItemDefinition_get(var0); // L: 353
		if (var1 > 1 && var9.countobj != null) { // L: 354
			int var10 = -1; // L: 355

			for (int var11 = 0; var11 < 10; ++var11) { // L: 356
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 357
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 359
				var9 = AbstractWorldMapData.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 361
		if (var19 == null) { // L: 362
			return null;
		} else {
			Sprite var20 = null; // L: 363
			if (var9.noteTemplate != -1) { // L: 364
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 365
				if (var20 == null) { // L: 366
					return null;
				}
			} else if (var9.notedId != -1) { // L: 368
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 369
				if (var20 == null) { // L: 370
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 372
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 373
				if (var20 == null) { // L: 374
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 376
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 377
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 378
			int[] var15 = new int[4]; // L: 379
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 380
			var8 = new Sprite(36, 32); // L: 381
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 382
			Rasterizer2D.Rasterizer2D_clear(); // L: 383
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 384
			Rasterizer3D.method3174(16, 16); // L: 385
			Rasterizer3D.field1794 = false; // L: 386
			if (var9.placeholderTemplate != -1) { // L: 387
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 388
			if (var5) { // L: 389
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 390
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 391
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 392
			var19.calculateBoundsCylinder(); // L: 393
			var19.method3064(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 394
			if (var9.notedId != -1) { // L: 395
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 396
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 397
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 398
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 399
			if (var9.noteTemplate != -1) { // L: 400
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 401
				VerticalAlignment.ItemDefinition_fontPlain11.draw(Strings.inventoryQuantityFormat(var1), 0, 9, 16776960, 1); // L: 402
			}

			if (!var5) { // L: 404
				ItemDefinition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 405
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 406
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 407
			Rasterizer3D.field1794 = true; // L: 408
			return var8; // L: 409
		}
	}
}
