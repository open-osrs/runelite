import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2086357139
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 891943535
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 72025167
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 456925677
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 620959139
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1044341743
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1229812531
	)
	int field2233;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1125733411
	)
	int field2234;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1336777703
	)
	int field2230;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -980729145
	)
	int field2232;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "964088357"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2233) { // L: 21
			var1.regionLowX = this.field2233;
		}

		if (var1.regionHighX < this.field2230) {
			var1.regionHighX = this.field2230; // L: 22
		}

		if (var1.regionLowY > this.field2234) { // L: 23
			var1.regionLowY = this.field2234;
		}

		if (var1.regionHighY < this.field2232) { // L: 24
			var1.regionHighY = this.field2232;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1337137401"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1769831605"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2233 && var1 >> 6 <= this.field2230 && var2 >> 6 >= this.field2234 && var2 >> 6 <= this.field2232;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1941144122"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field2233 * 64 - this.regionStartX * 64), var3 + (this.field2234 * 64 - this.regionStartY * 64)}; // L: 42 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "-670243838"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field2233 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field2234 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-860121653"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field2233 = var1.readUnsignedShort(); // L: 64
		this.field2234 = var1.readUnsignedShort(); // L: 65
		this.field2230 = var1.readUnsignedShort(); // L: 66
		this.field2232 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	static void method3959() {
		class326.field4041 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class163.method3320((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F)); // L: 30
			class326.field4041[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class326.field4041.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = class163.method3320((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class326.field4041.length; ++var0) { // L: 37 38
				class326.field4041[var0] = var4; // L: 39
			}
		}

	} // L: 43
}
