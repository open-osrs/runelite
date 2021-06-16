import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ow")
public class class403 {
	@ObfuscatedName("d")
	static final int[] field4296;
	@ObfuscatedName("z")
	static final int[] field4298;

	static {
		field4296 = new int[2048]; // L: 13
		field4298 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4296[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 19
			field4298[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22
}
