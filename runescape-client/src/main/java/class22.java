import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class22 extends class14 {
	@ObfuscatedName("t")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1115122599
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 242899457
	)
	int field194;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field194 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field194 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method121(this.field194); // L: 123
	} // L: 124

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "-115271413"
	)
	public static PacketBufferNode method247() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 47
			var0 = new PacketBufferNode(); // L: 48
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 51
		}

		var0.clientPacket = null; // L: 54
		var0.clientPacketLength = 0; // L: 55
		var0.packetBuffer = new PacketBuffer(5000); // L: 56
		return var0; // L: 57
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "188298202"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class21.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher); // L: 8662
		var2.packetBuffer.method6619(var1); // L: 8663
		var2.packetBuffer.writeIntME(var0); // L: 8664
		Client.packetWriter.addNode(var2); // L: 8665
	} // L: 8666
}
