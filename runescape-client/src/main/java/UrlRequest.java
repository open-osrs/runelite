import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("h")
	@Export("url")
	final URL url;
	@ObfuscatedName("c")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("o")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 96
	} // L: 97

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "32017774"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 100
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1444379818"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 104
	}

	@ObfuscatedName("h")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZLkc;I)V",
		garbageValue = "543530822"
	)
	public static void method2431(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0; // L: 84
		FloorDecoration.ItemDefinition_modelArchive = var1; // L: 85
		BufferedNetSocket.ItemDefinition_inMembersWorld = var2; // L: 86
		class6.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		StudioGame.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2069514072"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) { // L: 1950
			class5.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1951

			for (var23 = 0; var23 < 4; ++var23) { // L: 1952
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			UserComparator8.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1953
			Login.Login_loadingText = "Starting game engine..."; // L: 1954
			Login.Login_loadingPercent = 5; // L: 1955
			Client.titleLoadingStage = 20; // L: 1956
		} else if (Client.titleLoadingStage == 20) { // L: 1959
			Login.Login_loadingText = "Prepared visibility map"; // L: 1960
			Login.Login_loadingPercent = 10; // L: 1961
			Client.titleLoadingStage = 30; // L: 1962
		} else if (Client.titleLoadingStage == 30) { // L: 1965
			MilliClock.archive0 = class9.newArchive(0, false, true, true); // L: 1966
			class0.archive1 = class9.newArchive(1, false, true, true); // L: 1967
			KitDefinition.archive2 = class9.newArchive(2, true, false, true); // L: 1968
			EnumComposition.archive3 = class9.newArchive(3, false, true, true); // L: 1969
			class14.archive4 = class9.newArchive(4, false, true, true); // L: 1970
			WorldMapSection0.archive5 = class9.newArchive(5, true, true, true); // L: 1971
			class29.archive6 = class9.newArchive(6, true, true, true); // L: 1972
			class260.archive7 = class9.newArchive(7, false, true, true); // L: 1973
			class43.archive8 = class9.newArchive(8, false, true, true); // L: 1974
			GameBuild.archive9 = class9.newArchive(9, false, true, true); // L: 1975
			PendingSpawn.archive10 = class9.newArchive(10, false, true, true); // L: 1976
			KeyHandler.archive11 = class9.newArchive(11, false, true, true); // L: 1977
			class22.archive12 = class9.newArchive(12, false, true, true); // L: 1978
			class18.archive13 = class9.newArchive(13, true, false, true); // L: 1979
			Huffman.archive14 = class9.newArchive(14, false, true, true); // L: 1980
			class16.archive15 = class9.newArchive(15, false, true, true); // L: 1981
			Actor.archive17 = class9.newArchive(17, true, true, true); // L: 1982
			WorldMapAreaData.archive18 = class9.newArchive(18, false, true, true); // L: 1983
			class232.archive19 = class9.newArchive(19, false, true, true); // L: 1984
			class9.archive20 = class9.newArchive(20, false, true, true); // L: 1985
			Login.Login_loadingText = "Connecting to update server"; // L: 1986
			Login.Login_loadingPercent = 20; // L: 1987
			Client.titleLoadingStage = 40; // L: 1988
		} else if (Client.titleLoadingStage == 40) { // L: 1991
			byte var34 = 0; // L: 1992
			var23 = var34 + MilliClock.archive0.percentage() * 4 / 100; // L: 1993
			var23 += class0.archive1.percentage() * 4 / 100; // L: 1994
			var23 += KitDefinition.archive2.percentage() * 2 / 100; // L: 1995
			var23 += EnumComposition.archive3.percentage() * 2 / 100; // L: 1996
			var23 += class14.archive4.percentage() * 6 / 100; // L: 1997
			var23 += WorldMapSection0.archive5.percentage() * 4 / 100; // L: 1998
			var23 += class29.archive6.percentage() * 2 / 100; // L: 1999
			var23 += class260.archive7.percentage() * 56 / 100; // L: 2000
			var23 += class43.archive8.percentage() * 2 / 100; // L: 2001
			var23 += GameBuild.archive9.percentage() * 2 / 100; // L: 2002
			var23 += PendingSpawn.archive10.percentage() * 2 / 100; // L: 2003
			var23 += KeyHandler.archive11.percentage() * 2 / 100; // L: 2004
			var23 += class22.archive12.percentage() * 2 / 100; // L: 2005
			var23 += class18.archive13.percentage() * 2 / 100; // L: 2006
			var23 += Huffman.archive14.percentage() * 2 / 100; // L: 2007
			var23 += class16.archive15.percentage() * 2 / 100; // L: 2008
			var23 += class232.archive19.percentage() / 100; // L: 2009
			var23 += WorldMapAreaData.archive18.percentage() / 100; // L: 2010
			var23 += class9.archive20.percentage() / 100; // L: 2011
			var23 += Actor.archive17.method4822() && Actor.archive17.isFullyLoaded() ? 1 : 0; // L: 2012
			if (var23 != 100) { // L: 2013
				if (var23 != 0) { // L: 2014
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 2015
			} else {
				class225.method4300(MilliClock.archive0, "Animations"); // L: 2018
				class225.method4300(class0.archive1, "Skeletons"); // L: 2019
				class225.method4300(class14.archive4, "Sound FX"); // L: 2020
				class225.method4300(WorldMapSection0.archive5, "Maps"); // L: 2021
				class225.method4300(class29.archive6, "Music Tracks"); // L: 2022
				class225.method4300(class260.archive7, "Models"); // L: 2023
				class225.method4300(class43.archive8, "Sprites"); // L: 2024
				class225.method4300(KeyHandler.archive11, "Music Jingles"); // L: 2025
				class225.method4300(Huffman.archive14, "Music Samples"); // L: 2026
				class225.method4300(class16.archive15, "Music Patches"); // L: 2027
				class225.method4300(class232.archive19, "World Map"); // L: 2028
				class225.method4300(WorldMapAreaData.archive18, "World Map Geography"); // L: 2029
				class225.method4300(class9.archive20, "World Map Ground"); // L: 2030
				ScriptFrame.spriteIds = new GraphicsDefaults(); // L: 2031
				ScriptFrame.spriteIds.decode(Actor.archive17); // L: 2032
				Login.Login_loadingText = "Loaded update list"; // L: 2033
				Login.Login_loadingPercent = 30; // L: 2034
				Client.titleLoadingStage = 45; // L: 2035
			}
		} else if (Client.titleLoadingStage == 45) { // L: 2038
			Message.method1166(22050, !Client.isLowDetail, 2); // L: 2039
			MidiPcmStream var30 = new MidiPcmStream(); // L: 2040
			var30.method4467(9, 128); // L: 2041
			WorldMapAreaData.pcmPlayer0 = GrandExchangeEvents.method4969(GameEngine.taskHandler, 0, 22050); // L: 2042
			WorldMapAreaData.pcmPlayer0.setStream(var30); // L: 2043
			class1.method13(class16.archive15, Huffman.archive14, class14.archive4, var30); // L: 2044
			class93.pcmPlayer1 = GrandExchangeEvents.method4969(GameEngine.taskHandler, 1, 2048); // L: 2045
			FloorOverlayDefinition.pcmStreamMixer = new PcmStreamMixer(); // L: 2046
			class93.pcmPlayer1.setStream(FloorOverlayDefinition.pcmStreamMixer); // L: 2047
			class3.decimator = new Decimator(22050, PcmPlayer.field401); // L: 2048
			Login.Login_loadingText = "Prepared sound engine"; // L: 2049
			Login.Login_loadingPercent = 35; // L: 2050
			Client.titleLoadingStage = 50; // L: 2051
			class260.WorldMapElement_fonts = new Fonts(class43.archive8, class18.archive13); // L: 2052
		} else {
			int var1;
			if (Client.titleLoadingStage == 50) { // L: 2055
				FontName[] var29 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13}; // L: 2058
				var1 = var29.length; // L: 2060
				Fonts var32 = class260.WorldMapElement_fonts; // L: 2061
				FontName[] var33 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13}; // L: 2064
				Client.fontsMap = var32.createMap(var33); // L: 2066
				if (Client.fontsMap.size() < var1) { // L: 2067
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 2068
					Login.Login_loadingPercent = 40; // L: 2069
				} else {
					class11.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 2072
					Message.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 2073
					WorldMapArea.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 2074
					GameObject.platformInfo = Client.platformInfoProvider.get(); // L: 2075
					Login.Login_loadingText = "Loaded fonts"; // L: 2076
					Login.Login_loadingPercent = 40; // L: 2077
					Client.titleLoadingStage = 60; // L: 2078
				}
			} else if (Client.titleLoadingStage == 60) { // L: 2081
				var23 = GraphicsDefaults.method5825(PendingSpawn.archive10, class43.archive8); // L: 2082
				byte var31 = 12; // L: 2085
				if (var23 < var31) { // L: 2088
					Login.Login_loadingText = "Loading title screen - " + var23 * 100 / var31 + "%"; // L: 2089
					Login.Login_loadingPercent = 50; // L: 2090
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 2093
					Login.Login_loadingPercent = 50; // L: 2094
					Client.updateGameState(5); // L: 2095
					Client.titleLoadingStage = 70; // L: 2096
				}
			} else if (Client.titleLoadingStage == 70) { // L: 2099
				if (!KitDefinition.archive2.isFullyLoaded()) { // L: 2100
					Login.Login_loadingText = "Loading config - " + KitDefinition.archive2.loadPercent() + "%"; // L: 2101
					Login.Login_loadingPercent = 60; // L: 2102
				} else {
					BufferedSource.method5782(KitDefinition.archive2); // L: 2105
					Archive var28 = KitDefinition.archive2; // L: 2106
					FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var28; // L: 2108
					Archive var24 = KitDefinition.archive2; // L: 2110
					Archive var25 = class260.archive7; // L: 2111
					KitDefinition.KitDefinition_archive = var24; // L: 2113
					KitDefinition.KitDefinition_modelsArchive = var25; // L: 2114
					KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 2115
					Archive var26 = KitDefinition.archive2; // L: 2117
					Archive var27 = class260.archive7; // L: 2118
					boolean var5 = Client.isLowDetail; // L: 2119
					ObjectComposition.ObjectDefinition_archive = var26; // L: 2121
					ObjectComposition.ObjectDefinition_modelsArchive = var27; // L: 2122
					ObjectComposition.ObjectDefinition_isLowDetail = var5; // L: 2123
					Archive var6 = KitDefinition.archive2; // L: 2125
					Archive var7 = class260.archive7; // L: 2126
					NPCComposition.NpcDefinition_archive = var6; // L: 2128
					NPCComposition.NpcDefinition_modelArchive = var7; // L: 2129
					UserComparator7.method2453(KitDefinition.archive2); // L: 2131
					method2431(KitDefinition.archive2, class260.archive7, Client.isMembersWorld, class11.fontPlain11); // L: 2132
					Archive var8 = KitDefinition.archive2; // L: 2133
					Archive var9 = MilliClock.archive0; // L: 2134
					Archive var10 = class0.archive1; // L: 2135
					SequenceDefinition.SequenceDefinition_archive = var8; // L: 2137
					SequenceDefinition.SequenceDefinition_animationsArchive = var9; // L: 2138
					SequenceDefinition.SequenceDefinition_skeletonsArchive = var10; // L: 2139
					class69.method1153(KitDefinition.archive2, class260.archive7); // L: 2141
					Archive var11 = KitDefinition.archive2; // L: 2142
					VarbitComposition.VarbitDefinition_archive = var11; // L: 2144
					Archive var12 = KitDefinition.archive2; // L: 2146
					VarpDefinition.VarpDefinition_archive = var12; // L: 2148
					class403.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 2149
					class34.method391(EnumComposition.archive3, class260.archive7, class43.archive8, class18.archive13); // L: 2151
					NPC.method2266(KitDefinition.archive2); // L: 2152
					Archive var13 = KitDefinition.archive2; // L: 2153
					EnumComposition.EnumDefinition_archive = var13; // L: 2155
					AbstractByteArrayCopier.method4756(KitDefinition.archive2); // L: 2157
					ApproximateRouteStrategy.method1203(KitDefinition.archive2); // L: 2158
					class7.field60 = new class369(NetSocket.field1492, 54, class7.clientLanguage, KitDefinition.archive2); // L: 2159
					ModeWhere.HitSplatDefinition_cachedSprites = new class369(NetSocket.field1492, 47, class7.clientLanguage, KitDefinition.archive2); // L: 2160
					Client.varcs = new Varcs(); // L: 2161
					Archive var14 = KitDefinition.archive2; // L: 2162
					Archive var15 = class43.archive8; // L: 2163
					Archive var16 = class18.archive13; // L: 2164
					HitSplatDefinition.HitSplatDefinition_archive = var14; // L: 2166
					HitSplatDefinition.field1731 = var15; // L: 2167
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var16; // L: 2168
					Archive var17 = KitDefinition.archive2; // L: 2170
					Archive var18 = class43.archive8; // L: 2171
					HealthBarDefinition.HealthBarDefinition_archive = var17; // L: 2173
					HealthBarDefinition.HitSplatDefinition_spritesArchive = var18; // L: 2174
					Archive var19 = KitDefinition.archive2; // L: 2176
					Archive var20 = class43.archive8; // L: 2177
					WorldMapElement.WorldMapElement_archive = var20; // L: 2179
					if (var19.isFullyLoaded()) { // L: 2180
						WorldMapElement.WorldMapElement_count = var19.getGroupFileCount(35); // L: 2183
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 2184

						for (int var21 = 0; var21 < WorldMapElement.WorldMapElement_count; ++var21) { // L: 2185
							byte[] var22 = var19.takeFile(35, var21); // L: 2186
							WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21); // L: 2187
							if (var22 != null) { // L: 2188
								WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22)); // L: 2189
								WorldMapElement.WorldMapElement_cached[var21].method2631(); // L: 2190
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 2194
					Login.Login_loadingPercent = 60; // L: 2195
					Client.titleLoadingStage = 80; // L: 2196
				}
			} else if (Client.titleLoadingStage == 80) { // L: 2199
				var23 = 0; // L: 2200
				if (WorldMapRegion.compass == null) { // L: 2201
					WorldMapRegion.compass = Friend.SpriteBuffer_getSprite(class43.archive8, ScriptFrame.spriteIds.compass, 0);
				} else {
					++var23; // L: 2202
				}

				if (GrandExchangeOfferOwnWorldComparator.redHintArrowSprite == null) { // L: 2203
					GrandExchangeOfferOwnWorldComparator.redHintArrowSprite = Friend.SpriteBuffer_getSprite(class43.archive8, ScriptFrame.spriteIds.field3915, 0);
				} else {
					++var23; // L: 2204
				}

				if (class23.mapSceneSprites == null) { // L: 2205
					class23.mapSceneSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.mapScenes, 0);
				} else {
					++var23; // L: 2206
				}

				if (class14.headIconPkSprites == null) { // L: 2207
					class14.headIconPkSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.headIconsPk, 0);
				} else {
					++var23; // L: 2208
				}

				if (Varcs.headIconPrayerSprites == null) { // L: 2209
					Varcs.headIconPrayerSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3908, 0);
				} else {
					++var23; // L: 2210
				}

				if (class375.headIconHintSprites == null) { // L: 2211
					class375.headIconHintSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3909, 0);
				} else {
					++var23; // L: 2212
				}

				if (ObjectComposition.mapMarkerSprites == null) { // L: 2213
					ObjectComposition.mapMarkerSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3910, 0);
				} else {
					++var23; // L: 2214
				}

				if (MouseHandler.crossSprites == null) { // L: 2215
					MouseHandler.crossSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3914, 0);
				} else {
					++var23; // L: 2216
				}

				if (class341.mapDotSprites == null) { // L: 2217
					class341.mapDotSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3904, 0);
				} else {
					++var23; // L: 2218
				}

				if (GrandExchangeOfferTotalQuantityComparator.scrollBarSprites == null) { // L: 2219
					GrandExchangeOfferTotalQuantityComparator.scrollBarSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.field3913, 0);
				} else {
					++var23; // L: 2220
				}

				if (FriendSystem.modIconSprites == null) { // L: 2221
					FriendSystem.modIconSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.field3916, 0);
				} else {
					++var23; // L: 2222
				}

				if (var23 < 11) { // L: 2223
					Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%"; // L: 2224
					Login.Login_loadingPercent = 70; // L: 2225
				} else {
					AbstractFont.AbstractFont_modIconSprites = FriendSystem.modIconSprites; // L: 2228
					GrandExchangeOfferOwnWorldComparator.redHintArrowSprite.normalize(); // L: 2229
					var1 = (int)(Math.random() * 21.0D) - 10; // L: 2230
					int var2 = (int)(Math.random() * 21.0D) - 10; // L: 2231
					int var3 = (int)(Math.random() * 21.0D) - 10; // L: 2232
					int var4 = (int)(Math.random() * 41.0D) - 20; // L: 2233
					class23.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var3 + var4); // L: 2234
					Login.Login_loadingText = "Loaded sprites"; // L: 2235
					Login.Login_loadingPercent = 70; // L: 2236
					Client.titleLoadingStage = 90; // L: 2237
				}
			} else if (Client.titleLoadingStage == 90) { // L: 2240
				if (!GameBuild.archive9.isFullyLoaded()) { // L: 2241
					Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2242
					Login.Login_loadingPercent = 90; // L: 2243
				} else {
					class9.textureProvider = new TextureProvider(GameBuild.archive9, class43.archive8, 20, class12.clientPreferences.field1303, Client.isLowDetail ? 64 : 128); // L: 2246
					Rasterizer3D.Rasterizer3D_setTextureLoader(class9.textureProvider); // L: 2247
					Rasterizer3D.Rasterizer3D_setBrightness(class12.clientPreferences.field1303); // L: 2248
					Client.titleLoadingStage = 100; // L: 2249
				}
			} else if (Client.titleLoadingStage == 100) { // L: 2252
				var23 = class9.textureProvider.getLoadedPercentage(); // L: 2253
				if (var23 < 100) { // L: 2254
					Login.Login_loadingText = "Loading textures - " + var23 + "%"; // L: 2255
					Login.Login_loadingPercent = 90; // L: 2256
				} else {
					Login.Login_loadingText = "Loaded textures"; // L: 2259
					Login.Login_loadingPercent = 90; // L: 2260
					Client.titleLoadingStage = 110; // L: 2261
				}
			} else if (Client.titleLoadingStage == 110) { // L: 2264
				class69.mouseRecorder = new MouseRecorder(); // L: 2265
				GameEngine.taskHandler.newThreadTask(class69.mouseRecorder, 10); // L: 2266
				Login.Login_loadingText = "Loaded input handler"; // L: 2267
				Login.Login_loadingPercent = 92; // L: 2268
				Client.titleLoadingStage = 120; // L: 2269
			} else if (Client.titleLoadingStage == 120) { // L: 2272
				if (!PendingSpawn.archive10.tryLoadFileByNames("huffman", "")) { // L: 2273
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2274
					Login.Login_loadingPercent = 94; // L: 2275
				} else {
					Huffman var0 = new Huffman(PendingSpawn.archive10.takeFileByNames("huffman", "")); // L: 2278
					VertexNormal.method4219(var0); // L: 2279
					Login.Login_loadingText = "Loaded wordpack"; // L: 2280
					Login.Login_loadingPercent = 94; // L: 2281
					Client.titleLoadingStage = 130; // L: 2282
				}
			} else if (Client.titleLoadingStage == 130) { // L: 2285
				if (!EnumComposition.archive3.isFullyLoaded()) { // L: 2286
					Login.Login_loadingText = "Loading interfaces - " + EnumComposition.archive3.loadPercent() * 4 / 5 + "%"; // L: 2287
					Login.Login_loadingPercent = 96; // L: 2288
				} else if (!class22.archive12.isFullyLoaded()) { // L: 2291
					Login.Login_loadingText = "Loading interfaces - " + (80 + class22.archive12.loadPercent() / 6) + "%"; // L: 2292
					Login.Login_loadingPercent = 96; // L: 2293
				} else if (!class18.archive13.isFullyLoaded()) { // L: 2296
					Login.Login_loadingText = "Loading interfaces - " + (96 + class18.archive13.loadPercent() / 50) + "%"; // L: 2297
					Login.Login_loadingPercent = 96; // L: 2298
				} else {
					Login.Login_loadingText = "Loaded interfaces"; // L: 2301
					Login.Login_loadingPercent = 98; // L: 2302
					Client.titleLoadingStage = 140; // L: 2303
				}
			} else if (Client.titleLoadingStage == 140) { // L: 2306
				Login.Login_loadingPercent = 100; // L: 2307
				if (!class232.archive19.tryLoadGroupByName(WorldMapCacheName.field2128.name)) { // L: 2308
					Login.Login_loadingText = "Loading world map - " + class232.archive19.groupLoadPercentByName(WorldMapCacheName.field2128.name) / 10 + "%"; // L: 2309
				} else {
					if (NetSocket.worldMap == null) { // L: 2312
						NetSocket.worldMap = new WorldMap(); // L: 2313
						NetSocket.worldMap.init(class232.archive19, WorldMapAreaData.archive18, class9.archive20, WorldMapArea.fontBold12, Client.fontsMap, class23.mapSceneSprites); // L: 2314
					}

					Login.Login_loadingText = "Loaded world map"; // L: 2316
					Client.titleLoadingStage = 150; // L: 2317
				}
			} else if (Client.titleLoadingStage == 150) { // L: 2320
				Client.updateGameState(10); // L: 2321
			}
		}
	} // L: 1957 1963 1989 2016 2036 2053 2070 2079 2091 2097 2103 2197 2226 2238 2244 2250 2257 2262 2270 2276 2283 2289 2294 2299 2304 2310 2318 2322 2324
}
