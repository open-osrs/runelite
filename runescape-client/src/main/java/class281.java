import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ja")
public class class281 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class276[] var2 = new class276[]{class276.field3282, class276.field3280}; // L: 14
		class276[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class276 var5 = var3[var4]; // L: 18
			if (var5.field3279 > var0) { // L: 20
				var0 = var5.field3279;
			}

			if (var5.field3281 > var1) { // L: 21
				var1 = var5.field3281;
			}
		}

	} // L: 25
}
