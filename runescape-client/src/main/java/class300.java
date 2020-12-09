import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kg")
public class class300 {
	@ObfuscatedName("h")
	static char[] field3695;
	@ObfuscatedName("v")
	static char[] field3693;
	@ObfuscatedName("x")
	static char[] field3694;
	@ObfuscatedName("w")
	static int[] field3692;

	static {
		field3695 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3695[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3695[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3695[var0] = (char)(var0 + 48 - 52);
		}

		field3695[62] = '+';
		field3695[63] = '/';
		field3693 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3693[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3693[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3693[var0] = (char)(var0 + 48 - 52);
		}

		field3693[62] = '*';
		field3693[63] = '-';
		field3694 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3694[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3694[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3694[var0] = (char)(var0 + 48 - 52);
		}

		field3694[62] = '-';
		field3694[63] = '_';
		field3692 = new int[128];

		for (var0 = 0; var0 < field3692.length; ++var0) {
			field3692[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3692[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3692[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3692[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3692;
		field3692[43] = 62;
		var2[42] = 62;
		int[] var1 = field3692;
		field3692[47] = 63;
		var1[45] = 63;
	}
}
