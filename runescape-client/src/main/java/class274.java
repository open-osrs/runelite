import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class274 {
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -466990055
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "47"
	)
	static boolean method5296(int var0) {
		for (int var1 = 0; var1 < Client.field729; ++var1) { // L: 11215
			if (Client.field731[var1] == var0) { // L: 11216
				return true;
			}
		}

		return false; // L: 11218
	}
}
