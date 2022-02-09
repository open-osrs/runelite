import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class265 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1954424185
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -629142723
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I[B[BI)V",
		garbageValue = "-1577741603"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3339 == null) { // L: 972
			if (var2 == null) { // L: 973
				return; // L: 979
			}

			var0.field3339 = new byte[11][]; // L: 974
			var0.field3397 = new byte[11][]; // L: 975
			var0.field3341 = new int[11]; // L: 976
			var0.field3342 = new int[11]; // L: 977
		}

		var0.field3339[var1] = var2; // L: 981
		if (var2 != null) {
			var0.field3338 = true; // L: 982
		} else {
			var0.field3338 = false; // L: 984

			for (int var4 = 0; var4 < var0.field3339.length; ++var4) { // L: 985
				if (var0.field3339[var4] != null) { // L: 986
					var0.field3338 = true; // L: 987
					break;
				}
			}
		}

		var0.field3397[var1] = var3; // L: 992
	} // L: 993

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-490777223"
	)
	static final void method5030(int var0, int var1, boolean var2) {
		if (!var2 || var0 != MouseHandler.field240 || UserComparator7.field1352 != var1) { // L: 5367
			MouseHandler.field240 = var0; // L: 5370
			UserComparator7.field1352 = var1; // L: 5371
			class111.updateGameState(25); // L: 5372
			Calendar.drawLoadingMessage("Loading - please wait.", true); // L: 5373
			int var3 = Canvas.baseX; // L: 5374
			int var4 = class118.baseY; // L: 5375
			Canvas.baseX = (var0 - 6) * 8; // L: 5376
			class118.baseY = (var1 - 6) * 8; // L: 5377
			int var5 = Canvas.baseX - var3; // L: 5378
			int var6 = class118.baseY - var4; // L: 5379
			var3 = Canvas.baseX; // L: 5380
			var4 = class118.baseY; // L: 5381

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5382
				NPC var19 = Client.npcs[var7]; // L: 5383
				if (var19 != null) { // L: 5384
					for (var9 = 0; var9 < 10; ++var9) { // L: 5385
						var10000 = var19.pathX; // L: 5386
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5387
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5389
					var19.y -= var6 * 128; // L: 5390
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5393
				Player var22 = Client.players[var7]; // L: 5394
				if (var22 != null) { // L: 5395
					for (var9 = 0; var9 < 10; ++var9) { // L: 5396
						var10000 = var22.pathX; // L: 5397
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5398
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5400
					var22.y -= var6 * 128; // L: 5401
				}
			}

			byte var20 = 0; // L: 5404
			byte var8 = 104; // L: 5405
			byte var21 = 1; // L: 5406
			if (var5 < 0) { // L: 5407
				var20 = 103; // L: 5408
				var8 = -1; // L: 5409
				var21 = -1; // L: 5410
			}

			byte var10 = 0; // L: 5412
			byte var11 = 104; // L: 5413
			byte var12 = 1; // L: 5414
			if (var6 < 0) { // L: 5415
				var10 = 103; // L: 5416
				var11 = -1; // L: 5417
				var12 = -1; // L: 5418
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5420
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5421
					int var15 = var5 + var13; // L: 5422
					int var16 = var14 + var6; // L: 5423

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5424
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5425
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5426
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5430 5431 5435
				var18.x -= var5; // L: 5432
				var18.y -= var6; // L: 5433
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5434
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5437
				Client.destinationX -= var5; // L: 5438
				Client.destinationY -= var6; // L: 5439
			}

			Client.soundEffectCount = 0; // L: 5441
			Client.isCameraLocked = false; // L: 5442
			class414.cameraX -= var5 << 7; // L: 5443
			GrandExchangeOfferOwnWorldComparator.cameraZ -= var6 << 7; // L: 5444
			class29.oculusOrbFocalPointX -= var5 << 7; // L: 5445
			class121.oculusOrbFocalPointY -= var6 << 7; // L: 5446
			Client.field735 = -1; // L: 5447
			Client.graphicsObjects.clear(); // L: 5448
			Client.projectiles.clear(); // L: 5449

			for (var14 = 0; var14 < 4; ++var14) { // L: 5450
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5368 5451
}
