import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nf")
public class class378 {
	@ObfuscatedName("t")
	static final int[] field4233;
	@ObfuscatedName("s")
	static final int[] field4237;

	static {
		field4233 = new int[16384];
		field4237 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4233[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4237[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
