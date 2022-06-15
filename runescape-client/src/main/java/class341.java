import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class341 {
	@ObfuscatedName("c")
	public static char[] field4146;
	@ObfuscatedName("v")
	static char[] field4143;
	@ObfuscatedName("q")
	static char[] field4144;
	@ObfuscatedName("f")
	static int[] field4145;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive7")
	static Archive archive7;

	static {
		field4146 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4146[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4146[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4146[var0] = (char)(var0 + 48 - 52);
		}

		field4146[62] = '+'; // L: 11
		field4146[63] = '/'; // L: 12
		field4143 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4143[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4143[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4143[var0] = (char)(var0 + 48 - 52);
		}

		field4143[62] = '*'; // L: 22
		field4143[63] = '-'; // L: 23
		field4144 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4144[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4144[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4144[var0] = (char)(var0 + 48 - 52);
		}

		field4144[62] = '-'; // L: 33
		field4144[63] = '_'; // L: 34
		field4145 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4145.length; ++var0) { // L: 41
			field4145[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4145[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4145[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4145[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4145; // L: 45
		field4145[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4145; // L: 48
		field4145[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51
}
