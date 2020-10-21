import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1707768055
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -797109491
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1403597143
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 959443313
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-124623897"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2099079060"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;I)V",
		garbageValue = "-1801427398"
	)
	public void method6129(Bounds var1, Bounds var2) {
		this.method6120(var1, var2); // L: 33
		this.method6117(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;I)V",
		garbageValue = "-1914930384"
	)
	void method6120(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * 1436136857 - (var1.lowX * 1436136857 - this.lowX * 1436136857)) * -1403597143; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method6130() > var1.method6130()) { // L: 44
			var2.highX -= var2.method6130() - var1.method6130(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;I)V",
		garbageValue = "1895842322"
	)
	void method6117(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * -1936937071 - (var1.lowY * -1936937071 - this.lowY * -1936937071)) * 959443313; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method6122() > var1.method6122()) { // L: 57
			var2.highY -= var2.method6122() - var1.method6122(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "226030210"
	)
	int method6130() {
		return this.lowX + this.highX; // L: 64
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1174684154"
	)
	int method6122() {
		return this.lowY + this.highY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
