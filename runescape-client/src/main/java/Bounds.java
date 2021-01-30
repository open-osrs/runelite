import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1090758865
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 518192471
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 620953543
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1803324609
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
		garbageValue = "-1764840928"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1587228886"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-769796699"
	)
	public void method6014(Bounds var1, Bounds var2) {
		this.method6015(var1, var2); // L: 33
		this.method6024(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-1678302488"
	)
	void method6015(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * 1575555575 - (var1.lowX * 1575555575 - this.lowX * 1575555575)) * 620953543; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method6017() > var1.method6017()) { // L: 44
			var2.highX -= var2.method6017() - var1.method6017(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "394854704"
	)
	void method6024(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * 1547305793 - (var1.lowY * 1547305793 - this.lowY * 1547305793)) * 1803324609; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method6018() > var1.method6018()) { // L: 57
			var2.highY -= var2.method6018() - var1.method6018(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901002144"
	)
	int method6017() {
		return this.highX + this.lowX; // L: 64
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "924077669"
	)
	int method6018() {
		return this.lowY + this.highY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
