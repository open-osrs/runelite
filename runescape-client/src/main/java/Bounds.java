import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 726079895
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1444108263
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 64358351
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1178509237
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1930472817"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-7113"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "922229094"
	)
	public boolean method6577(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;S)V",
		garbageValue = "3129"
	)
	public void method6578(Bounds var1, Bounds var2) {
		this.method6579(var1, var2); // L: 37
		this.method6574(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;S)V",
		garbageValue = "381"
	)
	void method6579(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX = (var2.highX * 288726831 - (var1.lowX * 288726831 - this.lowX * 288726831)) * 64358351; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6581() > var1.method6581()) { // L: 48
			var2.highX -= var2.method6581() - var1.method6581(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;I)V",
		garbageValue = "-1164608832"
	)
	void method6574(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY = (var2.highY * -327903587 - (var1.lowY * -327903587 - this.lowY * -327903587)) * 1178509237; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6582() > var1.method6582()) { // L: 61
			var2.highY -= var2.method6582() - var1.method6582(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1484273265"
	)
	int method6581() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	int method6582() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("c")
	public static final void method6608(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				class411.method7280(var0 - 1L); // L: 11
				class411.method7280(1L); // L: 12
			} else {
				class411.method7280(var0); // L: 14
			}

		}
	} // L: 15
}
