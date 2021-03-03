import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class300 {
	@ObfuscatedName("n")
	static char[] field3688;
	@ObfuscatedName("v")
	static char[] field3685;
	@ObfuscatedName("d")
	static char[] field3686;
	@ObfuscatedName("c")
	static int[] field3687;

	static {
		field3688 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3688[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3688[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3688[var0] = (char)(var0 + 48 - 52);
		}

		field3688[62] = '+'; // L: 11
		field3688[63] = '/'; // L: 12
		field3685 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3685[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3685[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3685[var0] = (char)(var0 + 48 - 52);
		}

		field3685[62] = '*'; // L: 22
		field3685[63] = '-'; // L: 23
		field3686 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3686[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3686[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3686[var0] = (char)(var0 + 48 - 52);
		}

		field3686[62] = '-'; // L: 33
		field3686[63] = '_'; // L: 34
		field3687 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3687.length; ++var0) { // L: 41
			field3687[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3687[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3687[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3687[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3687; // L: 45
		field3687[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3687; // L: 48
		field3687[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-43"
	)
	static final void method5473(String var0) {
		AbstractWorldMapData.addGameMessage(30, "", var0); // L: 112
	} // L: 113
}
