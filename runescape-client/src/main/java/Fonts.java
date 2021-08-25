import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -736853061
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("m")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Lnu;I)Ljava/util/HashMap;",
		garbageValue = "337483472"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = Archive.method5150(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1384356512"
	)
	@Export("load")
	static void load() {
		int var14;
		if (Client.titleLoadingStage == 0) {
			CollisionMap.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14] = new CollisionMap(104, 104);
			}

			class113.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			WorldMapRectangle.archive0 = class4.newArchive(0, false, true, true);
			MenuAction.archive1 = class4.newArchive(1, false, true, true);
			class115.archive2 = class4.newArchive(2, true, false, true);
			class260.archive3 = class4.newArchive(3, false, true, true);
			ReflectionCheck.archive4 = class4.newArchive(4, false, true, true);
			ObjectComposition.archive5 = class4.newArchive(5, true, true, true);
			class276.archive6 = class4.newArchive(6, true, true, true);
			class135.archive7 = class4.newArchive(7, false, true, true);
			World.archive8 = class4.newArchive(8, false, true, true);
			VarcInt.archive9 = class4.newArchive(9, false, true, true);
			MouseRecorder.archive10 = class4.newArchive(10, false, true, true);
			class318.archive11 = class4.newArchive(11, false, true, true);
			SecureRandomCallable.archive12 = class4.newArchive(12, false, true, true);
			class391.archive13 = class4.newArchive(13, true, false, true);
			ApproximateRouteStrategy.archive14 = class4.newArchive(14, false, true, true);
			WorldMapSection0.archive15 = class4.newArchive(15, false, true, true);
			class120.archive17 = class4.newArchive(17, true, true, true);
			class120.archive18 = class4.newArchive(18, false, true, true);
			Interpreter.archive19 = class4.newArchive(19, false, true, true);
			class28.archive20 = class4.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var33 = 0;
			var14 = var33 + WorldMapRectangle.archive0.percentage() * 4 / 100;
			var14 += MenuAction.archive1.percentage() * 4 / 100;
			var14 += class115.archive2.percentage() * 2 / 100;
			var14 += class260.archive3.percentage() * 2 / 100;
			var14 += ReflectionCheck.archive4.percentage() * 6 / 100;
			var14 += ObjectComposition.archive5.percentage() * 4 / 100;
			var14 += class276.archive6.percentage() * 2 / 100;
			var14 += class135.archive7.percentage() * 56 / 100;
			var14 += World.archive8.percentage() * 2 / 100;
			var14 += VarcInt.archive9.percentage() * 2 / 100;
			var14 += MouseRecorder.archive10.percentage() * 2 / 100;
			var14 += class318.archive11.percentage() * 2 / 100;
			var14 += SecureRandomCallable.archive12.percentage() * 2 / 100;
			var14 += class391.archive13.percentage() * 2 / 100;
			var14 += ApproximateRouteStrategy.archive14.percentage() * 2 / 100;
			var14 += WorldMapSection0.archive15.percentage() * 2 / 100;
			var14 += Interpreter.archive19.percentage() / 100;
			var14 += class120.archive18.percentage() / 100;
			var14 += class28.archive20.percentage() / 100;
			var14 += class120.archive17.method5108() && class120.archive17.isFullyLoaded() ? 1 : 0;
			if (var14 != 100) {
				if (var14 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var14 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class21.method323(WorldMapRectangle.archive0, "Animations");
				class21.method323(MenuAction.archive1, "Skeletons");
				class21.method323(ReflectionCheck.archive4, "Sound FX");
				class21.method323(ObjectComposition.archive5, "Maps");
				class21.method323(class276.archive6, "Music Tracks");
				class21.method323(class135.archive7, "Models");
				class21.method323(World.archive8, "Sprites");
				class21.method323(class318.archive11, "Music Jingles");
				class21.method323(ApproximateRouteStrategy.archive14, "Music Samples");
				class21.method323(WorldMapSection0.archive15, "Music Patches");
				class21.method323(Interpreter.archive19, "World Map");
				class21.method323(class120.archive18, "World Map Geography");
				class21.method323(class28.archive20, "World Map Ground");
				WorldMapRegion.spriteIds = new GraphicsDefaults();
				WorldMapRegion.spriteIds.decode(class120.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var2;
			Archive var17;
			if (Client.titleLoadingStage == 45) {
				boolean var32 = !Client.isLowDetail;
				class276.field3287 = 22050;
				PcmPlayer.PcmPlayer_stereo = var32;
				PcmPlayer.field268 = 2;
				MidiPcmStream var30 = new MidiPcmStream();
				var30.method4628(9, 128);
				UserComparator10.pcmPlayer0 = class114.method2487(GameEngine.taskHandler, 0, 22050);
				UserComparator10.pcmPlayer0.setStream(var30);
				var2 = WorldMapSection0.archive15;
				Archive var31 = ApproximateRouteStrategy.archive14;
				var17 = ReflectionCheck.archive4;
				class247.musicPatchesArchive = var2;
				class247.musicSamplesArchive = var31;
				class247.soundEffectsArchive = var17;
				class135.midiPcmStream = var30;
				FriendsChat.pcmPlayer1 = class114.method2487(GameEngine.taskHandler, 1, 2048);
				MusicPatchPcmStream.pcmStreamMixer = new PcmStreamMixer();
				FriendsChat.pcmPlayer1.setStream(MusicPatchPcmStream.pcmStreamMixer);
				Language.decimator = new Decimator(22050, class276.field3287);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				UrlRequest.WorldMapElement_fonts = new Fonts(World.archive8, class391.archive13);
			} else {
				int var15;
				if (Client.titleLoadingStage == 50) {
					FontName[] var21 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana11};
					var15 = var21.length;
					Fonts var23 = UrlRequest.WorldMapElement_fonts;
					FontName[] var19 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana11};
					Client.fontsMap = var23.createMap(var19);
					if (Client.fontsMap.size() < var15) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var15 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						class87.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class129.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class11.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						ParamComposition.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else if (Client.titleLoadingStage == 60) {
					var14 = class28.method408(MouseRecorder.archive10, World.archive8);
					var15 = Login.field869.length + Login.field892.length;
					if (var14 < var15) {
						Login.Login_loadingText = "Loading title screen - " + var14 * 100 / var15 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						HealthBarUpdate.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!class115.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + class115.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var20 = class115.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var20;
						WorldMapElement.method2827(class115.archive2);
						PendingSpawn.method2121(class115.archive2, class135.archive7);
						Archive var29 = class115.archive2;
						var2 = class135.archive7;
						boolean var25 = Client.isLowDetail;
						ObjectComposition.ObjectDefinition_archive = var29;
						ObjectComposition.ObjectDefinition_modelsArchive = var2;
						ObjectComposition.ObjectDefinition_isLowDetail = var25;
						var17 = class115.archive2;
						Archive var24 = class135.archive7;
						NPCComposition.NpcDefinition_archive = var17;
						NPCComposition.NpcDefinition_modelArchive = var24;
						class111.method2466(class115.archive2);
						UserComparator10.method2444(class115.archive2, class135.archive7, Client.isMembersWorld, class87.fontPlain11);
						class15.method210(class115.archive2, WorldMapRectangle.archive0, MenuAction.archive1);
						WorldMapDecoration.method3802(class115.archive2, class135.archive7);
						class128.method2632(class115.archive2);
						Archive var26 = class115.archive2;
						VarpDefinition.VarpDefinition_archive = var26;
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Archive var18 = class260.archive3;
						Archive var28 = class135.archive7;
						Archive var9 = World.archive8;
						Archive var10 = class391.archive13;
						Widget.Widget_archive = var18;
						GrandExchangeOfferOwnWorldComparator.Widget_modelsArchive = var28;
						class184.Widget_spritesArchive = var9;
						class260.Widget_fontsArchive = var10;
						class139.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][];
						Widget.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()];
						Archive var11 = class115.archive2;
						InvDefinition.InvDefinition_archive = var11;
						ScriptEvent.method2056(class115.archive2);
						Archive var12 = class115.archive2;
						VarcInt.VarcInt_archive = var12;
						Archive var13 = class115.archive2;
						JagexCache.ParamDefinition_archive = var13;
						WorldMapLabelSize.field2011 = new class386(class16.field83, 54, class323.clientLanguage, class115.archive2);
						class125.HitSplatDefinition_cachedSprites = new class386(class16.field83, 47, class323.clientLanguage, class115.archive2);
						GrandExchangeEvent.varcs = new Varcs();
						class140.method2710(class115.archive2, World.archive8, class391.archive13);
						ModelData0.method4481(class115.archive2, World.archive8);
						ItemContainer.method2025(class115.archive2, World.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var14 = 0;
					if (MouseHandler.compass == null) {
						MouseHandler.compass = class258.SpriteBuffer_getSprite(World.archive8, WorldMapRegion.spriteIds.compass, 0);
					} else {
						++var14;
					}

					if (class15.redHintArrowSprite == null) {
						class15.redHintArrowSprite = class258.SpriteBuffer_getSprite(World.archive8, WorldMapRegion.spriteIds.field4001, 0);
					} else {
						++var14;
					}

					IndexedSprite[] var1;
					int var3;
					boolean var4;
					byte[] var5;
					IndexedSprite[] var6;
					int var7;
					IndexedSprite var8;
					if (GameEngine.mapSceneSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.mapScenes;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							class28.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class413.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class413.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class413.SpriteBuffer_spriteWidth;
								var8.height = class413.SpriteBuffer_spriteHeight;
								var8.xOffset = class413.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class413.SpriteBuffer_yOffsets[var7];
								var8.subWidth = InvDefinition.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class413.SpriteBuffer_spriteHeights[var7];
								var8.palette = ItemContainer.SpriteBuffer_spritePalette;
								var8.pixels = class283.SpriteBuffer_pixels[var7];
							}

							class413.SpriteBuffer_xOffsets = null;
							class413.SpriteBuffer_yOffsets = null;
							InvDefinition.SpriteBuffer_spriteWidths = null;
							class413.SpriteBuffer_spriteHeights = null;
							ItemContainer.SpriteBuffer_spritePalette = null;
							class283.SpriteBuffer_pixels = null;
							var1 = var6;
						}

						GameEngine.mapSceneSprites = var1;
					} else {
						++var14;
					}

					SpritePixels[] var22;
					if (MusicPatch.headIconPkSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.headIconsPk;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						MusicPatch.headIconPkSprites = var22;
					} else {
						++var14;
					}

					if (GraphicsObject.headIconPrayerSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4004;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						GraphicsObject.headIconPrayerSprites = var22;
					} else {
						++var14;
					}

					if (class7.headIconHintSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4003;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						class7.headIconHintSprites = var22;
					} else {
						++var14;
					}

					if (class13.mapMarkerSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4006;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						class13.mapMarkerSprites = var22;
					} else {
						++var14;
					}

					if (class13.crossSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4007;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						class13.crossSprites = var22;
					} else {
						++var14;
					}

					if (DynamicObject.mapDotSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4008;
						if (!VertexNormal.method4477(var2, var3, 0)) {
							var22 = null;
						} else {
							var22 = class174.method3364();
						}

						DynamicObject.mapDotSprites = var22;
					} else {
						++var14;
					}

					if (ArchiveLoader.scrollBarSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4009;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							class28.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class413.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class413.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class413.SpriteBuffer_spriteWidth;
								var8.height = class413.SpriteBuffer_spriteHeight;
								var8.xOffset = class413.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class413.SpriteBuffer_yOffsets[var7];
								var8.subWidth = InvDefinition.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class413.SpriteBuffer_spriteHeights[var7];
								var8.palette = ItemContainer.SpriteBuffer_spritePalette;
								var8.pixels = class283.SpriteBuffer_pixels[var7];
							}

							class413.SpriteBuffer_xOffsets = null;
							class413.SpriteBuffer_yOffsets = null;
							InvDefinition.SpriteBuffer_spriteWidths = null;
							class413.SpriteBuffer_spriteHeights = null;
							ItemContainer.SpriteBuffer_spritePalette = null;
							class283.SpriteBuffer_pixels = null;
							var1 = var6;
						}

						ArchiveLoader.scrollBarSprites = var1;
					} else {
						++var14;
					}

					if (WorldMapIcon_1.modIconSprites == null) {
						var2 = World.archive8;
						var3 = WorldMapRegion.spriteIds.field4010;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							class28.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class413.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class413.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class413.SpriteBuffer_spriteWidth;
								var8.height = class413.SpriteBuffer_spriteHeight;
								var8.xOffset = class413.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class413.SpriteBuffer_yOffsets[var7];
								var8.subWidth = InvDefinition.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class413.SpriteBuffer_spriteHeights[var7];
								var8.palette = ItemContainer.SpriteBuffer_spritePalette;
								var8.pixels = class283.SpriteBuffer_pixels[var7];
							}

							class413.SpriteBuffer_xOffsets = null;
							class413.SpriteBuffer_yOffsets = null;
							InvDefinition.SpriteBuffer_spriteWidths = null;
							class413.SpriteBuffer_spriteHeights = null;
							ItemContainer.SpriteBuffer_spritePalette = null;
							class283.SpriteBuffer_pixels = null;
							var1 = var6;
						}

						WorldMapIcon_1.modIconSprites = var1;
					} else {
						++var14;
					}

					if (var14 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var14 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = WorldMapIcon_1.modIconSprites;
						class15.redHintArrowSprite.normalize();
						var15 = (int)(Math.random() * 21.0D) - 10;
						int var16 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						int var27 = (int)(Math.random() * 41.0D) - 20;
						GameEngine.mapSceneSprites[0].shiftColors(var15 + var27, var27 + var16, var3 + var27);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!VarcInt.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						MusicPatch.textureProvider = new TextureProvider(VarcInt.archive9, World.archive8, 20, VarbitComposition.clientPreferences.field1193, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(MusicPatch.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(VarbitComposition.clientPreferences.field1193);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var14 = MusicPatch.textureProvider.getLoadedPercentage();
					if (var14 < 100) {
						Login.Login_loadingText = "Loading textures - " + var14 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					class184.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(class184.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!MouseRecorder.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(MouseRecorder.archive10.takeFileByNames("huffman", ""));
						Huffman.method5007(var0);
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class260.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class260.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!SecureRandomCallable.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + SecureRandomCallable.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class391.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + class391.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!Interpreter.archive19.tryLoadGroupByName(WorldMapCacheName.field2199.name)) {
						Login.Login_loadingText = "Loading world map - " + Interpreter.archive19.groupLoadPercentByName(WorldMapCacheName.field2199.name) / 10 + "%";
					} else {
						if (class65.worldMap == null) {
							class65.worldMap = new WorldMap();
							class65.worldMap.init(Interpreter.archive19, class120.archive18, class28.archive20, class11.fontBold12, Client.fontsMap, GameEngine.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					HealthBarUpdate.updateGameState(10);
				}
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIILoc;Lii;B)V",
		garbageValue = "90"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7281(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
