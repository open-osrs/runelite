import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mi")
public class class346 {
	@ObfuscatedName("z")
	static final int[] field4043;
	@ObfuscatedName("w")
	static final int[] field4046;

	static {
		field4043 = new int[2048];
		field4046 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4043[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4046[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
