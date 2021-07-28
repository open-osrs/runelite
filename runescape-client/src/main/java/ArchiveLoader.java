import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1698036073
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 220643987
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Ljs;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4956(var1) || this.archive.method4964(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "-2061376576"
	)
	public static PacketBufferNode method1779() {
		PacketBufferNode var0 = CollisionMap.method3205();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "1089471129"
	)
	public static final void method1781(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			GrandExchangeOfferAgeComparator.field3633 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			PcmPlayer.field181 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIII)V",
		garbageValue = "131255648"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class262.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = MouseHandler.localPlayer.x / 32 + 48;
				int var7 = 464 - MouseHandler.localPlayer.y / 32;
				class376.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - MouseHandler.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - MouseHandler.localPlayer.y / 32;
					class267.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[GrandExchangeEvent.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - MouseHandler.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - MouseHandler.localPlayer.y / 32;
							class267.drawSpriteOnMinimap(var1, var2, var11, var12, class126.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - MouseHandler.localPlayer.x / 32;
							var12 = var9.y / 32 - MouseHandler.localPlayer.y / 32;
							class267.drawSpriteOnMinimap(var1, var2, var11, var12, class126.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != MouseHandler.localPlayer) {
						var12 = var15.x / 32 - MouseHandler.localPlayer.x / 32;
						int var13 = var15.y / 32 - MouseHandler.localPlayer.y / 32;
						if (var15.isFriend()) {
							class267.drawSpriteOnMinimap(var1, var2, var12, var13, class126.mapDotSprites[3], var4);
						} else if (MouseHandler.localPlayer.team != 0 && var15.team != 0 && var15.team == MouseHandler.localPlayer.team) {
							class267.drawSpriteOnMinimap(var1, var2, var12, var13, class126.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class267.drawSpriteOnMinimap(var1, var2, var12, var13, class126.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							class267.drawSpriteOnMinimap(var1, var2, var12, var13, class126.mapDotSprites[6], var4);
						} else {
							class267.drawSpriteOnMinimap(var1, var2, var12, var13, class126.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - MouseHandler.localPlayer.x / 32;
							var12 = var19.y / 32 - MouseHandler.localPlayer.y / 32;
							Varcs.worldToMinimap(var1, var2, var11, var12, FloorUnderlayDefinition.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - GrandExchangeOfferNameComparator.baseX * 4 + 2 - MouseHandler.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - NPC.baseY * 4 + 2 - MouseHandler.localPlayer.y / 32;
						Varcs.worldToMinimap(var1, var2, var10, var11, FloorUnderlayDefinition.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - MouseHandler.localPlayer.x / 32;
							var12 = var20.y / 32 - MouseHandler.localPlayer.y / 32;
							Varcs.worldToMinimap(var1, var2, var11, var12, FloorUnderlayDefinition.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - MouseHandler.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - MouseHandler.localPlayer.y / 32;
					class267.drawSpriteOnMinimap(var1, var2, var10, var11, FloorUnderlayDefinition.mapMarkerSprites[0], var4);
				}

				if (!MouseHandler.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field617[var3] = true;
		}
	}
}
