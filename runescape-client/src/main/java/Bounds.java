import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -961758993
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1458350895
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 875525085
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1188404153
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2102954293"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-40"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Llv;Llv;I)V",
		garbageValue = "1555379366"
	)
	public void method6202(Bounds var1, Bounds var2) {
		this.method6199(var1, var2);
		this.method6194(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Llv;Llv;B)V",
		garbageValue = "58"
	)
	void method6199(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * 73759861 - (var1.lowX * 73759861 - this.lowX * 73759861)) * 875525085;
			var2.lowX = var1.lowX;
		}

		if (var2.method6193() > var1.method6193()) {
			var2.highX -= var2.method6193() - var1.method6193();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Llv;Llv;I)V",
		garbageValue = "-810970943"
	)
	void method6194(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * 1962542455 - (var1.lowY * 1962542455 - this.lowY * 1962542455)) * -1188404153;
			var2.lowY = var1.lowY;
		}

		if (var2.method6196() > var1.method6196()) {
			var2.highY -= var2.method6196() - var1.method6196();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "515582700"
	)
	int method6193() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-500619811"
	)
	int method6196() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
