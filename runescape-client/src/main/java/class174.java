import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class174 {
	@ObfuscatedName("s")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("a")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("p")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("j")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -1116273289
	)
	@Export("cameraY")
	static int cameraY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Low;IIII)V",
		garbageValue = "-1139186342"
	)
	static void method3512(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, NetSocket.method2923(var1, var2, var3), var0.pixels.length * 4); // L: 46
	} // L: 47

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "18"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class132.Widget_loadedInterfaces[var0]) { // L: 216
			return true;
		} else if (!class283.Widget_archive.tryLoadGroup(var0)) { // L: 217
			return false;
		} else {
			int var1 = class283.Widget_archive.getGroupFileCount(var0); // L: 218
			if (var1 == 0) { // L: 219
				class132.Widget_loadedInterfaces[var0] = true; // L: 220
				return true; // L: 221
			} else {
				if (WorldMapSection1.Widget_interfaceComponents[var0] == null) { // L: 223
					WorldMapSection1.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 224
					if (WorldMapSection1.Widget_interfaceComponents[var0][var2] == null) { // L: 225
						byte[] var3 = class283.Widget_archive.takeFile(var0, var2); // L: 226
						if (var3 != null) { // L: 227
							WorldMapSection1.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 228
							WorldMapSection1.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 229
							if (var3[0] == -1) { // L: 230
								WorldMapSection1.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								WorldMapSection1.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 231
							}
						}
					}
				}

				class132.Widget_loadedInterfaces[var0] = true; // L: 235
				return true; // L: 236
			}
		}
	}
}
