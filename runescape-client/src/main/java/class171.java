import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class171 implements class170 {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1877711272"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class4.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher); // L: 8822
		var2.packetBuffer.method5674(var1); // L: 8823
		var2.packetBuffer.method5684(var0); // L: 8824
		Client.packetWriter.addNode(var2); // L: 8825
	} // L: 8826
}
