import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1774637825
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 47432047
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -250215195
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1839374135
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
		garbageValue = "1379140744"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1063534704"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;B)V",
		garbageValue = "-80"
	)
	public void method5977(Bounds var1, Bounds var2) {
		this.method5981(var1, var2); // L: 33
		this.method5982(var1, var2); // L: 34
	} // L: 35

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;I)V",
		garbageValue = "-1616583168"
	)
	void method5981(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 38
		var2.highX = this.highX; // L: 39
		if (this.lowX < var1.lowX) { // L: 40
			var2.highX = (var2.highX * -888661779 - (var1.lowX * -888661779 - this.lowX * -888661779)) * -250215195; // L: 41
			var2.lowX = var1.lowX; // L: 42
		}

		if (var2.method5983() > var1.method5983()) { // L: 44
			var2.highX -= var2.method5983() - var1.method5983(); // L: 45
		}

		if (var2.highX < 0) { // L: 47
			var2.highX = 0;
		}

	} // L: 48

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;S)V",
		garbageValue = "11660"
	)
	void method5982(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 51
		var2.highY = this.highY; // L: 52
		if (this.lowY < var1.lowY) { // L: 53
			var2.highY = (var2.highY * 1584612999 - (var1.lowY * 1584612999 - this.lowY * 1584612999)) * 1839374135; // L: 54
			var2.lowY = var1.lowY; // L: 55
		}

		if (var2.method5984() > var1.method5984()) { // L: 57
			var2.highY -= var2.method5984() - var1.method5984(); // L: 58
		}

		if (var2.highY < 0) { // L: 60
			var2.highY = 0;
		}

	} // L: 61

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	int method5983() {
		return this.highX + this.lowX; // L: 64
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method5984() {
		return this.highY + this.lowY; // L: 68
	}

	public String toString() {
		return null; // L: 29
	}
}
