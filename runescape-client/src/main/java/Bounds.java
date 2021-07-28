import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 1950621809
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1616481157
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -531404143
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 640928203
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 566469983
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-457088307"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llo;Llo;I)V",
		garbageValue = "1358187891"
	)
	public void method6028(Bounds var1, Bounds var2) {
		this.method6030(var1, var2);
		this.method6036(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llo;Llo;S)V",
		garbageValue = "1205"
	)
	void method6030(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * -586279965 - (var1.lowX * -586279965 - this.lowX * -586279965)) * 640928203;
			var2.lowX = var1.lowX;
		}

		if (var2.method6031() > var1.method6031()) {
			var2.highX -= var2.method6031() - var1.method6031();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llo;Llo;B)V",
		garbageValue = "-48"
	)
	void method6036(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * 1464727199 - (var1.lowY * 1464727199 - this.lowY * 1464727199)) * 566469983;
			var2.lowY = var1.lowY;
		}

		if (var2.method6032() > var1.method6032()) {
			var2.highY -= var2.method6032() - var1.method6032();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1525436179"
	)
	int method6031() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1505514692"
	)
	int method6032() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
