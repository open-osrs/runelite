import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Ljd;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 294123919
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -147579925
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 843582305
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142638680"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 45
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 46
		}
	} // L: 47

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1834860972"
	)
	public static boolean method5187(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 241 242
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)Z",
		garbageValue = "71882365"
	)
	static boolean method5188(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4861
			return false;
		} else if (GrandExchangeEvents.localPlayer == var0) { // L: 4862
			return class6.method36(); // L: 4873
		} else {
			boolean var1 = NPCComposition.method3531() || Varcs.method2441() && var0.isFriend(); // L: 4863
			if (!var1) { // L: 4864
				boolean var2 = (Client.drawPlayerNames & 2) != 0; // L: 4867
				var1 = var2 && var0.isFriendsChatMember(); // L: 4869
			}

			return var1; // L: 4871
		}
	}
}
