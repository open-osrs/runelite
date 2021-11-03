import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class361 {
	@ObfuscatedName("o")
	static final int[] field4051;
	@ObfuscatedName("g")
	static final int[] field4047;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1081832115
	)
	static int field4050;

	static {
		field4051 = new int[16384]; // L: 8
		field4047 = new int[16384];
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4051[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4047[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "-1789357355"
	)
	public static void method6427(String[] var0, short[] var1) {
		class132.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10
}
