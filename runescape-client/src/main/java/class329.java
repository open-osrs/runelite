import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class329 {
	@ObfuscatedName("c")
	static char[] field4005;
	@ObfuscatedName("b")
	static char[] field4003;
	@ObfuscatedName("p")
	static char[] field4002;
	@ObfuscatedName("m")
	static int[] field4004;

	static {
		field4005 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4005[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4005[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4005[var0] = (char)(var0 + 48 - 52);
		}

		field4005[62] = '+'; // L: 11
		field4005[63] = '/'; // L: 12
		field4003 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4003[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4003[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4003[var0] = (char)(var0 + 48 - 52);
		}

		field4003[62] = '*'; // L: 22
		field4003[63] = '-'; // L: 23
		field4002 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4002[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4002[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4002[var0] = (char)(var0 + 48 - 52);
		}

		field4002[62] = '-'; // L: 33
		field4002[63] = '_'; // L: 34
		field4004 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4004.length; ++var0) { // L: 41
			field4004[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4004[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4004[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4004[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4004; // L: 45
		field4004[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4004; // L: 48
		field4004[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-119080424"
	)
	public static float method6135(int var0) {
		var0 &= 16383; // L: 24
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F)); // L: 25
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "113"
	)
	static boolean method6133() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5588
	}
}
