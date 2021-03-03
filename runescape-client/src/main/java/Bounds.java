import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("e")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("gs")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1970300391
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2105661203
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1049215037
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1664972525
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-91"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "82"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;B)V",
		garbageValue = "16"
	)
	public void method6182(Bounds var1, Bounds var2) {
		this.method6193(var1, var2); // L: 33
		this.method6179(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;I)V",
		garbageValue = "102469843"
	)
	void method6193(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * -1958684907 - (var1.lowX * -1958684907 - this.lowX * -1958684907)) * 1049215037; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method6185() > var1.method6185()) { // L: 44
			var2.highX -= var2.method6185() - var1.method6185(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;I)V",
		garbageValue = "1821841742"
	)
	void method6179(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * -691361509 - (var1.lowY * -691361509 - this.lowY * -691361509)) * -1664972525; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method6186() > var1.method6186()) { // L: 57
			var2.highY -= var2.method6186() - var1.method6186(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16777215"
	)
	int method6185() {
		return this.highX + this.lowX; // L: 64
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "57"
	)
	int method6186() {
		return this.highY + this.lowY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
