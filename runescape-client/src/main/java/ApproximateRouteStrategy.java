import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("d")
	static String field642;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive6")
	static Archive archive6;

	ApproximateRouteStrategy() {
	} // L: 11760

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILfh;I)Z",
		garbageValue = "-1510519179"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11763
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitDefinition var2 = (VarbitDefinition)VarbitDefinition.VarbitDefinition_cached.get((long)var0);
		VarbitDefinition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitDefinition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitDefinition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitDefinition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILgm;Lfh;Z[I[II)I",
		garbageValue = "-1489955053"
	)
	public static int method1321(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class182.directions[var8][var9] = 0;
				class182.distances[var8][var9] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var12;
		byte var13;
		int var14;
		int var15;
		byte var16;
		int var17;
		int[][] var18;
		int var19;
		int var20;
		int var21;
		int var22;
		boolean var28;
		boolean var29;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) {
			var10 = var0; // L: 29
			var11 = var1;
			var12 = 64; // L: 31
			var13 = 64; // L: 32
			var14 = var0 - var12; // L: 33
			var15 = var1 - var13; // L: 34
			class182.directions[var12][var13] = 99; // L: 35
			class182.distances[var12][var13] = 0; // L: 36
			var16 = 0; // L: 37
			var17 = 0; // L: 38
			class182.bufferX[var16] = var0; // L: 39
			var33 = var16 + 1;
			class182.bufferY[var16] = var1; // L: 40
			var18 = var4.flags; // L: 41

			while (true) {
				if (var17 == var33) { // L: 44
					Ignored.field3637 = var10; // L: 116
					class182.field2122 = var11; // L: 117
					var29 = false; // L: 118
					break;
				}

				var10 = class182.bufferX[var17]; // L: 45
				var11 = class182.bufferY[var17]; // L: 46
				var17 = var17 + 1 & 4095; // L: 47
				var30 = var10 - var14; // L: 48
				var31 = var11 - var15; // L: 49
				var19 = var10 - var4.xInset; // L: 50
				var20 = var11 - var4.yInset; // L: 51
				if (var3.hasArrived(1, var10, var11, var4)) { // L: 52
					Ignored.field3637 = var10; // L: 53
					class182.field2122 = var11; // L: 54
					var29 = true; // L: 55
					break;
				}

				var21 = class182.distances[var30][var31] + 1; // L: 58
				if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) { // L: 59
					class182.bufferX[var33] = var10 - 1; // L: 60
					class182.bufferY[var33] = var11; // L: 61
					var33 = var33 + 1 & 4095; // L: 62
					class182.directions[var30 - 1][var31] = 2; // L: 63
					class182.distances[var30 - 1][var31] = var21; // L: 64
				}

				if (var30 < 127 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) { // L: 66
					class182.bufferX[var33] = var10 + 1; // L: 67
					class182.bufferY[var33] = var11; // L: 68
					var33 = var33 + 1 & 4095; // L: 69
					class182.directions[var30 + 1][var31] = 8; // L: 70
					class182.distances[var30 + 1][var31] = var21; // L: 71
				}

				if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 73
					class182.bufferX[var33] = var10; // L: 74
					class182.bufferY[var33] = var11 - 1; // L: 75
					var33 = var33 + 1 & 4095; // L: 76
					class182.directions[var30][var31 - 1] = 1; // L: 77
					class182.distances[var30][var31 - 1] = var21; // L: 78
				}

				if (var31 < 127 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 80
					class182.bufferX[var33] = var10; // L: 81
					class182.bufferY[var33] = var11 + 1; // L: 82
					var33 = var33 + 1 & 4095; // L: 83
					class182.directions[var30][var31 + 1] = 4; // L: 84
					class182.distances[var30][var31 + 1] = var21; // L: 85
				}

				if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 87
					class182.bufferX[var33] = var10 - 1; // L: 88
					class182.bufferY[var33] = var11 - 1; // L: 89
					var33 = var33 + 1 & 4095; // L: 90
					class182.directions[var30 - 1][var31 - 1] = 3; // L: 91
					class182.distances[var30 - 1][var31 - 1] = var21; // L: 92
				}

				if (var30 < 127 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 94
					class182.bufferX[var33] = var10 + 1; // L: 95
					class182.bufferY[var33] = var11 - 1; // L: 96
					var33 = var33 + 1 & 4095; // L: 97
					class182.directions[var30 + 1][var31 - 1] = 9; // L: 98
					class182.distances[var30 + 1][var31 - 1] = var21; // L: 99
				}

				if (var30 > 0 && var31 < 127 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 101
					class182.bufferX[var33] = var10 - 1; // L: 102
					class182.bufferY[var33] = var11 + 1; // L: 103
					var33 = var33 + 1 & 4095; // L: 104
					class182.directions[var30 - 1][var31 + 1] = 6; // L: 105
					class182.distances[var30 - 1][var31 + 1] = var21; // L: 106
				}

				if (var30 < 127 && var31 < 127 && class182.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 108
					class182.bufferX[var33] = var10 + 1; // L: 109
					class182.bufferY[var33] = var11 + 1; // L: 110
					var33 = var33 + 1 & 4095; // L: 111
					class182.directions[var30 + 1][var31 + 1] = 12; // L: 112
					class182.distances[var30 + 1][var31 + 1] = var21; // L: 113
				}
			}

			var28 = var29; // L: 120
		} else if (var2 == 2) { // L: 122
			var10 = var0; // L: 125
			var11 = var1; // L: 126
			var12 = 64; // L: 127
			var13 = 64; // L: 128
			var14 = var0 - var12; // L: 129
			var15 = var1 - var13; // L: 130
			class182.directions[var12][var13] = 99; // L: 131
			class182.distances[var12][var13] = 0; // L: 132
			var16 = 0; // L: 133
			var17 = 0; // L: 134
			class182.bufferX[var16] = var0; // L: 135
			var33 = var16 + 1;
			class182.bufferY[var16] = var1; // L: 136
			var18 = var4.flags; // L: 137

			while (true) {
				if (var33 == var17) { // L: 138
					Ignored.field3637 = var10; // L: 238
					class182.field2122 = var11; // L: 239
					var29 = false; // L: 240
					break;
				}

				var10 = class182.bufferX[var17]; // L: 139
				var11 = class182.bufferY[var17]; // L: 140
				var17 = var17 + 1 & 4095; // L: 141
				var30 = var10 - var14; // L: 142
				var31 = var11 - var15; // L: 143
				var19 = var10 - var4.xInset; // L: 144
				var20 = var11 - var4.yInset; // L: 145
				if (var3.hasArrived(2, var10, var11, var4)) { // L: 146
					Ignored.field3637 = var10; // L: 147
					class182.field2122 = var11; // L: 148
					var29 = true; // L: 149
					break;
				}

				var21 = class182.distances[var30][var31] + 1; // L: 152
				if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) { // L: 153 154 155 156
					class182.bufferX[var33] = var10 - 1; // L: 157
					class182.bufferY[var33] = var11; // L: 158
					var33 = var33 + 1 & 4095; // L: 159
					class182.directions[var30 - 1][var31] = 2; // L: 160
					class182.distances[var30 - 1][var31] = var21; // L: 161
				}

				if (var30 < 126 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) { // L: 163 164 165 166
					class182.bufferX[var33] = var10 + 1; // L: 167
					class182.bufferY[var33] = var11; // L: 168
					var33 = var33 + 1 & 4095; // L: 169
					class182.directions[var30 + 1][var31] = 8; // L: 170
					class182.distances[var30 + 1][var31] = var21; // L: 171
				}

				if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) { // L: 173 174 175 176
					class182.bufferX[var33] = var10; // L: 177
					class182.bufferY[var33] = var11 - 1; // L: 178
					var33 = var33 + 1 & 4095; // L: 179
					class182.directions[var30][var31 - 1] = 1; // L: 180
					class182.distances[var30][var31 - 1] = var21; // L: 181
				}

				if (var31 < 126 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) { // L: 183 184 185 186
					class182.bufferX[var33] = var10; // L: 187
					class182.bufferY[var33] = var11 + 1; // L: 188
					var33 = var33 + 1 & 4095; // L: 189
					class182.directions[var30][var31 + 1] = 4; // L: 190
					class182.distances[var30][var31 + 1] = var21; // L: 191
				}

				if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) { // L: 193 194 195 196 197
					class182.bufferX[var33] = var10 - 1; // L: 198
					class182.bufferY[var33] = var11 - 1; // L: 199
					var33 = var33 + 1 & 4095; // L: 200
					class182.directions[var30 - 1][var31 - 1] = 3; // L: 201
					class182.distances[var30 - 1][var31 - 1] = var21; // L: 202
				}

				if (var30 < 126 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) { // L: 204 205 206 207 208
					class182.bufferX[var33] = var10 + 1; // L: 209
					class182.bufferY[var33] = var11 - 1; // L: 210
					var33 = var33 + 1 & 4095; // L: 211
					class182.directions[var30 + 1][var31 - 1] = 9; // L: 212
					class182.distances[var30 + 1][var31 - 1] = var21; // L: 213
				}

				if (var30 > 0 && var31 < 126 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) { // L: 215 216 217 218 219
					class182.bufferX[var33] = var10 - 1; // L: 220
					class182.bufferY[var33] = var11 + 1; // L: 221
					var33 = var33 + 1 & 4095; // L: 222
					class182.directions[var30 - 1][var31 + 1] = 6; // L: 223
					class182.distances[var30 - 1][var31 + 1] = var21; // L: 224
				}

				if (var30 < 126 && var31 < 126 && class182.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) { // L: 226 227 228 229 230
					class182.bufferX[var33] = var10 + 1; // L: 231
					class182.bufferY[var33] = var11 + 1; // L: 232
					var33 = var33 + 1 & 4095; // L: 233
					class182.directions[var30 + 1][var31 + 1] = 12; // L: 234
					class182.distances[var30 + 1][var31 + 1] = var21; // L: 235
				}
			}

			var28 = var29; // L: 242
		} else {
			var10 = var0; // L: 247
			var11 = var1; // L: 248
			var12 = 64; // L: 249
			var13 = 64; // L: 250
			var14 = var0 - var12; // L: 251
			var15 = var1 - var13; // L: 252
			class182.directions[var12][var13] = 99; // L: 253
			class182.distances[var12][var13] = 0; // L: 254
			var16 = 0; // L: 255
			var17 = 0; // L: 256
			class182.bufferX[var16] = var0; // L: 257
			var33 = var16 + 1;
			class182.bufferY[var16] = var1; // L: 258
			var18 = var4.flags; // L: 259

			label761:
			while (true) {
				label759:
				while (true) {
					do {
						do {
							do {
								label736:
								do {
									if (var17 == var33) { // L: 260
										Ignored.field3637 = var10; // L: 380
										class182.field2122 = var11; // L: 381
										var29 = false; // L: 382
										break label761;
									}

									var10 = class182.bufferX[var17]; // L: 261
									var11 = class182.bufferY[var17]; // L: 262
									var17 = var17 + 1 & 4095; // L: 263
									var30 = var10 - var14; // L: 264
									var31 = var11 - var15; // L: 265
									var19 = var10 - var4.xInset; // L: 266
									var20 = var11 - var4.yInset; // L: 267
									if (var3.hasArrived(var2, var10, var11, var4)) { // L: 268
										Ignored.field3637 = var10; // L: 269
										class182.field2122 = var11; // L: 270
										var29 = true; // L: 271
										break label761;
									}

									var21 = class182.distances[var30][var31] + 1; // L: 274
									if (var30 > 0 && class182.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + var2 - 1] & 19136824) == 0) { // L: 275 276 277 278
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10 - 1; // L: 282
												class182.bufferY[var33] = var11; // L: 283
												var33 = var33 + 1 & 4095; // L: 284
												class182.directions[var30 - 1][var31] = 2; // L: 285
												class182.distances[var30 - 1][var31] = var21; // L: 286
												break;
											}

											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0) { // L: 280
												break;
											}

											++var22; // L: 279
										}
									}

									if (var30 < 128 - var2 && class182.directions[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) { // L: 288 289 290 291
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10 + 1; // L: 295
												class182.bufferY[var33] = var11; // L: 296
												var33 = var33 + 1 & 4095; // L: 297
												class182.directions[var30 + 1][var31] = 8; // L: 298
												class182.distances[var30 + 1][var31] = var21; // L: 299
												break;
											}

											if ((var18[var19 + var2][var20 + var22] & 19136995) != 0) { // L: 293
												break;
											}

											++var22; // L: 292
										}
									}

									if (var31 > 0 && class182.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) { // L: 301 302 303 304
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10; // L: 308
												class182.bufferY[var33] = var11 - 1; // L: 309
												var33 = var33 + 1 & 4095; // L: 310
												class182.directions[var30][var31 - 1] = 1; // L: 311
												class182.distances[var30][var31 - 1] = var21; // L: 312
												break;
											}

											if ((var18[var22 + var19][var20 - 1] & 19136911) != 0) { // L: 306
												break;
											}

											++var22; // L: 305
										}
									}

									if (var31 < 128 - var2 && class182.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + var2] & 19136824) == 0 && (var18[var19 + var2 - 1][var20 + var2] & 19136992) == 0) { // L: 314 315 316 317
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class182.bufferX[var33] = var10; // L: 321
												class182.bufferY[var33] = var11 + 1; // L: 322
												var33 = var33 + 1 & 4095; // L: 323
												class182.directions[var30][var31 + 1] = 4; // L: 324
												class182.distances[var30][var31 + 1] = var21; // L: 325
												break;
											}

											if ((var18[var19 + var22][var20 + var2] & 19137016) != 0) { // L: 319
												break;
											}

											++var22; // L: 318
										}
									}

									if (var30 > 0 && var31 > 0 && class182.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) { // L: 327 328 329
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class182.bufferX[var33] = var10 - 1; // L: 334
												class182.bufferY[var33] = var11 - 1; // L: 335
												var33 = var33 + 1 & 4095; // L: 336
												class182.directions[var30 - 1][var31 - 1] = 3; // L: 337
												class182.distances[var30 - 1][var31 - 1] = var21; // L: 338
												break;
											}

											if ((var18[var19 - 1][var22 + (var20 - 1)] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 - 1] & 19136911) != 0) { // L: 331 332
												break;
											}

											++var22; // L: 330
										}
									}

									if (var30 < 128 - var2 && var31 > 0 && class182.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) { // L: 340 341 342
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class182.bufferX[var33] = var10 + 1; // L: 347
												class182.bufferY[var33] = var11 - 1; // L: 348
												var33 = var33 + 1 & 4095; // L: 349
												class182.directions[var30 + 1][var31 - 1] = 9; // L: 350
												class182.distances[var30 + 1][var31 - 1] = var21; // L: 351
												break;
											}

											if ((var18[var19 + var2][var22 + (var20 - 1)] & 19136995) != 0 || (var18[var22 + var19][var20 - 1] & 19136911) != 0) { // L: 344 345
												break;
											}

											++var22; // L: 343
										}
									}

									if (var30 > 0 && var31 < 128 - var2 && class182.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) { // L: 353 354 355
										for (var22 = 1; var22 < var2; ++var22) { // L: 356
											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 + var2] & 19137016) != 0) { // L: 357 358
												continue label736;
											}
										}

										class182.bufferX[var33] = var10 - 1; // L: 360
										class182.bufferY[var33] = var11 + 1; // L: 361
										var33 = var33 + 1 & 4095; // L: 362
										class182.directions[var30 - 1][var31 + 1] = 6; // L: 363
										class182.distances[var30 - 1][var31 + 1] = var21; // L: 364
									}
								} while(var30 >= 128 - var2); // L: 366
							} while(var31 >= 128 - var2);
						} while(class182.directions[var30 + 1][var31 + 1] != 0); // L: 367
					} while((var18[var19 + var2][var20 + var2] & 19136992) != 0); // L: 368

					for (var22 = 1; var22 < var2; ++var22) { // L: 369
						if ((var18[var19 + var22][var20 + var2] & 19137016) != 0 || (var18[var19 + var2][var22 + var20] & 19136995) != 0) { // L: 370 371
							continue label759;
						}
					}

					class182.bufferX[var33] = var10 + 1; // L: 373
					class182.bufferY[var33] = var11 + 1; // L: 374
					var33 = var33 + 1 & 4095; // L: 375
					class182.directions[var30 + 1][var31 + 1] = 12; // L: 376
					class182.distances[var30 + 1][var31 + 1] = var21; // L: 377
				}
			}

			var28 = var29; // L: 384
		}

		var9 = var0 - 64; // L: 386
		var10 = var1 - 64; // L: 387
		var11 = Ignored.field3637; // L: 388
		var30 = class182.field2122; // L: 389
		if (!var28) { // L: 390
			var31 = Integer.MAX_VALUE; // L: 392
			var14 = Integer.MAX_VALUE; // L: 393
			byte var32 = 10; // L: 394
			var33 = var3.approxDestinationX; // L: 395
			var17 = var3.approxDestinationY; // L: 396
			int var27 = var3.approxDestinationSizeX; // L: 397
			var19 = var3.approxDestinationSizeY; // L: 398

			for (var20 = var33 - var32; var20 <= var32 + var33; ++var20) { // L: 399
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) { // L: 400
					var22 = var20 - var9; // L: 401
					int var23 = var21 - var10; // L: 402
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class182.distances[var22][var23] < 100) { // L: 403 404
						int var24 = 0; // L: 405
						if (var20 < var33) { // L: 406
							var24 = var33 - var20;
						} else if (var20 > var27 + var33 - 1) { // L: 407
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0; // L: 408
						if (var21 < var17) { // L: 409
							var25 = var17 - var21;
						} else if (var21 > var19 + var17 - 1) { // L: 410
							var25 = var21 - (var17 + var19 - 1);
						}

						int var26 = var25 * var25 + var24 * var24; // L: 411
						if (var26 < var31 || var31 == var26 && class182.distances[var22][var23] < var14) { // L: 412
							var31 = var26; // L: 413
							var14 = class182.distances[var22][var23]; // L: 414
							var11 = var20; // L: 415
							var30 = var21; // L: 416
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) { // L: 422
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) { // L: 426
			return 0;
		} else {
			var13 = 0; // L: 427
			class182.bufferX[var13] = var11; // L: 430
			var31 = var13 + 1;
			class182.bufferY[var13] = var30; // L: 431

			for (var14 = var15 = class182.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class182.directions[var11 - var9][var30 - var10]) { // L: 432 433 443
				if (var14 != var15) { // L: 434
					var15 = var14; // L: 435
					class182.bufferX[var31] = var11; // L: 436
					class182.bufferY[var31++] = var30; // L: 437
				}

				if ((var14 & 2) != 0) { // L: 439
					++var11;
				} else if ((var14 & 8) != 0) { // L: 440
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 441
					++var30;
				} else if ((var14 & 4) != 0) { // L: 442
					--var30;
				}
			}

			var33 = 0; // L: 445

			while (var31-- > 0) { // L: 446
				var6[var33] = class182.bufferX[var31]; // L: 447
				var7[var33++] = class182.bufferY[var31]; // L: 448
				if (var33 >= var6.length) { // L: 449
					break;
				}
			}

			return var33; // L: 451
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1942502942"
	)
	public static String method1324(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static final void method1317() {
		int[] var0 = Players.Players_indices; // L: 3667

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3668
			Player var4 = Client.players[var0[var1]]; // L: 3669
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3670
				--var4.overheadTextCyclesRemaining; // L: 3671
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3672
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3675
			int var2 = Client.npcIndices[var1]; // L: 3676
			NPC var3 = Client.npcs[var2]; // L: 3677
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3678
				--var3.overheadTextCyclesRemaining; // L: 3679
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3680
					var3.overheadText = null;
				}
			}
		}

	} // L: 3683
}
