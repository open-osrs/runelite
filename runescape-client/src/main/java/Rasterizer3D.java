import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("Rasterizer3D")
public class Rasterizer3D extends Rasterizer2D {
	@ObfuscatedName("v")
	static boolean field2334;
	@ObfuscatedName("o")
	static boolean field2323;
	@ObfuscatedName("h")
	@Export("Rasterizer3D_isLowDetailTexture")
	static boolean Rasterizer3D_isLowDetailTexture;
	@ObfuscatedName("g")
	public static boolean field2325;
	@ObfuscatedName("l")
	@Export("Rasterizer3D_alpha")
	static int Rasterizer3D_alpha;
	@ObfuscatedName("x")
	@Export("Rasterizer3D_zoom")
	public static int Rasterizer3D_zoom;
	@ObfuscatedName("c")
	@Export("Rasterizer3D_clipMidX")
	static int Rasterizer3D_clipMidX;
	@ObfuscatedName("j")
	@Export("Rasterizer3D_clipMidY")
	static int Rasterizer3D_clipMidY;
	@ObfuscatedName("p")
	@Export("Rasterizer3D_clipWidth")
	static int Rasterizer3D_clipWidth;
	@ObfuscatedName("s")
	@Export("Rasterizer3D_clipHeight")
	static int Rasterizer3D_clipHeight;
	@ObfuscatedName("b")
	@Export("Rasterizer3D_clipNegativeMidX")
	static int Rasterizer3D_clipNegativeMidX;
	@ObfuscatedName("w")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2;
	@ObfuscatedName("a")
	@Export("Rasterizer3D_clipNegativeMidY")
	static int Rasterizer3D_clipNegativeMidY;
	@ObfuscatedName("m")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2;
	@ObfuscatedName("q")
	@Export("Rasterizer3D_rowOffsets")
	static int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("y")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Rasterizer3D_textureLoader")
	public static TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("e")
	static int[] field2345;
	@ObfuscatedName("t")
	static int[] field2346;
	@ObfuscatedName("i")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;

	static {
		field2334 = false; // L: 8
		field2323 = false; // L: 9
		Rasterizer3D_isLowDetailTexture = false; // L: 10
		field2325 = true; // L: 11
		Rasterizer3D_alpha = 0; // L: 12
		Rasterizer3D_zoom = 512; // L: 19
		Rasterizer3D_rowOffsets = new int[1024]; // L: 28
		Rasterizer3D_colorPalette = new int[65536]; // L: 29
		field2345 = new int[512]; // L: 31
		field2346 = new int[2048]; // L: 32
		Rasterizer3D_sine = new int[2048]; // L: 33
		Rasterizer3D_cosine = new int[2048]; // L: 34

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 37
			field2345[var0] = 32768 / var0; // L: 38
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 40
			field2346[var0] = 65536 / var0; // L: 41
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 43
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D)); // L: 44
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D)); // L: 45
		}

	} // L: 47

	@ObfuscatedName("v")
	@Export("Rasterizer3D_setClipFromRasterizer2D")
	public static final void Rasterizer3D_setClipFromRasterizer2D() {
		Rasterizer3D_setClip(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd); // L: 54
	} // L: 55

	@ObfuscatedName("o")
	@Export("Rasterizer3D_setClip")
	static final void Rasterizer3D_setClip(int var0, int var1, int var2, int var3) {
		Rasterizer3D_clipWidth = var2 - var0; // L: 58
		Rasterizer3D_clipHeight = var3 - var1; // L: 59
		Rasterizer3D_method3(); // L: 60
		if (Rasterizer3D_rowOffsets.length < Rasterizer3D_clipHeight) { // L: 61
			Rasterizer3D_rowOffsets = new int[Login.method1894(Rasterizer3D_clipHeight)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1; // L: 62

		for (int var5 = 0; var5 < Rasterizer3D_clipHeight; ++var5) { // L: 63
			Rasterizer3D_rowOffsets[var5] = var4; // L: 64
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 65
		}

	} // L: 67

	@ObfuscatedName("h")
	@Export("Rasterizer3D_method3")
	public static final void Rasterizer3D_method3() {
		Rasterizer3D_clipMidX = Rasterizer3D_clipWidth / 2; // L: 70
		Rasterizer3D_clipMidY = Rasterizer3D_clipHeight / 2; // L: 71
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 72
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 73
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 74
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 75
	} // L: 76

	@ObfuscatedName("g")
	public static final void method3997(int var0, int var1) {
		int var2 = Rasterizer3D_rowOffsets[0]; // L: 79
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width; // L: 80
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width; // L: 81
		Rasterizer3D_clipMidX = var0 - var4; // L: 82
		Rasterizer3D_clipMidY = var1 - var3; // L: 83
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 84
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 85
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 86
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 87
	} // L: 88

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lht;)V"
	)
	@Export("Rasterizer3D_setTextureLoader")
	public static final void Rasterizer3D_setTextureLoader(TextureLoader var0) {
		Rasterizer3D_textureLoader = var0; // L: 91
	} // L: 92

	@ObfuscatedName("n")
	@Export("Rasterizer3D_setBrightness")
	public static final void Rasterizer3D_setBrightness(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 95
	} // L: 96

	@ObfuscatedName("d")
	@Export("Rasterizer3D_buildPalette")
	static final void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128; // L: 99

		for (int var5 = var2; var5 < var3; ++var5) { // L: 100
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D; // L: 101
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D; // L: 102

			for (int var10 = 0; var10 < 128; ++var10) { // L: 103
				double var11 = (double)var10 / 128.0D; // L: 104
				double var13 = var11; // L: 105
				double var15 = var11; // L: 106
				double var17 = var11; // L: 107
				if (var8 != 0.0D) { // L: 108
					double var19;
					if (var11 < 0.5D) { // L: 110
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8; // L: 111
					}

					double var21 = 2.0D * var11 - var19; // L: 112
					double var23 = var6 + 0.3333333333333333D; // L: 113
					if (var23 > 1.0D) { // L: 114
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D; // L: 116
					if (var27 < 0.0D) { // L: 117
						++var27;
					}

					if (6.0D * var23 < 1.0D) { // L: 118
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 119
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) { // L: 120
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21; // L: 121
					}

					if (6.0D * var6 < 1.0D) { // L: 122
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) { // L: 123
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) { // L: 124
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21; // L: 125
					}

					if (6.0D * var27 < 1.0D) { // L: 126
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) { // L: 127
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) { // L: 128
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21; // L: 129
					}
				}

				int var29 = (int)(var13 * 256.0D); // L: 131
				int var20 = (int)(var15 * 256.0D); // L: 132
				int var30 = (int)(var17 * 256.0D); // L: 133
				int var22 = var30 + (var20 << 8) + (var29 << 16); // L: 134
				var22 = Rasterizer3D_brighten(var22, var0); // L: 135
				if (var22 == 0) { // L: 136
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22; // L: 137
			}
		}

	} // L: 140

	@ObfuscatedName("f")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D; // L: 143
		double var5 = (double)(var0 >> 8 & 255) / 256.0D; // L: 144
		double var7 = (double)(var0 & 255) / 256.0D; // L: 145
		var3 = Math.pow(var3, var1); // L: 146
		var5 = Math.pow(var5, var1); // L: 147
		var7 = Math.pow(var7, var1); // L: 148
		int var9 = (int)(var3 * 256.0D); // L: 149
		int var10 = (int)(var5 * 256.0D); // L: 150
		int var11 = (int)(var7 * 256.0D); // L: 151
		return var11 + (var10 << 8) + (var9 << 16); // L: 152
	}

	@ObfuscatedName("u")
	public static void method4024(int var0, int var1, int var2) {
		field2334 = var0 < 0 || var0 > Rasterizer3D_clipWidth || var1 < 0 || var1 > Rasterizer3D_clipWidth || var2 < 0 || var2 > Rasterizer3D_clipWidth; // L: 156
	} // L: 157

	@ObfuscatedName("r")
	static final void method4003(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3; // L: 160
		int var10 = var1 - var0; // L: 161
		int var11 = var5 - var3; // L: 162
		int var12 = var2 - var0; // L: 163
		int var13 = var7 - var6; // L: 164
		int var14 = var8 - var6; // L: 165
		int var15;
		if (var2 != var1) { // L: 167
			var15 = (var5 - var4 << 14) / (var2 - var1); // L: 168
		} else {
			var15 = 0; // L: 171
		}

		int var16;
		if (var0 != var1) { // L: 174
			var16 = (var9 << 14) / var10; // L: 175
		} else {
			var16 = 0; // L: 178
		}

		int var17;
		if (var0 != var2) { // L: 181
			var17 = (var11 << 14) / var12; // L: 182
		} else {
			var17 = 0; // L: 185
		}

		int var18 = var9 * var12 - var11 * var10; // L: 187
		if (var18 != 0) { // L: 188
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18; // L: 189
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18; // L: 190
			if (var0 <= var1 && var0 <= var2) { // L: 191
				if (var0 < Rasterizer3D_clipHeight) { // L: 192
					if (var1 > Rasterizer3D_clipHeight) { // L: 193
						var1 = Rasterizer3D_clipHeight; // L: 194
					}

					if (var2 > Rasterizer3D_clipHeight) { // L: 196
						var2 = Rasterizer3D_clipHeight; // L: 197
					}

					var6 = var19 + ((var6 << 8) - var3 * var19); // L: 199
					if (var1 < var2) { // L: 200
						var5 = var3 <<= 14; // L: 201
						if (var0 < 0) { // L: 202
							var5 -= var0 * var17; // L: 203
							var3 -= var0 * var16; // L: 204
							var6 -= var0 * var20; // L: 205
							var0 = 0; // L: 206
						}

						var4 <<= 14; // L: 208
						if (var1 < 0) { // L: 209
							var4 -= var15 * var1; // L: 210
							var1 = 0; // L: 211
						}

						if (var0 != var1 && var17 < var16 || var0 == var1 && var17 > var15) { // L: 213
							var2 -= var1; // L: 214
							var1 -= var0; // L: 215
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 216

							while (true) {
								--var1; // L: 217
								if (var1 < 0) {
									while (true) {
										--var2; // L: 224
										if (var2 < 0) {
											return; // L: 231
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19); // L: 225
										var5 += var17; // L: 226
										var4 += var15; // L: 227
										var6 += var20; // L: 228
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 229
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 218
								var5 += var17; // L: 219
								var3 += var16; // L: 220
								var6 += var20; // L: 221
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 222
							}
						} else {
							var2 -= var1; // L: 234
							var1 -= var0; // L: 235
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 236

							while (true) {
								--var1; // L: 237
								if (var1 < 0) {
									while (true) {
										--var2; // L: 244
										if (var2 < 0) {
											return; // L: 251
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19); // L: 245
										var5 += var17; // L: 246
										var4 += var15; // L: 247
										var6 += var20; // L: 248
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 249
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 238
								var5 += var17; // L: 239
								var3 += var16; // L: 240
								var6 += var20; // L: 241
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 242
							}
						}
					} else {
						var4 = var3 <<= 14; // L: 255
						if (var0 < 0) { // L: 256
							var4 -= var0 * var17; // L: 257
							var3 -= var0 * var16; // L: 258
							var6 -= var0 * var20; // L: 259
							var0 = 0; // L: 260
						}

						var5 <<= 14; // L: 262
						if (var2 < 0) { // L: 263
							var5 -= var15 * var2; // L: 264
							var2 = 0; // L: 265
						}

						if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) { // L: 267
							var1 -= var2; // L: 268
							var2 -= var0; // L: 269
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 270

							while (true) {
								--var2; // L: 271
								if (var2 < 0) {
									while (true) {
										--var1; // L: 278
										if (var1 < 0) {
											return; // L: 285
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 279
										var5 += var15; // L: 280
										var3 += var16; // L: 281
										var6 += var20; // L: 282
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 283
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19); // L: 272
								var4 += var17; // L: 273
								var3 += var16; // L: 274
								var6 += var20; // L: 275
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 276
							}
						} else {
							var1 -= var2; // L: 288
							var2 -= var0; // L: 289
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 290

							while (true) {
								--var2; // L: 291
								if (var2 < 0) {
									while (true) {
										--var1; // L: 298
										if (var1 < 0) {
											return; // L: 305
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 299
										var5 += var15; // L: 300
										var3 += var16; // L: 301
										var6 += var20; // L: 302
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 303
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19); // L: 292
								var4 += var17; // L: 293
								var3 += var16; // L: 294
								var6 += var20; // L: 295
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 296
							}
						}
					}
				}
			} else if (var1 <= var2) { // L: 309
				if (var1 < Rasterizer3D_clipHeight) { // L: 310
					if (var2 > Rasterizer3D_clipHeight) { // L: 311
						var2 = Rasterizer3D_clipHeight; // L: 312
					}

					if (var0 > Rasterizer3D_clipHeight) { // L: 314
						var0 = Rasterizer3D_clipHeight; // L: 315
					}

					var7 = var19 + ((var7 << 8) - var19 * var4); // L: 317
					if (var2 < var0) { // L: 318
						var3 = var4 <<= 14; // L: 319
						if (var1 < 0) { // L: 320
							var3 -= var16 * var1; // L: 321
							var4 -= var15 * var1; // L: 322
							var7 -= var20 * var1; // L: 323
							var1 = 0; // L: 324
						}

						var5 <<= 14; // L: 326
						if (var2 < 0) { // L: 327
							var5 -= var17 * var2; // L: 328
							var2 = 0; // L: 329
						}

						if (var2 != var1 && var16 < var15 || var2 == var1 && var16 > var17) { // L: 331
							var0 -= var2; // L: 332
							var2 -= var1; // L: 333
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 334

							while (true) {
								--var2; // L: 335
								if (var2 < 0) {
									while (true) {
										--var0; // L: 342
										if (var0 < 0) {
											return; // L: 349
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19); // L: 343
										var3 += var16; // L: 344
										var5 += var17; // L: 345
										var7 += var20; // L: 346
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 347
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 336
								var3 += var16; // L: 337
								var4 += var15; // L: 338
								var7 += var20; // L: 339
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 340
							}
						} else {
							var0 -= var2; // L: 352
							var2 -= var1; // L: 353
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 354

							while (true) {
								--var2; // L: 355
								if (var2 < 0) {
									while (true) {
										--var0; // L: 362
										if (var0 < 0) {
											return; // L: 369
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19); // L: 363
										var3 += var16; // L: 364
										var5 += var17; // L: 365
										var7 += var20; // L: 366
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 367
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 356
								var3 += var16; // L: 357
								var4 += var15; // L: 358
								var7 += var20; // L: 359
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 360
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 373
						if (var1 < 0) { // L: 374
							var5 -= var16 * var1; // L: 375
							var4 -= var15 * var1; // L: 376
							var7 -= var20 * var1; // L: 377
							var1 = 0; // L: 378
						}

						var3 <<= 14; // L: 380
						if (var0 < 0) { // L: 381
							var3 -= var0 * var17; // L: 382
							var0 = 0; // L: 383
						}

						if (var16 < var15) { // L: 385
							var2 -= var0; // L: 386
							var0 -= var1; // L: 387
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 388

							while (true) {
								--var0; // L: 389
								if (var0 < 0) {
									while (true) {
										--var2; // L: 396
										if (var2 < 0) {
											return; // L: 403
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 397
										var3 += var17; // L: 398
										var4 += var15; // L: 399
										var7 += var20; // L: 400
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 401
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19); // L: 390
								var5 += var16; // L: 391
								var4 += var15; // L: 392
								var7 += var20; // L: 393
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 394
							}
						} else {
							var2 -= var0; // L: 406
							var0 -= var1; // L: 407
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 408

							while (true) {
								--var0; // L: 409
								if (var0 < 0) {
									while (true) {
										--var2; // L: 416
										if (var2 < 0) {
											return; // L: 423
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 417
										var3 += var17; // L: 418
										var4 += var15; // L: 419
										var7 += var20; // L: 420
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 421
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19); // L: 410
								var5 += var16; // L: 411
								var4 += var15; // L: 412
								var7 += var20; // L: 413
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 414
							}
						}
					}
				}
			} else if (var2 < Rasterizer3D_clipHeight) { // L: 428
				if (var0 > Rasterizer3D_clipHeight) { // L: 429
					var0 = Rasterizer3D_clipHeight;
				}

				if (var1 > Rasterizer3D_clipHeight) { // L: 430
					var1 = Rasterizer3D_clipHeight;
				}

				var8 = var19 + ((var8 << 8) - var5 * var19); // L: 431
				if (var0 < var1) { // L: 432
					var4 = var5 <<= 14; // L: 433
					if (var2 < 0) { // L: 434
						var4 -= var15 * var2; // L: 435
						var5 -= var17 * var2; // L: 436
						var8 -= var20 * var2; // L: 437
						var2 = 0; // L: 438
					}

					var3 <<= 14; // L: 440
					if (var0 < 0) { // L: 441
						var3 -= var0 * var16; // L: 442
						var0 = 0; // L: 443
					}

					if (var15 < var17) { // L: 445
						var1 -= var0; // L: 446
						var0 -= var2; // L: 447
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 448

						while (true) {
							--var0; // L: 449
							if (var0 < 0) {
								while (true) {
									--var1; // L: 456
									if (var1 < 0) {
										return; // L: 463
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19); // L: 457
									var4 += var15; // L: 458
									var3 += var16; // L: 459
									var8 += var20; // L: 460
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 461
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 450
							var4 += var15; // L: 451
							var5 += var17; // L: 452
							var8 += var20; // L: 453
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 454
						}
					} else {
						var1 -= var0; // L: 466
						var0 -= var2; // L: 467
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 468

						while (true) {
							--var0; // L: 469
							if (var0 < 0) {
								while (true) {
									--var1; // L: 476
									if (var1 < 0) {
										return; // L: 483
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19); // L: 477
									var4 += var15; // L: 478
									var3 += var16; // L: 479
									var8 += var20; // L: 480
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 481
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 470
							var4 += var15; // L: 471
							var5 += var17; // L: 472
							var8 += var20; // L: 473
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 474
						}
					}
				} else {
					var3 = var5 <<= 14; // L: 487
					if (var2 < 0) { // L: 488
						var3 -= var15 * var2; // L: 489
						var5 -= var17 * var2; // L: 490
						var8 -= var20 * var2; // L: 491
						var2 = 0; // L: 492
					}

					var4 <<= 14; // L: 494
					if (var1 < 0) { // L: 495
						var4 -= var16 * var1; // L: 496
						var1 = 0; // L: 497
					}

					if (var15 < var17) { // L: 499
						var0 -= var1; // L: 500
						var1 -= var2; // L: 501
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 502

						while (true) {
							--var1; // L: 503
							if (var1 < 0) {
								while (true) {
									--var0; // L: 510
									if (var0 < 0) {
										return; // L: 517
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 511
									var4 += var16; // L: 512
									var5 += var17; // L: 513
									var8 += var20; // L: 514
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 515
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19); // L: 504
							var3 += var15; // L: 505
							var5 += var17; // L: 506
							var8 += var20; // L: 507
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 508
						}
					} else {
						var0 -= var1; // L: 520
						var1 -= var2; // L: 521
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 522

						while (true) {
							--var1; // L: 523
							if (var1 < 0) {
								while (true) {
									--var0; // L: 530
									if (var0 < 0) {
										return; // L: 537
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 531
									var4 += var16; // L: 532
									var5 += var17; // L: 533
									var8 += var20; // L: 534
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 535
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19); // L: 524
							var3 += var15; // L: 525
							var5 += var17; // L: 526
							var8 += var20; // L: 527
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 528
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("k")
	static final void method4084(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9, byte var10, byte var11, byte var12) {
		var6 = method4005(var6, var9, var10, var11, var12); // L: 544
		var7 = method4005(var7, var9, var10, var11, var12); // L: 545
		var8 = method4005(var8, var9, var10, var11, var12); // L: 546
		method4003(var0, var1, var2, var3, var4, var5, var6, var7, var8); // L: 547
	} // L: 548

	@ObfuscatedName("x")
	static int method4005(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63; // L: 551
		int var6 = var0 >> 7 & 7; // L: 552
		int var7 = var0 & 127; // L: 553
		int var8 = var4 & 255; // L: 554
		if (var1 != -1) { // L: 555
			var5 += var8 * (var1 - var5) >> 7; // L: 556
		}

		if (var2 != -1) { // L: 558
			var6 += var8 * (var2 - var6) >> 7; // L: 559
		}

		if (var3 != -1) { // L: 561
			var7 += var8 * (var3 - var7) >> 7; // L: 562
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535; // L: 564
	}

	@ObfuscatedName("c")
	@Export("Rasterizer3D_vertAlpha")
	static final void Rasterizer3D_vertAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field2334) { // L: 568
			if (var5 > Rasterizer3D_clipWidth) { // L: 569
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 570
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 572
			var1 += var4; // L: 573
			var6 += var4 * var7; // L: 574
			int var8;
			int var9;
			int var10;
			int var11;
			if (field2325) { // L: 575
				var3 = var5 - var4 >> 2; // L: 576
				var7 <<= 2; // L: 577
				if (Rasterizer3D_alpha == 0) { // L: 578
					if (var3 > 0) { // L: 579
						do {
							var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 581
							var2 = Rasterizer3D_colorPalette[var8]; // L: 582
							var6 += var7; // L: 583
							var0[var1++] = var2; // L: 584
							var0[var1++] = var2; // L: 585
							var0[var1++] = var2; // L: 586
							var0[var1++] = var2; // L: 587
							--var3; // L: 588
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 590
					if (var3 > 0) { // L: 591
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 592
						var2 = Rasterizer3D_colorPalette[var8]; // L: 593

						do {
							var0[var1++] = var2; // L: 595
							--var3; // L: 596
						} while(var3 > 0);
					}
				} else {
					var8 = Rasterizer3D_alpha; // L: 600
					var9 = 256 - Rasterizer3D_alpha; // L: 601
					if (var3 > 0) { // L: 602
						do {
							var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 604
							var2 = Rasterizer3D_colorPalette[var10]; // L: 605
							var6 += var7; // L: 606
							var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 607
							var11 = var0[var1]; // L: 608
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 609
							var11 = var0[var1]; // L: 610
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 611
							var11 = var0[var1]; // L: 612
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 613
							var11 = var0[var1]; // L: 614
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 615
							--var3; // L: 616
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 618
					if (var3 > 0) { // L: 619
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 620
						var2 = Rasterizer3D_colorPalette[var10]; // L: 621
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 622

						do {
							var11 = var0[var1]; // L: 624
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 625
							--var3; // L: 626
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4; // L: 632
				if (Rasterizer3D_alpha == 0) { // L: 633
					do {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 635
						var0[var1++] = Rasterizer3D_colorPalette[var8]; // L: 636
						var6 += var7; // L: 637
						--var3; // L: 638
					} while(var3 > 0);
				} else {
					var8 = Rasterizer3D_alpha; // L: 641
					var9 = 256 - Rasterizer3D_alpha; // L: 642

					do {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 644
						var2 = Rasterizer3D_colorPalette[var10]; // L: 645
						var6 += var7; // L: 646
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 647
						var11 = var0[var1]; // L: 648
						var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 649
						--var3; // L: 650
					} while(var3 > 0);
				}

			}
		}
	} // L: 629 652

	@ObfuscatedName("j")
	public static final void method4007(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 657
		if (var0 != var1) { // L: 658
			var7 = (var4 - var3 << 14) / (var1 - var0); // L: 659
		}

		int var8 = 0; // L: 661
		if (var2 != var1) { // L: 662
			var8 = (var5 - var4 << 14) / (var2 - var1); // L: 663
		}

		int var9 = 0; // L: 665
		if (var0 != var2) { // L: 666
			var9 = (var3 - var5 << 14) / (var0 - var2); // L: 667
		}

		if (var0 <= var1 && var0 <= var2) { // L: 669
			if (var0 < Rasterizer3D_clipHeight) { // L: 670
				if (var1 > Rasterizer3D_clipHeight) { // L: 671
					var1 = Rasterizer3D_clipHeight;
				}

				if (var2 > Rasterizer3D_clipHeight) { // L: 672
					var2 = Rasterizer3D_clipHeight;
				}

				if (var1 < var2) { // L: 673
					var5 = var3 <<= 14; // L: 674
					if (var0 < 0) { // L: 675
						var5 -= var0 * var9; // L: 676
						var3 -= var0 * var7; // L: 677
						var0 = 0; // L: 678
					}

					var4 <<= 14; // L: 680
					if (var1 < 0) { // L: 681
						var4 -= var8 * var1; // L: 682
						var1 = 0; // L: 683
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) { // L: 685
						var2 -= var1; // L: 686
						var1 -= var0; // L: 687
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 688

						while (true) {
							--var1; // L: 689
							if (var1 < 0) {
								while (true) {
									--var2; // L: 695
									if (var2 < 0) {
										return; // L: 701
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var4 >> 14); // L: 696
									var5 += var9; // L: 697
									var4 += var8; // L: 698
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 699
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 690
							var5 += var9; // L: 691
							var3 += var7; // L: 692
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 693
						}
					} else {
						var2 -= var1; // L: 704
						var1 -= var0; // L: 705
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 706

						while (true) {
							--var1; // L: 707
							if (var1 < 0) {
								while (true) {
									--var2; // L: 713
									if (var2 < 0) {
										return; // L: 719
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var5 >> 14); // L: 714
									var5 += var9; // L: 715
									var4 += var8; // L: 716
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 717
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 708
							var5 += var9; // L: 709
							var3 += var7; // L: 710
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 711
						}
					}
				} else {
					var4 = var3 <<= 14; // L: 723
					if (var0 < 0) { // L: 724
						var4 -= var0 * var9; // L: 725
						var3 -= var0 * var7; // L: 726
						var0 = 0; // L: 727
					}

					var5 <<= 14; // L: 729
					if (var2 < 0) { // L: 730
						var5 -= var8 * var2; // L: 731
						var2 = 0; // L: 732
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) { // L: 734
						var1 -= var2; // L: 735
						var2 -= var0; // L: 736
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 737

						while (true) {
							--var2; // L: 738
							if (var2 < 0) {
								while (true) {
									--var1; // L: 744
									if (var1 < 0) {
										return; // L: 750
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 745
									var5 += var8; // L: 746
									var3 += var7; // L: 747
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 748
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var3 >> 14); // L: 739
							var4 += var9; // L: 740
							var3 += var7; // L: 741
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 742
						}
					} else {
						var1 -= var2; // L: 753
						var2 -= var0; // L: 754
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 755

						while (true) {
							--var2; // L: 756
							if (var2 < 0) {
								while (true) {
									--var1; // L: 762
									if (var1 < 0) {
										return; // L: 768
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 763
									var5 += var8; // L: 764
									var3 += var7; // L: 765
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 766
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var4 >> 14); // L: 757
							var4 += var9; // L: 758
							var3 += var7; // L: 759
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 760
						}
					}
				}
			}
		} else if (var1 <= var2) { // L: 772
			if (var1 < Rasterizer3D_clipHeight) { // L: 773
				if (var2 > Rasterizer3D_clipHeight) { // L: 774
					var2 = Rasterizer3D_clipHeight;
				}

				if (var0 > Rasterizer3D_clipHeight) { // L: 775
					var0 = Rasterizer3D_clipHeight;
				}

				if (var2 < var0) { // L: 776
					var3 = var4 <<= 14; // L: 777
					if (var1 < 0) { // L: 778
						var3 -= var7 * var1; // L: 779
						var4 -= var8 * var1; // L: 780
						var1 = 0; // L: 781
					}

					var5 <<= 14; // L: 783
					if (var2 < 0) { // L: 784
						var5 -= var9 * var2; // L: 785
						var2 = 0; // L: 786
					}

					if (var2 != var1 && var7 < var8 || var2 == var1 && var7 > var9) { // L: 788
						var0 -= var2; // L: 789
						var2 -= var1; // L: 790
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 791

						while (true) {
							--var2; // L: 792
							if (var2 < 0) {
								while (true) {
									--var0; // L: 798
									if (var0 < 0) {
										return; // L: 804
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var5 >> 14); // L: 799
									var3 += var7; // L: 800
									var5 += var9; // L: 801
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 802
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 793
							var3 += var7; // L: 794
							var4 += var8; // L: 795
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 796
						}
					} else {
						var0 -= var2; // L: 807
						var2 -= var1; // L: 808
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 809

						while (true) {
							--var2; // L: 810
							if (var2 < 0) {
								while (true) {
									--var0; // L: 816
									if (var0 < 0) {
										return; // L: 822
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var3 >> 14); // L: 817
									var3 += var7; // L: 818
									var5 += var9; // L: 819
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 820
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 811
							var3 += var7; // L: 812
							var4 += var8; // L: 813
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 814
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 826
					if (var1 < 0) { // L: 827
						var5 -= var7 * var1; // L: 828
						var4 -= var8 * var1; // L: 829
						var1 = 0; // L: 830
					}

					var3 <<= 14; // L: 832
					if (var0 < 0) { // L: 833
						var3 -= var0 * var9; // L: 834
						var0 = 0; // L: 835
					}

					if (var7 < var8) { // L: 837
						var2 -= var0; // L: 838
						var0 -= var1; // L: 839
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 840

						while (true) {
							--var0; // L: 841
							if (var0 < 0) {
								while (true) {
									--var2; // L: 847
									if (var2 < 0) {
										return; // L: 853
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 848
									var3 += var9; // L: 849
									var4 += var8; // L: 850
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 851
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var4 >> 14); // L: 842
							var5 += var7; // L: 843
							var4 += var8; // L: 844
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 845
						}
					} else {
						var2 -= var0; // L: 856
						var0 -= var1; // L: 857
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 858

						while (true) {
							--var0; // L: 859
							if (var0 < 0) {
								while (true) {
									--var2; // L: 865
									if (var2 < 0) {
										return; // L: 871
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 866
									var3 += var9; // L: 867
									var4 += var8; // L: 868
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 869
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var5 >> 14); // L: 860
							var5 += var7; // L: 861
							var4 += var8; // L: 862
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 863
						}
					}
				}
			}
		} else if (var2 < Rasterizer3D_clipHeight) { // L: 876
			if (var0 > Rasterizer3D_clipHeight) { // L: 877
				var0 = Rasterizer3D_clipHeight;
			}

			if (var1 > Rasterizer3D_clipHeight) { // L: 878
				var1 = Rasterizer3D_clipHeight;
			}

			if (var0 < var1) { // L: 879
				var4 = var5 <<= 14; // L: 880
				if (var2 < 0) { // L: 881
					var4 -= var8 * var2; // L: 882
					var5 -= var9 * var2; // L: 883
					var2 = 0; // L: 884
				}

				var3 <<= 14; // L: 886
				if (var0 < 0) { // L: 887
					var3 -= var0 * var7; // L: 888
					var0 = 0; // L: 889
				}

				if (var8 < var9) { // L: 891
					var1 -= var0; // L: 892
					var0 -= var2; // L: 893
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 894

					while (true) {
						--var0; // L: 895
						if (var0 < 0) {
							while (true) {
								--var1; // L: 901
								if (var1 < 0) {
									return; // L: 907
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var3 >> 14); // L: 902
								var4 += var8; // L: 903
								var3 += var7; // L: 904
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 905
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 896
						var4 += var8; // L: 897
						var5 += var9; // L: 898
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 899
					}
				} else {
					var1 -= var0; // L: 910
					var0 -= var2; // L: 911
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 912

					while (true) {
						--var0; // L: 913
						if (var0 < 0) {
							while (true) {
								--var1; // L: 919
								if (var1 < 0) {
									return; // L: 925
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var4 >> 14); // L: 920
								var4 += var8; // L: 921
								var3 += var7; // L: 922
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 923
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 914
						var4 += var8; // L: 915
						var5 += var9; // L: 916
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 917
					}
				}
			} else {
				var3 = var5 <<= 14; // L: 929
				if (var2 < 0) { // L: 930
					var3 -= var8 * var2; // L: 931
					var5 -= var9 * var2; // L: 932
					var2 = 0; // L: 933
				}

				var4 <<= 14; // L: 935
				if (var1 < 0) { // L: 936
					var4 -= var7 * var1; // L: 937
					var1 = 0; // L: 938
				}

				if (var8 < var9) { // L: 940
					var0 -= var1; // L: 941
					var1 -= var2; // L: 942
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 943

					while (true) {
						--var1; // L: 944
						if (var1 < 0) {
							while (true) {
								--var0; // L: 950
								if (var0 < 0) {
									return; // L: 956
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 951
								var4 += var7; // L: 952
								var5 += var9; // L: 953
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 954
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var5 >> 14); // L: 945
						var3 += var8; // L: 946
						var5 += var9; // L: 947
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 948
					}
				} else {
					var0 -= var1; // L: 959
					var1 -= var2; // L: 960
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 961

					while (true) {
						--var1; // L: 962
						if (var1 < 0) {
							while (true) {
								--var0; // L: 968
								if (var0 < 0) {
									return; // L: 974
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 969
								var4 += var7; // L: 970
								var5 += var9; // L: 971
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 972
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var3 >> 14); // L: 963
						var3 += var8; // L: 964
						var5 += var9; // L: 965
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 966
					}
				}
			}
		}
	}

	@ObfuscatedName("p")
	static final void method4008(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7, byte var8, byte var9, byte var10) {
		int var11 = method4005(var6, var7, var8, var9, var10); // L: 981
		var6 = Rasterizer3D_colorPalette[var11]; // L: 982
		method4007(var0, var1, var2, var3, var4, var5, var6); // L: 983
	} // L: 984

	@ObfuscatedName("s")
	@Export("Rasterizer3D_horizAlpha")
	static final void Rasterizer3D_horizAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field2334) { // L: 987
			if (var5 > Rasterizer3D_clipWidth) { // L: 988
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 989
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 991
			var1 += var4; // L: 992
			var3 = var5 - var4 >> 2; // L: 993
			if (Rasterizer3D_alpha != 0) { // L: 994
				if (Rasterizer3D_alpha == 254) { // L: 1006
					while (true) {
						--var3; // L: 1007
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 1013

							while (true) {
								--var3; // L: 1014
								if (var3 < 0) {
									return; // L: 1038
								}

								var0[var1++] = var0[var1]; // L: 1015
							}
						}

						var0[var1++] = var0[var1]; // L: 1008
						var0[var1++] = var0[var1]; // L: 1009
						var0[var1++] = var0[var1]; // L: 1010
						var0[var1++] = var0[var1]; // L: 1011
					}
				} else {
					int var6 = Rasterizer3D_alpha; // L: 1019
					int var7 = 256 - Rasterizer3D_alpha; // L: 1020
					var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935); // L: 1021

					while (true) {
						--var3; // L: 1022
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 1032

							while (true) {
								--var3; // L: 1033
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1]; // L: 1034
								var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 1035
							}
						}

						var8 = var0[var1]; // L: 1023
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 1024
						var8 = var0[var1]; // L: 1025
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 1026
						var8 = var0[var1]; // L: 1027
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 1028
						var8 = var0[var1]; // L: 1029
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 1030
					}
				}
			} else {
				while (true) {
					--var3; // L: 995
					if (var3 < 0) {
						var3 = var5 - var4 & 3; // L: 1001

						while (true) {
							--var3; // L: 1002
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2; // L: 1003
						}
					}

					var0[var1++] = var2; // L: 996
					var0[var1++] = var2; // L: 997
					var0[var1++] = var2; // L: 998
					var0[var1++] = var2; // L: 999
				}
			}
		}
	}

	@ObfuscatedName("b")
	static final void method4010(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1041
		int var20;
		if (var19 == null) { // L: 1042
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1043
			method4003(var0, var1, var2, var3, var4, var5, method4014(var20, var6), method4014(var20, var7), method4014(var20, var8)); // L: 1044
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1047
			field2323 = Rasterizer3D_textureLoader.vmethod4505(var18); // L: 1048
			var20 = var4 - var3; // L: 1049
			int var21 = var1 - var0; // L: 1050
			int var22 = var5 - var3; // L: 1051
			int var23 = var2 - var0; // L: 1052
			int var24 = var7 - var6; // L: 1053
			int var25 = var8 - var6; // L: 1054
			int var26 = 0; // L: 1055
			if (var0 != var1) { // L: 1056
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1057
			if (var2 != var1) { // L: 1058
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1059
			if (var0 != var2) { // L: 1060
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1061
			if (var29 != 0) { // L: 1062
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1063
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1064
				var10 = var9 - var10; // L: 1065
				var13 = var12 - var13; // L: 1066
				var16 = var15 - var16; // L: 1067
				var11 -= var9; // L: 1068
				var14 -= var12; // L: 1069
				var17 -= var15; // L: 1070
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1071
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1072
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1073
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1074
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1075
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1076
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1077
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1078
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1079
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1080
					if (var0 < Rasterizer3D_clipHeight) { // L: 1081
						if (var1 > Rasterizer3D_clipHeight) { // L: 1082
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1083
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1084
						if (var1 < var2) { // L: 1085
							var5 = var3 <<= 14; // L: 1086
							if (var0 < 0) { // L: 1087
								var5 -= var0 * var28; // L: 1088
								var3 -= var0 * var26; // L: 1089
								var6 -= var0 * var31; // L: 1090
								var0 = 0; // L: 1091
							}

							var4 <<= 14; // L: 1093
							if (var1 < 0) { // L: 1094
								var4 -= var27 * var1; // L: 1095
								var1 = 0; // L: 1096
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1098
							var32 += var34 * var41; // L: 1099
							var35 += var37 * var41; // L: 1100
							var38 += var40 * var41; // L: 1101
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) { // L: 1102
								var2 -= var1; // L: 1103
								var1 -= var0; // L: 1104
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1105

								while (true) {
									--var1; // L: 1106
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1116
											if (var2 < 0) {
												return; // L: 1126
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1117
											var5 += var28; // L: 1118
											var4 += var27; // L: 1119
											var6 += var31; // L: 1120
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1121
											var32 += var34; // L: 1122
											var35 += var37; // L: 1123
											var38 += var40; // L: 1124
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1107
									var5 += var28; // L: 1108
									var3 += var26; // L: 1109
									var6 += var31; // L: 1110
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1111
									var32 += var34; // L: 1112
									var35 += var37; // L: 1113
									var38 += var40; // L: 1114
								}
							} else {
								var2 -= var1; // L: 1129
								var1 -= var0; // L: 1130
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1131

								while (true) {
									--var1; // L: 1132
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1142
											if (var2 < 0) {
												return; // L: 1152
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1143
											var5 += var28; // L: 1144
											var4 += var27; // L: 1145
											var6 += var31; // L: 1146
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1147
											var32 += var34; // L: 1148
											var35 += var37; // L: 1149
											var38 += var40; // L: 1150
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1133
									var5 += var28; // L: 1134
									var3 += var26; // L: 1135
									var6 += var31; // L: 1136
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1137
									var32 += var34; // L: 1138
									var35 += var37; // L: 1139
									var38 += var40; // L: 1140
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1156
							if (var0 < 0) { // L: 1157
								var4 -= var0 * var28; // L: 1158
								var3 -= var0 * var26; // L: 1159
								var6 -= var0 * var31; // L: 1160
								var0 = 0; // L: 1161
							}

							var5 <<= 14; // L: 1163
							if (var2 < 0) { // L: 1164
								var5 -= var27 * var2; // L: 1165
								var2 = 0; // L: 1166
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1168
							var32 += var34 * var41; // L: 1169
							var35 += var37 * var41; // L: 1170
							var38 += var40 * var41; // L: 1171
							if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) { // L: 1172
								var1 -= var2; // L: 1173
								var2 -= var0; // L: 1174
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1175

								while (true) {
									--var2; // L: 1176
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1186
											if (var1 < 0) {
												return; // L: 1196
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1187
											var5 += var27; // L: 1188
											var3 += var26; // L: 1189
											var6 += var31; // L: 1190
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1191
											var32 += var34; // L: 1192
											var35 += var37; // L: 1193
											var38 += var40; // L: 1194
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1177
									var4 += var28; // L: 1178
									var3 += var26; // L: 1179
									var6 += var31; // L: 1180
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1181
									var32 += var34; // L: 1182
									var35 += var37; // L: 1183
									var38 += var40; // L: 1184
								}
							} else {
								var1 -= var2; // L: 1199
								var2 -= var0; // L: 1200
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1201

								while (true) {
									--var2; // L: 1202
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1212
											if (var1 < 0) {
												return; // L: 1222
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1213
											var5 += var27; // L: 1214
											var3 += var26; // L: 1215
											var6 += var31; // L: 1216
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1217
											var32 += var34; // L: 1218
											var35 += var37; // L: 1219
											var38 += var40; // L: 1220
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1203
									var4 += var28; // L: 1204
									var3 += var26; // L: 1205
									var6 += var31; // L: 1206
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1207
									var32 += var34; // L: 1208
									var35 += var37; // L: 1209
									var38 += var40; // L: 1210
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 1226
					if (var1 < Rasterizer3D_clipHeight) { // L: 1227
						if (var2 > Rasterizer3D_clipHeight) { // L: 1228
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 1229
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 1230
						if (var2 < var0) { // L: 1231
							var3 = var4 <<= 14; // L: 1232
							if (var1 < 0) { // L: 1233
								var3 -= var26 * var1; // L: 1234
								var4 -= var27 * var1; // L: 1235
								var7 -= var31 * var1; // L: 1236
								var1 = 0; // L: 1237
							}

							var5 <<= 14; // L: 1239
							if (var2 < 0) { // L: 1240
								var5 -= var28 * var2; // L: 1241
								var2 = 0; // L: 1242
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1244
							var32 += var34 * var41; // L: 1245
							var35 += var37 * var41; // L: 1246
							var38 += var40 * var41; // L: 1247
							if ((var2 == var1 || var26 >= var27) && (var2 != var1 || var26 <= var28)) { // L: 1248
								var0 -= var2; // L: 1275
								var2 -= var1; // L: 1276
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1277

								while (true) {
									--var2; // L: 1278
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1288
											if (var0 < 0) {
												return; // L: 1298
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1289
											var3 += var26; // L: 1290
											var5 += var28; // L: 1291
											var7 += var31; // L: 1292
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1293
											var32 += var34; // L: 1294
											var35 += var37; // L: 1295
											var38 += var40; // L: 1296
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1279
									var3 += var26; // L: 1280
									var4 += var27; // L: 1281
									var7 += var31; // L: 1282
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1283
									var32 += var34; // L: 1284
									var35 += var37; // L: 1285
									var38 += var40; // L: 1286
								}
							} else {
								var0 -= var2; // L: 1249
								var2 -= var1; // L: 1250
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1251

								while (true) {
									--var2; // L: 1252
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1262
											if (var0 < 0) {
												return; // L: 1272
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1263
											var3 += var26; // L: 1264
											var5 += var28; // L: 1265
											var7 += var31; // L: 1266
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1267
											var32 += var34; // L: 1268
											var35 += var37; // L: 1269
											var38 += var40; // L: 1270
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1253
									var3 += var26; // L: 1254
									var4 += var27; // L: 1255
									var7 += var31; // L: 1256
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1257
									var32 += var34; // L: 1258
									var35 += var37; // L: 1259
									var38 += var40; // L: 1260
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1302
							if (var1 < 0) { // L: 1303
								var5 -= var26 * var1; // L: 1304
								var4 -= var27 * var1; // L: 1305
								var7 -= var31 * var1; // L: 1306
								var1 = 0; // L: 1307
							}

							var3 <<= 14; // L: 1309
							if (var0 < 0) { // L: 1310
								var3 -= var0 * var28; // L: 1311
								var0 = 0; // L: 1312
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1314
							var32 += var34 * var41; // L: 1315
							var35 += var37 * var41; // L: 1316
							var38 += var40 * var41; // L: 1317
							if (var26 < var27) { // L: 1318
								var2 -= var0; // L: 1319
								var0 -= var1; // L: 1320
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1321

								while (true) {
									--var0; // L: 1322
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1332
											if (var2 < 0) {
												return; // L: 1342
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1333
											var3 += var28; // L: 1334
											var4 += var27; // L: 1335
											var7 += var31; // L: 1336
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1337
											var32 += var34; // L: 1338
											var35 += var37; // L: 1339
											var38 += var40; // L: 1340
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1323
									var5 += var26; // L: 1324
									var4 += var27; // L: 1325
									var7 += var31; // L: 1326
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1327
									var32 += var34; // L: 1328
									var35 += var37; // L: 1329
									var38 += var40; // L: 1330
								}
							} else {
								var2 -= var0; // L: 1345
								var0 -= var1; // L: 1346
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1347

								while (true) {
									--var0; // L: 1348
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1358
											if (var2 < 0) {
												return; // L: 1368
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1359
											var3 += var28; // L: 1360
											var4 += var27; // L: 1361
											var7 += var31; // L: 1362
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1363
											var32 += var34; // L: 1364
											var35 += var37; // L: 1365
											var38 += var40; // L: 1366
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1349
									var5 += var26; // L: 1350
									var4 += var27; // L: 1351
									var7 += var31; // L: 1352
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1353
									var32 += var34; // L: 1354
									var35 += var37; // L: 1355
									var38 += var40; // L: 1356
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 1373
					if (var0 > Rasterizer3D_clipHeight) { // L: 1374
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 1375
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 1376
					if (var0 < var1) { // L: 1377
						var4 = var5 <<= 14; // L: 1378
						if (var2 < 0) { // L: 1379
							var4 -= var27 * var2; // L: 1380
							var5 -= var28 * var2; // L: 1381
							var8 -= var31 * var2; // L: 1382
							var2 = 0; // L: 1383
						}

						var3 <<= 14; // L: 1385
						if (var0 < 0) { // L: 1386
							var3 -= var0 * var26; // L: 1387
							var0 = 0; // L: 1388
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1390
						var32 += var34 * var41; // L: 1391
						var35 += var37 * var41; // L: 1392
						var38 += var40 * var41; // L: 1393
						if (var27 < var28) { // L: 1394
							var1 -= var0; // L: 1395
							var0 -= var2; // L: 1396
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1397

							while (true) {
								--var0; // L: 1398
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1408
										if (var1 < 0) {
											return; // L: 1418
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1409
										var4 += var27; // L: 1410
										var3 += var26; // L: 1411
										var8 += var31; // L: 1412
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1413
										var32 += var34; // L: 1414
										var35 += var37; // L: 1415
										var38 += var40; // L: 1416
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1399
								var4 += var27; // L: 1400
								var5 += var28; // L: 1401
								var8 += var31; // L: 1402
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1403
								var32 += var34; // L: 1404
								var35 += var37; // L: 1405
								var38 += var40; // L: 1406
							}
						} else {
							var1 -= var0; // L: 1421
							var0 -= var2; // L: 1422
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1423

							while (true) {
								--var0; // L: 1424
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1434
										if (var1 < 0) {
											return; // L: 1444
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1435
										var4 += var27; // L: 1436
										var3 += var26; // L: 1437
										var8 += var31; // L: 1438
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1439
										var32 += var34; // L: 1440
										var35 += var37; // L: 1441
										var38 += var40; // L: 1442
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1425
								var4 += var27; // L: 1426
								var5 += var28; // L: 1427
								var8 += var31; // L: 1428
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1429
								var32 += var34; // L: 1430
								var35 += var37; // L: 1431
								var38 += var40; // L: 1432
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 1448
						if (var2 < 0) { // L: 1449
							var3 -= var27 * var2; // L: 1450
							var5 -= var28 * var2; // L: 1451
							var8 -= var31 * var2; // L: 1452
							var2 = 0; // L: 1453
						}

						var4 <<= 14; // L: 1455
						if (var1 < 0) { // L: 1456
							var4 -= var26 * var1; // L: 1457
							var1 = 0; // L: 1458
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1460
						var32 += var34 * var41; // L: 1461
						var35 += var37 * var41; // L: 1462
						var38 += var40 * var41; // L: 1463
						if (var27 < var28) { // L: 1464
							var0 -= var1; // L: 1465
							var1 -= var2; // L: 1466
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1467

							while (true) {
								--var1; // L: 1468
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1478
										if (var0 < 0) {
											return; // L: 1488
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1479
										var4 += var26; // L: 1480
										var5 += var28; // L: 1481
										var8 += var31; // L: 1482
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1483
										var32 += var34; // L: 1484
										var35 += var37; // L: 1485
										var38 += var40; // L: 1486
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1469
								var3 += var27; // L: 1470
								var5 += var28; // L: 1471
								var8 += var31; // L: 1472
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1473
								var32 += var34; // L: 1474
								var35 += var37; // L: 1475
								var38 += var40; // L: 1476
							}
						} else {
							var0 -= var1; // L: 1491
							var1 -= var2; // L: 1492
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1493

							while (true) {
								--var1; // L: 1494
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1504
										if (var0 < 0) {
											return; // L: 1514
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1505
										var4 += var26; // L: 1506
										var5 += var28; // L: 1507
										var8 += var31; // L: 1508
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1509
										var32 += var34; // L: 1510
										var35 += var37; // L: 1511
										var38 += var40; // L: 1512
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1495
								var3 += var27; // L: 1496
								var5 += var28; // L: 1497
								var8 += var31; // L: 1498
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1499
								var32 += var34; // L: 1500
								var35 += var37; // L: 1501
								var38 += var40; // L: 1502
							}
						}
					}
				}
			}
		}
	} // L: 1045

	@ObfuscatedName("w")
	@Export("Rasterizer3D_iDontKnow")
	static final void Rasterizer3D_iDontKnow(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2334) { // L: 1523
			if (var6 > Rasterizer3D_clipWidth) { // L: 1524
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 1525
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 1527
			var4 += var5; // L: 1528
			var7 += var5 * var8; // L: 1529
			int var17 = var6 - var5; // L: 1530
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 1531
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1537
				var9 += var23 * (var12 >> 3); // L: 1538
				var10 += (var13 >> 3) * var23; // L: 1539
				var11 += var23 * (var14 >> 3); // L: 1540
				var22 = var11 >> 12; // L: 1541
				if (var22 != 0) { // L: 1542
					var18 = var9 / var22; // L: 1543
					var19 = var10 / var22; // L: 1544
					if (var18 < 0) { // L: 1545
						var18 = 0;
					} else if (var18 > 4032) { // L: 1546
						var18 = 4032;
					}
				} else {
					var18 = 0; // L: 1549
					var19 = 0; // L: 1550
				}

				var9 += var12; // L: 1552
				var10 += var13; // L: 1553
				var11 += var14; // L: 1554
				var22 = var11 >> 12; // L: 1555
				if (var22 != 0) { // L: 1556
					var20 = var9 / var22; // L: 1557
					var21 = var10 / var22; // L: 1558
					if (var20 < 0) { // L: 1559
						var20 = 0;
					} else if (var20 > 4032) { // L: 1560
						var20 = 4032;
					}
				} else {
					var20 = 0; // L: 1563
					var21 = 0; // L: 1564
				}

				var2 = (var18 << 20) + var19; // L: 1566
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1567
				var17 >>= 3; // L: 1568
				var8 <<= 3; // L: 1569
				var15 = var7 >> 8; // L: 1570
				if (field2323) { // L: 1571
					if (var17 > 0) { // L: 1572
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1574
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1575
							var2 += var16; // L: 1576
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1577
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1578
							var2 += var16; // L: 1579
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1580
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1581
							var2 += var16; // L: 1582
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1583
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1584
							var2 += var16; // L: 1585
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1586
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1587
							var2 += var16; // L: 1588
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1589
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1590
							var2 += var16; // L: 1591
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1592
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1593
							var2 += var16; // L: 1594
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1595
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1596
							var10000 = var16 + var2; // L: 1597
							var18 = var20; // L: 1598
							var19 = var21; // L: 1599
							var9 += var12; // L: 1600
							var10 += var13; // L: 1601
							var11 += var14; // L: 1602
							var22 = var11 >> 12; // L: 1603
							if (var22 != 0) { // L: 1604
								var20 = var9 / var22; // L: 1605
								var21 = var10 / var22; // L: 1606
								if (var20 < 0) { // L: 1607
									var20 = 0;
								} else if (var20 > 4032) { // L: 1608
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1611
								var21 = 0; // L: 1612
							}

							var2 = (var18 << 20) + var19; // L: 1614
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1615
							var7 += var8; // L: 1616
							var15 = var7 >> 8; // L: 1617
							--var17; // L: 1618
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1620
					if (var17 > 0) { // L: 1621
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1623
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1624
							var2 += var16; // L: 1625
							--var17; // L: 1626
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1630
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1632
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1633
							}

							++var4; // L: 1635
							var2 += var16; // L: 1636
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1637
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1638
							}

							++var4; // L: 1640
							var2 += var16; // L: 1641
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1642
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1643
							}

							++var4; // L: 1645
							var2 += var16; // L: 1646
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1647
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1648
							}

							++var4; // L: 1650
							var2 += var16; // L: 1651
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1652
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1653
							}

							++var4; // L: 1655
							var2 += var16; // L: 1656
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1657
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1658
							}

							++var4; // L: 1660
							var2 += var16; // L: 1661
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1662
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1663
							}

							++var4; // L: 1665
							var2 += var16; // L: 1666
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1667
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1668
							}

							++var4; // L: 1670
							var10000 = var16 + var2; // L: 1671
							var18 = var20; // L: 1672
							var19 = var21; // L: 1673
							var9 += var12; // L: 1674
							var10 += var13; // L: 1675
							var11 += var14; // L: 1676
							var22 = var11 >> 12; // L: 1677
							if (var22 != 0) { // L: 1678
								var20 = var9 / var22; // L: 1679
								var21 = var10 / var22; // L: 1680
								if (var20 < 0) { // L: 1681
									var20 = 0;
								} else if (var20 > 4032) { // L: 1682
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1685
								var21 = 0; // L: 1686
							}

							var2 = (var18 << 20) + var19; // L: 1688
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1689
							var7 += var8; // L: 1690
							var15 = var7 >> 8; // L: 1691
							--var17; // L: 1692
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1694
					if (var17 > 0) { // L: 1695
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1697
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1698
							}

							++var4; // L: 1700
							var2 += var16; // L: 1701
							--var17; // L: 1702
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1712
				var9 += var23 * (var12 >> 3); // L: 1713
				var10 += (var13 >> 3) * var23; // L: 1714
				var11 += var23 * (var14 >> 3); // L: 1715
				var22 = var11 >> 14; // L: 1716
				if (var22 != 0) { // L: 1717
					var18 = var9 / var22; // L: 1718
					var19 = var10 / var22; // L: 1719
					if (var18 < 0) { // L: 1720
						var18 = 0;
					} else if (var18 > 16256) { // L: 1721
						var18 = 16256;
					}
				} else {
					var18 = 0; // L: 1724
					var19 = 0; // L: 1725
				}

				var9 += var12; // L: 1727
				var10 += var13; // L: 1728
				var11 += var14; // L: 1729
				var22 = var11 >> 14; // L: 1730
				if (var22 != 0) { // L: 1731
					var20 = var9 / var22; // L: 1732
					var21 = var10 / var22; // L: 1733
					if (var20 < 0) { // L: 1734
						var20 = 0;
					} else if (var20 > 16256) { // L: 1735
						var20 = 16256;
					}
				} else {
					var20 = 0; // L: 1738
					var21 = 0; // L: 1739
				}

				var2 = (var18 << 18) + var19; // L: 1741
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1742
				var17 >>= 3; // L: 1743
				var8 <<= 3; // L: 1744
				var15 = var7 >> 8; // L: 1745
				if (field2323) { // L: 1746
					if (var17 > 0) { // L: 1747
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1749
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1750
							var2 += var16; // L: 1751
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1752
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1753
							var2 += var16; // L: 1754
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1755
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1756
							var2 += var16; // L: 1757
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1758
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1759
							var2 += var16; // L: 1760
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1761
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1762
							var2 += var16; // L: 1763
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1764
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1765
							var2 += var16; // L: 1766
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1767
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1768
							var2 += var16; // L: 1769
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1770
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1771
							var10000 = var16 + var2; // L: 1772
							var18 = var20; // L: 1773
							var19 = var21; // L: 1774
							var9 += var12; // L: 1775
							var10 += var13; // L: 1776
							var11 += var14; // L: 1777
							var22 = var11 >> 14; // L: 1778
							if (var22 != 0) { // L: 1779
								var20 = var9 / var22; // L: 1780
								var21 = var10 / var22; // L: 1781
								if (var20 < 0) { // L: 1782
									var20 = 0;
								} else if (var20 > 16256) { // L: 1783
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1786
								var21 = 0; // L: 1787
							}

							var2 = (var18 << 18) + var19; // L: 1789
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1790
							var7 += var8; // L: 1791
							var15 = var7 >> 8; // L: 1792
							--var17; // L: 1793
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1795
					if (var17 > 0) { // L: 1796
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1798
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1799
							var2 += var16; // L: 1800
							--var17; // L: 1801
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1805
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1807
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1808
							}

							++var4; // L: 1810
							var2 += var16; // L: 1811
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1812
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1813
							}

							++var4; // L: 1815
							var2 += var16; // L: 1816
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1817
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1818
							}

							++var4; // L: 1820
							var2 += var16; // L: 1821
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1822
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1823
							}

							++var4; // L: 1825
							var2 += var16; // L: 1826
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1827
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1828
							}

							++var4; // L: 1830
							var2 += var16; // L: 1831
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1832
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1833
							}

							++var4; // L: 1835
							var2 += var16; // L: 1836
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1837
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1838
							}

							++var4; // L: 1840
							var2 += var16; // L: 1841
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1842
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1843
							}

							++var4; // L: 1845
							var10000 = var16 + var2; // L: 1846
							var18 = var20; // L: 1847
							var19 = var21; // L: 1848
							var9 += var12; // L: 1849
							var10 += var13; // L: 1850
							var11 += var14; // L: 1851
							var22 = var11 >> 14; // L: 1852
							if (var22 != 0) { // L: 1853
								var20 = var9 / var22; // L: 1854
								var21 = var10 / var22; // L: 1855
								if (var20 < 0) { // L: 1856
									var20 = 0;
								} else if (var20 > 16256) { // L: 1857
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1860
								var21 = 0; // L: 1861
							}

							var2 = (var18 << 18) + var19; // L: 1863
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1864
							var7 += var8; // L: 1865
							var15 = var7 >> 8; // L: 1866
							--var17; // L: 1867
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1869
					if (var17 > 0) { // L: 1870
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1872
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1873
							}

							++var4; // L: 1875
							var2 += var16; // L: 1876
							--var17; // L: 1877
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 1881

	@ObfuscatedName("a")
	@Export("drawTexturedTile")
	static final void drawTexturedTile(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1884
		int var20;
		if (var19 == null) { // L: 1885
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1886
			method4003(var0, var1, var2, var3, var4, var5, method4014(var20, var6), method4014(var20, var7), method4014(var20, var8)); // L: 1887
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1890
			field2323 = Rasterizer3D_textureLoader.vmethod4505(var18); // L: 1891
			var20 = var4 - var3; // L: 1892
			int var21 = var1 - var0; // L: 1893
			int var22 = var5 - var3; // L: 1894
			int var23 = var2 - var0; // L: 1895
			int var24 = var7 - var6; // L: 1896
			int var25 = var8 - var6; // L: 1897
			int var26 = 0; // L: 1898
			if (var0 != var1) { // L: 1899
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1900
			if (var2 != var1) { // L: 1901
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1902
			if (var0 != var2) { // L: 1903
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1904
			if (var29 != 0) { // L: 1905
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1906
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1907
				var10 = var9 - var10; // L: 1908
				var13 = var12 - var13; // L: 1909
				var16 = var15 - var16; // L: 1910
				var11 -= var9; // L: 1911
				var14 -= var12; // L: 1912
				var17 -= var15; // L: 1913
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1914
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1915
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1916
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1917
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1918
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1919
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1920
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)Rasterizer3D_zoom); // L: 1921
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1922
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1923
					if (var0 < Rasterizer3D_clipHeight) { // L: 1924
						if (var1 > Rasterizer3D_clipHeight) { // L: 1925
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1926
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1927
						if (var1 < var2) { // L: 1928
							var5 = var3 <<= 14; // L: 1929
							if (var0 < 0) { // L: 1930
								var5 -= var0 * var28; // L: 1931
								var3 -= var0 * var26; // L: 1932
								var6 -= var0 * var31; // L: 1933
								var0 = 0; // L: 1934
							}

							var4 <<= 14; // L: 1936
							if (var1 < 0) { // L: 1937
								var4 -= var27 * var1; // L: 1938
								var1 = 0; // L: 1939
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1941
							var32 += var34 * var41; // L: 1942
							var35 += var37 * var41; // L: 1943
							var38 += var40 * var41; // L: 1944
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) { // L: 1945
								var2 -= var1; // L: 1946
								var1 -= var0; // L: 1947
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1948

								while (true) {
									--var1; // L: 1949
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1959
											if (var2 < 0) {
												return; // L: 1969
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1960
											var5 += var28; // L: 1961
											var4 += var27; // L: 1962
											var6 += var31; // L: 1963
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1964
											var32 += var34; // L: 1965
											var35 += var37; // L: 1966
											var38 += var40; // L: 1967
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1950
									var5 += var28; // L: 1951
									var3 += var26; // L: 1952
									var6 += var31; // L: 1953
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1954
									var32 += var34; // L: 1955
									var35 += var37; // L: 1956
									var38 += var40; // L: 1957
								}
							} else {
								var2 -= var1; // L: 1972
								var1 -= var0; // L: 1973
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1974

								while (true) {
									--var1; // L: 1975
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1985
											if (var2 < 0) {
												return; // L: 1995
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1986
											var5 += var28; // L: 1987
											var4 += var27; // L: 1988
											var6 += var31; // L: 1989
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1990
											var32 += var34; // L: 1991
											var35 += var37; // L: 1992
											var38 += var40; // L: 1993
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1976
									var5 += var28; // L: 1977
									var3 += var26; // L: 1978
									var6 += var31; // L: 1979
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1980
									var32 += var34; // L: 1981
									var35 += var37; // L: 1982
									var38 += var40; // L: 1983
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1999
							if (var0 < 0) { // L: 2000
								var4 -= var0 * var28; // L: 2001
								var3 -= var0 * var26; // L: 2002
								var6 -= var0 * var31; // L: 2003
								var0 = 0; // L: 2004
							}

							var5 <<= 14; // L: 2006
							if (var2 < 0) { // L: 2007
								var5 -= var27 * var2; // L: 2008
								var2 = 0; // L: 2009
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 2011
							var32 += var34 * var41; // L: 2012
							var35 += var37 * var41; // L: 2013
							var38 += var40 * var41; // L: 2014
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 2015
								var1 -= var2; // L: 2042
								var2 -= var0; // L: 2043
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 2044

								while (true) {
									--var2; // L: 2045
									if (var2 < 0) {
										while (true) {
											--var1; // L: 2055
											if (var1 < 0) {
												return; // L: 2065
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2056
											var5 += var27; // L: 2057
											var3 += var26; // L: 2058
											var6 += var31; // L: 2059
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 2060
											var32 += var34; // L: 2061
											var35 += var37; // L: 2062
											var38 += var40; // L: 2063
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2046
									var4 += var28; // L: 2047
									var3 += var26; // L: 2048
									var6 += var31; // L: 2049
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 2050
									var32 += var34; // L: 2051
									var35 += var37; // L: 2052
									var38 += var40; // L: 2053
								}
							} else {
								var1 -= var2; // L: 2016
								var2 -= var0; // L: 2017
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 2018

								while (true) {
									--var2; // L: 2019
									if (var2 < 0) {
										while (true) {
											--var1; // L: 2029
											if (var1 < 0) {
												return; // L: 2039
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2030
											var5 += var27; // L: 2031
											var3 += var26; // L: 2032
											var6 += var31; // L: 2033
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 2034
											var32 += var34; // L: 2035
											var35 += var37; // L: 2036
											var38 += var40; // L: 2037
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2020
									var4 += var28; // L: 2021
									var3 += var26; // L: 2022
									var6 += var31; // L: 2023
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 2024
									var32 += var34; // L: 2025
									var35 += var37; // L: 2026
									var38 += var40; // L: 2027
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 2069
					if (var1 < Rasterizer3D_clipHeight) { // L: 2070
						if (var2 > Rasterizer3D_clipHeight) { // L: 2071
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 2072
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 2073
						if (var2 < var0) { // L: 2074
							var3 = var4 <<= 14; // L: 2075
							if (var1 < 0) { // L: 2076
								var3 -= var26 * var1; // L: 2077
								var4 -= var27 * var1; // L: 2078
								var7 -= var31 * var1; // L: 2079
								var1 = 0; // L: 2080
							}

							var5 <<= 14; // L: 2082
							if (var2 < 0) { // L: 2083
								var5 -= var28 * var2; // L: 2084
								var2 = 0; // L: 2085
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2087
							var32 += var34 * var41; // L: 2088
							var35 += var37 * var41; // L: 2089
							var38 += var40 * var41; // L: 2090
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 2091
								var0 -= var2; // L: 2092
								var2 -= var1; // L: 2093
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2094

								while (true) {
									--var2; // L: 2095
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2105
											if (var0 < 0) {
												return; // L: 2115
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2106
											var3 += var26; // L: 2107
											var5 += var28; // L: 2108
											var7 += var31; // L: 2109
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2110
											var32 += var34; // L: 2111
											var35 += var37; // L: 2112
											var38 += var40; // L: 2113
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2096
									var3 += var26; // L: 2097
									var4 += var27; // L: 2098
									var7 += var31; // L: 2099
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2100
									var32 += var34; // L: 2101
									var35 += var37; // L: 2102
									var38 += var40; // L: 2103
								}
							} else {
								var0 -= var2; // L: 2118
								var2 -= var1; // L: 2119
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2120

								while (true) {
									--var2; // L: 2121
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2131
											if (var0 < 0) {
												return; // L: 2141
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2132
											var3 += var26; // L: 2133
											var5 += var28; // L: 2134
											var7 += var31; // L: 2135
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2136
											var32 += var34; // L: 2137
											var35 += var37; // L: 2138
											var38 += var40; // L: 2139
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2122
									var3 += var26; // L: 2123
									var4 += var27; // L: 2124
									var7 += var31; // L: 2125
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2126
									var32 += var34; // L: 2127
									var35 += var37; // L: 2128
									var38 += var40; // L: 2129
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2145
							if (var1 < 0) { // L: 2146
								var5 -= var26 * var1; // L: 2147
								var4 -= var27 * var1; // L: 2148
								var7 -= var31 * var1; // L: 2149
								var1 = 0; // L: 2150
							}

							var3 <<= 14; // L: 2152
							if (var0 < 0) { // L: 2153
								var3 -= var0 * var28; // L: 2154
								var0 = 0; // L: 2155
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2157
							var32 += var34 * var41; // L: 2158
							var35 += var37 * var41; // L: 2159
							var38 += var40 * var41; // L: 2160
							if (var26 < var27) { // L: 2161
								var2 -= var0; // L: 2162
								var0 -= var1; // L: 2163
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2164

								while (true) {
									--var0; // L: 2165
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2175
											if (var2 < 0) {
												return; // L: 2185
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2176
											var3 += var28; // L: 2177
											var4 += var27; // L: 2178
											var7 += var31; // L: 2179
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2180
											var32 += var34; // L: 2181
											var35 += var37; // L: 2182
											var38 += var40; // L: 2183
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2166
									var5 += var26; // L: 2167
									var4 += var27; // L: 2168
									var7 += var31; // L: 2169
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2170
									var32 += var34; // L: 2171
									var35 += var37; // L: 2172
									var38 += var40; // L: 2173
								}
							} else {
								var2 -= var0; // L: 2188
								var0 -= var1; // L: 2189
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2190

								while (true) {
									--var0; // L: 2191
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2201
											if (var2 < 0) {
												return; // L: 2211
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2202
											var3 += var28; // L: 2203
											var4 += var27; // L: 2204
											var7 += var31; // L: 2205
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2206
											var32 += var34; // L: 2207
											var35 += var37; // L: 2208
											var38 += var40; // L: 2209
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2192
									var5 += var26; // L: 2193
									var4 += var27; // L: 2194
									var7 += var31; // L: 2195
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2196
									var32 += var34; // L: 2197
									var35 += var37; // L: 2198
									var38 += var40; // L: 2199
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 2216
					if (var0 > Rasterizer3D_clipHeight) { // L: 2217
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 2218
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 2219
					if (var0 < var1) { // L: 2220
						var4 = var5 <<= 14; // L: 2221
						if (var2 < 0) { // L: 2222
							var4 -= var27 * var2; // L: 2223
							var5 -= var28 * var2; // L: 2224
							var8 -= var31 * var2; // L: 2225
							var2 = 0; // L: 2226
						}

						var3 <<= 14; // L: 2228
						if (var0 < 0) { // L: 2229
							var3 -= var0 * var26; // L: 2230
							var0 = 0; // L: 2231
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2233
						var32 += var34 * var41; // L: 2234
						var35 += var37 * var41; // L: 2235
						var38 += var40 * var41; // L: 2236
						if (var27 < var28) { // L: 2237
							var1 -= var0; // L: 2238
							var0 -= var2; // L: 2239
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2240

							while (true) {
								--var0; // L: 2241
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2251
										if (var1 < 0) {
											return; // L: 2261
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2252
										var4 += var27; // L: 2253
										var3 += var26; // L: 2254
										var8 += var31; // L: 2255
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2256
										var32 += var34; // L: 2257
										var35 += var37; // L: 2258
										var38 += var40; // L: 2259
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2242
								var4 += var27; // L: 2243
								var5 += var28; // L: 2244
								var8 += var31; // L: 2245
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2246
								var32 += var34; // L: 2247
								var35 += var37; // L: 2248
								var38 += var40; // L: 2249
							}
						} else {
							var1 -= var0; // L: 2264
							var0 -= var2; // L: 2265
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2266

							while (true) {
								--var0; // L: 2267
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2277
										if (var1 < 0) {
											return; // L: 2287
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2278
										var4 += var27; // L: 2279
										var3 += var26; // L: 2280
										var8 += var31; // L: 2281
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2282
										var32 += var34; // L: 2283
										var35 += var37; // L: 2284
										var38 += var40; // L: 2285
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2268
								var4 += var27; // L: 2269
								var5 += var28; // L: 2270
								var8 += var31; // L: 2271
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2272
								var32 += var34; // L: 2273
								var35 += var37; // L: 2274
								var38 += var40; // L: 2275
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 2291
						if (var2 < 0) { // L: 2292
							var3 -= var27 * var2; // L: 2293
							var5 -= var28 * var2; // L: 2294
							var8 -= var31 * var2; // L: 2295
							var2 = 0; // L: 2296
						}

						var4 <<= 14; // L: 2298
						if (var1 < 0) { // L: 2299
							var4 -= var26 * var1; // L: 2300
							var1 = 0; // L: 2301
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2303
						var32 += var34 * var41; // L: 2304
						var35 += var37 * var41; // L: 2305
						var38 += var40 * var41; // L: 2306
						if (var27 < var28) { // L: 2307
							var0 -= var1; // L: 2308
							var1 -= var2; // L: 2309
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2310

							while (true) {
								--var1; // L: 2311
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2321
										if (var0 < 0) {
											return; // L: 2331
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2322
										var4 += var26; // L: 2323
										var5 += var28; // L: 2324
										var8 += var31; // L: 2325
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2326
										var32 += var34; // L: 2327
										var35 += var37; // L: 2328
										var38 += var40; // L: 2329
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2312
								var3 += var27; // L: 2313
								var5 += var28; // L: 2314
								var8 += var31; // L: 2315
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2316
								var32 += var34; // L: 2317
								var35 += var37; // L: 2318
								var38 += var40; // L: 2319
							}
						} else {
							var0 -= var1; // L: 2334
							var1 -= var2; // L: 2335
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2336

							while (true) {
								--var1; // L: 2337
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2347
										if (var0 < 0) {
											return; // L: 2357
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2348
										var4 += var26; // L: 2349
										var5 += var28; // L: 2350
										var8 += var31; // L: 2351
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2352
										var32 += var34; // L: 2353
										var35 += var37; // L: 2354
										var38 += var40; // L: 2355
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2338
								var3 += var27; // L: 2339
								var5 += var28; // L: 2340
								var8 += var31; // L: 2341
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2342
								var32 += var34; // L: 2343
								var35 += var37; // L: 2344
								var38 += var40; // L: 2345
							}
						}
					}
				}
			}
		}
	} // L: 1888

	@ObfuscatedName("m")
	@Export("Rasterizer3D_textureAlpha")
	static final void Rasterizer3D_textureAlpha(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2334) { // L: 2366
			if (var6 > Rasterizer3D_clipWidth) { // L: 2367
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 2368
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 2370
			var4 += var5; // L: 2371
			var7 += var5 * var8; // L: 2372
			int var17 = var6 - var5; // L: 2373
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 2374
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2381
				var9 += var23 * var12; // L: 2382
				var10 += var13 * var23; // L: 2383
				var11 += var23 * var14; // L: 2384
				var22 = var11 >> 12; // L: 2385
				if (var22 != 0) { // L: 2386
					var18 = var9 / var22; // L: 2387
					var19 = var10 / var22; // L: 2388
				} else {
					var18 = 0; // L: 2391
					var19 = 0; // L: 2392
				}

				var9 += var17 * var12; // L: 2394
				var10 += var13 * var17; // L: 2395
				var11 += var17 * var14; // L: 2396
				var22 = var11 >> 12; // L: 2397
				if (var22 != 0) { // L: 2398
					var20 = var9 / var22; // L: 2399
					var21 = var10 / var22; // L: 2400
				} else {
					var20 = 0; // L: 2403
					var21 = 0; // L: 2404
				}

				var2 = (var18 << 20) + var19; // L: 2406
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 20); // L: 2407
				var17 >>= 3; // L: 2408
				var8 <<= 3; // L: 2409
				var15 = var7 >> 8; // L: 2410
				if (field2323) { // L: 2412
					if (var17 > 0) { // L: 2413
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2415
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2416
							var2 += var16; // L: 2417
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2418
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2419
							var2 += var16; // L: 2420
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2421
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2422
							var2 += var16; // L: 2423
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2424
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2425
							var2 += var16; // L: 2426
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2427
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2428
							var2 += var16; // L: 2429
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2430
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2431
							var2 += var16; // L: 2432
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2433
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2434
							var2 += var16; // L: 2435
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2436
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2437
							var2 += var16; // L: 2438
							var7 += var8; // L: 2439
							var15 = var7 >> 8; // L: 2440
							--var17; // L: 2441
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2443
					if (var17 > 0) { // L: 2444
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2446
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2447
							var2 += var16; // L: 2448
							--var17; // L: 2449
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2453
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2455
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2456
							}

							++var4; // L: 2458
							var2 += var16; // L: 2459
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2460
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2461
							}

							++var4; // L: 2463
							var2 += var16; // L: 2464
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2465
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2466
							}

							++var4; // L: 2468
							var2 += var16; // L: 2469
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2470
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2471
							}

							++var4; // L: 2473
							var2 += var16; // L: 2474
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2475
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2476
							}

							++var4; // L: 2478
							var2 += var16; // L: 2479
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2480
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2481
							}

							++var4; // L: 2483
							var2 += var16; // L: 2484
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2485
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2486
							}

							++var4; // L: 2488
							var2 += var16; // L: 2489
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2490
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2491
							}

							++var4; // L: 2493
							var2 += var16; // L: 2494
							var7 += var8; // L: 2495
							var15 = var7 >> 8; // L: 2496
							--var17; // L: 2497
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2499
					if (var17 > 0) { // L: 2500
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2502
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2503
							}

							++var4; // L: 2505
							var2 += var16; // L: 2506
							--var17; // L: 2507
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2518
				var9 += var23 * var12; // L: 2519
				var10 += var13 * var23; // L: 2520
				var11 += var23 * var14; // L: 2521
				var22 = var11 >> 14; // L: 2522
				if (var22 != 0) { // L: 2523
					var18 = var9 / var22; // L: 2524
					var19 = var10 / var22; // L: 2525
				} else {
					var18 = 0; // L: 2528
					var19 = 0; // L: 2529
				}

				var9 += var17 * var12; // L: 2531
				var10 += var13 * var17; // L: 2532
				var11 += var17 * var14; // L: 2533
				var22 = var11 >> 14; // L: 2534
				if (var22 != 0) { // L: 2535
					var20 = var9 / var22; // L: 2536
					var21 = var10 / var22; // L: 2537
				} else {
					var20 = 0; // L: 2540
					var21 = 0; // L: 2541
				}

				var2 = (var18 << 18) + var19; // L: 2543
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 18); // L: 2544
				var17 >>= 3; // L: 2545
				var8 <<= 3; // L: 2546
				var15 = var7 >> 8; // L: 2547
				if (field2323) { // L: 2549
					if (var17 > 0) { // L: 2550
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2552
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2553
							var2 += var16; // L: 2554
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2555
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2556
							var2 += var16; // L: 2557
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2558
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2559
							var2 += var16; // L: 2560
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2561
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2562
							var2 += var16; // L: 2563
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2564
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2565
							var2 += var16; // L: 2566
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2567
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2568
							var2 += var16; // L: 2569
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2570
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2571
							var2 += var16; // L: 2572
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2573
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2574
							var2 += var16; // L: 2575
							var7 += var8; // L: 2576
							var15 = var7 >> 8; // L: 2577
							--var17; // L: 2578
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2580
					if (var17 > 0) { // L: 2581
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2583
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2584
							var2 += var16; // L: 2585
							--var17; // L: 2586
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2590
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2592
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2593
							}

							++var4; // L: 2595
							var2 += var16; // L: 2596
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2597
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2598
							}

							++var4; // L: 2600
							var2 += var16; // L: 2601
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2602
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2603
							}

							++var4; // L: 2605
							var2 += var16; // L: 2606
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2607
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2608
							}

							++var4; // L: 2610
							var2 += var16; // L: 2611
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2612
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2613
							}

							++var4; // L: 2615
							var2 += var16; // L: 2616
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2617
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2618
							}

							++var4; // L: 2620
							var2 += var16; // L: 2621
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2622
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2623
							}

							++var4; // L: 2625
							var2 += var16; // L: 2626
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2627
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2628
							}

							++var4; // L: 2630
							var2 += var16; // L: 2631
							var7 += var8; // L: 2632
							var15 = var7 >> 8; // L: 2633
							--var17; // L: 2634
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2636
					if (var17 > 0) { // L: 2637
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2639
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2640
							}

							++var4; // L: 2642
							var2 += var16; // L: 2643
							--var17; // L: 2644
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 2648

	@ObfuscatedName("q")
	static final int method4014(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 2651
		if (var1 < 2) { // L: 2652
			var1 = 2;
		} else if (var1 > 126) { // L: 2653
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 2654
	}

	@ObfuscatedName("y")
	static final int method4080(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2658
	}

	@ObfuscatedName("z")
	static final int method3993(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2662
	}

	@ObfuscatedName("e")
	static final int method4017(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 2666
	}

	@ObfuscatedName("t")
	static final int method4018(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 2670
	}

	@ObfuscatedName("i")
	static final int method4019(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2674
	}

	@ObfuscatedName("ac")
	static final int method4020(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2678
	}
}
