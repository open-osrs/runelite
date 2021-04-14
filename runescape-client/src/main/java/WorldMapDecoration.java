import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1578642713
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -212872709
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2100927001
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)Z",
		garbageValue = "56"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 368
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 369
			if (var0.readBits(1) != 0) { // L: 370
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 371
			var4 = var0.readBits(13); // L: 372
			boolean var12 = var0.readBits(1) == 1; // L: 373
			if (var12) { // L: 374
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 375
				throw new RuntimeException(); // L: 376
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 378
				var11.index = var1; // L: 379
				if (Players.field1352[var1] != null) { // L: 380
					var11.read(Players.field1352[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 381
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 382
				var7 = Players.Players_regions[var1]; // L: 383
				var8 = var7 >> 28; // L: 384
				var9 = var7 >> 14 & 255; // L: 385
				var10 = var7 & 255; // L: 386
				var11.pathTraversed[0] = Players.field1351[var1]; // L: 387
				var11.plane = (byte)var8; // L: 388
				var11.resetPath((var9 << 13) + var3 - ItemLayer.baseX, (var10 << 13) + var4 - Tile.baseY); // L: 389
				var11.field1189 = false; // L: 390
				return true; // L: 391
			}
		} else if (var2 == 1) { // L: 393
			var3 = var0.readBits(2); // L: 394
			var4 = Players.Players_regions[var1]; // L: 395
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 396
			return false; // L: 397
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 399
				var3 = var0.readBits(5); // L: 400
				var4 = var3 >> 3; // L: 401
				var5 = var3 & 7; // L: 402
				var6 = Players.Players_regions[var1]; // L: 403
				var7 = (var6 >> 28) + var4 & 3; // L: 404
				var8 = var6 >> 14 & 255; // L: 405
				var9 = var6 & 255; // L: 406
				if (var5 == 0) { // L: 407
					--var8; // L: 408
					--var9; // L: 409
				}

				if (var5 == 1) { // L: 411
					--var9;
				}

				if (var5 == 2) { // L: 412
					++var8; // L: 413
					--var9; // L: 414
				}

				if (var5 == 3) { // L: 416
					--var8;
				}

				if (var5 == 4) { // L: 417
					++var8;
				}

				if (var5 == 5) { // L: 418
					--var8; // L: 419
					++var9; // L: 420
				}

				if (var5 == 6) { // L: 422
					++var9;
				}

				if (var5 == 7) { // L: 423
					++var8; // L: 424
					++var9; // L: 425
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 427
				return false; // L: 428
			} else {
				var3 = var0.readBits(18); // L: 430
				var4 = var3 >> 16; // L: 431
				var5 = var3 >> 8 & 255; // L: 432
				var6 = var3 & 255; // L: 433
				var7 = Players.Players_regions[var1]; // L: 434
				var8 = (var7 >> 28) + var4 & 3; // L: 435
				var9 = var5 + (var7 >> 14) & 255; // L: 436
				var10 = var7 + var6 & 255; // L: 437
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 438
				return false; // L: 439
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-858815063"
	)
	static final void method3105(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 7780
			if (Client.showMouseOverText) { // L: 7781
				int var2 = Skeleton.method3433(); // L: 7782
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 7784
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 7785
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = class69.method1164(var2); // L: 7786
				}

				if (Client.menuOptionsCount > 2) { // L: 7787
					var3 = var3 + DefaultsGroup.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class368.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 7788
			}
		}
	} // L: 7789
}
