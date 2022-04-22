import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("c")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("f")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static class387 field2723;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static class387 field2724;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static class387 field2749;
	@ObfuscatedName("ad")
	static boolean[] field2796;
	@ObfuscatedName("ai")
	static boolean[] field2764;
	@ObfuscatedName("ax")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("ar")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ap")
	static int[] field2767;
	@ObfuscatedName("az")
	static int[] field2781;
	@ObfuscatedName("as")
	static int[] field2769;
	@ObfuscatedName("aa")
	static int[] field2727;
	@ObfuscatedName("bm")
	static int[] field2772;
	@ObfuscatedName("br")
	static int[][] field2773;
	@ObfuscatedName("bo")
	static int[] field2719;
	@ObfuscatedName("bl")
	static int[][] field2775;
	@ObfuscatedName("be")
	static int[] field2789;
	@ObfuscatedName("bh")
	static int[] field2745;
	@ObfuscatedName("bf")
	static int[] field2776;
	@ObfuscatedName("bb")
	static int[] field2779;
	@ObfuscatedName("bw")
	static int[] field2765;
	@ObfuscatedName("bx")
	static int[] field2784;
	@ObfuscatedName("bg")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bn")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bq")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("ba")
	static boolean field2777;
	@ObfuscatedName("by")
	@Export("Model_sine")
	static int[] Model_sine;
	@ObfuscatedName("bt")
	@Export("Model_cosine")
	static int[] Model_cosine;
	@ObfuscatedName("bd")
	@Export("Model_colorPalette")
	static int[] Model_colorPalette;
	@ObfuscatedName("bc")
	static int[] field2791;
	@ObfuscatedName("l")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("q")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("o")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("r")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("p")
	@Export("indicesCount")
	int indicesCount;
	@ObfuscatedName("w")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("k")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("d")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("m")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("u")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("t")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("g")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("x")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("a")
	byte[] field2739;
	@ObfuscatedName("y")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("j")
	byte field2741;
	@ObfuscatedName("e")
	int field2742;
	@ObfuscatedName("z")
	int[] field2743;
	@ObfuscatedName("h")
	int[] field2744;
	@ObfuscatedName("ae")
	int[] field2794;
	@ObfuscatedName("aq")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("aw")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("am")
	int[][] field2748;
	@ObfuscatedName("ak")
	int[][] field2726;
	@ObfuscatedName("ao")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("aj")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("al")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("av")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("at")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("an")
	@Export("radius")
	int radius;
	@ObfuscatedName("ay")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ag")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ah")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ac")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ab")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("au")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bu")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bz")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bv")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cm")
	@Export("overrideAmount")
	public byte overrideAmount;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2723 = new class387(); // L: 15
		field2724 = new class387(); // L: 16
		field2749 = new class387(); // L: 17
		field2796 = new boolean[6500]; // L: 55
		field2764 = new boolean[6500]; // L: 56
		modelViewportXs = new int[6500]; // L: 57
		modelViewportYs = new int[6500]; // L: 58
		field2767 = new int[6500]; // L: 59
		field2781 = new int[6500]; // L: 60
		field2769 = new int[6500]; // L: 61
		field2727 = new int[6500]; // L: 62
		field2772 = new int[1600]; // L: 64
		field2773 = new int[1600][512]; // L: 65
		field2719 = new int[12]; // L: 66
		field2775 = new int[12][2000]; // L: 67
		field2789 = new int[2000]; // L: 68
		field2745 = new int[2000]; // L: 69
		field2776 = new int[12]; // L: 70
		field2779 = new int[10]; // L: 71
		field2765 = new int[10]; // L: 72
		field2784 = new int[10]; // L: 73
		field2777 = true; // L: 77
		Model_sine = Rasterizer3D.Rasterizer3D_sine; // L: 80
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine; // L: 81
		Model_colorPalette = Rasterizer3D.Rasterizer3D_colorPalette; // L: 82
		field2791 = Rasterizer3D.field2571; // L: 83
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2741 = 0;
		this.field2742 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 91

	@ObfuscatedSignature(
		descriptor = "([Liq;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2741 = 0; // L: 33
		this.field2742 = 0; // L: 34
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
		this.field2742 = 0; // L: 100
		this.field2741 = -1; // L: 101

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 102
			var8 = var1[var7]; // L: 103
			if (var8 != null) { // L: 104
				this.verticesCount += var8.verticesCount; // L: 105
				this.indicesCount += var8.indicesCount; // L: 106
				this.field2742 += var8.field2742; // L: 107
				if (var8.faceRenderPriorities != null) { // L: 108
					var3 = true;
				} else {
					if (this.field2741 == -1) { // L: 110
						this.field2741 = var8.field2741;
					}

					if (this.field2741 != var8.field2741) { // L: 111
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 113
				var5 |= var8.faceTextures != null; // L: 114
				var6 |= var8.field2739 != null; // L: 115
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
			this.field2739 = new byte[this.indicesCount];
		}

		if (this.field2742 > 0) { // L: 131
			this.field2743 = new int[this.field2742]; // L: 132
			this.field2744 = new int[this.field2742]; // L: 133
			this.field2794 = new int[this.field2742]; // L: 134
		}

		this.verticesCount = 0; // L: 136
		this.indicesCount = 0; // L: 137
		this.field2742 = 0; // L: 138

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
							this.faceRenderPriorities[this.indicesCount] = var8.field2741; // L: 151
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
						if (var8.field2739 != null && var8.field2739[var9] != -1) { // L: 161
							this.field2739[this.indicesCount] = (byte)(this.field2742 + var8.field2739[var9]);
						} else {
							this.field2739[this.indicesCount] = -1; // L: 162
						}
					}

					++this.indicesCount; // L: 164
				}

				for (var9 = 0; var9 < var8.field2742; ++var9) { // L: 166
					this.field2743[this.field2742] = this.verticesCount + var8.field2743[var9]; // L: 167
					this.field2744[this.field2742] = this.verticesCount + var8.field2744[var9]; // L: 168
					this.field2794[this.field2742] = this.verticesCount + var8.field2794[var9]; // L: 169
					++this.field2742; // L: 170
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
		descriptor = "([[IIIIZI)Liq;"
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
					var11.field2742 = this.field2742; // L: 199
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
					var11.field2739 = this.field2739; // L: 210
					var11.faceTextures = this.faceTextures; // L: 211
					var11.field2741 = this.field2741; // L: 212
					var11.field2743 = this.field2743; // L: 213
					var11.field2744 = this.field2744; // L: 214
					var11.field2794 = this.field2794; // L: 215
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Z)Liq;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 260
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 261
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Z)Liq;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 265
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 266
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZLiq;[B)Liq;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 270
		var2.indicesCount = this.indicesCount; // L: 271
		var2.field2742 = this.field2742; // L: 272
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
		var2.field2739 = this.field2739; // L: 300
		var2.faceTextures = this.faceTextures; // L: 301
		var2.field2741 = this.field2741; // L: 302
		var2.field2743 = this.field2743; // L: 303
		var2.field2744 = this.field2744; // L: 304
		var2.field2794 = this.field2794; // L: 305
		var2.vertexLabels = this.vertexLabels; // L: 306
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 307
		var2.field2748 = this.field2748; // L: 308
		var2.field2726 = this.field2726; // L: 309
		var2.isSingleTile = this.isSingleTile; // L: 310
		var2.resetBounds(); // L: 311
		var2.overrideAmount = 0; // L: 312
		return var2; // L: 313
	}

	@ObfuscatedName("q")
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
				int var11 = Rasterizer3D.method4626(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 327
				int var12 = this.verticesY[var10]; // L: 328
				int var13 = Rasterizer3D.method4663(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 329
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
			if (this.xMidOffset < 32) { // L: 344
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) { // L: 345
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) { // L: 346
				this.xMidOffset += 8; // L: 348
				this.zMidOffset += 8; // L: 349
			}

		}
	} // L: 351

	@ObfuscatedName("o")
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
	void method4972() {
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

	@ObfuscatedName("p")
	public int method5014() {
		this.calculateBoundsCylinder(); // L: 390
		return this.xzRadius; // L: 391
	}

	@ObfuscatedName("w")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 395
		this.xMidOffset = -1; // L: 396
	} // L: 397

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lim;I)V"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I)V"
	)
	public void method5000(class122 var1, int var2) {
		Skeleton var3 = var1.field1472; // L: 415
		class231 var4 = var3.method4721(); // L: 416
		if (var4 != null) { // L: 417
			var3.method4721().method4717(var1, var2); // L: 418
			this.method4978(var3.method4721(), var1.method2766()); // L: 419
		}

		if (var1.method2768()) { // L: 421
			this.method5017(var1, var2); // L: 422
		}

		this.resetBounds(); // L: 424
	} // L: 425

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I)V"
	)
	void method5017(class122 var1, int var2) {
		Skeleton var3 = var1.field1472; // L: 428

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 429
			int var5 = var3.transformTypes[var4]; // L: 430
			if (var5 == 5 && var1.field1474 != null && var1.field1474[var4] != null && var1.field1474[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 431 432
				class117 var6 = var1.field1474[var4][0]; // L: 433
				int[] var7 = var3.labels[var4]; // L: 434
				int var8 = var7.length; // L: 435

				for (int var9 = 0; var9 < var8; ++var9) { // L: 436
					int var10 = var7[var9]; // L: 437
					if (var10 < this.faceLabelsAlpha.length) { // L: 438
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 439

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 440
							int var13 = var11[var12]; // L: 441
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2709(var2) * 255.0F); // L: 442
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)V"
	)
	void method4978(class231 var1, int var2) {
		this.method5034(var1, var2); // L: 456
	} // L: 458

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lim;ILim;I[I)V"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I[ZZ)V"
	)
	public void method4965(class122 var1, int var2, boolean[] var3, boolean var4) {
		Skeleton var5 = var1.field1472; // L: 493
		class231 var6 = var5.method4721(); // L: 494
		if (var6 != null) { // L: 495
			var6.method4701(var1, var2, var3, var4); // L: 496
			this.method4978(var6, var1.method2766()); // L: 497
		}

		if (var1.method2768()) { // L: 499
			this.method5017(var1, var2); // L: 500
		}

	} // L: 502

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lim;I[IZ)V"
	)
	public void method4981(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("a")
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

	@ObfuscatedName("y")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 659
			int var2 = this.verticesX[var1]; // L: 660
			this.verticesX[var1] = this.verticesZ[var1]; // L: 661
			this.verticesZ[var1] = -var2; // L: 662
		}

		this.resetBounds(); // L: 664
	} // L: 665

	@ObfuscatedName("j")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 668
			this.verticesX[var1] = -this.verticesX[var1]; // L: 669
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 670
		}

		this.resetBounds(); // L: 672
	} // L: 673

	@ObfuscatedName("e")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 676
			int var2 = this.verticesZ[var1]; // L: 677
			this.verticesZ[var1] = this.verticesX[var1]; // L: 678
			this.verticesX[var1] = -var2; // L: 679
		}

		this.resetBounds(); // L: 681
	} // L: 682

	@ObfuscatedName("z")
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

	@ObfuscatedName("h")
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

	@ObfuscatedName("ae")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 705
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 706
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 707
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 708
		}

		this.resetBounds(); // L: 710
	} // L: 711

	@ObfuscatedName("aq")
	public final void method5003(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2772[0] = -1; // L: 714
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 715
			this.method4972();
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
			field2767[var19] = var22 - var18; // L: 752
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 753
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 754
			if (this.field2742 > 0) { // L: 755
				field2781[var19] = var20; // L: 756
				field2769[var19] = var23; // L: 757
				field2727[var19] = var22; // L: 758
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 762
		} catch (Exception var25) { // L: 764
		}

	} // L: 765

	@ObfuscatedName("aw")
	public final void method5050(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2772[0] = -1; // L: 768
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 769
			this.method4972();
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
			field2767[var20] = var23 - var19; // L: 806
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 807
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 808
			if (this.field2742 > 0) { // L: 809
				field2781[var20] = var21; // L: 810
				field2769[var20] = var24; // L: 811
				field2727[var20] = var23; // L: 812
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 816
		} catch (Exception var26) { // L: 818
		}

	} // L: 819

	@ObfuscatedName("am")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) { // L: 1003
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1004
				field2772[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1005

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
			for (var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1006
				if (this.faceColors3[var7] != -2) { // L: 1007
					var8 = this.indices1[var7]; // L: 1008
					var9 = this.indices2[var7]; // L: 1009
					var10 = this.indices3[var7]; // L: 1010
					var11 = modelViewportXs[var8]; // L: 1011
					var12 = modelViewportXs[var9]; // L: 1012
					var28 = modelViewportXs[var10]; // L: 1013
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1014
						if (var2 && class135.method2919(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1040
							KeyHandler.method350(var4); // L: 1041
							var2 = false; // L: 1042
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1044
							field2764[var7] = false; // L: 1045
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1046
								field2796[var7] = false; // L: 1047
							} else {
								field2796[var7] = true;
							}

							var29 = (field2767[var8] + field2767[var9] + field2767[var10]) / 3 + this.radius; // L: 1048
							field2773[var29][field2772[var29]++] = var7; // L: 1049
						}
					} else {
						var29 = field2781[var8]; // L: 1015
						var15 = field2781[var9]; // L: 1016
						var16 = field2781[var10]; // L: 1017
						int var30 = field2769[var8]; // L: 1018
						var18 = field2769[var9]; // L: 1019
						int var19 = field2769[var10]; // L: 1020
						int var20 = field2727[var8]; // L: 1021
						int var21 = field2727[var9]; // L: 1022
						int var22 = field2727[var10]; // L: 1023
						var29 -= var15; // L: 1024
						var16 -= var15; // L: 1025
						var30 -= var18; // L: 1026
						var19 -= var18; // L: 1027
						var20 -= var21; // L: 1028
						var22 -= var21; // L: 1029
						int var23 = var30 * var22 - var20 * var19; // L: 1030
						int var24 = var20 * var16 - var29 * var22; // L: 1031
						int var25 = var29 * var19 - var30 * var16; // L: 1032
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1033
							field2764[var7] = true; // L: 1034
							int var26 = (field2767[var8] + field2767[var9] + field2767[var10]) / 3 + this.radius; // L: 1035
							field2773[var26][field2772[var26]++] = var7; // L: 1036
						}
					}
				}
			}

			int[] var27;
			if (this.faceRenderPriorities == null) { // L: 1053
				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1054
					var8 = field2772[var7]; // L: 1055
					if (var8 > 0) { // L: 1056
						var27 = field2773[var7]; // L: 1057

						for (var10 = 0; var10 < var8; ++var10) { // L: 1058
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var7 = 0; var7 < 12; ++var7) { // L: 1063
					field2719[var7] = 0; // L: 1064
					field2776[var7] = 0; // L: 1065
				}

				for (var7 = this.diameter - 1; var7 >= 0; --var7) { // L: 1067
					var8 = field2772[var7]; // L: 1068
					if (var8 > 0) { // L: 1069
						var27 = field2773[var7]; // L: 1070

						for (var10 = 0; var10 < var8; ++var10) { // L: 1071
							var11 = var27[var10]; // L: 1072
							byte var31 = this.faceRenderPriorities[var11]; // L: 1073
							var28 = field2719[var31]++; // L: 1074
							field2775[var31][var28] = var11; // L: 1075
							if (var31 < 10) { // L: 1076
								int[] var10000 = field2776;
								var10000[var31] += var7;
							} else if (var31 == 10) { // L: 1077
								field2789[var28] = var7;
							} else {
								field2745[var28] = var7; // L: 1078
							}
						}
					}
				}

				var7 = 0; // L: 1082
				if (field2719[1] > 0 || field2719[2] > 0) { // L: 1083
					var7 = (field2776[1] + field2776[2]) / (field2719[1] + field2719[2]);
				}

				var8 = 0; // L: 1084
				if (field2719[3] > 0 || field2719[4] > 0) { // L: 1085
					var8 = (field2776[3] + field2776[4]) / (field2719[3] + field2719[4]);
				}

				var9 = 0; // L: 1086
				if (field2719[6] > 0 || field2719[8] > 0) { // L: 1087
					var9 = (field2776[8] + field2776[6]) / (field2719[8] + field2719[6]);
				}

				var11 = 0; // L: 1089
				var12 = field2719[10]; // L: 1090
				int[] var13 = field2775[10]; // L: 1091
				int[] var14 = field2789; // L: 1092
				if (var11 == var12) { // L: 1093
					var11 = 0; // L: 1094
					var12 = field2719[11]; // L: 1095
					var13 = field2775[11]; // L: 1096
					var14 = field2745; // L: 1097
				}

				if (var11 < var12) { // L: 1099
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1100
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1101
					while (var15 == 0 && var10 > var7) { // L: 1102
						this.drawFace(var13[var11++]); // L: 1103
						if (var11 == var12 && var13 != field2775[11]) { // L: 1104
							var11 = 0; // L: 1105
							var12 = field2719[11]; // L: 1106
							var13 = field2775[11]; // L: 1107
							var14 = field2745; // L: 1108
						}

						if (var11 < var12) { // L: 1110
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1111
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1113
						this.drawFace(var13[var11++]); // L: 1114
						if (var11 == var12 && var13 != field2775[11]) { // L: 1115
							var11 = 0; // L: 1116
							var12 = field2719[11]; // L: 1117
							var13 = field2775[11]; // L: 1118
							var14 = field2745; // L: 1119
						}

						if (var11 < var12) { // L: 1121
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1122
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1124
						this.drawFace(var13[var11++]); // L: 1125
						if (var11 == var12 && var13 != field2775[11]) { // L: 1126
							var11 = 0; // L: 1127
							var12 = field2719[11]; // L: 1128
							var13 = field2775[11]; // L: 1129
							var14 = field2745; // L: 1130
						}

						if (var11 < var12) { // L: 1132
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1133
						}
					}

					var16 = field2719[var15]; // L: 1135
					int[] var17 = field2775[var15]; // L: 1136

					for (var18 = 0; var18 < var16; ++var18) { // L: 1137
						this.drawFace(var17[var18]); // L: 1138
					}
				}

				while (var10 != -1000) { // L: 1141
					this.drawFace(var13[var11++]); // L: 1142
					if (var11 == var12 && var13 != field2775[11]) { // L: 1143
						var11 = 0; // L: 1144
						var13 = field2775[11]; // L: 1145
						var12 = field2719[11]; // L: 1146
						var14 = field2745; // L: 1147
					}

					if (var11 < var12) { // L: 1149
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1150
					}
				}

			}
		}
	} // L: 1061 1152

	@ObfuscatedName("ak")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2764[var1]) { // L: 1155
			this.method5010(var1); // L: 1156
		} else {
			int var2 = this.indices1[var1]; // L: 1159
			int var3 = this.indices2[var1]; // L: 1160
			int var4 = this.indices3[var1]; // L: 1161
			Rasterizer3D.field2562 = field2796[var1]; // L: 1162
			if (this.faceAlphas == null) { // L: 1163
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1164
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1167
			}

			this.method4994(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1169
		}
	} // L: 1157 1170

	@ObfuscatedName("ao")
	final void method4994(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1173
			int var11;
			int var12;
			int var13;
			if (this.field2739 != null && this.field2739[var1] != -1) { // L: 1191
				int var14 = this.field2739[var1] & 255; // L: 1192
				var11 = this.field2743[var14]; // L: 1193
				var12 = this.field2744[var14]; // L: 1194
				var13 = this.field2794[var14]; // L: 1195
			} else {
				var11 = this.indices1[var1]; // L: 1198
				var12 = this.indices2[var1]; // L: 1199
				var13 = this.indices3[var1]; // L: 1200
			}

			if (this.faceColors3[var1] == -1) { // L: 1202
				Rasterizer3D.method4620(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2781[var11], field2781[var12], field2781[var13], field2769[var11], field2769[var12], field2769[var13], field2727[var11], field2727[var12], field2727[var13], this.faceTextures[var1]); // L: 1203
			} else {
				Rasterizer3D.method4620(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2781[var11], field2781[var12], field2781[var13], field2769[var11], field2769[var12], field2769[var13], field2727[var11], field2727[var12], field2727[var13], this.faceTextures[var1]); // L: 1206
			}
		} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1174
			Rasterizer3D.method4618(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1175
		} else if (this.faceColors3[var1] == -1) { // L: 1177
			Rasterizer3D.method4617(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]]); // L: 1178
		} else if (this.overrideAmount > 0) { // L: 1180
			Rasterizer3D.method4614(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1181
		} else {
			Rasterizer3D.method4613(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1184
		}

	} // L: 1209

	@ObfuscatedName("aj")
	final void method5010(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1212
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1213
		int var4 = 0; // L: 1214
		int var5 = this.indices1[var1]; // L: 1215
		int var6 = this.indices2[var1]; // L: 1216
		int var7 = this.indices3[var1]; // L: 1217
		int var8 = field2727[var5]; // L: 1218
		int var9 = field2727[var6]; // L: 1219
		int var10 = field2727[var7]; // L: 1220
		if (this.faceAlphas == null) { // L: 1221
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1222
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1223
			field2779[var4] = modelViewportXs[var5]; // L: 1224
			field2765[var4] = modelViewportYs[var5]; // L: 1225
			field2784[var4++] = this.faceColors1[var1]; // L: 1226
		} else {
			var11 = field2781[var5]; // L: 1229
			var12 = field2769[var5]; // L: 1230
			var13 = this.faceColors1[var1]; // L: 1231
			if (var10 >= 50) { // L: 1232
				var14 = field2791[var10 - var8] * (50 - var8); // L: 1233
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var7] - var11) * var14 >> 16)) / 50; // L: 1234
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var7] - var12) * var14 >> 16)) / 50; // L: 1235
				field2784[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1236
			}

			if (var9 >= 50) { // L: 1238
				var14 = field2791[var9 - var8] * (50 - var8); // L: 1239
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var6] - var11) * var14 >> 16)) / 50; // L: 1240
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var6] - var12) * var14 >> 16)) / 50; // L: 1241
				field2784[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1242
			}
		}

		if (var9 >= 50) { // L: 1245
			field2779[var4] = modelViewportXs[var6]; // L: 1246
			field2765[var4] = modelViewportYs[var6]; // L: 1247
			field2784[var4++] = this.faceColors2[var1]; // L: 1248
		} else {
			var11 = field2781[var6]; // L: 1251
			var12 = field2769[var6]; // L: 1252
			var13 = this.faceColors2[var1]; // L: 1253
			if (var8 >= 50) { // L: 1254
				var14 = field2791[var8 - var9] * (50 - var9); // L: 1255
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var5] - var11) * var14 >> 16)) / 50; // L: 1256
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var5] - var12) * var14 >> 16)) / 50; // L: 1257
				field2784[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1258
			}

			if (var10 >= 50) { // L: 1260
				var14 = field2791[var10 - var9] * (50 - var9); // L: 1261
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var7] - var11) * var14 >> 16)) / 50; // L: 1262
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var7] - var12) * var14 >> 16)) / 50; // L: 1263
				field2784[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1264
			}
		}

		if (var10 >= 50) { // L: 1267
			field2779[var4] = modelViewportXs[var7]; // L: 1268
			field2765[var4] = modelViewportYs[var7]; // L: 1269
			field2784[var4++] = this.faceColors3[var1]; // L: 1270
		} else {
			var11 = field2781[var7]; // L: 1273
			var12 = field2769[var7]; // L: 1274
			var13 = this.faceColors3[var1]; // L: 1275
			if (var9 >= 50) { // L: 1276
				var14 = field2791[var9 - var10] * (50 - var10); // L: 1277
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var6] - var11) * var14 >> 16)) / 50; // L: 1278
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var6] - var12) * var14 >> 16)) / 50; // L: 1279
				field2784[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1280
			}

			if (var8 >= 50) { // L: 1282
				var14 = field2791[var8 - var10] * (50 - var10); // L: 1283
				field2779[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2781[var5] - var11) * var14 >> 16)) / 50; // L: 1284
				field2765[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2769[var5] - var12) * var14 >> 16)) / 50; // L: 1285
				field2784[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1286
			}
		}

		var11 = field2779[0]; // L: 1289
		var12 = field2779[1]; // L: 1290
		var13 = field2779[2]; // L: 1291
		var14 = field2765[0]; // L: 1292
		int var15 = field2765[1]; // L: 1293
		int var16 = field2765[2]; // L: 1294
		Rasterizer3D.field2562 = false; // L: 1295
		if (var4 == 3) { // L: 1296
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1297
				Rasterizer3D.field2562 = true;
			}

			this.method4994(var1, var14, var15, var16, var11, var12, var13, field2784[0], field2784[1], field2784[2]); // L: 1298
		}

		if (var4 == 4) { // L: 1300
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2779[3] < 0 || field2779[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1301
				Rasterizer3D.field2562 = true;
			}

			int var17;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1302
				int var18;
				int var19;
				if (this.field2739 != null && this.field2739[var1] != -1) { // L: 1326
					int var20 = this.field2739[var1] & 255; // L: 1327
					var17 = this.field2743[var20]; // L: 1328
					var18 = this.field2744[var20]; // L: 1329
					var19 = this.field2794[var20]; // L: 1330
				} else {
					var17 = var5; // L: 1333
					var18 = var6; // L: 1334
					var19 = var7; // L: 1335
				}

				short var21 = this.faceTextures[var1]; // L: 1337
				if (this.faceColors3[var1] == -1) { // L: 1338
					Rasterizer3D.method4620(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2781[var17], field2781[var18], field2781[var19], field2769[var17], field2769[var18], field2769[var19], field2727[var17], field2727[var18], field2727[var19], var21); // L: 1339
					Rasterizer3D.method4620(var14, var16, field2765[3], var11, var13, field2779[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2781[var17], field2781[var18], field2781[var19], field2769[var17], field2769[var18], field2769[var19], field2727[var17], field2727[var18], field2727[var19], var21); // L: 1340
				} else {
					Rasterizer3D.method4620(var14, var15, var16, var11, var12, var13, field2784[0], field2784[1], field2784[2], field2781[var17], field2781[var18], field2781[var19], field2769[var17], field2769[var18], field2769[var19], field2727[var17], field2727[var18], field2727[var19], var21); // L: 1343
					Rasterizer3D.method4620(var14, var16, field2765[3], var11, var13, field2779[3], field2784[0], field2784[2], field2784[3], field2781[var17], field2781[var18], field2781[var19], field2769[var17], field2769[var18], field2769[var19], field2727[var17], field2727[var18], field2727[var19], var21); // L: 1344
				}
			} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) { // L: 1303
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1304
				Rasterizer3D.method4618(var14, var15, var16, var11, var12, var13, var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1305
				Rasterizer3D.method4618(var14, var16, field2765[3], var11, var13, field2779[3], var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1306
			} else if (this.faceColors3[var1] == -1) { // L: 1308
				var17 = Model_colorPalette[this.faceColors1[var1]]; // L: 1309
				Rasterizer3D.method4617(var14, var15, var16, var11, var12, var13, var17); // L: 1310
				Rasterizer3D.method4617(var14, var16, field2765[3], var11, var13, field2779[3], var17); // L: 1311
			} else if (this.overrideAmount > 0) { // L: 1313
				Rasterizer3D.method4614(var14, var15, var16, var11, var12, var13, field2784[0], field2784[1], field2784[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1314
				Rasterizer3D.method4614(var14, var16, field2765[3], var11, var13, field2779[3], field2784[0], field2784[2], field2784[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1315
			} else {
				Rasterizer3D.method4613(var14, var15, var16, var11, var12, var13, field2784[0], field2784[1], field2784[2]); // L: 1318
				Rasterizer3D.method4613(var14, var16, field2765[3], var11, var13, field2779[3], field2784[0], field2784[2], field2784[3]); // L: 1319
			}
		}

	} // L: 1348

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILnt;)V"
	)
	void method4996(int var1, class387 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1351
		float var4 = (float)(-this.verticesY[var1]); // L: 1352
		float var5 = (float)(-this.verticesZ[var1]); // L: 1353
		float var6 = 1.0F; // L: 1354
		this.verticesX[var1] = (int)(var2.field4348[0] * var3 + var2.field4348[4] * var4 + var2.field4348[8] * var5 + var2.field4348[12] * var6); // L: 1355
		this.verticesY[var1] = -((int)(var2.field4348[1] * var3 + var2.field4348[5] * var4 + var2.field4348[9] * var5 + var2.field4348[13] * var6)); // L: 1356
		this.verticesZ[var1] = -((int)(var2.field4348[2] * var3 + var2.field4348[6] * var4 + var2.field4348[10] * var5 + var2.field4348[14] * var6)); // L: 1357
	} // L: 1358

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)V"
	)
	void method5034(class231 var1, int var2) {
		if (this.field2748 != null) { // L: 1361
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1362
				int[] var4 = this.field2748[var3]; // L: 1363
				if (var4 != null && var4.length != 0) { // L: 1364
					int[] var5 = this.field2726[var3]; // L: 1365
					field2723.method7064(); // L: 1366

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1367
						int var7 = var4[var6]; // L: 1368
						class115 var8 = var1.method4718(var7); // L: 1369
						if (var8 != null) { // L: 1370
							field2724.method7043((float)var5[var6] / 255.0F); // L: 1371
							field2749.method7032(var8.method2671(var2)); // L: 1372
							field2749.method7017(field2724); // L: 1373
							field2723.method7016(field2749); // L: 1374
						}
					}

					this.method4996(var3, field2723); // L: 1376
				}
			}

		}
	} // L: 1378

	@ObfuscatedName("co")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2772[0] = -1; // L: 822
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

							boolean var27 = var26 || this.field2742 > 0; // L: 847
							int var28 = ViewportMouse.ViewportMouse_x; // L: 850
							int var30 = class118.method2747(); // L: 853
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport; // L: 856
							boolean var34 = 0L != var9; // L: 861
							boolean var35;
							if (var34) { // L: 862
								var35 = (int)(var9 >>> 16 & 1L) == 1; // L: 865
								var34 = !var35; // L: 867
							}

							var35 = false; // L: 872
							int var40;
							int var41;
							int var42;
							int var43;
							int var44;
							int var49;
							int var53;
							int var54;
							if (var34 && var31) { // L: 873
								boolean var36 = false; // L: 874
								if (field2777) { // L: 875
									boolean var39 = ViewportMouse.ViewportMouse_isInViewport; // L: 881
									boolean var37;
									if (!var39) { // L: 883
										var37 = false; // L: 884
									} else {
										WorldMapSection0.method4283(); // L: 887
										var40 = this.xMid + var6; // L: 888
										var41 = var7 + this.yMid; // L: 889
										var42 = var8 + this.zMid; // L: 890
										var43 = this.xMidOffset; // L: 891
										var44 = this.yMidOffset; // L: 892
										int var45 = this.zMidOffset; // L: 893
										int var46 = FaceNormal.field2664 - var40; // L: 894
										int var47 = ItemComposition.field2076 - var41; // L: 895
										int var48 = ViewportMouse.field2802 - var42; // L: 896
										if (Math.abs(var46) > var43 + class9.field35) { // L: 897
											var37 = false; // L: 898
										} else if (Math.abs(var47) > var44 + ViewportMouse.field2808) { // L: 901
											var37 = false; // L: 902
										} else if (Math.abs(var48) > var45 + class196.field2204) { // L: 905
											var37 = false; // L: 906
										} else if (Math.abs(var48 * ViewportMouse.field2804 - var47 * class18.field95) > var44 * class196.field2204 + var45 * ViewportMouse.field2808) { // L: 909
											var37 = false; // L: 910
										} else if (Math.abs(var46 * class18.field95 - var48 * ViewportMouse.field2805) > var45 * class9.field35 + var43 * class196.field2204) { // L: 913
											var37 = false; // L: 914
										} else if (Math.abs(var47 * ViewportMouse.field2805 - var46 * ViewportMouse.field2804) > var44 * class9.field35 + var43 * ViewportMouse.field2808) { // L: 917
											var37 = false; // L: 918
										} else {
											var37 = true; // L: 921
										}
									}

									var36 = var37; // L: 923
								} else {
									var54 = var12 - var13; // L: 926
									if (var54 <= 50) { // L: 927
										var54 = 50;
									}

									if (var15 > 0) { // L: 928
										var16 /= var14; // L: 929
										var17 /= var54; // L: 930
									} else {
										var17 /= var14; // L: 933
										var16 /= var54; // L: 934
									}

									if (var18 > 0) { // L: 936
										var23 /= var14; // L: 937
										var21 /= var54; // L: 938
									} else {
										var21 /= var14; // L: 941
										var23 /= var54; // L: 942
									}

									var49 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 944
									var53 = var30 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 945
									if (var49 > var16 && var49 < var17 && var53 > var23 && var53 < var21) { // L: 946
										var36 = true; // L: 947
									}
								}

								if (var36) { // L: 950
									if (this.isSingleTile) { // L: 951
										KeyHandler.method350(var9);
									} else {
										var35 = true; // L: 952
									}
								}
							}

							int var52 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 955
							var54 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 956
							var49 = 0; // L: 957
							var53 = 0; // L: 958
							if (var1 != 0) { // L: 959
								var49 = Model_sine[var1]; // L: 960
								var53 = Model_cosine[var1]; // L: 961
							}

							for (var40 = 0; var40 < this.verticesCount; ++var40) { // L: 963
								var41 = this.verticesX[var40]; // L: 964
								var42 = this.verticesY[var40]; // L: 965
								var43 = this.verticesZ[var40]; // L: 966
								if (var1 != 0) { // L: 967
									var44 = var43 * var49 + var41 * var53 >> 16; // L: 968
									var43 = var43 * var53 - var41 * var49 >> 16; // L: 969
									var41 = var44; // L: 970
								}

								var41 += var6; // L: 972
								var42 += var7; // L: 973
								var43 += var8; // L: 974
								var44 = var43 * var4 + var5 * var41 >> 16; // L: 975
								var43 = var5 * var43 - var41 * var4 >> 16; // L: 976
								var41 = var44; // L: 977
								var44 = var3 * var42 - var43 * var2 >> 16; // L: 978
								var43 = var42 * var2 + var3 * var43 >> 16; // L: 979
								field2767[var40] = var43 - var12; // L: 981
								if (var43 >= 50) { // L: 982
									modelViewportXs[var40] = var41 * Rasterizer3D.Rasterizer3D_zoom / var43 + var52; // L: 983
									modelViewportYs[var40] = var44 * Rasterizer3D.Rasterizer3D_zoom / var43 + var54; // L: 984
								} else {
									modelViewportXs[var40] = -5000; // L: 987
									var25 = true; // L: 988
								}

								if (var27) { // L: 990
									field2781[var40] = var41; // L: 991
									field2769[var40] = var44; // L: 992
									field2727[var40] = var43; // L: 993
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 997
							} catch (Exception var51) { // L: 999
							}

						}
					}
				}
			}
		}
	} // L: 1000
}
