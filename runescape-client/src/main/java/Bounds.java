import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1629370451
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1059092457
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1428810555
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1673451589
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1528835828"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1509312094"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "21"
	)
	public boolean method6983(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)V",
		garbageValue = "-1"
	)
	public void method6985(Bounds var1, Bounds var2) {
		this.method6986(var1, var2); // L: 37
		this.method7001(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)V",
		garbageValue = "127"
	)
	void method6986(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX = (var2.highX * -23049715 - (var1.lowX * -23049715 - this.lowX * -23049715)) * -1428810555; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6988() > var1.method6988()) { // L: 48
			var2.highX -= var2.method6988() - var1.method6988(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)V",
		garbageValue = "1907619314"
	)
	void method7001(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY = (var2.highY * 206931315 - (var1.lowY * 206931315 - this.lowY * 206931315)) * -1673451589; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6989() > var1.method6989()) { // L: 61
			var2.highY -= var2.method6989() - var1.method6989(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1510318175"
	)
	int method6988() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2121391140"
	)
	int method6989() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
