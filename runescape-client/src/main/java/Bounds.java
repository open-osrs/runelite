import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("w")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -942038373
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -38208119
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -468327151
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 85471293
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1517519205"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1357233631"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llr;Llr;S)V",
		garbageValue = "172"
	)
	public void method6089(Bounds var1, Bounds var2) {
		this.method6090(var1, var2); // L: 33
		this.method6087(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llr;Llr;I)V",
		garbageValue = "-805505027"
	)
	void method6090(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * 1565633521 - (var1.lowX * 1565633521 - this.lowX * 1565633521)) * -468327151; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method6091() > var1.method6091()) { // L: 44
			var2.highX -= var2.method6091() - var1.method6091(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llr;Llr;I)V",
		garbageValue = "1845749630"
	)
	void method6087(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * -1438521579 - (var1.lowY * -1438521579 - this.lowY * -1438521579)) * 85471293; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method6092() > var1.method6092()) { // L: 57
			var2.highY -= var2.method6092() - var1.method6092(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1918003577"
	)
	int method6091() {
		return this.highX + this.lowX; // L: 64
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "97"
	)
	int method6092() {
		return this.highY + this.lowY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
