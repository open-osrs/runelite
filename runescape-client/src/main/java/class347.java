import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mo")
public class class347 {
	@ObfuscatedName("t")
	static final int[] field4056;
	@ObfuscatedName("e")
	static final int[] field4059;

	static {
		field4056 = new int[2048]; // L: 13
		field4059 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4056[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4059[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 20
		}

	} // L: 22
}
