import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("q")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1229527393
	)
	@Export("index")
	int index;
	@ObfuscatedName("n")
	volatile boolean field3952;
	@ObfuscatedName("s")
	boolean field3953;
	@ObfuscatedName("l")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -359474927
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1182663877
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -523880279
	)
	int field3947;

	static {
		Archive_crc = new CRC32(); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(Lnw;Lnw;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5); // L: 23
		this.field3952 = false; // L: 14
		this.field3953 = false; // L: 15
		this.field3947 = -1; // L: 20
		this.archiveDisk = var1; // L: 24
		this.masterDisk = var2; // L: 25
		this.index = var3; // L: 26
		this.field3953 = var6; // L: 27
		int var8 = this.index; // L: 29
		if (Huffman.NetCache_reference != null) { // L: 31
			Huffman.NetCache_reference.offset = var8 * 8 + 5; // L: 32
			int var9 = Huffman.NetCache_reference.readInt(); // L: 33
			int var10 = Huffman.NetCache_reference.readInt(); // L: 34
			this.loadIndex(var9, var10); // L: 35
		} else {
			Language.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 38
			NetCache.NetCache_archives[var8] = this; // L: 39
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1338724730"
	)
	public boolean method5815() {
		return this.field3952; // L: 44
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3952) { // L: 48
			return 100;
		} else if (super.groups != null) { // L: 49
			return 99;
		} else {
			int var2 = this.index; // L: 51
			long var3 = (long)(var2 + 16711680); // L: 53
			int var1;
			if (class271.NetCache_currentResponse != null && class271.NetCache_currentResponse.key == var3) { // L: 54
				var1 = class194.NetCache_responseArchiveBuffer.offset * 99 / (class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding) + 1; // L: 58
			} else {
				var1 = 0; // L: 55
			}

			int var5 = var1; // L: 60
			if (var1 >= 100) { // L: 61
				var5 = 99;
			}

			return var5; // L: 62
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2136943756"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		Projectile.method1975(this.index, var1); // L: 66
	} // L: 67

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class17.method256(var1, this.archiveDisk, this); // L: 70
		} else {
			Language.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 71
		}

	} // L: 72

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2075639401"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 75
		this.indexVersion = var2; // L: 76
		if (this.masterDisk != null) { // L: 77
			class17.method256(this.index, this.masterDisk, this);
		} else {
			Language.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 78
		}

	} // L: 79

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "2057711923"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 82
			if (this.field3952) { // L: 83
				throw new RuntimeException(); // L: 84
			}

			if (this.masterDisk != null) { // L: 86
				int var5 = this.index; // L: 87
				ArchiveDisk var6 = this.masterDisk; // L: 88
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 90
				var7.type = 0; // L: 91
				var7.key = (long)var5; // L: 92
				var7.data = var2; // L: 93
				var7.archiveDisk = var6; // L: 94
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 95
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 96
				} // L: 97

				TileItem.method2395(); // L: 98
			}

			this.decodeIndex(var2); // L: 101
			this.loadAllLocal(); // L: 102
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 105
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 106
			if (this.archiveDisk != null) { // L: 107
				ArchiveDisk var11 = this.archiveDisk; // L: 108
				ArchiveDiskAction var14 = new ArchiveDiskAction(); // L: 110
				var14.type = 0; // L: 111
				var14.key = (long)var1; // L: 112
				var14.data = var2; // L: 113
				var14.archiveDisk = var11; // L: 114
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 115
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14); // L: 116
				} // L: 117

				TileItem.method2395(); // L: 118
				this.validGroups[var1] = true; // L: 120
			}

			if (var4) {
				super.groups[var1] = InterfaceParent.method2084(var2, false); // L: 122
			}
		}

	} // L: 124

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I[BZB)V",
		garbageValue = "82"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 127
			if (this.field3952) { // L: 128
				throw new RuntimeException(); // L: 129
			}

			if (var3 == null) { // L: 131
				Language.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 132
				return; // L: 133
			}

			Archive_crc.reset(); // L: 135
			Archive_crc.update(var3, 0, var3.length); // L: 136
			var5 = (int)Archive_crc.getValue(); // L: 137
			if (var5 != this.indexCrc) { // L: 138
				Language.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 139
				return; // L: 140
			}

			Buffer var9 = new Buffer(Actor.decompressBytes(var3)); // L: 142
			int var7 = var9.readUnsignedByte(); // L: 143
			if (var7 != 5 && var7 != 6) { // L: 144
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 145
			if (var7 >= 6) { // L: 146
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 147
				Language.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 148
				return; // L: 149
			}

			this.decodeIndex(var3); // L: 151
			this.loadAllLocal(); // L: 152
		} else {
			if (!var4 && var2 == this.field3947) { // L: 155
				this.field3952 = true; // L: 156
			}

			if (var3 == null || var3.length <= 2) { // L: 158
				this.validGroups[var2] = false; // L: 159
				if (this.field3953 || var4) { // L: 160
					Language.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 161
			}

			Archive_crc.reset(); // L: 163
			Archive_crc.update(var3, 0, var3.length - 2); // L: 164
			var5 = (int)Archive_crc.getValue(); // L: 165
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 166
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 167
				this.validGroups[var2] = false; // L: 168
				if (this.field3953 || var4) { // L: 169
					Language.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 170
			}

			this.validGroups[var2] = true; // L: 172
			if (var4) { // L: 173
				super.groups[var2] = InterfaceParent.method2084(var3, false);
			}
		}

	} // L: 175

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 178

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 179
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 180
			this.field3952 = true; // L: 181
		} else {
			this.field3947 = -1; // L: 184

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 185
				if (super.fileCounts[var1] > 0) { // L: 186
					ArchiveDisk var2 = this.archiveDisk; // L: 187
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 190
					var4.type = 1; // L: 191
					var4.key = (long)var1; // L: 192
					var4.archiveDisk = var2; // L: 193
					var4.archive = this; // L: 194
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 195
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 196
					} // L: 197

					TileItem.method2395(); // L: 198
					this.field3947 = var1; // L: 200
				}
			}

			if (this.field3947 == -1) { // L: 203
				this.field3952 = true;
			}

		}
	} // L: 182 204

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1034622346"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 207
			return 100;
		} else if (this.validGroups[var1]) { // L: 208
			return 100;
		} else {
			int var3 = this.index; // L: 210
			long var4 = (long)((var3 << 16) + var1); // L: 212
			int var2;
			if (class271.NetCache_currentResponse != null && class271.NetCache_currentResponse.key == var4) { // L: 213
				var2 = class194.NetCache_responseArchiveBuffer.offset * 99 / (class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding) + 1; // L: 217
			} else {
				var2 = 0; // L: 214
			}

			return var2; // L: 219
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1922129831"
	)
	public boolean method5814(int var1) {
		return this.validGroups[var1]; // L: 223
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1391440725"
	)
	public boolean method5824(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 227
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 231
		int var2 = 0; // L: 232

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 233
			if (super.fileCounts[var3] > 0) { // L: 234
				var1 += 100; // L: 235
				var2 += this.groupLoadPercent(var3); // L: 236
			}
		}

		if (var1 == 0) { // L: 239
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 240
			return var3; // L: 241
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "875632133"
	)
	@Export("load")
	static void load() {
		int var14;
		if (Client.titleLoadingStage == 0) { // L: 1477
			ArchiveLoader.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1478

			for (var14 = 0; var14 < 4; ++var14) { // L: 1479
				Client.collisionMaps[var14] = new CollisionMap(104, 104);
			}

			HealthBarUpdate.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1480
			Login.Login_loadingText = "Starting game engine..."; // L: 1481
			Login.Login_loadingPercent = 5; // L: 1482
			Client.titleLoadingStage = 20; // L: 1483
		} else if (Client.titleLoadingStage == 20) { // L: 1486
			Login.Login_loadingText = "Prepared visibility map"; // L: 1487
			Login.Login_loadingPercent = 10; // L: 1488
			Client.titleLoadingStage = 30; // L: 1489
		} else if (Client.titleLoadingStage == 30) { // L: 1492
			KeyHandler.archive0 = WorldMapID.newArchive(0, false, true, true); // L: 1493
			UserComparator8.archive1 = WorldMapID.newArchive(1, false, true, true); // L: 1494
			class10.archive2 = WorldMapID.newArchive(2, true, false, true); // L: 1495
			BufferedNetSocket.archive3 = WorldMapID.newArchive(3, false, true, true); // L: 1496
			class182.archive4 = WorldMapID.newArchive(4, false, true, true); // L: 1497
			Players.archive5 = WorldMapID.newArchive(5, true, true, true); // L: 1498
			class16.archive6 = WorldMapID.newArchive(6, true, true, true); // L: 1499
			LoginScreenAnimation.archive7 = WorldMapID.newArchive(7, false, true, true); // L: 1500
			class145.archive8 = WorldMapID.newArchive(8, false, true, true); // L: 1501
			WorldMapDecorationType.archive9 = WorldMapID.newArchive(9, false, true, true); // L: 1502
			JagexCache.archive10 = WorldMapID.newArchive(10, false, true, true); // L: 1503
			Message.archive11 = WorldMapID.newArchive(11, false, true, true); // L: 1504
			class152.archive12 = WorldMapID.newArchive(12, false, true, true); // L: 1505
			class166.archive13 = WorldMapID.newArchive(13, true, false, true); // L: 1506
			class291.archive14 = WorldMapID.newArchive(14, false, true, true); // L: 1507
			class28.archive15 = WorldMapID.newArchive(15, false, true, true); // L: 1508
			class54.archive17 = WorldMapID.newArchive(17, true, true, true); // L: 1509
			WorldMapRectangle.archive18 = WorldMapID.newArchive(18, false, true, true); // L: 1510
			ObjectSound.archive19 = WorldMapID.newArchive(19, false, true, true); // L: 1511
			ApproximateRouteStrategy.archive20 = WorldMapID.newArchive(20, false, true, true); // L: 1512
			Login.Login_loadingText = "Connecting to update server"; // L: 1513
			Login.Login_loadingPercent = 20; // L: 1514
			Client.titleLoadingStage = 40; // L: 1515
		} else if (Client.titleLoadingStage == 40) { // L: 1518
			byte var33 = 0; // L: 1519
			var14 = var33 + KeyHandler.archive0.percentage() * 4 / 100; // L: 1520
			var14 += UserComparator8.archive1.percentage() * 4 / 100; // L: 1521
			var14 += class10.archive2.percentage() * 2 / 100; // L: 1522
			var14 += BufferedNetSocket.archive3.percentage() * 2 / 100; // L: 1523
			var14 += class182.archive4.percentage() * 6 / 100; // L: 1524
			var14 += Players.archive5.percentage() * 4 / 100; // L: 1525
			var14 += class16.archive6.percentage() * 2 / 100; // L: 1526
			var14 += LoginScreenAnimation.archive7.percentage() * 56 / 100; // L: 1527
			var14 += class145.archive8.percentage() * 2 / 100; // L: 1528
			var14 += WorldMapDecorationType.archive9.percentage() * 2 / 100; // L: 1529
			var14 += JagexCache.archive10.percentage() * 2 / 100; // L: 1530
			var14 += Message.archive11.percentage() * 2 / 100; // L: 1531
			var14 += class152.archive12.percentage() * 2 / 100; // L: 1532
			var14 += class166.archive13.percentage() * 2 / 100; // L: 1533
			var14 += class291.archive14.percentage() * 2 / 100; // L: 1534
			var14 += class28.archive15.percentage() * 2 / 100; // L: 1535
			var14 += ObjectSound.archive19.percentage() / 100; // L: 1536
			var14 += WorldMapRectangle.archive18.percentage() / 100; // L: 1537
			var14 += ApproximateRouteStrategy.archive20.percentage() / 100; // L: 1538
			var14 += class54.archive17.method5815() && class54.archive17.isFullyLoaded() ? 1 : 0; // L: 1539
			if (var14 != 100) { // L: 1540
				if (var14 != 0) { // L: 1541
					Login.Login_loadingText = "Checking for updates - " + var14 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1542
			} else {
				class1.method8(KeyHandler.archive0, "Animations"); // L: 1545
				class1.method8(UserComparator8.archive1, "Skeletons"); // L: 1546
				class1.method8(class182.archive4, "Sound FX"); // L: 1547
				class1.method8(Players.archive5, "Maps"); // L: 1548
				class1.method8(class16.archive6, "Music Tracks"); // L: 1549
				class1.method8(LoginScreenAnimation.archive7, "Models"); // L: 1550
				class1.method8(class145.archive8, "Sprites"); // L: 1551
				class1.method8(Message.archive11, "Music Jingles"); // L: 1552
				class1.method8(class291.archive14, "Music Samples"); // L: 1553
				class1.method8(class28.archive15, "Music Patches"); // L: 1554
				class1.method8(ObjectSound.archive19, "World Map"); // L: 1555
				class1.method8(WorldMapRectangle.archive18, "World Map Geography"); // L: 1556
				class1.method8(ApproximateRouteStrategy.archive20, "World Map Ground"); // L: 1557
				Language.spriteIds = new GraphicsDefaults(); // L: 1558
				Language.spriteIds.decode(class54.archive17); // L: 1559
				Login.Login_loadingText = "Loaded update list"; // L: 1560
				Login.Login_loadingPercent = 30; // L: 1561
				Client.titleLoadingStage = 45; // L: 1562
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1565
			class78.method2082(22050, !Client.isLowDetail, 2); // L: 1566
			MidiPcmStream var24 = new MidiPcmStream(); // L: 1567
			var24.method5248(9, 128); // L: 1568
			KeyHandler.pcmPlayer0 = Varps.method5523(GameEngine.taskHandler, 0, 22050); // L: 1569
			KeyHandler.pcmPlayer0.setStream(var24); // L: 1570
			AbstractWorldMapData.method4342(class28.archive15, class291.archive14, class182.archive4, var24); // L: 1571
			ViewportMouse.pcmPlayer1 = Varps.method5523(GameEngine.taskHandler, 1, 2048); // L: 1572
			StructComposition.pcmStreamMixer = new PcmStreamMixer(); // L: 1573
			ViewportMouse.pcmPlayer1.setStream(StructComposition.pcmStreamMixer); // L: 1574
			WorldMapRectangle.decimator = new Decimator(22050, PcmPlayer.field268); // L: 1575
			Login.Login_loadingText = "Prepared sound engine"; // L: 1576
			Login.Login_loadingPercent = 35; // L: 1577
			Client.titleLoadingStage = 50; // L: 1578
			AbstractWorldMapData.WorldMapElement_fonts = new Fonts(class145.archive8, class166.archive13); // L: 1579
		} else {
			int var15;
			if (Client.titleLoadingStage == 50) { // L: 1582
				FontName[] var23 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13}; // L: 1585
				var15 = var23.length; // L: 1587
				Fonts var25 = AbstractWorldMapData.WorldMapElement_fonts; // L: 1588
				FontName[] var31 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13}; // L: 1591
				Client.fontsMap = var25.createMap(var31); // L: 1593
				if (Client.fontsMap.size() < var15) { // L: 1594
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var15 + "%"; // L: 1595
					Login.Login_loadingPercent = 40; // L: 1596
				} else {
					class113.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1599
					class13.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1600
					RouteStrategy.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1601
					class263.platformInfo = Client.platformInfoProvider.get(); // L: 1602
					Login.Login_loadingText = "Loaded fonts"; // L: 1603
					Login.Login_loadingPercent = 40; // L: 1604
					Client.titleLoadingStage = 60; // L: 1605
				}
			} else {
				Archive var2;
				int var3;
				Archive var26;
				int var29;
				if (Client.titleLoadingStage == 60) { // L: 1608
					var26 = JagexCache.archive10; // L: 1610
					var2 = class145.archive8; // L: 1611
					var3 = 0; // L: 1613
					String[] var32 = Login.field917; // L: 1615

					int var21;
					String var28;
					for (var21 = 0; var21 < var32.length; ++var21) { // L: 1616
						var28 = var32[var21]; // L: 1617
						if (var26.tryLoadFileByNames(var28, "")) { // L: 1619
							++var3;
						}
					}

					var32 = Login.field918; // L: 1624

					for (var21 = 0; var21 < var32.length; ++var21) { // L: 1625
						var28 = var32[var21]; // L: 1626
						if (var2.tryLoadFileByNames(var28, "")) { // L: 1628
							++var3;
						}
					}

					var29 = Login.field917.length + Login.field918.length; // L: 1637
					if (var3 < var29) { // L: 1640
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var29 + "%"; // L: 1641
						Login.Login_loadingPercent = 50; // L: 1642
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1645
						Login.Login_loadingPercent = 50; // L: 1646
						Decimator.updateGameState(5); // L: 1647
						Client.titleLoadingStage = 70; // L: 1648
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1651
					if (!class10.archive2.isFullyLoaded()) { // L: 1652
						Login.Login_loadingText = "Loading config - " + class10.archive2.loadPercent() + "%"; // L: 1653
						Login.Login_loadingPercent = 60; // L: 1654
					} else {
						Archive var22 = class10.archive2; // L: 1657
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var22; // L: 1659
						var26 = class10.archive2; // L: 1661
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26; // L: 1663
						var2 = class10.archive2; // L: 1665
						Archive var17 = LoginScreenAnimation.archive7; // L: 1666
						KitDefinition.KitDefinition_archive = var2; // L: 1668
						class147.KitDefinition_modelsArchive = var17; // L: 1669
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1670
						Archive var18 = class10.archive2; // L: 1672
						Archive var27 = LoginScreenAnimation.archive7; // L: 1673
						boolean var19 = Client.isLowDetail; // L: 1674
						WorldMapData_0.ObjectDefinition_archive = var18; // L: 1676
						ObjectComposition.ObjectDefinition_modelsArchive = var27; // L: 1677
						ObjectComposition.ObjectDefinition_isLowDetail = var19; // L: 1678
						KitDefinition.method3452(class10.archive2, LoginScreenAnimation.archive7); // L: 1680
						Archive var20 = class10.archive2; // L: 1681
						StructComposition.StructDefinition_archive = var20; // L: 1683
						class163.method3318(class10.archive2, LoginScreenAnimation.archive7, Client.isMembersWorld, class113.fontPlain11); // L: 1685
						class125.method2811(class10.archive2, KeyHandler.archive0, UserComparator8.archive1); // L: 1686
						Archive var30 = class10.archive2; // L: 1687
						Archive var9 = LoginScreenAnimation.archive7; // L: 1688
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var30; // L: 1690
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var9; // L: 1691
						Archive var10 = class10.archive2; // L: 1693
						class11.VarbitDefinition_archive = var10; // L: 1695
						Archive var11 = class10.archive2; // L: 1697
						VarpDefinition.VarpDefinition_archive = var11; // L: 1699
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1700
						Renderable.method4917(BufferedNetSocket.archive3, LoginScreenAnimation.archive7, class145.archive8, class166.archive13); // L: 1702
						WorldMapEvent.method4506(class10.archive2); // L: 1703
						Canvas.method357(class10.archive2); // L: 1704
						Archive var12 = class10.archive2; // L: 1705
						class384.VarcInt_archive = var12; // L: 1707
						Bounds.method6969(class10.archive2); // L: 1709
						Archive var13 = class10.archive2; // L: 1710
						ParamComposition.ParamDefinition_archive = var13; // L: 1712
						ReflectionCheck.HitSplatDefinition_cachedSprites = new class426(Messages.field1305, 54, Skills.clientLanguage, class10.archive2); // L: 1714
						DirectByteArrayCopier.HitSplatDefinition_cached = new class426(Messages.field1305, 47, Skills.clientLanguage, class10.archive2); // L: 1715
						class160.varcs = new Varcs(); // L: 1716
						UserComparator7.method2590(class10.archive2, class145.archive8, class166.archive13); // L: 1717
						UserComparator5.method2592(class10.archive2, class145.archive8); // L: 1718
						class152.method3170(class10.archive2, class145.archive8); // L: 1719
						Login.Login_loadingText = "Loaded config"; // L: 1720
						Login.Login_loadingPercent = 60; // L: 1721
						Client.titleLoadingStage = 80; // L: 1722
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1725
					var14 = 0; // L: 1726
					if (class14.compass == null) { // L: 1727
						class14.compass = class6.SpriteBuffer_getSprite(class145.archive8, Language.spriteIds.compass, 0);
					} else {
						++var14; // L: 1728
					}

					if (Canvas.redHintArrowSprite == null) { // L: 1729
						Canvas.redHintArrowSprite = class6.SpriteBuffer_getSprite(class145.archive8, Language.spriteIds.field4314, 0);
					} else {
						++var14; // L: 1730
					}

					IndexedSprite[] var1;
					boolean var4;
					byte[] var5;
					IndexedSprite[] var6;
					int var7;
					IndexedSprite var8;
					if (GraphicsDefaults.mapSceneSprites == null) { // L: 1731
						var2 = class145.archive8; // L: 1733
						var3 = Language.spriteIds.mapScenes; // L: 1734
						var5 = var2.takeFile(var3, 0); // L: 1738
						if (var5 == null) { // L: 1739
							var4 = false; // L: 1740
						} else {
							WorldMapArea.SpriteBuffer_decode(var5); // L: 1743
							var4 = true; // L: 1744
						}

						if (!var4) { // L: 1746
							var1 = null; // L: 1747
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount]; // L: 1752

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) { // L: 1753
								var8 = var6[var7] = new IndexedSprite(); // L: 1754
								var8.width = class451.SpriteBuffer_spriteWidth; // L: 1755
								var8.height = class451.SpriteBuffer_spriteHeight; // L: 1756
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7]; // L: 1757
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7]; // L: 1758
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7]; // L: 1759
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7]; // L: 1760
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette; // L: 1761
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7]; // L: 1762
							}

							ArchiveDiskActionHandler.method5813(); // L: 1764
							var1 = var6; // L: 1767
						}

						GraphicsDefaults.mapSceneSprites = var1; // L: 1769
					} else {
						++var14; // L: 1771
					}

					if (class150.headIconPkSprites == null) { // L: 1772
						class150.headIconPkSprites = class429.method7568(class145.archive8, Language.spriteIds.headIconsPk, 0);
					} else {
						++var14; // L: 1773
					}

					if (WallDecoration.headIconPrayerSprites == null) { // L: 1774
						WallDecoration.headIconPrayerSprites = class429.method7568(class145.archive8, Language.spriteIds.field4322, 0);
					} else {
						++var14; // L: 1775
					}

					if (InvDefinition.headIconHintSprites == null) { // L: 1776
						InvDefinition.headIconHintSprites = class429.method7568(class145.archive8, Language.spriteIds.field4318, 0);
					} else {
						++var14; // L: 1777
					}

					if (WorldMapLabelSize.mapMarkerSprites == null) { // L: 1778
						WorldMapLabelSize.mapMarkerSprites = class429.method7568(class145.archive8, Language.spriteIds.field4319, 0);
					} else {
						++var14; // L: 1779
					}

					if (class11.crossSprites == null) { // L: 1780
						class11.crossSprites = class429.method7568(class145.archive8, Language.spriteIds.field4320, 0);
					} else {
						++var14; // L: 1781
					}

					if (class54.mapDotSprites == null) { // L: 1782
						class54.mapDotSprites = class429.method7568(class145.archive8, Language.spriteIds.field4321, 0);
					} else {
						++var14; // L: 1783
					}

					if (class29.scrollBarSprites == null) { // L: 1784
						var2 = class145.archive8; // L: 1786
						var3 = Language.spriteIds.field4315; // L: 1787
						var5 = var2.takeFile(var3, 0); // L: 1791
						if (var5 == null) { // L: 1792
							var4 = false; // L: 1793
						} else {
							WorldMapArea.SpriteBuffer_decode(var5); // L: 1796
							var4 = true; // L: 1797
						}

						if (!var4) { // L: 1799
							var1 = null; // L: 1800
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount]; // L: 1805

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) { // L: 1806
								var8 = var6[var7] = new IndexedSprite(); // L: 1807
								var8.width = class451.SpriteBuffer_spriteWidth; // L: 1808
								var8.height = class451.SpriteBuffer_spriteHeight; // L: 1809
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7]; // L: 1810
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7]; // L: 1811
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7]; // L: 1812
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7]; // L: 1813
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette; // L: 1814
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7]; // L: 1815
							}

							ArchiveDiskActionHandler.method5813(); // L: 1817
							var1 = var6; // L: 1820
						}

						class29.scrollBarSprites = var1; // L: 1822
					} else {
						++var14; // L: 1824
					}

					if (PcmPlayer.modIconSprites == null) { // L: 1825
						var2 = class145.archive8; // L: 1827
						var3 = Language.spriteIds.field4323; // L: 1828
						var5 = var2.takeFile(var3, 0); // L: 1832
						if (var5 == null) { // L: 1833
							var4 = false; // L: 1834
						} else {
							WorldMapArea.SpriteBuffer_decode(var5); // L: 1837
							var4 = true; // L: 1838
						}

						if (!var4) { // L: 1840
							var1 = null; // L: 1841
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount]; // L: 1846

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) { // L: 1847
								var8 = var6[var7] = new IndexedSprite(); // L: 1848
								var8.width = class451.SpriteBuffer_spriteWidth; // L: 1849
								var8.height = class451.SpriteBuffer_spriteHeight; // L: 1850
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7]; // L: 1851
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7]; // L: 1852
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7]; // L: 1853
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7]; // L: 1854
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette; // L: 1855
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7]; // L: 1856
							}

							ArchiveDiskActionHandler.method5813(); // L: 1858
							var1 = var6; // L: 1861
						}

						PcmPlayer.modIconSprites = var1; // L: 1863
					} else {
						++var14; // L: 1865
					}

					if (var14 < 11) { // L: 1866
						Login.Login_loadingText = "Loading sprites - " + var14 * 100 / 12 + "%"; // L: 1867
						Login.Login_loadingPercent = 70; // L: 1868
					} else {
						AbstractFont.AbstractFont_modIconSprites = PcmPlayer.modIconSprites; // L: 1871
						Canvas.redHintArrowSprite.normalize(); // L: 1872
						var15 = (int)(Math.random() * 21.0D) - 10; // L: 1873
						int var16 = (int)(Math.random() * 21.0D) - 10; // L: 1874
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1875
						var29 = (int)(Math.random() * 41.0D) - 20; // L: 1876
						GraphicsDefaults.mapSceneSprites[0].shiftColors(var15 + var29, var29 + var16, var29 + var3); // L: 1877
						Login.Login_loadingText = "Loaded sprites"; // L: 1878
						Login.Login_loadingPercent = 70; // L: 1879
						Client.titleLoadingStage = 90; // L: 1880
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1883
					if (!WorldMapDecorationType.archive9.isFullyLoaded()) { // L: 1884
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1885
						Login.Login_loadingPercent = 90; // L: 1886
					} else {
						class138.textureProvider = new TextureProvider(WorldMapDecorationType.archive9, class145.archive8, 20, class131.clientPreferences.method2240(), Client.isLowDetail ? 64 : 128); // L: 1889
						Rasterizer3D.Rasterizer3D_setTextureLoader(class138.textureProvider); // L: 1890
						Rasterizer3D.Rasterizer3D_setBrightness(class131.clientPreferences.method2240()); // L: 1891
						Client.titleLoadingStage = 100; // L: 1892
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1895
					var14 = class138.textureProvider.getLoadedPercentage(); // L: 1896
					if (var14 < 100) { // L: 1897
						Login.Login_loadingText = "Loading textures - " + var14 + "%"; // L: 1898
						Login.Login_loadingPercent = 90; // L: 1899
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1902
						Login.Login_loadingPercent = 90; // L: 1903
						Client.titleLoadingStage = 110; // L: 1904
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1907
					class120.mouseRecorder = new MouseRecorder(); // L: 1908
					GameEngine.taskHandler.newThreadTask(class120.mouseRecorder, 10); // L: 1909
					Login.Login_loadingText = "Loaded input handler"; // L: 1910
					Login.Login_loadingPercent = 92; // L: 1911
					Client.titleLoadingStage = 120; // L: 1912
				} else if (Client.titleLoadingStage == 120) { // L: 1915
					if (!JagexCache.archive10.tryLoadFileByNames("huffman", "")) { // L: 1916
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1917
						Login.Login_loadingPercent = 94; // L: 1918
					} else {
						Huffman var0 = new Huffman(JagexCache.archive10.takeFileByNames("huffman", "")); // L: 1921
						class282.huffman = var0; // L: 1923
						Login.Login_loadingText = "Loaded wordpack"; // L: 1925
						Login.Login_loadingPercent = 94; // L: 1926
						Client.titleLoadingStage = 130; // L: 1927
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1930
					if (!BufferedNetSocket.archive3.isFullyLoaded()) { // L: 1931
						Login.Login_loadingText = "Loading interfaces - " + BufferedNetSocket.archive3.loadPercent() * 4 / 5 + "%"; // L: 1932
						Login.Login_loadingPercent = 96; // L: 1933
					} else if (!class152.archive12.isFullyLoaded()) { // L: 1936
						Login.Login_loadingText = "Loading interfaces - " + (80 + class152.archive12.loadPercent() / 6) + "%"; // L: 1937
						Login.Login_loadingPercent = 96; // L: 1938
					} else if (!class166.archive13.isFullyLoaded()) { // L: 1941
						Login.Login_loadingText = "Loading interfaces - " + (96 + class166.archive13.loadPercent() / 50) + "%"; // L: 1942
						Login.Login_loadingPercent = 96; // L: 1943
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1946
						Login.Login_loadingPercent = 98; // L: 1947
						Client.titleLoadingStage = 140; // L: 1948
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1951
					Login.Login_loadingPercent = 100; // L: 1952
					if (!ObjectSound.archive19.tryLoadGroupByName(WorldMapCacheName.field2413.name)) { // L: 1953
						Login.Login_loadingText = "Loading world map - " + ObjectSound.archive19.groupLoadPercentByName(WorldMapCacheName.field2413.name) / 10 + "%"; // L: 1954
					} else {
						if (ScriptFrame.worldMap == null) { // L: 1957
							ScriptFrame.worldMap = new WorldMap(); // L: 1958
							ScriptFrame.worldMap.init(ObjectSound.archive19, WorldMapRectangle.archive18, ApproximateRouteStrategy.archive20, RouteStrategy.fontBold12, Client.fontsMap, GraphicsDefaults.mapSceneSprites); // L: 1959
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1961
						Client.titleLoadingStage = 150; // L: 1962
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1965
					Decimator.updateGameState(10); // L: 1966
				}
			}
		}
	} // L: 1484 1490 1516 1543 1563 1580 1597 1606 1643 1649 1655 1723 1869 1881 1887 1893 1900 1905 1913 1919 1928 1934 1939 1944 1949 1955 1963 1967 1969
}
