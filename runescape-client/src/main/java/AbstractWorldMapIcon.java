import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1062254253
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 800966133
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lij;Lij;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "995404902"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lff;",
		garbageValue = "5"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1077868698"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851510146"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-67"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "808950261"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = HealthBarUpdate.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
				break;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2093916255"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;ZLkt;B)V",
		garbageValue = "67"
	)
	public static void method3719(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		SoundSystem.ItemDefinition_archive = var0;
		class339.ItemDefinition_modelArchive = var1;
		class144.ItemDefinition_inMembersWorld = var2;
		FloorUnderlayDefinition.ItemDefinition_fileCount = SoundSystem.ItemDefinition_archive.getGroupFileCount(10);
		ArchiveLoader.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-81"
	)
	static final boolean method3714(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class267.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class367.field4124;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class367.field4126;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1758491092"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return PcmPlayer.worldMap;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1049971110"
	)
	@Export("load")
	static void load() {
		int var21;
		if (Client.titleLoadingStage == 0) {
			WorldMapIcon_1.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var21 = 0; var21 < 4; ++var21) {
				Client.collisionMaps[var21] = new CollisionMap(104, 104);
			}

			class376.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			class120.archive0 = UserComparator5.newArchive(0, false, true, true);
			Language.archive1 = UserComparator5.newArchive(1, false, true, true);
			ItemLayer.archive2 = UserComparator5.newArchive(2, true, false, true);
			Decimator.archive3 = UserComparator5.newArchive(3, false, true, true);
			InvDefinition.archive4 = UserComparator5.newArchive(4, false, true, true);
			Skeleton.archive5 = UserComparator5.newArchive(5, true, true, true);
			class108.archive6 = UserComparator5.newArchive(6, true, true, true);
			class74.archive7 = UserComparator5.newArchive(7, false, true, true);
			class270.archive8 = UserComparator5.newArchive(8, false, true, true);
			class126.archive9 = UserComparator5.newArchive(9, false, true, true);
			ClanChannelMember.archive10 = UserComparator5.newArchive(10, false, true, true);
			class339.archive11 = UserComparator5.newArchive(11, false, true, true);
			ApproximateRouteStrategy.archive12 = UserComparator5.newArchive(12, false, true, true);
			ClanChannel.archive13 = UserComparator5.newArchive(13, true, false, true);
			ItemLayer.archive14 = UserComparator5.newArchive(14, false, true, true);
			Tiles.archive15 = UserComparator5.newArchive(15, false, true, true);
			GameEngine.archive17 = UserComparator5.newArchive(17, true, true, true);
			class15.archive18 = UserComparator5.newArchive(18, false, true, true);
			Decimator.archive19 = UserComparator5.newArchive(19, false, true, true);
			ClanMate.archive20 = UserComparator5.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			Archive var12;
			Archive var13;
			Archive var14;
			if (Client.titleLoadingStage == 45) {
				ArchiveLoader.method1781(22050, !Client.isLowDetail, 2);
				MidiPcmStream var19 = new MidiPcmStream();
				var19.method4481(9, 128);
				WorldMapDecoration.pcmPlayer0 = NetSocket.method2634(GameEngine.taskHandler, 0, 22050);
				WorldMapDecoration.pcmPlayer0.setStream(var19);
				var12 = Tiles.archive15;
				var13 = ItemLayer.archive14;
				var14 = InvDefinition.archive4;
				class234.musicPatchesArchive = var12;
				class234.musicSamplesArchive = var13;
				class234.soundEffectsArchive = var14;
				class234.midiPcmStream = var19;
				VarcInt.pcmPlayer1 = NetSocket.method2634(GameEngine.taskHandler, 1, 2048);
				TileItem.pcmStreamMixer = new PcmStreamMixer();
				VarcInt.pcmPlayer1.setStream(TileItem.pcmStreamMixer);
				FloorOverlayDefinition.decimator = new Decimator(22050, GrandExchangeOfferAgeComparator.field3633);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				ClientPacket.WorldMapElement_fonts = new Fonts(class270.archive8, ClanChannel.archive13);
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) {
					FontName[] var18 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13};
					var1 = var18.length;
					Fonts var22 = ClientPacket.WorldMapElement_fonts;
					FontName[] var23 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13};
					Client.fontsMap = var22.createMap(var23);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						GrandExchangeOfferOwnWorldComparator.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						WorldMapDecorationType.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						TaskHandler.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						ServerPacket.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					int var3;
					if (Client.titleLoadingStage == 60) {
						var12 = ClanChannelMember.archive10;
						var13 = class270.archive8;
						var3 = 0;
						if (var12.tryLoadFileByNames("title.jpg", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("logo", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("logo_deadman_mode", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("logo_seasonal_mode", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("titlebox", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("titlebutton", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("runes", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("title_mute", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("options_radio_buttons,0", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("options_radio_buttons,2", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("options_radio_buttons,4", "")) {
							++var3;
						}

						if (var13.tryLoadFileByNames("options_radio_buttons,6", "")) {
							++var3;
						}

						var13.tryLoadFileByNames("sl_back", "");
						var13.tryLoadFileByNames("sl_flags", "");
						var13.tryLoadFileByNames("sl_arrows", "");
						var13.tryLoadFileByNames("sl_stars", "");
						var13.tryLoadFileByNames("sl_button", "");
						byte var20 = 12;
						if (var3 < var20) {
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var20 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							class16.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!ItemLayer.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + ItemLayer.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else {
							Archive var17 = ItemLayer.archive2;
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var17;
							Projectile.method1702(ItemLayer.archive2);
							var12 = ItemLayer.archive2;
							var13 = class74.archive7;
							KitDefinition.KitDefinition_archive = var12;
							ClientPreferences.KitDefinition_modelsArchive = var13;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							class110.method2318(ItemLayer.archive2, class74.archive7, Client.isLowDetail);
							var14 = ItemLayer.archive2;
							Archive var15 = class74.archive7;
							NPCComposition.NpcDefinition_archive = var14;
							NPCComposition.NpcDefinition_modelArchive = var15;
							Archive var5 = ItemLayer.archive2;
							StructComposition.StructDefinition_archive = var5;
							method3719(ItemLayer.archive2, class74.archive7, Client.isMembersWorld, GrandExchangeOfferOwnWorldComparator.fontPlain11);
							Archive var6 = ItemLayer.archive2;
							Archive var7 = class120.archive0;
							Archive var8 = Language.archive1;
							SequenceDefinition.SequenceDefinition_archive = var6;
							SequenceDefinition.SequenceDefinition_animationsArchive = var7;
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var8;
							UrlRequest.method2141(ItemLayer.archive2, class74.archive7);
							FriendSystem.method1452(ItemLayer.archive2);
							World.method1403(ItemLayer.archive2);
							class137.method2686(Decimator.archive3, class74.archive7, class270.archive8, ClanChannel.archive13);
							class78.method1969(ItemLayer.archive2);
							Archive var9 = ItemLayer.archive2;
							EnumComposition.EnumDefinition_archive = var9;
							Archive var10 = ItemLayer.archive2;
							VarcInt.VarcInt_archive = var10;
							BufferedNetSocket.method5956(ItemLayer.archive2);
							class99.field1271 = new class371(MouseRecorder.field975, 54, GrandExchangeOfferWorldComparator.clientLanguage, ItemLayer.archive2);
							GrandExchangeOfferUnitPriceComparator.HitSplatDefinition_cachedSprites = new class371(MouseRecorder.field975, 47, GrandExchangeOfferWorldComparator.clientLanguage, ItemLayer.archive2);
							Decimator.varcs = new Varcs();
							ModeWhere.method5251(ItemLayer.archive2, class270.archive8, ClanChannel.archive13);
							ModeWhere.method5237(ItemLayer.archive2, class270.archive8);
							class370.method6509(ItemLayer.archive2, class270.archive8);
							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var21 = 0;
						if (ObjectSound.compass == null) {
							ObjectSound.compass = ViewportMouse.SpriteBuffer_getSprite(class270.archive8, WorldMapAreaData.spriteIds.compass, 0);
						} else {
							++var21;
						}

						if (class144.redHintArrowSprite == null) {
							class144.redHintArrowSprite = ViewportMouse.SpriteBuffer_getSprite(class270.archive8, WorldMapAreaData.spriteIds.field3915, 0);
						} else {
							++var21;
						}

						if (NetFileRequest.mapSceneSprites == null) {
							NetFileRequest.mapSceneSprites = FileSystem.method2628(class270.archive8, WorldMapAreaData.spriteIds.mapScenes, 0);
						} else {
							++var21;
						}

						if (UserComparator4.headIconPkSprites == null) {
							UserComparator4.headIconPkSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.headIconsPk, 0);
						} else {
							++var21;
						}

						if (StudioGame.headIconPrayerSprites == null) {
							StudioGame.headIconPrayerSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.field3910, 0);
						} else {
							++var21;
						}

						if (SpotAnimationDefinition.headIconHintSprites == null) {
							SpotAnimationDefinition.headIconHintSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.field3912, 0);
						} else {
							++var21;
						}

						if (FloorUnderlayDefinition.mapMarkerSprites == null) {
							FloorUnderlayDefinition.mapMarkerSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.field3908, 0);
						} else {
							++var21;
						}

						if (Varcs.crossSprites == null) {
							Varcs.crossSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.field3914, 0);
						} else {
							++var21;
						}

						if (class126.mapDotSprites == null) {
							class126.mapDotSprites = Actor.method1884(class270.archive8, WorldMapAreaData.spriteIds.field3913, 0);
						} else {
							++var21;
						}

						if (Message.scrollBarSprites == null) {
							Message.scrollBarSprites = FileSystem.method2628(class270.archive8, WorldMapAreaData.spriteIds.field3911, 0);
						} else {
							++var21;
						}

						if (class249.modIconSprites == null) {
							class249.modIconSprites = FileSystem.method2628(class270.archive8, WorldMapAreaData.spriteIds.field3917, 0);
						} else {
							++var21;
						}

						if (var21 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var21 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class249.modIconSprites;
							class144.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							int var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							int var4 = (int)(Math.random() * 41.0D) - 20;
							NetFileRequest.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!class126.archive9.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							WorldMapSprite.textureProvider = new TextureProvider(class126.archive9, class270.archive8, 20, Decimator.clientPreferences.field1117, Client.isLowDetail ? 64 : 128);
							Rasterizer3D.Rasterizer3D_setTextureLoader(WorldMapSprite.textureProvider);
							Rasterizer3D.Rasterizer3D_setBrightness(Decimator.clientPreferences.field1117);
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var21 = WorldMapSprite.textureProvider.getLoadedPercentage();
						if (var21 < 100) {
							Login.Login_loadingText = "Loading textures - " + var21 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						class6.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(class6.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!ClanChannelMember.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var0 = new Huffman(ClanChannelMember.archive10.takeFileByNames("huffman", ""));
							class101.method2229(var0);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!Decimator.archive3.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + Decimator.archive3.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!ApproximateRouteStrategy.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + ApproximateRouteStrategy.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!ClanChannel.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + ClanChannel.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (!Decimator.archive19.tryLoadGroupByName(WorldMapCacheName.field2117.name)) {
							Login.Login_loadingText = "Loading world map - " + Decimator.archive19.groupLoadPercentByName(WorldMapCacheName.field2117.name) / 10 + "%";
						} else {
							if (PcmPlayer.worldMap == null) {
								PcmPlayer.worldMap = new WorldMap();
								PcmPlayer.worldMap.init(Decimator.archive19, class15.archive18, ClanMate.archive20, TaskHandler.fontBold12, Client.fontsMap, NetFileRequest.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						class16.updateGameState(10);
					}
				}
			}
		} else {
			byte var11 = 0;
			var21 = var11 + class120.archive0.percentage() * 4 / 100;
			var21 += Language.archive1.percentage() * 4 / 100;
			var21 += ItemLayer.archive2.percentage() * 2 / 100;
			var21 += Decimator.archive3.percentage() * 2 / 100;
			var21 += InvDefinition.archive4.percentage() * 6 / 100;
			var21 += Skeleton.archive5.percentage() * 4 / 100;
			var21 += class108.archive6.percentage() * 2 / 100;
			var21 += class74.archive7.percentage() * 56 / 100;
			var21 += class270.archive8.percentage() * 2 / 100;
			var21 += class126.archive9.percentage() * 2 / 100;
			var21 += ClanChannelMember.archive10.percentage() * 2 / 100;
			var21 += class339.archive11.percentage() * 2 / 100;
			var21 += ApproximateRouteStrategy.archive12.percentage() * 2 / 100;
			var21 += ClanChannel.archive13.percentage() * 2 / 100;
			var21 += ItemLayer.archive14.percentage() * 2 / 100;
			var21 += Tiles.archive15.percentage() * 2 / 100;
			var21 += Decimator.archive19.percentage() / 100;
			var21 += class15.archive18.percentage() / 100;
			var21 += ClanMate.archive20.percentage() / 100;
			var21 += GameEngine.archive17.method4955() && GameEngine.archive17.isFullyLoaded() ? 1 : 0;
			if (var21 != 100) {
				if (var21 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var21 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				UserComparator4.method2143(class120.archive0, "Animations");
				UserComparator4.method2143(Language.archive1, "Skeletons");
				UserComparator4.method2143(InvDefinition.archive4, "Sound FX");
				UserComparator4.method2143(Skeleton.archive5, "Maps");
				UserComparator4.method2143(class108.archive6, "Music Tracks");
				UserComparator4.method2143(class74.archive7, "Models");
				UserComparator4.method2143(class270.archive8, "Sprites");
				UserComparator4.method2143(class339.archive11, "Music Jingles");
				UserComparator4.method2143(ItemLayer.archive14, "Music Samples");
				UserComparator4.method2143(Tiles.archive15, "Music Patches");
				UserComparator4.method2143(Decimator.archive19, "World Map");
				UserComparator4.method2143(class15.archive18, "World Map Geography");
				UserComparator4.method2143(ClanMate.archive20, "World Map Ground");
				WorldMapAreaData.spriteIds = new GraphicsDefaults();
				WorldMapAreaData.spriteIds.decode(GameEngine.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1981855199"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (MouseHandler.localPlayer.x >> 7 == Client.destinationX && MouseHandler.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		UserComparator4.method2149();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			ApproximateRouteStrategy.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		ClanChannel.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				ApproximateRouteStrategy.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		ClanChannel.addNpcsToScene(false);
		ItemContainer.method1793();
		class52.method1653();
		Interpreter.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var18;
		int var19;
		int var28;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field492 / 256 > var4) {
				var4 = Client.field492 / 256;
			}

			if (Client.field655[4] && Client.field608[4] + 128 > var4) {
				var4 = Client.field608[4] + 128;
			}

			var28 = Client.camAngleY & 2047;
			var6 = KeyHandler.oculusOrbFocalPointX;
			var7 = class270.field3532;
			var8 = ArchiveDiskAction.oculusOrbFocalPointY;
			var9 = var4 * 3 + 600;
			var12 = var3 - 334;
			if (var12 < 0) {
				var12 = 0;
			} else if (var12 > 100) {
				var12 = 100;
			}

			var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight;
			var11 = var13 * var9 / 256;
			var12 = 2048 - var4 & 2047;
			var13 = 2048 - var28 & 2047;
			var14 = 0;
			var15 = 0;
			var16 = var11;
			int var17;
			if (var12 != 0) {
				var17 = Rasterizer3D.Rasterizer3D_sine[var12];
				var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
				var19 = var15 * var18 - var11 * var17 >> 16;
				var16 = var15 * var17 + var11 * var18 >> 16;
				var15 = var19;
			}

			if (var13 != 0) {
				var17 = Rasterizer3D.Rasterizer3D_sine[var13];
				var18 = Rasterizer3D.Rasterizer3D_cosine[var13];
				var19 = var17 * var16 + var14 * var18 >> 16;
				var16 = var16 * var18 - var17 * var14 >> 16;
				var14 = var19;
			}

			ItemContainer.cameraX = var6 - var14;
			Bounds.cameraY = var7 - var15;
			WorldMapArchiveLoader.cameraZ = var8 - var16;
			class116.cameraPitch = var4;
			class117.cameraYaw = var28;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (KeyHandler.oculusOrbFocalPointX >> 7 != MouseHandler.localPlayer.x >> 7 || ArchiveDiskAction.oculusOrbFocalPointY >> 7 != MouseHandler.localPlayer.y >> 7)) {
				var17 = MouseHandler.localPlayer.plane;
				var18 = (KeyHandler.oculusOrbFocalPointX >> 7) + GrandExchangeOfferNameComparator.baseX;
				var19 = (ArchiveDiskAction.oculusOrbFocalPointY >> 7) + NPC.baseY;
				class342.method6089(var18, var19, var17, true);
			}
		}

		if (!Client.isCameraLocked) {
			var4 = UserComparator4.method2150();
		} else {
			var4 = ItemLayer.method3791();
		}

		var28 = ItemContainer.cameraX;
		var6 = Bounds.cameraY;
		var7 = WorldMapArchiveLoader.cameraZ;
		var8 = class116.cameraPitch;
		var9 = class117.cameraYaw;

		int var10;
		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field655[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field436[var10] * 2 + 1) - (double)Client.field436[var10] + Math.sin((double)Client.field658[var10] / 100.0D * (double)Client.field659[var10]) * (double)Client.field608[var10]);
				if (var10 == 0) {
					ItemContainer.cameraX += var11;
				}

				if (var10 == 1) {
					Bounds.cameraY += var11;
				}

				if (var10 == 2) {
					WorldMapArchiveLoader.cameraZ += var11;
				}

				if (var10 == 3) {
					class117.cameraYaw = var11 + class117.cameraYaw & 2047;
				}

				if (var10 == 4) {
					class116.cameraPitch += var11;
					if (class116.cameraPitch < 128) {
						class116.cameraPitch = 128;
					}

					if (class116.cameraPitch > 383) {
						class116.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x;
		var11 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var10 = MouseHandler.MouseHandler_lastPressedX;
			var11 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			var12 = var10 - var0;
			var13 = var11 - var1;
			ViewportMouse.ViewportMouse_x = var12;
			ViewportMouse.ViewportMouse_y = var13;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ItemContainer.method1783();
		}

		class262.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class262.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		WorldMapIcon_1.scene.draw(ItemContainer.cameraX, Bounds.cameraY, WorldMapArchiveLoader.cameraZ, class116.cameraPitch, class117.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		class262.playPcmPlayers();
		WorldMapIcon_1.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var32 = false;
		var14 = -1;
		var15 = -1;
		var16 = Players.Players_count;
		int[] var29 = Players.Players_indices;

		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var31;
			if (var18 < var16) {
				var31 = Client.players[var29[var18]];
				if (var29[var18] == Client.combatTargetPlayerIndex) {
					var32 = true;
					var14 = var18;
					continue;
				}

				if (var31 == MouseHandler.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var31 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			VertexNormal.drawActor2d((Actor)var31, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			VertexNormal.drawActor2d(MouseHandler.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var32) {
			VertexNormal.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			var19 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var30 = 0; var30 < var18; ++var30) {
					if (var20 + 2 > Client.overheadTextYs[var30] - Client.overheadTextAscents[var30] && var20 - var22 < Client.overheadTextYs[var30] + 2 && var19 - var21 < Client.overheadTextXOffsets[var30] + Client.overheadTextXs[var30] && var19 + var21 > Client.overheadTextXs[var30] - Client.overheadTextXOffsets[var30] && Client.overheadTextYs[var30] - Client.overheadTextAscents[var30] < var20) {
						var20 = Client.overheadTextYs[var30] - Client.overheadTextAscents[var30];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var24 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field626[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) {
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) {
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) {
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) {
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) {
					TaskHandler.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					TaskHandler.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					TaskHandler.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					TaskHandler.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (TaskHandler.fontBold12.stringWidth(var24) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					TaskHandler.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var18] == 5) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					int var27 = 0;
					if (var26 < 25) {
						var27 = var26 - 25;
					} else if (var26 > 125) {
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - TaskHandler.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					TaskHandler.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				TaskHandler.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			FriendLoginUpdate.worldToScreen((Client.hintArrowX - GrandExchangeOfferNameComparator.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - NPC.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				SpotAnimationDefinition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field555);
		Client.field521 = 0;
		var13 = (MouseHandler.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX;
		var14 = (MouseHandler.localPlayer.y >> 7) + NPC.baseY;
		if (var13 >= 3053 && var13 <= 3156 && var14 >= 3056 && var14 <= 3136) {
			Client.field521 = 1;
		}

		if (var13 >= 3072 && var13 <= 3118 && var14 >= 9492 && var14 <= 9535) {
			Client.field521 = 1;
		}

		if (Client.field521 == 1 && var13 >= 3139 && var13 <= 3199 && var14 >= 3008 && var14 <= 3062) {
			Client.field521 = 0;
		}

		ItemContainer.cameraX = var28;
		Bounds.cameraY = var6;
		WorldMapArchiveLoader.cameraZ = var7;
		class116.cameraPitch = var8;
		class117.cameraYaw = var9;
		if (Client.isLoading) {
			byte var33 = 0;
			var14 = var33 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			DevicePcmPlayerProvider.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
