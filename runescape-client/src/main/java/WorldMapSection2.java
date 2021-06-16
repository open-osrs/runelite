import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1901155751
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 585064293
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1431737197
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1644208397
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1498564843
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -207611195
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -37128885
	)
	int field1962;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 311901217
	)
	int field1963;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1141655241
	)
	int field1964;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 206814275
	)
	int field1965;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1962) { // L: 21
			var1.regionLowX = this.field1962;
		}

		if (var1.regionHighX < this.field1964) {
			var1.regionHighX = this.field1964; // L: 22
		}

		if (var1.regionLowY > this.field1963) { // L: 23
			var1.regionLowY = this.field1963;
		}

		if (var1.regionHighY < this.field1965) { // L: 24
			var1.regionHighY = this.field1965;
		}

	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1962 && var1 >> 6 <= this.field1964 && var2 >> 6 >= this.field1963 && var2 >> 6 <= this.field1965; // L: 35
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2086451205"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field1962 * 64 - this.regionStartX * 64), var3 + (this.field1963 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "-36"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field1962 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field1963 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field1962 = var1.readUnsignedShort(); // L: 64
		this.field1963 = var1.readUnsignedShort(); // L: 65
		this.field1964 = var1.readUnsignedShort(); // L: 66
		this.field1965 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "767493014"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lew;",
		garbageValue = "1413321363"
	)
	public static VarbitComposition method3329(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "844511026"
	)
	static final int method3333() {
		return ViewportMouse.ViewportMouse_y; // L: 90
	}
}
