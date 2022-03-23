import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class286 {
	@ObfuscatedName("ak")
	static String field3281;

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1152795"
	)
	static final void method5548(boolean var0) {
		MouseHandler.playPcmPlayers(); // L: 5254
		++Client.packetWriter.pendingWrites; // L: 5255
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5256
			Client.packetWriter.pendingWrites = 0; // L: 5257
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5258
				PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher); // L: 5260
				Client.packetWriter.addNode(var1); // L: 5261

				try {
					Client.packetWriter.flush(); // L: 5263
				} catch (IOException var3) { // L: 5265
					Client.hadNetworkError = true; // L: 5266
				}
			}

		}
	} // L: 5269

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static final void method5549() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7393 7394 7437
			if (var0.hitpoints > 0) { // L: 7395
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 7396
				if (var0.objectId >= 0) { // L: 7398
					var2 = var0.objectId; // L: 7400
					var3 = var0.field1119; // L: 7401
					var4 = class116.getObjectDefinition(var2); // L: 7403
					if (var3 == 11) { // L: 7404
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 7405
						var3 = 4;
					}

					var1 = var4.method3651(var3); // L: 7406
					if (!var1) { // L: 7408
						continue;
					}
				}

				DirectByteArrayCopier.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1117, var0.field1119); // L: 7410
				var0.remove(); // L: 7411
			} else {
				if (var0.delay > 0) { // L: 7415
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 7416
					if (var0.id >= 0) { // L: 7418
						var2 = var0.id; // L: 7420
						var3 = var0.field1122; // L: 7421
						var4 = class116.getObjectDefinition(var2); // L: 7423
						if (var3 == 11) { // L: 7424
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 7425
							var3 = 4;
						}

						var1 = var4.method3651(var3); // L: 7426
						if (!var1) { // L: 7428
							continue;
						}
					}

					DirectByteArrayCopier.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1122); // L: 7430
					var0.delay = -1; // L: 7431
					if (var0.objectId == var0.id && var0.objectId == -1) { // L: 7432
						var0.remove();
					} else if (var0.objectId == var0.id && var0.orientation == var0.field1117 && var0.field1122 == var0.field1119) { // L: 7433
						var0.remove();
					}
				}
			}
		}

	} // L: 7439
}
