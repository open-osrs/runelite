import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Rasterizer3D")
public class Rasterizer3D extends Rasterizer2D {
	@ObfuscatedName("f")
	static boolean field1800;
	@ObfuscatedName("b")
	static boolean field1811;
	@ObfuscatedName("l")
	@Export("Rasterizer3D_isLowDetailTexture")
	static boolean Rasterizer3D_isLowDetailTexture;
	@ObfuscatedName("m")
	public static boolean field1794;
	@ObfuscatedName("z")
	@Export("Rasterizer3D_alpha")
	static int Rasterizer3D_alpha;
	@ObfuscatedName("o")
	@Export("Rasterizer3D_zoom")
	public static int Rasterizer3D_zoom;
	@ObfuscatedName("n")
	@Export("Rasterizer3D_clipMidX")
	static int Rasterizer3D_clipMidX;
	@ObfuscatedName("x")
	@Export("Rasterizer3D_clipMidY")
	static int Rasterizer3D_clipMidY;
	@ObfuscatedName("p")
	@Export("Rasterizer3D_clipWidth")
	static int Rasterizer3D_clipWidth;
	@ObfuscatedName("r")
	@Export("Rasterizer3D_clipHeight")
	static int Rasterizer3D_clipHeight;
	@ObfuscatedName("y")
	@Export("Rasterizer3D_clipNegativeMidX")
	static int Rasterizer3D_clipNegativeMidX;
	@ObfuscatedName("s")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2;
	@ObfuscatedName("j")
	@Export("Rasterizer3D_clipNegativeMidY")
	static int Rasterizer3D_clipNegativeMidY;
	@ObfuscatedName("w")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2;
	@ObfuscatedName("v")
	@Export("Rasterizer3D_rowOffsets")
	static int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("d")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("Rasterizer3D_textureLoader")
	public static TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("g")
	static int[] field1812;
	@ObfuscatedName("h")
	static int[] field1813;
	@ObfuscatedName("i")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ab")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;

	static {
		field1800 = false; // L: 8
		field1811 = false; // L: 9
		Rasterizer3D_isLowDetailTexture = false; // L: 10
		field1794 = true; // L: 11
		Rasterizer3D_alpha = 0; // L: 12
		Rasterizer3D_zoom = 512; // L: 19
		Rasterizer3D_rowOffsets = new int[1024]; // L: 28
		Rasterizer3D_colorPalette = new int[65536]; // L: 29
		field1812 = new int[512]; // L: 31
		field1813 = new int[2048]; // L: 32
		Rasterizer3D_sine = new int[2048]; // L: 33
		Rasterizer3D_cosine = new int[2048]; // L: 34

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 37
			field1812[var0] = 32768 / var0; // L: 38
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 40
			field1813[var0] = 65536 / var0; // L: 41
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

	@ObfuscatedName("b")
	@Export("Rasterizer3D_setClip")
	static final void Rasterizer3D_setClip(int var0, int var1, int var2, int var3) {
		Rasterizer3D_clipWidth = var2 - var0; // L: 58
		Rasterizer3D_clipHeight = var3 - var1; // L: 59
		Rasterizer3D_method3(); // L: 60
		if (Rasterizer3D_rowOffsets.length < Rasterizer3D_clipHeight) { // L: 61
			Rasterizer3D_rowOffsets = new int[WorldMapData_0.method266(Rasterizer3D_clipHeight)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1; // L: 62

		for (int var5 = 0; var5 < Rasterizer3D_clipHeight; ++var5) { // L: 63
			Rasterizer3D_rowOffsets[var5] = var4; // L: 64
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 65
		}

	} // L: 67

	@ObfuscatedName("l")
	@Export("Rasterizer3D_method3")
	public static final void Rasterizer3D_method3() {
		Rasterizer3D_clipMidX = Rasterizer3D_clipWidth / 2; // L: 70
		Rasterizer3D_clipMidY = Rasterizer3D_clipHeight / 2; // L: 71
		Rasterizer3D_clipNegativeMidX = -Rasterizer3D_clipMidX; // L: 72
		Rasterizer3D_clipMidX2 = Rasterizer3D_clipWidth - Rasterizer3D_clipMidX; // L: 73
		Rasterizer3D_clipNegativeMidY = -Rasterizer3D_clipMidY; // L: 74
		Rasterizer3D_clipMidY2 = Rasterizer3D_clipHeight - Rasterizer3D_clipMidY; // L: 75
	} // L: 76

	@ObfuscatedName("m")
	public static final void method3174(int var0, int var1) {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lea;)V"
	)
	@Export("Rasterizer3D_setTextureLoader")
	public static final void Rasterizer3D_setTextureLoader(TextureLoader var0) {
		Rasterizer3D_textureLoader = var0; // L: 91
	} // L: 92

	@ObfuscatedName("q")
	@Export("Rasterizer3D_setBrightness")
	public static final void Rasterizer3D_setBrightness(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 95
	} // L: 96

	@ObfuscatedName("k")
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

	@ObfuscatedName("c")
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
	public static void method3137(int var0, int var1, int var2) {
		field1800 = var0 < 0 || var0 > Rasterizer3D_clipWidth || var1 < 0 || var1 > Rasterizer3D_clipWidth || var2 < 0 || var2 > Rasterizer3D_clipWidth; // L: 156
	} // L: 157

	@ObfuscatedName("t")
	static final void method3155(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3; // L: 160
		int var10 = var1 - var0; // L: 161
		int var11 = var5 - var3; // L: 162
		int var12 = var2 - var0; // L: 163
		int var13 = var7 - var6; // L: 164
		int var14 = var8 - var6; // L: 165
		int var15;
		if (var2 != var1) { // L: 167
			var15 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var15 = 0; // L: 168
		}

		int var16;
		if (var0 != var1) { // L: 170
			var16 = (var9 << 14) / var10;
		} else {
			var16 = 0; // L: 171
		}

		int var17;
		if (var0 != var2) { // L: 173
			var17 = (var11 << 14) / var12;
		} else {
			var17 = 0; // L: 174
		}

		int var18 = var9 * var12 - var11 * var10; // L: 175
		if (var18 != 0) { // L: 176
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18; // L: 177
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18; // L: 178
			if (var0 <= var1 && var0 <= var2) { // L: 179
				if (var0 < Rasterizer3D_clipHeight) { // L: 180
					if (var1 > Rasterizer3D_clipHeight) { // L: 181
						var1 = Rasterizer3D_clipHeight;
					}

					if (var2 > Rasterizer3D_clipHeight) { // L: 182
						var2 = Rasterizer3D_clipHeight;
					}

					var6 = var19 + ((var6 << 8) - var3 * var19); // L: 183
					if (var1 < var2) { // L: 184
						var5 = var3 <<= 14; // L: 185
						if (var0 < 0) { // L: 186
							var5 -= var0 * var17; // L: 187
							var3 -= var0 * var16; // L: 188
							var6 -= var0 * var20; // L: 189
							var0 = 0; // L: 190
						}

						var4 <<= 14; // L: 192
						if (var1 < 0) { // L: 193
							var4 -= var15 * var1; // L: 194
							var1 = 0; // L: 195
						}

						if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) { // L: 197
							var2 -= var1; // L: 218
							var1 -= var0; // L: 219
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 220

							while (true) {
								--var1; // L: 221
								if (var1 < 0) {
									while (true) {
										--var2; // L: 228
										if (var2 < 0) {
											return; // L: 235
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19); // L: 229
										var5 += var17; // L: 230
										var4 += var15; // L: 231
										var6 += var20; // L: 232
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 233
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 222
								var5 += var17; // L: 223
								var3 += var16; // L: 224
								var6 += var20; // L: 225
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 226
							}
						} else {
							var2 -= var1; // L: 198
							var1 -= var0; // L: 199
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 200

							while (true) {
								--var1; // L: 201
								if (var1 < 0) {
									while (true) {
										--var2; // L: 208
										if (var2 < 0) {
											return; // L: 215
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19); // L: 209
										var5 += var17; // L: 210
										var4 += var15; // L: 211
										var6 += var20; // L: 212
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 213
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 202
								var5 += var17; // L: 203
								var3 += var16; // L: 204
								var6 += var20; // L: 205
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 206
							}
						}
					} else {
						var4 = var3 <<= 14; // L: 239
						if (var0 < 0) { // L: 240
							var4 -= var0 * var17; // L: 241
							var3 -= var0 * var16; // L: 242
							var6 -= var0 * var20; // L: 243
							var0 = 0; // L: 244
						}

						var5 <<= 14; // L: 246
						if (var2 < 0) { // L: 247
							var5 -= var15 * var2; // L: 248
							var2 = 0; // L: 249
						}

						if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) { // L: 251
							var1 -= var2; // L: 252
							var2 -= var0; // L: 253
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 254

							while (true) {
								--var2; // L: 255
								if (var2 < 0) {
									while (true) {
										--var1; // L: 262
										if (var1 < 0) {
											return; // L: 269
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19); // L: 263
										var5 += var15; // L: 264
										var3 += var16; // L: 265
										var6 += var20; // L: 266
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 267
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19); // L: 256
								var4 += var17; // L: 257
								var3 += var16; // L: 258
								var6 += var20; // L: 259
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 260
							}
						} else {
							var1 -= var2; // L: 272
							var2 -= var0; // L: 273
							var0 = Rasterizer3D_rowOffsets[var0]; // L: 274

							while (true) {
								--var2; // L: 275
								if (var2 < 0) {
									while (true) {
										--var1; // L: 282
										if (var1 < 0) {
											return; // L: 289
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19); // L: 283
										var5 += var15; // L: 284
										var3 += var16; // L: 285
										var6 += var20; // L: 286
										var0 += Rasterizer2D.Rasterizer2D_width; // L: 287
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19); // L: 276
								var4 += var17; // L: 277
								var3 += var16; // L: 278
								var6 += var20; // L: 279
								var0 += Rasterizer2D.Rasterizer2D_width; // L: 280
							}
						}
					}
				}
			} else if (var1 <= var2) { // L: 293
				if (var1 < Rasterizer3D_clipHeight) { // L: 294
					if (var2 > Rasterizer3D_clipHeight) { // L: 295
						var2 = Rasterizer3D_clipHeight;
					}

					if (var0 > Rasterizer3D_clipHeight) { // L: 296
						var0 = Rasterizer3D_clipHeight;
					}

					var7 = var19 + ((var7 << 8) - var19 * var4); // L: 297
					if (var2 < var0) { // L: 298
						var3 = var4 <<= 14; // L: 299
						if (var1 < 0) { // L: 300
							var3 -= var16 * var1; // L: 301
							var4 -= var15 * var1; // L: 302
							var7 -= var20 * var1; // L: 303
							var1 = 0; // L: 304
						}

						var5 <<= 14; // L: 306
						if (var2 < 0) { // L: 307
							var5 -= var17 * var2; // L: 308
							var2 = 0; // L: 309
						}

						if ((var2 == var1 || var16 >= var15) && (var2 != var1 || var16 <= var17)) { // L: 311
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

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19); // L: 343
										var3 += var16; // L: 344
										var5 += var17; // L: 345
										var7 += var20; // L: 346
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 347
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 336
								var3 += var16; // L: 337
								var4 += var15; // L: 338
								var7 += var20; // L: 339
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 340
							}
						} else {
							var0 -= var2; // L: 312
							var2 -= var1; // L: 313
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 314

							while (true) {
								--var2; // L: 315
								if (var2 < 0) {
									while (true) {
										--var0; // L: 322
										if (var0 < 0) {
											return; // L: 329
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19); // L: 323
										var3 += var16; // L: 324
										var5 += var17; // L: 325
										var7 += var20; // L: 326
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 327
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 316
								var3 += var16; // L: 317
								var4 += var15; // L: 318
								var7 += var20; // L: 319
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 320
							}
						}
					} else {
						var5 = var4 <<= 14; // L: 353
						if (var1 < 0) { // L: 354
							var5 -= var16 * var1; // L: 355
							var4 -= var15 * var1; // L: 356
							var7 -= var20 * var1; // L: 357
							var1 = 0; // L: 358
						}

						var3 <<= 14; // L: 360
						if (var0 < 0) { // L: 361
							var3 -= var0 * var17; // L: 362
							var0 = 0; // L: 363
						}

						if (var16 < var15) { // L: 365
							var2 -= var0; // L: 366
							var0 -= var1; // L: 367
							var1 = Rasterizer3D_rowOffsets[var1]; // L: 368

							while (true) {
								--var0; // L: 369
								if (var0 < 0) {
									while (true) {
										--var2; // L: 376
										if (var2 < 0) {
											return; // L: 383
										}

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19); // L: 377
										var3 += var17; // L: 378
										var4 += var15; // L: 379
										var7 += var20; // L: 380
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 381
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19); // L: 370
								var5 += var16; // L: 371
								var4 += var15; // L: 372
								var7 += var20; // L: 373
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 374
							}
						} else {
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

										Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19); // L: 397
										var3 += var17; // L: 398
										var4 += var15; // L: 399
										var7 += var20; // L: 400
										var1 += Rasterizer2D.Rasterizer2D_width; // L: 401
									}
								}

								Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19); // L: 390
								var5 += var16; // L: 391
								var4 += var15; // L: 392
								var7 += var20; // L: 393
								var1 += Rasterizer2D.Rasterizer2D_width; // L: 394
							}
						}
					}
				}
			} else if (var2 < Rasterizer3D_clipHeight) { // L: 408
				if (var0 > Rasterizer3D_clipHeight) { // L: 409
					var0 = Rasterizer3D_clipHeight;
				}

				if (var1 > Rasterizer3D_clipHeight) { // L: 410
					var1 = Rasterizer3D_clipHeight;
				}

				var8 = var19 + ((var8 << 8) - var5 * var19); // L: 411
				if (var0 < var1) { // L: 412
					var4 = var5 <<= 14; // L: 413
					if (var2 < 0) { // L: 414
						var4 -= var15 * var2; // L: 415
						var5 -= var17 * var2; // L: 416
						var8 -= var20 * var2; // L: 417
						var2 = 0; // L: 418
					}

					var3 <<= 14; // L: 420
					if (var0 < 0) { // L: 421
						var3 -= var0 * var16; // L: 422
						var0 = 0; // L: 423
					}

					if (var15 < var17) { // L: 425
						var1 -= var0; // L: 426
						var0 -= var2; // L: 427
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 428

						while (true) {
							--var0; // L: 429
							if (var0 < 0) {
								while (true) {
									--var1; // L: 436
									if (var1 < 0) {
										return; // L: 443
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19); // L: 437
									var4 += var15; // L: 438
									var3 += var16; // L: 439
									var8 += var20; // L: 440
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 441
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 430
							var4 += var15; // L: 431
							var5 += var17; // L: 432
							var8 += var20; // L: 433
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 434
						}
					} else {
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

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19); // L: 457
									var4 += var15; // L: 458
									var3 += var16; // L: 459
									var8 += var20; // L: 460
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 461
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 450
							var4 += var15; // L: 451
							var5 += var17; // L: 452
							var8 += var20; // L: 453
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 454
						}
					}
				} else {
					var3 = var5 <<= 14; // L: 467
					if (var2 < 0) { // L: 468
						var3 -= var15 * var2; // L: 469
						var5 -= var17 * var2; // L: 470
						var8 -= var20 * var2; // L: 471
						var2 = 0; // L: 472
					}

					var4 <<= 14; // L: 474
					if (var1 < 0) { // L: 475
						var4 -= var16 * var1; // L: 476
						var1 = 0; // L: 477
					}

					if (var15 < var17) { // L: 479
						var0 -= var1; // L: 480
						var1 -= var2; // L: 481
						var2 = Rasterizer3D_rowOffsets[var2]; // L: 482

						while (true) {
							--var1; // L: 483
							if (var1 < 0) {
								while (true) {
									--var0; // L: 490
									if (var0 < 0) {
										return; // L: 497
									}

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19); // L: 491
									var4 += var16; // L: 492
									var5 += var17; // L: 493
									var8 += var20; // L: 494
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 495
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19); // L: 484
							var3 += var15; // L: 485
							var5 += var17; // L: 486
							var8 += var20; // L: 487
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 488
						}
					} else {
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

									Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19); // L: 511
									var4 += var16; // L: 512
									var5 += var17; // L: 513
									var8 += var20; // L: 514
									var2 += Rasterizer2D.Rasterizer2D_width; // L: 515
								}
							}

							Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19); // L: 504
							var3 += var15; // L: 505
							var5 += var17; // L: 506
							var8 += var20; // L: 507
							var2 += Rasterizer2D.Rasterizer2D_width; // L: 508
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("e")
	@Export("Rasterizer3D_vertAlpha")
	static final void Rasterizer3D_vertAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field1800) { // L: 524
			if (var5 > Rasterizer3D_clipWidth) { // L: 525
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 526
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 528
			var1 += var4; // L: 529
			var6 += var4 * var7; // L: 530
			int var8;
			int var9;
			int var10;
			if (field1794) { // L: 531
				var3 = var5 - var4 >> 2; // L: 532
				var7 <<= 2; // L: 533
				if (Rasterizer3D_alpha == 0) { // L: 534
					if (var3 > 0) { // L: 535
						do {
							var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 537
							var6 += var7; // L: 538
							var0[var1++] = var2; // L: 539
							var0[var1++] = var2; // L: 540
							var0[var1++] = var2; // L: 541
							var0[var1++] = var2; // L: 542
							--var3; // L: 543
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 545
					if (var3 > 0) { // L: 546
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 547

						do {
							var0[var1++] = var2; // L: 549
							--var3; // L: 550
						} while(var3 > 0);
					}
				} else {
					var8 = Rasterizer3D_alpha; // L: 554
					var9 = 256 - Rasterizer3D_alpha; // L: 555
					if (var3 > 0) { // L: 556
						do {
							var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 558
							var6 += var7; // L: 559
							var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 560
							var10 = var0[var1]; // L: 561
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 562
							var10 = var0[var1]; // L: 563
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 564
							var10 = var0[var1]; // L: 565
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 566
							var10 = var0[var1]; // L: 567
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 568
							--var3; // L: 569
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 571
					if (var3 > 0) { // L: 572
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 573
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 574

						do {
							var10 = var0[var1]; // L: 576
							var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 577
							--var3; // L: 578
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4; // L: 584
				if (Rasterizer3D_alpha == 0) { // L: 585
					do {
						var0[var1++] = Rasterizer3D_colorPalette[var6 >> 8]; // L: 587
						var6 += var7; // L: 588
						--var3; // L: 589
					} while(var3 > 0);
				} else {
					var8 = Rasterizer3D_alpha; // L: 592
					var9 = 256 - Rasterizer3D_alpha; // L: 593

					do {
						var2 = Rasterizer3D_colorPalette[var6 >> 8]; // L: 595
						var6 += var7; // L: 596
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 597
						var10 = var0[var1]; // L: 598
						var0[var1++] = ((var10 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var10 & 65280) >> 8 & 65280); // L: 599
						--var3; // L: 600
					} while(var3 > 0);
				}

			}
		}
	} // L: 581 602

	@ObfuscatedName("o")
	public static final void method3149(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 607
		if (var0 != var1) { // L: 608
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0; // L: 609
		if (var2 != var1) { // L: 610
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0; // L: 611
		if (var0 != var2) { // L: 612
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) { // L: 613
			if (var0 < Rasterizer3D_clipHeight) { // L: 614
				if (var1 > Rasterizer3D_clipHeight) { // L: 615
					var1 = Rasterizer3D_clipHeight;
				}

				if (var2 > Rasterizer3D_clipHeight) { // L: 616
					var2 = Rasterizer3D_clipHeight;
				}

				if (var1 < var2) { // L: 617
					var5 = var3 <<= 14; // L: 618
					if (var0 < 0) { // L: 619
						var5 -= var0 * var9; // L: 620
						var3 -= var0 * var7; // L: 621
						var0 = 0; // L: 622
					}

					var4 <<= 14; // L: 624
					if (var1 < 0) { // L: 625
						var4 -= var8 * var1; // L: 626
						var1 = 0; // L: 627
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) { // L: 629
						var2 -= var1; // L: 630
						var1 -= var0; // L: 631
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 632

						while (true) {
							--var1; // L: 633
							if (var1 < 0) {
								while (true) {
									--var2; // L: 639
									if (var2 < 0) {
										return; // L: 645
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var4 >> 14); // L: 640
									var5 += var9; // L: 641
									var4 += var8; // L: 642
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 643
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 634
							var5 += var9; // L: 635
							var3 += var7; // L: 636
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 637
						}
					} else {
						var2 -= var1; // L: 648
						var1 -= var0; // L: 649
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 650

						while (true) {
							--var1; // L: 651
							if (var1 < 0) {
								while (true) {
									--var2; // L: 657
									if (var2 < 0) {
										return; // L: 663
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var5 >> 14); // L: 658
									var5 += var9; // L: 659
									var4 += var8; // L: 660
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 661
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 652
							var5 += var9; // L: 653
							var3 += var7; // L: 654
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 655
						}
					}
				} else {
					var4 = var3 <<= 14; // L: 667
					if (var0 < 0) { // L: 668
						var4 -= var0 * var9; // L: 669
						var3 -= var0 * var7; // L: 670
						var0 = 0; // L: 671
					}

					var5 <<= 14; // L: 673
					if (var2 < 0) { // L: 674
						var5 -= var8 * var2; // L: 675
						var2 = 0; // L: 676
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) { // L: 678
						var1 -= var2; // L: 679
						var2 -= var0; // L: 680
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 681

						while (true) {
							--var2; // L: 682
							if (var2 < 0) {
								while (true) {
									--var1; // L: 688
									if (var1 < 0) {
										return; // L: 694
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 689
									var5 += var8; // L: 690
									var3 += var7; // L: 691
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 692
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var3 >> 14); // L: 683
							var4 += var9; // L: 684
							var3 += var7; // L: 685
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 686
						}
					} else {
						var1 -= var2; // L: 697
						var2 -= var0; // L: 698
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 699

						while (true) {
							--var2; // L: 700
							if (var2 < 0) {
								while (true) {
									--var1; // L: 706
									if (var1 < 0) {
										return; // L: 712
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 707
									var5 += var8; // L: 708
									var3 += var7; // L: 709
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 710
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var4 >> 14); // L: 701
							var4 += var9; // L: 702
							var3 += var7; // L: 703
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 704
						}
					}
				}
			}
		} else if (var1 <= var2) { // L: 716
			if (var1 < Rasterizer3D_clipHeight) { // L: 717
				if (var2 > Rasterizer3D_clipHeight) { // L: 718
					var2 = Rasterizer3D_clipHeight;
				}

				if (var0 > Rasterizer3D_clipHeight) { // L: 719
					var0 = Rasterizer3D_clipHeight;
				}

				if (var2 < var0) { // L: 720
					var3 = var4 <<= 14; // L: 721
					if (var1 < 0) { // L: 722
						var3 -= var7 * var1; // L: 723
						var4 -= var8 * var1; // L: 724
						var1 = 0; // L: 725
					}

					var5 <<= 14; // L: 727
					if (var2 < 0) { // L: 728
						var5 -= var9 * var2; // L: 729
						var2 = 0; // L: 730
					}

					if (var2 != var1 && var7 < var8 || var2 == var1 && var7 > var9) { // L: 732
						var0 -= var2; // L: 733
						var2 -= var1; // L: 734
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 735

						while (true) {
							--var2; // L: 736
							if (var2 < 0) {
								while (true) {
									--var0; // L: 742
									if (var0 < 0) {
										return; // L: 748
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var5 >> 14); // L: 743
									var3 += var7; // L: 744
									var5 += var9; // L: 745
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 746
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 737
							var3 += var7; // L: 738
							var4 += var8; // L: 739
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 740
						}
					} else {
						var0 -= var2; // L: 751
						var2 -= var1; // L: 752
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 753

						while (true) {
							--var2; // L: 754
							if (var2 < 0) {
								while (true) {
									--var0; // L: 760
									if (var0 < 0) {
										return; // L: 766
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var3 >> 14); // L: 761
									var3 += var7; // L: 762
									var5 += var9; // L: 763
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 764
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 755
							var3 += var7; // L: 756
							var4 += var8; // L: 757
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 758
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 770
					if (var1 < 0) { // L: 771
						var5 -= var7 * var1; // L: 772
						var4 -= var8 * var1; // L: 773
						var1 = 0; // L: 774
					}

					var3 <<= 14; // L: 776
					if (var0 < 0) { // L: 777
						var3 -= var0 * var9; // L: 778
						var0 = 0; // L: 779
					}

					if (var7 < var8) { // L: 781
						var2 -= var0; // L: 782
						var0 -= var1; // L: 783
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 784

						while (true) {
							--var0; // L: 785
							if (var0 < 0) {
								while (true) {
									--var2; // L: 791
									if (var2 < 0) {
										return; // L: 797
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 792
									var3 += var9; // L: 793
									var4 += var8; // L: 794
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 795
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var4 >> 14); // L: 786
							var5 += var7; // L: 787
							var4 += var8; // L: 788
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 789
						}
					} else {
						var2 -= var0; // L: 800
						var0 -= var1; // L: 801
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 802

						while (true) {
							--var0; // L: 803
							if (var0 < 0) {
								while (true) {
									--var2; // L: 809
									if (var2 < 0) {
										return; // L: 815
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 810
									var3 += var9; // L: 811
									var4 += var8; // L: 812
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 813
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var5 >> 14); // L: 804
							var5 += var7; // L: 805
							var4 += var8; // L: 806
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 807
						}
					}
				}
			}
		} else if (var2 < Rasterizer3D_clipHeight) { // L: 820
			if (var0 > Rasterizer3D_clipHeight) { // L: 821
				var0 = Rasterizer3D_clipHeight;
			}

			if (var1 > Rasterizer3D_clipHeight) { // L: 822
				var1 = Rasterizer3D_clipHeight;
			}

			if (var0 < var1) { // L: 823
				var4 = var5 <<= 14; // L: 824
				if (var2 < 0) { // L: 825
					var4 -= var8 * var2; // L: 826
					var5 -= var9 * var2; // L: 827
					var2 = 0; // L: 828
				}

				var3 <<= 14; // L: 830
				if (var0 < 0) { // L: 831
					var3 -= var0 * var7; // L: 832
					var0 = 0; // L: 833
				}

				if (var8 < var9) { // L: 835
					var1 -= var0; // L: 836
					var0 -= var2; // L: 837
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 838

					while (true) {
						--var0; // L: 839
						if (var0 < 0) {
							while (true) {
								--var1; // L: 845
								if (var1 < 0) {
									return; // L: 851
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var3 >> 14); // L: 846
								var4 += var8; // L: 847
								var3 += var7; // L: 848
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 849
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 840
						var4 += var8; // L: 841
						var5 += var9; // L: 842
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 843
					}
				} else {
					var1 -= var0; // L: 854
					var0 -= var2; // L: 855
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 856

					while (true) {
						--var0; // L: 857
						if (var0 < 0) {
							while (true) {
								--var1; // L: 863
								if (var1 < 0) {
									return; // L: 869
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var4 >> 14); // L: 864
								var4 += var8; // L: 865
								var3 += var7; // L: 866
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 867
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 858
						var4 += var8; // L: 859
						var5 += var9; // L: 860
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 861
					}
				}
			} else {
				var3 = var5 <<= 14; // L: 873
				if (var2 < 0) { // L: 874
					var3 -= var8 * var2; // L: 875
					var5 -= var9 * var2; // L: 876
					var2 = 0; // L: 877
				}

				var4 <<= 14; // L: 879
				if (var1 < 0) { // L: 880
					var4 -= var7 * var1; // L: 881
					var1 = 0; // L: 882
				}

				if (var8 < var9) { // L: 884
					var0 -= var1; // L: 885
					var1 -= var2; // L: 886
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 887

					while (true) {
						--var1; // L: 888
						if (var1 < 0) {
							while (true) {
								--var0; // L: 894
								if (var0 < 0) {
									return; // L: 900
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 895
								var4 += var7; // L: 896
								var5 += var9; // L: 897
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 898
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var5 >> 14); // L: 889
						var3 += var8; // L: 890
						var5 += var9; // L: 891
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 892
					}
				} else {
					var0 -= var1; // L: 903
					var1 -= var2; // L: 904
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 905

					while (true) {
						--var1; // L: 906
						if (var1 < 0) {
							while (true) {
								--var0; // L: 912
								if (var0 < 0) {
									return; // L: 918
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 913
								var4 += var7; // L: 914
								var5 += var9; // L: 915
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 916
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var3 >> 14); // L: 907
						var3 += var8; // L: 908
						var5 += var9; // L: 909
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 910
					}
				}
			}
		}
	}

	@ObfuscatedName("n")
	@Export("Rasterizer3D_horizAlpha")
	static final void Rasterizer3D_horizAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field1800) { // L: 925
			if (var5 > Rasterizer3D_clipWidth) { // L: 926
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 927
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 929
			var1 += var4; // L: 930
			var3 = var5 - var4 >> 2; // L: 931
			if (Rasterizer3D_alpha != 0) { // L: 932
				if (Rasterizer3D_alpha == 254) { // L: 944
					while (true) {
						--var3; // L: 945
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 951

							while (true) {
								--var3; // L: 952
								if (var3 < 0) {
									return; // L: 976
								}

								var0[var1++] = var0[var1]; // L: 953
							}
						}

						var0[var1++] = var0[var1]; // L: 946
						var0[var1++] = var0[var1]; // L: 947
						var0[var1++] = var0[var1]; // L: 948
						var0[var1++] = var0[var1]; // L: 949
					}
				} else {
					int var6 = Rasterizer3D_alpha; // L: 957
					int var7 = 256 - Rasterizer3D_alpha; // L: 958
					var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935); // L: 959

					while (true) {
						--var3; // L: 960
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 970

							while (true) {
								--var3; // L: 971
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1]; // L: 972
								var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 973
							}
						}

						var8 = var0[var1]; // L: 961
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 962
						var8 = var0[var1]; // L: 963
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 964
						var8 = var0[var1]; // L: 965
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 966
						var8 = var0[var1]; // L: 967
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 968
					}
				}
			} else {
				while (true) {
					--var3; // L: 933
					if (var3 < 0) {
						var3 = var5 - var4 & 3; // L: 939

						while (true) {
							--var3; // L: 940
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2; // L: 941
						}
					}

					var0[var1++] = var2; // L: 934
					var0[var1++] = var2; // L: 935
					var0[var1++] = var2; // L: 936
					var0[var1++] = var2; // L: 937
				}
			}
		}
	}

	@ObfuscatedName("x")
	static final void method3156(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 979
		int var20;
		if (var19 == null) { // L: 980
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 981
			method3155(var0, var1, var2, var3, var4, var5, method3186(var20, var6), method3186(var20, var7), method3186(var20, var8)); // L: 982
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 985
			field1811 = Rasterizer3D_textureLoader.vmethod3401(var18); // L: 986
			var20 = var4 - var3; // L: 987
			int var21 = var1 - var0; // L: 988
			int var22 = var5 - var3; // L: 989
			int var23 = var2 - var0; // L: 990
			int var24 = var7 - var6; // L: 991
			int var25 = var8 - var6; // L: 992
			int var26 = 0; // L: 993
			if (var0 != var1) { // L: 994
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 995
			if (var2 != var1) { // L: 996
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 997
			if (var0 != var2) { // L: 998
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 999
			if (var29 != 0) { // L: 1000
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1001
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1002
				var10 = var9 - var10; // L: 1003
				var13 = var12 - var13; // L: 1004
				var16 = var15 - var16; // L: 1005
				var11 -= var9; // L: 1006
				var14 -= var12; // L: 1007
				var17 -= var15; // L: 1008
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1009
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1010
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1011
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1012
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1013
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1014
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1015
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1016
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1017
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1018
					if (var0 < Rasterizer3D_clipHeight) { // L: 1019
						if (var1 > Rasterizer3D_clipHeight) { // L: 1020
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1021
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1022
						if (var1 < var2) { // L: 1023
							var5 = var3 <<= 14; // L: 1024
							if (var0 < 0) { // L: 1025
								var5 -= var0 * var28; // L: 1026
								var3 -= var0 * var26; // L: 1027
								var6 -= var0 * var31; // L: 1028
								var0 = 0; // L: 1029
							}

							var4 <<= 14; // L: 1031
							if (var1 < 0) { // L: 1032
								var4 -= var27 * var1; // L: 1033
								var1 = 0; // L: 1034
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1036
							var32 += var34 * var41; // L: 1037
							var35 += var37 * var41; // L: 1038
							var38 += var40 * var41; // L: 1039
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) { // L: 1040
								var2 -= var1; // L: 1041
								var1 -= var0; // L: 1042
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1043

								while (true) {
									--var1; // L: 1044
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1054
											if (var2 < 0) {
												return; // L: 1064
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1055
											var5 += var28; // L: 1056
											var4 += var27; // L: 1057
											var6 += var31; // L: 1058
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1059
											var32 += var34; // L: 1060
											var35 += var37; // L: 1061
											var38 += var40; // L: 1062
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1045
									var5 += var28; // L: 1046
									var3 += var26; // L: 1047
									var6 += var31; // L: 1048
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1049
									var32 += var34; // L: 1050
									var35 += var37; // L: 1051
									var38 += var40; // L: 1052
								}
							} else {
								var2 -= var1; // L: 1067
								var1 -= var0; // L: 1068
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1069

								while (true) {
									--var1; // L: 1070
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1080
											if (var2 < 0) {
												return; // L: 1090
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1081
											var5 += var28; // L: 1082
											var4 += var27; // L: 1083
											var6 += var31; // L: 1084
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1085
											var32 += var34; // L: 1086
											var35 += var37; // L: 1087
											var38 += var40; // L: 1088
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1071
									var5 += var28; // L: 1072
									var3 += var26; // L: 1073
									var6 += var31; // L: 1074
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1075
									var32 += var34; // L: 1076
									var35 += var37; // L: 1077
									var38 += var40; // L: 1078
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1094
							if (var0 < 0) { // L: 1095
								var4 -= var0 * var28; // L: 1096
								var3 -= var0 * var26; // L: 1097
								var6 -= var0 * var31; // L: 1098
								var0 = 0; // L: 1099
							}

							var5 <<= 14; // L: 1101
							if (var2 < 0) { // L: 1102
								var5 -= var27 * var2; // L: 1103
								var2 = 0; // L: 1104
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1106
							var32 += var34 * var41; // L: 1107
							var35 += var37 * var41; // L: 1108
							var38 += var40 * var41; // L: 1109
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 1110
								var1 -= var2; // L: 1137
								var2 -= var0; // L: 1138
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1139

								while (true) {
									--var2; // L: 1140
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1150
											if (var1 < 0) {
												return; // L: 1160
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1151
											var5 += var27; // L: 1152
											var3 += var26; // L: 1153
											var6 += var31; // L: 1154
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1155
											var32 += var34; // L: 1156
											var35 += var37; // L: 1157
											var38 += var40; // L: 1158
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1141
									var4 += var28; // L: 1142
									var3 += var26; // L: 1143
									var6 += var31; // L: 1144
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1145
									var32 += var34; // L: 1146
									var35 += var37; // L: 1147
									var38 += var40; // L: 1148
								}
							} else {
								var1 -= var2; // L: 1111
								var2 -= var0; // L: 1112
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1113

								while (true) {
									--var2; // L: 1114
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1124
											if (var1 < 0) {
												return; // L: 1134
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1125
											var5 += var27; // L: 1126
											var3 += var26; // L: 1127
											var6 += var31; // L: 1128
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1129
											var32 += var34; // L: 1130
											var35 += var37; // L: 1131
											var38 += var40; // L: 1132
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1115
									var4 += var28; // L: 1116
									var3 += var26; // L: 1117
									var6 += var31; // L: 1118
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1119
									var32 += var34; // L: 1120
									var35 += var37; // L: 1121
									var38 += var40; // L: 1122
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 1164
					if (var1 < Rasterizer3D_clipHeight) { // L: 1165
						if (var2 > Rasterizer3D_clipHeight) { // L: 1166
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 1167
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 1168
						if (var2 < var0) { // L: 1169
							var3 = var4 <<= 14; // L: 1170
							if (var1 < 0) { // L: 1171
								var3 -= var26 * var1; // L: 1172
								var4 -= var27 * var1; // L: 1173
								var7 -= var31 * var1; // L: 1174
								var1 = 0; // L: 1175
							}

							var5 <<= 14; // L: 1177
							if (var2 < 0) { // L: 1178
								var5 -= var28 * var2; // L: 1179
								var2 = 0; // L: 1180
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1182
							var32 += var34 * var41; // L: 1183
							var35 += var37 * var41; // L: 1184
							var38 += var40 * var41; // L: 1185
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 1186
								var0 -= var2; // L: 1187
								var2 -= var1; // L: 1188
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1189

								while (true) {
									--var2; // L: 1190
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1200
											if (var0 < 0) {
												return; // L: 1210
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1201
											var3 += var26; // L: 1202
											var5 += var28; // L: 1203
											var7 += var31; // L: 1204
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1205
											var32 += var34; // L: 1206
											var35 += var37; // L: 1207
											var38 += var40; // L: 1208
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1191
									var3 += var26; // L: 1192
									var4 += var27; // L: 1193
									var7 += var31; // L: 1194
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1195
									var32 += var34; // L: 1196
									var35 += var37; // L: 1197
									var38 += var40; // L: 1198
								}
							} else {
								var0 -= var2; // L: 1213
								var2 -= var1; // L: 1214
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1215

								while (true) {
									--var2; // L: 1216
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1226
											if (var0 < 0) {
												return; // L: 1236
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1227
											var3 += var26; // L: 1228
											var5 += var28; // L: 1229
											var7 += var31; // L: 1230
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1231
											var32 += var34; // L: 1232
											var35 += var37; // L: 1233
											var38 += var40; // L: 1234
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1217
									var3 += var26; // L: 1218
									var4 += var27; // L: 1219
									var7 += var31; // L: 1220
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1221
									var32 += var34; // L: 1222
									var35 += var37; // L: 1223
									var38 += var40; // L: 1224
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1240
							if (var1 < 0) { // L: 1241
								var5 -= var26 * var1; // L: 1242
								var4 -= var27 * var1; // L: 1243
								var7 -= var31 * var1; // L: 1244
								var1 = 0; // L: 1245
							}

							var3 <<= 14; // L: 1247
							if (var0 < 0) { // L: 1248
								var3 -= var0 * var28; // L: 1249
								var0 = 0; // L: 1250
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1252
							var32 += var34 * var41; // L: 1253
							var35 += var37 * var41; // L: 1254
							var38 += var40 * var41; // L: 1255
							if (var26 < var27) { // L: 1256
								var2 -= var0; // L: 1257
								var0 -= var1; // L: 1258
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1259

								while (true) {
									--var0; // L: 1260
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1270
											if (var2 < 0) {
												return; // L: 1280
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1271
											var3 += var28; // L: 1272
											var4 += var27; // L: 1273
											var7 += var31; // L: 1274
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1275
											var32 += var34; // L: 1276
											var35 += var37; // L: 1277
											var38 += var40; // L: 1278
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1261
									var5 += var26; // L: 1262
									var4 += var27; // L: 1263
									var7 += var31; // L: 1264
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1265
									var32 += var34; // L: 1266
									var35 += var37; // L: 1267
									var38 += var40; // L: 1268
								}
							} else {
								var2 -= var0; // L: 1283
								var0 -= var1; // L: 1284
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1285

								while (true) {
									--var0; // L: 1286
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1296
											if (var2 < 0) {
												return; // L: 1306
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1297
											var3 += var28; // L: 1298
											var4 += var27; // L: 1299
											var7 += var31; // L: 1300
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1301
											var32 += var34; // L: 1302
											var35 += var37; // L: 1303
											var38 += var40; // L: 1304
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1287
									var5 += var26; // L: 1288
									var4 += var27; // L: 1289
									var7 += var31; // L: 1290
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1291
									var32 += var34; // L: 1292
									var35 += var37; // L: 1293
									var38 += var40; // L: 1294
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 1311
					if (var0 > Rasterizer3D_clipHeight) { // L: 1312
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 1313
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 1314
					if (var0 < var1) { // L: 1315
						var4 = var5 <<= 14; // L: 1316
						if (var2 < 0) { // L: 1317
							var4 -= var27 * var2; // L: 1318
							var5 -= var28 * var2; // L: 1319
							var8 -= var31 * var2; // L: 1320
							var2 = 0; // L: 1321
						}

						var3 <<= 14; // L: 1323
						if (var0 < 0) { // L: 1324
							var3 -= var0 * var26; // L: 1325
							var0 = 0; // L: 1326
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1328
						var32 += var34 * var41; // L: 1329
						var35 += var37 * var41; // L: 1330
						var38 += var40 * var41; // L: 1331
						if (var27 < var28) { // L: 1332
							var1 -= var0; // L: 1333
							var0 -= var2; // L: 1334
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1335

							while (true) {
								--var0; // L: 1336
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1346
										if (var1 < 0) {
											return; // L: 1356
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1347
										var4 += var27; // L: 1348
										var3 += var26; // L: 1349
										var8 += var31; // L: 1350
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1351
										var32 += var34; // L: 1352
										var35 += var37; // L: 1353
										var38 += var40; // L: 1354
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1337
								var4 += var27; // L: 1338
								var5 += var28; // L: 1339
								var8 += var31; // L: 1340
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1341
								var32 += var34; // L: 1342
								var35 += var37; // L: 1343
								var38 += var40; // L: 1344
							}
						} else {
							var1 -= var0; // L: 1359
							var0 -= var2; // L: 1360
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1361

							while (true) {
								--var0; // L: 1362
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1372
										if (var1 < 0) {
											return; // L: 1382
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1373
										var4 += var27; // L: 1374
										var3 += var26; // L: 1375
										var8 += var31; // L: 1376
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1377
										var32 += var34; // L: 1378
										var35 += var37; // L: 1379
										var38 += var40; // L: 1380
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1363
								var4 += var27; // L: 1364
								var5 += var28; // L: 1365
								var8 += var31; // L: 1366
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1367
								var32 += var34; // L: 1368
								var35 += var37; // L: 1369
								var38 += var40; // L: 1370
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 1386
						if (var2 < 0) { // L: 1387
							var3 -= var27 * var2; // L: 1388
							var5 -= var28 * var2; // L: 1389
							var8 -= var31 * var2; // L: 1390
							var2 = 0; // L: 1391
						}

						var4 <<= 14; // L: 1393
						if (var1 < 0) { // L: 1394
							var4 -= var26 * var1; // L: 1395
							var1 = 0; // L: 1396
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1398
						var32 += var34 * var41; // L: 1399
						var35 += var37 * var41; // L: 1400
						var38 += var40 * var41; // L: 1401
						if (var27 < var28) { // L: 1402
							var0 -= var1; // L: 1403
							var1 -= var2; // L: 1404
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1405

							while (true) {
								--var1; // L: 1406
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1416
										if (var0 < 0) {
											return; // L: 1426
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1417
										var4 += var26; // L: 1418
										var5 += var28; // L: 1419
										var8 += var31; // L: 1420
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1421
										var32 += var34; // L: 1422
										var35 += var37; // L: 1423
										var38 += var40; // L: 1424
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1407
								var3 += var27; // L: 1408
								var5 += var28; // L: 1409
								var8 += var31; // L: 1410
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1411
								var32 += var34; // L: 1412
								var35 += var37; // L: 1413
								var38 += var40; // L: 1414
							}
						} else {
							var0 -= var1; // L: 1429
							var1 -= var2; // L: 1430
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1431

							while (true) {
								--var1; // L: 1432
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1442
										if (var0 < 0) {
											return; // L: 1452
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1443
										var4 += var26; // L: 1444
										var5 += var28; // L: 1445
										var8 += var31; // L: 1446
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1447
										var32 += var34; // L: 1448
										var35 += var37; // L: 1449
										var38 += var40; // L: 1450
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1433
								var3 += var27; // L: 1434
								var5 += var28; // L: 1435
								var8 += var31; // L: 1436
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1437
								var32 += var34; // L: 1438
								var35 += var37; // L: 1439
								var38 += var40; // L: 1440
							}
						}
					}
				}
			}
		}
	} // L: 983

	@ObfuscatedName("p")
	@Export("Rasterizer3D_iDontKnow")
	static final void Rasterizer3D_iDontKnow(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field1800) { // L: 1461
			if (var6 > Rasterizer3D_clipWidth) { // L: 1462
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 1463
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 1465
			var4 += var5; // L: 1466
			var7 += var5 * var8; // L: 1467
			int var17 = var6 - var5; // L: 1468
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 1469
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1475
				var9 += var23 * (var12 >> 3); // L: 1476
				var10 += (var13 >> 3) * var23; // L: 1477
				var11 += var23 * (var14 >> 3); // L: 1478
				var22 = var11 >> 12; // L: 1479
				if (var22 != 0) { // L: 1480
					var18 = var9 / var22; // L: 1481
					var19 = var10 / var22; // L: 1482
					if (var18 < 0) { // L: 1483
						var18 = 0;
					} else if (var18 > 4032) { // L: 1484
						var18 = 4032;
					}
				} else {
					var18 = 0; // L: 1487
					var19 = 0; // L: 1488
				}

				var9 += var12; // L: 1490
				var10 += var13; // L: 1491
				var11 += var14; // L: 1492
				var22 = var11 >> 12; // L: 1493
				if (var22 != 0) { // L: 1494
					var20 = var9 / var22; // L: 1495
					var21 = var10 / var22; // L: 1496
					if (var20 < 0) { // L: 1497
						var20 = 0;
					} else if (var20 > 4032) { // L: 1498
						var20 = 4032;
					}
				} else {
					var20 = 0; // L: 1501
					var21 = 0; // L: 1502
				}

				var2 = (var18 << 20) + var19; // L: 1504
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1505
				var17 >>= 3; // L: 1506
				var8 <<= 3; // L: 1507
				var15 = var7 >> 8; // L: 1508
				if (field1811) { // L: 1509
					if (var17 > 0) { // L: 1510
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1512
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1513
							var2 += var16; // L: 1514
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1515
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1516
							var2 += var16; // L: 1517
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1518
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1519
							var2 += var16; // L: 1520
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1521
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1522
							var2 += var16; // L: 1523
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1524
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1525
							var2 += var16; // L: 1526
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1527
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1528
							var2 += var16; // L: 1529
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1530
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1531
							var2 += var16; // L: 1532
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1533
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1534
							var10000 = var16 + var2; // L: 1535
							var18 = var20; // L: 1536
							var19 = var21; // L: 1537
							var9 += var12; // L: 1538
							var10 += var13; // L: 1539
							var11 += var14; // L: 1540
							var22 = var11 >> 12; // L: 1541
							if (var22 != 0) { // L: 1542
								var20 = var9 / var22; // L: 1543
								var21 = var10 / var22; // L: 1544
								if (var20 < 0) { // L: 1545
									var20 = 0;
								} else if (var20 > 4032) { // L: 1546
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1549
								var21 = 0; // L: 1550
							}

							var2 = (var18 << 20) + var19; // L: 1552
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1553
							var7 += var8; // L: 1554
							var15 = var7 >> 8; // L: 1555
							--var17; // L: 1556
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1558
					if (var17 > 0) { // L: 1559
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1561
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1562
							var2 += var16; // L: 1563
							--var17; // L: 1564
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1568
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1570
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1571
							}

							++var4; // L: 1573
							var2 += var16; // L: 1574
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1575
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1576
							}

							++var4; // L: 1578
							var2 += var16; // L: 1579
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1580
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1581
							}

							++var4; // L: 1583
							var2 += var16; // L: 1584
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1585
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1586
							}

							++var4; // L: 1588
							var2 += var16; // L: 1589
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1590
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1591
							}

							++var4; // L: 1593
							var2 += var16; // L: 1594
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1595
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1596
							}

							++var4; // L: 1598
							var2 += var16; // L: 1599
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1600
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1601
							}

							++var4; // L: 1603
							var2 += var16; // L: 1604
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1605
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1606
							}

							++var4; // L: 1608
							var10000 = var16 + var2; // L: 1609
							var18 = var20; // L: 1610
							var19 = var21; // L: 1611
							var9 += var12; // L: 1612
							var10 += var13; // L: 1613
							var11 += var14; // L: 1614
							var22 = var11 >> 12; // L: 1615
							if (var22 != 0) { // L: 1616
								var20 = var9 / var22; // L: 1617
								var21 = var10 / var22; // L: 1618
								if (var20 < 0) { // L: 1619
									var20 = 0;
								} else if (var20 > 4032) { // L: 1620
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1623
								var21 = 0; // L: 1624
							}

							var2 = (var18 << 20) + var19; // L: 1626
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1627
							var7 += var8; // L: 1628
							var15 = var7 >> 8; // L: 1629
							--var17; // L: 1630
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1632
					if (var17 > 0) { // L: 1633
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1635
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1636
							}

							++var4; // L: 1638
							var2 += var16; // L: 1639
							--var17; // L: 1640
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1650
				var9 += var23 * (var12 >> 3); // L: 1651
				var10 += (var13 >> 3) * var23; // L: 1652
				var11 += var23 * (var14 >> 3); // L: 1653
				var22 = var11 >> 14; // L: 1654
				if (var22 != 0) { // L: 1655
					var18 = var9 / var22; // L: 1656
					var19 = var10 / var22; // L: 1657
					if (var18 < 0) { // L: 1658
						var18 = 0;
					} else if (var18 > 16256) { // L: 1659
						var18 = 16256;
					}
				} else {
					var18 = 0; // L: 1662
					var19 = 0; // L: 1663
				}

				var9 += var12; // L: 1665
				var10 += var13; // L: 1666
				var11 += var14; // L: 1667
				var22 = var11 >> 14; // L: 1668
				if (var22 != 0) { // L: 1669
					var20 = var9 / var22; // L: 1670
					var21 = var10 / var22; // L: 1671
					if (var20 < 0) { // L: 1672
						var20 = 0;
					} else if (var20 > 16256) { // L: 1673
						var20 = 16256;
					}
				} else {
					var20 = 0; // L: 1676
					var21 = 0; // L: 1677
				}

				var2 = (var18 << 18) + var19; // L: 1679
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1680
				var17 >>= 3; // L: 1681
				var8 <<= 3; // L: 1682
				var15 = var7 >> 8; // L: 1683
				if (field1811) { // L: 1684
					if (var17 > 0) { // L: 1685
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1687
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1688
							var2 += var16; // L: 1689
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1690
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1691
							var2 += var16; // L: 1692
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1693
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1694
							var2 += var16; // L: 1695
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1696
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1697
							var2 += var16; // L: 1698
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1699
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1700
							var2 += var16; // L: 1701
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1702
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1703
							var2 += var16; // L: 1704
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1705
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1706
							var2 += var16; // L: 1707
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1708
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1709
							var10000 = var16 + var2; // L: 1710
							var18 = var20; // L: 1711
							var19 = var21; // L: 1712
							var9 += var12; // L: 1713
							var10 += var13; // L: 1714
							var11 += var14; // L: 1715
							var22 = var11 >> 14; // L: 1716
							if (var22 != 0) { // L: 1717
								var20 = var9 / var22; // L: 1718
								var21 = var10 / var22; // L: 1719
								if (var20 < 0) { // L: 1720
									var20 = 0;
								} else if (var20 > 16256) { // L: 1721
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1724
								var21 = 0; // L: 1725
							}

							var2 = (var18 << 18) + var19; // L: 1727
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1728
							var7 += var8; // L: 1729
							var15 = var7 >> 8; // L: 1730
							--var17; // L: 1731
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1733
					if (var17 > 0) { // L: 1734
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1736
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1737
							var2 += var16; // L: 1738
							--var17; // L: 1739
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1743
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1745
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1746
							}

							++var4; // L: 1748
							var2 += var16; // L: 1749
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1750
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1751
							}

							++var4; // L: 1753
							var2 += var16; // L: 1754
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1755
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1756
							}

							++var4; // L: 1758
							var2 += var16; // L: 1759
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1760
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1761
							}

							++var4; // L: 1763
							var2 += var16; // L: 1764
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1765
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1766
							}

							++var4; // L: 1768
							var2 += var16; // L: 1769
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1770
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1771
							}

							++var4; // L: 1773
							var2 += var16; // L: 1774
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1775
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1776
							}

							++var4; // L: 1778
							var2 += var16; // L: 1779
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1780
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1781
							}

							++var4; // L: 1783
							var10000 = var16 + var2; // L: 1784
							var18 = var20; // L: 1785
							var19 = var21; // L: 1786
							var9 += var12; // L: 1787
							var10 += var13; // L: 1788
							var11 += var14; // L: 1789
							var22 = var11 >> 14; // L: 1790
							if (var22 != 0) { // L: 1791
								var20 = var9 / var22; // L: 1792
								var21 = var10 / var22; // L: 1793
								if (var20 < 0) { // L: 1794
									var20 = 0;
								} else if (var20 > 16256) { // L: 1795
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1798
								var21 = 0; // L: 1799
							}

							var2 = (var18 << 18) + var19; // L: 1801
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1802
							var7 += var8; // L: 1803
							var15 = var7 >> 8; // L: 1804
							--var17; // L: 1805
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1807
					if (var17 > 0) { // L: 1808
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1810
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1811
							}

							++var4; // L: 1813
							var2 += var16; // L: 1814
							--var17; // L: 1815
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 1819

	@ObfuscatedName("r")
	@Export("drawTexturedTile")
	static final void drawTexturedTile(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1822
		int var20;
		if (var19 == null) { // L: 1823
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1824
			method3155(var0, var1, var2, var3, var4, var5, method3186(var20, var6), method3186(var20, var7), method3186(var20, var8)); // L: 1825
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1828
			field1811 = Rasterizer3D_textureLoader.vmethod3401(var18); // L: 1829
			var20 = var4 - var3; // L: 1830
			int var21 = var1 - var0; // L: 1831
			int var22 = var5 - var3; // L: 1832
			int var23 = var2 - var0; // L: 1833
			int var24 = var7 - var6; // L: 1834
			int var25 = var8 - var6; // L: 1835
			int var26 = 0; // L: 1836
			if (var0 != var1) { // L: 1837
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1838
			if (var2 != var1) { // L: 1839
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1840
			if (var0 != var2) { // L: 1841
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1842
			if (var29 != 0) { // L: 1843
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1844
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1845
				var10 = var9 - var10; // L: 1846
				var13 = var12 - var13; // L: 1847
				var16 = var15 - var16; // L: 1848
				var11 -= var9; // L: 1849
				var14 -= var12; // L: 1850
				var17 -= var15; // L: 1851
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1852
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1853
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1854
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1855
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1856
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1857
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1858
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)Rasterizer3D_zoom); // L: 1859
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1860
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1861
					if (var0 < Rasterizer3D_clipHeight) { // L: 1862
						if (var1 > Rasterizer3D_clipHeight) { // L: 1863
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1864
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1865
						if (var1 < var2) { // L: 1866
							var5 = var3 <<= 14; // L: 1867
							if (var0 < 0) { // L: 1868
								var5 -= var0 * var28; // L: 1869
								var3 -= var0 * var26; // L: 1870
								var6 -= var0 * var31; // L: 1871
								var0 = 0; // L: 1872
							}

							var4 <<= 14; // L: 1874
							if (var1 < 0) { // L: 1875
								var4 -= var27 * var1; // L: 1876
								var1 = 0; // L: 1877
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1879
							var32 += var34 * var41; // L: 1880
							var35 += var37 * var41; // L: 1881
							var38 += var40 * var41; // L: 1882
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) { // L: 1883
								var2 -= var1; // L: 1910
								var1 -= var0; // L: 1911
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1912

								while (true) {
									--var1; // L: 1913
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1923
											if (var2 < 0) {
												return; // L: 1933
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1924
											var5 += var28; // L: 1925
											var4 += var27; // L: 1926
											var6 += var31; // L: 1927
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1928
											var32 += var34; // L: 1929
											var35 += var37; // L: 1930
											var38 += var40; // L: 1931
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1914
									var5 += var28; // L: 1915
									var3 += var26; // L: 1916
									var6 += var31; // L: 1917
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1918
									var32 += var34; // L: 1919
									var35 += var37; // L: 1920
									var38 += var40; // L: 1921
								}
							} else {
								var2 -= var1; // L: 1884
								var1 -= var0; // L: 1885
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1886

								while (true) {
									--var1; // L: 1887
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1897
											if (var2 < 0) {
												return; // L: 1907
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1898
											var5 += var28; // L: 1899
											var4 += var27; // L: 1900
											var6 += var31; // L: 1901
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1902
											var32 += var34; // L: 1903
											var35 += var37; // L: 1904
											var38 += var40; // L: 1905
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1888
									var5 += var28; // L: 1889
									var3 += var26; // L: 1890
									var6 += var31; // L: 1891
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1892
									var32 += var34; // L: 1893
									var35 += var37; // L: 1894
									var38 += var40; // L: 1895
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1937
							if (var0 < 0) { // L: 1938
								var4 -= var0 * var28; // L: 1939
								var3 -= var0 * var26; // L: 1940
								var6 -= var0 * var31; // L: 1941
								var0 = 0; // L: 1942
							}

							var5 <<= 14; // L: 1944
							if (var2 < 0) { // L: 1945
								var5 -= var27 * var2; // L: 1946
								var2 = 0; // L: 1947
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1949
							var32 += var34 * var41; // L: 1950
							var35 += var37 * var41; // L: 1951
							var38 += var40 * var41; // L: 1952
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 1953
								var1 -= var2; // L: 1980
								var2 -= var0; // L: 1981
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1982

								while (true) {
									--var2; // L: 1983
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1993
											if (var1 < 0) {
												return; // L: 2003
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1994
											var5 += var27; // L: 1995
											var3 += var26; // L: 1996
											var6 += var31; // L: 1997
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1998
											var32 += var34; // L: 1999
											var35 += var37; // L: 2000
											var38 += var40; // L: 2001
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1984
									var4 += var28; // L: 1985
									var3 += var26; // L: 1986
									var6 += var31; // L: 1987
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1988
									var32 += var34; // L: 1989
									var35 += var37; // L: 1990
									var38 += var40; // L: 1991
								}
							} else {
								var1 -= var2; // L: 1954
								var2 -= var0; // L: 1955
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1956

								while (true) {
									--var2; // L: 1957
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1967
											if (var1 < 0) {
												return; // L: 1977
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1968
											var5 += var27; // L: 1969
											var3 += var26; // L: 1970
											var6 += var31; // L: 1971
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1972
											var32 += var34; // L: 1973
											var35 += var37; // L: 1974
											var38 += var40; // L: 1975
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1958
									var4 += var28; // L: 1959
									var3 += var26; // L: 1960
									var6 += var31; // L: 1961
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1962
									var32 += var34; // L: 1963
									var35 += var37; // L: 1964
									var38 += var40; // L: 1965
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 2007
					if (var1 < Rasterizer3D_clipHeight) { // L: 2008
						if (var2 > Rasterizer3D_clipHeight) { // L: 2009
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 2010
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 2011
						if (var2 < var0) { // L: 2012
							var3 = var4 <<= 14; // L: 2013
							if (var1 < 0) { // L: 2014
								var3 -= var26 * var1; // L: 2015
								var4 -= var27 * var1; // L: 2016
								var7 -= var31 * var1; // L: 2017
								var1 = 0; // L: 2018
							}

							var5 <<= 14; // L: 2020
							if (var2 < 0) { // L: 2021
								var5 -= var28 * var2; // L: 2022
								var2 = 0; // L: 2023
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2025
							var32 += var34 * var41; // L: 2026
							var35 += var37 * var41; // L: 2027
							var38 += var40 * var41; // L: 2028
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 2029
								var0 -= var2; // L: 2030
								var2 -= var1; // L: 2031
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2032

								while (true) {
									--var2; // L: 2033
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2043
											if (var0 < 0) {
												return; // L: 2053
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2044
											var3 += var26; // L: 2045
											var5 += var28; // L: 2046
											var7 += var31; // L: 2047
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2048
											var32 += var34; // L: 2049
											var35 += var37; // L: 2050
											var38 += var40; // L: 2051
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2034
									var3 += var26; // L: 2035
									var4 += var27; // L: 2036
									var7 += var31; // L: 2037
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2038
									var32 += var34; // L: 2039
									var35 += var37; // L: 2040
									var38 += var40; // L: 2041
								}
							} else {
								var0 -= var2; // L: 2056
								var2 -= var1; // L: 2057
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2058

								while (true) {
									--var2; // L: 2059
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2069
											if (var0 < 0) {
												return; // L: 2079
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2070
											var3 += var26; // L: 2071
											var5 += var28; // L: 2072
											var7 += var31; // L: 2073
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2074
											var32 += var34; // L: 2075
											var35 += var37; // L: 2076
											var38 += var40; // L: 2077
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2060
									var3 += var26; // L: 2061
									var4 += var27; // L: 2062
									var7 += var31; // L: 2063
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2064
									var32 += var34; // L: 2065
									var35 += var37; // L: 2066
									var38 += var40; // L: 2067
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2083
							if (var1 < 0) { // L: 2084
								var5 -= var26 * var1; // L: 2085
								var4 -= var27 * var1; // L: 2086
								var7 -= var31 * var1; // L: 2087
								var1 = 0; // L: 2088
							}

							var3 <<= 14; // L: 2090
							if (var0 < 0) { // L: 2091
								var3 -= var0 * var28; // L: 2092
								var0 = 0; // L: 2093
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2095
							var32 += var34 * var41; // L: 2096
							var35 += var37 * var41; // L: 2097
							var38 += var40 * var41; // L: 2098
							if (var26 < var27) { // L: 2099
								var2 -= var0; // L: 2100
								var0 -= var1; // L: 2101
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2102

								while (true) {
									--var0; // L: 2103
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2113
											if (var2 < 0) {
												return; // L: 2123
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2114
											var3 += var28; // L: 2115
											var4 += var27; // L: 2116
											var7 += var31; // L: 2117
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2118
											var32 += var34; // L: 2119
											var35 += var37; // L: 2120
											var38 += var40; // L: 2121
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2104
									var5 += var26; // L: 2105
									var4 += var27; // L: 2106
									var7 += var31; // L: 2107
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2108
									var32 += var34; // L: 2109
									var35 += var37; // L: 2110
									var38 += var40; // L: 2111
								}
							} else {
								var2 -= var0; // L: 2126
								var0 -= var1; // L: 2127
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2128

								while (true) {
									--var0; // L: 2129
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2139
											if (var2 < 0) {
												return; // L: 2149
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2140
											var3 += var28; // L: 2141
											var4 += var27; // L: 2142
											var7 += var31; // L: 2143
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2144
											var32 += var34; // L: 2145
											var35 += var37; // L: 2146
											var38 += var40; // L: 2147
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2130
									var5 += var26; // L: 2131
									var4 += var27; // L: 2132
									var7 += var31; // L: 2133
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2134
									var32 += var34; // L: 2135
									var35 += var37; // L: 2136
									var38 += var40; // L: 2137
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 2154
					if (var0 > Rasterizer3D_clipHeight) { // L: 2155
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 2156
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 2157
					if (var0 < var1) { // L: 2158
						var4 = var5 <<= 14; // L: 2159
						if (var2 < 0) { // L: 2160
							var4 -= var27 * var2; // L: 2161
							var5 -= var28 * var2; // L: 2162
							var8 -= var31 * var2; // L: 2163
							var2 = 0; // L: 2164
						}

						var3 <<= 14; // L: 2166
						if (var0 < 0) { // L: 2167
							var3 -= var0 * var26; // L: 2168
							var0 = 0; // L: 2169
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2171
						var32 += var34 * var41; // L: 2172
						var35 += var37 * var41; // L: 2173
						var38 += var40 * var41; // L: 2174
						if (var27 < var28) { // L: 2175
							var1 -= var0; // L: 2176
							var0 -= var2; // L: 2177
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2178

							while (true) {
								--var0; // L: 2179
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2189
										if (var1 < 0) {
											return; // L: 2199
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2190
										var4 += var27; // L: 2191
										var3 += var26; // L: 2192
										var8 += var31; // L: 2193
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2194
										var32 += var34; // L: 2195
										var35 += var37; // L: 2196
										var38 += var40; // L: 2197
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2180
								var4 += var27; // L: 2181
								var5 += var28; // L: 2182
								var8 += var31; // L: 2183
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2184
								var32 += var34; // L: 2185
								var35 += var37; // L: 2186
								var38 += var40; // L: 2187
							}
						} else {
							var1 -= var0; // L: 2202
							var0 -= var2; // L: 2203
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2204

							while (true) {
								--var0; // L: 2205
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2215
										if (var1 < 0) {
											return; // L: 2225
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2216
										var4 += var27; // L: 2217
										var3 += var26; // L: 2218
										var8 += var31; // L: 2219
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2220
										var32 += var34; // L: 2221
										var35 += var37; // L: 2222
										var38 += var40; // L: 2223
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2206
								var4 += var27; // L: 2207
								var5 += var28; // L: 2208
								var8 += var31; // L: 2209
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2210
								var32 += var34; // L: 2211
								var35 += var37; // L: 2212
								var38 += var40; // L: 2213
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 2229
						if (var2 < 0) { // L: 2230
							var3 -= var27 * var2; // L: 2231
							var5 -= var28 * var2; // L: 2232
							var8 -= var31 * var2; // L: 2233
							var2 = 0; // L: 2234
						}

						var4 <<= 14; // L: 2236
						if (var1 < 0) { // L: 2237
							var4 -= var26 * var1; // L: 2238
							var1 = 0; // L: 2239
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2241
						var32 += var34 * var41; // L: 2242
						var35 += var37 * var41; // L: 2243
						var38 += var40 * var41; // L: 2244
						if (var27 < var28) { // L: 2245
							var0 -= var1; // L: 2246
							var1 -= var2; // L: 2247
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2248

							while (true) {
								--var1; // L: 2249
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2259
										if (var0 < 0) {
											return; // L: 2269
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2260
										var4 += var26; // L: 2261
										var5 += var28; // L: 2262
										var8 += var31; // L: 2263
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2264
										var32 += var34; // L: 2265
										var35 += var37; // L: 2266
										var38 += var40; // L: 2267
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2250
								var3 += var27; // L: 2251
								var5 += var28; // L: 2252
								var8 += var31; // L: 2253
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2254
								var32 += var34; // L: 2255
								var35 += var37; // L: 2256
								var38 += var40; // L: 2257
							}
						} else {
							var0 -= var1; // L: 2272
							var1 -= var2; // L: 2273
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2274

							while (true) {
								--var1; // L: 2275
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2285
										if (var0 < 0) {
											return; // L: 2295
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2286
										var4 += var26; // L: 2287
										var5 += var28; // L: 2288
										var8 += var31; // L: 2289
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2290
										var32 += var34; // L: 2291
										var35 += var37; // L: 2292
										var38 += var40; // L: 2293
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2276
								var3 += var27; // L: 2277
								var5 += var28; // L: 2278
								var8 += var31; // L: 2279
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2280
								var32 += var34; // L: 2281
								var35 += var37; // L: 2282
								var38 += var40; // L: 2283
							}
						}
					}
				}
			}
		}
	} // L: 1826

	@ObfuscatedName("y")
	@Export("Rasterizer3D_textureAlpha")
	static final void Rasterizer3D_textureAlpha(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field1800) { // L: 2304
			if (var6 > Rasterizer3D_clipWidth) { // L: 2305
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 2306
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 2308
			var4 += var5; // L: 2309
			var7 += var5 * var8; // L: 2310
			int var17 = var6 - var5; // L: 2311
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 2312
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2319
				var9 += var23 * var12; // L: 2320
				var10 += var13 * var23; // L: 2321
				var11 += var23 * var14; // L: 2322
				var22 = var11 >> 12; // L: 2323
				if (var22 != 0) { // L: 2324
					var18 = var9 / var22; // L: 2325
					var19 = var10 / var22; // L: 2326
				} else {
					var18 = 0; // L: 2329
					var19 = 0; // L: 2330
				}

				var9 += var17 * var12; // L: 2332
				var10 += var13 * var17; // L: 2333
				var11 += var17 * var14; // L: 2334
				var22 = var11 >> 12; // L: 2335
				if (var22 != 0) { // L: 2336
					var20 = var9 / var22; // L: 2337
					var21 = var10 / var22; // L: 2338
				} else {
					var20 = 0; // L: 2341
					var21 = 0; // L: 2342
				}

				var2 = (var18 << 20) + var19; // L: 2344
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 20); // L: 2345
				var17 >>= 3; // L: 2346
				var8 <<= 3; // L: 2347
				var15 = var7 >> 8; // L: 2348
				if (field1811) { // L: 2350
					if (var17 > 0) { // L: 2351
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2353
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2354
							var2 += var16; // L: 2355
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2356
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2357
							var2 += var16; // L: 2358
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2359
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2360
							var2 += var16; // L: 2361
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2362
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2363
							var2 += var16; // L: 2364
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2365
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2366
							var2 += var16; // L: 2367
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2368
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2369
							var2 += var16; // L: 2370
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2371
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2372
							var2 += var16; // L: 2373
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2374
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2375
							var2 += var16; // L: 2376
							var7 += var8; // L: 2377
							var15 = var7 >> 8; // L: 2378
							--var17; // L: 2379
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2381
					if (var17 > 0) { // L: 2382
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2384
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2385
							var2 += var16; // L: 2386
							--var17; // L: 2387
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2391
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2393
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2394
							}

							++var4; // L: 2396
							var2 += var16; // L: 2397
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2398
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2399
							}

							++var4; // L: 2401
							var2 += var16; // L: 2402
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2403
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2404
							}

							++var4; // L: 2406
							var2 += var16; // L: 2407
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2408
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2409
							}

							++var4; // L: 2411
							var2 += var16; // L: 2412
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2413
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2414
							}

							++var4; // L: 2416
							var2 += var16; // L: 2417
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2418
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2419
							}

							++var4; // L: 2421
							var2 += var16; // L: 2422
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2423
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2424
							}

							++var4; // L: 2426
							var2 += var16; // L: 2427
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2428
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2429
							}

							++var4; // L: 2431
							var2 += var16; // L: 2432
							var7 += var8; // L: 2433
							var15 = var7 >> 8; // L: 2434
							--var17; // L: 2435
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2437
					if (var17 > 0) { // L: 2438
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2440
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2441
							}

							++var4; // L: 2443
							var2 += var16; // L: 2444
							--var17; // L: 2445
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2456
				var9 += var23 * var12; // L: 2457
				var10 += var13 * var23; // L: 2458
				var11 += var23 * var14; // L: 2459
				var22 = var11 >> 14; // L: 2460
				if (var22 != 0) { // L: 2461
					var18 = var9 / var22; // L: 2462
					var19 = var10 / var22; // L: 2463
				} else {
					var18 = 0; // L: 2466
					var19 = 0; // L: 2467
				}

				var9 += var17 * var12; // L: 2469
				var10 += var13 * var17; // L: 2470
				var11 += var17 * var14; // L: 2471
				var22 = var11 >> 14; // L: 2472
				if (var22 != 0) { // L: 2473
					var20 = var9 / var22; // L: 2474
					var21 = var10 / var22; // L: 2475
				} else {
					var20 = 0; // L: 2478
					var21 = 0; // L: 2479
				}

				var2 = (var18 << 18) + var19; // L: 2481
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 18); // L: 2482
				var17 >>= 3; // L: 2483
				var8 <<= 3; // L: 2484
				var15 = var7 >> 8; // L: 2485
				if (field1811) { // L: 2487
					if (var17 > 0) { // L: 2488
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2490
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2491
							var2 += var16; // L: 2492
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2493
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2494
							var2 += var16; // L: 2495
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2496
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2497
							var2 += var16; // L: 2498
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2499
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2500
							var2 += var16; // L: 2501
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2502
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2503
							var2 += var16; // L: 2504
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2505
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2506
							var2 += var16; // L: 2507
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2508
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2509
							var2 += var16; // L: 2510
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2511
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2512
							var2 += var16; // L: 2513
							var7 += var8; // L: 2514
							var15 = var7 >> 8; // L: 2515
							--var17; // L: 2516
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2518
					if (var17 > 0) { // L: 2519
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2521
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2522
							var2 += var16; // L: 2523
							--var17; // L: 2524
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2528
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2530
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2531
							}

							++var4; // L: 2533
							var2 += var16; // L: 2534
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2535
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2536
							}

							++var4; // L: 2538
							var2 += var16; // L: 2539
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2540
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2541
							}

							++var4; // L: 2543
							var2 += var16; // L: 2544
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2545
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2546
							}

							++var4; // L: 2548
							var2 += var16; // L: 2549
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2550
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2551
							}

							++var4; // L: 2553
							var2 += var16; // L: 2554
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2555
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2556
							}

							++var4; // L: 2558
							var2 += var16; // L: 2559
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2560
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2561
							}

							++var4; // L: 2563
							var2 += var16; // L: 2564
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2565
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2566
							}

							++var4; // L: 2568
							var2 += var16; // L: 2569
							var7 += var8; // L: 2570
							var15 = var7 >> 8; // L: 2571
							--var17; // L: 2572
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2574
					if (var17 > 0) { // L: 2575
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2577
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2578
							}

							++var4; // L: 2580
							var2 += var16; // L: 2581
							--var17; // L: 2582
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 2586

	@ObfuscatedName("s")
	static final int method3186(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 2589
		if (var1 < 2) { // L: 2590
			var1 = 2;
		} else if (var1 > 126) { // L: 2591
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 2592
	}

	@ObfuscatedName("j")
	static final int method3157(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2596
	}

	@ObfuscatedName("d")
	static final int method3179(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2600
	}

	@ObfuscatedName("a")
	static final int method3158(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 2604
	}

	@ObfuscatedName("g")
	static final int method3159(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 2608
	}

	@ObfuscatedName("h")
	static final int method3196(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2612
	}

	@ObfuscatedName("ab")
	static final int method3161(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2616
	}
}
