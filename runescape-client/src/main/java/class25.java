import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class25 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Llm;",
		garbageValue = "742415234"
	)
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.GRADIENT, FillMode.SOLID, FillMode.GRADIENT_ALPHA}; // L: 15
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lme;"
	)
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 99
			var2 = (RunException)var0; // L: 100
			var2.message = var2.message + ' ' + var1; // L: 101
		} else {
			var2 = new RunException(var0, var1); // L: 103
		}

		return var2; // L: 104
	}
}
