import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("l")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("e")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class371 field2437;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class371 field2477;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class371 field2439;
	@ObfuscatedName("ae")
	static boolean[] field2495;
	@ObfuscatedName("an")
	static boolean[] field2478;
	@ObfuscatedName("aw")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("aj")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ax")
	static int[] field2481;
	@ObfuscatedName("ah")
	static int[] field2482;
	@ObfuscatedName("ai")
	static int[] field2483;
	@ObfuscatedName("am")
	static int[] field2484;
	@ObfuscatedName("bt")
	static int[] field2486;
	@ObfuscatedName("bn")
	static int[][] field2487;
	@ObfuscatedName("bz")
	static int[] field2454;
	@ObfuscatedName("bx")
	static int[][] field2489;
	@ObfuscatedName("bd")
	static int[] field2492;
	@ObfuscatedName("bg")
	static int[] field2468;
	@ObfuscatedName("bm")
	static int[] field2470;
	@ObfuscatedName("bi")
	static int[] field2511;
	@ObfuscatedName("bw")
	static int[] field2494;
	@ObfuscatedName("bu")
	static int[] field2467;
	@ObfuscatedName("bs")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bb")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("br")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bh")
	static boolean field2488;
	@ObfuscatedName("ba")
	@Export("Model_sine")
	static int[] Model_sine;
	@ObfuscatedName("bv")
	@Export("Model_cosine")
	static int[] Model_cosine;
	@ObfuscatedName("bl")
	@Export("Model_colorPalette")
	static int[] Model_colorPalette;
	@ObfuscatedName("bc")
	static int[] field2491;
	@ObfuscatedName("w")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("v")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("a")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("y")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("u")
	@Export("indicesCount")
	int indicesCount;
	@ObfuscatedName("h")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("q")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("x")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("p")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("n")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("m")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("d")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("j")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("f")
	byte[] field2453;
	@ObfuscatedName("g")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("t")
	byte field2455;
	@ObfuscatedName("k")
	int field2451;
	@ObfuscatedName("b")
	int[] field2457;
	@ObfuscatedName("z")
	int[] field2458;
	@ObfuscatedName("ap")
	int[] field2459;
	@ObfuscatedName("af")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ak")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("av")
	int[][] field2462;
	@ObfuscatedName("ar")
	int[][] field2463;
	@ObfuscatedName("al")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("aa")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ao")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("aq")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("ay")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ac")
	@Export("radius")
	int radius;
	@ObfuscatedName("ab")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("as")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ag")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("az")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ad")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("au")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("by")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bk")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bp")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("ch")
	@Export("overrideAmount")
	public byte overrideAmount;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2437 = new class371(); // L: 15
		field2477 = new class371(); // L: 16
		field2439 = new class371(); // L: 17
		field2495 = new boolean[6500]; // L: 55
		field2478 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2481 = new int[6500]; // L: 59
		field2482 = new int[6500]; // L: 60
		field2483 = new int[6500]; // L: 61
		field2484 = new int[6500]; // L: 62
		field2486 = new int[1600]; // L: 64
		field2487 = new int[1600][512]; // L: 65
		field2454 = new int[12]; // L: 66
		field2489 = new int[12][2000]; // L: 67
		field2492 = new int[2000]; // L: 68
		field2468 = new int[2000]; // L: 69
		field2470 = new int[12]; // L: 70
		field2511 = new int[10]; // L: 71
		field2494 = new int[10]; // L: 72
		field2467 = new int[10]; // L: 73
		field2488 = true; // L: 77
		Model_sine = Rasterizer3D.Rasterizer3D_sine; // L: 80
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine; // L: 81
		Model_colorPalette = Rasterizer3D.Rasterizer3D_colorPalette; // L: 82
		field2491 = Rasterizer3D.field2264; // L: 83
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2455 = 0;
		this.field2451 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 91

	@ObfuscatedSignature(
		descriptor = "([Lgf;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2455 = 0; // L: 33
		this.field2451 = 0; // L: 34
		this.isSingleTile = false; // L: 42
		this.xMidOffset = -1; // L: 51
		this.yMidOffset = -1; // L: 52
		this.zMidOffset = -1; // L: 53
		boolean var3 = false; // L: 94
		boolean var4 = false; // L: 95
		boolean var5 = false; // L: 96
		boolean var6 = false; // L: 97
		this.verticesCount = 0; // L: 98
		this.indicesCount = 0; // L: 99
		this.field2451 = 0; // L: 100
		this.field2455 = -1; // L: 101

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 102
			var8 = var1[var7]; // L: 103
			if (var8 != null) { // L: 104
				this.verticesCount += var8.verticesCount; // L: 105
				this.indicesCount += var8.indicesCount; // L: 106
				this.field2451 += var8.field2451; // L: 107
				if (var8.faceRenderPriorities != null) { // L: 108
					var3 = true;
				} else {
					if (this.field2455 == -1) { // L: 110
						this.field2455 = var8.field2455;
					}

					if (this.field2455 != var8.field2455) { // L: 111
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 113
				var5 |= var8.faceTextures != null; // L: 114
				var6 |= var8.field2453 != null; // L: 115
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 118
		this.verticesY = new int[this.verticesCount]; // L: 119
		this.verticesZ = new int[this.verticesCount]; // L: 120
		this.indices1 = new int[this.indicesCount]; // L: 121
		this.indices2 = new int[this.indicesCount]; // L: 122
		this.indices3 = new int[this.indicesCount]; // L: 123
		this.faceColors1 = new int[this.indicesCount]; // L: 124
		this.faceColors2 = new int[this.indicesCount]; // L: 125
		this.faceColors3 = new int[this.indicesCount]; // L: 126
		if (var3) { // L: 127
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) { // L: 128
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) { // L: 129
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) { // L: 130
			this.field2453 = new byte[this.indicesCount];
		}

		if (this.field2451 > 0) { // L: 131
			this.field2457 = new int[this.field2451]; // L: 132
			this.field2458 = new int[this.field2451]; // L: 133
			this.field2459 = new int[this.field2451]; // L: 134
		}

		this.verticesCount = 0; // L: 136
		this.indicesCount = 0; // L: 137
		this.field2451 = 0; // L: 138

		for (var7 = 0; var7 < var2; ++var7) { // L: 139
			var8 = var1[var7]; // L: 140
			if (var8 != null) { // L: 141
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) { // L: 142
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9]; // L: 143
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9]; // L: 144
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9]; // L: 145
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9]; // L: 146
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9]; // L: 147
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9]; // L: 148
					if (var3) { // L: 149
						if (var8.faceRenderPriorities != null) { // L: 150
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2455; // L: 151
						}
					}

					if (var4 && var8.faceAlphas != null) { // L: 153 154
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) { // L: 156
						if (var8.faceTextures != null) { // L: 157
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1; // L: 158
						}
					}

					if (var6) { // L: 160
						if (var8.field2453 != null && var8.field2453[var9] != -1) { // L: 161
							this.field2453[this.indicesCount] = (byte)(this.field2451 + var8.field2453[var9]);
						} else {
							this.field2453[this.indicesCount] = -1; // L: 162
						}
					}

					++this.indicesCount; // L: 164
				}

				for (var9 = 0; var9 < var8.field2451; ++var9) { // L: 166
					this.field2457[this.field2451] = this.verticesCount + var8.field2457[var9]; // L: 167
					this.field2458[this.field2451] = this.verticesCount + var8.field2458[var9]; // L: 168
					this.field2459[this.field2451] = this.verticesCount + var8.field2459[var9]; // L: 169
					++this.field2451; // L: 170
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) { // L: 172
					this.verticesX[this.verticesCount] = var8.verticesX[var9]; // L: 173
					this.verticesY[this.verticesCount] = var8.verticesY[var9]; // L: 174
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9]; // L: 175
					++this.verticesCount; // L: 176
				}
			}
		}

	} // L: 180

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lgf;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 183
		int var7 = var2 - this.xzRadius; // L: 184
		int var8 = var2 + this.xzRadius; // L: 185
		int var9 = var4 - this.xzRadius; // L: 186
		int var10 = var4 + this.xzRadius; // L: 187
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 188
			var7 >>= 7; // L: 189
			var8 = var8 + 127 >> 7; // L: 190
			var9 >>= 7; // L: 191
			var10 = var10 + 127 >> 7; // L: 192
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 193
				return this;
			} else {
				Model var11;
				if (var5) { // L: 195
					var11 = new Model(); // L: 196
					var11.verticesCount = this.verticesCount; // L: 197
					var11.indicesCount = this.indicesCount; // L: 198
					var11.field2451 = this.field2451; // L: 199
					var11.verticesX = this.verticesX; // L: 200
					var11.verticesZ = this.verticesZ; // L: 201
					var11.indices1 = this.indices1; // L: 202
					var11.indices2 = this.indices2; // L: 203
					var11.indices3 = this.indices3; // L: 204
					var11.faceColors1 = this.faceColors1; // L: 205
					var11.faceColors2 = this.faceColors2; // L: 206
					var11.faceColors3 = this.faceColors3; // L: 207
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 208
					var11.faceAlphas = this.faceAlphas; // L: 209
					var11.field2453 = this.field2453; // L: 210
					var11.faceTextures = this.faceTextures; // L: 211
					var11.field2455 = this.field2455; // L: 212
					var11.field2457 = this.field2457; // L: 213
					var11.field2458 = this.field2458; // L: 214
					var11.field2459 = this.field2459; // L: 215
					var11.vertexLabels = this.vertexLabels; // L: 216
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 217
					var11.isSingleTile = this.isSingleTile; // L: 218
					var11.verticesY = new int[var11.verticesCount]; // L: 219
				} else {
					var11 = this; // L: 222
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) { // L: 224
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 225
						var13 = var2 + this.verticesX[var12]; // L: 226
						var14 = var4 + this.verticesZ[var12]; // L: 227
						var15 = var13 & 127; // L: 228
						var16 = var14 & 127; // L: 229
						var17 = var13 >> 7; // L: 230
						var18 = var14 >> 7; // L: 231
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 232
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 233
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 234
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 235
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 239
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 240
						if (var13 < var6) { // L: 241
							var14 = var2 + this.verticesX[var12]; // L: 242
							var15 = var4 + this.verticesZ[var12]; // L: 243
							var16 = var14 & 127; // L: 244
							var17 = var15 & 127; // L: 245
							var18 = var14 >> 7; // L: 246
							var19 = var15 >> 7; // L: 247
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 248
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 249
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 250
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 251
						}
					}
				}

				var11.resetBounds(); // L: 255
				return var11; // L: 256
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Z)Lgf;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 260
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 261
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Z)Lgf;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 265
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 266
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZLgf;[B)Lgf;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 270
		var2.indicesCount = this.indicesCount; // L: 271
		var2.field2451 = this.field2451; // L: 272
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 273
			var2.verticesX = new int[this.verticesCount + 100]; // L: 274
			var2.verticesY = new int[this.verticesCount + 100]; // L: 275
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 276
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 278
			var2.verticesX[var4] = this.verticesX[var4]; // L: 279
			var2.verticesY[var4] = this.verticesY[var4]; // L: 280
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 281
		}

		if (var1) { // L: 283
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 285
			if (this.faceAlphas == null) { // L: 286
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 287
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 290
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 293
		var2.indices2 = this.indices2; // L: 294
		var2.indices3 = this.indices3; // L: 295
		var2.faceColors1 = this.faceColors1; // L: 296
		var2.faceColors2 = this.faceColors2; // L: 297
		var2.faceColors3 = this.faceColors3; // L: 298
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 299
		var2.field2453 = this.field2453; // L: 300
		var2.faceTextures = this.faceTextures; // L: 301
		var2.field2455 = this.field2455; // L: 302
		var2.field2457 = this.field2457; // L: 303
		var2.field2458 = this.field2458; // L: 304
		var2.field2459 = this.field2459; // L: 305
		var2.vertexLabels = this.vertexLabels; // L: 306
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 307
		var2.field2462 = this.field2462; // L: 308
		var2.field2463 = this.field2463; // L: 309
		var2.isSingleTile = this.isSingleTile; // L: 310
		var2.resetBounds(); // L: 311
		var2.overrideAmount = 0; // L: 312
		return var2; // L: 313
	}

	@ObfuscatedName("o")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 317
			int var2 = 0; // L: 318
			int var3 = 0; // L: 319
			int var4 = 0; // L: 320
			int var5 = 0; // L: 321
			int var6 = 0; // L: 322
			int var7 = 0; // L: 323
			int var8 = Model_cosine[var1]; // L: 324
			int var9 = Model_sine[var1]; // L: 325

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 326
				int var11 = Rasterizer3D.method3805(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 327
				int var12 = this.verticesY[var10]; // L: 328
				int var13 = Rasterizer3D.method3806(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 329
				if (var11 < var2) { // L: 330
					var2 = var11;
				}

				if (var11 > var5) { // L: 331
					var5 = var11;
				}

				if (var12 < var3) { // L: 332
					var3 = var12;
				}

				if (var12 > var6) { // L: 333
					var6 = var12;
				}

				if (var13 < var4) { // L: 334
					var4 = var13;
				}

				if (var13 > var7) { // L: 335
					var7 = var13;
				}
			}

			this.xMid = (var5 + var2) / 2; // L: 337
			this.yMid = (var6 + var3) / 2; // L: 338
			this.zMid = (var7 + var4) / 2; // L: 339
			this.xMidOffset = (var5 - var2 + 1) / 2; // L: 340
			this.yMidOffset = (var6 - var3 + 1) / 2; // L: 341
			this.zMidOffset = (var7 - var4 + 1) / 2; // L: 342
			boolean var14 = true; // L: 343
			if (this.xMidOffset < 32) { // L: 344
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) { // L: 345
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) { // L: 346
				boolean var15 = true; // L: 347
				this.xMidOffset += 8; // L: 348
				this.zMidOffset += 8; // L: 349
			}

		}
	} // L: 351

	@ObfuscatedName("a")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 354
			this.boundsType = 1; // L: 355
			super.height = 0; // L: 356
			this.bottomY = 0; // L: 357
			this.xzRadius = 0; // L: 358

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 359
				int var2 = this.verticesX[var1]; // L: 360
				int var3 = this.verticesY[var1]; // L: 361
				int var4 = this.verticesZ[var1]; // L: 362
				if (-var3 > super.height) { // L: 363
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 364
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 365
				if (var5 > this.xzRadius) { // L: 366
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 368
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 369
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 370
		}
	} // L: 371

	@ObfuscatedName("y")
	void method4190() {
		if (this.boundsType != 2) { // L: 374
			this.boundsType = 2; // L: 375
			this.xzRadius = 0; // L: 376

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 377
				int var2 = this.verticesX[var1]; // L: 378
				int var3 = this.verticesY[var1]; // L: 379
				int var4 = this.verticesZ[var1]; // L: 380
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 381
				if (var5 > this.xzRadius) { // L: 382
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 384
			this.radius = this.xzRadius; // L: 385
			this.diameter = this.xzRadius + this.xzRadius; // L: 386
		}
	} // L: 387

	@ObfuscatedName("u")
	public int method4137() {
		this.calculateBoundsCylinder(); // L: 390
		return this.xzRadius; // L: 391
	}

	@ObfuscatedName("h")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 395
		this.xMidOffset = -1; // L: 396
	} // L: 397

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 400
			if (var2 != -1) { // L: 401
				Animation var3 = var1.frames[var2]; // L: 402
				Skeleton var4 = var3.skeleton; // L: 403
				Model_transformTempX = 0; // L: 404
				Model_transformTempY = 0; // L: 405
				Model_transformTempZ = 0; // L: 406

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 407
					int var6 = var3.transformSkeletonLabels[var5]; // L: 408
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 409
				}

				this.resetBounds(); // L: 411
			}
		}
	} // L: 412

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V"
	)
	public void method4140(class120 var1, int var2) {
		Skeleton var3 = var1.field1478; // L: 415
		class194 var4 = var3.method3887(); // L: 416
		if (var4 != null) { // L: 417
			var3.method3887().method3874(var1, var2); // L: 418
			this.method4142(var3.method3887(), var1.method2666()); // L: 419
		}

		if (var1.method2697()) { // L: 421
			this.method4156(var1, var2); // L: 422
		}

		this.resetBounds(); // L: 424
	} // L: 425

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V"
	)
	void method4156(class120 var1, int var2) {
		Skeleton var3 = var1.field1478; // L: 428

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 429
			int var5 = var3.transformTypes[var4]; // L: 430
			if (var5 == 5 && var1.field1470 != null && var1.field1470[var4] != null && var1.field1470[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 431 432
				class115 var6 = var1.field1470[var4][0]; // L: 433
				int[] var7 = var3.labels[var4]; // L: 434
				int var8 = var7.length; // L: 435

				for (int var9 = 0; var9 < var8; ++var9) { // L: 436
					int var10 = var7[var9]; // L: 437
					if (var10 < this.faceLabelsAlpha.length) { // L: 438
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 439

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 440
							int var13 = var11[var12]; // L: 441
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2611(var2) * 255.0F); // L: 442
							if (var14 < 0) { // L: 443
								var14 = 0;
							} else if (var14 > 255) { // L: 444
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 445
						}
					}
				}
			}
		}

	} // L: 452

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lga;I)V"
	)
	void method4142(class194 var1, int var2) {
		this.method4237(var1, var2); // L: 456
	} // L: 458

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgu;ILgu;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 461
			if (var5 != null && var4 != -1) { // L: 462
				Animation var6 = var1.frames[var2]; // L: 466
				Animation var7 = var3.frames[var4]; // L: 467
				Skeleton var8 = var6.skeleton; // L: 468
				Model_transformTempX = 0; // L: 469
				Model_transformTempY = 0; // L: 470
				Model_transformTempZ = 0; // L: 471
				byte var9 = 0; // L: 472
				int var13 = var9 + 1; // L: 473
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 474
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 475 476
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 477
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 479
				Model_transformTempY = 0; // L: 480
				Model_transformTempZ = 0; // L: 481
				var9 = 0; // L: 482
				var13 = var9 + 1; // L: 483
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 484
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 485 486
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 487
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 489
			} else {
				this.animate(var1, var2); // L: 463
			}
		}
	} // L: 464 490

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I[ZZ)V"
	)
	public void method4139(class120 var1, int var2, boolean[] var3, boolean var4) {
		Skeleton var5 = var1.field1478; // L: 493
		class194 var6 = var5.method3887(); // L: 494
		if (var6 != null) { // L: 495
			var6.method3873(var1, var2, var3, var4); // L: 496
			this.method4142(var6, var1.method2666()); // L: 497
		}

		if (var1.method2697()) { // L: 499
			this.method4156(var1, var2); // L: 500
		}

	} // L: 502

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I[IZ)V"
	)
	public void method4145(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 505
			this.animate(var1, var2); // L: 506
		} else {
			Animation var5 = var1.frames[var2]; // L: 509
			Skeleton var6 = var5.skeleton; // L: 510
			byte var7 = 0; // L: 511
			int var11 = var7 + 1; // L: 512
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 513
			Model_transformTempY = 0; // L: 514
			Model_transformTempZ = 0; // L: 515

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 516
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 517 518
				}

				if (var4) { // L: 519
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 520
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 523
				}
			}

		}
	} // L: 507 526

	@ObfuscatedName("f")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 529
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 530
			var7 = 0; // L: 531
			Model_transformTempX = 0; // L: 532
			Model_transformTempY = 0; // L: 533
			Model_transformTempZ = 0; // L: 534

			for (var8 = 0; var8 < var6; ++var8) { // L: 535
				int var18 = var2[var8]; // L: 536
				if (var18 < this.vertexLabels.length) { // L: 537
					int[] var19 = this.vertexLabels[var18]; // L: 538

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 539
						var12 = var19[var11]; // L: 540
						Model_transformTempX += this.verticesX[var12]; // L: 541
						Model_transformTempY += this.verticesY[var12]; // L: 542
						Model_transformTempZ += this.verticesZ[var12]; // L: 543
						++var7; // L: 544
					}
				}
			}

			if (var7 > 0) { // L: 548
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 549
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 550
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 551
			} else {
				Model_transformTempX = var3; // L: 554
				Model_transformTempY = var4; // L: 555
				Model_transformTempZ = var5; // L: 556
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 560
				for (var7 = 0; var7 < var6; ++var7) { // L: 561
					var8 = var2[var7]; // L: 562
					if (var8 < this.vertexLabels.length) { // L: 563
						var9 = this.vertexLabels[var8]; // L: 564

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 565
							var11 = var9[var10]; // L: 566
							var10000 = this.verticesX; // L: 567
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 568
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 569
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 575
				for (var7 = 0; var7 < var6; ++var7) { // L: 576
					var8 = var2[var7]; // L: 577
					if (var8 < this.vertexLabels.length) { // L: 578
						var9 = this.vertexLabels[var8]; // L: 579

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 580
							var11 = var9[var10]; // L: 581
							var10000 = this.verticesX; // L: 582
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 583
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 584
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 585
							int var13 = (var4 & 255) * 8; // L: 586
							int var14 = (var5 & 255) * 8; // L: 587
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 588
								var15 = Model_sine[var14]; // L: 589
								var16 = Model_cosine[var14]; // L: 590
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 591
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 592
								this.verticesX[var11] = var17; // L: 593
							}

							if (var12 != 0) { // L: 595
								var15 = Model_sine[var12]; // L: 596
								var16 = Model_cosine[var12]; // L: 597
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 598
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 599
								this.verticesY[var11] = var17; // L: 600
							}

							if (var13 != 0) { // L: 602
								var15 = Model_sine[var13]; // L: 603
								var16 = Model_cosine[var13]; // L: 604
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 605
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 606
								this.verticesX[var11] = var17; // L: 607
							}

							var10000 = this.verticesX; // L: 609
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 610
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 611
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 617
				for (var7 = 0; var7 < var6; ++var7) { // L: 618
					var8 = var2[var7]; // L: 619
					if (var8 < this.vertexLabels.length) { // L: 620
						var9 = this.vertexLabels[var8]; // L: 621

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 622
							var11 = var9[var10]; // L: 623
							var10000 = this.verticesX; // L: 624
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 625
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 626
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 627
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 628
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 629
							var10000 = this.verticesX; // L: 630
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 631
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 632
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 638
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 639
					for (var7 = 0; var7 < var6; ++var7) { // L: 640
						var8 = var2[var7]; // L: 641
						if (var8 < this.faceLabelsAlpha.length) { // L: 642
							var9 = this.faceLabelsAlpha[var8]; // L: 643

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 644
								var11 = var9[var10]; // L: 645
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 646
								if (var12 < 0) { // L: 647
									var12 = 0;
								} else if (var12 > 255) { // L: 648
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 649
							}
						}
					}
				}

			}
		}
	} // L: 558 573 615 636 654 656

	@ObfuscatedName("g")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 659
			int var2 = this.verticesX[var1]; // L: 660
			this.verticesX[var1] = this.verticesZ[var1]; // L: 661
			this.verticesZ[var1] = -var2; // L: 662
		}

		this.resetBounds(); // L: 664
	} // L: 665

	@ObfuscatedName("t")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 668
			this.verticesX[var1] = -this.verticesX[var1]; // L: 669
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 670
		}

		this.resetBounds(); // L: 672
	} // L: 673

	@ObfuscatedName("k")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 676
			int var2 = this.verticesZ[var1]; // L: 677
			this.verticesZ[var1] = this.verticesX[var1]; // L: 678
			this.verticesX[var1] = -var2; // L: 679
		}

		this.resetBounds(); // L: 681
	} // L: 682

	@ObfuscatedName("b")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = Model_sine[var1]; // L: 685
		int var3 = Model_cosine[var1]; // L: 686

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 687
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 688
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 689
			this.verticesY[var4] = var5; // L: 690
		}

		this.resetBounds(); // L: 692
	} // L: 693

	@ObfuscatedName("z")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 696
			int[] var10000 = this.verticesX; // L: 697
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 698
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 699
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 701
	} // L: 702

	@ObfuscatedName("ap")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 705
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 706
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 707
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 708
		}

		this.resetBounds(); // L: 710
	} // L: 711

	@ObfuscatedName("af")
	public final void method4215(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2486[0] = -1; // L: 714
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 715
			this.method4190();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 716
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 717
		int var10 = Model_sine[var1]; // L: 718
		int var11 = Model_cosine[var1]; // L: 719
		int var12 = Model_sine[var2]; // L: 720
		int var13 = Model_cosine[var2]; // L: 721
		int var14 = Model_sine[var3]; // L: 722
		int var15 = Model_cosine[var3]; // L: 723
		int var16 = Model_sine[var4]; // L: 724
		int var17 = Model_cosine[var4]; // L: 725
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 726

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 727
			int var20 = this.verticesX[var19]; // L: 728
			int var21 = this.verticesY[var19]; // L: 729
			int var22 = this.verticesZ[var19]; // L: 730
			int var23;
			if (var3 != 0) { // L: 731
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 732
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 733
				var20 = var23; // L: 734
			}

			if (var1 != 0) { // L: 736
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 737
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 738
				var21 = var23; // L: 739
			}

			if (var2 != 0) { // L: 741
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 742
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 743
				var20 = var23; // L: 744
			}

			var20 += var5; // L: 746
			var21 += var6; // L: 747
			var22 += var7; // L: 748
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 749
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 750
			field2481[var19] = var22 - var18; // L: 752
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 753
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 754
			if (this.field2451 > 0) { // L: 755
				field2482[var19] = var20; // L: 756
				field2483[var19] = var23; // L: 757
				field2484[var19] = var22; // L: 758
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 762
		} catch (Exception var25) { // L: 764
		}

	} // L: 765

	@ObfuscatedName("ak")
	public final void method4154(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2486[0] = -1; // L: 768
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 769
			this.method4190();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 770
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 771
		int var11 = Model_sine[var1]; // L: 772
		int var12 = Model_cosine[var1]; // L: 773
		int var13 = Model_sine[var2]; // L: 774
		int var14 = Model_cosine[var2]; // L: 775
		int var15 = Model_sine[var3]; // L: 776
		int var16 = Model_cosine[var3]; // L: 777
		int var17 = Model_sine[var4]; // L: 778
		int var18 = Model_cosine[var4]; // L: 779
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 780

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 781
			int var21 = this.verticesX[var20]; // L: 782
			int var22 = this.verticesY[var20]; // L: 783
			int var23 = this.verticesZ[var20]; // L: 784
			int var24;
			if (var3 != 0) { // L: 785
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 786
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 787
				var21 = var24; // L: 788
			}

			if (var1 != 0) { // L: 790
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 791
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 792
				var22 = var24; // L: 793
			}

			if (var2 != 0) { // L: 795
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 796
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 797
				var21 = var24; // L: 798
			}

			var21 += var5; // L: 800
			var22 += var6; // L: 801
			var23 += var7; // L: 802
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 803
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 804
			field2481[var20] = var23 - var19; // L: 806
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 807
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 808
			if (this.field2451 > 0) { // L: 809
				field2482[var20] = var21; // L: 810
				field2483[var20] = var24; // L: 811
				field2484[var20] = var23; // L: 812
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 816
		} catch (Exception var26) { // L: 818
		}

	} // L: 819

	@ObfuscatedName("av")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) { // L: 1022
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1023
				field2486[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1024

			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1025
				if (this.faceColors3[var7] != -2) { // L: 1026
					var8 = this.indices1[var7]; // L: 1027
					var9 = this.indices2[var7]; // L: 1028
					var10 = this.indices3[var7]; // L: 1029
					var11 = modelViewportXs[var8]; // L: 1030
					var12 = modelViewportXs[var9]; // L: 1031
					var28 = modelViewportXs[var10]; // L: 1032
					int var31;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1033
						if (var2 && class67.method1896(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1059
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1062
							var2 = false; // L: 1064
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1066
							field2478[var7] = false; // L: 1067
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1068
								field2495[var7] = false; // L: 1069
							} else {
								field2495[var7] = true;
							}

							var31 = (field2481[var8] + field2481[var9] + field2481[var10]) / 3 + this.radius; // L: 1070
							field2487[var31][field2486[var31]++] = var7; // L: 1071
						}
					} else {
						var31 = field2482[var8]; // L: 1034
						var15 = field2482[var9]; // L: 1035
						var16 = field2482[var10]; // L: 1036
						int var32 = field2483[var8]; // L: 1037
						var18 = field2483[var9]; // L: 1038
						int var19 = field2483[var10]; // L: 1039
						int var20 = field2484[var8]; // L: 1040
						int var21 = field2484[var9]; // L: 1041
						int var22 = field2484[var10]; // L: 1042
						var31 -= var15; // L: 1043
						var16 -= var15; // L: 1044
						var32 -= var18; // L: 1045
						var19 -= var18; // L: 1046
						var20 -= var21; // L: 1047
						var22 -= var21; // L: 1048
						int var23 = var32 * var22 - var20 * var19; // L: 1049
						int var24 = var20 * var16 - var31 * var22; // L: 1050
						int var25 = var31 * var19 - var32 * var16; // L: 1051
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1052
							field2478[var7] = true; // L: 1053
							int var26 = (field2481[var8] + field2481[var9] + field2481[var10]) / 3 + this.radius; // L: 1054
							field2487[var26][field2486[var26]++] = var7; // L: 1055
						}
					}
				}
			}

			int[] var27;
			if (this.faceRenderPriorities == null) { // L: 1075
				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1076
					var8 = field2486[var7]; // L: 1077
					if (var8 > 0) { // L: 1078
						var27 = field2487[var7]; // L: 1079

						for (var10 = 0; var10 < var8; ++var10) { // L: 1080
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; ++var7) { // L: 1085
					field2454[var7] = 0; // L: 1086
					field2470[var7] = 0; // L: 1087
				}

				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1089
					var8 = field2486[var7]; // L: 1090
					if (var8 > 0) { // L: 1091
						var27 = field2487[var7]; // L: 1092

						for (var10 = 0; var10 < var8; ++var10) { // L: 1093
							var11 = var27[var10]; // L: 1094
							byte var33 = this.faceRenderPriorities[var11]; // L: 1095
							var28 = field2454[var33]++; // L: 1096
							field2489[var33][var28] = var11; // L: 1097
							if (var33 < 10) { // L: 1098
								int[] var10000 = field2470;
								var10000[var33] += var7;
							} else if (var33 == 10) { // L: 1099
								field2492[var28] = var7;
							} else {
								field2468[var28] = var7; // L: 1100
							}
						}
					}
				}

				var7 = 0; // L: 1104
				if (field2454[1] > 0 || field2454[2] > 0) { // L: 1105
					var7 = (field2470[1] + field2470[2]) / (field2454[1] + field2454[2]);
				}

				var8 = 0; // L: 1106
				if (field2454[3] > 0 || field2454[4] > 0) { // L: 1107
					var8 = (field2470[3] + field2470[4]) / (field2454[3] + field2454[4]);
				}

				var9 = 0; // L: 1108
				if (field2454[6] > 0 || field2454[8] > 0) { // L: 1109
					var9 = (field2470[8] + field2470[6]) / (field2454[8] + field2454[6]);
				}

				var11 = 0; // L: 1111
				var12 = field2454[10]; // L: 1112
				int[] var13 = field2489[10]; // L: 1113
				int[] var14 = field2492; // L: 1114
				if (var11 == var12) { // L: 1115
					var11 = 0; // L: 1116
					var12 = field2454[11]; // L: 1117
					var13 = field2489[11]; // L: 1118
					var14 = field2468; // L: 1119
				}

				if (var11 < var12) { // L: 1121
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1122
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1123
					while (var15 == 0 && var10 > var7) { // L: 1124
						this.drawFace(var13[var11++]); // L: 1125
						if (var11 == var12 && var13 != field2489[11]) { // L: 1126
							var11 = 0; // L: 1127
							var12 = field2454[11]; // L: 1128
							var13 = field2489[11]; // L: 1129
							var14 = field2468; // L: 1130
						}

						if (var11 < var12) { // L: 1132
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1133
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1135
						this.drawFace(var13[var11++]); // L: 1136
						if (var11 == var12 && var13 != field2489[11]) { // L: 1137
							var11 = 0; // L: 1138
							var12 = field2454[11]; // L: 1139
							var13 = field2489[11]; // L: 1140
							var14 = field2468; // L: 1141
						}

						if (var11 < var12) { // L: 1143
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1144
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1146
						this.drawFace(var13[var11++]); // L: 1147
						if (var11 == var12 && var13 != field2489[11]) { // L: 1148
							var11 = 0; // L: 1149
							var12 = field2454[11]; // L: 1150
							var13 = field2489[11]; // L: 1151
							var14 = field2468; // L: 1152
						}

						if (var11 < var12) { // L: 1154
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1155
						}
					}

					var16 = field2454[var15]; // L: 1157
					int[] var17 = field2489[var15]; // L: 1158

					for (var18 = 0; var18 < var16; ++var18) { // L: 1159
						this.drawFace(var17[var18]); // L: 1160
					}
				}

				while (var10 != -1000) { // L: 1163
					this.drawFace(var13[var11++]); // L: 1164
					if (var11 == var12 && var13 != field2489[11]) { // L: 1165
						var11 = 0; // L: 1166
						var13 = field2489[11]; // L: 1167
						var12 = field2454[11]; // L: 1168
						var14 = field2468; // L: 1169
					}

					if (var11 < var12) { // L: 1171
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1172
					}
				}

			}
		}
	} // L: 1083 1174

	@ObfuscatedName("ar")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2478[var1]) { // L: 1177
			this.method4238(var1); // L: 1178
		} else {
			int var2 = this.indices1[var1]; // L: 1181
			int var3 = this.indices2[var1]; // L: 1182
			int var4 = this.indices3[var1]; // L: 1183
			Rasterizer3D.field2262 = field2495[var1]; // L: 1184
			if (this.faceAlphas == null) { // L: 1185
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1186
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1189
			}

			this.method4158(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1191
		}
	} // L: 1179 1192

	@ObfuscatedName("al")
	final void method4158(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1195
			int var11;
			int var12;
			int var13;
			if (this.field2453 != null && this.field2453[var1] != -1) { // L: 1213
				int var14 = this.field2453[var1] & 255; // L: 1214
				var11 = this.field2457[var14]; // L: 1215
				var12 = this.field2458[var14]; // L: 1216
				var13 = this.field2459[var14]; // L: 1217
			} else {
				var11 = this.indices1[var1]; // L: 1220
				var12 = this.indices2[var1]; // L: 1221
				var13 = this.indices3[var1]; // L: 1222
			}

			if (this.faceColors3[var1] == -1) { // L: 1224
				Rasterizer3D.method3800(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2482[var11], field2482[var12], field2482[var13], field2483[var11], field2483[var12], field2483[var13], field2484[var11], field2484[var12], field2484[var13], this.faceTextures[var1]); // L: 1225
			} else {
				Rasterizer3D.method3800(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2482[var11], field2482[var12], field2482[var13], field2483[var11], field2483[var12], field2483[var13], field2484[var11], field2484[var12], field2484[var13], this.faceTextures[var1]); // L: 1228
			}
		} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1196
			Rasterizer3D.method3842(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1197
		} else if (this.faceColors3[var1] == -1) { // L: 1199
			Rasterizer3D.method3797(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]]); // L: 1200
		} else if (this.overrideAmount > 0) { // L: 1202
			Rasterizer3D.method3810(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1203
		} else {
			Rasterizer3D.method3843(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1206
		}

	} // L: 1231

	@ObfuscatedName("aa")
	final void method4238(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1234
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1235
		int var4 = 0; // L: 1236
		int var5 = this.indices1[var1]; // L: 1237
		int var6 = this.indices2[var1]; // L: 1238
		int var7 = this.indices3[var1]; // L: 1239
		int var8 = field2484[var5]; // L: 1240
		int var9 = field2484[var6]; // L: 1241
		int var10 = field2484[var7]; // L: 1242
		if (this.faceAlphas == null) { // L: 1243
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1244
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1245
			field2511[var4] = modelViewportXs[var5]; // L: 1246
			field2494[var4] = modelViewportYs[var5]; // L: 1247
			field2467[var4++] = this.faceColors1[var1]; // L: 1248
		} else {
			var11 = field2482[var5]; // L: 1251
			var12 = field2483[var5]; // L: 1252
			var13 = this.faceColors1[var1]; // L: 1253
			if (var10 >= 50) { // L: 1254
				var14 = field2491[var10 - var8] * (50 - var8); // L: 1255
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var7] - var11) * var14 >> 16)) / 50; // L: 1256
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var7] - var12) * var14 >> 16)) / 50; // L: 1257
				field2467[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1258
			}

			if (var9 >= 50) { // L: 1260
				var14 = field2491[var9 - var8] * (50 - var8); // L: 1261
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var6] - var11) * var14 >> 16)) / 50; // L: 1262
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var6] - var12) * var14 >> 16)) / 50; // L: 1263
				field2467[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1264
			}
		}

		if (var9 >= 50) { // L: 1267
			field2511[var4] = modelViewportXs[var6]; // L: 1268
			field2494[var4] = modelViewportYs[var6]; // L: 1269
			field2467[var4++] = this.faceColors2[var1]; // L: 1270
		} else {
			var11 = field2482[var6]; // L: 1273
			var12 = field2483[var6]; // L: 1274
			var13 = this.faceColors2[var1]; // L: 1275
			if (var8 >= 50) { // L: 1276
				var14 = field2491[var8 - var9] * (50 - var9); // L: 1277
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var5] - var11) * var14 >> 16)) / 50; // L: 1278
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var5] - var12) * var14 >> 16)) / 50; // L: 1279
				field2467[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1280
			}

			if (var10 >= 50) { // L: 1282
				var14 = field2491[var10 - var9] * (50 - var9); // L: 1283
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var7] - var11) * var14 >> 16)) / 50; // L: 1284
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var7] - var12) * var14 >> 16)) / 50; // L: 1285
				field2467[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1286
			}
		}

		if (var10 >= 50) { // L: 1289
			field2511[var4] = modelViewportXs[var7]; // L: 1290
			field2494[var4] = modelViewportYs[var7]; // L: 1291
			field2467[var4++] = this.faceColors3[var1]; // L: 1292
		} else {
			var11 = field2482[var7]; // L: 1295
			var12 = field2483[var7]; // L: 1296
			var13 = this.faceColors3[var1]; // L: 1297
			if (var9 >= 50) { // L: 1298
				var14 = field2491[var9 - var10] * (50 - var10); // L: 1299
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var6] - var11) * var14 >> 16)) / 50; // L: 1300
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var6] - var12) * var14 >> 16)) / 50; // L: 1301
				field2467[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1302
			}

			if (var8 >= 50) { // L: 1304
				var14 = field2491[var8 - var10] * (50 - var10); // L: 1305
				field2511[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2482[var5] - var11) * var14 >> 16)) / 50; // L: 1306
				field2494[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2483[var5] - var12) * var14 >> 16)) / 50; // L: 1307
				field2467[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1308
			}
		}

		var11 = field2511[0]; // L: 1311
		var12 = field2511[1]; // L: 1312
		var13 = field2511[2]; // L: 1313
		var14 = field2494[0]; // L: 1314
		int var15 = field2494[1]; // L: 1315
		int var16 = field2494[2]; // L: 1316
		Rasterizer3D.field2262 = false; // L: 1317
		if (var4 == 3) { // L: 1318
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1319
				Rasterizer3D.field2262 = true;
			}

			this.method4158(var1, var14, var15, var16, var11, var12, var13, field2467[0], field2467[1], field2467[2]); // L: 1320
		}

		if (var4 == 4) { // L: 1322
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2511[3] < 0 || field2511[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1323
				Rasterizer3D.field2262 = true;
			}

			int var17;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1324
				int var18;
				int var19;
				if (this.field2453 != null && this.field2453[var1] != -1) { // L: 1348
					int var20 = this.field2453[var1] & 255; // L: 1349
					var17 = this.field2457[var20]; // L: 1350
					var18 = this.field2458[var20]; // L: 1351
					var19 = this.field2459[var20]; // L: 1352
				} else {
					var17 = var5; // L: 1355
					var18 = var6; // L: 1356
					var19 = var7; // L: 1357
				}

				short var21 = this.faceTextures[var1]; // L: 1359
				if (this.faceColors3[var1] == -1) { // L: 1360
					Rasterizer3D.method3800(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2482[var17], field2482[var18], field2482[var19], field2483[var17], field2483[var18], field2483[var19], field2484[var17], field2484[var18], field2484[var19], var21); // L: 1361
					Rasterizer3D.method3800(var14, var16, field2494[3], var11, var13, field2511[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2482[var17], field2482[var18], field2482[var19], field2483[var17], field2483[var18], field2483[var19], field2484[var17], field2484[var18], field2484[var19], var21); // L: 1362
				} else {
					Rasterizer3D.method3800(var14, var15, var16, var11, var12, var13, field2467[0], field2467[1], field2467[2], field2482[var17], field2482[var18], field2482[var19], field2483[var17], field2483[var18], field2483[var19], field2484[var17], field2484[var18], field2484[var19], var21); // L: 1365
					Rasterizer3D.method3800(var14, var16, field2494[3], var11, var13, field2511[3], field2467[0], field2467[2], field2467[3], field2482[var17], field2482[var18], field2482[var19], field2483[var17], field2483[var18], field2483[var19], field2484[var17], field2484[var18], field2484[var19], var21); // L: 1366
				}
			} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1325
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1326
				Rasterizer3D.method3842(var14, var15, var16, var11, var12, var13, var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1327
				Rasterizer3D.method3842(var14, var16, field2494[3], var11, var13, field2511[3], var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1328
			} else if (this.faceColors3[var1] == -1) { // L: 1330
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1331
				Rasterizer3D.method3797(var14, var15, var16, var11, var12, var13, var17); // L: 1332
				Rasterizer3D.method3797(var14, var16, field2494[3], var11, var13, field2511[3], var17); // L: 1333
			} else if (this.overrideAmount > 0) { // L: 1335
				Rasterizer3D.method3810(var14, var15, var16, var11, var12, var13, field2467[0], field2467[1], field2467[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1336
				Rasterizer3D.method3810(var14, var16, field2494[3], var11, var13, field2511[3], field2467[0], field2467[2], field2467[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1337
			} else {
				Rasterizer3D.method3843(var14, var15, var16, var11, var12, var13, field2467[0], field2467[1], field2467[2]); // L: 1340
				Rasterizer3D.method3843(var14, var16, field2494[3], var11, var13, field2511[3], field2467[0], field2467[2], field2467[3]); // L: 1341
			}
		}

	} // L: 1370

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILni;)V"
	)
	void method4151(int var1, class371 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1373
		float var4 = (float)(-this.verticesY[var1]); // L: 1374
		float var5 = (float)(-this.verticesZ[var1]); // L: 1375
		float var6 = 1.0F; // L: 1376
		this.verticesX[var1] = (int)(var2.field4241[0] * var3 + var2.field4241[4] * var4 + var2.field4241[8] * var5 + var2.field4241[12] * var6); // L: 1377
		this.verticesY[var1] = -((int)(var2.field4241[1] * var3 + var2.field4241[5] * var4 + var2.field4241[9] * var5 + var2.field4241[13] * var6)); // L: 1378
		this.verticesZ[var1] = -((int)(var2.field4241[2] * var3 + var2.field4241[6] * var4 + var2.field4241[10] * var5 + var2.field4241[14] * var6)); // L: 1379
	} // L: 1380

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lga;I)V"
	)
	void method4237(class194 var1, int var2) {
		if (this.field2462 != null) { // L: 1383
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1384
				int[] var4 = this.field2462[var3]; // L: 1385
				if (var4 != null && var4.length != 0) { // L: 1386
					int[] var5 = this.field2463[var3]; // L: 1387
					field2437.method6702(); // L: 1388

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1389
						int var7 = var4[var6]; // L: 1390
						class113 var8 = var1.method3872(var7); // L: 1391
						if (var8 != null) { // L: 1392
							field2477.method6680((float)var5[var6] / 255.0F); // L: 1393
							field2439.method6699(var8.method2593(var2)); // L: 1394
							field2439.method6682(field2477); // L: 1395
							field2437.method6704(field2439); // L: 1396
						}
					}

					this.method4151(var3, field2437); // L: 1398
				}
			}

		}
	} // L: 1400

	@ObfuscatedName("cb")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2486[0] = -1; // L: 822
		if (this.boundsType != 1) { // L: 823
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1); // L: 824
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 825
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 826
		int var13 = var3 * this.xzRadius >> 16; // L: 827
		int var14 = var12 + var13; // L: 828
		if (var14 > 50 && var12 < 3500) { // L: 829
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 830
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 831
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) { // L: 832
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 833
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) { // L: 834
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 835
					int var19 = var2 * this.xzRadius >> 16; // L: 836
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 837
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom; // L: 838
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) { // L: 839
						int var22 = (var3 * super.height >> 16) + var19; // L: 840
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom; // L: 841
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) { // L: 842
							int var24 = var13 + (var2 * super.height >> 16); // L: 843
							boolean var25 = false; // L: 844
							boolean var26 = false; // L: 845
							if (var12 - var24 <= 50) { // L: 846
								var26 = true;
							}

							boolean var27 = var26 || this.field2451 > 0; // L: 847
							int var28 = FaceNormal.method4095(); // L: 848
							int var29 = ViewportMouse.ViewportMouse_y; // L: 851
							boolean var31 = class139.method2923(); // L: 854
							boolean var32 = LoginScreenAnimation.method2219(var9); // L: 855
							boolean var33 = false; // L: 856
							int var37;
							int var38;
							int var39;
							int var40;
							int var48;
							int var54;
							int var55;
							int var56;
							if (var32 && var31) { // L: 857
								boolean var34 = false; // L: 858
								if (field2488) { // L: 859
									boolean var35;
									if (!class139.method2923()) { // L: 863
										var35 = false; // L: 864
									} else {
										int var43;
										int var44;
										int var45;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 868
											var37 = Scene.Scene_cameraPitchSine; // L: 869
											var38 = Scene.Scene_cameraPitchCosine; // L: 870
											var39 = Scene.Scene_cameraYawSine; // L: 871
											var40 = Scene.Scene_cameraYawCosine; // L: 872
											byte var41 = 50; // L: 873
											short var42 = 3500; // L: 874
											var43 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var41 / Rasterizer3D.Rasterizer3D_zoom; // L: 875
											var44 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var41 / Rasterizer3D.Rasterizer3D_zoom; // L: 876
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var42 / Rasterizer3D.Rasterizer3D_zoom; // L: 877
											int var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var42 / Rasterizer3D.Rasterizer3D_zoom; // L: 878
											int var47 = Rasterizer3D.method3808(var44, var41, var38, var37); // L: 880
											var55 = Rasterizer3D.method3809(var44, var41, var38, var37); // L: 881
											var44 = var47; // L: 882
											var47 = Rasterizer3D.method3808(var46, var42, var38, var37); // L: 883
											var56 = Rasterizer3D.method3809(var46, var42, var38, var37); // L: 884
											var46 = var47; // L: 885
											var47 = Rasterizer3D.method3807(var43, var55, var40, var39); // L: 886
											var55 = Rasterizer3D.method3799(var43, var55, var40, var39); // L: 887
											var43 = var47; // L: 888
											var47 = Rasterizer3D.method3807(var45, var56, var40, var39); // L: 889
											var56 = Rasterizer3D.method3799(var45, var56, var40, var39); // L: 890
											ViewportMouse.field2513 = (var47 + var43) / 2; // L: 892
											ViewportMouse.field2517 = (var46 + var44) / 2; // L: 893
											UserComparator10.field1368 = (var56 + var55) / 2; // L: 894
											GrandExchangeOfferWorldComparator.field3948 = (var47 - var43) / 2; // L: 895
											ViewportMouse.field2516 = (var46 - var44) / 2; // L: 896
											JagexCache.field1695 = (var56 - var55) / 2; // L: 897
											Frames.field2377 = Math.abs(GrandExchangeOfferWorldComparator.field3948); // L: 898
											class140.field1630 = Math.abs(ViewportMouse.field2516); // L: 899
											WorldMapLabel.field2761 = Math.abs(JagexCache.field1695); // L: 900
										}

										var37 = this.xMid + var6; // L: 902
										var38 = var7 + this.yMid; // L: 903
										var39 = var8 + this.zMid; // L: 904
										var40 = this.xMidOffset; // L: 905
										var55 = this.yMidOffset; // L: 906
										var56 = this.zMidOffset; // L: 907
										var43 = ViewportMouse.field2513 - var37; // L: 908
										var44 = ViewportMouse.field2517 - var38; // L: 909
										var45 = UserComparator10.field1368 - var39; // L: 910
										if (Math.abs(var43) > var40 + Frames.field2377) { // L: 911
											var35 = false; // L: 912
										} else if (Math.abs(var44) > var55 + class140.field1630) { // L: 915
											var35 = false; // L: 916
										} else if (Math.abs(var45) > var56 + WorldMapLabel.field2761) { // L: 919
											var35 = false; // L: 920
										} else if (Math.abs(var45 * ViewportMouse.field2516 - var44 * JagexCache.field1695) > var56 * class140.field1630 + var55 * WorldMapLabel.field2761) { // L: 923
											var35 = false; // L: 924
										} else if (Math.abs(var43 * JagexCache.field1695 - var45 * GrandExchangeOfferWorldComparator.field3948) > var56 * Frames.field2377 + var40 * WorldMapLabel.field2761) { // L: 927
											var35 = false; // L: 928
										} else if (Math.abs(var44 * GrandExchangeOfferWorldComparator.field3948 - var43 * ViewportMouse.field2516) > var55 * Frames.field2377 + var40 * class140.field1630) { // L: 931
											var35 = false; // L: 932
										} else {
											var35 = true; // L: 935
										}
									}

									var34 = var35; // L: 937
								} else {
									var54 = var12 - var13; // L: 940
									if (var54 <= 50) { // L: 941
										var54 = 50;
									}

									if (var15 > 0) { // L: 942
										var16 /= var14; // L: 943
										var17 /= var54; // L: 944
									} else {
										var17 /= var14; // L: 947
										var16 /= var54; // L: 948
									}

									if (var18 > 0) { // L: 950
										var23 /= var14; // L: 951
										var21 /= var54; // L: 952
									} else {
										var21 /= var14; // L: 955
										var23 /= var54; // L: 956
									}

									var48 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 958
									var37 = var29 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 959
									if (var48 > var16 && var48 < var17 && var37 > var23 && var37 < var21) { // L: 960
										var34 = true; // L: 961
									}
								}

								if (var34) { // L: 964
									if (this.isSingleTile) { // L: 965
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 968
									} else {
										var33 = true; // L: 971
									}
								}
							}

							int var53 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 974
							var54 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 975
							var48 = 0; // L: 976
							var37 = 0; // L: 977
							if (var1 != 0) { // L: 978
								var48 = Model_sine[var1]; // L: 979
								var37 = Model_cosine[var1]; // L: 980
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) { // L: 982
								var39 = this.verticesX[var38]; // L: 983
								var40 = this.verticesY[var38]; // L: 984
								var55 = this.verticesZ[var38]; // L: 985
								if (var1 != 0) { // L: 986
									var56 = var55 * var48 + var39 * var37 >> 16; // L: 987
									var55 = var55 * var37 - var39 * var48 >> 16; // L: 988
									var39 = var56; // L: 989
								}

								var39 += var6; // L: 991
								var40 += var7; // L: 992
								var55 += var8; // L: 993
								var56 = var55 * var4 + var5 * var39 >> 16; // L: 994
								var55 = var5 * var55 - var39 * var4 >> 16; // L: 995
								var39 = var56; // L: 996
								var56 = var3 * var40 - var55 * var2 >> 16; // L: 997
								var55 = var40 * var2 + var3 * var55 >> 16; // L: 998
								field2481[var38] = var55 - var12; // L: 1000
								if (var55 >= 50) { // L: 1001
									modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var55 + var53; // L: 1002
									modelViewportYs[var38] = var56 * Rasterizer3D.Rasterizer3D_zoom / var55 + var54; // L: 1003
								} else {
									modelViewportXs[var38] = -5000; // L: 1006
									var25 = true; // L: 1007
								}

								if (var27) { // L: 1009
									field2482[var38] = var39; // L: 1010
									field2483[var38] = var56; // L: 1011
									field2484[var38] = var55; // L: 1012
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9); // L: 1016
							} catch (Exception var52) { // L: 1018
							}

						}
					}
				}
			}
		}
	} // L: 1019
}
