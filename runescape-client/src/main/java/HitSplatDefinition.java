import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static AbstractArchive field2017;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -592555797
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1722715223
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 860140195
	)
	public int field2026;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 332626063
	)
	int field2021;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -161678465
	)
	int field2016;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1426101485
	)
	int field2029;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 195385179
	)
	int field2027;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1489450415
	)
	public int field2031;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2109795173
	)
	public int field2032;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 247260053
	)
	public int field2030;
	@ObfuscatedName("b")
	String field2034;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 242554481
	)
	public int field2035;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1781397165
	)
	public int field2019;
	@ObfuscatedName("m")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1586306339
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 837589615
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
		this.field2026 = 70; // L: 28
		this.field2021 = -1; // L: 29
		this.field2016 = -1; // L: 30
		this.field2029 = -1; // L: 31
		this.field2027 = -1; // L: 32
		this.field2031 = 0; // L: 33
		this.field2032 = 0; // L: 34
		this.field2030 = -1; // L: 35
		this.field2034 = ""; // L: 36
		this.field2035 = -1; // L: 37
		this.field2019 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-905711242"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1685495726"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method7752();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2021 = var1.method7752();
		} else if (var2 == 4) { // L: 67
			this.field2029 = var1.method7752();
		} else if (var2 == 5) { // L: 68
			this.field2016 = var1.method7752();
		} else if (var2 == 6) { // L: 69
			this.field2027 = var1.method7752();
		} else if (var2 == 7) { // L: 70
			this.field2031 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2034 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2026 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2032 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2030 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2035 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2019 = var1.readShort();
		} else if (var2 == 14) {
			this.field2030 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lgr;",
		garbageValue = "-303621175"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class388.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class122.method2800(var2) : null; // L: 106 107
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1527850435"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2034; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + Tile.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "-2128633016"
	)
	public SpritePixels method3623() {
		if (this.field2021 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2021); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2021, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2021); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "10"
	)
	public SpritePixels method3643() {
		if (this.field2016 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2016); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2016, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2016);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "33"
	)
	public SpritePixels method3625() {
		if (this.field2029 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2029); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2029, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2029); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "1"
	)
	public SpritePixels method3626() {
		if (this.field2027 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2027); // L: 152
			if (var1 != null) { // L: 153
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2027, 0); // L: 154
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2027); // L: 155
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)Lmt;",
		garbageValue = "9601"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				AbstractArchive var3 = field2017; // L: 165
				AbstractArchive var4 = class4.HitSplatDefinition_fontsArchive; // L: 166
				int var5 = this.fontId; // L: 167
				Font var2;
				if (!Ignored.method6774(var3, var5, 0)) { // L: 169
					var2 = null; // L: 170
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 174
					Font var6;
					if (var7 == null) { // L: 176
						var6 = null; // L: 177
					} else {
						Font var8 = new Font(var7, class426.SpriteBuffer_xOffsets, class142.SpriteBuffer_yOffsets, class359.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, class13.SpriteBuffer_spritePalette, class421.SpriteBuffer_pixels); // L: 180
						class426.SpriteBuffer_xOffsets = null; // L: 182
						class142.SpriteBuffer_yOffsets = null; // L: 183
						class359.SpriteBuffer_spriteWidths = null; // L: 184
						class456.SpriteBuffer_spriteHeights = null; // L: 185
						class13.SpriteBuffer_spritePalette = null; // L: 186
						class421.SpriteBuffer_pixels = null; // L: 187
						var6 = var8; // L: 189
					}

					var2 = var6; // L: 191
				}

				if (var2 != null) { // L: 194
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 196
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "44"
	)
	static final String method3632(int var0) {
		if (var0 < 100000) { // L: 433
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 434 435
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;Lmt;I)V",
		garbageValue = "1695432560"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Script.canvasWidth - 765) / 2; // L: 1201
		Login.loginBoxX = Login.xPadding + 202; // L: 1202
		Canvas.loginBoxCenter = Login.loginBoxX + 180; // L: 1203
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) { // L: 1204
			Archive var46;
			if (ScriptFrame.worldSelectBackSprites == null) { // L: 1206
				var46 = class304.archive8; // L: 1208
				var45 = var46.getGroupId("sl_back"); // L: 1210
				var25 = var46.getFileId(var45, ""); // L: 1211
				SpritePixels[] var50 = class430.method7547(var46, var45, var25); // L: 1212
				ScriptFrame.worldSelectBackSprites = var50; // L: 1214
			}

			IndexedSprite[] var51;
			if (class126.worldSelectFlagSprites == null) { // L: 1216
				var46 = class304.archive8; // L: 1218
				var45 = var46.getGroupId("sl_flags"); // L: 1220
				var25 = var46.getFileId(var45, ""); // L: 1221
				var51 = ClanChannelMember.method2867(var46, var45, var25); // L: 1222
				class126.worldSelectFlagSprites = var51; // L: 1224
			}

			if (FriendSystem.worldSelectArrows == null) { // L: 1226
				var46 = class304.archive8; // L: 1228
				var45 = var46.getGroupId("sl_arrows"); // L: 1230
				var25 = var46.getFileId(var45, ""); // L: 1231
				var51 = ClanChannelMember.method2867(var46, var45, var25); // L: 1232
				FriendSystem.worldSelectArrows = var51; // L: 1234
			}

			if (class220.worldSelectStars == null) { // L: 1236
				var46 = class304.archive8; // L: 1238
				var45 = var46.getGroupId("sl_stars"); // L: 1240
				var25 = var46.getFileId(var45, ""); // L: 1241
				var51 = ClanChannelMember.method2867(var46, var45, var25); // L: 1242
				class220.worldSelectStars = var51; // L: 1244
			}

			if (class266.worldSelectLeftSprite == null) { // L: 1246
				class266.worldSelectLeftSprite = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "leftarrow", "");
			}

			if (SceneTilePaint.worldSelectRightSprite == null) { // L: 1247
				SceneTilePaint.worldSelectRightSprite = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1248
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1249
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1250
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1251
			if (class220.worldSelectStars != null) { // L: 1252
				class220.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1253
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1254
				class220.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1255
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1256
			}

			if (FriendSystem.worldSelectArrows != null) { // L: 1258
				var32 = Login.xPadding + 280; // L: 1259
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1260
					FriendSystem.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var32, 4); // L: 1261
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1262
					FriendSystem.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var32 + 15, 4); // L: 1263
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1); // L: 1264
				var4 = Login.xPadding + 390; // L: 1265
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1266
					FriendSystem.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var4, 4); // L: 1267
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1268
					FriendSystem.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1269
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1270
				var45 = Login.xPadding + 500; // L: 1271
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1272
					FriendSystem.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var45, 4); // L: 1273
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1274
					FriendSystem.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var45 + 15, 4); // L: 1275
				}

				var0.draw("Location", var45 + 32, 17, 16777215, -1); // L: 1276
				var25 = Login.xPadding + 610; // L: 1277
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1278
					FriendSystem.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var25, 4); // L: 1279
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1280
					FriendSystem.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var25 + 15, 4); // L: 1281
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1); // L: 1282
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1284
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1285
			Login.hoveredWorldIndex = -1; // L: 1286
			if (ScriptFrame.worldSelectBackSprites != null) { // L: 1287
				var3 = 88; // L: 1288
				byte var41 = 19; // L: 1289
				var45 = 765 / (var3 + 1) - 1; // L: 1290
				var25 = 480 / (var41 + 1); // L: 1291

				int var35;
				do {
					var7 = var25; // L: 1293
					var35 = var45; // L: 1294
					if (var25 * (var45 - 1) >= World.World_count) { // L: 1295
						--var45;
					}

					if (var45 * (var25 - 1) >= World.World_count) { // L: 1296
						--var25;
					}

					if (var45 * (var25 - 1) >= World.World_count) { // L: 1297
						--var25;
					}
				} while(var25 != var7 || var45 != var35); // L: 1298

				var7 = (765 - var3 * var45) / (var45 + 1); // L: 1300
				if (var7 > 5) { // L: 1301
					var7 = 5;
				}

				var35 = (480 - var25 * var41) / (var25 + 1); // L: 1302
				if (var35 > 5) { // L: 1303
					var35 = 5;
				}

				int var37 = (765 - var3 * var45 - var7 * (var45 - 1)) / 2; // L: 1304
				int var38 = (480 - var25 * var41 - var35 * (var25 - 1)) / 2; // L: 1305
				int var28 = (var25 + World.World_count - 1) / var25; // L: 1306
				Login.worldSelectPagesCount = var28 - var45; // L: 1307
				if (class266.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1308
					class266.worldSelectLeftSprite.drawAt(8, class78.canvasHeight / 2 - class266.worldSelectLeftSprite.subHeight / 2); // L: 1309
				}

				if (SceneTilePaint.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1311
					SceneTilePaint.worldSelectRightSprite.drawAt(Script.canvasWidth - SceneTilePaint.worldSelectRightSprite.subWidth - 8, class78.canvasHeight / 2 - SceneTilePaint.worldSelectRightSprite.subHeight / 2); // L: 1312
				}

				int var29 = var38 + 23; // L: 1314
				int var39 = var37 + Login.xPadding; // L: 1315
				int var40 = 0; // L: 1316
				boolean var42 = false; // L: 1317
				int var43 = Login.worldSelectPage; // L: 1318

				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) { // L: 1319 1320
					World var18 = class362.World_worlds[var17]; // L: 1323
					boolean var19 = true; // L: 1324
					String var20 = Integer.toString(var18.population); // L: 1325
					if (var18.population == -1) { // L: 1326
						var20 = "OFF"; // L: 1327
						var19 = false; // L: 1328
					} else if (var18.population > 1980) { // L: 1330
						var20 = "FULL"; // L: 1331
						var19 = false; // L: 1332
					}

					int var22 = 0; // L: 1335
					byte var21;
					if (var18.isBeta()) { // L: 1336
						if (var18.isMembersOnly()) { // L: 1337
							var21 = 7;
						} else {
							var21 = 6; // L: 1338
						}
					} else if (var18.isDeadman()) { // L: 1340
						var22 = 16711680; // L: 1341
						if (var18.isMembersOnly()) { // L: 1342
							var21 = 5;
						} else {
							var21 = 4; // L: 1343
						}
					} else if (var18.method1597()) { // L: 1345
						if (var18.isMembersOnly()) { // L: 1346
							var21 = 9;
						} else {
							var21 = 8; // L: 1347
						}
					} else if (var18.isPvp()) { // L: 1349
						if (var18.isMembersOnly()) { // L: 1350
							var21 = 3;
						} else {
							var21 = 2; // L: 1351
						}
					} else if (var18.isMembersOnly()) { // L: 1354
						var21 = 1;
					} else {
						var21 = 0; // L: 1355
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var41 + var29 && var19) { // L: 1357
						Login.hoveredWorldIndex = var17; // L: 1358
						ScriptFrame.worldSelectBackSprites[var21].drawTransOverlayAt(var39, var29, 128, 16777215); // L: 1359
						var42 = true; // L: 1360
					} else {
						ScriptFrame.worldSelectBackSprites[var21].drawAt(var39, var29); // L: 1362
					}

					if (class126.worldSelectFlagSprites != null) { // L: 1363
						class126.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var41 / 2 + var29 + 5, var22, -1); // L: 1364
					var1.drawCentered(var20, var39 + 60, var41 / 2 + var29 + 5, 268435455, -1); // L: 1365
					var29 = var29 + var41 + var35; // L: 1366
					++var40; // L: 1367
					if (var40 >= var25) {
						var29 = var38 + 23; // L: 1368
						var39 = var39 + var7 + var3; // L: 1369
						var40 = 0; // L: 1370
						++var43; // L: 1371
					}
				}

				if (var42) { // L: 1374
					var17 = var1.stringWidth(class362.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1375
					int var30 = var1.ascent + 8; // L: 1376
					int var44 = MouseHandler.MouseHandler_y + 25; // L: 1377
					if (var30 + var44 > 480) { // L: 1378
						var44 = MouseHandler.MouseHandler_y - 25 - var30; // L: 1379
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120); // L: 1381
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0); // L: 1382
					var1.drawCentered(class362.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1); // L: 1383
				}
			}

			Message.rasterProvider.drawFull(0, 0); // L: 1386
		} else {
			class16.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1390
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1391
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1392
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1393
				var3 = 20; // L: 1394
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1395
				var4 = 253 - var3; // L: 1396
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1397
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1398
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1399
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1400
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1401
			}

			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) { // L: 1403
				class4.titleboxSprite.drawAt(Login.loginBoxX + 180 - class4.titleboxSprite.subWidth / 2, 271 - class4.titleboxSprite.subHeight / 2); // L: 1404
				var31 = 201; // L: 1405
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1406
				var32 = var31 + 15; // L: 1407
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1408
				var32 += 15; // L: 1409
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1410
				var32 += 15; // L: 1411
				var32 += 7; // L: 1412
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1413
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0); // L: 1414
					var33 = 200; // L: 1415

					for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) { // L: 1416 1417 1418
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0); // L: 1420
					var32 += 15; // L: 1421

					for (var6 = NetCache.method5952(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) { // L: 1422 1423 1424
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1426
					var32 += 15; // L: 1427
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1430
				class4.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1431
				short var23;
				if (Login.loginIndex == 0) { // L: 1432
					var31 = 251; // L: 1433
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1434
					var32 = var31 + 30; // L: 1435
					var4 = Login.loginBoxX + 180 - 80; // L: 1436
					var23 = 291; // L: 1437
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1438
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1439
					var4 = Login.loginBoxX + 180 + 80; // L: 1440
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1441
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1442
				} else if (Login.loginIndex == 1) { // L: 1444
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1445
					var31 = 236; // L: 1446
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1447
					var32 = var31 + 15; // L: 1448
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1449
					var32 += 15; // L: 1450
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1451
					var32 += 15; // L: 1452
					var4 = Login.loginBoxX + 180 - 80; // L: 1453
					var23 = 321; // L: 1454
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1455
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1456
					var4 = Login.loginBoxX + 180 + 80; // L: 1457
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1458
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1459
				} else if (Login.loginIndex == 2) { // L: 1461
					var31 = 201; // L: 1462
					var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var31, 16776960, 0); // L: 1463
					var32 = var31 + 15; // L: 1464
					var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var32, 16776960, 0); // L: 1465
					var32 += 15; // L: 1466
					var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var32, 16776960, 0); // L: 1467
					var32 += 15; // L: 1468
					var32 += 7; // L: 1469
					var0.draw("Login: ", Canvas.loginBoxCenter - 110, var32, 16777215, 0); // L: 1470
					var33 = 200; // L: 1471

					for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1472 1473 1474
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 70, var32, 16777215, 0); // L: 1476
					var32 += 15; // L: 1477

					for (var6 = NetCache.method5952(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) { // L: 1478 1479 1480
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 108, var32, 16777215, 0); // L: 1482
					var32 += 15; // L: 1483
					var31 = 277; // L: 1484
					var7 = Canvas.loginBoxCenter + -117; // L: 1485
					boolean var9 = Client.Login_isUsernameRemembered; // L: 1487
					boolean var10 = Login.field912; // L: 1488
					IndexedSprite var26 = var9 ? (var10 ? DynamicObject.field979 : class228.options_buttons_2Sprite) : (var10 ? class113.field1427 : class345.options_buttons_0Sprite); // L: 1490
					var26.drawAt(var7, var31); // L: 1493
					var7 = var7 + var26.subWidth + 5; // L: 1494
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0); // L: 1495
					var7 = Canvas.loginBoxCenter + 24; // L: 1496
					boolean var13 = class19.clientPreferences.method2247(); // L: 1498
					boolean var14 = Login.field913; // L: 1499
					IndexedSprite var12 = var13 ? (var14 ? DynamicObject.field979 : class228.options_buttons_2Sprite) : (var14 ? class113.field1427 : class345.options_buttons_0Sprite); // L: 1501
					var12.drawAt(var7, var31); // L: 1504
					var7 = var7 + var12.subWidth + 5; // L: 1505
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0); // L: 1506
					var32 = var31 + 15; // L: 1507
					int var15 = Canvas.loginBoxCenter - 80; // L: 1508
					short var16 = 321; // L: 1509
					class6.titlebuttonSprite.drawAt(var15 - 73, var16 - 20); // L: 1510
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0); // L: 1511
					var15 = Canvas.loginBoxCenter + 80; // L: 1512
					class6.titlebuttonSprite.drawAt(var15 - 73, var16 - 20); // L: 1513
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0); // L: 1514
					var31 = 357; // L: 1515
					switch(Login.field902) { // L: 1516
					case 2:
						TileItem.field1299 = "Having trouble logging in?"; // L: 1521
						break;
					default:
						TileItem.field1299 = "Can't login? Click here."; // L: 1518
					}

					ArchiveLoader.field1022 = new Bounds(Canvas.loginBoxCenter, var31, var1.stringWidth(TileItem.field1299), 11); // L: 1524
					PcmPlayer.field294 = new Bounds(Canvas.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1525
					var1.drawCentered(TileItem.field1299, Canvas.loginBoxCenter, var31, 16777215, 0); // L: 1526
				} else if (Login.loginIndex == 3) { // L: 1528
					var31 = 201; // L: 1529
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1530
					var32 = var31 + 20; // L: 1531
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1532
					var32 += 15; // L: 1533
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1534
					var32 += 15; // L: 1535
					var4 = Login.loginBoxX + 180; // L: 1536
					var23 = 276; // L: 1537
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1538
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1539
					var4 = Login.loginBoxX + 180; // L: 1540
					var23 = 326; // L: 1541
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1542
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1543
				} else {
					short var8;
					if (Login.loginIndex == 4) { // L: 1545
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1546
						var31 = 236; // L: 1547
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1548
						var32 = var31 + 15; // L: 1549
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1550
						var32 += 15; // L: 1551
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1552
						var32 += 15; // L: 1553
						var0.draw("PIN: " + NetCache.method5952(World.otp) + (Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1554
						var32 -= 8; // L: 1555
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1556
						var32 += 15; // L: 1557
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1558
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1559
						var45 = var32 - var0.ascent; // L: 1560
						IndexedSprite var34;
						if (Login.field895) { // L: 1562
							var34 = class228.options_buttons_2Sprite; // L: 1563
						} else {
							var34 = class345.options_buttons_0Sprite; // L: 1566
						}

						var34.drawAt(var4, var45); // L: 1568
						var32 += 15; // L: 1569
						var7 = Login.loginBoxX + 180 - 80; // L: 1570
						var8 = 321; // L: 1571
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1572
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1573
						var7 = Login.loginBoxX + 180 + 80; // L: 1574
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1575
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1576
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1577
					} else if (Login.loginIndex == 5) { // L: 1579
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1580
						var31 = 221; // L: 1581
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1582
						var32 = var31 + 15; // L: 1583
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1584
						var32 += 15; // L: 1585
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1586
						var32 += 15; // L: 1587
						var32 += 14; // L: 1588
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0); // L: 1589
						var33 = 174; // L: 1590

						for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1591 1592 1593
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0); // L: 1595
						var32 += 15; // L: 1596
						var25 = Login.loginBoxX + 180 - 80; // L: 1597
						short var36 = 321; // L: 1598
						class6.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1599
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0); // L: 1600
						var25 = Login.loginBoxX + 180 + 80; // L: 1601
						class6.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1602
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1603
						var36 = 356; // L: 1604
						var1.drawCentered("Still having trouble logging in?", Canvas.loginBoxCenter, var36, 268435455, 0); // L: 1605
					} else if (Login.loginIndex == 6) { // L: 1607
						var31 = 201; // L: 1608
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1609
						var32 = var31 + 15; // L: 1610
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1611
						var32 += 15; // L: 1612
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1613
						var32 += 15; // L: 1614
						var4 = Login.loginBoxX + 180; // L: 1615
						var23 = 321; // L: 1616
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1617
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1618
					} else if (Login.loginIndex == 7) { // L: 1620
						if (VarpDefinition.field1821 && !Client.onMobile) { // L: 1621
							var31 = 201; // L: 1622
							var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var31, 16776960, 0); // L: 1623
							var32 = var31 + 15; // L: 1624
							var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var32, 16776960, 0); // L: 1625
							var32 += 15; // L: 1626
							var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var32, 16776960, 0); // L: 1627
							var4 = Canvas.loginBoxCenter - 150; // L: 1628
							var32 += 10; // L: 1629

							for (var45 = 0; var45 < 8; ++var45) { // L: 1630
								class6.titlebuttonSprite.method8135(var4, var32, 30, 40); // L: 1631
								boolean var47 = var45 == Login.field910 & Client.cycle % 40 < 20; // L: 1632
								var0.draw((Login.field911[var45] == null ? "" : Login.field911[var45]) + (var47 ? class122.colorStartTag(16776960) + "|" : ""), var4 + 10, var32 + 27, 16777215, 0); // L: 1633
								if (var45 != 1 && var45 != 3) { // L: 1634
									var4 += 35; // L: 1639
								} else {
									var4 += 50; // L: 1635
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var32 + 27, 16777215, 0); // L: 1636
								}
							}

							var45 = Canvas.loginBoxCenter - 80; // L: 1642
							short var48 = 321; // L: 1643
							class6.titlebuttonSprite.drawAt(var45 - 73, var48 - 20); // L: 1644
							var0.drawCentered("Submit", var45, var48 + 5, 16777215, 0); // L: 1645
							var45 = Canvas.loginBoxCenter + 80; // L: 1646
							class6.titlebuttonSprite.drawAt(var45 - 73, var48 - 20); // L: 1647
							var0.drawCentered("Cancel", var45, var48 + 5, 16777215, 0); // L: 1648
						} else {
							var31 = 216; // L: 1651
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1652
							var32 = var31 + 15; // L: 1653
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1654
							var32 += 15; // L: 1655
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1656
							var32 += 15; // L: 1657
							var4 = Login.loginBoxX + 180 - 80; // L: 1658
							var23 = 321; // L: 1659
							class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1660
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1661
							var4 = Login.loginBoxX + 180 + 80; // L: 1662
							class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1663
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1664
						}
					} else if (Login.loginIndex == 8) { // L: 1667
						var31 = 216; // L: 1668
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1669
						var32 = var31 + 15; // L: 1670
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1671
						var32 += 15; // L: 1672
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1673
						var32 += 15; // L: 1674
						var4 = Login.loginBoxX + 180 - 80; // L: 1675
						var23 = 321; // L: 1676
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1677
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1678
						var4 = Login.loginBoxX + 180 + 80; // L: 1679
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1680
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1681
					} else if (Login.loginIndex == 9) { // L: 1683
						var31 = 221; // L: 1684
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1685
						var32 = var31 + 25; // L: 1686
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1687
						var32 += 25; // L: 1688
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1689
						var4 = Login.loginBoxX + 180; // L: 1690
						var23 = 311; // L: 1691
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1692
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1693
					} else if (Login.loginIndex == 10) { // L: 1695
						var32 = Login.loginBoxX + 180; // L: 1696
						var33 = 209; // L: 1697
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1698
						var4 = var33 + 20; // L: 1699
						Login.field914.drawAt(var32 - 109, var4); // L: 1700
						IgnoreList.field4284.drawAt(var32 - 48, var4 + 18); // L: 1701
					} else if (Login.loginIndex == 12) { // L: 1703
						var32 = Canvas.loginBoxCenter; // L: 1704
						var33 = 216; // L: 1705
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0); // L: 1706
						var4 = var33 + 17; // L: 1707
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0); // L: 1708
						var4 += 17; // L: 1709
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0); // L: 1710
						var4 += 17; // L: 1711
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0); // L: 1712
						var32 = Canvas.loginBoxCenter - 80; // L: 1713
						var33 = 311; // L: 1714
						class6.titlebuttonSprite.drawAt(var32 - 73, var33 - 20); // L: 1715
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0); // L: 1716
						var32 = Canvas.loginBoxCenter + 80; // L: 1717
						class6.titlebuttonSprite.drawAt(var32 - 73, var33 - 20); // L: 1718
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0); // L: 1719
					} else if (Login.loginIndex == 13) { // L: 1721
						var31 = 231; // L: 1722
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0); // L: 1723
						var32 = var31 + 20; // L: 1724
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1725
						var4 = Login.loginBoxX + 180; // L: 1726
						var31 = 311; // L: 1727
						class6.titlebuttonSprite.drawAt(var4 - 73, var31 - 20); // L: 1728
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0); // L: 1729
					} else if (Login.loginIndex == 14) { // L: 1731
						var31 = 201; // L: 1732
						String var24 = ""; // L: 1733
						var5 = ""; // L: 1734
						var6 = ""; // L: 1735
						switch(Login.field897) { // L: 1736
						case 0:
							var24 = "Your account has been disabled."; // L: 1746
							var5 = Strings.field3670; // L: 1747
							var6 = ""; // L: 1748
							break; // L: 1749
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1739
							var5 = Strings.field3709; // L: 1740
							var6 = ""; // L: 1741
							break;
						default:
							class135.Login_promptCredentials(false); // L: 1753
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1757
						var32 = var31 + 15; // L: 1758
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1759
						var32 += 15; // L: 1760
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1761
						var32 += 15; // L: 1762
						var7 = Login.loginBoxX + 180; // L: 1763
						var8 = 276; // L: 1764
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1765
						var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0); // L: 1766
						var7 = Login.loginBoxX + 180; // L: 1767
						var8 = 326; // L: 1768
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1769
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1770
					} else if (Login.loginIndex == 24) { // L: 1772
						var31 = 221; // L: 1773
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1774
						var32 = var31 + 15; // L: 1775
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1776
						var32 += 15; // L: 1777
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1778
						var32 += 15; // L: 1779
						var4 = Login.loginBoxX + 180; // L: 1780
						var23 = 301; // L: 1781
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1782
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1783
					} else if (Login.loginIndex == 26) { // L: 1785
						var31 = 216; // L: 1786
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1787
						var32 = var31 + 15; // L: 1788
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1789
						var32 += 15; // L: 1790
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1791
						var32 += 15; // L: 1792
						var4 = Login.loginBoxX + 180 - 80; // L: 1793
						var23 = 321; // L: 1794
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1795
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1796
						var4 = Login.loginBoxX + 180 + 80; // L: 1797
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1798
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1799
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1802
				int[] var27 = new int[4]; // L: 1803
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 1804
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class78.canvasHeight); // L: 1805
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1806
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1807
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 1808
			}

			class145.title_muteSprite[class19.clientPreferences.method2317() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1810
			if (Client.gameState > 5 && Language.Language_EN == class134.clientLanguage) { // L: 1811
				if (UserComparator5.field1385 != null) { // L: 1812
					var32 = Login.xPadding + 5; // L: 1813
					var33 = 463; // L: 1814
					byte var52 = 100; // L: 1815
					byte var49 = 35; // L: 1816
					UserComparator5.field1385.drawAt(var32, var33); // L: 1817
					var0.drawCentered("World" + " " + Client.worldId, var52 / 2 + var32, var49 / 2 + var33 - 2, 16777215, 0); // L: 1818
					if (class174.World_request != null) { // L: 1819
						var1.drawCentered("Loading...", var52 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var52 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0); // L: 1820
					}
				} else {
					UserComparator5.field1385 = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "sl_button", ""); // L: 1823
				}
			}

		}
	} // L: 1388 1826

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-17"
	)
	static void method3624(int var0) {
		if (var0 != Client.loginState) { // L: 12472
			Client.loginState = var0; // L: 12473
		}
	} // L: 12474
}
