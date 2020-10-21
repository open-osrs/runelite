import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("eq")
@Implements("TileModel")
public final class TileModel {
	@ObfuscatedName("r")
	static int[] field1628;
	@ObfuscatedName("y")
	static int[] field1634;
	@ObfuscatedName("s")
	static int[] field1630;
	@ObfuscatedName("j")
	static int[] field1627;
	@ObfuscatedName("w")
	static int[] field1632;
	@ObfuscatedName("v")
	static final int[][] field1633;
	@ObfuscatedName("d")
	static final int[][] field1620;
	@ObfuscatedName("f")
	@Export("vertexX")
	int[] vertexX;
	@ObfuscatedName("b")
	@Export("vertexY")
	int[] vertexY;
	@ObfuscatedName("l")
	@Export("vertexZ")
	int[] vertexZ;
	@ObfuscatedName("m")
	@Export("triangleColorA")
	int[] triangleColorA;
	@ObfuscatedName("z")
	@Export("triangleColorB")
	int[] triangleColorB;
	@ObfuscatedName("q")
	@Export("triangleColorC")
	int[] triangleColorC;
	@ObfuscatedName("k")
	@Export("faceX")
	int[] faceX;
	@ObfuscatedName("c")
	@Export("faceY")
	int[] faceY;
	@ObfuscatedName("u")
	@Export("faceZ")
	int[] faceZ;
	@ObfuscatedName("t")
	@Export("triangleTextureId")
	int[] triangleTextureId;
	@ObfuscatedName("e")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("o")
	@Export("shape")
	int shape;
	@ObfuscatedName("n")
	@Export("rotation")
	int rotation;
	@ObfuscatedName("x")
	@Export("underlayRgb")
	int underlayRgb;
	@ObfuscatedName("p")
	@Export("overlayRgb")
	int overlayRgb;

	static {
		field1628 = new int[6]; // L: 21
		field1634 = new int[6]; // L: 22
		field1630 = new int[6]; // L: 23
		field1627 = new int[6]; // L: 24
		field1632 = new int[6]; // L: 25
		field1633 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}}; // L: 26
		field1620 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}}; // L: 41
	}

	TileModel(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		this.isFlat = true; // L: 16
		if (var7 != var6 || var8 != var6 || var9 != var6) { // L: 58
			this.isFlat = false;
		}

		this.shape = var1; // L: 59
		this.rotation = var2; // L: 60
		this.underlayRgb = var18; // L: 61
		this.overlayRgb = var19; // L: 62
		short var20 = 128; // L: 63
		int var21 = var20 / 2; // L: 64
		int var22 = var20 / 4; // L: 65
		int var23 = var20 * 3 / 4; // L: 66
		int[] var24 = field1633[var1]; // L: 67
		int var25 = var24.length; // L: 68
		this.vertexX = new int[var25]; // L: 69
		this.vertexY = new int[var25]; // L: 70
		this.vertexZ = new int[var25]; // L: 71
		int[] var26 = new int[var25]; // L: 72
		int[] var27 = new int[var25]; // L: 73
		int var28 = var20 * var4; // L: 74
		int var29 = var5 * var20; // L: 75

		int var31;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		for (int var30 = 0; var30 < var25; ++var30) { // L: 76
			var31 = var24[var30]; // L: 77
			if ((var31 & 1) == 0 && var31 <= 8) { // L: 78
				var31 = (var31 - var2 - var2 - 1 & 7) + 1;
			}

			if (var31 > 8 && var31 <= 12) { // L: 79
				var31 = (var31 - 9 - var2 & 3) + 9;
			}

			if (var31 > 12 && var31 <= 16) { // L: 80
				var31 = (var31 - 13 - var2 & 3) + 13;
			}

			if (var31 == 1) { // L: 86
				var32 = var28; // L: 87
				var33 = var29; // L: 88
				var34 = var6; // L: 89
				var35 = var10; // L: 90
				var36 = var14; // L: 91
			} else if (var31 == 2) { // L: 93
				var32 = var28 + var21; // L: 94
				var33 = var29; // L: 95
				var34 = var7 + var6 >> 1; // L: 96
				var35 = var11 + var10 >> 1; // L: 97
				var36 = var15 + var14 >> 1; // L: 98
			} else if (var31 == 3) { // L: 100
				var32 = var28 + var20; // L: 101
				var33 = var29; // L: 102
				var34 = var7; // L: 103
				var35 = var11; // L: 104
				var36 = var15; // L: 105
			} else if (var31 == 4) { // L: 107
				var32 = var28 + var20; // L: 108
				var33 = var29 + var21; // L: 109
				var34 = var8 + var7 >> 1; // L: 110
				var35 = var11 + var12 >> 1; // L: 111
				var36 = var15 + var16 >> 1; // L: 112
			} else if (var31 == 5) { // L: 114
				var32 = var28 + var20; // L: 115
				var33 = var29 + var20; // L: 116
				var34 = var8; // L: 117
				var35 = var12; // L: 118
				var36 = var16; // L: 119
			} else if (var31 == 6) { // L: 121
				var32 = var28 + var21; // L: 122
				var33 = var29 + var20; // L: 123
				var34 = var8 + var9 >> 1; // L: 124
				var35 = var13 + var12 >> 1; // L: 125
				var36 = var17 + var16 >> 1; // L: 126
			} else if (var31 == 7) { // L: 128
				var32 = var28; // L: 129
				var33 = var29 + var20; // L: 130
				var34 = var9; // L: 131
				var35 = var13; // L: 132
				var36 = var17; // L: 133
			} else if (var31 == 8) { // L: 135
				var32 = var28; // L: 136
				var33 = var29 + var21; // L: 137
				var34 = var9 + var6 >> 1; // L: 138
				var35 = var13 + var10 >> 1; // L: 139
				var36 = var17 + var14 >> 1; // L: 140
			} else if (var31 == 9) { // L: 142
				var32 = var28 + var21; // L: 143
				var33 = var29 + var22; // L: 144
				var34 = var7 + var6 >> 1; // L: 145
				var35 = var11 + var10 >> 1; // L: 146
				var36 = var15 + var14 >> 1; // L: 147
			} else if (var31 == 10) { // L: 149
				var32 = var28 + var23; // L: 150
				var33 = var29 + var21; // L: 151
				var34 = var8 + var7 >> 1; // L: 152
				var35 = var11 + var12 >> 1; // L: 153
				var36 = var15 + var16 >> 1; // L: 154
			} else if (var31 == 11) { // L: 156
				var32 = var28 + var21; // L: 157
				var33 = var29 + var23; // L: 158
				var34 = var8 + var9 >> 1; // L: 159
				var35 = var13 + var12 >> 1; // L: 160
				var36 = var17 + var16 >> 1; // L: 161
			} else if (var31 == 12) { // L: 163
				var32 = var28 + var22; // L: 164
				var33 = var29 + var21; // L: 165
				var34 = var9 + var6 >> 1; // L: 166
				var35 = var13 + var10 >> 1; // L: 167
				var36 = var17 + var14 >> 1; // L: 168
			} else if (var31 == 13) { // L: 170
				var32 = var28 + var22; // L: 171
				var33 = var29 + var22; // L: 172
				var34 = var6; // L: 173
				var35 = var10; // L: 174
				var36 = var14; // L: 175
			} else if (var31 == 14) { // L: 177
				var32 = var28 + var23; // L: 178
				var33 = var29 + var22; // L: 179
				var34 = var7; // L: 180
				var35 = var11; // L: 181
				var36 = var15; // L: 182
			} else if (var31 == 15) { // L: 184
				var32 = var28 + var23; // L: 185
				var33 = var29 + var23; // L: 186
				var34 = var8; // L: 187
				var35 = var12; // L: 188
				var36 = var16; // L: 189
			} else {
				var32 = var28 + var22; // L: 192
				var33 = var29 + var23; // L: 193
				var34 = var9; // L: 194
				var35 = var13; // L: 195
				var36 = var17; // L: 196
			}

			this.vertexX[var30] = var32; // L: 198
			this.vertexY[var30] = var34; // L: 199
			this.vertexZ[var30] = var33; // L: 200
			var26[var30] = var35; // L: 201
			var27[var30] = var36; // L: 202
		}

		int[] var38 = field1620[var1]; // L: 204
		var31 = var38.length / 4; // L: 205
		this.faceX = new int[var31]; // L: 206
		this.faceY = new int[var31]; // L: 207
		this.faceZ = new int[var31]; // L: 208
		this.triangleColorA = new int[var31]; // L: 209
		this.triangleColorB = new int[var31]; // L: 210
		this.triangleColorC = new int[var31]; // L: 211
		if (var3 != -1) { // L: 212
			this.triangleTextureId = new int[var31];
		}

		var32 = 0; // L: 213

		for (var33 = 0; var33 < var31; ++var33) { // L: 214
			var34 = var38[var32]; // L: 215
			var35 = var38[var32 + 1]; // L: 216
			var36 = var38[var32 + 2]; // L: 217
			int var37 = var38[var32 + 3]; // L: 218
			var32 += 4; // L: 219
			if (var35 < 4) { // L: 220
				var35 = var35 - var2 & 3;
			}

			if (var36 < 4) { // L: 221
				var36 = var36 - var2 & 3;
			}

			if (var37 < 4) { // L: 222
				var37 = var37 - var2 & 3;
			}

			this.faceX[var33] = var35; // L: 223
			this.faceY[var33] = var36; // L: 224
			this.faceZ[var33] = var37; // L: 225
			if (var34 == 0) { // L: 226
				this.triangleColorA[var33] = var26[var35]; // L: 227
				this.triangleColorB[var33] = var26[var36]; // L: 228
				this.triangleColorC[var33] = var26[var37]; // L: 229
				if (this.triangleTextureId != null) { // L: 230
					this.triangleTextureId[var33] = -1;
				}
			} else {
				this.triangleColorA[var33] = var27[var35]; // L: 233
				this.triangleColorB[var33] = var27[var36]; // L: 234
				this.triangleColorC[var33] = var27[var37]; // L: 235
				if (this.triangleTextureId != null) { // L: 236
					this.triangleTextureId[var33] = var3;
				}
			}
		}

		var33 = var6; // L: 239
		var34 = var7; // L: 240
		if (var7 < var6) { // L: 241
			var33 = var7;
		}

		if (var7 > var7) { // L: 242
			var34 = var7;
		}

		if (var8 < var33) { // L: 243
			var33 = var8;
		}

		if (var8 > var34) { // L: 244
			var34 = var8;
		}

		if (var9 < var33) { // L: 245
			var33 = var9;
		}

		if (var9 > var34) { // L: 246
			var34 = var9;
		}

		var33 /= 14; // L: 247
		var34 /= 14; // L: 248
	} // L: 249
}
