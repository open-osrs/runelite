import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class269 {
	@ObfuscatedName("hh")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIIBZI)V",
		garbageValue = "1369454050"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 211
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 212
		if (var8 == null) { // L: 213
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 214
			if (var8 == null) { // L: 215
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 216
				if (var8 != null) { // L: 217
					if (var5) { // L: 218
						var8.removeDual(); // L: 219
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 220
						--NetCache.NetCache_pendingWritesCount; // L: 221
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 222
					}

				} else {
					if (!var5) { // L: 226
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 227
						if (var8 != null) { // L: 228
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 230
					var8.archive = var0; // L: 231
					var8.crc = var3; // L: 232
					var8.padding = var4; // L: 233
					if (var5) { // L: 234
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 235
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 236
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 239
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 240
						++NetCache.NetCache_pendingWritesCount; // L: 241
					}

				}
			}
		}
	} // L: 224 243
}
