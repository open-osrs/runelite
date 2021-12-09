import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1996697933
	)
	public static int field1339;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1340087327
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;B)I",
		garbageValue = "77"
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

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1506932580"
	)
	@Export("load")
	static void load() {
		int var18;
		if (Client.titleLoadingStage == 0) { // L: 2172
			class7.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 2173

			for (var18 = 0; var18 < 4; ++var18) { // L: 2174
				Client.collisionMaps[var18] = new CollisionMap(104, 104);
			}

			class29.sceneMinimapSprite = new SpritePixels(512, 512); // L: 2175
			Login.Login_loadingText = "Starting game engine..."; // L: 2176
			Login.Login_loadingPercent = 5; // L: 2177
			Client.titleLoadingStage = 20; // L: 2178
		} else if (Client.titleLoadingStage == 20) { // L: 2181
			Login.Login_loadingText = "Prepared visibility map"; // L: 2182
			Login.Login_loadingPercent = 10; // L: 2183
			Client.titleLoadingStage = 30; // L: 2184
		} else if (Client.titleLoadingStage == 30) { // L: 2187
			class115.archive1 = VarcInt.newArchive(0, false, true, true); // L: 2188
			class9.archive3 = VarcInt.newArchive(1, false, true, true); // L: 2189
			class131.archive2 = VarcInt.newArchive(2, true, false, true); // L: 2190
			class19.archive4 = VarcInt.newArchive(3, false, true, true); // L: 2191
			KeyHandler.field151 = VarcInt.newArchive(4, false, true, true); // L: 2192
			class140.archive5 = VarcInt.newArchive(5, true, true, true); // L: 2193
			WorldMapScaleHandler.archive6 = VarcInt.newArchive(6, true, true, true); // L: 2194
			class115.archive7 = VarcInt.newArchive(7, false, true, true); // L: 2195
			UserComparator6.archive8 = VarcInt.newArchive(8, false, true, true); // L: 2196
			NetSocket.archive9 = VarcInt.newArchive(9, false, true, true); // L: 2197
			class257.archive10 = VarcInt.newArchive(10, false, true, true); // L: 2198
			Players.archive11 = VarcInt.newArchive(11, false, true, true); // L: 2199
			TaskHandler.archive12 = VarcInt.newArchive(12, false, true, true); // L: 2200
			class1.archive13 = VarcInt.newArchive(13, true, false, true); // L: 2201
			ChatChannel.archive14 = VarcInt.newArchive(14, false, true, true); // L: 2202
			class133.archive15 = VarcInt.newArchive(15, false, true, true); // L: 2203
			class126.archive17 = VarcInt.newArchive(17, true, true, true); // L: 2204
			VertexNormal.archive18 = VarcInt.newArchive(18, false, true, true); // L: 2205
			class148.archive19 = VarcInt.newArchive(19, false, true, true); // L: 2206
			HealthBarUpdate.archive20 = VarcInt.newArchive(20, false, true, true); // L: 2207
			Login.Login_loadingText = "Connecting to update server"; // L: 2208
			Login.Login_loadingPercent = 20; // L: 2209
			Client.titleLoadingStage = 40; // L: 2210
		} else if (Client.titleLoadingStage == 40) { // L: 2213
			byte var41 = 0; // L: 2214
			var18 = var41 + class115.archive1.percentage() * 4 / 100; // L: 2215
			var18 += class9.archive3.percentage() * 4 / 100; // L: 2216
			var18 += class131.archive2.percentage() * 2 / 100; // L: 2217
			var18 += class19.archive4.percentage() * 2 / 100; // L: 2218
			var18 += KeyHandler.field151.percentage() * 6 / 100; // L: 2219
			var18 += class140.archive5.percentage() * 4 / 100; // L: 2220
			var18 += WorldMapScaleHandler.archive6.percentage() * 2 / 100; // L: 2221
			var18 += class115.archive7.percentage() * 56 / 100; // L: 2222
			var18 += UserComparator6.archive8.percentage() * 2 / 100; // L: 2223
			var18 += NetSocket.archive9.percentage() * 2 / 100; // L: 2224
			var18 += class257.archive10.percentage() * 2 / 100; // L: 2225
			var18 += Players.archive11.percentage() * 2 / 100; // L: 2226
			var18 += TaskHandler.archive12.percentage() * 2 / 100; // L: 2227
			var18 += class1.archive13.percentage() * 2 / 100; // L: 2228
			var18 += ChatChannel.archive14.percentage() * 2 / 100; // L: 2229
			var18 += class133.archive15.percentage() * 2 / 100; // L: 2230
			var18 += class148.archive19.percentage() / 100; // L: 2231
			var18 += VertexNormal.archive18.percentage() / 100; // L: 2232
			var18 += HealthBarUpdate.archive20.percentage() / 100; // L: 2233
			var18 += class126.archive17.method5540() && class126.archive17.isFullyLoaded() ? 1 : 0; // L: 2234
			if (var18 != 100) { // L: 2235
				if (var18 != 0) { // L: 2236
					Login.Login_loadingText = "Checking for updates - " + var18 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 2237
			} else {
				NetFileRequest.method5587(class115.archive1, "Animations"); // L: 2240
				NetFileRequest.method5587(class9.archive3, "Skeletons"); // L: 2241
				NetFileRequest.method5587(KeyHandler.field151, "Sound FX"); // L: 2242
				NetFileRequest.method5587(class140.archive5, "Maps"); // L: 2243
				NetFileRequest.method5587(WorldMapScaleHandler.archive6, "Music Tracks"); // L: 2244
				NetFileRequest.method5587(class115.archive7, "Models"); // L: 2245
				NetFileRequest.method5587(UserComparator6.archive8, "Sprites"); // L: 2246
				NetFileRequest.method5587(Players.archive11, "Music Jingles"); // L: 2247
				NetFileRequest.method5587(ChatChannel.archive14, "Music Samples"); // L: 2248
				NetFileRequest.method5587(class133.archive15, "Music Patches"); // L: 2249
				NetFileRequest.method5587(class148.archive19, "World Map"); // L: 2250
				NetFileRequest.method5587(VertexNormal.archive18, "World Map Geography"); // L: 2251
				NetFileRequest.method5587(HealthBarUpdate.archive20, "World Map Ground"); // L: 2252
				class6.spriteIds = new GraphicsDefaults(); // L: 2253
				class6.spriteIds.decode(class126.archive17); // L: 2254
				Login.Login_loadingText = "Loaded update list"; // L: 2255
				Login.Login_loadingPercent = 30; // L: 2256
				Client.titleLoadingStage = 45; // L: 2257
			}
		} else {
			Archive var2;
			if (Client.titleLoadingStage == 45) { // L: 2260
				boolean var40 = !Client.isLowDetail; // L: 2261
				class339.field4058 = 22050; // L: 2264
				SpriteMask.PcmPlayer_stereo = var40; // L: 2265
				field1339 = 2; // L: 2266
				MidiPcmStream var37 = new MidiPcmStream(); // L: 2268
				var37.method5079(9, 128); // L: 2269
				JagexCache.pcmPlayer0 = class4.method29(GameEngine.taskHandler, 0, 22050); // L: 2270
				JagexCache.pcmPlayer0.setStream(var37); // L: 2271
				var2 = class133.archive15; // L: 2272
				Archive var39 = ChatChannel.archive14; // L: 2273
				Archive var29 = KeyHandler.field151; // L: 2274
				class260.musicPatchesArchive = var2; // L: 2276
				class331.musicSamplesArchive = var39; // L: 2277
				class260.soundEffectsArchive = var29; // L: 2278
				class260.midiPcmStream = var37; // L: 2279
				PacketWriter.pcmPlayer1 = class4.method29(GameEngine.taskHandler, 1, 2048); // L: 2281
				class281.pcmStreamMixer = new PcmStreamMixer(); // L: 2282
				PacketWriter.pcmPlayer1.setStream(class281.pcmStreamMixer); // L: 2283
				BoundaryObject.decimator = new Decimator(22050, class339.field4058); // L: 2284
				Login.Login_loadingText = "Prepared sound engine"; // L: 2285
				Login.Login_loadingPercent = 35; // L: 2286
				Client.titleLoadingStage = 50; // L: 2287
				class126.WorldMapElement_fonts = new Fonts(UserComparator6.archive8, class1.archive13); // L: 2288
			} else {
				int var19;
				if (Client.titleLoadingStage == 50) { // L: 2291
					FontName[] var27 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12}; // L: 2294
					var19 = var27.length; // L: 2296
					Fonts var30 = class126.WorldMapElement_fonts; // L: 2297
					FontName[] var25 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12}; // L: 2300
					Client.fontsMap = var30.createMap(var25); // L: 2302
					if (Client.fontsMap.size() < var19) { // L: 2303
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%"; // L: 2304
						Login.Login_loadingPercent = 40; // L: 2305
					} else {
						class307.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 2308
						class114.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 2309
						class136.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 2310
						Interpreter.platformInfo = Client.platformInfoProvider.get(); // L: 2311
						Login.Login_loadingText = "Loaded fonts"; // L: 2312
						Login.Login_loadingPercent = 40; // L: 2313
						Client.titleLoadingStage = 60; // L: 2314
					}
				} else if (Client.titleLoadingStage == 60) { // L: 2317
					var18 = WorldMapArea.method4490(class257.archive10, UserComparator6.archive8); // L: 2318
					var19 = Login.field893.length + Login.field892.length; // L: 2321
					if (var18 < var19) { // L: 2324
						Login.Login_loadingText = "Loading title screen - " + var18 * 100 / var19 + "%"; // L: 2325
						Login.Login_loadingPercent = 50; // L: 2326
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 2329
						Login.Login_loadingPercent = 50; // L: 2330
						VertexNormal.updateGameState(5); // L: 2331
						Client.titleLoadingStage = 70; // L: 2332
					}
				} else if (Client.titleLoadingStage == 70) { // L: 2335
					if (!class131.archive2.isFullyLoaded()) { // L: 2336
						Login.Login_loadingText = "Loading config - " + class131.archive2.loadPercent() + "%"; // L: 2337
						Login.Login_loadingPercent = 60; // L: 2338
					} else {
						Archive var26 = class131.archive2; // L: 2341
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var26; // L: 2343
						class19.method330(class131.archive2); // L: 2345
						GrandExchangeOfferTotalQuantityComparator.method5725(class131.archive2, class115.archive7); // L: 2346
						class186.method3740(class131.archive2, class115.archive7, Client.isLowDetail); // L: 2347
						class258.method5047(class131.archive2, class115.archive7); // L: 2348
						class221.method4700(class131.archive2); // L: 2349
						Archive var35 = class131.archive2; // L: 2350
						var2 = class115.archive7; // L: 2351
						boolean var32 = Client.isMembersWorld; // L: 2352
						Font var4 = class307.fontPlain11; // L: 2353
						ItemComposition.ItemDefinition_archive = var35; // L: 2355
						ItemComposition.ItemDefinition_modelArchive = var2; // L: 2356
						ItemComposition.ItemDefinition_inMembersWorld = var32; // L: 2357
						WorldMapLabelSize.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10); // L: 2358
						ItemComposition.ItemDefinition_fontPlain11 = var4; // L: 2359
						Archive var34 = class131.archive2; // L: 2361
						Archive var22 = class115.archive1; // L: 2362
						Archive var36 = class9.archive3; // L: 2363
						Canvas.SequenceDefinition_archive = var34; // L: 2365
						SequenceDefinition.SequenceDefinition_animationsArchive = var22; // L: 2366
						class118.SequenceDefinition_skeletonsArchive = var36; // L: 2367
						TileItem.method2368(class131.archive2, class115.archive7); // L: 2369
						Archive var23 = class131.archive2; // L: 2370
						VarbitComposition.VarbitDefinition_archive = var23; // L: 2372
						Archive var38 = class131.archive2; // L: 2374
						VarpDefinition.VarpDefinition_archive = var38; // L: 2376
						class433.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 2377
						class194.method3937(class19.archive4, class115.archive7, UserComparator6.archive8, class1.archive13); // L: 2379
						Archive var24 = class131.archive2; // L: 2380
						InvDefinition.InvDefinition_archive = var24; // L: 2382
						Archive var11 = class131.archive2; // L: 2384
						EnumComposition.EnumDefinition_archive = var11; // L: 2386
						Archive var12 = class131.archive2; // L: 2388
						VarcInt.VarcInt_archive = var12; // L: 2390
						Archive var13 = class131.archive2; // L: 2392
						InterfaceParent.method2145(class131.archive2); // L: 2394
						AbstractSocket.HitSplatDefinition_cachedSprites = new class404(class338.field4054, 54, ScriptFrame.clientLanguage, class131.archive2); // L: 2395
						Ignored.HitSplatDefinition_cached = new class404(class338.field4054, 47, ScriptFrame.clientLanguage, class131.archive2); // L: 2396
						class339.varcs = new Varcs(); // L: 2397
						class331.method6174(class131.archive2, UserComparator6.archive8, class1.archive13); // L: 2398
						ObjectSound.method1803(class131.archive2, UserComparator6.archive8); // L: 2399
						Archive var14 = class131.archive2; // L: 2400
						Archive var15 = UserComparator6.archive8; // L: 2401
						WorldMapElement.WorldMapElement_archive = var15; // L: 2403
						if (var14.isFullyLoaded()) { // L: 2404
							class408.WorldMapElement_count = var14.getGroupFileCount(35); // L: 2407
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[class408.WorldMapElement_count]; // L: 2408

							for (int var16 = 0; var16 < class408.WorldMapElement_count; ++var16) { // L: 2409
								byte[] var17 = var14.takeFile(35, var16); // L: 2410
								WorldMapElement.WorldMapElement_cached[var16] = new WorldMapElement(var16); // L: 2411
								if (var17 != null) { // L: 2412
									WorldMapElement.WorldMapElement_cached[var16].decode(new Buffer(var17)); // L: 2413
									WorldMapElement.WorldMapElement_cached[var16].method3173(); // L: 2414
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 2418
						Login.Login_loadingPercent = 60; // L: 2419
						Client.titleLoadingStage = 80; // L: 2420
					}
				} else if (Client.titleLoadingStage == 80) { // L: 2423
					var18 = 0; // L: 2424
					if (LoginScreenAnimation.compass == null) { // L: 2425
						LoginScreenAnimation.compass = class6.SpriteBuffer_getSprite(UserComparator6.archive8, class6.spriteIds.compass, 0);
					} else {
						++var18; // L: 2426
					}

					if (PcmPlayer.redHintArrowSprite == null) { // L: 2427
						PcmPlayer.redHintArrowSprite = class6.SpriteBuffer_getSprite(UserComparator6.archive8, class6.spriteIds.field4163, 0);
					} else {
						++var18; // L: 2428
					}

					IndexedSprite[] var1;
					int var3;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (AbstractWorldMapData.mapSceneSprites == null) { // L: 2429
						var2 = UserComparator6.archive8; // L: 2431
						var3 = class6.spriteIds.mapScenes; // L: 2432
						if (!class147.method3009(var2, var3, 0)) { // L: 2434
							var1 = null; // L: 2435
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 2440

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) { // L: 2441
								var7 = var5[var6] = new IndexedSprite(); // L: 2442
								var7.width = class432.SpriteBuffer_spriteWidth; // L: 2443
								var7.height = class432.SpriteBuffer_spriteHeight; // L: 2444
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2445
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2446
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2447
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2448
								var7.palette = class432.SpriteBuffer_spritePalette; // L: 2449
								var7.pixels = class369.SpriteBuffer_pixels[var6]; // L: 2450
							}

							UserComparator3.method2529(); // L: 2452
							var1 = var5; // L: 2455
						}

						AbstractWorldMapData.mapSceneSprites = var1; // L: 2457
					} else {
						++var18; // L: 2459
					}

					int var8;
					byte[] var9;
					int var10;
					SpritePixels[] var28;
					SpritePixels[] var31;
					SpritePixels var33;
					if (class286.headIconPkSprites == null) { // L: 2460
						var2 = UserComparator6.archive8; // L: 2462
						var3 = class6.spriteIds.headIconsPk; // L: 2463
						if (!class147.method3009(var2, var3, 0)) { // L: 2465
							var28 = null; // L: 2466
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2471
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2485
									var28 = var31; // L: 2488
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2473
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2474
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2475
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2476
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2477
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2478
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2479
								var8 = var33.subHeight * var33.subWidth; // L: 2480
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2481
								var33.pixels = new int[var8]; // L: 2482

								for (var10 = 0; var10 < var8; ++var10) { // L: 2483
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2472
							}
						}

						class286.headIconPkSprites = var28; // L: 2490
					} else {
						++var18; // L: 2492
					}

					if (PlayerComposition.headIconPrayerSprites == null) { // L: 2493
						var2 = UserComparator6.archive8; // L: 2495
						var3 = class6.spriteIds.field4166; // L: 2496
						if (!class147.method3009(var2, var3, 0)) { // L: 2498
							var28 = null; // L: 2499
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2504
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2518
									var28 = var31; // L: 2521
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2506
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2507
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2508
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2509
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2510
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2511
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2512
								var8 = var33.subHeight * var33.subWidth; // L: 2513
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2514
								var33.pixels = new int[var8]; // L: 2515

								for (var10 = 0; var10 < var8; ++var10) { // L: 2516
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2505
							}
						}

						PlayerComposition.headIconPrayerSprites = var28; // L: 2523
					} else {
						++var18; // L: 2525
					}

					if (class260.headIconHintSprites == null) { // L: 2526
						var2 = UserComparator6.archive8; // L: 2528
						var3 = class6.spriteIds.field4173; // L: 2529
						if (!class147.method3009(var2, var3, 0)) { // L: 2531
							var28 = null; // L: 2532
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2537
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2551
									var28 = var31; // L: 2554
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2539
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2540
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2541
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2542
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2543
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2544
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2545
								var8 = var33.subHeight * var33.subWidth; // L: 2546
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2547
								var33.pixels = new int[var8]; // L: 2548

								for (var10 = 0; var10 < var8; ++var10) { // L: 2549
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2538
							}
						}

						class260.headIconHintSprites = var28; // L: 2556
					} else {
						++var18; // L: 2558
					}

					if (UserComparator7.mapMarkerSprites == null) { // L: 2559
						var2 = UserComparator6.archive8; // L: 2561
						var3 = class6.spriteIds.field4169; // L: 2562
						if (!class147.method3009(var2, var3, 0)) { // L: 2564
							var28 = null; // L: 2565
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2570
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2584
									var28 = var31; // L: 2587
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2572
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2573
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2574
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2575
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2576
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2577
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2578
								var8 = var33.subHeight * var33.subWidth; // L: 2579
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2580
								var33.pixels = new int[var8]; // L: 2581

								for (var10 = 0; var10 < var8; ++var10) { // L: 2582
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2571
							}
						}

						UserComparator7.mapMarkerSprites = var28; // L: 2589
					} else {
						++var18; // L: 2591
					}

					if (UserComparator5.crossSprites == null) { // L: 2592
						var2 = UserComparator6.archive8; // L: 2594
						var3 = class6.spriteIds.field4168; // L: 2595
						if (!class147.method3009(var2, var3, 0)) { // L: 2597
							var28 = null; // L: 2598
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2603
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2617
									var28 = var31; // L: 2620
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2605
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2606
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2607
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2608
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2609
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2610
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2611
								var8 = var33.subHeight * var33.subWidth; // L: 2612
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2613
								var33.pixels = new int[var8]; // L: 2614

								for (var10 = 0; var10 < var8; ++var10) { // L: 2615
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2604
							}
						}

						UserComparator5.crossSprites = var28; // L: 2622
					} else {
						++var18; // L: 2624
					}

					if (class111.mapDotSprites == null) { // L: 2625
						var2 = UserComparator6.archive8; // L: 2627
						var3 = class6.spriteIds.field4170; // L: 2628
						if (!class147.method3009(var2, var3, 0)) { // L: 2630
							var28 = null; // L: 2631
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 2636
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529(); // L: 2650
									var28 = var31; // L: 2653
									break;
								}

								var33 = var31[var6] = new SpritePixels(); // L: 2638
								var33.width = class432.SpriteBuffer_spriteWidth; // L: 2639
								var33.height = class432.SpriteBuffer_spriteHeight; // L: 2640
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2641
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2642
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2643
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2644
								var8 = var33.subWidth * var33.subHeight; // L: 2645
								var9 = class369.SpriteBuffer_pixels[var6]; // L: 2646
								var33.pixels = new int[var8]; // L: 2647

								for (var10 = 0; var10 < var8; ++var10) { // L: 2648
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6; // L: 2637
							}
						}

						class111.mapDotSprites = var28; // L: 2655
					} else {
						++var18; // L: 2657
					}

					if (AbstractWorldMapData.scrollBarSprites == null) { // L: 2658
						var2 = UserComparator6.archive8; // L: 2660
						var3 = class6.spriteIds.field4171; // L: 2661
						if (!class147.method3009(var2, var3, 0)) { // L: 2663
							var1 = null; // L: 2664
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 2669

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) { // L: 2670
								var7 = var5[var6] = new IndexedSprite(); // L: 2671
								var7.width = class432.SpriteBuffer_spriteWidth; // L: 2672
								var7.height = class432.SpriteBuffer_spriteHeight; // L: 2673
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2674
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2675
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2676
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2677
								var7.palette = class432.SpriteBuffer_spritePalette; // L: 2678
								var7.pixels = class369.SpriteBuffer_pixels[var6]; // L: 2679
							}

							UserComparator3.method2529(); // L: 2681
							var1 = var5; // L: 2684
						}

						AbstractWorldMapData.scrollBarSprites = var1; // L: 2686
					} else {
						++var18; // L: 2688
					}

					if (World.modIconSprites == null) { // L: 2689
						var2 = UserComparator6.archive8; // L: 2691
						var3 = class6.spriteIds.field4172; // L: 2692
						if (!class147.method3009(var2, var3, 0)) { // L: 2694
							var1 = null; // L: 2695
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 2700

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) { // L: 2701
								var7 = var5[var6] = new IndexedSprite(); // L: 2702
								var7.width = class432.SpriteBuffer_spriteWidth; // L: 2703
								var7.height = class432.SpriteBuffer_spriteHeight; // L: 2704
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6]; // L: 2705
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2706
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6]; // L: 2707
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6]; // L: 2708
								var7.palette = class432.SpriteBuffer_spritePalette; // L: 2709
								var7.pixels = class369.SpriteBuffer_pixels[var6]; // L: 2710
							}

							UserComparator3.method2529(); // L: 2712
							var1 = var5; // L: 2715
						}

						World.modIconSprites = var1; // L: 2717
					} else {
						++var18; // L: 2719
					}

					if (var18 < 11) { // L: 2720
						Login.Login_loadingText = "Loading sprites - " + var18 * 100 / 12 + "%"; // L: 2721
						Login.Login_loadingPercent = 70; // L: 2722
					} else {
						AbstractFont.AbstractFont_modIconSprites = World.modIconSprites; // L: 2725
						PcmPlayer.redHintArrowSprite.normalize(); // L: 2726
						var19 = (int)(Math.random() * 21.0D) - 10; // L: 2727
						int var20 = (int)(Math.random() * 21.0D) - 10; // L: 2728
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 2729
						int var21 = (int)(Math.random() * 41.0D) - 20; // L: 2730
						AbstractWorldMapData.mapSceneSprites[0].shiftColors(var21 + var19, var20 + var21, var3 + var21); // L: 2731
						Login.Login_loadingText = "Loaded sprites"; // L: 2732
						Login.Login_loadingPercent = 70; // L: 2733
						Client.titleLoadingStage = 90; // L: 2734
					}
				} else if (Client.titleLoadingStage == 90) { // L: 2737
					if (!NetSocket.archive9.isFullyLoaded()) { // L: 2738
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2739
						Login.Login_loadingPercent = 90; // L: 2740
					} else {
						ItemContainer.textureProvider = new TextureProvider(NetSocket.archive9, UserComparator6.archive8, 20, SecureRandomFuture.clientPreferences.brightness, Client.isLowDetail ? 64 : 128); // L: 2743
						Rasterizer3D.Rasterizer3D_setTextureLoader(ItemContainer.textureProvider); // L: 2744
						Rasterizer3D.Rasterizer3D_setBrightness(SecureRandomFuture.clientPreferences.brightness); // L: 2745
						Client.titleLoadingStage = 100; // L: 2746
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2749
					var18 = ItemContainer.textureProvider.getLoadedPercentage(); // L: 2750
					if (var18 < 100) { // L: 2751
						Login.Login_loadingText = "Loading textures - " + var18 + "%"; // L: 2752
						Login.Login_loadingPercent = 90; // L: 2753
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2756
						Login.Login_loadingPercent = 90; // L: 2757
						Client.titleLoadingStage = 110; // L: 2758
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2761
					Client.mouseRecorder = new MouseRecorder(); // L: 2762
					GameEngine.taskHandler.newThreadTask(Client.mouseRecorder, 10); // L: 2763
					Login.Login_loadingText = "Loaded input handler"; // L: 2764
					Login.Login_loadingPercent = 92; // L: 2765
					Client.titleLoadingStage = 120; // L: 2766
				} else if (Client.titleLoadingStage == 120) { // L: 2769
					if (!class257.archive10.tryLoadFileByNames("huffman", "")) { // L: 2770
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2771
						Login.Login_loadingPercent = 94; // L: 2772
					} else {
						Huffman var0 = new Huffman(class257.archive10.takeFileByNames("huffman", "")); // L: 2775
						class410.huffman = var0; // L: 2777
						Login.Login_loadingText = "Loaded wordpack"; // L: 2779
						Login.Login_loadingPercent = 94; // L: 2780
						Client.titleLoadingStage = 130; // L: 2781
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2784
					if (!class19.archive4.isFullyLoaded()) { // L: 2785
						Login.Login_loadingText = "Loading interfaces - " + class19.archive4.loadPercent() * 4 / 5 + "%"; // L: 2786
						Login.Login_loadingPercent = 96; // L: 2787
					} else if (!TaskHandler.archive12.isFullyLoaded()) { // L: 2790
						Login.Login_loadingText = "Loading interfaces - " + (80 + TaskHandler.archive12.loadPercent() / 6) + "%"; // L: 2791
						Login.Login_loadingPercent = 96; // L: 2792
					} else if (!class1.archive13.isFullyLoaded()) { // L: 2795
						Login.Login_loadingText = "Loading interfaces - " + (96 + class1.archive13.loadPercent() / 50) + "%"; // L: 2796
						Login.Login_loadingPercent = 96; // L: 2797
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2800
						Login.Login_loadingPercent = 98; // L: 2801
						Client.titleLoadingStage = 140; // L: 2802
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2805
					Login.Login_loadingPercent = 100; // L: 2806
					if (!class148.archive19.tryLoadGroupByName(WorldMapCacheName.field2768.name)) { // L: 2807
						Login.Login_loadingText = "Loading world map - " + class148.archive19.groupLoadPercentByName(WorldMapCacheName.field2768.name) / 10 + "%"; // L: 2808
					} else {
						if (Varcs.worldMap == null) { // L: 2811
							Varcs.worldMap = new WorldMap(); // L: 2812
							Varcs.worldMap.init(class148.archive19, VertexNormal.archive18, HealthBarUpdate.archive20, class136.fontBold12, Client.fontsMap, AbstractWorldMapData.mapSceneSprites); // L: 2813
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2815
						Client.titleLoadingStage = 150; // L: 2816
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2819
					VertexNormal.updateGameState(10); // L: 2820
				}
			}
		}
	} // L: 2179 2185 2211 2238 2258 2289 2306 2315 2327 2333 2339 2421 2723 2735 2741 2747 2754 2759 2767 2773 2782 2788 2793 2798 2803 2809 2817 2821 2823

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1832124278"
	)
	static final int method2543() {
		return Client.menuOptionsCount - 1; // L: 10059
	}
}
