import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1737800845
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1895359321
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1681619933
	)
	public int field3364;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -334206497
	)
	int field3365;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 54312143
	)
	int field3366;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1316651061
	)
	int field3367;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2079925537
	)
	int field3372;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2039546161
	)
	public int field3378;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 74632649
	)
	public int field3370;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -854871663
	)
	public int field3371;
	@ObfuscatedName("p")
	String field3358;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1999046971
	)
	public int field3375;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1539092209
	)
	public int field3368;
	@ObfuscatedName("o")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -979456213
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -351254549
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field3364 = 70; // L: 28
		this.field3365 = -1; // L: 29
		this.field3366 = -1; // L: 30
		this.field3367 = -1; // L: 31
		this.field3372 = -1; // L: 32
		this.field3378 = 0; // L: 33
		this.field3370 = 0; // L: 34
		this.field3371 = -1; // L: 35
		this.field3358 = ""; // L: 36
		this.field3375 = -1; // L: 37
		this.field3368 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1255296319"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IB)V",
		garbageValue = "12"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method5833();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field3365 = var1.method5833();
		} else if (var2 == 4) { // L: 73
			this.field3367 = var1.method5833();
		} else if (var2 == 5) { // L: 74
			this.field3366 = var1.method5833();
		} else if (var2 == 6) { // L: 75
			this.field3372 = var1.method5833();
		} else if (var2 == 7) { // L: 76
			this.field3378 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field3358 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field3364 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field3370 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field3371 = 0;
		} else if (var2 == 12) { // L: 81
			this.field3375 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field3368 = var1.readShort();
		} else if (var2 == 14) {
			this.field3371 = var1.readUnsignedShort(); // L: 83
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljz;",
		garbageValue = "-718809763"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = FontName.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ScriptFrame.method1222(var2) : null; // L: 112 113
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1367111183"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3358; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + GrandExchangeOfferOwnWorldComparator.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1595522971"
	)
	public SpritePixels method4764() {
		if (this.field3365 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3365); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3365, 0); // L: 130
				if (var1 != null) { // L: 131
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3365);
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Llm;",
		garbageValue = "49"
	)
	public SpritePixels method4770() {
		if (this.field3366 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3366); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3366, 0); // L: 140
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3366); // L: 141
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "1511725830"
	)
	public SpritePixels method4769() {
		if (this.field3367 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3367); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3367, 0); // L: 150
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3367); // L: 151
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-2138481070"
	)
	public SpritePixels method4766() {
		if (this.field3372 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3372); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3372, 0); // L: 160
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3372); // L: 161
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lkl;",
		garbageValue = "1442657906"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				AbstractArchive var3 = Frames.field1904; // L: 171
				AbstractArchive var4 = HitSplatDefinition_fontsArchive; // L: 172
				int var5 = this.fontId; // L: 173
				byte[] var7 = var3.takeFile(var5, 0); // L: 177
				boolean var6;
				if (var7 == null) { // L: 178
					var6 = false; // L: 179
				} else {
					GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7); // L: 182
					var6 = true; // L: 183
				}

				Font var2;
				if (!var6) { // L: 185
					var2 = null; // L: 186
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 190
					Font var10;
					if (var8 == null) { // L: 192
						var10 = null; // L: 193
					} else {
						Font var9 = new Font(var8, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels); // L: 196
						class105.SpriteBuffer_xOffsets = null; // L: 198
						class336.SpriteBuffer_yOffsets = null; // L: 199
						class336.SpriteBuffer_spriteWidths = null; // L: 200
						class225.SpriteBuffer_spriteHeights = null; // L: 201
						HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 202
						class2.SpriteBuffer_pixels = null; // L: 203
						var10 = var9; // L: 205
					}

					var2 = var10; // L: 207
				}

				if (var2 != null) { // L: 210
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 212
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1153896983"
	)
	public static String method4768(CharSequence var0) {
		return ReflectionCheck.method2449('*', var0.length()); // L: 184
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-483129503"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class90.Client_plane][var0][var1]; // L: 7523
		if (var2 == null) { // L: 7524
			MilliClock.scene.removeGroundItemPile(class90.Client_plane, var0, var1); // L: 7525
		} else {
			long var3 = -99999999L; // L: 7528
			TileItem var5 = null; // L: 7529

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7530 7531 7539
				ItemComposition var7 = class281.ItemDefinition_get(var6.id); // L: 7532
				long var11 = (long)var7.price; // L: 7533
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1); // L: 7534
				}

				if (var11 > var3) { // L: 7535
					var3 = var11; // L: 7536
					var5 = var6; // L: 7537
				}
			}

			if (var5 == null) { // L: 7541
				MilliClock.scene.removeGroundItemPile(class90.Client_plane, var0, var1); // L: 7542
			} else {
				var2.addLast(var5); // L: 7545
				TileItem var13 = null; // L: 7546
				TileItem var8 = null; // L: 7547

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7548 7549 7554
					if (var5.id != var6.id) { // L: 7550
						if (var13 == null) { // L: 7551
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 7552
							var8 = var6;
						}
					}
				}

				long var9 = TextureProvider.calculateTag(var0, var1, 3, false, 0); // L: 7556
				MilliClock.scene.newGroundItemPile(class90.Client_plane, var0, var1, WorldMapRegion.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class90.Client_plane), var5, var9, var13, var8); // L: 7557
			}
		}
	} // L: 7526 7543 7558
}
