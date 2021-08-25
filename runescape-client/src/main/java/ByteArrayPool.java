import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1332805501
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1733522365
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1476651715
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("z")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[50][];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "36"
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

		if (ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
				if (ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (TileItem.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ByteArrayPool_arrays[var2][--TileItem.ByteArrayPool_altSizeArrayCounts[var2]];
					ByteArrayPool_arrays[var2][TileItem.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public static int method5814(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = Clock.method2797(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class264.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}
}
