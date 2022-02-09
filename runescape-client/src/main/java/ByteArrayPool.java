import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1690986053
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2143429099
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1419473161
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -853735569
	)
	static int field4072;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2007909183
	)
	static int field4073;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -957572747
	)
	static int field4074;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -816148267
	)
	static int field4071;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2026598395
	)
	static int field4076;
	@ObfuscatedName("h")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("q")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("x")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("p")
	static byte[][] field4080;
	@ObfuscatedName("n")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("j")
	public static ArrayList field4083;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -908422523
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4072 = 0; // L: 16
		field4073 = 1000; // L: 17
		field4074 = 250; // L: 18
		field4071 = 100; // L: 19
		field4076 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4080 = new byte[50][]; // L: 24
		field4083 = new ArrayList(); // L: 28
		NetCache.method5677(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "50"
	)
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) { // L: 52
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 53
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 54
			return var4; // L: 55
		}

		if (var0 != 5000) { // L: 57
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 58
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 59
			return var4; // L: 60
		}

		if (var0 != 10000) { // L: 62
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 63
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 64
			return var4; // L: 65
		}

		if (var0 != 30000) { // L: 67
			if (var0 < 30000) {
			}
		} else if (field4072 > 0) {
			var4 = field4080[--field4072]; // L: 68
			field4080[field4072] = null; // L: 69
			return var4; // L: 70
		}

		if (class113.ByteArrayPool_arrays != null) { // L: 72
			for (int var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) { // L: 73
				if (ByteArrayPool_alternativeSizes[var2] != var0) { // L: 74
					if (var0 < ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class113.ByteArrayPool_arrays[var2][--ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 75
					class113.ByteArrayPool_arrays[var2][ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 76
					return var3; // L: 77
				}
			}
		}

		return new byte[var0]; // L: 90
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqy;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 99
			var2 = (RunException)var0; // L: 100
			var2.message = var2.message + ' ' + var1; // L: 101
		} else {
			var2 = new RunException(var0, var1); // L: 103
		}

		return var2; // L: 104
	}
}
