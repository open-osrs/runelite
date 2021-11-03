import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -476985145
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1576005085
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -381672383
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2068379159
	)
	static int field3891;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 450416009
	)
	static int field3881;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -358256925
	)
	static int field3882;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -477323591
	)
	static int field3883;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 231839197
	)
	static int field3884;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("t")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("l")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("u")
	static byte[][] field3888;
	@ObfuscatedName("z")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("d")
	static ArrayList field3890;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field3891 = 0; // L: 16
		field3881 = 1000; // L: 17
		field3882 = 250; // L: 18
		field3883 = 100; // L: 19
		field3884 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field3888 = new byte[50][]; // L: 24
		field3890 = new ArrayList(); // L: 28
		class301.method5508(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "66"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 70
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 71
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 72
			return var4; // L: 73
		}

		if (var0 != 5000) { // L: 75
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 76
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 77
			return var4; // L: 78
		}

		if (var0 != 10000) { // L: 80
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 81
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 82
			return var4; // L: 83
		}

		if (var0 != 30000) { // L: 85
			if (var0 < 30000) {
			}
		} else if (field3891 > 0) {
			var4 = field3888[--field3891]; // L: 86
			field3888[field3891] = null; // L: 87
			return var4; // L: 88
		}

		if (class260.ByteArrayPool_arrays != null) { // L: 90
			for (int var2 = 0; var2 < class176.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
				if (class176.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 92
					if (var0 < class176.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class260.ByteArrayPool_arrays[var2][--ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
					class260.ByteArrayPool_arrays[var2][ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
					return var3; // L: 95
				}
			}
		}

		return new byte[var0]; // L: 108
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-21"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 406
		int var2 = var1.readUnsignedByte(); // L: 407
		int var3 = var1.readInt(); // L: 408
		if (var3 < 0 || AbstractArchive.field3702 != 0 && var3 > AbstractArchive.field3702) { // L: 409
			throw new RuntimeException(); // L: 410
		} else if (var2 == 0) { // L: 412
			byte[] var6 = new byte[var3]; // L: 413
			var1.readBytes(var6, 0, var3); // L: 414
			return var6; // L: 415
		} else {
			int var4 = var1.readInt(); // L: 418
			if (var4 >= 0 && (AbstractArchive.field3702 == 0 || var4 <= AbstractArchive.field3702)) { // L: 419
				byte[] var5 = new byte[var4]; // L: 422
				if (var2 == 1) { // L: 423
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 424
				}

				return var5; // L: 425
			} else {
				throw new RuntimeException(); // L: 420
			}
		}
	}
}
