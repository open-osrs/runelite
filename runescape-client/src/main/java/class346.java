import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class346 {
	@ObfuscatedName("v")
	static char[] field4136;
	@ObfuscatedName("c")
	static char[] field4133;
	@ObfuscatedName("i")
	static char[] field4134;
	@ObfuscatedName("f")
	static int[] field4135;

	static {
		field4136 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4136[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4136[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4136[var0] = (char)(var0 + 48 - 52);
		}

		field4136[62] = '+'; // L: 11
		field4136[63] = '/'; // L: 12
		field4133 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4133[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4133[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4133[var0] = (char)(var0 + 48 - 52);
		}

		field4133[62] = '*'; // L: 22
		field4133[63] = '-'; // L: 23
		field4134 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4134[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4134[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4134[var0] = (char)(var0 + 48 - 52);
		}

		field4134[62] = '-'; // L: 33
		field4134[63] = '_'; // L: 34
		field4135 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4135.length; ++var0) { // L: 41
			field4135[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4135[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4135[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4135[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4135; // L: 45
		field4135[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4135; // L: 48
		field4135[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-60390428"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field540) { // L: 11875
			Client.field715[var0.rootIndex] = true; // L: 11876
		}

	} // L: 11878
}
