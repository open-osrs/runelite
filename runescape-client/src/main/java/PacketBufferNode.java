import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Ljt;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -482567323
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 408247845
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 997234155
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1164727717"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 58
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 59
		}
	} // L: 60
}
