import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("Rasterizer3D")
public class Rasterizer3D extends Rasterizer2D {
	@ObfuscatedName("f")
	static boolean field1899;
	@ObfuscatedName("o")
	static boolean field1921;
	@ObfuscatedName("u")
	@Export("Rasterizer3D_isLowDetailTexture")
	static boolean Rasterizer3D_isLowDetailTexture;
	@ObfuscatedName("p")
	public static boolean field1903;
	@ObfuscatedName("b")
	@Export("Rasterizer3D_alpha")
	static int Rasterizer3D_alpha;
	@ObfuscatedName("m")
	@Export("Rasterizer3D_zoom")
	public static int Rasterizer3D_zoom;
	@ObfuscatedName("d")
	@Export("Rasterizer3D_clipMidX")
	static int Rasterizer3D_clipMidX;
	@ObfuscatedName("c")
	@Export("Rasterizer3D_clipMidY")
	static int Rasterizer3D_clipMidY;
	@ObfuscatedName("j")
	@Export("Rasterizer3D_clipWidth")
	static int Rasterizer3D_clipWidth;
	@ObfuscatedName("r")
	@Export("Rasterizer3D_clipHeight")
	static int Rasterizer3D_clipHeight;
	@ObfuscatedName("q")
	@Export("Rasterizer3D_clipNegativeMidX")
	static int Rasterizer3D_clipNegativeMidX;
	@ObfuscatedName("t")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2;
	@ObfuscatedName("v")
	@Export("Rasterizer3D_clipNegativeMidY")
	static int Rasterizer3D_clipNegativeMidY;
	@ObfuscatedName("x")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2;
	@ObfuscatedName("z")
	@Export("Rasterizer3D_rowOffsets")
	static int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("i")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("Rasterizer3D_textureLoader")
	public static TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("w")
	static int[] field1919;
	@ObfuscatedName("s")
	static int[] field1922;
	@ObfuscatedName("y")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;

	static {
		field1899 = false; // L: 8
		field1921 = false; // L: 9
		Rasterizer3D_isLowDetailTexture = false; // L: 10
		field1903 = true; // L: 11
		Rasterizer3D_alpha = 0; // L: 12
		Rasterizer3D_zoom = 512; // L: 19
		Rasterizer3D_rowOffsets = new int[1024]; // L: 28
		Rasterizer3D_colorPalette = new int[65536]; // L: 29
		field1919 = new int[512]; // L: 31
		field1922 = new int[2048]; // L: 32
		Rasterizer3D_sine = new int[2048]; // L: 33
		Rasterizer3D_cosine = new int[2048]; // L: 34

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 37
			field1919[var0] = 32768 / var0; // L: 38
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 40
			field1922[var0] = 65536 / var0; // L: 41
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 43
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D)); // L: 44
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D)); // L: 45
		}

	} // L: 47

	@ObfuscatedName("f")
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
		int var4;
		int var5;
		if (Rasterizer3D_rowOffsets.length < Rasterizer3D_clipHeight) { // L: 61
			var5 = Rasterizer3D_clipHeight; // L: 63
			--var5; // L: 65
			var5 |= var5 >>> 1; // L: 66
			var5 |= var5 >>> 2; // L: 67
			var5 |= var5 >>> 4; // L: 68
			var5 |= var5 >>> 8; // L: 69
			var5 |= var5 >>> 16; // L: 70
			var4 = var5 + 1; // L: 71
			Rasterizer3D_rowOffsets = new int[var4]; // L: 73
		}

		var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1; // L: 75

		for (var5 = 0; var5 < Rasterizer3D_clipHeight; ++var5) { // L: 76
			Rasterizer3D_rowOffsets[var5] = var4; // L: 77
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 78
		}

	} // L: 80

	@ObfuscatedName("u")
	@Export("Rasterizer3D_method3")
	public static final void Rasterizer3D_method3() {
		Rasterizer3D_clipMidX = Rasterizer3D_clipWidth / 2; // L: 83
		Rasterizer3D_clipMidY = Rasterizer3D_clipHeight / 2; // L: 84
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 85
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 86
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 87
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 88
	} // L: 89

	@ObfuscatedName("p")
	public static final void method3411(int var0, int var1) {
		int var2 = Rasterizer3D_rowOffsets[0]; // L: 92
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width; // L: 93
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width; // L: 94
		Rasterizer3D_clipMidX = var0 - var4; // L: 95
		Rasterizer3D_clipMidY = var1 - var3; // L: 96
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 97
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 98
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 99
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 100
	} // L: 101

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)V"
	)
	@Export("Rasterizer3D_setTextureLoader")
	public static final void Rasterizer3D_setTextureLoader(TextureLoader var0) {
		Rasterizer3D_textureLoader = var0; // L: 104
	} // L: 105

	@ObfuscatedName("e")
	@Export("Rasterizer3D_setBrightness")
	public static final void Rasterizer3D_setBrightness(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 108
	} // L: 109

	@ObfuscatedName("k")
	@Export("Rasterizer3D_buildPalette")
	static final void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128; // L: 112

		for (int var5 = var2; var5 < var3; ++var5) { // L: 113
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D; // L: 114
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D; // L: 115

			for (int var10 = 0; var10 < 128; ++var10) { // L: 116
				double var11 = (double)var10 / 128.0D; // L: 117
				double var13 = var11; // L: 118
				double var15 = var11; // L: 119
				double var17 = var11; // L: 120
				if (var8 != 0.0D) { // L: 121
					double var19;
					if (var11 < 0.5D) { // L: 123
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8; // L: 124
					}

					double var21 = 2.0D * var11 - var19; // L: 125
					double var23 = var6 + 0.3333333333333333D; // L: 126
					if (var23 > 1.0D) { // L: 127
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D; // L: 129
					if (var27 < 0.0D) { // L: 130
						++var27;
					}

					if (6.0D * var23 < 1.0D) { // L: 131
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 132
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) { // L: 133
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21; // L: 134
					}

					if (6.0D * var6 < 1.0D) { // L: 135
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) { // L: 136
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) { // L: 137
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21; // L: 138
					}

					if (6.0D * var27 < 1.0D) { // L: 139
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) { // L: 140
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) { // L: 141
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21; // L: 142
					}
				}

				int var29 = (int)(var13 * 256.0D); // L: 144
				int var20 = (int)(var15 * 256.0D); // L: 145
				int var30 = (int)(var17 * 256.0D); // L: 146
				int var22 = var30 + (var20 << 8) + (var29 << 16); // L: 147
				var22 = Rasterizer3D_brighten(var22, var0); // L: 148
				if (var22 == 0) { // L: 149
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22; // L: 150
			}
		}

	} // L: 153

	@ObfuscatedName("g")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D; // L: 156
		double var5 = (double)(var0 >> 8 & 255) / 256.0D; // L: 157
		double var7 = (double)(var0 & 255) / 256.0D; // L: 158
		var3 = Math.pow(var3, var1); // L: 159
		var5 = Math.pow(var5, var1); // L: 160
		var7 = Math.pow(var7, var1); // L: 161
		int var9 = (int)(var3 * 256.0D); // L: 162
		int var10 = (int)(var5 * 256.0D); // L: 163
		int var11 = (int)(var7 * 256.0D); // L: 164
		return var11 + (var10 << 8) + (var9 << 16); // L: 165
	}

	@ObfuscatedName("h")
	public static void method3389(int var0, int var1, int var2) {
		field1899 = var0 < 0 || var0 > Rasterizer3D_clipWidth || var1 < 0 || var1 > Rasterizer3D_clipWidth || var2 < 0 || var2 > Rasterizer3D_clipWidth; // L: 169
	} // L: 170

	@ObfuscatedName("n")
	static final void method3383(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3; // L: 173
		int var10 = var1 - var0; // L: 174
		int var11 = var5 - var3; // L: 175
		int var12 = var2 - var0; // L: 176
		int var13 = var7 - var6; // L: 177
		int var14 = var8 - var6; // L: 178
		int var15;
		if (var2 != var1) { // L: 180
			var15 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var15 = 0; // L: 181
		}

		int var16;
		if (var0 != var1) { // L: 183
			var16 = (var9 << 14) / var10;
		} else {
			var16 = 0; // L: 184
		}

		int var17;
		if (var0 != var2) { // L: 186
			var17 = (var11 << 14) / var12;
		} else {
			var17 = 0; // L: 187
		}

		int var18 = var9 * var12 - var11 * var10; // L: 188
		if (var18 != 0) { // L: 189
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18; // L: 190
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18; // L: 191
			if (var0 <= var1 && var0 <= var2) { // L: 192
				if (var0 < Rasterizer3D_clipHeight) { // L: 193
					if (var1 > Rasterizer3D_clipHeight) { // L: 194
						var1 = Rasterizer3D_clipHeight;
					}

					if (var2 > Rasterizer3D_clipHeight) { // L: 195
						var2 = Rasterizer3D_clipHeight;
					}

					var6 = var19 + ((var6 << 8) - var3 * var19); // L: 196
					if (var1 < var2) { // L: 197
						var5 = var3 <<= 14; // L: 198
						if (var0 < 0) { // L: 199
							var5 -= var0 * var17; // L: 200
							var3 -= var0 * var16; // L: 201
							var6 -= var0 * var20; // L: 202
							var0 = 0; // L: 203
						}

						var4 <<= 14; // L: 205
						if (var1 < 0) { // L: 206
							var4 -= var15 * var1; // L: 207
							var1 = 0; // L: 208
						}

						if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) { // L: 210
							var2 -= var1; // L: 231
							var1 -= var0; // L: 232
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 233

							while (true) {
								--var1; // L: 234
								if (var1 < 0) {
									while (true) {
										--var2; // L: 241
										if (var2 < 0) {
											return; // L: 248
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19); // L: 242
										var5 += var17; // L: 243
										var4 += var15; // L: 244
										var6 += var20; // L: 245
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 246
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 235
								var5 += var17; // L: 236
								var3 += var16; // L: 237
								var6 += var20; // L: 238
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 239
							}
						} else {
							var2 -= var1; // L: 211
							var1 -= var0; // L: 212
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 213

							while (true) {
								--var1; // L: 214
								if (var1 < 0) {
									while (true) {
										--var2; // L: 221
										if (var2 < 0) {
											return; // L: 228
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19); // L: 222
										var5 += var17; // L: 223
										var4 += var15; // L: 224
										var6 += var20; // L: 225
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 226
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 215
								var5 += var17; // L: 216
								var3 += var16; // L: 217
								var6 += var20; // L: 218
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 219
							}
						}
					} else {
						var4 = var3 <<= 14; // L: 252
						if (var0 < 0) { // L: 253
							var4 -= var0 * var17; // L: 254
							var3 -= var0 * var16; // L: 255
							var6 -= var0 * var20; // L: 256
							var0 = 0; // L: 257
						}

						var5 <<= 14; // L: 259
						if (var2 < 0) { // L: 260
							var5 -= var15 * var2; // L: 261
							var2 = 0; // L: 262
						}

						if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) { // L: 264
							var1 -= var2; // L: 265
							var2 -= var0; // L: 266
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 267

							while (true) {
								--var2; // L: 268
								if (var2 < 0) {
									while (true) {
										--var1; // L: 275
										if (var1 < 0) {
											return; // L: 282
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 276
										var5 += var15; // L: 277
										var3 += var16; // L: 278
										var6 += var20; // L: 279
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 280
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19); // L: 269
								var4 += var17; // L: 270
								var3 += var16; // L: 271
								var6 += var20; // L: 272
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 273
							}
						} else {
							var1 -= var2; // L: 285
							var2 -= var0; // L: 286
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 287

							while (true) {
								--var2; // L: 288
								if (var2 < 0) {
									while (true) {
										--var1; // L: 295
										if (var1 < 0) {
											return; // L: 302
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 296
										var5 += var15; // L: 297
										var3 += var16; // L: 298
										var6 += var20; // L: 299
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 300
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19); // L: 289
								var4 += var17; // L: 290
								var3 += var16; // L: 291
								var6 += var20; // L: 292
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 293
							}
						}
					}
				}
			} else if (var1 <= var2) { // L: 306
				if (var1 < Rasterizer3D_clipHeight) { // L: 307
					if (var2 > Rasterizer3D_clipHeight) { // L: 308
						var2 = Rasterizer3D_clipHeight;
					}

					if (var0 > Rasterizer3D_clipHeight) { // L: 309
						var0 = Rasterizer3D_clipHeight;
					}

					var7 = var19 + ((var7 << 8) - var19 * var4); // L: 310
					if (var2 < var0) { // L: 311
						var3 = var4 <<= 14; // L: 312
						if (var1 < 0) { // L: 313
							var3 -= var16 * var1; // L: 314
							var4 -= var15 * var1; // L: 315
							var7 -= var20 * var1; // L: 316
							var1 = 0; // L: 317
						}

						var5 <<= 14; // L: 319
						if (var2 < 0) { // L: 320
							var5 -= var17 * var2; // L: 321
							var2 = 0; // L: 322
						}

						if ((var2 == var1 || var16 >= var15) && (var2 != var1 || var16 <= var17)) { // L: 324
							var0 -= var2; // L: 345
							var2 -= var1; // L: 346
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 347

							while (true) {
								--var2; // L: 348
								if (var2 < 0) {
									while (true) {
										--var0; // L: 355
										if (var0 < 0) {
											return; // L: 362
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19); // L: 356
										var3 += var16; // L: 357
										var5 += var17; // L: 358
										var7 += var20; // L: 359
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 360
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 349
								var3 += var16; // L: 350
								var4 += var15; // L: 351
								var7 += var20; // L: 352
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 353
							}
						} else {
							var0 -= var2; // L: 325
							var2 -= var1; // L: 326
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 327

							while (true) {
								--var2; // L: 328
								if (var2 < 0) {
									while (true) {
										--var0; // L: 335
										if (var0 < 0) {
											return; // L: 342
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19); // L: 336
										var3 += var16; // L: 337
										var5 += var17; // L: 338
										var7 += var20; // L: 339
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 340
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 329
								var3 += var16; // L: 330
								var4 += var15; // L: 331
								var7 += var20; // L: 332
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 333
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 366
						if (var1 < 0) { // L: 367
							var5 -= var16 * var1; // L: 368
							var4 -= var15 * var1; // L: 369
							var7 -= var20 * var1; // L: 370
							var1 = 0; // L: 371
						}

						var3 <<= 14; // L: 373
						if (var0 < 0) { // L: 374
							var3 -= var0 * var17; // L: 375
							var0 = 0; // L: 376
						}

						if (var16 < var15) { // L: 378
							var2 -= var0; // L: 379
							var0 -= var1; // L: 380
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 381

							while (true) {
								--var0; // L: 382
								if (var0 < 0) {
									while (true) {
										--var2; // L: 389
										if (var2 < 0) {
											return; // L: 396
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 390
										var3 += var17; // L: 391
										var4 += var15; // L: 392
										var7 += var20; // L: 393
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 394
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19); // L: 383
								var5 += var16; // L: 384
								var4 += var15; // L: 385
								var7 += var20; // L: 386
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 387
							}
						} else {
							var2 -= var0; // L: 399
							var0 -= var1; // L: 400
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 401

							while (true) {
								--var0; // L: 402
								if (var0 < 0) {
									while (true) {
										--var2; // L: 409
										if (var2 < 0) {
											return; // L: 416
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 410
										var3 += var17; // L: 411
										var4 += var15; // L: 412
										var7 += var20; // L: 413
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 414
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19); // L: 403
								var5 += var16; // L: 404
								var4 += var15; // L: 405
								var7 += var20; // L: 406
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 407
							}
						}
					}
				}
			} else if (var2 < Rasterizer3D_clipHeight) { // L: 421
				if (var0 > Rasterizer3D_clipHeight) { // L: 422
					var0 = Rasterizer3D_clipHeight;
				}

				if (var1 > Rasterizer3D_clipHeight) { // L: 423
					var1 = Rasterizer3D_clipHeight;
				}

				var8 = var19 + ((var8 << 8) - var5 * var19); // L: 424
				if (var0 < var1) { // L: 425
					var4 = var5 <<= 14; // L: 426
					if (var2 < 0) { // L: 427
						var4 -= var15 * var2; // L: 428
						var5 -= var17 * var2; // L: 429
						var8 -= var20 * var2; // L: 430
						var2 = 0; // L: 431
					}

					var3 <<= 14; // L: 433
					if (var0 < 0) { // L: 434
						var3 -= var0 * var16; // L: 435
						var0 = 0; // L: 436
					}

					if (var15 < var17) { // L: 438
						var1 -= var0; // L: 439
						var0 -= var2; // L: 440
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 441

						while (true) {
							--var0; // L: 442
							if (var0 < 0) {
								while (true) {
									--var1; // L: 449
									if (var1 < 0) {
										return; // L: 456
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19); // L: 450
									var4 += var15; // L: 451
									var3 += var16; // L: 452
									var8 += var20; // L: 453
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 454
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 443
							var4 += var15; // L: 444
							var5 += var17; // L: 445
							var8 += var20; // L: 446
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 447
						}
					} else {
						var1 -= var0; // L: 459
						var0 -= var2; // L: 460
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 461

						while (true) {
							--var0; // L: 462
							if (var0 < 0) {
								while (true) {
									--var1; // L: 469
									if (var1 < 0) {
										return; // L: 476
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19); // L: 470
									var4 += var15; // L: 471
									var3 += var16; // L: 472
									var8 += var20; // L: 473
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 474
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 463
							var4 += var15; // L: 464
							var5 += var17; // L: 465
							var8 += var20; // L: 466
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 467
						}
					}
				} else {
					var3 = var5 <<= 14; // L: 480
					if (var2 < 0) { // L: 481
						var3 -= var15 * var2; // L: 482
						var5 -= var17 * var2; // L: 483
						var8 -= var20 * var2; // L: 484
						var2 = 0; // L: 485
					}

					var4 <<= 14; // L: 487
					if (var1 < 0) { // L: 488
						var4 -= var16 * var1; // L: 489
						var1 = 0; // L: 490
					}

					if (var15 < var17) { // L: 492
						var0 -= var1; // L: 493
						var1 -= var2; // L: 494
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 495

						while (true) {
							--var1; // L: 496
							if (var1 < 0) {
								while (true) {
									--var0; // L: 503
									if (var0 < 0) {
										return; // L: 510
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 504
									var4 += var16; // L: 505
									var5 += var17; // L: 506
									var8 += var20; // L: 507
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 508
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19); // L: 497
							var3 += var15; // L: 498
							var5 += var17; // L: 499
							var8 += var20; // L: 500
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 501
						}
					} else {
						var0 -= var1; // L: 513
						var1 -= var2; // L: 514
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 515

						while (true) {
							--var1; // L: 516
							if (var1 < 0) {
								while (true) {
									--var0; // L: 523
									if (var0 < 0) {
										return; // L: 530
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 524
									var4 += var16; // L: 525
									var5 += var17; // L: 526
									var8 += var20; // L: 527
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 528
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19); // L: 517
							var3 += var15; // L: 518
							var5 += var17; // L: 519
							var8 += var20; // L: 520
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 521
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("l")
	@Export("Rasterizer3D_vertAlpha")
	static final void Rasterizer3D_vertAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field1899) { // L: 537
			if (var5 > Rasterizer3D_clipWidth) { // L: 538
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 539
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 541
			var1 += var4; // L: 542
			var6 += var4 * var7; // L: 543
			int var8;
			int var9;
			int var10;
			if (field1903) { // L: 544
				var3 = var5 - var4 >> 2; // L: 545
				var7 <<= 2; // L: 546
				if (Rasterizer3D_alpha == 0) { // L: 547
					if (var3 > 0) { // L: 548
						do {
							var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 550
							var6 += var7; // L: 551
							var0[var1++] = var2; // L: 552
							var0[var1++] = var2; // L: 553
							var0[var1++] = var2; // L: 554
							var0[var1++] = var2; // L: 555
							--var3; // L: 556
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 558
					if (var3 > 0) { // L: 559
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 560

						do {
							var0[var1++] = var2; // L: 562
							--var3; // L: 563
						} while(var3 > 0);
					}
				} else {
					var8 = Rasterizer3D_alpha; // L: 567
					var9 = 256 - Rasterizer3D_alpha; // L: 568
					if (var3 > 0) { // L: 569
						do {
							var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 571
							var6 += var7; // L: 572
							var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 573
							var10 = var0[var1]; // L: 574
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 575
							var10 = var0[var1]; // L: 576
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 577
							var10 = var0[var1]; // L: 578
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 579
							var10 = var0[var1]; // L: 580
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 581
							--var3; // L: 582
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 584
					if (var3 > 0) { // L: 585
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 586
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 587

						do {
							var10 = var0[var1]; // L: 589
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 590
							--var3; // L: 591
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4; // L: 597
				if (Rasterizer3D_alpha == 0) { // L: 598
					do {
						var0[var1++] = Rasterizer3D_colorPalette[var6 >> 8]; // L: 600
						var6 += var7; // L: 601
						--var3; // L: 602
					} while(var3 > 0);
				} else {
					var8 = Rasterizer3D_alpha; // L: 605
					var9 = 256 - Rasterizer3D_alpha; // L: 606

					do {
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 608
						var6 += var7; // L: 609
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 610
						var10 = var0[var1]; // L: 611
						var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 612
						--var3; // L: 613
					} while(var3 > 0);
				}

			}
		}
	} // L: 594 615

	@ObfuscatedName("m")
	public static final void method3370(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 620
		if (var0 != var1) { // L: 621
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0; // L: 622
		if (var2 != var1) { // L: 623
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0; // L: 624
		if (var0 != var2) { // L: 625
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) { // L: 626
			if (var0 < Rasterizer3D_clipHeight) { // L: 627
				if (var1 > Rasterizer3D_clipHeight) { // L: 628
					var1 = Rasterizer3D_clipHeight;
				}

				if (var2 > Rasterizer3D_clipHeight) { // L: 629
					var2 = Rasterizer3D_clipHeight;
				}

				if (var1 < var2) { // L: 630
					var5 = var3 <<= 14; // L: 631
					if (var0 < 0) { // L: 632
						var5 -= var0 * var9; // L: 633
						var3 -= var0 * var7; // L: 634
						var0 = 0; // L: 635
					}

					var4 <<= 14; // L: 637
					if (var1 < 0) { // L: 638
						var4 -= var8 * var1; // L: 639
						var1 = 0; // L: 640
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) { // L: 642
						var2 -= var1; // L: 643
						var1 -= var0; // L: 644
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 645

						while (true) {
							--var1; // L: 646
							if (var1 < 0) {
								while (true) {
									--var2; // L: 652
									if (var2 < 0) {
										return; // L: 658
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var4 >> 14); // L: 653
									var5 += var9; // L: 654
									var4 += var8; // L: 655
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 656
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 647
							var5 += var9; // L: 648
							var3 += var7; // L: 649
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 650
						}
					} else {
						var2 -= var1; // L: 661
						var1 -= var0; // L: 662
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 663

						while (true) {
							--var1; // L: 664
							if (var1 < 0) {
								while (true) {
									--var2; // L: 670
									if (var2 < 0) {
										return; // L: 676
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var5 >> 14); // L: 671
									var5 += var9; // L: 672
									var4 += var8; // L: 673
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 674
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 665
							var5 += var9; // L: 666
							var3 += var7; // L: 667
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 668
						}
					}
				} else {
					var4 = var3 <<= 14; // L: 680
					if (var0 < 0) { // L: 681
						var4 -= var0 * var9; // L: 682
						var3 -= var0 * var7; // L: 683
						var0 = 0; // L: 684
					}

					var5 <<= 14; // L: 686
					if (var2 < 0) { // L: 687
						var5 -= var8 * var2; // L: 688
						var2 = 0; // L: 689
					}

					if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) { // L: 691
						var1 -= var2; // L: 710
						var2 -= var0; // L: 711
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 712

						while (true) {
							--var2; // L: 713
							if (var2 < 0) {
								while (true) {
									--var1; // L: 719
									if (var1 < 0) {
										return; // L: 725
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 720
									var5 += var8; // L: 721
									var3 += var7; // L: 722
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 723
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var4 >> 14); // L: 714
							var4 += var9; // L: 715
							var3 += var7; // L: 716
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 717
						}
					} else {
						var1 -= var2; // L: 692
						var2 -= var0; // L: 693
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 694

						while (true) {
							--var2; // L: 695
							if (var2 < 0) {
								while (true) {
									--var1; // L: 701
									if (var1 < 0) {
										return; // L: 707
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 702
									var5 += var8; // L: 703
									var3 += var7; // L: 704
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 705
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var3 >> 14); // L: 696
							var4 += var9; // L: 697
							var3 += var7; // L: 698
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 699
						}
					}
				}
			}
		} else if (var1 <= var2) { // L: 729
			if (var1 < Rasterizer3D_clipHeight) { // L: 730
				if (var2 > Rasterizer3D_clipHeight) { // L: 731
					var2 = Rasterizer3D_clipHeight;
				}

				if (var0 > Rasterizer3D_clipHeight) { // L: 732
					var0 = Rasterizer3D_clipHeight;
				}

				if (var2 < var0) { // L: 733
					var3 = var4 <<= 14; // L: 734
					if (var1 < 0) { // L: 735
						var3 -= var7 * var1; // L: 736
						var4 -= var8 * var1; // L: 737
						var1 = 0; // L: 738
					}

					var5 <<= 14; // L: 740
					if (var2 < 0) { // L: 741
						var5 -= var9 * var2; // L: 742
						var2 = 0; // L: 743
					}

					if (var2 != var1 && var7 < var8 || var2 == var1 && var7 > var9) { // L: 745
						var0 -= var2; // L: 746
						var2 -= var1; // L: 747
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 748

						while (true) {
							--var2; // L: 749
							if (var2 < 0) {
								while (true) {
									--var0; // L: 755
									if (var0 < 0) {
										return; // L: 761
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var5 >> 14); // L: 756
									var3 += var7; // L: 757
									var5 += var9; // L: 758
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 759
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 750
							var3 += var7; // L: 751
							var4 += var8; // L: 752
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 753
						}
					} else {
						var0 -= var2; // L: 764
						var2 -= var1; // L: 765
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 766

						while (true) {
							--var2; // L: 767
							if (var2 < 0) {
								while (true) {
									--var0; // L: 773
									if (var0 < 0) {
										return; // L: 779
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var3 >> 14); // L: 774
									var3 += var7; // L: 775
									var5 += var9; // L: 776
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 777
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 768
							var3 += var7; // L: 769
							var4 += var8; // L: 770
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 771
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 783
					if (var1 < 0) { // L: 784
						var5 -= var7 * var1; // L: 785
						var4 -= var8 * var1; // L: 786
						var1 = 0; // L: 787
					}

					var3 <<= 14; // L: 789
					if (var0 < 0) { // L: 790
						var3 -= var0 * var9; // L: 791
						var0 = 0; // L: 792
					}

					if (var7 < var8) { // L: 794
						var2 -= var0; // L: 795
						var0 -= var1; // L: 796
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 797

						while (true) {
							--var0; // L: 798
							if (var0 < 0) {
								while (true) {
									--var2; // L: 804
									if (var2 < 0) {
										return; // L: 810
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 805
									var3 += var9; // L: 806
									var4 += var8; // L: 807
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 808
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var4 >> 14); // L: 799
							var5 += var7; // L: 800
							var4 += var8; // L: 801
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 802
						}
					} else {
						var2 -= var0; // L: 813
						var0 -= var1; // L: 814
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 815

						while (true) {
							--var0; // L: 816
							if (var0 < 0) {
								while (true) {
									--var2; // L: 822
									if (var2 < 0) {
										return; // L: 828
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 823
									var3 += var9; // L: 824
									var4 += var8; // L: 825
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 826
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var5 >> 14); // L: 817
							var5 += var7; // L: 818
							var4 += var8; // L: 819
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 820
						}
					}
				}
			}
		} else if (var2 < Rasterizer3D_clipHeight) { // L: 833
			if (var0 > Rasterizer3D_clipHeight) { // L: 834
				var0 = Rasterizer3D_clipHeight;
			}

			if (var1 > Rasterizer3D_clipHeight) { // L: 835
				var1 = Rasterizer3D_clipHeight;
			}

			if (var0 < var1) { // L: 836
				var4 = var5 <<= 14; // L: 837
				if (var2 < 0) { // L: 838
					var4 -= var8 * var2; // L: 839
					var5 -= var9 * var2; // L: 840
					var2 = 0; // L: 841
				}

				var3 <<= 14; // L: 843
				if (var0 < 0) { // L: 844
					var3 -= var0 * var7; // L: 845
					var0 = 0; // L: 846
				}

				if (var8 < var9) { // L: 848
					var1 -= var0; // L: 849
					var0 -= var2; // L: 850
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 851

					while (true) {
						--var0; // L: 852
						if (var0 < 0) {
							while (true) {
								--var1; // L: 858
								if (var1 < 0) {
									return; // L: 864
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var3 >> 14); // L: 859
								var4 += var8; // L: 860
								var3 += var7; // L: 861
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 862
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 853
						var4 += var8; // L: 854
						var5 += var9; // L: 855
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 856
					}
				} else {
					var1 -= var0; // L: 867
					var0 -= var2; // L: 868
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 869

					while (true) {
						--var0; // L: 870
						if (var0 < 0) {
							while (true) {
								--var1; // L: 876
								if (var1 < 0) {
									return; // L: 882
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var4 >> 14); // L: 877
								var4 += var8; // L: 878
								var3 += var7; // L: 879
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 880
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 871
						var4 += var8; // L: 872
						var5 += var9; // L: 873
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 874
					}
				}
			} else {
				var3 = var5 <<= 14; // L: 886
				if (var2 < 0) { // L: 887
					var3 -= var8 * var2; // L: 888
					var5 -= var9 * var2; // L: 889
					var2 = 0; // L: 890
				}

				var4 <<= 14; // L: 892
				if (var1 < 0) { // L: 893
					var4 -= var7 * var1; // L: 894
					var1 = 0; // L: 895
				}

				if (var8 < var9) { // L: 897
					var0 -= var1; // L: 898
					var1 -= var2; // L: 899
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 900

					while (true) {
						--var1; // L: 901
						if (var1 < 0) {
							while (true) {
								--var0; // L: 907
								if (var0 < 0) {
									return; // L: 913
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 908
								var4 += var7; // L: 909
								var5 += var9; // L: 910
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 911
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var5 >> 14); // L: 902
						var3 += var8; // L: 903
						var5 += var9; // L: 904
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 905
					}
				} else {
					var0 -= var1; // L: 916
					var1 -= var2; // L: 917
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 918

					while (true) {
						--var1; // L: 919
						if (var1 < 0) {
							while (true) {
								--var0; // L: 925
								if (var0 < 0) {
									return; // L: 931
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 926
								var4 += var7; // L: 927
								var5 += var9; // L: 928
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 929
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var3 >> 14); // L: 920
						var3 += var8; // L: 921
						var5 += var9; // L: 922
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 923
					}
				}
			}
		}
	}

	@ObfuscatedName("d")
	@Export("Rasterizer3D_horizAlpha")
	static final void Rasterizer3D_horizAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field1899) { // L: 938
			if (var5 > Rasterizer3D_clipWidth) { // L: 939
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 940
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 942
			var1 += var4; // L: 943
			var3 = var5 - var4 >> 2; // L: 944
			if (Rasterizer3D_alpha != 0) { // L: 945
				if (Rasterizer3D_alpha == 254) { // L: 957
					while (true) {
						--var3; // L: 958
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 964

							while (true) {
								--var3; // L: 965
								if (var3 < 0) {
									return; // L: 989
								}

								var0[var1++] = var0[var1]; // L: 966
							}
						}

						var0[var1++] = var0[var1]; // L: 959
						var0[var1++] = var0[var1]; // L: 960
						var0[var1++] = var0[var1]; // L: 961
						var0[var1++] = var0[var1]; // L: 962
					}
				} else {
					int var6 = Rasterizer3D_alpha; // L: 970
					int var7 = 256 - Rasterizer3D_alpha; // L: 971
					var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935); // L: 972

					while (true) {
						--var3; // L: 973
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 983

							while (true) {
								--var3; // L: 984
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1]; // L: 985
								var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 986
							}
						}

						var8 = var0[var1]; // L: 974
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 975
						var8 = var0[var1]; // L: 976
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 977
						var8 = var0[var1]; // L: 978
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 979
						var8 = var0[var1]; // L: 980
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 981
					}
				}
			} else {
				while (true) {
					--var3; // L: 946
					if (var3 < 0) {
						var3 = var5 - var4 & 3; // L: 952

						while (true) {
							--var3; // L: 953
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2; // L: 954
						}
					}

					var0[var1++] = var2; // L: 947
					var0[var1++] = var2; // L: 948
					var0[var1++] = var2; // L: 949
					var0[var1++] = var2; // L: 950
				}
			}
		}
	}

	@ObfuscatedName("c")
	static final void method3372(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 992
		int var20;
		if (var19 == null) { // L: 993
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 994
			method3383(var0, var1, var2, var3, var4, var5, method3415(var20, var6), method3415(var20, var7), method3415(var20, var8)); // L: 995
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 998
			field1921 = Rasterizer3D_textureLoader.vmethod3790(var18); // L: 999
			var20 = var4 - var3; // L: 1000
			int var21 = var1 - var0; // L: 1001
			int var22 = var5 - var3; // L: 1002
			int var23 = var2 - var0; // L: 1003
			int var24 = var7 - var6; // L: 1004
			int var25 = var8 - var6; // L: 1005
			int var26 = 0; // L: 1006
			if (var0 != var1) { // L: 1007
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1008
			if (var2 != var1) { // L: 1009
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1010
			if (var0 != var2) { // L: 1011
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1012
			if (var29 != 0) { // L: 1013
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1014
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1015
				var10 = var9 - var10; // L: 1016
				var13 = var12 - var13; // L: 1017
				var16 = var15 - var16; // L: 1018
				var11 -= var9; // L: 1019
				var14 -= var12; // L: 1020
				var17 -= var15; // L: 1021
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1022
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1023
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1024
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1025
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1026
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1027
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1028
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1029
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1030
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1031
					if (var0 < Rasterizer3D_clipHeight) { // L: 1032
						if (var1 > Rasterizer3D_clipHeight) { // L: 1033
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1034
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1035
						if (var1 < var2) { // L: 1036
							var5 = var3 <<= 14; // L: 1037
							if (var0 < 0) { // L: 1038
								var5 -= var0 * var28; // L: 1039
								var3 -= var0 * var26; // L: 1040
								var6 -= var0 * var31; // L: 1041
								var0 = 0; // L: 1042
							}

							var4 <<= 14; // L: 1044
							if (var1 < 0) { // L: 1045
								var4 -= var27 * var1; // L: 1046
								var1 = 0; // L: 1047
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1049
							var32 += var34 * var41; // L: 1050
							var35 += var37 * var41; // L: 1051
							var38 += var40 * var41; // L: 1052
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) { // L: 1053
								var2 -= var1; // L: 1054
								var1 -= var0; // L: 1055
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1056

								while (true) {
									--var1; // L: 1057
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1067
											if (var2 < 0) {
												return; // L: 1077
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1068
											var5 += var28; // L: 1069
											var4 += var27; // L: 1070
											var6 += var31; // L: 1071
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1072
											var32 += var34; // L: 1073
											var35 += var37; // L: 1074
											var38 += var40; // L: 1075
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1058
									var5 += var28; // L: 1059
									var3 += var26; // L: 1060
									var6 += var31; // L: 1061
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1062
									var32 += var34; // L: 1063
									var35 += var37; // L: 1064
									var38 += var40; // L: 1065
								}
							} else {
								var2 -= var1; // L: 1080
								var1 -= var0; // L: 1081
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1082

								while (true) {
									--var1; // L: 1083
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1093
											if (var2 < 0) {
												return; // L: 1103
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1094
											var5 += var28; // L: 1095
											var4 += var27; // L: 1096
											var6 += var31; // L: 1097
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1098
											var32 += var34; // L: 1099
											var35 += var37; // L: 1100
											var38 += var40; // L: 1101
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1084
									var5 += var28; // L: 1085
									var3 += var26; // L: 1086
									var6 += var31; // L: 1087
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1088
									var32 += var34; // L: 1089
									var35 += var37; // L: 1090
									var38 += var40; // L: 1091
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1107
							if (var0 < 0) { // L: 1108
								var4 -= var0 * var28; // L: 1109
								var3 -= var0 * var26; // L: 1110
								var6 -= var0 * var31; // L: 1111
								var0 = 0; // L: 1112
							}

							var5 <<= 14; // L: 1114
							if (var2 < 0) { // L: 1115
								var5 -= var27 * var2; // L: 1116
								var2 = 0; // L: 1117
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1119
							var32 += var34 * var41; // L: 1120
							var35 += var37 * var41; // L: 1121
							var38 += var40 * var41; // L: 1122
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 1123
								var1 -= var2; // L: 1150
								var2 -= var0; // L: 1151
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1152

								while (true) {
									--var2; // L: 1153
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1163
											if (var1 < 0) {
												return; // L: 1173
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1164
											var5 += var27; // L: 1165
											var3 += var26; // L: 1166
											var6 += var31; // L: 1167
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1168
											var32 += var34; // L: 1169
											var35 += var37; // L: 1170
											var38 += var40; // L: 1171
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1154
									var4 += var28; // L: 1155
									var3 += var26; // L: 1156
									var6 += var31; // L: 1157
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1158
									var32 += var34; // L: 1159
									var35 += var37; // L: 1160
									var38 += var40; // L: 1161
								}
							} else {
								var1 -= var2; // L: 1124
								var2 -= var0; // L: 1125
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1126

								while (true) {
									--var2; // L: 1127
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1137
											if (var1 < 0) {
												return; // L: 1147
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1138
											var5 += var27; // L: 1139
											var3 += var26; // L: 1140
											var6 += var31; // L: 1141
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1142
											var32 += var34; // L: 1143
											var35 += var37; // L: 1144
											var38 += var40; // L: 1145
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1128
									var4 += var28; // L: 1129
									var3 += var26; // L: 1130
									var6 += var31; // L: 1131
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1132
									var32 += var34; // L: 1133
									var35 += var37; // L: 1134
									var38 += var40; // L: 1135
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 1177
					if (var1 < Rasterizer3D_clipHeight) { // L: 1178
						if (var2 > Rasterizer3D_clipHeight) { // L: 1179
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 1180
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 1181
						if (var2 < var0) { // L: 1182
							var3 = var4 <<= 14; // L: 1183
							if (var1 < 0) { // L: 1184
								var3 -= var26 * var1; // L: 1185
								var4 -= var27 * var1; // L: 1186
								var7 -= var31 * var1; // L: 1187
								var1 = 0; // L: 1188
							}

							var5 <<= 14; // L: 1190
							if (var2 < 0) { // L: 1191
								var5 -= var28 * var2; // L: 1192
								var2 = 0; // L: 1193
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1195
							var32 += var34 * var41; // L: 1196
							var35 += var37 * var41; // L: 1197
							var38 += var40 * var41; // L: 1198
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 1199
								var0 -= var2; // L: 1200
								var2 -= var1; // L: 1201
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1202

								while (true) {
									--var2; // L: 1203
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1213
											if (var0 < 0) {
												return; // L: 1223
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1214
											var3 += var26; // L: 1215
											var5 += var28; // L: 1216
											var7 += var31; // L: 1217
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1218
											var32 += var34; // L: 1219
											var35 += var37; // L: 1220
											var38 += var40; // L: 1221
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1204
									var3 += var26; // L: 1205
									var4 += var27; // L: 1206
									var7 += var31; // L: 1207
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1208
									var32 += var34; // L: 1209
									var35 += var37; // L: 1210
									var38 += var40; // L: 1211
								}
							} else {
								var0 -= var2; // L: 1226
								var2 -= var1; // L: 1227
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1228

								while (true) {
									--var2; // L: 1229
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1239
											if (var0 < 0) {
												return; // L: 1249
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1240
											var3 += var26; // L: 1241
											var5 += var28; // L: 1242
											var7 += var31; // L: 1243
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1244
											var32 += var34; // L: 1245
											var35 += var37; // L: 1246
											var38 += var40; // L: 1247
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1230
									var3 += var26; // L: 1231
									var4 += var27; // L: 1232
									var7 += var31; // L: 1233
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1234
									var32 += var34; // L: 1235
									var35 += var37; // L: 1236
									var38 += var40; // L: 1237
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1253
							if (var1 < 0) { // L: 1254
								var5 -= var26 * var1; // L: 1255
								var4 -= var27 * var1; // L: 1256
								var7 -= var31 * var1; // L: 1257
								var1 = 0; // L: 1258
							}

							var3 <<= 14; // L: 1260
							if (var0 < 0) { // L: 1261
								var3 -= var0 * var28; // L: 1262
								var0 = 0; // L: 1263
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1265
							var32 += var34 * var41; // L: 1266
							var35 += var37 * var41; // L: 1267
							var38 += var40 * var41; // L: 1268
							if (var26 < var27) { // L: 1269
								var2 -= var0; // L: 1270
								var0 -= var1; // L: 1271
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1272

								while (true) {
									--var0; // L: 1273
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1283
											if (var2 < 0) {
												return; // L: 1293
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1284
											var3 += var28; // L: 1285
											var4 += var27; // L: 1286
											var7 += var31; // L: 1287
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1288
											var32 += var34; // L: 1289
											var35 += var37; // L: 1290
											var38 += var40; // L: 1291
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1274
									var5 += var26; // L: 1275
									var4 += var27; // L: 1276
									var7 += var31; // L: 1277
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1278
									var32 += var34; // L: 1279
									var35 += var37; // L: 1280
									var38 += var40; // L: 1281
								}
							} else {
								var2 -= var0; // L: 1296
								var0 -= var1; // L: 1297
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1298

								while (true) {
									--var0; // L: 1299
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1309
											if (var2 < 0) {
												return; // L: 1319
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1310
											var3 += var28; // L: 1311
											var4 += var27; // L: 1312
											var7 += var31; // L: 1313
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1314
											var32 += var34; // L: 1315
											var35 += var37; // L: 1316
											var38 += var40; // L: 1317
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1300
									var5 += var26; // L: 1301
									var4 += var27; // L: 1302
									var7 += var31; // L: 1303
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1304
									var32 += var34; // L: 1305
									var35 += var37; // L: 1306
									var38 += var40; // L: 1307
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 1324
					if (var0 > Rasterizer3D_clipHeight) { // L: 1325
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 1326
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 1327
					if (var0 < var1) { // L: 1328
						var4 = var5 <<= 14; // L: 1329
						if (var2 < 0) { // L: 1330
							var4 -= var27 * var2; // L: 1331
							var5 -= var28 * var2; // L: 1332
							var8 -= var31 * var2; // L: 1333
							var2 = 0; // L: 1334
						}

						var3 <<= 14; // L: 1336
						if (var0 < 0) { // L: 1337
							var3 -= var0 * var26; // L: 1338
							var0 = 0; // L: 1339
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1341
						var32 += var34 * var41; // L: 1342
						var35 += var37 * var41; // L: 1343
						var38 += var40 * var41; // L: 1344
						if (var27 < var28) { // L: 1345
							var1 -= var0; // L: 1346
							var0 -= var2; // L: 1347
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1348

							while (true) {
								--var0; // L: 1349
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1359
										if (var1 < 0) {
											return; // L: 1369
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1360
										var4 += var27; // L: 1361
										var3 += var26; // L: 1362
										var8 += var31; // L: 1363
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1364
										var32 += var34; // L: 1365
										var35 += var37; // L: 1366
										var38 += var40; // L: 1367
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1350
								var4 += var27; // L: 1351
								var5 += var28; // L: 1352
								var8 += var31; // L: 1353
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1354
								var32 += var34; // L: 1355
								var35 += var37; // L: 1356
								var38 += var40; // L: 1357
							}
						} else {
							var1 -= var0; // L: 1372
							var0 -= var2; // L: 1373
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1374

							while (true) {
								--var0; // L: 1375
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1385
										if (var1 < 0) {
											return; // L: 1395
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1386
										var4 += var27; // L: 1387
										var3 += var26; // L: 1388
										var8 += var31; // L: 1389
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1390
										var32 += var34; // L: 1391
										var35 += var37; // L: 1392
										var38 += var40; // L: 1393
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1376
								var4 += var27; // L: 1377
								var5 += var28; // L: 1378
								var8 += var31; // L: 1379
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1380
								var32 += var34; // L: 1381
								var35 += var37; // L: 1382
								var38 += var40; // L: 1383
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 1399
						if (var2 < 0) { // L: 1400
							var3 -= var27 * var2; // L: 1401
							var5 -= var28 * var2; // L: 1402
							var8 -= var31 * var2; // L: 1403
							var2 = 0; // L: 1404
						}

						var4 <<= 14; // L: 1406
						if (var1 < 0) { // L: 1407
							var4 -= var26 * var1; // L: 1408
							var1 = 0; // L: 1409
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1411
						var32 += var34 * var41; // L: 1412
						var35 += var37 * var41; // L: 1413
						var38 += var40 * var41; // L: 1414
						if (var27 < var28) { // L: 1415
							var0 -= var1; // L: 1416
							var1 -= var2; // L: 1417
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1418

							while (true) {
								--var1; // L: 1419
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1429
										if (var0 < 0) {
											return; // L: 1439
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1430
										var4 += var26; // L: 1431
										var5 += var28; // L: 1432
										var8 += var31; // L: 1433
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1434
										var32 += var34; // L: 1435
										var35 += var37; // L: 1436
										var38 += var40; // L: 1437
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1420
								var3 += var27; // L: 1421
								var5 += var28; // L: 1422
								var8 += var31; // L: 1423
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1424
								var32 += var34; // L: 1425
								var35 += var37; // L: 1426
								var38 += var40; // L: 1427
							}
						} else {
							var0 -= var1; // L: 1442
							var1 -= var2; // L: 1443
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1444

							while (true) {
								--var1; // L: 1445
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1455
										if (var0 < 0) {
											return; // L: 1465
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1456
										var4 += var26; // L: 1457
										var5 += var28; // L: 1458
										var8 += var31; // L: 1459
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1460
										var32 += var34; // L: 1461
										var35 += var37; // L: 1462
										var38 += var40; // L: 1463
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1446
								var3 += var27; // L: 1447
								var5 += var28; // L: 1448
								var8 += var31; // L: 1449
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1450
								var32 += var34; // L: 1451
								var35 += var37; // L: 1452
								var38 += var40; // L: 1453
							}
						}
					}
				}
			}
		}
	} // L: 996

	@ObfuscatedName("j")
	@Export("Rasterizer3D_iDontKnow")
	static final void Rasterizer3D_iDontKnow(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field1899) { // L: 1474
			if (var6 > Rasterizer3D_clipWidth) { // L: 1475
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 1476
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 1478
			var4 += var5; // L: 1479
			var7 += var5 * var8; // L: 1480
			int var17 = var6 - var5; // L: 1481
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 1482
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1488
				var9 += var23 * (var12 >> 3); // L: 1489
				var10 += (var13 >> 3) * var23; // L: 1490
				var11 += var23 * (var14 >> 3); // L: 1491
				var22 = var11 >> 12; // L: 1492
				if (var22 != 0) { // L: 1493
					var18 = var9 / var22; // L: 1494
					var19 = var10 / var22; // L: 1495
					if (var18 < 0) { // L: 1496
						var18 = 0;
					} else if (var18 > 4032) { // L: 1497
						var18 = 4032;
					}
				} else {
					var18 = 0; // L: 1500
					var19 = 0; // L: 1501
				}

				var9 += var12; // L: 1503
				var10 += var13; // L: 1504
				var11 += var14; // L: 1505
				var22 = var11 >> 12; // L: 1506
				if (var22 != 0) { // L: 1507
					var20 = var9 / var22; // L: 1508
					var21 = var10 / var22; // L: 1509
					if (var20 < 0) { // L: 1510
						var20 = 0;
					} else if (var20 > 4032) { // L: 1511
						var20 = 4032;
					}
				} else {
					var20 = 0; // L: 1514
					var21 = 0; // L: 1515
				}

				var2 = (var18 << 20) + var19; // L: 1517
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1518
				var17 >>= 3; // L: 1519
				var8 <<= 3; // L: 1520
				var15 = var7 >> 8; // L: 1521
				if (field1921) { // L: 1522
					if (var17 > 0) { // L: 1523
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1525
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1526
							var2 += var16; // L: 1527
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1528
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1529
							var2 += var16; // L: 1530
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1531
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1532
							var2 += var16; // L: 1533
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1534
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1535
							var2 += var16; // L: 1536
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1537
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1538
							var2 += var16; // L: 1539
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1540
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1541
							var2 += var16; // L: 1542
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1543
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1544
							var2 += var16; // L: 1545
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1546
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1547
							var10000 = var16 + var2; // L: 1548
							var18 = var20; // L: 1549
							var19 = var21; // L: 1550
							var9 += var12; // L: 1551
							var10 += var13; // L: 1552
							var11 += var14; // L: 1553
							var22 = var11 >> 12; // L: 1554
							if (var22 != 0) { // L: 1555
								var20 = var9 / var22; // L: 1556
								var21 = var10 / var22; // L: 1557
								if (var20 < 0) { // L: 1558
									var20 = 0;
								} else if (var20 > 4032) { // L: 1559
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1562
								var21 = 0; // L: 1563
							}

							var2 = (var18 << 20) + var19; // L: 1565
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1566
							var7 += var8; // L: 1567
							var15 = var7 >> 8; // L: 1568
							--var17; // L: 1569
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1571
					if (var17 > 0) { // L: 1572
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1574
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1575
							var2 += var16; // L: 1576
							--var17; // L: 1577
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1581
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1583
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1584
							}

							++var4; // L: 1586
							var2 += var16; // L: 1587
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1588
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1589
							}

							++var4; // L: 1591
							var2 += var16; // L: 1592
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1593
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1594
							}

							++var4; // L: 1596
							var2 += var16; // L: 1597
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1598
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1599
							}

							++var4; // L: 1601
							var2 += var16; // L: 1602
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1603
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1604
							}

							++var4; // L: 1606
							var2 += var16; // L: 1607
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1608
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1609
							}

							++var4; // L: 1611
							var2 += var16; // L: 1612
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1613
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1614
							}

							++var4; // L: 1616
							var2 += var16; // L: 1617
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1618
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1619
							}

							++var4; // L: 1621
							var10000 = var16 + var2; // L: 1622
							var18 = var20; // L: 1623
							var19 = var21; // L: 1624
							var9 += var12; // L: 1625
							var10 += var13; // L: 1626
							var11 += var14; // L: 1627
							var22 = var11 >> 12; // L: 1628
							if (var22 != 0) { // L: 1629
								var20 = var9 / var22; // L: 1630
								var21 = var10 / var22; // L: 1631
								if (var20 < 0) { // L: 1632
									var20 = 0;
								} else if (var20 > 4032) { // L: 1633
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1636
								var21 = 0; // L: 1637
							}

							var2 = (var18 << 20) + var19; // L: 1639
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1640
							var7 += var8; // L: 1641
							var15 = var7 >> 8; // L: 1642
							--var17; // L: 1643
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1645
					if (var17 > 0) { // L: 1646
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1648
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1649
							}

							++var4; // L: 1651
							var2 += var16; // L: 1652
							--var17; // L: 1653
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1663
				var9 += var23 * (var12 >> 3); // L: 1664
				var10 += (var13 >> 3) * var23; // L: 1665
				var11 += var23 * (var14 >> 3); // L: 1666
				var22 = var11 >> 14; // L: 1667
				if (var22 != 0) { // L: 1668
					var18 = var9 / var22; // L: 1669
					var19 = var10 / var22; // L: 1670
					if (var18 < 0) { // L: 1671
						var18 = 0;
					} else if (var18 > 16256) { // L: 1672
						var18 = 16256;
					}
				} else {
					var18 = 0; // L: 1675
					var19 = 0; // L: 1676
				}

				var9 += var12; // L: 1678
				var10 += var13; // L: 1679
				var11 += var14; // L: 1680
				var22 = var11 >> 14; // L: 1681
				if (var22 != 0) { // L: 1682
					var20 = var9 / var22; // L: 1683
					var21 = var10 / var22; // L: 1684
					if (var20 < 0) { // L: 1685
						var20 = 0;
					} else if (var20 > 16256) { // L: 1686
						var20 = 16256;
					}
				} else {
					var20 = 0; // L: 1689
					var21 = 0; // L: 1690
				}

				var2 = (var18 << 18) + var19; // L: 1692
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1693
				var17 >>= 3; // L: 1694
				var8 <<= 3; // L: 1695
				var15 = var7 >> 8; // L: 1696
				if (field1921) { // L: 1697
					if (var17 > 0) { // L: 1698
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1700
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1701
							var2 += var16; // L: 1702
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1703
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1704
							var2 += var16; // L: 1705
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1706
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1707
							var2 += var16; // L: 1708
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1709
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1710
							var2 += var16; // L: 1711
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1712
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1713
							var2 += var16; // L: 1714
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1715
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1716
							var2 += var16; // L: 1717
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1718
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1719
							var2 += var16; // L: 1720
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1721
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1722
							var10000 = var16 + var2; // L: 1723
							var18 = var20; // L: 1724
							var19 = var21; // L: 1725
							var9 += var12; // L: 1726
							var10 += var13; // L: 1727
							var11 += var14; // L: 1728
							var22 = var11 >> 14; // L: 1729
							if (var22 != 0) { // L: 1730
								var20 = var9 / var22; // L: 1731
								var21 = var10 / var22; // L: 1732
								if (var20 < 0) { // L: 1733
									var20 = 0;
								} else if (var20 > 16256) { // L: 1734
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1737
								var21 = 0; // L: 1738
							}

							var2 = (var18 << 18) + var19; // L: 1740
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1741
							var7 += var8; // L: 1742
							var15 = var7 >> 8; // L: 1743
							--var17; // L: 1744
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1746
					if (var17 > 0) { // L: 1747
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1749
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1750
							var2 += var16; // L: 1751
							--var17; // L: 1752
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1756
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1758
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1759
							}

							++var4; // L: 1761
							var2 += var16; // L: 1762
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1763
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1764
							}

							++var4; // L: 1766
							var2 += var16; // L: 1767
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1768
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1769
							}

							++var4; // L: 1771
							var2 += var16; // L: 1772
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1773
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1774
							}

							++var4; // L: 1776
							var2 += var16; // L: 1777
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1778
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1779
							}

							++var4; // L: 1781
							var2 += var16; // L: 1782
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1783
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1784
							}

							++var4; // L: 1786
							var2 += var16; // L: 1787
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1788
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1789
							}

							++var4; // L: 1791
							var2 += var16; // L: 1792
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1793
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1794
							}

							++var4; // L: 1796
							var10000 = var16 + var2; // L: 1797
							var18 = var20; // L: 1798
							var19 = var21; // L: 1799
							var9 += var12; // L: 1800
							var10 += var13; // L: 1801
							var11 += var14; // L: 1802
							var22 = var11 >> 14; // L: 1803
							if (var22 != 0) { // L: 1804
								var20 = var9 / var22; // L: 1805
								var21 = var10 / var22; // L: 1806
								if (var20 < 0) { // L: 1807
									var20 = 0;
								} else if (var20 > 16256) { // L: 1808
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1811
								var21 = 0; // L: 1812
							}

							var2 = (var18 << 18) + var19; // L: 1814
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1815
							var7 += var8; // L: 1816
							var15 = var7 >> 8; // L: 1817
							--var17; // L: 1818
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1820
					if (var17 > 0) { // L: 1821
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1823
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1824
							}

							++var4; // L: 1826
							var2 += var16; // L: 1827
							--var17; // L: 1828
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 1832

	@ObfuscatedName("r")
	@Export("drawTexturedTile")
	static final void drawTexturedTile(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1835
		int var20;
		if (var19 == null) { // L: 1836
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1837
			method3383(var0, var1, var2, var3, var4, var5, method3415(var20, var6), method3415(var20, var7), method3415(var20, var8)); // L: 1838
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1841
			field1921 = Rasterizer3D_textureLoader.vmethod3790(var18); // L: 1842
			var20 = var4 - var3; // L: 1843
			int var21 = var1 - var0; // L: 1844
			int var22 = var5 - var3; // L: 1845
			int var23 = var2 - var0; // L: 1846
			int var24 = var7 - var6; // L: 1847
			int var25 = var8 - var6; // L: 1848
			int var26 = 0; // L: 1849
			if (var0 != var1) { // L: 1850
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1851
			if (var2 != var1) { // L: 1852
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1853
			if (var0 != var2) { // L: 1854
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1855
			if (var29 != 0) { // L: 1856
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1857
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1858
				var10 = var9 - var10; // L: 1859
				var13 = var12 - var13; // L: 1860
				var16 = var15 - var16; // L: 1861
				var11 -= var9; // L: 1862
				var14 -= var12; // L: 1863
				var17 -= var15; // L: 1864
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1865
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1866
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1867
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1868
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1869
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1870
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1871
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)Rasterizer3D_zoom); // L: 1872
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1873
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1874
					if (var0 < Rasterizer3D_clipHeight) { // L: 1875
						if (var1 > Rasterizer3D_clipHeight) { // L: 1876
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1877
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1878
						if (var1 < var2) { // L: 1879
							var5 = var3 <<= 14; // L: 1880
							if (var0 < 0) { // L: 1881
								var5 -= var0 * var28; // L: 1882
								var3 -= var0 * var26; // L: 1883
								var6 -= var0 * var31; // L: 1884
								var0 = 0; // L: 1885
							}

							var4 <<= 14; // L: 1887
							if (var1 < 0) { // L: 1888
								var4 -= var27 * var1; // L: 1889
								var1 = 0; // L: 1890
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1892
							var32 += var34 * var41; // L: 1893
							var35 += var37 * var41; // L: 1894
							var38 += var40 * var41; // L: 1895
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) { // L: 1896
								var2 -= var1; // L: 1923
								var1 -= var0; // L: 1924
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1925

								while (true) {
									--var1; // L: 1926
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1936
											if (var2 < 0) {
												return; // L: 1946
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1937
											var5 += var28; // L: 1938
											var4 += var27; // L: 1939
											var6 += var31; // L: 1940
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1941
											var32 += var34; // L: 1942
											var35 += var37; // L: 1943
											var38 += var40; // L: 1944
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1927
									var5 += var28; // L: 1928
									var3 += var26; // L: 1929
									var6 += var31; // L: 1930
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1931
									var32 += var34; // L: 1932
									var35 += var37; // L: 1933
									var38 += var40; // L: 1934
								}
							} else {
								var2 -= var1; // L: 1897
								var1 -= var0; // L: 1898
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1899

								while (true) {
									--var1; // L: 1900
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1910
											if (var2 < 0) {
												return; // L: 1920
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1911
											var5 += var28; // L: 1912
											var4 += var27; // L: 1913
											var6 += var31; // L: 1914
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1915
											var32 += var34; // L: 1916
											var35 += var37; // L: 1917
											var38 += var40; // L: 1918
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1901
									var5 += var28; // L: 1902
									var3 += var26; // L: 1903
									var6 += var31; // L: 1904
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1905
									var32 += var34; // L: 1906
									var35 += var37; // L: 1907
									var38 += var40; // L: 1908
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1950
							if (var0 < 0) { // L: 1951
								var4 -= var0 * var28; // L: 1952
								var3 -= var0 * var26; // L: 1953
								var6 -= var0 * var31; // L: 1954
								var0 = 0; // L: 1955
							}

							var5 <<= 14; // L: 1957
							if (var2 < 0) { // L: 1958
								var5 -= var27 * var2; // L: 1959
								var2 = 0; // L: 1960
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1962
							var32 += var34 * var41; // L: 1963
							var35 += var37 * var41; // L: 1964
							var38 += var40 * var41; // L: 1965
							if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) { // L: 1966
								var1 -= var2; // L: 1967
								var2 -= var0; // L: 1968
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1969

								while (true) {
									--var2; // L: 1970
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1980
											if (var1 < 0) {
												return; // L: 1990
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1981
											var5 += var27; // L: 1982
											var3 += var26; // L: 1983
											var6 += var31; // L: 1984
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1985
											var32 += var34; // L: 1986
											var35 += var37; // L: 1987
											var38 += var40; // L: 1988
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1971
									var4 += var28; // L: 1972
									var3 += var26; // L: 1973
									var6 += var31; // L: 1974
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1975
									var32 += var34; // L: 1976
									var35 += var37; // L: 1977
									var38 += var40; // L: 1978
								}
							} else {
								var1 -= var2; // L: 1993
								var2 -= var0; // L: 1994
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1995

								while (true) {
									--var2; // L: 1996
									if (var2 < 0) {
										while (true) {
											--var1; // L: 2006
											if (var1 < 0) {
												return; // L: 2016
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2007
											var5 += var27; // L: 2008
											var3 += var26; // L: 2009
											var6 += var31; // L: 2010
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 2011
											var32 += var34; // L: 2012
											var35 += var37; // L: 2013
											var38 += var40; // L: 2014
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1997
									var4 += var28; // L: 1998
									var3 += var26; // L: 1999
									var6 += var31; // L: 2000
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 2001
									var32 += var34; // L: 2002
									var35 += var37; // L: 2003
									var38 += var40; // L: 2004
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 2020
					if (var1 < Rasterizer3D_clipHeight) { // L: 2021
						if (var2 > Rasterizer3D_clipHeight) { // L: 2022
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 2023
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 2024
						if (var2 < var0) { // L: 2025
							var3 = var4 <<= 14; // L: 2026
							if (var1 < 0) { // L: 2027
								var3 -= var26 * var1; // L: 2028
								var4 -= var27 * var1; // L: 2029
								var7 -= var31 * var1; // L: 2030
								var1 = 0; // L: 2031
							}

							var5 <<= 14; // L: 2033
							if (var2 < 0) { // L: 2034
								var5 -= var28 * var2; // L: 2035
								var2 = 0; // L: 2036
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2038
							var32 += var34 * var41; // L: 2039
							var35 += var37 * var41; // L: 2040
							var38 += var40 * var41; // L: 2041
							if ((var2 == var1 || var26 >= var27) && (var2 != var1 || var26 <= var28)) { // L: 2042
								var0 -= var2; // L: 2069
								var2 -= var1; // L: 2070
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2071

								while (true) {
									--var2; // L: 2072
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2082
											if (var0 < 0) {
												return; // L: 2092
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2083
											var3 += var26; // L: 2084
											var5 += var28; // L: 2085
											var7 += var31; // L: 2086
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2087
											var32 += var34; // L: 2088
											var35 += var37; // L: 2089
											var38 += var40; // L: 2090
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2073
									var3 += var26; // L: 2074
									var4 += var27; // L: 2075
									var7 += var31; // L: 2076
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2077
									var32 += var34; // L: 2078
									var35 += var37; // L: 2079
									var38 += var40; // L: 2080
								}
							} else {
								var0 -= var2; // L: 2043
								var2 -= var1; // L: 2044
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2045

								while (true) {
									--var2; // L: 2046
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2056
											if (var0 < 0) {
												return; // L: 2066
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2057
											var3 += var26; // L: 2058
											var5 += var28; // L: 2059
											var7 += var31; // L: 2060
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2061
											var32 += var34; // L: 2062
											var35 += var37; // L: 2063
											var38 += var40; // L: 2064
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2047
									var3 += var26; // L: 2048
									var4 += var27; // L: 2049
									var7 += var31; // L: 2050
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2051
									var32 += var34; // L: 2052
									var35 += var37; // L: 2053
									var38 += var40; // L: 2054
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2096
							if (var1 < 0) { // L: 2097
								var5 -= var26 * var1; // L: 2098
								var4 -= var27 * var1; // L: 2099
								var7 -= var31 * var1; // L: 2100
								var1 = 0; // L: 2101
							}

							var3 <<= 14; // L: 2103
							if (var0 < 0) { // L: 2104
								var3 -= var0 * var28; // L: 2105
								var0 = 0; // L: 2106
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2108
							var32 += var34 * var41; // L: 2109
							var35 += var37 * var41; // L: 2110
							var38 += var40 * var41; // L: 2111
							if (var26 < var27) { // L: 2112
								var2 -= var0; // L: 2113
								var0 -= var1; // L: 2114
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2115

								while (true) {
									--var0; // L: 2116
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2126
											if (var2 < 0) {
												return; // L: 2136
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2127
											var3 += var28; // L: 2128
											var4 += var27; // L: 2129
											var7 += var31; // L: 2130
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2131
											var32 += var34; // L: 2132
											var35 += var37; // L: 2133
											var38 += var40; // L: 2134
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2117
									var5 += var26; // L: 2118
									var4 += var27; // L: 2119
									var7 += var31; // L: 2120
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2121
									var32 += var34; // L: 2122
									var35 += var37; // L: 2123
									var38 += var40; // L: 2124
								}
							} else {
								var2 -= var0; // L: 2139
								var0 -= var1; // L: 2140
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2141

								while (true) {
									--var0; // L: 2142
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2152
											if (var2 < 0) {
												return; // L: 2162
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2153
											var3 += var28; // L: 2154
											var4 += var27; // L: 2155
											var7 += var31; // L: 2156
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2157
											var32 += var34; // L: 2158
											var35 += var37; // L: 2159
											var38 += var40; // L: 2160
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2143
									var5 += var26; // L: 2144
									var4 += var27; // L: 2145
									var7 += var31; // L: 2146
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2147
									var32 += var34; // L: 2148
									var35 += var37; // L: 2149
									var38 += var40; // L: 2150
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 2167
					if (var0 > Rasterizer3D_clipHeight) { // L: 2168
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 2169
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 2170
					if (var0 < var1) { // L: 2171
						var4 = var5 <<= 14; // L: 2172
						if (var2 < 0) { // L: 2173
							var4 -= var27 * var2; // L: 2174
							var5 -= var28 * var2; // L: 2175
							var8 -= var31 * var2; // L: 2176
							var2 = 0; // L: 2177
						}

						var3 <<= 14; // L: 2179
						if (var0 < 0) { // L: 2180
							var3 -= var0 * var26; // L: 2181
							var0 = 0; // L: 2182
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2184
						var32 += var34 * var41; // L: 2185
						var35 += var37 * var41; // L: 2186
						var38 += var40 * var41; // L: 2187
						if (var27 < var28) { // L: 2188
							var1 -= var0; // L: 2189
							var0 -= var2; // L: 2190
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2191

							while (true) {
								--var0; // L: 2192
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2202
										if (var1 < 0) {
											return; // L: 2212
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2203
										var4 += var27; // L: 2204
										var3 += var26; // L: 2205
										var8 += var31; // L: 2206
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2207
										var32 += var34; // L: 2208
										var35 += var37; // L: 2209
										var38 += var40; // L: 2210
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2193
								var4 += var27; // L: 2194
								var5 += var28; // L: 2195
								var8 += var31; // L: 2196
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2197
								var32 += var34; // L: 2198
								var35 += var37; // L: 2199
								var38 += var40; // L: 2200
							}
						} else {
							var1 -= var0; // L: 2215
							var0 -= var2; // L: 2216
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2217

							while (true) {
								--var0; // L: 2218
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2228
										if (var1 < 0) {
											return; // L: 2238
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2229
										var4 += var27; // L: 2230
										var3 += var26; // L: 2231
										var8 += var31; // L: 2232
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2233
										var32 += var34; // L: 2234
										var35 += var37; // L: 2235
										var38 += var40; // L: 2236
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2219
								var4 += var27; // L: 2220
								var5 += var28; // L: 2221
								var8 += var31; // L: 2222
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2223
								var32 += var34; // L: 2224
								var35 += var37; // L: 2225
								var38 += var40; // L: 2226
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 2242
						if (var2 < 0) { // L: 2243
							var3 -= var27 * var2; // L: 2244
							var5 -= var28 * var2; // L: 2245
							var8 -= var31 * var2; // L: 2246
							var2 = 0; // L: 2247
						}

						var4 <<= 14; // L: 2249
						if (var1 < 0) { // L: 2250
							var4 -= var26 * var1; // L: 2251
							var1 = 0; // L: 2252
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2254
						var32 += var34 * var41; // L: 2255
						var35 += var37 * var41; // L: 2256
						var38 += var40 * var41; // L: 2257
						if (var27 < var28) { // L: 2258
							var0 -= var1; // L: 2259
							var1 -= var2; // L: 2260
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2261

							while (true) {
								--var1; // L: 2262
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2272
										if (var0 < 0) {
											return; // L: 2282
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2273
										var4 += var26; // L: 2274
										var5 += var28; // L: 2275
										var8 += var31; // L: 2276
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2277
										var32 += var34; // L: 2278
										var35 += var37; // L: 2279
										var38 += var40; // L: 2280
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2263
								var3 += var27; // L: 2264
								var5 += var28; // L: 2265
								var8 += var31; // L: 2266
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2267
								var32 += var34; // L: 2268
								var35 += var37; // L: 2269
								var38 += var40; // L: 2270
							}
						} else {
							var0 -= var1; // L: 2285
							var1 -= var2; // L: 2286
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2287

							while (true) {
								--var1; // L: 2288
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2298
										if (var0 < 0) {
											return; // L: 2308
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2299
										var4 += var26; // L: 2300
										var5 += var28; // L: 2301
										var8 += var31; // L: 2302
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2303
										var32 += var34; // L: 2304
										var35 += var37; // L: 2305
										var38 += var40; // L: 2306
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2289
								var3 += var27; // L: 2290
								var5 += var28; // L: 2291
								var8 += var31; // L: 2292
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2293
								var32 += var34; // L: 2294
								var35 += var37; // L: 2295
								var38 += var40; // L: 2296
							}
						}
					}
				}
			}
		}
	} // L: 1839

	@ObfuscatedName("q")
	@Export("Rasterizer3D_textureAlpha")
	static final void Rasterizer3D_textureAlpha(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field1899) { // L: 2317
			if (var6 > Rasterizer3D_clipWidth) { // L: 2318
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 2319
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 2321
			var4 += var5; // L: 2322
			var7 += var5 * var8; // L: 2323
			int var17 = var6 - var5; // L: 2324
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 2325
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2332
				var9 += var23 * var12; // L: 2333
				var10 += var13 * var23; // L: 2334
				var11 += var23 * var14; // L: 2335
				var22 = var11 >> 12; // L: 2336
				if (var22 != 0) { // L: 2337
					var18 = var9 / var22; // L: 2338
					var19 = var10 / var22; // L: 2339
				} else {
					var18 = 0; // L: 2342
					var19 = 0; // L: 2343
				}

				var9 += var17 * var12; // L: 2345
				var10 += var13 * var17; // L: 2346
				var11 += var17 * var14; // L: 2347
				var22 = var11 >> 12; // L: 2348
				if (var22 != 0) { // L: 2349
					var20 = var9 / var22; // L: 2350
					var21 = var10 / var22; // L: 2351
				} else {
					var20 = 0; // L: 2354
					var21 = 0; // L: 2355
				}

				var2 = (var18 << 20) + var19; // L: 2357
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 20); // L: 2358
				var17 >>= 3; // L: 2359
				var8 <<= 3; // L: 2360
				var15 = var7 >> 8; // L: 2361
				if (field1921) { // L: 2363
					if (var17 > 0) { // L: 2364
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2366
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2367
							var2 += var16; // L: 2368
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2369
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2370
							var2 += var16; // L: 2371
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2372
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2373
							var2 += var16; // L: 2374
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2375
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2376
							var2 += var16; // L: 2377
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2378
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2379
							var2 += var16; // L: 2380
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2381
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2382
							var2 += var16; // L: 2383
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2384
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2385
							var2 += var16; // L: 2386
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2387
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2388
							var2 += var16; // L: 2389
							var7 += var8; // L: 2390
							var15 = var7 >> 8; // L: 2391
							--var17; // L: 2392
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2394
					if (var17 > 0) { // L: 2395
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2397
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2398
							var2 += var16; // L: 2399
							--var17; // L: 2400
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2404
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2406
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2407
							}

							++var4; // L: 2409
							var2 += var16; // L: 2410
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2411
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2412
							}

							++var4; // L: 2414
							var2 += var16; // L: 2415
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2416
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2417
							}

							++var4; // L: 2419
							var2 += var16; // L: 2420
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2421
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2422
							}

							++var4; // L: 2424
							var2 += var16; // L: 2425
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2426
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2427
							}

							++var4; // L: 2429
							var2 += var16; // L: 2430
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2431
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2432
							}

							++var4; // L: 2434
							var2 += var16; // L: 2435
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2436
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2437
							}

							++var4; // L: 2439
							var2 += var16; // L: 2440
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2441
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2442
							}

							++var4; // L: 2444
							var2 += var16; // L: 2445
							var7 += var8; // L: 2446
							var15 = var7 >> 8; // L: 2447
							--var17; // L: 2448
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2450
					if (var17 > 0) { // L: 2451
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2453
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2454
							}

							++var4; // L: 2456
							var2 += var16; // L: 2457
							--var17; // L: 2458
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2469
				var9 += var23 * var12; // L: 2470
				var10 += var13 * var23; // L: 2471
				var11 += var23 * var14; // L: 2472
				var22 = var11 >> 14; // L: 2473
				if (var22 != 0) { // L: 2474
					var18 = var9 / var22; // L: 2475
					var19 = var10 / var22; // L: 2476
				} else {
					var18 = 0; // L: 2479
					var19 = 0; // L: 2480
				}

				var9 += var17 * var12; // L: 2482
				var10 += var13 * var17; // L: 2483
				var11 += var17 * var14; // L: 2484
				var22 = var11 >> 14; // L: 2485
				if (var22 != 0) { // L: 2486
					var20 = var9 / var22; // L: 2487
					var21 = var10 / var22; // L: 2488
				} else {
					var20 = 0; // L: 2491
					var21 = 0; // L: 2492
				}

				var2 = (var18 << 18) + var19; // L: 2494
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 18); // L: 2495
				var17 >>= 3; // L: 2496
				var8 <<= 3; // L: 2497
				var15 = var7 >> 8; // L: 2498
				if (field1921) { // L: 2500
					if (var17 > 0) { // L: 2501
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2503
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2504
							var2 += var16; // L: 2505
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2506
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2507
							var2 += var16; // L: 2508
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2509
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2510
							var2 += var16; // L: 2511
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2512
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2513
							var2 += var16; // L: 2514
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2515
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2516
							var2 += var16; // L: 2517
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2518
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2519
							var2 += var16; // L: 2520
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2521
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2522
							var2 += var16; // L: 2523
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2524
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2525
							var2 += var16; // L: 2526
							var7 += var8; // L: 2527
							var15 = var7 >> 8; // L: 2528
							--var17; // L: 2529
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2531
					if (var17 > 0) { // L: 2532
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2534
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2535
							var2 += var16; // L: 2536
							--var17; // L: 2537
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2541
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2543
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2544
							}

							++var4; // L: 2546
							var2 += var16; // L: 2547
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2548
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2549
							}

							++var4; // L: 2551
							var2 += var16; // L: 2552
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2553
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2554
							}

							++var4; // L: 2556
							var2 += var16; // L: 2557
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2558
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2559
							}

							++var4; // L: 2561
							var2 += var16; // L: 2562
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2563
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2564
							}

							++var4; // L: 2566
							var2 += var16; // L: 2567
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2568
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2569
							}

							++var4; // L: 2571
							var2 += var16; // L: 2572
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2573
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2574
							}

							++var4; // L: 2576
							var2 += var16; // L: 2577
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2578
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2579
							}

							++var4; // L: 2581
							var2 += var16; // L: 2582
							var7 += var8; // L: 2583
							var15 = var7 >> 8; // L: 2584
							--var17; // L: 2585
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2587
					if (var17 > 0) { // L: 2588
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2590
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2591
							}

							++var4; // L: 2593
							var2 += var16; // L: 2594
							--var17; // L: 2595
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 2599

	@ObfuscatedName("t")
	static final int method3415(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 2602
		if (var1 < 2) { // L: 2603
			var1 = 2;
		} else if (var1 > 126) { // L: 2604
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 2605
	}

	@ObfuscatedName("v")
	static final int method3377(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2609
	}

	@ObfuscatedName("x")
	static final int method3378(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2613
	}

	@ObfuscatedName("z")
	static final int method3379(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 2617
	}

	@ObfuscatedName("i")
	static final int method3380(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 2621
	}

	@ObfuscatedName("a")
	static final int method3400(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2625
	}

	@ObfuscatedName("w")
	static final int method3367(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2629
	}
}
