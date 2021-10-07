import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1396551111
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 893539471
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -726411367
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2028367777
	)
	static int field3890;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -915452121
	)
	static int field3891;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1219309853
	)
	static int field3892;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 547302463
	)
	static int field3899;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1927164801
	)
	static int field3897;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("v")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("s")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("c")
	static byte[][] field3898;
	@ObfuscatedName("z")
	public static ArrayList field3893;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field3890 = 0;
		field3891 = 1000;
		field3892 = 250;
		field3899 = 100;
		field3897 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field3898 = new byte[50][];
		field3893 = new ArrayList();
		field3893.clear();
		field3893.add(100);
		field3893.add(5000);
		field3893.add(10000);
		field3893.add(30000);
		new HashMap();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-56"
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

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field3890 > 0) {
			var4 = field3898[--field3890];
			field3898[field3890] = null;
			return var4;
		}

		if (class117.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < GrandExchangeOfferUnitPriceComparator.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (Message.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class117.ByteArrayPool_arrays[var2][--Message.ByteArrayPool_altSizeArrayCounts[var2]];
					class117.ByteArrayPool_arrays[var2][Message.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1095042246"
	)
	public static int[] method5897() {
		int[] var0 = new int[KeyHandler.field136];

		for (int var1 = 0; var1 < KeyHandler.field136; ++var1) {
			var0[var1] = KeyHandler.field135[var1];
		}

		return var0;
	}
}
