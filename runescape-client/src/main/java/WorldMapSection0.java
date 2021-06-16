import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -1160309187
	)
	static int field2038;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 389090953
	)
	static int field2047;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -55376569
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1457760887
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -288902471
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 20509859
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 96413413
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -515923129
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1499525307
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 697420279
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1525307811
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 93550631
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -301719127
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1292488093
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1252351887
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1541153839
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2086451205"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "-36"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "518606194"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79
}
