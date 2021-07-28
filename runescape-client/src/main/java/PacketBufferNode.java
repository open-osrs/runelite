import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 245617369
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1553896473
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 394733649
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-872816135"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "-82"
	)
	public static int method4418(byte[] var0, int var1) {
		return ClientPacket.method4408(var0, 0, var1);
	}
}
