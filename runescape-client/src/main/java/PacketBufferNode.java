import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "[Lgj;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -477845615
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgn;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1266543353
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1411425987
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-42"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1965042826"
	)
	static final int method3750(int var0, int var1) {
		int var2 = VarbitDefinition.method4696(45365 + var0, var1 + 91923, 4) - 128 + (VarbitDefinition.method4696(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (VarbitDefinition.method4696(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
