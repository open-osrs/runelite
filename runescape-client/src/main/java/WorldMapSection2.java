import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1621572449
	)
	static int field2601;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1294492431
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1928617505
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 959776667
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1522453015
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1997000163
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1818792557
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -961115099
	)
	int field2595;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1227046003
	)
	int field2597;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1985561305
	)
	int field2600;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1750450639
	)
	int field2599;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhr;I)V",
		garbageValue = "2069930856"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2595) { // L: 22
			var1.regionLowX = this.field2595;
		}

		if (var1.regionHighX < this.field2600) {
			var1.regionHighX = this.field2600; // L: 23
		}

		if (var1.regionLowY > this.field2597) { // L: 24
			var1.regionLowY = this.field2597;
		}

		if (var1.regionHighY < this.field2599) { // L: 25
			var1.regionHighY = this.field2599;
		}

	} // L: 26

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "81"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "42159517"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2595 && var1 >> 6 <= this.field2600 && var2 >> 6 >= this.field2597 && var2 >> 6 <= this.field2599; // L: 38
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "22240711"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2595 * 64 - this.regionStartX * 64), var3 + (this.field2597 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lju;",
		garbageValue = "5000"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2595 * 64 + var1; // L: 57
			int var4 = var2 + (this.regionStartY * 64 - this.field2597 * 64); // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-15299"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2595 = var1.readUnsignedShort(); // L: 70
		this.field2597 = var1.readUnsignedShort(); // L: 71
		this.field2600 = var1.readUnsignedShort(); // L: 72
		this.field2599 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426265039"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-494413761"
	)
	public static int method4414(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12387"
	)
	public static void method4417() {
		Widget.Widget_cachedModels.clear(); // L: 723
		Widget.Widget_cachedFonts.clear(); // L: 724
		Widget.Widget_cachedSpriteMasks.clear(); // L: 725
		Widget.field3222.clear(); // L: 726
	} // L: 727
}
