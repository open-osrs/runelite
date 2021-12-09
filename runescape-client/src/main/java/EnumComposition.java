import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("p")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("m")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("t")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -129402643
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -988434495
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("w")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("n")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("r")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1550875336"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "-68"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 44
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 45
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 46
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 47
				this.outputCount = var1.readUnsignedShort(); // L: 48
				this.keys = new int[this.outputCount]; // L: 49
				this.strVals = new String[this.outputCount]; // L: 50

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 51
					this.keys[var3] = var1.readInt(); // L: 52
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 53
				}
			} else if (var2 == 6) { // L: 56
				this.outputCount = var1.readUnsignedShort(); // L: 57
				this.keys = new int[this.outputCount]; // L: 58
				this.intVals = new int[this.outputCount]; // L: 59

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 60
					this.keys[var3] = var1.readInt(); // L: 61
					this.intVals[var3] = var1.readInt(); // L: 62
				}
			}
		}

	} // L: 66

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2125042449"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lpl;",
		garbageValue = "1794851975"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 357
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 358
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42); // L: 359
		SpritePixels var8;
		if (!var5) { // L: 361
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 362
			if (var8 != null) { // L: 363
				return var8;
			}
		}

		ItemComposition var9 = UserComparator6.ItemDefinition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = UserComparator6.ItemDefinition_get(var10);
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
			Rasterizer3D.method3913(16, 16); // L: 397
			Rasterizer3D.field2276 = false; // L: 398
			if (var9.placeholderTemplate != -1) { // L: 399
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 400
			if (var5) { // L: 401
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 402
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 403
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 404
			var21.calculateBoundsCylinder(); // L: 405
			var21.method4241(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
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
				Font var19 = ItemComposition.ItemDefinition_fontPlain11; // L: 414
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
			Rasterizer3D.field2276 = true; // L: 433
			return var8; // L: 434
		}
	}
}
