import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lik;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Ljx;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		signature = "(Lik;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-61"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lcb;",
		garbageValue = "-200581175"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1424696628"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5014();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1011181344"
	)
	public static void method2137(String var0, String var1, int var2, int var3) throws IOException {
		WorldMapDecoration.idxCount = var3;
		RouteStrategy.cacheGamebuild = var2;

		try {
			class225.field2587 = System.getProperty("os.name");
		} catch (Exception var29) {
			class225.field2587 = "Unknown";
		}

		JagexCache.field2077 = class225.field2587.toLowerCase();

		try {
			ArchiveLoader.userHomeDirectory = System.getProperty("user.home");
			if (ArchiveLoader.userHomeDirectory != null) {
				ArchiveLoader.userHomeDirectory = ArchiveLoader.userHomeDirectory + "/";
			}
		} catch (Exception var28) {
		}

		try {
			if (JagexCache.field2077.startsWith("win")) {
				if (ArchiveLoader.userHomeDirectory == null) {
					ArchiveLoader.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (ArchiveLoader.userHomeDirectory == null) {
				ArchiveLoader.userHomeDirectory = System.getenv("HOME");
			}

			if (ArchiveLoader.userHomeDirectory != null) {
				ArchiveLoader.userHomeDirectory = ArchiveLoader.userHomeDirectory + "/";
			}
		} catch (Exception var27) {
		}

		if (ArchiveLoader.userHomeDirectory == null) {
			ArchiveLoader.userHomeDirectory = "~/";
		}

		class234.field3096 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ArchiveLoader.userHomeDirectory, "/tmp/", ""};
		InterfaceParent.field590 = new String[]{".jagex_cache_" + RouteStrategy.cacheGamebuild, ".file_store_" + RouteStrategy.cacheGamebuild};
		int var18 = 0;

		label248:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(ArchiveLoader.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			int var12;
			int var14;
			File var34;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

					Buffer var11;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) {
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte();
					if (var12 < 1 || var12 > 3) {
						throw new IOException("" + var12);
					}

					int var13 = 0;
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed();
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8();
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close();
				} catch (IOException var31) {
					var31.printStackTrace();
				}

				if (var7 != null) {
					var34 = new File(var7);
					if (!var34.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var34 = new File(var7, "test.dat");

					boolean var37;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var34, "rw");
						var14 = var19.read();
						var19.seek(0L);
						var19.write(var14);
						var19.seek(0L);
						var19.close();
						var34.delete();
						var37 = true;
					} catch (Exception var26) {
						var37 = false;
					}

					if (!var37) {
						var7 = null;
					}
				}
			}

			if (var7 == null && var18 == 0) {
				label223:
				for (int var20 = 0; var20 < InterfaceParent.field590.length; ++var20) {
					for (int var21 = 0; var21 < class234.field3096.length; ++var21) {
						File var22 = new File(class234.field3096[var21] + InterfaceParent.field590[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists() && class4.method58(new File(var22, "test.dat"), true)) {
							var7 = var22.toString();
							var9 = true;
							break label223;
						}
					}
				}
			}

			if (var7 == null) {
				var7 = ArchiveLoader.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true;
			}

			if (var8 != null) {
				File var33 = new File(var8);
				var34 = new File(var7);

				try {
					File[] var40 = var33.listFiles();
					File[] var38 = var40;

					for (var14 = 0; var14 < var38.length; ++var14) {
						File var15 = var38[var14];
						File var16 = new File(var34, var15.getName());
						boolean var17 = var15.renameTo(var16);
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var30) {
					var30.printStackTrace();
				}

				var9 = true;
			}

			if (var9) {
				Client.method1803(new File(var7), (File)null);
			}

			File var5 = new File(var7);
			JagexCache.cacheDir = var5;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var32 = JagexCache.cacheDir.listFiles();
			if (var32 != null) {
				File[] var35 = var32;

				for (int var23 = 0; var23 < var35.length; ++var23) {
					File var24 = var35[var23];

					boolean var39;
					try {
						RandomAccessFile var36 = new RandomAccessFile(var24, "rw");
						var12 = var36.read();
						var36.seek(0L);
						var36.write(var12);
						var36.seek(0L);
						var36.close();
						var39 = true;
					} catch (Exception var25) {
						var39 = false;
					}

					if (!var39) {
						++var18;
						continue label248;
					}
				}
			}
			break;
		}

		MusicPatch.method4025(JagexCache.cacheDir);
		MusicPatchNode.method3970();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GameBuild.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GameBuild.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		JagexCache.JagexCache_idxFiles = new BufferedFile[WorldMapDecoration.idxCount];

		for (var18 = 0; var18 < WorldMapDecoration.idxCount; ++var18) {
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(GameBuild.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;IIB)[Llh;",
		garbageValue = "-91"
	)
	public static IndexedSprite[] method2125(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class3.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class232.method4279();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-631398790"
	)
	public static void method2133() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-57"
	)
	@Export("load")
	static void load() {
		int var0;
		if (Client.titleLoadingStage == 0) {
			UserComparator3.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			class3.sceneMinimapSprite = new Sprite(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			MilliClock.archive0 = WorldMapSection3.newArchive(0, false, true, true);
			Message.archive1 = WorldMapSection3.newArchive(1, false, true, true);
			Clock.archive2 = WorldMapSection3.newArchive(2, true, false, true);
			class105.archive3 = WorldMapSection3.newArchive(3, false, true, true);
			GrandExchangeOffer.archive4 = WorldMapSection3.newArchive(4, false, true, true);
			WorldMapRectangle.archive5 = WorldMapSection3.newArchive(5, true, true, true);
			UserComparator7.archive6 = WorldMapSection3.newArchive(6, true, true, true);
			Projectile.archive7 = WorldMapSection3.newArchive(7, false, true, true);
			GrandExchangeEvent.archive8 = WorldMapSection3.newArchive(8, false, true, true);
			Tile.archive9 = WorldMapSection3.newArchive(9, false, true, true);
			GraphicsObject.archive10 = WorldMapSection3.newArchive(10, false, true, true);
			WorldMapData_0.archive11 = WorldMapSection3.newArchive(11, false, true, true);
			Message.archive12 = WorldMapSection3.newArchive(12, false, true, true);
			GameBuild.archive13 = WorldMapSection3.newArchive(13, true, false, true);
			WorldMapIcon_1.archive14 = WorldMapSection3.newArchive(14, false, true, true);
			WorldMapLabel.archive15 = WorldMapSection3.newArchive(15, false, true, true);
			AbstractWorldMapIcon.archive17 = WorldMapSection3.newArchive(17, true, true, true);
			VarcInt.archive18 = WorldMapSection3.newArchive(18, false, true, true);
			WorldMapData_0.archive19 = WorldMapSection3.newArchive(19, false, true, true);
			ClientPacket.archive20 = WorldMapSection3.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var28 = 0;
			var0 = var28 + MilliClock.archive0.percentage() * 4 / 100;
			var0 += Message.archive1.percentage() * 4 / 100;
			var0 += Clock.archive2.percentage() * 2 / 100;
			var0 += class105.archive3.percentage() * 2 / 100;
			var0 += GrandExchangeOffer.archive4.percentage() * 6 / 100;
			var0 += WorldMapRectangle.archive5.percentage() * 4 / 100;
			var0 += UserComparator7.archive6.percentage() * 2 / 100;
			var0 += Projectile.archive7.percentage() * 56 / 100;
			var0 += GrandExchangeEvent.archive8.percentage() * 2 / 100;
			var0 += Tile.archive9.percentage() * 2 / 100;
			var0 += GraphicsObject.archive10.percentage() * 2 / 100;
			var0 += WorldMapData_0.archive11.percentage() * 2 / 100;
			var0 += Message.archive12.percentage() * 2 / 100;
			var0 += GameBuild.archive13.percentage() * 2 / 100;
			var0 += WorldMapIcon_1.archive14.percentage() * 2 / 100;
			var0 += WorldMapLabel.archive15.percentage() * 2 / 100;
			var0 += WorldMapData_0.archive19.percentage() / 100;
			var0 += VarcInt.archive18.percentage() / 100;
			var0 += ClientPacket.archive20.percentage() / 100;
			var0 += AbstractWorldMapIcon.archive17.method4456() && AbstractWorldMapIcon.archive17.isFullyLoaded() ? 1 : 0;
			if (var0 != 100) {
				if (var0 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				WorldMapSprite.method481(MilliClock.archive0, "Animations");
				WorldMapSprite.method481(Message.archive1, "Skeletons");
				WorldMapSprite.method481(GrandExchangeOffer.archive4, "Sound FX");
				WorldMapSprite.method481(WorldMapRectangle.archive5, "Maps");
				WorldMapSprite.method481(UserComparator7.archive6, "Music Tracks");
				WorldMapSprite.method481(Projectile.archive7, "Models");
				WorldMapSprite.method481(GrandExchangeEvent.archive8, "Sprites");
				WorldMapSprite.method481(WorldMapData_0.archive11, "Music Jingles");
				WorldMapSprite.method481(WorldMapIcon_1.archive14, "Music Samples");
				WorldMapSprite.method481(WorldMapLabel.archive15, "Music Patches");
				WorldMapSprite.method481(WorldMapData_0.archive19, "World Map");
				WorldMapSprite.method481(VarcInt.archive18, "World Map Geography");
				WorldMapSprite.method481(ClientPacket.archive20, "World Map Ground");
				UserComparator10.spriteIds = new GraphicsDefaults();
				UserComparator10.spriteIds.decode(AbstractWorldMapIcon.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var1;
			Archive var2;
			if (Client.titleLoadingStage == 45) {
				class200.method3803(22050, !Client.isLowDetail, 2);
				MidiPcmStream var31 = new MidiPcmStream();
				var31.method3935(9, 128);
				class2.pcmPlayer0 = FontName.method5519(GrandExchangeOfferAgeComparator.taskHandler, 0, 22050);
				class2.pcmPlayer0.setStream(var31);
				var1 = WorldMapLabel.archive15;
				var2 = WorldMapIcon_1.archive14;
				Archive var27 = GrandExchangeOffer.archive4;
				class206.musicPatchesArchive = var1;
				class206.musicSamplesArchive = var2;
				class206.soundEffectsArchive = var27;
				WorldMapSprite.midiPcmStream = var31;
				class58.pcmPlayer1 = FontName.method5519(GrandExchangeOfferAgeComparator.taskHandler, 1, 2048);
				class60.pcmStreamMixer = new PcmStreamMixer();
				class58.pcmPlayer1.setStream(class60.pcmStreamMixer);
				class197.decimator = new Decimator(22050, class237.field3113);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				WorldMapSection0.WorldMapElement_fonts = new Fonts(GrandExchangeEvent.archive8, GameBuild.archive13);
			} else {
				int var22;
				if (Client.titleLoadingStage == 50) {
					FontName[] var30 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
					var22 = var30.length;
					Fonts var26 = WorldMapSection0.WorldMapElement_fonts;
					FontName[] var3 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
					Client.fontsMap = var26.createMap(var3);
					if (Client.fontsMap.size() < var22) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var22 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						WorldMapLabel.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						MusicPatchNode2.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						GrandExchangeOfferNameComparator.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class13.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else if (Client.titleLoadingStage == 60) {
					var0 = ArchiveDiskActionHandler.method4429(GraphicsObject.archive10, GrandExchangeEvent.archive8);
					byte var32 = 12;
					if (var0 < var32) {
						Login.Login_loadingText = "Loading title screen - " + var0 * 100 / var32 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						ClientPreferences.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!Clock.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + Clock.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var29 = Clock.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var29;
						ObjectSound.method1999(Clock.archive2);
						GrandExchangeOfferUnitPriceComparator.method195(Clock.archive2, Projectile.archive7);
						var1 = Clock.archive2;
						var2 = Projectile.archive7;
						boolean var33 = Client.isLowDetail;
						ObjectDefinition.ObjectDefinition_archive = var1;
						ObjectDefinition.ObjectDefinition_modelsArchive = var2;
						ObjectDefinition.ObjectDefinition_isLowDetail = var33;
						Archive var4 = Clock.archive2;
						Archive var5 = Projectile.archive7;
						NPCDefinition.NpcDefinition_archive = var4;
						NPCDefinition.NpcDefinition_modelArchive = var5;
						class197.method3771(Clock.archive2);
						UserComparator3.method3548(Clock.archive2, Projectile.archive7, Client.isMembersWorld, WorldMapLabel.fontPlain11);
						Archive var6 = Clock.archive2;
						Archive var7 = MilliClock.archive0;
						Archive var8 = Message.archive1;
						SequenceDefinition.SequenceDefinition_archive = var6;
						SequenceDefinition.SequenceDefinition_animationsArchive = var7;
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var8;
						MenuAction.method2171(Clock.archive2, Projectile.archive7);
						Archive var9 = Clock.archive2;
						VarbitDefinition.VarbitDefinition_archive = var9;
						TileItem.method2256(Clock.archive2);
						UserComparator4.method3495(class105.archive3, Projectile.archive7, GrandExchangeEvent.archive8, GameBuild.archive13);
						Archive var10 = Clock.archive2;
						InvDefinition.InvDefinition_archive = var10;
						UserComparator8.method3520(Clock.archive2);
						Archive var11 = Clock.archive2;
						VarcInt.VarcInt_archive = var11;
						class8.method103(Clock.archive2);
						AttackOption.varcs = new Varcs();
						Archive var12 = Clock.archive2;
						Archive var13 = GrandExchangeEvent.archive8;
						Archive var14 = GameBuild.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var12;
						HitSplatDefinition.field3356 = var13;
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var14;
						Archive var15 = Clock.archive2;
						Archive var16 = GrandExchangeEvent.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var15;
						HealthBarDefinition.HitSplatDefinition_spritesArchive = var16;
						Archive var17 = Clock.archive2;
						Archive var18 = GrandExchangeEvent.archive8;
						WorldMapElement.WorldMapElement_archive = var18;
						if (var17.isFullyLoaded()) {
							WorldMapElement.WorldMapElement_count = var17.getGroupFileCount(35);
							class257.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

							for (int var19 = 0; var19 < WorldMapElement.WorldMapElement_count; ++var19) {
								byte[] var20 = var17.takeFile(35, var19);
								class257.WorldMapElement_cached[var19] = new WorldMapElement(var19);
								if (var20 != null) {
									class257.WorldMapElement_cached[var19].decode(new Buffer(var20));
									class257.WorldMapElement_cached[var19].method4548();
								}
							}
						}

						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var0 = 0;
					if (GrandExchangeOfferNameComparator.compass == null) {
						GrandExchangeOfferNameComparator.compass = GameShell.SpriteBuffer_getSprite(GrandExchangeEvent.archive8, UserComparator10.spriteIds.compass, 0);
					} else {
						++var0;
					}

					if (UrlRequester.redHintArrowSprite == null) {
						UrlRequester.redHintArrowSprite = GameShell.SpriteBuffer_getSprite(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3825, 0);
					} else {
						++var0;
					}

					if (UserComparator6.mapSceneSprites == null) {
						UserComparator6.mapSceneSprites = method2125(GrandExchangeEvent.archive8, UserComparator10.spriteIds.mapScenes, 0);
					} else {
						++var0;
					}

					if (CollisionMap.headIconPkSprites == null) {
						CollisionMap.headIconPkSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.headIconsPk, 0);
					} else {
						++var0;
					}

					if (KeyHandler.headIconPrayerSprites == null) {
						KeyHandler.headIconPrayerSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3828, 0);
					} else {
						++var0;
					}

					if (SoundSystem.headIconHintSprites == null) {
						SoundSystem.headIconHintSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3829, 0);
					} else {
						++var0;
					}

					if (class9.mapMarkerSprites == null) {
						class9.mapMarkerSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3830, 0);
					} else {
						++var0;
					}

					if (Timer.crossSprites == null) {
						Timer.crossSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3831, 0);
					} else {
						++var0;
					}

					if (AttackOption.mapDotSprites == null) {
						AttackOption.mapDotSprites = class217.method4091(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3834, 0);
					} else {
						++var0;
					}

					if (WorldMapElement.scrollBarSprites == null) {
						WorldMapElement.scrollBarSprites = method2125(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3824, 0);
					} else {
						++var0;
					}

					if (class4.modIconSprites == null) {
						class4.modIconSprites = method2125(GrandExchangeEvent.archive8, UserComparator10.spriteIds.field3832, 0);
					} else {
						++var0;
					}

					if (var0 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = class4.modIconSprites;
						UrlRequester.redHintArrowSprite.normalize();
						var22 = (int)(Math.random() * 21.0D) - 10;
						int var23 = (int)(Math.random() * 21.0D) - 10;
						int var24 = (int)(Math.random() * 21.0D) - 10;
						int var25 = (int)(Math.random() * 41.0D) - 20;
						UserComparator6.mapSceneSprites[0].shiftColors(var25 + var22, var25 + var23, var25 + var24);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!Tile.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						UserComparator3.textureProvider = new TextureProvider(Tile.archive9, GrandExchangeEvent.archive8, 20, 0.8D, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(UserComparator3.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(0.8D);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var0 = UserComparator3.textureProvider.getLoadedPercentage();
					if (var0 < 100) {
						Login.Login_loadingText = "Loading textures - " + var0 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					class219.mouseRecorder = new MouseRecorder();
					GrandExchangeOfferAgeComparator.taskHandler.newThreadTask(class219.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!GraphicsObject.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var21 = new Huffman(GraphicsObject.archive10.takeFileByNames("huffman", ""));
						class219.huffman = var21;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class105.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class105.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!Message.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + Message.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!GameBuild.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + GameBuild.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!WorldMapData_0.archive19.tryLoadGroupByName(WorldMapCacheName.field322.name)) {
						Login.Login_loadingText = "Loading world map - " + WorldMapData_0.archive19.groupLoadPercentByName(WorldMapCacheName.field322.name) / 10 + "%";
					} else {
						if (class228.worldMap == null) {
							class228.worldMap = new WorldMap();
							class228.worldMap.init(WorldMapData_0.archive19, VarcInt.archive18, ClientPacket.archive20, GrandExchangeOfferNameComparator.fontBold12, Client.fontsMap, UserComparator6.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					ClientPreferences.updateGameState(10);
				}
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		signature = "(IIIS)V",
		garbageValue = "3305"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = Language.getTileHeight(var0, var1, TileItemPile.Client_plane) - var2;
			var0 -= MouseHandler.cameraX;
			var3 -= WorldMapSection3.cameraY;
			var1 -= ObjectSound.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[TilePaint.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[TilePaint.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[Canvas.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[Canvas.cameraYaw];
			int var8 = var0 * var7 + var6 * var1 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
