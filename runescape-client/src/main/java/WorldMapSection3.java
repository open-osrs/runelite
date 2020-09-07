import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1540857287
	)
	int field391;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1117083463
	)
	int field381;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -186376071
	)
	int field382;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1787934953
	)
	int field392;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1247077539
	)
	int field384;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -134643499
	)
	int field385;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1837481963
	)
	int field389;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1861989631
	)
	int field387;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 185317539
	)
	int field380;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1881120603
	)
	int field386;

	WorldMapSection3() {
	} // L: 18

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "100"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field384) { // L: 21
			var1.regionLowX = this.field384;
		}

		if (var1.regionHighX < this.field384) {
			var1.regionHighX = this.field384; // L: 22
		}

		if (var1.regionLowY > this.field385) { // L: 23
			var1.regionLowY = this.field385;
		}

		if (var1.regionHighY < this.field385) { // L: 24
			var1.regionHighY = this.field385;
		}

	} // L: 25

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-339896458"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field391 && var1 < this.field381 + this.field391) { // L: 28
			return var2 >= (this.field382 << 6) + (this.field389 << 3) && var2 <= (this.field382 << 6) + (this.field389 << 3) + 7 && var3 >= (this.field392 << 6) + (this.field387 << 3) && var3 <= (this.field392 << 6) + (this.field387 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2135820245"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field384 << 6) + (this.field380 << 3) && var1 <= (this.field384 << 6) + (this.field380 << 3) + 7 && var2 >= (this.field385 << 6) + (this.field386 << 3) && var2 <= (this.field385 << 6) + (this.field386 << 3) + 7; // L: 35
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field384 * 64 - this.field382 * 64) + (this.field380 * 8 - this.field389 * 8), var3 + (this.field385 * 64 - this.field392 * 64) + (this.field386 * 8 - this.field387 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field382 * 64 - this.field384 * 64 + (this.field389 * 8 - this.field380 * 8) + var1; // L: 52
			int var4 = var2 + (this.field392 * 64 - this.field385 * 64) + (this.field387 * 8 - this.field386 * 8); // L: 53
			return new Coord(this.field391, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field391 = var1.readUnsignedByte(); // L: 58
		this.field381 = var1.readUnsignedByte(); // L: 59
		this.field382 = var1.readUnsignedShort(); // L: 60
		this.field389 = var1.readUnsignedByte(); // L: 61
		this.field392 = var1.readUnsignedShort(); // L: 62
		this.field387 = var1.readUnsignedByte(); // L: 63
		this.field384 = var1.readUnsignedShort(); // L: 64
		this.field380 = var1.readUnsignedByte(); // L: 65
		this.field385 = var1.readUnsignedShort(); // L: 66
		this.field386 = var1.readUnsignedByte(); // L: 67
		this.method838(); // L: 68
	} // L: 69

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1599277860"
	)
	void method838() {
	} // L: 71
}
