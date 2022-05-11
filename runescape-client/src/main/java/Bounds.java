import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2084018151
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1161874723
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1792451045
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -347299673
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "76"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2014864213"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1837557842"
	)
	public boolean method6742(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;I)V",
		garbageValue = "683766141"
	)
	public void method6758(Bounds var1, Bounds var2) {
		this.method6739(var1, var2); // L: 37
		this.method6746(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;B)V",
		garbageValue = "-80"
	)
	void method6739(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX = (var2.highX * -1176876013 - (var1.lowX * -1176876013 - this.lowX * -1176876013)) * -1792451045; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6747() > var1.method6747()) { // L: 48
			var2.highX -= var2.method6747() - var1.method6747(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;B)V",
		garbageValue = "83"
	)
	void method6746(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY = (var2.highY * -1533081833 - (var1.lowY * -1533081833 - this.lowY * -1533081833)) * -347299673; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6745() > var1.method6745()) { // L: 61
			var2.highY -= var2.method6745() - var1.method6745(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1397499342"
	)
	int method6747() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1908652212"
	)
	int method6745() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
