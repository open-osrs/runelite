import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-16"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-308662955"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "127"
	)
	public static String method5528(String var0) {
		int var1 = var0.length(); // L: 147
		char[] var2 = new char[var1]; // L: 148
		byte var3 = 2; // L: 149

		for (int var4 = 0; var4 < var1; ++var4) { // L: 150
			char var5 = var0.charAt(var4); // L: 151
			if (var3 == 0) { // L: 152
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 153
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 156
					var6 = Character.toTitleCase(var5); // L: 160
				} else {
					var6 = var5; // L: 157
				}

				var5 = var6; // L: 162
			}

			if (Character.isLetter(var5)) { // L: 164
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 165
				if (Character.isSpaceChar(var5)) { // L: 166
					if (var3 != 2) { // L: 167
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 169
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 170
		}

		return new String(var2); // L: 172
	}
}
