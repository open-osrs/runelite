import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class386 {
	@ObfuscatedName("o")
	float field4392;
	@ObfuscatedName("q")
	float field4390;
	@ObfuscatedName("l")
	float field4391;

	static {
		new class386(0.0F, 0.0F, 0.0F); // L: 5
		new class386(1.0F, 1.0F, 1.0F); // L: 9
		new class386(1.0F, 0.0F, 0.0F); // L: 13
		new class386(0.0F, 1.0F, 0.0F); // L: 17
		new class386(0.0F, 0.0F, 1.0F); // L: 21
		FontName.method7230(100); // L: 25
	} // L: 26

	class386(float var1, float var2, float var3) {
		this.field4392 = var1; // L: 35
		this.field4390 = var2; // L: 36
		this.field4391 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "44"
	)
	final float method6771() {
		return (float)Math.sqrt((double)(this.field4392 * this.field4392 + this.field4390 * this.field4390 + this.field4391 * this.field4391)); // L: 41
	}

	public String toString() {
		return this.field4392 + ", " + this.field4390 + ", " + this.field4391; // L: 46
	}
}
