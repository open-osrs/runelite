import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1506776431
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 424127313
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1432871815
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1348644299
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1690940403
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1797936433
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 868620289
	)
	int field2723;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -979796665
	)
	int field2730;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1754400747
	)
	int field2732;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1520058109
	)
	int field2729;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "-1792723155"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2723) { // L: 22
			var1.regionLowX = this.field2723;
		}

		if (var1.regionHighX < this.field2732) {
			var1.regionHighX = this.field2732; // L: 23
		}

		if (var1.regionLowY > this.field2730) { // L: 24
			var1.regionLowY = this.field2730;
		}

		if (var1.regionHighY < this.field2729) { // L: 25
			var1.regionHighY = this.field2729;
		}

	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2723 && var1 >> 6 <= this.field2732 && var2 >> 6 >= this.field2730 && var2 >> 6 <= this.field2729; // L: 38
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-41287528"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2723 * 64 - this.regionStartX * 64), var3 + (this.field2730 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "289851355"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2723 * 64 + var1; // L: 57
			int var4 = var2 + (this.regionStartY * 64 - this.field2730 * 64); // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-113194936"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2723 = var1.readUnsignedShort(); // L: 70
		this.field2730 = var1.readUnsignedShort(); // L: 71
		this.field2732 = var1.readUnsignedShort(); // L: 72
		this.field2729 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77
}
