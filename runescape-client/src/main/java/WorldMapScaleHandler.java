import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("r")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1461867137
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("e")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1201297815"
	)
	void method3819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) { // L: 14
			var8 = this.method3820(var8, var7); // L: 15
			var7 = this.method3847(var7); // L: 16
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile); // L: 17
		}
	} // L: 18

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-638925559"
	)
	int method3820(int var1, int var2) {
		if (var2 == 9) { // L: 21
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) { // L: 22
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3; // L: 23
		}

		return var1; // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1205509523"
	)
	int method3847(int var1) {
		if (var1 != 9 && var1 != 10) { // L: 28
			return var1 == 11 ? 8 : var1; // L: 29
		} else {
			return 1; // L: 30
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1145415965"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) { // L: 34
			this.tileTemplates = new byte[8][4][];
			this.init0();
			this.init1();
			this.init2();
			this.init3();
			this.init4();
			this.init5(); // L: 43
			this.init6(); // L: 44
			this.init7(); // L: 45
		}
	} // L: 46

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1144"
	)
	@Export("init0")
	void init0() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 49
		int var2 = 0; // L: 50

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 51
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 52
				if (var4 <= var3) { // L: 53
					var1[var2] = -1;
				}

				++var2; // L: 54
			}
		}

		this.tileTemplates[0][0] = var1; // L: 57
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 58
		var2 = 0; // L: 59

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 60
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 61
				if (var4 <= var3) { // L: 62
					var1[var2] = -1;
				}

				++var2; // L: 63
			}
		}

		this.tileTemplates[0][1] = var1; // L: 66
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 67
		var2 = 0; // L: 68

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 69
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 70
				if (var4 >= var3) { // L: 71
					var1[var2] = -1;
				}

				++var2; // L: 72
			}
		}

		this.tileTemplates[0][2] = var1; // L: 75
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 76
		var2 = 0; // L: 77

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 78
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 79
				if (var4 >= var3) { // L: 80
					var1[var2] = -1;
				}

				++var2; // L: 81
			}
		}

		this.tileTemplates[0][3] = var1; // L: 84
	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1022109285"
	)
	@Export("init1")
	void init1() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 88
		int var2 = 0; // L: 89

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 90
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 91
				if (var4 <= var3 >> 1) { // L: 92
					var1[var2] = -1;
				}

				++var2; // L: 93
			}
		}

		this.tileTemplates[1][0] = var1; // L: 96
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 97
		var2 = 0; // L: 98

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 99
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 100
				if (var2 >= 0 && var2 < var1.length) { // L: 101
					if (var4 >= var3 << 1) { // L: 105
						var1[var2] = -1;
					}

					++var2; // L: 106
				} else {
					++var2; // L: 102
				}
			}
		}

		this.tileTemplates[1][1] = var1; // L: 109
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 110
		var2 = 0; // L: 111

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 112
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 113
				if (var4 <= var3 >> 1) { // L: 114
					var1[var2] = -1;
				}

				++var2; // L: 115
			}
		}

		this.tileTemplates[1][2] = var1; // L: 118
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 119
		var2 = 0; // L: 120

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 121
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 122
				if (var4 >= var3 << 1) { // L: 123
					var1[var2] = -1;
				}

				++var2; // L: 124
			}
		}

		this.tileTemplates[1][3] = var1; // L: 127
	} // L: 128

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1467975580"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 131
		int var2 = 0; // L: 132

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 133
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 134
				if (var4 <= var3 >> 1) { // L: 135
					var1[var2] = -1;
				}

				++var2; // L: 136
			}
		}

		this.tileTemplates[2][0] = var1; // L: 139
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 140
		var2 = 0; // L: 141

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 142
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 143
				if (var4 >= var3 << 1) {
					var1[var2] = -1; // L: 144
				}

				++var2; // L: 145
			}
		}

		this.tileTemplates[2][1] = var1; // L: 148
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 149
		var2 = 0; // L: 150

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 151
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 152
				if (var4 <= var3 >> 1) { // L: 153
					var1[var2] = -1;
				}

				++var2; // L: 154
			}
		}

		this.tileTemplates[2][2] = var1; // L: 157
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 158
		var2 = 0; // L: 159

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 160
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 161
				if (var4 >= var3 << 1) { // L: 162
					var1[var2] = -1;
				}

				++var2; // L: 163
			}
		}

		this.tileTemplates[2][3] = var1; // L: 166
	} // L: 167

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1661716942"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 170
		int var2 = 0; // L: 171

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 172
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 173
				if (var4 >= var3 >> 1) { // L: 174
					var1[var2] = -1;
				}

				++var2; // L: 175
			}
		}

		this.tileTemplates[3][0] = var1; // L: 178
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 179
		var2 = 0; // L: 180

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 181
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 182
				if (var4 <= var3 << 1) { // L: 183
					var1[var2] = -1;
				}

				++var2; // L: 184
			}
		}

		this.tileTemplates[3][1] = var1; // L: 187
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 188
		var2 = 0; // L: 189

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 190
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 191
				if (var4 >= var3 >> 1) { // L: 192
					var1[var2] = -1;
				}

				++var2; // L: 193
			}
		}

		this.tileTemplates[3][2] = var1; // L: 196
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 197
		var2 = 0; // L: 198

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 199
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 200
				if (var4 <= var3 << 1) { // L: 201
					var1[var2] = -1;
				}

				++var2; // L: 202
			}
		}

		this.tileTemplates[3][3] = var1; // L: 205
	} // L: 206

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "22640304"
	)
	@Export("init4")
	void init4() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 209
		int var2 = 0; // L: 210

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 211
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 212
				if (var4 >= var3 >> 1) { // L: 213
					var1[var2] = -1;
				}

				++var2; // L: 214
			}
		}

		this.tileTemplates[4][0] = var1; // L: 217
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 218
		var2 = 0; // L: 219

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 220
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 221
				if (var4 <= var3 << 1) { // L: 222
					var1[var2] = -1;
				}

				++var2; // L: 223
			}
		}

		this.tileTemplates[4][1] = var1; // L: 226
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 227
		var2 = 0; // L: 228

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 229
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 230
				if (var4 >= var3 >> 1) { // L: 231
					var1[var2] = -1;
				}

				++var2; // L: 232
			}
		}

		this.tileTemplates[4][2] = var1; // L: 235
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 236
		var2 = 0; // L: 237

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 238
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 239
				if (var4 <= var3 << 1) { // L: 240
					var1[var2] = -1;
				}

				++var2; // L: 241
			}
		}

		this.tileTemplates[4][3] = var1; // L: 244
	} // L: 245

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("init5")
	void init5() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 248
		boolean var2 = false; // L: 249
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 250
		int var5 = 0; // L: 251

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 252
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 253
				if (var4 <= this.pixelsPerTile / 2) { // L: 254
					var1[var5] = -1;
				}

				++var5; // L: 255
			}
		}

		this.tileTemplates[5][0] = var1; // L: 258
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 259
		var5 = 0; // L: 260

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 261
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 262
				if (var3 <= this.pixelsPerTile / 2) { // L: 263
					var1[var5] = -1;
				}

				++var5; // L: 264
			}
		}

		this.tileTemplates[5][1] = var1; // L: 267
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 268
		var5 = 0; // L: 269

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 270
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 271
				if (var4 >= this.pixelsPerTile / 2) { // L: 272
					var1[var5] = -1;
				}

				++var5; // L: 273
			}
		}

		this.tileTemplates[5][2] = var1; // L: 276
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 277
		var5 = 0; // L: 278

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 279
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 280
				if (var3 >= this.pixelsPerTile / 2) { // L: 281
					var1[var5] = -1;
				}

				++var5; // L: 282
			}
		}

		this.tileTemplates[5][3] = var1; // L: 285
	} // L: 286

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("init6")
	void init6() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 289
		boolean var2 = false; // L: 290
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 291
		int var5 = 0; // L: 292

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 293
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 294
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 295
					var1[var5] = -1;
				}

				++var5; // L: 296
			}
		}

		this.tileTemplates[6][0] = var1; // L: 299
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 300
		var5 = 0; // L: 301

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 302
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 303
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 304
					var1[var5] = -1;
				}

				++var5; // L: 305
			}
		}

		this.tileTemplates[6][1] = var1; // L: 308
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 309
		var5 = 0; // L: 310

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 311
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 312
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 313
					var1[var5] = -1;
				}

				++var5; // L: 314
			}
		}

		this.tileTemplates[6][2] = var1; // L: 317
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 318
		var5 = 0; // L: 319

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 320
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 321
				if (var4 <= var3 - this.pixelsPerTile / 2) { // L: 322
					var1[var5] = -1;
				}

				++var5; // L: 323
			}
		}

		this.tileTemplates[6][3] = var1; // L: 326
	} // L: 327

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1742038975"
	)
	@Export("init7")
	void init7() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 330
		boolean var2 = false; // L: 331
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 332
		int var5 = 0; // L: 333

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 334
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 335
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 336
					var1[var5] = -1;
				}

				++var5; // L: 337
			}
		}

		this.tileTemplates[7][0] = var1; // L: 340
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 341
		var5 = 0; // L: 342

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 343
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 344
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 345
					var1[var5] = -1;
				}

				++var5; // L: 346
			}
		}

		this.tileTemplates[7][1] = var1; // L: 349
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 350
		var5 = 0; // L: 351

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 352
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 353
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 354
					var1[var5] = -1;
				}

				++var5; // L: 355
			}
		}

		this.tileTemplates[7][2] = var1; // L: 358
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 359
		var5 = 0; // L: 360

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 361
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 362
				if (var4 >= var3 - this.pixelsPerTile / 2) { // L: 363
					var1[var5] = -1;
				}

				++var5; // L: 364
			}
		}

		this.tileTemplates[7][3] = var1; // L: 367
	} // L: 368

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-43701379"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 40
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZS)I",
		garbageValue = "-3249"
	)
	static int method3857(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4318
			++ChatChannel.Interpreter_intStackSize; // L: 4319
			return 1; // L: 4320
		} else if (var0 == 7101) { // L: 4322
			UserComparator9.Interpreter_stringStackSize += 2; // L: 4323
			return 1; // L: 4324
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4326
			if (var0 == 7106) { // L: 4330
				++ChatChannel.Interpreter_intStackSize; // L: 4331
				return 1; // L: 4332
			} else if (var0 == 7107) { // L: 4334
				++ChatChannel.Interpreter_intStackSize; // L: 4335
				return 1; // L: 4336
			} else if (var0 == 7108) { // L: 4338
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = GameEngine.method717() ? 1 : 0; // L: 4339
				return 1; // L: 4340
			} else if (var0 == 7110) { // L: 4342
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 4343
				return 1; // L: 4344
			} else if (var0 == 7120) { // L: 4346
				--ChatChannel.Interpreter_intStackSize; // L: 4347
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 4348
				return 1; // L: 4349
			} else if (var0 == 7121) { // L: 4351
				ChatChannel.Interpreter_intStackSize -= 2; // L: 4352
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4353
				return 1; // L: 4354
			} else if (var0 == 7122) { // L: 4356
				ChatChannel.Interpreter_intStackSize -= 2; // L: 4357
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 4358
				return 1; // L: 4359
			} else {
				return 2; // L: 4361
			}
		} else {
			++ChatChannel.Interpreter_intStackSize; // L: 4327
			return 1; // L: 4328
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-579182952"
	)
	static void method3856() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 8972
			if (class160.method3253(Client.menuOpcodes[var0])) { // L: 8973
				if (var0 < Client.menuOptionsCount - 1) { // L: 8974
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8975
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8976
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8977
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8978
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8979
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8980
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8981
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8982
					}
				}

				--var0; // L: 8985
				--Client.menuOptionsCount; // L: 8986
			}
		}

		Language.method5270(); // L: 8989
	} // L: 8990
}
