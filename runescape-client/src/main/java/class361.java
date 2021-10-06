import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mb")
public class class361 {
	@ObfuscatedName("m")
	static final int[] field4056;
	@ObfuscatedName("k")
	static final int[] field4054;

	static {
		field4056 = new int[16384];
		field4054 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4056[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4054[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
