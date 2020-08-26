import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mp")
public class class346 {
	@ObfuscatedName("m")
	static final int[] field4050;
	@ObfuscatedName("n")
	static final int[] field4053;

	static {
		field4050 = new int[2048]; // L: 13
		field4053 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4050[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 19
			field4053[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
