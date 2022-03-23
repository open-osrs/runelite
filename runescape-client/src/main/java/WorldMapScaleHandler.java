import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 694071541
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("o")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-2044024529"
	)
	void method5091(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) { // L: 14
			var8 = this.method5133(var8, var7); // L: 15
			var7 = this.method5093(var7); // L: 16
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile); // L: 17
		}
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1091300418"
	)
	int method5133(int var1, int var2) {
		if (var2 == 9) { // L: 21
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) { // L: 22
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) { // L: 23
			var1 = var1 + 3 & 3;
		}

		return var1; // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-606524764"
	)
	int method5093(int var1) {
		if (var1 != 9 && var1 != 10) { // L: 28
			return var1 == 11 ? 8 : var1; // L: 29
		} else {
			return 1; // L: 30
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1510815448"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) { // L: 34
			this.tileTemplates = new byte[8][4][]; // L: 37
			this.init0(); // L: 38
			this.init1(); // L: 39
			this.init2(); // L: 40
			this.init3(); // L: 41
			this.init4(); // L: 42
			this.init5(); // L: 43
			this.init6(); // L: 44
			this.init7(); // L: 45
		}
	} // L: 35 46

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1267924905"
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
				if (var4 <= var3) {
					var1[var2] = -1; // L: 62
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
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
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) { // L: 114
					var1[var2] = -1;
				}

				++var2; // L: 115
			}
		}

		this.tileTemplates[1][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1211446776"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0; // L: 132

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 133
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2; // L: 136
			}
		}

		this.tileTemplates[2][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile]; // L: 140
		var2 = 0; // L: 141

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 143
				if (var4 >= var3 << 1) {
					var1[var2] = -1; // L: 144
				}

				++var2; // L: 145
			}
		}

		this.tileTemplates[2][1] = var1; // L: 148
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 151
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 152
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][2] = var1; // L: 157
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) { // L: 160
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) { // L: 161
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][3] = var1;
	} // L: 167

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1003972417"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0; // L: 171

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) { // L: 172
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) { // L: 173
				if (var4 >= var3 >> 1) {
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-936012936"
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
				if (var4 <= var3 << 1) {
					var1[var2] = -1; // L: 222
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "313760974"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-367257295"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1603557132"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgf;I)V",
		garbageValue = "-1027511011"
	)
	static final void method5135(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 113
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var28 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						int var17 = var11 & 7; // L: 125
						int var18 = var12 & 7; // L: 126
						int var19 = var7 & 3; // L: 129
						int var16;
						if (var19 == 0) { // L: 130
							var16 = var17; // L: 131
						} else if (var19 == 1) { // L: 134
							var16 = var18; // L: 135
						} else if (var19 == 2) { // L: 138
							var16 = 7 - var17; // L: 139
						} else {
							var16 = 7 - var18; // L: 142
						}

						int var22 = var2 + var16; // L: 146
						int var25 = var11 & 7; // L: 149
						int var26 = var12 & 7; // L: 150
						int var27 = var7 & 3; // L: 153
						int var24;
						if (var27 == 0) { // L: 154
							var24 = var26; // L: 155
						} else if (var27 == 1) { // L: 158
							var24 = 7 - var25; // L: 159
						} else if (var27 == 2) { // L: 162
							var24 = 7 - var26; // L: 163
						} else {
							var24 = var25; // L: 166
						}

						class127.loadTerrain(var28, var1, var22, var24 + var3, 0, 0, var7); // L: 168
					} else {
						class127.loadTerrain(var28, 0, -1, -1, 0, 0, 0); // L: 170
					}
				}
			}
		}

	} // L: 174

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "22"
	)
	static int method5134(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 818
			var0 -= 1000; // L: 819
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 820
		} else {
			var3 = var2 ? class432.scriptDotWidget : class341.scriptActiveWidget; // L: 822
		}

		class290.invalidateWidget(var3); // L: 823
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 824
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 844
				var3.modelType = 2; // L: 845
				var3.modelId = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 846
				return 1; // L: 847
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 849
				var3.modelType = 3; // L: 850
				var3.modelId = class19.localPlayer.appearance.getChatHeadId(); // L: 851
				return 1; // L: 852
			} else {
				return 2; // L: 854
			}
		} else {
			class295.Interpreter_intStackSize -= 2; // L: 825
			int var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 826
			int var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 827
			var3.itemId = var4; // L: 828
			var3.itemQuantity = var5; // L: 829
			ItemComposition var6 = class67.ItemDefinition_get(var4); // L: 830
			var3.modelAngleX = var6.xan2d; // L: 831
			var3.modelAngleY = var6.yan2d; // L: 832
			var3.modelAngleZ = var6.zan2d; // L: 833
			var3.modelOffsetX = var6.offsetX2d; // L: 834
			var3.modelOffsetY = var6.offsetY2d; // L: 835
			var3.modelZoom = var6.zoom2d; // L: 836
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 837
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 838
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 839
			}

			if (var3.field3398 > 0) { // L: 840
				var3.modelZoom = var3.modelZoom * 32 / var3.field3398;
			} else if (var3.rawWidth > 0) { // L: 841
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 842
		}
	}
}
