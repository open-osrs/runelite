import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class378 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-53601525"
	)
	static final int method6550(int var0, int var1) {
		if (var0 == -1) { // L: 844
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 845
			if (var1 < 2) { // L: 846
				var1 = 2;
			} else if (var1 > 126) { // L: 847
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 848
		}
	}
}
