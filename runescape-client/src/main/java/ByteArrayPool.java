import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2043697785
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1060831441
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1175962597
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1771611339
	)
	static int field4163;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -321282309
	)
	static int field4159;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -178630953
	)
	static int field4160;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -308081175
	)
	static int field4161;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 889627885
	)
	static int field4152;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("d")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("m")
	static byte[][] field4162;
	@ObfuscatedName("x")
	static ArrayList field4167;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1658529089
	)
	@Export("menuHeight")
	static int menuHeight;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4163 = 0; // L: 16
		field4159 = 1000; // L: 17
		field4160 = 250; // L: 18
		field4161 = 100; // L: 19
		field4152 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4162 = new byte[50][]; // L: 24
		field4167 = new ArrayList(); // L: 28
		Login.method1960(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-82"
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
		} else if (field4163 > 0) {
			var4 = field4162[--field4163]; // L: 86
			field4162[field4163] = null; // L: 87
			return var4; // L: 88
		}

		if (BoundaryObject.ByteArrayPool_arrays != null) { // L: 90
			for (int var2 = 0; var2 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
				if (FloorOverlayDefinition.ByteArrayPool_alternativeSizes[var2] != var0) { // L: 92
					if (var0 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class128.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = BoundaryObject.ByteArrayPool_arrays[var2][--class128.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
					BoundaryObject.ByteArrayPool_arrays[var2][class128.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
					return var3; // L: 95
				}
			}
		}

		return new byte[var0]; // L: 108
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1492106780"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 8607
		Client.isMenuOpen = false; // L: 8608
		Client.menuActions[0] = "Cancel"; // L: 8610
		Client.menuTargets[0] = ""; // L: 8611
		Client.menuOpcodes[0] = 1006; // L: 8612
		Client.menuShiftClick[0] = false; // L: 8613
		Client.menuOptionsCount = 1; // L: 8614
	} // L: 8615
}
