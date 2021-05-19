import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -687377531
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -789880073
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -335516745
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("l")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("z")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;

	static {
		ByteArrayPool_smallCount = 0; // L: 4
		ByteArrayPool_mediumCount = 0; // L: 5
		ByteArrayPool_largeCount = 0; // L: 6
		ByteArrayPool_small = new byte[1000][]; // L: 7
		ByteArrayPool_medium = new byte[250][]; // L: 8
		ByteArrayPool_large = new byte[50][]; // L: 9
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1490789395"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 35
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 36
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 37
			return var4; // L: 38
		}

		if (var0 != 5000) { // L: 40
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 41
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 42
			return var4; // L: 43
		}

		if (var0 != 30000) { // L: 45
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 46
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 47
			return var4; // L: 48
		}

		if (ByteArrayPool_arrays != null) { // L: 50
			for (int var2 = 0; var2 < class15.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 51
				if (class15.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 52
					if (var0 < class15.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class9.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ByteArrayPool_arrays[var2][--class9.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 53
					ByteArrayPool_arrays[var2][class9.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 54
					return var3; // L: 55
				}
			}
		}

		return new byte[var0]; // L: 68
	}
}
