import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class147 implements WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1280849379
	)
	int field1645;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1221605639
	)
	int field1648;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -641667831
	)
	int field1646;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -810016507
	)
	int field1650;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1487941663
	)
	int field1647;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1266044735
	)
	int field1649;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -474039865
	)
	int field1644;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -104843799
	)
	int field1651;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 774094829
	)
	int field1652;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2136007461
	)
	int field1653;

	class147() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-609192354"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1647) { // L: 21
			var1.regionLowX = this.field1647;
		}

		if (var1.regionHighX < this.field1647) {
			var1.regionHighX = this.field1647; // L: 22
		}

		if (var1.regionLowY > this.field1649) { // L: 23
			var1.regionLowY = this.field1649;
		}

		if (var1.regionHighY < this.field1649) { // L: 24
			var1.regionHighY = this.field1649;
		}

	} // L: 25

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field1645 && var1 < this.field1648 + this.field1645) { // L: 28
			return var2 >= (this.field1646 << 6) + (this.field1644 << 3) && var2 <= (this.field1646 << 6) + (this.field1644 << 3) + 7 && var3 >= (this.field1650 << 6) + (this.field1651 << 3) && var3 <= (this.field1650 << 6) + (this.field1651 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field1647 << 6) + (this.field1652 << 3) && var1 <= (this.field1647 << 6) + (this.field1652 << 3) + 7 && var2 >= (this.field1649 << 6) + (this.field1653 << 3) && var2 <= (this.field1649 << 6) + (this.field1653 << 3) + 7; // L: 35
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1101045563"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field1647 * 64 - this.field1646 * 64) + (this.field1652 * 8 - this.field1644 * 8), var3 + (this.field1649 * 64 - this.field1650 * 64) + (this.field1653 * 8 - this.field1651 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lhk;",
		garbageValue = "1643926479"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field1646 * 64 - this.field1647 * 64 + (this.field1644 * 8 - this.field1652 * 8) + var1; // L: 52
			int var4 = var2 + (this.field1650 * 64 - this.field1649 * 64) + (this.field1651 * 8 - this.field1653 * 8); // L: 53
			return new Coord(this.field1645, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-576756767"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field1645 = var1.readUnsignedByte(); // L: 58
		this.field1648 = var1.readUnsignedByte(); // L: 59
		this.field1646 = var1.readUnsignedShort(); // L: 60
		this.field1644 = var1.readUnsignedByte(); // L: 61
		this.field1650 = var1.readUnsignedShort(); // L: 62
		this.field1651 = var1.readUnsignedByte(); // L: 63
		this.field1647 = var1.readUnsignedShort(); // L: 64
		this.field1652 = var1.readUnsignedByte(); // L: 65
		this.field1649 = var1.readUnsignedShort(); // L: 66
		this.field1653 = var1.readUnsignedByte(); // L: 67
		this.method2998(); // L: 68
	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	void method2998() {
	} // L: 71

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-460"
	)
	static final void method3014(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 125
		class69.addGameMessage(30, "", var1); // L: 127
	} // L: 129
}
