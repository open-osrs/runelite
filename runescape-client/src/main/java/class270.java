import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jq")
public class class270 {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		longValue = 7367865405897213441L
	)
	static long field3177;
	@ObfuscatedName("c")
	static int[] field3179;

	static {
		new Object();
		field3179 = new int[33]; // L: 8
		field3179[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3179[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17
}
