import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nk")
public class class379 {
	@ObfuscatedName("r")
	static final int[] field4238;
	@ObfuscatedName("o")
	static final int[] field4244;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1725466411
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		field4238 = new int[2048];
		field4244 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4238[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4244[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
