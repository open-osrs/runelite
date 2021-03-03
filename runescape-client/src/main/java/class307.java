import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public final class class307 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -5661179998477145969L
	)
	static long field3734;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6375840099148594553L
	)
	static long field3735;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Llp;",
		garbageValue = "1168600989"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field3897, FillMode.SOLID, FillMode.field3896}; // L: 15
	}
}
