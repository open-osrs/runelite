import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -290807175
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("x")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;S)V",
		garbageValue = "12817"
	)
	void method4416(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method4420(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "8"
	)
	void method4420(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true; // L: 40
		}

	} // L: 43

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "121"
	)
	public static int method4427() {
		return KeyHandler.KeyHandler_idleCycles; // L: 201
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734720266"
	)
	public static void method4426() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 94
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 95
	} // L: 96

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1702821448"
	)
	static final void method4428(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class182.field2112 || UserComparator6.field2013 != var1) { // L: 5384
			class182.field2112 = var0; // L: 5387
			UserComparator6.field2013 = var1; // L: 5388
			WorldMapCacheName.updateGameState(25); // L: 5389
			Varps.drawLoadingMessage("Loading - please wait.", true); // L: 5390
			int var3 = NetFileRequest.baseX; // L: 5391
			int var4 = class41.baseY; // L: 5392
			NetFileRequest.baseX = (var0 - 6) * 8; // L: 5393
			class41.baseY = (var1 - 6) * 8; // L: 5394
			int var5 = NetFileRequest.baseX - var3; // L: 5395
			int var6 = class41.baseY - var4; // L: 5396
			var3 = NetFileRequest.baseX; // L: 5397
			var4 = class41.baseY; // L: 5398

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5399
				NPC var19 = Client.npcs[var7]; // L: 5400
				if (var19 != null) { // L: 5401
					for (var9 = 0; var9 < 10; ++var9) { // L: 5402
						var10000 = var19.pathX; // L: 5403
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5404
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5406
					var19.y -= var6 * 128; // L: 5407
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5410
				Player var22 = Client.players[var7]; // L: 5411
				if (var22 != null) { // L: 5412
					for (var9 = 0; var9 < 10; ++var9) { // L: 5413
						var10000 = var22.pathX; // L: 5414
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5415
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5417
					var22.y -= var6 * 128; // L: 5418
				}
			}

			byte var20 = 0; // L: 5421
			byte var8 = 104; // L: 5422
			byte var21 = 1; // L: 5423
			if (var5 < 0) { // L: 5424
				var20 = 103; // L: 5425
				var8 = -1; // L: 5426
				var21 = -1; // L: 5427
			}

			byte var10 = 0; // L: 5429
			byte var11 = 104; // L: 5430
			byte var12 = 1; // L: 5431
			if (var6 < 0) { // L: 5432
				var10 = 103; // L: 5433
				var11 = -1; // L: 5434
				var12 = -1; // L: 5435
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5437
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5438
					int var15 = var5 + var13; // L: 5439
					int var16 = var6 + var14; // L: 5440

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5441
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5442
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5443
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5447 5448 5452
				var18.x -= var5; // L: 5449
				var18.y -= var6; // L: 5450
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5451
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5454
				Client.destinationX -= var5; // L: 5455
				Client.destinationY -= var6; // L: 5456
			}

			Client.soundEffectCount = 0; // L: 5458
			Client.isCameraLocked = false; // L: 5459
			Player.cameraX -= var5 << 7; // L: 5460
			class69.cameraZ -= var6 << 7; // L: 5461
			SecureRandomFuture.oculusOrbFocalPointX -= var5 << 7; // L: 5462
			Decimator.oculusOrbFocalPointY -= var6 << 7; // L: 5463
			Client.field874 = -1; // L: 5464
			Client.graphicsObjects.clear(); // L: 5465
			Client.projectiles.clear(); // L: 5466

			for (var14 = 0; var14 < 4; ++var14) { // L: 5467
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5385 5468
}
