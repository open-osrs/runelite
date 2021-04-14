import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public abstract class class192 implements class194 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1232944215
	)
	protected int field2198;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lgy;",
		garbageValue = "-371233609"
	)
	static PacketBufferNode method3812() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}
}
