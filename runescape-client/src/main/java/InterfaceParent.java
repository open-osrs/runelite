import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1079839403
	)
	@Export("group")
	int group;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1640096453
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	boolean field1148;

	InterfaceParent() {
		this.field1148 = false; // L: 8
	} // L: 10

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhw;Lod;I)Lhg;",
		garbageValue = "-1864429367"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 29
			var2 = new PacketBufferNode(); // L: 30
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 33
		}

		var2.clientPacket = var0; // L: 36
		var2.clientPacketLength = var0.length; // L: 37
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 38
		} else if (var2.clientPacketLength == -2) { // L: 39
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) { // L: 40
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 41
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 42
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 43
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 44
		var2.index = 0; // L: 45
		return var2; // L: 46
	}
}
