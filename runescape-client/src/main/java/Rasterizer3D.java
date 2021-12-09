import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("Rasterizer3D")
public class Rasterizer3D extends Rasterizer2D {
	@ObfuscatedName("c")
	static boolean field2253;
	@ObfuscatedName("b")
	static boolean field2251;
	@ObfuscatedName("p")
	@Export("Rasterizer3D_isLowDetailTexture")
	static boolean Rasterizer3D_isLowDetailTexture;
	@ObfuscatedName("m")
	public static boolean field2276;
	@ObfuscatedName("t")
	@Export("Rasterizer3D_alpha")
	static int Rasterizer3D_alpha;
	@ObfuscatedName("v")
	@Export("Rasterizer3D_zoom")
	public static int Rasterizer3D_zoom;
	@ObfuscatedName("d")
	@Export("Rasterizer3D_clipMidX")
	static int Rasterizer3D_clipMidX;
	@ObfuscatedName("h")
	@Export("Rasterizer3D_clipMidY")
	static int Rasterizer3D_clipMidY;
	@ObfuscatedName("g")
	@Export("Rasterizer3D_clipWidth")
	static int Rasterizer3D_clipWidth;
	@ObfuscatedName("e")
	@Export("Rasterizer3D_clipHeight")
	static int Rasterizer3D_clipHeight;
	@ObfuscatedName("a")
	@Export("Rasterizer3D_clipNegativeMidX")
	static int Rasterizer3D_clipNegativeMidX;
	@ObfuscatedName("u")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2;
	@ObfuscatedName("k")
	@Export("Rasterizer3D_clipNegativeMidY")
	static int Rasterizer3D_clipNegativeMidY;
	@ObfuscatedName("f")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2;
	@ObfuscatedName("l")
	@Export("Rasterizer3D_rowOffsets")
	static int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("q")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("Rasterizer3D_textureLoader")
	public static TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("z")
	static int[] field2273;
	@ObfuscatedName("i")
	static int[] field2271;
	@ObfuscatedName("y")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ah")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;

	static {
		field2253 = false; // L: 8
		field2251 = false; // L: 9
		Rasterizer3D_isLowDetailTexture = false; // L: 10
		field2276 = true; // L: 11
		Rasterizer3D_alpha = 0; // L: 12
		Rasterizer3D_zoom = 512; // L: 19
		Rasterizer3D_rowOffsets = new int[1024]; // L: 28
		Rasterizer3D_colorPalette = new int[65536]; // L: 29
		field2273 = new int[512]; // L: 31
		field2271 = new int[2048]; // L: 32
		Rasterizer3D_sine = new int[2048]; // L: 33
		Rasterizer3D_cosine = new int[2048]; // L: 34

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 37
			field2273[var0] = 32768 / var0; // L: 38
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 40
			field2271[var0] = 65536 / var0; // L: 41
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 43
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D)); // L: 44
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D)); // L: 45
		}

	} // L: 47

	@ObfuscatedName("c")
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
			Rasterizer3D_rowOffsets = new int[SpotAnimationDefinition.method3362(Rasterizer3D_clipHeight)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1; // L: 62

		for (int var5 = 0; var5 < Rasterizer3D_clipHeight; ++var5) { // L: 63
			Rasterizer3D_rowOffsets[var5] = var4; // L: 64
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 65
		}

	} // L: 67

	@ObfuscatedName("p")
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
	public static final void method3913(int var0, int var1) {
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lhj;)V"
	)
	@Export("Rasterizer3D_setTextureLoader")
	public static final void Rasterizer3D_setTextureLoader(TextureLoader var0) {
		Rasterizer3D_textureLoader = var0; // L: 91
	} // L: 92

	@ObfuscatedName("s")
	@Export("Rasterizer3D_setBrightness")
	public static final void Rasterizer3D_setBrightness(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512); // L: 95
	} // L: 96

	@ObfuscatedName("j")
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

	@ObfuscatedName("w")
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

	@ObfuscatedName("n")
	public static void method3853(int var0, int var1, int var2) {
		field2253 = var0 < 0 || var0 > Rasterizer3D_clipWidth || var1 < 0 || var1 > Rasterizer3D_clipWidth || var2 < 0 || var2 > Rasterizer3D_clipWidth; // L: 156
	} // L: 157

	@ObfuscatedName("r")
	static final void method3854(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	@ObfuscatedName("o")
	@Export("Rasterizer3D_vertAlpha")
	static final void Rasterizer3D_vertAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field2253) { // L: 524
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
			int var11;
			if (field2276) { // L: 531
				var3 = var5 - var4 >> 2; // L: 532
				var7 <<= 2; // L: 533
				if (Rasterizer3D_alpha == 0) { // L: 534
					if (var3 > 0) { // L: 535
						do {
							var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 537
							var2 = Rasterizer3D_colorPalette[var8]; // L: 538
							var6 += var7; // L: 539
							var0[var1++] = var2; // L: 540
							var0[var1++] = var2; // L: 541
							var0[var1++] = var2; // L: 542
							var0[var1++] = var2; // L: 543
							--var3; // L: 544
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 546
					if (var3 > 0) { // L: 547
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 548
						var2 = Rasterizer3D_colorPalette[var8]; // L: 549

						do {
							var0[var1++] = var2; // L: 551
							--var3; // L: 552
						} while(var3 > 0);
					}
				} else {
					var8 = Rasterizer3D_alpha; // L: 556
					var9 = 256 - Rasterizer3D_alpha; // L: 557
					if (var3 > 0) { // L: 558
						do {
							var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 560
							var2 = Rasterizer3D_colorPalette[var10]; // L: 561
							var6 += var7; // L: 562
							var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 563
							var11 = var0[var1]; // L: 564
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 565
							var11 = var0[var1]; // L: 566
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 567
							var11 = var0[var1]; // L: 568
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 569
							var11 = var0[var1]; // L: 570
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 571
							--var3; // L: 572
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3; // L: 574
					if (var3 > 0) { // L: 575
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 576
						var2 = Rasterizer3D_colorPalette[var10]; // L: 577
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 578

						do {
							var11 = var0[var1]; // L: 580
							var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 581
							--var3; // L: 582
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4; // L: 588
				if (Rasterizer3D_alpha == 0) { // L: 589
					do {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 591
						var0[var1++] = Rasterizer3D_colorPalette[var8]; // L: 592
						var6 += var7; // L: 593
						--var3; // L: 594
					} while(var3 > 0);
				} else {
					var8 = Rasterizer3D_alpha; // L: 597
					var9 = 256 - Rasterizer3D_alpha; // L: 598

					do {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8; // L: 600
						var2 = Rasterizer3D_colorPalette[var10]; // L: 601
						var6 += var7; // L: 602
						var2 = (var9 * (var2 & 65280) >> 8 & 65280) + (var9 * (var2 & 16711935) >> 8 & 16711935); // L: 603
						var11 = var0[var1]; // L: 604
						var0[var1++] = ((var11 & 16711935) * var8 >> 8 & 16711935) + var2 + (var8 * (var11 & 65280) >> 8 & 65280); // L: 605
						--var3; // L: 606
					} while(var3 > 0);
				}

			}
		}
	} // L: 585 608

	@ObfuscatedName("v")
	public static final void method3856(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 613
		if (var0 != var1) { // L: 614
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0; // L: 615
		if (var2 != var1) { // L: 616
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0; // L: 617
		if (var0 != var2) { // L: 618
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) { // L: 619
			if (var0 < Rasterizer3D_clipHeight) { // L: 620
				if (var1 > Rasterizer3D_clipHeight) { // L: 621
					var1 = Rasterizer3D_clipHeight;
				}

				if (var2 > Rasterizer3D_clipHeight) { // L: 622
					var2 = Rasterizer3D_clipHeight;
				}

				if (var1 < var2) { // L: 623
					var5 = var3 <<= 14; // L: 624
					if (var0 < 0) { // L: 625
						var5 -= var0 * var9; // L: 626
						var3 -= var0 * var7; // L: 627
						var0 = 0; // L: 628
					}

					var4 <<= 14; // L: 630
					if (var1 < 0) { // L: 631
						var4 -= var8 * var1; // L: 632
						var1 = 0; // L: 633
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) { // L: 635
						var2 -= var1; // L: 636
						var1 -= var0; // L: 637
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 638

						while (true) {
							--var1; // L: 639
							if (var1 < 0) {
								while (true) {
									--var2; // L: 645
									if (var2 < 0) {
										return; // L: 651
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var4 >> 14); // L: 646
									var5 += var9; // L: 647
									var4 += var8; // L: 648
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 649
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 640
							var5 += var9; // L: 641
							var3 += var7; // L: 642
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 643
						}
					} else {
						var2 -= var1; // L: 654
						var1 -= var0; // L: 655
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 656

						while (true) {
							--var1; // L: 657
							if (var1 < 0) {
								while (true) {
									--var2; // L: 663
									if (var2 < 0) {
										return; // L: 669
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var5 >> 14); // L: 664
									var5 += var9; // L: 665
									var4 += var8; // L: 666
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 667
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 658
							var5 += var9; // L: 659
							var3 += var7; // L: 660
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 661
						}
					}
				} else {
					var4 = var3 <<= 14; // L: 673
					if (var0 < 0) { // L: 674
						var4 -= var0 * var9; // L: 675
						var3 -= var0 * var7; // L: 676
						var0 = 0; // L: 677
					}

					var5 <<= 14; // L: 679
					if (var2 < 0) { // L: 680
						var5 -= var8 * var2; // L: 681
						var2 = 0; // L: 682
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) { // L: 684
						var1 -= var2; // L: 685
						var2 -= var0; // L: 686
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 687

						while (true) {
							--var2; // L: 688
							if (var2 < 0) {
								while (true) {
									--var1; // L: 694
									if (var1 < 0) {
										return; // L: 700
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var5 >> 14, var3 >> 14); // L: 695
									var5 += var8; // L: 696
									var3 += var7; // L: 697
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 698
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var4 >> 14, var3 >> 14); // L: 689
							var4 += var9; // L: 690
							var3 += var7; // L: 691
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 692
						}
					} else {
						var1 -= var2; // L: 703
						var2 -= var0; // L: 704
						var0 = Rasterizer3D_rowOffsets[var0]; // L: 705

						while (true) {
							--var2; // L: 706
							if (var2 < 0) {
								while (true) {
									--var1; // L: 712
									if (var1 < 0) {
										return; // L: 718
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var5 >> 14); // L: 713
									var5 += var8; // L: 714
									var3 += var7; // L: 715
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 716
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var6, 0, var3 >> 14, var4 >> 14); // L: 707
							var4 += var9; // L: 708
							var3 += var7; // L: 709
							var0 += Rasterizer2D.Rasterizer2D_width; // L: 710
						}
					}
				}
			}
		} else if (var1 <= var2) { // L: 722
			if (var1 < Rasterizer3D_clipHeight) { // L: 723
				if (var2 > Rasterizer3D_clipHeight) { // L: 724
					var2 = Rasterizer3D_clipHeight;
				}

				if (var0 > Rasterizer3D_clipHeight) { // L: 725
					var0 = Rasterizer3D_clipHeight;
				}

				if (var2 < var0) { // L: 726
					var3 = var4 <<= 14; // L: 727
					if (var1 < 0) { // L: 728
						var3 -= var7 * var1; // L: 729
						var4 -= var8 * var1; // L: 730
						var1 = 0; // L: 731
					}

					var5 <<= 14; // L: 733
					if (var2 < 0) { // L: 734
						var5 -= var9 * var2; // L: 735
						var2 = 0; // L: 736
					}

					if (var2 != var1 && var7 < var8 || var2 == var1 && var7 > var9) { // L: 738
						var0 -= var2; // L: 739
						var2 -= var1; // L: 740
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 741

						while (true) {
							--var2; // L: 742
							if (var2 < 0) {
								while (true) {
									--var0; // L: 748
									if (var0 < 0) {
										return; // L: 754
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var5 >> 14); // L: 749
									var3 += var7; // L: 750
									var5 += var9; // L: 751
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 752
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 743
							var3 += var7; // L: 744
							var4 += var8; // L: 745
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 746
						}
					} else {
						var0 -= var2; // L: 757
						var2 -= var1; // L: 758
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 759

						while (true) {
							--var2; // L: 760
							if (var2 < 0) {
								while (true) {
									--var0; // L: 766
									if (var0 < 0) {
										return; // L: 772
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var3 >> 14); // L: 767
									var3 += var7; // L: 768
									var5 += var9; // L: 769
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 770
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 761
							var3 += var7; // L: 762
							var4 += var8; // L: 763
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 764
						}
					}
				} else {
					var5 = var4 <<= 14; // L: 776
					if (var1 < 0) { // L: 777
						var5 -= var7 * var1; // L: 778
						var4 -= var8 * var1; // L: 779
						var1 = 0; // L: 780
					}

					var3 <<= 14; // L: 782
					if (var0 < 0) { // L: 783
						var3 -= var0 * var9; // L: 784
						var0 = 0; // L: 785
					}

					if (var7 < var8) { // L: 787
						var2 -= var0; // L: 788
						var0 -= var1; // L: 789
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 790

						while (true) {
							--var0; // L: 791
							if (var0 < 0) {
								while (true) {
									--var2; // L: 797
									if (var2 < 0) {
										return; // L: 803
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var3 >> 14, var4 >> 14); // L: 798
									var3 += var9; // L: 799
									var4 += var8; // L: 800
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 801
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var5 >> 14, var4 >> 14); // L: 792
							var5 += var7; // L: 793
							var4 += var8; // L: 794
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 795
						}
					} else {
						var2 -= var0; // L: 806
						var0 -= var1; // L: 807
						var1 = Rasterizer3D_rowOffsets[var1]; // L: 808

						while (true) {
							--var0; // L: 809
							if (var0 < 0) {
								while (true) {
									--var2; // L: 815
									if (var2 < 0) {
										return; // L: 821
									}

									Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var3 >> 14); // L: 816
									var3 += var9; // L: 817
									var4 += var8; // L: 818
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 819
								}
							}

							Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var1, var6, 0, var4 >> 14, var5 >> 14); // L: 810
							var5 += var7; // L: 811
							var4 += var8; // L: 812
							var1 += Rasterizer2D.Rasterizer2D_width; // L: 813
						}
					}
				}
			}
		} else if (var2 < Rasterizer3D_clipHeight) { // L: 826
			if (var0 > Rasterizer3D_clipHeight) { // L: 827
				var0 = Rasterizer3D_clipHeight;
			}

			if (var1 > Rasterizer3D_clipHeight) { // L: 828
				var1 = Rasterizer3D_clipHeight;
			}

			if (var0 < var1) { // L: 829
				var4 = var5 <<= 14; // L: 830
				if (var2 < 0) { // L: 831
					var4 -= var8 * var2; // L: 832
					var5 -= var9 * var2; // L: 833
					var2 = 0; // L: 834
				}

				var3 <<= 14; // L: 836
				if (var0 < 0) { // L: 837
					var3 -= var0 * var7; // L: 838
					var0 = 0; // L: 839
				}

				if (var8 < var9) { // L: 841
					var1 -= var0; // L: 842
					var0 -= var2; // L: 843
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 844

					while (true) {
						--var0; // L: 845
						if (var0 < 0) {
							while (true) {
								--var1; // L: 851
								if (var1 < 0) {
									return; // L: 857
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var3 >> 14); // L: 852
								var4 += var8; // L: 853
								var3 += var7; // L: 854
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 855
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 846
						var4 += var8; // L: 847
						var5 += var9; // L: 848
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 849
					}
				} else {
					var1 -= var0; // L: 860
					var0 -= var2; // L: 861
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 862

					while (true) {
						--var0; // L: 863
						if (var0 < 0) {
							while (true) {
								--var1; // L: 869
								if (var1 < 0) {
									return; // L: 875
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var4 >> 14); // L: 870
								var4 += var8; // L: 871
								var3 += var7; // L: 872
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 873
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 864
						var4 += var8; // L: 865
						var5 += var9; // L: 866
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 867
					}
				}
			} else {
				var3 = var5 <<= 14; // L: 879
				if (var2 < 0) { // L: 880
					var3 -= var8 * var2; // L: 881
					var5 -= var9 * var2; // L: 882
					var2 = 0; // L: 883
				}

				var4 <<= 14; // L: 885
				if (var1 < 0) { // L: 886
					var4 -= var7 * var1; // L: 887
					var1 = 0; // L: 888
				}

				if (var8 < var9) { // L: 890
					var0 -= var1; // L: 891
					var1 -= var2; // L: 892
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 893

					while (true) {
						--var1; // L: 894
						if (var1 < 0) {
							while (true) {
								--var0; // L: 900
								if (var0 < 0) {
									return; // L: 906
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var4 >> 14, var5 >> 14); // L: 901
								var4 += var7; // L: 902
								var5 += var9; // L: 903
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 904
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var3 >> 14, var5 >> 14); // L: 895
						var3 += var8; // L: 896
						var5 += var9; // L: 897
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 898
					}
				} else {
					var0 -= var1; // L: 909
					var1 -= var2; // L: 910
					var2 = Rasterizer3D_rowOffsets[var2]; // L: 911

					while (true) {
						--var1; // L: 912
						if (var1 < 0) {
							while (true) {
								--var0; // L: 918
								if (var0 < 0) {
									return; // L: 924
								}

								Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var4 >> 14); // L: 919
								var4 += var7; // L: 920
								var5 += var9; // L: 921
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 922
							}
						}

						Rasterizer3D_horizAlpha(Rasterizer2D.Rasterizer2D_pixels, var2, var6, 0, var5 >> 14, var3 >> 14); // L: 913
						var3 += var8; // L: 914
						var5 += var9; // L: 915
						var2 += Rasterizer2D.Rasterizer2D_width; // L: 916
					}
				}
			}
		}
	}

	@ObfuscatedName("d")
	@Export("Rasterizer3D_horizAlpha")
	static final void Rasterizer3D_horizAlpha(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field2253) { // L: 931
			if (var5 > Rasterizer3D_clipWidth) { // L: 932
				var5 = Rasterizer3D_clipWidth;
			}

			if (var4 < 0) { // L: 933
				var4 = 0;
			}
		}

		if (var4 < var5) { // L: 935
			var1 += var4; // L: 936
			var3 = var5 - var4 >> 2; // L: 937
			if (Rasterizer3D_alpha != 0) { // L: 938
				if (Rasterizer3D_alpha == 254) { // L: 950
					while (true) {
						--var3; // L: 951
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 957

							while (true) {
								--var3; // L: 958
								if (var3 < 0) {
									return; // L: 982
								}

								var0[var1++] = var0[var1]; // L: 959
							}
						}

						var0[var1++] = var0[var1]; // L: 952
						var0[var1++] = var0[var1]; // L: 953
						var0[var1++] = var0[var1]; // L: 954
						var0[var1++] = var0[var1]; // L: 955
					}
				} else {
					int var6 = Rasterizer3D_alpha; // L: 963
					int var7 = 256 - Rasterizer3D_alpha; // L: 964
					var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935); // L: 965

					while (true) {
						--var3; // L: 966
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3; // L: 976

							while (true) {
								--var3; // L: 977
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1]; // L: 978
								var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 979
							}
						}

						var8 = var0[var1]; // L: 967
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 968
						var8 = var0[var1]; // L: 969
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 970
						var8 = var0[var1]; // L: 971
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 972
						var8 = var0[var1]; // L: 973
						var0[var1++] = ((var8 & 16711935) * var6 >> 8 & 16711935) + var2 + (var6 * (var8 & 65280) >> 8 & 65280); // L: 974
					}
				}
			} else {
				while (true) {
					--var3; // L: 939
					if (var3 < 0) {
						var3 = var5 - var4 & 3; // L: 945

						while (true) {
							--var3; // L: 946
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2; // L: 947
						}
					}

					var0[var1++] = var2; // L: 940
					var0[var1++] = var2; // L: 941
					var0[var1++] = var2; // L: 942
					var0[var1++] = var2; // L: 943
				}
			}
		}
	}

	@ObfuscatedName("h")
	static final void method3876(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 985
		int var20;
		if (var19 == null) { // L: 986
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 987
			method3854(var0, var1, var2, var3, var4, var5, method3862(var20, var6), method3862(var20, var7), method3862(var20, var8)); // L: 988
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 991
			field2251 = Rasterizer3D_textureLoader.vmethod4324(var18); // L: 992
			var20 = var4 - var3; // L: 993
			int var21 = var1 - var0; // L: 994
			int var22 = var5 - var3; // L: 995
			int var23 = var2 - var0; // L: 996
			int var24 = var7 - var6; // L: 997
			int var25 = var8 - var6; // L: 998
			int var26 = 0; // L: 999
			if (var0 != var1) { // L: 1000
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1001
			if (var2 != var1) { // L: 1002
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1003
			if (var0 != var2) { // L: 1004
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1005
			if (var29 != 0) { // L: 1006
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1007
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1008
				var10 = var9 - var10; // L: 1009
				var13 = var12 - var13; // L: 1010
				var16 = var15 - var16; // L: 1011
				var11 -= var9; // L: 1012
				var14 -= var12; // L: 1013
				var17 -= var15; // L: 1014
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1015
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1016
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1017
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1018
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1019
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1020
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1021
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)Rasterizer3D_zoom); // L: 1022
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1023
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1024
					if (var0 < Rasterizer3D_clipHeight) { // L: 1025
						if (var1 > Rasterizer3D_clipHeight) { // L: 1026
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1027
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1028
						if (var1 < var2) { // L: 1029
							var5 = var3 <<= 14; // L: 1030
							if (var0 < 0) { // L: 1031
								var5 -= var0 * var28; // L: 1032
								var3 -= var0 * var26; // L: 1033
								var6 -= var0 * var31; // L: 1034
								var0 = 0; // L: 1035
							}

							var4 <<= 14; // L: 1037
							if (var1 < 0) { // L: 1038
								var4 -= var27 * var1; // L: 1039
								var1 = 0; // L: 1040
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1042
							var32 += var34 * var41; // L: 1043
							var35 += var37 * var41; // L: 1044
							var38 += var40 * var41; // L: 1045
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) { // L: 1046
								var2 -= var1; // L: 1073
								var1 -= var0; // L: 1074
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1075

								while (true) {
									--var1; // L: 1076
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1086
											if (var2 < 0) {
												return; // L: 1096
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1087
											var5 += var28; // L: 1088
											var4 += var27; // L: 1089
											var6 += var31; // L: 1090
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1091
											var32 += var34; // L: 1092
											var35 += var37; // L: 1093
											var38 += var40; // L: 1094
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1077
									var5 += var28; // L: 1078
									var3 += var26; // L: 1079
									var6 += var31; // L: 1080
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1081
									var32 += var34; // L: 1082
									var35 += var37; // L: 1083
									var38 += var40; // L: 1084
								}
							} else {
								var2 -= var1; // L: 1047
								var1 -= var0; // L: 1048
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1049

								while (true) {
									--var1; // L: 1050
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1060
											if (var2 < 0) {
												return; // L: 1070
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1061
											var5 += var28; // L: 1062
											var4 += var27; // L: 1063
											var6 += var31; // L: 1064
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1065
											var32 += var34; // L: 1066
											var35 += var37; // L: 1067
											var38 += var40; // L: 1068
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1051
									var5 += var28; // L: 1052
									var3 += var26; // L: 1053
									var6 += var31; // L: 1054
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1055
									var32 += var34; // L: 1056
									var35 += var37; // L: 1057
									var38 += var40; // L: 1058
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1100
							if (var0 < 0) { // L: 1101
								var4 -= var0 * var28; // L: 1102
								var3 -= var0 * var26; // L: 1103
								var6 -= var0 * var31; // L: 1104
								var0 = 0; // L: 1105
							}

							var5 <<= 14; // L: 1107
							if (var2 < 0) { // L: 1108
								var5 -= var27 * var2; // L: 1109
								var2 = 0; // L: 1110
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1112
							var32 += var34 * var41; // L: 1113
							var35 += var37 * var41; // L: 1114
							var38 += var40 * var41; // L: 1115
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 1116
								var1 -= var2; // L: 1143
								var2 -= var0; // L: 1144
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1145

								while (true) {
									--var2; // L: 1146
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1156
											if (var1 < 0) {
												return; // L: 1166
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1157
											var5 += var27; // L: 1158
											var3 += var26; // L: 1159
											var6 += var31; // L: 1160
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1161
											var32 += var34; // L: 1162
											var35 += var37; // L: 1163
											var38 += var40; // L: 1164
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1147
									var4 += var28; // L: 1148
									var3 += var26; // L: 1149
									var6 += var31; // L: 1150
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1151
									var32 += var34; // L: 1152
									var35 += var37; // L: 1153
									var38 += var40; // L: 1154
								}
							} else {
								var1 -= var2; // L: 1117
								var2 -= var0; // L: 1118
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1119

								while (true) {
									--var2; // L: 1120
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1130
											if (var1 < 0) {
												return; // L: 1140
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1131
											var5 += var27; // L: 1132
											var3 += var26; // L: 1133
											var6 += var31; // L: 1134
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1135
											var32 += var34; // L: 1136
											var35 += var37; // L: 1137
											var38 += var40; // L: 1138
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1121
									var4 += var28; // L: 1122
									var3 += var26; // L: 1123
									var6 += var31; // L: 1124
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1125
									var32 += var34; // L: 1126
									var35 += var37; // L: 1127
									var38 += var40; // L: 1128
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 1170
					if (var1 < Rasterizer3D_clipHeight) { // L: 1171
						if (var2 > Rasterizer3D_clipHeight) { // L: 1172
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 1173
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 1174
						if (var2 < var0) { // L: 1175
							var3 = var4 <<= 14; // L: 1176
							if (var1 < 0) { // L: 1177
								var3 -= var26 * var1; // L: 1178
								var4 -= var27 * var1; // L: 1179
								var7 -= var31 * var1; // L: 1180
								var1 = 0; // L: 1181
							}

							var5 <<= 14; // L: 1183
							if (var2 < 0) { // L: 1184
								var5 -= var28 * var2; // L: 1185
								var2 = 0; // L: 1186
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1188
							var32 += var34 * var41; // L: 1189
							var35 += var37 * var41; // L: 1190
							var38 += var40 * var41; // L: 1191
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 1192
								var0 -= var2; // L: 1193
								var2 -= var1; // L: 1194
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1195

								while (true) {
									--var2; // L: 1196
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1206
											if (var0 < 0) {
												return; // L: 1216
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1207
											var3 += var26; // L: 1208
											var5 += var28; // L: 1209
											var7 += var31; // L: 1210
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1211
											var32 += var34; // L: 1212
											var35 += var37; // L: 1213
											var38 += var40; // L: 1214
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1197
									var3 += var26; // L: 1198
									var4 += var27; // L: 1199
									var7 += var31; // L: 1200
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1201
									var32 += var34; // L: 1202
									var35 += var37; // L: 1203
									var38 += var40; // L: 1204
								}
							} else {
								var0 -= var2; // L: 1219
								var2 -= var1; // L: 1220
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1221

								while (true) {
									--var2; // L: 1222
									if (var2 < 0) {
										while (true) {
											--var0; // L: 1232
											if (var0 < 0) {
												return; // L: 1242
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1233
											var3 += var26; // L: 1234
											var5 += var28; // L: 1235
											var7 += var31; // L: 1236
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1237
											var32 += var34; // L: 1238
											var35 += var37; // L: 1239
											var38 += var40; // L: 1240
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1223
									var3 += var26; // L: 1224
									var4 += var27; // L: 1225
									var7 += var31; // L: 1226
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1227
									var32 += var34; // L: 1228
									var35 += var37; // L: 1229
									var38 += var40; // L: 1230
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 1246
							if (var1 < 0) { // L: 1247
								var5 -= var26 * var1; // L: 1248
								var4 -= var27 * var1; // L: 1249
								var7 -= var31 * var1; // L: 1250
								var1 = 0; // L: 1251
							}

							var3 <<= 14; // L: 1253
							if (var0 < 0) { // L: 1254
								var3 -= var0 * var28; // L: 1255
								var0 = 0; // L: 1256
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 1258
							var32 += var34 * var41; // L: 1259
							var35 += var37 * var41; // L: 1260
							var38 += var40 * var41; // L: 1261
							if (var26 < var27) { // L: 1262
								var2 -= var0; // L: 1263
								var0 -= var1; // L: 1264
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1265

								while (true) {
									--var0; // L: 1266
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1276
											if (var2 < 0) {
												return; // L: 1286
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1277
											var3 += var28; // L: 1278
											var4 += var27; // L: 1279
											var7 += var31; // L: 1280
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1281
											var32 += var34; // L: 1282
											var35 += var37; // L: 1283
											var38 += var40; // L: 1284
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1267
									var5 += var26; // L: 1268
									var4 += var27; // L: 1269
									var7 += var31; // L: 1270
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1271
									var32 += var34; // L: 1272
									var35 += var37; // L: 1273
									var38 += var40; // L: 1274
								}
							} else {
								var2 -= var0; // L: 1289
								var0 -= var1; // L: 1290
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 1291

								while (true) {
									--var0; // L: 1292
									if (var0 < 0) {
										while (true) {
											--var2; // L: 1302
											if (var2 < 0) {
												return; // L: 1312
											}

											Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1303
											var3 += var28; // L: 1304
											var4 += var27; // L: 1305
											var7 += var31; // L: 1306
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 1307
											var32 += var34; // L: 1308
											var35 += var37; // L: 1309
											var38 += var40; // L: 1310
										}
									}

									Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 1293
									var5 += var26; // L: 1294
									var4 += var27; // L: 1295
									var7 += var31; // L: 1296
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 1297
									var32 += var34; // L: 1298
									var35 += var37; // L: 1299
									var38 += var40; // L: 1300
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 1317
					if (var0 > Rasterizer3D_clipHeight) { // L: 1318
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 1319
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 1320
					if (var0 < var1) { // L: 1321
						var4 = var5 <<= 14; // L: 1322
						if (var2 < 0) { // L: 1323
							var4 -= var27 * var2; // L: 1324
							var5 -= var28 * var2; // L: 1325
							var8 -= var31 * var2; // L: 1326
							var2 = 0; // L: 1327
						}

						var3 <<= 14; // L: 1329
						if (var0 < 0) { // L: 1330
							var3 -= var0 * var26; // L: 1331
							var0 = 0; // L: 1332
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1334
						var32 += var34 * var41; // L: 1335
						var35 += var37 * var41; // L: 1336
						var38 += var40 * var41; // L: 1337
						if (var27 < var28) { // L: 1338
							var1 -= var0; // L: 1339
							var0 -= var2; // L: 1340
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1341

							while (true) {
								--var0; // L: 1342
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1352
										if (var1 < 0) {
											return; // L: 1362
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1353
										var4 += var27; // L: 1354
										var3 += var26; // L: 1355
										var8 += var31; // L: 1356
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1357
										var32 += var34; // L: 1358
										var35 += var37; // L: 1359
										var38 += var40; // L: 1360
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1343
								var4 += var27; // L: 1344
								var5 += var28; // L: 1345
								var8 += var31; // L: 1346
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1347
								var32 += var34; // L: 1348
								var35 += var37; // L: 1349
								var38 += var40; // L: 1350
							}
						} else {
							var1 -= var0; // L: 1365
							var0 -= var2; // L: 1366
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1367

							while (true) {
								--var0; // L: 1368
								if (var0 < 0) {
									while (true) {
										--var1; // L: 1378
										if (var1 < 0) {
											return; // L: 1388
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1379
										var4 += var27; // L: 1380
										var3 += var26; // L: 1381
										var8 += var31; // L: 1382
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1383
										var32 += var34; // L: 1384
										var35 += var37; // L: 1385
										var38 += var40; // L: 1386
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1369
								var4 += var27; // L: 1370
								var5 += var28; // L: 1371
								var8 += var31; // L: 1372
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1373
								var32 += var34; // L: 1374
								var35 += var37; // L: 1375
								var38 += var40; // L: 1376
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 1392
						if (var2 < 0) { // L: 1393
							var3 -= var27 * var2; // L: 1394
							var5 -= var28 * var2; // L: 1395
							var8 -= var31 * var2; // L: 1396
							var2 = 0; // L: 1397
						}

						var4 <<= 14; // L: 1399
						if (var1 < 0) { // L: 1400
							var4 -= var26 * var1; // L: 1401
							var1 = 0; // L: 1402
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 1404
						var32 += var34 * var41; // L: 1405
						var35 += var37 * var41; // L: 1406
						var38 += var40 * var41; // L: 1407
						if (var27 < var28) { // L: 1408
							var0 -= var1; // L: 1409
							var1 -= var2; // L: 1410
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1411

							while (true) {
								--var1; // L: 1412
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1422
										if (var0 < 0) {
											return; // L: 1432
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1423
										var4 += var26; // L: 1424
										var5 += var28; // L: 1425
										var8 += var31; // L: 1426
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1427
										var32 += var34; // L: 1428
										var35 += var37; // L: 1429
										var38 += var40; // L: 1430
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1413
								var3 += var27; // L: 1414
								var5 += var28; // L: 1415
								var8 += var31; // L: 1416
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1417
								var32 += var34; // L: 1418
								var35 += var37; // L: 1419
								var38 += var40; // L: 1420
							}
						} else {
							var0 -= var1; // L: 1435
							var1 -= var2; // L: 1436
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 1437

							while (true) {
								--var1; // L: 1438
								if (var1 < 0) {
									while (true) {
										--var0; // L: 1448
										if (var0 < 0) {
											return; // L: 1458
										}

										Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1449
										var4 += var26; // L: 1450
										var5 += var28; // L: 1451
										var8 += var31; // L: 1452
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 1453
										var32 += var34; // L: 1454
										var35 += var37; // L: 1455
										var38 += var40; // L: 1456
									}
								}

								Rasterizer3D_iDontKnow(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 1439
								var3 += var27; // L: 1440
								var5 += var28; // L: 1441
								var8 += var31; // L: 1442
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 1443
								var32 += var34; // L: 1444
								var35 += var37; // L: 1445
								var38 += var40; // L: 1446
							}
						}
					}
				}
			}
		}
	} // L: 989

	@ObfuscatedName("g")
	@Export("Rasterizer3D_iDontKnow")
	static final void Rasterizer3D_iDontKnow(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2253) { // L: 1467
			if (var6 > Rasterizer3D_clipWidth) { // L: 1468
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 1469
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 1471
			var4 += var5; // L: 1472
			var7 += var5 * var8; // L: 1473
			int var17 = var6 - var5; // L: 1474
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 1475
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1481
				var9 += var23 * (var12 >> 3); // L: 1482
				var10 += (var13 >> 3) * var23; // L: 1483
				var11 += var23 * (var14 >> 3); // L: 1484
				var22 = var11 >> 12; // L: 1485
				if (var22 != 0) { // L: 1486
					var18 = var9 / var22; // L: 1487
					var19 = var10 / var22; // L: 1488
					if (var18 < 0) { // L: 1489
						var18 = 0;
					} else if (var18 > 4032) { // L: 1490
						var18 = 4032;
					}
				} else {
					var18 = 0; // L: 1493
					var19 = 0; // L: 1494
				}

				var9 += var12; // L: 1496
				var10 += var13; // L: 1497
				var11 += var14; // L: 1498
				var22 = var11 >> 12; // L: 1499
				if (var22 != 0) { // L: 1500
					var20 = var9 / var22; // L: 1501
					var21 = var10 / var22; // L: 1502
					if (var20 < 0) { // L: 1503
						var20 = 0;
					} else if (var20 > 4032) { // L: 1504
						var20 = 4032;
					}
				} else {
					var20 = 0; // L: 1507
					var21 = 0; // L: 1508
				}

				var2 = (var18 << 20) + var19; // L: 1510
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1511
				var17 >>= 3; // L: 1512
				var8 <<= 3; // L: 1513
				var15 = var7 >> 8; // L: 1514
				if (field2251) { // L: 1515
					if (var17 > 0) { // L: 1516
						do {
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
							var2 += var16; // L: 1535
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1536
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1537
							var2 += var16; // L: 1538
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1539
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1540
							var10000 = var16 + var2; // L: 1541
							var18 = var20; // L: 1542
							var19 = var21; // L: 1543
							var9 += var12; // L: 1544
							var10 += var13; // L: 1545
							var11 += var14; // L: 1546
							var22 = var11 >> 12; // L: 1547
							if (var22 != 0) { // L: 1548
								var20 = var9 / var22; // L: 1549
								var21 = var10 / var22; // L: 1550
								if (var20 < 0) { // L: 1551
									var20 = 0;
								} else if (var20 > 4032) { // L: 1552
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1555
								var21 = 0; // L: 1556
							}

							var2 = (var18 << 20) + var19; // L: 1558
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1559
							var7 += var8; // L: 1560
							var15 = var7 >> 8; // L: 1561
							--var17; // L: 1562
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1564
					if (var17 > 0) { // L: 1565
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 1567
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1568
							var2 += var16; // L: 1569
							--var17; // L: 1570
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1574
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1576
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1577
							}

							++var4; // L: 1579
							var2 += var16; // L: 1580
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1581
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1582
							}

							++var4; // L: 1584
							var2 += var16; // L: 1585
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1586
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1587
							}

							++var4; // L: 1589
							var2 += var16; // L: 1590
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1591
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1592
							}

							++var4; // L: 1594
							var2 += var16; // L: 1595
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1596
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1597
							}

							++var4; // L: 1599
							var2 += var16; // L: 1600
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1601
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1602
							}

							++var4; // L: 1604
							var2 += var16; // L: 1605
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1606
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1607
							}

							++var4; // L: 1609
							var2 += var16; // L: 1610
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1611
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1612
							}

							++var4; // L: 1614
							var10000 = var16 + var2; // L: 1615
							var18 = var20; // L: 1616
							var19 = var21; // L: 1617
							var9 += var12; // L: 1618
							var10 += var13; // L: 1619
							var11 += var14; // L: 1620
							var22 = var11 >> 12; // L: 1621
							if (var22 != 0) { // L: 1622
								var20 = var9 / var22; // L: 1623
								var21 = var10 / var22; // L: 1624
								if (var20 < 0) { // L: 1625
									var20 = 0;
								} else if (var20 > 4032) { // L: 1626
									var20 = 4032;
								}
							} else {
								var20 = 0; // L: 1629
								var21 = 0; // L: 1630
							}

							var2 = (var18 << 20) + var19; // L: 1632
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 20); // L: 1633
							var7 += var8; // L: 1634
							var15 = var7 >> 8; // L: 1635
							--var17; // L: 1636
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1638
					if (var17 > 0) { // L: 1639
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 1641
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1642
							}

							++var4; // L: 1644
							var2 += var16; // L: 1645
							--var17; // L: 1646
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 1656
				var9 += var23 * (var12 >> 3); // L: 1657
				var10 += (var13 >> 3) * var23; // L: 1658
				var11 += var23 * (var14 >> 3); // L: 1659
				var22 = var11 >> 14; // L: 1660
				if (var22 != 0) { // L: 1661
					var18 = var9 / var22; // L: 1662
					var19 = var10 / var22; // L: 1663
					if (var18 < 0) { // L: 1664
						var18 = 0;
					} else if (var18 > 16256) { // L: 1665
						var18 = 16256;
					}
				} else {
					var18 = 0; // L: 1668
					var19 = 0; // L: 1669
				}

				var9 += var12; // L: 1671
				var10 += var13; // L: 1672
				var11 += var14; // L: 1673
				var22 = var11 >> 14; // L: 1674
				if (var22 != 0) { // L: 1675
					var20 = var9 / var22; // L: 1676
					var21 = var10 / var22; // L: 1677
					if (var20 < 0) { // L: 1678
						var20 = 0;
					} else if (var20 > 16256) { // L: 1679
						var20 = 16256;
					}
				} else {
					var20 = 0; // L: 1682
					var21 = 0; // L: 1683
				}

				var2 = (var18 << 18) + var19; // L: 1685
				var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1686
				var17 >>= 3; // L: 1687
				var8 <<= 3; // L: 1688
				var15 = var7 >> 8; // L: 1689
				if (field2251) { // L: 1690
					if (var17 > 0) { // L: 1691
						do {
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
							var2 += var16; // L: 1710
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1711
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1712
							var2 += var16; // L: 1713
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1714
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1715
							var10000 = var16 + var2; // L: 1716
							var18 = var20; // L: 1717
							var19 = var21; // L: 1718
							var9 += var12; // L: 1719
							var10 += var13; // L: 1720
							var11 += var14; // L: 1721
							var22 = var11 >> 14; // L: 1722
							if (var22 != 0) { // L: 1723
								var20 = var9 / var22; // L: 1724
								var21 = var10 / var22; // L: 1725
								if (var20 < 0) { // L: 1726
									var20 = 0;
								} else if (var20 > 16256) { // L: 1727
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1730
								var21 = 0; // L: 1731
							}

							var2 = (var18 << 18) + var19; // L: 1733
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1734
							var7 += var8; // L: 1735
							var15 = var7 >> 8; // L: 1736
							--var17; // L: 1737
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1739
					if (var17 > 0) { // L: 1740
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 1742
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1743
							var2 += var16; // L: 1744
							--var17; // L: 1745
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 1749
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1751
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1752
							}

							++var4; // L: 1754
							var2 += var16; // L: 1755
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1756
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1757
							}

							++var4; // L: 1759
							var2 += var16; // L: 1760
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1761
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1762
							}

							++var4; // L: 1764
							var2 += var16; // L: 1765
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1766
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1767
							}

							++var4; // L: 1769
							var2 += var16; // L: 1770
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1771
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1772
							}

							++var4; // L: 1774
							var2 += var16; // L: 1775
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1776
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1777
							}

							++var4; // L: 1779
							var2 += var16; // L: 1780
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1781
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1782
							}

							++var4; // L: 1784
							var2 += var16; // L: 1785
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1786
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1787
							}

							++var4; // L: 1789
							var10000 = var16 + var2; // L: 1790
							var18 = var20; // L: 1791
							var19 = var21; // L: 1792
							var9 += var12; // L: 1793
							var10 += var13; // L: 1794
							var11 += var14; // L: 1795
							var22 = var11 >> 14; // L: 1796
							if (var22 != 0) { // L: 1797
								var20 = var9 / var22; // L: 1798
								var21 = var10 / var22; // L: 1799
								if (var20 < 0) { // L: 1800
									var20 = 0;
								} else if (var20 > 16256) { // L: 1801
									var20 = 16256;
								}
							} else {
								var20 = 0; // L: 1804
								var21 = 0; // L: 1805
							}

							var2 = (var18 << 18) + var19; // L: 1807
							var16 = (var21 - var19 >> 3) + (var20 - var18 >> 3 << 18); // L: 1808
							var7 += var8; // L: 1809
							var15 = var7 >> 8; // L: 1810
							--var17; // L: 1811
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 1813
					if (var17 > 0) { // L: 1814
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 1816
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 1817
							}

							++var4; // L: 1819
							var2 += var16; // L: 1820
							--var17; // L: 1821
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 1825

	@ObfuscatedName("e")
	@Export("drawTexturedTile")
	static final void drawTexturedTile(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Rasterizer3D_textureLoader.getTexturePixels(var18); // L: 1828
		int var20;
		if (var19 == null) { // L: 1829
			var20 = Rasterizer3D_textureLoader.getAverageTextureRGB(var18); // L: 1830
			method3854(var0, var1, var2, var3, var4, var5, method3862(var20, var6), method3862(var20, var7), method3862(var20, var8)); // L: 1831
		} else {
			Rasterizer3D_isLowDetailTexture = Rasterizer3D_textureLoader.isLowDetail(var18); // L: 1834
			field2251 = Rasterizer3D_textureLoader.vmethod4324(var18); // L: 1835
			var20 = var4 - var3; // L: 1836
			int var21 = var1 - var0; // L: 1837
			int var22 = var5 - var3; // L: 1838
			int var23 = var2 - var0; // L: 1839
			int var24 = var7 - var6; // L: 1840
			int var25 = var8 - var6; // L: 1841
			int var26 = 0; // L: 1842
			if (var0 != var1) { // L: 1843
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0; // L: 1844
			if (var2 != var1) { // L: 1845
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0; // L: 1846
			if (var0 != var2) { // L: 1847
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21; // L: 1848
			if (var29 != 0) { // L: 1849
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29; // L: 1850
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29; // L: 1851
				var10 = var9 - var10; // L: 1852
				var13 = var12 - var13; // L: 1853
				var16 = var15 - var16; // L: 1854
				var11 -= var9; // L: 1855
				var14 -= var12; // L: 1856
				var17 -= var15; // L: 1857
				int var32 = var11 * var12 - var9 * var14 << 14; // L: 1858
				int var33 = (int)(((long)(var15 * var14 - var17 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1859
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1860
				int var35 = var10 * var12 - var13 * var9 << 14; // L: 1861
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)Rasterizer3D_zoom); // L: 1862
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)Rasterizer3D_zoom); // L: 1863
				int var38 = var13 * var11 - var10 * var14 << 14; // L: 1864
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)Rasterizer3D_zoom); // L: 1865
				int var40 = (int)(((long)(var17 * var10 - var11 * var16) << 14) / (long)Rasterizer3D_zoom); // L: 1866
				int var41;
				if (var0 <= var1 && var0 <= var2) { // L: 1867
					if (var0 < Rasterizer3D_clipHeight) { // L: 1868
						if (var1 > Rasterizer3D_clipHeight) { // L: 1869
							var1 = Rasterizer3D_clipHeight;
						}

						if (var2 > Rasterizer3D_clipHeight) { // L: 1870
							var2 = Rasterizer3D_clipHeight;
						}

						var6 = var30 + ((var6 << 9) - var3 * var30); // L: 1871
						if (var1 < var2) { // L: 1872
							var5 = var3 <<= 14; // L: 1873
							if (var0 < 0) { // L: 1874
								var5 -= var0 * var28; // L: 1875
								var3 -= var0 * var26; // L: 1876
								var6 -= var0 * var31; // L: 1877
								var0 = 0; // L: 1878
							}

							var4 <<= 14; // L: 1880
							if (var1 < 0) { // L: 1881
								var4 -= var27 * var1; // L: 1882
								var1 = 0; // L: 1883
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1885
							var32 += var34 * var41; // L: 1886
							var35 += var37 * var41; // L: 1887
							var38 += var40 * var41; // L: 1888
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) { // L: 1889
								var2 -= var1; // L: 1916
								var1 -= var0; // L: 1917
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1918

								while (true) {
									--var1; // L: 1919
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1929
											if (var2 < 0) {
												return; // L: 1939
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1930
											var5 += var28; // L: 1931
											var4 += var27; // L: 1932
											var6 += var31; // L: 1933
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1934
											var32 += var34; // L: 1935
											var35 += var37; // L: 1936
											var38 += var40; // L: 1937
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1920
									var5 += var28; // L: 1921
									var3 += var26; // L: 1922
									var6 += var31; // L: 1923
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1924
									var32 += var34; // L: 1925
									var35 += var37; // L: 1926
									var38 += var40; // L: 1927
								}
							} else {
								var2 -= var1; // L: 1890
								var1 -= var0; // L: 1891
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1892

								while (true) {
									--var1; // L: 1893
									if (var1 < 0) {
										while (true) {
											--var2; // L: 1903
											if (var2 < 0) {
												return; // L: 1913
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1904
											var5 += var28; // L: 1905
											var4 += var27; // L: 1906
											var6 += var31; // L: 1907
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1908
											var32 += var34; // L: 1909
											var35 += var37; // L: 1910
											var38 += var40; // L: 1911
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1894
									var5 += var28; // L: 1895
									var3 += var26; // L: 1896
									var6 += var31; // L: 1897
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1898
									var32 += var34; // L: 1899
									var35 += var37; // L: 1900
									var38 += var40; // L: 1901
								}
							}
						} else {
							var4 = var3 <<= 14; // L: 1943
							if (var0 < 0) { // L: 1944
								var4 -= var0 * var28; // L: 1945
								var3 -= var0 * var26; // L: 1946
								var6 -= var0 * var31; // L: 1947
								var0 = 0; // L: 1948
							}

							var5 <<= 14; // L: 1950
							if (var2 < 0) { // L: 1951
								var5 -= var27 * var2; // L: 1952
								var2 = 0; // L: 1953
							}

							var41 = var0 - Rasterizer3D_clipMidY; // L: 1955
							var32 += var34 * var41; // L: 1956
							var35 += var37 * var41; // L: 1957
							var38 += var40 * var41; // L: 1958
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) { // L: 1959
								var1 -= var2; // L: 1986
								var2 -= var0; // L: 1987
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1988

								while (true) {
									--var2; // L: 1989
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1999
											if (var1 < 0) {
												return; // L: 2009
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 2000
											var5 += var27; // L: 2001
											var3 += var26; // L: 2002
											var6 += var31; // L: 2003
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 2004
											var32 += var34; // L: 2005
											var35 += var37; // L: 2006
											var38 += var40; // L: 2007
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1990
									var4 += var28; // L: 1991
									var3 += var26; // L: 1992
									var6 += var31; // L: 1993
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1994
									var32 += var34; // L: 1995
									var35 += var37; // L: 1996
									var38 += var40; // L: 1997
								}
							} else {
								var1 -= var2; // L: 1960
								var2 -= var0; // L: 1961
								var0 = Rasterizer3D_rowOffsets[var0]; // L: 1962

								while (true) {
									--var2; // L: 1963
									if (var2 < 0) {
										while (true) {
											--var1; // L: 1973
											if (var1 < 0) {
												return; // L: 1983
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1974
											var5 += var27; // L: 1975
											var3 += var26; // L: 1976
											var6 += var31; // L: 1977
											var0 += Rasterizer2D.Rasterizer2D_width; // L: 1978
											var32 += var34; // L: 1979
											var35 += var37; // L: 1980
											var38 += var40; // L: 1981
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39); // L: 1964
									var4 += var28; // L: 1965
									var3 += var26; // L: 1966
									var6 += var31; // L: 1967
									var0 += Rasterizer2D.Rasterizer2D_width; // L: 1968
									var32 += var34; // L: 1969
									var35 += var37; // L: 1970
									var38 += var40; // L: 1971
								}
							}
						}
					}
				} else if (var1 <= var2) { // L: 2013
					if (var1 < Rasterizer3D_clipHeight) { // L: 2014
						if (var2 > Rasterizer3D_clipHeight) { // L: 2015
							var2 = Rasterizer3D_clipHeight;
						}

						if (var0 > Rasterizer3D_clipHeight) { // L: 2016
							var0 = Rasterizer3D_clipHeight;
						}

						var7 = var30 + ((var7 << 9) - var30 * var4); // L: 2017
						if (var2 < var0) { // L: 2018
							var3 = var4 <<= 14; // L: 2019
							if (var1 < 0) { // L: 2020
								var3 -= var26 * var1; // L: 2021
								var4 -= var27 * var1; // L: 2022
								var7 -= var31 * var1; // L: 2023
								var1 = 0; // L: 2024
							}

							var5 <<= 14; // L: 2026
							if (var2 < 0) { // L: 2027
								var5 -= var28 * var2; // L: 2028
								var2 = 0; // L: 2029
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2031
							var32 += var34 * var41; // L: 2032
							var35 += var37 * var41; // L: 2033
							var38 += var40 * var41; // L: 2034
							if (var2 != var1 && var26 < var27 || var2 == var1 && var26 > var28) { // L: 2035
								var0 -= var2; // L: 2036
								var2 -= var1; // L: 2037
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2038

								while (true) {
									--var2; // L: 2039
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2049
											if (var0 < 0) {
												return; // L: 2059
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2050
											var3 += var26; // L: 2051
											var5 += var28; // L: 2052
											var7 += var31; // L: 2053
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2054
											var32 += var34; // L: 2055
											var35 += var37; // L: 2056
											var38 += var40; // L: 2057
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2040
									var3 += var26; // L: 2041
									var4 += var27; // L: 2042
									var7 += var31; // L: 2043
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2044
									var32 += var34; // L: 2045
									var35 += var37; // L: 2046
									var38 += var40; // L: 2047
								}
							} else {
								var0 -= var2; // L: 2062
								var2 -= var1; // L: 2063
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2064

								while (true) {
									--var2; // L: 2065
									if (var2 < 0) {
										while (true) {
											--var0; // L: 2075
											if (var0 < 0) {
												return; // L: 2085
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2076
											var3 += var26; // L: 2077
											var5 += var28; // L: 2078
											var7 += var31; // L: 2079
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2080
											var32 += var34; // L: 2081
											var35 += var37; // L: 2082
											var38 += var40; // L: 2083
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2066
									var3 += var26; // L: 2067
									var4 += var27; // L: 2068
									var7 += var31; // L: 2069
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2070
									var32 += var34; // L: 2071
									var35 += var37; // L: 2072
									var38 += var40; // L: 2073
								}
							}
						} else {
							var5 = var4 <<= 14; // L: 2089
							if (var1 < 0) { // L: 2090
								var5 -= var26 * var1; // L: 2091
								var4 -= var27 * var1; // L: 2092
								var7 -= var31 * var1; // L: 2093
								var1 = 0; // L: 2094
							}

							var3 <<= 14; // L: 2096
							if (var0 < 0) { // L: 2097
								var3 -= var0 * var28; // L: 2098
								var0 = 0; // L: 2099
							}

							var41 = var1 - Rasterizer3D_clipMidY; // L: 2101
							var32 += var34 * var41; // L: 2102
							var35 += var37 * var41; // L: 2103
							var38 += var40 * var41; // L: 2104
							if (var26 < var27) { // L: 2105
								var2 -= var0; // L: 2106
								var0 -= var1; // L: 2107
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2108

								while (true) {
									--var0; // L: 2109
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2119
											if (var2 < 0) {
												return; // L: 2129
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2120
											var3 += var28; // L: 2121
											var4 += var27; // L: 2122
											var7 += var31; // L: 2123
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2124
											var32 += var34; // L: 2125
											var35 += var37; // L: 2126
											var38 += var40; // L: 2127
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2110
									var5 += var26; // L: 2111
									var4 += var27; // L: 2112
									var7 += var31; // L: 2113
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2114
									var32 += var34; // L: 2115
									var35 += var37; // L: 2116
									var38 += var40; // L: 2117
								}
							} else {
								var2 -= var0; // L: 2132
								var0 -= var1; // L: 2133
								var1 = Rasterizer3D_rowOffsets[var1]; // L: 2134

								while (true) {
									--var0; // L: 2135
									if (var0 < 0) {
										while (true) {
											--var2; // L: 2145
											if (var2 < 0) {
												return; // L: 2155
											}

											Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2146
											var3 += var28; // L: 2147
											var4 += var27; // L: 2148
											var7 += var31; // L: 2149
											var1 += Rasterizer2D.Rasterizer2D_width; // L: 2150
											var32 += var34; // L: 2151
											var35 += var37; // L: 2152
											var38 += var40; // L: 2153
										}
									}

									Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39); // L: 2136
									var5 += var26; // L: 2137
									var4 += var27; // L: 2138
									var7 += var31; // L: 2139
									var1 += Rasterizer2D.Rasterizer2D_width; // L: 2140
									var32 += var34; // L: 2141
									var35 += var37; // L: 2142
									var38 += var40; // L: 2143
								}
							}
						}
					}
				} else if (var2 < Rasterizer3D_clipHeight) { // L: 2160
					if (var0 > Rasterizer3D_clipHeight) { // L: 2161
						var0 = Rasterizer3D_clipHeight;
					}

					if (var1 > Rasterizer3D_clipHeight) { // L: 2162
						var1 = Rasterizer3D_clipHeight;
					}

					var8 = (var8 << 9) - var5 * var30 + var30; // L: 2163
					if (var0 < var1) { // L: 2164
						var4 = var5 <<= 14; // L: 2165
						if (var2 < 0) { // L: 2166
							var4 -= var27 * var2; // L: 2167
							var5 -= var28 * var2; // L: 2168
							var8 -= var31 * var2; // L: 2169
							var2 = 0; // L: 2170
						}

						var3 <<= 14; // L: 2172
						if (var0 < 0) { // L: 2173
							var3 -= var0 * var26; // L: 2174
							var0 = 0; // L: 2175
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2177
						var32 += var34 * var41; // L: 2178
						var35 += var37 * var41; // L: 2179
						var38 += var40 * var41; // L: 2180
						if (var27 < var28) { // L: 2181
							var1 -= var0; // L: 2182
							var0 -= var2; // L: 2183
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2184

							while (true) {
								--var0; // L: 2185
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2195
										if (var1 < 0) {
											return; // L: 2205
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2196
										var4 += var27; // L: 2197
										var3 += var26; // L: 2198
										var8 += var31; // L: 2199
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2200
										var32 += var34; // L: 2201
										var35 += var37; // L: 2202
										var38 += var40; // L: 2203
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2186
								var4 += var27; // L: 2187
								var5 += var28; // L: 2188
								var8 += var31; // L: 2189
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2190
								var32 += var34; // L: 2191
								var35 += var37; // L: 2192
								var38 += var40; // L: 2193
							}
						} else {
							var1 -= var0; // L: 2208
							var0 -= var2; // L: 2209
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2210

							while (true) {
								--var0; // L: 2211
								if (var0 < 0) {
									while (true) {
										--var1; // L: 2221
										if (var1 < 0) {
											return; // L: 2231
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2222
										var4 += var27; // L: 2223
										var3 += var26; // L: 2224
										var8 += var31; // L: 2225
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2226
										var32 += var34; // L: 2227
										var35 += var37; // L: 2228
										var38 += var40; // L: 2229
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2212
								var4 += var27; // L: 2213
								var5 += var28; // L: 2214
								var8 += var31; // L: 2215
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2216
								var32 += var34; // L: 2217
								var35 += var37; // L: 2218
								var38 += var40; // L: 2219
							}
						}
					} else {
						var3 = var5 <<= 14; // L: 2235
						if (var2 < 0) { // L: 2236
							var3 -= var27 * var2; // L: 2237
							var5 -= var28 * var2; // L: 2238
							var8 -= var31 * var2; // L: 2239
							var2 = 0; // L: 2240
						}

						var4 <<= 14; // L: 2242
						if (var1 < 0) { // L: 2243
							var4 -= var26 * var1; // L: 2244
							var1 = 0; // L: 2245
						}

						var41 = var2 - Rasterizer3D_clipMidY; // L: 2247
						var32 += var34 * var41; // L: 2248
						var35 += var37 * var41; // L: 2249
						var38 += var40 * var41; // L: 2250
						if (var27 < var28) { // L: 2251
							var0 -= var1; // L: 2252
							var1 -= var2; // L: 2253
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2254

							while (true) {
								--var1; // L: 2255
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2265
										if (var0 < 0) {
											return; // L: 2275
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2266
										var4 += var26; // L: 2267
										var5 += var28; // L: 2268
										var8 += var31; // L: 2269
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2270
										var32 += var34; // L: 2271
										var35 += var37; // L: 2272
										var38 += var40; // L: 2273
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2256
								var3 += var27; // L: 2257
								var5 += var28; // L: 2258
								var8 += var31; // L: 2259
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2260
								var32 += var34; // L: 2261
								var35 += var37; // L: 2262
								var38 += var40; // L: 2263
							}
						} else {
							var0 -= var1; // L: 2278
							var1 -= var2; // L: 2279
							var2 = Rasterizer3D_rowOffsets[var2]; // L: 2280

							while (true) {
								--var1; // L: 2281
								if (var1 < 0) {
									while (true) {
										--var0; // L: 2291
										if (var0 < 0) {
											return; // L: 2301
										}

										Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2292
										var4 += var26; // L: 2293
										var5 += var28; // L: 2294
										var8 += var31; // L: 2295
										var2 += Rasterizer2D.Rasterizer2D_width; // L: 2296
										var32 += var34; // L: 2297
										var35 += var37; // L: 2298
										var38 += var40; // L: 2299
									}
								}

								Rasterizer3D_textureAlpha(Rasterizer2D.Rasterizer2D_pixels, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39); // L: 2282
								var3 += var27; // L: 2283
								var5 += var28; // L: 2284
								var8 += var31; // L: 2285
								var2 += Rasterizer2D.Rasterizer2D_width; // L: 2286
								var32 += var34; // L: 2287
								var35 += var37; // L: 2288
								var38 += var40; // L: 2289
							}
						}
					}
				}
			}
		}
	} // L: 1832

	@ObfuscatedName("a")
	@Export("Rasterizer3D_textureAlpha")
	static final void Rasterizer3D_textureAlpha(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2253) { // L: 2310
			if (var6 > Rasterizer3D_clipWidth) { // L: 2311
				var6 = Rasterizer3D_clipWidth;
			}

			if (var5 < 0) { // L: 2312
				var5 = 0;
			}
		}

		if (var5 < var6) { // L: 2314
			var4 += var5; // L: 2315
			var7 += var5 * var8; // L: 2316
			int var17 = var6 - var5; // L: 2317
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (Rasterizer3D_isLowDetailTexture) { // L: 2318
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2325
				var9 += var23 * var12; // L: 2326
				var10 += var13 * var23; // L: 2327
				var11 += var23 * var14; // L: 2328
				var22 = var11 >> 12; // L: 2329
				if (var22 != 0) { // L: 2330
					var18 = var9 / var22; // L: 2331
					var19 = var10 / var22; // L: 2332
				} else {
					var18 = 0; // L: 2335
					var19 = 0; // L: 2336
				}

				var9 += var17 * var12; // L: 2338
				var10 += var13 * var17; // L: 2339
				var11 += var17 * var14; // L: 2340
				var22 = var11 >> 12; // L: 2341
				if (var22 != 0) { // L: 2342
					var20 = var9 / var22; // L: 2343
					var21 = var10 / var22; // L: 2344
				} else {
					var20 = 0; // L: 2347
					var21 = 0; // L: 2348
				}

				var2 = (var18 << 20) + var19; // L: 2350
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 20); // L: 2351
				var17 >>= 3; // L: 2352
				var8 <<= 3; // L: 2353
				var15 = var7 >> 8; // L: 2354
				if (field2251) { // L: 2356
					if (var17 > 0) { // L: 2357
						do {
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
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2377
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2378
							var2 += var16; // L: 2379
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2380
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2381
							var2 += var16; // L: 2382
							var7 += var8; // L: 2383
							var15 = var7 >> 8; // L: 2384
							--var17; // L: 2385
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2387
					if (var17 > 0) { // L: 2388
						do {
							var3 = var1[(var2 >>> 26) + (var2 & 4032)]; // L: 2390
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2391
							var2 += var16; // L: 2392
							--var17; // L: 2393
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2397
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2399
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2400
							}

							++var4; // L: 2402
							var2 += var16; // L: 2403
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2404
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2405
							}

							++var4; // L: 2407
							var2 += var16; // L: 2408
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2409
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2410
							}

							++var4; // L: 2412
							var2 += var16; // L: 2413
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2414
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2415
							}

							++var4; // L: 2417
							var2 += var16; // L: 2418
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2419
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2420
							}

							++var4; // L: 2422
							var2 += var16; // L: 2423
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2424
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2425
							}

							++var4; // L: 2427
							var2 += var16; // L: 2428
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2429
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2430
							}

							++var4; // L: 2432
							var2 += var16; // L: 2433
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2434
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2435
							}

							++var4; // L: 2437
							var2 += var16; // L: 2438
							var7 += var8; // L: 2439
							var15 = var7 >> 8; // L: 2440
							--var17; // L: 2441
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2443
					if (var17 > 0) { // L: 2444
						do {
							if ((var3 = var1[(var2 >>> 26) + (var2 & 4032)]) != 0) { // L: 2446
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2447
							}

							++var4; // L: 2449
							var2 += var16; // L: 2450
							--var17; // L: 2451
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - Rasterizer3D_clipMidX; // L: 2462
				var9 += var23 * var12; // L: 2463
				var10 += var13 * var23; // L: 2464
				var11 += var23 * var14; // L: 2465
				var22 = var11 >> 14; // L: 2466
				if (var22 != 0) { // L: 2467
					var18 = var9 / var22; // L: 2468
					var19 = var10 / var22; // L: 2469
				} else {
					var18 = 0; // L: 2472
					var19 = 0; // L: 2473
				}

				var9 += var17 * var12; // L: 2475
				var10 += var13 * var17; // L: 2476
				var11 += var17 * var14; // L: 2477
				var22 = var11 >> 14; // L: 2478
				if (var22 != 0) { // L: 2479
					var20 = var9 / var22; // L: 2480
					var21 = var10 / var22; // L: 2481
				} else {
					var20 = 0; // L: 2484
					var21 = 0; // L: 2485
				}

				var2 = (var18 << 18) + var19; // L: 2487
				var16 = (var21 - var19) / var17 + ((var20 - var18) / var17 << 18); // L: 2488
				var17 >>= 3; // L: 2489
				var8 <<= 3; // L: 2490
				var15 = var7 >> 8; // L: 2491
				if (field2251) { // L: 2493
					if (var17 > 0) { // L: 2494
						do {
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
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2514
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2515
							var2 += var16; // L: 2516
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2517
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2518
							var2 += var16; // L: 2519
							var7 += var8; // L: 2520
							var15 = var7 >> 8; // L: 2521
							--var17; // L: 2522
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2524
					if (var17 > 0) { // L: 2525
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)]; // L: 2527
							var0[var4++] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2528
							var2 += var16; // L: 2529
							--var17; // L: 2530
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) { // L: 2534
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2536
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2537
							}

							++var4; // L: 2539
							var2 += var16; // L: 2540
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2541
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2542
							}

							++var4; // L: 2544
							var2 += var16; // L: 2545
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2546
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2547
							}

							++var4; // L: 2549
							var2 += var16; // L: 2550
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2551
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2552
							}

							++var4; // L: 2554
							var2 += var16; // L: 2555
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2556
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2557
							}

							++var4; // L: 2559
							var2 += var16; // L: 2560
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2561
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2562
							}

							++var4; // L: 2564
							var2 += var16; // L: 2565
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2566
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2567
							}

							++var4; // L: 2569
							var2 += var16; // L: 2570
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2571
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2572
							}

							++var4; // L: 2574
							var2 += var16; // L: 2575
							var7 += var8; // L: 2576
							var15 = var7 >> 8; // L: 2577
							--var17; // L: 2578
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7; // L: 2580
					if (var17 > 0) { // L: 2581
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) { // L: 2583
								var0[var4] = (var15 * (var3 & 65280) & 16711680) + ((var3 & 16711935) * var15 & -16711936) >> 8; // L: 2584
							}

							++var4; // L: 2586
							var2 += var16; // L: 2587
							--var17; // L: 2588
						} while(var17 > 0);
					}
				}
			}

		}
	} // L: 2592

	@ObfuscatedName("u")
	static final int method3862(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 2595
		if (var1 < 2) { // L: 2596
			var1 = 2;
		} else if (var1 > 126) { // L: 2597
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 2598
	}

	@ObfuscatedName("k")
	static final int method3847(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2602
	}

	@ObfuscatedName("f")
	static final int method3864(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2606
	}

	@ObfuscatedName("l")
	static final int method3859(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 2610
	}

	@ObfuscatedName("q")
	static final int method3866(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 2614
	}

	@ObfuscatedName("x")
	static final int method3917(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 2618
	}

	@ObfuscatedName("z")
	static final int method3868(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 2622
	}
}
