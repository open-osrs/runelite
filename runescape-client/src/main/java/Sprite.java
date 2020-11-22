import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Sprite")
public final class Sprite extends Rasterizer2D {
	@ObfuscatedName("f")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("b")
	@Export("subWidth")
	public int subWidth;
	@ObfuscatedName("l")
	@Export("subHeight")
	public int subHeight;
	@ObfuscatedName("m")
	@Export("xOffset")
	public int xOffset;
	@ObfuscatedName("z")
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("q")
	@Export("width")
	public int width;
	@ObfuscatedName("k")
	@Export("height")
	public int height;

	public Sprite(int[] var1, int var2, int var3) {
		this.pixels = var1; // L: 26
		this.subWidth = this.width = var2; // L: 27
		this.subHeight = this.height = var3; // L: 28
		this.yOffset = 0; // L: 29
		this.xOffset = 0; // L: 30
	} // L: 31

	public Sprite(int var1, int var2) {
		this(new int[var2 * var1], var1, var2); // L: 22
	} // L: 23

	Sprite() {
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "()Llc;"
	)
	@Export("mirrorHorizontally")
	public Sprite mirrorHorizontally() {
		Sprite var1 = new Sprite(this.subWidth, this.subHeight); // L: 34
		var1.width = this.width; // L: 35
		var1.height = this.height; // L: 36
		var1.xOffset = this.width - this.subWidth - this.xOffset; // L: 37
		var1.yOffset = this.yOffset; // L: 38

		for (int var2 = 0; var2 < this.subHeight; ++var2) { // L: 39
			for (int var3 = 0; var3 < this.subWidth; ++var3) { // L: 40
				var1.pixels[var3 + var2 * this.subWidth] = this.pixels[var2 * this.subWidth + this.subWidth - 1 - var3]; // L: 41
			}
		}

		return var1; // L: 44
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "()Llc;"
	)
	@Export("copyNormalized")
	public Sprite copyNormalized() {
		Sprite var1 = new Sprite(this.width, this.height); // L: 48

		for (int var2 = 0; var2 < this.subHeight; ++var2) { // L: 49
			for (int var3 = 0; var3 < this.subWidth; ++var3) { // L: 50
				var1.pixels[var3 + (var2 + this.yOffset) * this.width + this.xOffset] = this.pixels[var3 + var2 * this.subWidth]; // L: 51
			}
		}

		return var1; // L: 54
	}

	@ObfuscatedName("l")
	@Export("setRaster")
	public void setRaster() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.subWidth, this.subHeight); // L: 58
	} // L: 59

	@ObfuscatedName("m")
	@Export("normalize")
	public void normalize() {
		if (this.subWidth != this.width || this.subHeight != this.height) { // L: 62
			int[] var1 = new int[this.width * this.height]; // L: 63

			for (int var2 = 0; var2 < this.subHeight; ++var2) { // L: 64
				for (int var3 = 0; var3 < this.subWidth; ++var3) { // L: 65
					var1[var3 + (var2 + this.yOffset) * this.width + this.xOffset] = this.pixels[var3 + var2 * this.subWidth]; // L: 66
				}
			}

			this.pixels = var1; // L: 69
			this.subWidth = this.width; // L: 70
			this.subHeight = this.height; // L: 71
			this.xOffset = 0; // L: 72
			this.yOffset = 0; // L: 73
		}
	} // L: 74

	@ObfuscatedName("z")
	@Export("pad")
	public void pad(int var1) {
		if (this.subWidth != this.width || this.subHeight != this.height) { // L: 77
			int var2 = var1; // L: 78
			if (var1 > this.xOffset) { // L: 79
				var2 = this.xOffset;
			}

			int var3 = var1; // L: 80
			if (var1 + this.xOffset + this.subWidth > this.width) { // L: 81
				var3 = this.width - this.xOffset - this.subWidth;
			}

			int var4 = var1; // L: 82
			if (var1 > this.yOffset) { // L: 83
				var4 = this.yOffset;
			}

			int var5 = var1; // L: 84
			if (var1 + this.yOffset + this.subHeight > this.height) { // L: 85
				var5 = this.height - this.yOffset - this.subHeight;
			}

			int var6 = var2 + var3 + this.subWidth; // L: 86
			int var7 = var4 + var5 + this.subHeight; // L: 87
			int[] var8 = new int[var6 * var7]; // L: 88

			for (int var9 = 0; var9 < this.subHeight; ++var9) { // L: 89
				for (int var10 = 0; var10 < this.subWidth; ++var10) { // L: 90
					var8[var6 * (var9 + var4) + var10 + var2] = this.pixels[var10 + var9 * this.subWidth]; // L: 91
				}
			}

			this.pixels = var8; // L: 94
			this.subWidth = var6; // L: 95
			this.subHeight = var7; // L: 96
			this.xOffset -= var2; // L: 97
			this.yOffset -= var4; // L: 98
		}
	} // L: 99

	@ObfuscatedName("q")
	@Export("flipHorizontally")
	public void flipHorizontally() {
		int[] var1 = new int[this.subWidth * this.subHeight]; // L: 102
		int var2 = 0; // L: 103

		for (int var3 = 0; var3 < this.subHeight; ++var3) { // L: 104
			for (int var4 = this.subWidth - 1; var4 >= 0; --var4) {
				var1[var2++] = this.pixels[var4 + var3 * this.subWidth]; // L: 105
			}
		}

		this.pixels = var1; // L: 107
		this.xOffset = this.width - this.subWidth - this.xOffset; // L: 108
	} // L: 109

	@ObfuscatedName("k")
	@Export("flipVertically")
	public void flipVertically() {
		int[] var1 = new int[this.subWidth * this.subHeight]; // L: 112
		int var2 = 0; // L: 113

		for (int var3 = this.subHeight - 1; var3 >= 0; --var3) { // L: 114
			for (int var4 = 0; var4 < this.subWidth; ++var4) { // L: 115
				var1[var2++] = this.pixels[var4 + var3 * this.subWidth];
			}
		}

		this.pixels = var1; // L: 117
		this.yOffset = this.height - this.subHeight - this.yOffset; // L: 118
	} // L: 119

	@ObfuscatedName("c")
	@Export("outline")
	public void outline(int var1) {
		int[] var2 = new int[this.subWidth * this.subHeight]; // L: 122
		int var3 = 0; // L: 123

		for (int var4 = 0; var4 < this.subHeight; ++var4) { // L: 124
			for (int var5 = 0; var5 < this.subWidth; ++var5) { // L: 125
				int var6 = this.pixels[var3]; // L: 126
				if (var6 == 0) { // L: 127
					if (var5 > 0 && this.pixels[var3 - 1] != 0) { // L: 128
						var6 = var1;
					} else if (var4 > 0 && this.pixels[var3 - this.subWidth] != 0) { // L: 129
						var6 = var1;
					} else if (var5 < this.subWidth - 1 && this.pixels[var3 + 1] != 0) { // L: 130
						var6 = var1;
					} else if (var4 < this.subHeight - 1 && this.pixels[var3 + this.subWidth] != 0) { // L: 131
						var6 = var1;
					}
				}

				var2[var3++] = var6; // L: 133
			}
		}

		this.pixels = var2; // L: 136
	} // L: 137

	@ObfuscatedName("u")
	@Export("shadow")
	public void shadow(int var1) {
		for (int var2 = this.subHeight - 1; var2 > 0; --var2) { // L: 140
			int var3 = var2 * this.subWidth; // L: 141

			for (int var4 = this.subWidth - 1; var4 > 0; --var4) { // L: 142
				if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) {
					this.pixels[var4 + var3] = var1; // L: 143
				}
			}
		}

	} // L: 146

	@ObfuscatedName("t")
	@Export("drawAt")
	public void drawAt(int var1, int var2) {
		var1 += this.xOffset; // L: 149
		var2 += this.yOffset; // L: 150
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 151
		int var4 = 0; // L: 152
		int var5 = this.subHeight; // L: 153
		int var6 = this.subWidth; // L: 154
		int var7 = Rasterizer2D.Rasterizer2D_width - var6; // L: 155
		int var8 = 0; // L: 156
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 157
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 158
			var5 -= var9; // L: 159
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 160
			var4 += var9 * var6; // L: 161
			var3 += var9 * Rasterizer2D.Rasterizer2D_width; // L: 162
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 164
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 165
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 166
			var6 -= var9; // L: 167
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 168
			var4 += var9; // L: 169
			var3 += var9; // L: 170
			var8 += var9; // L: 171
			var7 += var9; // L: 172
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 174
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 175
			var6 -= var9; // L: 176
			var8 += var9; // L: 177
			var7 += var9; // L: 178
		}

		if (var6 > 0 && var5 > 0) { // L: 180
			Sprite_draw(Rasterizer2D.Rasterizer2D_pixels, this.pixels, var4, var3, var6, var5, var7, var8); // L: 181
		}
	} // L: 182

	@ObfuscatedName("o")
	@Export("drawTransBgAt")
	public void drawTransBgAt(int var1, int var2) {
		var1 += this.xOffset; // L: 203
		var2 += this.yOffset; // L: 204
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 205
		int var4 = 0; // L: 206
		int var5 = this.subHeight; // L: 207
		int var6 = this.subWidth; // L: 208
		int var7 = Rasterizer2D.Rasterizer2D_width - var6; // L: 209
		int var8 = 0; // L: 210
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 211
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 212
			var5 -= var9; // L: 213
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 214
			var4 += var9 * var6; // L: 215
			var3 += var9 * Rasterizer2D.Rasterizer2D_width; // L: 216
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 218
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 219
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 220
			var6 -= var9; // L: 221
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 222
			var4 += var9; // L: 223
			var3 += var9; // L: 224
			var8 += var9; // L: 225
			var7 += var9; // L: 226
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 228
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 229
			var6 -= var9; // L: 230
			var8 += var9; // L: 231
			var7 += var9; // L: 232
		}

		if (var6 > 0 && var5 > 0) { // L: 234
			Sprite_drawTransBg(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8); // L: 235
		}
	} // L: 236

	@ObfuscatedName("x")
	@Export("drawScaledAt")
	public void drawScaledAt(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) { // L: 267
			int var5 = this.subWidth; // L: 268
			int var6 = this.subHeight; // L: 269
			int var7 = 0; // L: 270
			int var8 = 0; // L: 271
			int var9 = this.width; // L: 272
			int var10 = this.height; // L: 273
			int var11 = (var9 << 16) / var3; // L: 274
			int var12 = (var10 << 16) / var4; // L: 275
			int var13;
			if (this.xOffset > 0) { // L: 276
				var13 = (var11 + (this.xOffset << 16) - 1) / var11; // L: 277
				var1 += var13; // L: 278
				var7 += var13 * var11 - (this.xOffset << 16); // L: 279
			}

			if (this.yOffset > 0) { // L: 281
				var13 = (var12 + (this.yOffset << 16) - 1) / var12; // L: 282
				var2 += var13; // L: 283
				var8 += var13 * var12 - (this.yOffset << 16); // L: 284
			}

			if (var5 < var9) { // L: 286
				var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
			}

			if (var6 < var10) { // L: 287
				var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			var13 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 288
			int var14 = Rasterizer2D.Rasterizer2D_width - var3; // L: 289
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 290
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var15;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 291
				var15 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 292
				var4 -= var15; // L: 293
				var13 += var15 * Rasterizer2D.Rasterizer2D_width; // L: 294
				var8 += var12 * var15; // L: 295
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 297
				var15 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 298
				var3 -= var15; // L: 299
				var14 += var15; // L: 300
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 302
				var15 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 303
				var3 -= var15; // L: 304
				var13 += var15; // L: 305
				var7 += var11 * var15; // L: 306
				var14 += var15; // L: 307
			}

			Sprite_drawScaled(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5); // L: 309
		}
	} // L: 310

	@ObfuscatedName("r")
	@Export("drawTransOverlayAt")
	public void drawTransOverlayAt(int var1, int var2, int var3, int var4) {
		if (var3 == 256) { // L: 329
			this.drawTransBgAt(var1, var2); // L: 330
		} else {
			var1 += this.xOffset; // L: 333
			var2 += this.yOffset; // L: 334
			int var5 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 335
			int var6 = 0; // L: 336
			int var7 = this.subHeight; // L: 337
			int var8 = this.subWidth; // L: 338
			int var9 = Rasterizer2D.Rasterizer2D_width - var8; // L: 339
			int var10 = 0; // L: 340
			int var11;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 341
				var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 342
				var7 -= var11; // L: 343
				var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 344
				var6 += var11 * var8; // L: 345
				var5 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 346
			}

			if (var7 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 348
				var7 -= var7 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 349
				var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 350
				var8 -= var11; // L: 351
				var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 352
				var6 += var11; // L: 353
				var5 += var11; // L: 354
				var10 += var11; // L: 355
				var9 += var11; // L: 356
			}

			if (var8 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 358
				var11 = var8 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 359
				var8 -= var11; // L: 360
				var10 += var11; // L: 361
				var9 += var11; // L: 362
			}

			if (var8 > 0 && var7 > 0) { // L: 364
				Sprite_drawTransOverlay(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4); // L: 365
			}
		}
	} // L: 331 366

	@ObfuscatedName("s")
	@Export("drawTransAt")
	public void drawTransAt(int var1, int var2, int var3) {
		var1 += this.xOffset; // L: 389
		var2 += this.yOffset; // L: 390
		int var4 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 391
		int var5 = 0; // L: 392
		int var6 = this.subHeight; // L: 393
		int var7 = this.subWidth; // L: 394
		int var8 = Rasterizer2D.Rasterizer2D_width - var7; // L: 395
		int var9 = 0; // L: 396
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 397
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 398
			var6 -= var10; // L: 399
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 400
			var5 += var10 * var7; // L: 401
			var4 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 402
		}

		if (var6 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 404
			var6 -= var6 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 405
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 406
			var7 -= var10; // L: 407
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 408
			var5 += var10; // L: 409
			var4 += var10; // L: 410
			var9 += var10; // L: 411
			var8 += var10; // L: 412
		}

		if (var7 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 414
			var10 = var7 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 415
			var7 -= var10; // L: 416
			var9 += var10; // L: 417
			var8 += var10; // L: 418
		}

		if (var7 > 0 && var6 > 0) { // L: 420
			Sprite_drawTransparent(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3); // L: 421
		}
	} // L: 422

	@ObfuscatedName("d")
	@Export("drawTransScaledAt")
	public void drawTransScaledAt(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) { // L: 441
			int var6 = this.subWidth; // L: 442
			int var7 = this.subHeight; // L: 443
			int var8 = 0; // L: 444
			int var9 = 0; // L: 445
			int var10 = this.width; // L: 446
			int var11 = this.height; // L: 447
			int var12 = (var10 << 16) / var3; // L: 448
			int var13 = (var11 << 16) / var4; // L: 449
			int var14;
			if (this.xOffset > 0) { // L: 450
				var14 = (var12 + (this.xOffset << 16) - 1) / var12; // L: 451
				var1 += var14; // L: 452
				var8 += var14 * var12 - (this.xOffset << 16); // L: 453
			}

			if (this.yOffset > 0) { // L: 455
				var14 = (var13 + (this.yOffset << 16) - 1) / var13; // L: 456
				var2 += var14; // L: 457
				var9 += var14 * var13 - (this.yOffset << 16); // L: 458
			}

			if (var6 < var10) { // L: 460
				var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			if (var7 < var11) { // L: 461
				var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
			}

			var14 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 462
			int var15 = Rasterizer2D.Rasterizer2D_width - var3; // L: 463
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 464
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var16;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 465
				var16 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 466
				var4 -= var16; // L: 467
				var14 += var16 * Rasterizer2D.Rasterizer2D_width; // L: 468
				var9 += var13 * var16; // L: 469
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 471
				var16 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 472
				var3 -= var16; // L: 473
				var15 += var16; // L: 474
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 476
				var16 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 477
				var3 -= var16; // L: 478
				var14 += var16; // L: 479
				var8 += var12 * var16; // L: 480
				var15 += var16; // L: 481
			}

			Sprite_drawTransScaled(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5); // L: 483
		}
	} // L: 484

	@ObfuscatedName("g")
	public void method6290(int var1, int var2, int var3) {
		var1 += this.xOffset; // L: 507
		var2 += this.yOffset; // L: 508
		int var4 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 509
		int var5 = 0; // L: 510
		int var6 = this.subHeight; // L: 511
		int var7 = this.subWidth; // L: 512
		int var8 = Rasterizer2D.Rasterizer2D_width - var7; // L: 513
		int var9 = 0; // L: 514
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 515
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 516
			var6 -= var10; // L: 517
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 518
			var5 += var10 * var7; // L: 519
			var4 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 520
		}

		if (var6 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 522
			var6 -= var6 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 523
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 524
			var7 -= var10; // L: 525
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 526
			var5 += var10; // L: 527
			var4 += var10; // L: 528
			var9 += var10; // L: 529
			var8 += var10; // L: 530
		}

		if (var7 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 532
			var10 = var7 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 533
			var7 -= var10; // L: 534
			var9 += var10; // L: 535
			var8 += var10; // L: 536
		}

		if (var7 > 0 && var6 > 0) { // L: 538
			if (var3 == 256) {
				method6291(0, 0, 0, Rasterizer2D.Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9); // L: 539
			} else {
				method6297(0, 0, 0, Rasterizer2D.Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3); // L: 540
			}

		}
	} // L: 541

	@ObfuscatedName("ac")
	public void method6293(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) { // L: 582
			int var6 = this.subWidth; // L: 583
			int var7 = this.subHeight; // L: 584
			int var8 = 0; // L: 585
			int var9 = 0; // L: 586
			int var10 = this.width; // L: 587
			int var11 = this.height; // L: 588
			int var12 = (var10 << 16) / var3; // L: 589
			int var13 = (var11 << 16) / var4; // L: 590
			int var14;
			if (this.xOffset > 0) { // L: 591
				var14 = (var12 + (this.xOffset << 16) - 1) / var12; // L: 592
				var1 += var14; // L: 593
				var8 += var14 * var12 - (this.xOffset << 16); // L: 594
			}

			if (this.yOffset > 0) { // L: 596
				var14 = (var13 + (this.yOffset << 16) - 1) / var13; // L: 597
				var2 += var14; // L: 598
				var9 += var14 * var13 - (this.yOffset << 16); // L: 599
			}

			if (var6 < var10) { // L: 601
				var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			if (var7 < var11) { // L: 602
				var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
			}

			var14 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 603
			int var15 = Rasterizer2D.Rasterizer2D_width - var3; // L: 604
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 605
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var16;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 606
				var16 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 607
				var4 -= var16; // L: 608
				var14 += var16 * Rasterizer2D.Rasterizer2D_width; // L: 609
				var9 += var13 * var16; // L: 610
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 612
				var16 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 613
				var3 -= var16; // L: 614
				var15 += var16; // L: 615
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 617
				var16 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 618
				var3 -= var16; // L: 619
				var14 += var16; // L: 620
				var8 += var12 * var16; // L: 621
				var15 += var16; // L: 622
			}

			if (var5 == 256) { // L: 624
				method6285(0, 0, 0, var8, this.pixels, Rasterizer2D.Rasterizer2D_pixels, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
			} else {
				method6345(0, 0, 0, var8, this.pixels, Rasterizer2D.Rasterizer2D_pixels, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5); // L: 625
			}

		}
	} // L: 626

	@ObfuscatedName("av")
	public void method6296(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0; // L: 675
		int var10 = var2 + this.subHeight <= var6 ? this.subHeight : var6 - var2; // L: 676
		int var11 = var1 < 0 ? -var1 : 0; // L: 677
		int var10000;
		if (this.subWidth + var1 <= var5) { // L: 678
			var10000 = this.subWidth;
		} else {
			var10000 = var5 - var1;
		}

		int var13 = var3 + var11 + (var9 + var2 + var4) * Rasterizer2D.Rasterizer2D_width + var1; // L: 679
		int var14 = var9 + var2; // L: 680

		for (int var15 = var9; var15 < var10; ++var15) { // L: 681
			int var16 = var7[var14]; // L: 682
			int var17 = var8[var14++]; // L: 683
			int var18 = var13; // L: 684
			int var19;
			if (var1 < var16) { // L: 686
				var19 = var16 - var1; // L: 687
				var18 = var13 + (var19 - var11); // L: 688
			} else {
				var19 = var11; // L: 690
			}

			int var12;
			if (this.subWidth + var1 <= var16 + var17) { // L: 691
				var12 = this.subWidth;
			} else {
				var12 = var16 + var17 - var1; // L: 692
			}

			for (int var20 = var19; var20 < var12; ++var20) { // L: 693
				int var21 = this.pixels[var20 + var15 * this.subWidth]; // L: 694
				if (var21 != 0) {
					Rasterizer2D.Rasterizer2D_pixels[var18++] = var21; // L: 695
				} else {
					++var18; // L: 696
				}
			}

			var13 += Rasterizer2D.Rasterizer2D_width; // L: 698
		}

	} // L: 700

	@ObfuscatedName("ar")
	@Export("drawRotatedMaskedCenteredAround")
	public void drawRotatedMaskedCenteredAround(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2; // L: 704
			int var12 = -var4 / 2; // L: 705
			int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D); // L: 706
			int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D); // L: 707
			var13 = var13 * var8 >> 8; // L: 708
			var14 = var14 * var8 >> 8; // L: 709
			int var15 = var12 * var13 + var11 * var14 + (var5 << 16); // L: 710
			int var16 = var12 * var14 - var11 * var13 + (var6 << 16); // L: 711
			int var17 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 712

			for (var2 = 0; var2 < var4; ++var2) { // L: 713
				int var18 = var9[var2]; // L: 714
				int var19 = var17 + var18; // L: 715
				int var20 = var15 + var14 * var18; // L: 716
				int var21 = var16 - var13 * var18; // L: 717

				for (var1 = -var10[var2]; var1 < 0; ++var1) { // L: 718
					Rasterizer2D.Rasterizer2D_pixels[var19++] = this.pixels[this.subWidth * (var21 >> 16) + (var20 >> 16)]; // L: 719
					var20 += var14; // L: 720
					var21 -= var13; // L: 721
				}

				var15 += var13; // L: 723
				var16 += var14; // L: 724
				var17 += Rasterizer2D.Rasterizer2D_width; // L: 725
			}
		} catch (Exception var23) { // L: 728
		}

	} // L: 729

	@ObfuscatedName("ay")
	public void method6303(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2; // L: 733
			int var11 = -var4 / 2; // L: 734
			int var12 = (int)(Math.sin(var7) * 65536.0D); // L: 735
			int var13 = (int)(Math.cos(var7) * 65536.0D); // L: 736
			var12 = var12 * var9 >> 8; // L: 737
			var13 = var13 * var9 >> 8; // L: 738
			int var14 = var11 * var12 + var10 * var13 + (var5 << 16); // L: 739
			int var15 = var11 * var13 - var10 * var12 + (var6 << 16); // L: 740
			int var16 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 741

			for (var2 = 0; var2 < var4; ++var2) { // L: 742
				int var17 = var16; // L: 743
				int var18 = var14; // L: 744
				int var19 = var15; // L: 745

				for (var1 = -var3; var1 < 0; ++var1) { // L: 746
					int var20 = this.pixels[this.subWidth * (var19 >> 16) + (var18 >> 16)]; // L: 747
					if (var20 != 0) { // L: 748
						Rasterizer2D.Rasterizer2D_pixels[var17++] = var20;
					} else {
						++var17; // L: 749
					}

					var18 += var13; // L: 750
					var19 -= var12; // L: 751
				}

				var14 += var12; // L: 753
				var15 += var13; // L: 754
				var16 += Rasterizer2D.Rasterizer2D_width; // L: 755
			}
		} catch (Exception var22) { // L: 758
		}

	} // L: 759

	@ObfuscatedName("ah")
	public void method6299(int var1, int var2, int var3, int var4) {
		this.method6300(this.width << 3, this.height << 3, var1 << 4, var2 << 4, var3, var4); // L: 762
	} // L: 763

	@ObfuscatedName("az")
	void method6300(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) { // L: 766
			var1 -= this.xOffset << 4; // L: 767
			var2 -= this.yOffset << 4; // L: 768
			double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D; // L: 769
			int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D); // L: 770
			int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D); // L: 771
			int var11 = var10 * -var1 + -var2 * var9; // L: 772
			int var12 = -var2 * var10 + var9 * -(-var1); // L: 773
			int var13 = var10 * ((this.subWidth << 4) - var1) + -var2 * var9; // L: 774
			int var14 = var9 * -((this.subWidth << 4) - var1) + -var2 * var10; // L: 775
			int var15 = ((this.subHeight << 4) - var2) * var9 + var10 * -var1; // L: 776
			int var16 = ((this.subHeight << 4) - var2) * var10 + var9 * -(-var1); // L: 777
			int var17 = ((this.subHeight << 4) - var2) * var9 + var10 * ((this.subWidth << 4) - var1); // L: 778
			int var18 = ((this.subHeight << 4) - var2) * var10 + var9 * -((this.subWidth << 4) - var1); // L: 779
			int var19;
			int var20;
			if (var11 < var13) { // L: 782
				var19 = var11; // L: 783
				var20 = var13; // L: 784
			} else {
				var19 = var13; // L: 787
				var20 = var11; // L: 788
			}

			if (var15 < var19) { // L: 790
				var19 = var15;
			}

			if (var17 < var19) { // L: 791
				var19 = var17;
			}

			if (var15 > var20) { // L: 792
				var20 = var15;
			}

			if (var17 > var20) { // L: 793
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) { // L: 796
				var21 = var12; // L: 797
				var22 = var14; // L: 798
			} else {
				var21 = var14; // L: 801
				var22 = var12; // L: 802
			}

			if (var16 < var21) { // L: 804
				var21 = var16;
			}

			if (var18 < var21) { // L: 805
				var21 = var18;
			}

			if (var16 > var22) { // L: 806
				var22 = var16;
			}

			if (var18 > var22) { // L: 807
				var22 = var18;
			}

			var19 >>= 12; // L: 808
			var20 = var20 + 4095 >> 12; // L: 809
			var21 >>= 12; // L: 810
			var22 = var22 + 4095 >> 12; // L: 811
			var19 += var3; // L: 812
			var20 += var3; // L: 813
			var21 += var4; // L: 814
			var22 += var4; // L: 815
			var19 >>= 4; // L: 816
			var20 = var20 + 15 >> 4; // L: 817
			var21 >>= 4; // L: 818
			var22 = var22 + 15 >> 4; // L: 819
			if (var19 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 820
				var19 = Rasterizer2D.Rasterizer2D_xClipStart;
			}

			if (var20 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 821
				var20 = Rasterizer2D.Rasterizer2D_xClipEnd;
			}

			if (var21 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 822
				var21 = Rasterizer2D.Rasterizer2D_yClipStart;
			}

			if (var22 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 823
				var22 = Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			var20 = var19 - var20; // L: 824
			if (var20 < 0) { // L: 825
				var22 = var21 - var22; // L: 826
				if (var22 < 0) { // L: 827
					int var23 = var19 + var21 * Rasterizer2D.Rasterizer2D_width; // L: 828
					double var24 = 1.6777216E7D / (double)var6; // L: 829
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D); // L: 830
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D); // L: 831
					int var28 = (var19 << 4) + 8 - var3; // L: 832
					int var29 = (var21 << 4) + 8 - var4; // L: 833
					int var30 = (var1 << 8) - (var29 * var26 >> 4); // L: 834
					int var31 = (var29 * var27 >> 4) + (var2 << 8); // L: 835
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) { // L: 837
						if (var26 == 0) { // L: 838
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 840
								var35 = var30; // L: 841
								var36 = var31; // L: 842
								var37 = var20; // L: 843
								if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) { // L: 844 845 846 847
									for (; var37 < 0; ++var37) { // L: 848
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 849
										if (var38 != 0) { // L: 850
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 851
										}
									}
								}

								++var33; // L: 839
							}
						} else if (var26 < 0) { // L: 855
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 857
								var35 = var30; // L: 858
								var36 = (var28 * var26 >> 4) + var31; // L: 859
								var37 = var20; // L: 860
								if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) { // L: 861 862
									if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 863
										var32 = (var26 - var32) / var26; // L: 864
										var37 = var20 + var32; // L: 865
										var36 += var26 * var32; // L: 866
										var34 = var23 + var32; // L: 867
									}

									if ((var32 = (var36 - var26) / var26) > var37) { // L: 869
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 871
										if (var38 != 0) { // L: 872
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 873
										}

										var36 += var26; // L: 874
										++var37; // L: 870
									}
								}

								++var33; // L: 856
								var30 -= var26;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 880
								var35 = var30; // L: 881
								var36 = (var28 * var26 >> 4) + var31; // L: 882
								var37 = var20; // L: 883
								if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) { // L: 884 885
									if (var36 < 0) { // L: 886
										var32 = (var26 - 1 - var36) / var26; // L: 887
										var37 = var20 + var32; // L: 888
										var36 += var26 * var32; // L: 889
										var34 = var23 + var32; // L: 890
									}

									if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 892
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 894
										if (var38 != 0) { // L: 895
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 896
										}

										var36 += var26; // L: 897
										++var37; // L: 893
									}
								}

								++var33; // L: 879
								var30 -= var26;
							}
						}
					} else if (var27 < 0) { // L: 902
						if (var26 == 0) { // L: 903
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 905
								var35 = (var28 * var27 >> 4) + var30; // L: 906
								var36 = var31; // L: 907
								var37 = var20; // L: 908
								if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) { // L: 909 910
									if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 911
										var32 = (var27 - var32) / var27; // L: 912
										var37 = var20 + var32; // L: 913
										var35 += var27 * var32; // L: 914
										var34 = var23 + var32; // L: 915
									}

									if ((var32 = (var35 - var27) / var27) > var37) { // L: 917
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 919
										if (var38 != 0) { // L: 920
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 921
										}

										var35 += var27; // L: 922
										++var37; // L: 918
									}
								}

								++var33; // L: 904
								var31 += var27;
							}
						} else if (var26 < 0) { // L: 926
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 928
								var35 = (var28 * var27 >> 4) + var30; // L: 929
								var36 = (var28 * var26 >> 4) + var31; // L: 930
								var37 = var20; // L: 931
								if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 932
									var32 = (var27 - var32) / var27; // L: 933
									var37 = var20 + var32; // L: 934
									var35 += var27 * var32; // L: 935
									var36 += var26 * var32; // L: 936
									var34 = var23 + var32; // L: 937
								}

								if ((var32 = (var35 - var27) / var27) > var37) { // L: 939
									var37 = var32;
								}

								if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 940
									var32 = (var26 - var32) / var26; // L: 941
									var37 += var32; // L: 942
									var35 += var27 * var32; // L: 943
									var36 += var26 * var32; // L: 944
									var34 += var32; // L: 945
								}

								if ((var32 = (var36 - var26) / var26) > var37) { // L: 947
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 949
									if (var38 != 0) { // L: 950
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 951
									}

									var35 += var27; // L: 952
									var36 += var26; // L: 953
									++var37; // L: 948
								}

								++var33; // L: 927
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 959
								var35 = (var28 * var27 >> 4) + var30; // L: 960
								var36 = (var28 * var26 >> 4) + var31; // L: 961
								var37 = var20; // L: 962
								if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 963
									var32 = (var27 - var32) / var27; // L: 964
									var37 = var20 + var32; // L: 965
									var35 += var27 * var32; // L: 966
									var36 += var26 * var32; // L: 967
									var34 = var23 + var32; // L: 968
								}

								if ((var32 = (var35 - var27) / var27) > var37) { // L: 970
									var37 = var32;
								}

								if (var36 < 0) { // L: 971
									var32 = (var26 - 1 - var36) / var26; // L: 972
									var37 += var32; // L: 973
									var35 += var27 * var32; // L: 974
									var36 += var26 * var32; // L: 975
									var34 += var32; // L: 976
								}

								if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 978
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 980
									if (var38 != 0) { // L: 981
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 982
									}

									var35 += var27; // L: 983
									var36 += var26; // L: 984
									++var37; // L: 979
								}

								++var33; // L: 958
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) { // L: 990
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 992
							var35 = (var28 * var27 >> 4) + var30; // L: 993
							var36 = var31; // L: 994
							var37 = var20; // L: 995
							if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) { // L: 996 997
								if (var35 < 0) { // L: 998
									var32 = (var27 - 1 - var35) / var27; // L: 999
									var37 = var20 + var32; // L: 1000
									var35 += var27 * var32; // L: 1001
									var34 = var23 + var32; // L: 1002
								}

								if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1004
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1006
									if (var38 != 0) { // L: 1007
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 1008
									}

									var35 += var27; // L: 1009
									++var37; // L: 1005
								}
							}

							++var33; // L: 991
							var31 += var27;
						}
					} else if (var26 < 0) { // L: 1013
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 1015
							var35 = (var28 * var27 >> 4) + var30; // L: 1016
							var36 = (var28 * var26 >> 4) + var31; // L: 1017
							var37 = var20; // L: 1018
							if (var35 < 0) { // L: 1019
								var32 = (var27 - 1 - var35) / var27; // L: 1020
								var37 = var20 + var32; // L: 1021
								var35 += var27 * var32; // L: 1022
								var36 += var26 * var32; // L: 1023
								var34 = var23 + var32; // L: 1024
							}

							if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1026
								var37 = var32;
							}

							if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 1027
								var32 = (var26 - var32) / var26; // L: 1028
								var37 += var32; // L: 1029
								var35 += var27 * var32; // L: 1030
								var36 += var26 * var32; // L: 1031
								var34 += var32; // L: 1032
							}

							if ((var32 = (var36 - var26) / var26) > var37) { // L: 1034
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1036
								if (var38 != 0) { // L: 1037
									Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
								} else {
									++var34; // L: 1038
								}

								var35 += var27; // L: 1039
								var36 += var26; // L: 1040
								++var37; // L: 1035
							}

							++var33; // L: 1014
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 1046
							var35 = (var28 * var27 >> 4) + var30; // L: 1047
							var36 = (var28 * var26 >> 4) + var31; // L: 1048
							var37 = var20; // L: 1049
							if (var35 < 0) { // L: 1050
								var32 = (var27 - 1 - var35) / var27; // L: 1051
								var37 = var20 + var32; // L: 1052
								var35 += var27 * var32; // L: 1053
								var36 += var26 * var32; // L: 1054
								var34 = var23 + var32; // L: 1055
							}

							if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1057
								var37 = var32;
							}

							if (var36 < 0) { // L: 1058
								var32 = (var26 - 1 - var36) / var26; // L: 1059
								var37 += var32; // L: 1060
								var35 += var27 * var32; // L: 1061
								var36 += var26 * var32; // L: 1062
								var34 += var32; // L: 1063
							}

							if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 1065
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1067
								if (var38 != 0) { // L: 1068
									Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
								} else {
									++var34; // L: 1069
								}

								var35 += var27; // L: 1070
								var36 += var26; // L: 1071
								++var37; // L: 1066
							}

							++var33; // L: 1045
							var30 -= var26;
							var31 += var27;
						}
					}

				}
			}
		}
	} // L: 1076

	@ObfuscatedName("ak")
	@Export("drawScaledWorldmap")
	public void drawScaledWorldmap(int var1, int var2, int var3, int var4) {
		if (var3 <= this.width && var4 <= this.height) { // L: 1079
			int var5 = var3 * this.xOffset / this.width + var1; // L: 1082
			int var6 = (var3 * (this.xOffset + this.subWidth) + this.width - 1) / this.width + var1; // L: 1083
			int var7 = var2 + var4 * this.yOffset / this.height; // L: 1084
			int var8 = var2 + (this.height + (this.yOffset + this.subHeight) * var4 - 1) / this.height; // L: 1085
			if (var5 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 1086
				var5 = Rasterizer2D.Rasterizer2D_xClipStart;
			}

			if (var6 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 1087
				var6 = Rasterizer2D.Rasterizer2D_xClipEnd;
			}

			if (var7 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 1088
				var7 = Rasterizer2D.Rasterizer2D_yClipStart;
			}

			if (var8 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 1089
				var8 = Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			if (var5 < var6 && var7 < var8) { // L: 1090
				int var9 = var5 + var7 * Rasterizer2D.Rasterizer2D_width; // L: 1091
				int var10 = Rasterizer2D.Rasterizer2D_width - (var6 - var5); // L: 1092
				if (var9 < Rasterizer2D.Rasterizer2D_pixels.length) { // L: 1093
					for (int var11 = var7; var11 < var8; ++var11) { // L: 1096
						for (int var12 = var5; var12 < var6; ++var12) { // L: 1097
							int var13 = var12 - var1 << 4; // L: 1098
							int var14 = var11 - var2 << 4; // L: 1099
							int var15 = var13 * this.width / var3 - (this.xOffset << 4); // L: 1100
							int var16 = (var13 + 16) * this.width / var3 - (this.xOffset << 4); // L: 1101
							int var17 = var14 * this.height / var4 - (this.yOffset << 4); // L: 1102
							int var18 = (var14 + 16) * this.height / var4 - (this.yOffset << 4); // L: 1103
							int var19 = (var16 - var15) * (var18 - var17) >> 1; // L: 1104
							if (var19 != 0) { // L: 1105
								if (var15 < 0) { // L: 1106
									var15 = 0;
								}

								if (var16 >= this.subWidth << 4) { // L: 1107
									var16 = this.subWidth << 4;
								}

								if (var17 < 0) { // L: 1108
									var17 = 0;
								}

								if (var18 >= this.subHeight << 4) { // L: 1109
									var18 = this.subHeight << 4;
								}

								--var16; // L: 1110
								--var18; // L: 1111
								int var20 = 16 - (var15 & 15); // L: 1112
								int var21 = (var16 & 15) + 1; // L: 1113
								int var22 = 16 - (var17 & 15); // L: 1114
								int var23 = (var18 & 15) + 1; // L: 1115
								var15 >>= 4; // L: 1116
								var16 >>= 4; // L: 1117
								var17 >>= 4; // L: 1118
								var18 >>= 4; // L: 1119
								int var24 = 0; // L: 1120
								int var25 = 0; // L: 1121
								int var26 = 0; // L: 1122
								int var27 = 0; // L: 1123

								int var28;
								for (var28 = var17; var28 <= var18; ++var28) { // L: 1124
									int var29 = 16; // L: 1125
									if (var28 == var17) { // L: 1126
										var29 = var22;
									}

									if (var28 == var18) { // L: 1127
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; ++var30) { // L: 1128
										int var31 = this.pixels[var30 + var28 * this.subWidth]; // L: 1129
										if (var31 != 0) { // L: 1130
											int var32;
											if (var30 == var15) { // L: 1132
												var32 = var29 * var20;
											} else if (var30 == var16) { // L: 1133
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4; // L: 1134
											}

											var27 += var32; // L: 1135
											var24 += var32 * (var31 >> 16 & 255); // L: 1136
											var25 += var32 * (var31 >> 8 & 255); // L: 1137
											var26 += (var31 & 255) * var32; // L: 1138
										}
									}
								}

								if (var27 >= var19) { // L: 1142
									var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8); // L: 1143
									if (var28 == 0) { // L: 1144
										var28 = 1;
									}

									Rasterizer2D.Rasterizer2D_pixels[var9] = var28; // L: 1145
								}

								++var9; // L: 1147
							}
						}

						var9 += var10; // L: 1149
					}

				}
			}
		} else {
			throw new IllegalArgumentException(); // L: 1080
		}
	} // L: 1094 1151

	@ObfuscatedName("e")
	@Export("Sprite_draw")
	static void Sprite_draw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) { // L: 185
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) { // L: 186 187 191
				var0[var3++] = var1[var2++]; // L: 188
				var0[var3++] = var1[var2++]; // L: 189
				var0[var3++] = var1[var2++]; // L: 190
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) { // L: 193 194 195
			}

			var3 += var6; // L: 197
			var2 += var7; // L: 198
		}

	} // L: 200

	@ObfuscatedName("n")
	@Export("Sprite_drawTransBg")
	static void Sprite_drawTransBg(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 239
		var5 = -(var5 & 3); // L: 240

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 241
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 242
				var2 = var1[var3++]; // L: 243
				if (var2 != 0) { // L: 244
					var0[var4++] = var2;
				} else {
					++var4; // L: 245
				}

				var2 = var1[var3++]; // L: 246
				if (var2 != 0) { // L: 247
					var0[var4++] = var2;
				} else {
					++var4; // L: 248
				}

				var2 = var1[var3++]; // L: 249
				if (var2 != 0) { // L: 250
					var0[var4++] = var2;
				} else {
					++var4; // L: 251
				}

				var2 = var1[var3++]; // L: 252
				if (var2 != 0) { // L: 253
					var0[var4++] = var2;
				} else {
					++var4; // L: 254
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 256
				var2 = var1[var3++]; // L: 257
				if (var2 != 0) { // L: 258
					var0[var4++] = var2;
				} else {
					++var4; // L: 259
				}
			}

			var4 += var7; // L: 261
			var3 += var8; // L: 262
		}

	} // L: 264

	@ObfuscatedName("p")
	@Export("Sprite_drawScaled")
	static void Sprite_drawScaled(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3; // L: 313

		for (int var13 = -var8; var13 < 0; ++var13) { // L: 314
			int var14 = var11 * (var4 >> 16); // L: 315

			for (int var15 = -var7; var15 < 0; ++var15) { // L: 316
				var2 = var1[(var3 >> 16) + var14]; // L: 317
				if (var2 != 0) { // L: 318
					var0[var5++] = var2;
				} else {
					++var5; // L: 319
				}

				var3 += var9; // L: 320
			}

			var4 += var10; // L: 322
			var3 = var12; // L: 323
			var5 += var6; // L: 324
		}

	} // L: 326

	@ObfuscatedName("y")
	@Export("Sprite_drawTransOverlay")
	static void Sprite_drawTransOverlay(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9; // L: 369
		int var12 = (var10 & 16711935) * var11 & -16711936; // L: 370
		int var13 = (var10 & 65280) * var11 & 16711680; // L: 371
		var10 = (var12 | var13) >>> 8; // L: 372

		for (int var14 = -var6; var14 < 0; ++var14) { // L: 373
			for (int var15 = -var5; var15 < 0; ++var15) { // L: 374
				var2 = var1[var3++]; // L: 375
				if (var2 != 0) { // L: 376
					var12 = var9 * (var2 & 16711935) & -16711936; // L: 377
					var13 = (var2 & 65280) * var9 & 16711680; // L: 378
					var0[var4++] = var10 + ((var12 | var13) >>> 8); // L: 379
				} else {
					++var4; // L: 381
				}
			}

			var4 += var7; // L: 383
			var3 += var8; // L: 384
		}

	} // L: 386

	@ObfuscatedName("j")
	@Export("Sprite_drawTransparent")
	static void Sprite_drawTransparent(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9; // L: 425

		for (int var11 = -var6; var11 < 0; ++var11) { // L: 426
			for (int var12 = -var5; var12 < 0; ++var12) { // L: 427
				var2 = var1[var3++]; // L: 428
				if (var2 != 0) { // L: 429
					int var13 = var0[var4]; // L: 430
					var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & 65280) * var9 + var10 * (var13 & 65280) & 16711680) >> 8; // L: 431
				} else {
					++var4; // L: 433
				}
			}

			var4 += var7; // L: 435
			var3 += var8; // L: 436
		}

	} // L: 438

	@ObfuscatedName("a")
	@Export("Sprite_drawTransScaled")
	static void Sprite_drawTransScaled(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12; // L: 487
		int var14 = var3; // L: 488

		for (int var15 = -var8; var15 < 0; ++var15) { // L: 489
			int var16 = var11 * (var4 >> 16); // L: 490

			for (int var17 = -var7; var17 < 0; ++var17) { // L: 491
				var2 = var1[(var3 >> 16) + var16]; // L: 492
				if (var2 != 0) { // L: 493
					int var18 = var0[var5]; // L: 494
					var0[var5++] = ((var2 & 65280) * var12 + var13 * (var18 & 65280) & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8; // L: 495
				} else {
					++var5; // L: 497
				}

				var3 += var9; // L: 498
			}

			var4 += var10; // L: 500
			var3 = var14; // L: 501
			var5 += var6; // L: 502
		}

	} // L: 504

	@ObfuscatedName("h")
	static void method6291(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (var8 = -var10; var8 < 0; ++var8) { // L: 544
			for (var6 = -var9; var6 < 0; ++var6) { // L: 545
				var0 = var4[var5++]; // L: 546
				if (var0 != 0) { // L: 547
					var1 = var3[var7]; // L: 548
					var2 = var0 + var1; // L: 549
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 550
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 551
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8); // L: 552
				} else {
					++var7; // L: 554
				}
			}

			var7 += var11; // L: 556
			var5 += var12; // L: 557
		}

	} // L: 559

	@ObfuscatedName("ab")
	static void method6297(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		for (var8 = -var10; var8 < 0; ++var8) { // L: 562
			for (var6 = -var9; var6 < 0; ++var6) { // L: 563
				var0 = var4[var5++]; // L: 564
				if (var0 != 0) { // L: 565
					var1 = var13 * (var0 & 16711935); // L: 566
					var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8; // L: 567
					var1 = var3[var7]; // L: 568
					var2 = var0 + var1; // L: 569
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 570
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 571
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8); // L: 572
				} else {
					++var7; // L: 574
				}
			}

			var7 += var11; // L: 576
			var5 += var12; // L: 577
		}

	} // L: 579

	@ObfuscatedName("ao")
	static void method6285(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		for (int var16 = var3; var8 < 0; ++var8) { // L: 629 630
			var7 = var15 * (var9 >> 16); // L: 631

			for (var6 = -var12; var6 < 0; ++var6) { // L: 632
				var0 = var4[(var3 >> 16) + var7]; // L: 633
				if (var0 != 0) { // L: 634
					var1 = var5[var10]; // L: 635
					var2 = var0 + var1; // L: 636
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 637
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 638
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8); // L: 639
				} else {
					++var10; // L: 641
				}

				var3 += var13; // L: 642
			}

			var9 += var14; // L: 644
			var3 = var16; // L: 645
			var10 += var11; // L: 646
		}

	} // L: 648

	@ObfuscatedName("af")
	static void method6345(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		for (int var17 = var3; var8 < 0; ++var8) { // L: 651 652
			var7 = var15 * (var9 >> 16); // L: 653

			for (var6 = -var12; var6 < 0; ++var6) { // L: 654
				var0 = var4[(var3 >> 16) + var7]; // L: 655
				if (var0 != 0) { // L: 656
					var1 = (var0 & 16711935) * var16; // L: 657
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8; // L: 658
					var1 = var5[var10]; // L: 659
					var2 = var0 + var1; // L: 660
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 661
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 662
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8); // L: 663
				} else {
					++var10; // L: 665
				}

				var3 += var13; // L: 666
			}

			var9 += var14; // L: 668
			var3 = var17; // L: 669
			var10 += var11; // L: 670
		}

	} // L: 672
}
