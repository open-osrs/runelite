import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Liw;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1440510259
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("aq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2059632065
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -531807865
	)
	@Export("index")
	public int index;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "817440472"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1828413921"
	)
	static void method5016(int var0) {
		if (var0 != Client.loginState) { // L: 12733
			Client.loginState = var0; // L: 12734
		}
	} // L: 12735
}
