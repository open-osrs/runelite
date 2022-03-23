import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class345 {
	@ObfuscatedName("ry")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("v")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("World_request")
	static UrlRequest World_request;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-1027496859"
	)
	static String method6478(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 107
			if (var2 && var0 >= 0) { // L: 108
				int var3 = 2; // L: 109

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 110 111 113
					var4 /= var1; // L: 112
				}

				char[] var5 = new char[var3]; // L: 115
				var5[0] = '+'; // L: 116

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 117
					int var7 = var0; // L: 118
					var0 /= var1; // L: 119
					int var8 = var7 - var0 * var1; // L: 120
					if (var8 >= 10) { // L: 121
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 122
					}
				}

				return new String(var5); // L: 124
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-50"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 135
	}
}
