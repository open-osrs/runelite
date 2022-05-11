import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class230 {
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2086809951
	)
	static int field2807;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)V",
		garbageValue = "1853715963"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 197
		if (var2) { // L: 198
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 199
		Player var4 = Client.players[var1]; // L: 200
		if (var3 == 0) { // L: 201
			if (var2) { // L: 202
				var4.field1095 = false; // L: 203
			} else if (Client.localPlayerIndex == var1) { // L: 206
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (SecureRandomCallable.baseX + var4.pathX[0] >> 13 << 14) + (GrandExchangeOfferOwnWorldComparator.baseY + var4.pathY[0] >> 13); // L: 207
				if (var4.field1172 != -1) { // L: 208
					Players.Players_orientations[var1] = var4.field1172;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 209
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 210
				Client.players[var1] = null; // L: 211
				if (var0.readBits(1) != 0) { // L: 212
					FloorUnderlayDefinition.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 215
				var5 = var0.readBits(3); // L: 216
				var6 = var4.pathX[0]; // L: 217
				var7 = var4.pathY[0]; // L: 218
				if (var5 == 0) { // L: 219
					--var6; // L: 220
					--var7; // L: 221
				} else if (var5 == 1) { // L: 223
					--var7;
				} else if (var5 == 2) { // L: 224
					++var6; // L: 225
					--var7; // L: 226
				} else if (var5 == 3) { // L: 228
					--var6;
				} else if (var5 == 4) { // L: 229
					++var6;
				} else if (var5 == 5) { // L: 230
					--var6; // L: 231
					++var7; // L: 232
				} else if (var5 == 6) { // L: 234
					++var7;
				} else if (var5 == 7) { // L: 235
					++var6; // L: 236
					++var7; // L: 237
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 239
					var4.resetPath(var6, var7); // L: 240
					var4.field1095 = false; // L: 241
				} else if (var2) { // L: 243
					var4.field1095 = true; // L: 244
					var4.tileX = var6; // L: 245
					var4.tileY = var7; // L: 246
				} else {
					var4.field1095 = false; // L: 249
					var4.method2117(var6, var7, Players.field1302[var1]); // L: 250
				}

			} else if (var3 == 2) { // L: 254
				var5 = var0.readBits(4); // L: 255
				var6 = var4.pathX[0]; // L: 256
				var7 = var4.pathY[0]; // L: 257
				if (var5 == 0) { // L: 258
					var6 -= 2; // L: 259
					var7 -= 2; // L: 260
				} else if (var5 == 1) { // L: 262
					--var6; // L: 263
					var7 -= 2; // L: 264
				} else if (var5 == 2) { // L: 266
					var7 -= 2;
				} else if (var5 == 3) { // L: 267
					++var6; // L: 268
					var7 -= 2; // L: 269
				} else if (var5 == 4) { // L: 271
					var6 += 2; // L: 272
					var7 -= 2; // L: 273
				} else if (var5 == 5) { // L: 275
					var6 -= 2; // L: 276
					--var7; // L: 277
				} else if (var5 == 6) { // L: 279
					var6 += 2; // L: 280
					--var7; // L: 281
				} else if (var5 == 7) { // L: 283
					var6 -= 2;
				} else if (var5 == 8) { // L: 284
					var6 += 2;
				} else if (var5 == 9) { // L: 285
					var6 -= 2; // L: 286
					++var7; // L: 287
				} else if (var5 == 10) { // L: 289
					var6 += 2; // L: 290
					++var7; // L: 291
				} else if (var5 == 11) { // L: 293
					var6 -= 2; // L: 294
					var7 += 2; // L: 295
				} else if (var5 == 12) { // L: 297
					--var6; // L: 298
					var7 += 2; // L: 299
				} else if (var5 == 13) { // L: 301
					var7 += 2;
				} else if (var5 == 14) { // L: 302
					++var6; // L: 303
					var7 += 2; // L: 304
				} else if (var5 == 15) { // L: 306
					var6 += 2; // L: 307
					var7 += 2; // L: 308
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 310
					var4.resetPath(var6, var7); // L: 311
					var4.field1095 = false; // L: 312
				} else if (var2) { // L: 314
					var4.field1095 = true; // L: 315
					var4.tileX = var6; // L: 316
					var4.tileY = var7; // L: 317
				} else {
					var4.field1095 = false; // L: 320
					var4.method2117(var6, var7, Players.field1302[var1]); // L: 321
				}

			} else {
				var5 = var0.readBits(1); // L: 325
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 326
					var6 = var0.readBits(12); // L: 327
					var7 = var6 >> 10; // L: 328
					var8 = var6 >> 5 & 31; // L: 329
					if (var8 > 15) { // L: 330
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 331
					if (var9 > 15) { // L: 332
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 333
					var11 = var9 + var4.pathY[0]; // L: 334
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 335
						if (var2) { // L: 339
							var4.field1095 = true; // L: 340
							var4.tileX = var10; // L: 341
							var4.tileY = var11; // L: 342
						} else {
							var4.field1095 = false; // L: 345
							var4.method2117(var10, var11, Players.field1302[var1]); // L: 346
						}
					} else {
						var4.resetPath(var10, var11); // L: 336
						var4.field1095 = false; // L: 337
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 348
					if (Client.localPlayerIndex == var1) { // L: 349
						class128.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 352
					var7 = var6 >> 28; // L: 353
					var8 = var6 >> 14 & 16383; // L: 354
					var9 = var6 & 16383; // L: 355
					var10 = (var8 + SecureRandomCallable.baseX + var4.pathX[0] & 16383) - SecureRandomCallable.baseX; // L: 356
					var11 = (var9 + GrandExchangeOfferOwnWorldComparator.baseY + var4.pathY[0] & 16383) - GrandExchangeOfferOwnWorldComparator.baseY; // L: 357
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 358
						var4.resetPath(var10, var11); // L: 359
						var4.field1095 = false; // L: 360
					} else if (var2) { // L: 362
						var4.field1095 = true; // L: 363
						var4.tileX = var10; // L: 364
						var4.tileY = var11; // L: 365
					} else {
						var4.field1095 = false; // L: 368
						var4.method2117(var10, var11, Players.field1302[var1]); // L: 369
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 371
					if (Client.localPlayerIndex == var1) { // L: 372
						class128.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 204 213 252 323 350 373

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1056029355"
	)
	static final void method4731(String var0) {
		InterfaceParent.method2067(var0 + " is already on your ignore list"); // L: 174
	} // L: 175
}
