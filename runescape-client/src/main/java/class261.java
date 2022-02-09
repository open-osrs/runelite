import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public final class class261 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -2891221836887328245L
	)
	static long field3087;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 24993534899661965L
	)
	static long field3083;
	@ObfuscatedName("cp")
	static boolean field3085;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-864505260"
	)
	public static int method5002(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var1;
		} else if (var2 == 1) { // L: 24
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 25
		}
	}
}
