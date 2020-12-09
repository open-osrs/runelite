import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 400072039
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -692172719
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -774539929
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("j")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[50][];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "1"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (class23.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (SoundCache.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < SoundCache.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (JagexCache.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class23.ByteArrayPool_arrays[var2][--JagexCache.ByteArrayPool_altSizeArrayCounts[var2]];
					class23.ByteArrayPool_arrays[var2][JagexCache.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}
}
