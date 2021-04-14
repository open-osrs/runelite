import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class301 {
	@ObfuscatedName("f")
	static char[] field3751;
	@ObfuscatedName("o")
	static char[] field3753;
	@ObfuscatedName("u")
	static char[] field3752;
	@ObfuscatedName("p")
	static int[] field3754;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("pcmPlayerProvider")
	public static PlayerProvider pcmPlayerProvider;

	static {
		field3751 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3751[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3751[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3751[var0] = (char)(var0 + 48 - 52);
		}

		field3751[62] = '+'; // L: 11
		field3751[63] = '/'; // L: 12
		field3753 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3753[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3753[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3753[var0] = (char)(var0 + 48 - 52);
		}

		field3753[62] = '*'; // L: 22
		field3753[63] = '-'; // L: 23
		field3752 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3752[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3752[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3752[var0] = (char)(var0 + 48 - 52);
		}

		field3752[62] = '-'; // L: 33
		field3752[63] = '_'; // L: 34
		field3754 = new int[128];

		for (var0 = 0; var0 < field3754.length; ++var0) { // L: 41
			field3754[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3754[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3754[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3754[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3754; // L: 45
		field3754[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3754; // L: 48
		field3754[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lbs;",
		garbageValue = "538543720"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}
}
