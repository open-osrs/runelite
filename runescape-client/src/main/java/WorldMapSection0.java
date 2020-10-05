import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -465345147
	)
	int oldZ;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -202719925
	)
	int newZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 47110693
	)
	int oldX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1315329307
	)
	int oldY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -445154313
	)
	int newX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1054372917
	)
	int newY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 755868073
	)
	int oldChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1795067773
	)
	int oldChunkYLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -662709525
	)
	int oldChunkXHigh;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1849440565
	)
	int oldChunkYHigh;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1861847067
	)
	int newChunkXLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1830088993
	)
	int newChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -878235337
	)
	int newChunkXHigh;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2049654615
	)
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "100"
	)
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-339896458"
	)
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2135820245"
	)
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
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
		descriptor = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	void postRead() {
	} // L: 79

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IS)Liv;",
		garbageValue = "15751"
	)
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 42 43
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)Lmx;",
		garbageValue = "122"
	)
	static WorldMap getWorldMap() {
		return Message.worldMap; // L: 665
	}
}
