import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class277 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-592561993"
	)
	public static void method5089(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 19
			ByteArrayPool.ByteArrayPool_alternativeSizes = var0; // L: 25
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 26
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 27

			for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 28
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 29
			}

		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 20
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null; // L: 21
			ByteArrayPool.ByteArrayPool_arrays = null; // L: 22
		}
	} // L: 23 31
}
