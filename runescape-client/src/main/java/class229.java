import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class229 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -948885225
	)
	int field2736;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -593318449
	)
	int field2734;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2083366699
	)
	int field2733;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -187959117
	)
	int field2738;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -196184405
	)
	int field2737;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 726632117
	)
	int field2743;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1653715279
	)
	int field2739;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -759700891
	)
	int field2740;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1488339787
	)
	int field2741;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1323722061
	)
	int field2742;

	class229() {
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "-1521793701"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2737) { // L: 22
			var1.regionLowX = this.field2737;
		}

		if (var1.regionHighX < this.field2737) {
			var1.regionHighX = this.field2737; // L: 23
		}

		if (var1.regionLowY > this.field2743) { // L: 24
			var1.regionLowY = this.field2743;
		}

		if (var1.regionHighY < this.field2743) { // L: 25
			var1.regionHighY = this.field2743;
		}

	} // L: 26

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2091891709"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2736 && var1 < this.field2734 + this.field2736) { // L: 30
			return var2 >= (this.field2733 << 6) + (this.field2739 << 3) && var2 <= (this.field2733 << 6) + (this.field2739 << 3) + 7 && var3 >= (this.field2738 << 6) + (this.field2740 << 3) && var3 <= (this.field2738 << 6) + (this.field2740 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-59"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2737 << 6) + (this.field2741 << 3) && var1 <= (this.field2737 << 6) + (this.field2741 << 3) + 7 && var2 >= (this.field2743 << 6) + (this.field2742 << 3) && var2 <= (this.field2743 << 6) + (this.field2742 << 3) + 7; // L: 38
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-604533765"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.field2737 * 64 - this.field2733 * 64) + (this.field2741 * 8 - this.field2739 * 8), var3 + (this.field2743 * 64 - this.field2738 * 64) + (this.field2742 * 8 - this.field2740 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lko;",
		garbageValue = "-41254697"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2733 * 64 - this.field2737 * 64 + (this.field2739 * 8 - this.field2741 * 8) + var1; // L: 57
			int var4 = var2 + (this.field2738 * 64 - this.field2743 * 64) + (this.field2740 * 8 - this.field2742 * 8); // L: 58
			return new Coord(this.field2736, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "119"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2736 = var1.readUnsignedByte(); // L: 64
		this.field2734 = var1.readUnsignedByte(); // L: 65
		this.field2733 = var1.readUnsignedShort(); // L: 66
		this.field2739 = var1.readUnsignedByte(); // L: 67
		this.field2738 = var1.readUnsignedShort(); // L: 68
		this.field2740 = var1.readUnsignedByte(); // L: 69
		this.field2737 = var1.readUnsignedShort(); // L: 70
		this.field2741 = var1.readUnsignedByte(); // L: 71
		this.field2743 = var1.readUnsignedShort(); // L: 72
		this.field2742 = var1.readUnsignedByte(); // L: 73
		this.method4870(); // L: 74
	} // L: 75

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	void method4870() {
	} // L: 77
}
