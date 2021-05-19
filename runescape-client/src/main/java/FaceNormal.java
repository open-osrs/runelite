import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1370299305
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 937419017
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1295456613
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZI)V",
		garbageValue = "273969388"
	)
	public static void method4081(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 193
			try {
				NetCache.NetCache_socket.close(); // L: 195
			} catch (Exception var8) { // L: 197
			}

			NetCache.NetCache_socket = null; // L: 198
		}

		NetCache.NetCache_socket = var0; // L: 200
		Buffer var2;
		if (NetCache.NetCache_socket != null) { // L: 202
			try {
				var2 = new Buffer(4); // L: 204
				var2.writeByte(var1 ? 2 : 3); // L: 205
				var2.writeMedium(0); // L: 206
				NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 207
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close(); // L: 211
				} catch (Exception var6) { // L: 213
				}

				++NetCache.NetCache_ioExceptions; // L: 214
				NetCache.NetCache_socket = null; // L: 215
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 218
		class7.NetCache_currentResponse = null; // L: 219
		NetCache.NetCache_responseArchiveBuffer = null; // L: 220
		NetCache.field3626 = 0; // L: 221

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 223
			if (var9 == null) { // L: 224
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 230
					if (var9 == null) { // L: 231
						if (NetCache.field3629 != 0) { // L: 237
							try {
								var2 = new Buffer(4); // L: 239
								var2.writeByte(4); // L: 240
								var2.writeByte(NetCache.field3629); // L: 241
								var2.writeShort(0); // L: 242
								NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 243
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 247
								} catch (Exception var4) { // L: 249
								}

								++NetCache.NetCache_ioExceptions; // L: 250
								NetCache.NetCache_socket = null; // L: 251
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 254
						SecureRandomCallable.field1108 = Archive.currentTimeMillis(); // L: 255
						return; // L: 256
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9); // L: 232
					NetCache.NetCache_pendingWrites.put(var9, var9.key); // L: 233
					++NetCache.NetCache_pendingWritesCount; // L: 234
					--NetCache.NetCache_pendingResponsesCount; // L: 235
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key); // L: 225
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 226
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 227
		}
	}
}
