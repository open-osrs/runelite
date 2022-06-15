import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class93 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 337729441
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 722950439
	)
	int field1280;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1232104347
	)
	int field1283;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 375330431
	)
	int field1279;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2011383933
	)
	int field1281;

	class93(int var1, int var2, int var3, int var4) {
		this.field1280 = var1; // L: 10
		this.field1283 = var2; // L: 11
		this.field1279 = var3; // L: 12
		this.field1281 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-376919384"
	)
	int method2391() {
		return this.field1280; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1976546197"
	)
	int method2392() {
		return this.field1283; // L: 21
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2400() {
		return this.field1279; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-936836113"
	)
	int method2393() {
		return this.field1281; // L: 29
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;II)V",
		garbageValue = "-222305285"
	)
	static void method2403(Archive var0, int var1) {
		if (var0.field3990) { // L: 62
			if (var1 <= NetCache.field4031) { // L: 63
				throw new RuntimeException(""); // L: 64
			}

			if (var1 < NetCache.field4032) { // L: 66
				NetCache.field4032 = var1; // L: 67
			}
		} else {
			if (var1 >= NetCache.field4032) { // L: 71
				throw new RuntimeException(""); // L: 72
			}

			if (var1 > NetCache.field4031) { // L: 74
				NetCache.field4031 = var1; // L: 75
			}
		}

		if (KitDefinition.field1862 != null) { // L: 78
			DirectByteArrayCopier.method5512(var0, var1); // L: 79
		} else {
			ClanChannel.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 82
			NetCache.NetCache_archives[var1] = var0; // L: 83
		}
	} // L: 80 84

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "100"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4207) { // L: 98
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 99
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4208) { // L: 102
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 103
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4209) { // L: 106
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 107
		} else if (var0.length == 30000 && ByteArrayPool.field4216 < ByteArrayPool.field4210) { // L: 110
			ByteArrayPool.field4214[++ByteArrayPool.field4216 - 1] = var0; // L: 111
		} else {
			if (class464.ByteArrayPool_arrays != null) { // L: 114
				for (int var1 = 0; var1 < Canvas.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 115
					if (var0.length == Canvas.ByteArrayPool_alternativeSizes[var1] && class17.ByteArrayPool_altSizeArrayCounts[var1] < class464.ByteArrayPool_arrays[var1].length) { // L: 116
						class464.ByteArrayPool_arrays[var1][class17.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 117
						return; // L: 118
					}
				}
			}

		}
	} // L: 100 104 108 112 122

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-769795107"
	)
	public static int method2404(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
