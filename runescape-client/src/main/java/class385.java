import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class385 {
	@ObfuscatedName("c")
	float field4383;
	@ObfuscatedName("v")
	float field4382;
	@ObfuscatedName("q")
	float field4384;

	static {
		new class385(0.0F, 0.0F, 0.0F); // L: 5
		new class385(1.0F, 1.0F, 1.0F); // L: 9
		new class385(1.0F, 0.0F, 0.0F); // L: 13
		new class385(0.0F, 1.0F, 0.0F); // L: 17
		new class385(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class385(float var1, float var2, float var3) {
		this.field4383 = var1; // L: 33
		this.field4382 = var2; // L: 34
		this.field4384 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "84"
	)
	final float method6929() {
		return (float)Math.sqrt((double)(this.field4384 * this.field4384 + this.field4383 * this.field4383 + this.field4382 * this.field4382)); // L: 39
	}

	public String toString() {
		return this.field4383 + ", " + this.field4382 + ", " + this.field4384; // L: 44
	}
}
