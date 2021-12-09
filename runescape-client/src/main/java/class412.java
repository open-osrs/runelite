import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class412 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "103250498"
	)
	public static String method7287(String var0) {
		int var1 = var0.length(); // L: 156
		char[] var2 = new char[var1]; // L: 157
		byte var3 = 2; // L: 158

		for (int var4 = 0; var4 < var1; ++var4) { // L: 159
			char var5 = var0.charAt(var4); // L: 160
			if (var3 == 0) { // L: 161
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 162
				var5 = HealthBar.method2313(var5);
			}

			if (Character.isLetter(var5)) { // L: 163
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 164
				if (Character.isSpaceChar(var5)) { // L: 165
					if (var3 != 2) { // L: 166
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 168
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 169
		}

		return new String(var2); // L: 171
	}
}
