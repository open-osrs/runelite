import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public class class317 {
	@ObfuscatedName("l")
	static char[] field3869;
	@ObfuscatedName("q")
	static char[] field3865;
	@ObfuscatedName("f")
	static char[] field3866;
	@ObfuscatedName("j")
	static int[] field3867;

	static {
		field3869 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3869[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3869[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3869[var0] = (char)(var0 + 48 - 52);
		}

		field3869[62] = '+';
		field3869[63] = '/';
		field3865 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3865[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3865[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3865[var0] = (char)(var0 + 48 - 52);
		}

		field3865[62] = '*';
		field3865[63] = '-';
		field3866 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3866[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3866[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3866[var0] = (char)(var0 + 48 - 52);
		}

		field3866[62] = '-';
		field3866[63] = '_';
		field3867 = new int[128];

		for (var0 = 0; var0 < field3867.length; ++var0) {
			field3867[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3867[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3867[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3867[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3867;
		field3867[43] = 62;
		var2[42] = 62;
		int[] var1 = field3867;
		field3867[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1006601644"
	)
	static boolean method5800() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
