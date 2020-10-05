import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 110077839
	)
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	ClientPacket clientPacket;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1747169149
	)
	int clientPacketLength;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public PacketBuffer packetBuffer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1051886947
	)
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1940555210"
	)
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "416660759"
	)
	static void method3726() {
		Login.worldSelectOpen = false; // L: 1738
		UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1739
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1740
		AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18); // L: 1741
	} // L: 1742

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldc;B)V",
		garbageValue = "1"
	)
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) { // L: 268
			PcmStream_disable(var1);
		}

	} // L: 269
}
