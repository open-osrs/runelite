import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nx")
public class class384 {
	@ObfuscatedName("a")
	static final int[] field4287;
	@ObfuscatedName("y")
	static final int[] field4288;

	static {
		field4287 = new int[2048]; // L: 13
		field4288 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4287[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4288[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
