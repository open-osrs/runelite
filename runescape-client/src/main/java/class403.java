import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class403 {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("v")
	static final int[] field4453;
	@ObfuscatedName("y")
	static final int[] field4450;

	static {
		field4453 = new int[2048]; // L: 13
		field4450 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4453[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2)); // L: 19
			field4450[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 20
		}

	} // L: 22
}
