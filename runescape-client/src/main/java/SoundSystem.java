import java.awt.Component;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static StudioGame field461;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -27903763
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class266.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Leo;",
		garbageValue = "-1234409963"
	)
	public static FloorOverlayDefinition method807(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class142.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILfc;Lfz;Z[I[II)I",
		garbageValue = "1972841264"
	)
	public static int method808(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class159.directions[var8][var9] = 0; // L: 21
				class159.distances[var8][var9] = 99999999; // L: 22
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
		if (var2 == 1) { // L: 26
			var10 = var0; // L: 29
			var11 = var1; // L: 30
			var12 = 64;
			var13 = 64; // L: 32
			var14 = var0 - var12;
			var15 = var1 - var13;
			class159.directions[var12][var13] = 99;
			class159.distances[var12][var13] = 0;
			var16 = 0;
			var17 = 0;
			class159.bufferX[var16] = var0;
			var33 = var16 + 1;
			class159.bufferY[var16] = var1;
			var18 = var4.flags;

			while (true) {
				if (var33 == var17) {
					UserComparator10.field1457 = var10; // L: 116
					FaceNormal.field2363 = var11; // L: 117
					var29 = false; // L: 118
					break;
				}

				var10 = class159.bufferX[var17];
				var11 = class159.bufferY[var17];
				var17 = var17 + 1 & 4095;
				var30 = var10 - var14; // L: 48
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(1, var10, var11, var4)) { // L: 52
					UserComparator10.field1457 = var10; // L: 53
					FaceNormal.field2363 = var11; // L: 54
					var29 = true;
					break;
				}

				var21 = class159.distances[var30][var31] + 1; // L: 58
				if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) {
					class159.bufferX[var33] = var10 - 1; // L: 60
					class159.bufferY[var33] = var11; // L: 61
					var33 = var33 + 1 & 4095; // L: 62
					class159.directions[var30 - 1][var31] = 2; // L: 63
					class159.distances[var30 - 1][var31] = var21; // L: 64
				}

				if (var30 < 127 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) { // L: 66
					class159.bufferX[var33] = var10 + 1; // L: 67
					class159.bufferY[var33] = var11; // L: 68
					var33 = var33 + 1 & 4095; // L: 69
					class159.directions[var30 + 1][var31] = 8; // L: 70
					class159.distances[var30 + 1][var31] = var21; // L: 71
				}

				if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 73
					class159.bufferX[var33] = var10; // L: 74
					class159.bufferY[var33] = var11 - 1; // L: 75
					var33 = var33 + 1 & 4095; // L: 76
					class159.directions[var30][var31 - 1] = 1; // L: 77
					class159.distances[var30][var31 - 1] = var21; // L: 78
				}

				if (var31 < 127 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 80
					class159.bufferX[var33] = var10; // L: 81
					class159.bufferY[var33] = var11 + 1; // L: 82
					var33 = var33 + 1 & 4095; // L: 83
					class159.directions[var30][var31 + 1] = 4; // L: 84
					class159.distances[var30][var31 + 1] = var21; // L: 85
				}

				if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 87
					class159.bufferX[var33] = var10 - 1; // L: 88
					class159.bufferY[var33] = var11 - 1; // L: 89
					var33 = var33 + 1 & 4095; // L: 90
					class159.directions[var30 - 1][var31 - 1] = 3; // L: 91
					class159.distances[var30 - 1][var31 - 1] = var21; // L: 92
				}

				if (var30 < 127 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 94
					class159.bufferX[var33] = var10 + 1; // L: 95
					class159.bufferY[var33] = var11 - 1; // L: 96
					var33 = var33 + 1 & 4095; // L: 97
					class159.directions[var30 + 1][var31 - 1] = 9; // L: 98
					class159.distances[var30 + 1][var31 - 1] = var21; // L: 99
				}

				if (var30 > 0 && var31 < 127 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 101
					class159.bufferX[var33] = var10 - 1; // L: 102
					class159.bufferY[var33] = var11 + 1; // L: 103
					var33 = var33 + 1 & 4095; // L: 104
					class159.directions[var30 - 1][var31 + 1] = 6; // L: 105
					class159.distances[var30 - 1][var31 + 1] = var21; // L: 106
				}

				if (var30 < 127 && var31 < 127 && class159.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 108
					class159.bufferX[var33] = var10 + 1; // L: 109
					class159.bufferY[var33] = var11 + 1; // L: 110
					var33 = var33 + 1 & 4095; // L: 111
					class159.directions[var30 + 1][var31 + 1] = 12; // L: 112
					class159.distances[var30 + 1][var31 + 1] = var21; // L: 113
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
			class159.directions[var12][var13] = 99; // L: 131
			class159.distances[var12][var13] = 0; // L: 132
			var16 = 0; // L: 133
			var17 = 0; // L: 134
			class159.bufferX[var16] = var0; // L: 135
			var33 = var16 + 1;
			class159.bufferY[var16] = var1; // L: 136
			var18 = var4.flags; // L: 137

			while (true) {
				if (var33 == var17) { // L: 138
					UserComparator10.field1457 = var10; // L: 238
					FaceNormal.field2363 = var11; // L: 239
					var29 = false; // L: 240
					break;
				}

				var10 = class159.bufferX[var17]; // L: 139
				var11 = class159.bufferY[var17]; // L: 140
				var17 = var17 + 1 & 4095; // L: 141
				var30 = var10 - var14; // L: 142
				var31 = var11 - var15; // L: 143
				var19 = var10 - var4.xInset; // L: 144
				var20 = var11 - var4.yInset; // L: 145
				if (var3.hasArrived(2, var10, var11, var4)) { // L: 146
					UserComparator10.field1457 = var10; // L: 147
					FaceNormal.field2363 = var11; // L: 148
					var29 = true; // L: 149
					break;
				}

				var21 = class159.distances[var30][var31] + 1; // L: 152
				if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) { // L: 153 154 155
					class159.bufferX[var33] = var10 - 1;
					class159.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class159.directions[var30 - 1][var31] = 2; // L: 160
					class159.distances[var30 - 1][var31] = var21; // L: 161
				}

				if (var30 < 126 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) { // L: 163 164 165 166
					class159.bufferX[var33] = var10 + 1; // L: 167
					class159.bufferY[var33] = var11; // L: 168
					var33 = var33 + 1 & 4095; // L: 169
					class159.directions[var30 + 1][var31] = 8; // L: 170
					class159.distances[var30 + 1][var31] = var21; // L: 171
				}

				if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) { // L: 173 174 175 176
					class159.bufferX[var33] = var10; // L: 177
					class159.bufferY[var33] = var11 - 1; // L: 178
					var33 = var33 + 1 & 4095; // L: 179
					class159.directions[var30][var31 - 1] = 1; // L: 180
					class159.distances[var30][var31 - 1] = var21; // L: 181
				}

				if (var31 < 126 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) { // L: 183 184 185 186
					class159.bufferX[var33] = var10; // L: 187
					class159.bufferY[var33] = var11 + 1; // L: 188
					var33 = var33 + 1 & 4095; // L: 189
					class159.directions[var30][var31 + 1] = 4; // L: 190
					class159.distances[var30][var31 + 1] = var21; // L: 191
				}

				if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) { // L: 193 194 195 196 197
					class159.bufferX[var33] = var10 - 1; // L: 198
					class159.bufferY[var33] = var11 - 1; // L: 199
					var33 = var33 + 1 & 4095; // L: 200
					class159.directions[var30 - 1][var31 - 1] = 3; // L: 201
					class159.distances[var30 - 1][var31 - 1] = var21; // L: 202
				}

				if (var30 < 126 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) { // L: 204 205 206 207 208
					class159.bufferX[var33] = var10 + 1; // L: 209
					class159.bufferY[var33] = var11 - 1; // L: 210
					var33 = var33 + 1 & 4095; // L: 211
					class159.directions[var30 + 1][var31 - 1] = 9; // L: 212
					class159.distances[var30 + 1][var31 - 1] = var21; // L: 213
				}

				if (var30 > 0 && var31 < 126 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) { // L: 215 216 217 218 219
					class159.bufferX[var33] = var10 - 1; // L: 220
					class159.bufferY[var33] = var11 + 1; // L: 221
					var33 = var33 + 1 & 4095; // L: 222
					class159.directions[var30 - 1][var31 + 1] = 6; // L: 223
					class159.distances[var30 - 1][var31 + 1] = var21; // L: 224
				}

				if (var30 < 126 && var31 < 126 && class159.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) { // L: 226 227 228 229 230
					class159.bufferX[var33] = var10 + 1; // L: 231
					class159.bufferY[var33] = var11 + 1; // L: 232
					var33 = var33 + 1 & 4095; // L: 233
					class159.directions[var30 + 1][var31 + 1] = 12; // L: 234
					class159.distances[var30 + 1][var31 + 1] = var21; // L: 235
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
			class159.directions[var12][var13] = 99; // L: 253
			class159.distances[var12][var13] = 0; // L: 254
			var16 = 0; // L: 255
			var17 = 0; // L: 256
			class159.bufferX[var16] = var0; // L: 257
			var33 = var16 + 1;
			class159.bufferY[var16] = var1; // L: 258
			var18 = var4.flags; // L: 259

			label768:
			while (true) {
				label766:
				while (true) {
					do {
						do {
							do {
								label743:
								do {
									if (var17 == var33) { // L: 260
										UserComparator10.field1457 = var10; // L: 380
										FaceNormal.field2363 = var11; // L: 381
										var29 = false; // L: 382
										break label768;
									}

									var10 = class159.bufferX[var17]; // L: 261
									var11 = class159.bufferY[var17]; // L: 262
									var17 = var17 + 1 & 4095; // L: 263
									var30 = var10 - var14; // L: 264
									var31 = var11 - var15; // L: 265
									var19 = var10 - var4.xInset; // L: 266
									var20 = var11 - var4.yInset; // L: 267
									if (var3.hasArrived(var2, var10, var11, var4)) { // L: 268
										UserComparator10.field1457 = var10; // L: 269
										FaceNormal.field2363 = var11; // L: 270
										var29 = true; // L: 271
										break label768;
									}

									var21 = class159.distances[var30][var31] + 1; // L: 274
									if (var30 > 0 && class159.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + var2 - 1] & 19136824) == 0) { // L: 275 276 277 278
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10 - 1; // L: 282
												class159.bufferY[var33] = var11; // L: 283
												var33 = var33 + 1 & 4095; // L: 284
												class159.directions[var30 - 1][var31] = 2; // L: 285
												class159.distances[var30 - 1][var31] = var21; // L: 286
												break;
											}

											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0) { // L: 280
												break;
											}

											++var22; // L: 279
										}
									}

									if (var30 < 128 - var2 && class159.directions[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) { // L: 288 289 290 291
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10 + 1; // L: 295
												class159.bufferY[var33] = var11; // L: 296
												var33 = var33 + 1 & 4095; // L: 297
												class159.directions[var30 + 1][var31] = 8; // L: 298
												class159.distances[var30 + 1][var31] = var21; // L: 299
												break;
											}

											if ((var18[var19 + var2][var22 + var20] & 19136995) != 0) { // L: 293
												break;
											}

											++var22; // L: 292
										}
									}

									if (var31 > 0 && class159.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) { // L: 301 302 303 304
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10; // L: 308
												class159.bufferY[var33] = var11 - 1; // L: 309
												var33 = var33 + 1 & 4095; // L: 310
												class159.directions[var30][var31 - 1] = 1; // L: 311
												class159.distances[var30][var31 - 1] = var21; // L: 312
												break;
											}

											if ((var18[var19 + var22][var20 - 1] & 19136911) != 0) { // L: 306
												break;
											}

											++var22; // L: 305
										}
									}

									if (var31 < 128 - var2 && class159.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + var2] & 19136824) == 0 && (var18[var19 + var2 - 1][var20 + var2] & 19136992) == 0) { // L: 314 315 316 317
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class159.bufferX[var33] = var10; // L: 321
												class159.bufferY[var33] = var11 + 1; // L: 322
												var33 = var33 + 1 & 4095; // L: 323
												class159.directions[var30][var31 + 1] = 4; // L: 324
												class159.distances[var30][var31 + 1] = var21; // L: 325
												break;
											}

											if ((var18[var22 + var19][var20 + var2] & 19137016) != 0) { // L: 319
												break;
											}

											++var22; // L: 318
										}
									}

									if (var30 > 0 && var31 > 0 && class159.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) { // L: 327 328 329
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class159.bufferX[var33] = var10 - 1; // L: 334
												class159.bufferY[var33] = var11 - 1; // L: 335
												var33 = var33 + 1 & 4095; // L: 336
												class159.directions[var30 - 1][var31 - 1] = 3; // L: 337
												class159.distances[var30 - 1][var31 - 1] = var21; // L: 338
												break;
											}

											if ((var18[var19 - 1][var22 + (var20 - 1)] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 - 1] & 19136911) != 0) { // L: 331 332
												break;
											}

											++var22; // L: 330
										}
									}

									if (var30 < 128 - var2 && var31 > 0 && class159.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) { // L: 340 341 342
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class159.bufferX[var33] = var10 + 1; // L: 347
												class159.bufferY[var33] = var11 - 1; // L: 348
												var33 = var33 + 1 & 4095; // L: 349
												class159.directions[var30 + 1][var31 - 1] = 9; // L: 350
												class159.distances[var30 + 1][var31 - 1] = var21; // L: 351
												break;
											}

											if ((var18[var19 + var2][var22 + (var20 - 1)] & 19136995) != 0 || (var18[var19 + var22][var20 - 1] & 19136911) != 0) { // L: 344 345
												break;
											}

											++var22; // L: 343
										}
									}

									if (var30 > 0 && var31 < 128 - var2 && class159.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) { // L: 353 354 355
										for (var22 = 1; var22 < var2; ++var22) { // L: 356
											if ((var18[var19 - 1][var20 + var22] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 + var2] & 19137016) != 0) { // L: 357 358
												continue label743;
											}
										}

										class159.bufferX[var33] = var10 - 1; // L: 360
										class159.bufferY[var33] = var11 + 1; // L: 361
										var33 = var33 + 1 & 4095; // L: 362
										class159.directions[var30 - 1][var31 + 1] = 6; // L: 363
										class159.distances[var30 - 1][var31 + 1] = var21; // L: 364
									}
								} while(var30 >= 128 - var2); // L: 366
							} while(var31 >= 128 - var2);
						} while(class159.directions[var30 + 1][var31 + 1] != 0); // L: 367
					} while((var18[var19 + var2][var20 + var2] & 19136992) != 0); // L: 368

					for (var22 = 1; var22 < var2; ++var22) { // L: 369
						if ((var18[var22 + var19][var20 + var2] & 19137016) != 0 || (var18[var19 + var2][var22 + var20] & 19136995) != 0) { // L: 370 371
							continue label766;
						}
					}

					class159.bufferX[var33] = var10 + 1; // L: 373
					class159.bufferY[var33] = var11 + 1; // L: 374
					var33 = var33 + 1 & 4095; // L: 375
					class159.directions[var30 + 1][var31 + 1] = 12; // L: 376
					class159.distances[var30 + 1][var31 + 1] = var21; // L: 377
				}
			}

			var28 = var29; // L: 384
		}

		var9 = var0 - 64; // L: 386
		var10 = var1 - 64; // L: 387
		var11 = UserComparator10.field1457; // L: 388
		var30 = FaceNormal.field2363; // L: 389
		if (!var28) { // L: 390
			var31 = Integer.MAX_VALUE; // L: 392
			var14 = Integer.MAX_VALUE; // L: 393
			byte var32 = 10; // L: 394
			var33 = var3.approxDestinationX; // L: 395
			var17 = var3.approxDestinationY; // L: 396
			int var27 = var3.approxDestinationSizeX; // L: 397
			var19 = var3.approxDestinationSizeY; // L: 398

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) { // L: 399
				for (var21 = var17 - var32; var21 <= var32 + var17; ++var21) { // L: 400
					var22 = var20 - var9; // L: 401
					int var23 = var21 - var10; // L: 402
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class159.distances[var22][var23] < 100) { // L: 403 404
						int var24 = 0; // L: 405
						if (var20 < var33) { // L: 406
							var24 = var33 - var20;
						} else if (var20 > var33 + var27 - 1) { // L: 407
							var24 = var20 - (var33 + var27 - 1);
						}

						int var25 = 0; // L: 408
						if (var21 < var17) { // L: 409
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) { // L: 410
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var25 * var25 + var24 * var24; // L: 411
						if (var26 < var31 || var31 == var26 && class159.distances[var22][var23] < var14) { // L: 412
							var31 = var26; // L: 413
							var14 = class159.distances[var22][var23]; // L: 414
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
			class159.bufferX[var13] = var11; // L: 430
			var31 = var13 + 1;
			class159.bufferY[var13] = var30; // L: 431

			for (var14 = var15 = class159.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class159.directions[var11 - var9][var30 - var10]) { // L: 432 433 443
				if (var14 != var15) { // L: 434
					var15 = var14; // L: 435
					class159.bufferX[var31] = var11; // L: 436
					class159.bufferY[var31++] = var30; // L: 437
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
				var6[var33] = class159.bufferX[var31]; // L: 447
				var7[var33++] = class159.bufferY[var31]; // L: 448
				if (var33 >= var6.length) { // L: 449
					break;
				}
			}

			return var33; // L: 451
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2145982637"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (MilliClock.World_request == null) { // L: 31
				MilliClock.World_request = ServerPacket.urlRequester.request(new URL(class6.field58));
			} else if (MilliClock.World_request.isDone()) { // L: 33
				byte[] var0 = MilliClock.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				Tiles.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = Tiles.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				SoundCache.sortWorlds(Tiles.World_worlds, 0, Tiles.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				MilliClock.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			MilliClock.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-28"
	)
	static void method803(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 156
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 157
		KeyHandler.field288 = -1; // L: 158
	} // L: 159

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-61"
	)
	static final int method806(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 828
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 829
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZLnb;I)V",
		garbageValue = "-964489928"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field762 = 0; // L: 7327
		Client.field685 = 0; // L: 7328
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 7330
		var2.importIndex(); // L: 7331
		int var3 = var2.readBits(8); // L: 7332
		int var4;
		if (var3 < Client.npcCount) { // L: 7333
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 7334
				Client.field771[++Client.field762 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 7336
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7337

			int var5;
			int var7;
			int var8;
			int var9;
			for (var4 = 0; var4 < var3; ++var4) { // L: 7338
				var5 = Client.npcIndices[var4]; // L: 7339
				NPC var14 = Client.npcs[var5]; // L: 7340
				var7 = var2.readBits(1); // L: 7341
				if (var7 == 0) { // L: 7342
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7343
					var14.npcCycle = Client.cycle; // L: 7344
				} else {
					var8 = var2.readBits(2); // L: 7347
					if (var8 == 0) { // L: 7348
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7349
						var14.npcCycle = Client.cycle; // L: 7350
						Client.field686[++Client.field685 - 1] = var5; // L: 7351
					} else {
						int var10;
						if (var8 == 1) { // L: 7354
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7355
							var14.npcCycle = Client.cycle; // L: 7356
							var9 = var2.readBits(3); // L: 7357
							var14.method2259(var9, (byte)1); // L: 7358
							var10 = var2.readBits(1); // L: 7359
							if (var10 == 1) { // L: 7360
								Client.field686[++Client.field685 - 1] = var5;
							}
						} else if (var8 == 2) { // L: 7363
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 7364
							var14.npcCycle = Client.cycle; // L: 7365
							var9 = var2.readBits(3); // L: 7366
							var14.method2259(var9, (byte)2); // L: 7367
							var10 = var2.readBits(3); // L: 7368
							var14.method2259(var10, (byte)2); // L: 7369
							int var11 = var2.readBits(1); // L: 7370
							if (var11 == 1) { // L: 7371
								Client.field686[++Client.field685 - 1] = var5;
							}
						} else if (var8 == 3) { // L: 7374
							Client.field771[++Client.field762 - 1] = var5; // L: 7375
						}
					}
				}
			}

			int var12;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7382
				var12 = var1.readBits(15); // L: 7383
				if (var12 == 32767) { // L: 7384
					break;
				}

				boolean var15 = false; // L: 7385
				if (Client.npcs[var12] == null) { // L: 7386
					Client.npcs[var12] = new NPC(); // L: 7387
					var15 = true; // L: 7388
				}

				NPC var13 = Client.npcs[var12]; // L: 7390
				Client.npcIndices[++Client.npcCount - 1] = var12; // L: 7391
				var13.npcCycle = Client.cycle; // L: 7392
				var13.definition = StructComposition.getNpcDefinition(var1.readBits(14)); // L: 7396
				if (var0) { // L: 7397
					var7 = var1.readBits(8); // L: 7398
					if (var7 > 127) { // L: 7399
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5); // L: 7402
					if (var7 > 15) { // L: 7403
						var7 -= 32;
					}
				}

				int var6;
				if (var0) { // L: 7405
					var6 = var1.readBits(8); // L: 7406
					if (var6 > 127) { // L: 7407
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5); // L: 7410
					if (var6 > 15) { // L: 7411
						var6 -= 32;
					}
				}

				var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7413
				if (var15) { // L: 7414
					var13.orientation = var13.rotation = var8;
				}

				var9 = var1.readBits(1); // L: 7415
				if (var9 == 1) { // L: 7416
					Client.field686[++Client.field685 - 1] = var12;
				}

				boolean var16 = var1.readBits(1) == 1; // L: 7417
				if (var16) { // L: 7418
					var1.readBits(32); // L: 7419
				}

				var5 = var1.readBits(1); // L: 7421
				var13.field1239 = var13.definition.size; // L: 7422
				var13.field1289 = var13.definition.rotation; // L: 7423
				if (var13.field1289 == 0) { // L: 7424
					var13.rotation = 0;
				}

				var13.walkSequence = var13.definition.walkSequence; // L: 7425
				var13.walkBackSequence = var13.definition.walkBackSequence; // L: 7426
				var13.walkLeftSequence = var13.definition.walkLeftSequence; // L: 7427
				var13.walkRightSequence = var13.definition.walkRightSequence; // L: 7428
				var13.idleSequence = var13.definition.idleSequence; // L: 7429
				var13.turnLeftSequence = var13.definition.turnLeftSequence; // L: 7430
				var13.turnRightSequence = var13.definition.turnRightSequence; // L: 7431
				var13.method2260(class93.localPlayer.pathX[0] + var6, class93.localPlayer.pathY[0] + var7, var5 == 1); // L: 7432
			}

			var1.exportIndex(); // L: 7434
			ScriptEvent.method2094(var1); // L: 7436

			for (var12 = 0; var12 < Client.field762; ++var12) { // L: 7437
				var3 = Client.field771[var12]; // L: 7438
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7439
					Client.npcs[var3].definition = null; // L: 7440
					Client.npcs[var3] = null; // L: 7441
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7444
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) { // L: 7445
					if (Client.npcs[Client.npcIndices[var12]] == null) { // L: 7446
						throw new RuntimeException(var12 + "," + Client.npcCount); // L: 7447
					}
				}

			}
		}
	} // L: 7450
}
