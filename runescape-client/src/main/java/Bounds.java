import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2576511
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1191189267
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1359495181
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -18291391
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1032110275"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1500851381"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1261936501"
	)
	public boolean method6186(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)V",
		garbageValue = "1284684656"
	)
	public void method6191(Bounds var1, Bounds var2) {
		this.method6192(var1, var2);
		this.method6196(var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)V",
		garbageValue = "-1884423732"
	)
	void method6192(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * 432140603 - (var1.lowX * 432140603 - this.lowX * 432140603)) * -1359495181;
			var2.lowX = var1.lowX;
		}

		if (var2.method6195() > var1.method6195()) {
			var2.highX -= var2.method6195() - var1.method6195();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)V",
		garbageValue = "-2054192714"
	)
	void method6196(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * 1487841985 - (var1.lowY * 1487841985 - this.lowY * 1487841985)) * -18291391;
			var2.lowY = var1.lowY;
		}

		if (var2.method6194() > var1.method6194()) {
			var2.highY -= var2.method6194() - var1.method6194();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1761528671"
	)
	int method6195() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16384"
	)
	int method6194() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
