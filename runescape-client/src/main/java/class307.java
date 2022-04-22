import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class307 {
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "[Lky;"
	)
	static Widget[] field3585;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class302[] var2 = class216.method4365(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class302 var4 = var2[var3]; // L: 14
			if (var4.field3550 > var0) {
				var0 = var4.field3550; // L: 16
			}

			if (var4.field3548 > var1) { // L: 17
				var1 = var4.field3548;
			}
		}

	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1276900291"
	)
	public static boolean method5789() {
		return class273.musicPlayerStatus != 0 ? true : class273.midiPcmStream.isReady(); // L: 70 71
	}
}
