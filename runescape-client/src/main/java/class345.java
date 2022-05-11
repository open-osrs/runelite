import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public final class class345 {
	@ObfuscatedName("o")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("q")
	static long[] field4168;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4168 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4168.length; ++var0) { // L: 8
			field4168[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1009595940"
	)
	static int method6156(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 33
			var1 /= 2;
		}

		if (var2 > 192) { // L: 34
			var1 /= 2;
		}

		if (var2 > 217) { // L: 35
			var1 /= 2;
		}

		if (var2 > 243) { // L: 36
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 37
		return var3; // L: 38
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-127167673"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1655
		Login.Login_response2 = var1; // L: 1656
		Login.Login_response3 = var2; // L: 1657
	} // L: 1658
}
