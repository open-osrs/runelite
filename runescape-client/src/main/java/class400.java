import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class400 {
	@ObfuscatedName("b")
	static final int[] field4389;
	@ObfuscatedName("n")
	static final int[] field4391;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		field4389 = new int[16384]; // L: 8
		field4391 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4389[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4391[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17
}
