import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class329 {
	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1240601508"
	)
	static final void method5875(int var0, int var1, boolean var2) {
		if (!var2 || var0 != WorldMapSectionType.field2828 || class433.field4657 != var1) { // L: 5647
			WorldMapSectionType.field2828 = var0; // L: 5650
			class433.field4657 = var1; // L: 5651
			PendingSpawn.updateGameState(25); // L: 5652
			class259.drawLoadingMessage("Loading - please wait.", true); // L: 5653
			int var3 = SecureRandomCallable.baseX; // L: 5654
			int var4 = GrandExchangeOfferOwnWorldComparator.baseY; // L: 5655
			SecureRandomCallable.baseX = (var0 - 6) * 8; // L: 5656
			GrandExchangeOfferOwnWorldComparator.baseY = (var1 - 6) * 8; // L: 5657
			int var5 = SecureRandomCallable.baseX - var3; // L: 5658
			int var6 = GrandExchangeOfferOwnWorldComparator.baseY - var4; // L: 5659
			var3 = SecureRandomCallable.baseX; // L: 5660
			var4 = GrandExchangeOfferOwnWorldComparator.baseY; // L: 5661

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5662
				NPC var19 = Client.npcs[var7]; // L: 5663
				if (var19 != null) { // L: 5664
					for (var9 = 0; var9 < 10; ++var9) { // L: 5665
						var10000 = var19.pathX; // L: 5666
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5667
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5669
					var19.y -= var6 * 128; // L: 5670
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5673
				Player var22 = Client.players[var7]; // L: 5674
				if (var22 != null) { // L: 5675
					for (var9 = 0; var9 < 10; ++var9) { // L: 5676
						var10000 = var22.pathX; // L: 5677
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5678
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5680
					var22.y -= var6 * 128; // L: 5681
				}
			}

			byte var20 = 0; // L: 5684
			byte var8 = 104; // L: 5685
			byte var21 = 1; // L: 5686
			if (var5 < 0) { // L: 5687
				var20 = 103; // L: 5688
				var8 = -1; // L: 5689
				var21 = -1; // L: 5690
			}

			byte var10 = 0; // L: 5692
			byte var11 = 104; // L: 5693
			byte var12 = 1; // L: 5694
			if (var6 < 0) { // L: 5695
				var10 = 103; // L: 5696
				var11 = -1; // L: 5697
				var12 = -1; // L: 5698
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5700
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5701
					int var15 = var13 + var5; // L: 5702
					int var16 = var14 + var6; // L: 5703

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5704
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5705
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5706
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5710 5711 5715
				var18.x -= var5; // L: 5712
				var18.y -= var6; // L: 5713
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5714
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5717
				Client.destinationX -= var5; // L: 5718
				Client.destinationY -= var6; // L: 5719
			}

			Client.soundEffectCount = 0; // L: 5721
			Client.isCameraLocked = false; // L: 5722
			class343.cameraX -= var5 << 7; // L: 5723
			FaceNormal.cameraZ -= var6 << 7; // L: 5724
			HorizontalAlignment.oculusOrbFocalPointX -= var5 << 7; // L: 5725
			class28.oculusOrbFocalPointY -= var6 << 7; // L: 5726
			Client.field515 = -1; // L: 5727
			Client.graphicsObjects.clear(); // L: 5728
			Client.projectiles.clear(); // L: 5729

			for (var14 = 0; var14 < 4; ++var14) { // L: 5730
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5648 5731
}
