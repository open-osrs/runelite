import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = -1389539327
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 388445817
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1047967593
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -3253035
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("h")
	static boolean method3682(long var0) {
		return Widget.Entity_unpackSceneX(var0) == 2; // L: 44
	}
}
