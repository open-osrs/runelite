import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public enum class34 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	field232(0, 0);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1096929681
	)
	public final int field233;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1588992419
	)
	final int field236;

	class34(int var3, int var4) {
		this.field233 = var3; // L: 12
		this.field236 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field236; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2123996277"
	)
	public static int method402(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 24
			var2 = var0; // L: 25
			var0 = var1; // L: 26
			var1 = var2; // L: 27
		}

		while (var1 != 0) { // L: 29
			var2 = var0 % var1; // L: 30
			var0 = var1; // L: 31
			var1 = var2; // L: 32
		}

		return var0; // L: 34
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	public static void method406() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 43
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 44
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 45
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 46
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 47
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 48
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 51
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 52
		}
	} // L: 54

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("load")
	static void load() {
		int var21;
		if (Client.titleLoadingStage == 0) { // L: 1747
			DevicePcmPlayerProvider.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1748

			for (var21 = 0; var21 < 4; ++var21) { // L: 1749
				Client.collisionMaps[var21] = new CollisionMap(104, 104);
			}

			class69.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1750
			Login.Login_loadingText = "Starting game engine..."; // L: 1751
			Login.Login_loadingPercent = 5; // L: 1752
			Client.titleLoadingStage = 20; // L: 1753
		} else if (Client.titleLoadingStage == 20) { // L: 1756
			Login.Login_loadingText = "Prepared visibility map"; // L: 1757
			Login.Login_loadingPercent = 10; // L: 1758
			Client.titleLoadingStage = 30; // L: 1759
		} else if (Client.titleLoadingStage == 30) { // L: 1762
			ClanChannel.archive0 = UrlRequest.newArchive(0, false, true, true); // L: 1763
			KitDefinition.archive1 = UrlRequest.newArchive(1, false, true, true); // L: 1764
			SecureRandomFuture.archive2 = UrlRequest.newArchive(2, true, false, true); // L: 1765
			class18.archive3 = UrlRequest.newArchive(3, false, true, true); // L: 1766
			class26.archive4 = UrlRequest.newArchive(4, false, true, true); // L: 1767
			class4.archive5 = UrlRequest.newArchive(5, true, true, true); // L: 1768
			DynamicObject.archive6 = UrlRequest.newArchive(6, true, true, true); // L: 1769
			PcmPlayer.archive7 = UrlRequest.newArchive(7, false, true, true); // L: 1770
			ModeWhere.archive8 = UrlRequest.newArchive(8, false, true, true); // L: 1771
			class16.archive9 = UrlRequest.newArchive(9, false, true, true); // L: 1772
			JagexCache.archive10 = UrlRequest.newArchive(10, false, true, true); // L: 1773
			class160.archive11 = UrlRequest.newArchive(11, false, true, true); // L: 1774
			Varcs.archive12 = UrlRequest.newArchive(12, false, true, true); // L: 1775
			GrandExchangeOfferOwnWorldComparator.archive13 = UrlRequest.newArchive(13, true, false, true); // L: 1776
			PacketWriter.archive14 = UrlRequest.newArchive(14, false, true, true); // L: 1777
			class306.archive15 = UrlRequest.newArchive(15, false, true, true); // L: 1778
			class10.archive17 = UrlRequest.newArchive(17, true, true, true); // L: 1779
			class6.archive18 = UrlRequest.newArchive(18, false, true, true); // L: 1780
			WorldMapEvent.archive19 = UrlRequest.newArchive(19, false, true, true); // L: 1781
			WorldMapLabel.archive20 = UrlRequest.newArchive(20, false, true, true); // L: 1782
			Login.Login_loadingText = "Connecting to update server"; // L: 1783
			Login.Login_loadingPercent = 20; // L: 1784
			Client.titleLoadingStage = 40; // L: 1785
		} else if (Client.titleLoadingStage == 40) { // L: 1788
			byte var43 = 0; // L: 1789
			var21 = var43 + ClanChannel.archive0.percentage() * 4 / 100; // L: 1790
			var21 += KitDefinition.archive1.percentage() * 4 / 100; // L: 1791
			var21 += SecureRandomFuture.archive2.percentage() * 2 / 100; // L: 1792
			var21 += class18.archive3.percentage() * 2 / 100; // L: 1793
			var21 += class26.archive4.percentage() * 6 / 100; // L: 1794
			var21 += class4.archive5.percentage() * 4 / 100; // L: 1795
			var21 += DynamicObject.archive6.percentage() * 2 / 100; // L: 1796
			var21 += PcmPlayer.archive7.percentage() * 56 / 100; // L: 1797
			var21 += ModeWhere.archive8.percentage() * 2 / 100; // L: 1798
			var21 += class16.archive9.percentage() * 2 / 100; // L: 1799
			var21 += JagexCache.archive10.percentage() * 2 / 100; // L: 1800
			var21 += class160.archive11.percentage() * 2 / 100; // L: 1801
			var21 += Varcs.archive12.percentage() * 2 / 100; // L: 1802
			var21 += GrandExchangeOfferOwnWorldComparator.archive13.percentage() * 2 / 100; // L: 1803
			var21 += PacketWriter.archive14.percentage() * 2 / 100; // L: 1804
			var21 += class306.archive15.percentage() * 2 / 100; // L: 1805
			var21 += WorldMapEvent.archive19.percentage() / 100; // L: 1806
			var21 += class6.archive18.percentage() / 100; // L: 1807
			var21 += WorldMapLabel.archive20.percentage() / 100; // L: 1808
			var21 += class10.archive17.method5044() && class10.archive17.isFullyLoaded() ? 1 : 0; // L: 1809
			if (var21 != 100) { // L: 1810
				if (var21 != 0) { // L: 1811
					Login.Login_loadingText = "Checking for updates - " + var21 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1812
			} else {
				class244.method4814(ClanChannel.archive0, "Animations"); // L: 1815
				class244.method4814(KitDefinition.archive1, "Skeletons"); // L: 1816
				class244.method4814(class26.archive4, "Sound FX"); // L: 1817
				class244.method4814(class4.archive5, "Maps"); // L: 1818
				class244.method4814(DynamicObject.archive6, "Music Tracks"); // L: 1819
				class244.method4814(PcmPlayer.archive7, "Models"); // L: 1820
				class244.method4814(ModeWhere.archive8, "Sprites"); // L: 1821
				class244.method4814(class160.archive11, "Music Jingles"); // L: 1822
				class244.method4814(PacketWriter.archive14, "Music Samples"); // L: 1823
				class244.method4814(class306.archive15, "Music Patches"); // L: 1824
				class244.method4814(WorldMapEvent.archive19, "World Map"); // L: 1825
				class244.method4814(class6.archive18, "World Map Geography"); // L: 1826
				class244.method4814(WorldMapLabel.archive20, "World Map Ground"); // L: 1827
				ClanChannel.spriteIds = new GraphicsDefaults(); // L: 1828
				ClanChannel.spriteIds.decode(class10.archive17); // L: 1829
				Login.Login_loadingText = "Loaded update list"; // L: 1830
				Login.Login_loadingPercent = 30; // L: 1831
				Client.titleLoadingStage = 45; // L: 1832
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1835
			boolean var42 = !Client.isLowDetail; // L: 1836
			class341.field3921 = 22050; // L: 1839
			PcmPlayer.PcmPlayer_stereo = var42; // L: 1840
			UserComparator1.field4220 = 2; // L: 1841
			MidiPcmStream var39 = new MidiPcmStream(); // L: 1843
			var39.method4563(9, 128); // L: 1844
			SoundCache.pcmPlayer0 = class93.method2187(GameEngine.taskHandler, 0, 22050); // L: 1845
			SoundCache.pcmPlayer0.setStream(var39); // L: 1846
			ItemLayer.method3860(class306.archive15, PacketWriter.archive14, class26.archive4, var39); // L: 1847
			UrlRequester.pcmPlayer1 = class93.method2187(GameEngine.taskHandler, 1, 2048); // L: 1848
			UserComparator7.pcmStreamMixer = new PcmStreamMixer(); // L: 1849
			UrlRequester.pcmPlayer1.setStream(UserComparator7.pcmStreamMixer); // L: 1850
			WorldMapAreaData.decimator = new Decimator(22050, class341.field3921); // L: 1851
			Login.Login_loadingText = "Prepared sound engine"; // L: 1852
			Login.Login_loadingPercent = 35; // L: 1853
			Client.titleLoadingStage = 50; // L: 1854
			class314.WorldMapElement_fonts = new Fonts(ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13); // L: 1855
		} else if (Client.titleLoadingStage == 50) { // L: 1858
			var21 = FontName.method6334().length; // L: 1859
			Fonts var38 = class314.WorldMapElement_fonts; // L: 1860
			FontName[] var32 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12}; // L: 1863
			Client.fontsMap = var38.createMap(var32); // L: 1865
			if (Client.fontsMap.size() < var21) { // L: 1866
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var21 + "%"; // L: 1867
				Login.Login_loadingPercent = 40; // L: 1868
			} else {
				UserComparator10.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1871
				AbstractSocket.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1872
				class309.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1873
				ClanSettings.platformInfo = Client.platformInfoProvider.get(); // L: 1874
				Login.Login_loadingText = "Loaded fonts"; // L: 1875
				Login.Login_loadingPercent = 40; // L: 1876
				Client.titleLoadingStage = 60; // L: 1877
			}
		} else {
			Archive var2;
			int var3;
			Archive var35;
			if (Client.titleLoadingStage == 60) { // L: 1880
				var35 = JagexCache.archive10; // L: 1882
				var2 = ModeWhere.archive8; // L: 1883
				var3 = 0; // L: 1885
				if (var35.tryLoadFileByNames("title.jpg", "")) { // L: 1886
					++var3;
				}

				if (var2.tryLoadFileByNames("logo", "")) { // L: 1887
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1888
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1889
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebox", "")) { // L: 1890
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebutton", "")) { // L: 1891
					++var3;
				}

				if (var2.tryLoadFileByNames("runes", "")) { // L: 1892
					++var3;
				}

				if (var2.tryLoadFileByNames("title_mute", "")) { // L: 1893
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1894
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1895
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1896
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1897
					++var3;
				}

				var2.tryLoadFileByNames("sl_back", ""); // L: 1898
				var2.tryLoadFileByNames("sl_flags", ""); // L: 1899
				var2.tryLoadFileByNames("sl_arrows", ""); // L: 1900
				var2.tryLoadFileByNames("sl_stars", ""); // L: 1901
				var2.tryLoadFileByNames("sl_button", ""); // L: 1902
				byte var41 = 12; // L: 1908
				if (var3 < var41) { // L: 1911
					Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var41 + "%"; // L: 1912
					Login.Login_loadingPercent = 50; // L: 1913
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 1916
					Login.Login_loadingPercent = 50; // L: 1917
					Projectile.updateGameState(5); // L: 1918
					Client.titleLoadingStage = 70; // L: 1919
				}
			} else if (Client.titleLoadingStage == 70) { // L: 1922
				if (!SecureRandomFuture.archive2.isFullyLoaded()) { // L: 1923
					Login.Login_loadingText = "Loading config - " + SecureRandomFuture.archive2.loadPercent() + "%"; // L: 1924
					Login.Login_loadingPercent = 60; // L: 1925
				} else {
					FaceNormal.method4252(SecureRandomFuture.archive2); // L: 1928
					Archive var29 = SecureRandomFuture.archive2; // L: 1929
					FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var29; // L: 1931
					var35 = SecureRandomFuture.archive2; // L: 1933
					var2 = PcmPlayer.archive7; // L: 1934
					class125.KitDefinition_archive = var35; // L: 1936
					KitDefinition.KitDefinition_modelsArchive = var2; // L: 1937
					TileItem.KitDefinition_fileCount = class125.KitDefinition_archive.getGroupFileCount(3); // L: 1938
					Actor.method2262(SecureRandomFuture.archive2, PcmPlayer.archive7, Client.isLowDetail); // L: 1940
					Archive var25 = SecureRandomFuture.archive2; // L: 1941
					Archive var4 = PcmPlayer.archive7; // L: 1942
					NPCComposition.NpcDefinition_archive = var25; // L: 1944
					NPCComposition.NpcDefinition_modelArchive = var4; // L: 1945
					Archive var34 = SecureRandomFuture.archive2; // L: 1947
					StructComposition.StructDefinition_archive = var34; // L: 1949
					Archive var26 = SecureRandomFuture.archive2; // L: 1951
					Archive var36 = PcmPlayer.archive7; // L: 1952
					boolean var37 = Client.isMembersWorld; // L: 1953
					Font var40 = UserComparator10.fontPlain11; // L: 1954
					ItemComposition.ItemDefinition_archive = var26; // L: 1956
					SoundCache.ItemDefinition_modelArchive = var36; // L: 1957
					ItemComposition.ItemDefinition_inMembersWorld = var37; // L: 1958
					ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10); // L: 1959
					ItemComposition.ItemDefinition_fontPlain11 = var40; // L: 1960
					Archive var27 = SecureRandomFuture.archive2; // L: 1962
					Archive var11 = ClanChannel.archive0; // L: 1963
					Archive var12 = KitDefinition.archive1; // L: 1964
					SequenceDefinition.SequenceDefinition_archive = var27; // L: 1966
					SequenceDefinition.SequenceDefinition_animationsArchive = var11; // L: 1967
					SequenceDefinition.SequenceDefinition_skeletonsArchive = var12; // L: 1968
					ObjectComposition.method3069(SecureRandomFuture.archive2, PcmPlayer.archive7); // L: 1970
					Archive var13 = SecureRandomFuture.archive2; // L: 1971
					VarbitComposition.VarbitDefinition_archive = var13; // L: 1973
					class125.method2587(SecureRandomFuture.archive2); // L: 1975
					NPCComposition.method2868(class18.archive3, PcmPlayer.archive7, ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13); // L: 1976
					Archive var14 = SecureRandomFuture.archive2; // L: 1977
					InvDefinition.InvDefinition_archive = var14; // L: 1979
					class10.method109(SecureRandomFuture.archive2); // L: 1981
					Archive var15 = SecureRandomFuture.archive2; // L: 1982
					VarcInt.VarcInt_archive = var15; // L: 1984
					Archive var16 = SecureRandomFuture.archive2; // L: 1986
					ParamComposition.ParamDefinition_archive = var16; // L: 1988
					class27.field215 = new class370(class182.field2114, 54, AbstractArchive.clientLanguage, SecureRandomFuture.archive2); // L: 1990
					class26.HitSplatDefinition_cachedSprites = new class370(class182.field2114, 47, AbstractArchive.clientLanguage, SecureRandomFuture.archive2); // L: 1991
					class20.varcs = new Varcs(); // L: 1992
					LoginScreenAnimation.method2312(SecureRandomFuture.archive2, ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13); // L: 1993
					ClanSettings.method203(SecureRandomFuture.archive2, ModeWhere.archive8); // L: 1994
					Archive var17 = SecureRandomFuture.archive2; // L: 1995
					Archive var18 = ModeWhere.archive8; // L: 1996
					class244.WorldMapElement_archive = var18; // L: 1998
					if (var17.isFullyLoaded()) { // L: 1999
						WorldMapElement.WorldMapElement_count = var17.getGroupFileCount(35); // L: 2002
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 2003

						for (int var19 = 0; var19 < WorldMapElement.WorldMapElement_count; ++var19) { // L: 2004
							byte[] var20 = var17.takeFile(35, var19); // L: 2005
							WorldMapElement.WorldMapElement_cached[var19] = new WorldMapElement(var19); // L: 2006
							if (var20 != null) { // L: 2007
								WorldMapElement.WorldMapElement_cached[var19].decode(new Buffer(var20)); // L: 2008
								WorldMapElement.WorldMapElement_cached[var19].method2724(); // L: 2009
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 2013
					Login.Login_loadingPercent = 60; // L: 2014
					Client.titleLoadingStage = 80; // L: 2015
				}
			} else if (Client.titleLoadingStage == 80) { // L: 2018
				var21 = 0; // L: 2019
				if (Friend.compass == null) { // L: 2020
					Friend.compass = Tile.SpriteBuffer_getSprite(ModeWhere.archive8, ClanChannel.spriteIds.compass, 0);
				} else {
					++var21; // L: 2021
				}

				if (class22.redHintArrowSprite == null) { // L: 2022
					class22.redHintArrowSprite = Tile.SpriteBuffer_getSprite(ModeWhere.archive8, ClanChannel.spriteIds.field3892, 0);
				} else {
					++var21; // L: 2023
				}

				IndexedSprite[] var1;
				IndexedSprite[] var5;
				int var6;
				IndexedSprite var7;
				if (FloorDecoration.mapSceneSprites == null) { // L: 2024
					var2 = ModeWhere.archive8; // L: 2026
					var3 = ClanChannel.spriteIds.mapScenes; // L: 2027
					if (!Message.method1263(var2, var3, 0)) { // L: 2029
						var1 = null; // L: 2030
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount]; // L: 2035

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) { // L: 2036
							var7 = var5[var6] = new IndexedSprite(); // L: 2037
							var7.width = class397.SpriteBuffer_spriteWidth; // L: 2038
							var7.height = class244.SpriteBuffer_spriteHeight; // L: 2039
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2040
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2041
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2042
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2043
							var7.palette = class397.SpriteBuffer_spritePalette; // L: 2044
							var7.pixels = class126.SpriteBuffer_pixels[var6]; // L: 2045
						}

						ArchiveDisk.method5993(); // L: 2047
						var1 = var5; // L: 2050
					}

					FloorDecoration.mapSceneSprites = var1; // L: 2052
				} else {
					++var21; // L: 2054
				}

				int var8;
				byte[] var9;
				int var10;
				SpritePixels[] var30;
				SpritePixels[] var31;
				SpritePixels var33;
				if (ScriptFrame.headIconPkSprites == null) { // L: 2055
					var2 = ModeWhere.archive8; // L: 2057
					var3 = ClanChannel.spriteIds.headIconsPk; // L: 2058
					if (!Message.method1263(var2, var3, 0)) { // L: 2060
						var30 = null; // L: 2061
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2066
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2080
								var30 = var31; // L: 2083
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2068
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2069
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2070
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2071
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2072
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2073
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2074
							var8 = var33.subHeight * var33.subWidth; // L: 2075
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2076
							var33.pixels = new int[var8]; // L: 2077

							for (var10 = 0; var10 < var8; ++var10) { // L: 2078
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2067
						}
					}

					ScriptFrame.headIconPkSprites = var30; // L: 2085
				} else {
					++var21; // L: 2087
				}

				if (class20.headIconPrayerSprites == null) { // L: 2088
					var2 = ModeWhere.archive8; // L: 2090
					var3 = ClanChannel.spriteIds.field3903; // L: 2091
					if (!Message.method1263(var2, var3, 0)) { // L: 2093
						var30 = null; // L: 2094
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2099
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2113
								var30 = var31; // L: 2116
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2101
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2102
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2103
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2104
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2105
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2106
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2107
							var8 = var33.subWidth * var33.subHeight; // L: 2108
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2109
							var33.pixels = new int[var8]; // L: 2110

							for (var10 = 0; var10 < var8; ++var10) { // L: 2111
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2100
						}
					}

					class20.headIconPrayerSprites = var30; // L: 2118
				} else {
					++var21; // L: 2120
				}

				if (Skills.headIconHintSprites == null) { // L: 2121
					var2 = ModeWhere.archive8; // L: 2123
					var3 = ClanChannel.spriteIds.field3902; // L: 2124
					if (!Message.method1263(var2, var3, 0)) { // L: 2126
						var30 = null; // L: 2127
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2132
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2146
								var30 = var31; // L: 2149
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2134
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2135
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2136
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2137
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2138
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2139
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2140
							var8 = var33.subHeight * var33.subWidth; // L: 2141
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2142
							var33.pixels = new int[var8]; // L: 2143

							for (var10 = 0; var10 < var8; ++var10) { // L: 2144
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2133
						}
					}

					Skills.headIconHintSprites = var30; // L: 2151
				} else {
					++var21; // L: 2153
				}

				if (BuddyRankComparator.mapMarkerSprites == null) { // L: 2154
					var2 = ModeWhere.archive8; // L: 2156
					var3 = ClanChannel.spriteIds.field3897; // L: 2157
					if (!Message.method1263(var2, var3, 0)) { // L: 2159
						var30 = null; // L: 2160
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2165
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2179
								var30 = var31; // L: 2182
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2167
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2168
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2169
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2170
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2171
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2172
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2173
							var8 = var33.subWidth * var33.subHeight; // L: 2174
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2175
							var33.pixels = new int[var8]; // L: 2176

							for (var10 = 0; var10 < var8; ++var10) { // L: 2177
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2166
						}
					}

					BuddyRankComparator.mapMarkerSprites = var30; // L: 2184
				} else {
					++var21; // L: 2186
				}

				if (NPCComposition.crossSprites == null) { // L: 2187
					var2 = ModeWhere.archive8; // L: 2189
					var3 = ClanChannel.spriteIds.field3899; // L: 2190
					if (!Message.method1263(var2, var3, 0)) { // L: 2192
						var30 = null; // L: 2193
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2198
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2212
								var30 = var31; // L: 2215
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2200
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2201
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2202
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2203
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2204
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2205
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2206
							var8 = var33.subWidth * var33.subHeight; // L: 2207
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2208
							var33.pixels = new int[var8]; // L: 2209

							for (var10 = 0; var10 < var8; ++var10) { // L: 2210
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2199
						}
					}

					NPCComposition.crossSprites = var30; // L: 2217
				} else {
					++var21; // L: 2219
				}

				if (class171.mapDotSprites == null) { // L: 2220
					var2 = ModeWhere.archive8; // L: 2222
					var3 = ClanChannel.spriteIds.field3900; // L: 2223
					if (!Message.method1263(var2, var3, 0)) { // L: 2225
						var30 = null; // L: 2226
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount]; // L: 2231
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993(); // L: 2245
								var30 = var31; // L: 2248
								break;
							}

							var33 = var31[var6] = new SpritePixels(); // L: 2233
							var33.width = class397.SpriteBuffer_spriteWidth; // L: 2234
							var33.height = class244.SpriteBuffer_spriteHeight; // L: 2235
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2236
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2237
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2238
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2239
							var8 = var33.subHeight * var33.subWidth; // L: 2240
							var9 = class126.SpriteBuffer_pixels[var6]; // L: 2241
							var33.pixels = new int[var8]; // L: 2242

							for (var10 = 0; var10 < var8; ++var10) { // L: 2243
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6; // L: 2232
						}
					}

					class171.mapDotSprites = var30; // L: 2250
				} else {
					++var21; // L: 2252
				}

				if (Client.scrollBarSprites == null) { // L: 2253
					var2 = ModeWhere.archive8; // L: 2255
					var3 = ClanChannel.spriteIds.field3901; // L: 2256
					if (!Message.method1263(var2, var3, 0)) { // L: 2258
						var1 = null; // L: 2259
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount]; // L: 2264

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) { // L: 2265
							var7 = var5[var6] = new IndexedSprite(); // L: 2266
							var7.width = class397.SpriteBuffer_spriteWidth; // L: 2267
							var7.height = class244.SpriteBuffer_spriteHeight; // L: 2268
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2269
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2270
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2271
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2272
							var7.palette = class397.SpriteBuffer_spritePalette; // L: 2273
							var7.pixels = class126.SpriteBuffer_pixels[var6]; // L: 2274
						}

						ArchiveDisk.method5993(); // L: 2276
						var1 = var5; // L: 2279
					}

					Client.scrollBarSprites = var1; // L: 2281
				} else {
					++var21; // L: 2283
				}

				if (class35.modIconSprites == null) { // L: 2284
					var2 = ModeWhere.archive8; // L: 2286
					var3 = ClanChannel.spriteIds.field3896; // L: 2287
					if (!Message.method1263(var2, var3, 0)) { // L: 2289
						var1 = null; // L: 2290
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount]; // L: 2295

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) { // L: 2296
							var7 = var5[var6] = new IndexedSprite(); // L: 2297
							var7.width = class397.SpriteBuffer_spriteWidth; // L: 2298
							var7.height = class244.SpriteBuffer_spriteHeight; // L: 2299
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6]; // L: 2300
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6]; // L: 2301
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6]; // L: 2302
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6]; // L: 2303
							var7.palette = class397.SpriteBuffer_spritePalette; // L: 2304
							var7.pixels = class126.SpriteBuffer_pixels[var6]; // L: 2305
						}

						ArchiveDisk.method5993(); // L: 2307
						var1 = var5; // L: 2310
					}

					class35.modIconSprites = var1; // L: 2312
				} else {
					++var21; // L: 2314
				}

				if (var21 < 11) { // L: 2315
					Login.Login_loadingText = "Loading sprites - " + var21 * 100 / 12 + "%"; // L: 2316
					Login.Login_loadingPercent = 70; // L: 2317
				} else {
					AbstractFont.AbstractFont_modIconSprites = class35.modIconSprites; // L: 2320
					class22.redHintArrowSprite.normalize(); // L: 2321
					int var22 = (int)(Math.random() * 21.0D) - 10; // L: 2322
					int var23 = (int)(Math.random() * 21.0D) - 10; // L: 2323
					var3 = (int)(Math.random() * 21.0D) - 10; // L: 2324
					int var24 = (int)(Math.random() * 41.0D) - 20; // L: 2325
					FloorDecoration.mapSceneSprites[0].shiftColors(var22 + var24, var23 + var24, var3 + var24); // L: 2326
					Login.Login_loadingText = "Loaded sprites"; // L: 2327
					Login.Login_loadingPercent = 70; // L: 2328
					Client.titleLoadingStage = 90; // L: 2329
				}
			} else if (Client.titleLoadingStage == 90) { // L: 2332
				if (!class16.archive9.isFullyLoaded()) { // L: 2333
					Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2334
					Login.Login_loadingPercent = 90; // L: 2335
				} else {
					Renderable.textureProvider = new TextureProvider(class16.archive9, ModeWhere.archive8, 20, class4.clientPreferences.field1312, Client.isLowDetail ? 64 : 128); // L: 2338
					Rasterizer3D.Rasterizer3D_setTextureLoader(Renderable.textureProvider); // L: 2339
					Rasterizer3D.Rasterizer3D_setBrightness(class4.clientPreferences.field1312); // L: 2340
					Client.titleLoadingStage = 100; // L: 2341
				}
			} else if (Client.titleLoadingStage == 100) { // L: 2344
				var21 = Renderable.textureProvider.getLoadedPercentage(); // L: 2345
				if (var21 < 100) { // L: 2346
					Login.Login_loadingText = "Loading textures - " + var21 + "%"; // L: 2347
					Login.Login_loadingPercent = 90; // L: 2348
				} else {
					Login.Login_loadingText = "Loaded textures"; // L: 2351
					Login.Login_loadingPercent = 90; // L: 2352
					Client.titleLoadingStage = 110; // L: 2353
				}
			} else if (Client.titleLoadingStage == 110) { // L: 2356
				UrlRequester.mouseRecorder = new MouseRecorder(); // L: 2357
				GameEngine.taskHandler.newThreadTask(UrlRequester.mouseRecorder, 10); // L: 2358
				Login.Login_loadingText = "Loaded input handler"; // L: 2359
				Login.Login_loadingPercent = 92; // L: 2360
				Client.titleLoadingStage = 120; // L: 2361
			} else if (Client.titleLoadingStage == 120) { // L: 2364
				if (!JagexCache.archive10.tryLoadFileByNames("huffman", "")) { // L: 2365
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2366
					Login.Login_loadingPercent = 94; // L: 2367
				} else {
					Huffman var0 = new Huffman(JagexCache.archive10.takeFileByNames("huffman", "")); // L: 2370
					WorldMapCacheName.method3789(var0); // L: 2371
					Login.Login_loadingText = "Loaded wordpack"; // L: 2372
					Login.Login_loadingPercent = 94; // L: 2373
					Client.titleLoadingStage = 130; // L: 2374
				}
			} else if (Client.titleLoadingStage == 130) { // L: 2377
				if (!class18.archive3.isFullyLoaded()) { // L: 2378
					Login.Login_loadingText = "Loading interfaces - " + class18.archive3.loadPercent() * 4 / 5 + "%"; // L: 2379
					Login.Login_loadingPercent = 96; // L: 2380
				} else if (!Varcs.archive12.isFullyLoaded()) { // L: 2383
					Login.Login_loadingText = "Loading interfaces - " + (80 + Varcs.archive12.loadPercent() / 6) + "%"; // L: 2384
					Login.Login_loadingPercent = 96; // L: 2385
				} else if (!GrandExchangeOfferOwnWorldComparator.archive13.isFullyLoaded()) { // L: 2388
					Login.Login_loadingText = "Loading interfaces - " + (96 + GrandExchangeOfferOwnWorldComparator.archive13.loadPercent() / 50) + "%"; // L: 2389
					Login.Login_loadingPercent = 96; // L: 2390
				} else {
					Login.Login_loadingText = "Loaded interfaces"; // L: 2393
					Login.Login_loadingPercent = 98; // L: 2394
					Client.titleLoadingStage = 140; // L: 2395
				}
			} else if (Client.titleLoadingStage == 140) { // L: 2398
				Login.Login_loadingPercent = 100; // L: 2399
				if (!WorldMapEvent.archive19.tryLoadGroupByName(WorldMapCacheName.field2131.name)) { // L: 2400
					Login.Login_loadingText = "Loading world map - " + WorldMapEvent.archive19.groupLoadPercentByName(WorldMapCacheName.field2131.name) / 10 + "%"; // L: 2401
				} else {
					if (class80.worldMap == null) { // L: 2404
						class80.worldMap = new WorldMap(); // L: 2405
						class80.worldMap.init(WorldMapEvent.archive19, class6.archive18, WorldMapLabel.archive20, class309.fontBold12, Client.fontsMap, FloorDecoration.mapSceneSprites); // L: 2406
					}

					Login.Login_loadingText = "Loaded world map"; // L: 2408
					Client.titleLoadingStage = 150; // L: 2409
				}
			} else if (Client.titleLoadingStage == 150) { // L: 2412
				Projectile.updateGameState(10); // L: 2413
			}
		}
	} // L: 1754 1760 1786 1813 1833 1856 1869 1878 1914 1920 1926 2016 2318 2330 2336 2342 2349 2354 2362 2368 2375 2381 2386 2391 2396 2402 2410 2414 2416

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "125685661"
	)
	static void method407() {
		Client.menuOptionsCount = 0; // L: 7730
		Client.isMenuOpen = false; // L: 7731
	} // L: 7732
}
