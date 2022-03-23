import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIBZI)V",
		garbageValue = "1922844254"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 223
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 224
		if (var8 == null) { // L: 225
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 226
			if (var8 == null) { // L: 227
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 228
				if (var8 != null) { // L: 229
					if (var5) { // L: 230
						var8.removeDual(); // L: 231
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 232
						--NetCache.NetCache_pendingWritesCount; // L: 233
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 234
					}

				} else {
					if (!var5) { // L: 238
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 239
						if (var8 != null) { // L: 240
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 242
					var8.archive = var0; // L: 243
					var8.crc = var3; // L: 244
					var8.padding = var4; // L: 245
					if (var5) { // L: 246
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 247
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 248
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 251
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 252
						++NetCache.NetCache_pendingWritesCount; // L: 253
					}

				}
			}
		}
	} // L: 236 255
}
