import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1900(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1904(2, 2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 819776149
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 66971335
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lkn;",
		garbageValue = "2113988657"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 220
		int var2 = var0 & 65535; // L: 221
		if (EnumComposition.Widget_interfaceComponents[var1] == null || EnumComposition.Widget_interfaceComponents[var1][var2] == null) { // L: 222
			boolean var3 = MusicPatchNode2.loadInterface(var1); // L: 223
			if (!var3) { // L: 224
				return null;
			}
		}

		return EnumComposition.Widget_interfaceComponents[var1][var2]; // L: 226
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) { // L: 1381
			FriendSystem.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1382

			for (var23 = 0; var23 < 4; ++var23) { // L: 1383
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			MusicPatchNode2.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1384
			Login.Login_loadingText = "Starting game engine..."; // L: 1385
			Login.Login_loadingPercent = 5; // L: 1386
			Client.titleLoadingStage = 20; // L: 1387
		} else if (Client.titleLoadingStage == 20) { // L: 1390
			Login.Login_loadingText = "Prepared visibility map"; // L: 1391
			Login.Login_loadingPercent = 10; // L: 1392
			Client.titleLoadingStage = 30; // L: 1393
		} else if (Client.titleLoadingStage == 30) { // L: 1396
			TileItem.archive0 = GrandExchangeEvent.newArchive(0, false, true, true); // L: 1397
			class321.archive1 = GrandExchangeEvent.newArchive(1, false, true, true); // L: 1398
			FloorOverlayDefinition.archive2 = GrandExchangeEvent.newArchive(2, true, false, true); // L: 1399
			class121.archive3 = GrandExchangeEvent.newArchive(3, false, true, true); // L: 1400
			MouseHandler.archive4 = GrandExchangeEvent.newArchive(4, false, true, true); // L: 1401
			class302.archive5 = GrandExchangeEvent.newArchive(5, true, true, true); // L: 1402
			ArchiveLoader.archive6 = GrandExchangeEvent.newArchive(6, true, true, true); // L: 1403
			class145.archive7 = GrandExchangeEvent.newArchive(7, false, true, true); // L: 1404
			WorldMapData_1.archive8 = GrandExchangeEvent.newArchive(8, false, true, true); // L: 1405
			class132.archive9 = GrandExchangeEvent.newArchive(9, false, true, true); // L: 1406
			World.archive10 = GrandExchangeEvent.newArchive(10, false, true, true); // L: 1407
			class268.archive11 = GrandExchangeEvent.newArchive(11, false, true, true); // L: 1408
			class135.archive12 = GrandExchangeEvent.newArchive(12, false, true, true); // L: 1409
			class4.archive13 = GrandExchangeEvent.newArchive(13, true, false, true); // L: 1410
			DevicePcmPlayerProvider.archive14 = GrandExchangeEvent.newArchive(14, false, true, true); // L: 1411
			ViewportMouse.archive15 = GrandExchangeEvent.newArchive(15, false, true, true); // L: 1412
			ArchiveLoader.archive17 = GrandExchangeEvent.newArchive(17, true, true, true); // L: 1413
			JagexCache.archive18 = GrandExchangeEvent.newArchive(18, false, true, true); // L: 1414
			class202.archive19 = GrandExchangeEvent.newArchive(19, false, true, true); // L: 1415
			ReflectionCheck.archive20 = GrandExchangeEvent.newArchive(20, false, true, true); // L: 1416
			Login.Login_loadingText = "Connecting to update server"; // L: 1417
			Login.Login_loadingPercent = 20; // L: 1418
			Client.titleLoadingStage = 40; // L: 1419
		} else if (Client.titleLoadingStage == 40) { // L: 1422
			byte var33 = 0; // L: 1423
			var23 = var33 + TileItem.archive0.percentage() * 4 / 100; // L: 1424
			var23 += class321.archive1.percentage() * 4 / 100; // L: 1425
			var23 += FloorOverlayDefinition.archive2.percentage() * 2 / 100; // L: 1426
			var23 += class121.archive3.percentage() * 2 / 100; // L: 1427
			var23 += MouseHandler.archive4.percentage() * 6 / 100; // L: 1428
			var23 += class302.archive5.percentage() * 4 / 100; // L: 1429
			var23 += ArchiveLoader.archive6.percentage() * 2 / 100; // L: 1430
			var23 += class145.archive7.percentage() * 56 / 100; // L: 1431
			var23 += WorldMapData_1.archive8.percentage() * 2 / 100; // L: 1432
			var23 += class132.archive9.percentage() * 2 / 100; // L: 1433
			var23 += World.archive10.percentage() * 2 / 100; // L: 1434
			var23 += class268.archive11.percentage() * 2 / 100; // L: 1435
			var23 += class135.archive12.percentage() * 2 / 100; // L: 1436
			var23 += class4.archive13.percentage() * 2 / 100; // L: 1437
			var23 += DevicePcmPlayerProvider.archive14.percentage() * 2 / 100; // L: 1438
			var23 += ViewportMouse.archive15.percentage() * 2 / 100; // L: 1439
			var23 += class202.archive19.percentage() / 100; // L: 1440
			var23 += JagexCache.archive18.percentage() / 100; // L: 1441
			var23 += ReflectionCheck.archive20.percentage() / 100; // L: 1442
			var23 += ArchiveLoader.archive17.method5819() && ArchiveLoader.archive17.isFullyLoaded() ? 1 : 0; // L: 1443
			if (var23 != 100) { // L: 1444
				if (var23 != 0) { // L: 1445
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1446
			} else {
				ItemLayer.method3895(TileItem.archive0, "Animations"); // L: 1449
				ItemLayer.method3895(class321.archive1, "Skeletons"); // L: 1450
				ItemLayer.method3895(MouseHandler.archive4, "Sound FX"); // L: 1451
				ItemLayer.method3895(class302.archive5, "Maps"); // L: 1452
				ItemLayer.method3895(ArchiveLoader.archive6, "Music Tracks"); // L: 1453
				ItemLayer.method3895(class145.archive7, "Models"); // L: 1454
				ItemLayer.method3895(WorldMapData_1.archive8, "Sprites"); // L: 1455
				ItemLayer.method3895(class268.archive11, "Music Jingles"); // L: 1456
				ItemLayer.method3895(DevicePcmPlayerProvider.archive14, "Music Samples"); // L: 1457
				ItemLayer.method3895(ViewportMouse.archive15, "Music Patches"); // L: 1458
				ItemLayer.method3895(class202.archive19, "World Map"); // L: 1459
				ItemLayer.method3895(JagexCache.archive18, "World Map Geography"); // L: 1460
				ItemLayer.method3895(ReflectionCheck.archive20, "World Map Ground"); // L: 1461
				PendingSpawn.spriteIds = new GraphicsDefaults(); // L: 1462
				PendingSpawn.spriteIds.decode(ArchiveLoader.archive17); // L: 1463
				Login.Login_loadingText = "Loaded update list"; // L: 1464
				Login.Login_loadingPercent = 30; // L: 1465
				Client.titleLoadingStage = 45; // L: 1466
			}
		} else {
			Archive var24;
			Archive var25;
			Archive var26;
			if (Client.titleLoadingStage == 45) { // L: 1469
				class67.method1881(22050, !Client.isLowDetail, 2); // L: 1470
				MidiPcmStream var30 = new MidiPcmStream(); // L: 1471
				var30.method5281(9, 128); // L: 1472
				class290.pcmPlayer0 = AbstractWorldMapData.method4986(class434.taskHandler, 0, 22050); // L: 1473
				class290.pcmPlayer0.setStream(var30); // L: 1474
				var24 = ViewportMouse.archive15; // L: 1475
				var25 = DevicePcmPlayerProvider.archive14; // L: 1476
				var26 = MouseHandler.archive4; // L: 1477
				class273.musicPatchesArchive = var24; // L: 1479
				class273.musicSamplesArchive = var25; // L: 1480
				class273.soundEffectsArchive = var26; // L: 1481
				WorldMapEvent.midiPcmStream = var30; // L: 1482
				class182.pcmPlayer1 = AbstractWorldMapData.method4986(class434.taskHandler, 1, 2048); // L: 1484
				WorldMapIcon_1.pcmStreamMixer = new PcmStreamMixer(); // L: 1485
				class182.pcmPlayer1.setStream(WorldMapIcon_1.pcmStreamMixer); // L: 1486
				LoginScreenAnimation.decimator = new Decimator(22050, SecureRandomFuture.field949); // L: 1487
				Login.Login_loadingText = "Prepared sound engine"; // L: 1488
				Login.Login_loadingPercent = 35; // L: 1489
				Client.titleLoadingStage = 50; // L: 1490
				class267.WorldMapElement_fonts = new Fonts(WorldMapData_1.archive8, class4.archive13); // L: 1491
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) { // L: 1494
					FontName[] var29 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_plain12}; // L: 1497
					var1 = var29.length; // L: 1499
					Fonts var31 = class267.WorldMapElement_fonts; // L: 1500
					FontName[] var32 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_plain12}; // L: 1503
					Client.fontsMap = var31.createMap(var32); // L: 1505
					if (Client.fontsMap.size() < var1) { // L: 1506
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1507
						Login.Login_loadingPercent = 40; // L: 1508
					} else {
						TextureProvider.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1511
						ViewportMouse.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1512
						FloorOverlayDefinition.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1513
						UserComparator2.platformInfo = Client.platformInfoProvider.get(); // L: 1514
						Login.Login_loadingText = "Loaded fonts"; // L: 1515
						Login.Login_loadingPercent = 40; // L: 1516
						Client.titleLoadingStage = 60; // L: 1517
					}
				} else if (Client.titleLoadingStage == 60) { // L: 1520
					var23 = Skeleton.method4118(World.archive10, WorldMapData_1.archive8); // L: 1521
					var1 = BufferedFile.method7626(); // L: 1522
					if (var23 < var1) { // L: 1523
						Login.Login_loadingText = "Loading title screen - " + var23 * 100 / var1 + "%"; // L: 1524
						Login.Login_loadingPercent = 50; // L: 1525
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1528
						Login.Login_loadingPercent = 50; // L: 1529
						InterfaceParent.updateGameState(5); // L: 1530
						Client.titleLoadingStage = 70; // L: 1531
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1534
					if (!FloorOverlayDefinition.archive2.isFullyLoaded()) { // L: 1535
						Login.Login_loadingText = "Loading config - " + FloorOverlayDefinition.archive2.loadPercent() + "%"; // L: 1536
						Login.Login_loadingPercent = 60; // L: 1537
					} else {
						NetFileRequest.method5867(FloorOverlayDefinition.archive2); // L: 1540
						HealthBarUpdate.method2217(FloorOverlayDefinition.archive2); // L: 1541
						Archive var28 = FloorOverlayDefinition.archive2; // L: 1542
						var24 = class145.archive7; // L: 1543
						KitDefinition.KitDefinition_archive = var28; // L: 1545
						KitDefinition.KitDefinition_modelsArchive = var24; // L: 1546
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1547
						GrandExchangeOfferUnitPriceComparator.method6081(FloorOverlayDefinition.archive2, class145.archive7, Client.isLowDetail); // L: 1549
						class299.method5766(FloorOverlayDefinition.archive2, class145.archive7); // L: 1550
						class166.method3310(FloorOverlayDefinition.archive2); // L: 1551
						Login.method1944(FloorOverlayDefinition.archive2, class145.archive7, Client.isMembersWorld, TextureProvider.fontPlain11); // L: 1552
						var25 = FloorOverlayDefinition.archive2; // L: 1553
						var26 = TileItem.archive0; // L: 1554
						Archive var27 = class321.archive1; // L: 1555
						class282.SequenceDefinition_archive = var25; // L: 1557
						SequenceDefinition.SequenceDefinition_animationsArchive = var26; // L: 1558
						DevicePcmPlayerProvider.SequenceDefinition_skeletonsArchive = var27; // L: 1559
						Archive var5 = FloorOverlayDefinition.archive2; // L: 1561
						Archive var6 = class145.archive7; // L: 1562
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var5; // L: 1564
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var6; // L: 1565
						Archive var7 = FloorOverlayDefinition.archive2; // L: 1567
						VarbitComposition.VarbitDefinition_archive = var7; // L: 1569
						Archive var8 = FloorOverlayDefinition.archive2; // L: 1571
						VarpDefinition.VarpDefinition_archive = var8; // L: 1573
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1574
						Archive var9 = class121.archive3; // L: 1576
						Archive var10 = class145.archive7; // L: 1577
						Archive var11 = WorldMapData_1.archive8; // L: 1578
						Archive var12 = class4.archive13; // L: 1579
						class122.Widget_archive = var9; // L: 1581
						BoundaryObject.Widget_modelsArchive = var10; // L: 1582
						WorldMapLabel.Widget_spritesArchive = var11; // L: 1583
						Client.Widget_fontsArchive = var12; // L: 1584
						EnumComposition.Widget_interfaceComponents = new Widget[class122.Widget_archive.getGroupCount()][]; // L: 1585
						Frames.Widget_loadedInterfaces = new boolean[class122.Widget_archive.getGroupCount()]; // L: 1586
						StudioGame.method5783(FloorOverlayDefinition.archive2); // L: 1588
						Archive var13 = FloorOverlayDefinition.archive2; // L: 1589
						JagexCache.EnumDefinition_archive = var13; // L: 1591
						class268.method5226(FloorOverlayDefinition.archive2); // L: 1593
						class115.method2685(FloorOverlayDefinition.archive2); // L: 1594
						Canvas.method390(FloorOverlayDefinition.archive2); // L: 1595
						ScriptEvent.HitSplatDefinition_cachedSprites = new class426(Login.field917, 54, FriendSystem.clientLanguage, FloorOverlayDefinition.archive2); // L: 1596
						FontName.HitSplatDefinition_cached = new class426(Login.field917, 47, FriendSystem.clientLanguage, FloorOverlayDefinition.archive2); // L: 1597
						JagexCache.varcs = new Varcs(); // L: 1598
						Archive var14 = FloorOverlayDefinition.archive2; // L: 1599
						Archive var15 = WorldMapData_1.archive8; // L: 1600
						Archive var16 = class4.archive13; // L: 1601
						HitSplatDefinition.HitSplatDefinition_archive = var14; // L: 1603
						class20.field101 = var15; // L: 1604
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var16; // L: 1605
						Archive var17 = FloorOverlayDefinition.archive2; // L: 1607
						Archive var18 = WorldMapData_1.archive8; // L: 1608
						HealthBarDefinition.HealthBarDefinition_archive = var17; // L: 1610
						HealthBarDefinition.field1867 = var18; // L: 1611
						Archive var19 = FloorOverlayDefinition.archive2; // L: 1613
						Archive var20 = WorldMapData_1.archive8; // L: 1614
						WorldMapElement.WorldMapElement_archive = var20; // L: 1616
						if (var19.isFullyLoaded()) { // L: 1617
							class132.WorldMapElement_count = var19.getGroupFileCount(35); // L: 1620
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[class132.WorldMapElement_count]; // L: 1621

							for (int var21 = 0; var21 < class132.WorldMapElement_count; ++var21) { // L: 1622
								byte[] var22 = var19.takeFile(35, var21); // L: 1623
								WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21); // L: 1624
								if (var22 != null) { // L: 1625
									WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22)); // L: 1626
									WorldMapElement.WorldMapElement_cached[var21].method3383(); // L: 1627
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1631
						Login.Login_loadingPercent = 60; // L: 1632
						Client.titleLoadingStage = 80; // L: 1633
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1636
					var23 = 0; // L: 1637
					if (class14.compass == null) { // L: 1638
						class14.compass = InterfaceParent.SpriteBuffer_getSprite(WorldMapData_1.archive8, PendingSpawn.spriteIds.compass, 0);
					} else {
						++var23; // L: 1639
					}

					if (Huffman.redHintArrowSprite == null) { // L: 1640
						Huffman.redHintArrowSprite = InterfaceParent.SpriteBuffer_getSprite(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4315, 0);
					} else {
						++var23; // L: 1641
					}

					if (Message.mapSceneSprites == null) { // L: 1642
						Message.mapSceneSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.mapScenes, 0);
					} else {
						++var23; // L: 1643
					}

					if (Bounds.headIconPkSprites == null) { // L: 1644
						Bounds.headIconPkSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.headIconsPk, 0);
					} else {
						++var23; // L: 1645
					}

					if (DynamicObject.headIconPrayerSprites == null) { // L: 1646
						DynamicObject.headIconPrayerSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4318, 0);
					} else {
						++var23; // L: 1647
					}

					if (VarpDefinition.headIconHintSprites == null) { // L: 1648
						VarpDefinition.headIconHintSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4319, 0);
					} else {
						++var23; // L: 1649
					}

					if (class17.mapMarkerSprites == null) { // L: 1650
						class17.mapMarkerSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4320, 0);
					} else {
						++var23; // L: 1651
					}

					if (Client.crossSprites == null) { // L: 1652
						Client.crossSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4321, 0);
					} else {
						++var23; // L: 1653
					}

					if (class142.mapDotSprites == null) { // L: 1654
						class142.mapDotSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4317, 0);
					} else {
						++var23; // L: 1655
					}

					if (class268.scrollBarSprites == null) { // L: 1656
						class268.scrollBarSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4314, 0);
					} else {
						++var23; // L: 1657
					}

					if (UserComparator8.modIconSprites == null) { // L: 1658
						UserComparator8.modIconSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4324, 0);
					} else {
						++var23; // L: 1659
					}

					if (var23 < 11) { // L: 1660
						Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%"; // L: 1661
						Login.Login_loadingPercent = 70; // L: 1662
					} else {
						AbstractFont.AbstractFont_modIconSprites = UserComparator8.modIconSprites; // L: 1665
						Huffman.redHintArrowSprite.normalize(); // L: 1666
						var1 = (int)(Math.random() * 21.0D) - 10; // L: 1667
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1668
						int var3 = (int)(Math.random() * 21.0D) - 10; // L: 1669
						int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1670
						Message.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var4 + var3); // L: 1671
						Login.Login_loadingText = "Loaded sprites"; // L: 1672
						Login.Login_loadingPercent = 70; // L: 1673
						Client.titleLoadingStage = 90; // L: 1674
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1677
					if (!class132.archive9.isFullyLoaded()) { // L: 1678
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1679
						Login.Login_loadingPercent = 90; // L: 1680
					} else {
						class33.textureProvider = new TextureProvider(class132.archive9, WorldMapData_1.archive8, 20, Interpreter.clientPreferences.method2266(), Client.isLowDetail ? 64 : 128); // L: 1683
						Rasterizer3D.Rasterizer3D_setTextureLoader(class33.textureProvider); // L: 1684
						Rasterizer3D.Rasterizer3D_setBrightness(Interpreter.clientPreferences.method2266()); // L: 1685
						Client.titleLoadingStage = 100; // L: 1686
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1689
					var23 = class33.textureProvider.getLoadedPercentage(); // L: 1690
					if (var23 < 100) { // L: 1691
						Login.Login_loadingText = "Loading textures - " + var23 + "%"; // L: 1692
						Login.Login_loadingPercent = 90; // L: 1693
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1696
						Login.Login_loadingPercent = 90; // L: 1697
						Client.titleLoadingStage = 110; // L: 1698
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1701
					BuddyRankComparator.mouseRecorder = new MouseRecorder(); // L: 1702
					class434.taskHandler.newThreadTask(BuddyRankComparator.mouseRecorder, 10); // L: 1703
					Login.Login_loadingText = "Loaded input handler"; // L: 1704
					Login.Login_loadingPercent = 92; // L: 1705
					Client.titleLoadingStage = 120; // L: 1706
				} else if (Client.titleLoadingStage == 120) { // L: 1709
					if (!World.archive10.tryLoadFileByNames("huffman", "")) { // L: 1710
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1711
						Login.Login_loadingPercent = 94; // L: 1712
					} else {
						Huffman var0 = new Huffman(World.archive10.takeFileByNames("huffman", "")); // L: 1715
						VertexNormal.method4496(var0); // L: 1716
						Login.Login_loadingText = "Loaded wordpack"; // L: 1717
						Login.Login_loadingPercent = 94; // L: 1718
						Client.titleLoadingStage = 130; // L: 1719
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1722
					if (!class121.archive3.isFullyLoaded()) { // L: 1723
						Login.Login_loadingText = "Loading interfaces - " + class121.archive3.loadPercent() * 4 / 5 + "%"; // L: 1724
						Login.Login_loadingPercent = 96; // L: 1725
					} else if (!class135.archive12.isFullyLoaded()) { // L: 1728
						Login.Login_loadingText = "Loading interfaces - " + (80 + class135.archive12.loadPercent() / 6) + "%"; // L: 1729
						Login.Login_loadingPercent = 96; // L: 1730
					} else if (!class4.archive13.isFullyLoaded()) { // L: 1733
						Login.Login_loadingText = "Loading interfaces - " + (96 + class4.archive13.loadPercent() / 50) + "%"; // L: 1734
						Login.Login_loadingPercent = 96; // L: 1735
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1738
						Login.Login_loadingPercent = 98; // L: 1739
						Client.titleLoadingStage = 140; // L: 1740
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1743
					Login.Login_loadingPercent = 100; // L: 1744
					if (!class202.archive19.tryLoadGroupByName(WorldMapCacheName.field2849.name)) { // L: 1745
						Login.Login_loadingText = "Loading world map - " + class202.archive19.groupLoadPercentByName(WorldMapCacheName.field2849.name) / 10 + "%"; // L: 1746
					} else {
						if (ClanChannel.worldMap == null) { // L: 1749
							ClanChannel.worldMap = new WorldMap(); // L: 1750
							ClanChannel.worldMap.init(class202.archive19, JagexCache.archive18, ReflectionCheck.archive20, FloorOverlayDefinition.fontBold12, Client.fontsMap, Message.mapSceneSprites); // L: 1751
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1753
						Client.titleLoadingStage = 150; // L: 1754
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1757
					InterfaceParent.updateGameState(10); // L: 1758
				}
			}
		}
	} // L: 1388 1394 1420 1447 1467 1492 1509 1518 1526 1532 1538 1634 1663 1675 1681 1687 1694 1699 1707 1713 1720 1726 1731 1736 1741 1747 1755 1759 1761
}
