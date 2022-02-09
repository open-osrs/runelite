import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12227

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgi;S)Z",
		garbageValue = "-10612"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12231
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)V",
		garbageValue = "530302706"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 191
		if (var2) { // L: 192
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 193
		Player var4 = Client.players[var1]; // L: 194
		if (var3 == 0) { // L: 195
			if (var2) { // L: 196
				var4.field1067 = false; // L: 197
			} else if (Client.localPlayerIndex == var1) { // L: 200
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class118.baseY + var4.pathY[0] >> 13) + (Canvas.baseX + var4.pathX[0] >> 13 << 14); // L: 201
				if (var4.field1138 != -1) { // L: 202
					Players.Players_orientations[var1] = var4.field1138;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 203
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 204
				Client.players[var1] = null; // L: 205
				if (var0.readBits(1) != 0) { // L: 206
					class16.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 209
				var5 = var0.readBits(3); // L: 210
				var6 = var4.pathX[0]; // L: 211
				var7 = var4.pathY[0]; // L: 212
				if (var5 == 0) { // L: 213
					--var6; // L: 214
					--var7; // L: 215
				} else if (var5 == 1) { // L: 217
					--var7;
				} else if (var5 == 2) { // L: 218
					++var6; // L: 219
					--var7; // L: 220
				} else if (var5 == 3) { // L: 222
					--var6;
				} else if (var5 == 4) { // L: 223
					++var6;
				} else if (var5 == 5) { // L: 224
					--var6; // L: 225
					++var7; // L: 226
				} else if (var5 == 6) { // L: 228
					++var7;
				} else if (var5 == 7) { // L: 229
					++var6; // L: 230
					++var7; // L: 231
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 233
					var4.resetPath(var6, var7); // L: 234
					var4.field1067 = false; // L: 235
				} else if (var2) { // L: 237
					var4.field1067 = true; // L: 238
					var4.tileX = var6; // L: 239
					var4.tileY = var7; // L: 240
				} else {
					var4.field1067 = false; // L: 243
					var4.method2122(var6, var7, Players.field1277[var1]); // L: 244
				}

			} else if (var3 == 2) { // L: 248
				var5 = var0.readBits(4); // L: 249
				var6 = var4.pathX[0]; // L: 250
				var7 = var4.pathY[0]; // L: 251
				if (var5 == 0) { // L: 252
					var6 -= 2; // L: 253
					var7 -= 2; // L: 254
				} else if (var5 == 1) { // L: 256
					--var6; // L: 257
					var7 -= 2; // L: 258
				} else if (var5 == 2) { // L: 260
					var7 -= 2;
				} else if (var5 == 3) { // L: 261
					++var6; // L: 262
					var7 -= 2; // L: 263
				} else if (var5 == 4) { // L: 265
					var6 += 2; // L: 266
					var7 -= 2; // L: 267
				} else if (var5 == 5) { // L: 269
					var6 -= 2; // L: 270
					--var7; // L: 271
				} else if (var5 == 6) { // L: 273
					var6 += 2; // L: 274
					--var7; // L: 275
				} else if (var5 == 7) { // L: 277
					var6 -= 2;
				} else if (var5 == 8) { // L: 278
					var6 += 2;
				} else if (var5 == 9) { // L: 279
					var6 -= 2; // L: 280
					++var7; // L: 281
				} else if (var5 == 10) { // L: 283
					var6 += 2; // L: 284
					++var7; // L: 285
				} else if (var5 == 11) { // L: 287
					var6 -= 2; // L: 288
					var7 += 2; // L: 289
				} else if (var5 == 12) { // L: 291
					--var6; // L: 292
					var7 += 2; // L: 293
				} else if (var5 == 13) { // L: 295
					var7 += 2;
				} else if (var5 == 14) { // L: 296
					++var6; // L: 297
					var7 += 2; // L: 298
				} else if (var5 == 15) { // L: 300
					var6 += 2; // L: 301
					var7 += 2; // L: 302
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 304
					var4.resetPath(var6, var7); // L: 305
					var4.field1067 = false; // L: 306
				} else if (var2) { // L: 308
					var4.field1067 = true; // L: 309
					var4.tileX = var6; // L: 310
					var4.tileY = var7; // L: 311
				} else {
					var4.field1067 = false; // L: 314
					var4.method2122(var6, var7, Players.field1277[var1]); // L: 315
				}

			} else {
				var5 = var0.readBits(1); // L: 319
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 320
					var6 = var0.readBits(12); // L: 321
					var7 = var6 >> 10; // L: 322
					var8 = var6 >> 5 & 31; // L: 323
					if (var8 > 15) { // L: 324
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 325
					if (var9 > 15) { // L: 326
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 327
					var11 = var9 + var4.pathY[0]; // L: 328
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 329
						var4.resetPath(var10, var11); // L: 330
						var4.field1067 = false; // L: 331
					} else if (var2) { // L: 333
						var4.field1067 = true; // L: 334
						var4.tileX = var10; // L: 335
						var4.tileY = var11; // L: 336
					} else {
						var4.field1067 = false; // L: 339
						var4.method2122(var10, var11, Players.field1277[var1]); // L: 340
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 342
					if (Client.localPlayerIndex == var1) { // L: 343
						SoundSystem.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 346
					var7 = var6 >> 28; // L: 347
					var8 = var6 >> 14 & 16383; // L: 348
					var9 = var6 & 16383; // L: 349
					var10 = (var8 + Canvas.baseX + var4.pathX[0] & 16383) - Canvas.baseX; // L: 350
					var11 = (var9 + class118.baseY + var4.pathY[0] & 16383) - class118.baseY; // L: 351
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 352
						var4.resetPath(var10, var11); // L: 353
						var4.field1067 = false; // L: 354
					} else if (var2) { // L: 356
						var4.field1067 = true; // L: 357
						var4.tileX = var10; // L: 358
						var4.tileY = var11; // L: 359
					} else {
						var4.field1067 = false; // L: 362
						var4.method2122(var10, var11, Players.field1277[var1]); // L: 363
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 365
					if (Client.localPlayerIndex == var1) { // L: 366
						SoundSystem.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 198 207 246 317 344 367
}
