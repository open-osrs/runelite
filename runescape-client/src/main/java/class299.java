import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class299 {
	@ObfuscatedName("z")
	static char[] field3676;
	@ObfuscatedName("k")
	static char[] field3675;
	@ObfuscatedName("s")
	static char[] field3674;
	@ObfuscatedName("t")
	static int[] field3677;

	static {
		field3676 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3676[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3676[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3676[var0] = (char)(var0 + 48 - 52);
		}

		field3676[62] = '+'; // L: 11
		field3676[63] = '/'; // L: 12
		field3675 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3675[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3675[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3675[var0] = (char)(var0 + 48 - 52);
		}

		field3675[62] = '*'; // L: 22
		field3675[63] = '-'; // L: 23
		field3674 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3674[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3674[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3674[var0] = (char)(var0 + 48 - 52);
		}

		field3674[62] = '-'; // L: 33
		field3674[63] = '_'; // L: 34
		field3677 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3677.length; ++var0) { // L: 41
			field3677[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3677[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3677[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3677[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3677; // L: 45
		field3677[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3677; // L: 48
		field3677[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	public static final void method5393(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 86
		ViewportMouse.ViewportMouse_y = var1; // L: 87
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 88
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 89
		ViewportMouse.ViewportMouse_false0 = false; // L: 90
	} // L: 91
}
