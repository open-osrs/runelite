import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
public class class197 {
	@ObfuscatedName("h")
	static int[] field2369;

	static {
		new Object();
		field2369 = new int[33];
		field2369[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2369[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
