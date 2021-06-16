import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class265 {
	@ObfuscatedName("ah")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2064916669"
	)
	static final void method4984(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class12.field111 || RouteStrategy.field1919 != var1) { // L: 5615
			class12.field111 = var0; // L: 5618
			RouteStrategy.field1919 = var1; // L: 5619
			Projectile.updateGameState(25); // L: 5620
			class143.drawLoadingMessage("Loading - please wait.", true); // L: 5621
			int var3 = class15.baseX; // L: 5622
			int var4 = WorldMapSprite.baseY; // L: 5623
			class15.baseX = (var0 - 6) * 8; // L: 5624
			WorldMapSprite.baseY = (var1 - 6) * 8; // L: 5625
			int var5 = class15.baseX - var3; // L: 5626
			int var6 = WorldMapSprite.baseY - var4; // L: 5627
			var3 = class15.baseX; // L: 5628
			var4 = WorldMapSprite.baseY; // L: 5629

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5630
				NPC var19 = Client.npcs[var7]; // L: 5631
				if (var19 != null) { // L: 5632
					for (var9 = 0; var9 < 10; ++var9) { // L: 5633
						var10000 = var19.pathX; // L: 5634
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5635
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5637
					var19.y -= var6 * 128; // L: 5638
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5641
				Player var22 = Client.players[var7]; // L: 5642
				if (var22 != null) { // L: 5643
					for (var9 = 0; var9 < 10; ++var9) { // L: 5644
						var10000 = var22.pathX; // L: 5645
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5646
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5648
					var22.y -= var6 * 128; // L: 5649
				}
			}

			byte var20 = 0; // L: 5652
			byte var8 = 104; // L: 5653
			byte var21 = 1; // L: 5654
			if (var5 < 0) { // L: 5655
				var20 = 103; // L: 5656
				var8 = -1; // L: 5657
				var21 = -1; // L: 5658
			}

			byte var10 = 0; // L: 5660
			byte var11 = 104; // L: 5661
			byte var12 = 1; // L: 5662
			if (var6 < 0) { // L: 5663
				var10 = 103; // L: 5664
				var11 = -1; // L: 5665
				var12 = -1; // L: 5666
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5668
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5669
					int var15 = var5 + var13; // L: 5670
					int var16 = var14 + var6; // L: 5671

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5672
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5673
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5674
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5678 5679 5683
				var18.x -= var5; // L: 5680
				var18.y -= var6; // L: 5681
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5682
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5685
				Client.destinationX -= var5; // L: 5686
				Client.destinationY -= var6; // L: 5687
			}

			Client.soundEffectCount = 0; // L: 5689
			Client.isCameraLocked = false; // L: 5690
			ObjectSound.cameraX -= var5 << 7; // L: 5691
			Canvas.cameraZ -= var6 << 7; // L: 5692
			FriendSystem.oculusOrbFocalPointX -= var5 << 7; // L: 5693
			VarbitComposition.oculusOrbFocalPointY -= var6 << 7; // L: 5694
			Client.field853 = -1; // L: 5695
			Client.graphicsObjects.clear(); // L: 5696
			Client.projectiles.clear(); // L: 5697

			for (var14 = 0; var14 < 4; ++var14) { // L: 5698
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5616 5699
}
