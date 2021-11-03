import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 811469011
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("w")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1; // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1525676958"
	)
	void method4086(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) { // L: 14
			var8 = this.method4084(var8, var7); // L: 15
			var7 = this.method4065(var7);
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "44"
	)
	int method4084(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "332241717"
	)
	int method4065(int var1) {
		if (var1 != 9 && var1 != 10) { // L: 28
			return var1 == 11 ? 8 : var1; // L: 29
		} else {
			return 1; // L: 30
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-139796910"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6694"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "478227481"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "654314335"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1406724170"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804052877"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-507566900"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-1513370360"
	)
	static long method4096(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') { // L: 23
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lcp;IIII)V",
		garbageValue = "-1638178326"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9477
		if (Client.menuOptionsCount < 400) { // L: 9478
			if (var4.transforms != null) { // L: 9479
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9480
				if (var4.isInteractable) { // L: 9481
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9482
						String var5 = var4.name; // L: 9483
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1145 != 0) { // L: 9484
							var6 = var0.field1145 != -1 ? var0.field1145 * -947188393 * 1234710119 : var4.combatLevel * -365575447 * 1462580569; // L: 9485
							var9 = HealthBarDefinition.localPlayer.combatLevel; // L: 9488
							int var10 = var9 - var6; // L: 9490
							String var8;
							if (var10 < -9) { // L: 9491
								var8 = MouseHandler.colorStartTag(16711680); // L: 9492
							} else if (var10 < -6) { // L: 9495
								var8 = MouseHandler.colorStartTag(16723968); // L: 9496
							} else if (var10 < -3) { // L: 9499
								var8 = MouseHandler.colorStartTag(16740352); // L: 9500
							} else if (var10 < 0) { // L: 9503
								var8 = MouseHandler.colorStartTag(16756736); // L: 9504
							} else if (var10 > 9) { // L: 9507
								var8 = MouseHandler.colorStartTag(65280); // L: 9508
							} else if (var10 > 6) { // L: 9511
								var8 = MouseHandler.colorStartTag(4259584); // L: 9512
							} else if (var10 > 3) { // L: 9515
								var8 = MouseHandler.colorStartTag(8453888); // L: 9516
							} else if (var10 > 0) { // L: 9519
								var8 = MouseHandler.colorStartTag(12648192); // L: 9520
							} else {
								var8 = MouseHandler.colorStartTag(16776960); // L: 9523
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9525
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9527
							EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9528
						}

						if (Client.isItemSelected == 1) { // L: 9531
							EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9532
						} else if (Client.isSpellSelected) { // L: 9535
							if ((class116.selectedSpellFlags & 2) == 2) { // L: 9536
								EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9537
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9542
							String[] var7 = var4.actions; // L: 9543
							int var11;
							if (var7 != null) { // L: 9544
								for (var11 = 4; var11 >= 0; --var11) { // L: 9545
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9546
										var9 = 0; // L: 9547
										if (var11 == 0) { // L: 9548
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9549
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9550
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9551
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9552
											var9 = var6 + 13;
										}

										EnumComposition.insertMenuItemNoShift(var7[var11], MouseHandler.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9553
									}
								}
							}

							if (var7 != null) { // L: 9558
								for (var11 = 4; var11 >= 0; --var11) { // L: 9559
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9560
										short var12 = 0; // L: 9561
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9562
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > HealthBarDefinition.localPlayer.combatLevel) { // L: 9563
												var12 = 2000; // L: 9564
											}

											var9 = 0; // L: 9566
											if (var11 == 0) { // L: 9567
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9568
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9569
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9570
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9571
												var9 = var12 + 13;
											}

											EnumComposition.insertMenuItemNoShift(var7[var11], MouseHandler.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9572
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9577
								EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9578
							}
						}

					}
				}
			}
		}
	} // L: 9582

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIZB)V",
		garbageValue = "-94"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10259
		int var5 = var0.height; // L: 10260
		if (var0.widthAlignment == 0) { // L: 10261
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10262
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10263
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10264
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10265
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 10266
		}

		if (var0.widthAlignment == 4) { // L: 10267
			var0.width = var0.field3068 * var0.height / var0.field3069;
		}

		if (var0.heightAlignment == 4) { // L: 10268
			var0.height = var0.width * var0.field3069 / var0.field3068;
		}

		if (var0.contentType == 1337) { // L: 10269
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10270
			ScriptEvent var6 = new ScriptEvent(); // L: 10271
			var6.widget = var0; // L: 10272
			var6.args = var0.onResize; // L: 10273
			Client.scriptEvents.addFirst(var6); // L: 10274
		}

	} // L: 10276
}
