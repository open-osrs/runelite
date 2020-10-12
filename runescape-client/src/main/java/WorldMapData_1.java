import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive19;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1032395207
	)
	int chunkXLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1804098781
	)
	int chunkYLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1816930541
	)
	int chunkX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 875347201
	)
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "-5"
	)
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field288.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method5634(); // L: 28
			super.fileId = var1.method5634(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "728123848"
	)
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field198 = new byte[super.planes][64][64]; // L: 36
		super.field191 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class39.field280.value) { // L: 40
			throw new IllegalStateException(""); // L: 41
		} else {
			int var3 = var1.readUnsignedByte(); // L: 43
			int var4 = var1.readUnsignedByte(); // L: 44
			int var5 = var1.readUnsignedByte(); // L: 45
			int var6 = var1.readUnsignedByte(); // L: 46
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 47
				for (int var7 = 0; var7 < 8; ++var7) { // L: 50
					for (int var8 = 0; var8 < 8; ++var8) { // L: 51
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 52
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 48
			}
		}
	} // L: 55

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-173161380"
	)
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1289176366"
	)
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1672760755"
	)
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-56911987"
	)
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) { // L: 62
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void savePreferences() {
		AccessFile var0 = null; // L: 81

		try {
			var0 = class2.getPreferencesFile("", Tiles.field532.name, true); // L: 83
			Buffer var1 = Tile.clientPreferences.toBuffer(); // L: 84
			var0.write(var1.array, 0, var1.offset); // L: 85
		} catch (Exception var3) { // L: 87
		}

		try {
			if (var0 != null) { // L: 89
				var0.closeSync(true); // L: 90
			}
		} catch (Exception var2) { // L: 93
		}

	} // L: 94

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "570960818"
	)
	protected static int getGcDuration() {
		int var0 = 0; // L: 549
		if (WorldMapIcon_0.garbageCollector == null || !WorldMapIcon_0.garbageCollector.isValid()) { // L: 550
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 552

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 553
					if (var2.isValid()) { // L: 555
						WorldMapIcon_0.garbageCollector = var2; // L: 556
						GameShell.garbageCollectorLastCheckTimeMs = -1L; // L: 557
						GameShell.garbageCollectorLastCollectionTime = -1L; // L: 558
					}
				}
			} catch (Throwable var11) { // L: 563
			}
		}

		if (WorldMapIcon_0.garbageCollector != null) { // L: 565
			long var9 = PacketWriter.currentTimeMillis(); // L: 566
			long var3 = WorldMapIcon_0.garbageCollector.getCollectionTime(); // L: 567
			if (-1L != GameShell.garbageCollectorLastCollectionTime) { // L: 568
				long var5 = var3 - GameShell.garbageCollectorLastCollectionTime; // L: 569
				long var7 = var9 - GameShell.garbageCollectorLastCheckTimeMs; // L: 570
				if (0L != var7) { // L: 571
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameShell.garbageCollectorLastCollectionTime = var3; // L: 573
			GameShell.garbageCollectorLastCheckTimeMs = var9; // L: 574
		}

		return var0; // L: 576
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1000251119"
	)
	static int method785() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1437
			int var0 = 0; // L: 1438

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1439
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1440
			}

			return var0 * 10000 / Client.field949; // L: 1442
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "28"
	)
	static void method783(Buffer var0) {
		if (Client.randomDatData != null) { // L: 10832
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 10833
		} else {
			byte[] var2 = new byte[24]; // L: 10838

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 10840
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 10841

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 10842 10843 10844
				}

				if (var3 >= 24) { // L: 10846
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 10849
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 10854
		}
	} // L: 10834 10855
}
