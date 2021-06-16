import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hb")
public class class231 {
	@ObfuscatedName("f")
	static int[] field2817;
	@ObfuscatedName("o")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;

	static {
		new Object();
		field2817 = new int[33]; // L: 8
		field2817[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field2817[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17
}
