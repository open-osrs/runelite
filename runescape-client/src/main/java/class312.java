import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class312 {
	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "124"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class135.getPacketBufferNode(ClientPacket.field2835, Client.packetWriter.isaacCipher); // L: 9198
		var2.packetBuffer.writeInt(var0); // L: 9199
		var2.packetBuffer.writeShort(var1); // L: 9200
		Client.packetWriter.addNode(var2); // L: 9201
	} // L: 9202
}
