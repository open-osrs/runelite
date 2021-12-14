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
		field4005 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4005[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4005[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4005[var0] = (char)(var0 + 48 - 52);
		}

		field4005[62] = '+';
		field4005[63] = '/';
		field4003 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4003[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4003[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4003[var0] = (char)(var0 + 48 - 52);
		}

		field4003[62] = '*';
		field4003[63] = '-';
		field4002 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4002[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4002[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4002[var0] = (char)(var0 + 48 - 52);
		}

		field4002[62] = '-';
		field4002[63] = '_';
		field4004 = new int[128];

		for (var0 = 0; var0 < field4004.length; ++var0) {
			field4004[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4004[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4004[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4004[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4004;
		field4004[43] = 62;
		var2[42] = 62;
		int[] var1 = field4004;
		field4004[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-119080424"
	)
	public static float method6135(int var0) {
		var0 &= 16383;
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F));
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "113"
	)
	static boolean method6133() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
