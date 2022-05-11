import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class229 implements WorldMapSection {
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -833135371
	)
	static int field2805;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 158678861
	)
	int field2803;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1742479059
	)
	int field2798;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 301118417
	)
	int field2795;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -308738369
	)
	int field2793;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1763199169
	)
	int field2797;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 582544923
	)
	int field2794;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1808550713
	)
	int field2799;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -109258069
	)
	int field2800;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 801571503
	)
	int field2801;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -298293387
	)
	int field2802;

	class229() {
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "-1792723155"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2797) { // L: 22
			var1.regionLowX = this.field2797;
		}

		if (var1.regionHighX < this.field2797) {
			var1.regionHighX = this.field2797; // L: 23
		}

		if (var1.regionLowY > this.field2794) { // L: 24
			var1.regionLowY = this.field2794;
		}

		if (var1.regionHighY < this.field2794) { // L: 25
			var1.regionHighY = this.field2794;
		}

	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2803 && var1 < this.field2798 + this.field2803) { // L: 30
			return var2 >= (this.field2795 << 6) + (this.field2799 << 3) && var2 <= (this.field2795 << 6) + (this.field2799 << 3) + 7 && var3 >= (this.field2793 << 6) + (this.field2800 << 3) && var3 <= (this.field2793 << 6) + (this.field2800 << 3) + 7; // L: 33
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
		return var1 >= (this.field2797 << 6) + (this.field2801 << 3) && var1 <= (this.field2797 << 6) + (this.field2801 << 3) + 7 && var2 >= (this.field2794 << 6) + (this.field2802 << 3) && var2 <= (this.field2794 << 6) + (this.field2802 << 3) + 7; // L: 38
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
			int[] var4 = new int[]{var2 + (this.field2797 * 64 - this.field2795 * 64) + (this.field2801 * 8 - this.field2799 * 8), var3 + (this.field2794 * 64 - this.field2793 * 64) + (this.field2802 * 8 - this.field2800 * 8)}; // L: 46 47 48
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
			int var3 = this.field2795 * 64 - this.field2797 * 64 + (this.field2799 * 8 - this.field2801 * 8) + var1; // L: 57
			int var4 = var2 + (this.field2793 * 64 - this.field2794 * 64) + (this.field2800 * 8 - this.field2802 * 8); // L: 58
			return new Coord(this.field2803, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-113194936"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2803 = var1.readUnsignedByte(); // L: 64
		this.field2798 = var1.readUnsignedByte(); // L: 65
		this.field2795 = var1.readUnsignedShort(); // L: 66
		this.field2799 = var1.readUnsignedByte(); // L: 67
		this.field2793 = var1.readUnsignedShort(); // L: 68
		this.field2800 = var1.readUnsignedByte(); // L: 69
		this.field2797 = var1.readUnsignedShort(); // L: 70
		this.field2801 = var1.readUnsignedByte(); // L: 71
		this.field2794 = var1.readUnsignedShort(); // L: 72
		this.field2802 = var1.readUnsignedByte(); // L: 73
		this.method4713(); // L: 74
	} // L: 75

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	void method4713() {
	} // L: 77

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "404905484"
	)
	public static boolean method4727(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}
}
