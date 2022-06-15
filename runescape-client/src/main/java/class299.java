import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public final class class299 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;",
		garbageValue = "268550387"
	)
	static ClientPreferences method5754() {
		AccessFile var0 = null; // L: 112
		ClientPreferences var1 = new ClientPreferences(); // L: 113

		try {
			var0 = class67.getPreferencesFile("", class285.field3313.name, false); // L: 115
			byte[] var2 = new byte[(int)var0.length()]; // L: 116

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 117 118 121
				var4 = var0.read(var2, var3, var2.length - var3); // L: 119
				if (var4 == -1) {
					throw new IOException(); // L: 120
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 123
		} catch (Exception var6) { // L: 125
		}

		try {
			if (var0 != null) { // L: 127
				var0.close();
			}
		} catch (Exception var5) { // L: 129
		}

		return var1; // L: 130
	}
}
