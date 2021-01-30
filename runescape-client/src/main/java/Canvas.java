import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ak")
	static Image field425;
	@ObfuscatedName("h")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;Lib;I)V",
		garbageValue = "1765160595"
	)
	public static void method912(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field3354 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1227984661"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("load")
	static void load() {
		int var12;
		if (Client.titleLoadingStage == 0) { // L: 1726
			ArchiveLoader.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1727

			for (var12 = 0; var12 < 4; ++var12) { // L: 1728
				Client.collisionMaps[var12] = new CollisionMap(104, 104);
			}

			class25.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1729
			Login.Login_loadingText = "Starting game engine..."; // L: 1730
			Login.Login_loadingPercent = 5; // L: 1731
			Client.titleLoadingStage = 20; // L: 1732
		} else if (Client.titleLoadingStage == 20) { // L: 1735
			Login.Login_loadingText = "Prepared visibility map"; // L: 1736
			Login.Login_loadingPercent = 10; // L: 1737
			Client.titleLoadingStage = 30; // L: 1738
		} else if (Client.titleLoadingStage == 30) { // L: 1741
			SceneTilePaint.archive0 = WorldMapCacheName.newArchive(0, false, true, true); // L: 1742
			WorldMapSprite.archive1 = WorldMapCacheName.newArchive(1, false, true, true); // L: 1743
			DynamicObject.archive2 = WorldMapCacheName.newArchive(2, true, false, true); // L: 1744
			class330.archive3 = WorldMapCacheName.newArchive(3, false, true, true); // L: 1745
			class227.archive4 = WorldMapCacheName.newArchive(4, false, true, true); // L: 1746
			GameEngine.archive5 = WorldMapCacheName.newArchive(5, true, true, true); // L: 1747
			class217.archive6 = WorldMapCacheName.newArchive(6, true, true, true); // L: 1748
			BuddyRankComparator.archive7 = WorldMapCacheName.newArchive(7, false, true, true); // L: 1749
			Messages.archive8 = WorldMapCacheName.newArchive(8, false, true, true); // L: 1750
			GrandExchangeOfferUnitPriceComparator.archive9 = WorldMapCacheName.newArchive(9, false, true, true); // L: 1751
			class92.archive10 = WorldMapCacheName.newArchive(10, false, true, true); // L: 1752
			ItemContainer.archive11 = WorldMapCacheName.newArchive(11, false, true, true); // L: 1753
			PacketBufferNode.archive12 = WorldMapCacheName.newArchive(12, false, true, true); // L: 1754
			GrandExchangeOfferUnitPriceComparator.archive13 = WorldMapCacheName.newArchive(13, true, false, true); // L: 1755
			FontName.archive14 = WorldMapCacheName.newArchive(14, false, true, true); // L: 1756
			Client.archive15 = WorldMapCacheName.newArchive(15, false, true, true); // L: 1757
			class169.archive17 = WorldMapCacheName.newArchive(17, true, true, true); // L: 1758
			class41.archive18 = WorldMapCacheName.newArchive(18, false, true, true); // L: 1759
			class195.archive19 = WorldMapCacheName.newArchive(19, false, true, true); // L: 1760
			NetFileRequest.archive20 = WorldMapCacheName.newArchive(20, false, true, true); // L: 1761
			Login.Login_loadingText = "Connecting to update server"; // L: 1762
			Login.Login_loadingPercent = 20; // L: 1763
			Client.titleLoadingStage = 40; // L: 1764
		} else if (Client.titleLoadingStage == 40) { // L: 1767
			byte var23 = 0; // L: 1768
			var12 = var23 + SceneTilePaint.archive0.percentage() * 4 / 100; // L: 1769
			var12 += WorldMapSprite.archive1.percentage() * 4 / 100; // L: 1770
			var12 += DynamicObject.archive2.percentage() * 2 / 100; // L: 1771
			var12 += class330.archive3.percentage() * 2 / 100; // L: 1772
			var12 += class227.archive4.percentage() * 6 / 100; // L: 1773
			var12 += GameEngine.archive5.percentage() * 4 / 100; // L: 1774
			var12 += class217.archive6.percentage() * 2 / 100; // L: 1775
			var12 += BuddyRankComparator.archive7.percentage() * 56 / 100; // L: 1776
			var12 += Messages.archive8.percentage() * 2 / 100; // L: 1777
			var12 += GrandExchangeOfferUnitPriceComparator.archive9.percentage() * 2 / 100; // L: 1778
			var12 += class92.archive10.percentage() * 2 / 100; // L: 1779
			var12 += ItemContainer.archive11.percentage() * 2 / 100; // L: 1780
			var12 += PacketBufferNode.archive12.percentage() * 2 / 100; // L: 1781
			var12 += GrandExchangeOfferUnitPriceComparator.archive13.percentage() * 2 / 100; // L: 1782
			var12 += FontName.archive14.percentage() * 2 / 100; // L: 1783
			var12 += Client.archive15.percentage() * 2 / 100; // L: 1784
			var12 += class195.archive19.percentage() / 100; // L: 1785
			var12 += class41.archive18.percentage() / 100; // L: 1786
			var12 += NetFileRequest.archive20.percentage() / 100; // L: 1787
			var12 += class169.archive17.method4304() && class169.archive17.isFullyLoaded() ? 1 : 0; // L: 1788
			if (var12 != 100) { // L: 1789
				if (var12 != 0) { // L: 1790
					Login.Login_loadingText = "Checking for updates - " + var12 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1791
			} else {
				UserComparator4.method3469(SceneTilePaint.archive0, "Animations"); // L: 1794
				UserComparator4.method3469(WorldMapSprite.archive1, "Skeletons"); // L: 1795
				UserComparator4.method3469(class227.archive4, "Sound FX"); // L: 1796
				UserComparator4.method3469(GameEngine.archive5, "Maps"); // L: 1797
				UserComparator4.method3469(class217.archive6, "Music Tracks"); // L: 1798
				UserComparator4.method3469(BuddyRankComparator.archive7, "Models"); // L: 1799
				UserComparator4.method3469(Messages.archive8, "Sprites"); // L: 1800
				UserComparator4.method3469(ItemContainer.archive11, "Music Jingles"); // L: 1801
				UserComparator4.method3469(FontName.archive14, "Music Samples"); // L: 1802
				UserComparator4.method3469(Client.archive15, "Music Patches"); // L: 1803
				UserComparator4.method3469(class195.archive19, "World Map"); // L: 1804
				UserComparator4.method3469(class41.archive18, "World Map Geography"); // L: 1805
				UserComparator4.method3469(NetFileRequest.archive20, "World Map Ground"); // L: 1806
				WorldMapManager.spriteIds = new GraphicsDefaults(); // L: 1807
				WorldMapManager.spriteIds.decode(class169.archive17); // L: 1808
				Login.Login_loadingText = "Loaded update list"; // L: 1809
				Login.Login_loadingPercent = 30; // L: 1810
				Client.titleLoadingStage = 45; // L: 1811
			}
		} else {
			Archive var2;
			Archive var16;
			Archive var21;
			if (Client.titleLoadingStage == 45) { // L: 1814
				WorldMapIcon_0.method270(22050, !Client.isLowDetail, 2); // L: 1815
				MidiPcmStream var20 = new MidiPcmStream(); // L: 1816
				var20.method3759(9, 128); // L: 1817
				AbstractWorldMapData.pcmPlayer0 = UserComparator6.method3526(GameEngine.taskHandler, 0, 22050); // L: 1818
				AbstractWorldMapData.pcmPlayer0.setStream(var20); // L: 1819
				var21 = Client.archive15; // L: 1820
				var2 = FontName.archive14; // L: 1821
				var16 = class227.archive4; // L: 1822
				class206.musicPatchesArchive = var21; // L: 1824
				class206.musicSamplesArchive = var2; // L: 1825
				class206.soundEffectsArchive = var16; // L: 1826
				class206.midiPcmStream = var20; // L: 1827
				FriendLoginUpdate.pcmPlayer1 = UserComparator6.method3526(GameEngine.taskHandler, 1, 2048); // L: 1829
				WorldMapManager.pcmStreamMixer = new PcmStreamMixer(); // L: 1830
				FriendLoginUpdate.pcmPlayer1.setStream(WorldMapManager.pcmStreamMixer); // L: 1831
				ItemLayer.decimator = new Decimator(22050, PcmPlayer.field1443); // L: 1832
				Login.Login_loadingText = "Prepared sound engine"; // L: 1833
				Login.Login_loadingPercent = 35; // L: 1834
				Client.titleLoadingStage = 50; // L: 1835
				WorldMapLabel.WorldMapElement_fonts = new Fonts(Messages.archive8, GrandExchangeOfferUnitPriceComparator.archive13); // L: 1836
			} else if (Client.titleLoadingStage == 50) { // L: 1839
				var12 = FontName.method5353().length; // L: 1840
				Client.fontsMap = WorldMapLabel.WorldMapElement_fonts.createMap(FontName.method5353()); // L: 1841
				if (Client.fontsMap.size() < var12) { // L: 1842
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var12 + "%"; // L: 1843
					Login.Login_loadingPercent = 40; // L: 1844
				} else {
					class297.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1847
					WorldMapLabelSize.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1848
					GrandExchangeOfferTotalQuantityComparator.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1849
					class58.platformInfo = Client.platformInfoProvider.get(); // L: 1850
					Login.Login_loadingText = "Loaded fonts"; // L: 1851
					Login.Login_loadingPercent = 40; // L: 1852
					Client.titleLoadingStage = 60; // L: 1853
				}
			} else {
				int var3;
				int var15;
				if (Client.titleLoadingStage == 60) { // L: 1856
					var21 = class92.archive10; // L: 1858
					var2 = Messages.archive8; // L: 1859
					var3 = 0; // L: 1861
					if (var21.tryLoadFileByNames("title.jpg", "")) { // L: 1862
						++var3;
					}

					if (var2.tryLoadFileByNames("logo", "")) { // L: 1863
						++var3;
					}

					if (var2.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1864
						++var3;
					}

					if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1865
						++var3;
					}

					if (var2.tryLoadFileByNames("titlebox", "")) { // L: 1866
						++var3;
					}

					if (var2.tryLoadFileByNames("titlebutton", "")) { // L: 1867
						++var3;
					}

					if (var2.tryLoadFileByNames("runes", "")) { // L: 1868
						++var3;
					}

					if (var2.tryLoadFileByNames("title_mute", "")) { // L: 1869
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1870
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1871
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1872
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1873
						++var3;
					}

					var2.tryLoadFileByNames("sl_back", ""); // L: 1874
					var2.tryLoadFileByNames("sl_flags", ""); // L: 1875
					var2.tryLoadFileByNames("sl_arrows", ""); // L: 1876
					var2.tryLoadFileByNames("sl_stars", ""); // L: 1877
					var2.tryLoadFileByNames("sl_button", ""); // L: 1878
					var15 = DynamicObject.method2304(); // L: 1882
					if (var3 < var15) { // L: 1883
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var15 + "%"; // L: 1884
						Login.Login_loadingPercent = 50; // L: 1885
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1888
						Login.Login_loadingPercent = 50; // L: 1889
						WorldMapCacheName.updateGameState(5); // L: 1890
						Client.titleLoadingStage = 70; // L: 1891
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1894
					if (!DynamicObject.archive2.isFullyLoaded()) { // L: 1895
						Login.Login_loadingText = "Loading config - " + DynamicObject.archive2.loadPercent() + "%"; // L: 1896
						Login.Login_loadingPercent = 60; // L: 1897
					} else {
						MouseHandler.method1157(DynamicObject.archive2); // L: 1900
						Archive var19 = DynamicObject.archive2; // L: 1901
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var19; // L: 1903
						var21 = DynamicObject.archive2; // L: 1905
						var2 = BuddyRankComparator.archive7; // L: 1906
						KitDefinition.KitDefinition_archive = var21; // L: 1908
						class227.KitDefinition_modelsArchive = var2; // L: 1909
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1910
						var16 = DynamicObject.archive2; // L: 1912
						Archive var4 = BuddyRankComparator.archive7; // L: 1913
						boolean var17 = Client.isLowDetail; // L: 1914
						ObjectComposition.ObjectDefinition_archive = var16; // L: 1916
						ObjectComposition.ObjectDefinition_modelsArchive = var4; // L: 1917
						ObjectComposition.ObjectDefinition_isLowDetail = var17; // L: 1918
						World.method1849(DynamicObject.archive2, BuddyRankComparator.archive7); // L: 1920
						ParamComposition.method4526(DynamicObject.archive2); // L: 1921
						Actor.method1821(DynamicObject.archive2, BuddyRankComparator.archive7, Client.isMembersWorld, class297.fontPlain11); // L: 1922
						PcmPlayer.method2538(DynamicObject.archive2, SceneTilePaint.archive0, WorldMapSprite.archive1); // L: 1923
						ModelData0.method3331(DynamicObject.archive2, BuddyRankComparator.archive7); // L: 1924
						class200.method3712(DynamicObject.archive2); // L: 1925
						Archive var18 = DynamicObject.archive2; // L: 1926
						class1.VarpDefinition_archive = var18; // L: 1928
						VarpDefinition.VarpDefinition_fileCount = class1.VarpDefinition_archive.getGroupFileCount(16); // L: 1929
						Archive var22 = class330.archive3; // L: 1931
						Archive var8 = BuddyRankComparator.archive7; // L: 1932
						Archive var9 = Messages.archive8; // L: 1933
						Archive var10 = GrandExchangeOfferUnitPriceComparator.archive13; // L: 1934
						class58.Widget_archive = var22; // L: 1936
						GrandExchangeOfferWorldComparator.Widget_modelsArchive = var8; // L: 1937
						class1.Widget_spritesArchive = var9; // L: 1938
						Bounds.Widget_fontsArchive = var10; // L: 1939
						class9.Widget_interfaceComponents = new Widget[class58.Widget_archive.getGroupCount()][]; // L: 1940
						class195.Widget_loadedInterfaces = new boolean[class58.Widget_archive.getGroupCount()]; // L: 1941
						Archive var11 = DynamicObject.archive2; // L: 1943
						InvDefinition.InvDefinition_archive = var11; // L: 1945
						StructComposition.method4545(DynamicObject.archive2); // L: 1947
						ModelData0.method3330(DynamicObject.archive2); // L: 1948
						class13.method129(DynamicObject.archive2); // L: 1949
						Varcs.varcs = new Varcs(); // L: 1950
						method912(DynamicObject.archive2, Messages.archive8, GrandExchangeOfferUnitPriceComparator.archive13); // L: 1951
						ServerPacket.method3669(DynamicObject.archive2, Messages.archive8); // L: 1952
						class219.method4010(DynamicObject.archive2, Messages.archive8); // L: 1953
						Login.Login_loadingText = "Loaded config"; // L: 1954
						Login.Login_loadingPercent = 60; // L: 1955
						Client.titleLoadingStage = 80; // L: 1956
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1959
					var12 = 0; // L: 1960
					if (UrlRequester.compass == null) { // L: 1961
						UrlRequester.compass = Skills.SpriteBuffer_getSprite(Messages.archive8, WorldMapManager.spriteIds.compass, 0);
					} else {
						++var12; // L: 1962
					}

					if (ViewportMouse.redHintArrowSpritePixels == null) { // L: 1963
						ViewportMouse.redHintArrowSpritePixels = Skills.SpriteBuffer_getSprite(Messages.archive8, WorldMapManager.spriteIds.field3845, 0);
					} else {
						++var12; // L: 1964
					}

					IndexedSprite[] var1;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (WorldMapRegion.mapSceneSprites == null) { // L: 1965
						var2 = Messages.archive8; // L: 1967
						var3 = WorldMapManager.spriteIds.mapScenes; // L: 1968
						if (!class304.method5363(var2, var3, 0)) { // L: 1970
							var1 = null; // L: 1971
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 1976

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 1977
								var7 = var5[var6] = new IndexedSprite(); // L: 1978
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 1979
								var7.height = class336.SpriteBuffer_spriteHeight; // L: 1980
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6]; // L: 1981
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6]; // L: 1982
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 1983
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6]; // L: 1984
								var7.palette = class336.SpriteBuffer_spritePalette; // L: 1985
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6]; // L: 1986
							}

							class336.SpriteBuffer_xOffsets = null; // L: 1989
							class336.SpriteBuffer_yOffsets = null; // L: 1990
							class336.SpriteBuffer_spriteWidths = null; // L: 1991
							class336.SpriteBuffer_spriteHeights = null; // L: 1992
							class336.SpriteBuffer_spritePalette = null; // L: 1993
							GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 1994
							var1 = var5; // L: 1998
						}

						WorldMapRegion.mapSceneSprites = var1; // L: 2000
					} else {
						++var12; // L: 2002
					}

					if (Message.headIconPkSpritePixels == null) { // L: 2003
						Message.headIconPkSpritePixels = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.headIconsPk, 0);
					} else {
						++var12; // L: 2004
					}

					if (Client.headIconPrayerSpritePixels == null) { // L: 2005
						Client.headIconPrayerSpritePixels = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3844, 0);
					} else {
						++var12; // L: 2006
					}

					if (AbstractWorldMapIcon.headIconHintSpritePixels == null) { // L: 2007
						AbstractWorldMapIcon.headIconHintSpritePixels = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3843, 0);
					} else {
						++var12; // L: 2008
					}

					if (GrandExchangeOfferUnitPriceComparator.mapMarkerSpritePixels == null) { // L: 2009
						GrandExchangeOfferUnitPriceComparator.mapMarkerSpritePixels = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3846, 0);
					} else {
						++var12; // L: 2010
					}

					if (GrandExchangeOfferAgeComparator.crossSprites == null) { // L: 2011
						GrandExchangeOfferAgeComparator.crossSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3847, 0);
					} else {
						++var12; // L: 2012
					}

					if (Actor.mapDotSprites == null) { // L: 2013
						Actor.mapDotSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3848, 0);
					} else {
						++var12; // L: 2014
					}

					if (InterfaceParent.scrollBarSprites == null) { // L: 2015
						var2 = Messages.archive8; // L: 2017
						var3 = WorldMapManager.spriteIds.field3849; // L: 2018
						if (!class304.method5363(var2, var3, 0)) { // L: 2020
							var1 = null; // L: 2021
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 2026

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 2027
								var7 = var5[var6] = new IndexedSprite(); // L: 2028
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 2029
								var7.height = class336.SpriteBuffer_spriteHeight; // L: 2030
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6]; // L: 2031
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6]; // L: 2032
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 2033
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6]; // L: 2034
								var7.palette = class336.SpriteBuffer_spritePalette; // L: 2035
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6]; // L: 2036
							}

							class336.SpriteBuffer_xOffsets = null; // L: 2039
							class336.SpriteBuffer_yOffsets = null; // L: 2040
							class336.SpriteBuffer_spriteWidths = null; // L: 2041
							class336.SpriteBuffer_spriteHeights = null; // L: 2042
							class336.SpriteBuffer_spritePalette = null; // L: 2043
							GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 2044
							var1 = var5; // L: 2048
						}

						InterfaceParent.scrollBarSprites = var1; // L: 2050
					} else {
						++var12; // L: 2052
					}

					if (class39.modIconSprites == null) { // L: 2053
						var2 = Messages.archive8; // L: 2055
						var3 = WorldMapManager.spriteIds.field3850; // L: 2056
						if (!class304.method5363(var2, var3, 0)) { // L: 2058
							var1 = null; // L: 2059
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 2064

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 2065
								var7 = var5[var6] = new IndexedSprite(); // L: 2066
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 2067
								var7.height = class336.SpriteBuffer_spriteHeight; // L: 2068
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6]; // L: 2069
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6]; // L: 2070
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 2071
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6]; // L: 2072
								var7.palette = class336.SpriteBuffer_spritePalette; // L: 2073
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6]; // L: 2074
							}

							class336.SpriteBuffer_xOffsets = null; // L: 2077
							class336.SpriteBuffer_yOffsets = null; // L: 2078
							class336.SpriteBuffer_spriteWidths = null; // L: 2079
							class336.SpriteBuffer_spriteHeights = null; // L: 2080
							class336.SpriteBuffer_spritePalette = null; // L: 2081
							GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 2082
							var1 = var5; // L: 2086
						}

						class39.modIconSprites = var1; // L: 2088
					} else {
						++var12; // L: 2090
					}

					if (var12 < 11) { // L: 2091
						Login.Login_loadingText = "Loading sprites - " + var12 * 100 / 12 + "%"; // L: 2092
						Login.Login_loadingPercent = 70; // L: 2093
					} else {
						AbstractFont.AbstractFont_modIconSprites = class39.modIconSprites; // L: 2096
						ViewportMouse.redHintArrowSpritePixels.normalize(); // L: 2097
						int var13 = (int)(Math.random() * 21.0D) - 10; // L: 2098
						int var14 = (int)(Math.random() * 21.0D) - 10; // L: 2099
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 2100
						var15 = (int)(Math.random() * 41.0D) - 20; // L: 2101
						WorldMapRegion.mapSceneSprites[0].shiftColors(var13 + var15, var14 + var15, var15 + var3); // L: 2102
						Login.Login_loadingText = "Loaded sprites"; // L: 2103
						Login.Login_loadingPercent = 70; // L: 2104
						Client.titleLoadingStage = 90; // L: 2105
					}
				} else if (Client.titleLoadingStage == 90) { // L: 2108
					if (!GrandExchangeOfferUnitPriceComparator.archive9.isFullyLoaded()) { // L: 2109
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2110
						Login.Login_loadingPercent = 90; // L: 2111
					} else {
						class307.textureProvider = new TextureProvider(GrandExchangeOfferUnitPriceComparator.archive9, Messages.archive8, 20, Timer.clientPreferences.field1057, Client.isLowDetail ? 64 : 128); // L: 2114
						Rasterizer3D.Rasterizer3D_setTextureLoader(class307.textureProvider); // L: 2115
						Rasterizer3D.Rasterizer3D_setBrightness(Timer.clientPreferences.field1057); // L: 2116
						Client.titleLoadingStage = 100; // L: 2117
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2120
					var12 = class307.textureProvider.getLoadedPercentage(); // L: 2121
					if (var12 < 100) { // L: 2122
						Login.Login_loadingText = "Loading textures - " + var12 + "%"; // L: 2123
						Login.Login_loadingPercent = 90; // L: 2124
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2127
						Login.Login_loadingPercent = 90; // L: 2128
						Client.titleLoadingStage = 110; // L: 2129
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2132
					SoundCache.mouseRecorder = new MouseRecorder(); // L: 2133
					GameEngine.taskHandler.newThreadTask(SoundCache.mouseRecorder, 10); // L: 2134
					Login.Login_loadingText = "Loaded input handler"; // L: 2135
					Login.Login_loadingPercent = 92; // L: 2136
					Client.titleLoadingStage = 120; // L: 2137
				} else if (Client.titleLoadingStage == 120) { // L: 2140
					if (!class92.archive10.tryLoadFileByNames("huffman", "")) { // L: 2141
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2142
						Login.Login_loadingPercent = 94; // L: 2143
					} else {
						Huffman var0 = new Huffman(class92.archive10.takeFileByNames("huffman", "")); // L: 2146
						RouteStrategy.method3643(var0); // L: 2147
						Login.Login_loadingText = "Loaded wordpack"; // L: 2148
						Login.Login_loadingPercent = 94; // L: 2149
						Client.titleLoadingStage = 130; // L: 2150
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2153
					if (!class330.archive3.isFullyLoaded()) { // L: 2154
						Login.Login_loadingText = "Loading interfaces - " + class330.archive3.loadPercent() * 4 / 5 + "%"; // L: 2155
						Login.Login_loadingPercent = 96; // L: 2156
					} else if (!PacketBufferNode.archive12.isFullyLoaded()) { // L: 2159
						Login.Login_loadingText = "Loading interfaces - " + (80 + PacketBufferNode.archive12.loadPercent() / 6) + "%"; // L: 2160
						Login.Login_loadingPercent = 96; // L: 2161
					} else if (!GrandExchangeOfferUnitPriceComparator.archive13.isFullyLoaded()) { // L: 2164
						Login.Login_loadingText = "Loading interfaces - " + (96 + GrandExchangeOfferUnitPriceComparator.archive13.loadPercent() / 50) + "%"; // L: 2165
						Login.Login_loadingPercent = 96; // L: 2166
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2169
						Login.Login_loadingPercent = 98; // L: 2170
						Client.titleLoadingStage = 140; // L: 2171
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2174
					Login.Login_loadingPercent = 100; // L: 2175
					if (!class195.archive19.tryLoadGroupByName(WorldMapCacheName.field328.name)) { // L: 2176
						Login.Login_loadingText = "Loading world map - " + class195.archive19.groupLoadPercentByName(WorldMapCacheName.field328.name) / 10 + "%"; // L: 2177
					} else {
						if (WorldMapRectangle.worldMap == null) { // L: 2180
							WorldMapRectangle.worldMap = new WorldMap(); // L: 2181
							WorldMapRectangle.worldMap.init(class195.archive19, class41.archive18, NetFileRequest.archive20, GrandExchangeOfferTotalQuantityComparator.fontBold12, Client.fontsMap, WorldMapRegion.mapSceneSprites); // L: 2182
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2184
						Client.titleLoadingStage = 150; // L: 2185
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2188
					WorldMapCacheName.updateGameState(10); // L: 2189
				}
			}
		}
	} // L: 1733 1739 1765 1792 1812 1837 1845 1854 1886 1892 1898 1957 2094 2106 2112 2118 2125 2130 2138 2144 2151 2157 2162 2167 2172 2178 2186 2190 2192

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	static boolean method911(int var0) {
		for (int var1 = 0; var1 < Client.field870; ++var1) { // L: 10364
			if (Client.field693[var1] == var0) { // L: 10365
				return true;
			}
		}

		return false; // L: 10367
	}
}
