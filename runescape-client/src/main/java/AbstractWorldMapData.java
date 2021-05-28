import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1347091631
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -868813013
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1253594293
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 174092143
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1260242687
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1482547443
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -630921225
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -373998791
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("o")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("c")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("e")
	byte[][][] field2067;
	@ObfuscatedName("g")
	byte[][][] field2065;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[[[Lfh;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("k")
	boolean field2068;
	@ObfuscatedName("m")
	boolean field2069;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2068 = false; // L: 26
		this.field2069 = false; // L: 27
	} // L: 29

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1223315238"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "25"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2068 && this.field2069; // L: 32
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "-1881595992"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2068 = true; // L: 40
				this.field2069 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "244458309"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2067 = null; // L: 48
		this.field2065 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2068 = false; // L: 51
		this.field2069 = false; // L: 52
	} // L: 53

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILnd;I)V",
		garbageValue = "-570193983"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method3602(var1, var2, var3, var4); // L: 61
			} else {
				this.method3622(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILnd;II)V",
		garbageValue = "-300212411"
	)
	void method3602(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILnd;II)V",
		garbageValue = "-2123814102"
	)
	void method3622(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2067[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2065[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method6583(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-802989109"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}
}
