import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2004088829
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1887298731
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2001187823
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1377856837
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int highX, int highY) {
		this(0, 0, highX, highY);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "1"
	)
	@Export("setLow")
	public void setLow(int x, int y) {
		this.lowX = x;
		this.lowY = y;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-11269827"
	)
	@Export("setHigh")
	public void setHigh(int x, int y) {
		this.highX = x;
		this.highY = y;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lla;Lla;I)V",
		garbageValue = "-2123792170"
	)
	public void method30(Bounds var1, Bounds var2) {
		this.method31(var1, var2);
		this.method32(var1, var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Lla;Lla;I)V",
		garbageValue = "314675149"
	)
	void method31(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method33() > var1.method33()) {
			var2.highX -= var2.method33() - var1.method33();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lla;Lla;S)V",
		garbageValue = "128"
	)
	void method32(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method34() > var1.method34()) {
			var2.highY -= var2.method34() - var1.method34();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1842151293"
	)
	int method33() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-22"
	)
	int method34() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(DDII)[D",
		garbageValue = "2112793889"
	)
	public static double[] method5905(double var0, double var2, int pixelsPerTile) {
		int var5 = pixelsPerTile * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -pixelsPerTile;

		for (int var8 = 0; var7 <= pixelsPerTile; ++var8) {
			double var9 = ((double)var7 - var0) / var2;
			double var11 = Math.exp(-var9 * var9 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var13 = var11 / var2;
			var6[var8] = var13;
			++var7;
		}

		return var6;
	}
}
