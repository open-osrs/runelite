import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class336 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -691755619
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1823110703
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2023472681
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("m")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("q")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("k")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "374882055"
	)
	@Export("load")
	static void load() {
		int var26;
		if (Client.titleLoadingStage == 0) { // L: 1922
			ModeWhere.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1923

			for (var26 = 0; var26 < 4; ++var26) { // L: 1924
				Client.collisionMaps[var26] = new CollisionMap(104, 104);
			}

			InterfaceParent.sceneMinimapSprite = new Sprite(512, 512); // L: 1925
			Login.Login_loadingText = "Starting game engine..."; // L: 1926
			Login.Login_loadingPercent = 5; // L: 1927
			Client.titleLoadingStage = 20; // L: 1928
		} else if (Client.titleLoadingStage == 20) { // L: 1931
			Login.Login_loadingText = "Prepared visibility map"; // L: 1932
			Login.Login_loadingPercent = 10; // L: 1933
			Client.titleLoadingStage = 30; // L: 1934
		} else if (Client.titleLoadingStage == 30) { // L: 1937
			MenuAction.archive0 = ReflectionCheck.newArchive(0, false, true, true); // L: 1938
			WorldMapManager.archive1 = ReflectionCheck.newArchive(1, false, true, true); // L: 1939
			WorldMapSection3.archive2 = ReflectionCheck.newArchive(2, true, false, true); // L: 1940
			FaceNormal.archive3 = ReflectionCheck.newArchive(3, false, true, true); // L: 1941
			Username.archive4 = ReflectionCheck.newArchive(4, false, true, true); // L: 1942
			Varcs.archive5 = ReflectionCheck.newArchive(5, true, true, true); // L: 1943
			ApproximateRouteStrategy.archive6 = ReflectionCheck.newArchive(6, true, true, true); // L: 1944
			class236.archive7 = ReflectionCheck.newArchive(7, false, true, true); // L: 1945
			GrandExchangeOffer.archive8 = ReflectionCheck.newArchive(8, false, true, true); // L: 1946
			WorldMapData_1.archive9 = ReflectionCheck.newArchive(9, false, true, true); // L: 1947
			class281.archive10 = ReflectionCheck.newArchive(10, false, true, true); // L: 1948
			AbstractByteArrayCopier.archive11 = ReflectionCheck.newArchive(11, false, true, true); // L: 1949
			ViewportMouse.archive12 = ReflectionCheck.newArchive(12, false, true, true); // L: 1950
			class8.archive13 = ReflectionCheck.newArchive(13, true, false, true); // L: 1951
			AbstractByteArrayCopier.archive14 = ReflectionCheck.newArchive(14, false, true, true); // L: 1952
			class1.archive15 = ReflectionCheck.newArchive(15, false, true, true); // L: 1953
			class23.archive17 = ReflectionCheck.newArchive(17, true, true, true); // L: 1954
			ModelData0.archive18 = ReflectionCheck.newArchive(18, false, true, true); // L: 1955
			class60.archive19 = ReflectionCheck.newArchive(19, false, true, true); // L: 1956
			Tiles.archive20 = ReflectionCheck.newArchive(20, false, true, true); // L: 1957
			Login.Login_loadingText = "Connecting to update server"; // L: 1958
			Login.Login_loadingPercent = 20; // L: 1959
			Client.titleLoadingStage = 40; // L: 1960
		} else if (Client.titleLoadingStage != 40) { // L: 1963
			if (Client.titleLoadingStage == 45) { // L: 2010
				boolean var28 = !Client.isLowDetail; // L: 2011
				PcmPlayer.field1442 = 22050; // L: 2014
				PcmPlayer.PcmPlayer_stereo = var28; // L: 2015
				FontName.field3694 = 2; // L: 2016
				MidiPcmStream var27 = new MidiPcmStream(); // L: 2018
				var27.method3863(9, 128); // L: 2019
				class195.pcmPlayer0 = class13.method146(GameShell.taskHandler, 0, 22050); // L: 2020
				class195.pcmPlayer0.setStream(var27); // L: 2021
				TileItemPile.method2909(class1.archive15, AbstractByteArrayCopier.archive14, Username.archive4, var27); // L: 2022
				class23.pcmPlayer1 = class13.method146(GameShell.taskHandler, 1, 2048); // L: 2023
				GrandExchangeEvents.pcmStreamMixer = new PcmStreamMixer(); // L: 2024
				class23.pcmPlayer1.setStream(GrandExchangeEvents.pcmStreamMixer); // L: 2025
				NetSocket.decimator = new Decimator(22050, PcmPlayer.field1442); // L: 2026
				Login.Login_loadingText = "Prepared sound engine"; // L: 2027
				Login.Login_loadingPercent = 35; // L: 2028
				Client.titleLoadingStage = 50; // L: 2029
				WorldMapAreaData.WorldMapElement_fonts = new Fonts(GrandExchangeOffer.archive8, class8.archive13); // L: 2030
			} else if (Client.titleLoadingStage == 50) { // L: 2033
				var26 = FontName.method5456().length; // L: 2034
				Client.fontsMap = WorldMapAreaData.WorldMapElement_fonts.createMap(FontName.method5456()); // L: 2035
				if (Client.fontsMap.size() < var26) { // L: 2036
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%"; // L: 2037
					Login.Login_loadingPercent = 40; // L: 2038
				} else {
					DevicePcmPlayerProvider.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 2041
					WorldMapCacheName.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 2042
					ReflectionCheck.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 2043
					Skills.platformInfo = Client.platformInfoProvider.get(); // L: 2044
					Login.Login_loadingText = "Loaded fonts"; // L: 2045
					Login.Login_loadingPercent = 40; // L: 2046
					Client.titleLoadingStage = 60; // L: 2047
				}
			} else {
				int var3;
				int var4;
				Archive var21;
				Archive var22;
				if (Client.titleLoadingStage == 60) { // L: 2050
					var21 = class281.archive10; // L: 2052
					var22 = GrandExchangeOffer.archive8; // L: 2053
					var3 = 0; // L: 2055
					if (var21.tryLoadFileByNames("title.jpg", "")) { // L: 2056
						++var3;
					}

					if (var22.tryLoadFileByNames("logo", "")) { // L: 2057
						++var3;
					}

					if (var22.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 2058
						++var3;
					}

					if (var22.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 2059
						++var3;
					}

					if (var22.tryLoadFileByNames("titlebox", "")) { // L: 2060
						++var3;
					}

					if (var22.tryLoadFileByNames("titlebutton", "")) { // L: 2061
						++var3;
					}

					if (var22.tryLoadFileByNames("runes", "")) { // L: 2062
						++var3;
					}

					if (var22.tryLoadFileByNames("title_mute", "")) { // L: 2063
						++var3;
					}

					if (var22.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 2064
						++var3;
					}

					if (var22.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 2065
						++var3;
					}

					if (var22.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 2066
						++var3;
					}

					if (var22.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 2067
						++var3;
					}

					var22.tryLoadFileByNames("sl_back", ""); // L: 2068
					var22.tryLoadFileByNames("sl_flags", ""); // L: 2069
					var22.tryLoadFileByNames("sl_arrows", ""); // L: 2070
					var22.tryLoadFileByNames("sl_stars", ""); // L: 2071
					var22.tryLoadFileByNames("sl_button", ""); // L: 2072
					var4 = class90.method2168(); // L: 2076
					if (var3 < var4) { // L: 2077
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 2078
						Login.Login_loadingPercent = 50; // L: 2079
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 2082
						Login.Login_loadingPercent = 50; // L: 2083
						BuddyRankComparator.updateGameState(5); // L: 2084
						Client.titleLoadingStage = 70; // L: 2085
					}
				} else if (Client.titleLoadingStage == 70) { // L: 2088
					if (!WorldMapSection3.archive2.isFullyLoaded()) { // L: 2089
						Login.Login_loadingText = "Loading config - " + WorldMapSection3.archive2.loadPercent() + "%"; // L: 2090
						Login.Login_loadingPercent = 60; // L: 2091
					} else {
						Archive var24 = WorldMapSection3.archive2; // L: 2094
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var24; // L: 2096
						ScriptFrame.method1224(WorldMapSection3.archive2); // L: 2098
						FileSystem.method3630(WorldMapSection3.archive2, class236.archive7); // L: 2099
						var21 = WorldMapSection3.archive2; // L: 2100
						var22 = class236.archive7; // L: 2101
						boolean var25 = Client.isLowDetail; // L: 2102
						ObjectDefinition.ObjectDefinition_archive = var21; // L: 2104
						GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive = var22; // L: 2105
						ObjectDefinition.ObjectDefinition_isLowDetail = var25; // L: 2106
						Archive var23 = WorldMapSection3.archive2; // L: 2108
						Archive var5 = class236.archive7; // L: 2109
						NPCDefinition.NpcDefinition_archive = var23; // L: 2111
						NPCDefinition.NpcDefinition_modelArchive = var5; // L: 2112
						WorldMapAreaData.method791(WorldMapSection3.archive2); // L: 2114
						Archive var6 = WorldMapSection3.archive2; // L: 2115
						Archive var7 = class236.archive7; // L: 2116
						boolean var8 = Client.isMembersWorld; // L: 2117
						Font var9 = DevicePcmPlayerProvider.fontPlain11; // L: 2118
						ItemDefinition.ItemDefinition_archive = var6; // L: 2120
						UserComparator9.ItemDefinition_modelArchive = var7; // L: 2121
						SoundCache.ItemDefinition_inMembersWorld = var8; // L: 2122
						HealthBar.ItemDefinition_fileCount = ItemDefinition.ItemDefinition_archive.getGroupFileCount(10); // L: 2123
						VerticalAlignment.ItemDefinition_fontPlain11 = var9; // L: 2124
						Archive var10 = WorldMapSection3.archive2; // L: 2126
						Archive var11 = MenuAction.archive0; // L: 2127
						Archive var12 = WorldMapManager.archive1; // L: 2128
						SequenceDefinition.SequenceDefinition_archive = var10; // L: 2130
						SequenceDefinition.SequenceDefinition_animationsArchive = var11; // L: 2131
						DefaultsGroup.SequenceDefinition_skeletonsArchive = var12; // L: 2132
						class182.method3716(WorldMapSection3.archive2, class236.archive7); // L: 2134
						Archive var13 = WorldMapSection3.archive2; // L: 2135
						VarbitDefinition.VarbitDefinition_archive = var13; // L: 2137
						FaceNormal.method3393(WorldMapSection3.archive2); // L: 2139
						Varps.method4126(FaceNormal.archive3, class236.archive7, GrandExchangeOffer.archive8, class8.archive13); // L: 2140
						GrandExchangeOfferUnitPriceComparator.method211(WorldMapSection3.archive2); // L: 2141
						Messages.method2328(WorldMapSection3.archive2); // L: 2142
						Messages.method2339(WorldMapSection3.archive2); // L: 2143
						Archive var14 = WorldMapSection3.archive2; // L: 2144
						ParamDefinition.ParamDefinition_archive = var14; // L: 2146
						FriendSystem.varcs = new Varcs(); // L: 2148
						Archive var15 = WorldMapSection3.archive2; // L: 2149
						Archive var16 = GrandExchangeOffer.archive8; // L: 2150
						Archive var17 = class8.archive13; // L: 2151
						HitSplatDefinition.HitSplatDefinition_archive = var15; // L: 2153
						HitSplatDefinition.field3350 = var16; // L: 2154
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var17; // L: 2155
						Archive var18 = WorldMapSection3.archive2; // L: 2157
						Archive var19 = GrandExchangeOffer.archive8; // L: 2158
						HealthBarDefinition.HealthBarDefinition_archive = var18; // L: 2160
						HealthBarDefinition.HitSplatDefinition_spritesArchive = var19; // L: 2161
						UserComparator4.method3504(WorldMapSection3.archive2, GrandExchangeOffer.archive8); // L: 2163
						Login.Login_loadingText = "Loaded config"; // L: 2164
						Login.Login_loadingPercent = 60; // L: 2165
						Client.titleLoadingStage = 80; // L: 2166
					}
				} else if (Client.titleLoadingStage == 80) { // L: 2169
					var26 = 0; // L: 2170
					if (UserComparator5.compass == null) { // L: 2171
						UserComparator5.compass = FloorDecoration.SpriteBuffer_getSprite(GrandExchangeOffer.archive8, FontName.spriteIds.compass, 0);
					} else {
						++var26; // L: 2172
					}

					if (class219.redHintArrowSprite == null) { // L: 2173
						class219.redHintArrowSprite = FloorDecoration.SpriteBuffer_getSprite(GrandExchangeOffer.archive8, FontName.spriteIds.field3835, 0);
					} else {
						++var26; // L: 2174
					}

					if (AbstractWorldMapIcon.mapSceneSprites == null) { // L: 2175
						AbstractWorldMapIcon.mapSceneSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.mapScenes, 0);
					} else {
						++var26; // L: 2176
					}

					if (World.headIconPkSprites == null) { // L: 2177
						World.headIconPkSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.headIconsPk, 0);
					} else {
						++var26; // L: 2178
					}

					if (TaskHandler.headIconPrayerSprites == null) { // L: 2179
						TaskHandler.headIconPrayerSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3836, 0);
					} else {
						++var26; // L: 2180
					}

					if (class337.headIconHintSprites == null) { // L: 2181
						class337.headIconHintSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3839, 0);
					} else {
						++var26; // L: 2182
					}

					if (ScriptEvent.mapMarkerSprites == null) { // L: 2183
						ScriptEvent.mapMarkerSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3841, 0);
					} else {
						++var26; // L: 2184
					}

					if (class60.crossSprites == null) { // L: 2185
						class60.crossSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3837, 0);
					} else {
						++var26; // L: 2186
					}

					if (Entity.mapDotSprites == null) { // L: 2187
						Entity.mapDotSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3834, 0);
					} else {
						++var26; // L: 2188
					}

					if (WorldMapSection0.scrollBarSprites == null) { // L: 2189
						WorldMapSection0.scrollBarSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.field3842, 0);
					} else {
						++var26; // L: 2190
					}

					if (SpriteMask.modIconSprites == null) { // L: 2191
						SpriteMask.modIconSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.field3844, 0);
					} else {
						++var26; // L: 2192
					}

					if (var26 < 11) { // L: 2193
						Login.Login_loadingText = "Loading sprites - " + var26 * 100 / 12 + "%"; // L: 2194
						Login.Login_loadingPercent = 70; // L: 2195
					} else {
						AbstractFont.AbstractFont_modIconSprites = SpriteMask.modIconSprites; // L: 2198
						class219.redHintArrowSprite.normalize(); // L: 2199
						int var1 = (int)(Math.random() * 21.0D) - 10; // L: 2200
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 2201
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 2202
						var4 = (int)(Math.random() * 41.0D) - 20; // L: 2203
						AbstractWorldMapIcon.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3); // L: 2204
						Login.Login_loadingText = "Loaded sprites"; // L: 2205
						Login.Login_loadingPercent = 70; // L: 2206
						Client.titleLoadingStage = 90; // L: 2207
					}
				} else if (Client.titleLoadingStage == 90) { // L: 2210
					if (!WorldMapData_1.archive9.isFullyLoaded()) { // L: 2211
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2212
						Login.Login_loadingPercent = 90; // L: 2213
					} else {
						class278.textureProvider = new TextureProvider(WorldMapData_1.archive9, GrandExchangeOffer.archive8, 20, 0.8D, Client.isLowDetail ? 64 : 128); // L: 2216
						Rasterizer3D.Rasterizer3D_setTextureLoader(class278.textureProvider); // L: 2217
						Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 2218
						Client.titleLoadingStage = 100; // L: 2219
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2222
					var26 = class278.textureProvider.getLoadedPercentage(); // L: 2223
					if (var26 < 100) { // L: 2224
						Login.Login_loadingText = "Loading textures - " + var26 + "%"; // L: 2225
						Login.Login_loadingPercent = 90; // L: 2226
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2229
						Login.Login_loadingPercent = 90; // L: 2230
						Client.titleLoadingStage = 110; // L: 2231
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2234
					class204.mouseRecorder = new MouseRecorder(); // L: 2235
					GameShell.taskHandler.newThreadTask(class204.mouseRecorder, 10); // L: 2236
					Login.Login_loadingText = "Loaded input handler"; // L: 2237
					Login.Login_loadingPercent = 92; // L: 2238
					Client.titleLoadingStage = 120; // L: 2239
				} else if (Client.titleLoadingStage == 120) { // L: 2242
					if (!class281.archive10.tryLoadFileByNames("huffman", "")) { // L: 2243
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2244
						Login.Login_loadingPercent = 94; // L: 2245
					} else {
						Huffman var0 = new Huffman(class281.archive10.takeFileByNames("huffman", "")); // L: 2248
						class4.method77(var0); // L: 2249
						Login.Login_loadingText = "Loaded wordpack"; // L: 2250
						Login.Login_loadingPercent = 94; // L: 2251
						Client.titleLoadingStage = 130; // L: 2252
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2255
					if (!FaceNormal.archive3.isFullyLoaded()) { // L: 2256
						Login.Login_loadingText = "Loading interfaces - " + FaceNormal.archive3.loadPercent() * 4 / 5 + "%"; // L: 2257
						Login.Login_loadingPercent = 96; // L: 2258
					} else if (!ViewportMouse.archive12.isFullyLoaded()) { // L: 2261
						Login.Login_loadingText = "Loading interfaces - " + (80 + ViewportMouse.archive12.loadPercent() / 6) + "%"; // L: 2262
						Login.Login_loadingPercent = 96; // L: 2263
					} else if (!class8.archive13.isFullyLoaded()) { // L: 2266
						Login.Login_loadingText = "Loading interfaces - " + (96 + class8.archive13.loadPercent() / 50) + "%"; // L: 2267
						Login.Login_loadingPercent = 96; // L: 2268
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2271
						Login.Login_loadingPercent = 98; // L: 2272
						Client.titleLoadingStage = 140; // L: 2273
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2276
					Login.Login_loadingPercent = 100; // L: 2277
					if (!class60.archive19.tryLoadGroupByName(WorldMapCacheName.field320.name)) { // L: 2278
						Login.Login_loadingText = "Loading world map - " + class60.archive19.groupLoadPercentByName(WorldMapCacheName.field320.name) / 10 + "%"; // L: 2279
					} else {
						if (KeyHandler.worldMap == null) { // L: 2282
							KeyHandler.worldMap = new WorldMap(); // L: 2283
							KeyHandler.worldMap.init(class60.archive19, ModelData0.archive18, Tiles.archive20, ReflectionCheck.fontBold12, Client.fontsMap, AbstractWorldMapIcon.mapSceneSprites); // L: 2284
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2286
						Client.titleLoadingStage = 150; // L: 2287
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2290
					BuddyRankComparator.updateGameState(10); // L: 2291
				}
			}
		} else {
			byte var20 = 0; // L: 1964
			var26 = var20 + MenuAction.archive0.percentage() * 4 / 100; // L: 1965
			var26 += WorldMapManager.archive1.percentage() * 4 / 100; // L: 1966
			var26 += WorldMapSection3.archive2.percentage() * 2 / 100; // L: 1967
			var26 += FaceNormal.archive3.percentage() * 2 / 100; // L: 1968
			var26 += Username.archive4.percentage() * 6 / 100; // L: 1969
			var26 += Varcs.archive5.percentage() * 4 / 100; // L: 1970
			var26 += ApproximateRouteStrategy.archive6.percentage() * 2 / 100; // L: 1971
			var26 += class236.archive7.percentage() * 56 / 100; // L: 1972
			var26 += GrandExchangeOffer.archive8.percentage() * 2 / 100; // L: 1973
			var26 += WorldMapData_1.archive9.percentage() * 2 / 100; // L: 1974
			var26 += class281.archive10.percentage() * 2 / 100; // L: 1975
			var26 += AbstractByteArrayCopier.archive11.percentage() * 2 / 100; // L: 1976
			var26 += ViewportMouse.archive12.percentage() * 2 / 100; // L: 1977
			var26 += class8.archive13.percentage() * 2 / 100; // L: 1978
			var26 += AbstractByteArrayCopier.archive14.percentage() * 2 / 100; // L: 1979
			var26 += class1.archive15.percentage() * 2 / 100; // L: 1980
			var26 += class60.archive19.percentage() / 100; // L: 1981
			var26 += ModelData0.archive18.percentage() / 100; // L: 1982
			var26 += Tiles.archive20.percentage() / 100; // L: 1983
			var26 += class23.archive17.method4420() && class23.archive17.isFullyLoaded() ? 1 : 0; // L: 1984
			if (var26 != 100) { // L: 1985
				if (var26 != 0) { // L: 1986
					Login.Login_loadingText = "Checking for updates - " + var26 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1987
			} else {
				ArchiveDiskActionHandler.method4404(MenuAction.archive0, "Animations"); // L: 1990
				ArchiveDiskActionHandler.method4404(WorldMapManager.archive1, "Skeletons"); // L: 1991
				ArchiveDiskActionHandler.method4404(Username.archive4, "Sound FX"); // L: 1992
				ArchiveDiskActionHandler.method4404(Varcs.archive5, "Maps"); // L: 1993
				ArchiveDiskActionHandler.method4404(ApproximateRouteStrategy.archive6, "Music Tracks"); // L: 1994
				ArchiveDiskActionHandler.method4404(class236.archive7, "Models"); // L: 1995
				ArchiveDiskActionHandler.method4404(GrandExchangeOffer.archive8, "Sprites"); // L: 1996
				ArchiveDiskActionHandler.method4404(AbstractByteArrayCopier.archive11, "Music Jingles"); // L: 1997
				ArchiveDiskActionHandler.method4404(AbstractByteArrayCopier.archive14, "Music Samples"); // L: 1998
				ArchiveDiskActionHandler.method4404(class1.archive15, "Music Patches"); // L: 1999
				ArchiveDiskActionHandler.method4404(class60.archive19, "World Map"); // L: 2000
				ArchiveDiskActionHandler.method4404(ModelData0.archive18, "World Map Geography"); // L: 2001
				ArchiveDiskActionHandler.method4404(Tiles.archive20, "World Map Ground"); // L: 2002
				FontName.spriteIds = new GraphicsDefaults(); // L: 2003
				FontName.spriteIds.decode(class23.archive17); // L: 2004
				Login.Login_loadingText = "Loaded update list"; // L: 2005
				Login.Login_loadingPercent = 30; // L: 2006
				Client.titleLoadingStage = 45; // L: 2007
			}
		}
	} // L: 1929 1935 1961 1988 2008 2031 2039 2048 2080 2086 2092 2167 2196 2208 2214 2220 2227 2232 2240 2246 2253 2259 2264 2269 2274 2280 2288 2292 2294
}
