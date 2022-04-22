import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1344367175
	)
	public static int field3945;
	@ObfuscatedName("f")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("b")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3945 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 51
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 52
				} // L: 53

				if (var1 != null) { // L: 54
					if (var1.type == 0) { // L: 55
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 56
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 57
							var1.remove(); // L: 58
						} // L: 59
					} else if (var1.type == 1) { // L: 61
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 62
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 64
						} // L: 65
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 67
						if (field3945 <= 1) { // L: 68
							field3945 = 0; // L: 69
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 70
							return; // L: 71
						}

						field3945 = 600; // L: 73
					}
				} else {
					class93.method2384(100L); // L: 77
					synchronized(ArchiveDiskActionHandler_lock) { // L: 78
						if (field3945 <= 1) { // L: 79
							field3945 = 0; // L: 80
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 81
							return; // L: 82
						}

						--field3945; // L: 84
					}
				}
			}
		} catch (Exception var13) { // L: 89
			Widget.RunException_sendStackTrace((String)null, var13); // L: 90
		}
	} // L: 92

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-64972529"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lky;I[B[BB)V",
		garbageValue = "1"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3415 == null) { // L: 988
			if (var2 == null) { // L: 989
				return; // L: 995
			}

			var0.field3415 = new byte[11][]; // L: 990
			var0.field3485 = new byte[11][]; // L: 991
			var0.field3417 = new int[11]; // L: 992
			var0.field3418 = new int[11]; // L: 993
		}

		var0.field3415[var1] = var2; // L: 997
		if (var2 != null) {
			var0.field3414 = true; // L: 998
		} else {
			var0.field3414 = false; // L: 1000

			for (int var4 = 0; var4 < var0.field3415.length; ++var4) { // L: 1001
				if (var0.field3415[var4] != null) { // L: 1002
					var0.field3414 = true; // L: 1003
					break; // L: 1004
				}
			}
		}

		var0.field3485[var1] = var3; // L: 1008
	} // L: 1009

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433593353"
	)
	public static void method5813() {
		class451.SpriteBuffer_xOffsets = null; // L: 239
		class271.SpriteBuffer_yOffsets = null; // L: 240
		class451.SpriteBuffer_spriteWidths = null; // L: 241
		class451.SpriteBuffer_spriteHeights = null; // L: 242
		NetFileRequest.SpriteBuffer_spritePalette = null; // L: 243
		FriendLoginUpdate.SpriteBuffer_pixels = null; // L: 244
	} // L: 245

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIIB)V",
		garbageValue = "-122"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class116.playPcmPlayers(); // L: 12220
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12221
		if (var4 != null) { // L: 12222
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12223
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12224
				int var5 = Client.camAngleY & 2047; // L: 12225
				int var6 = GrandExchangeEvents.localPlayer.x / 32 + 48; // L: 12226
				int var7 = 464 - GrandExchangeEvents.localPlayer.y / 32; // L: 12227
				HealthBarUpdate.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12228

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12229
					var16 = Client.mapIconXs[var8] * 4 + 2 - GrandExchangeEvents.localPlayer.x / 32; // L: 12230
					var10 = Client.mapIconYs[var8] * 4 + 2 - GrandExchangeEvents.localPlayer.y / 32; // L: 12231
					ReflectionCheck.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12232
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12234
					for (var16 = 0; var16 < 104; ++var16) { // L: 12235
						NodeDeque var14 = Client.groundItems[class18.Client_plane][var8][var16]; // L: 12236
						if (var14 != null) { // L: 12237
							var11 = var8 * 4 + 2 - GrandExchangeEvents.localPlayer.x / 32; // L: 12238
							var12 = var16 * 4 + 2 - GrandExchangeEvents.localPlayer.y / 32; // L: 12239
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var11, var12, class54.mapDotSprites[0], var4); // L: 12240
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12244
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12245
					if (var9 != null && var9.isVisible()) { // L: 12246
						NPCComposition var18 = var9.definition; // L: 12247
						if (var18 != null && var18.transforms != null) { // L: 12248
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12249
							var11 = var9.x / 32 - GrandExchangeEvents.localPlayer.x / 32; // L: 12250
							var12 = var9.y / 32 - GrandExchangeEvents.localPlayer.y / 32; // L: 12251
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var11, var12, class54.mapDotSprites[1], var4); // L: 12252
						}
					}
				}

				var8 = Players.Players_count; // L: 12256
				int[] var17 = Players.Players_indices; // L: 12257

				for (var10 = 0; var10 < var8; ++var10) { // L: 12258
					Player var15 = Client.players[var17[var10]]; // L: 12259
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != GrandExchangeEvents.localPlayer) { // L: 12260
						var12 = var15.x / 32 - GrandExchangeEvents.localPlayer.x / 32; // L: 12261
						int var13 = var15.y / 32 - GrandExchangeEvents.localPlayer.y / 32; // L: 12262
						if (var15.isFriend()) { // L: 12263
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[3], var4);
						} else if (GrandExchangeEvents.localPlayer.team != 0 && var15.team != 0 && var15.team == GrandExchangeEvents.localPlayer.team) { // L: 12264
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12265
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12266
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[6], var4);
						} else {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[2], var4); // L: 12267
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12270
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12271
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12272
						if (var19 != null) { // L: 12273
							var11 = var19.x / 32 - GrandExchangeEvents.localPlayer.x / 32; // L: 12274
							var12 = var19.y / 32 - GrandExchangeEvents.localPlayer.y / 32; // L: 12275
							ReflectionCheck.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12276
						}
					}

					if (Client.hintArrowType == 2) { // L: 12279
						var10 = Client.hintArrowX * 4 - GrandExchangeOfferOwnWorldComparator.baseX * 4 + 2 - GrandExchangeEvents.localPlayer.x / 32; // L: 12280
						var11 = Client.hintArrowY * 4 - VarcInt.baseY * 4 + 2 - GrandExchangeEvents.localPlayer.y / 32; // L: 12281
						ReflectionCheck.worldToMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12282
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12284
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12285
						if (var20 != null) { // L: 12286
							var11 = var20.x / 32 - GrandExchangeEvents.localPlayer.x / 32; // L: 12287
							var12 = var20.y / 32 - GrandExchangeEvents.localPlayer.y / 32; // L: 12288
							ReflectionCheck.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12289
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12293
					var10 = Client.destinationX * 4 + 2 - GrandExchangeEvents.localPlayer.x / 32; // L: 12294
					var11 = Client.destinationY * 4 + 2 - GrandExchangeEvents.localPlayer.y / 32; // L: 12295
					ReflectionCheck.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[0], var4); // L: 12296
				}

				if (!GrandExchangeEvents.localPlayer.isHidden) { // L: 12298
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12300
			}

			Client.field716[var3] = true; // L: 12301
		}
	} // L: 12302
}
