import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 330018341
	)
	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1177773149
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 541305317
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1757180845189134269L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1754694829
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("i")
	public static int method4592(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 57
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "718192951"
	)
	static final void method4591(int var0, int var1, boolean var2) {
		if (!var2 || var0 != ScriptEvent.field1042 || KitDefinition.field1855 != var1) { // L: 5544
			ScriptEvent.field1042 = var0; // L: 5547
			KitDefinition.field1855 = var1; // L: 5548
			Decimator.updateGameState(25); // L: 5549
			MusicPatch.drawLoadingMessage("Loading - please wait.", true); // L: 5550
			int var3 = GrandExchangeOfferOwnWorldComparator.baseX; // L: 5551
			int var4 = VarcInt.baseY; // L: 5552
			GrandExchangeOfferOwnWorldComparator.baseX = (var0 - 6) * 8; // L: 5553
			VarcInt.baseY = (var1 - 6) * 8; // L: 5554
			int var5 = GrandExchangeOfferOwnWorldComparator.baseX - var3; // L: 5555
			int var6 = VarcInt.baseY - var4; // L: 5556
			var3 = GrandExchangeOfferOwnWorldComparator.baseX; // L: 5557
			var4 = VarcInt.baseY; // L: 5558

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5559
				NPC var19 = Client.npcs[var7]; // L: 5560
				if (var19 != null) { // L: 5561
					for (var9 = 0; var9 < 10; ++var9) { // L: 5562
						var10000 = var19.pathX; // L: 5563
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5564
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5566
					var19.y -= var6 * 128; // L: 5567
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5570
				Player var22 = Client.players[var7]; // L: 5571
				if (var22 != null) { // L: 5572
					for (var9 = 0; var9 < 10; ++var9) { // L: 5573
						var10000 = var22.pathX; // L: 5574
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5575
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5577
					var22.y -= var6 * 128; // L: 5578
				}
			}

			byte var20 = 0; // L: 5581
			byte var8 = 104; // L: 5582
			byte var21 = 1; // L: 5583
			if (var5 < 0) { // L: 5584
				var20 = 103; // L: 5585
				var8 = -1; // L: 5586
				var21 = -1; // L: 5587
			}

			byte var10 = 0; // L: 5589
			byte var11 = 104; // L: 5590
			byte var12 = 1; // L: 5591
			if (var6 < 0) { // L: 5592
				var10 = 103; // L: 5593
				var11 = -1; // L: 5594
				var12 = -1; // L: 5595
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5597
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5598
					int var15 = var5 + var13; // L: 5599
					int var16 = var14 + var6; // L: 5600

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5601
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5602
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5603
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5607 5608 5612
				var18.x -= var5; // L: 5609
				var18.y -= var6; // L: 5610
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5611
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5614
				Client.destinationX -= var5; // L: 5615
				Client.destinationY -= var6; // L: 5616
			}

			Client.soundEffectCount = 0; // L: 5618
			Client.isCameraLocked = false; // L: 5619
			WorldMapLabelSize.cameraX -= var5 << 7; // L: 5620
			class154.cameraZ -= var6 << 7; // L: 5621
			class10.oculusOrbFocalPointX -= var5 << 7; // L: 5622
			ClientPacket.oculusOrbFocalPointY -= var6 << 7; // L: 5623
			Client.field714 = -1; // L: 5624
			Client.graphicsObjects.clear(); // L: 5625
			Client.projectiles.clear(); // L: 5626

			for (var14 = 0; var14 < 4; ++var14) { // L: 5627
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5545 5628
}
