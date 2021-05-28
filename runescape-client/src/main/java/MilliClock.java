import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("b")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("v")
	long[] field1519;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1403302325
	)
	int field1515;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 892183401
	)
	int field1517;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -3130930086544390357L
	)
	long field1516;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 543039723
	)
	int field1518;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 652562423
	)
	int field1514;

	public MilliClock() {
		this.field1519 = new long[10]; // L: 7
		this.field1515 = 256; // L: 15
		this.field1517 = 1; // L: 16
		this.field1518 = 0; // L: 17
		this.field1516 = ObjectComposition.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1519[var1] = this.field1516; // L: 20
		}

	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1887937791"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1519[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1841090229"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1515; // L: 31
		int var4 = this.field1517; // L: 32
		this.field1515 = 300; // L: 33
		this.field1517 = 1; // L: 34
		this.field1516 = ObjectComposition.currentTimeMillis(); // L: 35
		if (0L == this.field1519[this.field1514]) { // L: 36
			this.field1515 = var3; // L: 37
			this.field1517 = var4; // L: 38
		} else if (this.field1516 > this.field1519[this.field1514]) { // L: 40
			this.field1515 = (int)((long)(var1 * 2560) / (this.field1516 - this.field1519[this.field1514]));
		}

		if (this.field1515 < 25) { // L: 41
			this.field1515 = 25;
		}

		if (this.field1515 > 256) { // L: 42
			this.field1515 = 256; // L: 43
			this.field1517 = (int)((long)var1 - (this.field1516 - this.field1519[this.field1514]) / 10L); // L: 44
		}

		if (this.field1517 > var1) { // L: 46
			this.field1517 = var1;
		}

		this.field1519[this.field1514] = this.field1516; // L: 47
		this.field1514 = (this.field1514 + 1) % 10; // L: 48
		if (this.field1517 > 1) { // L: 49
			for (int var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1519[var5]) { // L: 51
					this.field1519[var5] += (long)this.field1517;
				}
			}
		}

		if (this.field1517 < var2) { // L: 54
			this.field1517 = var2;
		}

		long var10 = (long)this.field1517; // L: 55
		if (var10 > 0L) { // L: 57
			if (0L == var10 % 10L) { // L: 58
				long var7 = var10 - 1L; // L: 59

				try {
					Thread.sleep(var7); // L: 62
				} catch (InterruptedException var16) { // L: 64
				}

				try {
					Thread.sleep(1L); // L: 68
				} catch (InterruptedException var15) { // L: 70
				}
			} else {
				try {
					Thread.sleep(var10); // L: 75
				} catch (InterruptedException var14) { // L: 77
				}
			}
		}

		int var13;
		for (var13 = 0; this.field1518 < 256; this.field1518 += this.field1515) { // L: 80 81 83
			++var13; // L: 82
		}

		this.field1518 &= 255; // L: 85
		return var13; // L: 86
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179304235"
	)
	public static void method2587() {
		WorldMapDecoration.SpriteBuffer_xOffsets = null; // L: 240
		Calendar.SpriteBuffer_yOffsets = null; // L: 241
		class396.SpriteBuffer_spriteWidths = null; // L: 242
		class302.SpriteBuffer_spriteHeights = null; // L: 243
		SpriteBuffer_spritePalette = null; // L: 244
		class396.SpriteBuffer_pixels = null; // L: 245
	} // L: 246

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("load")
	static void load() {
		int var31;
		if (Client.titleLoadingStage == 0) { // L: 1523
			AbstractSocket.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1524

			for (var31 = 0; var31 < 4; ++var31) { // L: 1525
				Client.collisionMaps[var31] = new CollisionMap(104, 104);
			}

			GameEngine.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1526
			Login.Login_loadingText = "Starting game engine..."; // L: 1527
			Login.Login_loadingPercent = 5; // L: 1528
			Client.titleLoadingStage = 20; // L: 1529
		} else if (Client.titleLoadingStage == 20) { // L: 1532
			Login.Login_loadingText = "Prepared visibility map"; // L: 1533
			Login.Login_loadingPercent = 10; // L: 1534
			Client.titleLoadingStage = 30; // L: 1535
		} else if (Client.titleLoadingStage == 30) { // L: 1538
			NetCache.archive0 = FontName.newArchive(0, false, true, true); // L: 1539
			class27.archive1 = FontName.newArchive(1, false, true, true); // L: 1540
			class8.archive2 = FontName.newArchive(2, true, false, true); // L: 1541
			ClanChannel.archive3 = FontName.newArchive(3, false, true, true); // L: 1542
			class32.archive4 = FontName.newArchive(4, false, true, true); // L: 1543
			class247.archive5 = FontName.newArchive(5, true, true, true); // L: 1544
			UrlRequest.archive6 = FontName.newArchive(6, true, true, true); // L: 1545
			Decimator.archive7 = FontName.newArchive(7, false, true, true); // L: 1546
			GrandExchangeOfferAgeComparator.archive8 = FontName.newArchive(8, false, true, true); // L: 1547
			CollisionMap.archive9 = FontName.newArchive(9, false, true, true); // L: 1548
			SoundCache.archive10 = FontName.newArchive(10, false, true, true); // L: 1549
			WorldMapManager.archive11 = FontName.newArchive(11, false, true, true); // L: 1550
			UserComparator5.archive12 = FontName.newArchive(12, false, true, true); // L: 1551
			Decimator.archive13 = FontName.newArchive(13, true, false, true); // L: 1552
			class125.archive14 = FontName.newArchive(14, false, true, true); // L: 1553
			ClanMate.archive15 = FontName.newArchive(15, false, true, true); // L: 1554
			class8.archive17 = FontName.newArchive(17, true, true, true); // L: 1555
			FontName.archive18 = FontName.newArchive(18, false, true, true); // L: 1556
			class179.archive19 = FontName.newArchive(19, false, true, true); // L: 1557
			class5.archive20 = FontName.newArchive(20, false, true, true); // L: 1558
			Login.Login_loadingText = "Connecting to update server"; // L: 1559
			Login.Login_loadingPercent = 20; // L: 1560
			Client.titleLoadingStage = 40; // L: 1561
		} else if (Client.titleLoadingStage != 40) { // L: 1564
			if (Client.titleLoadingStage == 45) { // L: 1611
				boolean var34 = !Client.isLowDetail; // L: 1612
				PcmPlayer.field428 = 22050; // L: 1615
				PcmPlayer.PcmPlayer_stereo = var34; // L: 1616
				PcmPlayer.field418 = 2; // L: 1617
				MidiPcmStream var32 = new MidiPcmStream(); // L: 1619
				var32.method4502(9, 128); // L: 1620
				DesktopPlatformInfoProvider.pcmPlayer0 = HorizontalAlignment.method2762(GameEngine.taskHandler, 0, 22050); // L: 1621
				DesktopPlatformInfoProvider.pcmPlayer0.setStream(var32); // L: 1622
				WorldMapID.method3636(ClanMate.archive15, class125.archive14, class32.archive4, var32); // L: 1623
				MouseRecorder.pcmPlayer1 = HorizontalAlignment.method2762(GameEngine.taskHandler, 1, 2048); // L: 1624
				class308.pcmStreamMixer = new PcmStreamMixer(); // L: 1625
				MouseRecorder.pcmPlayer1.setStream(class308.pcmStreamMixer); // L: 1626
				TileItem.decimator = new Decimator(22050, PcmPlayer.field428); // L: 1627
				Login.Login_loadingText = "Prepared sound engine"; // L: 1628
				Login.Login_loadingPercent = 35; // L: 1629
				Client.titleLoadingStage = 50; // L: 1630
				World.WorldMapElement_fonts = new Fonts(GrandExchangeOfferAgeComparator.archive8, Decimator.archive13); // L: 1631
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) { // L: 1634
					FontName[] var29 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12}; // L: 1637
					var1 = var29.length; // L: 1639
					Fonts var33 = World.WorldMapElement_fonts; // L: 1640
					FontName[] var27 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12}; // L: 1643
					Client.fontsMap = var33.createMap(var27); // L: 1645
					if (Client.fontsMap.size() < var1) { // L: 1646
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1647
						Login.Login_loadingPercent = 40; // L: 1648
					} else {
						Actor.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1651
						UserComparator3.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1652
						Widget.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1653
						class10.platformInfo = Client.platformInfoProvider.get(); // L: 1654
						Login.Login_loadingText = "Loaded fonts"; // L: 1655
						Login.Login_loadingPercent = 40; // L: 1656
						Client.titleLoadingStage = 60; // L: 1657
					}
				} else {
					int var3;
					int var4;
					Archive var24;
					Archive var25;
					if (Client.titleLoadingStage == 60) { // L: 1660
						var24 = SoundCache.archive10; // L: 1662
						var25 = GrandExchangeOfferAgeComparator.archive8; // L: 1663
						var3 = 0; // L: 1665
						if (var24.tryLoadFileByNames("title.jpg", "")) { // L: 1666
							++var3;
						}

						if (var25.tryLoadFileByNames("logo", "")) { // L: 1667
							++var3;
						}

						if (var25.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1668
							++var3;
						}

						if (var25.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1669
							++var3;
						}

						if (var25.tryLoadFileByNames("titlebox", "")) { // L: 1670
							++var3;
						}

						if (var25.tryLoadFileByNames("titlebutton", "")) { // L: 1671
							++var3;
						}

						if (var25.tryLoadFileByNames("runes", "")) { // L: 1672
							++var3;
						}

						if (var25.tryLoadFileByNames("title_mute", "")) { // L: 1673
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1674
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1675
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1676
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1677
							++var3;
						}

						var25.tryLoadFileByNames("sl_back", ""); // L: 1678
						var25.tryLoadFileByNames("sl_flags", ""); // L: 1679
						var25.tryLoadFileByNames("sl_arrows", ""); // L: 1680
						var25.tryLoadFileByNames("sl_stars", ""); // L: 1681
						var25.tryLoadFileByNames("sl_button", ""); // L: 1682
						var4 = AbstractSocket.method5901(); // L: 1686
						if (var3 < var4) { // L: 1687
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 1688
							Login.Login_loadingPercent = 50; // L: 1689
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1692
							Login.Login_loadingPercent = 50; // L: 1693
							class12.updateGameState(5); // L: 1694
							Client.titleLoadingStage = 70; // L: 1695
						}
					} else if (Client.titleLoadingStage == 70) { // L: 1698
						if (!class8.archive2.isFullyLoaded()) { // L: 1699
							Login.Login_loadingText = "Loading config - " + class8.archive2.loadPercent() + "%"; // L: 1700
							Login.Login_loadingPercent = 60; // L: 1701
						} else {
							Archive var28 = class8.archive2; // L: 1704
							class142.FloorOverlayDefinition_archive = var28; // L: 1706
							class27.method277(class8.archive2); // L: 1708
							ChatChannel.method2012(class8.archive2, Decimator.archive7); // L: 1709
							var24 = class8.archive2; // L: 1710
							var25 = Decimator.archive7; // L: 1711
							boolean var30 = Client.isLowDetail; // L: 1712
							ObjectComposition.ObjectDefinition_archive = var24; // L: 1714
							class310.ObjectDefinition_modelsArchive = var25; // L: 1715
							ObjectComposition.ObjectDefinition_isLowDetail = var30; // L: 1716
							Archive var26 = class8.archive2; // L: 1718
							Archive var5 = Decimator.archive7; // L: 1719
							NPCComposition.NpcDefinition_archive = var26; // L: 1721
							NPCComposition.NpcDefinition_modelArchive = var5; // L: 1722
							class13.method180(class8.archive2); // L: 1724
							Archive var6 = class8.archive2; // L: 1725
							Archive var7 = Decimator.archive7; // L: 1726
							boolean var8 = Client.isMembersWorld; // L: 1727
							Font var9 = Actor.fontPlain11; // L: 1728
							class341.ItemDefinition_archive = var6; // L: 1730
							class311.ItemDefinition_modelArchive = var7; // L: 1731
							ItemContainer.ItemDefinition_inMembersWorld = var8; // L: 1732
							ItemComposition.ItemDefinition_fileCount = class341.ItemDefinition_archive.getGroupFileCount(10); // L: 1733
							class288.ItemDefinition_fontPlain11 = var9; // L: 1734
							Archive var10 = class8.archive2; // L: 1736
							Archive var11 = NetCache.archive0; // L: 1737
							Archive var12 = class27.archive1; // L: 1738
							SequenceDefinition.SequenceDefinition_archive = var10; // L: 1740
							SequenceDefinition.SequenceDefinition_animationsArchive = var11; // L: 1741
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var12; // L: 1742
							class1.method13(class8.archive2, Decimator.archive7); // L: 1744
							UserComparator10.method2471(class8.archive2); // L: 1745
							class280.method5070(class8.archive2); // L: 1746
							Archive var13 = ClanChannel.archive3; // L: 1747
							Archive var14 = Decimator.archive7; // L: 1748
							Archive var15 = GrandExchangeOfferAgeComparator.archive8; // L: 1749
							Archive var16 = Decimator.archive13; // L: 1750
							HealthBarUpdate.Widget_archive = var13; // L: 1752
							SpriteMask.Widget_modelsArchive = var14; // L: 1753
							class245.Widget_spritesArchive = var15; // L: 1754
							VertexNormal.Widget_fontsArchive = var16; // L: 1755
							Widget.Widget_interfaceComponents = new Widget[HealthBarUpdate.Widget_archive.getGroupCount()][]; // L: 1756
							Widget.Widget_loadedInterfaces = new boolean[HealthBarUpdate.Widget_archive.getGroupCount()]; // L: 1757
							LoginScreenAnimation.method2210(class8.archive2); // L: 1759
							GrandExchangeOfferUnitPriceComparator.method5109(class8.archive2); // L: 1760
							PacketWriter.method2384(class8.archive2); // L: 1761
							Archive var17 = class8.archive2; // L: 1762
							ParamComposition.ParamDefinition_archive = var17; // L: 1764
							GrandExchangeOfferOwnWorldComparator.field634 = new class369(SoundSystem.field461, 54, class378.clientLanguage, class8.archive2); // L: 1766
							ViewportMouse.HitSplatDefinition_cachedSprites = new class369(SoundSystem.field461, 47, class378.clientLanguage, class8.archive2); // L: 1767
							GrandExchangeOfferOwnWorldComparator.varcs = new Varcs(); // L: 1768
							Archive var18 = class8.archive2; // L: 1769
							Archive var19 = GrandExchangeOfferAgeComparator.archive8; // L: 1770
							Archive var20 = Decimator.archive13; // L: 1771
							HitSplatDefinition.HitSplatDefinition_archive = var18; // L: 1773
							HitSplatDefinition.field1734 = var19; // L: 1774
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var20; // L: 1775
							Archive var21 = class8.archive2; // L: 1777
							Archive var22 = GrandExchangeOfferAgeComparator.archive8; // L: 1778
							HealthBarDefinition.HealthBarDefinition_archive = var21; // L: 1780
							HealthBarDefinition.HitSplatDefinition_spritesArchive = var22; // L: 1781
							UserComparator5.method2449(class8.archive2, GrandExchangeOfferAgeComparator.archive8); // L: 1783
							Login.Login_loadingText = "Loaded config"; // L: 1784
							Login.Login_loadingPercent = 60; // L: 1785
							Client.titleLoadingStage = 80; // L: 1786
						}
					} else if (Client.titleLoadingStage == 80) { // L: 1789
						var31 = 0; // L: 1790
						if (NPCComposition.compass == null) { // L: 1791
							NPCComposition.compass = ClientPacket.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.compass, 0);
						} else {
							++var31; // L: 1792
						}

						if (Interpreter.redHintArrowSprite == null) { // L: 1793
							Interpreter.redHintArrowSprite = ClientPacket.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3897, 0);
						} else {
							++var31; // L: 1794
						}

						if (class10.mapSceneSprites == null) { // L: 1795
							class10.mapSceneSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.mapScenes, 0);
						} else {
							++var31; // L: 1796
						}

						if (class35.headIconPkSprites == null) { // L: 1797
							class35.headIconPkSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.headIconsPk, 0);
						} else {
							++var31; // L: 1798
						}

						if (TextureProvider.headIconPrayerSprites == null) { // L: 1799
							TextureProvider.headIconPrayerSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3900, 0);
						} else {
							++var31; // L: 1800
						}

						if (PacketBufferNode.headIconHintSprites == null) { // L: 1801
							PacketBufferNode.headIconHintSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3901, 0);
						} else {
							++var31; // L: 1802
						}

						if (WorldMapArea.mapMarkerSprites == null) { // L: 1803
							WorldMapArea.mapMarkerSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3905, 0);
						} else {
							++var31; // L: 1804
						}

						if (ArchiveLoader.crossSprites == null) { // L: 1805
							ArchiveLoader.crossSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3903, 0);
						} else {
							++var31; // L: 1806
						}

						if (class170.mapDotSprites == null) { // L: 1807
							class170.mapDotSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3904, 0);
						} else {
							++var31; // L: 1808
						}

						if (Player.scrollBarSprites == null) { // L: 1809
							Player.scrollBarSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3898, 0);
						} else {
							++var31; // L: 1810
						}

						if (WorldMapDecoration.modIconSprites == null) { // L: 1811
							WorldMapDecoration.modIconSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3906, 0);
						} else {
							++var31; // L: 1812
						}

						if (var31 < 11) { // L: 1813
							Login.Login_loadingText = "Loading sprites - " + var31 * 100 / 12 + "%"; // L: 1814
							Login.Login_loadingPercent = 70; // L: 1815
						} else {
							AbstractFont.AbstractFont_modIconSprites = WorldMapDecoration.modIconSprites; // L: 1818
							Interpreter.redHintArrowSprite.normalize(); // L: 1819
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 1820
							int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1821
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1822
							var4 = (int)(Math.random() * 41.0D) - 20; // L: 1823
							class10.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3); // L: 1824
							Login.Login_loadingText = "Loaded sprites"; // L: 1825
							Login.Login_loadingPercent = 70; // L: 1826
							Client.titleLoadingStage = 90; // L: 1827
						}
					} else if (Client.titleLoadingStage == 90) { // L: 1830
						if (!CollisionMap.archive9.isFullyLoaded()) { // L: 1831
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1832
							Login.Login_loadingPercent = 90; // L: 1833
						} else {
							World.textureProvider = new TextureProvider(CollisionMap.archive9, GrandExchangeOfferAgeComparator.archive8, 20, ObjectComposition.clientPreferences.field1337, Client.isLowDetail ? 64 : 128); // L: 1836
							Rasterizer3D.Rasterizer3D_setTextureLoader(World.textureProvider); // L: 1837
							Rasterizer3D.Rasterizer3D_setBrightness(ObjectComposition.clientPreferences.field1337); // L: 1838
							Client.titleLoadingStage = 100; // L: 1839
						}
					} else if (Client.titleLoadingStage == 100) { // L: 1842
						var31 = World.textureProvider.getLoadedPercentage(); // L: 1843
						if (var31 < 100) { // L: 1844
							Login.Login_loadingText = "Loading textures - " + var31 + "%"; // L: 1845
							Login.Login_loadingPercent = 90; // L: 1846
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1849
							Login.Login_loadingPercent = 90; // L: 1850
							Client.titleLoadingStage = 110; // L: 1851
						}
					} else if (Client.titleLoadingStage == 110) { // L: 1854
						Skills.mouseRecorder = new MouseRecorder(); // L: 1855
						GameEngine.taskHandler.newThreadTask(Skills.mouseRecorder, 10); // L: 1856
						Login.Login_loadingText = "Loaded input handler"; // L: 1857
						Login.Login_loadingPercent = 92; // L: 1858
						Client.titleLoadingStage = 120; // L: 1859
					} else if (Client.titleLoadingStage == 120) { // L: 1862
						if (!SoundCache.archive10.tryLoadFileByNames("huffman", "")) { // L: 1863
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1864
							Login.Login_loadingPercent = 94; // L: 1865
						} else {
							Huffman var0 = new Huffman(SoundCache.archive10.takeFileByNames("huffman", "")); // L: 1868
							ClanChannelMember.method88(var0); // L: 1869
							Login.Login_loadingText = "Loaded wordpack"; // L: 1870
							Login.Login_loadingPercent = 94; // L: 1871
							Client.titleLoadingStage = 130; // L: 1872
						}
					} else if (Client.titleLoadingStage == 130) { // L: 1875
						if (!ClanChannel.archive3.isFullyLoaded()) { // L: 1876
							Login.Login_loadingText = "Loading interfaces - " + ClanChannel.archive3.loadPercent() * 4 / 5 + "%"; // L: 1877
							Login.Login_loadingPercent = 96; // L: 1878
						} else if (!UserComparator5.archive12.isFullyLoaded()) { // L: 1881
							Login.Login_loadingText = "Loading interfaces - " + (80 + UserComparator5.archive12.loadPercent() / 6) + "%"; // L: 1882
							Login.Login_loadingPercent = 96; // L: 1883
						} else if (!Decimator.archive13.isFullyLoaded()) { // L: 1886
							Login.Login_loadingText = "Loading interfaces - " + (96 + Decimator.archive13.loadPercent() / 50) + "%"; // L: 1887
							Login.Login_loadingPercent = 96; // L: 1888
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1891
							Login.Login_loadingPercent = 98; // L: 1892
							Client.titleLoadingStage = 140; // L: 1893
						}
					} else if (Client.titleLoadingStage == 140) { // L: 1896
						Login.Login_loadingPercent = 100; // L: 1897
						if (!class179.archive19.tryLoadGroupByName(WorldMapCacheName.field2137.name)) { // L: 1898
							Login.Login_loadingText = "Loading world map - " + class179.archive19.groupLoadPercentByName(WorldMapCacheName.field2137.name) / 10 + "%"; // L: 1899
						} else {
							if (class243.worldMap == null) { // L: 1902
								class243.worldMap = new WorldMap(); // L: 1903
								class243.worldMap.init(class179.archive19, FontName.archive18, class5.archive20, Widget.fontBold12, Client.fontsMap, class10.mapSceneSprites); // L: 1904
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1906
							Client.titleLoadingStage = 150; // L: 1907
						}
					} else if (Client.titleLoadingStage == 150) { // L: 1910
						class12.updateGameState(10); // L: 1911
					}
				}
			}
		} else {
			byte var23 = 0; // L: 1565
			var31 = var23 + NetCache.archive0.percentage() * 4 / 100; // L: 1566
			var31 += class27.archive1.percentage() * 4 / 100; // L: 1567
			var31 += class8.archive2.percentage() * 2 / 100; // L: 1568
			var31 += ClanChannel.archive3.percentage() * 2 / 100; // L: 1569
			var31 += class32.archive4.percentage() * 6 / 100; // L: 1570
			var31 += class247.archive5.percentage() * 4 / 100; // L: 1571
			var31 += UrlRequest.archive6.percentage() * 2 / 100; // L: 1572
			var31 += Decimator.archive7.percentage() * 56 / 100; // L: 1573
			var31 += GrandExchangeOfferAgeComparator.archive8.percentage() * 2 / 100; // L: 1574
			var31 += CollisionMap.archive9.percentage() * 2 / 100; // L: 1575
			var31 += SoundCache.archive10.percentage() * 2 / 100; // L: 1576
			var31 += WorldMapManager.archive11.percentage() * 2 / 100; // L: 1577
			var31 += UserComparator5.archive12.percentage() * 2 / 100; // L: 1578
			var31 += Decimator.archive13.percentage() * 2 / 100; // L: 1579
			var31 += class125.archive14.percentage() * 2 / 100; // L: 1580
			var31 += ClanMate.archive15.percentage() * 2 / 100; // L: 1581
			var31 += class179.archive19.percentage() / 100; // L: 1582
			var31 += FontName.archive18.percentage() / 100; // L: 1583
			var31 += class5.archive20.percentage() / 100; // L: 1584
			var31 += class8.archive17.method4869() && class8.archive17.isFullyLoaded() ? 1 : 0; // L: 1585
			if (var31 != 100) { // L: 1586
				if (var31 != 0) { // L: 1587
					Login.Login_loadingText = "Checking for updates - " + var31 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1588
			} else {
				class13.method175(NetCache.archive0, "Animations"); // L: 1591
				class13.method175(class27.archive1, "Skeletons"); // L: 1592
				class13.method175(class32.archive4, "Sound FX"); // L: 1593
				class13.method175(class247.archive5, "Maps"); // L: 1594
				class13.method175(UrlRequest.archive6, "Music Tracks"); // L: 1595
				class13.method175(Decimator.archive7, "Models"); // L: 1596
				class13.method175(GrandExchangeOfferAgeComparator.archive8, "Sprites"); // L: 1597
				class13.method175(WorldMapManager.archive11, "Music Jingles"); // L: 1598
				class13.method175(class125.archive14, "Music Samples"); // L: 1599
				class13.method175(ClanMate.archive15, "Music Patches"); // L: 1600
				class13.method175(class179.archive19, "World Map"); // L: 1601
				class13.method175(FontName.archive18, "World Map Geography"); // L: 1602
				class13.method175(class5.archive20, "World Map Ground"); // L: 1603
				TaskHandler.spriteIds = new GraphicsDefaults(); // L: 1604
				TaskHandler.spriteIds.decode(class8.archive17); // L: 1605
				Login.Login_loadingText = "Loaded update list"; // L: 1606
				Login.Login_loadingPercent = 30; // L: 1607
				Client.titleLoadingStage = 45; // L: 1608
			}
		}
	} // L: 1530 1536 1562 1589 1609 1632 1649 1658 1690 1696 1702 1787 1816 1828 1834 1840 1847 1852 1860 1866 1873 1879 1884 1889 1894 1900 1908 1912 1914

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1594517863"
	)
	static final int method2588() {
		return Client.menuOptionsCount - 1; // L: 8819
	}
}
