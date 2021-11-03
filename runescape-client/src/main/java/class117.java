import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class117 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1054010885
	)
	int field1378;
	@ObfuscatedName("w")
	boolean field1375;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class117(class119 var1) {
		this.this$0 = var1;
		this.field1378 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1378 = var1.readUnsignedShort(); // L: 184
		this.field1375 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2662(this.field1378, this.field1375); // L: 189
	} // L: 190

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1364170988"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 158
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Low;",
		garbageValue = "-115532450"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 357
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 358
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38); // L: 359
		SpritePixels var8;
		if (!var5) { // L: 361
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 362
			if (var8 != null) { // L: 363
				return var8;
			}
		}

		ItemComposition var9 = TaskHandler.ItemDefinition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = TaskHandler.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 373
		if (var21 == null) { // L: 374
			return null;
		} else {
			SpritePixels var22 = null; // L: 375
			if (var9.noteTemplate != -1) { // L: 376
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 377
				if (var22 == null) { // L: 378
					return null;
				}
			} else if (var9.notedId != -1) { // L: 380
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 381
				if (var22 == null) { // L: 382
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 384
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 385
				if (var22 == null) { // L: 386
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 388
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 389
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 390
			int[] var15 = new int[4]; // L: 391
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 392
			var8 = new SpritePixels(36, 32); // L: 393
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 394
			Rasterizer2D.Rasterizer2D_clear(); // L: 395
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 396
			Rasterizer3D.method4205(16, 16); // L: 397
			Rasterizer3D.field2367 = false; // L: 398
			if (var9.placeholderTemplate != -1) { // L: 399
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 400
			if (var5) { // L: 401
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 402
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 403
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 404
			var21.calculateBoundsCylinder(); // L: 405
			var21.method4539(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
			if (var9.notedId != -1) { // L: 407
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 408
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 409
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 410
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 411
			if (var9.noteTemplate != -1) { // L: 412
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 413
				Font var19 = SoundSystem.ItemDefinition_fontPlain11; // L: 414
				String var20;
				if (var1 < 100000) { // L: 417
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 418
				} else if (var1 < 10000000) { // L: 421
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 422
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 425
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 427
			}

			if (!var5) { // L: 429
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 430
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 431
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 432
			Rasterizer3D.field2367 = true; // L: 433
			return var8; // L: 434
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "969588273"
	)
	static final int method2573(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 564
		var2 ^= var2 << 13; // L: 565
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 566
		return var3 >> 19 & 255; // L: 567
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1335123440"
	)
	static int method2565(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
