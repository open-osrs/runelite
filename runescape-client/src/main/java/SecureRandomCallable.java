import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class39.method643(); // L: 45
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1343548281"
	)
	static final int method1226(int var0, int var1) {
		if (var0 == -2) { // L: 573
			return 12345678;
		} else if (var0 == -1) { // L: 574
			if (var1 < 2) { // L: 575
				var1 = 2;
			} else if (var1 > 126) { // L: 576
				var1 = 126;
			}

			return var1; // L: 577
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 579
			if (var1 < 2) { // L: 580
				var1 = 2;
			} else if (var1 > 126) { // L: 581
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 582
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2525
		class228.method4311(); // L: 2527
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2529
		KitDefinition.KitDefinition_cached.clear(); // L: 2532
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2535
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2536
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2537
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2538
		NPCComposition.NpcDefinition_cached.clear(); // L: 2541
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2542
		ItemComposition.ItemDefinition_cached.clear(); // L: 2545
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 2546
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 2547
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2550
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2551
		WorldMapEvent.method851(); // L: 2553
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2555
		World.method1924(); // L: 2557
		KeyHandler.method913(); // L: 2558
		Tile.method3032(); // L: 2559
		StructComposition.StructDefinition_cached.clear(); // L: 2561
		ParamComposition.ParamDefinition_cached.clear(); // L: 2564
		ItemLayer.method2938(); // L: 2566
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2568
		WorldMapEvent.method850(); // L: 2570
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2571
		Script.Script_cached.clear(); // L: 2572
		class52.archive0.clearFiles(); // L: 2573
		SpriteMask.archive1.clearFiles(); // L: 2574
		PlayerComposition.archive3.clearFiles(); // L: 2575
		WorldMapCacheName.archive4.clearFiles(); // L: 2576
		class8.archive5.clearFiles(); // L: 2577
		UrlRequester.archive6.clearFiles(); // L: 2578
		WorldMapData_0.archive7.clearFiles(); // L: 2579
		ModeWhere.archive8.clearFiles(); // L: 2580
		ViewportMouse.archive9.clearFiles(); // L: 2581
		LoginScreenAnimation.archive10.clearFiles(); // L: 2582
		WorldMapManager.archive11.clearFiles(); // L: 2583
		WorldMapSection0.archive12.clearFiles(); // L: 2584
		MilliClock.scene.clear(); // L: 2586

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2587
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2588
		class206.musicPlayerStatus = 1; // L: 2590
		class206.musicTrackArchive = null; // L: 2591
		class206.musicTrackGroupId = -1; // L: 2592
		SoundSystem.musicTrackFileId = -1; // L: 2593
		DevicePcmPlayerProvider.musicTrackVolume = 0; // L: 2594
		class206.musicTrackBoolean = false; // L: 2595
		class7.pcmSampleLength = 2; // L: 2596
		Client.currentTrackGroupId = -1; // L: 2598
		Client.field899 = false; // L: 2599

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 2601
			if (var1.stream1 != null) { // L: 2602
				VarbitComposition.pcmStreamMixer.removeSubStream(var1.stream1); // L: 2603
				var1.stream1 = null; // L: 2604
			}

			if (var1.stream2 != null) { // L: 2606
				VarbitComposition.pcmStreamMixer.removeSubStream(var1.stream2); // L: 2607
				var1.stream2 = null; // L: 2608
			}
		}

		ObjectSound.objectSounds.clear(); // L: 2611
		ItemContainer.updateGameState(10); // L: 2613
	} // L: 2614

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lhz;III)V",
		garbageValue = "860211947"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3409
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3410
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3411
				if (var3 == null) { // L: 3412
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3413
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3414
				if (var3.contains(var4, var5)) { // L: 3415
					var4 -= var3.width / 2; // L: 3416
					var5 -= var3.height / 2; // L: 3417
					int var6 = Client.camAngleY & 2047; // L: 3418
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3419
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3420
					int var9 = var4 * var8 + var5 * var7 >> 11; // L: 3421
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3422
					int var11 = var9 + UserComparator9.localPlayer.x >> 7; // L: 3423
					int var12 = UserComparator9.localPlayer.y - var10 >> 7; // L: 3424
					PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher); // L: 3426
					var13.packetBuffer.writeByte(18); // L: 3427
					var13.packetBuffer.method5778(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3428
					var13.packetBuffer.writeIntME(var12 + NetCache.baseY); // L: 3429
					var13.packetBuffer.writeShort(var11 + GrandExchangeOfferNameComparator.baseX); // L: 3430
					var13.packetBuffer.writeByte(var4); // L: 3431
					var13.packetBuffer.writeByte(var5); // L: 3432
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3433
					var13.packetBuffer.writeByte(57); // L: 3434
					var13.packetBuffer.writeByte(0); // L: 3435
					var13.packetBuffer.writeByte(0); // L: 3436
					var13.packetBuffer.writeByte(89); // L: 3437
					var13.packetBuffer.writeShort(UserComparator9.localPlayer.x); // L: 3438
					var13.packetBuffer.writeShort(UserComparator9.localPlayer.y); // L: 3439
					var13.packetBuffer.writeByte(63); // L: 3440
					Client.packetWriter.addNode(var13); // L: 3441
					Client.destinationX = var11; // L: 3442
					Client.destinationY = var12; // L: 3443
				}
			}

		}
	} // L: 3446

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-358852627"
	)
	static int method1233(int var0, int var1) {
		int var2 = var1 - 334; // L: 4926
		if (var2 < 0) { // L: 4927
			var2 = 0;
		} else if (var2 > 100) { // L: 4928
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 4929
		return var0 * var3 / 256; // L: 4930
	}
}
