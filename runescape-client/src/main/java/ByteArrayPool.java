import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -679236325
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 664960087
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1131523735
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("y")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("j")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("o")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;

	static {
		ByteArrayPool_smallCount = 0; // L: 4
		ByteArrayPool_mediumCount = 0; // L: 5
		ByteArrayPool_largeCount = 0; // L: 6
		ByteArrayPool_small = new byte[1000][]; // L: 7
		ByteArrayPool_medium = new byte[250][]; // L: 8
		ByteArrayPool_large = new byte[50][]; // L: 9
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-120"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 20
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 21
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 22
			return var4; // L: 23
		}

		if (var0 != 5000) { // L: 25
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 26
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 27
			return var4; // L: 28
		}

		if (var0 != 30000) { // L: 30
			if (var0 < 30000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 31
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 32
			return var4; // L: 33
		}

		if (Tiles.ByteArrayPool_arrays != null) { // L: 35
			for (int var2 = 0; var2 < class372.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 36
				if (class372.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 37
					if (var0 < class372.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = Tiles.ByteArrayPool_arrays[var2][--WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 38
					Tiles.ByteArrayPool_arrays[var2][WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-194411465"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
