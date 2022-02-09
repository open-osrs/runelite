import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public final class class370 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lnq;"
	)
	public static class370[] field4235;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1478906637
	)
	static int field4230;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1121135707
	)
	public static int field4231;
	@ObfuscatedName("dw")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("e")
	float field4229;
	@ObfuscatedName("r")
	float field4233;
	@ObfuscatedName("o")
	float field4234;
	@ObfuscatedName("i")
	float field4232;

	static {
		field4235 = new class370[0]; // L: 4
		FloorOverlayDefinition.method3588(100); // L: 9
		new class370();
	} // L: 14

	public class370() {
		this.method6643(); // L: 44
	} // L: 45

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1568150924"
	)
	public void method6642() {
		synchronized(field4235) { // L: 38
			if (field4231 < field4230 - 1) { // L: 39
				field4235[++field4231 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1359780471"
	)
	void method6646(float var1, float var2, float var3, float var4) {
		this.field4229 = var1; // L: 48
		this.field4233 = var2; // L: 49
		this.field4234 = var3; // L: 50
		this.field4232 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1630309161"
	)
	public void method6669(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 56
		this.field4229 = var5 * var1; // L: 57
		this.field4233 = var5 * var2; // L: 58
		this.field4234 = var3 * var5; // L: 59
		this.field4232 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-123573412"
	)
	public final void method6643() {
		this.field4234 = 0.0F; // L: 64
		this.field4233 = 0.0F; // L: 65
		this.field4229 = 0.0F; // L: 66
		this.field4232 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "102"
	)
	public final void method6663(class370 var1) {
		this.method6646(var1.field4229 * this.field4232 + var1.field4232 * this.field4229 + this.field4234 * var1.field4233 - var1.field4234 * this.field4233, var1.field4233 * this.field4232 + (var1.field4232 * this.field4233 - var1.field4229 * this.field4234) + var1.field4234 * this.field4229, this.field4234 * var1.field4232 + this.field4233 * var1.field4229 - var1.field4233 * this.field4229 + this.field4232 * var1.field4234, var1.field4232 * this.field4232 - this.field4229 * var1.field4229 - var1.field4233 * this.field4233 - var1.field4234 * this.field4234); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class370)) { // L: 76
			return false; // L: 80
		} else {
			class370 var2 = (class370)var1; // L: 77
			return this.field4229 == var2.field4229 && var2.field4233 == this.field4233 && var2.field4234 == this.field4234 && var2.field4232 == this.field4232; // L: 78
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = this.field4229 + var2 * 31.0F; // L: 87
		var2 = 31.0F * var2 + this.field4233; // L: 88
		var2 = this.field4234 + 31.0F * var2; // L: 89
		var2 = this.field4232 + var2 * 31.0F; // L: 90
		return (int)var2; // L: 91
	}

	public String toString() {
		return this.field4229 + "," + this.field4233 + "," + this.field4234 + "," + this.field4232; // L: 96
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "117"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 161
			if (KeyHandler.field144 == KeyHandler.field140) { // L: 162
				return false;
			} else {
				class160.field1749 = KeyHandler.field132[KeyHandler.field140]; // L: 163
				ClanSettings.field1610 = KeyHandler.field136[KeyHandler.field140]; // L: 164
				KeyHandler.field140 = KeyHandler.field140 + 1 & 127; // L: 165
				return true; // L: 166
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lpt;",
		garbageValue = "113583255"
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

		ItemComposition var9 = Client.ItemDefinition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = Client.ItemDefinition_get(var10);
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
			Rasterizer3D.method3787(16, 16); // L: 397
			Rasterizer3D.field2261 = false; // L: 398
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
			var21.method4215(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
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
				Font var19 = class67.ItemDefinition_fontPlain11; // L: 414
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
			Rasterizer3D.field2261 = true; // L: 433
			return var8; // L: 434
		}
	}
}
