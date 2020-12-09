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
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-277286562"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	static void method3983() {
		Tiles.Tiles_minPlane = 99;
		Tiles.field514 = new byte[4][104][104];
		Tiles.field508 = new byte[4][104][104];
		class9.field40 = new byte[4][104][104];
		Username.field3663 = new byte[4][104][104];
		GrandExchangeOfferWorldComparator.field52 = new int[4][105][105];
		Tiles.field511 = new byte[4][105][105];
		class92.field1173 = new int[105][105];
		VarbitDefinition.Tiles_hue = new int[104];
		ArchiveDiskActionHandler.Tiles_saturation = new int[104];
		class92.Tiles_lightness = new int[104];
		UserComparator7.Tiles_hueMultiplier = new int[104];
		Varcs.field1283 = new int[104];
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIII)V",
		garbageValue = "29105444"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		FontName.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = PlayerAppearance.localPlayer.x / 32 + 48;
				int var7 = 464 - PlayerAppearance.localPlayer.y / 32;
				class25.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var17 = Client.mapIconXs[var8] * 4 + 2 - PlayerAppearance.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - PlayerAppearance.localPlayer.y / 32;
					class25.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var17 = 0; var17 < 104; ++var17) {
						NodeDeque var15 = Client.groundItems[GameObject.Client_plane][var8][var17];
						if (var15 != null) {
							var11 = var8 * 4 + 2 - PlayerAppearance.localPlayer.x / 32;
							var12 = var17 * 4 + 2 - PlayerAppearance.localPlayer.y / 32;
							class25.drawSpriteOnMinimap(var1, var2, var11, var12, Actor.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCDefinition var19 = var9.definition;
						if (var19 != null && var19.transforms != null) {
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) {
							var11 = var9.x / 32 - PlayerAppearance.localPlayer.x / 32;
							var12 = var9.y / 32 - PlayerAppearance.localPlayer.y / 32;
							class25.drawSpriteOnMinimap(var1, var2, var11, var12, Actor.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var18 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var16 = Client.players[var18[var10]];
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != PlayerAppearance.localPlayer) {
						var12 = var16.x / 32 - PlayerAppearance.localPlayer.x / 32;
						int var13 = var16.y / 32 - PlayerAppearance.localPlayer.y / 32;
						boolean var14 = false;
						if (PlayerAppearance.localPlayer.team != 0 && var16.team != 0 && var16.team == PlayerAppearance.localPlayer.team) {
							var14 = true;
						}

						if (var16.isFriend()) {
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[3], var4);
						} else if (var14) {
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) {
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[5], var4);
						} else {
							class25.drawSpriteOnMinimap(var1, var2, var12, var13, Actor.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - PlayerAppearance.localPlayer.x / 32;
							var12 = var20.y / 32 - PlayerAppearance.localPlayer.y / 32;
							AbstractWorldMapData.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - NetFileRequest.baseX * 256 + 2 - PlayerAppearance.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class41.baseY * 256 + 2 - PlayerAppearance.localPlayer.y / 32;
						AbstractWorldMapData.worldToMinimap(var1, var2, var10, var11, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var21 = Client.players[Client.hintArrowPlayerIndex];
						if (var21 != null) {
							var11 = var21.x / 32 - PlayerAppearance.localPlayer.x / 32;
							var12 = var21.y / 32 - PlayerAppearance.localPlayer.y / 32;
							AbstractWorldMapData.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - PlayerAppearance.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - PlayerAppearance.localPlayer.y / 32;
					class25.drawSpriteOnMinimap(var1, var2, var10, var11, GrandExchangeOfferUnitPriceComparator.mapMarkerSprites[0], var4);
				}

				if (!PlayerAppearance.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field854[var3] = true;
		}
	}
}
