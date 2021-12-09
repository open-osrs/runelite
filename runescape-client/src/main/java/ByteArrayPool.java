import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1756482419
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 379141881
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 173834125
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -521742755
	)
	static int field4026;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1862899705
	)
	static int field4023;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1634057369
	)
	static int field4028;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1124968779
	)
	static int field4021;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1777784581
	)
	static int field4030;
	@ObfuscatedName("d")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("h")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("g")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("e")
	static byte[][] field4034;
	@ObfuscatedName("f")
	public static ArrayList field4035;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4026 = 0; // L: 16
		field4023 = 1000; // L: 17
		field4028 = 250; // L: 18
		field4021 = 100; // L: 19
		field4030 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4034 = new byte[50][]; // L: 24
		field4035 = new ArrayList(); // L: 28
		field4035.clear(); // L: 32
		field4035.add(100); // L: 33
		field4035.add(5000); // L: 34
		field4035.add(10000); // L: 35
		field4035.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZS)[B",
		garbageValue = "-3055"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 50
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 51
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 52
			return var4; // L: 53
		}

		if (var0 != 5000) { // L: 55
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 56
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 57
			return var4; // L: 58
		}

		if (var0 != 10000) { // L: 60
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 61
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 62
			return var4; // L: 63
		}

		if (var0 != 30000) { // L: 65
			if (var0 < 30000) {
			}
		} else if (field4026 > 0) {
			var4 = field4034[--field4026]; // L: 66
			field4034[field4026] = null; // L: 67
			return var4; // L: 68
		}

		if (World.ByteArrayPool_arrays != null) { // L: 70
			for (int var2 = 0; var2 < SoundCache.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 71
				if (SoundCache.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 72
					if (var0 < SoundCache.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = World.ByteArrayPool_arrays[var2][--ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 73
					World.ByteArrayPool_arrays[var2][ApproximateRouteStrategy.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 74
					return var3; // L: 75
				}
			}
		}

		return new byte[var0]; // L: 88
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "43"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? Skeleton.method3944(var0, 10, var1) : Integer.toString(var0); // L: 111 112
	}
}
