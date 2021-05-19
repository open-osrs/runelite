import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1783112513
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -369835087
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1711562029
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1629801735
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2039956485
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 942454871
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "-1549282997"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1758075186"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 24
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "226487857"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "118"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-400477740"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "45"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2051242411"
	)
	@Export("postRead")
	void postRead() {
	} // L: 63
}
