import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class307 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1390768501
	)
	static int field3588;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1395433659
	)
	@Export("menuX")
	static int menuX;

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "882175193"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 134

		try {
			var0 = ReflectionCheck.getPreferencesFile("", Login.field917.name, true); // L: 136
			Buffer var1 = Interpreter.clientPreferences.toBuffer(); // L: 137
			var0.write(var1.array, 0, var1.offset); // L: 138
		} catch (Exception var3) { // L: 140
		}

		try {
			if (var0 != null) { // L: 142
				var0.closeSync(true); // L: 143
			}
		} catch (Exception var2) { // L: 146
		}

	} // L: 147
}
