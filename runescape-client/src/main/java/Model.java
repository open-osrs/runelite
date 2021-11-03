import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("w")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("a")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ar")
	static boolean[] field2554;
	@ObfuscatedName("ad")
	static boolean[] field2548;
	@ObfuscatedName("an")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ax")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("av")
	static int[] field2551;
	@ObfuscatedName("ap")
	static int[] field2574;
	@ObfuscatedName("au")
	static int[] field2547;
	@ObfuscatedName("aj")
	static int[] field2575;
	@ObfuscatedName("aw")
	static int[] field2556;
	@ObfuscatedName("ao")
	static int[][] field2557;
	@ObfuscatedName("aa")
	static int[] field2558;
	@ObfuscatedName("ay")
	static int[][] field2559;
	@ObfuscatedName("bg")
	static int[] field2560;
	@ObfuscatedName("bl")
	static int[] field2561;
	@ObfuscatedName("bx")
	static int[] field2528;
	@ObfuscatedName("bd")
	static int[] field2563;
	@ObfuscatedName("bt")
	static int[] field2564;
	@ObfuscatedName("bf")
	static int[] field2521;
	@ObfuscatedName("bs")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bh")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bw")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bm")
	static boolean field2576;
	@ObfuscatedName("bo")
	@Export("Model_sine")
	static int[] Model_sine;
	@ObfuscatedName("bv")
	@Export("Model_cosine")
	static int[] Model_cosine;
	@ObfuscatedName("bu")
	static int[] field2540;
	@ObfuscatedName("bz")
	static int[] field2508;
	@ObfuscatedName("o")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("g")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("e")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("p")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("j")
	@Export("indicesCount")
	int indicesCount;
	@ObfuscatedName("b")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("x")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("y")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("k")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("t")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("l")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("u")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("n")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("z")
	byte[] field2566;
	@ObfuscatedName("q")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("d")
	byte field2527;
	@ObfuscatedName("r")
	int field2522;
	@ObfuscatedName("m")
	int[] field2529;
	@ObfuscatedName("c")
	int[] field2530;
	@ObfuscatedName("f")
	int[] field2538;
	@ObfuscatedName("h")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("v")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ag")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ae")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("aq")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("al")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("am")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ai")
	@Export("radius")
	int radius;
	@ObfuscatedName("ah")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("as")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("at")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("az")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ac")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ak")
	@Export("zMidOffset")
	int zMidOffset;

	static {
		Model_sharedSequenceModel = new Model(); // L: 6
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 7
		Model_sharedSpotAnimationModel = new Model(); // L: 8
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 9
		field2554 = new boolean[6500]; // L: 45
		field2548 = new boolean[6500]; // L: 46
		modelViewportXs = new int[6500]; // L: 47
		modelViewportYs = new int[6500]; // L: 48
		field2551 = new int[6500]; // L: 49
		field2574 = new int[6500]; // L: 50
		field2547 = new int[6500]; // L: 51
		field2575 = new int[6500]; // L: 52
		field2556 = new int[1600]; // L: 54
		field2557 = new int[1600][512]; // L: 55
		field2558 = new int[12]; // L: 56
		field2559 = new int[12][2000]; // L: 57
		field2560 = new int[2000]; // L: 58
		field2561 = new int[2000]; // L: 59
		field2528 = new int[12]; // L: 60
		field2563 = new int[10]; // L: 61
		field2564 = new int[10]; // L: 62
		field2521 = new int[10]; // L: 63
		field2576 = true; // L: 67
		Model_sine = Rasterizer3D.Rasterizer3D_sine; // L: 70
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine; // L: 71
		field2540 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 72
		field2508 = Rasterizer3D.field2347; // L: 73
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2527 = 0;
		this.field2522 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 77

	@ObfuscatedSignature(
		descriptor = "([Lhl;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 10
		this.indicesCount = 0; // L: 14
		this.field2527 = 0; // L: 25
		this.field2522 = 0; // L: 26
		this.isSingleTile = false; // L: 32
		this.xMidOffset = -1; // L: 41
		this.yMidOffset = -1; // L: 42
		this.zMidOffset = -1; // L: 43
		boolean var3 = false; // L: 80
		boolean var4 = false; // L: 81
		boolean var5 = false; // L: 82
		boolean var6 = false; // L: 83
		this.verticesCount = 0; // L: 84
		this.indicesCount = 0; // L: 85
		this.field2522 = 0; // L: 86
		this.field2527 = -1; // L: 87

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 88
			var8 = var1[var7]; // L: 89
			if (var8 != null) { // L: 90
				this.verticesCount += var8.verticesCount; // L: 91
				this.indicesCount += var8.indicesCount; // L: 92
				this.field2522 += var8.field2522; // L: 93
				if (var8.faceRenderPriorities != null) { // L: 94
					var3 = true;
				} else {
					if (this.field2527 == -1) { // L: 96
						this.field2527 = var8.field2527;
					}

					if (this.field2527 != var8.field2527) { // L: 97
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 99
				var5 |= var8.faceTextures != null; // L: 100
				var6 |= var8.field2566 != null; // L: 101
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 104
		this.verticesY = new int[this.verticesCount]; // L: 105
		this.verticesZ = new int[this.verticesCount]; // L: 106
		this.indices1 = new int[this.indicesCount]; // L: 107
		this.indices2 = new int[this.indicesCount]; // L: 108
		this.indices3 = new int[this.indicesCount]; // L: 109
		this.faceColors1 = new int[this.indicesCount]; // L: 110
		this.faceColors2 = new int[this.indicesCount]; // L: 111
		this.faceColors3 = new int[this.indicesCount]; // L: 112
		if (var3) { // L: 113
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) { // L: 114
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) { // L: 115
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) { // L: 116
			this.field2566 = new byte[this.indicesCount];
		}

		if (this.field2522 > 0) { // L: 117
			this.field2529 = new int[this.field2522]; // L: 118
			this.field2530 = new int[this.field2522]; // L: 119
			this.field2538 = new int[this.field2522]; // L: 120
		}

		this.verticesCount = 0; // L: 122
		this.indicesCount = 0; // L: 123
		this.field2522 = 0; // L: 124

		for (var7 = 0; var7 < var2; ++var7) { // L: 125
			var8 = var1[var7]; // L: 126
			if (var8 != null) { // L: 127
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) { // L: 128
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9]; // L: 129
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9]; // L: 130
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9]; // L: 131
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9]; // L: 132
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9]; // L: 133
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9]; // L: 134
					if (var3) { // L: 135
						if (var8.faceRenderPriorities != null) { // L: 136
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2527; // L: 137
						}
					}

					if (var4 && var8.faceAlphas != null) { // L: 139 140
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) { // L: 142
						if (var8.faceTextures != null) { // L: 143
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1; // L: 144
						}
					}

					if (var6) { // L: 146
						if (var8.field2566 != null && var8.field2566[var9] != -1) { // L: 147
							this.field2566[this.indicesCount] = (byte)(this.field2522 + var8.field2566[var9]);
						} else {
							this.field2566[this.indicesCount] = -1; // L: 148
						}
					}

					++this.indicesCount; // L: 150
				}

				for (var9 = 0; var9 < var8.field2522; ++var9) { // L: 152
					this.field2529[this.field2522] = this.verticesCount + var8.field2529[var9]; // L: 153
					this.field2530[this.field2522] = this.verticesCount + var8.field2530[var9]; // L: 154
					this.field2538[this.field2522] = this.verticesCount + var8.field2538[var9]; // L: 155
					++this.field2522; // L: 156
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) { // L: 158
					this.verticesX[this.verticesCount] = var8.verticesX[var9]; // L: 159
					this.verticesY[this.verticesCount] = var8.verticesY[var9]; // L: 160
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9]; // L: 161
					++this.verticesCount; // L: 162
				}
			}
		}

	} // L: 166

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhl;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 169
		int var7 = var2 - this.xzRadius; // L: 170
		int var8 = var2 + this.xzRadius; // L: 171
		int var9 = var4 - this.xzRadius; // L: 172
		int var10 = var4 + this.xzRadius; // L: 173
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 174
			var7 >>= 7; // L: 175
			var8 = var8 + 127 >> 7; // L: 176
			var9 >>= 7; // L: 177
			var10 = var10 + 127 >> 7; // L: 178
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 179
				return this;
			} else {
				Model var11;
				if (var5) { // L: 181
					var11 = new Model(); // L: 182
					var11.verticesCount = this.verticesCount; // L: 183
					var11.indicesCount = this.indicesCount; // L: 184
					var11.field2522 = this.field2522; // L: 185
					var11.verticesX = this.verticesX; // L: 186
					var11.verticesZ = this.verticesZ; // L: 187
					var11.indices1 = this.indices1; // L: 188
					var11.indices2 = this.indices2; // L: 189
					var11.indices3 = this.indices3; // L: 190
					var11.faceColors1 = this.faceColors1; // L: 191
					var11.faceColors2 = this.faceColors2; // L: 192
					var11.faceColors3 = this.faceColors3; // L: 193
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 194
					var11.faceAlphas = this.faceAlphas; // L: 195
					var11.field2566 = this.field2566; // L: 196
					var11.faceTextures = this.faceTextures; // L: 197
					var11.field2527 = this.field2527; // L: 198
					var11.field2529 = this.field2529; // L: 199
					var11.field2530 = this.field2530; // L: 200
					var11.field2538 = this.field2538; // L: 201
					var11.vertexLabels = this.vertexLabels; // L: 202
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 203
					var11.isSingleTile = this.isSingleTile; // L: 204
					var11.verticesY = new int[var11.verticesCount]; // L: 205
				} else {
					var11 = this; // L: 208
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
				if (var6 == 0) { // L: 210
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 211
						var13 = var2 + this.verticesX[var12]; // L: 212
						var14 = var4 + this.verticesZ[var12]; // L: 213
						var15 = var13 & 127; // L: 214
						var16 = var14 & 127; // L: 215
						var17 = var13 >> 7; // L: 216
						var18 = var14 >> 7; // L: 217
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 218
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 219
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 220
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 221
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 225
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 226
						if (var13 < var6) { // L: 227
							var14 = var2 + this.verticesX[var12]; // L: 228
							var15 = var4 + this.verticesZ[var12]; // L: 229
							var16 = var14 & 127; // L: 230
							var17 = var15 & 127; // L: 231
							var18 = var14 >> 7; // L: 232
							var19 = var15 >> 7; // L: 233
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 234
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 235
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 236
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 237
						}
					}
				}

				var11.resetBounds(); // L: 241
				return var11; // L: 242
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhl;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 246
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 247
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhl;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 251
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 252
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZLhl;[B)Lhl;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 256
		var2.indicesCount = this.indicesCount; // L: 257
		var2.field2522 = this.field2522; // L: 258
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 259
			var2.verticesX = new int[this.verticesCount + 100]; // L: 260
			var2.verticesY = new int[this.verticesCount + 100]; // L: 261
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 262
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 264
			var2.verticesX[var4] = this.verticesX[var4]; // L: 265
			var2.verticesY[var4] = this.verticesY[var4]; // L: 266
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 267
		}

		if (var1) { // L: 269
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 271
			if (this.faceAlphas == null) { // L: 272
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 273
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 276
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 279
		var2.indices2 = this.indices2; // L: 280
		var2.indices3 = this.indices3; // L: 281
		var2.faceColors1 = this.faceColors1; // L: 282
		var2.faceColors2 = this.faceColors2; // L: 283
		var2.faceColors3 = this.faceColors3; // L: 284
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 285
		var2.field2566 = this.field2566; // L: 286
		var2.faceTextures = this.faceTextures; // L: 287
		var2.field2527 = this.field2527; // L: 288
		var2.field2529 = this.field2529; // L: 289
		var2.field2530 = this.field2530; // L: 290
		var2.field2538 = this.field2538; // L: 291
		var2.vertexLabels = this.vertexLabels; // L: 292
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 293
		var2.isSingleTile = this.isSingleTile; // L: 294
		var2.resetBounds(); // L: 295
		return var2; // L: 296
	}

	@ObfuscatedName("b")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 300
			int var2 = 0; // L: 301
			int var3 = 0; // L: 302
			int var4 = 0; // L: 303
			int var5 = 0; // L: 304
			int var6 = 0; // L: 305
			int var7 = 0; // L: 306
			int var8 = Model_cosine[var1]; // L: 307
			int var9 = Model_sine[var1]; // L: 308

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 309
				int var11 = Rasterizer3D.method4220(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 310
				int var12 = this.verticesY[var10]; // L: 311
				int var13 = Rasterizer3D.method4243(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 312
				if (var11 < var2) { // L: 313
					var2 = var11;
				}

				if (var11 > var5) { // L: 314
					var5 = var11;
				}

				if (var12 < var3) { // L: 315
					var3 = var12;
				}

				if (var12 > var6) { // L: 316
					var6 = var12;
				}

				if (var13 < var4) { // L: 317
					var4 = var13;
				}

				if (var13 > var7) { // L: 318
					var7 = var13;
				}
			}

			this.xMid = (var5 + var2) / 2; // L: 320
			this.yMid = (var6 + var3) / 2; // L: 321
			this.zMid = (var7 + var4) / 2; // L: 322
			this.xMidOffset = (var5 - var2 + 1) / 2; // L: 323
			this.yMidOffset = (var6 - var3 + 1) / 2; // L: 324
			this.zMidOffset = (var7 - var4 + 1) / 2; // L: 325
			if (this.xMidOffset < 32) { // L: 327
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) { // L: 328
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) { // L: 329
				this.xMidOffset += 8; // L: 331
				this.zMidOffset += 8; // L: 332
			}

		}
	} // L: 334

	@ObfuscatedName("x")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 337
			this.boundsType = 1; // L: 338
			super.height = 0; // L: 339
			this.bottomY = 0; // L: 340
			this.xzRadius = 0; // L: 341

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 342
				int var2 = this.verticesX[var1]; // L: 343
				int var3 = this.verticesY[var1]; // L: 344
				int var4 = this.verticesZ[var1]; // L: 345
				if (-var3 > super.height) { // L: 346
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 347
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 348
				if (var5 > this.xzRadius) { // L: 349
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 351
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 352
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 353
		}
	} // L: 354

	@ObfuscatedName("y")
	void method4534() {
		if (this.boundsType != 2) { // L: 357
			this.boundsType = 2; // L: 358
			this.xzRadius = 0; // L: 359

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 360
				int var2 = this.verticesX[var1]; // L: 361
				int var3 = this.verticesY[var1]; // L: 362
				int var4 = this.verticesZ[var1]; // L: 363
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 364
				if (var5 > this.xzRadius) { // L: 365
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 367
			this.radius = this.xzRadius; // L: 368
			this.diameter = this.xzRadius + this.xzRadius; // L: 369
		}
	} // L: 370

	@ObfuscatedName("k")
	public int method4536() {
		this.calculateBoundsCylinder(); // L: 373
		return this.xzRadius; // L: 374
	}

	@ObfuscatedName("t")
	@Export("resetBounds")
	void resetBounds() {
		this.boundsType = 0; // L: 378
		this.xMidOffset = -1; // L: 379
	} // L: 380

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lho;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 383
			if (var2 != -1) { // L: 384
				Animation var3 = var1.frames[var2]; // L: 385
				Skeleton var4 = var3.skeleton; // L: 386
				Model_transformTempX = 0; // L: 387
				Model_transformTempY = 0; // L: 388
				Model_transformTempZ = 0; // L: 389

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 390
					int var6 = var3.transformSkeletonLabels[var5]; // L: 391
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 392
				}

				this.resetBounds(); // L: 394
			}
		}
	} // L: 395

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lho;ILho;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 398
			if (var5 != null && var4 != -1) { // L: 399
				Animation var6 = var1.frames[var2]; // L: 403
				Animation var7 = var3.frames[var4]; // L: 404
				Skeleton var8 = var6.skeleton; // L: 405
				Model_transformTempX = 0; // L: 406
				Model_transformTempY = 0; // L: 407
				Model_transformTempZ = 0; // L: 408
				byte var9 = 0; // L: 409
				int var13 = var9 + 1; // L: 410
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 411
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 412 413
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 414
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 416
				Model_transformTempY = 0; // L: 417
				Model_transformTempZ = 0; // L: 418
				var9 = 0; // L: 419
				var13 = var9 + 1; // L: 420
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 421
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 422 423
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 424
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 426
			} else {
				this.animate(var1, var2); // L: 400
			}
		}
	} // L: 401 427

	@ObfuscatedName("n")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 430
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 431
			var7 = 0; // L: 432
			Model_transformTempX = 0; // L: 433
			Model_transformTempY = 0; // L: 434
			Model_transformTempZ = 0; // L: 435

			for (var8 = 0; var8 < var6; ++var8) { // L: 436
				int var18 = var2[var8]; // L: 437
				if (var18 < this.vertexLabels.length) { // L: 438
					int[] var19 = this.vertexLabels[var18]; // L: 439

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 440
						var12 = var19[var11]; // L: 441
						Model_transformTempX += this.verticesX[var12]; // L: 442
						Model_transformTempY += this.verticesY[var12]; // L: 443
						Model_transformTempZ += this.verticesZ[var12]; // L: 444
						++var7; // L: 445
					}
				}
			}

			if (var7 > 0) { // L: 449
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 450
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 451
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 452
			} else {
				Model_transformTempX = var3; // L: 455
				Model_transformTempY = var4; // L: 456
				Model_transformTempZ = var5; // L: 457
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 461
				for (var7 = 0; var7 < var6; ++var7) { // L: 462
					var8 = var2[var7]; // L: 463
					if (var8 < this.vertexLabels.length) { // L: 464
						var9 = this.vertexLabels[var8]; // L: 465

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 466
							var11 = var9[var10]; // L: 467
							var10000 = this.verticesX; // L: 468
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 469
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 470
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 476
				for (var7 = 0; var7 < var6; ++var7) { // L: 477
					var8 = var2[var7]; // L: 478
					if (var8 < this.vertexLabels.length) { // L: 479
						var9 = this.vertexLabels[var8]; // L: 480

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 481
							var11 = var9[var10]; // L: 482
							var10000 = this.verticesX; // L: 483
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 484
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 485
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 486
							int var13 = (var4 & 255) * 8; // L: 487
							int var14 = (var5 & 255) * 8; // L: 488
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 489
								var15 = Model_sine[var14]; // L: 490
								var16 = Model_cosine[var14]; // L: 491
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 492
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 493
								this.verticesX[var11] = var17; // L: 494
							}

							if (var12 != 0) { // L: 496
								var15 = Model_sine[var12]; // L: 497
								var16 = Model_cosine[var12]; // L: 498
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 499
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 500
								this.verticesY[var11] = var17; // L: 501
							}

							if (var13 != 0) { // L: 503
								var15 = Model_sine[var13]; // L: 504
								var16 = Model_cosine[var13]; // L: 505
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 506
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 507
								this.verticesX[var11] = var17; // L: 508
							}

							var10000 = this.verticesX; // L: 510
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 511
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 512
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 518
				for (var7 = 0; var7 < var6; ++var7) { // L: 519
					var8 = var2[var7]; // L: 520
					if (var8 < this.vertexLabels.length) { // L: 521
						var9 = this.vertexLabels[var8]; // L: 522

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 523
							var11 = var9[var10]; // L: 524
							var10000 = this.verticesX; // L: 525
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 526
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 527
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 528
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 529
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 530
							var10000 = this.verticesX; // L: 531
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 532
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 533
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 539
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 540
					for (var7 = 0; var7 < var6; ++var7) { // L: 541
						var8 = var2[var7]; // L: 542
						if (var8 < this.faceLabelsAlpha.length) { // L: 543
							var9 = this.faceLabelsAlpha[var8]; // L: 544

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 545
								var11 = var9[var10]; // L: 546
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 547
								if (var12 < 0) { // L: 548
									var12 = 0;
								} else if (var12 > 255) { // L: 549
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 550
							}
						}
					}
				}

			}
		}
	} // L: 459 474 516 537 555 557

	@ObfuscatedName("z")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 560
			int var2 = this.verticesX[var1]; // L: 561
			this.verticesX[var1] = this.verticesZ[var1]; // L: 562
			this.verticesZ[var1] = -var2; // L: 563
		}

		this.resetBounds(); // L: 565
	} // L: 566

	@ObfuscatedName("q")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 569
			this.verticesX[var1] = -this.verticesX[var1]; // L: 570
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 571
		}

		this.resetBounds(); // L: 573
	} // L: 574

	@ObfuscatedName("d")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 577
			int var2 = this.verticesZ[var1]; // L: 578
			this.verticesZ[var1] = this.verticesX[var1]; // L: 579
			this.verticesX[var1] = -var2; // L: 580
		}

		this.resetBounds(); // L: 582
	} // L: 583

	@ObfuscatedName("r")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = Model_sine[var1]; // L: 586
		int var3 = Model_cosine[var1]; // L: 587

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 588
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 589
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 590
			this.verticesY[var4] = var5; // L: 591
		}

		this.resetBounds(); // L: 593
	} // L: 594

	@ObfuscatedName("m")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 597
			int[] var10000 = this.verticesX; // L: 598
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 599
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 600
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 602
	} // L: 603

	@ObfuscatedName("c")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 606
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 607
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 608
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 609
		}

		this.resetBounds(); // L: 611
	} // L: 612

	@ObfuscatedName("f")
	public final void method4539(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2556[0] = -1; // L: 615
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 616
			this.method4534();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 617
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 618
		int var10 = Model_sine[var1]; // L: 619
		int var11 = Model_cosine[var1]; // L: 620
		int var12 = Model_sine[var2]; // L: 621
		int var13 = Model_cosine[var2]; // L: 622
		int var14 = Model_sine[var3]; // L: 623
		int var15 = Model_cosine[var3]; // L: 624
		int var16 = Model_sine[var4]; // L: 625
		int var17 = Model_cosine[var4]; // L: 626
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 627

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 628
			int var20 = this.verticesX[var19]; // L: 629
			int var21 = this.verticesY[var19]; // L: 630
			int var22 = this.verticesZ[var19]; // L: 631
			int var23;
			if (var3 != 0) { // L: 632
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 633
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 634
				var20 = var23; // L: 635
			}

			if (var1 != 0) { // L: 637
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 638
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 639
				var21 = var23; // L: 640
			}

			if (var2 != 0) { // L: 642
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 643
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 644
				var20 = var23; // L: 645
			}

			var20 += var5; // L: 647
			var21 += var6; // L: 648
			var22 += var7; // L: 649
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 650
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 651
			field2551[var19] = var22 - var18; // L: 653
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 654
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 655
			if (this.field2522 > 0) { // L: 656
				field2574[var19] = var20; // L: 657
				field2547[var19] = var23; // L: 658
				field2575[var19] = var22; // L: 659
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 663
		} catch (Exception var25) { // L: 665
		}

	} // L: 666

	@ObfuscatedName("h")
	public final void method4525(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2556[0] = -1; // L: 669
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 670
			this.method4534();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 671
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 672
		int var11 = Model_sine[var1]; // L: 673
		int var12 = Model_cosine[var1]; // L: 674
		int var13 = Model_sine[var2]; // L: 675
		int var14 = Model_cosine[var2]; // L: 676
		int var15 = Model_sine[var3]; // L: 677
		int var16 = Model_cosine[var3]; // L: 678
		int var17 = Model_sine[var4]; // L: 679
		int var18 = Model_cosine[var4]; // L: 680
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 681

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 682
			int var21 = this.verticesX[var20]; // L: 683
			int var22 = this.verticesY[var20]; // L: 684
			int var23 = this.verticesZ[var20]; // L: 685
			int var24;
			if (var3 != 0) { // L: 686
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 687
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 688
				var21 = var24; // L: 689
			}

			if (var1 != 0) { // L: 691
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 692
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 693
				var22 = var24; // L: 694
			}

			if (var2 != 0) { // L: 696
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 697
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 698
				var21 = var24; // L: 699
			}

			var21 += var5; // L: 701
			var22 += var6; // L: 702
			var23 += var7; // L: 703
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 704
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 705
			field2551[var20] = var23 - var19; // L: 707
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 708
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 709
			if (this.field2522 > 0) { // L: 710
				field2574[var20] = var21; // L: 711
				field2547[var20] = var24; // L: 712
				field2575[var20] = var23; // L: 713
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 717
		} catch (Exception var26) { // L: 719
		}

	} // L: 720

	@ObfuscatedName("v")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) { // L: 922
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 923
				field2556[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 924

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
			for (var7 = 0; var7 < this.indicesCount; ++var7) { // L: 925
				if (this.faceColors3[var7] != -2) { // L: 926
					var8 = this.indices1[var7]; // L: 927
					var9 = this.indices2[var7]; // L: 928
					var10 = this.indices3[var7]; // L: 929
					var11 = modelViewportXs[var8]; // L: 930
					var12 = modelViewportXs[var9]; // L: 931
					var28 = modelViewportXs[var10]; // L: 932
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 933
						if (var2) { // L: 959
							var15 = modelViewportYs[var8]; // L: 961
							var16 = modelViewportYs[var9]; // L: 962
							var30 = modelViewportYs[var10]; // L: 963
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 965
							boolean var34;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 966
								var34 = false; // L: 967
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 970
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 971
									var34 = false; // L: 972
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 975
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 976
										var34 = false; // L: 977
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 980
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 981
											var34 = false; // L: 982
										} else {
											var34 = true; // L: 985
										}
									}
								}
							}

							if (var34) { // L: 987
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 990
								var2 = false; // L: 992
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 995
							field2548[var7] = false; // L: 996
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 997
								field2554[var7] = false; // L: 998
							} else {
								field2554[var7] = true;
							}

							var29 = (field2551[var8] + field2551[var9] + field2551[var10]) / 3 + this.radius; // L: 999
							field2557[var29][field2556[var29]++] = var7; // L: 1000
						}
					} else {
						var29 = field2574[var8]; // L: 934
						var15 = field2574[var9]; // L: 935
						var16 = field2574[var10]; // L: 936
						var30 = field2547[var8]; // L: 937
						var18 = field2547[var9]; // L: 938
						int var19 = field2547[var10]; // L: 939
						int var20 = field2575[var8]; // L: 940
						int var21 = field2575[var9]; // L: 941
						int var22 = field2575[var10]; // L: 942
						var29 -= var15; // L: 943
						var16 -= var15; // L: 944
						var30 -= var18; // L: 945
						var19 -= var18; // L: 946
						var20 -= var21; // L: 947
						var22 -= var21; // L: 948
						int var23 = var30 * var22 - var20 * var19; // L: 949
						int var24 = var20 * var16 - var29 * var22; // L: 950
						int var25 = var29 * var19 - var30 * var16; // L: 951
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 952
							field2548[var7] = true; // L: 953
							int var26 = (field2551[var8] + field2551[var9] + field2551[var10]) / 3 + this.radius; // L: 954
							field2557[var26][field2556[var26]++] = var7; // L: 955
						}
					}
				}
			}

			int[] var27;
			if (this.faceRenderPriorities == null) { // L: 1004
				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1005
					var8 = field2556[var7]; // L: 1006
					if (var8 > 0) { // L: 1007
						var27 = field2557[var7]; // L: 1008

						for (var10 = 0; var10 < var8; ++var10) { // L: 1009
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; ++var7) { // L: 1014
					field2558[var7] = 0; // L: 1015
					field2528[var7] = 0; // L: 1016
				}

				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1018
					var8 = field2556[var7]; // L: 1019
					if (var8 > 0) { // L: 1020
						var27 = field2557[var7]; // L: 1021

						for (var10 = 0; var10 < var8; ++var10) { // L: 1022
							var11 = var27[var10]; // L: 1023
							byte var33 = this.faceRenderPriorities[var11]; // L: 1024
							var28 = field2558[var33]++; // L: 1025
							field2559[var33][var28] = var11; // L: 1026
							if (var33 < 10) { // L: 1027
								int[] var10000 = field2528;
								var10000[var33] += var7;
							} else if (var33 == 10) { // L: 1028
								field2560[var28] = var7;
							} else {
								field2561[var28] = var7; // L: 1029
							}
						}
					}
				}

				var7 = 0; // L: 1033
				if (field2558[1] > 0 || field2558[2] > 0) { // L: 1034
					var7 = (field2528[1] + field2528[2]) / (field2558[1] + field2558[2]);
				}

				var8 = 0; // L: 1035
				if (field2558[3] > 0 || field2558[4] > 0) { // L: 1036
					var8 = (field2528[3] + field2528[4]) / (field2558[3] + field2558[4]);
				}

				var9 = 0; // L: 1037
				if (field2558[6] > 0 || field2558[8] > 0) { // L: 1038
					var9 = (field2528[8] + field2528[6]) / (field2558[8] + field2558[6]);
				}

				var11 = 0; // L: 1040
				var12 = field2558[10]; // L: 1041
				int[] var13 = field2559[10]; // L: 1042
				int[] var14 = field2560; // L: 1043
				if (var11 == var12) { // L: 1044
					var11 = 0; // L: 1045
					var12 = field2558[11]; // L: 1046
					var13 = field2559[11]; // L: 1047
					var14 = field2561; // L: 1048
				}

				if (var11 < var12) { // L: 1050
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1051
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1052
					while (var15 == 0 && var10 > var7) { // L: 1053
						this.drawFace(var13[var11++]); // L: 1054
						if (var11 == var12 && var13 != field2559[11]) { // L: 1055
							var11 = 0; // L: 1056
							var12 = field2558[11]; // L: 1057
							var13 = field2559[11]; // L: 1058
							var14 = field2561; // L: 1059
						}

						if (var11 < var12) { // L: 1061
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1062
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1064
						this.drawFace(var13[var11++]); // L: 1065
						if (var11 == var12 && var13 != field2559[11]) { // L: 1066
							var11 = 0; // L: 1067
							var12 = field2558[11]; // L: 1068
							var13 = field2559[11]; // L: 1069
							var14 = field2561; // L: 1070
						}

						if (var11 < var12) { // L: 1072
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1073
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1075
						this.drawFace(var13[var11++]); // L: 1076
						if (var11 == var12 && var13 != field2559[11]) { // L: 1077
							var11 = 0; // L: 1078
							var12 = field2558[11]; // L: 1079
							var13 = field2559[11]; // L: 1080
							var14 = field2561; // L: 1081
						}

						if (var11 < var12) { // L: 1083
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1084
						}
					}

					var16 = field2558[var15]; // L: 1086
					int[] var17 = field2559[var15]; // L: 1087

					for (var18 = 0; var18 < var16; ++var18) { // L: 1088
						this.drawFace(var17[var18]); // L: 1089
					}
				}

				while (var10 != -1000) { // L: 1092
					this.drawFace(var13[var11++]); // L: 1093
					if (var11 == var12 && var13 != field2559[11]) { // L: 1094
						var11 = 0; // L: 1095
						var13 = field2559[11]; // L: 1096
						var12 = field2558[11]; // L: 1097
						var14 = field2561; // L: 1098
					}

					if (var11 < var12) { // L: 1100
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1101
					}
				}

			}
		}
	} // L: 1012 1103

	@ObfuscatedName("ag")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2548[var1]) { // L: 1106
			this.method4544(var1); // L: 1107
		} else {
			int var2 = this.indices1[var1]; // L: 1110
			int var3 = this.indices2[var1]; // L: 1111
			int var4 = this.indices3[var1]; // L: 1112
			Rasterizer3D.field2365 = field2554[var1]; // L: 1113
			if (this.faceAlphas == null) { // L: 1114
				Rasterizer3D.Rasterizer3D_alpha = 0;
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1115
			}

			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1116
				int var5;
				int var6;
				int var7;
				if (this.field2566 != null && this.field2566[var1] != -1) { // L: 1124
					int var8 = this.field2566[var1] & 255; // L: 1125
					var5 = this.field2529[var8]; // L: 1126
					var6 = this.field2530[var8]; // L: 1127
					var7 = this.field2538[var8]; // L: 1128
				} else {
					var5 = var2; // L: 1131
					var6 = var3; // L: 1132
					var7 = var4; // L: 1133
				}

				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method4215(modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2574[var5], field2574[var6], field2574[var7], field2547[var5], field2547[var6], field2547[var7], field2575[var5], field2575[var6], field2575[var7], this.faceTextures[var1]); // L: 1135
				} else {
					Rasterizer3D.method4215(modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1], field2574[var5], field2574[var6], field2574[var7], field2547[var5], field2547[var6], field2547[var7], field2575[var5], field2575[var6], field2575[var7], this.faceTextures[var1]); // L: 1136
				}
			} else if (this.faceColors3[var1] == -1) { // L: 1117
				Rasterizer3D.method4213(modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2540[this.faceColors1[var1]]);
			} else {
				Rasterizer3D.method4211(modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1118
			}

		}
	} // L: 1108 1138

	@ObfuscatedName("ae")
	final void method4544(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1141
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1142
		int var4 = 0; // L: 1143
		int var5 = this.indices1[var1]; // L: 1144
		int var6 = this.indices2[var1]; // L: 1145
		int var7 = this.indices3[var1]; // L: 1146
		int var8 = field2575[var5]; // L: 1147
		int var9 = field2575[var6]; // L: 1148
		int var10 = field2575[var7]; // L: 1149
		if (this.faceAlphas == null) { // L: 1150
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1151
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1152
			field2563[var4] = modelViewportXs[var5]; // L: 1153
			field2564[var4] = modelViewportYs[var5]; // L: 1154
			field2521[var4++] = this.faceColors1[var1]; // L: 1155
		} else {
			var11 = field2574[var5]; // L: 1158
			var12 = field2547[var5]; // L: 1159
			var13 = this.faceColors1[var1]; // L: 1160
			if (var10 >= 50) { // L: 1161
				var14 = field2508[var10 - var8] * (50 - var8); // L: 1162
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var7] - var11) * var14 >> 16)) / 50; // L: 1163
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var7] - var12) * var14 >> 16)) / 50; // L: 1164
				field2521[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1165
			}

			if (var9 >= 50) { // L: 1167
				var14 = field2508[var9 - var8] * (50 - var8); // L: 1168
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var6] - var11) * var14 >> 16)) / 50; // L: 1169
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var6] - var12) * var14 >> 16)) / 50; // L: 1170
				field2521[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1171
			}
		}

		if (var9 >= 50) { // L: 1174
			field2563[var4] = modelViewportXs[var6]; // L: 1175
			field2564[var4] = modelViewportYs[var6]; // L: 1176
			field2521[var4++] = this.faceColors2[var1]; // L: 1177
		} else {
			var11 = field2574[var6]; // L: 1180
			var12 = field2547[var6]; // L: 1181
			var13 = this.faceColors2[var1]; // L: 1182
			if (var8 >= 50) { // L: 1183
				var14 = field2508[var8 - var9] * (50 - var9); // L: 1184
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var5] - var11) * var14 >> 16)) / 50; // L: 1185
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var5] - var12) * var14 >> 16)) / 50; // L: 1186
				field2521[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1187
			}

			if (var10 >= 50) { // L: 1189
				var14 = field2508[var10 - var9] * (50 - var9); // L: 1190
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var7] - var11) * var14 >> 16)) / 50; // L: 1191
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var7] - var12) * var14 >> 16)) / 50; // L: 1192
				field2521[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1193
			}
		}

		if (var10 >= 50) { // L: 1196
			field2563[var4] = modelViewportXs[var7]; // L: 1197
			field2564[var4] = modelViewportYs[var7]; // L: 1198
			field2521[var4++] = this.faceColors3[var1]; // L: 1199
		} else {
			var11 = field2574[var7]; // L: 1202
			var12 = field2547[var7]; // L: 1203
			var13 = this.faceColors3[var1]; // L: 1204
			if (var9 >= 50) { // L: 1205
				var14 = field2508[var9 - var10] * (50 - var10); // L: 1206
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var6] - var11) * var14 >> 16)) / 50; // L: 1207
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var6] - var12) * var14 >> 16)) / 50; // L: 1208
				field2521[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1209
			}

			if (var8 >= 50) { // L: 1211
				var14 = field2508[var8 - var10] * (50 - var10); // L: 1212
				field2563[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2574[var5] - var11) * var14 >> 16)) / 50; // L: 1213
				field2564[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var5] - var12) * var14 >> 16)) / 50; // L: 1214
				field2521[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1215
			}
		}

		var11 = field2563[0]; // L: 1218
		var12 = field2563[1]; // L: 1219
		var13 = field2563[2]; // L: 1220
		var14 = field2564[0]; // L: 1221
		int var15 = field2564[1]; // L: 1222
		int var16 = field2564[2]; // L: 1223
		Rasterizer3D.field2365 = false; // L: 1224
		int var17;
		int var18;
		int var19;
		int var20;
		if (var4 == 3) { // L: 1225
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1226
				Rasterizer3D.field2365 = true;
			}

			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1227
				if (this.field2566 != null && this.field2566[var1] != -1) { // L: 1235
					var20 = this.field2566[var1] & 255; // L: 1236
					var17 = this.field2529[var20]; // L: 1237
					var18 = this.field2530[var20]; // L: 1238
					var19 = this.field2538[var20]; // L: 1239
				} else {
					var17 = var5; // L: 1242
					var18 = var6; // L: 1243
					var19 = var7; // L: 1244
				}

				if (this.faceColors3[var1] == -1) { // L: 1246
					Rasterizer3D.method4215(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], this.faceTextures[var1]);
				} else {
					Rasterizer3D.method4215(var14, var15, var16, var11, var12, var13, field2521[0], field2521[1], field2521[2], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], this.faceTextures[var1]); // L: 1247
				}
			} else if (this.faceColors3[var1] == -1) { // L: 1228
				Rasterizer3D.method4213(var14, var15, var16, var11, var12, var13, field2540[this.faceColors1[var1]]);
			} else {
				Rasterizer3D.method4211(var14, var15, var16, var11, var12, var13, field2521[0], field2521[1], field2521[2]); // L: 1229
			}
		}

		if (var4 == 4) { // L: 1250
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2563[3] < 0 || field2563[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1251
				Rasterizer3D.field2365 = true;
			}

			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1252
				if (this.field2566 != null && this.field2566[var1] != -1) { // L: 1267
					var20 = this.field2566[var1] & 255; // L: 1268
					var17 = this.field2529[var20]; // L: 1269
					var18 = this.field2530[var20]; // L: 1270
					var19 = this.field2538[var20]; // L: 1271
				} else {
					var17 = var5; // L: 1274
					var18 = var6; // L: 1275
					var19 = var7; // L: 1276
				}

				short var21 = this.faceTextures[var1]; // L: 1278
				if (this.faceColors3[var1] == -1) { // L: 1279
					Rasterizer3D.method4215(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], var21); // L: 1280
					Rasterizer3D.method4215(var14, var16, field2564[3], var11, var13, field2563[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], var21); // L: 1281
				} else {
					Rasterizer3D.method4215(var14, var15, var16, var11, var12, var13, field2521[0], field2521[1], field2521[2], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], var21); // L: 1284
					Rasterizer3D.method4215(var14, var16, field2564[3], var11, var13, field2563[3], field2521[0], field2521[2], field2521[3], field2574[var17], field2574[var18], field2574[var19], field2547[var17], field2547[var18], field2547[var19], field2575[var17], field2575[var18], field2575[var19], var21); // L: 1285
				}
			} else if (this.faceColors3[var1] == -1) { // L: 1253
				var17 = field2540[this.faceColors1[var1]]; // L: 1254
				Rasterizer3D.method4213(var14, var15, var16, var11, var12, var13, var17); // L: 1255
				Rasterizer3D.method4213(var14, var16, field2564[3], var11, var13, field2563[3], var17); // L: 1256
			} else {
				Rasterizer3D.method4211(var14, var15, var16, var11, var12, var13, field2521[0], field2521[1], field2521[2]); // L: 1259
				Rasterizer3D.method4211(var14, var16, field2564[3], var11, var13, field2563[3], field2521[0], field2521[2], field2521[3]); // L: 1260
			}
		}

	} // L: 1289

	@ObfuscatedName("cl")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2556[0] = -1; // L: 723
		if (this.boundsType != 1) { // L: 724
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1); // L: 725
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 726
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 727
		int var13 = var3 * this.xzRadius >> 16; // L: 728
		int var14 = var12 + var13; // L: 729
		if (var14 > 50 && var12 < 3500) { // L: 730
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 731
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 732
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) { // L: 733
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 734
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) { // L: 735
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 736
					int var19 = var2 * this.xzRadius >> 16; // L: 737
					int var20 = (var18 + var19) * Rasterizer3D.Rasterizer3D_zoom; // L: 738
					if (var20 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) { // L: 739
						int var21 = (var3 * super.height >> 16) + var19; // L: 740
						int var22 = (var18 - var21) * Rasterizer3D.Rasterizer3D_zoom; // L: 741
						if (var22 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) { // L: 742
							int var23 = var13 + (var2 * super.height >> 16); // L: 743
							boolean var24 = false; // L: 744
							boolean var25 = false; // L: 745
							if (var12 - var23 <= 50) { // L: 746
								var25 = true;
							}

							boolean var26 = var25 || this.field2522 > 0; // L: 747
							int var27 = ViewportMouse.ViewportMouse_x; // L: 750
							int var29 = ParamComposition.method3229(); // L: 753
							boolean var30 = class176.method3531(); // L: 754
							boolean var31 = ItemLayer.method4106(var9); // L: 755
							boolean var32 = false; // L: 756
							int var36;
							int var37;
							int var38;
							int var39;
							int var47;
							int var53;
							int var54;
							int var55;
							if (var31 && var30) { // L: 757
								boolean var33 = false; // L: 758
								if (field2576) { // L: 759
									boolean var34;
									if (!class176.method3531()) { // L: 763
										var34 = false; // L: 764
									} else {
										int var42;
										int var43;
										int var44;
										if (!ViewportMouse.ViewportMouse_false0) { // L: 768
											var36 = Scene.Scene_cameraPitchSine; // L: 769
											var37 = Scene.Scene_cameraPitchCosine; // L: 770
											var38 = Scene.Scene_cameraYawSine; // L: 771
											var39 = Scene.Scene_cameraYawCosine; // L: 772
											byte var40 = 50; // L: 773
											short var41 = 3500; // L: 774
											var42 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var40 / Rasterizer3D.Rasterizer3D_zoom; // L: 775
											var43 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var40 / Rasterizer3D.Rasterizer3D_zoom; // L: 776
											var44 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var41 / Rasterizer3D.Rasterizer3D_zoom; // L: 777
											int var45 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var41 / Rasterizer3D.Rasterizer3D_zoom; // L: 778
											int var46 = Rasterizer3D.method4224(var43, var40, var37, var36); // L: 780
											var54 = Rasterizer3D.method4225(var43, var40, var37, var36); // L: 781
											var43 = var46; // L: 782
											var46 = Rasterizer3D.method4224(var45, var41, var37, var36); // L: 783
											var55 = Rasterizer3D.method4225(var45, var41, var37, var36); // L: 784
											var45 = var46; // L: 785
											var46 = Rasterizer3D.method4222(var42, var54, var39, var38); // L: 786
											var54 = Rasterizer3D.method4223(var42, var54, var39, var38); // L: 787
											var42 = var46; // L: 788
											var46 = Rasterizer3D.method4222(var44, var55, var39, var38); // L: 789
											var55 = Rasterizer3D.method4223(var44, var55, var39, var38); // L: 790
											ViewportMouse.field2582 = (var46 + var42) / 2; // L: 792
											ViewportMouse.field2579 = (var45 + var43) / 2; // L: 793
											class157.field1675 = (var54 + var55) / 2; // L: 794
											ViewportMouse.field2584 = (var46 - var42) / 2; // L: 795
											class361.field4050 = (var45 - var43) / 2; // L: 796
											ViewportMouse.field2590 = (var55 - var54) / 2; // L: 797
											FriendLoginUpdate.field3943 = Math.abs(ViewportMouse.field2584); // L: 798
											class120.field1403 = Math.abs(class361.field4050); // L: 799
											class131.field1485 = Math.abs(ViewportMouse.field2590); // L: 800
										}

										var36 = this.xMid + var6; // L: 802
										var37 = var7 + this.yMid; // L: 803
										var38 = var8 + this.zMid; // L: 804
										var39 = this.xMidOffset; // L: 805
										var54 = this.yMidOffset; // L: 806
										var55 = this.zMidOffset; // L: 807
										var42 = ViewportMouse.field2582 - var36; // L: 808
										var43 = ViewportMouse.field2579 - var37; // L: 809
										var44 = class157.field1675 - var38; // L: 810
										if (Math.abs(var42) > var39 + FriendLoginUpdate.field3943) { // L: 811
											var34 = false; // L: 812
										} else if (Math.abs(var43) > var54 + class120.field1403) { // L: 815
											var34 = false; // L: 816
										} else if (Math.abs(var44) > var55 + class131.field1485) { // L: 819
											var34 = false; // L: 820
										} else if (Math.abs(var44 * class361.field4050 - var43 * ViewportMouse.field2590) > var55 * class120.field1403 + var54 * class131.field1485) { // L: 823
											var34 = false; // L: 824
										} else if (Math.abs(var42 * ViewportMouse.field2590 - var44 * ViewportMouse.field2584) > var55 * FriendLoginUpdate.field3943 + var39 * class131.field1485) { // L: 827
											var34 = false; // L: 828
										} else if (Math.abs(var43 * ViewportMouse.field2584 - var42 * class361.field4050) > var39 * class120.field1403 + var54 * FriendLoginUpdate.field3943) { // L: 831
											var34 = false; // L: 832
										} else {
											var34 = true; // L: 835
										}
									}

									var33 = var34; // L: 837
								} else {
									var53 = var12 - var13; // L: 840
									if (var53 <= 50) { // L: 841
										var53 = 50;
									}

									if (var15 > 0) { // L: 842
										var16 /= var14; // L: 843
										var17 /= var53; // L: 844
									} else {
										var17 /= var14; // L: 847
										var16 /= var53; // L: 848
									}

									if (var18 > 0) { // L: 850
										var22 /= var14; // L: 851
										var20 /= var53; // L: 852
									} else {
										var20 /= var14; // L: 855
										var22 /= var53; // L: 856
									}

									var47 = var27 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 858
									var36 = var29 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 859
									if (var47 > var16 && var47 < var17 && var36 > var22 && var36 < var20) { // L: 860
										var33 = true; // L: 861
									}
								}

								if (var33) { // L: 864
									if (this.isSingleTile) { // L: 865
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 868
									} else {
										var32 = true; // L: 871
									}
								}
							}

							int var52 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 874
							var53 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 875
							var47 = 0; // L: 876
							var36 = 0; // L: 877
							if (var1 != 0) { // L: 878
								var47 = Model_sine[var1]; // L: 879
								var36 = Model_cosine[var1]; // L: 880
							}

							for (var37 = 0; var37 < this.verticesCount; ++var37) { // L: 882
								var38 = this.verticesX[var37]; // L: 883
								var39 = this.verticesY[var37]; // L: 884
								var54 = this.verticesZ[var37]; // L: 885
								if (var1 != 0) { // L: 886
									var55 = var54 * var47 + var38 * var36 >> 16; // L: 887
									var54 = var54 * var36 - var38 * var47 >> 16; // L: 888
									var38 = var55; // L: 889
								}

								var38 += var6; // L: 891
								var39 += var7; // L: 892
								var54 += var8; // L: 893
								var55 = var54 * var4 + var5 * var38 >> 16; // L: 894
								var54 = var5 * var54 - var38 * var4 >> 16; // L: 895
								var38 = var55; // L: 896
								var55 = var3 * var39 - var54 * var2 >> 16; // L: 897
								var54 = var39 * var2 + var3 * var54 >> 16; // L: 898
								field2551[var37] = var54 - var12; // L: 900
								if (var54 >= 50) { // L: 901
									modelViewportXs[var37] = var38 * Rasterizer3D.Rasterizer3D_zoom / var54 + var52; // L: 902
									modelViewportYs[var37] = var55 * Rasterizer3D.Rasterizer3D_zoom / var54 + var53; // L: 903
								} else {
									modelViewportXs[var37] = -5000; // L: 906
									var24 = true; // L: 907
								}

								if (var26) { // L: 909
									field2574[var37] = var38; // L: 910
									field2547[var37] = var55; // L: 911
									field2575[var37] = var54; // L: 912
								}
							}

							try {
								this.draw0(var24, var32, this.isSingleTile, var9); // L: 916
							} catch (Exception var51) { // L: 918
							}

						}
					}
				}
			}
		}
	} // L: 919
}
