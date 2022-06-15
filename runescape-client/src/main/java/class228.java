import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class228 implements WorldMapSection {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("p")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1330507417
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1982168145
	)
	int field2762;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1382928615
	)
	int field2761;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1115080965
	)
	int field2751;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -77835473
	)
	int field2752;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1160542303
	)
	int field2749;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 87628571
	)
	int field2754;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1743482041
	)
	int field2750;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1244830889
	)
	int field2756;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -421589215
	)
	int field2757;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1159344129
	)
	int field2758;

	class228() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "1585435431"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2749) { // L: 22
			var1.regionLowX = this.field2749;
		}

		if (var1.regionHighX < this.field2749) {
			var1.regionHighX = this.field2749; // L: 23
		}

		if (var1.regionLowY > this.field2754) { // L: 24
			var1.regionLowY = this.field2754;
		}

		if (var1.regionHighY < this.field2754) { // L: 25
			var1.regionHighY = this.field2754;
		}

	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-929111713"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2762 && var1 < this.field2761 + this.field2762) { // L: 30
			return var2 >= (this.field2751 << 6) + (this.field2750 << 3) && var2 <= (this.field2751 << 6) + (this.field2750 << 3) + 7 && var3 >= (this.field2752 << 6) + (this.field2756 << 3) && var3 <= (this.field2752 << 6) + (this.field2756 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-47549823"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2749 << 6) + (this.field2757 << 3) && var1 <= (this.field2749 << 6) + (this.field2757 << 3) + 7 && var2 >= (this.field2754 << 6) + (this.field2758 << 3) && var2 <= (this.field2754 << 6) + (this.field2758 << 3) + 7; // L: 38
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-561571792"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2749 * 64 - this.field2751 * 64) + (this.field2757 * 8 - this.field2750 * 8), var3 + (this.field2754 * 64 - this.field2752 * 64) + (this.field2758 * 8 - this.field2756 * 8)};
			return var4; // L: 49
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "531454030"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2751 * 64 - this.field2749 * 64 + (this.field2750 * 8 - this.field2757 * 8) + var1; // L: 57
			int var4 = var2 + (this.field2752 * 64 - this.field2754 * 64) + (this.field2756 * 8 - this.field2758 * 8); // L: 58
			return new Coord(this.field2762, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-27"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2762 = var1.readUnsignedByte(); // L: 64
		this.field2761 = var1.readUnsignedByte(); // L: 65
		this.field2751 = var1.readUnsignedShort(); // L: 66
		this.field2750 = var1.readUnsignedByte(); // L: 67
		this.field2752 = var1.readUnsignedShort(); // L: 68
		this.field2756 = var1.readUnsignedByte(); // L: 69
		this.field2749 = var1.readUnsignedShort(); // L: 70
		this.field2757 = var1.readUnsignedByte(); // L: 71
		this.field2754 = var1.readUnsignedShort(); // L: 72
		this.field2758 = var1.readUnsignedByte(); // L: 73
		this.method4882(); // L: 74
	} // L: 75

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	void method4882() {
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	public static void method4899() {
		ByteArrayPool.field4202.clear(); // L: 43
		ByteArrayPool.field4202.add(100); // L: 44
		ByteArrayPool.field4202.add(5000); // L: 45
		ByteArrayPool.field4202.add(10000); // L: 46
		ByteArrayPool.field4202.add(30000); // L: 47
	} // L: 48
}
