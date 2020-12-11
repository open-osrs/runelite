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
		field3695 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3695[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3695[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3695[var0] = (char)(var0 + 48 - 52);
		}

		field3695[62] = '+'; // L: 11
		field3695[63] = '/'; // L: 12
		field3693 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3693[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3693[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3693[var0] = (char)(var0 + 48 - 52);
		}

		field3693[62] = '*'; // L: 22
		field3693[63] = '-'; // L: 23
		field3694 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3694[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3694[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3694[var0] = (char)(var0 + 48 - 52);
		}

		field3694[62] = '-'; // L: 33
		field3694[63] = '_'; // L: 34
		field3692 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3692.length; ++var0) { // L: 41
			field3692[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3692[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3692[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3692[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3692; // L: 45
		field3692[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3692; // L: 48
		field3692[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
