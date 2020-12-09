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
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1764840928"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1587228886"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-769796699"
	)
	public void method6014(Bounds var1, Bounds var2) {
		this.method6015(var1, var2);
		this.method6024(var1, var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-1678302488"
	)
	void method6015(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6017() > var1.method6017()) {
			var2.highX -= var2.method6017() - var1.method6017();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "394854704"
	)
	void method6024(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6018() > var1.method6018()) {
			var2.highY -= var2.method6018() - var1.method6018();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1901002144"
	)
	int method6017() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "924077669"
	)
	int method6018() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
