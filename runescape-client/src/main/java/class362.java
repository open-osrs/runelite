import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mx")
public class class362 {
	@ObfuscatedName("i")
	static final int[] field4063;
	@ObfuscatedName("y")
	static final int[] field4059;

	static {
		field4063 = new int[2048];
		field4059 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4063[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4059[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
