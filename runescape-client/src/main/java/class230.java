import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hi")
public class class230 {
	@ObfuscatedName("v")
	static int[] field2814;

	static {
		new Object();
		field2814 = new int[33]; // L: 8
		field2814[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2814[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17
}
