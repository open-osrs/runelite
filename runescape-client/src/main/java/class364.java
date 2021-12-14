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
		new class364(0.0F, 0.0F, 0.0F);
		new class364(1.0F, 1.0F, 1.0F);
		new class364(1.0F, 0.0F, 0.0F);
		new class364(0.0F, 1.0F, 0.0F);
		new class364(0.0F, 0.0F, 1.0F);
		Decimator.method1073(100);
	}

	class364(float var1, float var2, float var3) {
		this.field4181 = var1;
		this.field4180 = var2;
		this.field4182 = var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-893321960"
	)
	final float method6618() {
		return (float)Math.sqrt((double)(this.field4182 * this.field4182 + this.field4181 * this.field4181 + this.field4180 * this.field4180));
	}

	public String toString() {
		return this.field4181 + ", " + this.field4180 + ", " + this.field4182;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-247001185"
	)
	public static void method6623() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
