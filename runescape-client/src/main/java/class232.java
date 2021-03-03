import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class232 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class238[] var2 = class51.method872(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class238 var4 = var2[var3]; // L: 14
			if (var4.field3124 > var0) {
				var0 = var4.field3124; // L: 16
			}

			if (var4.field3122 > var1) { // L: 17
				var1 = var4.field3122;
			}
		}

	} // L: 21

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1954194850"
	)
	static int method4322(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044662786"
	)
	static void method4323() {
		Client.packetWriter.clearBuffer(); // L: 2422
		Client.packetWriter.packetBuffer.offset = 0; // L: 2423
		Client.packetWriter.serverPacket = null; // L: 2424
		Client.packetWriter.field1331 = null; // L: 2425
		Client.packetWriter.field1333 = null; // L: 2426
		Client.packetWriter.field1334 = null; // L: 2427
		Client.packetWriter.serverPacketLength = 0; // L: 2428
		Client.packetWriter.field1330 = 0; // L: 2429
		Client.rebootTimer = 0; // L: 2430
		Client.menuOptionsCount = 0; // L: 2432
		Client.isMenuOpen = false; // L: 2433
		Client.minimapState = 0; // L: 2435
		Client.destinationX = 0; // L: 2436

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2437
			Client.players[var0] = null;
		}

		UserComparator9.localPlayer = null; // L: 2438

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2439
			NPC var1 = Client.npcs[var0]; // L: 2440
			if (var1 != null) { // L: 2441
				var1.targetIndex = -1; // L: 2442
				var1.false0 = false; // L: 2443
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2447
		ItemContainer.updateGameState(30); // L: 2449

		for (var0 = 0; var0 < 100; ++var0) { // L: 2450
			Client.field816[var0] = true;
		}

		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher); // L: 2453
		var2.packetBuffer.writeByte(BoundaryObject.getWindowedMode()); // L: 2454
		var2.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 2455
		var2.packetBuffer.writeShort(class25.canvasHeight); // L: 2456
		Client.packetWriter.addNode(var2); // L: 2457
	} // L: 2459
}
