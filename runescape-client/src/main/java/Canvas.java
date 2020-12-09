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
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;Lib;I)V",
		garbageValue = "1765160595"
	)
	public static void method912(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field3354 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1227984661"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("load")
	static void load() {
		int var12;
		if (Client.titleLoadingStage == 0) {
			ArchiveLoader.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var12 = 0; var12 < 4; ++var12) {
				Client.collisionMaps[var12] = new CollisionMap(104, 104);
			}

			class25.sceneMinimapSprite = new Sprite(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			TilePaint.archive0 = WorldMapCacheName.newArchive(0, false, true, true);
			WorldMapSprite.archive1 = WorldMapCacheName.newArchive(1, false, true, true);
			DynamicObject.archive2 = WorldMapCacheName.newArchive(2, true, false, true);
			class330.archive3 = WorldMapCacheName.newArchive(3, false, true, true);
			class227.archive4 = WorldMapCacheName.newArchive(4, false, true, true);
			GameShell.archive5 = WorldMapCacheName.newArchive(5, true, true, true);
			class217.archive6 = WorldMapCacheName.newArchive(6, true, true, true);
			BuddyRankComparator.archive7 = WorldMapCacheName.newArchive(7, false, true, true);
			Messages.archive8 = WorldMapCacheName.newArchive(8, false, true, true);
			GrandExchangeOfferUnitPriceComparator.archive9 = WorldMapCacheName.newArchive(9, false, true, true);
			class92.archive10 = WorldMapCacheName.newArchive(10, false, true, true);
			ItemContainer.archive11 = WorldMapCacheName.newArchive(11, false, true, true);
			PacketBufferNode.archive12 = WorldMapCacheName.newArchive(12, false, true, true);
			GrandExchangeOfferUnitPriceComparator.archive13 = WorldMapCacheName.newArchive(13, true, false, true);
			FontName.archive14 = WorldMapCacheName.newArchive(14, false, true, true);
			Client.archive15 = WorldMapCacheName.newArchive(15, false, true, true);
			class169.archive17 = WorldMapCacheName.newArchive(17, true, true, true);
			class41.archive18 = WorldMapCacheName.newArchive(18, false, true, true);
			class195.archive19 = WorldMapCacheName.newArchive(19, false, true, true);
			NetFileRequest.archive20 = WorldMapCacheName.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var23 = 0;
			var12 = var23 + TilePaint.archive0.percentage() * 4 / 100;
			var12 += WorldMapSprite.archive1.percentage() * 4 / 100;
			var12 += DynamicObject.archive2.percentage() * 2 / 100;
			var12 += class330.archive3.percentage() * 2 / 100;
			var12 += class227.archive4.percentage() * 6 / 100;
			var12 += GameShell.archive5.percentage() * 4 / 100;
			var12 += class217.archive6.percentage() * 2 / 100;
			var12 += BuddyRankComparator.archive7.percentage() * 56 / 100;
			var12 += Messages.archive8.percentage() * 2 / 100;
			var12 += GrandExchangeOfferUnitPriceComparator.archive9.percentage() * 2 / 100;
			var12 += class92.archive10.percentage() * 2 / 100;
			var12 += ItemContainer.archive11.percentage() * 2 / 100;
			var12 += PacketBufferNode.archive12.percentage() * 2 / 100;
			var12 += GrandExchangeOfferUnitPriceComparator.archive13.percentage() * 2 / 100;
			var12 += FontName.archive14.percentage() * 2 / 100;
			var12 += Client.archive15.percentage() * 2 / 100;
			var12 += class195.archive19.percentage() / 100;
			var12 += class41.archive18.percentage() / 100;
			var12 += NetFileRequest.archive20.percentage() / 100;
			var12 += class169.archive17.method4304() && class169.archive17.isFullyLoaded() ? 1 : 0;
			if (var12 != 100) {
				if (var12 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var12 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				UserComparator4.method3469(TilePaint.archive0, "Animations");
				UserComparator4.method3469(WorldMapSprite.archive1, "Skeletons");
				UserComparator4.method3469(class227.archive4, "Sound FX");
				UserComparator4.method3469(GameShell.archive5, "Maps");
				UserComparator4.method3469(class217.archive6, "Music Tracks");
				UserComparator4.method3469(BuddyRankComparator.archive7, "Models");
				UserComparator4.method3469(Messages.archive8, "Sprites");
				UserComparator4.method3469(ItemContainer.archive11, "Music Jingles");
				UserComparator4.method3469(FontName.archive14, "Music Samples");
				UserComparator4.method3469(Client.archive15, "Music Patches");
				UserComparator4.method3469(class195.archive19, "World Map");
				UserComparator4.method3469(class41.archive18, "World Map Geography");
				UserComparator4.method3469(NetFileRequest.archive20, "World Map Ground");
				WorldMapManager.spriteIds = new GraphicsDefaults();
				WorldMapManager.spriteIds.decode(class169.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var2;
			Archive var16;
			Archive var21;
			if (Client.titleLoadingStage == 45) {
				WorldMapIcon_0.method270(22050, !Client.isLowDetail, 2);
				MidiPcmStream var20 = new MidiPcmStream();
				var20.method3759(9, 128);
				AbstractWorldMapData.pcmPlayer0 = UserComparator6.method3526(GameShell.taskHandler, 0, 22050);
				AbstractWorldMapData.pcmPlayer0.setStream(var20);
				var21 = Client.archive15;
				var2 = FontName.archive14;
				var16 = class227.archive4;
				class206.musicPatchesArchive = var21;
				class206.musicSamplesArchive = var2;
				class206.soundEffectsArchive = var16;
				class206.midiPcmStream = var20;
				FriendLoginUpdate.pcmPlayer1 = UserComparator6.method3526(GameShell.taskHandler, 1, 2048);
				WorldMapManager.pcmStreamMixer = new PcmStreamMixer();
				FriendLoginUpdate.pcmPlayer1.setStream(WorldMapManager.pcmStreamMixer);
				TileItemPile.decimator = new Decimator(22050, PcmPlayer.field1443);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				WorldMapLabel.WorldMapElement_fonts = new Fonts(Messages.archive8, GrandExchangeOfferUnitPriceComparator.archive13);
			} else if (Client.titleLoadingStage == 50) {
				var12 = FontName.method5353().length;
				Client.fontsMap = WorldMapLabel.WorldMapElement_fonts.createMap(FontName.method5353());
				if (Client.fontsMap.size() < var12) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var12 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					class297.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					WorldMapLabelSize.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					GrandExchangeOfferTotalQuantityComparator.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					class58.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else {
				int var3;
				int var15;
				if (Client.titleLoadingStage == 60) {
					var21 = class92.archive10;
					var2 = Messages.archive8;
					var3 = 0;
					if (var21.tryLoadFileByNames("title.jpg", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("logo", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("logo_deadman_mode", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("titlebox", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("titlebutton", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("runes", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("title_mute", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) {
						++var3;
					}

					if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) {
						++var3;
					}

					var2.tryLoadFileByNames("sl_back", "");
					var2.tryLoadFileByNames("sl_flags", "");
					var2.tryLoadFileByNames("sl_arrows", "");
					var2.tryLoadFileByNames("sl_stars", "");
					var2.tryLoadFileByNames("sl_button", "");
					var15 = DynamicObject.method2304();
					if (var3 < var15) {
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var15 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						WorldMapCacheName.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!DynamicObject.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + DynamicObject.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						MouseHandler.method1157(DynamicObject.archive2);
						Archive var19 = DynamicObject.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var19;
						var21 = DynamicObject.archive2;
						var2 = BuddyRankComparator.archive7;
						KitDefinition.KitDefinition_archive = var21;
						class227.KitDefinition_modelsArchive = var2;
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
						var16 = DynamicObject.archive2;
						Archive var4 = BuddyRankComparator.archive7;
						boolean var17 = Client.isLowDetail;
						ObjectDefinition.ObjectDefinition_archive = var16;
						ObjectDefinition.ObjectDefinition_modelsArchive = var4;
						ObjectDefinition.ObjectDefinition_isLowDetail = var17;
						World.method1849(DynamicObject.archive2, BuddyRankComparator.archive7);
						ParamDefinition.method4526(DynamicObject.archive2);
						Actor.method1821(DynamicObject.archive2, BuddyRankComparator.archive7, Client.isMembersWorld, class297.fontPlain11);
						PcmPlayer.method2538(DynamicObject.archive2, TilePaint.archive0, WorldMapSprite.archive1);
						ModelData0.method3331(DynamicObject.archive2, BuddyRankComparator.archive7);
						class200.method3712(DynamicObject.archive2);
						Archive var18 = DynamicObject.archive2;
						class1.VarpDefinition_archive = var18;
						VarpDefinition.VarpDefinition_fileCount = class1.VarpDefinition_archive.getGroupFileCount(16);
						Archive var22 = class330.archive3;
						Archive var8 = BuddyRankComparator.archive7;
						Archive var9 = Messages.archive8;
						Archive var10 = GrandExchangeOfferUnitPriceComparator.archive13;
						class58.Widget_archive = var22;
						GrandExchangeOfferWorldComparator.Widget_modelsArchive = var8;
						class1.Widget_spritesArchive = var9;
						Bounds.Widget_fontsArchive = var10;
						class9.Widget_interfaceComponents = new Widget[class58.Widget_archive.getGroupCount()][];
						class195.Widget_loadedInterfaces = new boolean[class58.Widget_archive.getGroupCount()];
						Archive var11 = DynamicObject.archive2;
						InvDefinition.InvDefinition_archive = var11;
						StructDefinition.method4545(DynamicObject.archive2);
						ModelData0.method3330(DynamicObject.archive2);
						class13.method129(DynamicObject.archive2);
						Varcs.varcs = new Varcs();
						method912(DynamicObject.archive2, Messages.archive8, GrandExchangeOfferUnitPriceComparator.archive13);
						ServerPacket.method3669(DynamicObject.archive2, Messages.archive8);
						class219.method4010(DynamicObject.archive2, Messages.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var12 = 0;
					if (UrlRequester.compass == null) {
						UrlRequester.compass = Skills.SpriteBuffer_getSprite(Messages.archive8, WorldMapManager.spriteIds.compass, 0);
					} else {
						++var12;
					}

					if (ViewportMouse.redHintArrowSprite == null) {
						ViewportMouse.redHintArrowSprite = Skills.SpriteBuffer_getSprite(Messages.archive8, WorldMapManager.spriteIds.field3845, 0);
					} else {
						++var12;
					}

					IndexedSprite[] var1;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (WorldMapRegion.mapSceneSprites == null) {
						var2 = Messages.archive8;
						var3 = WorldMapManager.spriteIds.mapScenes;
						if (!class304.method5363(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
								var7.height = class336.SpriteBuffer_spriteHeight;
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6];
								var7.palette = class336.SpriteBuffer_spritePalette;
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6];
							}

							class336.SpriteBuffer_xOffsets = null;
							class336.SpriteBuffer_yOffsets = null;
							class336.SpriteBuffer_spriteWidths = null;
							class336.SpriteBuffer_spriteHeights = null;
							class336.SpriteBuffer_spritePalette = null;
							GrandExchangeEvents.SpriteBuffer_pixels = null;
							var1 = var5;
						}

						WorldMapRegion.mapSceneSprites = var1;
					} else {
						++var12;
					}

					if (Message.headIconPkSprites == null) {
						Message.headIconPkSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.headIconsPk, 0);
					} else {
						++var12;
					}

					if (Client.headIconPrayerSprites == null) {
						Client.headIconPrayerSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3844, 0);
					} else {
						++var12;
					}

					if (AbstractWorldMapIcon.headIconHintSprites == null) {
						AbstractWorldMapIcon.headIconHintSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3843, 0);
					} else {
						++var12;
					}

					if (GrandExchangeOfferUnitPriceComparator.mapMarkerSprites == null) {
						GrandExchangeOfferUnitPriceComparator.mapMarkerSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3846, 0);
					} else {
						++var12;
					}

					if (GrandExchangeOfferAgeComparator.crossSprites == null) {
						GrandExchangeOfferAgeComparator.crossSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3847, 0);
					} else {
						++var12;
					}

					if (Actor.mapDotSprites == null) {
						Actor.mapDotSprites = ClientPreferences.method1918(Messages.archive8, WorldMapManager.spriteIds.field3848, 0);
					} else {
						++var12;
					}

					if (InterfaceParent.scrollBarSprites == null) {
						var2 = Messages.archive8;
						var3 = WorldMapManager.spriteIds.field3849;
						if (!class304.method5363(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
								var7.height = class336.SpriteBuffer_spriteHeight;
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6];
								var7.palette = class336.SpriteBuffer_spritePalette;
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6];
							}

							class336.SpriteBuffer_xOffsets = null;
							class336.SpriteBuffer_yOffsets = null;
							class336.SpriteBuffer_spriteWidths = null;
							class336.SpriteBuffer_spriteHeights = null;
							class336.SpriteBuffer_spritePalette = null;
							GrandExchangeEvents.SpriteBuffer_pixels = null;
							var1 = var5;
						}

						InterfaceParent.scrollBarSprites = var1;
					} else {
						++var12;
					}

					if (class39.modIconSprites == null) {
						var2 = Messages.archive8;
						var3 = WorldMapManager.spriteIds.field3850;
						if (!class304.method5363(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
								var7.height = class336.SpriteBuffer_spriteHeight;
								var7.xOffset = class336.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class336.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class336.SpriteBuffer_spriteHeights[var6];
								var7.palette = class336.SpriteBuffer_spritePalette;
								var7.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var6];
							}

							class336.SpriteBuffer_xOffsets = null;
							class336.SpriteBuffer_yOffsets = null;
							class336.SpriteBuffer_spriteWidths = null;
							class336.SpriteBuffer_spriteHeights = null;
							class336.SpriteBuffer_spritePalette = null;
							GrandExchangeEvents.SpriteBuffer_pixels = null;
							var1 = var5;
						}

						class39.modIconSprites = var1;
					} else {
						++var12;
					}

					if (var12 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var12 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = class39.modIconSprites;
						ViewportMouse.redHintArrowSprite.normalize();
						int var13 = (int)(Math.random() * 21.0D) - 10;
						int var14 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						var15 = (int)(Math.random() * 41.0D) - 20;
						WorldMapRegion.mapSceneSprites[0].shiftColors(var13 + var15, var14 + var15, var15 + var3);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!GrandExchangeOfferUnitPriceComparator.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class307.textureProvider = new TextureProvider(GrandExchangeOfferUnitPriceComparator.archive9, Messages.archive8, 20, Timer.clientPreferences.field1057, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(class307.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(Timer.clientPreferences.field1057);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var12 = class307.textureProvider.getLoadedPercentage();
					if (var12 < 100) {
						Login.Login_loadingText = "Loading textures - " + var12 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					SoundCache.mouseRecorder = new MouseRecorder();
					GameShell.taskHandler.newThreadTask(SoundCache.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!class92.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(class92.archive10.takeFileByNames("huffman", ""));
						RouteStrategy.method3643(var0);
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class330.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class330.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!PacketBufferNode.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + PacketBufferNode.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!GrandExchangeOfferUnitPriceComparator.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + GrandExchangeOfferUnitPriceComparator.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!class195.archive19.tryLoadGroupByName(WorldMapCacheName.field328.name)) {
						Login.Login_loadingText = "Loading world map - " + class195.archive19.groupLoadPercentByName(WorldMapCacheName.field328.name) / 10 + "%";
					} else {
						if (WorldMapRectangle.worldMap == null) {
							WorldMapRectangle.worldMap = new WorldMap();
							WorldMapRectangle.worldMap.init(class195.archive19, class41.archive18, NetFileRequest.archive20, GrandExchangeOfferTotalQuantityComparator.fontBold12, Client.fontsMap, WorldMapRegion.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					WorldMapCacheName.updateGameState(10);
				}
			}
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	static boolean method911(int var0) {
		for (int var1 = 0; var1 < Client.field870; ++var1) {
			if (Client.field693[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
