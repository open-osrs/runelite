import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class175 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpz;II)Z",
		garbageValue = "-1279876475"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 376
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 377
			if (var0.readBits(1) != 0) { // L: 378
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 379
			var4 = var0.readBits(13); // L: 380
			boolean var12 = var0.readBits(1) == 1; // L: 381
			if (var12) { // L: 382
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 383
				throw new RuntimeException(); // L: 384
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 386
				var11.index = var1; // L: 387
				if (Players.field1276[var1] != null) { // L: 388
					var11.read(Players.field1276[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 389
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 390
				var7 = Players.Players_regions[var1]; // L: 391
				var8 = var7 >> 28; // L: 392
				var9 = var7 >> 14 & 255; // L: 393
				var10 = var7 & 255; // L: 394
				var11.pathTraversed[0] = Players.field1286[var1]; // L: 395
				var11.plane = (byte)var8; // L: 396
				var11.resetPath((var9 << 13) + var3 - GrandExchangeOfferOwnWorldComparator.baseX, (var10 << 13) + var4 - VarcInt.baseY); // L: 397
				var11.field1070 = false; // L: 398
				return true; // L: 399
			}
		} else if (var2 == 1) { // L: 401
			var3 = var0.readBits(2); // L: 402
			var4 = Players.Players_regions[var1]; // L: 403
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 404
			return false; // L: 405
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 407
				var3 = var0.readBits(5); // L: 408
				var4 = var3 >> 3; // L: 409
				var5 = var3 & 7; // L: 410
				var6 = Players.Players_regions[var1]; // L: 411
				var7 = (var6 >> 28) + var4 & 3; // L: 412
				var8 = var6 >> 14 & 255; // L: 413
				var9 = var6 & 255; // L: 414
				if (var5 == 0) { // L: 415
					--var8; // L: 416
					--var9; // L: 417
				}

				if (var5 == 1) { // L: 419
					--var9;
				}

				if (var5 == 2) { // L: 420
					++var8; // L: 421
					--var9; // L: 422
				}

				if (var5 == 3) { // L: 424
					--var8;
				}

				if (var5 == 4) { // L: 425
					++var8;
				}

				if (var5 == 5) { // L: 426
					--var8; // L: 427
					++var9; // L: 428
				}

				if (var5 == 6) { // L: 430
					++var9;
				}

				if (var5 == 7) { // L: 431
					++var8; // L: 432
					++var9; // L: 433
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 435
				return false; // L: 436
			} else {
				var3 = var0.readBits(18); // L: 438
				var4 = var3 >> 16; // L: 439
				var5 = var3 >> 8 & 255; // L: 440
				var6 = var3 & 255; // L: 441
				var7 = Players.Players_regions[var1]; // L: 442
				var8 = (var7 >> 28) + var4 & 3; // L: 443
				var9 = var5 + (var7 >> 14) & 255; // L: 444
				var10 = var6 + var7 & 255; // L: 445
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 446
				return false; // L: 447
			}
		}
	}
}
