import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class221 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 80872319
	)
	int field2658;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 442101873
	)
	int field2664;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1896112631
	)
	int field2657;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1105092511
	)
	int field2662;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -56111117
	)
	int field2659;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -813588247
	)
	int field2660;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 652100539
	)
	int field2661;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 484039067
	)
	int field2656;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1695529863
	)
	int field2663;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1057648431
	)
	int field2655;

	class221() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhr;I)V",
		garbageValue = "2069930856"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2659) { // L: 22
			var1.regionLowX = this.field2659;
		}

		if (var1.regionHighX < this.field2659) {
			var1.regionHighX = this.field2659; // L: 23
		}

		if (var1.regionLowY > this.field2660) { // L: 24
			var1.regionLowY = this.field2660;
		}

		if (var1.regionHighY < this.field2660) { // L: 25
			var1.regionHighY = this.field2660;
		}

	} // L: 26

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "81"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2658 && var1 < this.field2664 + this.field2658) { // L: 30
			return var2 >= (this.field2657 << 6) + (this.field2661 << 3) && var2 <= (this.field2657 << 6) + (this.field2661 << 3) + 7 && var3 >= (this.field2662 << 6) + (this.field2656 << 3) && var3 <= (this.field2662 << 6) + (this.field2656 << 3) + 7; // L: 33
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
		return var1 >= (this.field2659 << 6) + (this.field2663 << 3) && var1 <= (this.field2659 << 6) + (this.field2663 << 3) + 7 && var2 >= (this.field2660 << 6) + (this.field2655 << 3) && var2 <= (this.field2660 << 6) + (this.field2655 << 3) + 7; // L: 38
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
			int[] var4 = new int[]{var2 + (this.field2659 * 64 - this.field2657 * 64) + (this.field2663 * 8 - this.field2661 * 8), var3 + (this.field2660 * 64 - this.field2662 * 64) + (this.field2655 * 8 - this.field2656 * 8)}; // L: 46 47 48
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
			int var3 = this.field2657 * 64 - this.field2659 * 64 + (this.field2661 * 8 - this.field2663 * 8) + var1; // L: 57
			int var4 = var2 + (this.field2662 * 64 - this.field2660 * 64) + (this.field2656 * 8 - this.field2655 * 8); // L: 58
			return new Coord(this.field2658, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-15299"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2658 = var1.readUnsignedByte(); // L: 64
		this.field2664 = var1.readUnsignedByte(); // L: 65
		this.field2657 = var1.readUnsignedShort(); // L: 66
		this.field2661 = var1.readUnsignedByte(); // L: 67
		this.field2662 = var1.readUnsignedShort(); // L: 68
		this.field2656 = var1.readUnsignedByte(); // L: 69
		this.field2659 = var1.readUnsignedShort(); // L: 70
		this.field2663 = var1.readUnsignedByte(); // L: 71
		this.field2660 = var1.readUnsignedShort(); // L: 72
		this.field2655 = var1.readUnsignedByte(); // L: 73
		this.method4678(); // L: 74
	} // L: 75

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1997336841"
	)
	void method4678() {
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "34"
	)
	static String method4705(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;B)V",
		garbageValue = "-91"
	)
	public static void method4700(AbstractArchive var0) {
		class17.StructDefinition_archive = var0; // L: 19
	} // L: 20
}
