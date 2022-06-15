import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class92 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	public static void method2389() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 89
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 90
	} // L: 91

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "38"
	)
	static String method2388(String var0) {
		PlayerType[] var1 = SoundSystem.PlayerType_values(); // L: 12443

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12444
			PlayerType var3 = var1[var2]; // L: 12445
			if (var3.modIcon != -1 && var0.startsWith(SecureRandomCallable.method2066(var3.modIcon))) { // L: 12447 12448
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12449
				break;
			}
		}

		return var0; // L: 12456
	}
}
