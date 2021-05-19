import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -574544601
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2082921709
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -825863277
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -923069469
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -584242267
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 313312205
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -469024903
	)
	int field1958;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1918816893
	)
	int field1960;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2046543027
	)
	int field1957;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2045356969
	)
	int field1961;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V",
		garbageValue = "-1549282997"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1958) { // L: 21
			var1.regionLowX = this.field1958;
		}

		if (var1.regionHighX < this.field1957) {
			var1.regionHighX = this.field1957; // L: 22
		}

		if (var1.regionLowY > this.field1960) { // L: 23
			var1.regionLowY = this.field1960;
		}

		if (var1.regionHighY < this.field1961) { // L: 24
			var1.regionHighY = this.field1961;
		}

	} // L: 25

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1758075186"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "226487857"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1958 && var1 >> 6 <= this.field1957 && var2 >> 6 >= this.field1960 && var2 >> 6 <= this.field1961; // L: 35
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "118"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field1958 * 64 - this.regionStartX * 64), var3 + (this.field1960 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-400477740"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field1958 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field1960 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "45"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field1958 = var1.readUnsignedShort(); // L: 64
		this.field1960 = var1.readUnsignedShort(); // L: 65
		this.field1957 = var1.readUnsignedShort(); // L: 66
		this.field1961 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "468309682"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1025838705"
	)
	public static int method3202(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 13
	}
}
