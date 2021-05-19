import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lhm;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 916049887
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 22124575
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 564962157
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "584072698"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 42
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 43
		}
	} // L: 44

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIII)V",
		garbageValue = "-476832840"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		WorldMapIcon_1.playPcmPlayers(); // L: 11380
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11381
		if (var4 != null) { // L: 11382
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11383
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11384
				int var5 = Client.camAngleY & 2047; // L: 11385
				int var6 = class35.localPlayer.x / 32 + 48; // L: 11386
				int var7 = 464 - class35.localPlayer.y / 32; // L: 11387
				UserComparator8.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11388

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11389
					var16 = Client.mapIconXs[var8] * 4 + 2 - class35.localPlayer.x / 32; // L: 11390
					var10 = Client.mapIconYs[var8] * 4 + 2 - class35.localPlayer.y / 32; // L: 11391
					class10.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11392
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11394
					for (var16 = 0; var16 < 104; ++var16) { // L: 11395
						NodeDeque var14 = Client.groundItems[ParamComposition.Client_plane][var8][var16]; // L: 11396
						if (var14 != null) { // L: 11397
							var11 = var8 * 4 + 2 - class35.localPlayer.x / 32; // L: 11398
							var12 = var16 * 4 + 2 - class35.localPlayer.y / 32; // L: 11399
							class10.drawSpriteOnMinimap(var1, var2, var11, var12, class341.mapDotSprites[0], var4); // L: 11400
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11404
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11405
					if (var9 != null && var9.isVisible()) { // L: 11406
						NPCComposition var18 = var9.definition; // L: 11407
						if (var18 != null && var18.transforms != null) { // L: 11408
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11409
							var11 = var9.x / 32 - class35.localPlayer.x / 32; // L: 11410
							var12 = var9.y / 32 - class35.localPlayer.y / 32; // L: 11411
							class10.drawSpriteOnMinimap(var1, var2, var11, var12, class341.mapDotSprites[1], var4); // L: 11412
						}
					}
				}

				var8 = Players.Players_count; // L: 11416
				int[] var17 = Players.Players_indices; // L: 11417

				for (var10 = 0; var10 < var8; ++var10) { // L: 11418
					Player var15 = Client.players[var17[var10]]; // L: 11419
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class35.localPlayer) { // L: 11420
						var12 = var15.x / 32 - class35.localPlayer.x / 32; // L: 11421
						int var13 = var15.y / 32 - class35.localPlayer.y / 32; // L: 11422
						if (var15.isFriend()) { // L: 11423
							class10.drawSpriteOnMinimap(var1, var2, var12, var13, class341.mapDotSprites[3], var4);
						} else if (class35.localPlayer.team != 0 && var15.team != 0 && var15.team == class35.localPlayer.team) { // L: 11424
							class10.drawSpriteOnMinimap(var1, var2, var12, var13, class341.mapDotSprites[4], var4);
						} else if (var15.isClanMember()) { // L: 11425
							class10.drawSpriteOnMinimap(var1, var2, var12, var13, class341.mapDotSprites[5], var4);
						} else if (var15.method2137()) { // L: 11426
							class10.drawSpriteOnMinimap(var1, var2, var12, var13, class341.mapDotSprites[6], var4);
						} else {
							class10.drawSpriteOnMinimap(var1, var2, var12, var13, class341.mapDotSprites[2], var4); // L: 11427
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11430
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11431
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11432
						if (var19 != null) { // L: 11433
							var11 = var19.x / 32 - class35.localPlayer.x / 32; // L: 11434
							var12 = var19.y / 32 - class35.localPlayer.y / 32; // L: 11435
							class20.worldToMinimap(var1, var2, var11, var12, ObjectComposition.mapMarkerSprites[1], var4); // L: 11436
						}
					}

					if (Client.hintArrowType == 2) { // L: 11439
						var10 = Client.hintArrowX * 4 - JagexCache.baseX * 4 + 2 - class35.localPlayer.x / 32; // L: 11440
						var11 = Client.hintArrowY * 4 - Messages.baseY * 4 + 2 - class35.localPlayer.y / 32; // L: 11441
						class20.worldToMinimap(var1, var2, var10, var11, ObjectComposition.mapMarkerSprites[1], var4); // L: 11442
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11444
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11445
						if (var20 != null) { // L: 11446
							var11 = var20.x / 32 - class35.localPlayer.x / 32; // L: 11447
							var12 = var20.y / 32 - class35.localPlayer.y / 32; // L: 11448
							class20.worldToMinimap(var1, var2, var11, var12, ObjectComposition.mapMarkerSprites[1], var4); // L: 11449
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11453
					var10 = Client.destinationX * 4 + 2 - class35.localPlayer.x / 32; // L: 11454
					var11 = Client.destinationY * 4 + 2 - class35.localPlayer.y / 32; // L: 11455
					class10.drawSpriteOnMinimap(var1, var2, var10, var11, ObjectComposition.mapMarkerSprites[0], var4); // L: 11456
				}

				if (!class35.localPlayer.isHidden) { // L: 11458
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11460
			}

			Client.field826[var3] = true; // L: 11461
		}
	} // L: 11462
}
