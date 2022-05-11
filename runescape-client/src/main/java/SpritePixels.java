import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("SpritePixels")
public final class SpritePixels extends Rasterizer2D {
	@ObfuscatedName("o")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("q")
	@Export("subWidth")
	public int subWidth;
	@ObfuscatedName("l")
	@Export("subHeight")
	public int subHeight;
	@ObfuscatedName("k")
	@Export("xOffset")
	public int xOffset;
	@ObfuscatedName("a")
	@Export("yOffset")
	public int yOffset;
	@ObfuscatedName("m")
	@Export("width")
	public int width;
	@ObfuscatedName("p")
	@Export("height")
	public int height;

	public SpritePixels(int[] var1, int var2, int var3) {
		this.pixels = var1; // L: 26
		this.subWidth = this.width = var2; // L: 27
		this.subHeight = this.height = var3; // L: 28
		this.yOffset = 0; // L: 29
		this.xOffset = 0; // L: 30
	} // L: 31

	public SpritePixels(int var1, int var2) {
		this(new int[var2 * var1], var1, var2); // L: 22
	} // L: 23

	public SpritePixels() {
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lqr;"
	)
	@Export("mirrorHorizontally")
	public SpritePixels mirrorHorizontally() {
		SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight); // L: 34
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lqr;"
	)
	public SpritePixels method8001() {
		SpritePixels var1 = new SpritePixels(this.subWidth, this.subHeight); // L: 48
		var1.width = this.width; // L: 49
		var1.height = this.height; // L: 50
		var1.xOffset = this.xOffset; // L: 51
		var1.yOffset = this.yOffset; // L: 52
		int var2 = this.pixels.length; // L: 53

		for (int var3 = 0; var3 < var2; ++var3) { // L: 54
			var1.pixels[var3] = this.pixels[var3];
		}

		return var1; // L: 55
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "()Lqr;"
	)
	@Export("copyNormalized")
	public SpritePixels copyNormalized() {
		SpritePixels var1 = new SpritePixels(this.width, this.height); // L: 59

		for (int var2 = 0; var2 < this.subHeight; ++var2) { // L: 60
			for (int var3 = 0; var3 < this.subWidth; ++var3) { // L: 61
				var1.pixels[var3 + (var2 + this.yOffset) * this.width + this.xOffset] = this.pixels[var3 + var2 * this.subWidth]; // L: 62
			}
		}

		return var1; // L: 65
	}

	@ObfuscatedName("k")
	@Export("setRaster")
	public void setRaster() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.subWidth, this.subHeight); // L: 69
	} // L: 70

	@ObfuscatedName("a")
	@Export("normalize")
	public void normalize() {
		if (this.subWidth != this.width || this.subHeight != this.height) { // L: 73
			int[] var1 = new int[this.width * this.height]; // L: 74

			for (int var2 = 0; var2 < this.subHeight; ++var2) { // L: 75
				for (int var3 = 0; var3 < this.subWidth; ++var3) { // L: 76
					var1[var3 + (var2 + this.yOffset) * this.width + this.xOffset] = this.pixels[var3 + var2 * this.subWidth]; // L: 77
				}
			}

			this.pixels = var1; // L: 80
			this.subWidth = this.width; // L: 81
			this.subHeight = this.height; // L: 82
			this.xOffset = 0; // L: 83
			this.yOffset = 0; // L: 84
		}
	} // L: 85

	@ObfuscatedName("m")
	@Export("pad")
	public void pad(int var1) {
		if (this.subWidth != this.width || this.subHeight != this.height) { // L: 88
			int var2 = var1; // L: 89
			if (var1 > this.xOffset) { // L: 90
				var2 = this.xOffset;
			}

			int var3 = var1; // L: 91
			if (var1 + this.xOffset + this.subWidth > this.width) { // L: 92
				var3 = this.width - this.xOffset - this.subWidth;
			}

			int var4 = var1; // L: 93
			if (var1 > this.yOffset) { // L: 94
				var4 = this.yOffset;
			}

			int var5 = var1; // L: 95
			if (var1 + this.yOffset + this.subHeight > this.height) { // L: 96
				var5 = this.height - this.yOffset - this.subHeight;
			}

			int var6 = var2 + var3 + this.subWidth; // L: 97
			int var7 = var4 + var5 + this.subHeight; // L: 98
			int[] var8 = new int[var6 * var7]; // L: 99

			for (int var9 = 0; var9 < this.subHeight; ++var9) { // L: 100
				for (int var10 = 0; var10 < this.subWidth; ++var10) { // L: 101
					var8[var6 * (var9 + var4) + var10 + var2] = this.pixels[var10 + var9 * this.subWidth]; // L: 102
				}
			}

			this.pixels = var8; // L: 105
			this.subWidth = var6; // L: 106
			this.subHeight = var7; // L: 107
			this.xOffset -= var2; // L: 108
			this.yOffset -= var4; // L: 109
		}
	} // L: 110

	@ObfuscatedName("p")
	@Export("flipHorizontally")
	public void flipHorizontally() {
		int[] var1 = new int[this.subWidth * this.subHeight]; // L: 113
		int var2 = 0; // L: 114

		for (int var3 = 0; var3 < this.subHeight; ++var3) { // L: 115
			for (int var4 = this.subWidth - 1; var4 >= 0; --var4) {
				var1[var2++] = this.pixels[var4 + var3 * this.subWidth]; // L: 116
			}
		}

		this.pixels = var1; // L: 118
		this.xOffset = this.width - this.subWidth - this.xOffset; // L: 119
	} // L: 120

	@ObfuscatedName("s")
	@Export("flipVertically")
	public void flipVertically() {
		int[] var1 = new int[this.subWidth * this.subHeight]; // L: 123
		int var2 = 0; // L: 124

		for (int var3 = this.subHeight - 1; var3 >= 0; --var3) { // L: 125
			for (int var4 = 0; var4 < this.subWidth; ++var4) { // L: 126
				var1[var2++] = this.pixels[var4 + var3 * this.subWidth];
			}
		}

		this.pixels = var1; // L: 128
		this.yOffset = this.height - this.subHeight - this.yOffset; // L: 129
	} // L: 130

	@ObfuscatedName("r")
	@Export("outline")
	public void outline(int var1) {
		int[] var2 = new int[this.subWidth * this.subHeight]; // L: 133
		int var3 = 0; // L: 134

		for (int var4 = 0; var4 < this.subHeight; ++var4) { // L: 135
			for (int var5 = 0; var5 < this.subWidth; ++var5) { // L: 136
				int var6 = this.pixels[var3]; // L: 137
				if (var6 == 0) { // L: 138
					if (var5 > 0 && this.pixels[var3 - 1] != 0) { // L: 139
						var6 = var1;
					} else if (var4 > 0 && this.pixels[var3 - this.subWidth] != 0) { // L: 140
						var6 = var1;
					} else if (var5 < this.subWidth - 1 && this.pixels[var3 + 1] != 0) {
						var6 = var1; // L: 141
					} else if (var4 < this.subHeight - 1 && this.pixels[var3 + this.subWidth] != 0) { // L: 142
						var6 = var1;
					}
				}

				var2[var3++] = var6; // L: 144
			}
		}

		this.pixels = var2; // L: 147
	} // L: 148

	@ObfuscatedName("v")
	@Export("shadow")
	public void shadow(int var1) {
		for (int var2 = this.subHeight - 1; var2 > 0; --var2) { // L: 151
			int var3 = var2 * this.subWidth; // L: 152

			for (int var4 = this.subWidth - 1; var4 > 0; --var4) { // L: 153
				if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) { // L: 154
					this.pixels[var4 + var3] = var1;
				}
			}
		}

	} // L: 157

	@ObfuscatedName("y")
	@Export("drawAt")
	public void drawAt(int var1, int var2) {
		var1 += this.xOffset; // L: 160
		var2 += this.yOffset; // L: 161
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 162
		int var4 = 0; // L: 163
		int var5 = this.subHeight; // L: 164
		int var6 = this.subWidth; // L: 165
		int var7 = Rasterizer2D.Rasterizer2D_width - var6; // L: 166
		int var8 = 0; // L: 167
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 168
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 169
			var5 -= var9; // L: 170
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 171
			var4 += var9 * var6; // L: 172
			var3 += var9 * Rasterizer2D.Rasterizer2D_width; // L: 173
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 175
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 176
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 177
			var6 -= var9; // L: 178
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 179
			var4 += var9; // L: 180
			var3 += var9; // L: 181
			var8 += var9; // L: 182
			var7 += var9; // L: 183
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 185
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 186
			var6 -= var9; // L: 187
			var8 += var9; // L: 188
			var7 += var9; // L: 189
		}

		if (var6 > 0 && var5 > 0) { // L: 191
			Sprite_draw(Rasterizer2D.Rasterizer2D_pixels, this.pixels, var4, var3, var6, var5, var7, var8); // L: 192
		}
	} // L: 193

	@ObfuscatedName("w")
	@Export("drawTransBgAt")
	public void drawTransBgAt(int var1, int var2) {
		var1 += this.xOffset; // L: 214
		var2 += this.yOffset; // L: 215
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 216
		int var4 = 0; // L: 217
		int var5 = this.subHeight; // L: 218
		int var6 = this.subWidth; // L: 219
		int var7 = Rasterizer2D.Rasterizer2D_width - var6; // L: 220
		int var8 = 0; // L: 221
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 222
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 223
			var5 -= var9; // L: 224
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 225
			var4 += var9 * var6; // L: 226
			var3 += var9 * Rasterizer2D.Rasterizer2D_width; // L: 227
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 229
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 230
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 231
			var6 -= var9; // L: 232
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 233
			var4 += var9; // L: 234
			var3 += var9; // L: 235
			var8 += var9; // L: 236
			var7 += var9; // L: 237
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 239
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 240
			var6 -= var9; // L: 241
			var8 += var9; // L: 242
			var7 += var9; // L: 243
		}

		if (var6 > 0 && var5 > 0) { // L: 245
			Sprite_drawTransBg(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8); // L: 246
		}
	} // L: 247

	@ObfuscatedName("t")
	@Export("drawScaledAt")
	public void drawScaledAt(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) { // L: 278
			int var5 = this.subWidth; // L: 279
			int var6 = this.subHeight; // L: 280
			int var7 = 0; // L: 281
			int var8 = 0; // L: 282
			int var9 = this.width; // L: 283
			int var10 = this.height; // L: 284
			int var11 = (var9 << 16) / var3; // L: 285
			int var12 = (var10 << 16) / var4; // L: 286
			int var13;
			if (this.xOffset > 0) { // L: 287
				var13 = (var11 + (this.xOffset << 16) - 1) / var11; // L: 288
				var1 += var13; // L: 289
				var7 += var13 * var11 - (this.xOffset << 16); // L: 290
			}

			if (this.yOffset > 0) { // L: 292
				var13 = (var12 + (this.yOffset << 16) - 1) / var12; // L: 293
				var2 += var13; // L: 294
				var8 += var13 * var12 - (this.yOffset << 16); // L: 295
			}

			if (var5 < var9) { // L: 297
				var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
			}

			if (var6 < var10) { // L: 298
				var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			var13 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 299
			int var14 = Rasterizer2D.Rasterizer2D_width - var3; // L: 300
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 301
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var15;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 302
				var15 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 303
				var4 -= var15; // L: 304
				var13 += var15 * Rasterizer2D.Rasterizer2D_width; // L: 305
				var8 += var12 * var15; // L: 306
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 308
				var15 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 309
				var3 -= var15; // L: 310
				var14 += var15; // L: 311
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 313
				var15 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 314
				var3 -= var15; // L: 315
				var13 += var15; // L: 316
				var7 += var11 * var15; // L: 317
				var14 += var15; // L: 318
			}

			Sprite_drawScaled(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5); // L: 320
		}
	} // L: 321

	@ObfuscatedName("x")
	@Export("drawTransOverlayAt")
	public void drawTransOverlayAt(int var1, int var2, int var3, int var4) {
		if (var3 == 256) { // L: 340
			this.drawTransBgAt(var1, var2); // L: 341
		} else {
			var1 += this.xOffset; // L: 344
			var2 += this.yOffset; // L: 345
			int var5 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 346
			int var6 = 0; // L: 347
			int var7 = this.subHeight; // L: 348
			int var8 = this.subWidth; // L: 349
			int var9 = Rasterizer2D.Rasterizer2D_width - var8; // L: 350
			int var10 = 0; // L: 351
			int var11;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 352
				var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 353
				var7 -= var11; // L: 354
				var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 355
				var6 += var11 * var8; // L: 356
				var5 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 357
			}

			if (var7 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 359
				var7 -= var7 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 360
				var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 361
				var8 -= var11; // L: 362
				var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 363
				var6 += var11; // L: 364
				var5 += var11; // L: 365
				var10 += var11; // L: 366
				var9 += var11; // L: 367
			}

			if (var8 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 369
				var11 = var8 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 370
				var8 -= var11; // L: 371
				var10 += var11; // L: 372
				var9 += var11; // L: 373
			}

			if (var8 > 0 && var7 > 0) { // L: 375
				Sprite_drawTransOverlay(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4); // L: 376
			}
		}
	} // L: 342 377

	@ObfuscatedName("e")
	@Export("drawTransAt")
	public void drawTransAt(int var1, int var2, int var3) {
		var1 += this.xOffset; // L: 400
		var2 += this.yOffset; // L: 401
		int var4 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 402
		int var5 = 0; // L: 403
		int var6 = this.subHeight; // L: 404
		int var7 = this.subWidth; // L: 405
		int var8 = Rasterizer2D.Rasterizer2D_width - var7; // L: 406
		int var9 = 0; // L: 407
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 408
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 409
			var6 -= var10; // L: 410
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 411
			var5 += var10 * var7; // L: 412
			var4 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 413
		}

		if (var6 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 415
			var6 -= var6 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 416
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 417
			var7 -= var10; // L: 418
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 419
			var5 += var10; // L: 420
			var4 += var10; // L: 421
			var9 += var10; // L: 422
			var8 += var10; // L: 423
		}

		if (var7 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 425
			var10 = var7 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 426
			var7 -= var10; // L: 427
			var9 += var10; // L: 428
			var8 += var10; // L: 429
		}

		if (var7 > 0 && var6 > 0) { // L: 431
			Sprite_drawTransparent(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3); // L: 432
		}
	} // L: 433

	@ObfuscatedName("f")
	@Export("drawTransScaledAt")
	public void drawTransScaledAt(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) { // L: 452
			int var6 = this.subWidth; // L: 453
			int var7 = this.subHeight; // L: 454
			int var8 = 0; // L: 455
			int var9 = 0; // L: 456
			int var10 = this.width; // L: 457
			int var11 = this.height; // L: 458
			int var12 = (var10 << 16) / var3; // L: 459
			int var13 = (var11 << 16) / var4; // L: 460
			int var14;
			if (this.xOffset > 0) { // L: 461
				var14 = (var12 + (this.xOffset << 16) - 1) / var12; // L: 462
				var1 += var14; // L: 463
				var8 += var14 * var12 - (this.xOffset << 16); // L: 464
			}

			if (this.yOffset > 0) { // L: 466
				var14 = (var13 + (this.yOffset << 16) - 1) / var13; // L: 467
				var2 += var14; // L: 468
				var9 += var14 * var13 - (this.yOffset << 16); // L: 469
			}

			if (var6 < var10) { // L: 471
				var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			if (var7 < var11) { // L: 472
				var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
			}

			var14 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 473
			int var15 = Rasterizer2D.Rasterizer2D_width - var3; // L: 474
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 475
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var16;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 476
				var16 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 477
				var4 -= var16; // L: 478
				var14 += var16 * Rasterizer2D.Rasterizer2D_width; // L: 479
				var9 += var13 * var16; // L: 480
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 482
				var16 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 483
				var3 -= var16; // L: 484
				var15 += var16; // L: 485
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 487
				var16 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 488
				var3 -= var16; // L: 489
				var14 += var16; // L: 490
				var8 += var12 * var16; // L: 491
				var15 += var16; // L: 492
			}

			Sprite_drawTransScaled(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5); // L: 494
		}
	} // L: 495

	@ObfuscatedName("j")
	public void method7970(int var1, int var2, int var3) {
		var1 += this.xOffset; // L: 518
		var2 += this.yOffset; // L: 519
		int var4 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 520
		int var5 = 0; // L: 521
		int var6 = this.subHeight; // L: 522
		int var7 = this.subWidth; // L: 523
		int var8 = Rasterizer2D.Rasterizer2D_width - var7; // L: 524
		int var9 = 0; // L: 525
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 526
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 527
			var6 -= var10; // L: 528
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 529
			var5 += var10 * var7; // L: 530
			var4 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 531
		}

		if (var6 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 533
			var6 -= var6 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 534
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 535
			var7 -= var10; // L: 536
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 537
			var5 += var10; // L: 538
			var4 += var10; // L: 539
			var9 += var10; // L: 540
			var8 += var10; // L: 541
		}

		if (var7 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 543
			var10 = var7 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 544
			var7 -= var10; // L: 545
			var9 += var10; // L: 546
			var8 += var10; // L: 547
		}

		if (var7 > 0 && var6 > 0) { // L: 549
			if (var3 == 256) {
				method7950(0, 0, 0, Rasterizer2D.Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9); // L: 550
			} else {
				method7972(0, 0, 0, Rasterizer2D.Rasterizer2D_pixels, this.pixels, var5, 0, var4, 0, var7, var6, var8, var9, var3); // L: 551
			}

		}
	} // L: 552

	@ObfuscatedName("u")
	public void method8030(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) { // L: 593
			int var6 = this.subWidth; // L: 594
			int var7 = this.subHeight; // L: 595
			int var8 = 0; // L: 596
			int var9 = 0; // L: 597
			int var10 = this.width; // L: 598
			int var11 = this.height; // L: 599
			int var12 = (var10 << 16) / var3; // L: 600
			int var13 = (var11 << 16) / var4; // L: 601
			int var14;
			if (this.xOffset > 0) { // L: 602
				var14 = (var12 + (this.xOffset << 16) - 1) / var12; // L: 603
				var1 += var14; // L: 604
				var8 += var14 * var12 - (this.xOffset << 16); // L: 605
			}

			if (this.yOffset > 0) { // L: 607
				var14 = (var13 + (this.yOffset << 16) - 1) / var13; // L: 608
				var2 += var14; // L: 609
				var9 += var14 * var13 - (this.yOffset << 16); // L: 610
			}

			if (var6 < var10) { // L: 612
				var3 = (var12 + ((var6 << 16) - var8) - 1) / var12;
			}

			if (var7 < var11) { // L: 613
				var4 = (var13 + ((var7 << 16) - var9) - 1) / var13;
			}

			var14 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 614
			int var15 = Rasterizer2D.Rasterizer2D_width - var3; // L: 615
			if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 616
				var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			int var16;
			if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 617
				var16 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 618
				var4 -= var16; // L: 619
				var14 += var16 * Rasterizer2D.Rasterizer2D_width; // L: 620
				var9 += var13 * var16; // L: 621
			}

			if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 623
				var16 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 624
				var3 -= var16; // L: 625
				var15 += var16; // L: 626
			}

			if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 628
				var16 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 629
				var3 -= var16; // L: 630
				var14 += var16; // L: 631
				var8 += var12 * var16; // L: 632
				var15 += var16; // L: 633
			}

			if (var5 == 256) { // L: 635
				method7973(0, 0, 0, var8, this.pixels, Rasterizer2D.Rasterizer2D_pixels, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
			} else {
				method7952(0, 0, 0, var8, this.pixels, Rasterizer2D.Rasterizer2D_pixels, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5); // L: 636
			}

		}
	} // L: 637

	@ObfuscatedName("am")
	public void method7947(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0; // L: 686
		int var10 = var2 + this.subHeight <= var6 ? this.subHeight : var6 - var2; // L: 687
		int var11 = var1 < 0 ? -var1 : 0; // L: 688
		int var10000;
		if (this.subWidth + var1 <= var5) { // L: 689
			var10000 = this.subWidth;
		} else {
			var10000 = var5 - var1;
		}

		int var13 = var3 + var11 + (var9 + var2 + var4) * Rasterizer2D.Rasterizer2D_width + var1; // L: 690
		int var14 = var9 + var2; // L: 691

		for (int var15 = var9; var15 < var10; ++var15) { // L: 692
			int var16 = var7[var14]; // L: 693
			int var17 = var8[var14++]; // L: 694
			int var18 = var13; // L: 695
			int var19;
			if (var1 < var16) { // L: 697
				var19 = var16 - var1; // L: 698
				var18 = var13 + (var19 - var11); // L: 699
			} else {
				var19 = var11; // L: 701
			}

			int var12;
			if (this.subWidth + var1 <= var16 + var17) { // L: 702
				var12 = this.subWidth;
			} else {
				var12 = var16 + var17 - var1; // L: 703
			}

			for (int var20 = var19; var20 < var12; ++var20) { // L: 704
				int var21 = this.pixels[var20 + var15 * this.subWidth]; // L: 705
				if (var21 != 0) {
					Rasterizer2D.Rasterizer2D_pixels[var18++] = var21; // L: 706
				} else {
					++var18; // L: 707
				}
			}

			var13 += Rasterizer2D.Rasterizer2D_width; // L: 709
		}

	} // L: 711

	@ObfuscatedName("ac")
	@Export("drawRotatedMaskedCenteredAround")
	public void drawRotatedMaskedCenteredAround(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2; // L: 715
			int var12 = -var4 / 2; // L: 716
			int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D); // L: 717
			int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D); // L: 718
			var13 = var13 * var8 >> 8; // L: 719
			var14 = var14 * var8 >> 8; // L: 720
			int var15 = var12 * var13 + var11 * var14 + (var5 << 16); // L: 721
			int var16 = var12 * var14 - var11 * var13 + (var6 << 16); // L: 722
			int var17 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 723

			for (var2 = 0; var2 < var4; ++var2) { // L: 724
				int var18 = var9[var2]; // L: 725
				int var19 = var17 + var18; // L: 726
				int var20 = var15 + var14 * var18; // L: 727
				int var21 = var16 - var13 * var18; // L: 728

				for (var1 = -var10[var2]; var1 < 0; ++var1) { // L: 729
					Rasterizer2D.Rasterizer2D_pixels[var19++] = this.pixels[this.subWidth * (var21 >> 16) + (var20 >> 16)]; // L: 730
					var20 += var14; // L: 731
					var21 -= var13; // L: 732
				}

				var15 += var13; // L: 734
				var16 += var14; // L: 735
				var17 += Rasterizer2D.Rasterizer2D_width; // L: 736
			}
		} catch (Exception var23) { // L: 739
		}

	} // L: 740

	@ObfuscatedName("ab")
	public void method7992(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2; // L: 744
			int var11 = -var4 / 2; // L: 745
			int var12 = (int)(Math.sin(var7) * 65536.0D); // L: 746
			int var13 = (int)(Math.cos(var7) * 65536.0D); // L: 747
			var12 = var12 * var9 >> 8; // L: 748
			var13 = var13 * var9 >> 8; // L: 749
			int var14 = var11 * var12 + var10 * var13 + (var5 << 16); // L: 750
			int var15 = var11 * var13 - var10 * var12 + (var6 << 16); // L: 751
			int var16 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 752

			for (var2 = 0; var2 < var4; ++var2) { // L: 753
				int var17 = var16; // L: 754
				int var18 = var14; // L: 755
				int var19 = var15; // L: 756

				for (var1 = -var3; var1 < 0; ++var1) { // L: 757
					int var20 = this.pixels[this.subWidth * (var19 >> 16) + (var18 >> 16)]; // L: 758
					if (var20 != 0) { // L: 759
						Rasterizer2D.Rasterizer2D_pixels[var17++] = var20;
					} else {
						++var17; // L: 760
					}

					var18 += var13; // L: 761
					var19 -= var12; // L: 762
				}

				var14 += var12; // L: 764
				var15 += var13; // L: 765
				var16 += Rasterizer2D.Rasterizer2D_width; // L: 766
			}
		} catch (Exception var22) { // L: 769
		}

	} // L: 770

	@ObfuscatedName("aj")
	public void method7951(int var1, int var2, int var3, int var4) {
		this.method7978(this.width << 3, this.height << 3, var1 << 4, var2 << 4, var3, var4); // L: 773
	} // L: 774

	@ObfuscatedName("ae")
	void method7978(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) { // L: 777
			var1 -= this.xOffset << 4; // L: 778
			var2 -= this.yOffset << 4; // L: 779
			double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D; // L: 780
			int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D); // L: 781
			int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D); // L: 782
			int var11 = var10 * -var1 + -var2 * var9; // L: 783
			int var12 = -var2 * var10 + var9 * -(-var1); // L: 784
			int var13 = var10 * ((this.subWidth << 4) - var1) + -var2 * var9; // L: 785
			int var14 = var9 * -((this.subWidth << 4) - var1) + -var2 * var10; // L: 786
			int var15 = ((this.subHeight << 4) - var2) * var9 + var10 * -var1; // L: 787
			int var16 = ((this.subHeight << 4) - var2) * var10 + var9 * -(-var1); // L: 788
			int var17 = ((this.subHeight << 4) - var2) * var9 + var10 * ((this.subWidth << 4) - var1); // L: 789
			int var18 = ((this.subHeight << 4) - var2) * var10 + var9 * -((this.subWidth << 4) - var1); // L: 790
			int var19;
			int var20;
			if (var11 < var13) { // L: 793
				var19 = var11; // L: 794
				var20 = var13; // L: 795
			} else {
				var19 = var13; // L: 798
				var20 = var11; // L: 799
			}

			if (var15 < var19) { // L: 801
				var19 = var15;
			}

			if (var17 < var19) { // L: 802
				var19 = var17;
			}

			if (var15 > var20) { // L: 803
				var20 = var15;
			}

			if (var17 > var20) { // L: 804
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) { // L: 807
				var21 = var12; // L: 808
				var22 = var14; // L: 809
			} else {
				var21 = var14; // L: 812
				var22 = var12; // L: 813
			}

			if (var16 < var21) { // L: 815
				var21 = var16;
			}

			if (var18 < var21) { // L: 816
				var21 = var18;
			}

			if (var16 > var22) { // L: 817
				var22 = var16;
			}

			if (var18 > var22) { // L: 818
				var22 = var18;
			}

			var19 >>= 12; // L: 819
			var20 = var20 + 4095 >> 12; // L: 820
			var21 >>= 12; // L: 821
			var22 = var22 + 4095 >> 12; // L: 822
			var19 += var3; // L: 823
			var20 += var3; // L: 824
			var21 += var4; // L: 825
			var22 += var4; // L: 826
			var19 >>= 4; // L: 827
			var20 = var20 + 15 >> 4; // L: 828
			var21 >>= 4; // L: 829
			var22 = var22 + 15 >> 4; // L: 830
			if (var19 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 831
				var19 = Rasterizer2D.Rasterizer2D_xClipStart;
			}

			if (var20 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 832
				var20 = Rasterizer2D.Rasterizer2D_xClipEnd;
			}

			if (var21 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 833
				var21 = Rasterizer2D.Rasterizer2D_yClipStart;
			}

			if (var22 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 834
				var22 = Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			var20 = var19 - var20; // L: 835
			if (var20 < 0) { // L: 836
				var22 = var21 - var22; // L: 837
				if (var22 < 0) { // L: 838
					int var23 = var19 + var21 * Rasterizer2D.Rasterizer2D_width; // L: 839
					double var24 = 1.6777216E7D / (double)var6; // L: 840
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D); // L: 841
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D); // L: 842
					int var28 = (var19 << 4) + 8 - var3; // L: 843
					int var29 = (var21 << 4) + 8 - var4; // L: 844
					int var30 = (var1 << 8) - (var29 * var26 >> 4); // L: 845
					int var31 = (var29 * var27 >> 4) + (var2 << 8); // L: 846
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) { // L: 848
						if (var26 == 0) { // L: 849
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 851
								var35 = var30; // L: 852
								var36 = var31; // L: 853
								var37 = var20; // L: 854
								if (var30 >= 0 && var31 >= 0 && var30 - (this.subWidth << 12) < 0 && var31 - (this.subHeight << 12) < 0) { // L: 855 856 857 858
									for (; var37 < 0; ++var37) { // L: 859
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 860
										if (var38 != 0) { // L: 861
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 862
										}
									}
								}

								++var33; // L: 850
							}
						} else if (var26 < 0) { // L: 866
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 868
								var35 = var30; // L: 869
								var36 = (var28 * var26 >> 4) + var31; // L: 870
								var37 = var20; // L: 871
								if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) { // L: 872 873
									if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 874
										var32 = (var26 - var32) / var26; // L: 875
										var37 = var20 + var32; // L: 876
										var36 += var26 * var32; // L: 877
										var34 = var23 + var32; // L: 878
									}

									if ((var32 = (var36 - var26) / var26) > var37) { // L: 880
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 882
										if (var38 != 0) { // L: 883
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 884
										}

										var36 += var26; // L: 885
										++var37; // L: 881
									}
								}

								++var33; // L: 867
								var30 -= var26;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 891
								var35 = var30; // L: 892
								var36 = (var28 * var26 >> 4) + var31; // L: 893
								var37 = var20; // L: 894
								if (var30 >= 0 && var30 - (this.subWidth << 12) < 0) { // L: 895 896
									if (var36 < 0) { // L: 897
										var32 = (var26 - 1 - var36) / var26; // L: 898
										var37 = var20 + var32; // L: 899
										var36 += var26 * var32; // L: 900
										var34 = var23 + var32; // L: 901
									}

									if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 903
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 905
										if (var38 != 0) { // L: 906
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 907
										}

										var36 += var26; // L: 908
										++var37; // L: 904
									}
								}

								++var33; // L: 890
								var30 -= var26;
							}
						}
					} else if (var27 < 0) { // L: 913
						if (var26 == 0) { // L: 914
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 916
								var35 = (var28 * var27 >> 4) + var30; // L: 917
								var36 = var31; // L: 918
								var37 = var20; // L: 919
								if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) { // L: 920 921
									if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 922
										var32 = (var27 - var32) / var27; // L: 923
										var37 = var20 + var32; // L: 924
										var35 += var27 * var32; // L: 925
										var34 = var23 + var32; // L: 926
									}

									if ((var32 = (var35 - var27) / var27) > var37) { // L: 928
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 930
										if (var38 != 0) { // L: 931
											Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
										} else {
											++var34; // L: 932
										}

										var35 += var27; // L: 933
										++var37; // L: 929
									}
								}

								++var33; // L: 915
								var31 += var27;
							}
						} else if (var26 < 0) { // L: 937
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 939
								var35 = (var28 * var27 >> 4) + var30; // L: 940
								var36 = (var28 * var26 >> 4) + var31; // L: 941
								var37 = var20; // L: 942
								if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 943
									var32 = (var27 - var32) / var27; // L: 944
									var37 = var20 + var32; // L: 945
									var35 += var27 * var32; // L: 946
									var36 += var26 * var32; // L: 947
									var34 = var23 + var32; // L: 948
								}

								if ((var32 = (var35 - var27) / var27) > var37) { // L: 950
									var37 = var32;
								}

								if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 951
									var32 = (var26 - var32) / var26; // L: 952
									var37 += var32; // L: 953
									var35 += var27 * var32; // L: 954
									var36 += var26 * var32; // L: 955
									var34 += var32; // L: 956
								}

								if ((var32 = (var36 - var26) / var26) > var37) { // L: 958
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 960
									if (var38 != 0) { // L: 961
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 962
									}

									var35 += var27; // L: 963
									var36 += var26; // L: 964
									++var37; // L: 959
								}

								++var33; // L: 938
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
								var34 = var23; // L: 970
								var35 = (var28 * var27 >> 4) + var30; // L: 971
								var36 = (var28 * var26 >> 4) + var31; // L: 972
								var37 = var20; // L: 973
								if ((var32 = var35 - (this.subWidth << 12)) >= 0) { // L: 974
									var32 = (var27 - var32) / var27; // L: 975
									var37 = var20 + var32; // L: 976
									var35 += var27 * var32; // L: 977
									var36 += var26 * var32; // L: 978
									var34 = var23 + var32; // L: 979
								}

								if ((var32 = (var35 - var27) / var27) > var37) { // L: 981
									var37 = var32;
								}

								if (var36 < 0) { // L: 982
									var32 = (var26 - 1 - var36) / var26; // L: 983
									var37 += var32; // L: 984
									var35 += var27 * var32; // L: 985
									var36 += var26 * var32; // L: 986
									var34 += var32; // L: 987
								}

								if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 989
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 991
									if (var38 != 0) { // L: 992
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 993
									}

									var35 += var27; // L: 994
									var36 += var26; // L: 995
									++var37; // L: 990
								}

								++var33; // L: 969
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) { // L: 1001
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 1003
							var35 = (var28 * var27 >> 4) + var30; // L: 1004
							var36 = var31; // L: 1005
							var37 = var20; // L: 1006
							if (var31 >= 0 && var31 - (this.subHeight << 12) < 0) { // L: 1007 1008
								if (var35 < 0) { // L: 1009
									var32 = (var27 - 1 - var35) / var27; // L: 1010
									var37 = var20 + var32; // L: 1011
									var35 += var27 * var32; // L: 1012
									var34 = var23 + var32; // L: 1013
								}

								if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1015
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1017
									if (var38 != 0) { // L: 1018
										Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
									} else {
										++var34; // L: 1019
									}

									var35 += var27; // L: 1020
									++var37; // L: 1016
								}
							}

							++var33; // L: 1002
							var31 += var27;
						}
					} else if (var26 < 0) { // L: 1024
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 1026
							var35 = (var28 * var27 >> 4) + var30; // L: 1027
							var36 = (var28 * var26 >> 4) + var31; // L: 1028
							var37 = var20; // L: 1029
							if (var35 < 0) { // L: 1030
								var32 = (var27 - 1 - var35) / var27; // L: 1031
								var37 = var20 + var32; // L: 1032
								var35 += var27 * var32; // L: 1033
								var36 += var26 * var32; // L: 1034
								var34 = var23 + var32; // L: 1035
							}

							if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1037
								var37 = var32;
							}

							if ((var32 = var36 - (this.subHeight << 12)) >= 0) { // L: 1038
								var32 = (var26 - var32) / var26; // L: 1039
								var37 += var32; // L: 1040
								var35 += var27 * var32; // L: 1041
								var36 += var26 * var32; // L: 1042
								var34 += var32; // L: 1043
							}

							if ((var32 = (var36 - var26) / var26) > var37) { // L: 1045
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1047
								if (var38 != 0) { // L: 1048
									Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
								} else {
									++var34; // L: 1049
								}

								var35 += var27; // L: 1050
								var36 += var26; // L: 1051
								++var37; // L: 1046
							}

							++var33; // L: 1025
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (var33 = var22; var33 < 0; var23 += Rasterizer2D.Rasterizer2D_width) {
							var34 = var23; // L: 1057
							var35 = (var28 * var27 >> 4) + var30; // L: 1058
							var36 = (var28 * var26 >> 4) + var31; // L: 1059
							var37 = var20; // L: 1060
							if (var35 < 0) { // L: 1061
								var32 = (var27 - 1 - var35) / var27; // L: 1062
								var37 = var20 + var32; // L: 1063
								var35 += var27 * var32; // L: 1064
								var36 += var26 * var32; // L: 1065
								var34 = var23 + var32; // L: 1066
							}

							if ((var32 = (var35 + 1 - (this.subWidth << 12) - var27) / var27) > var37) { // L: 1068
								var37 = var32;
							}

							if (var36 < 0) { // L: 1069
								var32 = (var26 - 1 - var36) / var26; // L: 1070
								var37 += var32; // L: 1071
								var35 += var27 * var32; // L: 1072
								var36 += var26 * var32; // L: 1073
								var34 += var32; // L: 1074
							}

							if ((var32 = (var36 + 1 - (this.subHeight << 12) - var26) / var26) > var37) { // L: 1076
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.pixels[(var35 >> 12) + (var36 >> 12) * this.subWidth]; // L: 1078
								if (var38 != 0) { // L: 1079
									Rasterizer2D.Rasterizer2D_pixels[var34++] = var38;
								} else {
									++var34; // L: 1080
								}

								var35 += var27; // L: 1081
								var36 += var26; // L: 1082
								++var37; // L: 1077
							}

							++var33; // L: 1056
							var30 -= var26;
							var31 += var27;
						}
					}

				}
			}
		}
	} // L: 1087

	@ObfuscatedName("az")
	@Export("drawScaledWorldmap")
	public void drawScaledWorldmap(int var1, int var2, int var3, int var4) {
		if (var3 <= this.width && var4 <= this.height) { // L: 1090
			int var5 = var3 * this.xOffset / this.width + var1; // L: 1093
			int var6 = (var3 * (this.xOffset + this.subWidth) + this.width - 1) / this.width + var1; // L: 1094
			int var7 = var2 + var4 * this.yOffset / this.height; // L: 1095
			int var8 = var2 + (this.height + (this.yOffset + this.subHeight) * var4 - 1) / this.height; // L: 1096
			if (var5 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 1097
				var5 = Rasterizer2D.Rasterizer2D_xClipStart;
			}

			if (var6 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 1098
				var6 = Rasterizer2D.Rasterizer2D_xClipEnd;
			}

			if (var7 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 1099
				var7 = Rasterizer2D.Rasterizer2D_yClipStart;
			}

			if (var8 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 1100
				var8 = Rasterizer2D.Rasterizer2D_yClipEnd;
			}

			if (var5 < var6 && var7 < var8) { // L: 1101
				int var9 = var5 + var7 * Rasterizer2D.Rasterizer2D_width; // L: 1102
				int var10 = Rasterizer2D.Rasterizer2D_width - (var6 - var5); // L: 1103
				if (var9 < Rasterizer2D.Rasterizer2D_pixels.length) { // L: 1104
					for (int var11 = var7; var11 < var8; ++var11) { // L: 1107
						for (int var12 = var5; var12 < var6; ++var12) { // L: 1108
							int var13 = var12 - var1 << 4; // L: 1109
							int var14 = var11 - var2 << 4; // L: 1110
							int var15 = var13 * this.width / var3 - (this.xOffset << 4); // L: 1111
							int var16 = (var13 + 16) * this.width / var3 - (this.xOffset << 4); // L: 1112
							int var17 = var14 * this.height / var4 - (this.yOffset << 4); // L: 1113
							int var18 = (var14 + 16) * this.height / var4 - (this.yOffset << 4); // L: 1114
							int var19 = (var16 - var15) * (var18 - var17) >> 1; // L: 1115
							if (var19 != 0) { // L: 1116
								if (var15 < 0) { // L: 1117
									var15 = 0;
								}

								if (var16 >= this.subWidth << 4) { // L: 1118
									var16 = this.subWidth << 4;
								}

								if (var17 < 0) { // L: 1119
									var17 = 0;
								}

								if (var18 >= this.subHeight << 4) { // L: 1120
									var18 = this.subHeight << 4;
								}

								--var16; // L: 1121
								--var18; // L: 1122
								int var20 = 16 - (var15 & 15); // L: 1123
								int var21 = (var16 & 15) + 1; // L: 1124
								int var22 = 16 - (var17 & 15); // L: 1125
								int var23 = (var18 & 15) + 1; // L: 1126
								var15 >>= 4; // L: 1127
								var16 >>= 4; // L: 1128
								var17 >>= 4; // L: 1129
								var18 >>= 4; // L: 1130
								int var24 = 0; // L: 1131
								int var25 = 0; // L: 1132
								int var26 = 0; // L: 1133
								int var27 = 0; // L: 1134

								int var28;
								for (var28 = var17; var28 <= var18; ++var28) { // L: 1135
									int var29 = 16; // L: 1136
									if (var28 == var17) { // L: 1137
										var29 = var22;
									}

									if (var28 == var18) { // L: 1138
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; ++var30) { // L: 1139
										int var31 = this.pixels[var30 + var28 * this.subWidth]; // L: 1140
										if (var31 != 0) { // L: 1141
											int var32;
											if (var30 == var15) { // L: 1143
												var32 = var29 * var20;
											} else if (var30 == var16) { // L: 1144
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4; // L: 1145
											}

											var27 += var32; // L: 1146
											var24 += var32 * (var31 >> 16 & 255); // L: 1147
											var25 += var32 * (var31 >> 8 & 255); // L: 1148
											var26 += (var31 & 255) * var32; // L: 1149
										}
									}
								}

								if (var27 >= var19) { // L: 1153
									var28 = var26 / var27 + (var24 / var27 << 16) + (var25 / var27 << 8); // L: 1154
									if (var28 == 0) { // L: 1155
										var28 = 1;
									}

									Rasterizer2D.Rasterizer2D_pixels[var9] = var28; // L: 1156
								}

								++var9; // L: 1158
							}
						}

						var9 += var10; // L: 1160
					}

				}
			}
		} else {
			throw new IllegalArgumentException(); // L: 1091
		}
	} // L: 1105 1162

	@ObfuscatedName("c")
	@Export("Sprite_draw")
	static void Sprite_draw(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) { // L: 196
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) { // L: 197 198 202
				var0[var3++] = var1[var2++]; // L: 199
				var0[var3++] = var1[var2++]; // L: 200
				var0[var3++] = var1[var2++]; // L: 201
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) { // L: 204 205 206
			}

			var3 += var6; // L: 208
			var2 += var7; // L: 209
		}

	} // L: 211

	@ObfuscatedName("b")
	@Export("Sprite_drawTransBg")
	static void Sprite_drawTransBg(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 250
		var5 = -(var5 & 3); // L: 251

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 252
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 253
				var2 = var1[var3++]; // L: 254
				if (var2 != 0) { // L: 255
					var0[var4++] = var2;
				} else {
					++var4; // L: 256
				}

				var2 = var1[var3++]; // L: 257
				if (var2 != 0) { // L: 258
					var0[var4++] = var2;
				} else {
					++var4; // L: 259
				}

				var2 = var1[var3++]; // L: 260
				if (var2 != 0) { // L: 261
					var0[var4++] = var2;
				} else {
					++var4; // L: 262
				}

				var2 = var1[var3++]; // L: 263
				if (var2 != 0) { // L: 264
					var0[var4++] = var2;
				} else {
					++var4; // L: 265
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 267
				var2 = var1[var3++]; // L: 268
				if (var2 != 0) { // L: 269
					var0[var4++] = var2;
				} else {
					++var4; // L: 270
				}
			}

			var4 += var7; // L: 272
			var3 += var8; // L: 273
		}

	} // L: 275

	@ObfuscatedName("g")
	@Export("Sprite_drawScaled")
	static void Sprite_drawScaled(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3; // L: 324

		for (int var13 = -var8; var13 < 0; ++var13) { // L: 325
			int var14 = var11 * (var4 >> 16); // L: 326

			for (int var15 = -var7; var15 < 0; ++var15) { // L: 327
				var2 = var1[(var3 >> 16) + var14]; // L: 328
				if (var2 != 0) { // L: 329
					var0[var5++] = var2;
				} else {
					++var5; // L: 330
				}

				var3 += var9; // L: 331
			}

			var4 += var10; // L: 333
			var3 = var12; // L: 334
			var5 += var6; // L: 335
		}

	} // L: 337

	@ObfuscatedName("n")
	@Export("Sprite_drawTransOverlay")
	static void Sprite_drawTransOverlay(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9; // L: 380
		int var12 = (var10 & 16711935) * var11 & -16711936; // L: 381
		int var13 = (var10 & 65280) * var11 & 16711680; // L: 382
		var10 = (var12 | var13) >>> 8; // L: 383

		for (int var14 = -var6; var14 < 0; ++var14) { // L: 384
			for (int var15 = -var5; var15 < 0; ++var15) { // L: 385
				var2 = var1[var3++]; // L: 386
				if (var2 != 0) { // L: 387
					var12 = var9 * (var2 & 16711935) & -16711936; // L: 388
					var13 = (var2 & 65280) * var9 & 16711680; // L: 389
					var0[var4++] = var10 + ((var12 | var13) >>> 8); // L: 390
				} else {
					++var4; // L: 392
				}
			}

			var4 += var7; // L: 394
			var3 += var8; // L: 395
		}

	} // L: 397

	@ObfuscatedName("h")
	@Export("Sprite_drawTransparent")
	static void Sprite_drawTransparent(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9; // L: 436

		for (int var11 = -var6; var11 < 0; ++var11) { // L: 437
			for (int var12 = -var5; var12 < 0; ++var12) { // L: 438
				var2 = var1[var3++]; // L: 439
				if (var2 != 0) { // L: 440
					int var13 = var0[var4]; // L: 441
					var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & 65280) * var9 + var10 * (var13 & 65280) & 16711680) >> 8; // L: 442
				} else {
					++var4; // L: 444
				}
			}

			var4 += var7; // L: 446
			var3 += var8; // L: 447
		}

	} // L: 449

	@ObfuscatedName("d")
	@Export("Sprite_drawTransScaled")
	static void Sprite_drawTransScaled(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12; // L: 498
		int var14 = var3; // L: 499

		for (int var15 = -var8; var15 < 0; ++var15) { // L: 500
			int var16 = var11 * (var4 >> 16); // L: 501

			for (int var17 = -var7; var17 < 0; ++var17) { // L: 502
				var2 = var1[(var3 >> 16) + var16]; // L: 503
				if (var2 != 0) { // L: 504
					int var18 = var0[var5]; // L: 505
					var0[var5++] = ((var2 & 65280) * var12 + var13 * (var18 & 65280) & 16711680) + ((var18 & 16711935) * var13 + var12 * (var2 & 16711935) & -16711936) >> 8; // L: 506
				} else {
					++var5; // L: 508
				}

				var3 += var9; // L: 509
			}

			var4 += var10; // L: 511
			var3 = var14; // L: 512
			var5 += var6; // L: 513
		}

	} // L: 515

	@ObfuscatedName("z")
	static void method7950(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (var8 = -var10; var8 < 0; ++var8) { // L: 555
			for (var6 = -var9; var6 < 0; ++var6) { // L: 556
				var0 = var4[var5++]; // L: 557
				if (var0 != 0) { // L: 558
					var1 = var3[var7]; // L: 559
					var2 = var0 + var1; // L: 560
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 561
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 562
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8); // L: 563
				} else {
					++var7; // L: 565
				}
			}

			var7 += var11; // L: 567
			var5 += var12; // L: 568
		}

	} // L: 570

	@ObfuscatedName("i")
	static void method7972(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		for (var8 = -var10; var8 < 0; ++var8) { // L: 573
			for (var6 = -var9; var6 < 0; ++var6) { // L: 574
				var0 = var4[var5++]; // L: 575
				if (var0 != 0) { // L: 576
					var1 = var13 * (var0 & 16711935); // L: 577
					var0 = (var1 & -16711936) + (var13 * var0 - var1 & 16711680) >>> 8; // L: 578
					var1 = var3[var7]; // L: 579
					var2 = var0 + var1; // L: 580
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 581
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 582
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8); // L: 583
				} else {
					++var7; // L: 585
				}
			}

			var7 += var11; // L: 587
			var5 += var12; // L: 588
		}

	} // L: 590

	@ObfuscatedName("ag")
	static void method7973(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		for (int var16 = var3; var8 < 0; ++var8) { // L: 640 641
			var7 = var15 * (var9 >> 16); // L: 642

			for (var6 = -var12; var6 < 0; ++var6) { // L: 643
				var0 = var4[(var3 >> 16) + var7]; // L: 644
				if (var0 != 0) { // L: 645
					var1 = var5[var10]; // L: 646
					var2 = var0 + var1; // L: 647
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 648
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 649
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8); // L: 650
				} else {
					++var10; // L: 652
				}

				var3 += var13; // L: 653
			}

			var9 += var14; // L: 655
			var3 = var16; // L: 656
			var10 += var11; // L: 657
		}

	} // L: 659

	@ObfuscatedName("ar")
	static void method7952(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		for (int var17 = var3; var8 < 0; ++var8) { // L: 662 663
			var7 = var15 * (var9 >> 16); // L: 664

			for (var6 = -var12; var6 < 0; ++var6) { // L: 665
				var0 = var4[(var3 >> 16) + var7]; // L: 666
				if (var0 != 0) { // L: 667
					var1 = (var0 & 16711935) * var16; // L: 668
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8; // L: 669
					var1 = var5[var10]; // L: 670
					var2 = var0 + var1; // L: 671
					var0 = (var0 & 16711935) + (var1 & 16711935); // L: 672
					var1 = (var0 & 16777472) + (var2 - var0 & 65536); // L: 673
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8); // L: 674
				} else {
					++var10; // L: 676
				}

				var3 += var13; // L: 677
			}

			var9 += var14; // L: 679
			var3 = var17; // L: 680
			var10 += var11; // L: 681
		}

	} // L: 683
}
