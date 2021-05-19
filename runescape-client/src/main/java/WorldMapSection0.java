import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -231023039
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 560237143
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1956077611
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1591640519
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1927817697
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1122317267
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -755347447
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2112581737
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1581407301
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -66476113
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 195666035
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1912029649
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1765054251
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1729991643
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "-1549282997"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 25
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 26
		}

		if (var1.regionLowY > this.newY) { // L: 27
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 28
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1758075186"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "226487857"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "118"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-400477740"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 53
			return null; // L: 54
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "45"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 62
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 65
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 66
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.postRead();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2034729306"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "-1776977881"
	)
	public static FloorOverlayDefinition method3534(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = class288.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1844383882"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (ByteArrayPool.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < class15.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == class15.ByteArrayPool_alternativeSizes[var1] && class9.ByteArrayPool_altSizeArrayCounts[var1] < ByteArrayPool.ByteArrayPool_arrays[var1].length) { // L: 90
						ByteArrayPool.ByteArrayPool_arrays[var1][class9.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86 96
}
