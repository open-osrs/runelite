import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("o")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("g")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static class387 field2498;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static class387 field2499;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static class387 field2505;
	@ObfuscatedName("am")
	static boolean[] field2538;
	@ObfuscatedName("al")
	static boolean[] field2539;
	@ObfuscatedName("ak")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("az")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ag")
	static int[] field2542;
	@ObfuscatedName("af")
	static int[] field2543;
	@ObfuscatedName("ap")
	static int[] field2547;
	@ObfuscatedName("ai")
	static int[] field2545;
	@ObfuscatedName("bz")
	static int[] field2555;
	@ObfuscatedName("bl")
	static int[][] field2548;
	@ObfuscatedName("be")
	static int[] field2521;
	@ObfuscatedName("bt")
	static int[][] field2525;
	@ObfuscatedName("ba")
	static int[] field2526;
	@ObfuscatedName("bg")
	static int[] field2552;
	@ObfuscatedName("bq")
	static int[] field2567;
	@ObfuscatedName("br")
	static int[] field2509;
	@ObfuscatedName("bc")
	static int[] field2529;
	@ObfuscatedName("bd")
	static int[] field2556;
	@ObfuscatedName("bf")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("by")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bu")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bp")
	static boolean field2560;
	@ObfuscatedName("bs")
	@Export("Model_sine")
	static int[] Model_sine;
	@ObfuscatedName("bx")
	@Export("Model_cosine")
	static int[] Model_cosine;
	@ObfuscatedName("bo")
	@Export("Model_colorPalette")
	static int[] Model_colorPalette;
	@ObfuscatedName("bi")
	static int[] field2553;
	@ObfuscatedName("f")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("u")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("r")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("k")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("x")
	@Export("indicesCount")
	int indicesCount;
	@ObfuscatedName("c")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("j")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("p")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("s")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("b")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("w")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("a")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("m")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("q")
	byte[] field2514;
	@ObfuscatedName("y")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("z")
	byte field2546;
	@ObfuscatedName("e")
	int field2517;
	@ObfuscatedName("t")
	int[] field2541;
	@ObfuscatedName("i")
	int[] field2519;
	@ObfuscatedName("ac")
	int[] field2520;
	@ObfuscatedName("ax")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ay")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("au")
	int[][] field2523;
	@ObfuscatedName("at")
	int[][] field2524;
	@ObfuscatedName("aw")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ar")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("ae")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ab")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("aa")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ad")
	@Export("radius")
	int radius;
	@ObfuscatedName("aj")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("as")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ao")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("av")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aq")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("an")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bn")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bw")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bh")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cd")
	@Export("overrideAmount")
	public byte overrideAmount;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2498 = new class387(); // L: 15
		field2499 = new class387(); // L: 16
		field2505 = new class387(); // L: 17
		field2538 = new boolean[6500]; // L: 55
		field2539 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2542 = new int[6500]; // L: 59
		field2543 = new int[6500]; // L: 60
		field2547 = new int[6500]; // L: 61
		field2545 = new int[6500]; // L: 62
		field2555 = new int[1600]; // L: 64
		field2548 = new int[1600][512]; // L: 65
		field2521 = new int[12]; // L: 66
		field2525 = new int[12][2000]; // L: 67
		field2526 = new int[2000]; // L: 68
		field2552 = new int[2000]; // L: 69
		field2567 = new int[12]; // L: 70
		field2509 = new int[10]; // L: 71
		field2529 = new int[10]; // L: 72
		field2556 = new int[10]; // L: 73
		field2560 = true; // L: 77
		Model_sine = Rasterizer3D.Rasterizer3D_sine; // L: 80
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine; // L: 81
		Model_colorPalette = Rasterizer3D.Rasterizer3D_colorPalette; // L: 82
		field2553 = Rasterizer3D.field2346; // L: 83
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2546 = 0;
		this.field2517 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 91

	@ObfuscatedSignature(
		descriptor = "([Lhx;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2546 = 0; // L: 33
		this.field2517 = 0; // L: 34
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
		this.field2517 = 0; // L: 100
		this.field2546 = -1; // L: 101

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 102
			var8 = var1[var7]; // L: 103
			if (var8 != null) { // L: 104
				this.verticesCount += var8.verticesCount; // L: 105
				this.indicesCount += var8.indicesCount; // L: 106
				this.field2517 += var8.field2517; // L: 107
				if (var8.faceRenderPriorities != null) { // L: 108
					var3 = true;
				} else {
					if (this.field2546 == -1) { // L: 110
						this.field2546 = var8.field2546;
					}

					if (this.field2546 != var8.field2546) { // L: 111
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 113
				var5 |= var8.faceTextures != null; // L: 114
				var6 |= var8.field2514 != null; // L: 115
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
			this.field2514 = new byte[this.indicesCount];
		}

		if (this.field2517 > 0) { // L: 131
			this.field2541 = new int[this.field2517]; // L: 132
			this.field2519 = new int[this.field2517]; // L: 133
			this.field2520 = new int[this.field2517]; // L: 134
		}

		this.verticesCount = 0; // L: 136
		this.indicesCount = 0; // L: 137
		this.field2517 = 0; // L: 138

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2546; // L: 151
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
						if (var8.field2514 != null && var8.field2514[var9] != -1) { // L: 161
							this.field2514[this.indicesCount] = (byte)(this.field2517 + var8.field2514[var9]);
						} else {
							this.field2514[this.indicesCount] = -1; // L: 162
						}
					}

					++this.indicesCount; // L: 164
				}

				for (var9 = 0; var9 < var8.field2517; ++var9) { // L: 166
					this.field2541[this.field2517] = this.verticesCount + var8.field2541[var9]; // L: 167
					this.field2519[this.field2517] = this.verticesCount + var8.field2519[var9]; // L: 168
					this.field2520[this.field2517] = this.verticesCount + var8.field2520[var9]; // L: 169
					++this.field2517; // L: 170
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhx;"
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
					var11.field2517 = this.field2517; // L: 199
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
					var11.field2514 = this.field2514; // L: 210
					var11.faceTextures = this.faceTextures; // L: 211
					var11.field2546 = this.field2546; // L: 212
					var11.field2541 = this.field2541; // L: 213
					var11.field2519 = this.field2519; // L: 214
					var11.field2520 = this.field2520; // L: 215
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhx;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 260
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 261
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhx;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 265
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 266
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZLhx;[B)Lhx;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 270
		var2.indicesCount = this.indicesCount; // L: 271
		var2.field2517 = this.field2517; // L: 272
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
		var2.field2514 = this.field2514; // L: 300
		var2.faceTextures = this.faceTextures; // L: 301
		var2.field2546 = this.field2546; // L: 302
		var2.field2541 = this.field2541; // L: 303
		var2.field2519 = this.field2519; // L: 304
		var2.field2520 = this.field2520; // L: 305
		var2.vertexLabels = this.vertexLabels; // L: 306
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 307
		var2.field2523 = this.field2523; // L: 308
		var2.field2524 = this.field2524; // L: 309
		var2.isSingleTile = this.isSingleTile; // L: 310
		var2.resetBounds(); // L: 311
		var2.overrideAmount = 0; // L: 312
		return var2; // L: 313
	}

	@ObfuscatedName("f")
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
				int var11 = Rasterizer3D.method4080(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 327
				int var12 = this.verticesY[var10]; // L: 328
				int var13 = Rasterizer3D.method3993(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 329
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

	@ObfuscatedName("u")
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

	@ObfuscatedName("r")
	void method4359() {
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

	@ObfuscatedName("k")
	public int method4360() {
		this.calculateBoundsCylinder(); // L: 390
		return this.xzRadius; // L: 391
	}

	@ObfuscatedName("x")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 395
		this.xMidOffset = -1; // L: 396
	} // L: 397

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V"
	)
	public void method4363(class122 var1, int var2) {
		Skeleton var3 = var1.field1485; // L: 415
		class202 var4 = var3.method4120(); // L: 416
		if (var4 != null) { // L: 417
			var3.method4120().method4106(var1, var2); // L: 418
			this.method4365(var3.method4120(), var1.method2783()); // L: 419
		}

		if (var1.method2784()) { // L: 421
			this.method4364(var1, var2); // L: 422
		}

		this.resetBounds(); // L: 424
	} // L: 425

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V"
	)
	void method4364(class122 var1, int var2) {
		Skeleton var3 = var1.field1485; // L: 428

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 429
			int var5 = var3.transformTypes[var4]; // L: 430
			if (var5 == 5 && var1.field1480 != null && var1.field1480[var4] != null && var1.field1480[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 431 432
				class117 var6 = var1.field1480[var4][0]; // L: 433
				int[] var7 = var3.labels[var4]; // L: 434
				int var8 = var7.length; // L: 435

				for (int var9 = 0; var9 < var8; ++var9) { // L: 436
					int var10 = var7[var9]; // L: 437
					if (var10 < this.faceLabelsAlpha.length) { // L: 438
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 439

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 440
							int var13 = var11[var12]; // L: 441
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2700(var2) * 255.0F); // L: 442
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgl;I)V"
	)
	void method4365(class202 var1, int var2) {
		this.method4381(var1, var2); // L: 456
	} // L: 458

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgo;ILgo;I[I)V"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I[ZZ)V"
	)
	public void method4367(class122 var1, int var2, boolean[] var3, boolean var4) {
		Skeleton var5 = var1.field1485; // L: 493
		class202 var6 = var5.method4120(); // L: 494
		if (var6 != null) { // L: 495
			var6.method4116(var1, var2, var3, var4); // L: 496
			this.method4365(var6, var1.method2783()); // L: 497
		}

		if (var1.method2784()) { // L: 499
			this.method4364(var1, var2); // L: 500
		}

	} // L: 502

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I[IZ)V"
	)
	public void method4368(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("m")
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

	@ObfuscatedName("q")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 659
			int var2 = this.verticesX[var1]; // L: 660
			this.verticesX[var1] = this.verticesZ[var1]; // L: 661
			this.verticesZ[var1] = -var2; // L: 662
		}

		this.resetBounds(); // L: 664
	} // L: 665

	@ObfuscatedName("y")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 668
			this.verticesX[var1] = -this.verticesX[var1]; // L: 669
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 670
		}

		this.resetBounds(); // L: 672
	} // L: 673

	@ObfuscatedName("z")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 676
			int var2 = this.verticesZ[var1]; // L: 677
			this.verticesZ[var1] = this.verticesX[var1]; // L: 678
			this.verticesX[var1] = -var2; // L: 679
		}

		this.resetBounds(); // L: 681
	} // L: 682

	@ObfuscatedName("e")
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

	@ObfuscatedName("t")
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

	@ObfuscatedName("i")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 705
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 706
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 707
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 708
		}

		this.resetBounds(); // L: 710
	} // L: 711

	@ObfuscatedName("ac")
	public final void method4376(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2555[0] = -1; // L: 714
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 715
			this.method4359();
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
			field2542[var19] = var22 - var18; // L: 752
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 753
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 754
			if (this.field2517 > 0) { // L: 755
				field2543[var19] = var20; // L: 756
				field2547[var19] = var23; // L: 757
				field2545[var19] = var22; // L: 758
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 762
		} catch (Exception var25) { // L: 764
		}

	} // L: 765

	@ObfuscatedName("ax")
	public final void method4366(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2555[0] = -1; // L: 768
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 769
			this.method4359();
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
			field2542[var20] = var23 - var19; // L: 806
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 807
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 808
			if (this.field2517 > 0) { // L: 809
				field2543[var20] = var21; // L: 810
				field2547[var20] = var24; // L: 811
				field2545[var20] = var23; // L: 812
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 816
		} catch (Exception var26) { // L: 818
		}

	} // L: 819

	@ObfuscatedName("ay")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) { // L: 945
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 946
				field2555[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 947

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
			for (var7 = 0; var7 < this.indicesCount; ++var7) { // L: 948
				if (this.faceColors3[var7] != -2) { // L: 949
					var8 = this.indices1[var7]; // L: 950
					var9 = this.indices2[var7]; // L: 951
					var10 = this.indices3[var7]; // L: 952
					var11 = modelViewportXs[var8]; // L: 953
					var12 = modelViewportXs[var9]; // L: 954
					var28 = modelViewportXs[var10]; // L: 955
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 956
						if (var2) { // L: 982
							var15 = modelViewportYs[var8]; // L: 984
							var16 = modelViewportYs[var9]; // L: 985
							var30 = modelViewportYs[var10]; // L: 986
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 988
							boolean var34;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 989
								var34 = false; // L: 990
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 993
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 994
									var34 = false; // L: 995
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 998
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 999
										var34 = false; // L: 1000
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1003
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1004
											var34 = false; // L: 1005
										} else {
											var34 = true; // L: 1008
										}
									}
								}
							}

							if (var34) { // L: 1010
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1013
								var2 = false; // L: 1015
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1018
							field2539[var7] = false; // L: 1019
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1020
								field2538[var7] = false; // L: 1021
							} else {
								field2538[var7] = true;
							}

							var29 = (field2542[var8] + field2542[var9] + field2542[var10]) / 3 + this.radius; // L: 1022
							field2548[var29][field2555[var29]++] = var7; // L: 1023
						}
					} else {
						var29 = field2543[var8]; // L: 957
						var15 = field2543[var9]; // L: 958
						var16 = field2543[var10]; // L: 959
						var30 = field2547[var8]; // L: 960
						var18 = field2547[var9]; // L: 961
						int var19 = field2547[var10]; // L: 962
						int var20 = field2545[var8]; // L: 963
						int var21 = field2545[var9]; // L: 964
						int var22 = field2545[var10]; // L: 965
						var29 -= var15; // L: 966
						var16 -= var15; // L: 967
						var30 -= var18; // L: 968
						var19 -= var18; // L: 969
						var20 -= var21; // L: 970
						var22 -= var21; // L: 971
						int var23 = var30 * var22 - var20 * var19; // L: 972
						int var24 = var20 * var16 - var29 * var22; // L: 973
						int var25 = var29 * var19 - var30 * var16; // L: 974
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 975
							field2539[var7] = true; // L: 976
							int var26 = (field2542[var8] + field2542[var9] + field2542[var10]) / 3 + this.radius; // L: 977
							field2548[var26][field2555[var26]++] = var7; // L: 978
						}
					}
				}
			}

			int[] var27;
			if (this.faceRenderPriorities == null) { // L: 1027
				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1028
					var8 = field2555[var7]; // L: 1029
					if (var8 > 0) { // L: 1030
						var27 = field2548[var7]; // L: 1031

						for (var10 = 0; var10 < var8; ++var10) { // L: 1032
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; ++var7) { // L: 1037
					field2521[var7] = 0; // L: 1038
					field2567[var7] = 0; // L: 1039
				}

				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1041
					var8 = field2555[var7]; // L: 1042
					if (var8 > 0) { // L: 1043
						var27 = field2548[var7]; // L: 1044

						for (var10 = 0; var10 < var8; ++var10) { // L: 1045
							var11 = var27[var10]; // L: 1046
							byte var33 = this.faceRenderPriorities[var11]; // L: 1047
							var28 = field2521[var33]++; // L: 1048
							field2525[var33][var28] = var11; // L: 1049
							if (var33 < 10) { // L: 1050
								int[] var10000 = field2567;
								var10000[var33] += var7;
							} else if (var33 == 10) { // L: 1051
								field2526[var28] = var7;
							} else {
								field2552[var28] = var7; // L: 1052
							}
						}
					}
				}

				var7 = 0; // L: 1056
				if (field2521[1] > 0 || field2521[2] > 0) { // L: 1057
					var7 = (field2567[1] + field2567[2]) / (field2521[1] + field2521[2]);
				}

				var8 = 0; // L: 1058
				if (field2521[3] > 0 || field2521[4] > 0) { // L: 1059
					var8 = (field2567[3] + field2567[4]) / (field2521[3] + field2521[4]);
				}

				var9 = 0; // L: 1060
				if (field2521[6] > 0 || field2521[8] > 0) { // L: 1061
					var9 = (field2567[8] + field2567[6]) / (field2521[8] + field2521[6]);
				}

				var11 = 0; // L: 1063
				var12 = field2521[10]; // L: 1064
				int[] var13 = field2525[10]; // L: 1065
				int[] var14 = field2526; // L: 1066
				if (var11 == var12) { // L: 1067
					var11 = 0; // L: 1068
					var12 = field2521[11]; // L: 1069
					var13 = field2525[11]; // L: 1070
					var14 = field2552; // L: 1071
				}

				if (var11 < var12) { // L: 1073
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1074
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1075
					while (var15 == 0 && var10 > var7) { // L: 1076
						this.drawFace(var13[var11++]); // L: 1077
						if (var11 == var12 && var13 != field2525[11]) { // L: 1078
							var11 = 0; // L: 1079
							var12 = field2521[11]; // L: 1080
							var13 = field2525[11]; // L: 1081
							var14 = field2552; // L: 1082
						}

						if (var11 < var12) { // L: 1084
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1085
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1087
						this.drawFace(var13[var11++]); // L: 1088
						if (var11 == var12 && var13 != field2525[11]) { // L: 1089
							var11 = 0; // L: 1090
							var12 = field2521[11]; // L: 1091
							var13 = field2525[11]; // L: 1092
							var14 = field2552; // L: 1093
						}

						if (var11 < var12) { // L: 1095
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1096
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1098
						this.drawFace(var13[var11++]); // L: 1099
						if (var11 == var12 && var13 != field2525[11]) { // L: 1100
							var11 = 0; // L: 1101
							var12 = field2521[11]; // L: 1102
							var13 = field2525[11]; // L: 1103
							var14 = field2552; // L: 1104
						}

						if (var11 < var12) { // L: 1106
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1107
						}
					}

					var16 = field2521[var15]; // L: 1109
					int[] var17 = field2525[var15]; // L: 1110

					for (var18 = 0; var18 < var16; ++var18) { // L: 1111
						this.drawFace(var17[var18]); // L: 1112
					}
				}

				while (var10 != -1000) { // L: 1115
					this.drawFace(var13[var11++]); // L: 1116
					if (var11 == var12 && var13 != field2525[11]) { // L: 1117
						var11 = 0; // L: 1118
						var13 = field2525[11]; // L: 1119
						var12 = field2521[11]; // L: 1120
						var14 = field2552; // L: 1121
					}

					if (var11 < var12) { // L: 1123
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1124
					}
				}

			}
		}
	} // L: 1035 1126

	@ObfuscatedName("au")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2539[var1]) { // L: 1129
			this.method4412(var1); // L: 1130
		} else {
			int var2 = this.indices1[var1]; // L: 1133
			int var3 = this.indices2[var1]; // L: 1134
			int var4 = this.indices3[var1]; // L: 1135
			Rasterizer3D.field2334 = field2538[var1]; // L: 1136
			if (this.faceAlphas == null) { // L: 1137
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1138
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1141
			}

			this.method4413(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1143
		}
	} // L: 1131 1144

	@ObfuscatedName("at")
	final void method4413(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1147
			int var11;
			int var12;
			int var13;
			if (this.field2514 != null && this.field2514[var1] != -1) { // L: 1165
				int var14 = this.field2514[var1] & 255; // L: 1166
				var11 = this.field2541[var14]; // L: 1167
				var12 = this.field2519[var14]; // L: 1168
				var13 = this.field2520[var14]; // L: 1169
			} else {
				var11 = this.indices1[var1]; // L: 1172
				var12 = this.indices2[var1]; // L: 1173
				var13 = this.indices3[var1]; // L: 1174
			}

			if (this.faceColors3[var1] == -1) { // L: 1176
				Rasterizer3D.method4010(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2543[var11], field2543[var12], field2543[var13], field2547[var11], field2547[var12], field2547[var13], field2545[var11], field2545[var12], field2545[var13], this.faceTextures[var1]); // L: 1177
			} else {
				Rasterizer3D.method4010(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2543[var11], field2543[var12], field2543[var13], field2547[var11], field2547[var12], field2547[var13], field2545[var11], field2545[var12], field2545[var13], this.faceTextures[var1]); // L: 1180
			}
		} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1148
			Rasterizer3D.method4008(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1149
		} else if (this.faceColors3[var1] == -1) { // L: 1151
			Rasterizer3D.method4007(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]]); // L: 1152
		} else if (this.overrideAmount > 0) { // L: 1154
			Rasterizer3D.method4084(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1155
		} else {
			Rasterizer3D.method4003(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1158
		}

	} // L: 1183

	@ObfuscatedName("aw")
	final void method4412(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1186
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1187
		int var4 = 0; // L: 1188
		int var5 = this.indices1[var1]; // L: 1189
		int var6 = this.indices2[var1]; // L: 1190
		int var7 = this.indices3[var1]; // L: 1191
		int var8 = field2545[var5]; // L: 1192
		int var9 = field2545[var6]; // L: 1193
		int var10 = field2545[var7]; // L: 1194
		if (this.faceAlphas == null) { // L: 1195
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1196
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1197
			field2509[var4] = modelViewportXs[var5]; // L: 1198
			field2529[var4] = modelViewportYs[var5]; // L: 1199
			field2556[var4++] = this.faceColors1[var1]; // L: 1200
		} else {
			var11 = field2543[var5]; // L: 1203
			var12 = field2547[var5]; // L: 1204
			var13 = this.faceColors1[var1]; // L: 1205
			if (var10 >= 50) { // L: 1206
				var14 = field2553[var10 - var8] * (50 - var8); // L: 1207
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var7] - var11) * var14 >> 16)) / 50; // L: 1208
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var7] - var12) * var14 >> 16)) / 50; // L: 1209
				field2556[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1210
			}

			if (var9 >= 50) { // L: 1212
				var14 = field2553[var9 - var8] * (50 - var8); // L: 1213
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var6] - var11) * var14 >> 16)) / 50; // L: 1214
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var6] - var12) * var14 >> 16)) / 50; // L: 1215
				field2556[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1216
			}
		}

		if (var9 >= 50) { // L: 1219
			field2509[var4] = modelViewportXs[var6]; // L: 1220
			field2529[var4] = modelViewportYs[var6]; // L: 1221
			field2556[var4++] = this.faceColors2[var1]; // L: 1222
		} else {
			var11 = field2543[var6]; // L: 1225
			var12 = field2547[var6]; // L: 1226
			var13 = this.faceColors2[var1]; // L: 1227
			if (var8 >= 50) { // L: 1228
				var14 = field2553[var8 - var9] * (50 - var9); // L: 1229
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var5] - var11) * var14 >> 16)) / 50; // L: 1230
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var5] - var12) * var14 >> 16)) / 50; // L: 1231
				field2556[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1232
			}

			if (var10 >= 50) { // L: 1234
				var14 = field2553[var10 - var9] * (50 - var9); // L: 1235
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var7] - var11) * var14 >> 16)) / 50; // L: 1236
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var7] - var12) * var14 >> 16)) / 50; // L: 1237
				field2556[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1238
			}
		}

		if (var10 >= 50) { // L: 1241
			field2509[var4] = modelViewportXs[var7]; // L: 1242
			field2529[var4] = modelViewportYs[var7]; // L: 1243
			field2556[var4++] = this.faceColors3[var1]; // L: 1244
		} else {
			var11 = field2543[var7]; // L: 1247
			var12 = field2547[var7]; // L: 1248
			var13 = this.faceColors3[var1]; // L: 1249
			if (var9 >= 50) { // L: 1250
				var14 = field2553[var9 - var10] * (50 - var10); // L: 1251
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var6] - var11) * var14 >> 16)) / 50; // L: 1252
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var6] - var12) * var14 >> 16)) / 50; // L: 1253
				field2556[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1254
			}

			if (var8 >= 50) { // L: 1256
				var14 = field2553[var8 - var10] * (50 - var10); // L: 1257
				field2509[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2543[var5] - var11) * var14 >> 16)) / 50; // L: 1258
				field2529[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2547[var5] - var12) * var14 >> 16)) / 50; // L: 1259
				field2556[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1260
			}
		}

		var11 = field2509[0]; // L: 1263
		var12 = field2509[1]; // L: 1264
		var13 = field2509[2]; // L: 1265
		var14 = field2529[0]; // L: 1266
		int var15 = field2529[1]; // L: 1267
		int var16 = field2529[2]; // L: 1268
		Rasterizer3D.field2334 = false; // L: 1269
		if (var4 == 3) { // L: 1270
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1271
				Rasterizer3D.field2334 = true;
			}

			this.method4413(var1, var14, var15, var16, var11, var12, var13, field2556[0], field2556[1], field2556[2]); // L: 1272
		}

		if (var4 == 4) { // L: 1274
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2509[3] < 0 || field2509[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1275
				Rasterizer3D.field2334 = true;
			}

			int var17;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1276
				int var18;
				int var19;
				if (this.field2514 != null && this.field2514[var1] != -1) { // L: 1300
					int var20 = this.field2514[var1] & 255; // L: 1301
					var17 = this.field2541[var20]; // L: 1302
					var18 = this.field2519[var20]; // L: 1303
					var19 = this.field2520[var20]; // L: 1304
				} else {
					var17 = var5; // L: 1307
					var18 = var6; // L: 1308
					var19 = var7; // L: 1309
				}

				short var21 = this.faceTextures[var1]; // L: 1311
				if (this.faceColors3[var1] == -1) { // L: 1312
					Rasterizer3D.method4010(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2543[var17], field2543[var18], field2543[var19], field2547[var17], field2547[var18], field2547[var19], field2545[var17], field2545[var18], field2545[var19], var21); // L: 1313
					Rasterizer3D.method4010(var14, var16, field2529[3], var11, var13, field2509[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2543[var17], field2543[var18], field2543[var19], field2547[var17], field2547[var18], field2547[var19], field2545[var17], field2545[var18], field2545[var19], var21); // L: 1314
				} else {
					Rasterizer3D.method4010(var14, var15, var16, var11, var12, var13, field2556[0], field2556[1], field2556[2], field2543[var17], field2543[var18], field2543[var19], field2547[var17], field2547[var18], field2547[var19], field2545[var17], field2545[var18], field2545[var19], var21); // L: 1317
					Rasterizer3D.method4010(var14, var16, field2529[3], var11, var13, field2509[3], field2556[0], field2556[2], field2556[3], field2543[var17], field2543[var18], field2543[var19], field2547[var17], field2547[var18], field2547[var19], field2545[var17], field2545[var18], field2545[var19], var21); // L: 1318
				}
			} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1277
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1278
				Rasterizer3D.method4008(var14, var15, var16, var11, var12, var13, var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1279
				Rasterizer3D.method4008(var14, var16, field2529[3], var11, var13, field2509[3], var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1280
			} else if (this.faceColors3[var1] == -1) { // L: 1282
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1283
				Rasterizer3D.method4007(var14, var15, var16, var11, var12, var13, var17); // L: 1284
				Rasterizer3D.method4007(var14, var16, field2529[3], var11, var13, field2509[3], var17); // L: 1285
			} else if (this.overrideAmount > 0) { // L: 1287
				Rasterizer3D.method4084(var14, var15, var16, var11, var12, var13, field2556[0], field2556[1], field2556[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1288
				Rasterizer3D.method4084(var14, var16, field2529[3], var11, var13, field2509[3], field2556[0], field2556[2], field2556[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1289
			} else {
				Rasterizer3D.method4003(var14, var15, var16, var11, var12, var13, field2556[0], field2556[1], field2556[2]); // L: 1292
				Rasterizer3D.method4003(var14, var16, field2529[3], var11, var13, field2509[3], field2556[0], field2556[2], field2556[3]); // L: 1293
			}
		}

	} // L: 1322

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILnu;)V"
	)
	void method4383(int var1, class387 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1325
		float var4 = (float)(-this.verticesY[var1]); // L: 1326
		float var5 = (float)(-this.verticesZ[var1]); // L: 1327
		float var6 = 1.0F; // L: 1328
		this.verticesX[var1] = (int)(var2.field4347[0] * var3 + var2.field4347[4] * var4 + var2.field4347[8] * var5 + var2.field4347[12] * var6); // L: 1329
		this.verticesY[var1] = -((int)(var2.field4347[1] * var3 + var2.field4347[5] * var4 + var2.field4347[9] * var5 + var2.field4347[13] * var6)); // L: 1330
		this.verticesZ[var1] = -((int)(var2.field4347[2] * var3 + var2.field4347[6] * var4 + var2.field4347[10] * var5 + var2.field4347[14] * var6)); // L: 1331
	} // L: 1332

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgl;I)V"
	)
	void method4381(class202 var1, int var2) {
		if (this.field2523 != null) { // L: 1335
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1336
				int[] var4 = this.field2523[var3]; // L: 1337
				if (var4 != null && var4.length != 0) { // L: 1338
					int[] var5 = this.field2524[var3]; // L: 1339
					field2498.method7063(); // L: 1340

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1341
						int var7 = var4[var6]; // L: 1342
						class115 var8 = var1.method4099(var7); // L: 1343
						if (var8 != null) { // L: 1344
							field2499.method7065((float)var5[var6] / 255.0F); // L: 1345
							field2505.method7064(var8.method2657(var2)); // L: 1346
							field2505.method7109(field2499); // L: 1347
							field2498.method7067(field2505); // L: 1348
						}
					}

					this.method4383(var3, field2498); // L: 1350
				}
			}

		}
	} // L: 1352

	@ObfuscatedName("cv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2555[0] = -1; // L: 822
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

							boolean var27 = var26 || this.field2517 > 0; // L: 847
							int var28 = SpotAnimationDefinition.method3517(); // L: 848
							int var29 = ViewportMouse.ViewportMouse_y; // L: 851
							boolean var31 = Client.method1198(); // L: 854
							boolean var32 = class162.method3274(var9); // L: 855
							boolean var33 = false; // L: 856
							int var35;
							int var36;
							int var37;
							if (var32 && var31) { // L: 857
								boolean var34 = false; // L: 858
								if (field2560) { // L: 859
									var34 = FloorDecoration.method3980(this, var6, var7, var8); // L: 860
								} else {
									var35 = var12 - var13; // L: 863
									if (var35 <= 50) { // L: 864
										var35 = 50;
									}

									if (var15 > 0) { // L: 865
										var16 /= var14; // L: 866
										var17 /= var35; // L: 867
									} else {
										var17 /= var14; // L: 870
										var16 /= var35; // L: 871
									}

									if (var18 > 0) { // L: 873
										var23 /= var14; // L: 874
										var21 /= var35; // L: 875
									} else {
										var21 /= var14; // L: 878
										var23 /= var35; // L: 879
									}

									var36 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 881
									var37 = var29 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 882
									if (var36 > var16 && var36 < var17 && var37 > var23 && var37 < var21) { // L: 883
										var34 = true; // L: 884
									}
								}

								if (var34) { // L: 887
									if (this.isSingleTile) { // L: 888
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 891
									} else {
										var33 = true; // L: 894
									}
								}
							}

							int var47 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 897
							var35 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 898
							var36 = 0; // L: 899
							var37 = 0; // L: 900
							if (var1 != 0) { // L: 901
								var36 = Model_sine[var1]; // L: 902
								var37 = Model_cosine[var1]; // L: 903
							}

							for (int var38 = 0; var38 < this.verticesCount; ++var38) { // L: 905
								int var39 = this.verticesX[var38]; // L: 906
								int var40 = this.verticesY[var38]; // L: 907
								int var41 = this.verticesZ[var38]; // L: 908
								int var42;
								if (var1 != 0) { // L: 909
									var42 = var41 * var36 + var39 * var37 >> 16; // L: 910
									var41 = var41 * var37 - var39 * var36 >> 16; // L: 911
									var39 = var42; // L: 912
								}

								var39 += var6; // L: 914
								var40 += var7; // L: 915
								var41 += var8; // L: 916
								var42 = var41 * var4 + var5 * var39 >> 16; // L: 917
								var41 = var5 * var41 - var39 * var4 >> 16; // L: 918
								var39 = var42; // L: 919
								var42 = var3 * var40 - var41 * var2 >> 16; // L: 920
								var41 = var40 * var2 + var3 * var41 >> 16; // L: 921
								field2542[var38] = var41 - var12; // L: 923
								if (var41 >= 50) { // L: 924
									modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var41 + var47; // L: 925
									modelViewportYs[var38] = var42 * Rasterizer3D.Rasterizer3D_zoom / var41 + var35; // L: 926
								} else {
									modelViewportXs[var38] = -5000; // L: 929
									var25 = true; // L: 930
								}

								if (var27) { // L: 932
									field2543[var38] = var39; // L: 933
									field2547[var38] = var42; // L: 934
									field2545[var38] = var41; // L: 935
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9); // L: 939
							} catch (Exception var46) { // L: 941
							}

						}
					}
				}
			}
		}
	} // L: 942
}
