import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1148660607
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1798540523
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -806999089
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1354432091
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1883564042"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-102"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lle;B)V",
		garbageValue = "77"
	)
	public void method5849(Bounds var1, Bounds var2) {
		this.method5830(var1, var2); // L: 33
		this.method5831(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lle;I)V",
		garbageValue = "2013781151"
	)
	void method5830(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * 1545009967 - (var1.lowX * 1545009967 - this.lowX * 1545009967)) * -806999089; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method5832() > var1.method5832()) { // L: 44
			var2.highX -= var2.method5832() - var1.method5832(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lle;I)V",
		garbageValue = "-1814937047"
	)
	void method5831(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * 364510765 - (var1.lowY * 364510765 - this.lowY * 364510765)) * -1354432091; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method5834() > var1.method5834()) { // L: 57
			var2.highY -= var2.method5834() - var1.method5834(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1788216788"
	)
	int method5832() {
		return this.highX + this.lowX; // L: 64
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	int method5834() {
		return this.lowY + this.highY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
