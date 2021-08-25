import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mg")
public class class360 {
	@ObfuscatedName("o")
	static final int[] field4035;
	@ObfuscatedName("g")
	static final int[] field4033;

	static {
		field4035 = new int[16384];
		field4033 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4035[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4033[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
