import java.applet.Applet;
import java.net.URL;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("gc")
public class class204 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lil;",
		garbageValue = "236947839"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "10"
	)
	static boolean method3888(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 59
			try {
				if (!class60.field454.startsWith("win")) { // L: 61
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 62
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 63

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 64
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 65
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 67
					return true; // L: 68
				}
			} catch (Throwable var5) { // L: 70
				return false; // L: 71
			}
		} else if (var1 == 1) { // L: 74
			try {
				Object var10 = class56.method923(class60.applet, var2, new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()}); // L: 76
				return var10 != null; // L: 77
			} catch (Throwable var6) { // L: 79
				return false; // L: 80
			}
		} else if (var1 == 2) { // L: 83
			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank"); // L: 85
				return true; // L: 86
			} catch (Exception var7) { // L: 88
				return false; // L: 89
			}
		} else if (var1 == 3) { // L: 92
			try {
				Applet var3 = class60.applet; // L: 94
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 97
			} catch (Throwable var9) { // L: 100
			}

			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top"); // L: 102
				return true; // L: 103
			} catch (Exception var8) { // L: 105
				return false; // L: 106
			}
		} else {
			throw new IllegalArgumentException(); // L: 109
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Ljj;IIZI)V",
		garbageValue = "-151071260"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10160
		byte var6 = -1; // L: 10161
		String var7 = null; // L: 10162
		if (var5 != null && var5[var3] != null) { // L: 10163
			if (var3 == 0) { // L: 10164
				var6 = 33;
			} else if (var3 == 1) { // L: 10165
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10166
			} else if (var3 == 3) { // L: 10167
				var6 = 36;
			} else {
				var6 = 37; // L: 10168
			}

			var7 = var5[var3]; // L: 10169
		} else if (var3 == 4) { // L: 10172
			var6 = 37; // L: 10173
			var7 = "Drop"; // L: 10174
		}

		if (var6 != -1 && var7 != null) { // L: 10177
			WorldMapEvent.insertMenuItem(var7, FileSystem.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10178
		}

	} // L: 10180

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIII)V",
		garbageValue = "-1768391401"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		UserComparator5.playPcmPlayers(); // L: 11303
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11304
		if (var4 != null) { // L: 11305
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11306
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11307
				int var5 = Client.camAngleY & 2047; // L: 11308
				int var6 = UserComparator9.localPlayer.x / 32 + 48; // L: 11309
				int var7 = 464 - UserComparator9.localPlayer.y / 32; // L: 11310
				GrandExchangeOfferAgeComparator.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11311

				int var8;
				int var10;
				int var17;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11312
					var17 = Client.mapIconXs[var8] * 4 + 2 - UserComparator9.localPlayer.x / 32; // L: 11313
					var10 = Client.mapIconYs[var8] * 4 + 2 - UserComparator9.localPlayer.y / 32; // L: 11314
					AbstractArchive.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4); // L: 11315
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11317
					for (var17 = 0; var17 < 104; ++var17) { // L: 11318
						NodeDeque var15 = Client.groundItems[class90.Client_plane][var8][var17]; // L: 11319
						if (var15 != null) { // L: 11320
							var11 = var8 * 4 + 2 - UserComparator9.localPlayer.x / 32; // L: 11321
							var12 = var17 * 4 + 2 - UserComparator9.localPlayer.y / 32; // L: 11322
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var11, var12, ChatChannel.mapDotSprites[0], var4); // L: 11323
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11327
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11328
					if (var9 != null && var9.isVisible()) { // L: 11329
						NPCComposition var19 = var9.definition; // L: 11330
						if (var19 != null && var19.transforms != null) { // L: 11331
							var19 = var19.transform();
						}

						if (var19 != null && var19.drawMapDot && var19.isInteractable) { // L: 11332
							var11 = var9.x / 32 - UserComparator9.localPlayer.x / 32; // L: 11333
							var12 = var9.y / 32 - UserComparator9.localPlayer.y / 32; // L: 11334
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var11, var12, ChatChannel.mapDotSprites[1], var4); // L: 11335
						}
					}
				}

				var8 = Players.Players_count; // L: 11339
				int[] var18 = Players.Players_indices; // L: 11340

				for (var10 = 0; var10 < var8; ++var10) { // L: 11341
					Player var16 = Client.players[var18[var10]]; // L: 11342
					if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != UserComparator9.localPlayer) { // L: 11343
						var12 = var16.x / 32 - UserComparator9.localPlayer.x / 32; // L: 11344
						int var13 = var16.y / 32 - UserComparator9.localPlayer.y / 32; // L: 11345
						boolean var14 = false; // L: 11346
						if (UserComparator9.localPlayer.team != 0 && var16.team != 0 && var16.team == UserComparator9.localPlayer.team) { // L: 11347
							var14 = true;
						}

						if (var16.isFriend()) { // L: 11348
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[3], var4);
						} else if (var14) { // L: 11349
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[4], var4);
						} else if (var16.isClanMember()) { // L: 11350
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[5], var4);
						} else {
							AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[2], var4); // L: 11351
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11354
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11355
						NPC var20 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11356
						if (var20 != null) { // L: 11357
							var11 = var20.x / 32 - UserComparator9.localPlayer.x / 32; // L: 11358
							var12 = var20.y / 32 - UserComparator9.localPlayer.y / 32; // L: 11359
							WorldMapDecoration.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4); // L: 11360
						}
					}

					if (Client.hintArrowType == 2) { // L: 11363
						var10 = Client.hintArrowX * 4 - GrandExchangeOfferNameComparator.baseX * 4 + 2 - UserComparator9.localPlayer.x / 32; // L: 11364
						var11 = Client.hintArrowY * 4 - NetCache.baseY * 4 + 2 - UserComparator9.localPlayer.y / 32; // L: 11365
						WorldMapDecoration.worldToMinimap(var1, var2, var10, var11, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4); // L: 11366
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11368
						Player var21 = Client.players[Client.hintArrowPlayerIndex]; // L: 11369
						if (var21 != null) { // L: 11370
							var11 = var21.x / 32 - UserComparator9.localPlayer.x / 32; // L: 11371
							var12 = var21.y / 32 - UserComparator9.localPlayer.y / 32; // L: 11372
							WorldMapDecoration.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4); // L: 11373
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11377
					var10 = Client.destinationX * 4 + 2 - UserComparator9.localPlayer.x / 32; // L: 11378
					var11 = Client.destinationY * 4 + 2 - UserComparator9.localPlayer.y / 32; // L: 11379
					AbstractArchive.drawSpriteOnMinimap(var1, var2, var10, var11, GrandExchangeOfferWorldComparator.mapMarkerSprites[0], var4); // L: 11380
				}

				if (!UserComparator9.localPlayer.isHidden) { // L: 11382
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11384
			}

			Client.field827[var3] = true; // L: 11385
		}
	} // L: 11386
}
