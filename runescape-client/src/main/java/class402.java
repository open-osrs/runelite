import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oo")
public class class402 {
	@ObfuscatedName("s")
	static final int[] field4280;
	@ObfuscatedName("u")
	static final int[] field4279;

	static {
		field4280 = new int[2048]; // L: 13
		field4279 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4280[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4279[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 20
		}

	} // L: 22
}
