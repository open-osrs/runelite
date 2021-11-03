import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 272991891
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 754094051
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -644010773
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1805234219
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1829364501
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2048396349
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1973016615
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1669534475
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1580023959
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1163870055
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1236846997
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 808496867
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1728394355
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -981337131
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 25
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
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
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1539376631"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "714098050"
	)
	public static void method3917(int var0) {
		if (class247.musicPlayerStatus != 0) { // L: 26
			class247.musicTrackVolume = var0;
		} else {
			class247.midiPcmStream.setPcmStreamVolume(var0); // L: 27
		}

	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Low;",
		garbageValue = "-1166598704"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !BuddyRankComparator.method2502(var0, var1, var2) ? null : ItemLayer.method4107(); // L: 53 54
	}
}
