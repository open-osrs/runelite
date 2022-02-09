import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class369 {
	@ObfuscatedName("c")
	float field4226;
	@ObfuscatedName("l")
	float field4225;
	@ObfuscatedName("s")
	float field4227;

	static {
		new class369(0.0F, 0.0F, 0.0F); // L: 5
		new class369(1.0F, 1.0F, 1.0F); // L: 9
		new class369(1.0F, 0.0F, 0.0F); // L: 13
		new class369(0.0F, 1.0F, 0.0F); // L: 17
		new class369(0.0F, 0.0F, 1.0F); // L: 21
		DefaultsGroup.method6589(100); // L: 25
	} // L: 26

	class369(float var1, float var2, float var3) {
		this.field4226 = var1; // L: 35
		this.field4225 = var2; // L: 36
		this.field4227 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "86"
	)
	final float method6638() {
		return (float)Math.sqrt((double)(this.field4227 * this.field4227 + this.field4226 * this.field4226 + this.field4225 * this.field4225)); // L: 41
	}

	public String toString() {
		return this.field4226 + ", " + this.field4225 + ", " + this.field4227; // L: 46
	}
}
