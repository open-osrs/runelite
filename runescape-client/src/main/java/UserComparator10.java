import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1996697933
	)
	public static int field1339;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1340087327
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;B)I",
		garbageValue = "77"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1506932580"
	)
	@Export("load")
	static void load() {
		int var18;
		if (Client.titleLoadingStage == 0) {
			class7.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var18 = 0; var18 < 4; ++var18) {
				Client.collisionMaps[var18] = new CollisionMap(104, 104);
			}

			class29.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			class115.archive0 = VarcInt.newArchive(0, false, true, true);
			class9.archive1 = VarcInt.newArchive(1, false, true, true);
			class131.archive2 = VarcInt.newArchive(2, true, false, true);
			class19.archive3 = VarcInt.newArchive(3, false, true, true);
			KeyHandler.archive4 = VarcInt.newArchive(4, false, true, true);
			class140.archive5 = VarcInt.newArchive(5, true, true, true);
			WorldMapScaleHandler.archive6 = VarcInt.newArchive(6, true, true, true);
			class115.archive7 = VarcInt.newArchive(7, false, true, true);
			UserComparator6.archive8 = VarcInt.newArchive(8, false, true, true);
			NetSocket.archive9 = VarcInt.newArchive(9, false, true, true);
			class257.archive10 = VarcInt.newArchive(10, false, true, true);
			Players.archive11 = VarcInt.newArchive(11, false, true, true);
			TaskHandler.archive12 = VarcInt.newArchive(12, false, true, true);
			class1.archive13 = VarcInt.newArchive(13, true, false, true);
			ChatChannel.archive14 = VarcInt.newArchive(14, false, true, true);
			class133.archive15 = VarcInt.newArchive(15, false, true, true);
			class126.archive17 = VarcInt.newArchive(17, true, true, true);
			VertexNormal.archive18 = VarcInt.newArchive(18, false, true, true);
			class148.archive19 = VarcInt.newArchive(19, false, true, true);
			HealthBarUpdate.archive20 = VarcInt.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var41 = 0;
			var18 = var41 + class115.archive0.percentage() * 4 / 100;
			var18 += class9.archive1.percentage() * 4 / 100;
			var18 += class131.archive2.percentage() * 2 / 100;
			var18 += class19.archive3.percentage() * 2 / 100;
			var18 += KeyHandler.archive4.percentage() * 6 / 100;
			var18 += class140.archive5.percentage() * 4 / 100;
			var18 += WorldMapScaleHandler.archive6.percentage() * 2 / 100;
			var18 += class115.archive7.percentage() * 56 / 100;
			var18 += UserComparator6.archive8.percentage() * 2 / 100;
			var18 += NetSocket.archive9.percentage() * 2 / 100;
			var18 += class257.archive10.percentage() * 2 / 100;
			var18 += Players.archive11.percentage() * 2 / 100;
			var18 += TaskHandler.archive12.percentage() * 2 / 100;
			var18 += class1.archive13.percentage() * 2 / 100;
			var18 += ChatChannel.archive14.percentage() * 2 / 100;
			var18 += class133.archive15.percentage() * 2 / 100;
			var18 += class148.archive19.percentage() / 100;
			var18 += VertexNormal.archive18.percentage() / 100;
			var18 += HealthBarUpdate.archive20.percentage() / 100;
			var18 += class126.archive17.method5540() && class126.archive17.isFullyLoaded() ? 1 : 0;
			if (var18 != 100) {
				if (var18 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var18 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				NetFileRequest.method5587(class115.archive0, "Animations");
				NetFileRequest.method5587(class9.archive1, "Skeletons");
				NetFileRequest.method5587(KeyHandler.archive4, "Sound FX");
				NetFileRequest.method5587(class140.archive5, "Maps");
				NetFileRequest.method5587(WorldMapScaleHandler.archive6, "Music Tracks");
				NetFileRequest.method5587(class115.archive7, "Models");
				NetFileRequest.method5587(UserComparator6.archive8, "Sprites");
				NetFileRequest.method5587(Players.archive11, "Music Jingles");
				NetFileRequest.method5587(ChatChannel.archive14, "Music Samples");
				NetFileRequest.method5587(class133.archive15, "Music Patches");
				NetFileRequest.method5587(class148.archive19, "World Map");
				NetFileRequest.method5587(VertexNormal.archive18, "World Map Geography");
				NetFileRequest.method5587(HealthBarUpdate.archive20, "World Map Ground");
				class6.spriteIds = new GraphicsDefaults();
				class6.spriteIds.decode(class126.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var2;
			if (Client.titleLoadingStage == 45) {
				boolean var40 = !Client.isLowDetail;
				class339.field4058 = 22050;
				SpriteMask.PcmPlayer_stereo = var40;
				field1339 = 2;
				MidiPcmStream var37 = new MidiPcmStream();
				var37.method5079(9, 128);
				JagexCache.pcmPlayer0 = class4.method29(GameEngine.taskHandler, 0, 22050);
				JagexCache.pcmPlayer0.setStream(var37);
				var2 = class133.archive15;
				Archive var39 = ChatChannel.archive14;
				Archive var29 = KeyHandler.archive4;
				class260.musicPatchesArchive = var2;
				class331.musicSamplesArchive = var39;
				class260.soundEffectsArchive = var29;
				class260.midiPcmStream = var37;
				PacketWriter.pcmPlayer1 = class4.method29(GameEngine.taskHandler, 1, 2048);
				class281.pcmStreamMixer = new PcmStreamMixer();
				PacketWriter.pcmPlayer1.setStream(class281.pcmStreamMixer);
				BoundaryObject.decimator = new Decimator(22050, class339.field4058);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class126.WorldMapElement_fonts = new Fonts(UserComparator6.archive8, class1.archive13);
			} else {
				int var19;
				if (Client.titleLoadingStage == 50) {
					FontName[] var27 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12};
					var19 = var27.length;
					Fonts var30 = class126.WorldMapElement_fonts;
					FontName[] var25 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12};
					Client.fontsMap = var30.createMap(var25);
					if (Client.fontsMap.size() < var19) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						class307.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class114.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class136.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						Interpreter.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else if (Client.titleLoadingStage == 60) {
					var18 = WorldMapArea.method4490(class257.archive10, UserComparator6.archive8);
					var19 = Login.field893.length + Login.field892.length;
					if (var18 < var19) {
						Login.Login_loadingText = "Loading title screen - " + var18 * 100 / var19 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						VertexNormal.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!class131.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + class131.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var26 = class131.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var26;
						class19.method330(class131.archive2);
						GrandExchangeOfferTotalQuantityComparator.method5725(class131.archive2, class115.archive7);
						class186.method3740(class131.archive2, class115.archive7, Client.isLowDetail);
						class258.method5047(class131.archive2, class115.archive7);
						class221.method4700(class131.archive2);
						Archive var35 = class131.archive2;
						var2 = class115.archive7;
						boolean var32 = Client.isMembersWorld;
						Font var4 = class307.fontPlain11;
						ItemComposition.ItemDefinition_archive = var35;
						ItemComposition.ItemDefinition_modelArchive = var2;
						ItemComposition.ItemDefinition_inMembersWorld = var32;
						WorldMapLabelSize.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
						ItemComposition.ItemDefinition_fontPlain11 = var4;
						Archive var34 = class131.archive2;
						Archive var22 = class115.archive0;
						Archive var36 = class9.archive1;
						Canvas.SequenceDefinition_archive = var34;
						SequenceDefinition.SequenceDefinition_animationsArchive = var22;
						class118.SequenceDefinition_skeletonsArchive = var36;
						TileItem.method2368(class131.archive2, class115.archive7);
						Archive var23 = class131.archive2;
						VarbitComposition.VarbitDefinition_archive = var23;
						Archive var38 = class131.archive2;
						VarpDefinition.VarpDefinition_archive = var38;
						class433.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						class194.method3937(class19.archive3, class115.archive7, UserComparator6.archive8, class1.archive13);
						Archive var24 = class131.archive2;
						InvDefinition.InvDefinition_archive = var24;
						Archive var11 = class131.archive2;
						EnumComposition.EnumDefinition_archive = var11;
						Archive var12 = class131.archive2;
						VarcInt.VarcInt_archive = var12;
						Archive var13 = class131.archive2;
						InterfaceParent.method2145(class131.archive2);
						AbstractSocket.HitSplatDefinition_cachedSprites = new class404(class338.field4054, 54, ScriptFrame.clientLanguage, class131.archive2);
						Ignored.HitSplatDefinition_cached = new class404(class338.field4054, 47, ScriptFrame.clientLanguage, class131.archive2);
						class339.varcs = new Varcs();
						class331.method6174(class131.archive2, UserComparator6.archive8, class1.archive13);
						ObjectSound.method1803(class131.archive2, UserComparator6.archive8);
						Archive var14 = class131.archive2;
						Archive var15 = UserComparator6.archive8;
						WorldMapElement.WorldMapElement_archive = var15;
						if (var14.isFullyLoaded()) {
							class408.WorldMapElement_count = var14.getGroupFileCount(35);
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[class408.WorldMapElement_count];

							for (int var16 = 0; var16 < class408.WorldMapElement_count; ++var16) {
								byte[] var17 = var14.takeFile(35, var16);
								WorldMapElement.WorldMapElement_cached[var16] = new WorldMapElement(var16);
								if (var17 != null) {
									WorldMapElement.WorldMapElement_cached[var16].decode(new Buffer(var17));
									WorldMapElement.WorldMapElement_cached[var16].method3173();
								}
							}
						}

						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var18 = 0;
					if (LoginScreenAnimation.compass == null) {
						LoginScreenAnimation.compass = class6.SpriteBuffer_getSprite(UserComparator6.archive8, class6.spriteIds.compass, 0);
					} else {
						++var18;
					}

					if (PcmPlayer.redHintArrowSprite == null) {
						PcmPlayer.redHintArrowSprite = class6.SpriteBuffer_getSprite(UserComparator6.archive8, class6.spriteIds.field4163, 0);
					} else {
						++var18;
					}

					IndexedSprite[] var1;
					int var3;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (AbstractWorldMapData.mapSceneSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.mapScenes;
						if (!class147.method3009(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = class432.SpriteBuffer_spriteWidth;
								var7.height = class432.SpriteBuffer_spriteHeight;
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var7.palette = class432.SpriteBuffer_spritePalette;
								var7.pixels = class369.SpriteBuffer_pixels[var6];
							}

							UserComparator3.method2529();
							var1 = var5;
						}

						AbstractWorldMapData.mapSceneSprites = var1;
					} else {
						++var18;
					}

					int var8;
					byte[] var9;
					int var10;
					SpritePixels[] var28;
					SpritePixels[] var31;
					SpritePixels var33;
					if (class286.headIconPkSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.headIconsPk;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subHeight * var33.subWidth;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class286.headIconPkSprites = var28;
					} else {
						++var18;
					}

					if (PlayerComposition.headIconPrayerSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4166;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subHeight * var33.subWidth;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						PlayerComposition.headIconPrayerSprites = var28;
					} else {
						++var18;
					}

					if (class260.headIconHintSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4173;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subHeight * var33.subWidth;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class260.headIconHintSprites = var28;
					} else {
						++var18;
					}

					if (UserComparator7.mapMarkerSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4169;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subHeight * var33.subWidth;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						UserComparator7.mapMarkerSprites = var28;
					} else {
						++var18;
					}

					if (UserComparator5.crossSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4168;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subHeight * var33.subWidth;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						UserComparator5.crossSprites = var28;
					} else {
						++var18;
					}

					if (class111.mapDotSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4170;
						if (!class147.method3009(var2, var3, 0)) {
							var28 = null;
						} else {
							var31 = new SpritePixels[class440.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class440.SpriteBuffer_spriteCount) {
									UserComparator3.method2529();
									var28 = var31;
									break;
								}

								var33 = var31[var6] = new SpritePixels();
								var33.width = class432.SpriteBuffer_spriteWidth;
								var33.height = class432.SpriteBuffer_spriteHeight;
								var33.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var33.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var33.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var33.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var8 = var33.subWidth * var33.subHeight;
								var9 = class369.SpriteBuffer_pixels[var6];
								var33.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var33.pixels[var10] = class432.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class111.mapDotSprites = var28;
					} else {
						++var18;
					}

					if (AbstractWorldMapData.scrollBarSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4171;
						if (!class147.method3009(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = class432.SpriteBuffer_spriteWidth;
								var7.height = class432.SpriteBuffer_spriteHeight;
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var7.palette = class432.SpriteBuffer_spritePalette;
								var7.pixels = class369.SpriteBuffer_pixels[var6];
							}

							UserComparator3.method2529();
							var1 = var5;
						}

						AbstractWorldMapData.scrollBarSprites = var1;
					} else {
						++var18;
					}

					if (World.modIconSprites == null) {
						var2 = UserComparator6.archive8;
						var3 = class6.spriteIds.field4172;
						if (!class147.method3009(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

							for (var6 = 0; var6 < class440.SpriteBuffer_spriteCount; ++var6) {
								var7 = var5[var6] = new IndexedSprite();
								var7.width = class432.SpriteBuffer_spriteWidth;
								var7.height = class432.SpriteBuffer_spriteHeight;
								var7.xOffset = class141.SpriteBuffer_xOffsets[var6];
								var7.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class432.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class330.SpriteBuffer_spriteHeights[var6];
								var7.palette = class432.SpriteBuffer_spritePalette;
								var7.pixels = class369.SpriteBuffer_pixels[var6];
							}

							UserComparator3.method2529();
							var1 = var5;
						}

						World.modIconSprites = var1;
					} else {
						++var18;
					}

					if (var18 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var18 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = World.modIconSprites;
						PcmPlayer.redHintArrowSprite.normalize();
						var19 = (int)(Math.random() * 21.0D) - 10;
						int var20 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						int var21 = (int)(Math.random() * 41.0D) - 20;
						AbstractWorldMapData.mapSceneSprites[0].shiftColors(var21 + var19, var20 + var21, var3 + var21);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!NetSocket.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						ItemContainer.textureProvider = new TextureProvider(NetSocket.archive9, UserComparator6.archive8, 20, SecureRandomFuture.clientPreferences.brightness, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(ItemContainer.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(SecureRandomFuture.clientPreferences.brightness);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var18 = ItemContainer.textureProvider.getLoadedPercentage();
					if (var18 < 100) {
						Login.Login_loadingText = "Loading textures - " + var18 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					Client.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(Client.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!class257.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(class257.archive10.takeFileByNames("huffman", ""));
						class410.huffman = var0;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class19.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class19.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!TaskHandler.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + TaskHandler.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class1.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + class1.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!class148.archive19.tryLoadGroupByName(WorldMapCacheName.field2768.name)) {
						Login.Login_loadingText = "Loading world map - " + class148.archive19.groupLoadPercentByName(WorldMapCacheName.field2768.name) / 10 + "%";
					} else {
						if (Varcs.worldMap == null) {
							Varcs.worldMap = new WorldMap();
							Varcs.worldMap.init(class148.archive19, VertexNormal.archive18, HealthBarUpdate.archive20, class136.fontBold12, Client.fontsMap, AbstractWorldMapData.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					VertexNormal.updateGameState(10);
				}
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1832124278"
	)
	static final int method2543() {
		return Client.menuOptionsCount - 1;
	}
}
