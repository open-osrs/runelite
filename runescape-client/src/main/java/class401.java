import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ov")
public class class401 {
	@ObfuscatedName("j")
	static final int[] field4442;
	@ObfuscatedName("e")
	static final int[] field4443;

	static {
		field4442 = new int[16384]; // L: 8
		field4443 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4442[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2)); // L: 14
			field4443[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
