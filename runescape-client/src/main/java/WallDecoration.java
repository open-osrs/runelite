import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = -1033840405
	)
	static int field2630;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1965737053
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2050472171
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1125986265
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1018369897
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 928141821
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1446275315
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1672015371
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 8832099420400585997L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 462629417
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(CLkz;I)I",
		garbageValue = "-503554425"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "32"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var0][var1]; // L: 7726
		if (var2 == null) { // L: 7727
			GameBuild.scene.removeGroundItemPile(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0, var1); // L: 7728
		} else {
			long var3 = -99999999L; // L: 7731
			TileItem var5 = null; // L: 7732

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7733 7734 7742
				ItemComposition var7 = TaskHandler.ItemDefinition_get(var6.id); // L: 7735
				long var11 = (long)var7.price; // L: 7736
				if (var7.isStackable == 1) { // L: 7737
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7738
					var3 = var11; // L: 7739
					var5 = var6; // L: 7740
				}
			}

			if (var5 == null) { // L: 7744
				GameBuild.scene.removeGroundItemPile(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0, var1); // L: 7745
			} else {
				var2.addLast(var5); // L: 7748
				TileItem var13 = null; // L: 7749
				TileItem var8 = null; // L: 7750

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7751 7752 7757
					if (var6.id != var5.id) { // L: 7753
						if (var13 == null) { // L: 7754
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7755
							var8 = var6;
						}
					}
				}

				long var9 = PacketBuffer.calculateTag(var0, var1, 3, false, 0); // L: 7759
				GameBuild.scene.newGroundItemPile(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0, var1, class392.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GrandExchangeOfferTotalQuantityComparator.Client_plane), var5, var9, var13, var8); // L: 7760
			}
		}
	} // L: 7729 7746 7761

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIII)V",
		garbageValue = "-827944855"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class14.playPcmPlayers(); // L: 11628
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11629
		if (var4 != null) { // L: 11630
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11631
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11632
				int var5 = Client.camAngleY & 2047; // L: 11633
				int var6 = HealthBarDefinition.localPlayer.x / 32 + 48; // L: 11634
				int var7 = 464 - HealthBarDefinition.localPlayer.y / 32; // L: 11635
				class10.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11636

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11637
					var16 = Client.mapIconXs[var8] * 4 + 2 - HealthBarDefinition.localPlayer.x / 32; // L: 11638
					var10 = Client.mapIconYs[var8] * 4 + 2 - HealthBarDefinition.localPlayer.y / 32; // L: 11639
					WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11640
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11642
					for (var16 = 0; var16 < 104; ++var16) { // L: 11643
						NodeDeque var14 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var8][var16]; // L: 11644
						if (var14 != null) { // L: 11645
							var11 = var8 * 4 + 2 - HealthBarDefinition.localPlayer.x / 32; // L: 11646
							var12 = var16 * 4 + 2 - HealthBarDefinition.localPlayer.y / 32; // L: 11647
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var11, var12, class115.mapDotSprites[0], var4); // L: 11648
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11652
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11653
					if (var9 != null && var9.isVisible()) { // L: 11654
						NPCComposition var18 = var9.definition; // L: 11655
						if (var18 != null && var18.transforms != null) { // L: 11656
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11657
							var11 = var9.x / 32 - HealthBarDefinition.localPlayer.x / 32; // L: 11658
							var12 = var9.y / 32 - HealthBarDefinition.localPlayer.y / 32; // L: 11659
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var11, var12, class115.mapDotSprites[1], var4); // L: 11660
						}
					}
				}

				var8 = Players.Players_count; // L: 11664
				int[] var17 = Players.Players_indices; // L: 11665

				for (var10 = 0; var10 < var8; ++var10) { // L: 11666
					Player var15 = Client.players[var17[var10]]; // L: 11667
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != HealthBarDefinition.localPlayer) { // L: 11668
						var12 = var15.x / 32 - HealthBarDefinition.localPlayer.x / 32; // L: 11669
						int var13 = var15.y / 32 - HealthBarDefinition.localPlayer.y / 32; // L: 11670
						if (var15.isFriend()) { // L: 11671
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var12, var13, class115.mapDotSprites[3], var4);
						} else if (HealthBarDefinition.localPlayer.team != 0 && var15.team != 0 && var15.team == HealthBarDefinition.localPlayer.team) { // L: 11672
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var12, var13, class115.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11673
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var12, var13, class115.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11674
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var12, var13, class115.mapDotSprites[6], var4);
						} else {
							WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var12, var13, class115.mapDotSprites[2], var4); // L: 11675
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11678
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11679
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11680
						if (var19 != null) { // L: 11681
							var11 = var19.x / 32 - HealthBarDefinition.localPlayer.x / 32; // L: 11682
							var12 = var19.y / 32 - HealthBarDefinition.localPlayer.y / 32; // L: 11683
							class383.worldToMinimap(var1, var2, var11, var12, WorldMapIcon_0.mapMarkerSprites[1], var4); // L: 11684
						}
					}

					if (Client.hintArrowType == 2) { // L: 11687
						var10 = Client.hintArrowX * 4 - class19.baseX * 4 + 2 - HealthBarDefinition.localPlayer.x / 32; // L: 11688
						var11 = Client.hintArrowY * 4 - DefaultsGroup.baseY * 4 + 2 - HealthBarDefinition.localPlayer.y / 32; // L: 11689
						class383.worldToMinimap(var1, var2, var10, var11, WorldMapIcon_0.mapMarkerSprites[1], var4); // L: 11690
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11692
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11693
						if (var20 != null) { // L: 11694
							var11 = var20.x / 32 - HealthBarDefinition.localPlayer.x / 32; // L: 11695
							var12 = var20.y / 32 - HealthBarDefinition.localPlayer.y / 32; // L: 11696
							class383.worldToMinimap(var1, var2, var11, var12, WorldMapIcon_0.mapMarkerSprites[1], var4); // L: 11697
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11701
					var10 = Client.destinationX * 4 + 2 - HealthBarDefinition.localPlayer.x / 32; // L: 11702
					var11 = Client.destinationY * 4 + 2 - HealthBarDefinition.localPlayer.y / 32; // L: 11703
					WorldMapDecoration.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapIcon_0.mapMarkerSprites[0], var4); // L: 11704
				}

				if (!HealthBarDefinition.localPlayer.isHidden) { // L: 11706
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11708
			}

			Client.field553[var3] = true; // L: 11709
		}
	} // L: 11710

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-916195379"
	)
	static String method4643(String var0) {
		PlayerType[] var1 = VarbitComposition.PlayerType_values(); // L: 12028

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12029
			PlayerType var3 = var1[var2]; // L: 12030
			if (var3.modIcon != -1 && var0.startsWith(SpriteMask.method4998(var3.modIcon))) { // L: 12032 12033
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12034
				break;
			}
		}

		return var0; // L: 12041
	}
}
