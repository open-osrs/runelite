import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class364 {
	@ObfuscatedName("c")
	float field4181;
	@ObfuscatedName("b")
	float field4180;
	@ObfuscatedName("p")
	float field4182;

	static {
		new class364(0.0F, 0.0F, 0.0F); // L: 5
		new class364(1.0F, 1.0F, 1.0F); // L: 9
		new class364(1.0F, 0.0F, 0.0F); // L: 13
		new class364(0.0F, 1.0F, 0.0F); // L: 17
		new class364(0.0F, 0.0F, 1.0F); // L: 21
		Decimator.method1073(100); // L: 25
	} // L: 26

	class364(float var1, float var2, float var3) {
		this.field4181 = var1; // L: 35
		this.field4180 = var2; // L: 36
		this.field4182 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-893321960"
	)
	final float method6618() {
		return (float)Math.sqrt((double)(this.field4182 * this.field4182 + this.field4181 * this.field4181 + this.field4180 * this.field4180)); // L: 41
	}

	public String toString() {
		return this.field4181 + ", " + this.field4180 + ", " + this.field4182; // L: 46
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-247001185"
	)
	public static void method6623() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 94
	} // L: 95
}
