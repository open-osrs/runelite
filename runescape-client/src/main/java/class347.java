import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mj")
public class class347 {
	@ObfuscatedName("z")
	static final int[] field4060;
	@ObfuscatedName("u")
	static final int[] field4062;

	static {
		field4060 = new int[2048]; // L: 13
		field4062 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4060[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 19
			field4062[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
