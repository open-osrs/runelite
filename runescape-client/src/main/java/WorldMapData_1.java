import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2132883567
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1424345203
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -737589469
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1977093803
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "133240278"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2184.value) { // L: 15
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
			super.groupId = var1.method6946(); // L: 28
			super.fileId = var1.method6946(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "530647470"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field2154 = new byte[super.planes][64][64]; // L: 36
		super.field2145 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class194.field2178.value) { // L: 40
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
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "179463257"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1932347732"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-728228144"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) { // L: 62
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1064426552"
	)
	static void method3844() {
		try {
			File var0 = new File(TriBool.userHomeDirectory, "random.dat"); // L: 248
			int var2;
			if (var0.exists()) { // L: 249
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 250
			} else {
				label38:
				for (int var1 = 0; var1 < AbstractRasterProvider.cacheSubPaths.length; ++var1) { // L: 253
					for (var2 = 0; var2 < NPC.cacheParentPaths.length; ++var2) { // L: 254
						File var3 = new File(NPC.cacheParentPaths[var2] + AbstractRasterProvider.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 255
						if (var3.exists()) { // L: 256
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 257
							break label38; // L: 258
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 263
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 264
				var2 = var4.read(); // L: 265
				var4.seek(0L); // L: 266
				var4.write(var2); // L: 267
				var4.seek(0L); // L: 268
				var4.close(); // L: 269
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 270
			}
		} catch (IOException var5) { // L: 273
		}

	} // L: 274

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1129195954"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1671
			if (Client.gameState == 0) { // L: 1672
				ArchiveLoader.client.method508();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1673
				UserComparator6.method2503(0); // L: 1674
				Client.field496 = 0; // L: 1675
				Client.field685 = 0; // L: 1676
				Client.timer.method5973(var0); // L: 1677
				if (var0 != 20) { // L: 1678
					WorldMapSection2.method3584(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Projectile.field915 != null) { // L: 1680 1681
				Projectile.field915.close(); // L: 1682
				Projectile.field915 = null; // L: 1683
			}

			if (Client.gameState == 25) { // L: 1686
				Client.field485 = 0; // L: 1687
				Client.field521 = 0; // L: 1688
				Client.field522 = 1; // L: 1689
				Client.field523 = 0; // L: 1690
				Client.field524 = 1; // L: 1691
			}

			if (var0 != 5 && var0 != 10) { // L: 1693
				if (var0 == 20) { // L: 1701
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1702
					class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, true, var3); // L: 1703
				} else if (var0 == 11) { // L: 1705
					class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, false, 4); // L: 1706
				} else {
					ArchiveDiskActionHandler.method5258(); // L: 1708
				}
			} else {
				boolean var1 = class408.clientPreferences.field1182 >= Client.field467; // L: 1696
				int var2 = var1 ? 0 : 12; // L: 1698
				class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, true, var2); // L: 1699
			}

			Client.gameState = var0; // L: 1709
		}
	} // L: 1710
}
