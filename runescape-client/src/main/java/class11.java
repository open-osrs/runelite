import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("w")
class class11 implements TlsAuthentication {
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("i")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field65 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-480736632"
	)
	public static void method105() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1585776634"
	)
	@Export("load")
	static void load() {
		int var25;
		if (Client.titleLoadingStage == 0) {
			PlayerComposition.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var25 = 0; var25 < 4; ++var25) {
				Client.collisionMaps[var25] = new CollisionMap(104, 104);
			}

			sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			ClanChannel.archive0 = ItemLayer.newArchive(0, false, true, true);
			MouseRecorder.archive1 = ItemLayer.newArchive(1, false, true, true);
			RouteStrategy.archive2 = ItemLayer.newArchive(2, true, false, true);
			class150.archive3 = ItemLayer.newArchive(3, false, true, true);
			class260.archive4 = ItemLayer.newArchive(4, false, true, true);
			ApproximateRouteStrategy.archive5 = ItemLayer.newArchive(5, true, true, true);
			Tiles.archive6 = ItemLayer.newArchive(6, true, true, true);
			Skeleton.archive7 = ItemLayer.newArchive(7, false, true, true);
			class176.archive8 = ItemLayer.newArchive(8, false, true, true);
			Interpreter.archive9 = ItemLayer.newArchive(9, false, true, true);
			UserComparator8.archive10 = ItemLayer.newArchive(10, false, true, true);
			class4.archive11 = ItemLayer.newArchive(11, false, true, true);
			UserComparator6.archive12 = ItemLayer.newArchive(12, false, true, true);
			class54.archive13 = ItemLayer.newArchive(13, true, false, true);
			class28.archive14 = ItemLayer.newArchive(14, false, true, true);
			class12.archive15 = ItemLayer.newArchive(15, false, true, true);
			ItemContainer.archive17 = ItemLayer.newArchive(17, true, true, true);
			TextureProvider.archive18 = ItemLayer.newArchive(18, false, true, true);
			ViewportMouse.archive19 = ItemLayer.newArchive(19, false, true, true);
			class54.archive20 = ItemLayer.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var43 = 0;
			var25 = var43 + ClanChannel.archive0.percentage() * 4 / 100;
			var25 += MouseRecorder.archive1.percentage() * 4 / 100;
			var25 += RouteStrategy.archive2.percentage() * 2 / 100;
			var25 += class150.archive3.percentage() * 2 / 100;
			var25 += class260.archive4.percentage() * 6 / 100;
			var25 += ApproximateRouteStrategy.archive5.percentage() * 4 / 100;
			var25 += Tiles.archive6.percentage() * 2 / 100;
			var25 += Skeleton.archive7.percentage() * 56 / 100;
			var25 += class176.archive8.percentage() * 2 / 100;
			var25 += Interpreter.archive9.percentage() * 2 / 100;
			var25 += UserComparator8.archive10.percentage() * 2 / 100;
			var25 += class4.archive11.percentage() * 2 / 100;
			var25 += UserComparator6.archive12.percentage() * 2 / 100;
			var25 += class54.archive13.percentage() * 2 / 100;
			var25 += class28.archive14.percentage() * 2 / 100;
			var25 += class12.archive15.percentage() * 2 / 100;
			var25 += ViewportMouse.archive19.percentage() / 100;
			var25 += TextureProvider.archive18.percentage() / 100;
			var25 += class54.archive20.percentage() / 100;
			var25 += ItemContainer.archive17.method5201() && ItemContainer.archive17.isFullyLoaded() ? 1 : 0;
			if (var25 != 100) {
				if (var25 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var25 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class13.method167(ClanChannel.archive0, "Animations");
				class13.method167(MouseRecorder.archive1, "Skeletons");
				class13.method167(class260.archive4, "Sound FX");
				class13.method167(ApproximateRouteStrategy.archive5, "Maps");
				class13.method167(Tiles.archive6, "Music Tracks");
				class13.method167(Skeleton.archive7, "Models");
				class13.method167(class176.archive8, "Sprites");
				class13.method167(class4.archive11, "Music Jingles");
				class13.method167(class28.archive14, "Music Samples");
				class13.method167(class12.archive15, "Music Patches");
				class13.method167(ViewportMouse.archive19, "World Map");
				class13.method167(TextureProvider.archive18, "World Map Geography");
				class13.method167(class54.archive20, "World Map Ground");
				class131.spriteIds = new GraphicsDefaults();
				class131.spriteIds.decode(ItemContainer.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else if (Client.titleLoadingStage == 45) {
			boolean var42 = !Client.isLowDetail;
			PcmPlayer.field279 = 22050;
			PcmPlayer.PcmPlayer_stereo = var42;
			PcmPlayer.field283 = 2;
			MidiPcmStream var38 = new MidiPcmStream();
			var38.method4736(9, 128);
			class126.pcmPlayer0 = HitSplatDefinition.method3194(GameEngine.taskHandler, 0, 22050);
			class126.pcmPlayer0.setStream(var38);
			class264.method5077(class12.archive15, class28.archive14, class260.archive4, var38);
			class116.pcmPlayer1 = HitSplatDefinition.method3194(GameEngine.taskHandler, 1, 2048);
			ApproximateRouteStrategy.pcmStreamMixer = new PcmStreamMixer();
			class116.pcmPlayer1.setStream(ApproximateRouteStrategy.pcmStreamMixer);
			RouteStrategy.decimator = new Decimator(22050, PcmPlayer.field279);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = 35;
			Client.titleLoadingStage = 50;
			class196.WorldMapElement_fonts = new Fonts(class176.archive8, class54.archive13);
		} else {
			int var26;
			if (Client.titleLoadingStage == 50) {
				FontName[] var35 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11};
				var26 = var35.length;
				Fonts var36 = class196.WorldMapElement_fonts;
				FontName[] var41 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11};
				Client.fontsMap = var36.createMap(var41);
				if (Client.fontsMap.size() < var26) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					UserComparator8.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					class262.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					Interpreter.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					MenuAction.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else if (Client.titleLoadingStage == 60) {
				var25 = MouseHandler.method614(UserComparator8.archive10, class176.archive8);
				var26 = Login.field907.length + Login.field890.length;
				if (var25 < var26) {
					Login.Login_loadingText = "Loading title screen - " + var25 * 100 / var26 + "%";
					Login.Login_loadingPercent = 50;
				} else {
					Login.Login_loadingText = "Loaded title screen";
					Login.Login_loadingPercent = 50;
					UserList.updateGameState(5);
					Client.titleLoadingStage = 70;
				}
			} else {
				Archive var2;
				if (Client.titleLoadingStage == 70) {
					if (!RouteStrategy.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + RouteStrategy.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var34 = RouteStrategy.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var34;
						GrandExchangeOfferTotalQuantityComparator.method5361(RouteStrategy.archive2);
						Archive var37 = RouteStrategy.archive2;
						var2 = Skeleton.archive7;
						KitDefinition.KitDefinition_archive = var37;
						KitDefinition.KitDefinition_modelsArchive = var2;
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
						class114.method2490(RouteStrategy.archive2, Skeleton.archive7, Client.isLowDetail);
						class128.method2662(RouteStrategy.archive2, Skeleton.archive7);
						class157.method2982(RouteStrategy.archive2);
						Archive var29 = RouteStrategy.archive2;
						Archive var4 = Skeleton.archive7;
						boolean var30 = Client.isMembersWorld;
						Font var31 = UserComparator8.fontPlain11;
						UserComparator4.ItemDefinition_archive = var29;
						ItemComposition.ItemDefinition_modelArchive = var4;
						ItemComposition.ItemDefinition_inMembersWorld = var30;
						class17.ItemDefinition_fileCount = UserComparator4.ItemDefinition_archive.getGroupFileCount(10);
						ItemComposition.ItemDefinition_fontPlain11 = var31;
						Archive var39 = RouteStrategy.archive2;
						Archive var32 = ClanChannel.archive0;
						Archive var40 = MouseRecorder.archive1;
						class395.SequenceDefinition_archive = var39;
						class13.SequenceDefinition_animationsArchive = var32;
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var40;
						HealthBarDefinition.method2978(RouteStrategy.archive2, Skeleton.archive7);
						Archive var33 = RouteStrategy.archive2;
						VarbitComposition.VarbitDefinition_archive = var33;
						Archive var11 = RouteStrategy.archive2;
						class351.VarpDefinition_archive = var11;
						VarpDefinition.VarpDefinition_fileCount = class351.VarpDefinition_archive.getGroupFileCount(16);
						Archive var12 = class150.archive3;
						Archive var13 = Skeleton.archive7;
						Archive var14 = class176.archive8;
						Archive var15 = class54.archive13;
						Widget.Widget_archive = var12;
						Widget.Widget_modelsArchive = var13;
						IntHashTable.Widget_spritesArchive = var14;
						SecureRandomFuture.Widget_fontsArchive = var15;
						Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][];
						class157.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()];
						Language.method5481(RouteStrategy.archive2);
						FriendsList.method5954(RouteStrategy.archive2);
						Archive var16 = RouteStrategy.archive2;
						VarcInt.VarcInt_archive = var16;
						Archive var17 = RouteStrategy.archive2;
						DevicePcmPlayerProvider.ParamDefinition_archive = var17;
						TriBool.field3979 = new class387(class392.field4267, 54, ReflectionCheck.clientLanguage, RouteStrategy.archive2);
						WorldMapIcon_1.HitSplatDefinition_cachedSprites = new class387(class392.field4267, 47, ReflectionCheck.clientLanguage, RouteStrategy.archive2);
						Tile.varcs = new Varcs();
						Archive var18 = RouteStrategy.archive2;
						Archive var19 = class176.archive8;
						Archive var20 = class54.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var18;
						HitSplatDefinition.field1799 = var19;
						class17.HitSplatDefinition_fontsArchive = var20;
						AttackOption.method2262(RouteStrategy.archive2, class176.archive8);
						Archive var21 = RouteStrategy.archive2;
						Archive var22 = class176.archive8;
						WorldMapElement.WorldMapElement_archive = var22;
						if (var21.isFullyLoaded()) {
							WorldMapElement.WorldMapElement_count = var21.getGroupFileCount(35);
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

							for (int var23 = 0; var23 < WorldMapElement.WorldMapElement_count; ++var23) {
								byte[] var24 = var21.takeFile(35, var23);
								WorldMapElement.WorldMapElement_cached[var23] = new WorldMapElement(var23);
								if (var24 != null) {
									WorldMapElement.WorldMapElement_cached[var23].decode(new Buffer(var24));
									WorldMapElement.WorldMapElement_cached[var23].method2900();
								}
							}
						}

						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var25 = 0;
					if (class4.compass == null) {
						class4.compass = AccessFile.SpriteBuffer_getSprite(class176.archive8, class131.spriteIds.compass, 0);
					} else {
						++var25;
					}

					if (class21.redHintArrowSprite == null) {
						class21.redHintArrowSprite = AccessFile.SpriteBuffer_getSprite(class176.archive8, class131.spriteIds.field4014, 0);
					} else {
						++var25;
					}

					if (GrandExchangeOfferTotalQuantityComparator.mapSceneSprites == null) {
						GrandExchangeOfferTotalQuantityComparator.mapSceneSprites = KitDefinition.method2934(class176.archive8, class131.spriteIds.mapScenes, 0);
					} else {
						++var25;
					}

					SpritePixels[] var1;
					int var3;
					SpritePixels[] var5;
					int var6;
					SpritePixels var7;
					int var8;
					byte[] var9;
					int var10;
					if (class21.headIconPkSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.headIconsPk;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subHeight * var7.subWidth;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class21.headIconPkSprites = var1;
					} else {
						++var25;
					}

					if (HealthBarUpdate.headIconPrayerSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.field4017;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subHeight * var7.subWidth;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						HealthBarUpdate.headIconPrayerSprites = var1;
					} else {
						++var25;
					}

					if (UserComparator4.headIconHintSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.field4015;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						UserComparator4.headIconHintSprites = var1;
					} else {
						++var25;
					}

					if (Client.mapMarkerSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.field4018;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						Client.mapMarkerSprites = var1;
					} else {
						++var25;
					}

					if (SecureRandomFuture.crossSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.field4020;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subHeight * var7.subWidth;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						SecureRandomFuture.crossSprites = var1;
					} else {
						++var25;
					}

					if (class119.mapDotSprites == null) {
						var2 = class176.archive8;
						var3 = class131.spriteIds.field4019;
						if (!VarbitComposition.method3102(var2, var3, 0)) {
							var1 = null;
						} else {
							var5 = new SpritePixels[class414.SpriteBuffer_spriteCount];
							var6 = 0;

							while (true) {
								if (var6 >= class414.SpriteBuffer_spriteCount) {
									StudioGame.method5130();
									var1 = var5;
									break;
								}

								var7 = var5[var6] = new SpritePixels();
								var7.width = class414.SpriteBuffer_spriteWidth;
								var7.height = class408.SpriteBuffer_spriteHeight;
								var7.xOffset = class135.SpriteBuffer_xOffsets[var6];
								var7.yOffset = class131.SpriteBuffer_yOffsets[var6];
								var7.subWidth = class414.SpriteBuffer_spriteWidths[var6];
								var7.subHeight = class16.SpriteBuffer_spriteHeights[var6];
								var8 = var7.subWidth * var7.subHeight;
								var9 = class414.SpriteBuffer_pixels[var6];
								var7.pixels = new int[var8];

								for (var10 = 0; var10 < var8; ++var10) {
									var7.pixels[var10] = class351.SpriteBuffer_spritePalette[var9[var10] & 255];
								}

								++var6;
							}
						}

						class119.mapDotSprites = var1;
					} else {
						++var25;
					}

					if (WorldMapDecoration.scrollBarSprites == null) {
						WorldMapDecoration.scrollBarSprites = KitDefinition.method2934(class176.archive8, class131.spriteIds.field4022, 0);
					} else {
						++var25;
					}

					if (ApproximateRouteStrategy.modIconSprites == null) {
						ApproximateRouteStrategy.modIconSprites = KitDefinition.method2934(class176.archive8, class131.spriteIds.field4013, 0);
					} else {
						++var25;
					}

					if (var25 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var25 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = ApproximateRouteStrategy.modIconSprites;
						class21.redHintArrowSprite.normalize();
						var26 = (int)(Math.random() * 21.0D) - 10;
						int var27 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						int var28 = (int)(Math.random() * 41.0D) - 20;
						GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[0].shiftColors(var28 + var26, var27 + var28, var28 + var3);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!Interpreter.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						Language.textureProvider = new TextureProvider(Interpreter.archive9, class176.archive8, 20, WorldMapDecorationType.clientPreferences.brightness, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(Language.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(WorldMapDecorationType.clientPreferences.brightness);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var25 = Language.textureProvider.getLoadedPercentage();
					if (var25 < 100) {
						Login.Login_loadingText = "Loading textures - " + var25 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					ClientPreferences.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(ClientPreferences.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!UserComparator8.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(UserComparator8.archive10.takeFileByNames("huffman", ""));
						class264.huffman = var0;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class150.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class150.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!UserComparator6.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + UserComparator6.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class54.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + class54.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!ViewportMouse.archive19.tryLoadGroupByName(WorldMapCacheName.field2220.name)) {
						Login.Login_loadingText = "Loading world map - " + ViewportMouse.archive19.groupLoadPercentByName(WorldMapCacheName.field2220.name) / 10 + "%";
					} else {
						if (TileItem.worldMap == null) {
							TileItem.worldMap = new WorldMap();
							TileItem.worldMap.init(ViewportMouse.archive19, TextureProvider.archive18, class54.archive20, Interpreter.fontBold12, Client.fontsMap, GrandExchangeOfferTotalQuantityComparator.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					UserList.updateGameState(10);
				}
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "836711710"
	)
	static final void method110(int var0, int var1, int var2, int var3) {
		class115.method2501();
	}
}
