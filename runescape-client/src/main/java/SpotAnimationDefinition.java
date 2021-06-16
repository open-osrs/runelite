import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1638565333
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2042923893
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1562787325
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("r")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("h")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("z")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -131798201
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1053916553
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -715862297
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1937159093
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2094133553
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-47"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "95"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 62
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgd;",
		garbageValue = "-1"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 85
		if (var2 == null) { // L: 86
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 87
			if (var3 == null) { // L: 88
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 89
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 90
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 91
				}
			}

			if (this.retextureFrom != null) { // L: 94
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 95
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 96
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 99
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 100
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 103
			var5 = WorldMapScaleHandler.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 104
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 105
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 106
			if (this.orientation == 90) { // L: 107
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}

			if (this.orientation == 270) { // L: 112
				var5.rotateY90Ccw(); // L: 113
				var5.rotateY90Ccw(); // L: 114
				var5.rotateY90Ccw(); // L: 115
			}
		}

		return var5; // L: 118
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLkn;I)I",
		garbageValue = "-1325304015"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Loa;",
		garbageValue = "1093852955"
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

		ItemComposition var9 = class250.ItemDefinition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = class250.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 373
		if (var19 == null) { // L: 374
			return null;
		} else {
			SpritePixels var20 = null; // L: 375
			if (var9.noteTemplate != -1) { // L: 376
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 377
				if (var20 == null) { // L: 378
					return null;
				}
			} else if (var9.notedId != -1) { // L: 380
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 381
				if (var20 == null) { // L: 382
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 384
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 385
				if (var20 == null) { // L: 386
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
			Rasterizer3D.method3950(16, 16); // L: 397
			Rasterizer3D.field2281 = false; // L: 398
			if (var9.placeholderTemplate != -1) { // L: 399
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 400
			if (var5) { // L: 401
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 402
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 403
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 404
			var19.calculateBoundsCylinder(); // L: 405
			var19.method4347(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
			if (var9.notedId != -1) { // L: 407
				var20.drawTransBgAt(0, 0);
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
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 413
				ItemComposition.ItemDefinition_fontPlain11.draw(MenuAction.method2026(var1), 0, 9, 16776960, 1); // L: 414
			}

			if (!var5) { // L: 416
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 417
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 418
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 419
			Rasterizer3D.field2281 = true; // L: 420
			return var8; // L: 421
		}
	}
}
