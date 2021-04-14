import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public enum class34 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	field236(0, 0);

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("g")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aw")
	static String field229;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1478025593
	)
	static int field232;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -337730907
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1373587667
	)
	public final int field230;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2109916151
	)
	final int field233;

	class34(int var3, int var4) {
		this.field230 = var3; // L: 12
		this.field233 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field233; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public static boolean method415() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 24
		return var0 != null; // L: 25
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-842302459"
	)
	@Export("load")
	static void load() {
		int var26;
		if (Client.titleLoadingStage == 0) { // L: 1281
			WorldMapArea.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1282

			for (var26 = 0; var26 < 4; ++var26) { // L: 1283
				Client.collisionMaps[var26] = new CollisionMap(104, 104);
			}

			class19.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1284
			Login.Login_loadingText = "Starting game engine..."; // L: 1285
			Login.Login_loadingPercent = 5; // L: 1286
			Client.titleLoadingStage = 20; // L: 1287
		} else if (Client.titleLoadingStage == 20) { // L: 1290
			Login.Login_loadingText = "Prepared visibility map"; // L: 1291
			Login.Login_loadingPercent = 10; // L: 1292
			Client.titleLoadingStage = 30; // L: 1293
		} else if (Client.titleLoadingStage == 30) { // L: 1296
			TriBool.archive0 = HitSplatDefinition.newArchive(0, false, true, true); // L: 1297
			class367.archive1 = HitSplatDefinition.newArchive(1, false, true, true); // L: 1298
			class235.archive2 = HitSplatDefinition.newArchive(2, true, false, true); // L: 1299
			class5.archive3 = HitSplatDefinition.newArchive(3, false, true, true); // L: 1300
			ItemContainer.archive4 = HitSplatDefinition.newArchive(4, false, true, true); // L: 1301
			class157.archive5 = HitSplatDefinition.newArchive(5, true, true, true); // L: 1302
			class8.archive6 = HitSplatDefinition.newArchive(6, true, true, true); // L: 1303
			class12.archive7 = HitSplatDefinition.newArchive(7, false, true, true); // L: 1304
			SoundSystem.archive8 = HitSplatDefinition.newArchive(8, false, true, true); // L: 1305
			AbstractWorldMapData.archive9 = HitSplatDefinition.newArchive(9, false, true, true); // L: 1306
			class373.archive10 = HitSplatDefinition.newArchive(10, false, true, true); // L: 1307
			class10.archive11 = HitSplatDefinition.newArchive(11, false, true, true); // L: 1308
			BuddyRankComparator.archive12 = HitSplatDefinition.newArchive(12, false, true, true); // L: 1309
			MilliClock.archive13 = HitSplatDefinition.newArchive(13, true, false, true); // L: 1310
			WorldMapSection0.archive14 = HitSplatDefinition.newArchive(14, false, true, true); // L: 1311
			Buddy.archive15 = HitSplatDefinition.newArchive(15, false, true, true); // L: 1312
			class0.archive17 = HitSplatDefinition.newArchive(17, true, true, true); // L: 1313
			class246.archive18 = HitSplatDefinition.newArchive(18, false, true, true); // L: 1314
			class283.archive19 = HitSplatDefinition.newArchive(19, false, true, true); // L: 1315
			NPCComposition.archive20 = HitSplatDefinition.newArchive(20, false, true, true); // L: 1316
			Login.Login_loadingText = "Connecting to update server"; // L: 1317
			Login.Login_loadingPercent = 20; // L: 1318
			Client.titleLoadingStage = 40; // L: 1319
		} else if (Client.titleLoadingStage != 40) { // L: 1322
			Archive var21;
			Archive var22;
			Archive var23;
			if (Client.titleLoadingStage == 45) { // L: 1369
				boolean var30 = !Client.isLowDetail; // L: 1370
				PcmPlayer.field394 = 22050; // L: 1373
				PcmPlayer.PcmPlayer_stereo = var30; // L: 1374
				Frames.field2007 = 2; // L: 1375
				MidiPcmStream var27 = new MidiPcmStream(); // L: 1377
				var27.method3938(9, 128); // L: 1378
				ApproximateRouteStrategy.pcmPlayer0 = class3.method57(GameEngine.taskHandler, 0, 22050); // L: 1379
				ApproximateRouteStrategy.pcmPlayer0.setStream(var27); // L: 1380
				var21 = Buddy.archive15; // L: 1381
				var22 = WorldMapSection0.archive14; // L: 1382
				var23 = ItemContainer.archive4; // L: 1383
				class210.musicPatchesArchive = var21; // L: 1385
				class372.musicSamplesArchive = var22; // L: 1386
				class210.soundEffectsArchive = var23; // L: 1387
				class210.midiPcmStream = var27; // L: 1388
				class43.pcmPlayer1 = class3.method57(GameEngine.taskHandler, 1, 2048); // L: 1390
				Huffman.pcmStreamMixer = new PcmStreamMixer(); // L: 1391
				class43.pcmPlayer1.setStream(Huffman.pcmStreamMixer); // L: 1392
				decimator = new Decimator(22050, PcmPlayer.field394); // L: 1393
				Login.Login_loadingText = "Prepared sound engine"; // L: 1394
				Login.Login_loadingPercent = 35; // L: 1395
				Client.titleLoadingStage = 50; // L: 1396
				class243.WorldMapElement_fonts = new Fonts(SoundSystem.archive8, MilliClock.archive13); // L: 1397
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) { // L: 1400
					FontName[] var25 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 1403
					var1 = var25.length; // L: 1405
					Fonts var28 = class243.WorldMapElement_fonts; // L: 1406
					FontName[] var29 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13}; // L: 1409
					Client.fontsMap = var28.createMap(var29); // L: 1411
					if (Client.fontsMap.size() < var1) { // L: 1412
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1413
						Login.Login_loadingPercent = 40; // L: 1414
					} else {
						class0.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1417
						class14.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1418
						class368.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1419
						UserComparator8.platformInfo = Client.platformInfoProvider.get(); // L: 1420
						Login.Login_loadingText = "Loaded fonts"; // L: 1421
						Login.Login_loadingPercent = 40; // L: 1422
						Client.titleLoadingStage = 60; // L: 1423
					}
				} else {
					int var3;
					int var4;
					Archive var20;
					if (Client.titleLoadingStage == 60) { // L: 1426
						var20 = class373.archive10; // L: 1428
						var21 = SoundSystem.archive8; // L: 1429
						var3 = 0; // L: 1431
						if (var20.tryLoadFileByNames("title.jpg", "")) { // L: 1432
							++var3;
						}

						if (var21.tryLoadFileByNames("logo", "")) { // L: 1433
							++var3;
						}

						if (var21.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1434
							++var3;
						}

						if (var21.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1435
							++var3;
						}

						if (var21.tryLoadFileByNames("titlebox", "")) { // L: 1436
							++var3;
						}

						if (var21.tryLoadFileByNames("titlebutton", "")) { // L: 1437
							++var3;
						}

						if (var21.tryLoadFileByNames("runes", "")) { // L: 1438
							++var3;
						}

						if (var21.tryLoadFileByNames("title_mute", "")) { // L: 1439
							++var3;
						}

						if (var21.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1440
							++var3;
						}

						if (var21.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1441
							++var3;
						}

						if (var21.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1442
							++var3;
						}

						if (var21.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1443
							++var3;
						}

						var21.tryLoadFileByNames("sl_back", ""); // L: 1444
						var21.tryLoadFileByNames("sl_flags", ""); // L: 1445
						var21.tryLoadFileByNames("sl_arrows", ""); // L: 1446
						var21.tryLoadFileByNames("sl_stars", ""); // L: 1447
						var21.tryLoadFileByNames("sl_button", ""); // L: 1448
						var4 = DirectByteArrayCopier.method4354(); // L: 1452
						if (var3 < var4) { // L: 1453
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 1454
							Login.Login_loadingPercent = 50; // L: 1455
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1458
							Login.Login_loadingPercent = 50; // L: 1459
							class20.updateGameState(5); // L: 1460
							Client.titleLoadingStage = 70; // L: 1461
						}
					} else if (Client.titleLoadingStage == 70) { // L: 1464
						if (!class235.archive2.isFullyLoaded()) { // L: 1465
							Login.Login_loadingText = "Loading config - " + class235.archive2.loadPercent() + "%"; // L: 1466
							Login.Login_loadingPercent = 60; // L: 1467
						} else {
							Archive var24 = class235.archive2; // L: 1470
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var24; // L: 1472
							class0.method13(class235.archive2); // L: 1474
							var20 = class235.archive2; // L: 1475
							var21 = class12.archive7; // L: 1476
							KitDefinition.KitDefinition_archive = var20; // L: 1478
							class266.KitDefinition_modelsArchive = var21; // L: 1479
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1480
							var22 = class235.archive2; // L: 1482
							var23 = class12.archive7; // L: 1483
							boolean var5 = Client.isLowDetail; // L: 1484
							ObjectComposition.ObjectDefinition_archive = var22; // L: 1486
							ObjectComposition.ObjectDefinition_modelsArchive = var23; // L: 1487
							ObjectComposition.ObjectDefinition_isLowDetail = var5; // L: 1488
							Decimator.method1114(class235.archive2, class12.archive7); // L: 1490
							Archive var6 = class235.archive2; // L: 1491
							StructComposition.StructDefinition_archive = var6; // L: 1493
							ScriptEvent.method2101(class235.archive2, class12.archive7, Client.isMembersWorld, class0.fontPlain11); // L: 1495
							Archive var7 = class235.archive2; // L: 1496
							Archive var8 = TriBool.archive0; // L: 1497
							Archive var9 = class367.archive1; // L: 1498
							SequenceDefinition.SequenceDefinition_archive = var7; // L: 1500
							GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive = var8; // L: 1501
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var9; // L: 1502
							Archive var10 = class235.archive2; // L: 1504
							Archive var11 = class12.archive7; // L: 1505
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var10; // L: 1507
							SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var11; // L: 1508
							Archive var12 = class235.archive2; // L: 1510
							VarbitComposition.VarbitDefinition_archive = var12; // L: 1512
							ItemLayer.method3268(class235.archive2); // L: 1514
							Archive var13 = class5.archive3; // L: 1515
							Archive var14 = class12.archive7; // L: 1516
							Archive var15 = SoundSystem.archive8; // L: 1517
							Archive var16 = MilliClock.archive13; // L: 1518
							FloorDecoration.Widget_archive = var13; // L: 1520
							WorldMapDecoration.Widget_modelsArchive = var14; // L: 1521
							UrlRequest.Widget_spritesArchive = var15; // L: 1522
							class32.Widget_fontsArchive = var16; // L: 1523
							Widget.Widget_interfaceComponents = new Widget[FloorDecoration.Widget_archive.getGroupCount()][]; // L: 1524
							class69.Widget_loadedInterfaces = new boolean[FloorDecoration.Widget_archive.getGroupCount()]; // L: 1525
							Archive var17 = class235.archive2; // L: 1527
							InvDefinition.InvDefinition_archive = var17; // L: 1529
							Archive var18 = class235.archive2; // L: 1531
							EnumComposition.EnumDefinition_archive = var18; // L: 1533
							class303.method5526(class235.archive2); // L: 1535
							class6.method97(class235.archive2); // L: 1536
							TextureProvider.varcs = new Varcs(); // L: 1537
							WorldMapSection0.method3034(class235.archive2, SoundSystem.archive8, MilliClock.archive13); // L: 1538
							VertexNormal.method3782(class235.archive2, SoundSystem.archive8); // L: 1539
							class18.method280(class235.archive2, SoundSystem.archive8); // L: 1540
							Login.Login_loadingText = "Loaded config"; // L: 1541
							Login.Login_loadingPercent = 60; // L: 1542
							Client.titleLoadingStage = 80; // L: 1543
						}
					} else if (Client.titleLoadingStage == 80) { // L: 1546
						var26 = 0; // L: 1547
						if (class22.compass == null) { // L: 1548
							class22.compass = ModelData0.SpriteBuffer_getSprite(SoundSystem.archive8, class32.spriteIds.compass, 0);
						} else {
							++var26; // L: 1549
						}

						if (class32.redHintArrowSprite == null) { // L: 1550
							class32.redHintArrowSprite = ModelData0.SpriteBuffer_getSprite(SoundSystem.archive8, class32.spriteIds.field3898, 0);
						} else {
							++var26; // L: 1551
						}

						if (class18.mapSceneSprites == null) { // L: 1552
							class18.mapSceneSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.mapScenes, 0);
						} else {
							++var26; // L: 1553
						}

						if (ItemContainer.headIconPkSprites == null) { // L: 1554
							ItemContainer.headIconPkSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.headIconsPk, 0);
						} else {
							++var26; // L: 1555
						}

						if (ArchiveDiskActionHandler.headIconPrayerSprites == null) { // L: 1556
							ArchiveDiskActionHandler.headIconPrayerSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3901, 0);
						} else {
							++var26; // L: 1557
						}

						if (Script.headIconHintSprites == null) { // L: 1558
							Script.headIconHintSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3897, 0);
						} else {
							++var26; // L: 1559
						}

						if (class14.mapMarkerSprites == null) { // L: 1560
							class14.mapMarkerSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3903, 0);
						} else {
							++var26; // L: 1561
						}

						if (class18.crossSprites == null) { // L: 1562
							class18.crossSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3907, 0);
						} else {
							++var26; // L: 1563
						}

						if (class244.mapDotSprites == null) { // L: 1564
							class244.mapDotSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3902, 0);
						} else {
							++var26; // L: 1565
						}

						if (NPCComposition.scrollBarSprites == null) { // L: 1566
							NPCComposition.scrollBarSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.field3906, 0);
						} else {
							++var26; // L: 1567
						}

						if (class93.modIconSprites == null) { // L: 1568
							class93.modIconSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.field3899, 0);
						} else {
							++var26; // L: 1569
						}

						if (var26 < 11) { // L: 1570
							Login.Login_loadingText = "Loading sprites - " + var26 * 100 / 12 + "%"; // L: 1571
							Login.Login_loadingPercent = 70; // L: 1572
						} else {
							AbstractFont.AbstractFont_modIconSprites = class93.modIconSprites; // L: 1575
							class32.redHintArrowSprite.normalize(); // L: 1576
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 1577
							int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1578
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1579
							var4 = (int)(Math.random() * 41.0D) - 20; // L: 1580
							class18.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var4 + var3); // L: 1581
							Login.Login_loadingText = "Loaded sprites"; // L: 1582
							Login.Login_loadingPercent = 70; // L: 1583
							Client.titleLoadingStage = 90; // L: 1584
						}
					} else if (Client.titleLoadingStage == 90) { // L: 1587
						if (!AbstractWorldMapData.archive9.isFullyLoaded()) { // L: 1588
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1589
							Login.Login_loadingPercent = 90; // L: 1590
						} else {
							FriendLoginUpdate.textureProvider = new TextureProvider(AbstractWorldMapData.archive9, SoundSystem.archive8, 20, Login.clientPreferences.field1304, Client.isLowDetail ? 64 : 128); // L: 1593
							Rasterizer3D.Rasterizer3D_setTextureLoader(FriendLoginUpdate.textureProvider); // L: 1594
							Rasterizer3D.Rasterizer3D_setBrightness(Login.clientPreferences.field1304); // L: 1595
							Client.titleLoadingStage = 100; // L: 1596
						}
					} else if (Client.titleLoadingStage == 100) { // L: 1599
						var26 = FriendLoginUpdate.textureProvider.getLoadedPercentage(); // L: 1600
						if (var26 < 100) { // L: 1601
							Login.Login_loadingText = "Loading textures - " + var26 + "%"; // L: 1602
							Login.Login_loadingPercent = 90; // L: 1603
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1606
							Login.Login_loadingPercent = 90; // L: 1607
							Client.titleLoadingStage = 110; // L: 1608
						}
					} else if (Client.titleLoadingStage == 110) { // L: 1611
						Language.mouseRecorder = new MouseRecorder(); // L: 1612
						GameEngine.taskHandler.newThreadTask(Language.mouseRecorder, 10); // L: 1613
						Login.Login_loadingText = "Loaded input handler"; // L: 1614
						Login.Login_loadingPercent = 92; // L: 1615
						Client.titleLoadingStage = 120; // L: 1616
					} else if (Client.titleLoadingStage == 120) { // L: 1619
						if (!class373.archive10.tryLoadFileByNames("huffman", "")) { // L: 1620
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1621
							Login.Login_loadingPercent = 94; // L: 1622
						} else {
							Huffman var0 = new Huffman(class373.archive10.takeFileByNames("huffman", "")); // L: 1625
							ClientPacket.method3884(var0); // L: 1626
							Login.Login_loadingText = "Loaded wordpack"; // L: 1627
							Login.Login_loadingPercent = 94; // L: 1628
							Client.titleLoadingStage = 130; // L: 1629
						}
					} else if (Client.titleLoadingStage == 130) { // L: 1632
						if (!class5.archive3.isFullyLoaded()) { // L: 1633
							Login.Login_loadingText = "Loading interfaces - " + class5.archive3.loadPercent() * 4 / 5 + "%"; // L: 1634
							Login.Login_loadingPercent = 96; // L: 1635
						} else if (!BuddyRankComparator.archive12.isFullyLoaded()) { // L: 1638
							Login.Login_loadingText = "Loading interfaces - " + (80 + BuddyRankComparator.archive12.loadPercent() / 6) + "%"; // L: 1639
							Login.Login_loadingPercent = 96; // L: 1640
						} else if (!MilliClock.archive13.isFullyLoaded()) { // L: 1643
							Login.Login_loadingText = "Loading interfaces - " + (96 + MilliClock.archive13.loadPercent() / 50) + "%"; // L: 1644
							Login.Login_loadingPercent = 96; // L: 1645
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1648
							Login.Login_loadingPercent = 98; // L: 1649
							Client.titleLoadingStage = 140; // L: 1650
						}
					} else if (Client.titleLoadingStage == 140) { // L: 1653
						Login.Login_loadingPercent = 100; // L: 1654
						if (!class283.archive19.tryLoadGroupByName(WorldMapCacheName.field1768.name)) { // L: 1655
							Login.Login_loadingText = "Loading world map - " + class283.archive19.groupLoadPercentByName(WorldMapCacheName.field1768.name) / 10 + "%"; // L: 1656
						} else {
							if (UserComparator4.worldMap == null) { // L: 1659
								UserComparator4.worldMap = new WorldMap(); // L: 1660
								UserComparator4.worldMap.init(class283.archive19, class246.archive18, NPCComposition.archive20, class368.fontBold12, Client.fontsMap, class18.mapSceneSprites); // L: 1661
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1663
							Client.titleLoadingStage = 150; // L: 1664
						}
					} else if (Client.titleLoadingStage == 150) { // L: 1667
						class20.updateGameState(10); // L: 1668
					}
				}
			}
		} else {
			byte var19 = 0; // L: 1323
			var26 = var19 + TriBool.archive0.percentage() * 4 / 100; // L: 1324
			var26 += class367.archive1.percentage() * 4 / 100; // L: 1325
			var26 += class235.archive2.percentage() * 2 / 100; // L: 1326
			var26 += class5.archive3.percentage() * 2 / 100; // L: 1327
			var26 += ItemContainer.archive4.percentage() * 6 / 100; // L: 1328
			var26 += class157.archive5.percentage() * 4 / 100; // L: 1329
			var26 += class8.archive6.percentage() * 2 / 100; // L: 1330
			var26 += class12.archive7.percentage() * 56 / 100; // L: 1331
			var26 += SoundSystem.archive8.percentage() * 2 / 100; // L: 1332
			var26 += AbstractWorldMapData.archive9.percentage() * 2 / 100; // L: 1333
			var26 += class373.archive10.percentage() * 2 / 100; // L: 1334
			var26 += class10.archive11.percentage() * 2 / 100; // L: 1335
			var26 += BuddyRankComparator.archive12.percentage() * 2 / 100; // L: 1336
			var26 += MilliClock.archive13.percentage() * 2 / 100; // L: 1337
			var26 += WorldMapSection0.archive14.percentage() * 2 / 100; // L: 1338
			var26 += Buddy.archive15.percentage() * 2 / 100; // L: 1339
			var26 += class283.archive19.percentage() / 100; // L: 1340
			var26 += class246.archive18.percentage() / 100; // L: 1341
			var26 += NPCComposition.archive20.percentage() / 100; // L: 1342
			var26 += class0.archive17.method4430() && class0.archive17.isFullyLoaded() ? 1 : 0; // L: 1343
			if (var26 != 100) { // L: 1344
				if (var26 != 0) { // L: 1345
					Login.Login_loadingText = "Checking for updates - " + var26 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1346
			} else {
				class231.method4356(TriBool.archive0, "Animations"); // L: 1349
				class231.method4356(class367.archive1, "Skeletons"); // L: 1350
				class231.method4356(ItemContainer.archive4, "Sound FX"); // L: 1351
				class231.method4356(class157.archive5, "Maps"); // L: 1352
				class231.method4356(class8.archive6, "Music Tracks"); // L: 1353
				class231.method4356(class12.archive7, "Models"); // L: 1354
				class231.method4356(SoundSystem.archive8, "Sprites"); // L: 1355
				class231.method4356(class10.archive11, "Music Jingles"); // L: 1356
				class231.method4356(WorldMapSection0.archive14, "Music Samples"); // L: 1357
				class231.method4356(Buddy.archive15, "Music Patches"); // L: 1358
				class231.method4356(class283.archive19, "World Map"); // L: 1359
				class231.method4356(class246.archive18, "World Map Geography"); // L: 1360
				class231.method4356(NPCComposition.archive20, "World Map Ground"); // L: 1361
				class32.spriteIds = new GraphicsDefaults(); // L: 1362
				class32.spriteIds.decode(class0.archive17); // L: 1363
				Login.Login_loadingText = "Loaded update list"; // L: 1364
				Login.Login_loadingPercent = 30; // L: 1365
				Client.titleLoadingStage = 45; // L: 1366
			}
		}
	} // L: 1288 1294 1320 1347 1367 1398 1415 1424 1456 1462 1468 1544 1573 1585 1591 1597 1604 1609 1617 1623 1630 1636 1641 1646 1651 1657 1665 1669 1671

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "927217331"
	)
	static final int method420() {
		if (Login.clientPreferences.roofsHidden) { // L: 4051
			return class26.Client_plane;
		} else {
			int var0 = UserComparator7.getTileHeight(ModeWhere.cameraX, ReflectionCheck.cameraZ, class26.Client_plane); // L: 4052
			return var0 - WorldMapRectangle.cameraY < 800 && (Tiles.Tiles_renderFlags[class26.Client_plane][ModeWhere.cameraX >> 7][ReflectionCheck.cameraZ >> 7] & 4) != 0 ? class26.Client_plane : 3; // L: 4053 4054
		}
	}
}
