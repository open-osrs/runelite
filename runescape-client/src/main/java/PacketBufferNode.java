import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -547850915
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 60073813
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -646251635
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134338868"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 45
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 46
		}
	} // L: 47
}
