import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1496433009
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1348899275
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2132855023
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1258662357
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "691768070"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1684494436"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2065555787"
	)
	public boolean method6944(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)V",
		garbageValue = "1872281468"
	)
	public void method6945(Bounds var1, Bounds var2) {
		this.method6946(var1, var2); // L: 37
		this.method6947(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;S)V",
		garbageValue = "3154"
	)
	void method6946(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX = (var2.highX * 1363895823 - (var1.lowX * 1363895823 - this.lowX * 1363895823)) * 2132855023; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6965() > var1.method6965()) { // L: 48
			var2.highX -= var2.method6965() - var1.method6965(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)V",
		garbageValue = "0"
	)
	void method6947(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY = (var2.highY * 446318461 - (var1.lowY * 446318461 - this.lowY * 446318461)) * 1258662357; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6949() > var1.method6949()) { // L: 61
			var2.highY -= var2.method6949() - var1.method6949(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	int method6965() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1934877561"
	)
	int method6949() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "1725122550"
	)
	public static void method6969(AbstractArchive var0) {
	} // L: 16
}
