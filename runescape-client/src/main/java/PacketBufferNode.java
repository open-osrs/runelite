import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1714569287
	)
	static int field2786;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1923924179
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1453961237
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -215681187
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1705067673
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1435986558"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1167818871"
	)
	public static boolean method4654(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field128[var0] : false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-337771237"
	)
	static void method4653(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
