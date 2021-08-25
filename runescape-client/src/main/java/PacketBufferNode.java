import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lil;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 881537125
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1180228705
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1171592885
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981374716"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16776960"
	)
	public static void method4564() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
