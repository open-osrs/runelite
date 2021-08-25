import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class280 {
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -480816967
	)
	static int field3323;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "72"
	)
	static int method5081(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	static void method5087() {
		PacketBufferNode var0 = FriendSystem.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class12.getWindowedMode());
		var0.packetBuffer.writeShort(InvDefinition.canvasWidth);
		var0.packetBuffer.writeShort(GameEngine.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
