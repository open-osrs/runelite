import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -370521967
	)
	static int field412;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1404782287
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 490458789
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("o")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = 3.141592653589793D * ((double)var11 - var9); // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(65536.0D * var17 + 0.5D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1478670549"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "9"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1294753676"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;I)V",
		garbageValue = "1727162890"
	)
	public static void method1051(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-961463210"
	)
	@Export("load")
	static void load() {
		int var18;
		if (Client.titleLoadingStage == 0) { // L: 1488
			scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1489

			for (var18 = 0; var18 < 4; ++var18) { // L: 1490
				Client.collisionMaps[var18] = new CollisionMap(104, 104);
			}

			class414.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1491
			Login.Login_loadingText = "Starting game engine..."; // L: 1492
			Login.Login_loadingPercent = 5; // L: 1493
			Client.titleLoadingStage = 20; // L: 1494
		} else if (Client.titleLoadingStage == 20) { // L: 1497
			Login.Login_loadingText = "Prepared visibility map"; // L: 1498
			Login.Login_loadingPercent = 10; // L: 1499
			Client.titleLoadingStage = 30; // L: 1500
		} else if (Client.titleLoadingStage == 30) { // L: 1503
			class7.archive0 = class140.newArchive(0, false, true, true); // L: 1504
			Client.archive1 = class140.newArchive(1, false, true, true); // L: 1505
			FriendLoginUpdate.archive2 = class140.newArchive(2, true, false, true); // L: 1506
			Tile.archive3 = class140.newArchive(3, false, true, true); // L: 1507
			class403.archive4 = class140.newArchive(4, false, true, true); // L: 1508
			Client.archive5 = class140.newArchive(5, true, true, true); // L: 1509
			WorldMapLabelSize.archive6 = class140.newArchive(6, true, true, true); // L: 1510
			WorldMapLabelSize.archive7 = class140.newArchive(7, false, true, true); // L: 1511
			Message.archive8 = class140.newArchive(8, false, true, true); // L: 1512
			class9.archive9 = class140.newArchive(9, false, true, true); // L: 1513
			Tile.archive10 = class140.newArchive(10, false, true, true); // L: 1514
			class252.archive11 = class140.newArchive(11, false, true, true); // L: 1515
			class148.archive12 = class140.newArchive(12, false, true, true); // L: 1516
			KitDefinition.archive13 = class140.newArchive(13, true, false, true); // L: 1517
			SoundCache.archive14 = class140.newArchive(14, false, true, true); // L: 1518
			FontName.archive15 = class140.newArchive(15, false, true, true); // L: 1519
			Clock.archive17 = class140.newArchive(17, true, true, true); // L: 1520
			UrlRequest.archive18 = class140.newArchive(18, false, true, true); // L: 1521
			WorldMapRegion.archive19 = class140.newArchive(19, false, true, true); // L: 1522
			Varcs.archive20 = class140.newArchive(20, false, true, true); // L: 1523
			Login.Login_loadingText = "Connecting to update server"; // L: 1524
			Login.Login_loadingPercent = 20; // L: 1525
			Client.titleLoadingStage = 40; // L: 1526
		} else if (Client.titleLoadingStage == 40) { // L: 1529
			byte var30 = 0; // L: 1530
			var18 = var30 + class7.archive0.percentage() * 4 / 100; // L: 1531
			var18 += Client.archive1.percentage() * 4 / 100; // L: 1532
			var18 += FriendLoginUpdate.archive2.percentage() * 2 / 100; // L: 1533
			var18 += Tile.archive3.percentage() * 2 / 100; // L: 1534
			var18 += class403.archive4.percentage() * 6 / 100; // L: 1535
			var18 += Client.archive5.percentage() * 4 / 100; // L: 1536
			var18 += WorldMapLabelSize.archive6.percentage() * 2 / 100; // L: 1537
			var18 += WorldMapLabelSize.archive7.percentage() * 56 / 100; // L: 1538
			var18 += Message.archive8.percentage() * 2 / 100; // L: 1539
			var18 += class9.archive9.percentage() * 2 / 100; // L: 1540
			var18 += Tile.archive10.percentage() * 2 / 100; // L: 1541
			var18 += class252.archive11.percentage() * 2 / 100; // L: 1542
			var18 += class148.archive12.percentage() * 2 / 100; // L: 1543
			var18 += KitDefinition.archive13.percentage() * 2 / 100; // L: 1544
			var18 += SoundCache.archive14.percentage() * 2 / 100; // L: 1545
			var18 += FontName.archive15.percentage() * 2 / 100; // L: 1546
			var18 += WorldMapRegion.archive19.percentage() / 100; // L: 1547
			var18 += UrlRequest.archive18.percentage() / 100; // L: 1548
			var18 += Varcs.archive20.percentage() / 100; // L: 1549
			var18 += Clock.archive17.method5521() && Clock.archive17.isFullyLoaded() ? 1 : 0; // L: 1550
			if (var18 != 100) { // L: 1551
				if (var18 != 0) { // L: 1552
					Login.Login_loadingText = "Checking for updates - " + var18 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1553
			} else {
				WorldMapLabel.method4762(class7.archive0, "Animations"); // L: 1556
				WorldMapLabel.method4762(Client.archive1, "Skeletons"); // L: 1557
				WorldMapLabel.method4762(class403.archive4, "Sound FX"); // L: 1558
				WorldMapLabel.method4762(Client.archive5, "Maps"); // L: 1559
				WorldMapLabel.method4762(WorldMapLabelSize.archive6, "Music Tracks"); // L: 1560
				WorldMapLabel.method4762(WorldMapLabelSize.archive7, "Models"); // L: 1561
				WorldMapLabel.method4762(Message.archive8, "Sprites"); // L: 1562
				WorldMapLabel.method4762(class252.archive11, "Music Jingles"); // L: 1563
				WorldMapLabel.method4762(SoundCache.archive14, "Music Samples"); // L: 1564
				WorldMapLabel.method4762(FontName.archive15, "Music Patches"); // L: 1565
				WorldMapLabel.method4762(WorldMapRegion.archive19, "World Map"); // L: 1566
				WorldMapLabel.method4762(UrlRequest.archive18, "World Map Geography"); // L: 1567
				WorldMapLabel.method4762(Varcs.archive20, "World Map Ground"); // L: 1568
				class140.spriteIds = new GraphicsDefaults(); // L: 1569
				class140.spriteIds.decode(Clock.archive17); // L: 1570
				Login.Login_loadingText = "Loaded update list"; // L: 1571
				Login.Login_loadingPercent = 30; // L: 1572
				Client.titleLoadingStage = 45; // L: 1573
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1576
			FriendsList.method6281(22050, !Client.isLowDetail, 2); // L: 1577
			MidiPcmStream var25 = new MidiPcmStream(); // L: 1578
			var25.method5043(9, 128); // L: 1579
			PacketBufferNode.pcmPlayer0 = class28.method405(GameEngine.taskHandler, 0, 22050); // L: 1580
			PacketBufferNode.pcmPlayer0.setStream(var25); // L: 1581
			AbstractWorldMapData.method4753(FontName.archive15, SoundCache.archive14, class403.archive4, var25); // L: 1582
			MouseHandler.pcmPlayer1 = class28.method405(GameEngine.taskHandler, 1, 2048); // L: 1583
			class123.pcmStreamMixer = new PcmStreamMixer(); // L: 1584
			MouseHandler.pcmPlayer1.setStream(class123.pcmStreamMixer); // L: 1585
			class131.decimator = new Decimator(22050, PcmPlayer.field305); // L: 1586
			Login.Login_loadingText = "Prepared sound engine"; // L: 1587
			Login.Login_loadingPercent = 35; // L: 1588
			Client.titleLoadingStage = 50; // L: 1589
			WorldMapRegion.WorldMapElement_fonts = new Fonts(Message.archive8, KitDefinition.archive13); // L: 1590
		} else if (Client.titleLoadingStage == 50) { // L: 1593
			var18 = FontName.method7085().length; // L: 1594
			Client.fontsMap = WorldMapRegion.WorldMapElement_fonts.createMap(FontName.method7085()); // L: 1595
			if (Client.fontsMap.size() < var18) { // L: 1596
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var18 + "%"; // L: 1597
				Login.Login_loadingPercent = 40; // L: 1598
			} else {
				class1.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1601
				Players.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1602
				class408.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1603
				MouseHandler.platformInfo = Client.platformInfoProvider.get(); // L: 1604
				Login.Login_loadingText = "Loaded fonts"; // L: 1605
				Login.Login_loadingPercent = 40; // L: 1606
				Client.titleLoadingStage = 60; // L: 1607
			}
		} else {
			int var19;
			if (Client.titleLoadingStage == 60) { // L: 1610
				var18 = ObjectComposition.method3498(Tile.archive10, Message.archive8); // L: 1611
				var19 = Login.field924.length + Login.field925.length; // L: 1614
				if (var18 < var19) { // L: 1617
					Login.Login_loadingText = "Loading title screen - " + var18 * 100 / var19 + "%"; // L: 1618
					Login.Login_loadingPercent = 50; // L: 1619
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 1622
					Login.Login_loadingPercent = 50; // L: 1623
					class111.updateGameState(5); // L: 1624
					Client.titleLoadingStage = 70; // L: 1625
				}
			} else {
				Archive var2;
				if (Client.titleLoadingStage == 70) { // L: 1628
					if (!FriendLoginUpdate.archive2.isFullyLoaded()) { // L: 1629
						Login.Login_loadingText = "Loading config - " + FriendLoginUpdate.archive2.loadPercent() + "%"; // L: 1630
						Login.Login_loadingPercent = 60; // L: 1631
					} else {
						Archive var24 = FriendLoginUpdate.archive2; // L: 1634
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var24; // L: 1636
						Archive var26 = FriendLoginUpdate.archive2; // L: 1638
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26; // L: 1640
						GrandExchangeEvent.method5726(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7); // L: 1642
						HealthBar.method2248(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7, Client.isLowDetail); // L: 1643
						WallDecoration.method4296(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7); // L: 1644
						WorldMapLabelSize.method4325(FriendLoginUpdate.archive2); // L: 1645
						var2 = FriendLoginUpdate.archive2; // L: 1646
						Archive var22 = WorldMapLabelSize.archive7; // L: 1647
						boolean var29 = Client.isMembersWorld; // L: 1648
						Font var27 = class1.fontPlain11; // L: 1649
						DefaultsGroup.ItemDefinition_archive = var2; // L: 1651
						class6.ItemDefinition_modelArchive = var22; // L: 1652
						MilliClock.ItemDefinition_inMembersWorld = var29; // L: 1653
						HealthBarUpdate.ItemDefinition_fileCount = DefaultsGroup.ItemDefinition_archive.getGroupFileCount(10); // L: 1654
						class67.ItemDefinition_fontPlain11 = var27; // L: 1655
						ModeWhere.method5816(FriendLoginUpdate.archive2, class7.archive0, Client.archive1); // L: 1657
						method1051(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7); // L: 1658
						Calendar.method5310(FriendLoginUpdate.archive2); // L: 1659
						class112.method2558(FriendLoginUpdate.archive2); // L: 1660
						Archive var23 = Tile.archive3; // L: 1661
						Archive var28 = WorldMapLabelSize.archive7; // L: 1662
						Archive var8 = Message.archive8; // L: 1663
						Archive var9 = KitDefinition.archive13; // L: 1664
						UserComparator6.Widget_archive = var23; // L: 1666
						Widget.Widget_modelsArchive = var28; // L: 1667
						class160.Widget_spritesArchive = var8; // L: 1668
						class222.Widget_fontsArchive = var9; // L: 1669
						Widget.Widget_interfaceComponents = new Widget[UserComparator6.Widget_archive.getGroupCount()][]; // L: 1670
						class145.Widget_loadedInterfaces = new boolean[UserComparator6.Widget_archive.getGroupCount()]; // L: 1671
						class129.method2774(FriendLoginUpdate.archive2); // L: 1673
						SoundSystem.method782(FriendLoginUpdate.archive2); // L: 1674
						SpriteMask.method5324(FriendLoginUpdate.archive2); // L: 1675
						ObjectSound.method1743(FriendLoginUpdate.archive2); // L: 1676
						Archive var10 = FriendLoginUpdate.archive2; // L: 1677
						ParamComposition.ParamDefinition_archive = var10; // L: 1679
						class115.HitSplatDefinition_cachedSprites = new class409(HorizontalAlignment.field1846, 54, class122.clientLanguage, FriendLoginUpdate.archive2); // L: 1681
						FloorOverlayDefinition.HitSplatDefinition_cached = new class409(HorizontalAlignment.field1846, 47, class122.clientLanguage, FriendLoginUpdate.archive2); // L: 1682
						JagexCache.varcs = new Varcs(); // L: 1683
						Archive var11 = FriendLoginUpdate.archive2; // L: 1684
						Archive var12 = Message.archive8; // L: 1685
						Archive var13 = KitDefinition.archive13; // L: 1686
						HitSplatDefinition.HitSplatDefinition_archive = var11; // L: 1688
						Frames.field2379 = var12; // L: 1689
						class413.HitSplatDefinition_fontsArchive = var13; // L: 1690
						AbstractWorldMapIcon.method4803(FriendLoginUpdate.archive2, Message.archive8); // L: 1692
						Archive var14 = FriendLoginUpdate.archive2; // L: 1693
						Archive var15 = Message.archive8; // L: 1694
						WorldMapElement.WorldMapElement_archive = var15; // L: 1696
						if (var14.isFullyLoaded()) { // L: 1697
							WorldMapElement.WorldMapElement_count = var14.getGroupFileCount(35); // L: 1700
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1701

							for (int var16 = 0; var16 < WorldMapElement.WorldMapElement_count; ++var16) { // L: 1702
								byte[] var17 = var14.takeFile(35, var16); // L: 1703
								WorldMapElement.WorldMapElement_cached[var16] = new WorldMapElement(var16); // L: 1704
								if (var17 != null) { // L: 1705
									WorldMapElement.WorldMapElement_cached[var16].decode(new Buffer(var17)); // L: 1706
									WorldMapElement.WorldMapElement_cached[var16].method3164(); // L: 1707
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1711
						Login.Login_loadingPercent = 60; // L: 1712
						Client.titleLoadingStage = 80; // L: 1713
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1716
					var18 = 0; // L: 1717
					if (class10.compass == null) { // L: 1718
						class10.compass = class126.SpriteBuffer_getSprite(Message.archive8, class140.spriteIds.compass, 0);
					} else {
						++var18; // L: 1719
					}

					if (class78.redHintArrowSprite == null) { // L: 1720
						class78.redHintArrowSprite = class126.SpriteBuffer_getSprite(Message.archive8, class140.spriteIds.field4210, 0);
					} else {
						++var18; // L: 1721
					}

					IndexedSprite[] var1;
					int var3;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (class10.mapSceneSprites == null) { // L: 1722
						var2 = Message.archive8; // L: 1724
						var3 = class140.spriteIds.mapScenes; // L: 1725
						if (!class125.method2744(var2, var3, 0)) { // L: 1727
							var1 = null; // L: 1728
						} else {
							var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount]; // L: 1733

							for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) { // L: 1734
								var7 = var5[var6] = new IndexedSprite(); // L: 1735
								var7.width = class434.SpriteBuffer_spriteWidth; // L: 1736
								var7.height = class434.SpriteBuffer_spriteHeight; // L: 1737
								var7.xOffset = class434.SpriteBuffer_xOffsets[var6]; // L: 1738
								var7.yOffset = class434.SpriteBuffer_yOffsets[var6]; // L: 1739
								var7.subWidth = class434.SpriteBuffer_spriteWidths[var6]; // L: 1740
								var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6]; // L: 1741
								var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette; // L: 1742
								var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6]; // L: 1743
							}

							Canvas.method365(); // L: 1745
							var1 = var5; // L: 1748
						}

						class10.mapSceneSprites = var1; // L: 1750
					} else {
						++var18; // L: 1752
					}

					if (ObjectSound.headIconPkSprites == null) { // L: 1753
						ObjectSound.headIconPkSprites = UserList.method6415(Message.archive8, class140.spriteIds.headIconsPk, 0);
					} else {
						++var18; // L: 1754
					}

					if (class4.headIconPrayerSprites == null) { // L: 1755
						class4.headIconPrayerSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4213, 0);
					} else {
						++var18; // L: 1756
					}

					if (SequenceDefinition.headIconHintSprites == null) { // L: 1757
						SequenceDefinition.headIconHintSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4209, 0);
					} else {
						++var18; // L: 1758
					}

					if (Varcs.mapMarkerSprites == null) { // L: 1759
						Varcs.mapMarkerSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4215, 0);
					} else {
						++var18; // L: 1760
					}

					if (WorldMapData_1.crossSprites == null) { // L: 1761
						WorldMapData_1.crossSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4216, 0);
					} else {
						++var18; // L: 1762
					}

					if (Huffman.mapDotSprites == null) { // L: 1763
						Huffman.mapDotSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4214, 0);
					} else {
						++var18; // L: 1764
					}

					if (class144.scrollBarSprites == null) { // L: 1765
						var2 = Message.archive8; // L: 1767
						var3 = class140.spriteIds.field4218; // L: 1768
						if (!class125.method2744(var2, var3, 0)) { // L: 1770
							var1 = null; // L: 1771
						} else {
							var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount]; // L: 1776

							for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) { // L: 1777
								var7 = var5[var6] = new IndexedSprite(); // L: 1778
								var7.width = class434.SpriteBuffer_spriteWidth; // L: 1779
								var7.height = class434.SpriteBuffer_spriteHeight; // L: 1780
								var7.xOffset = class434.SpriteBuffer_xOffsets[var6]; // L: 1781
								var7.yOffset = class434.SpriteBuffer_yOffsets[var6]; // L: 1782
								var7.subWidth = class434.SpriteBuffer_spriteWidths[var6]; // L: 1783
								var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6]; // L: 1784
								var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette; // L: 1785
								var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6]; // L: 1786
							}

							Canvas.method365(); // L: 1788
							var1 = var5; // L: 1791
						}

						class144.scrollBarSprites = var1; // L: 1793
					} else {
						++var18; // L: 1795
					}

					if (Frames.modIconSprites == null) { // L: 1796
						var2 = Message.archive8; // L: 1798
						var3 = class140.spriteIds.field4219; // L: 1799
						if (!class125.method2744(var2, var3, 0)) { // L: 1801
							var1 = null; // L: 1802
						} else {
							var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount]; // L: 1807

							for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) { // L: 1808
								var7 = var5[var6] = new IndexedSprite(); // L: 1809
								var7.width = class434.SpriteBuffer_spriteWidth; // L: 1810
								var7.height = class434.SpriteBuffer_spriteHeight; // L: 1811
								var7.xOffset = class434.SpriteBuffer_xOffsets[var6]; // L: 1812
								var7.yOffset = class434.SpriteBuffer_yOffsets[var6]; // L: 1813
								var7.subWidth = class434.SpriteBuffer_spriteWidths[var6]; // L: 1814
								var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6]; // L: 1815
								var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette; // L: 1816
								var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6]; // L: 1817
							}

							Canvas.method365(); // L: 1819
							var1 = var5; // L: 1822
						}

						Frames.modIconSprites = var1; // L: 1824
					} else {
						++var18; // L: 1826
					}

					if (var18 < 11) { // L: 1827
						Login.Login_loadingText = "Loading sprites - " + var18 * 100 / 12 + "%"; // L: 1828
						Login.Login_loadingPercent = 70; // L: 1829
					} else {
						AbstractFont.AbstractFont_modIconSprites = Frames.modIconSprites; // L: 1832
						class78.redHintArrowSprite.normalize(); // L: 1833
						var19 = (int)(Math.random() * 21.0D) - 10; // L: 1834
						int var20 = (int)(Math.random() * 21.0D) - 10; // L: 1835
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1836
						int var21 = (int)(Math.random() * 41.0D) - 20; // L: 1837
						class10.mapSceneSprites[0].shiftColors(var21 + var19, var21 + var20, var3 + var21); // L: 1838
						Login.Login_loadingText = "Loaded sprites"; // L: 1839
						Login.Login_loadingPercent = 70; // L: 1840
						Client.titleLoadingStage = 90; // L: 1841
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1844
					if (!class9.archive9.isFullyLoaded()) { // L: 1845
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1846
						Login.Login_loadingPercent = 90; // L: 1847
					} else {
						TextureProvider.textureProvider = new TextureProvider(class9.archive9, Message.archive8, 20, class424.clientPreferences.brightness, Client.isLowDetail ? 64 : 128); // L: 1850
						Rasterizer3D.Rasterizer3D_setTextureLoader(TextureProvider.textureProvider); // L: 1851
						Rasterizer3D.Rasterizer3D_setBrightness(class424.clientPreferences.brightness); // L: 1852
						Client.titleLoadingStage = 100; // L: 1853
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1856
					var18 = TextureProvider.textureProvider.getLoadedPercentage(); // L: 1857
					if (var18 < 100) { // L: 1858
						Login.Login_loadingText = "Loading textures - " + var18 + "%"; // L: 1859
						Login.Login_loadingPercent = 90; // L: 1860
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1863
						Login.Login_loadingPercent = 90; // L: 1864
						Client.titleLoadingStage = 110; // L: 1865
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1868
					PacketWriter.mouseRecorder = new MouseRecorder(); // L: 1869
					GameEngine.taskHandler.newThreadTask(PacketWriter.mouseRecorder, 10); // L: 1870
					Login.Login_loadingText = "Loaded input handler"; // L: 1871
					Login.Login_loadingPercent = 92; // L: 1872
					Client.titleLoadingStage = 120; // L: 1873
				} else if (Client.titleLoadingStage == 120) { // L: 1876
					if (!Tile.archive10.tryLoadFileByNames("huffman", "")) { // L: 1877
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1878
						Login.Login_loadingPercent = 94; // L: 1879
					} else {
						Huffman var0 = new Huffman(Tile.archive10.takeFileByNames("huffman", "")); // L: 1882
						class9.method82(var0); // L: 1883
						Login.Login_loadingText = "Loaded wordpack"; // L: 1884
						Login.Login_loadingPercent = 94; // L: 1885
						Client.titleLoadingStage = 130; // L: 1886
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1889
					if (!Tile.archive3.isFullyLoaded()) { // L: 1890
						Login.Login_loadingText = "Loading interfaces - " + Tile.archive3.loadPercent() * 4 / 5 + "%"; // L: 1891
						Login.Login_loadingPercent = 96; // L: 1892
					} else if (!class148.archive12.isFullyLoaded()) { // L: 1895
						Login.Login_loadingText = "Loading interfaces - " + (80 + class148.archive12.loadPercent() / 6) + "%"; // L: 1896
						Login.Login_loadingPercent = 96; // L: 1897
					} else if (!KitDefinition.archive13.isFullyLoaded()) { // L: 1900
						Login.Login_loadingText = "Loading interfaces - " + (96 + KitDefinition.archive13.loadPercent() / 50) + "%"; // L: 1901
						Login.Login_loadingPercent = 96; // L: 1902
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1905
						Login.Login_loadingPercent = 98; // L: 1906
						Client.titleLoadingStage = 140; // L: 1907
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1910
					Login.Login_loadingPercent = 100; // L: 1911
					if (!WorldMapRegion.archive19.tryLoadGroupByName(WorldMapCacheName.field2793.name)) { // L: 1912
						Login.Login_loadingText = "Loading world map - " + WorldMapRegion.archive19.groupLoadPercentByName(WorldMapCacheName.field2793.name) / 10 + "%"; // L: 1913
					} else {
						if (Huffman.worldMap == null) { // L: 1916
							Huffman.worldMap = new WorldMap(); // L: 1917
							Huffman.worldMap.init(WorldMapRegion.archive19, UrlRequest.archive18, Varcs.archive20, class408.fontBold12, Client.fontsMap, class10.mapSceneSprites); // L: 1918
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1920
						Client.titleLoadingStage = 150; // L: 1921
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1924
					class111.updateGameState(10); // L: 1925
				}
			}
		}
	} // L: 1495 1501 1527 1554 1574 1591 1599 1608 1620 1626 1632 1714 1830 1842 1848 1854 1861 1866 1874 1880 1887 1893 1898 1903 1908 1914 1922 1926 1928

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;I)V",
		garbageValue = "1819387298"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5276
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5277
			var2 = var1.method7408(); // L: 5278
			var3 = var1.method7408(); // L: 5279
			int var4 = var1.readUnsignedShort(); // L: 5280
			UserComparator8.xteaKeys = new int[var4][4]; // L: 5281

			for (var5 = 0; var5 < var4; ++var5) { // L: 5282
				for (var6 = 0; var6 < 4; ++var6) { // L: 5283
					UserComparator8.xteaKeys[var5][var6] = var1.readInt(); // L: 5284
				}
			}

			WorldMapLabel.regions = new int[var4]; // L: 5287
			Varcs.regionMapArchiveIds = new int[var4]; // L: 5288
			WorldMapData_0.regionLandArchiveIds = new int[var4]; // L: 5289
			Friend.regionLandArchives = new byte[var4][]; // L: 5290
			ReflectionCheck.regionMapArchives = new byte[var4][]; // L: 5291
			boolean var16 = false; // L: 5292
			if (Client.field554) { // L: 5293
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 5294
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 5295
					var16 = true;
				}
			}

			var4 = 0; // L: 5297

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5298
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 5299
					var8 = var7 + (var6 << 8); // L: 5300
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5301
						WorldMapLabel.regions[var4] = var8; // L: 5302
						Varcs.regionMapArchiveIds[var4] = Client.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5303
						WorldMapData_0.regionLandArchiveIds[var4] = Client.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5304
						++var4; // L: 5305
					}
				}
			}

			class265.method5030(var3, var2, true); // L: 5308
		} else {
			var2 = var1.method7562(); // L: 5311
			var3 = var1.method7562(); // L: 5312
			boolean var15 = var1.method7398() == 1; // L: 5313
			var5 = var1.readUnsignedShort(); // L: 5314
			var1.importIndex(); // L: 5315

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5316
				for (var7 = 0; var7 < 13; ++var7) { // L: 5317
					for (var8 = 0; var8 < 13; ++var8) { // L: 5318
						var9 = var1.readBits(1); // L: 5319
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5320
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5321
						}
					}
				}
			}

			var1.exportIndex(); // L: 5325
			UserComparator8.xteaKeys = new int[var5][4]; // L: 5326

			for (var6 = 0; var6 < var5; ++var6) { // L: 5327
				for (var7 = 0; var7 < 4; ++var7) { // L: 5328
					UserComparator8.xteaKeys[var6][var7] = var1.readInt(); // L: 5329
				}
			}

			WorldMapLabel.regions = new int[var5]; // L: 5332
			Varcs.regionMapArchiveIds = new int[var5]; // L: 5333
			WorldMapData_0.regionLandArchiveIds = new int[var5]; // L: 5334
			Friend.regionLandArchives = new byte[var5][]; // L: 5335
			ReflectionCheck.regionMapArchives = new byte[var5][]; // L: 5336
			var5 = 0; // L: 5337

			for (var6 = 0; var6 < 4; ++var6) { // L: 5338
				for (var7 = 0; var7 < 13; ++var7) { // L: 5339
					for (var8 = 0; var8 < 13; ++var8) { // L: 5340
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5341
						if (var9 != -1) { // L: 5342
							int var10 = var9 >> 14 & 1023; // L: 5343
							int var11 = var9 >> 3 & 2047; // L: 5344
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5345

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5346
								if (WorldMapLabel.regions[var13] == var12) {
									var12 = -1; // L: 5347
									break; // L: 5348
								}
							}

							if (var12 != -1) { // L: 5350
								WorldMapLabel.regions[var5] = var12; // L: 5351
								var13 = var12 >> 8 & 255; // L: 5352
								int var14 = var12 & 255; // L: 5353
								Varcs.regionMapArchiveIds[var5] = Client.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5354
								WorldMapData_0.regionLandArchiveIds[var5] = Client.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5355
								++var5; // L: 5356
							}
						}
					}
				}
			}

			class265.method5030(var2, var3, !var15); // L: 5362
		}

	} // L: 5364
}
