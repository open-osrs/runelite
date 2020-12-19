import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
public class class197 {
	@ObfuscatedName("h")
	static int[] field2369;

	static {
		new Object();
		field2369 = new int[33]; // L: 8
		field2369[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2369[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17
}
