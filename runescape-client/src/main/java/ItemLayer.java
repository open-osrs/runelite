import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 1448149945
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -761869701
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 765081793
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1863896899
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1265231529
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 9107611929187585679L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 777440775
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;IZI)Lfb;",
		garbageValue = "1187690117"
	)
	@Export("loadFrames")
	public static Frames loadFrames(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgg;",
		garbageValue = "746692675"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2370, ServerPacket.field2351, ServerPacket.field2431, ServerPacket.field2353, ServerPacket.field2354, ServerPacket.field2355, ServerPacket.field2356, ServerPacket.field2357, ServerPacket.field2358, ServerPacket.field2359, ServerPacket.field2432, ServerPacket.field2426, ServerPacket.field2362, ServerPacket.field2363, ServerPacket.field2422, ServerPacket.field2380, ServerPacket.field2366, ServerPacket.field2364, ServerPacket.field2368, ServerPacket.field2369, ServerPacket.field2352, ServerPacket.field2433, ServerPacket.field2367, ServerPacket.field2373, ServerPacket.field2374, ServerPacket.field2428, ServerPacket.field2376, ServerPacket.field2377, ServerPacket.field2378, ServerPacket.field2379, ServerPacket.field2393, ServerPacket.field2392, ServerPacket.field2446, ServerPacket.field2383, ServerPacket.field2384, ServerPacket.field2385, ServerPacket.field2361, ServerPacket.field2387, ServerPacket.field2409, ServerPacket.field2382, ServerPacket.field2413, ServerPacket.field2391, ServerPacket.field2375, ServerPacket.field2372, ServerPacket.field2388, ServerPacket.field2436, ServerPacket.field2396, ServerPacket.field2390, ServerPacket.field2398, ServerPacket.field2399, ServerPacket.field2400, ServerPacket.field2401, ServerPacket.field2402, ServerPacket.field2403, ServerPacket.field2394, ServerPacket.field2405, ServerPacket.field2406, ServerPacket.field2407, ServerPacket.field2408, ServerPacket.field2448, ServerPacket.field2410, ServerPacket.field2411, ServerPacket.field2412, ServerPacket.field2381, ServerPacket.field2414, ServerPacket.field2415, ServerPacket.field2371, ServerPacket.field2417, ServerPacket.field2418, ServerPacket.field2419, ServerPacket.field2395, ServerPacket.field2421, ServerPacket.field2386, ServerPacket.field2423, ServerPacket.field2424, ServerPacket.field2425, ServerPacket.field2416, ServerPacket.field2427, ServerPacket.field2404, ServerPacket.field2350, ServerPacket.field2365, ServerPacket.field2434, ServerPacket.field2430, ServerPacket.field2360, ServerPacket.field2397, ServerPacket.field2435, ServerPacket.field2429, ServerPacket.field2437, ServerPacket.field2438, ServerPacket.field2439, ServerPacket.field2389, ServerPacket.field2441, ServerPacket.field2442, ServerPacket.field2443, ServerPacket.field2444, ServerPacket.field2445, ServerPacket.field2440};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;B)V",
		garbageValue = "-52"
	)
	public static void method3268(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lim;",
		garbageValue = "21"
	)
	public static GameBuild method3270(int var0) {
		GameBuild[] var1 = class23.method344(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1891094165"
	)
	static void method3271() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 42
			if (ArchiveDiskActionHandler.field3239 == 0) { // L: 43
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 44
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 45
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 46
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 47
			}

			ArchiveDiskActionHandler.field3239 = 600; // L: 49
		}
	} // L: 51

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-1650238788"
	)
	public static int method3273(CharSequence var0, int var1) {
		if (var1 >= 2 && var1 <= 36) { // L: 103
			boolean var3 = false; // L: 104
			boolean var4 = false; // L: 105
			int var5 = 0; // L: 106
			int var6 = var0.length(); // L: 107

			for (int var7 = 0; var7 < var6; ++var7) { // L: 108
				char var8 = var0.charAt(var7); // L: 109
				if (var7 == 0) { // L: 110
					if (var8 == '-') { // L: 111
						var3 = true; // L: 112
						continue;
					}

					if (var8 == '+') { // L: 115
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 117
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 118
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 119
						throw new NumberFormatException(); // L: 120
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 121
					throw new NumberFormatException();
				}

				if (var3) { // L: 122
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 123
				if (var9 / var1 != var5) { // L: 124
					throw new NumberFormatException();
				}

				var5 = var9; // L: 125
				var4 = true; // L: 126
			}

			if (!var4) { // L: 128
				throw new NumberFormatException();
			} else {
				return var5; // L: 131
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
