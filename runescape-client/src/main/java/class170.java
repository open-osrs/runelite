import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class170 implements WorldMapSection {
	@ObfuscatedName("qo")
	static boolean field2016;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1070894697
	)
	int field2015;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2078857995
	)
	int field2013;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -492732977
	)
	int field2014;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 748081581
	)
	int field2012;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -522763659
	)
	int field2023;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1748963509
	)
	int field2017;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1793396217
	)
	int field2018;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 589577767
	)
	int field2019;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -724496135
	)
	int field2020;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1652929447
	)
	int field2021;

	class170() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2023) { // L: 21
			var1.regionLowX = this.field2023;
		}

		if (var1.regionHighX < this.field2023) {
			var1.regionHighX = this.field2023; // L: 22
		}

		if (var1.regionLowY > this.field2017) { // L: 23
			var1.regionLowY = this.field2017;
		}

		if (var1.regionHighY < this.field2017) { // L: 24
			var1.regionHighY = this.field2017;
		}

	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2015 && var1 < this.field2013 + this.field2015) { // L: 28
			return var2 >= (this.field2014 << 6) + (this.field2018 << 3) && var2 <= (this.field2014 << 6) + (this.field2018 << 3) + 7 && var3 >= (this.field2012 << 6) + (this.field2019 << 3) && var3 <= (this.field2012 << 6) + (this.field2019 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2023 << 6) + (this.field2020 << 3) && var1 <= (this.field2023 << 6) + (this.field2020 << 3) + 7 && var2 >= (this.field2017 << 6) + (this.field2021 << 3) && var2 <= (this.field2017 << 6) + (this.field2021 << 3) + 7; // L: 35
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
			int[] var4 = new int[]{var2 + (this.field2023 * 64 - this.field2014 * 64) + (this.field2020 * 8 - this.field2018 * 8), var3 + (this.field2017 * 64 - this.field2012 * 64) + (this.field2021 * 8 - this.field2019 * 8)}; // L: 42 43 44
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
			int var3 = this.field2014 * 64 - this.field2023 * 64 + (this.field2018 * 8 - this.field2020 * 8) + var1; // L: 52
			int var4 = var2 + (this.field2012 * 64 - this.field2017 * 64) + (this.field2019 * 8 - this.field2021 * 8); // L: 53
			return new Coord(this.field2015, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2015 = var1.readUnsignedByte(); // L: 58
		this.field2013 = var1.readUnsignedByte(); // L: 59
		this.field2014 = var1.readUnsignedShort(); // L: 60
		this.field2018 = var1.readUnsignedByte(); // L: 61
		this.field2012 = var1.readUnsignedShort(); // L: 62
		this.field2019 = var1.readUnsignedByte(); // L: 63
		this.field2023 = var1.readUnsignedShort(); // L: 64
		this.field2020 = var1.readUnsignedByte(); // L: 65
		this.field2017 = var1.readUnsignedShort(); // L: 66
		this.field2021 = var1.readUnsignedByte(); // L: 67
		this.method3591(); // L: 68
	} // L: 69

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1129174695"
	)
	void method3591() {
	} // L: 71
}
