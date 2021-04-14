import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class21 extends class14 {
	@ObfuscatedName("g")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("al")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1121111403
	)
	int field168;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1047872621
	)
	int field166;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -52117445
	)
	int field167;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1660368165
	)
	int field165;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field168 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field168 = var1.readUnsignedShort(); // L: 166
		this.field166 = var1.readInt(); // L: 167
		this.field167 = var1.readUnsignedByte(); // L: 168
		this.field165 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method154(this.field168, this.field166, this.field167, this.field165); // L: 173
	} // L: 174

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "18"
	)
	static boolean method316(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 38
			boolean var3 = false; // L: 39
			boolean var4 = false; // L: 40
			int var5 = 0; // L: 41
			int var6 = var0.length(); // L: 42

			for (int var7 = 0; var7 < var6; ++var7) { // L: 43
				char var8 = var0.charAt(var7); // L: 44
				if (var7 == 0) { // L: 45
					if (var8 == '-') { // L: 46
						var3 = true; // L: 47
						continue;
					}

					if (var8 == '+') { // L: 50
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 52
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7'; // L: 53
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 54
						return false; // L: 55
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 56
					return false;
				}

				if (var3) { // L: 57
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 58
				if (var9 / var1 != var5) { // L: 59
					return false;
				}

				var5 = var9; // L: 60
				var4 = true; // L: 61
			}

			return var4; // L: 63
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lhu;IIIB)V",
		garbageValue = "-25"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		BoundaryObject.playPcmPlayers(); // L: 11360
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11361
		if (var4 != null) { // L: 11362
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11363
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11364
				int var5 = Client.camAngleY & 2047; // L: 11365
				int var6 = Varcs.localPlayer.x / 32 + 48; // L: 11366
				int var7 = 464 - Varcs.localPlayer.y / 32; // L: 11367
				class19.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11368

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11369
					var17 = Client.mapIconXs[var8] * 4 + 2 - Varcs.localPlayer.x / 32; // L: 11370
					var10 = Client.mapIconYs[var8] * 4 + 2 - Varcs.localPlayer.y / 32; // L: 11371
					WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4); // L: 11372
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11374
					for (var17 = 0; var17 < 104; ++var17) { // L: 11375
						NodeDeque var15 = Client.groundItems[class26.Client_plane][var8][var17]; // L: 11376
						if (var15 != null) { // L: 11377
							var11 = var8 * 4 + 2 - Varcs.localPlayer.x / 32; // L: 11378
							var12 = var17 * 4 + 2 - Varcs.localPlayer.y / 32; // L: 11379
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var11, var12, class244.mapDotSprites[0], var4); // L: 11380
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11384
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11385
					if (var9 != null && var9.isVisible()) { // L: 11386
						NPCComposition var19 = var9.definition; // L: 11387
						if (var19 != null && var19.transforms != null) { // L: 11388
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) { // L: 11389
							var11 = var9.x / 32 - Varcs.localPlayer.x / 32; // L: 11390
							var12 = var9.y / 32 - Varcs.localPlayer.y / 32; // L: 11391
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var11, var12, class244.mapDotSprites[1], var4); // L: 11392
						}
					}
				}

				var8 = Players.Players_count; // L: 11396
				int[] var18 = Players.Players_indices; // L: 11397

				for (var10 = 0; var10 < var8; ++var10) { // L: 11398
					Player var16 = Client.players[var18[var10]]; // L: 11399
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != Varcs.localPlayer) { // L: 11400
						var12 = var16.x / 32 - Varcs.localPlayer.x / 32; // L: 11401
						int var13 = var16.y / 32 - Varcs.localPlayer.y / 32; // L: 11402
						boolean var14 = false; // L: 11403
						if (Varcs.localPlayer.team != 0 && var16.team != 0 && var16.team == Varcs.localPlayer.team) { // L: 11404
							var14 = true;
						}

						if (var16.isFriend()) { // L: 11405
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[3], var4);
						} else if (var14) { // L: 11406
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) { // L: 11407
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[5], var4);
						} else {
							WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var12, var13, class244.mapDotSprites[2], var4); // L: 11408
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11411
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11412
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11413
						if (var20 != null) { // L: 11414
							var11 = var20.x / 32 - Varcs.localPlayer.x / 32; // L: 11415
							var12 = var20.y / 32 - Varcs.localPlayer.y / 32; // L: 11416
							class371.worldToMinimap(var1, var2, var11, var12, class14.mapMarkerSprites[1], var4); // L: 11417
						}
					}

					if (Client.hintArrowType == 2) { // L: 11420
						var10 = Client.hintArrowX * 4 - ItemLayer.baseX * 4 + 2 - Varcs.localPlayer.x / 32; // L: 11421
						var11 = Client.hintArrowY * 4 - Tile.baseY * 4 + 2 - Varcs.localPlayer.y / 32; // L: 11422
						class371.worldToMinimap(var1, var2, var10, var11, class14.mapMarkerSprites[1], var4); // L: 11423
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11425
						Player var21 = Client.players[Client.hintArrowPlayerIndex]; // L: 11426
						if (var21 != null) { // L: 11427
							var11 = var21.x / 32 - Varcs.localPlayer.x / 32; // L: 11428
							var12 = var21.y / 32 - Varcs.localPlayer.y / 32; // L: 11429
							class371.worldToMinimap(var1, var2, var11, var12, class14.mapMarkerSprites[1], var4); // L: 11430
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11434
					var10 = Client.destinationX * 4 + 2 - Varcs.localPlayer.x / 32; // L: 11435
					var11 = Client.destinationY * 4 + 2 - Varcs.localPlayer.y / 32; // L: 11436
					WorldMapCacheName.drawSpriteOnMinimap(var1, var2, var10, var11, class14.mapMarkerSprites[0], var4); // L: 11437
				}

				if (!Varcs.localPlayer.isHidden) { // L: 11439
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11441
			}

			Client.field812[var3] = true; // L: 11442
		}
	} // L: 11443
}
