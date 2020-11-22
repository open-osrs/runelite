import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("u")
	static int[][] field1999;
	@ObfuscatedName("p")
	static int[][][] field2000;
	@ObfuscatedName("ah")
	static String field2002;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "2109769786"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIIB)V",
		garbageValue = "-68"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		FriendSystem.playPcmPlayers(); // L: 11358
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11359
		if (var4 != null) { // L: 11360
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11361
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11362
				int var5 = Client.camAngleY & 2047; // L: 11363
				int var6 = PlayerType.localPlayer.x / 32 + 48; // L: 11364
				int var7 = 464 - PlayerType.localPlayer.y / 32; // L: 11365
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11366

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11367
					var17 = Client.mapIconXs[var8] * 4 + 2 - PlayerType.localPlayer.x / 32; // L: 11368
					var10 = Client.mapIconYs[var8] * 4 + 2 - PlayerType.localPlayer.y / 32; // L: 11369
					TileItem.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4); // L: 11370
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11372
					for (var17 = 0; var17 < 104; ++var17) { // L: 11373
						NodeDeque var15 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var8][var17]; // L: 11374
						if (var15 != null) { // L: 11375
							var11 = var8 * 4 + 2 - PlayerType.localPlayer.x / 32; // L: 11376
							var12 = var17 * 4 + 2 - PlayerType.localPlayer.y / 32; // L: 11377
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, Entity.mapDotSprites[0], var4); // L: 11378
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11382
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11383
					if (var9 != null && var9.isVisible()) { // L: 11384
						NPCDefinition var19 = var9.definition; // L: 11385
						if (var19 != null && var19.transforms != null) { // L: 11386
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) { // L: 11387
							var11 = var9.x / 32 - PlayerType.localPlayer.x / 32; // L: 11388
							var12 = var9.y / 32 - PlayerType.localPlayer.y / 32; // L: 11389
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, Entity.mapDotSprites[1], var4); // L: 11390
						}
					}
				}

				var8 = Players.Players_count; // L: 11394
				int[] var18 = Players.Players_indices; // L: 11395

				for (var10 = 0; var10 < var8; ++var10) { // L: 11396
					Player var16 = Client.players[var18[var10]]; // L: 11397
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != PlayerType.localPlayer) { // L: 11398
						var12 = var16.x / 32 - PlayerType.localPlayer.x / 32; // L: 11399
						int var13 = var16.y / 32 - PlayerType.localPlayer.y / 32; // L: 11400
						boolean var14 = false; // L: 11401
						if (PlayerType.localPlayer.team != 0 && var16.team != 0 && var16.team == PlayerType.localPlayer.team) { // L: 11402
							var14 = true;
						}

						if (var16.isFriend()) { // L: 11403
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Entity.mapDotSprites[3], var4);
						} else if (var14) { // L: 11404
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Entity.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) { // L: 11405
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Entity.mapDotSprites[5], var4);
						} else {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, Entity.mapDotSprites[2], var4); // L: 11406
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11409
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11410
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11411
						if (var20 != null) { // L: 11412
							var11 = var20.x / 32 - PlayerType.localPlayer.x / 32; // L: 11413
							var12 = var20.y / 32 - PlayerType.localPlayer.y / 32; // L: 11414
							UrlRequest.worldToMinimap(var1, var2, var11, var12, ScriptEvent.mapMarkerSprites[1], var4); // L: 11415
						}
					}

					if (Client.hintArrowType == 2) { // L: 11418
						var10 = Client.hintArrowX * 4 - FloorDecoration.baseX * 4 + 2 - PlayerType.localPlayer.x / 32; // L: 11419
						var11 = Client.hintArrowY * 4 - WorldMapData_0.baseY * 4 + 2 - PlayerType.localPlayer.y / 32; // L: 11420
						UrlRequest.worldToMinimap(var1, var2, var10, var11, ScriptEvent.mapMarkerSprites[1], var4); // L: 11421
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11423
						Player var21 = Client.players[Client.hintArrowPlayerIndex]; // L: 11424
						if (var21 != null) { // L: 11425
							var11 = var21.x / 32 - PlayerType.localPlayer.x / 32; // L: 11426
							var12 = var21.y / 32 - PlayerType.localPlayer.y / 32; // L: 11427
							UrlRequest.worldToMinimap(var1, var2, var11, var12, ScriptEvent.mapMarkerSprites[1], var4); // L: 11428
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11432
					var10 = Client.destinationX * 4 + 2 - PlayerType.localPlayer.x / 32; // L: 11433
					var11 = Client.destinationY * 4 + 2 - PlayerType.localPlayer.y / 32; // L: 11434
					TileItem.drawSpriteOnMinimap(var1, var2, var10, var11, ScriptEvent.mapMarkerSprites[0], var4); // L: 11435
				}

				if (!PlayerType.localPlayer.isHidden) { // L: 11437
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11439
			}

			Client.field758[var3] = true; // L: 11440
		}
	} // L: 11441
}
