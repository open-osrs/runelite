import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("Rasterizer3D")
public class Rasterizer3D extends Rasterizer2D {
	@ObfuscatedName("i")
	static boolean field2365;
	@ObfuscatedName("w")
	static boolean field2344;
	@ObfuscatedName("s")
	@Export("Rasterizer3D_isLowDetailTexture")
	static boolean Rasterizer3D_isLowDetailTexture;
	@ObfuscatedName("a")
	public static boolean field2367;
	@ObfuscatedName("o")
	@Export("Rasterizer3D_alpha")
	static int Rasterizer3D_alpha;
	@ObfuscatedName("y")
	@Export("Rasterizer3D_zoom")
	public static int Rasterizer3D_zoom;
	@ObfuscatedName("k")
	@Export("Rasterizer3D_clipMidX")
	static int Rasterizer3D_clipMidX;
	@ObfuscatedName("t")
	@Export("Rasterizer3D_clipMidY")
	static int Rasterizer3D_clipMidY;
	@ObfuscatedName("l")
	@Export("Rasterizer3D_clipWidth")
	static int Rasterizer3D_clipWidth;
	@ObfuscatedName("u")
	@Export("Rasterizer3D_clipHeight")
	static int Rasterizer3D_clipHeight;
	@ObfuscatedName("n")
	@Export("Rasterizer3D_clipNegativeMidX")
	static int Rasterizer3D_clipNegativeMidX;
	@ObfuscatedName("z")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2;
	@ObfuscatedName("q")
	@Export("Rasterizer3D_clipNegativeMidY")
	static int Rasterizer3D_clipNegativeMidY;
	@ObfuscatedName("d")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2;
	@ObfuscatedName("r")
	@Export("Rasterizer3D_rowOffsets")
	static int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("m")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Rasterizer3D_textureLoader")
	public static TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("f")
	static int[] field2366;
	@ObfuscatedName("h")
	static int[] field2347;
	@ObfuscatedName("v")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ag")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;

	static {
		field2365 = false; // L: 8
		field2344 = false; // L: 9
		Rasterizer3D_isLowDetailTexture = false; // L: 10
		field2367 = true; // L: 11
		Rasterizer3D_alpha = 0; // L: 12
		Rasterizer3D_zoom = 512; // L: 19
		Rasterizer3D_rowOffsets = new int[1024]; // L: 28
		Rasterizer3D_colorPalette = new int[65536]; // L: 29
		field2366 = new int[512]; // L: 31
		field2347 = new int[2048]; // L: 32
		Rasterizer3D_sine = new int[2048]; // L: 33
		Rasterizer3D_cosine = new int[2048]; // L: 34

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 37
			field2366[var0] = 32768 / var0; // L: 38
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 40
			field2347[var0] = 65536 / var0; // L: 41
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 43
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D)); // L: 44
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D)); // L: 45
		}

	} // L: 47

	@ObfuscatedName("i")
	@Export("Rasterizer3D_setClipFromRasterizer2D")
	public static final void Rasterizer3D_setClipFromRasterizer2D() {
		Rasterizer3D_setClip(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd); // L: 54
	} // L: 55

	@ObfuscatedName("w")
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

	@ObfuscatedName("s")
	@Export("Rasterizer3D_method3")
	public static final void Rasterizer3D_method3() {
		Rasterizer3D_clipMidX = Rasterizer3D_clipWidth / 2; // L: 83
		Rasterizer3D_clipMidY = Rasterizer3D_clipHeight / 2; // L: 84
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 85
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 86
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 87
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 88
	} // L: 89

	@ObfuscatedName("a")
	public static final void method4205(int var0, int var1) {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lht;)V"
	)
	@Export("Rasterizer3D_setTextureLoader")
	public static final void Rasterizer3D_setTextureLoader(TextureLoader var0) {
		Rasterizer3D_textureLoader = var0; // L: 104
	} // L: 105

	@ObfuscatedName("g")
	@Export("Rasterizer3D_setBrightness")
	public static final void Rasterizer3D_setBrightness(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 108
	} // L: 109

	@ObfuscatedName("e")
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

	@ObfuscatedName("p")
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

	@ObfuscatedName("j")
	public static void method4210(int var0, int var1, int var2) {
		field2365 = var0 < 0 || var0 > Rasterizer3D_clipWidth || var1 < 0 || var1 > Rasterizer3D_clipWidth || var2 < 0 || var2 > Rasterizer3D_clipWidth; // L: 169
	} // L: 170

	@ObfuscatedName("b")
	static final void method4211(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	@ObfuscatedName("x")
	@Export("Rasterizer3D_vertAlpha")
	static final void Rasterizer3D_vertAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field2365) { // L: 537
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
			int var11;
			if (field2367) { // L: 544
				var3 = var5 - var4 >> 2; // L: 545
				var7 <<= 2; // L: 546
				if (Rasterizer3D_alpha == 0) { // L: 547
					if (var3 > 0) { // L: 548
						do {
							var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 550
							var2 = Rasterizer3D_colorPalette[var8]; // L: 551
							var6 += var7; // L: 552
							var0[var1++] = var2; // L: 553
							var0[var1++] = var2; // L: 554
							var0[var1++] = var2; // L: 555
							var0[var1++] = var2; // L: 556
							--var3; // L: 557
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 559
					if (var3 > 0) { // L: 560
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 561
						var2 = Rasterizer3D_colorPalette[var8]; // L: 562

						do {
							var0[var1++] = var2; // L: 564
							--var3; // L: 565
						} while(var3 > 0);
					}
				} else {
					var8 = Rasterizer3D_alpha; // L: 569
					var9 = 256 - Rasterizer3D_alpha; // L: 570
					if (var3 > 0) { // L: 571
						do {
							var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 573
							var2 = Rasterizer3D_colorPalette[var10]; // L: 574
							var6 += var7; // L: 575
							var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 576
							var11 = var0[var1]; // L: 577
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 578
							var11 = var0[var1]; // L: 579
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 580
							var11 = var0[var1]; // L: 581
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 582
							var11 = var0[var1]; // L: 583
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 584
							--var3; // L: 585
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 587
					if (var3 > 0) { // L: 588
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 589
						var2 = Rasterizer3D_colorPalette[var10]; // L: 590
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 591

						do {
							var11 = var0[var1]; // L: 593
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 594
							--var3; // L: 595
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4; // L: 601
				if (Rasterizer3D_alpha == 0) { // L: 602
					do {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 604
						var0[var1++] = Rasterizer3D_colorPalette[var8]; // L: 605
						var6 += var7; // L: 606
						--var3; // L: 607
					} while(var3 > 0);
				} else {
					var8 = Rasterizer3D_alpha; // L: 610
					var9 = 256 - Rasterizer3D_alpha; // L: 611

					do {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 613
						var2 = Rasterizer3D_colorPalette[var10]; // L: 614
						var6 += var7; // L: 615
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 616
						var11 = var0[var1]; // L: 617
						var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 618
						--var3; // L: 619
					} while(var3 > 0);
				}

			}
		}
	} // L: 598 621

	@ObfuscatedName("y")
	public static final void method4213(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 626
		if (var0 != var1) { // L: 627
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0; // L: 628
		if (var2 != var1) { // L: 629
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0; // L: 630
		if (var0 != var2) { // L: 631
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) { // L: 632
			if (var0 < Rasterizer3D_clipHeight) { // L: 633
				if (var1 > Rasterizer3D_clipHeight) { // L: 634
					var1 = Rasterizer3D_clipHeight;
				}

				if (var2 > Rasterizer3D_clipHeight) { // L: 635
					var2 = Rasterizer3D_clipHeight;
				}

				if (var1 < var2) { // L: 636
					var5 = var3 <<= 14; // L: 637
					if (var0 < 0) { // L: 638
						var5 -= var0 * var9; // L: 639
						var3 -= var0 * var7; // L: 640
						var0 = 0; // L: 641
					}

					var4 <<= 14; // L: 643
					if (var1 < 0) { // L: 644
						var4 -= var8 * var1; // L: 645
						var1 = 0; // L: 646
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) { // L: 648
						var2 -= var1; // L: 649
						var1 -= var0; // L: 650
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 651

						while (true) {
							--var1; // L: 652
							if (var1 < 0) {
								while (true) {
									--var2; // L: 658
									if (var2 < 0) {
										return; // L: 664
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var4 >> 14); // L: 659
									var5 += var9; // L: 660
									var4 += var8; // L: 661
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 662
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 653
							var5 += var9; // L: 654
							var3 += var7; // L: 655
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 656
						}
					} else {
						var2 -= var1; // L: 667
						var1 -= var0; // L: 668
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 669

						while (true) {
							--var1; // L: 670
							if (var1 < 0) {
								while (true) {
									--var2; // L: 676
									if (var2 < 0) {
										return; // L: 682
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var5 >> 14); // L: 677
									var5 += var9; // L: 678
									var4 += var8; // L: 679
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 680
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 671
							var5 += var9; // L: 672
							var3 += var7; // L: 673
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 674
						}
					}
				} else {
					var4 = var3 <<= 14; // L: 686
					if (var0 < 0) { // L: 687
						var4 -= var0 * var9; // L: 688
						var3 -= var0 * var7; // L: 689
						var0 = 0; // L: 690
					}

					var5 <<= 14; // L: 692
					if (var2 < 0) { // L: 693
						var5 -= var8 * var2; // L: 694
						var2 = 0; // L: 695
					}

					if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) { // L: 697
						var1 -= var2; // L: 716
						var2 -= var0; // L: 717
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 718

						while (true) {
							--var2; // L: 719
							if (var2 < 0) {
								while (true) {
									--var1; // L: 725
									if (var1 < 0) {
										return; // L: 731
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 726
									var5 += var8; // L: 727
									var3 += var7; // L: 728
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 729
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var4 >> 14); // L: 720
							var4 += var9; // L: 721
							var3 += var7; // L: 722
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 723
						}
					} else {
						var1 -= var2; // L: 698
						var2 -= var0; // L: 699
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 700

						while (true) {
							--var2; // L: 701
							if (var2 < 0) {
								while (true) {
									--var1; // L: 707
									if (var1 < 0) {
										return; // L: 713
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 708
									var5 += var8; // L: 709
									var3 += var7; // L: 710
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 711
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var3 >> 14); // L: 702
							var4 += var9; // L: 703
							var3 += var7; // L: 704
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 705
						}
					}
				}
			}
		} else if (var1 <= var2) { // L: 735
			if (var1 < Rasterizer3D_clipHeight) { // L: 736
				if (var2 > Rasterizer3D_clipHeight) { // L: 737
					var2 = Rasterizer3D_clipHeight;
				}

				if (var0 > Rasterizer3D_clipHeight) { // L: 738
					var0 = Rasterizer3D_clipHeight;
				}

				if (var2 < var0) { // L: 739
					var3 = var4 <<= 14; // L: 740
					if (var1 < 0) { // L: 741
						var3 -= var7 * var1; // L: 742
						var4 -= var8 * var1; // L: 743
						var1 = 0; // L: 744
					}

					var5 <<= 14; // L: 746
					if (var2 < 0) { // L: 747
						var5 -= var9 * var2; // L: 748
						var2 = 0; // L: 749
					}

					if (var2 != var1 && var7 < var8 || var2 == var1 && var7 > var9) { // L: 751
						var0 -= var2; // L: 752
						var2 -= var1; // L: 753
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 754

						while (true) {
							--var2; // L: 755
							if (var2 < 0) {
								while (true) {
									--var0; // L: 761
									if (var0 < 0) {
										return; // L: 767
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var5 >> 14); // L: 762
									var3 += var7; // L: 763
									var5 += var9; // L: 764
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 765
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 756
							var3 += var7; // L: 757
							var4 += var8; // L: 758
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 759
						}
					} else {
						var0 -= var2; // L: 770
						var2 -= var1; // L: 771
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 772

						while (true) {
							--var2; // L: 773
							if (var2 < 0) {
								while (true) {
									--var0; // L: 779
									if (var0 < 0) {
										return; // L: 785
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var3 >> 14); // L: 780
									var3 += var7; // L: 781
									var5 += var9; // L: 782
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 783
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 774
							var3 += var7; // L: 775
							var4 += var8; // L: 776
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 777
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 789
					if (var1 < 0) { // L: 790
						var5 -= var7 * var1; // L: 791
						var4 -= var8 * var1; // L: 792
						var1 = 0; // L: 793
					}

					var3 <<= 14; // L: 795
					if (var0 < 0) { // L: 796
						var3 -= var0 * var9; // L: 797
						var0 = 0; // L: 798
					}

					if (var7 < var8) { // L: 800
						var2 -= var0; // L: 801
						var0 -= var1; // L: 802
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 803

						while (true) {
							--var0; // L: 804
							if (var0 < 0) {
								while (true) {
									--var2; // L: 810
									if (var2 < 0) {
										return; // L: 816
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 811
									var3 += var9; // L: 812
									var4 += var8; // L: 813
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 814
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var4 >> 14); // L: 805
							var5 += var7; // L: 806
							var4 += var8; // L: 807
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 808
						}
					} else {
						var2 -= var0; // L: 819
						var0 -= var1; // L: 820
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 821

						while (true) {
							--var0; // L: 822
							if (var0 < 0) {
								while (true) {
									--var2; // L: 828
									if (var2 < 0) {
										return; // L: 834
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 829
									var3 += var9; // L: 830
									var4 += var8; // L: 831
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 832
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var5 >> 14); // L: 823
							var5 += var7; // L: 824
							var4 += var8; // L: 825
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 826
						}
					}
				}
			}
		} else if (var2 < Rasterizer3D_clipHeight) { // L: 839
			if (var0 > Rasterizer3D_clipHeight) { // L: 840
				var0 = Rasterizer3D_clipHeight;
			}

			if (var1 > Rasterizer3D_clipHeight) { // L: 841
				var1 = Rasterizer3D_clipHeight;
			}

			if (var0 < var1) { // L: 842
				var4 = var5 <<= 14; // L: 843
				if (var2 < 0) { // L: 844
					var4 -= var8 * var2; // L: 845
					var5 -= var9 * var2; // L: 846
					var2 = 0; // L: 847
				}

				var3 <<= 14; // L: 849
				if (var0 < 0) { // L: 850
					var3 -= var0 * var7; // L: 851
					var0 = 0; // L: 852
				}

				if (var8 < var9) { // L: 854
					var1 -= var0; // L: 855
					var0 -= var2; // L: 856
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 857

					while (true) {
						--var0; // L: 858
						if (var0 < 0) {
							while (true) {
								--var1; // L: 864
								if (var1 < 0) {
									return; // L: 870
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var3 >> 14); // L: 865
								var4 += var8; // L: 866
								var3 += var7; // L: 867
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 868
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 859
						var4 += var8; // L: 860
						var5 += var9; // L: 861
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 862
					}
				} else {
					var1 -= var0; // L: 873
					var0 -= var2; // L: 874
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 875

					while (true) {
						--var0; // L: 876
						if (var0 < 0) {
							while (true) {
								--var1; // L: 882
								if (var1 < 0) {
									return; // L: 888
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var4 >> 14); // L: 883
								var4 += var8; // L: 884
								var3 += var7; // L: 885
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 886
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 877
						var4 += var8; // L: 878
						var5 += var9; // L: 879
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 880
					}
				}
			} else {
				var3 = var5 <<= 14; // L: 892
				if (var2 < 0) { // L: 893
					var3 -= var8 * var2; // L: 894
					var5 -= var9 * var2; // L: 895
					var2 = 0; // L: 896
				}

				var4 <<= 14; // L: 898
				if (var1 < 0) { // L: 899
					var4 -= var7 * var1; // L: 900
					var1 = 0; // L: 901
				}

				if (var8 < var9) { // L: 903
					var0 -= var1; // L: 904
					var1 -= var2; // L: 905
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 906

					while (true) {
						--var1; // L: 907
						if (var1 < 0) {
							while (true) {
								--var0; // L: 913
								if (var0 < 0) {
									return; // L: 919
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 914
								var4 += var7; // L: 915
								var5 += var9; // L: 916
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 917
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var5 >> 14); // L: 908
						var3 += var8; // L: 909
						var5 += var9; // L: 910
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 911
					}
				} else {
					var0 -= var1; // L: 922
					var1 -= var2; // L: 923
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 924

					while (true) {
						--var1; // L: 925
						if (var1 < 0) {
							while (true) {
								--var0; // L: 931
								if (var0 < 0) {
									return; // L: 937
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 932
								var4 += var7; // L: 933
								var5 += var9; // L: 934
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 935
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var3 >> 14); // L: 926
						var3 += var8; // L: 927
						var5 += var9; // L: 928
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 929
					}
				}
			}
		}
	}

	@ObfuscatedName("k")
	@Export("Rasterizer3D_horizAlpha")
	static final void Rasterizer3D_horizAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field2365) { // L: 944
			if (var5 > Rasterizer3D_clipWidth) { // L: 945
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 946
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 948
			var1 += var4; // L: 949
			var3 = var5 - var4 >> 2; // L: 950
			if (Rasterizer3D_alpha != 0) { // L: 951
				if (Rasterizer3D_alpha == 254) { // L: 963
					while (true) {
						--var3; // L: 964
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 970

							while (true) {
								--var3; // L: 971
								if (var3 < 0) {
									return; // L: 995
								}

								var0[var1++] = var0[var1]; // L: 972
							}
						}

						var0[var1++] = var0[var1]; // L: 965
						var0[var1++] = var0[var1]; // L: 966
						var0[var1++] = var0[var1]; // L: 967
						var0[var1++] = var0[var1]; // L: 968
					}
				} else {
					int var6 = Rasterizer3D_alpha; // L: 976
					int var7 = 256 - Rasterizer3D_alpha; // L: 977
					var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935); // L: 978

					while (true) {
						--var3; // L: 979
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 989

							while (true) {
								--var3; // L: 990
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1]; // L: 991
								var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 992
							}
						}

						var8 = var0[var1]; // L: 980
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 981
						var8 = var0[var1]; // L: 982
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 983
						var8 = var0[var1]; // L: 984
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 985
						var8 = var0[var1]; // L: 986
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 987
					}
				}
			} else {
				while (true) {
					--var3; // L: 952
					if (var3 < 0) {
						var3 = var5 - var4 & 3; // L: 958

						while (true) {
							--var3; // L: 959
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2; // L: 960
						}
					}

					var0[var1++] = var2; // L: 953
					var0[var1++] = var2; // L: 954
					var0[var1++] = var2; // L: 955
					var0[var1++] = var2; // L: 956
				}
			}
		}
	}

	@ObfuscatedName("t")
	static final void method4215(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 998
		int var20;
		if (var19 == null) { // L: 999
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1000
			method4211(var0, var1, var2, var3, var4, var5, method4246(var20, var6), method4246(var20, var7), method4246(var20, var8)); // L: 1001
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1004
			field2344 = Rasterizer3D_textureLoader.vmethod4636(var18); // L: 1005
			var20 = var4 - var3; // L: 1006
			int var21 = var1 - var0; // L: 1007
			int var22 = var5 - var3; // L: 1008
			int var23 = var2 - var0; // L: 1009
			int var24 = var7 - var6; // L: 1010
			int var25 = var8 - var6; // L: 1011
			int var26 = 0; // L: 1012
			if (var0 != var1) { // L: 1013
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1014
			if (var2 != var1) { // L: 1015
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1016
			if (var0 != var2) { // L: 1017
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1018
			if (var29 != 0) { // L: 1019
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1020
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1021
				var10 = var9 - var10; // L: 1022
				var13 = var12 - var13; // L: 1023
				var16 = var15 - var16; // L: 1024
				var11 -= var9; // L: 1025
				var14 -= var12; // L: 1026
				var17 -= var15; // L: 1027
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1028
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1029
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1030
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1031
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1032
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1033
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1034
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1035
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1036
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1037
					if (var0 < Rasterizer3D_clipHeight) { // L: 1038
						if (var1 > Rasterizer3D_clipHeight) { // L: 1039
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1040
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1041
						if (var1 < var2) { // L: 1042
							var5 = var3 <<= 14; // L: 1043
							if (var0 < 0) { // L: 1044
								var5 -= var0 * var28; // L: 1045
								var3 -= var0 * var26; // L: 1046
								var6 -= var0 * var31; // L: 1047
								var0 = 0; // L: 1048
							}

							var4 <<= 14; // L: 1050
							if (var1 < 0) { // L: 1051
								var4 -= var27 * var1; // L: 1052
								var1 = 0; // L: 1053
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1055
							var32 += var34 * var41; // L: 1056
							var35 += var37 * var41; // L: 1057
							var38 += var40 * var41; // L: 1058
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) { // L: 1059
								var2 -= var1; // L: 1086
								var1 -= var0; // L: 1087
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1088

								while (true) {
									--var1; // L: 1089
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1099
											if (var2 < 0) {
												return; // L: 1109
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1100
											var5 += var28; // L: 1101
											var4 += var27; // L: 1102
											var6 += var31; // L: 1103
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1104
											var32 += var34; // L: 1105
											var35 += var37; // L: 1106
											var38 += var40; // L: 1107
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1090
									var5 += var28; // L: 1091
									var3 += var26; // L: 1092
									var6 += var31; // L: 1093
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1094
									var32 += var34; // L: 1095
									var35 += var37; // L: 1096
									var38 += var40; // L: 1097
								}
							} else {
								var2 -= var1; // L: 1060
								var1 -= var0; // L: 1061
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1062

								while (true) {
									--var1; // L: 1063
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1073
											if (var2 < 0) {
												return; // L: 1083
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1074
											var5 += var28; // L: 1075
											var4 += var27; // L: 1076
											var6 += var31; // L: 1077
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1078
											var32 += var34; // L: 1079
											var35 += var37; // L: 1080
											var38 += var40; // L: 1081
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1064
									var5 += var28; // L: 1065
									var3 += var26; // L: 1066
									var6 += var31; // L: 1067
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1068
									var32 += var34; // L: 1069
									var35 += var37; // L: 1070
									var38 += var40; // L: 1071
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1113
							if (var0 < 0) { // L: 1114
								var4 -= var0 * var28; // L: 1115
								var3 -= var0 * var26; // L: 1116
								var6 -= var0 * var31; // L: 1117
								var0 = 0; // L: 1118
							}

							var5 <<= 14; // L: 1120
							if (var2 < 0) { // L: 1121
								var5 -= var27 * var2; // L: 1122
								var2 = 0; // L: 1123
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1125
							var32 += var34 * var41; // L: 1126
							var35 += var37 * var41; // L: 1127
							var38 += var40 * var41; // L: 1128
							if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) { // L: 1129
								var1 -= var2; // L: 1130
								var2 -= var0; // L: 1131
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1132

								while (true) {
									--var2; // L: 1133
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1143
											if (var1 < 0) {
												return; // L: 1153
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1144
											var5 += var27; // L: 1145
											var3 += var26; // L: 1146
											var6 += var31; // L: 1147
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1148
											var32 += var34; // L: 1149
											var35 += var37; // L: 1150
											var38 += var40; // L: 1151
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1134
									var4 += var28; // L: 1135
									var3 += var26; // L: 1136
									var6 += var31; // L: 1137
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1138
									var32 += var34; // L: 1139
									var35 += var37; // L: 1140
									var38 += var40; // L: 1141
								}
							} else {
								var1 -= var2; // L: 1156
								var2 -= var0; // L: 1157
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1158

								while (true) {
									--var2; // L: 1159
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1169
											if (var1 < 0) {
												return; // L: 1179
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1170
											var5 += var27; // L: 1171
											var3 += var26; // L: 1172
											var6 += var31; // L: 1173
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1174
											var32 += var34; // L: 1175
											var35 += var37; // L: 1176
											var38 += var40; // L: 1177
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1160
									var4 += var28; // L: 1161
									var3 += var26; // L: 1162
									var6 += var31; // L: 1163
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1164
									var32 += var34; // L: 1165
									var35 += var37; // L: 1166
									var38 += var40; // L: 1167
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 1183
					if (var1 < Rasterizer3D_clipHeight) { // L: 1184
						if (var2 > Rasterizer3D_clipHeight) { // L: 1185
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 1186
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 1187
						if (var2 < var0) { // L: 1188
							var3 = var4 <<= 14; // L: 1189
							if (var1 < 0) { // L: 1190
								var3 -= var26 * var1; // L: 1191
								var4 -= var27 * var1; // L: 1192
								var7 -= var31 * var1; // L: 1193
								var1 = 0; // L: 1194
							}

							var5 <<= 14; // L: 1196
							if (var2 < 0) { // L: 1197
								var5 -= var28 * var2; // L: 1198
								var2 = 0; // L: 1199
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1201
							var32 += var34 * var41; // L: 1202
							var35 += var37 * var41; // L: 1203
							var38 += var40 * var41; // L: 1204
							if ((var2 == var1 || var26 >= var27) && (var2 != var1 || var26 <= var28)) { // L: 1205
								var0 -= var2; // L: 1232
								var2 -= var1; // L: 1233
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1234

								while (true) {
									--var2; // L: 1235
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1245
											if (var0 < 0) {
												return; // L: 1255
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1246
											var3 += var26; // L: 1247
											var5 += var28; // L: 1248
											var7 += var31; // L: 1249
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1250
											var32 += var34; // L: 1251
											var35 += var37; // L: 1252
											var38 += var40; // L: 1253
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1236
									var3 += var26; // L: 1237
									var4 += var27; // L: 1238
									var7 += var31; // L: 1239
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1240
									var32 += var34; // L: 1241
									var35 += var37; // L: 1242
									var38 += var40; // L: 1243
								}
							} else {
								var0 -= var2; // L: 1206
								var2 -= var1; // L: 1207
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1208

								while (true) {
									--var2; // L: 1209
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1219
											if (var0 < 0) {
												return; // L: 1229
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1220
											var3 += var26; // L: 1221
											var5 += var28; // L: 1222
											var7 += var31; // L: 1223
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1224
											var32 += var34; // L: 1225
											var35 += var37; // L: 1226
											var38 += var40; // L: 1227
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1210
									var3 += var26; // L: 1211
									var4 += var27; // L: 1212
									var7 += var31; // L: 1213
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1214
									var32 += var34; // L: 1215
									var35 += var37; // L: 1216
									var38 += var40; // L: 1217
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1259
							if (var1 < 0) { // L: 1260
								var5 -= var26 * var1; // L: 1261
								var4 -= var27 * var1; // L: 1262
								var7 -= var31 * var1; // L: 1263
								var1 = 0; // L: 1264
							}

							var3 <<= 14; // L: 1266
							if (var0 < 0) { // L: 1267
								var3 -= var0 * var28; // L: 1268
								var0 = 0; // L: 1269
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1271
							var32 += var34 * var41; // L: 1272
							var35 += var37 * var41; // L: 1273
							var38 += var40 * var41; // L: 1274
							if (var26 < var27) { // L: 1275
								var2 -= var0; // L: 1276
								var0 -= var1; // L: 1277
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1278

								while (true) {
									--var0; // L: 1279
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1289
											if (var2 < 0) {
												return; // L: 1299
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1290
											var3 += var28; // L: 1291
											var4 += var27; // L: 1292
											var7 += var31; // L: 1293
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1294
											var32 += var34; // L: 1295
											var35 += var37; // L: 1296
											var38 += var40; // L: 1297
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1280
									var5 += var26; // L: 1281
									var4 += var27; // L: 1282
									var7 += var31; // L: 1283
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1284
									var32 += var34; // L: 1285
									var35 += var37; // L: 1286
									var38 += var40; // L: 1287
								}
							} else {
								var2 -= var0; // L: 1302
								var0 -= var1; // L: 1303
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1304

								while (true) {
									--var0; // L: 1305
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1315
											if (var2 < 0) {
												return; // L: 1325
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1316
											var3 += var28; // L: 1317
											var4 += var27; // L: 1318
											var7 += var31; // L: 1319
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1320
											var32 += var34; // L: 1321
											var35 += var37; // L: 1322
											var38 += var40; // L: 1323
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1306
									var5 += var26; // L: 1307
									var4 += var27; // L: 1308
									var7 += var31; // L: 1309
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1310
									var32 += var34; // L: 1311
									var35 += var37; // L: 1312
									var38 += var40; // L: 1313
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 1330
					if (var0 > Rasterizer3D_clipHeight) { // L: 1331
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 1332
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 1333
					if (var0 < var1) { // L: 1334
						var4 = var5 <<= 14; // L: 1335
						if (var2 < 0) { // L: 1336
							var4 -= var27 * var2; // L: 1337
							var5 -= var28 * var2; // L: 1338
							var8 -= var31 * var2; // L: 1339
							var2 = 0; // L: 1340
						}

						var3 <<= 14; // L: 1342
						if (var0 < 0) { // L: 1343
							var3 -= var0 * var26; // L: 1344
							var0 = 0; // L: 1345
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1347
						var32 += var34 * var41; // L: 1348
						var35 += var37 * var41; // L: 1349
						var38 += var40 * var41; // L: 1350
						if (var27 < var28) { // L: 1351
							var1 -= var0; // L: 1352
							var0 -= var2; // L: 1353
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1354

							while (true) {
								--var0; // L: 1355
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1365
										if (var1 < 0) {
											return; // L: 1375
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1366
										var4 += var27; // L: 1367
										var3 += var26; // L: 1368
										var8 += var31; // L: 1369
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1370
										var32 += var34; // L: 1371
										var35 += var37; // L: 1372
										var38 += var40; // L: 1373
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1356
								var4 += var27; // L: 1357
								var5 += var28; // L: 1358
								var8 += var31; // L: 1359
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1360
								var32 += var34; // L: 1361
								var35 += var37; // L: 1362
								var38 += var40; // L: 1363
							}
						} else {
							var1 -= var0; // L: 1378
							var0 -= var2; // L: 1379
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1380

							while (true) {
								--var0; // L: 1381
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1391
										if (var1 < 0) {
											return; // L: 1401
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1392
										var4 += var27; // L: 1393
										var3 += var26; // L: 1394
										var8 += var31; // L: 1395
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1396
										var32 += var34; // L: 1397
										var35 += var37; // L: 1398
										var38 += var40; // L: 1399
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1382
								var4 += var27; // L: 1383
								var5 += var28; // L: 1384
								var8 += var31; // L: 1385
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1386
								var32 += var34; // L: 1387
								var35 += var37; // L: 1388
								var38 += var40; // L: 1389
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 1405
						if (var2 < 0) { // L: 1406
							var3 -= var27 * var2; // L: 1407
							var5 -= var28 * var2; // L: 1408
							var8 -= var31 * var2; // L: 1409
							var2 = 0; // L: 1410
						}

						var4 <<= 14; // L: 1412
						if (var1 < 0) { // L: 1413
							var4 -= var26 * var1; // L: 1414
							var1 = 0; // L: 1415
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1417
						var32 += var34 * var41; // L: 1418
						var35 += var37 * var41; // L: 1419
						var38 += var40 * var41; // L: 1420
						if (var27 < var28) { // L: 1421
							var0 -= var1; // L: 1422
							var1 -= var2; // L: 1423
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1424

							while (true) {
								--var1; // L: 1425
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1435
										if (var0 < 0) {
											return; // L: 1445
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1436
										var4 += var26; // L: 1437
										var5 += var28; // L: 1438
										var8 += var31; // L: 1439
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1440
										var32 += var34; // L: 1441
										var35 += var37; // L: 1442
										var38 += var40; // L: 1443
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1426
								var3 += var27; // L: 1427
								var5 += var28; // L: 1428
								var8 += var31; // L: 1429
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1430
								var32 += var34; // L: 1431
								var35 += var37; // L: 1432
								var38 += var40; // L: 1433
							}
						} else {
							var0 -= var1; // L: 1448
							var1 -= var2; // L: 1449
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1450

							while (true) {
								--var1; // L: 1451
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1461
										if (var0 < 0) {
											return; // L: 1471
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1462
										var4 += var26; // L: 1463
										var5 += var28; // L: 1464
										var8 += var31; // L: 1465
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1466
										var32 += var34; // L: 1467
										var35 += var37; // L: 1468
										var38 += var40; // L: 1469
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1452
								var3 += var27; // L: 1453
								var5 += var28; // L: 1454
								var8 += var31; // L: 1455
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1456
								var32 += var34; // L: 1457
								var35 += var37; // L: 1458
								var38 += var40; // L: 1459
							}
						}
					}
				}
			}
		}
	} // L: 1002

	@ObfuscatedName("l")
	@Export("Rasterizer3D_iDontKnow")
	static final void Rasterizer3D_iDontKnow(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2365) { // L: 1480
			if (var6 > Rasterizer3D_clipWidth) { // L: 1481
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 1482
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 1484
			var4 += var5; // L: 1485
			var7 += var5 * var8; // L: 1486
			int var17 = var6 - var5; // L: 1487
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 1488
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1494
				var9 += var23 * (var12 >> 3); // L: 1495
				var10 += (var13 >> 3) * var23; // L: 1496
				var11 += var23 * (var14 >> 3); // L: 1497
				var22 = var11 >> 12; // L: 1498
				if (var22 != 0) { // L: 1499
					var18 = var9 / var22; // L: 1500
					var19 = var10 / var22; // L: 1501
					if (var18 < 0) { // L: 1502
						var18 = 0;
					} else if (var18 > 4032) { // L: 1503
						var18 = 4032;
					}
				} else {
					var18 = 0; // L: 1506
					var19 = 0; // L: 1507
				}

				var9 += var12; // L: 1509
				var10 += var13; // L: 1510
				var11 += var14; // L: 1511
				var22 = var11 >> 12; // L: 1512
				if (var22 != 0) { // L: 1513
					var20 = var9 / var22; // L: 1514
					var21 = var10 / var22; // L: 1515
					if (var20 < 0) { // L: 1516
						var20 = 0;
					} else if (var20 > 4032) { // L: 1517
						var20 = 4032;
					}
				} else {
					var20 = 0; // L: 1520
					var21 = 0; // L: 1521
				}

				var2 = (var18 << 20) + var19; // L: 1523
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1524
				var17 >>= 3; // L: 1525
				var8 <<= 3; // L: 1526
				var15 = var7 >> 8; // L: 1527
				if (field2344) { // L: 1528
					if (var17 > 0) { // L: 1529
						do {
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
							var2 += var16; // L: 1548
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1549
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1550
							var2 += var16; // L: 1551
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1552
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1553
							var10000 = var16 + var2; // L: 1554
							var18 = var20; // L: 1555
							var19 = var21; // L: 1556
							var9 += var12; // L: 1557
							var10 += var13; // L: 1558
							var11 += var14; // L: 1559
							var22 = var11 >> 12; // L: 1560
							if (var22 != 0) { // L: 1561
								var20 = var9 / var22; // L: 1562
								var21 = var10 / var22; // L: 1563
								if (var20 < 0) { // L: 1564
									var20 = 0;
								} else if (var20 > 4032) { // L: 1565
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1568
								var21 = 0; // L: 1569
							}

							var2 = (var18 << 20) + var19; // L: 1571
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1572
							var7 += var8; // L: 1573
							var15 = var7 >> 8; // L: 1574
							--var17; // L: 1575
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1577
					if (var17 > 0) { // L: 1578
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1580
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1581
							var2 += var16; // L: 1582
							--var17; // L: 1583
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1587
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1589
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1590
							}

							++var4; // L: 1592
							var2 += var16; // L: 1593
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1594
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1595
							}

							++var4; // L: 1597
							var2 += var16; // L: 1598
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1599
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1600
							}

							++var4; // L: 1602
							var2 += var16; // L: 1603
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1604
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1605
							}

							++var4; // L: 1607
							var2 += var16; // L: 1608
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1609
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1610
							}

							++var4; // L: 1612
							var2 += var16; // L: 1613
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1614
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1615
							}

							++var4; // L: 1617
							var2 += var16; // L: 1618
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1619
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1620
							}

							++var4; // L: 1622
							var2 += var16; // L: 1623
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1624
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1625
							}

							++var4; // L: 1627
							var10000 = var16 + var2; // L: 1628
							var18 = var20; // L: 1629
							var19 = var21; // L: 1630
							var9 += var12; // L: 1631
							var10 += var13; // L: 1632
							var11 += var14; // L: 1633
							var22 = var11 >> 12; // L: 1634
							if (var22 != 0) { // L: 1635
								var20 = var9 / var22; // L: 1636
								var21 = var10 / var22; // L: 1637
								if (var20 < 0) { // L: 1638
									var20 = 0;
								} else if (var20 > 4032) { // L: 1639
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1642
								var21 = 0; // L: 1643
							}

							var2 = (var18 << 20) + var19; // L: 1645
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1646
							var7 += var8; // L: 1647
							var15 = var7 >> 8; // L: 1648
							--var17; // L: 1649
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1651
					if (var17 > 0) { // L: 1652
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1654
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1655
							}

							++var4; // L: 1657
							var2 += var16; // L: 1658
							--var17; // L: 1659
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1669
				var9 += var23 * (var12 >> 3); // L: 1670
				var10 += (var13 >> 3) * var23; // L: 1671
				var11 += var23 * (var14 >> 3); // L: 1672
				var22 = var11 >> 14; // L: 1673
				if (var22 != 0) { // L: 1674
					var18 = var9 / var22; // L: 1675
					var19 = var10 / var22; // L: 1676
					if (var18 < 0) { // L: 1677
						var18 = 0;
					} else if (var18 > 16256) { // L: 1678
						var18 = 16256;
					}
				} else {
					var18 = 0; // L: 1681
					var19 = 0; // L: 1682
				}

				var9 += var12; // L: 1684
				var10 += var13; // L: 1685
				var11 += var14; // L: 1686
				var22 = var11 >> 14; // L: 1687
				if (var22 != 0) { // L: 1688
					var20 = var9 / var22; // L: 1689
					var21 = var10 / var22; // L: 1690
					if (var20 < 0) { // L: 1691
						var20 = 0;
					} else if (var20 > 16256) { // L: 1692
						var20 = 16256;
					}
				} else {
					var20 = 0; // L: 1695
					var21 = 0; // L: 1696
				}

				var2 = (var18 << 18) + var19; // L: 1698
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1699
				var17 >>= 3; // L: 1700
				var8 <<= 3; // L: 1701
				var15 = var7 >> 8; // L: 1702
				if (field2344) { // L: 1703
					if (var17 > 0) { // L: 1704
						do {
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
							var2 += var16; // L: 1723
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1724
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1725
							var2 += var16; // L: 1726
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1727
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1728
							var10000 = var16 + var2; // L: 1729
							var18 = var20; // L: 1730
							var19 = var21; // L: 1731
							var9 += var12; // L: 1732
							var10 += var13; // L: 1733
							var11 += var14; // L: 1734
							var22 = var11 >> 14; // L: 1735
							if (var22 != 0) { // L: 1736
								var20 = var9 / var22; // L: 1737
								var21 = var10 / var22; // L: 1738
								if (var20 < 0) { // L: 1739
									var20 = 0;
								} else if (var20 > 16256) { // L: 1740
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1743
								var21 = 0; // L: 1744
							}

							var2 = (var18 << 18) + var19; // L: 1746
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1747
							var7 += var8; // L: 1748
							var15 = var7 >> 8; // L: 1749
							--var17; // L: 1750
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1752
					if (var17 > 0) { // L: 1753
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1755
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1756
							var2 += var16; // L: 1757
							--var17; // L: 1758
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1762
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1764
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1765
							}

							++var4; // L: 1767
							var2 += var16; // L: 1768
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1769
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1770
							}

							++var4; // L: 1772
							var2 += var16; // L: 1773
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1774
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1775
							}

							++var4; // L: 1777
							var2 += var16; // L: 1778
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1779
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1780
							}

							++var4; // L: 1782
							var2 += var16; // L: 1783
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1784
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1785
							}

							++var4; // L: 1787
							var2 += var16; // L: 1788
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1789
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1790
							}

							++var4; // L: 1792
							var2 += var16; // L: 1793
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1794
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1795
							}

							++var4; // L: 1797
							var2 += var16; // L: 1798
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1799
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1800
							}

							++var4; // L: 1802
							var10000 = var16 + var2; // L: 1803
							var18 = var20; // L: 1804
							var19 = var21; // L: 1805
							var9 += var12; // L: 1806
							var10 += var13; // L: 1807
							var11 += var14; // L: 1808
							var22 = var11 >> 14; // L: 1809
							if (var22 != 0) { // L: 1810
								var20 = var9 / var22; // L: 1811
								var21 = var10 / var22; // L: 1812
								if (var20 < 0) { // L: 1813
									var20 = 0;
								} else if (var20 > 16256) { // L: 1814
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1817
								var21 = 0; // L: 1818
							}

							var2 = (var18 << 18) + var19; // L: 1820
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1821
							var7 += var8; // L: 1822
							var15 = var7 >> 8; // L: 1823
							--var17; // L: 1824
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1826
					if (var17 > 0) { // L: 1827
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1829
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1830
							}

							++var4; // L: 1832
							var2 += var16; // L: 1833
							--var17; // L: 1834
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 1838

	@ObfuscatedName("u")
	@Export("drawTexturedTile")
	static final void drawTexturedTile(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1841
		int var20;
		if (var19 == null) { // L: 1842
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1843
			method4211(var0, var1, var2, var3, var4, var5, method4246(var20, var6), method4246(var20, var7), method4246(var20, var8)); // L: 1844
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1847
			field2344 = Rasterizer3D_textureLoader.vmethod4636(var18); // L: 1848
			var20 = var4 - var3; // L: 1849
			int var21 = var1 - var0; // L: 1850
			int var22 = var5 - var3; // L: 1851
			int var23 = var2 - var0; // L: 1852
			int var24 = var7 - var6; // L: 1853
			int var25 = var8 - var6; // L: 1854
			int var26 = 0; // L: 1855
			if (var0 != var1) { // L: 1856
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1857
			if (var2 != var1) { // L: 1858
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1859
			if (var0 != var2) { // L: 1860
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1861
			if (var29 != 0) { // L: 1862
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1863
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1864
				var10 = var9 - var10; // L: 1865
				var13 = var12 - var13; // L: 1866
				var16 = var15 - var16; // L: 1867
				var11 -= var9; // L: 1868
				var14 -= var12; // L: 1869
				var17 -= var15; // L: 1870
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1871
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1872
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1873
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1874
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1875
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1876
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1877
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)Rasterizer3D_zoom); // L: 1878
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1879
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1880
					if (var0 < Rasterizer3D_clipHeight) { // L: 1881
						if (var1 > Rasterizer3D_clipHeight) { // L: 1882
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1883
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1884
						if (var1 < var2) { // L: 1885
							var5 = var3 <<= 14; // L: 1886
							if (var0 < 0) { // L: 1887
								var5 -= var0 * var28; // L: 1888
								var3 -= var0 * var26; // L: 1889
								var6 -= var0 * var31; // L: 1890
								var0 = 0; // L: 1891
							}

							var4 <<= 14; // L: 1893
							if (var1 < 0) { // L: 1894
								var4 -= var27 * var1; // L: 1895
								var1 = 0; // L: 1896
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1898
							var32 += var34 * var41; // L: 1899
							var35 += var37 * var41; // L: 1900
							var38 += var40 * var41; // L: 1901
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) { // L: 1902
								var2 -= var1; // L: 1903
								var1 -= var0; // L: 1904
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1905

								while (true) {
									--var1; // L: 1906
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1916
											if (var2 < 0) {
												return; // L: 1926
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1917
											var5 += var28; // L: 1918
											var4 += var27; // L: 1919
											var6 += var31; // L: 1920
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1921
											var32 += var34; // L: 1922
											var35 += var37; // L: 1923
											var38 += var40; // L: 1924
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1907
									var5 += var28; // L: 1908
									var3 += var26; // L: 1909
									var6 += var31; // L: 1910
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1911
									var32 += var34; // L: 1912
									var35 += var37; // L: 1913
									var38 += var40; // L: 1914
								}
							} else {
								var2 -= var1; // L: 1929
								var1 -= var0; // L: 1930
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1931

								while (true) {
									--var1; // L: 1932
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1942
											if (var2 < 0) {
												return; // L: 1952
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1943
											var5 += var28; // L: 1944
											var4 += var27; // L: 1945
											var6 += var31; // L: 1946
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1947
											var32 += var34; // L: 1948
											var35 += var37; // L: 1949
											var38 += var40; // L: 1950
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1933
									var5 += var28; // L: 1934
									var3 += var26; // L: 1935
									var6 += var31; // L: 1936
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1937
									var32 += var34; // L: 1938
									var35 += var37; // L: 1939
									var38 += var40; // L: 1940
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1956
							if (var0 < 0) { // L: 1957
								var4 -= var0 * var28; // L: 1958
								var3 -= var0 * var26; // L: 1959
								var6 -= var0 * var31; // L: 1960
								var0 = 0; // L: 1961
							}

							var5 <<= 14; // L: 1963
							if (var2 < 0) { // L: 1964
								var5 -= var27 * var2; // L: 1965
								var2 = 0; // L: 1966
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1968
							var32 += var34 * var41; // L: 1969
							var35 += var37 * var41; // L: 1970
							var38 += var40 * var41; // L: 1971
							if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) { // L: 1972
								var1 -= var2; // L: 1973
								var2 -= var0; // L: 1974
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1975

								while (true) {
									--var2; // L: 1976
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1986
											if (var1 < 0) {
												return; // L: 1996
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1987
											var5 += var27; // L: 1988
											var3 += var26; // L: 1989
											var6 += var31; // L: 1990
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1991
											var32 += var34; // L: 1992
											var35 += var37; // L: 1993
											var38 += var40; // L: 1994
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1977
									var4 += var28; // L: 1978
									var3 += var26; // L: 1979
									var6 += var31; // L: 1980
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1981
									var32 += var34; // L: 1982
									var35 += var37; // L: 1983
									var38 += var40; // L: 1984
								}
							} else {
								var1 -= var2; // L: 1999
								var2 -= var0; // L: 2000
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 2001

								while (true) {
									--var2; // L: 2002
									if (var2 < 0) {
										while (true) {
											--var1; // L: 2012
											if (var1 < 0) {
												return; // L: 2022
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2013
											var5 += var27; // L: 2014
											var3 += var26; // L: 2015
											var6 += var31; // L: 2016
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 2017
											var32 += var34; // L: 2018
											var35 += var37; // L: 2019
											var38 += var40; // L: 2020
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2003
									var4 += var28; // L: 2004
									var3 += var26; // L: 2005
									var6 += var31; // L: 2006
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 2007
									var32 += var34; // L: 2008
									var35 += var37; // L: 2009
									var38 += var40; // L: 2010
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 2026
					if (var1 < Rasterizer3D_clipHeight) { // L: 2027
						if (var2 > Rasterizer3D_clipHeight) { // L: 2028
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 2029
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 2030
						if (var2 < var0) { // L: 2031
							var3 = var4 <<= 14; // L: 2032
							if (var1 < 0) { // L: 2033
								var3 -= var26 * var1; // L: 2034
								var4 -= var27 * var1; // L: 2035
								var7 -= var31 * var1; // L: 2036
								var1 = 0; // L: 2037
							}

							var5 <<= 14; // L: 2039
							if (var2 < 0) { // L: 2040
								var5 -= var28 * var2; // L: 2041
								var2 = 0; // L: 2042
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2044
							var32 += var34 * var41; // L: 2045
							var35 += var37 * var41; // L: 2046
							var38 += var40 * var41; // L: 2047
							if ((var2 == var1 || var26 >= var27) && (var2 != var1 || var26 <= var28)) { // L: 2048
								var0 -= var2; // L: 2075
								var2 -= var1; // L: 2076
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2077

								while (true) {
									--var2; // L: 2078
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2088
											if (var0 < 0) {
												return; // L: 2098
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2089
											var3 += var26; // L: 2090
											var5 += var28; // L: 2091
											var7 += var31; // L: 2092
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2093
											var32 += var34; // L: 2094
											var35 += var37; // L: 2095
											var38 += var40; // L: 2096
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2079
									var3 += var26; // L: 2080
									var4 += var27; // L: 2081
									var7 += var31; // L: 2082
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2083
									var32 += var34; // L: 2084
									var35 += var37; // L: 2085
									var38 += var40; // L: 2086
								}
							} else {
								var0 -= var2; // L: 2049
								var2 -= var1; // L: 2050
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2051

								while (true) {
									--var2; // L: 2052
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2062
											if (var0 < 0) {
												return; // L: 2072
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2063
											var3 += var26; // L: 2064
											var5 += var28; // L: 2065
											var7 += var31; // L: 2066
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2067
											var32 += var34; // L: 2068
											var35 += var37; // L: 2069
											var38 += var40; // L: 2070
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2053
									var3 += var26; // L: 2054
									var4 += var27; // L: 2055
									var7 += var31; // L: 2056
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2057
									var32 += var34; // L: 2058
									var35 += var37; // L: 2059
									var38 += var40; // L: 2060
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2102
							if (var1 < 0) { // L: 2103
								var5 -= var26 * var1; // L: 2104
								var4 -= var27 * var1; // L: 2105
								var7 -= var31 * var1; // L: 2106
								var1 = 0; // L: 2107
							}

							var3 <<= 14; // L: 2109
							if (var0 < 0) { // L: 2110
								var3 -= var0 * var28; // L: 2111
								var0 = 0; // L: 2112
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2114
							var32 += var34 * var41; // L: 2115
							var35 += var37 * var41; // L: 2116
							var38 += var40 * var41; // L: 2117
							if (var26 < var27) { // L: 2118
								var2 -= var0; // L: 2119
								var0 -= var1; // L: 2120
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2121

								while (true) {
									--var0; // L: 2122
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2132
											if (var2 < 0) {
												return; // L: 2142
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2133
											var3 += var28; // L: 2134
											var4 += var27; // L: 2135
											var7 += var31; // L: 2136
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2137
											var32 += var34; // L: 2138
											var35 += var37; // L: 2139
											var38 += var40; // L: 2140
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2123
									var5 += var26; // L: 2124
									var4 += var27; // L: 2125
									var7 += var31; // L: 2126
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2127
									var32 += var34; // L: 2128
									var35 += var37; // L: 2129
									var38 += var40; // L: 2130
								}
							} else {
								var2 -= var0; // L: 2145
								var0 -= var1; // L: 2146
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2147

								while (true) {
									--var0; // L: 2148
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2158
											if (var2 < 0) {
												return; // L: 2168
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2159
											var3 += var28; // L: 2160
											var4 += var27; // L: 2161
											var7 += var31; // L: 2162
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2163
											var32 += var34; // L: 2164
											var35 += var37; // L: 2165
											var38 += var40; // L: 2166
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2149
									var5 += var26; // L: 2150
									var4 += var27; // L: 2151
									var7 += var31; // L: 2152
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2153
									var32 += var34; // L: 2154
									var35 += var37; // L: 2155
									var38 += var40; // L: 2156
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 2173
					if (var0 > Rasterizer3D_clipHeight) { // L: 2174
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 2175
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 2176
					if (var0 < var1) { // L: 2177
						var4 = var5 <<= 14; // L: 2178
						if (var2 < 0) { // L: 2179
							var4 -= var27 * var2; // L: 2180
							var5 -= var28 * var2; // L: 2181
							var8 -= var31 * var2; // L: 2182
							var2 = 0; // L: 2183
						}

						var3 <<= 14; // L: 2185
						if (var0 < 0) { // L: 2186
							var3 -= var0 * var26; // L: 2187
							var0 = 0; // L: 2188
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2190
						var32 += var34 * var41; // L: 2191
						var35 += var37 * var41; // L: 2192
						var38 += var40 * var41; // L: 2193
						if (var27 < var28) { // L: 2194
							var1 -= var0; // L: 2195
							var0 -= var2; // L: 2196
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2197

							while (true) {
								--var0; // L: 2198
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2208
										if (var1 < 0) {
											return; // L: 2218
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2209
										var4 += var27; // L: 2210
										var3 += var26; // L: 2211
										var8 += var31; // L: 2212
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2213
										var32 += var34; // L: 2214
										var35 += var37; // L: 2215
										var38 += var40; // L: 2216
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2199
								var4 += var27; // L: 2200
								var5 += var28; // L: 2201
								var8 += var31; // L: 2202
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2203
								var32 += var34; // L: 2204
								var35 += var37; // L: 2205
								var38 += var40; // L: 2206
							}
						} else {
							var1 -= var0; // L: 2221
							var0 -= var2; // L: 2222
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2223

							while (true) {
								--var0; // L: 2224
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2234
										if (var1 < 0) {
											return; // L: 2244
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2235
										var4 += var27; // L: 2236
										var3 += var26; // L: 2237
										var8 += var31; // L: 2238
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2239
										var32 += var34; // L: 2240
										var35 += var37; // L: 2241
										var38 += var40; // L: 2242
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2225
								var4 += var27; // L: 2226
								var5 += var28; // L: 2227
								var8 += var31; // L: 2228
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2229
								var32 += var34; // L: 2230
								var35 += var37; // L: 2231
								var38 += var40; // L: 2232
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 2248
						if (var2 < 0) { // L: 2249
							var3 -= var27 * var2; // L: 2250
							var5 -= var28 * var2; // L: 2251
							var8 -= var31 * var2; // L: 2252
							var2 = 0; // L: 2253
						}

						var4 <<= 14; // L: 2255
						if (var1 < 0) { // L: 2256
							var4 -= var26 * var1; // L: 2257
							var1 = 0; // L: 2258
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2260
						var32 += var34 * var41; // L: 2261
						var35 += var37 * var41; // L: 2262
						var38 += var40 * var41; // L: 2263
						if (var27 < var28) { // L: 2264
							var0 -= var1; // L: 2265
							var1 -= var2; // L: 2266
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2267

							while (true) {
								--var1; // L: 2268
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2278
										if (var0 < 0) {
											return; // L: 2288
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2279
										var4 += var26; // L: 2280
										var5 += var28; // L: 2281
										var8 += var31; // L: 2282
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2283
										var32 += var34; // L: 2284
										var35 += var37; // L: 2285
										var38 += var40; // L: 2286
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2269
								var3 += var27; // L: 2270
								var5 += var28; // L: 2271
								var8 += var31; // L: 2272
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2273
								var32 += var34; // L: 2274
								var35 += var37; // L: 2275
								var38 += var40; // L: 2276
							}
						} else {
							var0 -= var1; // L: 2291
							var1 -= var2; // L: 2292
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2293

							while (true) {
								--var1; // L: 2294
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2304
										if (var0 < 0) {
											return; // L: 2314
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2305
										var4 += var26; // L: 2306
										var5 += var28; // L: 2307
										var8 += var31; // L: 2308
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2309
										var32 += var34; // L: 2310
										var35 += var37; // L: 2311
										var38 += var40; // L: 2312
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2295
								var3 += var27; // L: 2296
								var5 += var28; // L: 2297
								var8 += var31; // L: 2298
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2299
								var32 += var34; // L: 2300
								var35 += var37; // L: 2301
								var38 += var40; // L: 2302
							}
						}
					}
				}
			}
		}
	} // L: 1845

	@ObfuscatedName("n")
	@Export("Rasterizer3D_textureAlpha")
	static final void Rasterizer3D_textureAlpha(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2365) { // L: 2323
			if (var6 > Rasterizer3D_clipWidth) { // L: 2324
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 2325
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 2327
			var4 += var5; // L: 2328
			var7 += var5 * var8; // L: 2329
			int var17 = var6 - var5; // L: 2330
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 2331
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2338
				var9 += var23 * var12; // L: 2339
				var10 += var13 * var23; // L: 2340
				var11 += var23 * var14; // L: 2341
				var22 = var11 >> 12; // L: 2342
				if (var22 != 0) { // L: 2343
					var18 = var9 / var22; // L: 2344
					var19 = var10 / var22; // L: 2345
				} else {
					var18 = 0; // L: 2348
					var19 = 0; // L: 2349
				}

				var9 += var17 * var12; // L: 2351
				var10 += var13 * var17; // L: 2352
				var11 += var17 * var14; // L: 2353
				var22 = var11 >> 12; // L: 2354
				if (var22 != 0) { // L: 2355
					var20 = var9 / var22; // L: 2356
					var21 = var10 / var22; // L: 2357
				} else {
					var20 = 0; // L: 2360
					var21 = 0; // L: 2361
				}

				var2 = (var18 << 20) + var19; // L: 2363
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 20); // L: 2364
				var17 >>= 3; // L: 2365
				var8 <<= 3; // L: 2366
				var15 = var7 >> 8; // L: 2367
				if (field2344) { // L: 2369
					if (var17 > 0) { // L: 2370
						do {
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
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2390
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2391
							var2 += var16; // L: 2392
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2393
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2394
							var2 += var16; // L: 2395
							var7 += var8; // L: 2396
							var15 = var7 >> 8; // L: 2397
							--var17; // L: 2398
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2400
					if (var17 > 0) { // L: 2401
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2403
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2404
							var2 += var16; // L: 2405
							--var17; // L: 2406
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2410
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2412
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2413
							}

							++var4; // L: 2415
							var2 += var16; // L: 2416
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2417
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2418
							}

							++var4; // L: 2420
							var2 += var16; // L: 2421
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2422
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2423
							}

							++var4; // L: 2425
							var2 += var16; // L: 2426
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2427
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2428
							}

							++var4; // L: 2430
							var2 += var16; // L: 2431
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2432
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2433
							}

							++var4; // L: 2435
							var2 += var16; // L: 2436
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2437
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2438
							}

							++var4; // L: 2440
							var2 += var16; // L: 2441
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2442
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2443
							}

							++var4; // L: 2445
							var2 += var16; // L: 2446
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2447
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2448
							}

							++var4; // L: 2450
							var2 += var16; // L: 2451
							var7 += var8; // L: 2452
							var15 = var7 >> 8; // L: 2453
							--var17; // L: 2454
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2456
					if (var17 > 0) { // L: 2457
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2459
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2460
							}

							++var4; // L: 2462
							var2 += var16; // L: 2463
							--var17; // L: 2464
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2475
				var9 += var23 * var12; // L: 2476
				var10 += var13 * var23; // L: 2477
				var11 += var23 * var14; // L: 2478
				var22 = var11 >> 14; // L: 2479
				if (var22 != 0) { // L: 2480
					var18 = var9 / var22; // L: 2481
					var19 = var10 / var22; // L: 2482
				} else {
					var18 = 0; // L: 2485
					var19 = 0; // L: 2486
				}

				var9 += var17 * var12; // L: 2488
				var10 += var13 * var17; // L: 2489
				var11 += var17 * var14; // L: 2490
				var22 = var11 >> 14; // L: 2491
				if (var22 != 0) { // L: 2492
					var20 = var9 / var22; // L: 2493
					var21 = var10 / var22; // L: 2494
				} else {
					var20 = 0; // L: 2497
					var21 = 0; // L: 2498
				}

				var2 = (var18 << 18) + var19; // L: 2500
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 18); // L: 2501
				var17 >>= 3; // L: 2502
				var8 <<= 3; // L: 2503
				var15 = var7 >> 8; // L: 2504
				if (field2344) { // L: 2506
					if (var17 > 0) { // L: 2507
						do {
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
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2527
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2528
							var2 += var16; // L: 2529
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2530
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2531
							var2 += var16; // L: 2532
							var7 += var8; // L: 2533
							var15 = var7 >> 8; // L: 2534
							--var17; // L: 2535
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2537
					if (var17 > 0) { // L: 2538
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2540
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2541
							var2 += var16; // L: 2542
							--var17; // L: 2543
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2547
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2549
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2550
							}

							++var4; // L: 2552
							var2 += var16; // L: 2553
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2554
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2555
							}

							++var4; // L: 2557
							var2 += var16; // L: 2558
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2559
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2560
							}

							++var4; // L: 2562
							var2 += var16; // L: 2563
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2564
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2565
							}

							++var4; // L: 2567
							var2 += var16; // L: 2568
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2569
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2570
							}

							++var4; // L: 2572
							var2 += var16; // L: 2573
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2574
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2575
							}

							++var4; // L: 2577
							var2 += var16; // L: 2578
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2579
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2580
							}

							++var4; // L: 2582
							var2 += var16; // L: 2583
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2584
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2585
							}

							++var4; // L: 2587
							var2 += var16; // L: 2588
							var7 += var8; // L: 2589
							var15 = var7 >> 8; // L: 2590
							--var17; // L: 2591
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2593
					if (var17 > 0) { // L: 2594
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2596
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2597
							}

							++var4; // L: 2599
							var2 += var16; // L: 2600
							--var17; // L: 2601
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 2605

	@ObfuscatedName("z")
	static final int method4246(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 2608
		if (var1 < 2) { // L: 2609
			var1 = 2;
		} else if (var1 > 126) { // L: 2610
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 2611
	}

	@ObfuscatedName("q")
	static final int method4220(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2615
	}

	@ObfuscatedName("d")
	static final int method4243(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2619
	}

	@ObfuscatedName("r")
	static final int method4222(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 2623
	}

	@ObfuscatedName("m")
	static final int method4223(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 2627
	}

	@ObfuscatedName("c")
	static final int method4224(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2631
	}

	@ObfuscatedName("f")
	static final int method4225(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2635
	}
}
