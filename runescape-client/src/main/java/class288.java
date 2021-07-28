import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class288 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static final class288 field3672;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static final class288 field3674;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static final class288 field3673;

	static {
		field3672 = new class288();
		field3674 = new class288();
		field3673 = new class288();
	}

	class288() {
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static void method5202() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1211 = null;
		Client.packetWriter.field1213 = null;
		Client.packetWriter.field1212 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1209 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		MouseHandler.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		class16.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field616[var0] = true;
		}

		PacketBufferNode var2 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(MusicPatch.getWindowedMode());
		var2.packetBuffer.writeShort(MouseRecorder.canvasWidth);
		var2.packetBuffer.writeShort(Client.canvasHeight);
		Client.packetWriter.addNode(var2);
	}
}
