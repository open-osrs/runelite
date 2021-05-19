import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("or")
public class class402 {
	@ObfuscatedName("q")
	static final int[] field4286;
	@ObfuscatedName("i")
	static final int[] field4287;

	static {
		field4286 = new int[2048]; // L: 13
		field4287 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4286[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4287[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 20
		}

	} // L: 22
}
