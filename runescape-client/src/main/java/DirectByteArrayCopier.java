import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 604929845
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("h")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-938287989"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-277286562"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	static void method3983() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.field514 = new byte[4][104][104]; // L: 49
		Tiles.field508 = new byte[4][104][104]; // L: 50
		class9.field40 = new byte[4][104][104]; // L: 51
		Username.field3663 = new byte[4][104][104]; // L: 52
		GrandExchangeOfferWorldComparator.field52 = new int[4][105][105]; // L: 53
		Tiles.field511 = new byte[4][105][105]; // L: 54
		class92.field1173 = new int[105][105]; // L: 55
		VarbitDefinition.Tiles_hue = new int[104]; // L: 56
		ArchiveDiskActionHandler.Tiles_saturation = new int[104]; // L: 57
		class92.Tiles_lightness = new int[104]; // L: 58
		UserComparator7.Tiles_hueMultiplier = new int[104]; // L: 59
		Varcs.field1283 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIII)V",
		garbageValue = "29105444"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		FontName.playPcmPlayers(); // L: 10871
		SpriteMask var4 = var0.getSpriteMask(false); // L: 10872
		if (var4 != null) { // L: 10873
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 10874
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 10875
				int var5 = Client.camAngleY & 2047; // L: 10876
				int var6 = PlayerAppearance.localPlayer.x / 32 + 48; // L: 10877
				int var7 = 464 - PlayerAppearance.localPlayer.y / 32; // L: 10878
				class25.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 10879

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 10880
					var17 = Client.mapIconXs[var8] * 4 + 2 - PlayerAppearance.localPlayer.x / 32; // L: 10881
					var10 = Client.mapIconYs[var8] * 4 + 2 - PlayerAppearance.localPlayer.y / 32; // L: 10882
					class25.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4); // L: 10883
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 10885
					for (var17 = 0; var17 < 104; ++var17) { // L: 10886
						NodeDeque var15 = Client.groundItems[GameObject.Client_plane][var8][var17]; // L: 10887
						if (var15 != null) { // L: 10888
							var11 = var8 * 4 + 2 - PlayerAppearance.localPlayer.x / 32; // L: 10889
							var12 = var17 * 4 + 2 - PlayerAppearance.localPlayer.y / 32; // L: 10890
							class25.drawSpriteOnMinimap(var1, var2, var11, var12, Actor.mapDotSprites[0], var4); // L: 10891
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 10895
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 10896
					if (var9 != null && var9.isVisible()) { // L: 10897
						NPCDefinition var19 = var9.definition; // L: 10898
						if (var19 != null && var19.transforms != null) { // L: 10899
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) { // L: 10900
							var11 = var9.x / 32 - PlayerAppearance.localPlayer.x / 32; // L: 10901
							var12 = var9.y / 32 - PlayerAppearance.localPlayer.y / 32; // L: 10902
							class25.drawSpriteOnMinimap(var1, var2, var11, var12, Actor.mapDotSprites[1], var4); // L: 10903
						}
					}
				}

				var8 = Players.Players_count; // L: 10907
				int[] var18 = Players.Players_indices; // L: 10908

				for (var10 = 0; var10 < var8; ++var10) { // L: 10909
					Player var16 = Client.players[var18[var10]]; // L: 10910
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != PlayerAppearance.localPlayer) { // L: 10911
						var12 = var16.x / 32 - PlayerAppearance.localPlayer.x / 32; // L: 10912
						int var13 = var16.y / 32 - PlayerAppearance.localPlayer.y / 32; // L: 10913
						boolean var14 = false; // L: 10914
						if (PlayerAppearance.localPlayer.team != 0 && var16.team != 0 && var16.team == PlayerAppearance.localPlayer.team) { // L: 10915
							var14 = true;
						}

						if (var16.isFriend()) { // L: 10916
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[3], var4);
						} else if (var14) { // L: 10917
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) { // L: 10918
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[5], var4);
						} else {
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[2], var4); // L: 10919
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 10922
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 10923
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex]; // L: 10924
						if (var20 != null) { // L: 10925
							var11 = var20.x / 32 - PlayerAppearance.localPlayer.x / 32; // L: 10926
							var12 = var20.y / 32 - PlayerAppearance.localPlayer.y / 32; // L: 10927
							AbstractWorldMapData.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4); // L: 10928
						}
					}

					if (Client.hintArrowType == 2) { // L: 10931
						var10 = Client.hintArrowX * 4 - NetFileRequest.baseX * 4 + 2 - PlayerAppearance.localPlayer.x / 32; // L: 10932
						var11 = Client.hintArrowY * 4 - class41.baseY * 4 + 2 - PlayerAppearance.localPlayer.y / 32; // L: 10933
						AbstractWorldMapData.worldToMinimap(var1, var2, var10, var11, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4); // L: 10934
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 10936
						Player var21 = Client.players[Client.hintArrowPlayerIndex]; // L: 10937
						if (var21 != null) { // L: 10938
							var11 = var21.x / 32 - PlayerAppearance.localPlayer.x / 32; // L: 10939
							var12 = var21.y / 32 - PlayerAppearance.localPlayer.y / 32; // L: 10940
							AbstractWorldMapData.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4); // L: 10941
						}
					}
				}

				if (Client.destinationX != 0) { // L: 10945
					var10 = Client.destinationX * 4 + 2 - PlayerAppearance.localPlayer.x / 32; // L: 10946
					var11 = Client.destinationY * 4 + 2 - PlayerAppearance.localPlayer.y / 32; // L: 10947
					class25.drawSpriteOnMinimap(var1, var2, var10, var11, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[0], var4); // L: 10948
				}

				if (!PlayerAppearance.localPlayer.isHidden) { // L: 10950
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 10952
			}

			Client.field854[var3] = true; // L: 10953
		}
	} // L: 10954
}
