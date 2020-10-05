import java.util.Comparator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("gd")
	static byte[][] regionLandArchives;
	@ObfuscatedName("k")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "-9"
	)
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljc;Ljc;I)I",
		garbageValue = "1339061941"
	)
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lic;III)Llp;",
		garbageValue = "-2098090850"
	)
	public static Sprite SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 96
		boolean var3;
		if (var4 == null) { // L: 97
			var3 = false; // L: 98
		} else {
			Occluder.SpriteBuffer_decode(var4); // L: 101
			var3 = true; // L: 102
		}

		return !var3 ? null : AttackOption.method2155(); // L: 104 105
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIII)V",
		garbageValue = "-1377715845"
	)
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		RouteStrategy.playPcmPlayers(); // L: 10551
		SpriteMask var4 = var0.getSpriteMask(false); // L: 10552
		if (var4 != null) { // L: 10553
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 10554
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 10555
				int var5 = Client.camAngleY & 2047; // L: 10556
				int var6 = WorldMapLabelSize.localPlayer.x / 32 + 48; // L: 10557
				int var7 = 464 - WorldMapLabelSize.localPlayer.y / 32; // L: 10558
				ApproximateRouteStrategy.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 10559

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 10560
					var17 = Client.mapIconXs[var8] * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32; // L: 10561
					var10 = Client.mapIconYs[var8] * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32; // L: 10562
					HealthBar.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4); // L: 10563
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 10565
					for (var17 = 0; var17 < 104; ++var17) { // L: 10566
						NodeDeque var15 = Client.groundItems[Huffman.Client_plane][var8][var17]; // L: 10567
						if (var15 != null) { // L: 10568
							var11 = var8 * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32; // L: 10569
							var12 = var17 * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32; // L: 10570
							HealthBar.drawSpriteOnMinimap(var1, var2, var11, var12, class235.mapDotSprites[0], var4); // L: 10571
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 10575
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 10576
					if (var9 != null && var9.isVisible()) { // L: 10577
						NPCDefinition var19 = var9.definition; // L: 10578
						if (var19 != null && var19.transforms != null) { // L: 10579
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) { // L: 10580
							var11 = var9.x / 32 - WorldMapLabelSize.localPlayer.x / 32; // L: 10581
							var12 = var9.y / 32 - WorldMapLabelSize.localPlayer.y / 32; // L: 10582
							HealthBar.drawSpriteOnMinimap(var1, var2, var11, var12, class235.mapDotSprites[1], var4); // L: 10583
						}
					}
				}

				var8 = Players.Players_count; // L: 10587
				int[] var18 = Players.Players_indices; // L: 10588

				for (var10 = 0; var10 < var8; ++var10) { // L: 10589
					Player var16 = Client.players[var18[var10]]; // L: 10590
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != WorldMapLabelSize.localPlayer) { // L: 10591
						var12 = var16.x / 32 - WorldMapLabelSize.localPlayer.x / 32; // L: 10592
						int var13 = var16.y / 32 - WorldMapLabelSize.localPlayer.y / 32; // L: 10593
						boolean var14 = false; // L: 10594
						if (WorldMapLabelSize.localPlayer.team != 0 && var16.team != 0 && var16.team == WorldMapLabelSize.localPlayer.team) { // L: 10595
							var14 = true;
						}

						if (var16.isFriend()) { // L: 10596
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[3], var4);
						} else if (var14) { // L: 10597
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) { // L: 10598
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[5], var4);
						} else {
							HealthBar.drawSpriteOnMinimap(var1, var2, var12, var13, class235.mapDotSprites[2], var4); // L: 10599
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 10602
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 10603
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex]; // L: 10604
						if (var20 != null) { // L: 10605
							var11 = var20.x / 32 - WorldMapLabelSize.localPlayer.x / 32; // L: 10606
							var12 = var20.y / 32 - WorldMapLabelSize.localPlayer.y / 32; // L: 10607
							Coord.worldToMinimap(var1, var2, var11, var12, VarbitDefinition.mapMarkerSprites[1], var4); // L: 10608
						}
					}

					if (Client.hintArrowType == 2) { // L: 10611
						var10 = Client.hintArrowX * 4 - WorldMapManager.baseX * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32; // L: 10612
						var11 = Client.hintArrowY * 4 - WorldMapLabel.baseY * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32; // L: 10613
						Coord.worldToMinimap(var1, var2, var10, var11, VarbitDefinition.mapMarkerSprites[1], var4); // L: 10614
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 10616
						Player var21 = Client.players[Client.hintArrowPlayerIndex]; // L: 10617
						if (var21 != null) { // L: 10618
							var11 = var21.x / 32 - WorldMapLabelSize.localPlayer.x / 32; // L: 10619
							var12 = var21.y / 32 - WorldMapLabelSize.localPlayer.y / 32; // L: 10620
							Coord.worldToMinimap(var1, var2, var11, var12, VarbitDefinition.mapMarkerSprites[1], var4); // L: 10621
						}
					}
				}

				if (Client.destinationX != 0) { // L: 10625
					var10 = Client.destinationX * 4 + 2 - WorldMapLabelSize.localPlayer.x / 32; // L: 10626
					var11 = Client.destinationY * 4 + 2 - WorldMapLabelSize.localPlayer.y / 32; // L: 10627
					HealthBar.drawSpriteOnMinimap(var1, var2, var10, var11, VarbitDefinition.mapMarkerSprites[0], var4); // L: 10628
				}

				if (!WorldMapLabelSize.localPlayer.isHidden) { // L: 10630
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 10632
			}

			Client.field883[var3] = true; // L: 10633
		}
	} // L: 10634
}
