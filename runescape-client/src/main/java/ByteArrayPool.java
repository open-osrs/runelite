import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2135689981
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 742427787
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 557846703
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 257291791
	)
	static int field4169;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1915977333
	)
	static int field4178;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -971009911
	)
	static int field4165;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 507582471
	)
	static int field4172;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1120130659
	)
	static int field4177;
	@ObfuscatedName("c")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("j")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("p")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("s")
	static byte[][] field4166;
	@ObfuscatedName("b")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("m")
	public static ArrayList field4173;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4169 = 0; // L: 16
		field4178 = 1000; // L: 17
		field4165 = 250; // L: 18
		field4172 = 100; // L: 19
		field4177 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4166 = new byte[50][]; // L: 24
		field4173 = new ArrayList(); // L: 28
		field4173.clear(); // L: 32
		field4173.add(100); // L: 33
		field4173.add(5000); // L: 34
		field4173.add(10000); // L: 35
		field4173.add(30000); // L: 36
		new HashMap();
	} // L: 42

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "68"
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
		} else if (field4169 > 0) {
			var4 = field4166[--field4169]; // L: 66
			field4166[field4169] = null; // L: 67
			return var4; // L: 68
		}

		if (ScriptEvent.ByteArrayPool_arrays != null) { // L: 70
			for (int var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) { // L: 71
				if (ByteArrayPool_alternativeSizes[var2] != var0) { // L: 72
					if (var0 < ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (GameObject.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = ScriptEvent.ByteArrayPool_arrays[var2][--GameObject.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 73
					ScriptEvent.ByteArrayPool_arrays[var2][GameObject.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 74
					return var3; // L: 75
				}
			}
		}

		return new byte[var0]; // L: 88
	}
}
